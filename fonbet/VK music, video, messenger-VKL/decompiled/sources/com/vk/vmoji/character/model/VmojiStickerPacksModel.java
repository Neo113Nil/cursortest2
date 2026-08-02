package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import java.util.List;
import xsna.epx;
import xsna.ho8;

/* compiled from: VmojiStickerPacksModel.kt */
/* loaded from: classes7.dex */
public final class VmojiStickerPacksModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiStickerPacksModel> CREATOR = new a();
    public final List<VmojiStickerPackPreviewModel> b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiStickerPacksModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiStickerPacksModel a(Serializer serializer) {
            return new VmojiStickerPacksModel(serializer.B(VmojiStickerPackPreviewModel.class.getClassLoader()), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiStickerPacksModel[i];
        }
    }

    public VmojiStickerPacksModel(List<VmojiStickerPackPreviewModel> list, String str) {
        this.b = list;
        this.c = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.f0(this.b);
        serializer.j0(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiStickerPacksModel)) {
            return false;
        }
        VmojiStickerPacksModel vmojiStickerPacksModel = (VmojiStickerPacksModel) obj;
        return epx.f(this.b, vmojiStickerPacksModel.b) && epx.f(this.c, vmojiStickerPacksModel.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiStickerPacksModel(packs=");
        sb.append(this.b);
        sb.append(", nextBlockId=");
        return ho8.a(sb, this.c, ')');
    }
}
