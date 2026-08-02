package com.vk.dto.market;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.er;
import xsna.urd0;

/* compiled from: MarketBanner.kt */
/* loaded from: classes18.dex */
public final class MarketBanner implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<MarketBanner> CREATOR;
    public static final b e;
    public final String b;
    public final String c;
    public final Image d;

    /* compiled from: MarketBanner.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<MarketBanner> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.aay
        public final MarketBanner a(JSONObject jSONObject) {
            this.a.getClass();
            return new MarketBanner(jSONObject.getString("title"), jSONObject.optString("subtitle"), new Image(jSONObject.getJSONArray("images"), null, 2, null));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<MarketBanner> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MarketBanner a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String H2 = serializer.H();
            if (H2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Serializer.StreamParcelable G = serializer.G(Image.class.getClassLoader());
            if (G != null) {
                return new MarketBanner(H, H2, (Image) G);
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MarketBanner[i];
        }
    }

    static {
        a aVar = new a();
        CREATOR = new c();
        e = new b(aVar);
    }

    public MarketBanner(String str, String str2, Image image) {
        this.b = str;
        this.c = str2;
        this.d = image;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.b);
        jSONObject.put("variants", this.c);
        jSONObject.put("type", this.d.e5());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketBanner)) {
            return false;
        }
        MarketBanner marketBanner = (MarketBanner) obj;
        return epx.f(this.b, marketBanner.b) && epx.f(this.c, marketBanner.c) && epx.f(this.d, marketBanner.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBanner(title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", image=");
        return er.d(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
