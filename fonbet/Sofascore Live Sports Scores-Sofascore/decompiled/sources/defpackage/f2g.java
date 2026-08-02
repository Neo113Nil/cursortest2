package defpackage;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class f2g extends Reader {
    public final l62 a;
    public final Charset b;
    public boolean c;
    public InputStreamReader d;

    public f2g(l62 l62Var, Charset charset) {
        l62Var.getClass();
        charset.getClass();
        this.a = l62Var;
        this.b = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = true;
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader != null) {
            inputStreamReader.close();
        } else {
            this.a.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        cArr.getClass();
        if (this.c) {
            is8.e("Stream closed");
            return 0;
        }
        InputStreamReader inputStreamReader = this.d;
        if (inputStreamReader == null) {
            l62 l62Var = this.a;
            inputStreamReader = new InputStreamReader(l62Var.W0(), yol.f(l62Var, this.b));
            this.d = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
