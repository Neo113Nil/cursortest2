package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d5n extends map {
    public final /* synthetic */ int a = 1;
    public final map b;
    public final Object c;

    public d5n(jep jepVar, icp icpVar) {
        this.b = jepVar;
        this.c = icpVar;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        int i = this.a;
        map mapVar = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                Object read = mapVar.read(e7nVar);
                if (read != null) {
                    Class cls = (Class) obj;
                    if (!cls.isInstance(read)) {
                        Class<?> cls2 = read.getClass();
                        String name = cls.getName();
                        String name2 = cls2.getName();
                        String P0 = e7nVar.P0();
                        StringBuilder sb = new StringBuilder(mz1.d(name.length() + 20, 10, name2) + P0.length());
                        bf3.v(sb, "Expected a ", name, " but was ", name2);
                        throw new o9p(mz1.o(sb, "; at path ", P0), 16);
                    }
                }
                return read;
            default:
                if (e7nVar.Q0() == 9) {
                    e7nVar.j0();
                    return null;
                }
                Collection collection = (Collection) ((icp) obj).zza();
                e7nVar.zza();
                while (e7nVar.a0()) {
                    collection.add(((jep) mapVar).c.read(e7nVar));
                }
                e7nVar.M();
                return collection;
        }
    }

    @Override // defpackage.map
    public final void write(f7n f7nVar, Object obj) {
        int i = this.a;
        map mapVar = this.b;
        switch (i) {
            case 0:
                mapVar.write(f7nVar, obj);
                break;
            default:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    f7nVar.m();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((jep) mapVar).write(f7nVar, it.next());
                    }
                    f7nVar.n();
                    break;
                } else {
                    f7nVar.f0();
                    break;
                }
        }
    }

    public d5n(w4n w4nVar, map mapVar, Class cls) {
        this.b = mapVar;
        this.c = cls;
    }
}
