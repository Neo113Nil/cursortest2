package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jep extends map {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final map c;
    public final Object d;

    public jep(h9p h9pVar, map mapVar, Type type) {
        this.b = h9pVar;
        this.c = mapVar;
        this.d = type;
    }

    @Override // defpackage.map
    public final Object read(e7n e7nVar) {
        switch (this.a) {
            case 0:
                int Q0 = e7nVar.Q0();
                if (Q0 == 9) {
                    e7nVar.j0();
                    return null;
                }
                Map map = (Map) ((icp) this.d).zza();
                if (Q0 == 1) {
                    e7nVar.zza();
                    while (e7nVar.a0()) {
                        e7nVar.zza();
                        Object read = ((jep) this.b).c.read(e7nVar);
                        if (map.put(read, ((jep) this.c).c.read(e7nVar)) != null) {
                            throw new o9p("duplicate key: ".concat(String.valueOf(read)), 16);
                        }
                        e7nVar.M();
                    }
                    e7nVar.M();
                } else {
                    e7nVar.T();
                    while (e7nVar.a0()) {
                        vbp.a.getClass();
                        if (e7nVar instanceof dep) {
                            dep depVar = (dep) e7nVar;
                            depVar.f1(5);
                            Map.Entry entry = (Map.Entry) ((Iterator) depVar.g1()).next();
                            depVar.c1(entry.getValue());
                            depVar.c1(new s9p((String) entry.getKey()));
                        } else {
                            int i = e7nVar.h;
                            if (i == 0) {
                                i = e7nVar.X0();
                            }
                            if (i == 13) {
                                e7nVar.h = 9;
                            } else if (i == 12) {
                                e7nVar.h = 8;
                            } else {
                                if (i != 14) {
                                    throw e7nVar.H("a name");
                                }
                                e7nVar.h = 10;
                            }
                        }
                        Object read2 = ((jep) this.b).c.read(e7nVar);
                        if (map.put(read2, ((jep) this.c).c.read(e7nVar)) != null) {
                            throw new o9p("duplicate key: ".concat(String.valueOf(read2)), 16);
                        }
                    }
                    e7nVar.Z();
                }
                return map;
            default:
                return this.c.read(e7nVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if ((r0 instanceof defpackage.wep) == false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.reflect.Type] */
    @Override // defpackage.map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(f7n f7nVar, Object obj) {
        map a;
        int i = this.a;
        map mapVar = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    f7nVar.f0();
                    break;
                } else {
                    f7nVar.p();
                    for (Map.Entry entry : map.entrySet()) {
                        f7nVar.C(String.valueOf(entry.getKey()));
                        ((jep) mapVar).write(f7nVar, entry.getValue());
                    }
                    f7nVar.t();
                    break;
                }
            default:
                ?? r0 = (Type) this.d;
                Class<?> cls = (obj == null || !((r0 instanceof Class) || (r0 instanceof TypeVariable))) ? r0 : obj.getClass();
                if (cls != r0) {
                    map b = ((h9p) this.b).b(new z6n(cls));
                    if (b instanceof wep) {
                        map mapVar2 = mapVar;
                        while ((mapVar2 instanceof efp) && (a = ((efp) mapVar2).a()) != mapVar2) {
                            mapVar2 = a;
                        }
                        break;
                    }
                    mapVar = b;
                }
                mapVar.write(f7nVar, obj);
                break;
        }
    }

    public jep(ndp ndpVar, jep jepVar, jep jepVar2, icp icpVar) {
        this.b = jepVar;
        this.c = jepVar2;
        this.d = icpVar;
    }
}
