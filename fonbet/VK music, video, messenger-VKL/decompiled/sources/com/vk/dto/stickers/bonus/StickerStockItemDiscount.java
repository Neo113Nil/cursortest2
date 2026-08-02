package com.vk.dto.stickers.bonus;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.im.ImageList;
import xsna.epx;
import xsna.ho8;

/* compiled from: StickerStockItemDiscount.kt */
/* loaded from: classes18.dex */
public final class StickerStockItemDiscount extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerStockItemDiscount> CREATOR = new a();
    public final String b;
    public final ImageList c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerStockItemDiscount> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerStockItemDiscount a(Serializer serializer) {
            return new StickerStockItemDiscount(serializer.H(), (ImageList) serializer.G(ImageList.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerStockItemDiscount[i];
        }
    }

    public StickerStockItemDiscount(String str, ImageList imageList, String str2) {
        this.b = str;
        this.c = imageList;
        this.d = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.i0(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerStockItemDiscount)) {
            return false;
        }
        StickerStockItemDiscount stickerStockItemDiscount = (StickerStockItemDiscount) obj;
        return epx.f(this.b, stickerStockItemDiscount.b) && epx.f(this.c, stickerStockItemDiscount.c) && epx.f(this.d, stickerStockItemDiscount.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ImageList imageList = this.c;
        int hashCode2 = (hashCode + (imageList == null ? 0 : imageList.b.hashCode())) * 31;
        String str = this.d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerStockItemDiscount(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", status=");
        return ho8.a(sb, this.d, ')');
    }
}
