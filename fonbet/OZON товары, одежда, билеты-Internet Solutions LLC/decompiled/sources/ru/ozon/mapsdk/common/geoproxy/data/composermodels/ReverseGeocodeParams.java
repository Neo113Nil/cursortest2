package ru.ozon.mapsdk.common.geoproxy.data.composermodels;

import B90.C2618u;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Nh.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ReverseGeocodeParams;", "", "clientName", "", "point", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "resultType", "lang", "locationUID", "excludeEnricher", "", "preferredProviders", "", "<init>", "(Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getClientName", "()Ljava/lang/String;", "getPoint", "()Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "getResultType", "getLang", "getLocationUID", "getExcludeEnricher", "()Z", "getPreferredProviders", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReverseGeocodeParams {

    @NotNull
    private final String clientName;
    private final boolean excludeEnricher;
    private final String lang;
    private final String locationUID;

    @NotNull
    private final ComposerLatLng point;

    @NotNull
    private final List<String> preferredProviders;

    @NotNull
    private final String resultType;

    public ReverseGeocodeParams(@NotNull String clientName, @NotNull ComposerLatLng point, @NotNull String resultType, String str, String str2, boolean z11, @NotNull List<String> preferredProviders) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(preferredProviders, "preferredProviders");
        this.clientName = clientName;
        this.point = point;
        this.resultType = resultType;
        this.lang = str;
        this.locationUID = str2;
        this.excludeEnricher = z11;
        this.preferredProviders = preferredProviders;
    }

    public static /* synthetic */ ReverseGeocodeParams copy$default(ReverseGeocodeParams reverseGeocodeParams, String str, ComposerLatLng composerLatLng, String str2, String str3, String str4, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reverseGeocodeParams.clientName;
        }
        if ((i11 & 2) != 0) {
            composerLatLng = reverseGeocodeParams.point;
        }
        if ((i11 & 4) != 0) {
            str2 = reverseGeocodeParams.resultType;
        }
        if ((i11 & 8) != 0) {
            str3 = reverseGeocodeParams.lang;
        }
        if ((i11 & 16) != 0) {
            str4 = reverseGeocodeParams.locationUID;
        }
        if ((i11 & 32) != 0) {
            z11 = reverseGeocodeParams.excludeEnricher;
        }
        if ((i11 & 64) != 0) {
            list = reverseGeocodeParams.preferredProviders;
        }
        boolean z12 = z11;
        List list2 = list;
        String str5 = str4;
        String str6 = str2;
        return reverseGeocodeParams.copy(str, composerLatLng, str6, str3, str5, z12, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ComposerLatLng getPoint() {
        return this.point;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getResultType() {
        return this.resultType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLocationUID() {
        return this.locationUID;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getExcludeEnricher() {
        return this.excludeEnricher;
    }

    @NotNull
    public final List<String> component7() {
        return this.preferredProviders;
    }

    @NotNull
    public final ReverseGeocodeParams copy(@NotNull String clientName, @NotNull ComposerLatLng point, @NotNull String resultType, String lang, String locationUID, boolean excludeEnricher, @NotNull List<String> preferredProviders) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(point, "point");
        Intrinsics.checkNotNullParameter(resultType, "resultType");
        Intrinsics.checkNotNullParameter(preferredProviders, "preferredProviders");
        return new ReverseGeocodeParams(clientName, point, resultType, lang, locationUID, excludeEnricher, preferredProviders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReverseGeocodeParams)) {
            return false;
        }
        ReverseGeocodeParams reverseGeocodeParams = (ReverseGeocodeParams) other;
        return Intrinsics.d(this.clientName, reverseGeocodeParams.clientName) && Intrinsics.d(this.point, reverseGeocodeParams.point) && Intrinsics.d(this.resultType, reverseGeocodeParams.resultType) && Intrinsics.d(this.lang, reverseGeocodeParams.lang) && Intrinsics.d(this.locationUID, reverseGeocodeParams.locationUID) && this.excludeEnricher == reverseGeocodeParams.excludeEnricher && Intrinsics.d(this.preferredProviders, reverseGeocodeParams.preferredProviders);
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    public final boolean getExcludeEnricher() {
        return this.excludeEnricher;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLocationUID() {
        return this.locationUID;
    }

    @NotNull
    public final ComposerLatLng getPoint() {
        return this.point;
    }

    @NotNull
    public final List<String> getPreferredProviders() {
        return this.preferredProviders;
    }

    @NotNull
    public final String getResultType() {
        return this.resultType;
    }

    public int hashCode() {
        int a11 = g.a((this.point.hashCode() + (this.clientName.hashCode() * 31)) * 31, 31, this.resultType);
        String str = this.lang;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locationUID;
        return this.preferredProviders.hashCode() + C3532b.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.excludeEnricher);
    }

    @NotNull
    public String toString() {
        String str = this.clientName;
        ComposerLatLng composerLatLng = this.point;
        String str2 = this.resultType;
        String str3 = this.lang;
        String str4 = this.locationUID;
        boolean z11 = this.excludeEnricher;
        List<String> list = this.preferredProviders;
        StringBuilder sb2 = new StringBuilder("ReverseGeocodeParams(clientName=");
        sb2.append(str);
        sb2.append(", point=");
        sb2.append(composerLatLng);
        sb2.append(", resultType=");
        a.h(sb2, str2, ", lang=", str3, ", locationUID=");
        C2880a.c(str4, ", excludeEnricher=", ", preferredProviders=", sb2, z11);
        return C2618u.h(sb2, list, ")");
    }
}
