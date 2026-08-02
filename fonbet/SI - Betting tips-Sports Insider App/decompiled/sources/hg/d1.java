package hg;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d1 extends ig.b implements n0, g, ig.r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10672f = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f10673e;

    public d1(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cc, code lost:
    
        if (r6.c(r0) == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0075, B:17:0x007d, B:20:0x0084, B:21:0x0088, B:25:0x008b, B:27:0x00ac, B:30:0x00bc, B:33:0x0091, B:36:0x0098, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0075, B:17:0x007d, B:20:0x0084, B:21:0x0088, B:25:0x008b, B:27:0x00ac, B:30:0x00bc, B:33:0x0091, B:36:0x0098, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:15:0x0075). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cc -> B:15:0x0075). Please report as a decompilation issue!!! */
    @Override // hg.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(h hVar, Continuation continuation) {
        c1 c1Var;
        lf.a aVar;
        int i5;
        d1 d1Var;
        e1 e1Var;
        h hVar2;
        eg.e1 e1Var2;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (continuation instanceof c1) {
                c1Var = (c1) continuation;
                int i10 = c1Var.f10664h;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c1Var.f10664h = i10 - Integer.MIN_VALUE;
                    Object obj3 = c1Var.f10662f;
                    aVar = lf.a.f20034a;
                    i5 = c1Var.f10664h;
                    if (i5 != 0) {
                        h8.b.B(obj3);
                        d1Var = this;
                        e1Var = (e1) e();
                    } else if (i5 == 1) {
                        e1Var = c1Var.f10659c;
                        hVar = c1Var.f10658b;
                        d1Var = c1Var.f10657a;
                        h8.b.B(obj3);
                    } else if (i5 == 2) {
                        obj = c1Var.f10661e;
                        e1Var2 = c1Var.f10660d;
                        e1Var = c1Var.f10659c;
                        hVar2 = c1Var.f10658b;
                        d1Var = c1Var.f10657a;
                        h8.b.B(obj3);
                        andSet = e1Var.f10677a.getAndSet(u0.f10778b);
                        Intrinsics.checkNotNull(andSet);
                        if (andSet == u0.f10779c) {
                        }
                        Object obj4 = f10672f.get(d1Var);
                        if (e1Var2 != null) {
                        }
                        if (obj4 == ig.c.f11245b) {
                        }
                        c1Var.f10657a = d1Var;
                        c1Var.f10658b = hVar2;
                        c1Var.f10659c = e1Var;
                        c1Var.f10660d = e1Var2;
                        c1Var.f10661e = obj4;
                        c1Var.f10664h = 2;
                        if (hVar2.d(obj2, c1Var) == aVar) {
                        }
                    } else {
                        if (i5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c1Var.f10661e;
                        e1Var2 = c1Var.f10660d;
                        e1Var = c1Var.f10659c;
                        hVar2 = c1Var.f10658b;
                        d1Var = c1Var.f10657a;
                        h8.b.B(obj3);
                        Object obj42 = f10672f.get(d1Var);
                        if (e1Var2 != null && !e1Var2.c()) {
                            throw e1Var2.y();
                        }
                        obj2 = obj42 == ig.c.f11245b ? null : obj42;
                        c1Var.f10657a = d1Var;
                        c1Var.f10658b = hVar2;
                        c1Var.f10659c = e1Var;
                        c1Var.f10660d = e1Var2;
                        c1Var.f10661e = obj42;
                        c1Var.f10664h = 2;
                        if (hVar2.d(obj2, c1Var) == aVar) {
                            return aVar;
                        }
                        obj = obj42;
                        andSet = e1Var.f10677a.getAndSet(u0.f10778b);
                        Intrinsics.checkNotNull(andSet);
                        if (andSet == u0.f10779c) {
                            c1Var.f10657a = d1Var;
                            c1Var.f10658b = hVar2;
                            c1Var.f10659c = e1Var;
                            c1Var.f10660d = e1Var2;
                            c1Var.f10661e = obj;
                            c1Var.f10664h = 3;
                        }
                        Object obj422 = f10672f.get(d1Var);
                        if (e1Var2 != null) {
                            throw e1Var2.y();
                        }
                        if (obj422 == ig.c.f11245b) {
                        }
                        c1Var.f10657a = d1Var;
                        c1Var.f10658b = hVar2;
                        c1Var.f10659c = e1Var;
                        c1Var.f10660d = e1Var2;
                        c1Var.f10661e = obj422;
                        c1Var.f10664h = 2;
                        if (hVar2.d(obj2, c1Var) == aVar) {
                        }
                    }
                    hVar2 = hVar;
                    e1Var2 = (eg.e1) c1Var.getContext().r(eg.x.f9237b);
                    obj = null;
                    Object obj4222 = f10672f.get(d1Var);
                    if (e1Var2 != null) {
                    }
                    if (obj4222 == ig.c.f11245b) {
                    }
                    c1Var.f10657a = d1Var;
                    c1Var.f10658b = hVar2;
                    c1Var.f10659c = e1Var;
                    c1Var.f10660d = e1Var2;
                    c1Var.f10661e = obj4222;
                    c1Var.f10664h = 2;
                    if (hVar2.d(obj2, c1Var) == aVar) {
                    }
                }
            }
            if (i5 != 0) {
            }
            hVar2 = hVar;
            e1Var2 = (eg.e1) c1Var.getContext().r(eg.x.f9237b);
            obj = null;
            Object obj42222 = f10672f.get(d1Var);
            if (e1Var2 != null) {
            }
            if (obj42222 == ig.c.f11245b) {
            }
            c1Var.f10657a = d1Var;
            c1Var.f10658b = hVar2;
            c1Var.f10659c = e1Var;
            c1Var.f10660d = e1Var2;
            c1Var.f10661e = obj42222;
            c1Var.f10664h = 2;
            if (hVar2.d(obj2, c1Var) == aVar) {
            }
        } catch (Throwable th2) {
            d1Var.h(e1Var);
            throw th2;
        }
        c1Var = new c1(this, continuation);
        Object obj32 = c1Var.f10662f;
        aVar = lf.a.f20034a;
        i5 = c1Var.f10664h;
    }

    @Override // hg.m0
    public final boolean b(Object obj) {
        k(null, obj);
        return true;
    }

    @Override // ig.r
    public final g c(CoroutineContext coroutineContext, int i5, gg.a aVar) {
        return (((i5 < 0 || i5 >= 2) && i5 != -2) || aVar != gg.a.f10049b) ? u0.o(this, coroutineContext, i5, aVar) : this;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        j(obj);
        return Unit.f19194a;
    }

    @Override // ig.b
    public final ig.d f() {
        return new e1();
    }

    @Override // ig.b
    public final ig.d[] g() {
        return new e1[2];
    }

    @Override // hg.b1
    public final Object getValue() {
        com.android.billingclient.api.a aVar = ig.c.f11245b;
        Object obj = f10672f.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = ig.c.f11245b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i5;
        ig.d[] dVarArr;
        com.android.billingclient.api.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10672f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f10673e;
            if ((i10 & 1) != 0) {
                this.f10673e = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f10673e = i11;
            ig.d[] dVarArr2 = this.f11240a;
            Unit unit = Unit.f19194a;
            while (true) {
                e1[] e1VarArr = (e1[]) dVarArr2;
                if (e1VarArr != null) {
                    for (e1 e1Var : e1VarArr) {
                        if (e1Var != null) {
                            AtomicReference atomicReference = e1Var.f10677a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (aVar = u0.f10779c)) {
                                    com.android.billingclient.api.a aVar2 = u0.f10778b;
                                    if (obj4 != aVar2) {
                                        while (!atomicReference.compareAndSet(obj4, aVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        gf.o oVar = gf.q.f10031a;
                                        ((eg.l) obj4).resumeWith(Unit.f19194a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, aVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i5 = this.f10673e;
                    if (i5 == i11) {
                        this.f10673e = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f11240a;
                    Unit unit2 = Unit.f19194a;
                }
                dVarArr2 = dVarArr;
                i11 = i5;
            }
        }
    }
}
