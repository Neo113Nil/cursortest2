package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class v4 extends w4 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5283d;

    public v4(int i5, byte[] bArr) {
        super(bArr);
        w4.e(0, i5, bArr.length);
        this.f5283d = i5;
    }

    @Override // com.google.android.gms.internal.measurement.w4
    public final byte a(int i5) {
        int i10 = this.f5283d;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.f5336b[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(r4.k.o(new StringBuilder(String.valueOf(i5).length() + 11), "Index < 0: ", i5));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 18 + String.valueOf(i10).length());
        sb2.append("Index > length: ");
        sb2.append(i5);
        sb2.append(", ");
        sb2.append(i10);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.w4
    public final byte b(int i5) {
        return this.f5336b[i5];
    }

    @Override // com.google.android.gms.internal.measurement.w4
    public final int c() {
        return this.f5283d;
    }
}
