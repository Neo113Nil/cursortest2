package io.sentry.cache.tape;

import io.sentry.C7141f;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class c<T> implements Iterable<T>, Closeable {

    public interface a<T> {
        C7141f a(byte[] bArr) throws IOException;

        void b(C7141f c7141f, OutputStream outputStream) throws IOException;
    }

    public static <T> c<T> k(d dVar, a<T> aVar) {
        return new b(dVar, aVar);
    }

    public static <T> c<T> m() {
        return new io.sentry.cache.tape.a();
    }

    public abstract void c(C7141f c7141f) throws IOException;

    public void clear() throws IOException {
        o(size());
    }

    public abstract void o(int i11) throws IOException;

    public abstract int size();
}
