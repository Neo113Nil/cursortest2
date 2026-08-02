package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c2 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f1882b = new StringBuilder(128);

    /* renamed from: a, reason: collision with root package name */
    public final String f1881a = "FragmentManager";

    public final void c() {
        StringBuilder sb2 = this.f1882b;
        if (sb2.length() > 0) {
            Log.d(this.f1881a, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        c();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i5, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            char c2 = cArr[i5 + i11];
            if (c2 == '\n') {
                c();
            } else {
                this.f1882b.append(c2);
            }
        }
    }
}
