package com.vk.dto.geo;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.aay;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;
import xsna.zjh0;

/* compiled from: GeoLocation.kt */
/* loaded from: classes18.dex */
public final class GeoLocation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GeoLocation> CREATOR = new c();
    public static final b o = new b();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final double g;
    public final double h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;

    /* compiled from: GeoLocation.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<GeoLocation> {
        @Override // xsna.aay
        public final GeoLocation a(JSONObject jSONObject) {
            Serializer.c<GeoLocation> cVar = GeoLocation.CREATOR;
            if (jSONObject == null) {
                return null;
            }
            return jSONObject.has("place") ? com.vk.dto.geo.a.a(jSONObject, jSONObject.getJSONObject("place")) : com.vk.dto.geo.a.a(jSONObject, jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<GeoLocation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GeoLocation a(Serializer serializer) {
            return new GeoLocation(serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.r(), serializer.r(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GeoLocation[i];
        }
    }

    public /* synthetic */ GeoLocation(int i, int i2, int i3, int i4, int i5, double d, double d2, String str, String str2, String str3, String str4, String str5, String str6, int i6, zcl zclVar) {
        this(i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) == 0 ? i5 : 0, (i6 & 32) != 0 ? 0.0d : d, (i6 & 64) == 0 ? d2 : ConnectivityTracker.DEFAULT_UPLINK_BITRATE, (i6 & 128) != 0 ? null : str, (i6 & 256) != 0 ? null : str2, (i6 & 512) != 0 ? null : str3, (i6 & 1024) != 0 ? null : str4, (i6 & 2048) != 0 ? null : str5, (i6 & 4096) != 0 ? null : str6);
    }

    public static GeoLocation zb(GeoLocation geoLocation, int i, double d, double d2, String str, String str2, int i2) {
        int i3 = (i2 & 1) != 0 ? geoLocation.b : i;
        int i4 = geoLocation.c;
        int i5 = geoLocation.d;
        int i6 = geoLocation.e;
        int i7 = geoLocation.f;
        double d3 = (i2 & 32) != 0 ? geoLocation.g : d;
        double d4 = (i2 & 64) != 0 ? geoLocation.h : d2;
        String str3 = (i2 & 128) != 0 ? geoLocation.i : str;
        String str4 = geoLocation.j;
        String str5 = (i2 & 512) != 0 ? geoLocation.k : str2;
        String str6 = geoLocation.l;
        String str7 = geoLocation.m;
        String str8 = geoLocation.n;
        geoLocation.getClass();
        return new GeoLocation(i3, i4, i5, i6, i7, d3, d4, str3, str4, str5, str6, str7, str8);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.O(this.g);
        serializer.O(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
        serializer.j0(this.l);
        serializer.j0(this.m);
        serializer.j0(this.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoLocation)) {
            return false;
        }
        GeoLocation geoLocation = (GeoLocation) obj;
        return this.b == geoLocation.b && this.c == geoLocation.c && this.d == geoLocation.d && this.e == geoLocation.e && this.f == geoLocation.f && Double.compare(this.g, geoLocation.g) == 0 && Double.compare(this.h, geoLocation.h) == 0 && epx.f(this.i, geoLocation.i) && epx.f(this.j, geoLocation.j) && epx.f(this.k, geoLocation.k) && epx.f(this.l, geoLocation.l) && epx.f(this.m, geoLocation.m) && epx.f(this.n, geoLocation.n);
    }

    public final int hashCode() {
        int b2 = zjh0.b(this.h, zjh0.b(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31);
        String str = this.i;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.n;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoLocation(id=");
        sb.append(this.b);
        sb.append(", checkins=");
        sb.append(this.c);
        sb.append(", categoryId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        sb.append(this.e);
        sb.append(", distance=");
        sb.append(this.f);
        sb.append(", latitude=");
        sb.append(this.g);
        sb.append(", longitude=");
        sb.append(this.h);
        sb.append(", title=");
        sb.append(this.i);
        sb.append(", photo=");
        sb.append(this.j);
        sb.append(", address=");
        sb.append(this.k);
        sb.append(", city=");
        sb.append(this.l);
        sb.append(", country=");
        sb.append(this.m);
        sb.append(", categoryTitle=");
        return ho8.a(sb, this.n, ')');
    }

    public GeoLocation(int i, int i2, int i3, int i4, int i5, double d, double d2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = d;
        this.h = d2;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = str6;
    }
}
