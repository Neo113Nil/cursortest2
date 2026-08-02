package com.vk.auth.ui.password.askpassword;

import com.vk.core.serialize.Serializer;
import com.vk.silentauth.SilentTokenProviderInfo;
import java.util.List;

/* compiled from: VkAskPasswordData.kt */
/* loaded from: classes15.dex */
public final class VkExtendSilentTokenData extends VkAskPasswordData {
    public static final Serializer.c<VkExtendSilentTokenData> CREATOR = new a();
    public final String b;
    public final String c;
    public final List<SilentTokenProviderInfo> d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkExtendSilentTokenData> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkExtendSilentTokenData a(Serializer serializer) {
            return new VkExtendSilentTokenData(serializer.H(), serializer.H(), serializer.B(SilentTokenProviderInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkExtendSilentTokenData[i];
        }
    }

    public VkExtendSilentTokenData(String str, String str2, List<SilentTokenProviderInfo> list) {
        super(null);
        this.b = str;
        this.c = str2;
        this.d = list;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.f0(this.d);
    }
}
