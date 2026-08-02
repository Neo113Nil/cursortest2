package org.spongycastle.asn1;

import java.io.InputStream;

/* loaded from: classes5.dex */
public class M extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final C5945x f62233a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f62234b = true;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f62235c;

    public M(C5945x c5945x) {
        this.f62233a = c5945x;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        InterfaceC5938p interfaceC5938p;
        int i12 = 0;
        if (this.f62235c == null) {
            if (!this.f62234b || (interfaceC5938p = (InterfaceC5938p) this.f62233a.b()) == null) {
                return -1;
            }
            this.f62234b = false;
            this.f62235c = interfaceC5938p.getOctetStream();
        }
        while (true) {
            int read = this.f62235c.read(bArr, i10 + i12, i11 - i12);
            if (read >= 0) {
                i12 += read;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                InterfaceC5938p interfaceC5938p2 = (InterfaceC5938p) this.f62233a.b();
                if (interfaceC5938p2 == null) {
                    this.f62235c = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f62235c = interfaceC5938p2.getOctetStream();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        InterfaceC5938p interfaceC5938p;
        if (this.f62235c == null) {
            if (!this.f62234b || (interfaceC5938p = (InterfaceC5938p) this.f62233a.b()) == null) {
                return -1;
            }
            this.f62234b = false;
            this.f62235c = interfaceC5938p.getOctetStream();
        }
        while (true) {
            int read = this.f62235c.read();
            if (read >= 0) {
                return read;
            }
            InterfaceC5938p interfaceC5938p2 = (InterfaceC5938p) this.f62233a.b();
            if (interfaceC5938p2 == null) {
                this.f62235c = null;
                return -1;
            }
            this.f62235c = interfaceC5938p2.getOctetStream();
        }
    }
}
