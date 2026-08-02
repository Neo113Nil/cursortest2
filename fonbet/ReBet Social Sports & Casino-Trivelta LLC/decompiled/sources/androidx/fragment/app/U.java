package androidx.fragment.app;

import java.io.Writer;

/* loaded from: classes.dex */
public final class U extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public final String f20106a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f20107b = new StringBuilder(128);

    public U(String str) {
        this.f20106a = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f20107b.length() > 0) {
            this.f20107b.toString();
            StringBuilder sb2 = this.f20107b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                d();
            } else {
                this.f20107b.append(c10);
            }
        }
    }
}
