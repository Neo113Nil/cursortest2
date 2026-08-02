package com.vk.dto.common.clips;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.t9e;
import xsna.zjh0;

/* compiled from: ClipsGeoLocationAttachment.kt */
/* loaded from: classes18.dex */
public final class ClipsGeoLocationAttachment extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<ClipsGeoLocationAttachment> CREATOR = new b();
    public static final a l = new a();
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    public final double f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ClipsGeoLocationAttachment> {
        @Override // xsna.aay
        public final ClipsGeoLocationAttachment a(JSONObject jSONObject) {
            return new ClipsGeoLocationAttachment(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ClipsGeoLocationAttachment> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClipsGeoLocationAttachment a(Serializer serializer) {
            return new ClipsGeoLocationAttachment(serializer.u(), serializer.u(), serializer.u(), serializer.r(), serializer.r(), serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClipsGeoLocationAttachment[i];
        }
    }

    public ClipsGeoLocationAttachment(int i, int i2, int i3, double d, double d2, String str, String str2, String str3, String str4, String str5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = d;
        this.f = d2;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.O(this.e);
        serializer.O(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.j0(this.k);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new t9e(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsGeoLocationAttachment)) {
            return false;
        }
        ClipsGeoLocationAttachment clipsGeoLocationAttachment = (ClipsGeoLocationAttachment) obj;
        return this.b == clipsGeoLocationAttachment.b && this.c == clipsGeoLocationAttachment.c && this.d == clipsGeoLocationAttachment.d && Double.compare(this.e, clipsGeoLocationAttachment.e) == 0 && Double.compare(this.f, clipsGeoLocationAttachment.f) == 0 && epx.f(this.g, clipsGeoLocationAttachment.g) && epx.f(this.h, clipsGeoLocationAttachment.h) && epx.f(this.i, clipsGeoLocationAttachment.i) && epx.f(this.j, clipsGeoLocationAttachment.j) && epx.f(this.k, clipsGeoLocationAttachment.k);
    }

    public final int hashCode() {
        int b2 = zjh0.b(this.f, zjh0.b(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31);
        String str = this.g;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsGeoLocationAttachment(id=");
        sb.append(this.b);
        sb.append(", categoryId=");
        sb.append(this.c);
        sb.append(", ownerId=");
        sb.append(this.d);
        sb.append(", latitude=");
        sb.append(this.e);
        sb.append(", longitude=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", photo=");
        sb.append(this.h);
        sb.append(", address=");
        sb.append(this.i);
        sb.append(", city=");
        sb.append(this.j);
        sb.append(", country=");
        return ho8.a(sb, this.k, ')');
    }

    public ClipsGeoLocationAttachment(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optInt("category_id"), jSONObject.optInt("ownerId"), jSONObject.optDouble("latitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), jSONObject.optDouble("longitude", ConnectivityTracker.DEFAULT_UPLINK_BITRATE), jSONObject.optString("title"), jSONObject.optString("photo"), jSONObject.optString(RTCStatsConstants.KEY_ADDRESS), jSONObject.optString("city"), jSONObject.optString("country"));
    }
}
