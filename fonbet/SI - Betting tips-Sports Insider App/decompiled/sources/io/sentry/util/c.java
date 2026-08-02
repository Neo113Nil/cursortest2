package io.sentry.util;

import java.io.Writer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c extends Writer {

    /* renamed from: a, reason: collision with root package name */
    public long f17157a = 0;

    public static int c(char c2) {
        if (c2 <= 127) {
            return 1;
        }
        return (c2 > 2047 && !Character.isSurrogate(c2)) ? 3 : 2;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i10) {
        for (int i11 = i5; i11 < i5 + i10; i11++) {
            this.f17157a += c(cArr[i11]);
        }
    }

    @Override // java.io.Writer
    public final void write(int i5) {
        this.f17157a += c((char) i5);
    }

    @Override // java.io.Writer
    public final void write(String str, int i5, int i10) {
        for (int i11 = i5; i11 < i5 + i10; i11++) {
            this.f17157a += c(str.charAt(i11));
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }
}
