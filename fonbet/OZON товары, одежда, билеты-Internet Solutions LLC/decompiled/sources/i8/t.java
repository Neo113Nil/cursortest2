package i8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes9.dex */
final class t extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f66134a;

    /* renamed from: b, reason: collision with root package name */
    private final ByteBuffer f66135b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66136c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f66137d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66138e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66139f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66140g;

    /* renamed from: h, reason: collision with root package name */
    private final byte[] f66141h;

    /* renamed from: i, reason: collision with root package name */
    private int f66142i;

    /* renamed from: j, reason: collision with root package name */
    private final r f66143j;

    /* renamed from: k, reason: collision with root package name */
    private final int f66144k;

    /* renamed from: l, reason: collision with root package name */
    private final int f66145l;

    public t(n nVar, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.f66143j = nVar.g();
        this.f66136c = nVar.e();
        this.f66141h = Arrays.copyOf(bArr, bArr.length);
        int d11 = nVar.d();
        this.f66144k = d11;
        ByteBuffer allocate = ByteBuffer.allocate(d11 + 1);
        this.f66134a = allocate;
        allocate.limit(0);
        this.f66145l = d11 - nVar.c();
        ByteBuffer allocate2 = ByteBuffer.allocate(nVar.f() + 16);
        this.f66135b = allocate2;
        allocate2.limit(0);
        this.f66137d = false;
        this.f66138e = false;
        this.f66139f = false;
        this.f66142i = 0;
        this.f66140g = false;
    }

    private void c() throws IOException {
        byte b11;
        while (!this.f66138e && this.f66134a.remaining() > 0) {
            int read = ((FilterInputStream) this).in.read(this.f66134a.array(), this.f66134a.position(), this.f66134a.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.f66134a;
                byteBuffer.position(byteBuffer.position() + read);
            } else {
                if (read != -1) {
                    if (read != 0) {
                        throw new IOException("Unexpected return value from in.read");
                    }
                    throw new IOException("Could not read bytes from the ciphertext stream");
                }
                this.f66138e = true;
            }
        }
        if (this.f66138e) {
            b11 = 0;
        } else {
            ByteBuffer byteBuffer2 = this.f66134a;
            b11 = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.f66134a;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.f66134a.flip();
        this.f66135b.clear();
        try {
            this.f66143j.b(this.f66134a, this.f66142i, this.f66138e, this.f66135b);
            this.f66142i++;
            this.f66135b.flip();
            this.f66134a.clear();
            if (this.f66138e) {
                return;
            }
            this.f66134a.clear();
            this.f66134a.limit(this.f66144k + 1);
            this.f66134a.put(b11);
        } catch (GeneralSecurityException e11) {
            this.f66140g = true;
            this.f66135b.limit(0);
            throw new IOException(e11.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.f66142i + " endOfCiphertext:" + this.f66138e, e11);
        }
    }

    private void d() throws IOException {
        if (this.f66137d) {
            this.f66140g = true;
            this.f66135b.limit(0);
            throw new IOException("Decryption failed.");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.f66136c);
        while (allocate.remaining() > 0) {
            int read = ((FilterInputStream) this).in.read(allocate.array(), allocate.position(), allocate.remaining());
            if (read < 0) {
                this.f66140g = true;
                this.f66135b.limit(0);
                throw new IOException("Ciphertext is too short");
            }
            if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
            allocate.position(allocate.position() + read);
        }
        allocate.flip();
        try {
            this.f66143j.a(allocate, this.f66141h);
            this.f66137d = true;
        } catch (GeneralSecurityException e11) {
            throw new IOException(e11);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.f66135b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i11) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read == -1) {
            return read;
        }
        throw new IOException("Reading failed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        int read;
        long j12 = this.f66144k;
        if (j11 <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j12, j11);
        byte[] bArr = new byte[min];
        long j13 = j11;
        while (j13 > 0 && (read = read(bArr, 0, (int) Math.min(min, j13))) > 0) {
            j13 -= read;
        }
        return j11 - j13;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.f66142i + "\nciphertextSegmentSize:" + this.f66144k + "\nheaderRead:" + this.f66137d + "\nendOfCiphertext:" + this.f66138e + "\nendOfPlaintext:" + this.f66139f + "\ndecryptionErrorOccured:" + this.f66140g + "\nciphertextSgement position:" + this.f66134a.position() + " limit:" + this.f66134a.limit() + "\nplaintextSegment position:" + this.f66135b.position() + " limit:" + this.f66135b.limit();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            if (!this.f66140g) {
                if (!this.f66137d) {
                    d();
                    this.f66134a.clear();
                    this.f66134a.limit(this.f66145l + 1);
                }
                if (this.f66139f) {
                    return -1;
                }
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        break;
                    }
                    if (this.f66135b.remaining() == 0) {
                        if (this.f66138e) {
                            this.f66139f = true;
                            break;
                        }
                        c();
                    }
                    int min = Math.min(this.f66135b.remaining(), i12 - i13);
                    this.f66135b.get(bArr, i13 + i11, min);
                    i13 += min;
                }
                if (i13 == 0 && this.f66139f) {
                    return -1;
                }
                return i13;
            }
            throw new IOException("Decryption failed.");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
