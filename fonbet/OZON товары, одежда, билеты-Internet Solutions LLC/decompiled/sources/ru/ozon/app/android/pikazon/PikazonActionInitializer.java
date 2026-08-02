package ru.ozon.app.android.pikazon;

import Eg0.b;
import Fg0.a;
import Gg0.e;
import Gg0.f;
import V5.q;
import We.E;
import android.content.Context;
import android.util.Log;
import ei0.InterfaceC6369b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m6.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.abtool.OnChangeFeatureListener;
import ru.ozon.app.android.network.cronet.CronetInterceptorKt;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.PikazonActionInitializer;
import ru.ozon.app.android.pikazon.callback.PikazonPerformanceAvailabilityChecker;
import ru.ozon.app.android.pikazon.flags.Cancellation1ThresholdFlag;
import ru.ozon.app.android.pikazon.flags.IsComposeIntrinsicSizeEnabledFlag;
import ru.ozon.app.android.pikazon.flags.NewVisibilityCheckerEnabledFlag;
import ru.ozon.app.android.pikazon.flags.Other2ThresholdFlag;
import ru.ozon.app.android.pikazon.flags.RetriesOnConnectionRestoredFlag;
import ru.ozon.app.android.pikazon.glide.loaders.PikazonUrl;
import ru.ozon.app.android.pikazon.glide.memoryCategory.MemoryCategory;
import ru.ozon.app.android.pikazon.logging.PikazonLogConfig;
import ru.ozon.app.android.pikazon.request.PikazonRequestListener;
import ru.ozon.app.android.pikazon.retry.OnConnectionRestored;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u0000 %2\u00020\u0001:\u0001%BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/pikazon/PikazonActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/content/Context;", "appContext", "LWe/E;", "client", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "performanceAvailabilityChecker", "LGg0/f;", "placeholderTimeHandler", "Lru/ozon/app/android/network/version/AppVersionService;", "versionService", "LFg0/a;", "ozonTrackerErrorsLogger", "LEg0/b;", "ozonLoggerErrorsLogger", "Lei0/b;", "ozonTracker", "<init>", "(Landroid/content/Context;LWe/E;Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;LGg0/f;Lru/ozon/app/android/network/version/AppVersionService;LFg0/a;LEg0/b;Lei0/b;)V", "Lru/ozon/app/android/pikazon/Pikazon$Config;", "createPikazonConfig", "()Lru/ozon/app/android/pikazon/Pikazon$Config;", "", "init", "()V", "Landroid/content/Context;", "LWe/E;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/pikazon/callback/PikazonPerformanceAvailabilityChecker;", "LGg0/f;", "Lru/ozon/app/android/network/version/AppVersionService;", "LFg0/a;", "LEg0/b;", "Lei0/b;", "Companion", "pikazon_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonActionInitializer implements ActionInitializer {

    @NotNull
    private final Context appContext;

    @NotNull
    private final E client;

    @NotNull
    private final FeatureService featureService;

    @NotNull
    private final b ozonLoggerErrorsLogger;

    @NotNull
    private final InterfaceC6369b ozonTracker;

    @NotNull
    private final a ozonTrackerErrorsLogger;

    @NotNull
    private final PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker;

    @NotNull
    private final f placeholderTimeHandler;

    @NotNull
    private final AppVersionService versionService;

    public PikazonActionInitializer(@NotNull Context appContext, @NotNull E client, @NotNull FeatureService featureService, @NotNull PikazonPerformanceAvailabilityChecker performanceAvailabilityChecker, @NotNull f placeholderTimeHandler, @NotNull AppVersionService versionService, @NotNull a ozonTrackerErrorsLogger, @NotNull b ozonLoggerErrorsLogger, @NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(performanceAvailabilityChecker, "performanceAvailabilityChecker");
        Intrinsics.checkNotNullParameter(placeholderTimeHandler, "placeholderTimeHandler");
        Intrinsics.checkNotNullParameter(versionService, "versionService");
        Intrinsics.checkNotNullParameter(ozonTrackerErrorsLogger, "ozonTrackerErrorsLogger");
        Intrinsics.checkNotNullParameter(ozonLoggerErrorsLogger, "ozonLoggerErrorsLogger");
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.appContext = appContext;
        this.client = client;
        this.featureService = featureService;
        this.performanceAvailabilityChecker = performanceAvailabilityChecker;
        this.placeholderTimeHandler = placeholderTimeHandler;
        this.versionService = versionService;
        this.ozonTrackerErrorsLogger = ozonTrackerErrorsLogger;
        this.ozonLoggerErrorsLogger = ozonLoggerErrorsLogger;
        this.ozonTracker = ozonTracker;
    }

    private final Pikazon.Config createPikazonConfig() {
        int i11 = R$drawable.ozon_image_placeholder;
        PikazonPerformanceAvailabilityChecker pikazonPerformanceAvailabilityChecker = this.performanceAvailabilityChecker;
        Context context = this.appContext;
        BuildUtils buildUtils = BuildUtils.INSTANCE;
        return new Pikazon.Config(null, i11, null, null, pikazonPerformanceAvailabilityChecker, new Pikazon.NetworkConfiguration(this.versionService.getUserAgent(), CronetInterceptorKt.hasCronetInterceptor(this.client)), false, true, context, (buildUtils.isQaFlavor() || buildUtils.isDebug()) ? new PikazonLogConfig.Enabled(new PikazonLogConfig.Logger() { // from class: ru.ozon.app.android.pikazon.PikazonActionInitializer$createPikazonConfig$1
            @Override // ru.ozon.app.android.pikazon.logging.PikazonLogConfig.Logger
            public void writeLog(String message, Throwable throwable) {
                Intrinsics.checkNotNullParameter(message, "message");
                if (throwable == null) {
                    Log.d("Pikazon", message);
                } else {
                    Log.e("Pikazon", message, throwable);
                }
            }
        }) : PikazonLogConfig.Disabled.INSTANCE, new Pikazon.LoadTimeLogsConfiguration(this.featureService.getIntKey(Other2ThresholdFlag.INSTANCE), this.featureService.getIntKey(Cancellation1ThresholdFlag.INSTANCE)), 77, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(PikazonActionInitializer pikazonActionInitializer) {
        int intKey = pikazonActionInitializer.featureService.getIntKey(RetriesOnConnectionRestoredFlag.INSTANCE);
        Pikazon.INSTANCE.getInstance().onConnectionRestored(intKey > 0 ? new OnConnectionRestored.Retry(intKey) : OnConnectionRestored.DoNothing.INSTANCE);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        Pikazon.INSTANCE.bind(this.client, createPikazonConfig()).addPikazonRequestListener(new PikazonRequestListener<Object>() { // from class: ru.ozon.app.android.pikazon.PikazonActionInitializer$init$1
            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onLoadCancelled(Object obj, h<Object> hVar) {
                PikazonRequestListener.DefaultImpls.onLoadCancelled(this, obj, hVar);
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onLoadFailed(Object model, h<Object> target, q exception) {
                Lm0.a.f17149a.w(exception);
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onLoadStarted(Object obj, Object obj2) {
                PikazonRequestListener.DefaultImpls.onLoadStarted(this, obj, obj2);
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onLoadSucceed(Object obj, Object obj2, h<Object> hVar, T5.a aVar) {
                PikazonRequestListener.DefaultImpls.onLoadSucceed(this, obj, obj2, hVar, aVar);
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onPreviewFailed(PikazonUrl pikazonUrl, h<Object> hVar, q qVar) {
                PikazonRequestListener.DefaultImpls.onPreviewFailed(this, pikazonUrl, hVar, qVar);
            }

            @Override // ru.ozon.app.android.pikazon.request.PikazonRequestListener
            public void onPreviewSucceed(PikazonUrl pikazonUrl, Object obj, h<Object> hVar, T5.a aVar) {
                PikazonRequestListener.DefaultImpls.onPreviewSucceed(this, pikazonUrl, obj, hVar, aVar);
            }
        }).addPikazonRequestListener(new e(this.placeholderTimeHandler)).addPerformanceListener(new Fg0.b(this.ozonTracker)).addErrorsLogger(this.ozonLoggerErrorsLogger).addErrorsLogger(this.ozonTrackerErrorsLogger).setMemoryCategory(this.appContext, MemoryCategory.HIGH).setUseNewVisibilityChecker(this.featureService.getBooleanKey(NewVisibilityCheckerEnabledFlag.INSTANCE)).setInMemoryRetainCacheEnabled(true).isComposeIntrinsicSizeEnabled(this.featureService.getBooleanKey(IsComposeIntrinsicSizeEnabledFlag.INSTANCE));
        this.featureService.addOnChangeFeatureListener(new OnChangeFeatureListener() { // from class: vF.a
            @Override // ru.ozon.app.android.network.abtool.OnChangeFeatureListener
            public final void onChangeFeature() {
                PikazonActionInitializer.init$lambda$0(PikazonActionInitializer.this);
            }
        });
    }
}
