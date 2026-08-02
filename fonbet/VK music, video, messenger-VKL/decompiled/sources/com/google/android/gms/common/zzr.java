package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.fdi;
import xsna.jp01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new jp01();
    public final boolean b;
    public final String c;
    public final int d;
    public final int e;
    public final long f;

    public zzr(int i, String str, long j, int i2, boolean z) {
        this.b = z;
        this.c = str;
        this.d = fdi.P(i) - 1;
        int i3 = 1;
        int[] iArr = {1, 2, 3};
        int i4 = 0;
        while (true) {
            if (i4 >= 3) {
                break;
            }
            int i5 = iArr[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == i2) {
                i3 = i5;
                break;
            }
            i4++;
        }
        this.e = i3 - 1;
        this.f = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b ? 1 : 0);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(this.f);
        ozg0.x(w, parcel);
    }

    public final boolean zza() {
        return this.b;
    }

    public final String zzb() {
        return this.c;
    }

    public final int zzd() {
        return fdi.P(this.d);
    }

    public final int zze() {
        int[] iArr = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            int i2 = iArr[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == this.e) {
                return i2;
            }
        }
        return 1;
    }
}
