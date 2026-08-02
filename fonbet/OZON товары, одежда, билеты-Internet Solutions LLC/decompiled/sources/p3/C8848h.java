package p3;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: p3.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8848h extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8846f f80061a;

    /* renamed from: b, reason: collision with root package name */
    private final i f80062b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f80064d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f80065e = false;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f80063c = new byte[1];

    public C8848h(InterfaceC8846f interfaceC8846f, i iVar) {
        this.f80061a = interfaceC8846f;
        this.f80062b = iVar;
    }

    public final void c() throws IOException {
        if (this.f80064d) {
            return;
        }
        this.f80061a.open(this.f80062b);
        this.f80064d = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f80065e) {
            return;
        }
        this.f80061a.close();
        this.f80065e = true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f80063c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        G10.a.h(!this.f80065e);
        boolean z11 = this.f80064d;
        InterfaceC8846f interfaceC8846f = this.f80061a;
        if (!z11) {
            interfaceC8846f.open(this.f80062b);
            this.f80064d = true;
        }
        int read = interfaceC8846f.read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        return read;
    }
}
