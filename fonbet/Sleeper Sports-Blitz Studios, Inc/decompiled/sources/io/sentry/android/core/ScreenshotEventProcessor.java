package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import androidx.media3.common.MimeTypes;
import io.sentry.Attachment;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class ScreenshotEventProcessor implements EventProcessor {
    private static final int DEBOUNCE_MAX_EXECUTIONS = 3;
    private static final long DEBOUNCE_WAIT_TIME_MS = 2000;
    private final BuildInfoProvider buildInfoProvider;
    private final Debouncer debouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), 2000, 3);
    private final SentryAndroidOptions options;

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            IntegrationUtils.addIntegrationToSdkVersion("Screenshot");
        }
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        if (sentryEvent.isErrored()) {
            if (!this.options.isAttachScreenshot()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return sentryEvent;
            }
            Activity activity = CurrentActivityHolder.getInstance().getActivity();
            if (activity != null && !HintUtils.isFromHybridSdk(hint)) {
                boolean checkForDebounce = this.debouncer.checkForDebounce();
                SentryAndroidOptions.BeforeCaptureCallback beforeScreenshotCaptureCallback = this.options.getBeforeScreenshotCaptureCallback();
                if (beforeScreenshotCaptureCallback == null ? !checkForDebounce : beforeScreenshotCaptureCallback.execute(sentryEvent, hint, checkForDebounce)) {
                    final Bitmap captureScreenshot = ScreenshotUtils.captureScreenshot(activity, this.options.getThreadChecker(), this.options.getLogger(), this.buildInfoProvider);
                    if (captureScreenshot != null) {
                        hint.setScreenshot(Attachment.fromByteProvider(new Callable() { // from class: io.sentry.android.core.ScreenshotEventProcessor$$ExternalSyntheticLambda0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ScreenshotEventProcessor.this.m13369lambda$process$0$iosentryandroidcoreScreenshotEventProcessor(captureScreenshot);
                            }
                        }, "screenshot.png", MimeTypes.IMAGE_PNG, false));
                        hint.set(TypeCheckHint.ANDROID_ACTIVITY, activity);
                    }
                }
            }
        }
        return sentryEvent;
    }

    /* renamed from: lambda$process$0$io-sentry-android-core-ScreenshotEventProcessor, reason: not valid java name */
    /* synthetic */ byte[] m13369lambda$process$0$iosentryandroidcoreScreenshotEventProcessor(Bitmap bitmap) throws Exception {
        return ScreenshotUtils.compressBitmapToPng(bitmap, this.options.getLogger());
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 10000L;
    }
}
