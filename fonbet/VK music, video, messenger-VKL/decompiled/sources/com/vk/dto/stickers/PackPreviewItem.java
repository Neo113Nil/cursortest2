package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;

/* compiled from: StockPreviewItem.kt */
/* loaded from: classes18.dex */
public final class PackPreviewItem extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PackPreviewItem> CREATOR = new a();
    public final int b;
    public final StickerStockItemPreviewImage c;
    public final boolean d;
    public final List<StyleIcons> e;
    public final String f;
    public final boolean g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PackPreviewItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PackPreviewItem a(Serializer serializer) {
            int u = serializer.u();
            StickerStockItemPreviewImage stickerStockItemPreviewImage = (StickerStockItemPreviewImage) serializer.G(StickerStockItemPreviewImage.class.getClassLoader());
            boolean m = serializer.m();
            ArrayList B = serializer.B(StyleIcons.class.getClassLoader());
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new PackPreviewItem(u, stickerStockItemPreviewImage, m, B, H, serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PackPreviewItem[i];
        }
    }

    public PackPreviewItem(int i, StickerStockItemPreviewImage stickerStockItemPreviewImage, boolean z, List<StyleIcons> list, String str, boolean z2) {
        this.b = i;
        this.c = stickerStockItemPreviewImage;
        this.d = z;
        this.e = list;
        this.f = str;
        this.g = z2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.f0(this.e);
        serializer.j0(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackPreviewItem)) {
            return false;
        }
        PackPreviewItem packPreviewItem = (PackPreviewItem) obj;
        return this.b == packPreviewItem.b && epx.f(this.c, packPreviewItem.c) && this.d == packPreviewItem.d && epx.f(this.e, packPreviewItem.e) && epx.f(this.f, packPreviewItem.f) && this.g == packPreviewItem.g;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = this.c;
        return Boolean.hashCode(this.g) + urd0.a(fw3.a(qoy.b((hashCode + (stickerStockItemPreviewImage == null ? 0 : stickerStockItemPreviewImage.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("PackPreviewItem(id="), this.b, ')');
    }

    public final boolean zb() {
        if (this.d) {
            return true;
        }
        List<StyleIcons> list = this.e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((StyleIcons) it.next()).d) {
                return true;
            }
        }
        return false;
    }
}
