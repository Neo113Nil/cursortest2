package com.vk.dto.market;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.er;
import xsna.f370;
import xsna.qoy;
import xsna.urd0;

/* compiled from: GoodVariants.kt */
/* loaded from: classes18.dex */
public final class Variant implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<Variant> CREATOR = new b();
    public static final a i = new a();
    public final int b;
    public final String c;
    public final Long d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final Image h;

    /* compiled from: JsonParser.kt */
    public static final class a extends aay<Variant> {
        @Override // xsna.aay
        public final Variant a(JSONObject jSONObject) {
            return new Variant(jSONObject.getInt("variant_id"), jSONObject.getString("name"), f370.z(jSONObject, "item_id"), jSONObject.optBoolean("is_disabled", false), jSONObject.optBoolean("is_selected", false), jSONObject.optString("value"), new Image(jSONObject.optJSONArray("image"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<Variant> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Variant a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H != null) {
                return new Variant(u, H, serializer.x(), serializer.m(), serializer.m(), serializer.H(), (Image) serializer.G(Image.class.getClassLoader()));
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Variant[i];
        }
    }

    public Variant(int i2, String str, Long l, boolean z, boolean z2, String str2, Image image) {
        this.b = i2;
        this.c = str;
        this.d = l;
        this.e = z;
        this.f = z2;
        this.g = str2;
        this.h = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.b0(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.j0(this.g);
        serializer.i0(this.h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("variant_id", this.b);
        jSONObject.put("name", this.c);
        jSONObject.putOpt("item_id", this.d);
        jSONObject.put("is_disabled", this.e);
        jSONObject.put("is_selected", this.f);
        jSONObject.put("value", this.g);
        Image image = this.h;
        jSONObject.put("image", image != null ? image.Gb() : null);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Variant)) {
            return false;
        }
        Variant variant = (Variant) obj;
        return this.b == variant.b && epx.f(this.c, variant.c) && epx.f(this.d, variant.d) && this.e == variant.e && this.f == variant.f && epx.f(this.g, variant.g) && epx.f(this.h, variant.h);
    }

    public final int hashCode() {
        int a2 = urd0.a(Integer.hashCode(this.b) * 31, 31, this.c);
        Long l = this.d;
        int b2 = qoy.b(qoy.b((a2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.h;
        return hashCode + (image != null ? image.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Variant(variantId=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", itemId=");
        sb.append(this.d);
        sb.append(", isDisabled=");
        sb.append(this.e);
        sb.append(", isSelected=");
        sb.append(this.f);
        sb.append(", value=");
        sb.append(this.g);
        sb.append(", image=");
        return er.d(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
