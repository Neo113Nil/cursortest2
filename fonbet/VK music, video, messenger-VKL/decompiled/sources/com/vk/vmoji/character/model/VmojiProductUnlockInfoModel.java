package com.vk.vmoji.character.model;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;

/* compiled from: VmojiProductUnlockInfoModel.kt */
/* loaded from: classes7.dex */
public final class VmojiProductUnlockInfoModel extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VmojiProductUnlockInfoModel> CREATOR = new a();
    public final String b;
    public final String c;
    public final VmojiProductUnlockInfoButtonModel d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VmojiProductUnlockInfoModel> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VmojiProductUnlockInfoModel a(Serializer serializer) {
            return new VmojiProductUnlockInfoModel(serializer.H(), serializer.H(), (VmojiProductUnlockInfoButtonModel) serializer.A(VmojiProductUnlockInfoButtonModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VmojiProductUnlockInfoModel[i];
        }
    }

    public VmojiProductUnlockInfoModel(String str, String str2, VmojiProductUnlockInfoButtonModel vmojiProductUnlockInfoButtonModel) {
        this.b = str;
        this.c = str2;
        this.d = vmojiProductUnlockInfoButtonModel;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.e0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VmojiProductUnlockInfoModel)) {
            return false;
        }
        VmojiProductUnlockInfoModel vmojiProductUnlockInfoModel = (VmojiProductUnlockInfoModel) obj;
        return epx.f(this.b, vmojiProductUnlockInfoModel.b) && epx.f(this.c, vmojiProductUnlockInfoModel.c) && epx.f(this.d, vmojiProductUnlockInfoModel.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        VmojiProductUnlockInfoButtonModel vmojiProductUnlockInfoButtonModel = this.d;
        return a2 + (vmojiProductUnlockInfoButtonModel == null ? 0 : vmojiProductUnlockInfoButtonModel.hashCode());
    }

    public final String toString() {
        return "VmojiProductUnlockInfoModel(title=" + this.b + ", text=" + this.c + ", button=" + this.d + ')';
    }
}
