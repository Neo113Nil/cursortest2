package ru.ozon.app.android.util.screenshottracker;

import android.app.Activity;
import android.app.Activity$ScreenCaptureCallback;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.util.screenshottracker.ScreenshotTrackerUpsideDownCakeImpl;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0006H\u0017J\b\u0010\f\u001a\u00020\u0006H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/util/screenshottracker/ScreenshotTrackerUpsideDownCakeImpl;", "Lru/ozon/app/android/util/screenshottracker/ScreenshotTracker;", "activity", "Landroid/app/Activity;", "onScreenshotDetected", "Lkotlin/Function0;", "", "<init>", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "screenCaptureCallback", "Landroid/app/Activity$ScreenCaptureCallback;", "start", "stop", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ScreenshotTrackerUpsideDownCakeImpl implements ScreenshotTracker {

    @NotNull
    private final Activity activity;

    @NotNull
    private final Function0<Unit> onScreenshotDetected;

    @NotNull
    private final Activity$ScreenCaptureCallback screenCaptureCallback;

    public ScreenshotTrackerUpsideDownCakeImpl(@NotNull Activity activity, @NotNull Function0<Unit> onScreenshotDetected) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onScreenshotDetected, "onScreenshotDetected");
        this.activity = activity;
        this.onScreenshotDetected = onScreenshotDetected;
        this.screenCaptureCallback = new Activity$ScreenCaptureCallback() { // from class: vY.a
            public final void onScreenCaptured() {
                ScreenshotTrackerUpsideDownCakeImpl.screenCaptureCallback$lambda$0(ScreenshotTrackerUpsideDownCakeImpl.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void screenCaptureCallback$lambda$0(ScreenshotTrackerUpsideDownCakeImpl screenshotTrackerUpsideDownCakeImpl) {
        screenshotTrackerUpsideDownCakeImpl.onScreenshotDetected.invoke();
    }

    @Override // ru.ozon.app.android.util.screenshottracker.ScreenshotTracker
    public void start() {
        Executor mainExecutor;
        Activity activity = this.activity;
        mainExecutor = activity.getMainExecutor();
        activity.registerScreenCaptureCallback(mainExecutor, this.screenCaptureCallback);
    }

    @Override // ru.ozon.app.android.util.screenshottracker.ScreenshotTracker
    public void stop() {
        this.activity.unregisterScreenCaptureCallback(this.screenCaptureCallback);
    }
}
