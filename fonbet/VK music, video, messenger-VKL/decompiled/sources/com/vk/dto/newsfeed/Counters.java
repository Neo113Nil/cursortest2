package com.vk.dto.newsfeed;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: Counters.kt */
/* loaded from: classes18.dex */
public final class Counters extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Counters> CREATOR = new b();
    public int b;
    public int c;
    public int d;
    public int e;
    public final int f;
    public final int g;

    /* compiled from: Counters.kt */
    public static final class a {
        public static Counters a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject("reposts");
            int optInt = optJSONObject != null ? optJSONObject.optInt("count") : 0;
            int optInt2 = optJSONObject != null ? optJSONObject.optInt("wall_count") : 0;
            int optInt3 = optJSONObject != null ? optJSONObject.optInt("mail_count") : 0;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("likes");
            int optInt4 = optJSONObject2 != null ? optJSONObject2.optInt("count") : 0;
            JSONObject optJSONObject3 = jSONObject.optJSONObject("views");
            int optInt5 = jSONObject.optInt("views", optJSONObject3 != null ? optJSONObject3.optInt("count") : 0);
            JSONObject optJSONObject4 = jSONObject.optJSONObject("comments");
            return new Counters(optInt4, optInt, optInt5, optJSONObject4 != null ? optJSONObject4.optInt("count") : 0, optInt2, optInt3);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Counters> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Counters a(Serializer serializer) {
            return new Counters(serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Counters[i];
        }
    }

    public Counters() {
        this(0, 0, 0, 0, 0, 0, 63, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
        serializer.S(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Counters)) {
            return false;
        }
        Counters counters = (Counters) obj;
        return this.b == counters.b && this.c == counters.c && this.d == counters.d && this.e == counters.e && this.f == counters.f && this.g == counters.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Counters(likes=");
        sb.append(this.b);
        sb.append(", reposts=");
        sb.append(this.c);
        sb.append(", views=");
        sb.append(this.d);
        sb.append(", comments=");
        sb.append(this.e);
        sb.append(", wallReposts=");
        sb.append(this.f);
        sb.append(", msgReposts=");
        return vu5.b(sb, this.g, ')');
    }

    public final int zb() {
        return this.g;
    }

    public /* synthetic */ Counters(int i, int i2, int i3, int i4, int i5, int i6, int i7, zcl zclVar) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? 0 : i5, (i7 & 32) != 0 ? 0 : i6);
    }

    public Counters(int i, int i2, int i3, int i4, int i5, int i6) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
    }
}
