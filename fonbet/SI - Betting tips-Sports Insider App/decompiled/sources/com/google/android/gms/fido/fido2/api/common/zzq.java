package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.r0;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new l(27);

    /* renamed from: a, reason: collision with root package name */
    public final long f4779a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4780b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4781c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f4782d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        v.h(bArr);
        r0 h10 = r0.h(bArr.length, bArr);
        v.h(bArr2);
        r0 h11 = r0.h(bArr2.length, bArr2);
        v.h(bArr3);
        r0 h12 = r0.h(bArr3.length, bArr3);
        this.f4779a = j;
        this.f4780b = h10;
        this.f4781c = h11;
        this.f4782d = h12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.f4779a == zzqVar.f4779a && v.k(this.f4780b, zzqVar.f4780b) && v.k(this.f4781c, zzqVar.f4781c) && v.k(this.f4782d, zzqVar.f4782d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4779a), this.f4780b, this.f4781c, this.f4782d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 8);
        parcel.writeLong(this.f4779a);
        b.G(parcel, 2, this.f4780b.i(), false);
        b.G(parcel, 3, this.f4781c.i(), false);
        b.G(parcel, 4, this.f4782d.i(), false);
        b.W(parcel, V);
    }
}
