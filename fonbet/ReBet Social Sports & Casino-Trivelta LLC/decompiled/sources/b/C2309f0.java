package b;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: b.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2309f0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24106a;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC2315l f24110e;

    /* renamed from: f, reason: collision with root package name */
    public InputStream f24111f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24108c = true;

    /* renamed from: d, reason: collision with root package name */
    public int f24109d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24107b = false;

    public C2309f0(C2306e c2306e) {
        this.f24106a = c2306e;
    }

    public final InterfaceC2315l d() {
        C2306e c2306e = this.f24106a;
        int read = c2306e.f24098a.read();
        InterfaceC2323t a10 = read < 0 ? null : c2306e.a(read);
        if (a10 == null) {
            if (!this.f24107b || this.f24109d == 0) {
                return null;
            }
            throw new IOException("expected octet-aligned bitstring, but found padBits: " + this.f24109d);
        }
        if (a10 instanceof InterfaceC2315l) {
            if (this.f24109d == 0) {
                return (InterfaceC2315l) a10;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        throw new IOException("unknown object encountered: " + a10.getClass());
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.f24111f == null) {
            if (!this.f24108c) {
                return -1;
            }
            InterfaceC2315l d10 = d();
            this.f24110e = d10;
            if (d10 == null) {
                return -1;
            }
            this.f24108c = false;
            this.f24111f = d10.a();
        }
        while (true) {
            int read = this.f24111f.read();
            if (read >= 0) {
                return read;
            }
            this.f24109d = this.f24110e.e();
            InterfaceC2315l d11 = d();
            this.f24110e = d11;
            if (d11 == null) {
                this.f24111f = null;
                return -1;
            }
            this.f24111f = d11.a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (this.f24111f == null) {
            if (!this.f24108c) {
                return -1;
            }
            InterfaceC2315l d10 = d();
            this.f24110e = d10;
            if (d10 == null) {
                return -1;
            }
            this.f24108c = false;
            this.f24111f = d10.a();
        }
        while (true) {
            int read = this.f24111f.read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                this.f24109d = this.f24110e.e();
                InterfaceC2315l d11 = d();
                this.f24110e = d11;
                if (d11 == null) {
                    this.f24111f = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f24111f = d11.a();
            }
        }
    }
}
