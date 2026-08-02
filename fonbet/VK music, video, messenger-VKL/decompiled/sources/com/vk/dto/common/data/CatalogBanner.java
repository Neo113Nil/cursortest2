package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.core.util.Density;
import com.vk.log.L;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.g1a;
import xsna.ho8;
import xsna.iah0;
import xsna.shy;
import xsna.urd0;

/* compiled from: CatalogBanner.kt */
/* loaded from: classes18.dex */
public final class CatalogBanner implements Serializer.StreamParcelable {
    public static final Serializer.c<CatalogBanner> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<CatalogBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final CatalogBanner a(Serializer serializer) {
            return new CatalogBanner(serializer.u(), serializer.u(), serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CatalogBanner[i];
        }
    }

    public CatalogBanner(int i, int i2, int i3, String str, String str2) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
    }

    public static final CatalogBanner a(JSONObject jSONObject) {
        String D = f370.D(jSONObject, "background_color");
        int r = D != null ? f370.r("#".concat(D)) : 0;
        int r2 = f370.r("#" + jSONObject.getString("title_color"));
        int r3 = f370.r("#" + jSONObject.getString("description_color"));
        String optString = jSONObject.optString("description");
        JSONObject optJSONObject = jSONObject.optJSONObject("images");
        String str = null;
        if (optJSONObject != null) {
            try {
                Density.Companion.getClass();
                float f = iah0.f().density;
                Density density = Density.XXXHDPI;
                if (f < density.h()) {
                    density = Density.XXHDPI;
                    if (f < density.h()) {
                        density = Density.XHDPI;
                        if (f < density.h()) {
                            density = Density.HDPI;
                            if (f < density.h()) {
                                density = Density.MDPI;
                                if (f < density.h()) {
                                    density = Density.LDPI;
                                }
                            }
                        }
                    }
                }
                switch (g1a.$EnumSwitchMapping$0[density.ordinal()]) {
                    case 1:
                    case 2:
                        str = optJSONObject.getString("banner_960");
                        break;
                    case 3:
                    case 4:
                        str = optJSONObject.getString("banner_480");
                        break;
                    case 5:
                    case 6:
                        str = optJSONObject.getString("banner_240");
                        break;
                }
            } catch (JSONException e) {
                L.i(e);
            }
        }
        return new CatalogBanner(r, r2, r3, optString, str);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogBanner)) {
            return false;
        }
        CatalogBanner catalogBanner = (CatalogBanner) obj;
        return this.b == catalogBanner.b && this.c == catalogBanner.c && this.d == catalogBanner.d && epx.f(this.e, catalogBanner.e) && epx.f(this.f, catalogBanner.f);
    }

    public final int hashCode() {
        int a2 = urd0.a(shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31), 31, this.e);
        String str = this.f;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CatalogBanner(backgroundColor=");
        sb.append(this.b);
        sb.append(", titleColor=");
        sb.append(this.c);
        sb.append(", descriptionColor=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", backgroundImageUrl=");
        return ho8.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
