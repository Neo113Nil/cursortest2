package ru.ozon.push.sdk.internal.token.api;

import B0.C2454a;
import C.o0;
import Cm.e;
import G.g;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jh0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b0\b\u0081\b\u0018\u00002\u00020\u0001:\u0004?@ABB{\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0012\u001a\u00020\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0084\u0001\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0003\u0010\u000b\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\f2\u000e\b\u0003\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0018J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u001a\u0010-\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010!R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010#R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b<\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u00106\u001a\u0004\b=\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010>\u001a\u0004\b\u0014\u0010'¨\u0006C"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;", "", "", "hwid", "oldHwId", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;", "application", "", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "tokens", "", "tzOffset", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;", "authorization", "", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$b;", "permissions", "deviceModel", "microphonePermission", "", "isTeensModeEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;Ljava/util/Set;ILru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;Ljava/util/List;Ljava/lang/String;ILjava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;", "component4", "()Ljava/util/Set;", "component5", "()I", "component6", "()Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;Ljava/util/Set;ILru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;Ljava/util/List;Ljava/lang/String;ILjava/lang/Boolean;)Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHwid", "getOldHwId", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;", "getApplication", "Ljava/util/Set;", "getTokens", "I", "getTzOffset", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;", "getAuthorization", "Ljava/util/List;", "getPermissions", "getDeviceModel", "getMicrophonePermission", "Ljava/lang/Boolean;", "ApplicationInfo", "TokenInfo", "a", "b", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TokenUpdateRequest {

    @NotNull
    private final ApplicationInfo application;

    @NotNull
    private final a authorization;

    @NotNull
    private final String deviceModel;

    @NotNull
    private final String hwid;
    private final Boolean isTeensModeEnabled;
    private final int microphonePermission;
    private final String oldHwId;

    @NotNull
    private final List<b> permissions;

    @NotNull
    private final Set<TokenInfo> tokens;
    private final int tzOffset;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$ApplicationInfo;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "platform", "buildType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getPlatform", "getBuildType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ApplicationInfo {

        @NotNull
        private final String buildType;

        @NotNull
        private final String name;

        @NotNull
        private final String platform;

        public ApplicationInfo(@i(name = "name") @NotNull String name, @i(name = "platform") @NotNull String platform, @i(name = "buildType") @NotNull String buildType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            this.name = name;
            this.platform = platform;
            this.buildType = buildType;
        }

        public static /* synthetic */ ApplicationInfo copy$default(ApplicationInfo applicationInfo, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = applicationInfo.name;
            }
            if ((i11 & 2) != 0) {
                str2 = applicationInfo.platform;
            }
            if ((i11 & 4) != 0) {
                str3 = applicationInfo.buildType;
            }
            return applicationInfo.copy(str, str2, str3);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getBuildType() {
            return this.buildType;
        }

        @NotNull
        public final ApplicationInfo copy(@i(name = "name") @NotNull String name, @i(name = "platform") @NotNull String platform, @i(name = "buildType") @NotNull String buildType) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(buildType, "buildType");
            return new ApplicationInfo(name, platform, buildType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicationInfo)) {
                return false;
            }
            ApplicationInfo applicationInfo = (ApplicationInfo) other;
            return Intrinsics.d(this.name, applicationInfo.name) && Intrinsics.d(this.platform, applicationInfo.platform) && Intrinsics.d(this.buildType, applicationInfo.buildType);
        }

        @NotNull
        public final String getBuildType() {
            return this.buildType;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPlatform() {
            return this.platform;
        }

        public int hashCode() {
            return this.buildType.hashCode() + g.a(this.name.hashCode() * 31, 31, this.platform);
        }

        @NotNull
        public String toString() {
            String str = this.name;
            String str2 = this.platform;
            return o0.c(C3660k.d("ApplicationInfo(name=", str, ", platform=", str2, ", buildType="), this.buildType, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DISABLED", "ENABLED", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;
        public static final a DISABLED = new a("DISABLED", 0);
        public static final a ENABLED = new a("ENABLED", 1);

        /* renamed from: ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{DISABLED, ENABLED};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
            INSTANCE = new Companion();
        }

        private a(String str, int i11) {
        }

        @NotNull
        public static Xc.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$b;", "", "<init>", "(Ljava/lang/String;I)V", "SOUND", "NOTIFICATION_CENTER", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = false)
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b SOUND = new b("SOUND", 0);
        public static final b NOTIFICATION_CENTER = new b("NOTIFICATION_CENTER", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{SOUND, NOTIFICATION_CENTER};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private b(String str, int i11) {
        }

        @NotNull
        public static Xc.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenUpdateRequest(@i(name = "hwid") @NotNull String hwid, @i(name = "hwidold") String str, @i(name = "application") @NotNull ApplicationInfo application, @i(name = "tokens") @NotNull Set<TokenInfo> tokens, @i(name = "tzOffset") int i11, @i(name = "authorization") @NotNull a authorization, @i(name = "permissions") @NotNull List<? extends b> permissions, @i(name = "deviceModel") @NotNull String deviceModel, @i(name = "microphone_permission") int i12, @i(name = "is_teens_mode") Boolean bool) {
        Intrinsics.checkNotNullParameter(hwid, "hwid");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        this.hwid = hwid;
        this.oldHwId = str;
        this.application = application;
        this.tokens = tokens;
        this.tzOffset = i11;
        this.authorization = authorization;
        this.permissions = permissions;
        this.deviceModel = deviceModel;
        this.microphonePermission = i12;
        this.isTeensModeEnabled = bool;
    }

    public static /* synthetic */ TokenUpdateRequest copy$default(TokenUpdateRequest tokenUpdateRequest, String str, String str2, ApplicationInfo applicationInfo, Set set, int i11, a aVar, List list, String str3, int i12, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = tokenUpdateRequest.hwid;
        }
        if ((i13 & 2) != 0) {
            str2 = tokenUpdateRequest.oldHwId;
        }
        if ((i13 & 4) != 0) {
            applicationInfo = tokenUpdateRequest.application;
        }
        if ((i13 & 8) != 0) {
            set = tokenUpdateRequest.tokens;
        }
        if ((i13 & 16) != 0) {
            i11 = tokenUpdateRequest.tzOffset;
        }
        if ((i13 & 32) != 0) {
            aVar = tokenUpdateRequest.authorization;
        }
        if ((i13 & 64) != 0) {
            list = tokenUpdateRequest.permissions;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str3 = tokenUpdateRequest.deviceModel;
        }
        if ((i13 & 256) != 0) {
            i12 = tokenUpdateRequest.microphonePermission;
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            bool = tokenUpdateRequest.isTeensModeEnabled;
        }
        int i14 = i12;
        Boolean bool2 = bool;
        List list2 = list;
        String str4 = str3;
        int i15 = i11;
        a aVar2 = aVar;
        return tokenUpdateRequest.copy(str, str2, applicationInfo, set, i15, aVar2, list2, str4, i14, bool2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getHwid() {
        return this.hwid;
    }

    /* renamed from: component10, reason: from getter */
    public final Boolean getIsTeensModeEnabled() {
        return this.isTeensModeEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOldHwId() {
        return this.oldHwId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ApplicationInfo getApplication() {
        return this.application;
    }

    @NotNull
    public final Set<TokenInfo> component4() {
        return this.tokens;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTzOffset() {
        return this.tzOffset;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final a getAuthorization() {
        return this.authorization;
    }

    @NotNull
    public final List<b> component7() {
        return this.permissions;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component9, reason: from getter */
    public final int getMicrophonePermission() {
        return this.microphonePermission;
    }

    @NotNull
    public final TokenUpdateRequest copy(@i(name = "hwid") @NotNull String hwid, @i(name = "hwidold") String oldHwId, @i(name = "application") @NotNull ApplicationInfo application, @i(name = "tokens") @NotNull Set<TokenInfo> tokens, @i(name = "tzOffset") int tzOffset, @i(name = "authorization") @NotNull a authorization, @i(name = "permissions") @NotNull List<? extends b> permissions, @i(name = "deviceModel") @NotNull String deviceModel, @i(name = "microphone_permission") int microphonePermission, @i(name = "is_teens_mode") Boolean isTeensModeEnabled) {
        Intrinsics.checkNotNullParameter(hwid, "hwid");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(tokens, "tokens");
        Intrinsics.checkNotNullParameter(authorization, "authorization");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        return new TokenUpdateRequest(hwid, oldHwId, application, tokens, tzOffset, authorization, permissions, deviceModel, microphonePermission, isTeensModeEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenUpdateRequest)) {
            return false;
        }
        TokenUpdateRequest tokenUpdateRequest = (TokenUpdateRequest) other;
        return Intrinsics.d(this.hwid, tokenUpdateRequest.hwid) && Intrinsics.d(this.oldHwId, tokenUpdateRequest.oldHwId) && Intrinsics.d(this.application, tokenUpdateRequest.application) && Intrinsics.d(this.tokens, tokenUpdateRequest.tokens) && this.tzOffset == tokenUpdateRequest.tzOffset && this.authorization == tokenUpdateRequest.authorization && Intrinsics.d(this.permissions, tokenUpdateRequest.permissions) && Intrinsics.d(this.deviceModel, tokenUpdateRequest.deviceModel) && this.microphonePermission == tokenUpdateRequest.microphonePermission && Intrinsics.d(this.isTeensModeEnabled, tokenUpdateRequest.isTeensModeEnabled);
    }

    @NotNull
    public final ApplicationInfo getApplication() {
        return this.application;
    }

    @NotNull
    public final a getAuthorization() {
        return this.authorization;
    }

    @NotNull
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    @NotNull
    public final String getHwid() {
        return this.hwid;
    }

    public final int getMicrophonePermission() {
        return this.microphonePermission;
    }

    public final String getOldHwId() {
        return this.oldHwId;
    }

    @NotNull
    public final List<b> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final Set<TokenInfo> getTokens() {
        return this.tokens;
    }

    public final int getTzOffset() {
        return this.tzOffset;
    }

    public int hashCode() {
        int hashCode = this.hwid.hashCode() * 31;
        String str = this.oldHwId;
        int a11 = C2454a.a(this.microphonePermission, g.a(g.b((this.authorization.hashCode() + C2454a.a(this.tzOffset, (this.tokens.hashCode() + ((this.application.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31)) * 31, 31, this.permissions), 31, this.deviceModel), 31);
        Boolean bool = this.isTeensModeEnabled;
        return a11 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isTeensModeEnabled() {
        return this.isTeensModeEnabled;
    }

    @NotNull
    public String toString() {
        String str = this.hwid;
        String str2 = this.oldHwId;
        ApplicationInfo applicationInfo = this.application;
        Set<TokenInfo> set = this.tokens;
        int i11 = this.tzOffset;
        a aVar = this.authorization;
        List<b> list = this.permissions;
        String str3 = this.deviceModel;
        int i12 = this.microphonePermission;
        Boolean bool = this.isTeensModeEnabled;
        StringBuilder d11 = C3660k.d("TokenUpdateRequest(hwid=", str, ", oldHwId=", str2, ", application=");
        d11.append(applicationInfo);
        d11.append(", tokens=");
        d11.append(set);
        d11.append(", tzOffset=");
        d11.append(i11);
        d11.append(", authorization=");
        d11.append(aVar);
        d11.append(", permissions=");
        e.i(", deviceModel=", str3, ", microphonePermission=", d11, list);
        d11.append(i12);
        d11.append(", isTeensModeEnabled=");
        d11.append(bool);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001:\u0001-BQ\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\u0016\b\u0003\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b&\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0015R%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u0019¨\u0006."}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "", "", "token", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;", "provider", "signature", "Ljh0/c;", "updateTrigger", "", "metadata", "", "tokenType", "<init>", "(Ljava/lang/String;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;Ljava/lang/String;Ljh0/c;Ljava/util/Map;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;", "component3", "component4", "()Ljh0/c;", "component5", "()Ljava/util/Map;", "component6", "()I", "copy", "(Ljava/lang/String;Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;Ljava/lang/String;Ljh0/c;Ljava/util/Map;I)Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;", "getProvider", "getSignature", "Ljh0/c;", "getUpdateTrigger", "Ljava/util/Map;", "getMetadata", "I", "getTokenType", "a", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TokenInfo {
        private final Map<String, String> metadata;

        @NotNull
        private final a provider;

        @NotNull
        private final String signature;

        @NotNull
        private final String token;
        private final int tokenType;

        @NotNull
        private final c updateTrigger;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/ozon/push/sdk/internal/token/api/TokenUpdateRequest$TokenInfo$a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "FCM", "HMS", "RUSTORE", "push-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class a {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE;
            public static final a FCM = new a("FCM", 0);
            public static final a HMS = new a("HMS", 1);
            public static final a RUSTORE = new a("RUSTORE", 2);

            /* renamed from: ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest$TokenInfo$a$a, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {

                /* renamed from: ru.ozon.push.sdk.internal.token.api.TokenUpdateRequest$TokenInfo$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C2144a {

                    /* renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f97712a;

                    static {
                        int[] iArr = new int[jh0.b.values().length];
                        try {
                            iArr[jh0.b.FCM.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[jh0.b.HMS.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[jh0.b.RUSTORE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        f97712a = iArr;
                    }
                }
            }

            private static final /* synthetic */ a[] $values() {
                return new a[]{FCM, HMS, RUSTORE};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
                INSTANCE = new Companion();
            }

            private a(String str, int i11) {
            }

            @NotNull
            public static Xc.a<a> getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public TokenInfo(@i(name = "token") @NotNull String token, @i(name = "provider") @NotNull a provider, @i(name = "signature") @NotNull String signature, @i(name = "updateTrigger") @NotNull c updateTrigger, @i(name = "metadata") Map<String, String> map, @i(name = "token_type") int i11) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            this.token = token;
            this.provider = provider;
            this.signature = signature;
            this.updateTrigger = updateTrigger;
            this.metadata = map;
            this.tokenType = i11;
        }

        public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, String str, a aVar, String str2, c cVar, Map map, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = tokenInfo.token;
            }
            if ((i12 & 2) != 0) {
                aVar = tokenInfo.provider;
            }
            if ((i12 & 4) != 0) {
                str2 = tokenInfo.signature;
            }
            if ((i12 & 8) != 0) {
                cVar = tokenInfo.updateTrigger;
            }
            if ((i12 & 16) != 0) {
                map = tokenInfo.metadata;
            }
            if ((i12 & 32) != 0) {
                i11 = tokenInfo.tokenType;
            }
            Map map2 = map;
            int i13 = i11;
            return tokenInfo.copy(str, aVar, str2, cVar, map2, i13);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final a getProvider() {
            return this.provider;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getSignature() {
            return this.signature;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final c getUpdateTrigger() {
            return this.updateTrigger;
        }

        public final Map<String, String> component5() {
            return this.metadata;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTokenType() {
            return this.tokenType;
        }

        @NotNull
        public final TokenInfo copy(@i(name = "token") @NotNull String token, @i(name = "provider") @NotNull a provider, @i(name = "signature") @NotNull String signature, @i(name = "updateTrigger") @NotNull c updateTrigger, @i(name = "metadata") Map<String, String> metadata, @i(name = "token_type") int tokenType) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(provider, "provider");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(updateTrigger, "updateTrigger");
            return new TokenInfo(token, provider, signature, updateTrigger, metadata, tokenType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TokenInfo)) {
                return false;
            }
            TokenInfo tokenInfo = (TokenInfo) other;
            return Intrinsics.d(this.token, tokenInfo.token) && this.provider == tokenInfo.provider && Intrinsics.d(this.signature, tokenInfo.signature) && this.updateTrigger == tokenInfo.updateTrigger && Intrinsics.d(this.metadata, tokenInfo.metadata) && this.tokenType == tokenInfo.tokenType;
        }

        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        @NotNull
        public final a getProvider() {
            return this.provider;
        }

        @NotNull
        public final String getSignature() {
            return this.signature;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        public final int getTokenType() {
            return this.tokenType;
        }

        @NotNull
        public final c getUpdateTrigger() {
            return this.updateTrigger;
        }

        public int hashCode() {
            int hashCode = (this.updateTrigger.hashCode() + g.a((this.provider.hashCode() + (this.token.hashCode() * 31)) * 31, 31, this.signature)) * 31;
            Map<String, String> map = this.metadata;
            return Integer.hashCode(this.tokenType) + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "TokenInfo(token=" + this.token + ", provider=" + this.provider + ", signature=" + this.signature + ", updateTrigger=" + this.updateTrigger + ", metadata=" + this.metadata + ", tokenType=" + this.tokenType + ")";
        }

        public /* synthetic */ TokenInfo(String str, a aVar, String str2, c cVar, Map map, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, aVar, str2, cVar, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ TokenUpdateRequest(String str, String str2, ApplicationInfo applicationInfo, Set set, int i11, a aVar, List list, String str3, int i12, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, applicationInfo, set, i11, aVar, list, str3, i12, bool);
    }
}
