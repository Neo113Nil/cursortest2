package com.vk.dto.market;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.market.Variant;
import com.vk.dto.market.VariantGroupType;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.epx;
import xsna.fw3;
import xsna.kvf;
import xsna.s3q0;

/* compiled from: GoodVariants.kt */
/* loaded from: classes18.dex */
public final class VariantGroup implements Serializer.StreamParcelable, bxx {
    public static final Serializer.c<VariantGroup> CREATOR = new c();
    public final String b;
    public final List<Variant> c;
    public final VariantGroupType d;

    /* compiled from: GoodVariants.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public static VariantGroup a(JSONObject jSONObject) {
            ?? r5;
            String string = jSONObject.getString("name");
            Variant.a aVar = Variant.i;
            JSONArray optJSONArray = jSONObject.optJSONArray("variants");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                r5 = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        try {
                            r5.add(aVar.a(optJSONObject));
                        } catch (Exception e) {
                            L.i(e);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            } else {
                r5 = 0;
            }
            if (r5 == 0) {
                r5 = EmptyList.b;
            }
            VariantGroupType.a aVar2 = VariantGroupType.Companion;
            String optString = jSONObject.optString("type");
            aVar2.getClass();
            return new VariantGroup(string, r5, VariantGroupType.a.a(optString));
        }
    }

    /* compiled from: JsonParser.kt */
    public static final class b extends aay<VariantGroup> {
        @Override // xsna.aay
        public final VariantGroup a(JSONObject jSONObject) {
            return a.a(jSONObject);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<VariantGroup> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VariantGroup a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            List j = serializer.j(Variant.CREATOR);
            if (j == null) {
                j = EmptyList.b;
            }
            VariantGroupType.a aVar = VariantGroupType.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            return new VariantGroup(H, j, VariantGroupType.a.a(H2));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VariantGroup[i];
        }
    }

    static {
        new b();
    }

    public VariantGroup(String str, List<Variant> list, VariantGroupType variantGroupType) {
        this.b = str;
        this.c = list;
        this.d = variantGroupType;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.o0(this.c);
        serializer.j0(this.d.getId());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", this.b);
        jSONObject.put("variants", kvf.a(this.c));
        jSONObject.put("type", this.d.getId());
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantGroup)) {
            return false;
        }
        VariantGroup variantGroup = (VariantGroup) obj;
        return epx.f(this.b, variantGroup.b) && epx.f(this.c, variantGroup.c) && this.d == variantGroup.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "VariantGroup(name=" + this.b + ", variants=" + this.c + ", type=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
