package ti;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* loaded from: classes5.dex */
public abstract class t {
    public static final E a(File file) {
        return u.b(file);
    }

    public static final E b() {
        return v.a();
    }

    public static final InterfaceC6479i c(E e10) {
        return v.b(e10);
    }

    public static final InterfaceC6480j d(G g10) {
        return v.c(g10);
    }

    public static final boolean e(AssertionError assertionError) {
        return u.c(assertionError);
    }

    public static final E f(File file, boolean z10) {
        return u.d(file, z10);
    }

    public static final E g(OutputStream outputStream) {
        return u.e(outputStream);
    }

    public static final E h(Socket socket) {
        return u.f(socket);
    }

    public static final G j(File file) {
        return u.h(file);
    }

    public static final G k(InputStream inputStream) {
        return u.i(inputStream);
    }

    public static final G l(Socket socket) {
        return u.j(socket);
    }
}
