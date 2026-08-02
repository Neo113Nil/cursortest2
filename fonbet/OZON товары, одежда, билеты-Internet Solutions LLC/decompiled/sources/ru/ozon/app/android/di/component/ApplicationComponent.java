package ru.ozon.app.android.di.component;

import Fb0.e;
import android.app.Application;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.injection.IDaggerComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentDependencies;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.platform.flavor.FlavorType;
import ru.ozon.app.android.push.di.PushComponentDependencies;
import ru.ozon.app.android.storage.di.StorageComponentDependencies;
import ru.ozon.app.android.storage.hosts.FintechUrls;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0019J\u000f\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H'¢\u0006\u0004\b\r\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH'¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H'¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH'¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/di/component/ApplicationComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/navigation/di/NavigationComponentDependencies;", "Lru/ozon/app/android/storage/di/StorageComponentDependencies;", "Lru/ozon/app/android/push/di/PushComponentDependencies;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/injection/IDaggerComponentDependencies;", "", "getDebugFlag", "()Z", "Lru/ozon/android/hardwareinfo/DeviceType;", "getDeviceType", "()Lru/ozon/android/hardwareinfo/DeviceType;", "getShaker", "", "getApiUrlSuffix", "()Ljava/lang/String;", "getStaticApiUrl", "LFb0/e;", "getAppDomain", "()LFb0/e;", "getMetricsDomainName", "Lru/ozon/app/android/storage/hosts/FintechUrls;", "getFintechUrls", "()Lru/ozon/app/android/storage/hosts/FintechUrls;", "Factory", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ApplicationComponent extends ContextComponentDependencies, NavigationComponentDependencies, StorageComponentDependencies, PushComponentDependencies, AndroidPlatformComponentDependencies, IDaggerComponentDependencies {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001Jl\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H&¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/di/component/ApplicationComponent$Factory;", "", "create", "Lru/ozon/app/android/di/component/ApplicationComponent;", "application", "Landroid/app/Application;", "context", "Landroid/content/Context;", "flavorType", "Lru/ozon/app/android/platform/flavor/FlavorType;", "debugFlag", "", "deviceType", "Lru/ozon/android/hardwareinfo/DeviceType;", "isShakerEnabled", "pushNotificationsAppName", "", "pushNotificationsAppBuildType", "notificationIcon", "", "appType", "Lru/ozon/app/android/utils/AppType;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        @NotNull
        ApplicationComponent create(@NotNull Application application, @NotNull Context context, @NotNull FlavorType flavorType, boolean debugFlag, @NotNull DeviceType deviceType, boolean isShakerEnabled, @NotNull String pushNotificationsAppName, @NotNull String pushNotificationsAppBuildType, int notificationIcon, @NotNull AppType appType);
    }

    @NotNull
    String getApiUrlSuffix();

    @NotNull
    e getAppDomain();

    boolean getDebugFlag();

    @NotNull
    DeviceType getDeviceType();

    @NotNull
    FintechUrls getFintechUrls();

    @NotNull
    String getMetricsDomainName();

    boolean getShaker();

    @NotNull
    String getStaticApiUrl();
}
