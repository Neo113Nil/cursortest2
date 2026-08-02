package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vh9 implements ku3, Closeable {
    public static final /* synthetic */ long l = rh0.a.objectFieldOffset(vh9.class.getDeclaredField("closed"));
    public final cy a;
    public final boolean b;
    public final aea c;

    @NotNull
    private volatile /* synthetic */ int closed = 0;
    public final CoroutineContext d;
    public final rj9 e;
    public final rj9 f;
    public final rj9 g;
    public final rj9 h;
    public final xh3 i;
    public final de0 j;
    public final zh9 k;

    public vh9(cy cyVar, zh9 zh9Var) {
        this.a = cyVar;
        aea aeaVar = new aea((yda) cyVar.getCoroutineContext().get(uic.g));
        this.c = aeaVar;
        this.d = cyVar.getCoroutineContext().plus(aeaVar);
        this.e = new rj9(new ihe[]{rj9.i, rj9.j, rj9.k, rj9.l, rj9.m}, 1);
        this.f = new rj9(new ihe[]{rj9.n, rj9.o, rj9.p, rj9.q, rj9.r}, 2);
        ihe iheVar = rj9.s;
        ihe iheVar2 = rj9.t;
        ihe iheVar3 = rj9.u;
        ihe iheVar4 = rj9.v;
        ihe iheVar5 = rj9.w;
        rj9 rj9Var = new rj9(new ihe[]{iheVar, iheVar2, iheVar3, iheVar4, iheVar5}, 3);
        this.g = rj9Var;
        this.h = new rj9(new ihe[]{rj9.f, rj9.g, rj9.h}, 0);
        this.i = new xh3();
        this.j = new de0(20);
        zh9 zh9Var2 = new zh9();
        this.k = zh9Var2;
        if (this.b) {
            aeaVar.n(new th9(this));
        }
        rq3 rq3Var = null;
        int i = 6;
        rj9Var.f(iheVar4, new c37(this, cyVar, rq3Var, i));
        rj9Var.f(iheVar5, new tl(this, rq3Var, 12));
        int i2 = 29;
        zh9Var2.a(bk9.b, new c69(i2));
        zh9Var2.a(az1.c, new c69(i2));
        zh9Var2.a(g75.d, new c69(i2));
        zh9Var2.c.put("DefaultTransformers", new c69(28));
        zh9Var2.a(tk9.b, new c69(i2));
        sx2 sx2Var = sh9.b;
        zh9Var2.a(sx2Var, new c69(i2));
        zh9Var2.a(vj9.d, new c69(i2));
        zh9Var2.a.putAll(zh9Var.a);
        zh9Var2.b.putAll(zh9Var.b);
        zh9Var2.c.putAll(zh9Var.c);
        zh9Var2.a(pj9.b, new c69(i2));
        pm0 pm0Var = es4.a;
        zh9Var2.a(sx2Var, new bj4(zh9Var2));
        Iterator it = zh9Var2.a.values().iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(this);
        }
        Iterator it2 = zh9Var2.c.values().iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this);
        }
        this.f.f(rj9.n, new bx(this, rq3Var, i));
        this.b = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean isTerminated;
        if (rh0.a.compareAndSwapInt(this, l, 0, 1)) {
            xh3 xh3Var = (xh3) this.i.b(ji9.a);
            for (pm0 pm0Var : CollectionsKt.S0(xh3Var.c().keySet())) {
                pm0Var.getClass();
                Object b = xh3Var.b(pm0Var);
                if (b instanceof AutoCloseable) {
                    AutoCloseable autoCloseable = (AutoCloseable) b;
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            boolean z = false;
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (!z) {
                                        executorService.shutdownNow();
                                        z = true;
                                    }
                                }
                            }
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            ilg.c();
                            return;
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
            }
            this.c.j0();
            if (this.b) {
                this.a.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(yj9 yj9Var, sq3 sq3Var) {
        uh9 uh9Var;
        int i;
        if (sq3Var instanceof uh9) {
            uh9Var = (uh9) sq3Var;
            int i2 = uh9Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uh9Var.t = i2 - Integer.MIN_VALUE;
                Object obj = uh9Var.r;
                lu3 lu3Var = lu3.a;
                i = uh9Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    this.j.B(n4o.a);
                    Object obj2 = yj9Var.d;
                    uh9Var.t = 1;
                    obj = this.e.a(yj9Var, obj2, uh9Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                obj.getClass();
                return (xh9) obj;
            }
        }
        uh9Var = new uh9(this, sq3Var);
        Object obj3 = uh9Var.r;
        lu3 lu3Var2 = lu3.a;
        i = uh9Var.t;
        if (i != 0) {
        }
        obj3.getClass();
        return (xh9) obj3;
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.d;
    }

    public final String toString() {
        return "HttpClient[" + this.a + ']';
    }
}
