package com.vk.auth.ui.password.askpassword;

import com.vk.core.serialize.Serializer;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public final class VkExtendPartialTokenData extends VkAskPasswordData {
    public static final Serializer.c<VkExtendPartialTokenData> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkExtendPartialTokenData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkExtendPartialTokenData a(Serializer serializer) {
            return new VkExtendPartialTokenData(serializer.H(), serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkExtendPartialTokenData[i];
        }
    }

    public VkExtendPartialTokenData(String str, String str2, int i) {
        super(null);
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
    }
}
