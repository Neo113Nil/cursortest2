package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: VmojiProductPreviewModel.kt */
/* loaded from: classes7.dex */
public final class VmojiProductPreviewModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiProductPreviewModel> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiProductPreviewModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiProductPreviewModel a(Serializer serializer) {
            return new VmojiProductPreviewModel(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiProductPreviewModel[i];
        }
    }

    public VmojiProductPreviewModel(String str, String str2) {
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
        if (!(obj instanceof VmojiProductPreviewModel)) {
            return false;
        }
        VmojiProductPreviewModel vmojiProductPreviewModel = (VmojiProductPreviewModel) obj;
        return epx.f(this.b, vmojiProductPreviewModel.b) && epx.f(this.c, vmojiProductPreviewModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductPreviewModel(caption=");
        sb.append(this.b);
        sb.append(", characterId=");
        return ho8.a(sb, this.c, ')');
    }
}
