package com.vk.dto.music;

import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.urd0;
import xsna.w9y;

/* compiled from: AudioFollowingsUpdateItem.kt */
/* loaded from: classes18.dex */
public final class AudioFollowingsUpdateItem extends Serializer.StreamParcelableAdapter implements bxx {
    public static final Serializer.c<AudioFollowingsUpdateItem> CREATOR = new b();
    public static final a h = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Thumb g;

    /* compiled from: AudioFollowingsUpdateItem.kt */
    public static final class a extends aay<AudioFollowingsUpdateItem> {
        @Override // xsna.aay
        public final AudioFollowingsUpdateItem a(JSONObject jSONObject) {
            return new AudioFollowingsUpdateItem(jSONObject.optString("id"), jSONObject.optString("title"), jSONObject.optString("subtitle"), jSONObject.optString("description"), jSONObject.optString("url"), jSONObject.has("cover") ? (Thumb) Thumb.f.a(jSONObject.optJSONObject("cover")) : null);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<AudioFollowingsUpdateItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AudioFollowingsUpdateItem a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            if (H4 == null) {
                H4 = "";
            }
            String H5 = serializer.H();
            return new AudioFollowingsUpdateItem(H, H2, H3, H4, H5 != null ? H5 : "", (Thumb) serializer.G(Thumb.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AudioFollowingsUpdateItem[i];
        }
    }

    public AudioFollowingsUpdateItem(String str, String str2, String str3, String str4, String str5, Thumb thumb) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = thumb;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.i0(this.g);
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.e(this.b, "id");
        w9yVar.e(this.c, "title");
        w9yVar.e(this.d, "subtitle");
        w9yVar.e(this.e, "description");
        w9yVar.e(this.f, "url");
        w9yVar.g("cover", this.g);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AudioFollowingsUpdateItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AudioFollowingsUpdateItem audioFollowingsUpdateItem = (AudioFollowingsUpdateItem) obj;
        return epx.f(this.b, audioFollowingsUpdateItem.b) && epx.f(this.c, audioFollowingsUpdateItem.c) && epx.f(this.d, audioFollowingsUpdateItem.d) && epx.f(this.e, audioFollowingsUpdateItem.e) && epx.f(this.f, audioFollowingsUpdateItem.f) && epx.f(this.g, audioFollowingsUpdateItem.g);
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(urd0.a(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        Thumb thumb = this.g;
        return a2 + (thumb != null ? thumb.hashCode() : 0);
    }

    public final String toString() {
        return "AudioFollowingsUpdateItem(id=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", description=" + this.e + ", url=" + this.f + ", cover=" + this.g + ')';
    }
}
