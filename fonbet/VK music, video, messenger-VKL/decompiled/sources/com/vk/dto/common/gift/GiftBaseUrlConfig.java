package com.vk.dto.common.gift;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.f370;
import xsna.fw3;
import xsna.ms9;
import xsna.wq;

/* compiled from: GiftBaseUrlConfig.kt */
/* loaded from: classes18.dex */
public final class GiftBaseUrlConfig implements Serializer.StreamParcelable {
    public static final Serializer.c<GiftBaseUrlConfig> CREATOR = new b();
    public final String b;
    public final Integer c;
    public final List<String> d;
    public final List<String> e;

    /* compiled from: GiftBaseUrlConfig.kt */
    public static final class a {
        public static GiftBaseUrlConfig a(JSONObject jSONObject) {
            List list;
            List list2;
            if (jSONObject == null) {
                return null;
            }
            String string = jSONObject.getString("base_url");
            Integer x = f370.x(jSONObject, "version");
            JSONArray optJSONArray = jSONObject.optJSONArray("additional_layouts");
            if (optJSONArray == null) {
                list = EmptyList.b;
            } else {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i = wq.b(optJSONArray, i, arrayList, i, 1)) {
                }
                list = arrayList;
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("additional_themes");
            if (optJSONArray2 == null) {
                list2 = EmptyList.b;
            } else {
                ArrayList arrayList2 = new ArrayList();
                int length2 = optJSONArray2.length();
                for (int i2 = 0; i2 < length2; i2 = wq.b(optJSONArray2, i2, arrayList2, i2, 1)) {
                }
                list2 = arrayList2;
            }
            return new GiftBaseUrlConfig(string, x, list, list2);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GiftBaseUrlConfig> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GiftBaseUrlConfig a(Serializer serializer) {
            return new GiftBaseUrlConfig(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GiftBaseUrlConfig[i];
        }
    }

    public GiftBaseUrlConfig(String str, Integer num, List<String> list, List<String> list2) {
        this.b = str;
        this.c = num;
        this.d = list;
        this.e = list2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.V(this.c);
        serializer.l0(this.d);
        serializer.l0(this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftBaseUrlConfig)) {
            return false;
        }
        GiftBaseUrlConfig giftBaseUrlConfig = (GiftBaseUrlConfig) obj;
        return epx.f(this.b, giftBaseUrlConfig.b) && epx.f(this.c, giftBaseUrlConfig.c) && epx.f(this.d, giftBaseUrlConfig.d) && epx.f(this.e, giftBaseUrlConfig.e);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return this.e.hashCode() + fw3.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftBaseUrlConfig(baseUrl=");
        sb.append(this.b);
        sb.append(", version=");
        sb.append(this.c);
        sb.append(", additionalLayouts=");
        sb.append(this.d);
        sb.append(", additionalThemes=");
        return ms9.a(')', sb, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GiftBaseUrlConfig(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.v(), com.vk.core.serialize.a.a(serializer), com.vk.core.serialize.a.a(serializer));
        String H = serializer.H();
    }
}
