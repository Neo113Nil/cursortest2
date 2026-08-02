package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    public final int a;
    public final boolean b;
    public final zzih[] c;

    public zzen(int i, boolean z, zzih[] zzihVarArr) {
        this.a = i;
        this.b = z;
        this.c = zzihVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.p(parcel, 4, this.c, i);
        SafeParcelWriter.t(parcel, s);
    }
}
