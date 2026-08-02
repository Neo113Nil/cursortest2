package com.vk.dto.common.im;

import com.vk.core.serialize.Serializer;
import com.vk.log.L;
import defpackage.q0;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.fxj0;
import xsna.m900;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: Image.kt */
/* loaded from: classes18.dex */
public final class Image extends Serializer.StreamParcelableAdapter implements fxj0, Comparable<Image>, bxx {
    public final int b;
    public final int c;
    public final String d;
    public final boolean e;
    public final int f;
    public static final m900<String, Image> g = new m900<>(100);
    public static final Serializer.c<Image> CREATOR = new b();

    /* compiled from: Image.kt */
    public static final class a {
        public static Image a(int i, String str) {
            return new Image(i, i, str, false);
        }

        public static Image b(JSONObject jSONObject) {
            m900<String, Image> m900Var = Image.g;
            return jSONObject != null ? new Image(jSONObject.optInt("width", -1), jSONObject.optInt("height", -1), jSONObject.optString("url", ""), jSONObject.optBoolean("is_base", false)) : new Image(-1, -1, "", false);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Image> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Image a(Serializer serializer) {
            return new Image(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image(int i, int i2, String str, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = z;
        this.f = i * i2;
    }

    public static Image zb(Image image) {
        return new Image(image.b, image.c, image.d, true);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
    }

    @Override // xsna.fxj0
    public final boolean c7() {
        return this.e;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Image image) {
        int i = image.f;
        int i2 = this.f;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.d);
            jSONObject.put("width", this.b);
            jSONObject.put("height", this.c);
            jSONObject.put("is_base", this.e);
            return jSONObject;
        } catch (JSONException e) {
            L.i(e);
            return jSONObject;
        }
    }

    @Override // xsna.fxj0
    public final int e6() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return this.b == image.b && this.c == image.c && epx.f(this.d, image.d) && this.e == image.e;
    }

    @Override // xsna.fxj0
    public final int getHeight() {
        return this.c;
    }

    @Override // xsna.fxj0
    public final String getUrl() {
        return this.d;
    }

    @Override // xsna.fxj0
    public final int getWidth() {
        return this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + urd0.a(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
    }

    @Override // xsna.fxj0
    public final fxj0 kb(int i, int i2, String str) {
        m900<String, Image> m900Var = g;
        Image image = m900Var.get(str);
        if (image != null && image.b == i && image.c == i2) {
            return image;
        }
        Image image2 = new Image(i, i2, str, false);
        m900Var.put(str, image2);
        return image2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Image(width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.d);
        sb.append(", isBase=");
        return q0.a(sb, this.e, ')');
    }

    public Image(String str) {
        this(-1, -1, str, false);
    }

    public Image(Serializer serializer, zcl zclVar) {
        this(serializer.u(), serializer.u(), serializer.H(), serializer.m());
    }
}
