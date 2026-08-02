package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class y65 implements xff {
    public static final Object c = new Object();
    public volatile xff a;
    public volatile Object b = c;

    public y65(xff xffVar) {
        this.a = xffVar;
    }

    public static y65 a(xff xffVar) {
        if (xffVar instanceof y65) {
            return (y65) xffVar;
        }
        xffVar.getClass();
        return new y65(xffVar);
    }

    public static xff b(xff xffVar) {
        return xffVar instanceof y65 ? xffVar : new y65(xffVar);
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
