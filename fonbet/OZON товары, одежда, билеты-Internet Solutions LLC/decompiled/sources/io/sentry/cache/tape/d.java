package io.sentry.cache.tape;

import P4.f;
import T7.E;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Closeable, Iterable<byte[]> {

    /* renamed from: k, reason: collision with root package name */
    private static final byte[] f67806k = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    RandomAccessFile f67807a;

    /* renamed from: b, reason: collision with root package name */
    final File f67808b;

    /* renamed from: c, reason: collision with root package name */
    long f67809c;

    /* renamed from: d, reason: collision with root package name */
    int f67810d;

    /* renamed from: e, reason: collision with root package name */
    b f67811e;

    /* renamed from: f, reason: collision with root package name */
    private b f67812f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f67813g = new byte[32];

    /* renamed from: h, reason: collision with root package name */
    int f67814h = 0;

    /* renamed from: i, reason: collision with root package name */
    private final int f67815i;

    /* renamed from: j, reason: collision with root package name */
    boolean f67816j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final File f67817a;

        /* renamed from: b, reason: collision with root package name */
        int f67818b = -1;

        public a(File file) {
            this.f67817a = file;
        }

        public final d a() throws IOException {
            File file = this.f67817a;
            RandomAccessFile o11 = d.o(file);
            try {
                return new d(file, o11, this.f67818b);
            } catch (Throwable th2) {
                o11.close();
                throw th2;
            }
        }

        public final void b(int i11) {
            this.f67818b = i11;
        }
    }

    static final class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f67819c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final long f67820a;

        /* renamed from: b, reason: collision with root package name */
        final int f67821b;

        b(long j11, int i11) {
            this.f67820a = j11;
            this.f67821b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.class.getSimpleName());
            sb2.append("[position=");
            sb2.append(this.f67820a);
            sb2.append(", length=");
            return K00.b.e(this.f67821b, "]", sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    final class c implements Iterator<byte[]> {

        /* renamed from: a, reason: collision with root package name */
        int f67822a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f67823b;

        /* renamed from: c, reason: collision with root package name */
        int f67824c;

        c() {
            this.f67823b = d.this.f67811e.f67820a;
            this.f67824c = d.this.f67814h;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            d dVar = d.this;
            if (dVar.f67816j) {
                throw new IllegalStateException("closed");
            }
            if (dVar.f67814h == this.f67824c) {
                return this.f67822a != dVar.f67810d;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final byte[] next() {
            d dVar = d.this;
            if (dVar.f67816j) {
                throw new IllegalStateException("closed");
            }
            if (dVar.f67814h != this.f67824c) {
                throw new ConcurrentModificationException();
            }
            int i11 = dVar.f67810d;
            if (i11 == 0) {
                throw new NoSuchElementException();
            }
            if (this.f67822a >= i11) {
                throw new NoSuchElementException();
            }
            try {
                b q11 = dVar.q(this.f67823b);
                int i12 = q11.f67821b;
                long j11 = q11.f67820a;
                byte[] bArr = new byte[i12];
                long j12 = j11 + 4;
                long B11 = dVar.B(j12);
                this.f67823b = B11;
                if (!dVar.x(bArr, B11, i12)) {
                    this.f67822a = dVar.f67810d;
                    return d.f67806k;
                }
                this.f67823b = dVar.B(j12 + i12);
                this.f67822a++;
                return bArr;
            } catch (IOException e11) {
                throw e11;
            } catch (OutOfMemoryError unused) {
                dVar.w();
                this.f67822a = dVar.f67810d;
                return d.f67806k;
            }
        }

        @Override // java.util.Iterator
        public final void remove() {
            d dVar = d.this;
            if (dVar.f67814h != this.f67824c) {
                throw new ConcurrentModificationException();
            }
            if (dVar.f67810d == 0) {
                throw new NoSuchElementException();
            }
            if (this.f67822a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            dVar.v(1);
            this.f67824c = dVar.f67814h;
            this.f67822a--;
        }
    }

    d(File file, RandomAccessFile randomAccessFile, int i11) throws IOException {
        this.f67808b = file;
        this.f67807a = randomAccessFile;
        this.f67815i = i11;
        r();
    }

    private void I(long j11, int i11, long j12, long j13) throws IOException {
        this.f67807a.seek(0L);
        byte[] bArr = this.f67813g;
        L(0, -2147483647, bArr);
        O(bArr, j11, 4);
        L(12, i11, bArr);
        O(bArr, j12, 16);
        O(bArr, j13, 24);
        this.f67807a.write(bArr, 0, 32);
    }

    private static void L(int i11, int i12, byte[] bArr) {
        bArr[i11] = (byte) (i12 >> 24);
        bArr[i11 + 1] = (byte) (i12 >> 16);
        bArr[i11 + 2] = (byte) (i12 >> 8);
        bArr[i11 + 3] = (byte) i12;
    }

    private static void O(byte[] bArr, long j11, int i11) {
        bArr[i11] = (byte) (j11 >> 56);
        bArr[i11 + 1] = (byte) (j11 >> 48);
        bArr[i11 + 2] = (byte) (j11 >> 40);
        bArr[i11 + 3] = (byte) (j11 >> 32);
        bArr[i11 + 4] = (byte) (j11 >> 24);
        bArr[i11 + 5] = (byte) (j11 >> 16);
        bArr[i11 + 6] = (byte) (j11 >> 8);
        bArr[i11 + 7] = (byte) j11;
    }

    static RandomAccessFile o(File file) throws IOException {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                randomAccessFile.writeInt(-2147483647);
                randomAccessFile.writeLong(4096L);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        return new RandomAccessFile(file, "rwd");
    }

    private void r() throws IOException {
        this.f67807a.seek(0L);
        RandomAccessFile randomAccessFile = this.f67807a;
        byte[] bArr = this.f67813g;
        randomAccessFile.readFully(bArr);
        this.f67809c = t(4, bArr);
        this.f67810d = s(12, bArr);
        long t2 = t(16, bArr);
        long t11 = t(24, bArr);
        if (this.f67809c > this.f67807a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f67809c + ", Actual length: " + this.f67807a.length());
        }
        if (this.f67809c <= 32) {
            throw new IOException(f.a(this.f67809c, ") is invalid.", new StringBuilder("File is corrupt; length stored in header (")));
        }
        this.f67811e = q(t2);
        this.f67812f = q(t11);
    }

    private static int s(int i11, byte[] bArr) {
        return ((bArr[i11] & 255) << 24) + ((bArr[i11 + 1] & 255) << 16) + ((bArr[i11 + 2] & 255) << 8) + (bArr[i11 + 3] & 255);
    }

    private static long t(int i11, byte[] bArr) {
        return ((bArr[i11] & 255) << 56) + ((bArr[i11 + 1] & 255) << 48) + ((bArr[i11 + 2] & 255) << 40) + ((bArr[i11 + 3] & 255) << 32) + ((bArr[i11 + 4] & 255) << 24) + ((bArr[i11 + 5] & 255) << 16) + ((bArr[i11 + 6] & 255) << 8) + (bArr[i11 + 7] & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() throws IOException {
        this.f67807a.close();
        File file = this.f67808b;
        file.delete();
        this.f67807a = o(file);
        r();
    }

    private void z(byte[] bArr, long j11, int i11) throws IOException {
        long B11 = B(j11);
        long j12 = i11 + B11;
        long j13 = this.f67809c;
        if (j12 <= j13) {
            this.f67807a.seek(B11);
            this.f67807a.write(bArr, 0, i11);
            return;
        }
        int i12 = (int) (j13 - B11);
        this.f67807a.seek(B11);
        this.f67807a.write(bArr, 0, i12);
        this.f67807a.seek(32L);
        this.f67807a.write(bArr, i12, i11 - i12);
    }

    final long B(long j11) {
        long j12 = this.f67809c;
        return j11 < j12 ? j11 : (j11 + 32) - j12;
    }

    public final void clear() throws IOException {
        if (this.f67816j) {
            throw new IllegalStateException("closed");
        }
        I(4096L, 0, 0L, 0L);
        this.f67807a.seek(32L);
        this.f67807a.write(f67806k, 0, 4064);
        this.f67810d = 0;
        b bVar = b.f67819c;
        this.f67811e = bVar;
        this.f67812f = bVar;
        if (this.f67809c > 4096) {
            this.f67807a.setLength(4096L);
            this.f67807a.getChannel().force(true);
        }
        this.f67809c = 4096L;
        this.f67814h++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f67816j = true;
        this.f67807a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator<byte[]> iterator() {
        return new c();
    }

    public final void m(int i11, byte[] bArr) throws IOException {
        long j11;
        long j12;
        long j13;
        long B11;
        long j14;
        long j15;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if (i11 < 0 || i11 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f67816j) {
            throw new IllegalStateException("closed");
        }
        int i12 = this.f67815i;
        if (i12 != -1 && this.f67810d == i12) {
            v(1);
        }
        long j16 = i11 + 4;
        long j17 = this.f67809c;
        if (this.f67810d == 0) {
            j11 = 4;
            j13 = 32;
            j12 = 32;
        } else {
            b bVar = this.f67812f;
            long j18 = bVar.f67820a;
            j11 = 4;
            long j19 = this.f67811e.f67820a;
            int i13 = bVar.f67821b;
            if (j18 >= j19) {
                j13 = (j18 - j19) + 4 + i13 + 32;
                j12 = 32;
            } else {
                j12 = 32;
                j13 = (((j18 + 4) + i13) + j17) - j19;
            }
        }
        long j21 = j17 - j13;
        if (j21 < j16) {
            do {
                j21 += j17;
                j17 <<= 1;
            } while (j21 < j16);
            this.f67807a.setLength(j17);
            this.f67807a.getChannel().force(true);
            long B12 = B(this.f67812f.f67820a + j11 + r1.f67821b);
            if (B12 <= this.f67811e.f67820a) {
                FileChannel channel = this.f67807a.getChannel();
                channel.position(this.f67809c);
                j14 = B12 - j12;
                if (channel.transferTo(32L, j14, channel) != j14) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            } else {
                j14 = 0;
            }
            long j22 = this.f67812f.f67820a;
            long j23 = this.f67811e.f67820a;
            if (j22 < j23) {
                long j24 = (this.f67809c + j22) - j12;
                j15 = j17;
                I(j15, this.f67810d, j23, j24);
                this.f67812f = new b(j24, this.f67812f.f67821b);
            } else {
                j15 = j17;
                I(j15, this.f67810d, j23, j22);
            }
            this.f67809c = j15;
            long j25 = j12;
            long j26 = j14;
            while (j26 > 0) {
                int min = (int) Math.min(j26, 4096);
                z(f67806k, j25, min);
                long j27 = min;
                j26 -= j27;
                j25 += j27;
            }
        }
        boolean z11 = this.f67810d == 0;
        if (z11) {
            B11 = j12;
        } else {
            B11 = B(this.f67812f.f67820a + j11 + r1.f67821b);
        }
        b bVar2 = new b(B11, i11);
        byte[] bArr2 = this.f67813g;
        L(0, i11, bArr2);
        z(bArr2, B11, 4);
        z(bArr, B11 + j11, i11);
        I(this.f67809c, this.f67810d + 1, z11 ? B11 : this.f67811e.f67820a, B11);
        this.f67812f = bVar2;
        this.f67810d++;
        this.f67814h++;
        if (z11) {
            this.f67811e = bVar2;
        }
    }

    final b q(long j11) throws IOException {
        b bVar = b.f67819c;
        if (j11 != 0) {
            byte[] bArr = this.f67813g;
            if (x(bArr, j11, 4)) {
                return new b(j11, s(0, bArr));
            }
        }
        return bVar;
    }

    public final String toString() {
        return "QueueFile{file=" + this.f67808b + ", zero=true, length=" + this.f67809c + ", size=" + this.f67810d + ", first=" + this.f67811e + ", last=" + this.f67812f + '}';
    }

    public final void v(int i11) throws IOException {
        if (i11 < 0) {
            throw new IllegalArgumentException(E.a(i11, "Cannot remove negative (", ") number of elements."));
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f67810d;
        if (i11 == i12) {
            clear();
            return;
        }
        if (i12 == 0) {
            throw new NoSuchElementException();
        }
        if (i11 > i12) {
            throw new IllegalArgumentException(K00.b.e(this.f67810d, ").", f.f(i11, "Cannot remove more elements (", ") than present in queue (")));
        }
        b bVar = this.f67811e;
        long j11 = bVar.f67820a;
        int i13 = bVar.f67821b;
        long j12 = j11;
        long j13 = 0;
        for (int i14 = 0; i14 < i11; i14++) {
            j13 += i13 + 4;
            j12 = B(j12 + 4 + i13);
            byte[] bArr = this.f67813g;
            if (!x(bArr, j12, 4)) {
                return;
            }
            i13 = s(0, bArr);
        }
        I(this.f67809c, this.f67810d - i11, j12, this.f67812f.f67820a);
        this.f67810d -= i11;
        this.f67814h++;
        this.f67811e = new b(j12, i13);
        while (j13 > 0) {
            int min = (int) Math.min(j13, 4096);
            z(f67806k, j11, min);
            long j14 = min;
            j13 -= j14;
            j11 += j14;
        }
    }

    final boolean x(byte[] bArr, long j11, int i11) throws IOException {
        try {
            long B11 = B(j11);
            long j12 = i11 + B11;
            long j13 = this.f67809c;
            if (j12 <= j13) {
                this.f67807a.seek(B11);
                this.f67807a.readFully(bArr, 0, i11);
                return true;
            }
            int i12 = (int) (j13 - B11);
            this.f67807a.seek(B11);
            this.f67807a.readFully(bArr, 0, i12);
            this.f67807a.seek(32L);
            this.f67807a.readFully(bArr, i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            w();
            return false;
        } catch (IOException e11) {
            throw e11;
        } catch (Throwable unused2) {
            w();
            return false;
        }
    }
}
