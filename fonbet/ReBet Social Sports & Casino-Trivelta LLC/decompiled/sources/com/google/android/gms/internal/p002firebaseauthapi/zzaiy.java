package com.google.android.gms.internal.p002firebaseauthapi;

import E9.a;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzaiy implements Parcelable.Creator<zzaiz> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz createFromParcel(Parcel parcel) {
        int N10 = a.N(parcel);
        while (parcel.dataPosition() < N10) {
            int E10 = a.E(parcel);
            a.w(E10);
            a.M(parcel, E10);
        }
        a.v(parcel, N10);
        return new zzaiz();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaiz[] newArray(int i10) {
        return new zzaiz[i10];
    }
}
