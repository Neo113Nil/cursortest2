package ru.ozon.app.android.network.di;

import Fb0.e;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.DeviceType;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/network/di/NetworkComponentConfig;", "", "", "apiUrl", "apiUrlSuffix", "LFb0/e;", "appDomain", "", "isDebug", "Lru/ozon/android/hardwareinfo/DeviceType;", "deviceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;LFb0/e;ZLru/ozon/android/hardwareinfo/DeviceType;)V", "Ljava/lang/String;", "getApiUrl", "()Ljava/lang/String;", "getApiUrlSuffix", "LFb0/e;", "getAppDomain", "()LFb0/e;", "Z", "()Z", "Lru/ozon/android/hardwareinfo/DeviceType;", "getDeviceType", "()Lru/ozon/android/hardwareinfo/DeviceType;", "deviceTypeName", "getDeviceTypeName", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkComponentConfig {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String apiUrl;

    @NotNull
    private final String apiUrlSuffix;

    @NotNull
    private final e appDomain;

    @NotNull
    private final DeviceType deviceType;

    @NotNull
    private final String deviceTypeName;
    private final boolean isDebug;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/network/di/NetworkComponentConfig$Companion;", "", "<init>", "()V", "TABLET_DEVICE_TYPE", "", "MOBILE_DEVICE_TYPE", "TV_DEVICE_TYPE", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceType.values().length];
            try {
                iArr[DeviceType.TABLET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceType.f83814TV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceType.MOBILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkComponentConfig(@NotNull String apiUrl, @NotNull String apiUrlSuffix, @NotNull e appDomain, boolean z11, @NotNull DeviceType deviceType) {
        String str;
        Intrinsics.checkNotNullParameter(apiUrl, "apiUrl");
        Intrinsics.checkNotNullParameter(apiUrlSuffix, "apiUrlSuffix");
        Intrinsics.checkNotNullParameter(appDomain, "appDomain");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.apiUrl = apiUrl;
        this.apiUrlSuffix = apiUrlSuffix;
        this.appDomain = appDomain;
        this.isDebug = z11;
        this.deviceType = deviceType;
        int i11 = WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()];
        if (i11 == 1) {
            str = "tablet";
        } else if (i11 == 2) {
            str = "tv";
        } else {
            if (i11 != 3) {
                throw new o();
            }
            str = "mobile";
        }
        this.deviceTypeName = str;
    }

    @NotNull
    public final String getApiUrl() {
        return this.apiUrl;
    }

    @NotNull
    public final String getApiUrlSuffix() {
        return this.apiUrlSuffix;
    }

    @NotNull
    public final e getAppDomain() {
        return this.appDomain;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getDeviceTypeName() {
        return this.deviceTypeName;
    }

    /* renamed from: isDebug, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }
}
