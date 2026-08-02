package ti;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ti.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6472b {

    /* renamed from: a, reason: collision with root package name */
    public static final C6472b f65847a = new C6472b();

    public final InterfaceC6479i a(E sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return t.c(sink);
    }

    public final InterfaceC6480j b(G source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return t.d(source);
    }

    public final E c(File file) {
        E g10;
        Intrinsics.checkNotNullParameter(file, "file");
        g10 = u.g(file, false, 1, null);
        return g10;
    }

    public final E d(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        return t.g(outputStream);
    }

    public final G e(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return t.k(inputStream);
    }
}
