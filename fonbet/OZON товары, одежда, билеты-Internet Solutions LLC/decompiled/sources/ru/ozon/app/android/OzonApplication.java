package ru.ozon.app.android;

import Xh0.c;
import Yh0.f;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import androidx.appcompat.app.j;
import androidx.appcompat.widget.h0;
import androidx.work.c;
import gi.C6740b;
import gi.InterfaceC6741c;
import hi.InterfaceC6958a;
import ih0.C7080a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.DaggerFactoryComponent;
import ru.ozon.app.android.initializers.AppInitializer;
import ru.ozon.app.android.initializers.logger.OzonHarLoggerInitializer;
import ru.ozon.app.android.initializers.logger.OzonLoggerInitializer;
import ru.ozon.app.android.initializers.sentry.CrashReporterInitializer;
import ru.ozon.app.android.initializers.sentry.SentryPostInitializer;
import ru.ozon.app.android.initializers.startup.time.StartupTimeTrackerInitializer;
import ru.ozon.app.android.injection.ApplicationInitializationDelegate;
import ru.ozon.app.android.injection.IDaggerComponent;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.di.NetworkOzonIdComponentApi;
import ru.ozon.app.android.storage.di.StorageComponentApi;
import ru.ozon.app.android.storefront.feature.notifications.utils.HasComponentStorageExtKt;
import ru.ozon.app.android.ui.start.AppHostActivity;
import sj.e;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00060\u0003j\u0002`\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0007J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/OzonApplication;", "Landroid/app/Application;", "", "Lgi/c;", "Lru/ozon/app/android/di/provider/component/HasComponentProvider;", "Landroidx/work/c$b;", "<init>", "()V", "LXh0/c$b;", "provideTrackerConfiguration", "()LXh0/c$b;", "Lsj/c;", "config", "", "initLogger", "(Lsj/c;)V", "initHarLogger", "Landroid/content/Context;", "base", "attachBaseContext", "(Landroid/content/Context;)V", "onCreate", "Lru/ozon/app/android/injection/IDaggerComponent;", "getApplicationComponent", "()Lru/ozon/app/android/injection/IDaggerComponent;", "Landroidx/work/c;", "getWorkManagerConfiguration", "()Landroidx/work/c;", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "dependencyStorage", "Lgi/b;", "getDependencyStorage", "()Lgi/b;", "setDependencyStorage", "(Lgi/b;)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class OzonApplication extends Application implements InterfaceC6741c, c.b {
    public C6740b dependencyStorage;

    public OzonApplication() {
        ApplicationInitializationDelegate.INSTANCE.trackingApplicationInit();
        C7080a.f66478d = Long.valueOf(SystemClock.elapsedRealtime());
    }

    private final void initHarLogger() {
        C6740b dependencyStorage = getDependencyStorage();
        if (NetworkComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkComponentApi is not DiComponent");
        }
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) dependencyStorage.b(NetworkComponentApi.class);
        if (networkComponentApi.getLogRequestsService().isOzonHarLoggerFlagEnabled()) {
            C6740b dependencyStorage2 = getDependencyStorage();
            if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
            }
            new OzonHarLoggerInitializer(networkComponentApi.getAppVersionService(), ((StorageComponentApi) dependencyStorage2.b(StorageComponentApi.class)).getDebugToolService(), networkComponentApi.getFeatureService()).init(this);
        }
    }

    private final void initLogger(sj.c config) {
        C6740b dependencyStorage = getDependencyStorage();
        if (StorageComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component StorageComponentApi is not DiComponent");
        }
        StorageComponentApi storageComponentApi = (StorageComponentApi) dependencyStorage.b(StorageComponentApi.class);
        C6740b dependencyStorage2 = getDependencyStorage();
        if (NetworkOzonIdComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component NetworkOzonIdComponentApi is not DiComponent");
        }
        new OzonLoggerInitializer(storageComponentApi.getApplicationInfoStorage(), storageComponentApi.getOzonIdCookieEvents(), storageComponentApi.getAppVersionStorage(), storageComponentApi.getEnvironmentService(), ((NetworkOzonIdComponentApi) dependencyStorage2.b(NetworkOzonIdComponentApi.class)).getOzonIdAppApi()).init(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.b provideTrackerConfiguration() {
        c.b.a aVar = new c.b.a(N.b(AppHostActivity.class));
        aVar.b();
        c.b a11 = aVar.a();
        StartupTimeTrackerInitializer.INSTANCE.setConfiguration$main_prodGoogleAllVendorsRelease(a11);
        return a11;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        ApplicationInitializationDelegate applicationInitializationDelegate = ApplicationInitializationDelegate.INSTANCE;
        int i11 = Xh0.c.f34471a;
        Intrinsics.checkNotNullParameter("Sentry init", "stepName");
        f.c("Sentry init");
        CrashReporterInitializer.INSTANCE.init(this);
        c.a.b(this, provideTrackerConfiguration());
        Intrinsics.checkNotNullParameter("Content providers init", "stepName");
        f.c("Content providers init");
    }

    @NotNull
    public IDaggerComponent getApplicationComponent() {
        C6740b dependencyStorage = getDependencyStorage();
        if (IDaggerComponent.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component IDaggerComponent is not DiComponent");
        }
        return (IDaggerComponent) dependencyStorage.b(IDaggerComponent.class);
    }

    @Override // gi.InterfaceC6741c
    @NotNull
    public C6740b getDependencyStorage() {
        C6740b c6740b = this.dependencyStorage;
        if (c6740b != null) {
            return c6740b;
        }
        Intrinsics.n("dependencyStorage");
        throw null;
    }

    @Override // androidx.work.c.b
    @NotNull
    public androidx.work.c getWorkManagerConfiguration() {
        androidx.work.c a11 = new c.a().a();
        Intrinsics.checkNotNullExpressionValue(a11, "build(...)");
        return a11;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        int i11 = Xh0.c.f34471a;
        c.a.a();
        Intrinsics.checkNotNullParameter("Getting ComponentStorage", "stepName");
        f.c("Getting ComponentStorage");
        setDependencyStorage(DaggerFactoryComponent.factory().create(this).getComponentStorage());
        Intrinsics.checkNotNullParameter("SentryPostInitializer: init", "stepName");
        f.c("SentryPostInitializer: init");
        new SentryPostInitializer(getDependencyStorage()).init();
        Intrinsics.checkNotNullParameter("OzonLoggerInitializer", "stepName");
        f.c("OzonLoggerInitializer");
        sj.c createConfig = OzonLoggerInitializer.INSTANCE.createConfig(this, "Zhva7aEuM5HqhTX3FA3KcAYGUO8zK9wDeT4CSMjoRIzbq4wlrMqKQpB5HgoJdMHZ");
        e.f98817f.m(createConfig);
        initLogger(createConfig);
        initHarLogger();
        HasComponentStorageExtKt.initNotificationStatusObserver(this);
        Intrinsics.checkNotNullParameter("Setting CompatVectorFromResourcesEnabled", "stepName");
        f.c("Setting CompatVectorFromResourcesEnabled");
        int i12 = j.f37132j;
        int i13 = h0.f37937a;
        Intrinsics.checkNotNullParameter("FirebaseApp init", "stepName");
        f.c("FirebaseApp init");
        k8.e.o(this);
        Intrinsics.checkNotNullParameter("Getting ApplicationComponent", "stepName");
        f.c("Getting ApplicationComponent");
        IDaggerComponent applicationComponent = getApplicationComponent();
        Intrinsics.checkNotNullParameter("Getting AppInitializer", "stepName");
        f.c("Getting AppInitializer");
        AppInitializer appInitializer = applicationComponent.getAppInitializer();
        Intrinsics.checkNotNullParameter("Starting AppInitializer", "stepName");
        f.c("Starting AppInitializer");
        appInitializer.initialize();
        Intrinsics.checkNotNullParameter("Application#onCreate end", "stepName");
        f.c("Application#onCreate end");
    }

    public void setDependencyStorage(@NotNull C6740b c6740b) {
        Intrinsics.checkNotNullParameter(c6740b, "<set-?>");
        this.dependencyStorage = c6740b;
    }
}
