package com.vk.dto.geo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aay;
import xsna.t230;
import xsna.zjh0;

/* loaded from: classes18.dex */
public class GeoPlace extends t230 implements Parcelable {
    public static final Parcelable.Creator<GeoPlace> CREATOR = new a();
    public int c;
    public int d;
    public UserId e;
    public int f;
    public double g;
    public double h;
    public String i;
    public String j;
    public String k;
    public int l;
    public int m;

    public class a implements Parcelable.Creator<GeoPlace> {
        @Override // android.os.Parcelable.Creator
        public final GeoPlace createFromParcel(Parcel parcel) {
            GeoPlace geoPlace = new GeoPlace();
            geoPlace.c = 0;
            geoPlace.e = UserId.d;
            geoPlace.i = "";
            geoPlace.j = "";
            geoPlace.k = "";
            geoPlace.c = parcel.readInt();
            geoPlace.i = parcel.readString();
            geoPlace.g = parcel.readDouble();
            geoPlace.h = parcel.readDouble();
            geoPlace.d = parcel.readInt();
            geoPlace.j = parcel.readString();
            geoPlace.e = (UserId) parcel.readParcelable(UserId.class.getClassLoader());
            geoPlace.f = parcel.readInt();
            geoPlace.k = parcel.readString();
            geoPlace.l = parcel.readInt();
            geoPlace.m = parcel.readInt();
            return geoPlace;
        }

        @Override // android.os.Parcelable.Creator
        public final GeoPlace[] newArray(int i) {
            return new GeoPlace[i];
        }
    }

    public class b extends aay<GeoPlace> {
        @Override // xsna.aay
        public final GeoPlace a(@NonNull JSONObject jSONObject) throws JSONException {
            return new GeoPlace(jSONObject);
        }
    }

    static {
        new b();
    }

    public GeoPlace() {
        this.c = 0;
        this.e = UserId.d;
        this.i = "";
        this.j = "";
        this.k = "";
    }

    public final void d(JSONObject jSONObject) throws JSONException {
        this.c = jSONObject.getInt("id");
        this.i = jSONObject.getString("title");
        this.g = jSONObject.getDouble("latitude");
        this.h = jSONObject.getDouble("longitude");
        this.d = jSONObject.optInt("total_checkins");
        this.j = jSONObject.optString("group_photo");
        this.e = new UserId(jSONObject.optLong("group_id"));
        this.k = jSONObject.optString(RTCStatsConstants.KEY_ADDRESS, "");
        this.l = jSONObject.optInt("city");
        this.m = jSONObject.optInt("country");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GeoPlace geoPlace = (GeoPlace) obj;
            if (this.c == geoPlace.c && this.d == geoPlace.d && this.f == geoPlace.f && Double.compare(this.g, geoPlace.g) == 0 && Double.compare(this.h, geoPlace.h) == 0 && this.l == geoPlace.l && this.m == geoPlace.m && Objects.equals(this.e, geoPlace.e) && Objects.equals(this.i, geoPlace.i) && Objects.equals(this.j, geoPlace.j) && Objects.equals(this.k, geoPlace.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.k) + ((Objects.hashCode(this.j) + ((Objects.hashCode(this.i) + zjh0.b(this.h, zjh0.b(this.g, (((Objects.hashCode(this.e) + (((this.c * 31) + this.d) * 31)) * 31) + this.f) * 31, 31), 31)) * 31)) * 31)) * 31) + this.l) * 31) + this.m;
    }

    @NonNull
    public final String toString() {
        String str = this.i;
        if (str != null && str.length() > 0) {
            return this.i;
        }
        String str2 = this.k;
        if (str2 != null && str2.length() > 0) {
            return this.k;
        }
        return this.g + StringUtils.COMMA + this.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeString(this.i);
        parcel.writeDouble(this.g);
        parcel.writeDouble(this.h);
        parcel.writeInt(this.d);
        parcel.writeString(this.j);
        parcel.writeParcelable(this.e, 0);
        parcel.writeInt(this.f);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    public GeoPlace(JSONObject jSONObject) {
        this.c = 0;
        this.e = UserId.d;
        this.i = "";
        this.j = "";
        this.k = "";
        try {
            if (jSONObject.has("place")) {
                d(jSONObject.getJSONObject("place"));
            } else {
                d(jSONObject);
            }
            this.f = jSONObject.optInt("distance");
        } catch (Exception e) {
            L.B("vk", "Error parsing GeoPlace " + jSONObject, e);
        }
    }

    public GeoPlace(int i, String str, double d, double d2, int i2, String str2, UserId userId, String str3, int i3, int i4, int i5) {
        this.c = 0;
        UserId.b bVar = UserId.c;
        this.c = i;
        this.i = str;
        this.g = d;
        this.h = d2;
        this.d = i2;
        this.j = str2;
        this.e = userId;
        this.k = str3;
        this.l = i3;
        this.m = i4;
        this.f = i5;
    }
}
