package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzhk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhk> CREATOR = new zzhl();
    public final int a;
    public final zzaf b = null;
    public final byte[] c;

    public zzhk(int i, byte[] bArr) {
        this.a = i;
        this.c = bArr;
        zzaf zzafVar = this.b;
        if (zzafVar != null || this.c == null) {
            if (zzafVar == null || this.c != null) {
                if (zzafVar != null && this.c != null) {
                    a70.r("Invalid internal representation - full");
                } else if (zzafVar == null && this.c == null) {
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
            bArr = this.b.A();
        }
        SafeParcelWriter.c(parcel, 2, bArr, false);
        SafeParcelWriter.t(parcel, s);
    }
}
