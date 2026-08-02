package com.google.android.gms.internal.ads;

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
public final class zzbho extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbho> CREATOR = new zzbhp();
    public ParcelFileDescriptor a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final boolean e;

    public zzbho(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.a = parcelFileDescriptor;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = z3;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream Y0() {
        if (this.a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
        this.a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean Z0() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        boolean z;
        long j;
        int s = SafeParcelWriter.s(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.a;
        }
        SafeParcelWriter.l(parcel, 2, parcelFileDescriptor, i, false);
        synchronized (this) {
            z = this.b;
        }
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean zze = zze();
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(zze ? 1 : 0);
        synchronized (this) {
            j = this.d;
        }
        SafeParcelWriter.r(parcel, 5, 8);
        parcel.writeLong(j);
        boolean Z0 = Z0();
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(Z0 ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }

    public final synchronized boolean zza() {
        return this.a != null;
    }

    public final synchronized boolean zze() {
        return this.c;
    }

    public zzbho() {
        this(null, false, false, 0L, false);
    }
}
