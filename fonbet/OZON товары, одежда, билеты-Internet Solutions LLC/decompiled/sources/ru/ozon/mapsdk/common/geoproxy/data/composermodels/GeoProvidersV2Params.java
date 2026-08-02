package ru.ozon.mapsdk.common.geoproxy.data.composermodels;

import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lru/ozon/mapsdk/common/geoproxy/data/composermodels/GeoProvidersV2Params;", "", "clientName", "", "locationUid", "point", "Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "lang", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;Ljava/lang/String;)V", "getClientName", "()Ljava/lang/String;", "getLocationUid", "getPoint", "()Lru/ozon/mapsdk/common/geoproxy/data/composermodels/ComposerLatLng;", "getLang", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GeoProvidersV2Params {

    @NotNull
    private final String clientName;
    private final String lang;
    private final String locationUid;
    private final ComposerLatLng point;

    public GeoProvidersV2Params(@NotNull String clientName, String str, ComposerLatLng composerLatLng, String str2) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        this.clientName = clientName;
        this.locationUid = str;
        this.point = composerLatLng;
        this.lang = str2;
    }

    public static /* synthetic */ GeoProvidersV2Params copy$default(GeoProvidersV2Params geoProvidersV2Params, String str, String str2, ComposerLatLng composerLatLng, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = geoProvidersV2Params.clientName;
        }
        if ((i11 & 2) != 0) {
            str2 = geoProvidersV2Params.locationUid;
        }
        if ((i11 & 4) != 0) {
            composerLatLng = geoProvidersV2Params.point;
        }
        if ((i11 & 8) != 0) {
            str3 = geoProvidersV2Params.lang;
        }
        return geoProvidersV2Params.copy(str, str2, composerLatLng, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getClientName() {
        return this.clientName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLocationUid() {
        return this.locationUid;
    }

    /* renamed from: component3, reason: from getter */
    public final ComposerLatLng getPoint() {
        return this.point;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final GeoProvidersV2Params copy(@NotNull String clientName, String locationUid, ComposerLatLng point, String lang) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        return new GeoProvidersV2Params(clientName, locationUid, point, lang);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoProvidersV2Params)) {
            return false;
        }
        GeoProvidersV2Params geoProvidersV2Params = (GeoProvidersV2Params) other;
        return Intrinsics.d(this.clientName, geoProvidersV2Params.clientName) && Intrinsics.d(this.locationUid, geoProvidersV2Params.locationUid) && Intrinsics.d(this.point, geoProvidersV2Params.point) && Intrinsics.d(this.lang, geoProvidersV2Params.lang);
    }

    @NotNull
    public final String getClientName() {
        return this.clientName;
    }

    public final String getLang() {
        return this.lang;
    }

    public final String getLocationUid() {
        return this.locationUid;
    }

    public final ComposerLatLng getPoint() {
        return this.point;
    }

    public int hashCode() {
        int hashCode = this.clientName.hashCode() * 31;
        String str = this.locationUid;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ComposerLatLng composerLatLng = this.point;
        int hashCode3 = (hashCode2 + (composerLatLng == null ? 0 : composerLatLng.hashCode())) * 31;
        String str2 = this.lang;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.clientName;
        String str2 = this.locationUid;
        ComposerLatLng composerLatLng = this.point;
        String str3 = this.lang;
        StringBuilder d11 = C3660k.d("GeoProvidersV2Params(clientName=", str, ", locationUid=", str2, ", point=");
        d11.append(composerLatLng);
        d11.append(", lang=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }
}
