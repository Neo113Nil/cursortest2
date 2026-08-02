package h9;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final int f65108a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65109b;

    protected j(int i11, int i12) {
        this.f65108a = i11;
        this.f65109b = i12;
    }

    public final int a() {
        return this.f65109b;
    }

    public abstract byte[] b();

    public abstract byte[] c(int i11, byte[] bArr);

    public final int d() {
        return this.f65108a;
    }

    public boolean e() {
        return false;
    }

    public j f() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i11 = this.f65108a;
        byte[] bArr = new byte[i11];
        int i12 = this.f65109b;
        StringBuilder sb2 = new StringBuilder((i11 + 1) * i12);
        for (int i13 = 0; i13 < i12; i13++) {
            bArr = c(i13, bArr);
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = bArr[i14] & 255;
                sb2.append(i15 < 64 ? '#' : i15 < 128 ? '+' : i15 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
