package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.tn;

/* compiled from: StickerModel.kt */
/* loaded from: classes7.dex */
public final class StickerModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickerModel> CREATOR = new a();
    public final Integer b;
    public final Integer c;
    public final ImageListModel d;
    public final ImageListModel e;
    public final StickerAnimationModel f;
    public final Boolean g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickerModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickerModel a(Serializer serializer) {
            return new StickerModel(serializer.v(), serializer.v(), (ImageListModel) serializer.A(ImageListModel.class.getClassLoader()), (ImageListModel) serializer.A(ImageListModel.class.getClassLoader()), (StickerAnimationModel) serializer.A(StickerAnimationModel.class.getClassLoader()), serializer.n());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerModel[i];
        }
    }

    public StickerModel(Integer num, Integer num2, ImageListModel imageListModel, ImageListModel imageListModel2, StickerAnimationModel stickerAnimationModel, Boolean bool) {
        this.b = num;
        this.c = num2;
        this.d = imageListModel;
        this.e = imageListModel2;
        this.f = stickerAnimationModel;
        this.g = bool;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.V(this.b);
        serializer.V(this.c);
        serializer.e0(this.d);
        serializer.e0(this.e);
        serializer.e0(this.f);
        serializer.J(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerModel)) {
            return false;
        }
        StickerModel stickerModel = (StickerModel) obj;
        return epx.f(this.b, stickerModel.b) && epx.f(this.c, stickerModel.c) && epx.f(this.d, stickerModel.d) && epx.f(this.e, stickerModel.e) && epx.f(this.f, stickerModel.f) && epx.f(this.g, stickerModel.g);
    }

    public final int hashCode() {
        Integer num = this.b;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.c;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        ImageListModel imageListModel = this.d;
        int hashCode3 = (hashCode2 + (imageListModel == null ? 0 : imageListModel.b.hashCode())) * 31;
        ImageListModel imageListModel2 = this.e;
        int hashCode4 = (hashCode3 + (imageListModel2 == null ? 0 : imageListModel2.b.hashCode())) * 31;
        StickerAnimationModel stickerAnimationModel = this.f;
        int hashCode5 = (hashCode4 + (stickerAnimationModel == null ? 0 : stickerAnimationModel.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerModel(stickerId=");
        sb.append(this.b);
        sb.append(", productId=");
        sb.append(this.c);
        sb.append(", images=");
        sb.append(this.d);
        sb.append(", imagesWithBackground=");
        sb.append(this.e);
        sb.append(", animations=");
        sb.append(this.f);
        sb.append(", isAllowed=");
        return tn.a(sb, this.g, ')');
    }
}
