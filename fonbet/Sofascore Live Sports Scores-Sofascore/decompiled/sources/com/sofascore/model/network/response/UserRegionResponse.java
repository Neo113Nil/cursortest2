package com.sofascore.model.network.response;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.mz1;
import defpackage.oea;
import defpackage.q5h;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBa\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJJ\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010+\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b1\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b3\u0010/\u001a\u0004\b2\u0010\u001c¨\u00066"}, d2 = {"Lcom/sofascore/model/network/response/UserRegionResponse;", "Lcom/sofascore/model/network/response/AbstractNetworkResponse;", "", "alpha2", "continentCode", "country", "city", "regionCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lcom/sofascore/model/network/response/HeadResponse;", "head", "error", "Lt5h;", "serializationConstructorMarker", "(ILcom/sofascore/model/network/response/HeadResponse;Lcom/sofascore/model/network/response/HeadResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/network/response/UserRegionResponse;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sofascore/model/network/response/UserRegionResponse;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAlpha2", "getContinentCode", "getContinentCode$annotations", "()V", "getCountry", "getCity", "getRegionCode", "getRegionCode$annotations", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserRegionResponse extends AbstractNetworkResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String alpha2;

    @Nullable
    private final String city;

    @Nullable
    private final String continentCode;

    @Nullable
    private final String country;

    @Nullable
    private final String regionCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserRegionResponse(int i, HeadResponse headResponse, HeadResponse headResponse2, String str, String str2, String str3, String str4, String str5, t5h t5hVar) {
        super(i, headResponse, headResponse2, t5hVar);
        if (124 != (i & Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, UserRegionResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.alpha2 = str;
        this.continentCode = str2;
        this.country = str3;
        this.city = str4;
        this.regionCode = str5;
    }

    public static /* synthetic */ UserRegionResponse copy$default(UserRegionResponse userRegionResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userRegionResponse.alpha2;
        }
        if ((i & 2) != 0) {
            str2 = userRegionResponse.continentCode;
        }
        if ((i & 4) != 0) {
            str3 = userRegionResponse.country;
        }
        if ((i & 8) != 0) {
            str4 = userRegionResponse.city;
        }
        if ((i & 16) != 0) {
            str5 = userRegionResponse.regionCode;
        }
        String str6 = str5;
        String str7 = str3;
        return userRegionResponse.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$model_release(UserRegionResponse self, wf3 output, SerialDescriptor serialDesc) {
        AbstractNetworkResponse.write$Self(self, output, serialDesc);
        output.y(serialDesc, 2, self.alpha2);
        uhi uhiVar = uhi.a;
        output.h(serialDesc, 3, uhiVar, self.continentCode);
        output.h(serialDesc, 4, uhiVar, self.country);
        output.h(serialDesc, 5, uhiVar, self.city);
        output.h(serialDesc, 6, uhiVar, self.regionCode);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAlpha2() {
        return this.alpha2;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getContinentCode() {
        return this.continentCode;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    public final UserRegionResponse copy(@NotNull String alpha2, @Nullable String continentCode, @Nullable String country, @Nullable String city, @Nullable String regionCode) {
        alpha2.getClass();
        return new UserRegionResponse(alpha2, continentCode, country, city, regionCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRegionResponse)) {
            return false;
        }
        UserRegionResponse userRegionResponse = (UserRegionResponse) other;
        return Intrinsics.c(this.alpha2, userRegionResponse.alpha2) && Intrinsics.c(this.continentCode, userRegionResponse.continentCode) && Intrinsics.c(this.country, userRegionResponse.country) && Intrinsics.c(this.city, userRegionResponse.city) && Intrinsics.c(this.regionCode, userRegionResponse.regionCode);
    }

    @NotNull
    public final String getAlpha2() {
        return this.alpha2;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getContinentCode() {
        return this.continentCode;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getRegionCode() {
        return this.regionCode;
    }

    public int hashCode() {
        int hashCode = this.alpha2.hashCode() * 31;
        String str = this.continentCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.city;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.regionCode;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.alpha2;
        String str2 = this.continentCode;
        String str3 = this.country;
        String str4 = this.city;
        String str5 = this.regionCode;
        StringBuilder s = mz1.s("UserRegionResponse(alpha2=", str, ", continentCode=", str2, ", country=");
        bf3.v(s, str3, ", city=", str4, ", regionCode=");
        return mz1.o(s, str5, ")");
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/network/response/UserRegionResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/network/response/UserRegionResponse;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return UserRegionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @q5h("continent_code")
    public static /* synthetic */ void getContinentCode$annotations() {
    }

    @q5h("region_code")
    public static /* synthetic */ void getRegionCode$annotations() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserRegionResponse(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        super((HeadResponse) null, (HeadResponse) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        str.getClass();
        this.alpha2 = str;
        this.continentCode = str2;
        this.country = str3;
        this.city = str4;
        this.regionCode = str5;
    }
}
