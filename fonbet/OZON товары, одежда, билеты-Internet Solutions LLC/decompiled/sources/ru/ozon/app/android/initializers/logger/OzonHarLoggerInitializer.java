package ru.ozon.app.android.initializers.logger;

import U7.d;
import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.HarLoggerSessionCountFlag;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.debug.DebugToolsService;
import vj.C10324a;
import vj.C10325b;
import wj.C10565a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/initializers/logger/OzonHarLoggerInitializer;", "", "appVersionService", "Lru/ozon/app/android/network/version/AppVersionService;", "debugToolsService", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureService;", "<init>", "(Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/storage/debug/DebugToolsService;Lru/ozon/app/android/network/abtool/FeatureService;)V", "init", "", "application", "Landroid/app/Application;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OzonHarLoggerInitializer {

    @NotNull
    private final AppVersionService appVersionService;

    @NotNull
    private final DebugToolsService debugToolsService;

    @NotNull
    private final FeatureService featureService;

    public OzonHarLoggerInitializer(@NotNull AppVersionService appVersionService, @NotNull DebugToolsService debugToolsService, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.appVersionService = appVersionService;
        this.debugToolsService = debugToolsService;
        this.featureService = featureService;
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C10325b.a aVar = C10325b.f103002g;
        C10324a harLogConfig = new C10324a(this.appVersionService.getAppName(), d.e(this.appVersionService.getVersion(), ")"), String.valueOf(this.debugToolsService.getCommitHash()), this.featureService.getIntKey(HarLoggerSessionCountFlag.INSTANCE));
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(harLogConfig, "harLogConfig");
        C10565a c10565a = new C10565a(application, harLogConfig);
        if (C10325b.f103003h == null) {
            synchronized (aVar) {
                if (C10325b.f103003h == null) {
                    C10325b.f103003h = new C10325b(application, harLogConfig, c10565a);
                }
            }
        }
    }
}
