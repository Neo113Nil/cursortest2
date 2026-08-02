package h9;

/* loaded from: classes9.dex */
public final class n extends j {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f65115c;

    /* renamed from: d, reason: collision with root package name */
    private final int f65116d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65117e;

    public n(byte[] bArr, int i11, int i12, int i13, int i14) {
        super(i13, i14);
        if (i13 > i11 || i14 > i12) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f65115c = bArr;
        this.f65116d = i11;
        this.f65117e = i12;
    }

    @Override // h9.j
    public final byte[] b() {
        int d11 = d();
        int a11 = a();
        byte[] bArr = this.f65115c;
        int i11 = this.f65116d;
        if (d11 == i11 && a11 == this.f65117e) {
            return bArr;
        }
        int i12 = d11 * a11;
        byte[] bArr2 = new byte[i12];
        if (d11 == i11) {
            System.arraycopy(bArr, 0, bArr2, 0, i12);
            return bArr2;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < a11; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * d11, d11);
            i13 += i11;
        }
        return bArr2;
    }

    @Override // h9.j
    public final byte[] c(int i11, byte[] bArr) {
        if (i11 < 0 || i11 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i11)));
        }
        int d11 = d();
        if (bArr == null || bArr.length < d11) {
            bArr = new byte[d11];
        }
        System.arraycopy(this.f65115c, i11 * this.f65116d, bArr, 0, d11);
        return bArr;
    }
}
