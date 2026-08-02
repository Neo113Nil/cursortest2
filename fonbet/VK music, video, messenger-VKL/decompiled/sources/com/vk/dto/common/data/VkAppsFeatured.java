package com.vk.dto.common.data;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;
import xsna.zcl;

/* compiled from: VkAppsFeatured.kt */
/* loaded from: classes18.dex */
public final class VkAppsFeatured implements Serializer.StreamParcelable {
    public static final Serializer.c<VkAppsFeatured> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<ApiApplication> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkAppsFeatured> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAppsFeatured a(Serializer serializer) {
            return new VkAppsFeatured(serializer.H(), serializer.H(), serializer.k(ApiApplication.class));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAppsFeatured[i];
        }
    }

    public VkAppsFeatured() {
        this(null, null, null, 7, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.W(this.d);
    }

    public final List<ApiApplication> d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkAppsFeatured)) {
            return false;
        }
        VkAppsFeatured vkAppsFeatured = (VkAppsFeatured) obj;
        return epx.f(this.b, vkAppsFeatured.b) && epx.f(this.c, vkAppsFeatured.c) && epx.f(this.d, vkAppsFeatured.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkAppsFeatured(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", apps=");
        return ms9.a(')', sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkAppsFeatured(String str, String str2, List<? extends ApiApplication> list) {
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    public VkAppsFeatured(String str, String str2, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? EmptyList.b : list);
    }
}
