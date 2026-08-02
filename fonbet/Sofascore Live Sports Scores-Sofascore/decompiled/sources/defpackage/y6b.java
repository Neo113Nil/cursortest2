package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y6b extends g6b {
    public final boolean b;
    public final yia d;
    public int e;
    public boolean f;
    public boolean g;
    public e6b i;
    public final fdi j;
    public l2a c = new l2a(9);
    public final ArrayList h = new ArrayList();

    public y6b(u6b u6bVar, boolean z) {
        this.b = z;
        this.d = new yia(u6bVar);
        e6b e6bVar = e6b.b;
        this.i = e6bVar;
        this.j = gdi.a(e6bVar);
    }

    @Override // defpackage.g6b
    public final void a(t6b t6bVar) {
        p6b tq4Var;
        x6b x6bVar;
        u6b u6bVar;
        t6bVar.getClass();
        f("addObserver");
        e6b e6bVar = this.i;
        e6b e6bVar2 = e6b.a;
        if (e6bVar != e6bVar2) {
            e6bVar2 = e6b.b;
        }
        x6b x6bVar2 = new x6b();
        x6bVar2.a = e6bVar2;
        HashMap hashMap = h7b.a;
        boolean z = t6bVar instanceof p6b;
        boolean z2 = t6bVar instanceof rq4;
        int i = 2;
        Object obj = null;
        if (z && z2) {
            tq4Var = new tq4(r5, (rq4) t6bVar, (p6b) t6bVar);
        } else if (z2) {
            tq4Var = new tq4(r5, (rq4) t6bVar, obj);
        } else if (z) {
            tq4Var = (p6b) t6bVar;
        } else {
            Class<?> cls = t6bVar.getClass();
            if (h7b.b(cls) == 2) {
                Object obj2 = h7b.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    h7b.a((Constructor) list.get(0), t6bVar);
                    throw null;
                }
                int size = list.size();
                sv8[] sv8VarArr = new sv8[size];
                if (size > 0) {
                    h7b.a((Constructor) list.get(0), t6bVar);
                    throw null;
                }
                tq4Var = new nqf(sv8VarArr, i);
            } else {
                tq4Var = new tq4(t6bVar);
            }
        }
        x6bVar2.b = tq4Var;
        l2a l2aVar = this.c;
        l2aVar.getClass();
        x0d x0dVar = (x0d) l2aVar.b;
        rq7 rq7Var = (rq7) x0dVar.g(t6bVar);
        if (rq7Var != null) {
            x6bVar = rq7Var.b;
        } else {
            rq7 rq7Var2 = new rq7(t6bVar, x6bVar2);
            x0dVar.m(t6bVar, rq7Var2);
            rq7 rq7Var3 = (rq7) l2aVar.d;
            if (rq7Var3 == null) {
                l2aVar.c = rq7Var2;
                l2aVar.d = rq7Var2;
            } else {
                rq7Var3.c = rq7Var2;
                rq7Var2.d = rq7Var3;
                l2aVar.d = rq7Var2;
            }
            x6bVar = null;
        }
        if (x6bVar == null && (u6bVar = (u6b) ((WeakReference) this.d.b).get()) != null) {
            r5 = (this.e != 0 || this.f) ? 1 : 0;
            e6b e = e(t6bVar);
            this.e++;
            while (x6bVar2.a.compareTo(e) < 0) {
                l2a l2aVar2 = this.c;
                l2aVar2.getClass();
                if (!((x0d) l2aVar2.b).c(t6bVar)) {
                    break;
                }
                e6b e6bVar3 = x6bVar2.a;
                ArrayList arrayList = this.h;
                arrayList.add(e6bVar3);
                b6b b6bVar = d6b.Companion;
                e6b e6bVar4 = x6bVar2.a;
                b6bVar.getClass();
                e6bVar4.getClass();
                int ordinal = e6bVar4.ordinal();
                d6b d6bVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : d6b.ON_RESUME : d6b.ON_START : d6b.ON_CREATE;
                if (d6bVar == null) {
                    sw9.i(x6bVar2.a, "no event up from ");
                    return;
                } else {
                    x6bVar2.a(u6bVar, d6bVar);
                    o13.E(arrayList);
                    e = e(t6bVar);
                }
            }
            if (r5 == 0) {
                j();
            }
            this.e--;
        }
    }

    @Override // defpackage.g6b
    public final e6b b() {
        return this.i;
    }

    @Override // defpackage.g6b
    public final jof c() {
        return un0.u(this.j);
    }

    @Override // defpackage.g6b
    public final void d(t6b t6bVar) {
        t6bVar.getClass();
        f("removeObserver");
        l2a l2aVar = this.c;
        l2aVar.getClass();
        rq7 rq7Var = (rq7) ((x0d) l2aVar.b).k(t6bVar);
        if (rq7Var == null) {
            return;
        }
        rq7 rq7Var2 = rq7Var.d;
        rq7 rq7Var3 = rq7Var.c;
        if (rq7Var2 == null) {
            l2aVar.c = rq7Var3;
        } else {
            rq7Var2.c = rq7Var3;
        }
        rq7 rq7Var4 = rq7Var.c;
        if (rq7Var4 == null) {
            l2aVar.d = rq7Var2;
        } else {
            rq7Var4.d = rq7Var2;
        }
        rq7Var.e = true;
    }

    public final e6b e(t6b t6bVar) {
        l2a l2aVar = this.c;
        l2aVar.getClass();
        t6bVar.getClass();
        rq7 rq7Var = (rq7) ((x0d) l2aVar.b).g(t6bVar);
        rq7 rq7Var2 = rq7Var != null ? rq7Var.d : null;
        e6b e6bVar = rq7Var2 != null ? rq7Var2.b.a : null;
        ArrayList arrayList = this.h;
        e6b e6bVar2 = arrayList.isEmpty() ? null : (e6b) mz1.h(arrayList, 1);
        e6b e6bVar3 = this.i;
        if (e6bVar == null || e6bVar.compareTo(e6bVar3) >= 0) {
            e6bVar = e6bVar3;
        }
        return (e6bVar2 == null || e6bVar2.compareTo(e6bVar) >= 0) ? e6bVar : e6bVar2;
    }

    public final void f(String str) {
        if (!this.b || ig0.G().H()) {
            return;
        }
        hc5.f(lnb.o("Method ", str, " must be called on the main thread"));
    }

    public final void g(d6b d6bVar) {
        d6bVar.getClass();
        f("handleLifecycleEvent");
        h(d6bVar.d());
    }

    public final void h(e6b e6bVar) {
        if (this.i == e6bVar) {
            return;
        }
        u6b u6bVar = (u6b) ((WeakReference) this.d.b).get();
        e6b e6bVar2 = this.i;
        if (e6bVar2 == e6b.b && e6bVar == e6b.a) {
            throw new IllegalStateException(("State must be at least '" + e6b.c + "' to be moved to '" + e6bVar + "' in component " + u6bVar).toString());
        }
        e6b e6bVar3 = e6b.a;
        if (e6bVar2 == e6bVar3 && e6bVar2 != e6bVar) {
            throw new IllegalStateException(("State is '" + e6bVar3 + "' and cannot be moved to `" + e6bVar + "` in component " + u6bVar).toString());
        }
        this.i = e6bVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        j();
        this.f = false;
        if (this.i == e6bVar3) {
            this.c = new l2a(9);
        }
    }

    public final void i(e6b e6bVar) {
        e6bVar.getClass();
        f("setCurrentState");
        h(e6bVar);
    }

    public final void j() {
        Object obj = ((WeakReference) this.d.b).get();
        if (obj == null) {
            a70.r("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        final u6b u6bVar = (u6b) obj;
        while (true) {
            l2a l2aVar = this.c;
            final int i = 0;
            if (((x0d) l2aVar.b).e == 0) {
                break;
            }
            rq7 rq7Var = (rq7) l2aVar.c;
            if (rq7Var == null) {
                ogj.m("Collection is empty.");
                return;
            }
            e6b e6bVar = rq7Var.b.a;
            rq7 rq7Var2 = (rq7) l2aVar.d;
            if (rq7Var2 == null) {
                ogj.m("Collection is empty.");
                return;
            }
            e6b e6bVar2 = rq7Var2.b.a;
            if (e6bVar == e6bVar2 && this.i == e6bVar2) {
                break;
            }
            this.g = false;
            e6b e6bVar3 = this.i;
            if (rq7Var == null) {
                ogj.m("Collection is empty.");
                return;
            }
            if (e6bVar3.compareTo(e6bVar) < 0) {
                l2a l2aVar2 = this.c;
                Function1 function1 = new Function1(this) { // from class: w6b
                    public final /* synthetic */ y6b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i2 = i;
                        u6b u6bVar2 = u6bVar;
                        y6b y6bVar = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i2) {
                            case 0:
                                entry.getClass();
                                t6b t6bVar = (t6b) entry.getKey();
                                x6b x6bVar = (x6b) entry.getValue();
                                while (true) {
                                    e6b e6bVar4 = x6bVar.a;
                                    e6b e6bVar5 = y6bVar.i;
                                    ArrayList arrayList = y6bVar.h;
                                    if (e6bVar4.compareTo(e6bVar5) > 0 && !y6bVar.g) {
                                        l2a l2aVar3 = y6bVar.c;
                                        l2aVar3.getClass();
                                        t6bVar.getClass();
                                        if (((x0d) l2aVar3.b).c(t6bVar)) {
                                            b6b b6bVar = d6b.Companion;
                                            e6b e6bVar6 = x6bVar.a;
                                            b6bVar.getClass();
                                            d6b a = b6b.a(e6bVar6);
                                            if (a == null) {
                                                i3c.i(x6bVar.a, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(a.d());
                                                x6bVar.a(u6bVar2, a);
                                                o13.E(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                t6b t6bVar2 = (t6b) entry.getKey();
                                x6b x6bVar2 = (x6b) entry.getValue();
                                while (true) {
                                    e6b e6bVar7 = x6bVar2.a;
                                    e6b e6bVar8 = y6bVar.i;
                                    ArrayList arrayList2 = y6bVar.h;
                                    if (e6bVar7.compareTo(e6bVar8) < 0 && !y6bVar.g) {
                                        l2a l2aVar4 = y6bVar.c;
                                        l2aVar4.getClass();
                                        t6bVar2.getClass();
                                        if (((x0d) l2aVar4.b).c(t6bVar2)) {
                                            arrayList2.add(x6bVar2.a);
                                            b6b b6bVar2 = d6b.Companion;
                                            e6b e6bVar9 = x6bVar2.a;
                                            b6bVar2.getClass();
                                            e6bVar9.getClass();
                                            int ordinal = e6bVar9.ordinal();
                                            d6b d6bVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : d6b.ON_RESUME : d6b.ON_START : d6b.ON_CREATE;
                                            if (d6bVar == null) {
                                                i3c.i(x6bVar2.a, "no event up from ");
                                                break;
                                            } else {
                                                x6bVar2.a(u6bVar2, d6bVar);
                                                o13.E(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                l2aVar2.getClass();
                for (rq7 rq7Var3 = (rq7) l2aVar2.d; rq7Var3 != null; rq7Var3 = rq7Var3.d) {
                    if (!rq7Var3.e) {
                        function1.invoke(rq7Var3);
                    }
                }
            }
            rq7 rq7Var4 = (rq7) this.c.d;
            if (!this.g && rq7Var4 != null && this.i.compareTo(rq7Var4.b.a) > 0) {
                l2a l2aVar3 = this.c;
                final int i2 = 1;
                Function1 function12 = new Function1(this) { // from class: w6b
                    public final /* synthetic */ y6b b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        int i22 = i2;
                        u6b u6bVar2 = u6bVar;
                        y6b y6bVar = this.b;
                        Map.Entry entry = (Map.Entry) obj2;
                        switch (i22) {
                            case 0:
                                entry.getClass();
                                t6b t6bVar = (t6b) entry.getKey();
                                x6b x6bVar = (x6b) entry.getValue();
                                while (true) {
                                    e6b e6bVar4 = x6bVar.a;
                                    e6b e6bVar5 = y6bVar.i;
                                    ArrayList arrayList = y6bVar.h;
                                    if (e6bVar4.compareTo(e6bVar5) > 0 && !y6bVar.g) {
                                        l2a l2aVar32 = y6bVar.c;
                                        l2aVar32.getClass();
                                        t6bVar.getClass();
                                        if (((x0d) l2aVar32.b).c(t6bVar)) {
                                            b6b b6bVar = d6b.Companion;
                                            e6b e6bVar6 = x6bVar.a;
                                            b6bVar.getClass();
                                            d6b a = b6b.a(e6bVar6);
                                            if (a == null) {
                                                i3c.i(x6bVar.a, "no event down from ");
                                                break;
                                            } else {
                                                arrayList.add(a.d());
                                                x6bVar.a(u6bVar2, a);
                                                o13.E(arrayList);
                                            }
                                        }
                                    }
                                }
                                break;
                            default:
                                entry.getClass();
                                t6b t6bVar2 = (t6b) entry.getKey();
                                x6b x6bVar2 = (x6b) entry.getValue();
                                while (true) {
                                    e6b e6bVar7 = x6bVar2.a;
                                    e6b e6bVar8 = y6bVar.i;
                                    ArrayList arrayList2 = y6bVar.h;
                                    if (e6bVar7.compareTo(e6bVar8) < 0 && !y6bVar.g) {
                                        l2a l2aVar4 = y6bVar.c;
                                        l2aVar4.getClass();
                                        t6bVar2.getClass();
                                        if (((x0d) l2aVar4.b).c(t6bVar2)) {
                                            arrayList2.add(x6bVar2.a);
                                            b6b b6bVar2 = d6b.Companion;
                                            e6b e6bVar9 = x6bVar2.a;
                                            b6bVar2.getClass();
                                            e6bVar9.getClass();
                                            int ordinal = e6bVar9.ordinal();
                                            d6b d6bVar = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : d6b.ON_RESUME : d6b.ON_START : d6b.ON_CREATE;
                                            if (d6bVar == null) {
                                                i3c.i(x6bVar2.a, "no event up from ");
                                                break;
                                            } else {
                                                x6bVar2.a(u6bVar2, d6bVar);
                                                o13.E(arrayList2);
                                            }
                                        }
                                    }
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                l2aVar3.getClass();
                for (rq7 rq7Var5 = (rq7) l2aVar3.c; rq7Var5 != null; rq7Var5 = rq7Var5.c) {
                    if (!rq7Var5.e) {
                        function12.invoke(rq7Var5);
                    }
                }
            }
        }
        this.g = false;
        this.j.l(this.i);
    }
}
