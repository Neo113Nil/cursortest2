package com.vk.stickers.views.sticker;

import com.vk.core.serialize.Serializer;
import xsna.bpn0;
import xsna.epx;
import xsna.vu5;
import xsna.yu60;

/* compiled from: StickerPackPreviewWithStickerId.kt */
/* loaded from: classes6.dex */
public final class StickerPackPreviewWithStickerId extends Serializer.StreamParcelableAdapter implements Comparable<StickerPackPreviewWithStickerId> {
    public static final Serializer.c<StickerPackPreviewWithStickerId> CREATOR = new a();
    public final StickerPackPreview b;
    public final int c;
    public final bpn0 d = new bpn0(new yu60(this, 27));

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerPackPreviewWithStickerId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerPackPreviewWithStickerId a(Serializer serializer) {
            return new StickerPackPreviewWithStickerId((StickerPackPreview) serializer.G(StickerPackPreview.class.getClassLoader()), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerPackPreviewWithStickerId[i];
        }
    }

    public StickerPackPreviewWithStickerId(StickerPackPreview stickerPackPreview, int i) {
        this.b = stickerPackPreview;
        this.c = i;
    }

    public static StickerPackPreviewWithStickerId zb(StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId, StickerPackPreview stickerPackPreview, int i) {
        if ((i & 1) != 0) {
            stickerPackPreview = stickerPackPreviewWithStickerId.b;
        }
        int i2 = stickerPackPreviewWithStickerId.c;
        stickerPackPreviewWithStickerId.getClass();
        return new StickerPackPreviewWithStickerId(stickerPackPreview, i2);
    }

    public final StickerPackPreview Ab() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.c);
        serializer.i0(this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId) {
        return epx.g(this.c, stickerPackPreviewWithStickerId.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackPreviewWithStickerId)) {
            return false;
        }
        StickerPackPreviewWithStickerId stickerPackPreviewWithStickerId = (StickerPackPreviewWithStickerId) obj;
        return epx.f(this.b, stickerPackPreviewWithStickerId.b) && this.c == stickerPackPreviewWithStickerId.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackPreviewWithStickerId(pack=");
        sb.append(this.b);
        sb.append(", id=");
        return vu5.b(sb, this.c, ')');
    }
}
