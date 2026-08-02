package com.sofascore.model.profile;

import androidx.core.app.NotificationCompat;
import com.ironsource.C4259pg;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.fc6;
import defpackage.gz1;
import defpackage.me4;
import defpackage.mz1;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.vxd;
import defpackage.w1l;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u008d\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J|\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0018J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u001aJ\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0018R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b:\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0018R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0018R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u0018R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u00103\u001a\u0004\b?\u0010\u0018\"\u0004\b@\u0010AR$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/sofascore/model/profile/UserInfoRequest;", "", "", "deviceType", "", "version", "sdk", "language", "country", "timezone", "devMod", TtmlNode.TAG_REGION, "regionName", "advertisingId", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "uuid", "", "keepOldData", "Lt5h;", "serializationConstructorMarker", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lt5h;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/profile/UserInfoRequest;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/profile/UserInfoRequest;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDeviceType", "I", C4259pg.b, "getSdk", "getLanguage", "getCountry", "getTimezone", "getDevMod", "getRegion", "getRegionName", "getAdvertisingId", "getUuid", "setUuid", "(Ljava/lang/String;)V", "Ljava/lang/Boolean;", "getKeepOldData", "()Ljava/lang/Boolean;", "setKeepOldData", "(Ljava/lang/Boolean;)V", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserInfoRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String advertisingId;

    @NotNull
    private final String country;

    @Nullable
    private final String devMod;

    @NotNull
    private final String deviceType;

    @Nullable
    private Boolean keepOldData;

    @NotNull
    private final String language;

    @Nullable
    private final String region;

    @Nullable
    private final String regionName;
    private final int sdk;
    private final int timezone;

    @Nullable
    private String uuid;
    private final int version;

    public /* synthetic */ UserInfoRequest(int i, String str, int i2, int i3, String str2, String str3, int i4, String str4, String str5, String str6, String str7, String str8, Boolean bool, t5h t5hVar) {
        if (1023 != (i & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE)) {
            oea.z(i, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, UserInfoRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.deviceType = str;
        this.version = i2;
        this.sdk = i3;
        this.language = str2;
        this.country = str3;
        this.timezone = i4;
        this.devMod = str4;
        this.region = str5;
        this.regionName = str6;
        this.advertisingId = str7;
        if ((i & 1024) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str8;
        }
        if ((i & a.o) == 0) {
            this.keepOldData = null;
        } else {
            this.keepOldData = bool;
        }
    }

    public static /* synthetic */ UserInfoRequest copy$default(UserInfoRequest userInfoRequest, String str, int i, int i2, String str2, String str3, int i3, String str4, String str5, String str6, String str7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = userInfoRequest.deviceType;
        }
        if ((i4 & 2) != 0) {
            i = userInfoRequest.version;
        }
        if ((i4 & 4) != 0) {
            i2 = userInfoRequest.sdk;
        }
        if ((i4 & 8) != 0) {
            str2 = userInfoRequest.language;
        }
        if ((i4 & 16) != 0) {
            str3 = userInfoRequest.country;
        }
        if ((i4 & 32) != 0) {
            i3 = userInfoRequest.timezone;
        }
        if ((i4 & 64) != 0) {
            str4 = userInfoRequest.devMod;
        }
        if ((i4 & 128) != 0) {
            str5 = userInfoRequest.region;
        }
        if ((i4 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            str6 = userInfoRequest.regionName;
        }
        if ((i4 & 512) != 0) {
            str7 = userInfoRequest.advertisingId;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        String str12 = str3;
        int i5 = i3;
        return userInfoRequest.copy(str, i, i2, str2, str12, i5, str10, str11, str8, str9);
    }

    public static final /* synthetic */ void write$Self$model_release(UserInfoRequest self, wf3 output, SerialDescriptor serialDesc) {
        output.y(serialDesc, 0, self.deviceType);
        output.u(1, self.version, serialDesc);
        output.u(2, self.sdk, serialDesc);
        output.y(serialDesc, 3, self.language);
        output.y(serialDesc, 4, self.country);
        output.u(5, self.timezone, serialDesc);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 6, uhiVar, self.devMod);
        output.h(serialDesc, 7, uhiVar, self.region);
        output.h(serialDesc, 8, uhiVar, self.regionName);
        output.h(serialDesc, 9, uhiVar, self.advertisingId);
        if (output.o(serialDesc) || self.uuid != null) {
            output.h(serialDesc, 10, uhiVar, self.uuid);
        }
        if (!output.o(serialDesc) && self.keepOldData == null) {
            return;
        }
        output.h(serialDesc, 11, gz1.a, self.keepOldData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSdk() {
        return this.sdk;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTimezone() {
        return this.timezone;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getDevMod() {
        return this.devMod;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getRegionName() {
        return this.regionName;
    }

    @NotNull
    public final UserInfoRequest copy(@NotNull String deviceType, int version, int sdk, @NotNull String language, @NotNull String country, int timezone, @Nullable String devMod, @Nullable String region, @Nullable String regionName, @Nullable String advertisingId) {
        deviceType.getClass();
        language.getClass();
        country.getClass();
        return new UserInfoRequest(deviceType, version, sdk, language, country, timezone, devMod, region, regionName, advertisingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoRequest)) {
            return false;
        }
        UserInfoRequest userInfoRequest = (UserInfoRequest) other;
        return Intrinsics.c(this.deviceType, userInfoRequest.deviceType) && this.version == userInfoRequest.version && this.sdk == userInfoRequest.sdk && Intrinsics.c(this.language, userInfoRequest.language) && Intrinsics.c(this.country, userInfoRequest.country) && this.timezone == userInfoRequest.timezone && Intrinsics.c(this.devMod, userInfoRequest.devMod) && Intrinsics.c(this.region, userInfoRequest.region) && Intrinsics.c(this.regionName, userInfoRequest.regionName) && Intrinsics.c(this.advertisingId, userInfoRequest.advertisingId);
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDevMod() {
        return this.devMod;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Boolean getKeepOldData() {
        return this.keepOldData;
    }

    @NotNull
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getRegion() {
        return this.region;
    }

    @Nullable
    public final String getRegionName() {
        return this.regionName;
    }

    public final int getSdk() {
        return this.sdk;
    }

    public final int getTimezone() {
        return this.timezone;
    }

    @Nullable
    public final String getUuid() {
        return this.uuid;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        int a = wv8.a(this.timezone, dmi.c(dmi.c(wv8.a(this.sdk, wv8.a(this.version, this.deviceType.hashCode() * 31, 31), 31), 31, this.language), 31, this.country), 31);
        String str = this.devMod;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.region;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.regionName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.advertisingId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setKeepOldData(@Nullable Boolean bool) {
        this.keepOldData = bool;
    }

    public final void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        int i = this.version;
        int i2 = this.sdk;
        String str2 = this.language;
        String str3 = this.country;
        int i3 = this.timezone;
        String str4 = this.devMod;
        String str5 = this.region;
        String str6 = this.regionName;
        String str7 = this.advertisingId;
        StringBuilder q = mz1.q(i, "UserInfoRequest(deviceType=", str, ", version=", ", sdk=");
        vxd.p(i2, ", language=", str2, ", country=", q);
        w1l.q(i3, str3, ", timezone=", ", devMod=", q);
        bf3.v(q, str4, ", region=", str5, ", regionName=");
        return fc6.o(q, str6, ", advertisingId=", str7, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/profile/UserInfoRequest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/profile/UserInfoRequest;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserInfoRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public UserInfoRequest(@NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, int i3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        me4.p(str, str2, str3);
        this.deviceType = str;
        this.version = i;
        this.sdk = i2;
        this.language = str2;
        this.country = str3;
        this.timezone = i3;
        this.devMod = str4;
        this.region = str5;
        this.regionName = str6;
        this.advertisingId = str7;
    }
}
