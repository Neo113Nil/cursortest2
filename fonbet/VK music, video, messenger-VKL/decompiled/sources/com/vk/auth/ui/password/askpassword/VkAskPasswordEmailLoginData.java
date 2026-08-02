package com.vk.auth.ui.password.askpassword;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public final class VkAskPasswordEmailLoginData extends VkAskPasswordForLoginData {
    public static final Serializer.c<VkAskPasswordEmailLoginData> CREATOR = new a();
    public final Bundle f;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkAskPasswordEmailLoginData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAskPasswordEmailLoginData a(Serializer serializer) {
            return new VkAskPasswordEmailLoginData(serializer.H(), serializer.H(), (Bundle) serializer.A(Bundle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAskPasswordEmailLoginData[i];
        }
    }

    public VkAskPasswordEmailLoginData(String str, String str2, Bundle bundle) {
        super(str, str2, true, null);
        this.f = bundle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.e0(this.f);
    }
}
