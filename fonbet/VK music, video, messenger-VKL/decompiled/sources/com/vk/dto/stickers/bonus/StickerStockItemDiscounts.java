package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: StickerStockItemDiscounts.kt */
/* loaded from: classes18.dex */
public final class StickerStockItemDiscounts extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerStockItemDiscounts> CREATOR = new a();
    public final List<StickerStockItemDiscount> b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerStockItemDiscounts> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerStockItemDiscounts a(Serializer serializer) {
            ArrayList k = serializer.k(StickerStockItemDiscount.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new StickerStockItemDiscounts(k, serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerStockItemDiscounts[i];
        }
    }

    public StickerStockItemDiscounts(List<StickerStockItemDiscount> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStockItemDiscounts)) {
            return false;
        }
        StickerStockItemDiscounts stickerStockItemDiscounts = (StickerStockItemDiscounts) obj;
        return epx.f(this.b, stickerStockItemDiscounts.b) && epx.f(this.c, stickerStockItemDiscounts.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerStockItemDiscounts(items=");
        sb.append(this.b);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.c, ')');
    }
}
