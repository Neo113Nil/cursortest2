package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class s18 implements Closeable {
    public static final uha a;
    public static final uae b;

    static {
        uha uhaVar;
        try {
            Class.forName("java.nio.file.Files");
            uhaVar = new add();
        } catch (ClassNotFoundException unused) {
            uhaVar = new uha();
        }
        a = uhaVar;
        String str = uae.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = tnf.j(property, false);
        ClassLoader classLoader = o1g.class.getClassLoader();
        classLoader.getClass();
        new o1g(classLoader);
    }

    public abstract tha C(uae uaeVar);

    public abstract ejh H(uae uaeVar, boolean z);

    public abstract cwh M(uae uaeVar);

    public abstract ejh e(uae uaeVar);

    public abstract void f(uae uaeVar, uae uaeVar2);

    public final void g(uae uaeVar) {
        vg0 vg0Var = new vg0();
        while (uaeVar != null && !k(uaeVar)) {
            vg0Var.addFirst(uaeVar);
            uaeVar = uaeVar.c();
        }
        Iterator<E> it = vg0Var.iterator();
        while (it.hasNext()) {
            h((uae) it.next());
        }
    }

    public abstract void h(uae uaeVar);

    public abstract void i(uae uaeVar);

    public final void j(uae uaeVar) {
        uaeVar.getClass();
        i(uaeVar);
    }

    public final boolean k(uae uaeVar) {
        uaeVar.getClass();
        return p(uaeVar) != null;
    }

    public abstract List m(uae uaeVar);

    public final ux4 n(uae uaeVar) {
        uaeVar.getClass();
        ux4 p = p(uaeVar);
        if (p != null) {
            return p;
        }
        hg6.h(uaeVar, "no such file: ");
        return null;
    }

    public abstract ux4 p(uae uaeVar);

    public abstract tha t(uae uaeVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
