package defpackage;

import java.io.Writer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xib extends Writer {
    public final StringBuilder a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        h();
    }

    public final void h() {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                h();
            } else {
                this.a.append(c);
            }
        }
    }
}
