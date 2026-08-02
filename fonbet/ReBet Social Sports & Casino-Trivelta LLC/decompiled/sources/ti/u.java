package ti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f65891a = Logger.getLogger("okio.Okio");

    public static final E b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return t.g(new FileOutputStream(file, true));
    }

    public static final boolean c(AssertionError assertionError) {
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }

    public static final E d(File file, boolean z10) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return t.g(new FileOutputStream(file, z10));
    }

    public static final E e(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new x(outputStream, new H());
    }

    public static final E f(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        F f10 = new F(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return f10.sink(new x(outputStream, f10));
    }

    public static /* synthetic */ E g(File file, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return t.f(file, z10);
    }

    public static final G h(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new s(new FileInputStream(file), H.NONE);
    }

    public static final G i(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new s(inputStream, new H());
    }

    public static final G j(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        F f10 = new F(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return f10.source(new s(inputStream, f10));
    }
}
