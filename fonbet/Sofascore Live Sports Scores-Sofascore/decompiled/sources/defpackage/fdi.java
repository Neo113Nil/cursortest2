package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fdi extends u7 implements f1d, nj2, pt8 {
    public static final /* synthetic */ long f = rh0.a.objectFieldOffset(fdi.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public int e;

    public fdi(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.xdh
    public final List a() {
        return a.c(getValue());
    }

    @Override // defpackage.b1d
    public final boolean b(Object obj) {
        l(obj);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r13.equals(r14) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r14 == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (kotlin.Unit.a == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008c, B:19:0x0093, B:20:0x0097, B:24:0x009a, B:26:0x00bb, B:29:0x00cb, B:30:0x00e5, B:36:0x00f9, B:41:0x0102, B:32:0x00ec, B:35:0x00f2, B:46:0x00a0, B:49:0x00a7, B:57:0x0047, B:59:0x0050, B:60:0x0073, B:62:0x005e, B:64:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008c, B:19:0x0093, B:20:0x0097, B:24:0x009a, B:26:0x00bb, B:29:0x00cb, B:30:0x00e5, B:36:0x00f9, B:41:0x0102, B:32:0x00ec, B:35:0x00f2, B:46:0x00a0, B:49:0x00a7, B:57:0x0047, B:59:0x0050, B:60:0x0073, B:62:0x005e, B:64:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ca -> B:14:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.z88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(b98 b98Var, rq3 rq3Var) {
        edi ediVar;
        lu3 lu3Var;
        int i;
        hdi hdiVar;
        b98 b98Var2;
        yda ydaVar;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (rq3Var instanceof edi) {
                ediVar = (edi) rq3Var;
                int i2 = ediVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ediVar.y = i2 - Integer.MIN_VALUE;
                    Object obj3 = ediVar.w;
                    lu3Var = lu3.a;
                    i = ediVar.y;
                    if (i != 0) {
                        y6a.M(obj3);
                        hdiVar = (hdi) f();
                        if (b98Var instanceof eki) {
                            ediVar.r = b98Var;
                            ediVar.s = hdiVar;
                            ediVar.y = 1;
                            if (((eki) b98Var).a(ediVar) == lu3Var) {
                                return lu3Var;
                            }
                        }
                    } else if (i == 1) {
                        hdiVar = ediVar.s;
                        b98Var = ediVar.r;
                        y6a.M(obj3);
                    } else if (i == 2) {
                        obj = ediVar.v;
                        ydaVar = ediVar.t;
                        hdiVar = ediVar.s;
                        b98Var2 = ediVar.r;
                        y6a.M(obj3);
                        AtomicReference atomicReference = hdiVar.a;
                        ih2 ih2Var = gdi.a;
                        andSet = atomicReference.getAndSet(ih2Var);
                        andSet.getClass();
                        if (andSet == gdi.b) {
                        }
                        Object objectVolatile = rh0.a.getObjectVolatile(this, f);
                        if (ydaVar != null) {
                        }
                        if (objectVolatile == rid.a) {
                        }
                        ediVar.r = b98Var2;
                        ediVar.s = hdiVar;
                        ediVar.t = ydaVar;
                        ediVar.u = null;
                        ediVar.v = objectVolatile;
                        ediVar.y = 2;
                        if (b98Var2.emit(obj2, ediVar) == lu3Var) {
                        }
                    } else {
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = ediVar.u;
                        ydaVar = ediVar.t;
                        hdiVar = ediVar.s;
                        b98Var2 = ediVar.r;
                        y6a.M(obj3);
                        Object objectVolatile2 = rh0.a.getObjectVolatile(this, f);
                        if (ydaVar != null && !ydaVar.isActive()) {
                            throw ydaVar.k();
                        }
                        obj2 = objectVolatile2 == rid.a ? null : objectVolatile2;
                        ediVar.r = b98Var2;
                        ediVar.s = hdiVar;
                        ediVar.t = ydaVar;
                        ediVar.u = null;
                        ediVar.v = objectVolatile2;
                        ediVar.y = 2;
                        if (b98Var2.emit(obj2, ediVar) == lu3Var) {
                            return lu3Var;
                        }
                        obj = objectVolatile2;
                        AtomicReference atomicReference2 = hdiVar.a;
                        ih2 ih2Var2 = gdi.a;
                        andSet = atomicReference2.getAndSet(ih2Var2);
                        andSet.getClass();
                        if (andSet == gdi.b) {
                            ediVar.r = b98Var2;
                            ediVar.s = hdiVar;
                            ediVar.t = ydaVar;
                            ediVar.u = obj;
                            ediVar.v = null;
                            ediVar.y = 3;
                            lj2 lj2Var = new lj2(1, z9a.b(ediVar));
                            lj2Var.t();
                            AtomicReference atomicReference3 = hdiVar.a;
                            while (true) {
                                if (atomicReference3.compareAndSet(ih2Var2, lj2Var)) {
                                    break;
                                }
                                if (atomicReference3.get() != ih2Var2) {
                                    p2g p2gVar = w2g.b;
                                    lj2Var.resumeWith(Unit.a);
                                    break;
                                }
                            }
                            Object q = lj2Var.q();
                            if (q != lu3.a) {
                            }
                        }
                        Object objectVolatile22 = rh0.a.getObjectVolatile(this, f);
                        if (ydaVar != null) {
                            throw ydaVar.k();
                        }
                        if (objectVolatile22 == rid.a) {
                        }
                        ediVar.r = b98Var2;
                        ediVar.s = hdiVar;
                        ediVar.t = ydaVar;
                        ediVar.u = null;
                        ediVar.v = objectVolatile22;
                        ediVar.y = 2;
                        if (b98Var2.emit(obj2, ediVar) == lu3Var) {
                        }
                    }
                    b98Var2 = b98Var;
                    ydaVar = (yda) ediVar.getContext().get(uic.g);
                    obj = null;
                    Object objectVolatile222 = rh0.a.getObjectVolatile(this, f);
                    if (ydaVar != null) {
                    }
                    if (objectVolatile222 == rid.a) {
                    }
                    ediVar.r = b98Var2;
                    ediVar.s = hdiVar;
                    ediVar.t = ydaVar;
                    ediVar.u = null;
                    ediVar.v = objectVolatile222;
                    ediVar.y = 2;
                    if (b98Var2.emit(obj2, ediVar) == lu3Var) {
                    }
                }
            }
            if (i != 0) {
            }
            b98Var2 = b98Var;
            ydaVar = (yda) ediVar.getContext().get(uic.g);
            obj = null;
            Object objectVolatile2222 = rh0.a.getObjectVolatile(this, f);
            if (ydaVar != null) {
            }
            if (objectVolatile2222 == rid.a) {
            }
            ediVar.r = b98Var2;
            ediVar.s = hdiVar;
            ediVar.t = ydaVar;
            ediVar.u = null;
            ediVar.v = objectVolatile2222;
            ediVar.y = 2;
            if (b98Var2.emit(obj2, ediVar) == lu3Var) {
            }
        } catch (Throwable th) {
            i(hdiVar);
            throw th;
        }
        ediVar = new edi(this, rq3Var);
        Object obj32 = ediVar.w;
        lu3Var = lu3.a;
        i = ediVar.y;
    }

    @Override // defpackage.b1d
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // defpackage.pt8
    public final z88 e(CoroutineContext coroutineContext, int i, a62 a62Var) {
        return (((i < 0 || i >= 2) && i != -2) || a62Var != a62.b) ? beh.c(this, coroutineContext, i, a62Var) : this;
    }

    @Override // defpackage.b1d, defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        l(obj);
        return Unit.a;
    }

    @Override // defpackage.u7
    public final v7 g() {
        return new hdi();
    }

    @Override // defpackage.ddi
    public final Object getValue() {
        Object objectVolatile = rh0.a.getObjectVolatile(this, f);
        if (objectVolatile == rid.a) {
            return null;
        }
        return objectVolatile;
    }

    @Override // defpackage.u7
    public final v7[] h() {
        return new hdi[2];
    }

    public final boolean k(Object obj, Object obj2) {
        ih2 ih2Var = rid.a;
        if (obj == null) {
            obj = ih2Var;
        }
        if (obj2 == null) {
            obj2 = ih2Var;
        }
        return m(obj, obj2);
    }

    public final void l(Object obj) {
        if (obj == null) {
            obj = rid.a;
        }
        m(null, obj);
    }

    public final boolean m(Object obj, Object obj2) {
        int i;
        v7[] v7VarArr;
        ih2 ih2Var;
        synchronized (this) {
            Unsafe unsafe = rh0.a;
            long j = f;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !Intrinsics.c(objectVolatile, obj)) {
                return false;
            }
            if (Intrinsics.c(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.e;
            if ((i2 & 1) != 0) {
                this.e = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.e = i3;
            v7[] v7VarArr2 = this.a;
            Unit unit = Unit.a;
            while (true) {
                hdi[] hdiVarArr = (hdi[]) v7VarArr2;
                if (hdiVarArr != null) {
                    for (hdi hdiVar : hdiVarArr) {
                        if (hdiVar != null) {
                            AtomicReference atomicReference = hdiVar.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (ih2Var = gdi.b)) {
                                    ih2 ih2Var2 = gdi.a;
                                    if (obj3 != ih2Var2) {
                                        while (!atomicReference.compareAndSet(obj3, ih2Var2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        Unit unit2 = Unit.a;
                                        p2g p2gVar = w2g.b;
                                        ((lj2) obj3).resumeWith(unit2);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, ih2Var)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.e;
                    if (i == i3) {
                        this.e = i3 + 1;
                        return true;
                    }
                    v7VarArr = this.a;
                    Unit unit3 = Unit.a;
                }
                v7VarArr2 = v7VarArr;
                i3 = i;
            }
        }
    }
}
