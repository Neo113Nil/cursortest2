package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.v0;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.j0;
import k7.l0;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new n(18);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4827a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4828b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4829c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4830d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        v.h(bArr);
        this.f4827a = bArr;
        v.h(str);
        this.f4828b = str;
        v.h(bArr2);
        this.f4829c = bArr2;
        v.h(bArr3);
        this.f4830d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.f4827a, signResponseData.f4827a) && v.k(this.f4828b, signResponseData.f4828b) && Arrays.equals(this.f4829c, signResponseData.f4829c) && Arrays.equals(this.f4830d, signResponseData.f4830d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f4827a)), this.f4828b, Integer.valueOf(Arrays.hashCode(this.f4829c)), Integer.valueOf(Arrays.hashCode(this.f4830d))});
    }

    public final String toString() {
        v0 c2 = k7.a.c(this);
        j0 j0Var = l0.f18889d;
        byte[] bArr = this.f4827a;
        c2.a0(j0Var.c(bArr.length, bArr), "keyHandle");
        c2.a0(this.f4828b, "clientDataString");
        byte[] bArr2 = this.f4829c;
        c2.a0(j0Var.c(bArr2.length, bArr2), "signatureData");
        byte[] bArr3 = this.f4830d;
        c2.a0(j0Var.c(bArr3.length, bArr3), "application");
        return c2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.G(parcel, 2, this.f4827a, false);
        b.O(parcel, 3, this.f4828b, false);
        b.G(parcel, 4, this.f4829c, false);
        b.G(parcel, 5, this.f4830d, false);
        b.W(parcel, V);
    }
}
