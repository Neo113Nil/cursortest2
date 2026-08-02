package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import defpackage.is8;
import defpackage.yhk;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
final class c implements com.bykv.vk.openvk.preload.geckox.buffer.a {
    private long a;
    private long b;
    private RandomAccessFile c;
    private AtomicBoolean d = new AtomicBoolean(false);
    private File e;

    public c(long j, File file) throws IOException {
        this.a = j;
        this.e = file;
        file.getParentFile().mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            this.c = randomAccessFile;
            randomAccessFile.setLength(j);
        } catch (Exception e) {
            CloseableUtils.close(this.c);
            yhk.n("create raf swap failed! path: ", file.getAbsolutePath(), " caused by: ", e.getMessage(), e);
            throw null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (this.d.get()) {
            is8.e("released!");
            return 0;
        }
        if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            try {
                long j = this.b;
                long j2 = this.a;
                if (j == j2) {
                    return 0;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                this.c.write(bArr, i, i2);
                this.b += i2;
                return i2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i2) throws IOException {
        if (this.d.get()) {
            is8.e("released!");
            return 0;
        }
        if (bArr == null || i2 <= 0 || i < 0 || i >= bArr.length) {
            return 0;
        }
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        synchronized (this) {
            try {
                long j = this.b;
                long j2 = this.a;
                if (j == j2) {
                    return -1;
                }
                if (i2 + j > j2) {
                    i2 = (int) (j2 - j);
                }
                int read = this.c.read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                this.b += read;
                return read;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.d.get()) {
            return this.b;
        }
        is8.e("released!");
        return 0L;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) == 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.d.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.c);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.e;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(int i) throws IOException {
        a(new byte[]{(byte) i});
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws IOException {
        int skipBytes;
        if (this.d.get()) {
            throw new IOException("released!");
        }
        int i = (int) j;
        if (i == j) {
            skipBytes = this.c.skipBytes(i);
            this.b = this.c.getFilePointer();
        } else {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return skipBytes;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r4 > r0) goto L6;
     */
    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j) throws IOException {
        if (!this.d.get()) {
            long j2 = 0;
            if (j >= 0) {
                j2 = this.a;
            }
            j = j2;
            this.b = j;
            this.c.seek(j);
            return;
        }
        is8.e("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() {
        return this.a;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void a() throws IOException {
        if (this.d.get()) {
            is8.e("released!");
        }
    }
}
