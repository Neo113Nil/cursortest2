package nj;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: nj.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5745f implements AlgorithmParameterSpec {

    /* renamed from: a, reason: collision with root package name */
    public int f58585a;

    /* renamed from: b, reason: collision with root package name */
    public int f58586b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f58587c;
    private byte[] derivation;
    private byte[] encoding;
    private byte[] nonce;

    public C5745f(byte[] bArr, byte[] bArr2, int i10) {
        this(bArr, bArr2, i10, -1, null, false);
    }

    public int a() {
        return this.f58586b;
    }

    public byte[] b() {
        return Aj.a.d(this.derivation);
    }

    public byte[] c() {
        return Aj.a.d(this.encoding);
    }

    public int d() {
        return this.f58585a;
    }

    public byte[] e() {
        return Aj.a.d(this.nonce);
    }

    public boolean f() {
        return this.f58587c;
    }

    public C5745f(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3) {
        this(bArr, bArr2, i10, i11, bArr3, false);
    }

    public C5745f(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, boolean z10) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.derivation = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.derivation = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.encoding = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.encoding = null;
        }
        this.f58585a = i10;
        this.f58586b = i11;
        this.nonce = Aj.a.d(bArr3);
        this.f58587c = z10;
    }
}
