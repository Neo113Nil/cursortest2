package b;

import java.io.IOException;
import kotlin.UByte;
import okhttp3.HttpUrl;

/* renamed from: b.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2298a extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2323t[] f24085a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2323t[] f24086b;

    public AbstractC2298a() {
        InterfaceC2323t[] interfaceC2323tArr = C2326w.f24148d;
        this.f24085a = interfaceC2323tArr;
        this.f24086b = interfaceC2323tArr;
    }

    public static void k(InterfaceC2323t[] interfaceC2323tArr) {
        int i10;
        int length = interfaceC2323tArr.length;
        if (length < 2) {
            return;
        }
        InterfaceC2323t interfaceC2323t = interfaceC2323tArr[0];
        InterfaceC2323t interfaceC2323t2 = interfaceC2323tArr[1];
        try {
            byte[] g10 = interfaceC2323t.d().g();
            try {
                byte[] g11 = interfaceC2323t2.d().g();
                if (l(g11, g10)) {
                    interfaceC2323t2 = interfaceC2323t;
                    interfaceC2323t = interfaceC2323t2;
                    g11 = g10;
                    g10 = g11;
                }
                for (int i11 = 2; i11 < length; i11++) {
                    InterfaceC2323t interfaceC2323t3 = interfaceC2323tArr[i11];
                    try {
                        byte[] g12 = interfaceC2323t3.d().g();
                        if (l(g11, g12)) {
                            interfaceC2323tArr[i11 - 2] = interfaceC2323t;
                            interfaceC2323t = interfaceC2323t2;
                            g10 = g11;
                            interfaceC2323t2 = interfaceC2323t3;
                            g11 = g12;
                        } else if (l(g10, g12)) {
                            interfaceC2323tArr[i11 - 2] = interfaceC2323t;
                            interfaceC2323t = interfaceC2323t3;
                            g10 = g12;
                        } else {
                            int i12 = i11 - 1;
                            while (true) {
                                i10 = i12 - 1;
                                if (i10 <= 0) {
                                    break;
                                }
                                InterfaceC2323t interfaceC2323t4 = interfaceC2323tArr[i12 - 2];
                                try {
                                    if (l(interfaceC2323t4.d().g(), g12)) {
                                        break;
                                    }
                                    interfaceC2323tArr[i10] = interfaceC2323t4;
                                    i12 = i10;
                                } catch (IOException unused) {
                                    throw new IllegalArgumentException("cannot encode object added to SET");
                                }
                            }
                            interfaceC2323tArr[i10] = interfaceC2323t3;
                        }
                    } catch (IOException unused2) {
                        throw new IllegalArgumentException("cannot encode object added to SET");
                    }
                }
                interfaceC2323tArr[length - 2] = interfaceC2323t;
                interfaceC2323tArr[length - 1] = interfaceC2323t2;
            } catch (IOException unused3) {
                throw new IllegalArgumentException("cannot encode object added to SET");
            }
        } catch (IOException unused4) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static boolean l(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & 223;
        int i11 = bArr2[0] & 223;
        if (i10 != i11) {
            return i10 < i11;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < min; i12++) {
            byte b10 = bArr[i12];
            byte b11 = bArr2[i12];
            if (b10 != b11) {
                return (b10 & UByte.MAX_VALUE) < (b11 & UByte.MAX_VALUE);
            }
        }
        return (bArr[min] & UByte.MAX_VALUE) <= (bArr2[min] & UByte.MAX_VALUE);
    }

    @Override // b.w0
    public final boolean c(w0 w0Var) {
        if (!(w0Var instanceof AbstractC2298a)) {
            return false;
        }
        AbstractC2298a abstractC2298a = (AbstractC2298a) w0Var;
        int length = this.f24085a.length;
        if (abstractC2298a.f24085a.length != length) {
            return false;
        }
        C2277E c2277e = (C2277E) h();
        C2277E c2277e2 = (C2277E) abstractC2298a.h();
        for (int i10 = 0; i10 < length; i10++) {
            w0 d10 = c2277e.f24085a[i10].d();
            w0 d11 = c2277e2.f24085a[i10].d();
            if (d10 != d11 && !d10.c(d11)) {
                return false;
            }
        }
        return true;
    }

    @Override // b.w0
    public final boolean f() {
        return true;
    }

    @Override // b.w0
    public w0 h() {
        if (this.f24086b == null) {
            InterfaceC2323t[] interfaceC2323tArr = (InterfaceC2323t[]) this.f24085a.clone();
            this.f24086b = interfaceC2323tArr;
            k(interfaceC2323tArr);
        }
        return new C2277E(this.f24086b);
    }

    @Override // b.w0
    public final int hashCode() {
        int length = this.f24085a.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i10;
            }
            i10 += this.f24085a[length].d().hashCode();
        }
    }

    @Override // b.w0
    public w0 i() {
        return new v0(this.f24085a, this.f24086b);
    }

    public final InterfaceC2323t j(int i10) {
        return this.f24085a[i10];
    }

    public final int m() {
        return this.f24085a.length;
    }

    public final String toString() {
        int length = this.f24085a.length;
        if (length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f24085a[i10]);
            i10++;
            if (i10 >= length) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    public AbstractC2298a(C2326w c2326w) {
        if (c2326w == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        InterfaceC2323t[] c10 = c2326w.c();
        this.f24085a = c10;
        this.f24086b = c10.length >= 2 ? null : c10;
    }

    public AbstractC2298a(boolean z10, InterfaceC2323t[] interfaceC2323tArr) {
        this.f24085a = interfaceC2323tArr;
        if (!z10 && interfaceC2323tArr.length >= 2) {
            interfaceC2323tArr = null;
        }
        this.f24086b = interfaceC2323tArr;
    }

    public AbstractC2298a(InterfaceC2323t[] interfaceC2323tArr, InterfaceC2323t[] interfaceC2323tArr2) {
        this.f24085a = interfaceC2323tArr;
        this.f24086b = interfaceC2323tArr2;
    }
}
