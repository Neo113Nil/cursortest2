package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickerAnimation.kt */
/* loaded from: classes18.dex */
public final class StickerAnimation extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerAnimation> CREATOR = new a();

    @pmi0("animation")
    private final String animation;

    @pmi0("animationWithBg")
    private final String animationWithBg;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerAnimation> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerAnimation a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new StickerAnimation(H, H2 != null ? H2 : "");
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerAnimation[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickerAnimation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String Ab() {
        return this.animation.length() > 0 ? this.animation : this.animationWithBg.length() > 0 ? this.animationWithBg : "";
    }

    public final String Bb() {
        return this.animationWithBg;
    }

    public final String Cb() {
        return this.animationWithBg.length() > 0 ? this.animationWithBg : this.animation.length() > 0 ? this.animation : "";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.animation);
        serializer.j0(this.animationWithBg);
    }

    public final boolean V0() {
        return this.animation.length() > 0 || this.animationWithBg.length() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimation)) {
            return false;
        }
        StickerAnimation stickerAnimation = (StickerAnimation) obj;
        return epx.f(this.animation, stickerAnimation.animation) && epx.f(this.animationWithBg, stickerAnimation.animationWithBg);
    }

    public final int hashCode() {
        return this.animationWithBg.hashCode() + (this.animation.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerAnimation(animation=");
        sb.append(this.animation);
        sb.append(", animationWithBg=");
        return ho8.a(sb, this.animationWithBg, ')');
    }

    public final String zb() {
        return this.animation;
    }

    public /* synthetic */ StickerAnimation(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public StickerAnimation(String str, String str2) {
        this.animation = str;
        this.animationWithBg = str2;
    }
}
