package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w65 implements uff {
    public static final Object c = new Object();
    public volatile uff a;
    public volatile Object b;

    public static uff a(uff uffVar) {
        if (uffVar instanceof w65) {
            return uffVar;
        }
        w65 w65Var = new w65();
        w65Var.b = c;
        w65Var.a = uffVar;
        return w65Var;
    }

    @Override // defpackage.yff
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.b;
            if (obj == obj3) {
                obj = this.a.get();
                Object obj4 = this.b;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }
}
