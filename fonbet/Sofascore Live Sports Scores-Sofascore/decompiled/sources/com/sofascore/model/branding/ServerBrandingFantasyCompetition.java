package com.sofascore.model.branding;

import com.sofascore.model.odds.OddsProvider;
import com.sofascore.model.odds.OddsProvider$$serializer;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.dmi;
import defpackage.gz1;
import defpackage.lnb;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.uhi;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\\\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b\n\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010#R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010(¨\u0006="}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingFantasyCompetition;", "", "", "id", "brandingType", "Lcom/sofascore/model/branding/ServerBrand;", "brand", "", "termsAndConditionsUrl", "", "isTermsAndConditionsMandatory", "url", "Lcom/sofascore/model/odds/OddsProvider;", "oddsProvider", "<init>", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IIILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/branding/ServerBrandingFantasyCompetition;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "()Lcom/sofascore/model/branding/ServerBrand;", "component4", "()Ljava/lang/String;", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/sofascore/model/odds/OddsProvider;", "copy", "(IILcom/sofascore/model/branding/ServerBrand;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/sofascore/model/odds/OddsProvider;)Lcom/sofascore/model/branding/ServerBrandingFantasyCompetition;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getBrandingType", "Lcom/sofascore/model/branding/ServerBrand;", "getBrand", "Ljava/lang/String;", "getTermsAndConditionsUrl", "Ljava/lang/Boolean;", "getUrl", "Lcom/sofascore/model/odds/OddsProvider;", "getOddsProvider", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ServerBrandingFantasyCompetition {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ServerBrand brand;
    private final int brandingType;
    private final int id;

    @Nullable
    private final Boolean isTermsAndConditionsMandatory;

    @Nullable
    private final OddsProvider oddsProvider;

    @NotNull
    private final String termsAndConditionsUrl;

    @Nullable
    private final String url;

    public /* synthetic */ ServerBrandingFantasyCompetition(int i, int i2, int i3, ServerBrand serverBrand, String str, Boolean bool, String str2, OddsProvider oddsProvider, t5h t5hVar) {
        if (127 != (i & Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE)) {
            oea.z(i, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, ServerBrandingFantasyCompetition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i2;
        this.brandingType = i3;
        this.brand = serverBrand;
        this.termsAndConditionsUrl = str;
        this.isTermsAndConditionsMandatory = bool;
        this.url = str2;
        this.oddsProvider = oddsProvider;
    }

    public static /* synthetic */ ServerBrandingFantasyCompetition copy$default(ServerBrandingFantasyCompetition serverBrandingFantasyCompetition, int i, int i2, ServerBrand serverBrand, String str, Boolean bool, String str2, OddsProvider oddsProvider, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = serverBrandingFantasyCompetition.id;
        }
        if ((i3 & 2) != 0) {
            i2 = serverBrandingFantasyCompetition.brandingType;
        }
        if ((i3 & 4) != 0) {
            serverBrand = serverBrandingFantasyCompetition.brand;
        }
        if ((i3 & 8) != 0) {
            str = serverBrandingFantasyCompetition.termsAndConditionsUrl;
        }
        if ((i3 & 16) != 0) {
            bool = serverBrandingFantasyCompetition.isTermsAndConditionsMandatory;
        }
        if ((i3 & 32) != 0) {
            str2 = serverBrandingFantasyCompetition.url;
        }
        if ((i3 & 64) != 0) {
            oddsProvider = serverBrandingFantasyCompetition.oddsProvider;
        }
        String str3 = str2;
        OddsProvider oddsProvider2 = oddsProvider;
        Boolean bool2 = bool;
        ServerBrand serverBrand2 = serverBrand;
        return serverBrandingFantasyCompetition.copy(i, i2, serverBrand2, str, bool2, str3, oddsProvider2);
    }

    public static final /* synthetic */ void write$Self$model_release(ServerBrandingFantasyCompetition self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.id, serialDesc);
        output.u(1, self.brandingType, serialDesc);
        output.f(serialDesc, 2, ServerBrand$$serializer.INSTANCE, self.brand);
        output.y(serialDesc, 3, self.termsAndConditionsUrl);
        output.h(serialDesc, 4, gz1.a, self.isTermsAndConditionsMandatory);
        output.h(serialDesc, 5, uhi.a, self.url);
        output.h(serialDesc, 6, OddsProvider$$serializer.INSTANCE, self.oddsProvider);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBrandingType() {
        return this.brandingType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ServerBrand getBrand() {
        return this.brand;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsTermsAndConditionsMandatory() {
        return this.isTermsAndConditionsMandatory;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final OddsProvider getOddsProvider() {
        return this.oddsProvider;
    }

    @NotNull
    public final ServerBrandingFantasyCompetition copy(int id, int brandingType, @NotNull ServerBrand brand, @NotNull String termsAndConditionsUrl, @Nullable Boolean isTermsAndConditionsMandatory, @Nullable String url, @Nullable OddsProvider oddsProvider) {
        brand.getClass();
        termsAndConditionsUrl.getClass();
        return new ServerBrandingFantasyCompetition(id, brandingType, brand, termsAndConditionsUrl, isTermsAndConditionsMandatory, url, oddsProvider);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerBrandingFantasyCompetition)) {
            return false;
        }
        ServerBrandingFantasyCompetition serverBrandingFantasyCompetition = (ServerBrandingFantasyCompetition) other;
        return this.id == serverBrandingFantasyCompetition.id && this.brandingType == serverBrandingFantasyCompetition.brandingType && Intrinsics.c(this.brand, serverBrandingFantasyCompetition.brand) && Intrinsics.c(this.termsAndConditionsUrl, serverBrandingFantasyCompetition.termsAndConditionsUrl) && Intrinsics.c(this.isTermsAndConditionsMandatory, serverBrandingFantasyCompetition.isTermsAndConditionsMandatory) && Intrinsics.c(this.url, serverBrandingFantasyCompetition.url) && Intrinsics.c(this.oddsProvider, serverBrandingFantasyCompetition.oddsProvider);
    }

    @NotNull
    public final ServerBrand getBrand() {
        return this.brand;
    }

    public final int getBrandingType() {
        return this.brandingType;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final OddsProvider getOddsProvider() {
        return this.oddsProvider;
    }

    @NotNull
    public final String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int c = dmi.c((this.brand.hashCode() + wv8.a(this.brandingType, Integer.hashCode(this.id) * 31, 31)) * 31, 31, this.termsAndConditionsUrl);
        Boolean bool = this.isTermsAndConditionsMandatory;
        int hashCode = (c + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        OddsProvider oddsProvider = this.oddsProvider;
        return hashCode2 + (oddsProvider != null ? oddsProvider.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTermsAndConditionsMandatory() {
        return this.isTermsAndConditionsMandatory;
    }

    @NotNull
    public String toString() {
        int i = this.id;
        int i2 = this.brandingType;
        ServerBrand serverBrand = this.brand;
        String str = this.termsAndConditionsUrl;
        Boolean bool = this.isTermsAndConditionsMandatory;
        String str2 = this.url;
        OddsProvider oddsProvider = this.oddsProvider;
        StringBuilder s = lnb.s(i, i2, "ServerBrandingFantasyCompetition(id=", ", brandingType=", ", brand=");
        s.append(serverBrand);
        s.append(", termsAndConditionsUrl=");
        s.append(str);
        s.append(", isTermsAndConditionsMandatory=");
        s.append(bool);
        s.append(", url=");
        s.append(str2);
        s.append(", oddsProvider=");
        s.append(oddsProvider);
        s.append(")");
        return s.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/branding/ServerBrandingFantasyCompetition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/branding/ServerBrandingFantasyCompetition;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ServerBrandingFantasyCompetition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ServerBrandingFantasyCompetition(int i, int i2, @NotNull ServerBrand serverBrand, @NotNull String str, @Nullable Boolean bool, @Nullable String str2, @Nullable OddsProvider oddsProvider) {
        serverBrand.getClass();
        str.getClass();
        this.id = i;
        this.brandingType = i2;
        this.brand = serverBrand;
        this.termsAndConditionsUrl = str;
        this.isTermsAndConditionsMandatory = bool;
        this.url = str2;
        this.oddsProvider = oddsProvider;
    }
}
