package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import defpackage.q0;
import xsna.epx;

/* compiled from: StyleIcons.kt */
/* loaded from: classes18.dex */
public final class StyleIcons extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StyleIcons> CREATOR = new a();
    public final int b;
    public final StickerStockItemPreviewImage c;
    public final boolean d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StyleIcons> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StyleIcons a(Serializer serializer) {
            return new StyleIcons(serializer.u(), (StickerStockItemPreviewImage) serializer.G(StickerStockItemPreviewImage.class.getClassLoader()), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StyleIcons[i];
        }
    }

    public StyleIcons(int i, StickerStockItemPreviewImage stickerStockItemPreviewImage, boolean z) {
        this.b = i;
        this.c = stickerStockItemPreviewImage;
        this.d = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StyleIcons)) {
            return false;
        }
        StyleIcons styleIcons = (StyleIcons) obj;
        return this.b == styleIcons.b && epx.f(this.c, styleIcons.c) && this.d == styleIcons.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.b) * 31;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (stickerStockItemPreviewImage == null ? 0 : stickerStockItemPreviewImage.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StyleIcons(id=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", active=");
        return q0.a(sb, this.d, ')');
    }
}
