package io.sentry.cache.tape;

import androidx.appcompat.widget.c1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements Closeable, Iterable {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f16266k = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f16267a;

    /* renamed from: b, reason: collision with root package name */
    public final File f16268b;

    /* renamed from: c, reason: collision with root package name */
    public long f16269c;

    /* renamed from: d, reason: collision with root package name */
    public int f16270d;

    /* renamed from: e, reason: collision with root package name */
    public f f16271e;

    /* renamed from: f, reason: collision with root package name */
    public f f16272f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f16273g = new byte[32];

    /* renamed from: h, reason: collision with root package name */
    public int f16274h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f16275i;
    public boolean j;

    public h(File file, RandomAccessFile randomAccessFile, int i5) {
        this.f16268b = file;
        this.f16267a = randomAccessFile;
        this.f16275i = i5;
        w();
    }

    public static long J(int i5, byte[] bArr) {
        return ((bArr[i5] & 255) << 56) + ((bArr[i5 + 1] & 255) << 48) + ((bArr[i5 + 2] & 255) << 40) + ((bArr[i5 + 3] & 255) << 32) + ((bArr[i5 + 4] & 255) << 24) + ((bArr[i5 + 5] & 255) << 16) + ((bArr[i5 + 6] & 255) << 8) + (bArr[i5 + 7] & 255);
    }

    public static RandomAccessFile c(File file) {
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

    public static void d0(byte[] bArr, int i5, int i10) {
        bArr[i5] = (byte) (i10 >> 24);
        bArr[i5 + 1] = (byte) (i10 >> 16);
        bArr[i5 + 2] = (byte) (i10 >> 8);
        bArr[i5 + 3] = (byte) i10;
    }

    public static void f0(int i5, long j, byte[] bArr) {
        bArr[i5] = (byte) (j >> 56);
        bArr[i5 + 1] = (byte) (j >> 48);
        bArr[i5 + 2] = (byte) (j >> 40);
        bArr[i5 + 3] = (byte) (j >> 32);
        bArr[i5 + 4] = (byte) (j >> 24);
        bArr[i5 + 5] = (byte) (j >> 16);
        bArr[i5 + 6] = (byte) (j >> 8);
        bArr[i5 + 7] = (byte) j;
    }

    public static int z(int i5, byte[] bArr) {
        return ((bArr[i5] & 255) << 24) + ((bArr[i5 + 1] & 255) << 16) + ((bArr[i5 + 2] & 255) << 8) + (bArr[i5 + 3] & 255);
    }

    public final void K(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Cannot remove negative (", ") number of elements."));
        }
        if (i5 == 0) {
            return;
        }
        int i10 = this.f16270d;
        if (i5 == i10) {
            clear();
            return;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        if (i5 > i10) {
            throw new IllegalArgumentException(k.n(c1.r(i5, "Cannot remove more elements (", ") than present in queue ("), this.f16270d, ")."));
        }
        f fVar = this.f16271e;
        long j = fVar.f16260a;
        int i11 = fVar.f16261b;
        long j6 = j;
        long j10 = 0;
        for (int i12 = 0; i12 < i5; i12++) {
            j10 += i11 + 4;
            j6 = W(j6 + 4 + i11);
            byte[] bArr = this.f16273g;
            if (!R(4, j6, bArr)) {
                return;
            }
            i11 = z(0, bArr);
        }
        Y(this.f16269c, this.f16270d - i5, j6, this.f16272f.f16260a);
        this.f16270d -= i5;
        this.f16274h++;
        this.f16271e = new f(j6, i11);
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            U(min, j, f16266k);
            long j11 = min;
            j10 -= j11;
            j += j11;
        }
    }

    public final void O() {
        this.f16267a.close();
        File file = this.f16268b;
        file.delete();
        this.f16267a = c(file);
        w();
    }

    public final boolean R(int i5, long j, byte[] bArr) {
        try {
            long W = W(j);
            long j6 = i5 + W;
            long j10 = this.f16269c;
            if (j6 <= j10) {
                this.f16267a.seek(W);
                this.f16267a.readFully(bArr, 0, i5);
                return true;
            }
            int i10 = (int) (j10 - W);
            this.f16267a.seek(W);
            this.f16267a.readFully(bArr, 0, i10);
            this.f16267a.seek(32L);
            this.f16267a.readFully(bArr, i10, i5 - i10);
            return true;
        } catch (EOFException unused) {
            O();
            return false;
        } catch (IOException e7) {
            throw e7;
        } catch (Throwable unused2) {
            O();
            return false;
        }
    }

    public final void U(int i5, long j, byte[] bArr) {
        long W = W(j);
        long j6 = i5 + W;
        long j10 = this.f16269c;
        if (j6 <= j10) {
            this.f16267a.seek(W);
            this.f16267a.write(bArr, 0, i5);
            return;
        }
        int i10 = (int) (j10 - W);
        this.f16267a.seek(W);
        this.f16267a.write(bArr, 0, i10);
        this.f16267a.seek(32L);
        this.f16267a.write(bArr, i10, i5 - i10);
    }

    public final long W(long j) {
        long j6 = this.f16269c;
        return j < j6 ? j : (j + 32) - j6;
    }

    public final void Y(long j, int i5, long j6, long j10) {
        this.f16267a.seek(0L);
        byte[] bArr = this.f16273g;
        d0(bArr, 0, -2147483647);
        f0(4, j, bArr);
        d0(bArr, 12, i5);
        f0(16, j6, bArr);
        f0(24, j10, bArr);
        this.f16267a.write(bArr, 0, 32);
    }

    public final void clear() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        Y(4096L, 0, 0L, 0L);
        this.f16267a.seek(32L);
        this.f16267a.write(f16266k, 0, 4064);
        this.f16270d = 0;
        f fVar = f.f16259c;
        this.f16271e = fVar;
        this.f16272f = fVar;
        if (this.f16269c > 4096) {
            this.f16267a.setLength(4096L);
            this.f16267a.getChannel().force(true);
        }
        this.f16269c = 4096L;
        this.f16274h++;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j = true;
        this.f16267a.close();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new g(this);
    }

    public final f t(long j) {
        if (j != 0) {
            byte[] bArr = this.f16273g;
            if (R(4, j, bArr)) {
                return new f(j, z(0, bArr));
            }
        }
        return f.f16259c;
    }

    public final String toString() {
        return "QueueFile{file=" + this.f16268b + ", zero=true, length=" + this.f16269c + ", size=" + this.f16270d + ", first=" + this.f16271e + ", last=" + this.f16272f + '}';
    }

    public final void w() {
        this.f16267a.seek(0L);
        RandomAccessFile randomAccessFile = this.f16267a;
        byte[] bArr = this.f16273g;
        randomAccessFile.readFully(bArr);
        this.f16269c = J(4, bArr);
        this.f16270d = z(12, bArr);
        long J = J(16, bArr);
        long J2 = J(24, bArr);
        if (this.f16269c > this.f16267a.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f16269c + ", Actual length: " + this.f16267a.length());
        }
        if (this.f16269c > 32) {
            this.f16271e = t(J);
            this.f16272f = t(J2);
        } else {
            throw new IOException("File is corrupt; length stored in header (" + this.f16269c + ") is invalid.");
        }
    }
}
