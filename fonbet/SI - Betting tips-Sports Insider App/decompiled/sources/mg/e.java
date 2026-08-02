package mg;

import eg.f2;
import eg.j;
import eg.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.u;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e implements eg.i, f, f2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20723f = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f20724a;

    /* renamed from: c, reason: collision with root package name */
    public Object f20726c;
    private volatile /* synthetic */ Object state$volatile = h.f20730a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f20725b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f20727d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f20728e = h.f20733d;

    public e(CoroutineContext coroutineContext) {
        this.f20724a = coroutineContext;
    }

    @Override // eg.i
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20723f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f20731b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f20732c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f20725b;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c) it.next()).a();
            }
            this.f20728e = h.f20733d;
            this.f20725b = null;
            return;
        }
    }

    @Override // eg.f2
    public final void b(u uVar, int i5) {
        this.f20726c = uVar;
        this.f20727d = i5;
    }

    public final Object c(mf.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20723f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f20728e;
        ArrayList arrayList = this.f20725b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar3 = (c) it.next();
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f20731b);
            this.f20728e = h.f20733d;
            this.f20725b = null;
        }
        Object invoke = cVar2.f20712c.invoke(cVar2.f20710a, cVar2.f20713d, obj2);
        Continuation continuation = cVar2.f20714e;
        if (cVar2.f20713d == h.f20734e) {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function1) continuation).invoke(cVar);
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((Function2) continuation).invoke(invoke, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(mf.c cVar) {
        d frame;
        int i5;
        e eVar;
        if (cVar instanceof d) {
            frame = (d) cVar;
            int i10 = frame.f20722d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f20722d = i10 - Integer.MIN_VALUE;
                Object obj = frame.f20720b;
                lf.a aVar = lf.a.f20034a;
                i5 = frame.f20722d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    frame.f20719a = this;
                    frame.f20722d = 1;
                    l lVar = new l(1, lf.d.b(frame));
                    lVar.s();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20723f;
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        com.android.billingclient.api.a aVar2 = h.f20730a;
                        if (obj2 == aVar2) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            lVar.v(this);
                            break loop0;
                        }
                        if (obj2 instanceof List) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar2)) {
                                    Iterator it = ((Iterable) obj2).iterator();
                                    while (it.hasNext()) {
                                        c e7 = e(it.next());
                                        Intrinsics.checkNotNull(e7);
                                        e7.f20716g = null;
                                        e7.f20717h = -1;
                                        f(e7, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                        } else {
                            if (!(obj2 instanceof c)) {
                                throw new IllegalStateException(("unexpected state: " + obj2).toString());
                            }
                            Unit unit = Unit.f19194a;
                            c cVar2 = (c) obj2;
                            Object obj3 = this.f20728e;
                            vf.a aVar3 = cVar2.f20715f;
                            lVar.a(unit, aVar3 != null ? (vf.a) aVar3.invoke(this, cVar2.f20713d, obj3) : null);
                        }
                    }
                    Object r5 = lVar.r();
                    lf.a aVar4 = lf.a.f20034a;
                    if (r5 == aVar4) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (r5 != aVar4) {
                        r5 = Unit.f19194a;
                    }
                    if (r5 != aVar) {
                        eVar = this;
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return obj;
                }
                eVar = frame.f20719a;
                h8.b.B(obj);
                frame.f20719a = null;
                frame.f20722d = 2;
                Object c2 = eVar.c(frame);
                return c2 != aVar ? aVar : c2;
            }
        }
        frame = new d(this, cVar);
        Object obj4 = frame.f20720b;
        lf.a aVar5 = lf.a.f20034a;
        i5 = frame.f20722d;
        if (i5 != 0) {
        }
        frame.f20719a = null;
        frame.f20722d = 2;
        Object c22 = eVar.c(frame);
        if (c22 != aVar5) {
        }
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f20725b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((c) next).f20710a == obj) {
                obj2 = next;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z5) {
        Object obj = cVar.f20710a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20723f;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z5) {
            ArrayList arrayList = this.f20725b;
            Intrinsics.checkNotNull(arrayList);
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f20710a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f20711b.invoke(obj, this, cVar.f20713d);
        if (this.f20728e != h.f20733d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z5) {
            ArrayList arrayList2 = this.f20725b;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f20716g = this.f20726c;
        cVar.f20717h = this.f20727d;
        this.f20726c = null;
        this.f20727d = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20723f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof j)) {
                if (Intrinsics.areEqual(obj3, h.f20731b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, h.f20732c)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, h.f20730a)) {
                    List c2 = t.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, c2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList O = CollectionsKt.O((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, O)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            c e7 = e(obj);
            if (e7 != null) {
                vf.a aVar = e7.f20715f;
                vf.a aVar2 = aVar != null ? (vf.a) aVar.invoke(this, e7.f20713d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, e7)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                j jVar = (j) obj3;
                this.f20728e = obj2;
                com.android.billingclient.api.a f6 = jVar.f(Unit.f19194a, aVar2);
                if (f6 == null) {
                    this.f20728e = h.f20733d;
                    return 2;
                }
                jVar.i(f6);
                return 0;
            }
            continue;
        }
    }
}
