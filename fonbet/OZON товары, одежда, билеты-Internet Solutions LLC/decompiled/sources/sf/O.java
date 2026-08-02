package sf;

import Sc.C4001c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.D;

/* loaded from: classes10.dex */
public final class O extends AbstractC9688n {

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    private static final D f98687e;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final D f98688b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final x f98689c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f98690d;

    static {
        String str = D.f98654b;
        f98687e = D.a.a("/", false);
    }

    public O(@NotNull D zipPath, @NotNull x fileSystem, @NotNull LinkedHashMap entries) {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f98688b = zipPath;
        this.f98689c = fileSystem;
        this.f98690d = entries;
    }

    @Override // sf.AbstractC9688n
    public final void b(@NotNull D dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // sf.AbstractC9688n
    public final void c(@NotNull D path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final List<D> f(@NotNull D child) {
        Intrinsics.checkNotNullParameter(child, "dir");
        D d11 = f98687e;
        d11.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        tf.j jVar = (tf.j) this.f98690d.get(tf.c.j(d11, child, true));
        if (jVar != null) {
            List<D> U02 = C7714v.U0(jVar.b());
            Intrinsics.f(U02);
            return U02;
        }
        throw new IOException("not a directory: " + child);
    }

    @Override // sf.AbstractC9688n
    public final C9687m h(@NotNull D child) {
        G g10;
        Intrinsics.checkNotNullParameter(child, "path");
        D d11 = f98687e;
        d11.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        tf.j jVar = (tf.j) this.f98690d.get(tf.c.j(d11, child, true));
        Throwable th2 = null;
        if (jVar == null) {
            return null;
        }
        C9687m c9687m = new C9687m(!jVar.h(), jVar.h(), null, jVar.h() ? null : Long.valueOf(jVar.g()), null, jVar.e(), null);
        if (jVar.f() == -1) {
            return c9687m;
        }
        AbstractC9686l m11 = this.f98689c.m(this.f98688b);
        try {
            g10 = z.d(m11.t(jVar.f()));
            try {
                m11.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            try {
                m11.close();
            } catch (Throwable th5) {
                C4001c.a(th4, th5);
            }
            th2 = th4;
            g10 = null;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.f(g10);
        return tf.n.f(g10, c9687m);
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final AbstractC9686l i(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final K j(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final M k(@NotNull D child) throws IOException {
        G g10;
        Intrinsics.checkNotNullParameter(child, "file");
        D d11 = f98687e;
        d11.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        tf.j jVar = (tf.j) this.f98690d.get(tf.c.j(d11, child, true));
        if (jVar == null) {
            throw new FileNotFoundException("no such file: " + child);
        }
        AbstractC9686l m11 = this.f98689c.m(this.f98688b);
        Throwable th2 = null;
        try {
            g10 = z.d(m11.t(jVar.f()));
            try {
                m11.close();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            try {
                m11.close();
            } catch (Throwable th5) {
                C4001c.a(th4, th5);
            }
            g10 = null;
            th2 = th4;
        }
        if (th2 != null) {
            throw th2;
        }
        Intrinsics.f(g10);
        tf.n.h(g10);
        return jVar.d() == 0 ? new tf.f(g10, jVar.g(), true) : new tf.f(new u(new tf.f(g10, jVar.c(), true), new Inflater(true)), jVar.g(), false);
    }
}
