package tf;

import Sc.InterfaceC4008j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9686l;
import sf.AbstractC9688n;
import sf.C9687m;
import sf.D;
import sf.K;
import sf.M;

/* loaded from: classes10.dex */
public final class h extends AbstractC9688n {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f99498c = new a();

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    private static final D f99499d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f99500e = 0;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f99501b;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {
        public static final boolean a(a aVar, D d11) {
            return !kotlin.text.h.A(d11.c(), ".class", true);
        }
    }

    static {
        String str = D.f98654b;
        f99499d = D.a.a("/", false);
    }

    public h(@NotNull ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f99501b = Sc.k.b(new i(classLoader));
    }

    private static String n(D child) {
        D d11 = f99499d;
        d11.getClass();
        Intrinsics.checkNotNullParameter(child, "child");
        return c.j(d11, child, true).f(d11).toString();
    }

    @Override // sf.AbstractC9688n
    public final void b(@NotNull D dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // sf.AbstractC9688n
    public final void c(@NotNull D path) {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final List<D> f(@NotNull D dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String n11 = n(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z11 = false;
        for (Pair pair : (List) this.f99501b.getValue()) {
            AbstractC9688n abstractC9688n = (AbstractC9688n) pair.a();
            D base = (D) pair.b();
            try {
                List<D> f7 = abstractC9688n.f(base.g(n11));
                ArrayList arrayList = new ArrayList();
                for (Object obj : f7) {
                    if (a.a(f99498c, (D) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    D d11 = (D) it.next();
                    Intrinsics.checkNotNullParameter(d11, "<this>");
                    Intrinsics.checkNotNullParameter(base, "base");
                    arrayList2.add(f99499d.g(kotlin.text.h.Y(kotlin.text.h.S(d11.toString(), base.toString()), '\\', '/')));
                }
                C7714v.p(arrayList2, linkedHashSet);
                z11 = true;
            } catch (IOException unused) {
            }
        }
        if (z11) {
            return C7714v.U0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // sf.AbstractC9688n
    public final C9687m h(@NotNull D path) {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!a.a(f99498c, path)) {
            return null;
        }
        String n11 = n(path);
        for (Pair pair : (List) this.f99501b.getValue()) {
            C9687m h11 = ((AbstractC9688n) pair.a()).h(((D) pair.b()).g(n11));
            if (h11 != null) {
                return h11;
            }
        }
        return null;
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final AbstractC9686l i(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final K j(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // sf.AbstractC9688n
    @NotNull
    public final M k(@NotNull D file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!a.a(f99498c, file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String n11 = n(file);
        for (Pair pair : (List) this.f99501b.getValue()) {
            try {
                return ((AbstractC9688n) pair.a()).k(((D) pair.b()).g(n11));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
