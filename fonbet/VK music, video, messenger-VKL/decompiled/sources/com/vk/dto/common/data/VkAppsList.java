package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* compiled from: VkAppsList.kt */
/* loaded from: classes18.dex */
public final class VkAppsList implements Serializer.StreamParcelable {
    public static final Serializer.c<VkAppsList> CREATOR = new b();
    public final List<ApiApplication> b;
    public final VkAppsFeatured c;

    /* compiled from: VkAppsList.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
        public static VkAppsList a(JSONObject jSONObject) {
            ?? r2;
            VkAppsFeatured vkAppsFeatured;
            JSONArray optJSONArray = jSONObject.optJSONArray("favorites");
            if (optJSONArray != null) {
                r2 = new ArrayList(optJSONArray.length());
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    r2.add(new ApiApplication(optJSONArray.getJSONObject(i)));
                }
            } else {
                r2 = EmptyList.b;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("featured");
            if (optJSONObject != null) {
                Serializer.c<VkAppsFeatured> cVar = VkAppsFeatured.CREATOR;
                String string = optJSONObject.getString("title");
                String string2 = optJSONObject.getString("description");
                JSONArray jSONArray = optJSONObject.getJSONArray("items");
                ArrayList arrayList = new ArrayList(jSONArray.length());
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    arrayList.add(new ApiApplication(jSONArray.getJSONObject(i2)));
                }
                vkAppsFeatured = new VkAppsFeatured(string, string2, arrayList);
            } else {
                vkAppsFeatured = new VkAppsFeatured(null, null, null, 7, null);
            }
            return new VkAppsList(r2, vkAppsFeatured);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkAppsList> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAppsList a(Serializer serializer) {
            return new VkAppsList(serializer.k(ApiApplication.class), (VkAppsFeatured) serializer.G(VkAppsFeatured.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAppsList[i];
        }
    }

    public VkAppsList() {
        this(null, null, 3, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.i0(this.c);
    }

    public final List<ApiApplication> d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAppsList)) {
            return false;
        }
        VkAppsList vkAppsList = (VkAppsList) obj;
        return epx.f(this.b, vkAppsList.b) && epx.f(this.c, vkAppsList.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "VkAppsList(favorites=" + this.b + ", featured=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkAppsList(List<? extends ApiApplication> list, VkAppsFeatured vkAppsFeatured) {
        this.b = list;
        this.c = vkAppsFeatured;
    }

    public VkAppsList(List list, VkAppsFeatured vkAppsFeatured, int i, zcl zclVar) {
        this((i & 1) != 0 ? EmptyList.b : list, (i & 2) != 0 ? new VkAppsFeatured(null, null, null, 7, null) : vkAppsFeatured);
    }
}
