package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i9n {
    public static final i9n c = new i9n(0);
    public final zcn a = new zcn();
    public boolean b;

    public i9n(int i) {
        a();
        a();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        zcn zcnVar = this.a;
        int i = zcnVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = zcnVar.c(i2).b;
            if (obj instanceof y9n) {
                y9n y9nVar = (y9n) obj;
                gcn.c.a(y9nVar.getClass()).c(y9nVar);
                y9nVar.l();
            }
        }
        Iterator it = zcnVar.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof y9n) {
                y9n y9nVar2 = (y9n) value;
                gcn.c.a(y9nVar2.getClass()).c(y9nVar2);
                y9nVar2.l();
            }
        }
        zcnVar.a();
        this.b = true;
    }

    public final Iterator b() {
        zcn zcnVar = this.a;
        return zcnVar.isEmpty() ? Collections.emptyIterator() : ((yg0) zcnVar.entrySet()).iterator();
    }

    public final void c() {
        zcn zcnVar = this.a;
        if (zcnVar.b > 0) {
            zcnVar.c(0).getKey().getClass();
            pvd.j();
        } else {
            Iterator it = zcnVar.d().iterator();
            if (it.hasNext()) {
                throw fc6.d((Map.Entry) it.next());
            }
        }
    }

    public final Object clone() {
        i9n i9nVar = new i9n();
        zcn zcnVar = this.a;
        if (zcnVar.b > 0) {
            zcnVar.c(0).a.getClass();
            pvd.j();
            return null;
        }
        Iterator it = zcnVar.d().iterator();
        if (!it.hasNext()) {
            return i9nVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            pvd.j();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i9n) {
            return this.a.equals(((i9n) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    private i9n() {
    }
}
