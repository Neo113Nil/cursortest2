package com.vk.dto.common;

import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.f370;
import xsna.kvf;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: TimelineThumbs.kt */
/* loaded from: classes18.dex */
public final class TimelineThumbs extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<TimelineThumbs> CREATOR = new c();
    public static final b j = new b();
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final List<String> i;

    /* compiled from: TimelineThumbs.kt */
    public static final class a {
        public static b a() {
            return TimelineThumbs.j;
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<TimelineThumbs> {
        @Override // xsna.aay
        public final TimelineThumbs a(JSONObject jSONObject) {
            return new TimelineThumbs(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<TimelineThumbs> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TimelineThumbs a(Serializer serializer) {
            return new TimelineThumbs(serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.m(), com.vk.core.serialize.a.a(serializer));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TimelineThumbs[i];
        }
    }

    public TimelineThumbs() {
        this(0, 0, 0, 0, 0, 0, false, null, 255, null);
    }

    public final int Ab() {
        return this.d;
    }

    public final int Bb() {
        return this.f;
    }

    public final int Cb() {
        return this.c;
    }

    public final int Db() {
        return this.b;
    }

    public final int Eb() {
        return this.g;
    }

    public final List<String> Fb() {
        return this.i;
    }

    public final boolean Gb() {
        return this.h;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.l0(this.i);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("frame_width", Integer.valueOf(this.b));
        jSONObject.putOpt("frame_height", Integer.valueOf(this.c));
        jSONObject.putOpt("count_per_row", Integer.valueOf(this.d));
        jSONObject.putOpt("count_per_image", Integer.valueOf(this.e));
        jSONObject.putOpt("count_total", Integer.valueOf(this.f));
        jSONObject.putOpt("frequency", Integer.valueOf(this.g));
        jSONObject.putOpt("is_uv", Boolean.valueOf(this.h));
        jSONObject.putOpt("links", kvf.a(this.i));
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineThumbs)) {
            return false;
        }
        TimelineThumbs timelineThumbs = (TimelineThumbs) obj;
        return this.b == timelineThumbs.b && this.c == timelineThumbs.c && this.d == timelineThumbs.d && this.e == timelineThumbs.e && this.f == timelineThumbs.f && this.g == timelineThumbs.g && this.h == timelineThumbs.h && epx.f(this.i, timelineThumbs.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + qoy.b(shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineThumbs(frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        sb.append(this.c);
        sb.append(", countPerRow=");
        sb.append(this.d);
        sb.append(", countPerImage=");
        sb.append(this.e);
        sb.append(", countTotal=");
        sb.append(this.f);
        sb.append(", frequency=");
        sb.append(this.g);
        sb.append(", isUnitedVideo=");
        sb.append(this.h);
        sb.append(", links=");
        return ms9.a(')', sb, this.i);
    }

    public final int zb() {
        return this.e;
    }

    public TimelineThumbs(int i, int i2, int i3, int i4, int i5, int i6, boolean z, List<String> list) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = z;
        this.i = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TimelineThumbs(JSONObject jSONObject) {
        this(r3, r4, r5, r6, r7, r8, r9, r12);
        List list;
        int optInt = jSONObject.optInt("frame_width", 0);
        int optInt2 = jSONObject.optInt("frame_height", 0);
        int optInt3 = jSONObject.optInt("count_per_row", 0);
        int optInt4 = jSONObject.optInt("count_per_image", 0);
        int optInt5 = jSONObject.optInt("count_total", 0);
        int optInt6 = jSONObject.optInt("frequency", 0);
        boolean optBoolean = jSONObject.optBoolean("is_uv", false);
        JSONArray optJSONArray = jSONObject.optJSONArray("links");
        if (optJSONArray != null) {
            list = f370.O(optJSONArray);
        } else {
            list = EmptyList.b;
        }
    }

    public TimelineThumbs(int i, int i2, int i3, int i4, int i5, int i6, boolean z, List list, int i7, zcl zclVar) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6, (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? EmptyList.b : list);
    }
}
