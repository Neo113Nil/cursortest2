package com.vk.api.base;

import com.vk.core.serialize.Serializer;
import com.vk.core.serialize.Serializer.StreamParcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: VkPaginationList.kt */
/* loaded from: classes14.dex */
public final class VkPaginationList<T extends Serializer.StreamParcelable> extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<Serializer.StreamParcelable> CREATOR = new a();
    public final List<T> b;
    public final int c;
    public final boolean d;
    public final int e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Serializer.StreamParcelable> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Serializer.StreamParcelable a(Serializer serializer) {
            ArrayList<T> k = serializer.k(Serializer.StreamParcelable.class);
            if (k == null) {
                k = new ArrayList<>();
            }
            return new VkPaginationList(k, serializer.u(), serializer.m(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Serializer.StreamParcelable[i];
        }
    }

    public VkPaginationList() {
        this(null, 0, false, 0, 15, null);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.W(this.b);
        serializer.S(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.S(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkPaginationList)) {
            return false;
        }
        VkPaginationList vkPaginationList = (VkPaginationList) obj;
        return epx.f(this.b, vkPaginationList.b) && this.c == vkPaginationList.c && this.d == vkPaginationList.d && this.e == vkPaginationList.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkPaginationList(items=");
        sb.append(this.b);
        sb.append(", total=");
        sb.append(this.c);
        sb.append(", hasMore=");
        sb.append(this.d);
        sb.append(", offset=");
        return vu5.b(sb, this.e, ')');
    }

    public VkPaginationList(List<? extends T> list, int i, boolean z) {
        this(list, i, z, 0, 8, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkPaginationList(List<? extends T> list, int i, boolean z, int i2) {
        this.b = list;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    public VkPaginationList(List list, int i, boolean z, int i2, int i3, zcl zclVar) {
        this((i3 & 1) != 0 ? EmptyList.b : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i2);
    }
}
