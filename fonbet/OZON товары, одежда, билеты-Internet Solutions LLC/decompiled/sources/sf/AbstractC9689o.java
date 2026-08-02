package sf;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: sf.o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC9689o extends AbstractC9688n {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x f98745b;

    public AbstractC9689o(@NotNull x delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f98745b = delegate;
    }

    @NotNull
    public static void n(@NotNull D path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
    }

    @Override // sf.AbstractC9688n
    public final void b(@NotNull D dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        n(dir, "createDirectory", "dir");
        this.f98745b.b(dir);
    }

    @Override // sf.AbstractC9688n
    public final void c(@NotNull D path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        n(path, "delete", "path");
        this.f98745b.c(path);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final List<D> f(@NotNull D dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        n(dir, "list", "dir");
        List<D> f7 = this.f98745b.f(dir);
        ArrayList arrayList = new ArrayList();
        for (D path : f7) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter("list", "functionName");
            arrayList.add(path);
        }
        C7714v.F0(arrayList);
        return arrayList;
    }

    @Override // sf.AbstractC9688n
    public final C9687m h(@NotNull D path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        n(path, "metadataOrNull", "path");
        C9687m h11 = this.f98745b.h(path);
        if (h11 == null) {
            return null;
        }
        if (h11.d() == null) {
            return h11;
        }
        D path2 = h11.d();
        Intrinsics.checkNotNullParameter(path2, "path");
        Intrinsics.checkNotNullParameter("metadataOrNull", "functionName");
        return C9687m.a(h11, path2);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final AbstractC9686l i(@NotNull D file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        n(file, "openReadWrite", "file");
        return this.f98745b.i(file);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public K j(@NotNull D file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        n(file, "sink", "file");
        return this.f98745b.j(file);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final M k(@NotNull D file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        n(file, "source", "file");
        return this.f98745b.k(file);
    }

    @NotNull
    public final K l(@NotNull D file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        n(file, "appendingSink", "file");
        this.f98745b.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        File h11 = file.h();
        int i11 = C9673A.f98648b;
        Intrinsics.checkNotNullParameter(h11, "<this>");
        return z.g(new FileOutputStream(h11, true));
    }

    public final void m(@NotNull D source, @NotNull D target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        n(source, "atomicMove", "source");
        n(target, "atomicMove", "target");
        this.f98745b.l(source, target);
    }

    @NotNull
    public final String toString() {
        return kotlin.jvm.internal.N.b(getClass()).B() + '(' + this.f98745b + ')';
    }
}
