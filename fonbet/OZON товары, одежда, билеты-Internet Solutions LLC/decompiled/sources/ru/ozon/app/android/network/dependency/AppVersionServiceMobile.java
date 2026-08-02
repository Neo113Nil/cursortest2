package ru.ozon.app.android.network.dependency;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001b\u0010\u0012\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/network/dependency/AppVersionServiceMobile;", "Lru/ozon/app/android/network/version/AppVersionService;", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "appVersionStorage", "<init>", "(Lru/ozon/app/android/storage/appversion/AppVersionStorage;)V", "Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "version$delegate", "LSc/j;", "getVersion", "version", "userAgent$delegate", "getUserAgent", "userAgent", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppVersionServiceMobile implements AppVersionService {

    @NotNull
    private final String appName;

    @NotNull
    private final AppVersionStorage appVersionStorage;

    /* renamed from: userAgent$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userAgent;

    /* renamed from: version$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j version;

    public AppVersionServiceMobile(@NotNull AppVersionStorage appVersionStorage) {
        Intrinsics.checkNotNullParameter(appVersionStorage, "appVersionStorage");
        this.appVersionStorage = appVersionStorage;
        this.appName = "ozonapp_android";
        this.version = k.b(new AppVersionServiceMobile$version$2(this));
        this.userAgent = k.b(new AppVersionServiceMobile$userAgent$2(this));
    }

    @Override // ru.ozon.app.android.network.version.AppVersionService
    @NotNull
    public String getAppName() {
        return this.appName;
    }

    @Override // ru.ozon.app.android.network.version.AppVersionService
    @NotNull
    public String getUserAgent() {
        return (String) this.userAgent.getValue();
    }

    @Override // ru.ozon.app.android.network.version.AppVersionService
    @NotNull
    public String getVersion() {
        return (String) this.version.getValue();
    }
}
