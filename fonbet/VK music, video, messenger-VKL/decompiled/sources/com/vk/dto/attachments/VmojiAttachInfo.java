package com.vk.dto.attachments;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VmojiAttachInfo.kt */
/* loaded from: classes18.dex */
public final class VmojiAttachInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiAttachInfo> CREATOR = new a();
    public final boolean b;
    public final Integer c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiAttachInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiAttachInfo a(Serializer serializer) {
            return new VmojiAttachInfo(serializer.m(), serializer.v());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiAttachInfo[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VmojiAttachInfo() {
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
        if (!(obj instanceof VmojiAttachInfo)) {
            return false;
        }
        VmojiAttachInfo vmojiAttachInfo = (VmojiAttachInfo) obj;
        return this.b == vmojiAttachInfo.b && epx.f(this.c, vmojiAttachInfo.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAttachInfo(isVmojiPack=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        return uqi.b(sb, this.c, ')');
    }

    public /* synthetic */ VmojiAttachInfo(boolean z, Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num);
    }

    public VmojiAttachInfo(boolean z, Integer num) {
        this.b = z;
        this.c = num;
    }
}
