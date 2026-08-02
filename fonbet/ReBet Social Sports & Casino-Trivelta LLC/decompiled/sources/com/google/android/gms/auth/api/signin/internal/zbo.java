package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            zbb();
        } else {
            if (i10 != 2) {
                return false;
            }
            zbc();
        }
        return true;
    }
}
