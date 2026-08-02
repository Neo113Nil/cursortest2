package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    public final long a;
    public final xgo b;
    public final xgo c;
    public final xgo d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Preconditions.i(bArr);
        xgo r = zzgx.r(bArr.length, bArr);
        Preconditions.i(bArr2);
        xgo r2 = zzgx.r(bArr2.length, bArr2);
        Preconditions.i(bArr3);
        xgo r3 = zzgx.r(bArr3.length, bArr3);
        this.a = j;
        this.b = r;
        this.c = r2;
        this.d = r3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && Objects.a(this.b, zzqVar.b) && Objects.a(this.c, zzqVar.c) && Objects.a(this.d, zzqVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.c(parcel, 2, this.b.s(), false);
        SafeParcelWriter.c(parcel, 3, this.c.s(), false);
        SafeParcelWriter.c(parcel, 4, this.d.s(), false);
        SafeParcelWriter.t(parcel, s);
    }
}
