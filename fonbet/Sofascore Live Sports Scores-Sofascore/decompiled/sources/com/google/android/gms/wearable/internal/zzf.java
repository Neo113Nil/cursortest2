package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new zzg();
    public final zzgp a;
    public final IntentFilter[] b;
    public final String c;
    public final String d;

    public zzf(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        zzgp zzgpVar;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            zzgpVar = queryLocalInterface instanceof zzgp ? (zzgp) queryLocalInterface : new zzgn(iBinder);
        } else {
            zzgpVar = null;
        }
        this.a = zzgpVar;
        this.b = intentFilterArr;
        this.c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        zzgp zzgpVar = this.a;
        SafeParcelWriter.f(parcel, 2, zzgpVar == null ? null : zzgpVar.asBinder());
        SafeParcelWriter.p(parcel, 3, this.b, i);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }

    public zzf(zzko zzkoVar) {
        this.a = zzkoVar;
        this.b = zzkoVar.b;
        this.c = null;
        this.d = null;
    }
}
