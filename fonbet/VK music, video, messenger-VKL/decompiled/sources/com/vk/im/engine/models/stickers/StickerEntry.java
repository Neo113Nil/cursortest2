package com.vk.im.engine.models.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerItem;
import xsna.epx;

/* compiled from: StickerEntry.kt */
/* loaded from: classes2.dex */
public final class StickerEntry extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerEntry> CREATOR = new a();
    public final int b;
    public final StickerItem c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerEntry> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerEntry a(Serializer serializer) {
            return new StickerEntry(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerEntry[i];
        }
    }

    public StickerEntry(int i, StickerItem stickerItem) {
        this.b = i;
        this.c = stickerItem;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.i0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerEntry)) {
            return false;
        }
        StickerEntry stickerEntry = (StickerEntry) obj;
        return this.b == stickerEntry.b && epx.f(this.c, stickerEntry.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "StickerEntry(productId=" + this.b + ", sticker=" + this.c + ')';
    }

    public StickerEntry(Serializer serializer) {
        this(serializer.u(), (StickerItem) serializer.G(StickerItem.class.getClassLoader()));
    }
}
