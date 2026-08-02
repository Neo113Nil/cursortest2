package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class b2p implements Serializable {
    public static e2p k(Object obj) {
        obj.getClass();
        return new e2p(obj);
    }

    public static b2p l(Object obj) {
        return obj == null ? u1p.a : new e2p(obj);
    }

    public abstract boolean d();

    public abstract boolean equals(Object obj);

    public abstract Object g();

    public abstract Object h(Serializable serializable);

    public abstract int hashCode();

    public abstract Object i();

    public abstract b2p j(x1p x1pVar);
}
