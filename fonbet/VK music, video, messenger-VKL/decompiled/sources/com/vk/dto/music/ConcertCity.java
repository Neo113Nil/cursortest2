package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.ho8;

/* compiled from: ConcertCity.kt */
/* loaded from: classes18.dex */
public final class ConcertCity extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ConcertCity> CREATOR = new b();
    public static final ConcertCity d;
    public final int b;
    public final String c;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<ConcertCity> {
        @Override // xsna.aay
        public final ConcertCity a(JSONObject jSONObject) {
            return new ConcertCity(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ConcertCity> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ConcertCity a(Serializer serializer) {
            return new ConcertCity(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConcertCity[i];
        }
    }

    static {
        new a();
        d = new ConcertCity(0, "");
    }

    public ConcertCity(int i, String str) {
        this.b = i;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConcertCity)) {
            return false;
        }
        ConcertCity concertCity = (ConcertCity) obj;
        return this.b == concertCity.b && epx.f(this.c, concertCity.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("City(id=");
        sb.append(this.b);
        sb.append(", title=");
        return ho8.a(sb, this.c, ')');
    }

    public ConcertCity(JSONObject jSONObject) {
        this(jSONObject.optInt("id"), jSONObject.optString("title"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConcertCity(Serializer serializer) {
        this(r0, r2 == null ? "" : r2);
        int u = serializer.u();
        String H = serializer.H();
    }
}
