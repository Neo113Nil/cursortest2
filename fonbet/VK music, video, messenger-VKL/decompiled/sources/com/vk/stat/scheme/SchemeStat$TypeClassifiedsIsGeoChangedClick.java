package com.vk.stat.scheme;

import xsna.epx;
import xsna.pmi0;
import xsna.so;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeClassifiedsIsGeoChangedClick {

    @pmi0("latitude")
    private final Float latitude;

    @pmi0("longitude")
    private final Float longitude;

    @pmi0("search_id")
    private final String searchId;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("user_geo_id")
    private final String userGeoId;

    @pmi0("user_geo_name")
    private final String userGeoName;

    @pmi0("user_nearest_city_id")
    private final String userNearestCityId;

    public SchemeStat$TypeClassifiedsIsGeoChangedClick() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeClassifiedsIsGeoChangedClick)) {
            return false;
        }
        SchemeStat$TypeClassifiedsIsGeoChangedClick schemeStat$TypeClassifiedsIsGeoChangedClick = (SchemeStat$TypeClassifiedsIsGeoChangedClick) obj;
        return epx.f(this.userGeoName, schemeStat$TypeClassifiedsIsGeoChangedClick.userGeoName) && epx.f(this.userGeoId, schemeStat$TypeClassifiedsIsGeoChangedClick.userGeoId) && epx.f(this.userNearestCityId, schemeStat$TypeClassifiedsIsGeoChangedClick.userNearestCityId) && epx.f(this.searchId, schemeStat$TypeClassifiedsIsGeoChangedClick.searchId) && epx.f(this.trackCode, schemeStat$TypeClassifiedsIsGeoChangedClick.trackCode) && epx.f(this.latitude, schemeStat$TypeClassifiedsIsGeoChangedClick.latitude) && epx.f(this.longitude, schemeStat$TypeClassifiedsIsGeoChangedClick.longitude);
    }

    public final int hashCode() {
        String str = this.userGeoName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userGeoId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userNearestCityId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.searchId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.latitude;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.longitude;
        return hashCode6 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeClassifiedsIsGeoChangedClick(userGeoName=");
        sb.append(this.userGeoName);
        sb.append(", userGeoId=");
        sb.append(this.userGeoId);
        sb.append(", userNearestCityId=");
        sb.append(this.userNearestCityId);
        sb.append(", searchId=");
        sb.append(this.searchId);
        sb.append(", trackCode=");
        sb.append(this.trackCode);
        sb.append(", latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        return so.b(sb, this.longitude, ')');
    }

    public SchemeStat$TypeClassifiedsIsGeoChangedClick(String str, String str2, String str3, String str4, String str5, Float f, Float f2) {
        this.userGeoName = str;
        this.userGeoId = str2;
        this.userNearestCityId = str3;
        this.searchId = str4;
        this.trackCode = str5;
        this.latitude = f;
        this.longitude = f2;
    }

    public /* synthetic */ SchemeStat$TypeClassifiedsIsGeoChangedClick(String str, String str2, String str3, String str4, String str5, Float f, Float f2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : f2);
    }
}
