package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n1l extends InputStream {
    public byte[] a;
    public m1l b;
    public InputStream c;
    public byte[] d;

    @Override // java.io.InputStream
    public final int available() {
        return this.c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        r13 = defpackage.m1l.c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r13 <= 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r9 >= r13) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        r14 = r3.read(r5, r9, r13 - r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r14 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        r9 = r9 + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r13 >= 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0040, code lost:
    
        if (defpackage.m1l.c(r5) <= r13) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r4.a = r5[0];
        r9 = r5[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if ((r9 & 128) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r4.b = r11;
        r11 = r9 & Byte.MAX_VALUE;
        r4.c = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (126 != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r4.c = 0;
        r7 = 0;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r7 >= 2) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
    
        r11 = r4.c << 8;
        r4.c = r11;
        r4.c = r11 | (r5[r8] & com.inmobi.media.core.config.models.AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        r7 = r7 + 1;
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (r4.b == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        r4.d = 0;
        r4.e = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a0, code lost:
    
        if (r6 >= 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r7 = r4.d << 8;
        r4.d = r7;
        r4.d = r7 | (r5[r10] & com.inmobi.media.core.config.models.AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        r6 = r6 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (127 != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007f, code lost:
    
        r4.c = 0;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0082, code lost:
    
        if (r7 >= 8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        r8 = r4.c << 8;
        r4.c = r8;
        r4.c = r8 | (r5[r10] & com.inmobi.media.core.config.models.AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        r7 = r7 + 1;
        r10 = r10 + 1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.c;
        m1l m1lVar = this.b;
        loop0: while (true) {
            long j = m1lVar.c;
            int i3 = 2;
            boolean z = true;
            if (0 != j) {
                int i4 = m1lVar.a & 15;
                if (i4 != 0 && i4 != 1 && i4 != 2) {
                    switch (i4) {
                        case 8:
                            inputStream.skip(j);
                            break;
                    }
                }
                int read = inputStream.read(bArr, i, Math.min(i2, j > 2147483647L ? Integer.MAX_VALUE : (int) j));
                return -1 == read ? read : m1lVar.a(i, read, bArr);
            }
            byte[] bArr2 = this.a;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i6 >= 2) {
                    break;
                }
                int read2 = inputStream.read(bArr2, i6, 2 - i6);
                if (read2 < 0) {
                    break loop0;
                }
                i6 += read2;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.d;
        int read = read(bArr, 0, 1);
        return -1 == read ? read : bArr[0];
    }
}
