package hg;

import eg.t1;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10777a = new com.android.billingclient.api.a("NO_VALUE", 9);

    /* renamed from: b, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10778b = new com.android.billingclient.api.a("NONE", 9);

    /* renamed from: c, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10779c = new com.android.billingclient.api.a("PENDING", 9);

    public static final t0 a(int i5, int i10, gg.a aVar) {
        if (i5 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i5, "replay cannot be negative, but was ").toString());
        }
        if (i10 < 0) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i10, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i5 <= 0 && i10 <= 0 && aVar != gg.a.f10048a) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + aVar).toString());
        }
        int i11 = i10 + i5;
        if (i11 < 0) {
            i11 = Integer.MAX_VALUE;
        }
        return new t0(i5, i11, aVar);
    }

    public static final d1 b(Object obj) {
        if (obj == null) {
            obj = ig.c.f11245b;
        }
        return new d1(obj);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final g e(g gVar, int i5, gg.a aVar) {
        if (i5 < 0 && i5 != -2 && i5 != -1) {
            throw new IllegalArgumentException(androidx.appcompat.widget.c1.i(i5, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i5 == -1 && aVar != gg.a.f10048a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i5 == -1) {
            aVar = gg.a.f10049b;
            i5 = 0;
        }
        int i10 = i5;
        gg.a aVar2 = aVar;
        return gVar instanceof ig.r ? ig.c.a((ig.r) gVar, null, i10, aVar2, 1) : new ig.g(gVar, null, i10, aVar2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable f(g gVar, h hVar, mf.c cVar) {
        v vVar;
        int i5;
        Ref.ObjectRef objectRef;
        Throwable th2;
        eg.e1 e1Var;
        CancellationException y5;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i10 = vVar.f10782c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                vVar.f10782c = i10 - Integer.MIN_VALUE;
                Object obj = vVar.f10781b;
                lf.a aVar = lf.a.f20034a;
                i5 = vVar.f10782c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        h xVar = new x(hVar, objectRef2);
                        vVar.f10780a = objectRef2;
                        vVar.f10782c = 1;
                        if (gVar.a(xVar, vVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = vVar.f10780a;
                    try {
                        h8.b.B(obj);
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                th2 = (Throwable) objectRef.element;
                if ((th2 == null && Intrinsics.areEqual(th2, th)) || ((e1Var = (eg.e1) vVar.getContext().r(eg.x.f9237b)) != null && e1Var.isCancelled() && (y5 = e1Var.y()) != null && Intrinsics.areEqual(y5, th))) {
                    throw th;
                }
                if (th2 != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    gf.d.a(th2, th);
                    throw th2;
                }
                gf.d.a(th, th2);
                throw th;
            }
        }
        vVar = new v(cVar);
        Object obj2 = vVar.f10781b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = vVar.f10782c;
        if (i5 != 0) {
        }
        th2 = (Throwable) objectRef.element;
        if (th2 == null) {
        }
        if (th2 != null) {
        }
    }

    public static final Object g(g gVar, Function2 function2, Continuation continuation) {
        int i5 = e0.f10676a;
        d0 d0Var = new d0(function2, null);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f19227a;
        gg.a aVar = gg.a.f10048a;
        Object a7 = e(new ig.k(d0Var, gVar, gVar2, -2, aVar), 0, aVar).a(ig.t.f11285a, continuation);
        lf.a aVar2 = lf.a.f20034a;
        if (a7 != aVar2) {
            a7 = Unit.f19194a;
        }
        return a7 == aVar2 ? a7 : Unit.f19194a;
    }

    public static final g h(g gVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        if (j == 0) {
            return gVar;
        }
        return new c1.u(5, new n(new j(j, 0), gVar, null));
    }

    public static final g i(g gVar) {
        return gVar instanceof b1 ? gVar : gVar instanceof f ? gVar : new f(gVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r2.d(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0057, B:20:0x006c, B:22:0x0074, B:24:0x007a, B:26:0x0080, B:28:0x0091, B:29:0x0099, B:30:0x009a, B:31:0x00a1, B:39:0x0048, B:42:0x0053), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(h hVar, gg.y yVar, boolean z5, mf.c cVar) {
        i iVar;
        int i5;
        gg.c it;
        gg.c cVar2;
        h hVar2;
        Object a7;
        try {
            if (cVar instanceof i) {
                iVar = (i) cVar;
                int i10 = iVar.f10696f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    iVar.f10696f = i10 - Integer.MIN_VALUE;
                    Object obj = iVar.f10695e;
                    lf.a aVar = lf.a.f20034a;
                    i5 = iVar.f10696f;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        if (hVar instanceof f1) {
                            throw ((f1) hVar).f10681a;
                        }
                        it = yVar.iterator();
                        iVar.f10691a = hVar;
                        iVar.f10692b = yVar;
                        iVar.f10693c = it;
                        iVar.f10694d = z5;
                        iVar.f10696f = 1;
                        a7 = it.a(iVar);
                        if (a7 != aVar) {
                        }
                    } else if (i5 == 1) {
                        z5 = iVar.f10694d;
                        cVar2 = iVar.f10693c;
                        yVar = iVar.f10692b;
                        hVar2 = iVar.f10691a;
                        h8.b.B(obj);
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z5 = iVar.f10694d;
                        cVar2 = iVar.f10693c;
                        yVar = iVar.f10692b;
                        hVar2 = iVar.f10691a;
                        h8.b.B(obj);
                        it = cVar2;
                        hVar = hVar2;
                        iVar.f10691a = hVar;
                        iVar.f10692b = yVar;
                        iVar.f10693c = it;
                        iVar.f10694d = z5;
                        iVar.f10696f = 1;
                        a7 = it.a(iVar);
                        if (a7 != aVar) {
                            return aVar;
                        }
                        hVar2 = hVar;
                        cVar2 = it;
                        obj = a7;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z5) {
                                yVar.k(null);
                            }
                            return Unit.f19194a;
                        }
                        Object obj2 = cVar2.f10053a;
                        com.android.billingclient.api.a aVar2 = gg.j.f10088p;
                        if (obj2 == aVar2) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        cVar2.f10053a = aVar2;
                        if (obj2 == gg.j.f10084l) {
                            Throwable r5 = cVar2.f10055c.r();
                            int i11 = jg.v.f18528a;
                            throw r5;
                        }
                        iVar.f10691a = hVar2;
                        iVar.f10692b = yVar;
                        iVar.f10693c = cVar2;
                        iVar.f10694d = z5;
                        iVar.f10696f = 2;
                    }
                }
            }
            if (i5 != 0) {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                if (z5) {
                    CancellationException cancellationException = th2 instanceof CancellationException ? th2 : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th2);
                    }
                    yVar.k(cancellationException);
                }
                throw th3;
            }
        }
        iVar = new i(cVar);
        Object obj3 = iVar.f10695e;
        lf.a aVar3 = lf.a.f20034a;
        i5 = iVar.f10696f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.android.billingclient.api.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(c1.u uVar, mf.c cVar) {
        h0 h0Var;
        int i5;
        Ref.ObjectRef objectRef;
        ig.a e7;
        f0 f0Var;
        T t3;
        ?? r02 = ig.c.f11245b;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i10 = h0Var.f10690d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                h0Var.f10690d = i10 - Integer.MIN_VALUE;
                Object obj = h0Var.f10689c;
                Object obj2 = lf.a.f20034a;
                i5 = h0Var.f10690d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.element = r02;
                    f0 f0Var2 = new f0(objectRef2, 0);
                    try {
                        h0Var.f10687a = objectRef2;
                        h0Var.f10688b = f0Var2;
                        h0Var.f10690d = 1;
                        if (uVar.a(f0Var2, h0Var) == obj2) {
                            return obj2;
                        }
                        objectRef = objectRef2;
                    } catch (ig.a e9) {
                        objectRef = objectRef2;
                        e7 = e9;
                        f0Var = f0Var2;
                        if (e7.f11239a == f0Var) {
                            throw e7;
                        }
                        eg.c0.k(h0Var.getContext());
                        t3 = objectRef.element;
                        if (t3 != r02) {
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var = h0Var.f10688b;
                    objectRef = h0Var.f10687a;
                    try {
                        h8.b.B(obj);
                    } catch (ig.a e10) {
                        e7 = e10;
                        if (e7.f11239a == f0Var) {
                        }
                    }
                }
                t3 = objectRef.element;
                if (t3 != r02) {
                    return t3;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        h0Var = new h0(cVar);
        Object obj3 = h0Var.f10689c;
        Object obj22 = lf.a.f20034a;
        i5 = h0Var.f10690d;
        if (i5 != 0) {
        }
        t3 = objectRef.element;
        if (t3 != r02) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, com.android.billingclient.api.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object l(ig.z zVar, bd.b bVar, mf.c cVar) {
        i0 i0Var;
        int i5;
        Ref.ObjectRef objectRef;
        ig.a e7;
        bd.f fVar;
        T t3;
        ?? r02 = ig.c.f11245b;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f10700d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f10700d = i10 - Integer.MIN_VALUE;
                Object obj = i0Var.f10699c;
                lf.a aVar = lf.a.f20034a;
                i5 = i0Var.f10700d;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar = i0Var.f10698b;
                    objectRef = i0Var.f10697a;
                    try {
                        h8.b.B(obj);
                    } catch (ig.a e9) {
                        e7 = e9;
                    }
                    t3 = objectRef.element;
                    if (t3 == r02) {
                        return t3;
                    }
                    throw new NoSuchElementException("Expected at least one element matching the predicate");
                }
                h8.b.B(obj);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = r02;
                bd.f fVar2 = new bd.f(2, bVar, objectRef2);
                try {
                    i0Var.f10697a = objectRef2;
                    i0Var.f10698b = fVar2;
                    i0Var.f10700d = 1;
                    zVar.a(fVar2, i0Var);
                    return aVar;
                } catch (ig.a e10) {
                    objectRef = objectRef2;
                    e7 = e10;
                    fVar = fVar2;
                }
                if (e7.f11239a == fVar) {
                    throw e7;
                }
                eg.c0.k(i0Var.getContext());
                t3 = objectRef.element;
                if (t3 == r02) {
                }
            }
        }
        i0Var = new i0(cVar);
        Object obj2 = i0Var.f10699c;
        lf.a aVar2 = lf.a.f20034a;
        i5 = i0Var.f10700d;
        if (i5 == 0) {
        }
        if (e7.f11239a == fVar) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(g gVar, mf.c cVar) {
        j0 j0Var;
        int i5;
        Ref.ObjectRef objectRef;
        ig.a e7;
        f0 f0Var;
        if (cVar instanceof j0) {
            j0Var = (j0) cVar;
            int i10 = j0Var.f10706d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j0Var.f10706d = i10 - Integer.MIN_VALUE;
                Object obj = j0Var.f10705c;
                Object obj2 = lf.a.f20034a;
                i5 = j0Var.f10706d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    f0 f0Var2 = new f0(objectRef2, 1);
                    try {
                        j0Var.f10703a = objectRef2;
                        j0Var.f10704b = f0Var2;
                        j0Var.f10706d = 1;
                        if (gVar.a(f0Var2, j0Var) == obj2) {
                            return obj2;
                        }
                        objectRef = objectRef2;
                    } catch (ig.a e9) {
                        objectRef = objectRef2;
                        e7 = e9;
                        f0Var = f0Var2;
                        if (e7.f11239a == f0Var) {
                            throw e7;
                        }
                        eg.c0.k(j0Var.getContext());
                        return objectRef.element;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var = j0Var.f10704b;
                    objectRef = j0Var.f10703a;
                    try {
                        h8.b.B(obj);
                    } catch (ig.a e10) {
                        e7 = e10;
                        if (e7.f11239a == f0Var) {
                        }
                    }
                }
                return objectRef.element;
            }
        }
        j0Var = new j0(cVar);
        Object obj3 = j0Var.f10705c;
        Object obj22 = lf.a.f20034a;
        i5 = j0Var.f10706d;
        if (i5 != 0) {
        }
        return objectRef.element;
    }

    public static final g n(g gVar, CoroutineContext coroutineContext) {
        if (coroutineContext.r(eg.x.f9237b) == null) {
            return Intrinsics.areEqual(coroutineContext, kotlin.coroutines.g.f19227a) ? gVar : gVar instanceof ig.r ? ig.c.a((ig.r) gVar, coroutineContext, 0, null, 6) : new ig.g(gVar, coroutineContext, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    public static final g o(q0 q0Var, CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return ((i5 == 0 || i5 == -3) && aVar == gg.a.f10048a) ? q0Var : new ig.g(i5, aVar, q0Var, coroutineContext);
    }

    public static final t1 p(g gVar, eg.z zVar) {
        return eg.c0.t(zVar, null, null, new androidx.lifecycle.b(gVar, (Continuation) null, 5), 3);
    }
}
