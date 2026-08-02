package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xif implements Closeable {
    public static final Logger g = Logger.getLogger(xif.class.getName());
    public final RandomAccessFile a;
    public int b;
    public int c;
    public uif d;
    public uif e;
    public final byte[] f;

    public xif(File file) {
        byte[] bArr = new byte[16];
        this.f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    H(i, iArr[i2], bArr2);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    is8.e("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int j = j(0, bArr);
        this.b = j;
        if (j <= randomAccessFile2.length()) {
            this.c = j(4, bArr);
            int j2 = j(8, bArr);
            int j3 = j(12, bArr);
            this.d = i(j2);
            this.e = i(j3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static void H(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static int j(int i, byte[] bArr) {
        return ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final void C(int i, int i2, int i3, int i4) {
        int[] iArr = {i, i2, i3, i4};
        int i5 = 0;
        int i6 = 0;
        while (true) {
            byte[] bArr = this.f;
            if (i5 >= 4) {
                RandomAccessFile randomAccessFile = this.a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                H(i6, iArr[i5], bArr);
                i6 += 4;
                i5++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a.close();
    }

    public final void e(byte[] bArr) {
        int t;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    f(length);
                    boolean h = h();
                    if (h) {
                        t = 16;
                    } else {
                        uif uifVar = this.e;
                        t = t(uifVar.b + 4 + uifVar.c);
                    }
                    uif uifVar2 = new uif(t, length, 0);
                    H(0, length, this.f);
                    n(t, 4, this.f);
                    n(t + 4, length, bArr);
                    C(this.b, this.c + 1, h ? t : this.d.b, t);
                    this.e = uifVar2;
                    this.c++;
                    if (h) {
                        this.d = uifVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void f(int i) {
        int i2 = i + 4;
        int p = this.b - p();
        if (p >= i2) {
            return;
        }
        int i3 = this.b;
        do {
            p += i3;
            i3 <<= 1;
        } while (p < i2);
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.setLength(i3);
        randomAccessFile.getChannel().force(true);
        uif uifVar = this.e;
        int t = t(uifVar.b + 4 + uifVar.c);
        if (t < this.d.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.b);
            long j = t - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                a70.j("Copied insufficient number of bytes!");
                return;
            }
        }
        int i4 = this.e.b;
        int i5 = this.d.b;
        if (i4 < i5) {
            int i6 = (this.b + i4) - 16;
            C(i3, this.c, i5, i6);
            this.e = new uif(i6, this.e.c, 0);
        } else {
            C(i3, this.c, i5, i4);
        }
        this.b = i3;
    }

    public final synchronized void g(wif wifVar) {
        int i = this.d.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            uif i3 = i(i);
            wifVar.h(new vif(this, i3), i3.c);
            i = t(i3.b + 4 + i3.c);
        }
    }

    public final synchronized boolean h() {
        return this.c == 0;
    }

    public final uif i(int i) {
        if (i == 0) {
            return uif.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new uif(i, randomAccessFile.readInt(), 0);
    }

    public final synchronized void k() {
        if (h()) {
            throw new NoSuchElementException();
        }
        int i = 0;
        if (this.c == 1) {
            synchronized (this) {
                C(4096, 0, 0, 0);
                this.c = 0;
                uif uifVar = uif.d;
                this.d = uifVar;
                this.e = uifVar;
                if (this.b > 4096) {
                    RandomAccessFile randomAccessFile = this.a;
                    randomAccessFile.setLength(4096L);
                    randomAccessFile.getChannel().force(true);
                }
                this.b = 4096;
            }
        } else {
            uif uifVar2 = this.d;
            int t = t(uifVar2.b + 4 + uifVar2.c);
            m(t, 0, 4, this.f);
            int j = j(0, this.f);
            C(this.b, this.c - 1, t, this.e.b);
            this.c--;
            this.d = new uif(t, j, i);
        }
    }

    public final void m(int i, int i2, int i3, byte[] bArr) {
        int t = t(i);
        int i4 = t + i3;
        int i5 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i4 <= i5) {
            randomAccessFile.seek(t);
            randomAccessFile.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - t;
        randomAccessFile.seek(t);
        randomAccessFile.readFully(bArr, i2, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i2 + i6, i3 - i6);
    }

    public final void n(int i, int i2, byte[] bArr) {
        int t = t(i);
        int i3 = t + i2;
        int i4 = this.b;
        RandomAccessFile randomAccessFile = this.a;
        if (i3 <= i4) {
            randomAccessFile.seek(t);
            randomAccessFile.write(bArr, 0, i2);
            return;
        }
        int i5 = i4 - t;
        randomAccessFile.seek(t);
        randomAccessFile.write(bArr, 0, i5);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i5, i2 - i5);
    }

    public final int p() {
        if (this.c == 0) {
            return 16;
        }
        uif uifVar = this.e;
        int i = uifVar.b;
        int i2 = this.d.b;
        return i >= i2 ? (i - i2) + 4 + uifVar.c + 16 : (((i + 4) + uifVar.c) + this.b) - i2;
    }

    public final int t(int i) {
        int i2 = this.b;
        return i < i2 ? i : (i + 16) - i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(xif.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            g(new fjg((Object) sb, (byte) 0));
        } catch (IOException e) {
            g.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
