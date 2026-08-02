package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzin extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzin> CREATOR = new zzio();
    public final int a;
    public final zzgp b;

    public zzin(int i, IBinder iBinder) {
        zzgp zzgpVar;
        this.a = i;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            zzgpVar = queryLocalInterface instanceof zzgp ? (zzgp) queryLocalInterface : new zzgn(iBinder);
        } else {
            zzgpVar = null;
        }
        this.b = zzgpVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        zzgp zzgpVar = this.b;
        SafeParcelWriter.f(parcel, 2, zzgpVar == null ? null : zzgpVar.asBinder());
        SafeParcelWriter.t(parcel, s);
    }

    public zzin(zzko zzkoVar) {
        this.a = 1;
        this.b = zzkoVar;
    }
}
