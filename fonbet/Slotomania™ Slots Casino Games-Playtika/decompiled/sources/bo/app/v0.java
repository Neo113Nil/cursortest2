package bo.app;

import bo.app.o0;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class v0 {
    final String a;
    final long[] b;
    boolean c;
    o0.c d;
    long e;
    private final int f;
    private final File g;

    v0(String str, int i, File file) {
        this.a = str;
        this.f = i;
        this.g = file;
        this.b = new long[i];
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ').append(j);
        }
        return sb.toString();
    }

    void b(String[] strArr) {
        if (strArr.length != this.f) {
            throw a(strArr);
        }
        for (int i = 0; i < strArr.length; i++) {
            try {
                this.b[i] = Long.parseLong(strArr[i]);
            } catch (NumberFormatException unused) {
                throw a(strArr);
            }
        }
    }

    IOException a(String[] strArr) {
        throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
    }

    public File a(int i) {
        return new File(this.g, this.a + "." + i);
    }

    public File b(int i) {
        return new File(this.g, this.a + "." + i + ".tmp");
    }
}
