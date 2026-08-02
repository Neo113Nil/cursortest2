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
final class b implements com.bykv.vk.openvk.preload.geckox.buffer.a {
    private RandomAccessFile a;
    private AtomicBoolean b = new AtomicBoolean(false);
    private File c;

    public b(File file) throws IOException {
        this.c = file;
        file.getParentFile().mkdirs();
        try {
            this.a = new RandomAccessFile(file, "rw");
        } catch (Exception e) {
            CloseableUtils.close(this.a);
            yhk.n("create raf mSwap failed! path: ", file.getAbsolutePath(), " caused by: ", e.getMessage(), e);
            throw null;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final synchronized long a(long j) throws IOException {
        if (this.b.get()) {
            throw new IOException("released!");
        }
        if (((int) j) != j) {
            throw new IOException("too large:".concat(String.valueOf(j)));
        }
        return this.a.skipBytes(r0);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr, int i, int i2) throws IOException {
        int read;
        if (this.b.get()) {
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
            read = this.a.read(bArr, i, i2);
        }
        return read;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long c() throws IOException {
        if (!this.b.get()) {
            return this.a.getFilePointer();
        }
        is8.e("released!");
        return 0L;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int d() throws IOException {
        byte[] bArr = new byte[1];
        if (b(bArr) <= 0) {
            return -1;
        }
        return bArr[0];
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void e() {
        if (this.b.getAndSet(true)) {
            return;
        }
        CloseableUtils.close(this.a);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final File f() {
        return this.c;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final void b(long j) throws IOException {
        if (!this.b.get()) {
            if (j < 0) {
                j = 0;
            }
            this.a.seek(j);
            return;
        }
        is8.e("released!");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int b(byte[] bArr) throws IOException {
        return b(bArr, 0, bArr.length);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final long b() throws IOException {
        return this.a.length();
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
    public final void a() throws IOException {
        if (this.b.get()) {
            is8.e("released!");
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.buffer.a
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.b.get()) {
            if (bArr == null || bArr.length == 0 || i2 <= 0 || i < 0 || i >= bArr.length) {
                return 0;
            }
            if (i + i2 > bArr.length) {
                i2 = bArr.length - i;
            }
            synchronized (this) {
                this.a.write(bArr, i, i2);
            }
            return i2;
        }
        is8.e("released!");
        return 0;
    }
}
