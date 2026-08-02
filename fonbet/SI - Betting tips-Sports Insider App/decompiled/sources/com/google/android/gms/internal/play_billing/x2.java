package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x2 extends y2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f5634d;

    public x2(int i5, byte[] bArr) {
        super(bArr);
        y2.d(0, i5, bArr.length);
        this.f5634d = i5;
    }

    @Override // com.google.android.gms.internal.play_billing.y2
    public final byte a(int i5) {
        int i10 = this.f5634d;
        if (((i10 - (i5 + 1)) | i5) >= 0) {
            return this.f5656b[i5];
        }
        if (i5 < 0) {
            throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.i(i5, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.appcompat.widget.c1.j(i5, "Index > length: ", ", ", i10));
    }

    @Override // com.google.android.gms.internal.play_billing.y2
    public final byte b(int i5) {
        return this.f5656b[i5];
    }

    @Override // com.google.android.gms.internal.play_billing.y2
    public final int c() {
        return this.f5634d;
    }
}
