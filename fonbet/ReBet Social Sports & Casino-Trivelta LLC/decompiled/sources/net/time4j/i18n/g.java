package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

/* loaded from: classes5.dex */
public class g extends Reader {

    /* renamed from: a, reason: collision with root package name */
    public final PushbackInputStream f58266a;

    /* renamed from: b, reason: collision with root package name */
    public BufferedReader f58267b = null;

    public g(InputStream inputStream) {
        this.f58266a = new PushbackInputStream(inputStream, 3);
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        BufferedReader bufferedReader = this.f58267b;
        if (bufferedReader == null) {
            this.f58266a.close();
        } else {
            bufferedReader.close();
        }
    }

    public final void d() {
        if (this.f58267b != null) {
            return;
        }
        byte[] bArr = new byte[3];
        int read = this.f58266a.read(bArr, 0, 3);
        if ((read != 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) && read > 0) {
            this.f58266a.unread(bArr, 0, read);
        }
        this.f58267b = new BufferedReader(new InputStreamReader(this.f58266a, "UTF-8"));
    }

    public String k() {
        d();
        return this.f58267b.readLine();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i10, int i11) {
        d();
        return this.f58267b.read(cArr, i10, i11);
    }

    @Override // java.io.Reader
    public boolean ready() {
        d();
        return this.f58267b.ready();
    }
}
