package com.vk.catalog2.common.dto.api.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.epx;
import xsna.fq;
import xsna.urd0;
import xsna.vu5;

/* compiled from: MusicOwner.kt */
/* loaded from: classes16.dex */
public final class MusicOwner extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<MusicOwner> CREATOR = new b();
    public static final a h = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Image f;
    public final long g;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MusicOwner> {
        @Override // xsna.aay
        public final MusicOwner a(JSONObject jSONObject) {
            return new MusicOwner(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MusicOwner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicOwner a(Serializer serializer) {
            return new MusicOwner(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicOwner[i];
        }
    }

    public MusicOwner(String str, String str2, String str3, String str4, Image image, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = image;
        this.g = j;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.i0(this.f);
        serializer.Y(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicOwner)) {
            return false;
        }
        MusicOwner musicOwner = (MusicOwner) obj;
        return epx.f(this.b, musicOwner.b) && epx.f(this.c, musicOwner.c) && epx.f(this.d, musicOwner.d) && epx.f(this.e, musicOwner.e) && epx.f(this.f, musicOwner.f) && this.g == musicOwner.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + fq.b(this.f, urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicOwner(id=");
        sb.append(this.b);
        sb.append(": ");
        sb.append(this.c);
        sb.append(" - ");
        sb.append(this.d);
        sb.append(" - ");
        sb.append(this.e);
        sb.append(", curatorId=");
        return vu5.a(')', this.g, sb);
    }

    public MusicOwner(JSONObject jSONObject) {
        this(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString("subtitle"), jSONObject.optString("url"), new Image(jSONObject.optJSONArray("image"), null, 2, null), jSONObject.optLong("curator_id"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicOwner(Serializer serializer) {
        this(r3, r4, r5, r0 == null ? "" : r0, (Image) serializer.G(Image.class.getClassLoader()), serializer.w());
        String H = serializer.H();
        String str = H == null ? "" : H;
        String H2 = serializer.H();
        String str2 = H2 == null ? "" : H2;
        String H3 = serializer.H();
        String str3 = H3 == null ? "" : H3;
        String H4 = serializer.H();
    }
}
