package com.google.android.gms.fido.fido2.api.common;

import R9.C1557h;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C1557h();

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f32976a;

    public zzai(byte[][] bArr) {
        AbstractC3191o.a(bArr != null);
        AbstractC3191o.a(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            AbstractC3191o.a(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            AbstractC3191o.a(bArr[i11] != null);
            int length = bArr[i11].length;
            AbstractC3191o.a(length == 32 || length == 64);
            i10 += 2;
        }
        this.f32976a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.f32976a, ((zzai) obj).f32976a);
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (byte[] bArr : this.f32976a) {
            i10 ^= AbstractC3189m.c(bArr);
        }
        return i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.m(parcel, 1, this.f32976a, false);
        E9.b.b(parcel, a10);
    }
}
