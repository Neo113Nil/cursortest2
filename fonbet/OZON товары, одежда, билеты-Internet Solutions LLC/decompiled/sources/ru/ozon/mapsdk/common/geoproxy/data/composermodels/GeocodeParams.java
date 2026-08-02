package ru.ozon.mapsdk.common.geoproxy.data.composermodels;

import G.g;
import Kk.C3532b;
import N3.C3660k;
import Nh.a;
import com.google.android.gms.actions.SearchIntents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeocodeParams;", "", "clientName", "", SearchIntents.EXTRA_QUERY, "lang", "locationUID", "excludeEnricher", "", "preferredProviders", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "getClientName", "()Ljava/lang/String;", "getQuery", "getLang", "getLocationUID", "getExcludeEnricher", "()Z", "getPreferredProviders", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GeocodeParams {

    @NotNull
    private final String clientName;
    private final boolean excludeEnricher;
    private final String lang;
    private final String locationUID;

    @NotNull
    private final List<String> preferredProviders;

    @NotNull
    private final String query;

    public GeocodeParams(@NotNull String clientName, @NotNull String query, String str, String str2, boolean z11, @NotNull List<String> preferredProviders) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(preferredProviders, "preferredProviders");
        this.clientName = clientName;
        this.query = query;
        this.lang = str;
        this.locationUID = str2;
        this.excludeEnricher = z11;
        this.preferredProviders = preferredProviders;
    }

    public static /* synthetic */ GeocodeParams copy$default(GeocodeParams geocodeParams, String str, String str2, String str3, String str4, boolean z11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = geocodeParams.clientName;
        }
        if ((i11 & 2) != 0) {
            str2 = geocodeParams.query;
        }
        if ((i11 & 4) != 0) {
            str3 = geocodeParams.lang;
        }
        if ((i11 & 8) != 0) {
            str4 = geocodeParams.locationUID;
        }
        if ((i11 & 16) != 0) {
            z11 = geocodeParams.excludeEnricher;
        }
        if ((i11 & 32) != 0) {
            list = geocodeParams.preferredProviders;
        }
        boolean z12 = z11;
        List list2 = list;
        return geocodeParams.copy(str, str2, str3, str4, z12, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocationUID() {
        return this.locationUID;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getExcludeEnricher() {
        return this.excludeEnricher;
    }

    @NotNull
    public final List<String> component6() {
        return this.preferredProviders;
    }

    @NotNull
    public final GeocodeParams copy(@NotNull String clientName, @NotNull String query, String lang, String locationUID, boolean excludeEnricher, @NotNull List<String> preferredProviders) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(preferredProviders, "preferredProviders");
        return new GeocodeParams(clientName, query, lang, locationUID, excludeEnricher, preferredProviders);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeocodeParams)) {
            return false;
        }
        GeocodeParams geocodeParams = (GeocodeParams) other;
        return Intrinsics.d(this.clientName, geocodeParams.clientName) && Intrinsics.d(this.query, geocodeParams.query) && Intrinsics.d(this.lang, geocodeParams.lang) && Intrinsics.d(this.locationUID, geocodeParams.locationUID) && this.excludeEnricher == geocodeParams.excludeEnricher && Intrinsics.d(this.preferredProviders, geocodeParams.preferredProviders);
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
    public final List<String> getPreferredProviders() {
        return this.preferredProviders;
    }

    @NotNull
    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        int a11 = g.a(this.clientName.hashCode() * 31, 31, this.query);
        String str = this.lang;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.locationUID;
        return this.preferredProviders.hashCode() + C3532b.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.excludeEnricher);
    }

    @NotNull
    public String toString() {
        String str = this.clientName;
        String str2 = this.query;
        String str3 = this.lang;
        String str4 = this.locationUID;
        boolean z11 = this.excludeEnricher;
        List<String> list = this.preferredProviders;
        StringBuilder d11 = C3660k.d("GeocodeParams(clientName=", str, ", query=", str2, ", lang=");
        a.h(d11, str3, ", locationUID=", str4, ", excludeEnricher=");
        d11.append(z11);
        d11.append(", preferredProviders=");
        d11.append(list);
        d11.append(")");
        return d11.toString();
    }
}
