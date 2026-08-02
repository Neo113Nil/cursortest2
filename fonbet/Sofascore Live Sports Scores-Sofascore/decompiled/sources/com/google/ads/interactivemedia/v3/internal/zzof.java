package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a70;
import defpackage.cmn;
import defpackage.d0p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzof extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzof> CREATOR = new d0p();
    public final int a;
    public cmn b = null;
    public byte[] c;

    public zzof(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        zzb();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.b();
        }
        SafeParcelWriter.c(parcel, 2, bArr, false);
        SafeParcelWriter.t(parcel, s);
    }

    public final void zzb() {
        cmn cmnVar = this.b;
        if (cmnVar != null || this.c == null) {
            if (cmnVar == null || this.c != null) {
                if (cmnVar != null && this.c != null) {
                    a70.r("Invalid internal representation - full");
                } else if (cmnVar == null && this.c == null) {
                    a70.r("Invalid internal representation - empty");
                } else {
                    a70.r("Impossible");
                }
            }
        }
    }
}
