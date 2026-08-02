package bo.app;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class k5 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream[] f25652a;

    public k5(InputStream[] inputStreamArr) {
        this.f25652a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f25652a) {
            Charset charset = bh.f25305a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (RuntimeException e10) {
                    throw e10;
                } catch (Exception unused) {
                }
            }
        }
    }
}
