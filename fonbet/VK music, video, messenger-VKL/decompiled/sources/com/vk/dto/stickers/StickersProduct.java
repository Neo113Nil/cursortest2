package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.rl3;

/* compiled from: StickersProduct.kt */
/* loaded from: classes18.dex */
public final class StickersProduct extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersProduct> CREATOR = new a();
    public final int b;
    public final Integer c;
    public final List<Integer> d;
    public final boolean e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersProduct> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersProduct a(Serializer serializer) {
            return new StickersProduct(serializer.u(), serializer.v(), rl3.s0(serializer.c()), serializer.m(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersProduct[i];
        }
    }

    public StickersProduct(int i, Integer num, List<Integer> list, boolean z, boolean z2) {
        this.b = i;
        this.c = num;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.V(this.c);
        serializer.U(this.d);
        serializer.L(this.e ? (byte) 1 : (byte) 0);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersProduct)) {
            return false;
        }
        StickersProduct stickersProduct = (StickersProduct) obj;
        return this.b == stickersProduct.b && epx.f(this.c, stickersProduct.c) && epx.f(this.d, stickersProduct.d) && this.e == stickersProduct.e && this.f == stickersProduct.f;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.f) + qoy.b(fw3.a((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersProduct(id=");
        sb.append(this.b);
        sb.append(", baseId=");
        sb.append(this.c);
        sb.append(", styleIds=");
        sb.append(this.d);
        sb.append(", purchased=");
        sb.append(this.e);
        sb.append(", active=");
        return q0.a(sb, this.f, ')');
    }
}
