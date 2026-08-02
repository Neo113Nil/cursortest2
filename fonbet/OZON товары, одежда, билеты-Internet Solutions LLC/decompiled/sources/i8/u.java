package i8;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes9.dex */
final class u extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private s f66146a;

    /* renamed from: b, reason: collision with root package name */
    private int f66147b;

    /* renamed from: c, reason: collision with root package name */
    ByteBuffer f66148c;

    /* renamed from: d, reason: collision with root package name */
    ByteBuffer f66149d;

    /* renamed from: e, reason: collision with root package name */
    boolean f66150e;

    public u(n nVar, OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(outputStream);
        s h11 = nVar.h(bArr);
        this.f66146a = h11;
        int f7 = nVar.f();
        this.f66147b = f7;
        ByteBuffer allocate = ByteBuffer.allocate(f7);
        this.f66148c = allocate;
        this.f66149d = ByteBuffer.allocate(nVar.d());
        allocate.limit(f7 - nVar.c());
        ByteBuffer header = h11.getHeader();
        byte[] bArr2 = new byte[header.remaining()];
        header.get(bArr2);
        ((FilterOutputStream) this).out.write(bArr2);
        this.f66150e = true;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f66150e) {
            try {
                this.f66148c.flip();
                this.f66149d.clear();
                this.f66146a.b(this.f66148c, this.f66149d);
                this.f66149d.flip();
                ((FilterOutputStream) this).out.write(this.f66149d.array(), this.f66149d.position(), this.f66149d.remaining());
                this.f66150e = false;
                super.close();
            } catch (GeneralSecurityException e11) {
                throw new IOException("ptBuffer.remaining():" + this.f66148c.remaining() + " ctBuffer.remaining():" + this.f66149d.remaining(), e11);
            }
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i11) throws IOException {
        write(new byte[]{(byte) i11}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i11, int i12) throws IOException {
        try {
            if (this.f66150e) {
                while (i12 > this.f66148c.remaining()) {
                    int remaining = this.f66148c.remaining();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, i11, remaining);
                    i11 += remaining;
                    i12 -= remaining;
                    try {
                        this.f66148c.flip();
                        this.f66149d.clear();
                        this.f66146a.a(this.f66148c, wrap, this.f66149d);
                        this.f66149d.flip();
                        ((FilterOutputStream) this).out.write(this.f66149d.array(), this.f66149d.position(), this.f66149d.remaining());
                        this.f66148c.clear();
                        this.f66148c.limit(this.f66147b);
                    } catch (GeneralSecurityException e11) {
                        throw new IOException(e11);
                    }
                }
                this.f66148c.put(bArr, i11, i12);
            } else {
                throw new IOException("Trying to write to closed stream");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
