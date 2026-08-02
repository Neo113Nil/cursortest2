package k7;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.ByteCompanionObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d1 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f18851a;

    /* renamed from: b, reason: collision with root package name */
    public c1 f18852b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f18853c = new byte[8];

    /* renamed from: d, reason: collision with root package name */
    public final i2.d f18854d = new i2.d((byte) 0, 13);

    public d1(ByteArrayInputStream byteArrayInputStream) {
        this.f18851a = byteArrayInputStream;
    }

    public final void C(int i5, byte[] bArr) {
        int i10 = 0;
        while (i10 != i5) {
            int read = this.f18851a.read(bArr, i10, i5 - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
        this.f18852b = null;
    }

    public final byte[] J() {
        y();
        long w10 = w();
        if (w10 < 0 || w10 > 2147483647L) {
            throw new UnsupportedOperationException("the maximum supported byte/text string length is 2147483647 bytes");
        }
        if (this.f18851a.available() < w10) {
            throw new EOFException();
        }
        int i5 = (int) w10;
        byte[] bArr = new byte[i5];
        C(i5, bArr);
        return bArr;
    }

    public final long c() {
        z(ByteCompanionObject.MIN_VALUE);
        y();
        long w10 = w();
        if (w10 < 0) {
            throw new UnsupportedOperationException("the maximum supported array length is 9223372036854775807");
        }
        if (w10 > 0) {
            ((ArrayDeque) this.f18854d.f10882b).push(Long.valueOf(w10));
        }
        return w10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18851a.close();
        this.f18854d.F();
    }

    public final long k() {
        boolean z5;
        r();
        byte b10 = this.f18852b.f18848a;
        if (b10 == 0) {
            z5 = true;
        } else {
            if (b10 != 32) {
                throw new IllegalStateException(androidx.appcompat.widget.c1.i((this.f18852b.f18848a >> 5) & 7, "expected major type 0 or 1 but found "));
            }
            z5 = false;
        }
        long w10 = w();
        if (w10 >= 0) {
            return z5 ? w10 : ~w10;
        }
        throw new UnsupportedOperationException("the maximum supported unsigned/negative integer is 9223372036854775807");
    }

    public final long n() {
        z((byte) -96);
        y();
        long w10 = w();
        if (w10 < 0 || w10 > 4611686018427387903L) {
            throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
        }
        if (w10 > 0) {
            ((ArrayDeque) this.f18854d.f10882b).push(Long.valueOf(w10 + w10));
        }
        return w10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r0 != (-2)) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c1 r() {
        if (this.f18852b == null) {
            int read = this.f18851a.read();
            i2.d dVar = this.f18854d;
            if (read == -1) {
                dVar.F();
                return null;
            }
            c1 c1Var = new c1(read);
            this.f18852b = c1Var;
            long j = -2;
            byte b10 = c1Var.f18848a;
            if (b10 != Byte.MIN_VALUE && b10 != -96 && b10 != -64) {
                if (b10 != -32) {
                    if (b10 != 0 && b10 != 32) {
                        if (b10 == 64) {
                            dVar.G(-1L);
                        } else {
                            if (b10 != 96) {
                                throw new IllegalStateException(androidx.appcompat.widget.c1.i((this.f18852b.f18848a >> 5) & 7, "invalid major type: "));
                            }
                            dVar.G(-2L);
                        }
                        long H = dVar.H();
                        ArrayDeque arrayDeque = (ArrayDeque) dVar.f10882b;
                        if (H == 1) {
                            arrayDeque.pop();
                        } else if (H > 1) {
                            arrayDeque.pop();
                            arrayDeque.push(Long.valueOf(H - 1));
                        } else if (H == -4) {
                            arrayDeque.pop();
                            arrayDeque.push(-5L);
                        } else if (H == -5) {
                            arrayDeque.pop();
                            arrayDeque.push(-4L);
                        }
                    }
                } else if (c1Var.f18849b == 31) {
                    long H2 = dVar.H();
                    if (H2 >= 0) {
                        throw new IOException(d9.e.g(H2, "expected indefinite length scope but found "));
                    }
                    if (H2 == -5) {
                        throw new IOException("expected a value for dangling key in indefinite-length map");
                    }
                    ((ArrayDeque) dVar.f10882b).pop();
                }
            }
            long H3 = dVar.H();
            if (H3 == -1) {
                j = H3;
            }
            throw new IOException(d9.e.g(j, "expected non-string scope but found "));
        }
        return this.f18852b;
    }

    public final boolean t() {
        z((byte) -32);
        if (this.f18852b.f18849b > 24) {
            throw new IllegalStateException("expected simple value");
        }
        int w10 = (int) w();
        if (w10 == 20) {
            return false;
        }
        if (w10 == 21) {
            return true;
        }
        throw new IllegalStateException("expected FALSE or TRUE");
    }

    public final long w() {
        byte b10 = this.f18852b.f18849b;
        if (b10 < 24) {
            long j = b10;
            this.f18852b = null;
            return j;
        }
        if (b10 == 24) {
            int read = this.f18851a.read();
            if (read == -1) {
                throw new EOFException();
            }
            this.f18852b = null;
            return read & 255;
        }
        byte[] bArr = this.f18853c;
        if (b10 == 25) {
            C(2, bArr);
            return ((bArr[0] & 255) << 8) | (255 & bArr[1]);
        }
        if (b10 == 26) {
            C(4, bArr);
            return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        if (b10 != 27) {
            c1 c1Var = this.f18852b;
            throw new IOException(androidx.appcompat.widget.c1.j(c1Var.f18849b, "invalid additional information ", " for major type ", (c1Var.f18848a >> 5) & 7));
        }
        C(8, bArr);
        return ((bArr[0] & 255) << 56) | ((bArr[1] & 255) << 48) | ((bArr[2] & 255) << 40) | ((bArr[3] & 255) << 32) | ((bArr[4] & 255) << 24) | ((bArr[5] & 255) << 16) | ((bArr[6] & 255) << 8) | (bArr[7] & 255);
    }

    public final void y() {
        r();
        if (this.f18852b.f18849b == 31) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.i(this.f18852b.f18849b, "expected definite length but found "));
        }
    }

    public final void z(byte b10) {
        r();
        if (this.f18852b.f18848a != b10) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.j((b10 >> 5) & 7, "expected major type ", " but found ", (this.f18852b.f18848a >> 5) & 7));
        }
    }
}
