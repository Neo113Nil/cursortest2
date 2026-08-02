package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g0 extends y {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2167b;

    /* renamed from: c, reason: collision with root package name */
    public p.a f2168c;

    /* renamed from: d, reason: collision with root package name */
    public x f2169d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f2170e;

    /* renamed from: f, reason: collision with root package name */
    public int f2171f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2172g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2173h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2174i;
    public final hg.d1 j;

    public g0(e0 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f2259a = new n1();
        this.f2167b = true;
        this.f2168c = new p.a();
        x xVar = x.f2254b;
        this.f2169d = xVar;
        this.f2174i = new ArrayList();
        this.f2170e = new WeakReference(provider);
        this.j = hg.u0.b(xVar);
    }

    @Override // androidx.lifecycle.y
    public final void a(d0 object) {
        c0 lVar;
        e0 e0Var;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        x xVar = this.f2169d;
        x initialState = x.f2253a;
        if (xVar != initialState) {
            initialState = x.f2254b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        f0 f0Var = new f0();
        Intrinsics.checkNotNull(object);
        HashMap hashMap = i0.f2188a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z5 = object instanceof c0;
        boolean z7 = object instanceof DefaultLifecycleObserver;
        Object obj = null;
        if (z5 && z7) {
            lVar = new l((DefaultLifecycleObserver) object, (c0) object);
        } else if (z7) {
            lVar = new l((DefaultLifecycleObserver) object, (c0) null);
        } else if (z5) {
            lVar = (c0) object;
        } else {
            Class<?> cls = object.getClass();
            if (i0.c(cls) == 2) {
                Object obj2 = i0.f2189b.get(cls);
                Intrinsics.checkNotNull(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    i0.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    lVar = new j1();
                } else {
                    int size = list.size();
                    q[] qVarArr = new q[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        i0.a((Constructor) list.get(i5), object);
                        qVarArr[i5] = null;
                    }
                    lVar = new g(qVarArr);
                }
            } else {
                lVar = new l(object);
            }
        }
        f0Var.f2163b = lVar;
        f0Var.f2162a = initialState;
        p.a aVar = this.f2168c;
        p.c a7 = aVar.a(object);
        if (a7 != null) {
            obj = a7.f21388b;
        } else {
            HashMap hashMap2 = aVar.f21383e;
            p.c cVar = new p.c(object, f0Var);
            aVar.f21397d++;
            p.c cVar2 = aVar.f21395b;
            if (cVar2 == null) {
                aVar.f21394a = cVar;
                aVar.f21395b = cVar;
            } else {
                cVar2.f21389c = cVar;
                cVar.f21390d = cVar2;
                aVar.f21395b = cVar;
            }
            hashMap2.put(object, cVar);
        }
        if (((f0) obj) == null && (e0Var = (e0) this.f2170e.get()) != null) {
            boolean z10 = this.f2171f != 0 || this.f2172g;
            x c2 = c(object);
            this.f2171f++;
            while (f0Var.f2162a.compareTo(c2) < 0 && this.f2168c.f21383e.containsKey(object)) {
                x xVar2 = f0Var.f2162a;
                ArrayList arrayList = this.f2174i;
                arrayList.add(xVar2);
                u uVar = w.Companion;
                x xVar3 = f0Var.f2162a;
                uVar.getClass();
                w b10 = u.b(xVar3);
                if (b10 == null) {
                    throw new IllegalStateException("no event up from " + f0Var.f2162a);
                }
                f0Var.a(e0Var, b10);
                arrayList.remove(arrayList.size() - 1);
                c2 = c(object);
            }
            if (!z10) {
                h();
            }
            this.f2171f--;
        }
    }

    @Override // androidx.lifecycle.y
    public final void b(d0 observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f2168c.b(observer);
    }

    public final x c(d0 d0Var) {
        HashMap hashMap = this.f2168c.f21383e;
        p.c cVar = hashMap.containsKey(d0Var) ? ((p.c) hashMap.get(d0Var)).f21390d : null;
        x state1 = cVar != null ? ((f0) cVar.f21388b).f2162a : null;
        ArrayList arrayList = this.f2174i;
        x xVar = arrayList.isEmpty() ? null : (x) arrayList.get(arrayList.size() - 1);
        x state12 = this.f2169d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (xVar == null || xVar.compareTo(state1) >= 0) ? state1 : xVar;
    }

    public final void d(String str) {
        if (this.f2167b && !o.b.K0().L0()) {
            throw new IllegalStateException(androidx.appcompat.widget.c1.n("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(w event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(x next) {
        if (this.f2169d == next) {
            return;
        }
        e0 e0Var = (e0) this.f2170e.get();
        x current = this.f2169d;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == x.f2254b && next == x.f2253a) {
            throw new IllegalStateException(("State must be at least '" + x.f2255c + "' to be moved to '" + next + "' in component " + e0Var).toString());
        }
        x xVar = x.f2253a;
        if (current == xVar && current != next) {
            throw new IllegalStateException(("State is '" + xVar + "' and cannot be moved to `" + next + "` in component " + e0Var).toString());
        }
        this.f2169d = next;
        if (this.f2172g || this.f2171f != 0) {
            this.f2173h = true;
            return;
        }
        this.f2172g = true;
        h();
        this.f2172g = false;
        if (this.f2169d == xVar) {
            this.f2168c = new p.a();
        }
    }

    public final void g(x state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f2173h = false;
        r7.j.j(r7.f2169d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        e0 e0Var = (e0) this.f2170e.get();
        if (e0Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p.a aVar = this.f2168c;
            if (aVar.f21397d != 0) {
                p.c cVar = aVar.f21394a;
                Intrinsics.checkNotNull(cVar);
                x xVar = ((f0) cVar.f21388b).f2162a;
                p.c cVar2 = this.f2168c.f21395b;
                Intrinsics.checkNotNull(cVar2);
                x xVar2 = ((f0) cVar2.f21388b).f2162a;
                if (xVar == xVar2 && this.f2169d == xVar2) {
                    break;
                }
                this.f2173h = false;
                x xVar3 = this.f2169d;
                p.c cVar3 = this.f2168c.f21394a;
                Intrinsics.checkNotNull(cVar3);
                int compareTo = xVar3.compareTo(((f0) cVar3.f21388b).f2162a);
                ArrayList arrayList = this.f2174i;
                if (compareTo < 0) {
                    p.a aVar2 = this.f2168c;
                    p.b bVar = new p.b(aVar2.f21395b, aVar2.f21394a, 1);
                    aVar2.f21396c.put(bVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(bVar, "descendingIterator(...)");
                    while (bVar.hasNext() && !this.f2173h) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        Intrinsics.checkNotNull(entry);
                        d0 d0Var = (d0) entry.getKey();
                        f0 f0Var = (f0) entry.getValue();
                        while (f0Var.f2162a.compareTo(this.f2169d) > 0 && !this.f2173h && this.f2168c.f21383e.containsKey(d0Var)) {
                            u uVar = w.Companion;
                            x xVar4 = f0Var.f2162a;
                            uVar.getClass();
                            w a7 = u.a(xVar4);
                            if (a7 == null) {
                                throw new IllegalStateException("no event down from " + f0Var.f2162a);
                            }
                            arrayList.add(a7.a());
                            f0Var.a(e0Var, a7);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p.c cVar4 = this.f2168c.f21395b;
                if (!this.f2173h && cVar4 != null && this.f2169d.compareTo(((f0) cVar4.f21388b).f2162a) > 0) {
                    p.a aVar3 = this.f2168c;
                    aVar3.getClass();
                    p.d dVar = new p.d(aVar3);
                    aVar3.f21396c.put(dVar, Boolean.FALSE);
                    Intrinsics.checkNotNullExpressionValue(dVar, "iteratorWithAdditions(...)");
                    while (dVar.hasNext() && !this.f2173h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        d0 d0Var2 = (d0) entry2.getKey();
                        f0 f0Var2 = (f0) entry2.getValue();
                        while (f0Var2.f2162a.compareTo(this.f2169d) < 0 && !this.f2173h && this.f2168c.f21383e.containsKey(d0Var2)) {
                            arrayList.add(f0Var2.f2162a);
                            u uVar2 = w.Companion;
                            x xVar5 = f0Var2.f2162a;
                            uVar2.getClass();
                            w b10 = u.b(xVar5);
                            if (b10 == null) {
                                throw new IllegalStateException("no event up from " + f0Var2.f2162a);
                            }
                            f0Var2.a(e0Var, b10);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
