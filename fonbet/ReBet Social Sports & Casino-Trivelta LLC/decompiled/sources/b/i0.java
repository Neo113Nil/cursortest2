package b;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class i0 extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final C2306e f24119a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24120b = true;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f24121c;

    public i0(C2306e c2306e) {
        this.f24119a = c2306e;
    }

    public final n0 d() {
        C2306e c2306e = this.f24119a;
        int read = c2306e.f24098a.read();
        InterfaceC2323t a10 = read < 0 ? null : c2306e.a(read);
        if (a10 == null) {
            return null;
        }
        if (a10 instanceof n0) {
            return (n0) a10;
        }
        throw new IOException("unknown object encountered: " + a10.getClass());
    }

    @Override // java.io.InputStream
    public final int read() {
        n0 d10;
        if (this.f24121c == null) {
            if (!this.f24120b || (d10 = d()) == null) {
                return -1;
            }
            this.f24120b = false;
            this.f24121c = d10.c();
        }
        while (true) {
            int read = this.f24121c.read();
            if (read >= 0) {
                return read;
            }
            n0 d11 = d();
            if (d11 == null) {
                this.f24121c = null;
                return -1;
            }
            this.f24121c = d11.c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        n0 d10;
        int i12 = 0;
        if (this.f24121c == null) {
            if (!this.f24120b || (d10 = d()) == null) {
                return -1;
            }
            this.f24120b = false;
            this.f24121c = d10.c();
        }
        while (true) {
            int read = this.f24121c.read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                n0 d11 = d();
                if (d11 == null) {
                    this.f24121c = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f24121c = d11.c();
            }
        }
    }
}
