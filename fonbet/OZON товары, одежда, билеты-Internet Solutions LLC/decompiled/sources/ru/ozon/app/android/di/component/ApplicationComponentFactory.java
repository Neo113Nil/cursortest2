package ru.ozon.app.android.di.component;

import Nk.a;
import android.app.Application;
import android.content.Context;
import gi.C6740b;
import ii.InterfaceC7081a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.di.component.ApplicationComponent;
import ru.ozon.app.android.main.R$drawable;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.uikit.R$bool;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.app.android.utils.ContextUtilsKt;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001b\u001a\u00020\u00022\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/di/component/ApplicationComponentFactory;", "Lii/a;", "Lru/ozon/app/android/di/component/ApplicationComponent;", "Lru/ozon/app/android/di/provider/factory/ComponentFactory;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "app", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "(Landroid/app/Application;)Lru/ozon/android/hardwareinfo/DeviceType;", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/utils/AppType;", "appType", "(Landroid/content/Context;)Lru/ozon/app/android/utils/AppType;", "", "notificationIcon", "(Landroid/app/Application;)I", "", "pushNotificationAppName", "(Landroid/app/Application;)Ljava/lang/String;", "pushNotificationAppBuildType", "Lgi/b;", "Lru/ozon/app/android/di/provider/factory/ComponentStorage;", "componentStorage", "create", "(Lgi/b;)Lru/ozon/app/android/di/component/ApplicationComponent;", "Landroid/app/Application;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplicationComponentFactory implements InterfaceC7081a<ApplicationComponent> {

    @NotNull
    private final Application application;

    public ApplicationComponentFactory(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
    }

    private final AppType appType(Context appContext) {
        return ContextUtilsKt.isOzonSelectApplication(appContext) ? AppType.SELECT : ContextUtilsKt.isOzonTravelApplication(appContext) ? AppType.TRAVEL : ContextUtilsKt.isOzonFreshApplication(appContext) ? AppType.FRESH : AppType.f94580BX;
    }

    private final DeviceType deviceType(Application app) {
        return app.getResources().getBoolean(R$bool.isTablet) ? DeviceType.TABLET : DeviceType.MOBILE;
    }

    private final int notificationIcon(Application app) {
        return ContextUtilsKt.isOzonSelectApplication(app) ? R$drawable.ic_stat_onesignal_default : ContextUtilsKt.isOzonTravelApplication(app) ? ru.ozon.app.android.travel.feature.entry.R$drawable.ic_stat_travel : ContextUtilsKt.isOzonFreshApplication(app) ? ru.ozon.app.android.fresh.feature.entry.R$drawable.ic_stat_fresh : R$drawable.ic_stat_onesignal_default;
    }

    private final String pushNotificationAppBuildType(Application app) {
        if (ContextUtilsKt.isOzonTravelApplication(app)) {
            return "prodRelease";
        }
        String str = "release";
        if ("release".length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) CharsKt.d("release".charAt(0)));
            Intrinsics.checkNotNullExpressionValue("elease", "substring(...)");
            sb2.append("elease");
            str = sb2.toString();
        }
        return a.b("prod", str);
    }

    private final String pushNotificationAppName(Application app) {
        return ContextUtilsKt.isOzonSelectApplication(app) ? "SELECT" : ContextUtilsKt.isOzonTravelApplication(app) ? "TRAVEL" : ContextUtilsKt.isOzonFreshApplication(app) ? "FRESH" : "BX";
    }

    @Override // ii.InterfaceC7081a
    @NotNull
    public ApplicationComponent create(@NotNull C6740b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        FlavorType flavorType = BuildUtils.INSTANCE.isQaFlavor() ? FlavorType.f93213QA : FlavorType.PROD;
        ApplicationComponent.Factory factory = DaggerApplicationComponent.factory();
        Application application = this.application;
        boolean z11 = flavorType == FlavorType.f93213QA;
        DeviceType deviceType = deviceType(application);
        String pushNotificationAppName = pushNotificationAppName(this.application);
        String pushNotificationAppBuildType = pushNotificationAppBuildType(this.application);
        int notificationIcon = notificationIcon(this.application);
        Context applicationContext = this.application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return factory.create(application, application, flavorType, z11, deviceType, false, pushNotificationAppName, pushNotificationAppBuildType, notificationIcon, appType(applicationContext));
    }
}
