package com.vk.auth.ui.password.askpassword;

import com.vk.auth.ui.password.askpassword.VkAskPasswordData;
import com.vk.core.serialize.Serializer;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public final class VkAskPasswordSATLoginData extends VkAskPasswordForLoginData {
    public static final Serializer.c<VkAskPasswordSATLoginData> CREATOR = new a();

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkAskPasswordSATLoginData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAskPasswordSATLoginData a(Serializer serializer) {
            return new VkAskPasswordSATLoginData(serializer.H(), (VkAskPasswordData.User) serializer.A(VkAskPasswordData.User.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAskPasswordSATLoginData[i];
        }
    }

    public VkAskPasswordSATLoginData(String str, VkAskPasswordData.User user) {
        super("", str, false, user);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.e0(this.e);
    }
}
