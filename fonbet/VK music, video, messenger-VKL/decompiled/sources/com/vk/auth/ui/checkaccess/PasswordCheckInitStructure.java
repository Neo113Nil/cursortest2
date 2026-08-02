package com.vk.auth.ui.checkaccess;

import com.vk.core.serialize.Serializer;

/* compiled from: PasswordCheckInitStructure.kt */
/* loaded from: classes.dex */
public final class PasswordCheckInitStructure extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PasswordCheckInitStructure> CREATOR = new a();
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    /* compiled from: Serializer.kt */
    /* loaded from: classes15.dex */
    public static final class a extends Serializer.c<PasswordCheckInitStructure> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PasswordCheckInitStructure a(Serializer serializer) {
            return new PasswordCheckInitStructure(serializer.H(), serializer.H(), serializer.H(), serializer.H(), serializer.m());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PasswordCheckInitStructure[i];
        }
    }

    public PasswordCheckInitStructure(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
    }
}
