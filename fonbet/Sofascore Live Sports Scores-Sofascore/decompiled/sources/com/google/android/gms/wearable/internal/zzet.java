package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzet extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzet> CREATOR = new zzeu();
    public final int a;
    public final ParcelFileDescriptor b;
    public final boolean c;

    public zzet(int i, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        this.a = i;
        this.b = parcelFileDescriptor;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.l(parcel, 3, this.b, i, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
