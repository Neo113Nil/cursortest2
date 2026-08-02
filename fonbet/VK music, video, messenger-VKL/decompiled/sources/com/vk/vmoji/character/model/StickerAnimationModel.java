package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: StickerModel.kt */
/* loaded from: classes7.dex */
public final class StickerAnimationModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerAnimationModel> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerAnimationModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerAnimationModel a(Serializer serializer) {
            return new StickerAnimationModel(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerAnimationModel[i];
        }
    }

    public StickerAnimationModel(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerAnimationModel)) {
            return false;
        }
        StickerAnimationModel stickerAnimationModel = (StickerAnimationModel) obj;
        return epx.f(this.b, stickerAnimationModel.b) && epx.f(this.c, stickerAnimationModel.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerAnimationModel(animationUrl=");
        sb.append(this.b);
        sb.append(", animationUrlWithBg=");
        return ho8.a(sb, this.c, ')');
    }
}
