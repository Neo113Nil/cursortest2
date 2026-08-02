package com.vk.dto.stickers.popup;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.ms9;

/* compiled from: PopupStickerAnimation.kt */
/* loaded from: classes18.dex */
public final class PopupStickerAnimation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PopupStickerAnimation> CREATOR = new a();
    public final boolean b;
    public final List<PopupStickerAnimationLayer> c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PopupStickerAnimation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PopupStickerAnimation a(Serializer serializer) {
            boolean m = serializer.m();
            ArrayList k = serializer.k(PopupStickerAnimationLayer.class);
            if (k == null) {
                k = new ArrayList();
            }
            return new PopupStickerAnimation(m, k);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PopupStickerAnimation[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PopupStickerAnimation(boolean z, List<? extends PopupStickerAnimationLayer> list) {
        this.b = z;
        this.c = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.W(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!PopupStickerAnimation.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        PopupStickerAnimation popupStickerAnimation = (PopupStickerAnimation) obj;
        return this.b == popupStickerAnimation.b && epx.f(this.c, popupStickerAnimation.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupStickerAnimation(autoplay=");
        sb.append(this.b);
        sb.append(", layers=");
        return ms9.a(')', sb, this.c);
    }
}
