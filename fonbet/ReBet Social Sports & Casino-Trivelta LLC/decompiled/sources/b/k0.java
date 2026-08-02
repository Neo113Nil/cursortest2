package b;

import b3.AbstractC2382a;
import b3.AbstractC2387f;
import e3.AbstractC4174e;
import e3.C4173d;
import e3.C4175f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class k0 extends w0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24131a;

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f24130d = new h0();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f24129c = new byte[0];

    public k0(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f24131a = bArr;
    }

    public static k0 j(InterfaceC2323t interfaceC2323t) {
        if (interfaceC2323t == null || (interfaceC2323t instanceof k0)) {
            return (k0) interfaceC2323t;
        }
        w0 d10 = interfaceC2323t.d();
        if (d10 instanceof k0) {
            return (k0) d10;
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(interfaceC2323t.getClass().getName()));
    }

    @Override // b.n0
    public final InputStream c() {
        return new ByteArrayInputStream(this.f24131a);
    }

    @Override // b.w0
    public w0 h() {
        return new C2317n(this.f24131a);
    }

    @Override // b.w0
    public final int hashCode() {
        return AbstractC2382a.c(this.f24131a);
    }

    @Override // b.w0
    public w0 i() {
        return new C2317n(this.f24131a);
    }

    public final byte[] k() {
        return this.f24131a;
    }

    public final String toString() {
        byte[] bArr = this.f24131a;
        C4175f c4175f = AbstractC4174e.f45642a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C4175f c4175f2 = AbstractC4174e.f45642a;
            c4175f2.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i10 = 0;
                while (length > 0) {
                    int min = Math.min(36, length);
                    int i11 = i10 + min;
                    int i12 = 0;
                    while (i10 < i11) {
                        int i13 = i10 + 1;
                        byte b10 = bArr[i10];
                        int i14 = b10 & UByte.MAX_VALUE;
                        int i15 = i12 + 1;
                        byte[] bArr3 = c4175f2.f45643a;
                        bArr2[i12] = bArr3[i14 >>> 4];
                        i12 += 2;
                        bArr2[i15] = bArr3[b10 & 15];
                        i10 = i13;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i12);
                    length -= min;
                    i10 = i11;
                }
            }
            return "#".concat(AbstractC2387f.a(byteArrayOutputStream.toByteArray()));
        } catch (Exception e10) {
            throw new C4173d("exception encoding Hex string: " + e10.getMessage(), e10);
        }
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (w0Var instanceof k0) {
            return Arrays.equals(this.f24131a, ((k0) w0Var).f24131a);
        }
        return false;
    }

    @Override // b.InterfaceC2310g
    public final w0 b() {
        return this;
    }
}
