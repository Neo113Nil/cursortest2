package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.h0;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class za4 {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:13:0x0098, B:15:0x00a3, B:18:0x00b1, B:20:0x00b5, B:52:0x0050, B:54:0x0085), top: B:51:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1 A[Catch: all -> 0x00af, TryCatch #2 {all -> 0x00af, blocks: (B:13:0x0098, B:15:0x00a3, B:18:0x00b1, B:20:0x00b5, B:52:0x0050, B:54:0x0085), top: B:51:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Function1 function1, rq3 rq3Var) {
        hx0 hx0Var;
        int i;
        AtomicBoolean atomicBoolean;
        ln2 ln2Var;
        Object invoke;
        String str2;
        za4 za4Var;
        ln2 ln2Var2;
        AtomicBoolean atomicBoolean2;
        za4 za4Var2;
        String str3;
        a9m a9mVar;
        za4 za4Var3 = this;
        String str4 = str;
        Function1 function12 = function1;
        if (rq3Var instanceof hx0) {
            hx0Var = (hx0) rq3Var;
            int i2 = hx0Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hx0Var.y = i2 - Integer.MIN_VALUE;
                Object obj = hx0Var.w;
                lu3 lu3Var = lu3.a;
                i = hx0Var.y;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    try {
                        Object computeIfAbsent = za4Var3.a.computeIfAbsent(str4, new ux3(new q73(19), i3));
                        computeIfAbsent.getClass();
                        atomicBoolean = (AtomicBoolean) computeIfAbsent;
                        Object computeIfAbsent2 = za4Var3.b.computeIfAbsent(str4, new ux3(new q73(20), 2));
                        computeIfAbsent2.getClass();
                        ln2Var = (ln2) computeIfAbsent2;
                        if (atomicBoolean.compareAndSet(false, true)) {
                            hx0Var.r = za4Var3;
                            hx0Var.s = str4;
                            hx0Var.t = function12;
                            hx0Var.u = atomicBoolean;
                            hx0Var.v = ln2Var;
                            hx0Var.y = 1;
                            invoke = function12.invoke(hx0Var);
                            if (invoke == lu3Var) {
                                return lu3Var;
                            }
                        }
                        za4Var2 = za4Var3;
                        str3 = str4;
                        try {
                            return td4.t0(g.a, new vc2(ln2Var, atomicBoolean, za4Var2, str3, function12, null));
                        } catch (Throwable th) {
                            th = th;
                            za4Var3 = za4Var2;
                            str4 = str3;
                            za4Var = za4Var3;
                            str2 = str4;
                            ln2Var2 = (ln2) za4Var.b.get(str2);
                            atomicBoolean2 = (AtomicBoolean) za4Var.a.get(str2);
                            if (ln2Var2 != null) {
                            }
                            if (atomicBoolean2 != null) {
                            }
                            if (th instanceof CancellationException) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        za4Var = za4Var3;
                        str2 = str4;
                        ln2Var2 = (ln2) za4Var.b.get(str2);
                        atomicBoolean2 = (AtomicBoolean) za4Var.a.get(str2);
                        if (ln2Var2 != null) {
                        }
                        if (atomicBoolean2 != null) {
                        }
                        if (th instanceof CancellationException) {
                        }
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ln2 ln2Var3 = hx0Var.v;
                    AtomicBoolean atomicBoolean3 = hx0Var.u;
                    Function1 function13 = hx0Var.t;
                    str2 = hx0Var.s;
                    za4Var = hx0Var.r;
                    try {
                        y6a.M(obj);
                        atomicBoolean = atomicBoolean3;
                        za4Var3 = za4Var;
                        invoke = obj;
                        ln2Var = ln2Var3;
                        function12 = function13;
                        str4 = str2;
                    } catch (Throwable th3) {
                        th = th3;
                        ln2Var2 = (ln2) za4Var.b.get(str2);
                        atomicBoolean2 = (AtomicBoolean) za4Var.a.get(str2);
                        if (ln2Var2 != null) {
                            ln2Var2.d(Unit.a);
                        }
                        if (atomicBoolean2 != null) {
                            atomicBoolean2.set(false);
                        }
                        if (th instanceof CancellationException) {
                            throw th;
                        }
                        if ((th instanceof pz2) || (th instanceof oz2)) {
                            throw ml4.e("Container was disposed during content loading", th);
                        }
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        j1m j1mVar = j1m.a;
                        h0 h0Var = new h0();
                        h0Var.f = th;
                        h0Var.g = i9a.p("containerId", str2);
                        h0Var.b(th.getMessage());
                        j1m.a(h0Var);
                        return h0Var;
                    }
                }
                a9mVar = (a9m) invoke;
                ln2Var.d(Unit.a);
                if (!(a9mVar instanceof qbm)) {
                    return new ihm((List) ((qbm) a9mVar).a);
                }
                if (a9mVar instanceof a6m) {
                    a6m a6mVar = (a6m) a9mVar;
                    j1m j1mVar2 = j1m.a;
                    h0 h0Var2 = new h0();
                    h0Var2.f = a6mVar.a();
                    Map d = sub.d(new Pair("containerId", str4));
                    d.getClass();
                    h0Var2.g = d;
                    h0Var2.b(a6mVar.b());
                    j1m.a(h0Var2);
                    return h0Var2;
                }
                za4Var2 = za4Var3;
                str3 = str4;
                return td4.t0(g.a, new vc2(ln2Var, atomicBoolean, za4Var2, str3, function12, null));
            }
        }
        hx0Var = new hx0(za4Var3, rq3Var);
        Object obj2 = hx0Var.w;
        lu3 lu3Var2 = lu3.a;
        i = hx0Var.y;
        int i32 = 1;
        if (i != 0) {
        }
        a9mVar = (a9m) invoke;
        ln2Var.d(Unit.a);
        if (!(a9mVar instanceof qbm)) {
        }
    }
}
