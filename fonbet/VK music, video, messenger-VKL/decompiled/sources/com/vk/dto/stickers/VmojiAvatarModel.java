package com.vk.dto.stickers;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import xsna.epx;
import xsna.shy;
import xsna.uqi;
import xsna.zcl;

/* compiled from: VmojiAvatarModel.kt */
/* loaded from: classes18.dex */
public final class VmojiAvatarModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiAvatarModel> CREATOR = new a();
    public final VmojiAvatar b;
    public final Image c;
    public final Image d;
    public final int e;
    public final int f;
    public final Integer g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiAvatarModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiAvatarModel a(Serializer serializer) {
            return new VmojiAvatarModel((VmojiAvatar) serializer.A(VmojiAvatar.class.getClassLoader()), (Image) serializer.A(Image.class.getClassLoader()), (Image) serializer.A(Image.class.getClassLoader()), serializer.u(), serializer.u(), null, 32, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiAvatarModel[i];
        }
    }

    public /* synthetic */ VmojiAvatarModel(VmojiAvatar vmojiAvatar, Image image, Image image2, int i, int i2, Integer num, int i3, zcl zclVar) {
        this(vmojiAvatar, image, image2, i, i2, (i3 & 32) != 0 ? null : num);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.e0(this.b);
        serializer.e0(this.c);
        serializer.e0(this.d);
        serializer.S(this.e);
        serializer.S(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiAvatarModel)) {
            return false;
        }
        VmojiAvatarModel vmojiAvatarModel = (VmojiAvatarModel) obj;
        return epx.f(this.b, vmojiAvatarModel.b) && epx.f(this.c, vmojiAvatarModel.c) && epx.f(this.d, vmojiAvatarModel.d) && this.e == vmojiAvatarModel.e && this.f == vmojiAvatarModel.f && epx.f(this.g, vmojiAvatarModel.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Image image = this.c;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.d;
        int a2 = shy.a(this.f, shy.a(this.e, (hashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31, 31), 31);
        Integer num = this.g;
        return a2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiAvatarModel(avatar=");
        sb.append(this.b);
        sb.append(", avatarIcon=");
        sb.append(this.c);
        sb.append(", avatarIconDark=");
        sb.append(this.d);
        sb.append(", avatarColor=");
        sb.append(this.e);
        sb.append(", avatarColorDark=");
        sb.append(this.f);
        sb.append(", contextStickerPackId=");
        return uqi.b(sb, this.g, ')');
    }

    public VmojiAvatarModel(VmojiAvatar vmojiAvatar, Image image, Image image2, int i, int i2, Integer num) {
        this.b = vmojiAvatar;
        this.c = image;
        this.d = image2;
        this.e = i;
        this.f = i2;
        this.g = num;
    }
}
