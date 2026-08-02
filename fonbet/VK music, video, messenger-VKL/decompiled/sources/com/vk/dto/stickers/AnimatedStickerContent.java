package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;

/* compiled from: AnimatedStickerContent.kt */
/* loaded from: classes18.dex */
public final class AnimatedStickerContent extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<AnimatedStickerContent> CREATOR = new a();
    public final String b;
    public final byte[] c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AnimatedStickerContent> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AnimatedStickerContent a(Serializer serializer) {
            return new AnimatedStickerContent(serializer.H(), serializer.a());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AnimatedStickerContent[i];
        }
    }

    public AnimatedStickerContent(String str, byte[] bArr) {
        this.b = str;
        this.c = bArr;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.M(this.c);
    }
}
