package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class wep extends map {
    public final zep a;

    public wep(zep zepVar) {
        this.a = zepVar;
    }

    public abstract Object a();

    public abstract void b(Object obj, e7n e7nVar, sep sepVar);

    public abstract Object c(Object obj);

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        if (e7nVar.Q0() == 9) {
            e7nVar.j0();
            return null;
        }
        Object a = a();
        Map map = this.a.a;
        try {
            e7nVar.T();
            while (e7nVar.a0()) {
                sep sepVar = (sep) map.get(e7nVar.e0());
                if (sepVar == null) {
                    e7nVar.E0();
                } else {
                    b(a, e7nVar, sepVar);
                }
            }
            e7nVar.Z();
            return c(a);
        } catch (IllegalAccessException e) {
            vha vhaVar = f6n.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new o9p(16, e2);
        }
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        if (obj == null) {
            f7nVar.f0();
            return;
        }
        f7nVar.p();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((sep) it.next()).a(f7nVar, obj);
            }
            f7nVar.t();
        } catch (IllegalAccessException e) {
            vha vhaVar = f6n.a;
            vp2.e("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }
}
