package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzfzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfzn> CREATOR = new zzfzo();
    public final int a;
    public zzaza b = null;
    public byte[] c;

    public zzfzn(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        Y0();
    }

    public final void Y0() {
        zzaza zzazaVar = this.b;
        if (zzazaVar != null || this.c == null) {
            if (zzazaVar == null || this.c != null) {
                if (zzazaVar != null && this.c != null) {
                    a70.r("Invalid internal representation - full");
                } else if (zzazaVar == null && this.c == null) {
                    a70.r("Invalid internal representation - empty");
                } else {
                    a70.r("Impossible");
                }
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        byte[] bArr = this.c;
        if (bArr == null) {
            bArr = this.b.d();
        }
        SafeParcelWriter.c(parcel, 2, bArr, false);
        SafeParcelWriter.t(parcel, s);
    }
}
