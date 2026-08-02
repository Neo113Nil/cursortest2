package Ra;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class k implements Serializable {
    private static final long serialVersionUID = 0;

    public static k a() {
        return a.f();
    }

    public static k d(Object obj) {
        return new q(n.k(obj));
    }

    public abstract Object b();

    public abstract boolean c();

    public abstract Object e(Object obj);
}
