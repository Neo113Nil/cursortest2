package sf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7704k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.D;

/* renamed from: sf.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9688n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f98744a;

    static {
        x xVar;
        try {
            Class.forName("java.nio.file.Files");
            xVar = new y();
        } catch (ClassNotFoundException unused) {
            xVar = new x();
        }
        f98744a = xVar;
        String str = D.f98654b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(\"java.io.tmpdir\")");
        D.a.a(property, false);
        ClassLoader classLoader = tf.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "ResourceFileSystem::class.java.classLoader");
        new tf.h(classLoader);
    }

    public final void a(@NotNull D dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(dir, "dir");
        C7704k c7704k = new C7704k();
        while (dir != null && !e(dir)) {
            c7704k.addFirst(dir);
            dir = dir.e();
        }
        Iterator<E> it = c7704k.iterator();
        while (it.hasNext()) {
            D dir2 = (D) it.next();
            Intrinsics.checkNotNullParameter(dir2, "dir");
            b(dir2);
        }
    }

    public abstract void b(@NotNull D d11) throws IOException;

    public abstract void c(@NotNull D d11) throws IOException;

    public final void d(@NotNull D path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        c(path);
    }

    public final boolean e(@NotNull D path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return h(path) != null;
    }

    @NotNull
    public abstract List<D> f(@NotNull D d11) throws IOException;

    @NotNull
    public final C9687m g(@NotNull D path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        C9687m h11 = h(path);
        if (h11 != null) {
            return h11;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract C9687m h(@NotNull D d11) throws IOException;

    @NotNull
    public abstract AbstractC9686l i(@NotNull D d11) throws IOException;

    @NotNull
    public abstract K j(@NotNull D d11) throws IOException;

    @NotNull
    public abstract M k(@NotNull D d11) throws IOException;
}
