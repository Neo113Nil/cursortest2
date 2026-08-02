package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;

/* compiled from: VmojiProductUnlockInfoModel.kt */
/* loaded from: classes7.dex */
public final class VmojiProductUnlockInfoButtonModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiProductUnlockInfoButtonModel> CREATOR = new a();
    public final String b;
    public final String c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiProductUnlockInfoButtonModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiProductUnlockInfoButtonModel a(Serializer serializer) {
            return new VmojiProductUnlockInfoButtonModel(serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiProductUnlockInfoButtonModel[i];
        }
    }

    public VmojiProductUnlockInfoButtonModel(String str, String str2) {
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
        if (!(obj instanceof VmojiProductUnlockInfoButtonModel)) {
            return false;
        }
        VmojiProductUnlockInfoButtonModel vmojiProductUnlockInfoButtonModel = (VmojiProductUnlockInfoButtonModel) obj;
        return epx.f(this.b, vmojiProductUnlockInfoButtonModel.b) && epx.f(this.c, vmojiProductUnlockInfoButtonModel.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiProductUnlockInfoButtonModel(title=");
        sb.append(this.b);
        sb.append(", url=");
        return ho8.a(sb, this.c, ')');
    }
}
