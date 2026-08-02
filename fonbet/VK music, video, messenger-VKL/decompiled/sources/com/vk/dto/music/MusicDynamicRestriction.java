package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.d370;
import xsna.epx;
import xsna.fq;
import xsna.ho8;
import xsna.nl30;

/* compiled from: MusicDynamicRestriction.kt */
/* loaded from: classes18.dex */
public final class MusicDynamicRestriction extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<MusicDynamicRestriction> CREATOR = new b();
    public static final a i = new a();
    public final String b;
    public final Image c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<MusicDynamicRestriction> {
        @Override // xsna.aay
        public final MusicDynamicRestriction a(JSONObject jSONObject) {
            return new MusicDynamicRestriction(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<MusicDynamicRestriction> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicDynamicRestriction a(Serializer serializer) {
            return new MusicDynamicRestriction(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicDynamicRestriction[i];
        }
    }

    public MusicDynamicRestriction(String str, Image image, String str2, String str3, String str4, String str5, String str6) {
        this.b = str;
        this.c = image;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final String Ab() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
        serializer.j0(this.h);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        return d370.C(new nl30(this, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicDynamicRestriction)) {
            return false;
        }
        MusicDynamicRestriction musicDynamicRestriction = (MusicDynamicRestriction) obj;
        return epx.f(this.b, musicDynamicRestriction.b) && epx.f(this.c, musicDynamicRestriction.c) && epx.f(this.d, musicDynamicRestriction.d) && epx.f(this.e, musicDynamicRestriction.e) && epx.f(this.f, musicDynamicRestriction.f) && epx.f(this.g, musicDynamicRestriction.g) && epx.f(this.h, musicDynamicRestriction.h);
    }

    public final int hashCode() {
        int b2 = fq.b(this.c, this.b.hashCode() * 31, 31);
        String str = this.d;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDynamicRestriction(title=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", content=");
        sb.append(this.d);
        sb.append(", btnTitle=");
        sb.append(this.e);
        sb.append(", btnUrl=");
        sb.append(this.f);
        sb.append(", btnType=");
        sb.append(this.g);
        sb.append(", text=");
        return ho8.a(sb, this.h, ')');
    }

    public final String zb() {
        return this.e;
    }

    public MusicDynamicRestriction(MusicDynamicRestriction musicDynamicRestriction) {
        this(musicDynamicRestriction.b, musicDynamicRestriction.c, musicDynamicRestriction.d, musicDynamicRestriction.e, musicDynamicRestriction.f, musicDynamicRestriction.g, musicDynamicRestriction.h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicDynamicRestriction(Serializer serializer) {
        this(r2, r0 == null ? Image.d : r0, serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.H());
        String H = serializer.H();
        String str = H == null ? "" : H;
        Image image = (Image) serializer.G(Image.class.getClassLoader());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MusicDynamicRestriction(JSONObject jSONObject) {
        this(new MusicDynamicRestriction(r2, r3, r4, r5, r6, r7, r8));
        String str;
        String str2;
        String optString = jSONObject.optString("title");
        String optString2 = jSONObject.optString("text");
        String optString3 = jSONObject.optString("text");
        String str3 = null;
        Image image = jSONObject.has("icons") ? new Image(jSONObject.getJSONArray("icons"), null, 2, null) : Image.d;
        if (jSONObject.has("button")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("button");
            String optString4 = optJSONObject != null ? optJSONObject.optString("title") : null;
            if (optJSONObject == null || !optJSONObject.has("action")) {
                str = null;
                str2 = null;
            } else {
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("action");
                String optString5 = optJSONObject2.optString("url");
                str2 = optJSONObject2.optString("type");
                str = optString5;
            }
            str3 = optString4;
        } else {
            str = null;
            str2 = null;
        }
    }
}
