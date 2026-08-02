package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gah {
    public final CoroutineContext a;
    public final vhj b;
    public final ye4 c;
    public final AtomicReference d;

    public gah(CoroutineContext coroutineContext, vhj vhjVar, ye4 ye4Var) {
        coroutineContext.getClass();
        vhjVar.getClass();
        ye4Var.getClass();
        this.a = coroutineContext;
        this.b = vhjVar;
        this.c = ye4Var;
        this.d = new AtomicReference();
        xw3.L(s9a.c(coroutineContext), null, null, new eah(this, null, 0), 3);
    }

    public final o7h a() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object t0 = td4.t0(g.a, new eah(this, null, 1));
            while (!atomicReference.compareAndSet(null, t0) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (o7h) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.b.getClass();
        return vhj.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r5.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o7h o7hVar, sq3 sq3Var) {
        fah fahVar;
        int i;
        if (sq3Var instanceof fah) {
            fahVar = (fah) sq3Var;
            int i2 = fahVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fahVar.t = i2 - Integer.MIN_VALUE;
                Object obj = fahVar.r;
                lu3 lu3Var = lu3.a;
                i = fahVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    ye4 ye4Var = this.c;
                    hje hjeVar = new hje(o7hVar, rq3Var, 6);
                    fahVar.t = 1;
                    if (ye4Var.a(hjeVar, fahVar) == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Unit.a;
            }
        }
        fahVar = new fah(this, sq3Var);
        Object obj2 = fahVar.r;
        lu3 lu3Var2 = lu3.a;
        i = fahVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return Unit.a;
    }
}
