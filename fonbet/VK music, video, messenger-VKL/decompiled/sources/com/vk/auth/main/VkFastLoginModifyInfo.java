package com.vk.auth.main;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import xsna.zcl;

/* compiled from: VkFastLoginUsersModifier.kt */
/* loaded from: classes15.dex */
public final class VkFastLoginModifyInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkFastLoginModifyInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Bitmap g;
    public final Bundle h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkFastLoginModifyInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkFastLoginModifyInfo a(Serializer serializer) {
            return new VkFastLoginModifyInfo(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.u(), (Bitmap) serializer.A(Bitmap.class.getClassLoader()), serializer.o(Bundle.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkFastLoginModifyInfo[i];
        }
    }

    public VkFastLoginModifyInfo(String str, String str2, String str3, String str4, int i, Bitmap bitmap, Bundle bundle, zcl zclVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = bitmap;
        this.h = bundle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.S(this.f);
        serializer.e0(this.g);
        serializer.K(this.h);
    }
}
