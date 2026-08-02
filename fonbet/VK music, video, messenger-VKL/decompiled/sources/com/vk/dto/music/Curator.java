package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.a0a;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.s3q0;
import xsna.tdj;
import xsna.urd0;
import xsna.w9y;
import xsna.zcl;

/* compiled from: Curator.kt */
/* loaded from: classes18.dex */
public final class Curator extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<Curator> CREATOR = new c();
    public static final b j = new b();
    public final String b;
    public final String c;
    public final String d;
    public final Image e;
    public final String f;
    public boolean g;
    public final boolean h;
    public final String i;

    /* compiled from: Curator.kt */
    public static final class a {
        public static String a(String str) {
            return str.length() == 0 ? "" : tdj.a(new StringBuilder("https://"), a0a.d, "/music/curator/", str);
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<Curator> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.aay
        public final Curator a(JSONObject jSONObject) {
            String optString = jSONObject.optString("id");
            String optString2 = jSONObject.optString("name");
            String optString3 = jSONObject.optString("description");
            Image image = new Image(jSONObject.optJSONArray("photo"), null, 2, 0 == true ? 1 : 0);
            boolean optBoolean = jSONObject.optBoolean("is_followed");
            boolean optBoolean2 = jSONObject.optBoolean("can_follow");
            Serializer.c<Curator> cVar = Curator.CREATOR;
            return new Curator(optString, optString2, optString3, image, jSONObject.optString("url", a.a(optString)), optBoolean, optBoolean2, jSONObject.optString("track_code", ""));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Curator> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Curator a(Serializer serializer) {
            String H = serializer.H();
            String str = H == null ? "" : H;
            String H2 = serializer.H();
            String H3 = serializer.H();
            Image image = (Image) serializer.G(Image.class.getClassLoader());
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            String H4 = serializer.H();
            if (H4 == null) {
                Serializer.c<Curator> cVar = Curator.CREATOR;
                H4 = a.a(str);
            }
            String str2 = H4;
            String H5 = serializer.H();
            return new Curator(str, H2, H3, image, str2, m, m2, H5 == null ? "" : H5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Curator[i];
        }
    }

    public /* synthetic */ Curator(String str, String str2, String str3, Image image, String str4, boolean z, boolean z2, String str5, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : image, (i & 16) != 0 ? a.a(str) : str4, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? "" : str5);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.L(this.h ? (byte) 1 : (byte) 0);
        serializer.j0(this.f);
        serializer.j0(this.i);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.d, "description");
        Image image = this.e;
        w9yVar.e(image != null ? image.Gb() : null, "photo");
        w9yVar.e(this.c, "name");
        w9yVar.e(this.i, "track_code");
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Curator)) {
            return false;
        }
        Curator curator = (Curator) obj;
        return epx.f(this.b, curator.b) && epx.f(this.c, curator.c) && epx.f(this.d, curator.d) && epx.f(this.e, curator.e) && epx.f(this.f, curator.f) && this.g == curator.g && this.h == curator.h && epx.f(this.i, curator.i);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.e;
        return this.i.hashCode() + qoy.b(qoy.b(urd0.a((hashCode3 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Curator(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", photo=");
        sb.append(this.e);
        sb.append(", url=");
        sb.append(this.f);
        sb.append(", isFollowed=");
        sb.append(this.g);
        sb.append(", canFollow=");
        sb.append(this.h);
        sb.append(", trackCode=");
        return ho8.a(sb, this.i, ')');
    }

    public Curator(String str, String str2, String str3, Image image, String str4, boolean z, boolean z2, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = image;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = str5;
    }
}
