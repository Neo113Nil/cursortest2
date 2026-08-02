package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.bpn0;
import xsna.epx;
import xsna.su80;
import xsna.vu5;

/* compiled from: StickerStockItemWithStickerId.kt */
/* loaded from: classes18.dex */
public final class StickerStockItemWithStickerId extends Serializer.StreamParcelableAdapter implements Comparable<StickerStockItemWithStickerId> {
    public static final Serializer.c<StickerStockItemWithStickerId> CREATOR = new a();
    public final StickerStockItem b;
    public final int c;
    public final bpn0 d = new bpn0(new su80(this, 21));

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerStockItemWithStickerId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerStockItemWithStickerId a(Serializer serializer) {
            return new StickerStockItemWithStickerId((StickerStockItem) serializer.G(StickerStockItem.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerStockItemWithStickerId[i];
        }
    }

    public StickerStockItemWithStickerId(StickerStockItem stickerStockItem, int i) {
        this.b = stickerStockItem;
        this.c = i;
    }

    public static StickerStockItemWithStickerId zb(StickerStockItemWithStickerId stickerStockItemWithStickerId, StickerStockItem stickerStockItem, int i) {
        if ((i & 1) != 0) {
            stickerStockItem = stickerStockItemWithStickerId.b;
        }
        int i2 = stickerStockItemWithStickerId.c;
        stickerStockItemWithStickerId.getClass();
        return new StickerStockItemWithStickerId(stickerStockItem, i2);
    }

    public final StickerStockItem Ab() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.c);
        serializer.i0(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(StickerStockItemWithStickerId stickerStockItemWithStickerId) {
        return epx.g(this.c, stickerStockItemWithStickerId.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStockItemWithStickerId)) {
            return false;
        }
        StickerStockItemWithStickerId stickerStockItemWithStickerId = (StickerStockItemWithStickerId) obj;
        return epx.f(this.b, stickerStockItemWithStickerId.b) && this.c == stickerStockItemWithStickerId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerStockItemWithStickerId(pack=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }
}
