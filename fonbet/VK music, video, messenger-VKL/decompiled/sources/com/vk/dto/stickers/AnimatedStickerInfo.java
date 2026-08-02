package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: AnimatedStickerInfo.kt */
/* loaded from: classes18.dex */
public final class AnimatedStickerInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AnimatedStickerInfo> CREATOR = new a();
    public final String b;
    public final int c;
    public final int d;
    public transient String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AnimatedStickerInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AnimatedStickerInfo a(Serializer serializer) {
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new AnimatedStickerInfo(H, serializer.u(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnimatedStickerInfo[i];
        }
    }

    public /* synthetic */ AnimatedStickerInfo(String str, int i, int i2, int i3, zcl zclVar) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.S(this.d);
    }

    public AnimatedStickerInfo(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }
}
