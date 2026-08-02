package com.google.android.gms.internal.auth;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i10, String str) {
        this.zza = 1;
        this.zzb = (String) AbstractC3191o.m(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.zza);
        b.F(parcel, 2, this.zzb, false);
        b.b(parcel, a10);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
