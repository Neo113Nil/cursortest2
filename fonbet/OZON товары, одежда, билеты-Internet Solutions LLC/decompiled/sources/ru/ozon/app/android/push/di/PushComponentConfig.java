package ru.ozon.app.android.push.di;

import Fb0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/push/di/PushComponentConfig;", "", "", "appName", "appBuildType", "", "appIcon", "LFb0/e;", "appDomain", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILFb0/e;Lru/ozon/app/android/utils/AppType;)V", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "getAppBuildType", "I", "getAppIcon", "()I", "LFb0/e;", "getAppDomain", "()LFb0/e;", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PushComponentConfig {

    @NotNull
    private final String appBuildType;

    @NotNull
    private final e appDomain;
    private final int appIcon;

    @NotNull
    private final String appName;

    @NotNull
    private final AppType appType;

    public PushComponentConfig(@NotNull String appName, @NotNull String appBuildType, int i11, @NotNull e appDomain, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appBuildType, "appBuildType");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.appName = appName;
        this.appBuildType = appBuildType;
        this.appIcon = i11;
        this.appDomain = appDomain;
        this.appType = appType;
    }

    @NotNull
    public final String getAppBuildType() {
        return this.appBuildType;
    }

    @NotNull
    public final e getAppDomain() {
        return this.appDomain;
    }

    public final int getAppIcon() {
        return this.appIcon;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final AppType getAppType() {
        return this.appType;
    }
}
