package com.vk.im.engine.models.attaches;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: AttachLink.kt */
/* loaded from: classes2.dex */
public final class VmojiAttach extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiAttach> CREATOR = new a();
    public final boolean b;
    public final Integer c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiAttach> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiAttach a(Serializer serializer) {
            return new VmojiAttach(serializer.m(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiAttach[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmojiAttach() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.V(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiAttach)) {
            return false;
        }
        VmojiAttach vmojiAttach = (VmojiAttach) obj;
        return this.b == vmojiAttach.b && epx.f(this.c, vmojiAttach.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAttach(isVmojiPack=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return uqi.b(sb, this.c, ')');
    }

    public /* synthetic */ VmojiAttach(boolean z, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }

    public VmojiAttach(boolean z, Integer num) {
        this.b = z;
        this.c = num;
    }
}
