package G6;

import D6.p;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class k extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            p.a(e10);
        }
    }

    public abstract h d();

    public abstract int size();
}
