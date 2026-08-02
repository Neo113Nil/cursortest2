package sf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class z {
    @NotNull
    public static final K a(@NotNull File file) throws FileNotFoundException {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return g(new FileOutputStream(file, true));
    }

    @NotNull
    public static final K b() {
        return new C9680f();
    }

    @NotNull
    public static final F c(@NotNull K k11) {
        Intrinsics.checkNotNullParameter(k11, "<this>");
        return new F(k11);
    }

    @NotNull
    public static final G d(@NotNull M m11) {
        Intrinsics.checkNotNullParameter(m11, "<this>");
        return new G(m11);
    }

    public static final boolean e(@NotNull AssertionError assertionError) {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? kotlin.text.h.t(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final C9678d f(@NotNull Socket socket) throws IOException {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        L l11 = new L(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        C sink = new C(outputStream, l11);
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C9678d(l11, sink);
    }

    @NotNull
    public static final K g(@NotNull OutputStream outputStream) {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new C(outputStream, new N());
    }

    public static K h(File file) throws FileNotFoundException {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return g(new FileOutputStream(file, false));
    }

    @NotNull
    public static final C9679e i(@NotNull Socket socket) throws IOException {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(socket, "<this>");
        L l11 = new L(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        v source = new v(inputStream, l11);
        Intrinsics.checkNotNullParameter(source, "source");
        return new C9679e(l11, source);
    }

    @NotNull
    public static final M j(@NotNull File file) throws FileNotFoundException {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new v(new FileInputStream(file), N.f98683d);
    }

    @NotNull
    public static final M k(@NotNull InputStream inputStream) {
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new v(inputStream, new N());
    }
}
