package com.vk.dto.market;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.dz5;
import xsna.epx;
import xsna.f370;
import xsna.j5g;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;

/* compiled from: GoodVariants.kt */
/* loaded from: classes18.dex */
public final class GoodVariantItem implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<GoodVariantItem> CREATOR;
    public static final b f;
    public final int b;
    public final int c;
    public final boolean d;
    public final List<Integer> e;

    /* compiled from: GoodVariants.kt */
    public static final class a {
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<GoodVariantItem> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        @Override // xsna.aay
        public final GoodVariantItem a(JSONObject jSONObject) {
            this.a.getClass();
            return new GoodVariantItem(jSONObject.getInt("item_id"), jSONObject.getInt("availability"), f370.p(jSONObject, "is_main", false), j5g.O0(dz5.E(jSONObject.getJSONArray("variant_ids"))));
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<GoodVariantItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GoodVariantItem a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            boolean m = serializer.m();
            List d = serializer.d();
            if (d == null) {
                d = EmptyList.b;
            }
            return new GoodVariantItem(u, u2, m, d);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GoodVariantItem[i];
        }
    }

    static {
        a aVar = new a();
        CREATOR = new c();
        f = new b(aVar);
    }

    public GoodVariantItem(int i, int i2, boolean z, List<Integer> list) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.U(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("item_id", this.b);
        jSONObject.put("availability", this.c);
        jSONObject.put("is_main", this.d);
        jSONObject.put("variant_ids", this.e);
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoodVariantItem)) {
            return false;
        }
        GoodVariantItem goodVariantItem = (GoodVariantItem) obj;
        return this.b == goodVariantItem.b && this.c == goodVariantItem.c && this.d == goodVariantItem.d && epx.f(this.e, goodVariantItem.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoodVariantItem(itemId=");
        sb.append(this.b);
        sb.append(", availability=");
        sb.append(this.c);
        sb.append(", isMain=");
        sb.append(this.d);
        sb.append(", variantIds=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
