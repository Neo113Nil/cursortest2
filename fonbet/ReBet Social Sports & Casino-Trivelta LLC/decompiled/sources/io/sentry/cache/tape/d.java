package io.sentry.cache.tape;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class d implements Closeable, Iterable {
    private static final byte[] ZEROES = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f51963a;

    /* renamed from: b, reason: collision with root package name */
    public final File f51964b;

    /* renamed from: d, reason: collision with root package name */
    public long f51966d;

    /* renamed from: e, reason: collision with root package name */
    public int f51967e;

    /* renamed from: f, reason: collision with root package name */
    public b f51968f;

    /* renamed from: g, reason: collision with root package name */
    public b f51969g;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f51971i;

    /* renamed from: j, reason: collision with root package name */
    public final int f51972j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f51973k;

    /* renamed from: c, reason: collision with root package name */
    public final int f51965c = 32;
    private final byte[] buffer = new byte[32];

    /* renamed from: h, reason: collision with root package name */
    public int f51970h = 0;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final File f51974a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f51975b = true;

        /* renamed from: c, reason: collision with root package name */
        public int f51976c = -1;

        public a(File file) {
            if (file == null) {
                throw new NullPointerException("file == null");
            }
            this.f51974a = file;
        }

        public d a() {
            RandomAccessFile m12 = d.m1(this.f51974a);
            try {
                return new d(this.f51974a, m12, this.f51975b, this.f51976c);
            } catch (Throwable th2) {
                m12.close();
                throw th2;
            }
        }

        public a b(int i10) {
            this.f51976c = i10;
            return this;
        }
    }

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f51977c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final long f51978a;

        /* renamed from: b, reason: collision with root package name */
        public final int f51979b;

        public b(long j10, int i10) {
            this.f51978a = j10;
            this.f51979b = i10;
        }

        public String toString() {
            return b.class.getSimpleName() + "[position=" + this.f51978a + ", length=" + this.f51979b + "]";
        }
    }

    public final class c implements Iterator {

        /* renamed from: a, reason: collision with root package name */
        public int f51980a = 0;

        /* renamed from: b, reason: collision with root package name */
        public long f51981b;

        /* renamed from: c, reason: collision with root package name */
        public int f51982c;

        public c() {
            this.f51981b = d.this.f51968f.f51978a;
            this.f51982c = d.this.f51970h;
        }

        public final void a() {
            if (d.this.f51970h != this.f51982c) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public byte[] next() {
            if (d.this.f51973k) {
                throw new IllegalStateException("closed");
            }
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f51980a;
            d dVar = d.this;
            if (i10 >= dVar.f51967e) {
                throw new NoSuchElementException();
            }
            try {
                try {
                    b T12 = dVar.T1(this.f51981b);
                    byte[] bArr = new byte[T12.f51979b];
                    long k22 = d.this.k2(T12.f51978a + 4);
                    this.f51981b = k22;
                    if (!d.this.g2(k22, bArr, 0, T12.f51979b)) {
                        this.f51980a = d.this.f51967e;
                        return d.ZEROES;
                    }
                    this.f51981b = d.this.k2(T12.f51978a + 4 + T12.f51979b);
                    this.f51980a++;
                    return bArr;
                } catch (IOException e10) {
                    throw ((Error) d.D0(e10));
                }
            } catch (IOException e11) {
                throw ((Error) d.D0(e11));
            } catch (OutOfMemoryError unused) {
                d.this.e2();
                this.f51980a = d.this.f51967e;
                return d.ZEROES;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (d.this.f51973k) {
                throw new IllegalStateException("closed");
            }
            a();
            return this.f51980a != d.this.f51967e;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            if (d.this.isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f51980a != 1) {
                throw new UnsupportedOperationException("Removal is only permitted from the head.");
            }
            try {
                d.this.c2();
                this.f51982c = d.this.f51970h;
                this.f51980a--;
            } catch (IOException e10) {
                throw ((Error) d.D0(e10));
            }
        }
    }

    public d(File file, RandomAccessFile randomAccessFile, boolean z10, int i10) {
        this.f51964b = file;
        this.f51963a = randomAccessFile;
        this.f51971i = z10;
        this.f51972j = i10;
        Y1();
    }

    public static int Z1(byte[] bArr, int i10) {
        return ((bArr[i10] & UByte.MAX_VALUE) << 24) + ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i10 + 3] & UByte.MAX_VALUE);
    }

    public static long a2(byte[] bArr, int i10) {
        return ((bArr[i10] & 255) << 56) + ((bArr[i10 + 1] & 255) << 48) + ((bArr[i10 + 2] & 255) << 40) + ((bArr[i10 + 3] & 255) << 32) + ((bArr[i10 + 4] & 255) << 24) + ((bArr[i10 + 5] & 255) << 16) + ((bArr[i10 + 6] & 255) << 8) + (bArr[i10 + 7] & 255);
    }

    public static RandomAccessFile m1(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile y12 = y1(file2);
            try {
                y12.setLength(4096L);
                y12.seek(0L);
                y12.writeInt(-2147483647);
                y12.writeLong(4096L);
                y12.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                y12.close();
                throw th2;
            }
        }
        return y1(file);
    }

    public static void m2(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void n2(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) (j10 >> 56);
        bArr[i10 + 1] = (byte) (j10 >> 48);
        bArr[i10 + 2] = (byte) (j10 >> 40);
        bArr[i10 + 3] = (byte) (j10 >> 32);
        bArr[i10 + 4] = (byte) (j10 >> 24);
        bArr[i10 + 5] = (byte) (j10 >> 16);
        bArr[i10 + 6] = (byte) (j10 >> 8);
        bArr[i10 + 7] = (byte) j10;
    }

    public static RandomAccessFile y1(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public final void A0(long j10) {
        long j11;
        long j12;
        long j13 = j10 + 4;
        long b22 = b2();
        if (b22 >= j13) {
            return;
        }
        long j14 = this.f51966d;
        do {
            b22 += j14;
            j14 <<= 1;
        } while (b22 < j13);
        i2(j14);
        long k22 = k2(this.f51969g.f51978a + 4 + r3.f51979b);
        if (k22 <= this.f51968f.f51978a) {
            FileChannel channel = this.f51963a.getChannel();
            channel.position(this.f51966d);
            j11 = k22 - 32;
            if (channel.transferTo(32L, j11, channel) != j11) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        } else {
            j11 = 0;
        }
        long j15 = this.f51969g.f51978a;
        long j16 = this.f51968f.f51978a;
        if (j15 < j16) {
            long j17 = (this.f51966d + j15) - 32;
            l2(j14, this.f51967e, j16, j17);
            this.f51969g = new b(j17, this.f51969g.f51979b);
            j12 = j14;
        } else {
            l2(j14, this.f51967e, j16, j15);
            j12 = j14;
        }
        this.f51966d = j12;
        if (this.f51971i) {
            f2(32L, j11);
        }
    }

    public void B(byte[] bArr, int i10, int i11) {
        long k22;
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f51973k) {
            throw new IllegalStateException("closed");
        }
        if (n1()) {
            c2();
        }
        A0(i11);
        boolean isEmpty = isEmpty();
        if (isEmpty) {
            k22 = 32;
        } else {
            k22 = k2(this.f51969g.f51978a + 4 + r1.f51979b);
        }
        b bVar = new b(k22, i11);
        m2(this.buffer, 0, i11);
        h2(bVar.f51978a, this.buffer, 0, 4);
        h2(bVar.f51978a + 4, bArr, i10, i11);
        l2(this.f51966d, this.f51967e + 1, isEmpty ? bVar.f51978a : this.f51968f.f51978a, bVar.f51978a);
        this.f51969g = bVar;
        this.f51967e++;
        this.f51970h++;
        if (isEmpty) {
            this.f51968f = bVar;
        }
    }

    public b T1(long j10) {
        return j10 == 0 ? b.f51977c : !g2(j10, this.buffer, 0, 4) ? b.f51977c : new b(j10, Z1(this.buffer, 0));
    }

    public final void Y1() {
        this.f51963a.seek(0L);
        this.f51963a.readFully(this.buffer);
        this.f51966d = a2(this.buffer, 4);
        this.f51967e = Z1(this.buffer, 12);
        long a22 = a2(this.buffer, 16);
        long a23 = a2(this.buffer, 24);
        if (this.f51966d > this.f51963a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f51966d + ", Actual length: " + this.f51963a.length());
        }
        if (this.f51966d > 32) {
            this.f51968f = T1(a22);
            this.f51969g = T1(a23);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f51966d + ") is invalid.");
        }
    }

    public final long b2() {
        return this.f51966d - j2();
    }

    public void c2() {
        d2(1);
    }

    public void clear() {
        if (this.f51973k) {
            throw new IllegalStateException("closed");
        }
        l2(4096L, 0, 0L, 0L);
        if (this.f51971i) {
            this.f51963a.seek(32L);
            this.f51963a.write(ZEROES, 0, 4064);
        }
        this.f51967e = 0;
        b bVar = b.f51977c;
        this.f51968f = bVar;
        this.f51969g = bVar;
        if (this.f51966d > 4096) {
            i2(4096L);
        }
        this.f51966d = 4096L;
        this.f51970h++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51973k = true;
        this.f51963a.close();
    }

    public void d2(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot remove negative (" + i10 + ") number of elements.");
        }
        if (i10 == 0) {
            return;
        }
        if (i10 == this.f51967e) {
            clear();
            return;
        }
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        if (i10 > this.f51967e) {
            throw new IllegalArgumentException("Cannot remove more elements (" + i10 + ") than present in queue (" + this.f51967e + ").");
        }
        b bVar = this.f51968f;
        long j10 = bVar.f51978a;
        int i11 = bVar.f51979b;
        long j11 = 0;
        int i12 = 0;
        long j12 = j10;
        while (i12 < i10) {
            j11 += i11 + 4;
            long k22 = k2(j12 + 4 + i11);
            if (!g2(k22, this.buffer, 0, 4)) {
                return;
            }
            i11 = Z1(this.buffer, 0);
            i12++;
            j12 = k22;
        }
        l2(this.f51966d, this.f51967e - i10, j12, this.f51969g.f51978a);
        this.f51967e -= i10;
        this.f51970h++;
        this.f51968f = new b(j12, i11);
        if (this.f51971i) {
            f2(j10, j11);
        }
    }

    public final void e2() {
        this.f51963a.close();
        this.f51964b.delete();
        this.f51963a = m1(this.f51964b);
        Y1();
    }

    public final void f2(long j10, long j11) {
        long j12 = j10;
        while (j11 > 0) {
            byte[] bArr = ZEROES;
            int min = (int) Math.min(j11, bArr.length);
            h2(j12, bArr, 0, min);
            long j13 = min;
            j11 -= j13;
            j12 += j13;
        }
    }

    public boolean g2(long j10, byte[] bArr, int i10, int i11) {
        try {
            long k22 = k2(j10);
            long j11 = i11 + k22;
            long j12 = this.f51966d;
            if (j11 <= j12) {
                this.f51963a.seek(k22);
                this.f51963a.readFully(bArr, i10, i11);
                return true;
            }
            int i12 = (int) (j12 - k22);
            this.f51963a.seek(k22);
            this.f51963a.readFully(bArr, i10, i12);
            this.f51963a.seek(32L);
            this.f51963a.readFully(bArr, i10 + i12, i11 - i12);
            return true;
        } catch (EOFException unused) {
            e2();
            return false;
        } catch (IOException e10) {
            throw e10;
        } catch (Throwable unused2) {
            e2();
            return false;
        }
    }

    public final void h2(long j10, byte[] bArr, int i10, int i11) {
        long k22 = k2(j10);
        long j11 = i11 + k22;
        long j12 = this.f51966d;
        if (j11 <= j12) {
            this.f51963a.seek(k22);
            this.f51963a.write(bArr, i10, i11);
            return;
        }
        int i12 = (int) (j12 - k22);
        this.f51963a.seek(k22);
        this.f51963a.write(bArr, i10, i12);
        this.f51963a.seek(32L);
        this.f51963a.write(bArr, i10 + i12, i11 - i12);
    }

    public final void i2(long j10) {
        this.f51963a.setLength(j10);
        this.f51963a.getChannel().force(true);
    }

    public boolean isEmpty() {
        return this.f51967e == 0;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new c();
    }

    public final long j2() {
        if (this.f51967e == 0) {
            return 32L;
        }
        long j10 = this.f51969g.f51978a;
        long j11 = this.f51968f.f51978a;
        return j10 >= j11 ? (j10 - j11) + 4 + r0.f51979b + 32 : (((j10 + 4) + r0.f51979b) + this.f51966d) - j11;
    }

    public long k2(long j10) {
        long j11 = this.f51966d;
        return j10 < j11 ? j10 : (j10 + 32) - j11;
    }

    public final void l2(long j10, int i10, long j11, long j12) {
        this.f51963a.seek(0L);
        m2(this.buffer, 0, -2147483647);
        n2(this.buffer, 4, j10);
        m2(this.buffer, 12, i10);
        n2(this.buffer, 16, j11);
        n2(this.buffer, 24, j12);
        this.f51963a.write(this.buffer, 0, 32);
    }

    public boolean n1() {
        return this.f51972j != -1 && size() == this.f51972j;
    }

    public int size() {
        return this.f51967e;
    }

    public String toString() {
        return "QueueFile{file=" + this.f51964b + ", zero=" + this.f51971i + ", length=" + this.f51966d + ", size=" + this.f51967e + ", first=" + this.f51968f + ", last=" + this.f51969g + '}';
    }

    public static Throwable D0(Throwable th2) {
        throw th2;
    }
}
