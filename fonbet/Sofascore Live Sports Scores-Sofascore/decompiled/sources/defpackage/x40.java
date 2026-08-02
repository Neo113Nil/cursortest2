package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x40 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x40(rsk rskVar, wma wmaVar, rsk rskVar2) {
        super(1);
        this.i = 0;
        this.j = rskVar;
        this.l = wmaVar;
        this.k = rskVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [rq3] */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ga5 ga5Var;
        int i = this.i;
        int i2 = 1;
        r4 = null;
        xvj xvjVar = null;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                rsk rskVar = (rsk) obj4;
                wma wmaVar = (wma) obj2;
                rsk rskVar2 = (rsk) obj3;
                uj2 t = ((ha5) obj).L0().t();
                if (rskVar.getView().getVisibility() != 8) {
                    rskVar.y = true;
                    ryd rydVar = wmaVar.n;
                    r4 = rydVar instanceof xy ? (xy) rydVar : 0;
                    if (r4 != 0) {
                        Canvas b = xx.b(t);
                        r4.getAndroidViewsHandler$ui().getClass();
                        rskVar2.draw(b);
                    }
                    rskVar.y = false;
                }
                return Unit.a;
            case 1:
                return new ha(i2, (SnapshotStateList) obj4, obj3, (r60) obj2);
            case 2:
                g85 g85Var = (g85) obj;
                if (!g85Var.n) {
                    return iyj.b;
                }
                if (g85Var.q != null) {
                    r3a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                Function1 function1 = g85Var.o;
                h85 h85Var = function1 != null ? (h85) function1.invoke((a85) obj4) : null;
                g85Var.q = h85Var;
                boolean z = h85Var != null;
                if (z) {
                    ((j00) ((xy) c6o.d0((g85) obj3)).getDragAndDropManager()).b.add(g85Var);
                }
                asf asfVar = (asf) obj2;
                asfVar.a = asfVar.a || z;
                return iyj.a;
            case 3:
                jyj jyjVar = (jyj) obj;
                g85 g85Var2 = (g85) jyjVar;
                if (!((j00) ((xy) c6o.d0((g85) obj3)).getDragAndDropManager()).b.contains(g85Var2) || !s9a.q(g85Var2, gvd.A((a85) obj2))) {
                    return iyj.a;
                }
                ((fsf) obj4).a = jyjVar;
                return iyj.c;
            case 4:
                f4g f4gVar = (f4g) obj;
                cdi cdiVar = (cdi) obj3;
                cdi cdiVar2 = (cdi) obj4;
                f4gVar.b(cdiVar2 != null ? ((Number) cdiVar2.getValue()).floatValue() : 1.0f);
                f4gVar.k(cdiVar != null ? ((Number) cdiVar.getValue()).floatValue() : 1.0f);
                f4gVar.l(cdiVar != null ? ((Number) cdiVar.getValue()).floatValue() : 1.0f);
                cdi cdiVar3 = (cdi) obj2;
                f4gVar.s(cdiVar3 != null ? ((xvj) cdiVar3.getValue()).a : xvj.b);
                return Unit.a;
            case 5:
                bxj bxjVar = ((zo5) obj3).a;
                of6 of6Var = (of6) obj2;
                int ordinal = ((po5) obj).ordinal();
                if (ordinal == 0) {
                    krg krgVar = bxjVar.d;
                    if (krgVar != null) {
                        xvjVar = new xvj(krgVar.b);
                    } else {
                        krg krgVar2 = of6Var.a.d;
                        if (krgVar2 != null) {
                            xvjVar = new xvj(krgVar2.b);
                        }
                    }
                } else if (ordinal == 1) {
                    xvjVar = (xvj) obj4;
                } else {
                    if (ordinal != 2) {
                        zzl.b();
                        return null;
                    }
                    krg krgVar3 = of6Var.a.d;
                    if (krgVar3 != null) {
                        xvjVar = new xvj(krgVar3.b);
                    } else {
                        krg krgVar4 = bxjVar.d;
                        if (krgVar4 != null) {
                            xvjVar = new xvj(krgVar4.b);
                        }
                    }
                }
                return new xvj(xvjVar != null ? xvjVar.a : xvj.b);
            case 6:
                ne8 ne8Var = (ne8) obj;
                if (!Intrinsics.c(ne8Var, (ne8) obj4)) {
                    if (Intrinsics.c(ne8Var, ((yd8) obj3).c)) {
                        a70.r("Focus search landed at the root.");
                        return null;
                    }
                    r2 = ((Boolean) ((Function1) obj2).invoke(ne8Var)).booleanValue();
                }
                return Boolean.valueOf(r2);
            case 7:
                ha5 ha5Var = (ha5) obj;
                yma ymaVar = (yma) obj4;
                wj2 wj2Var = ymaVar.a;
                ga5 ga5Var2 = ymaVar.b;
                ymaVar.b = (ga5) obj3;
                try {
                    kx4 u = ha5Var.L0().u();
                    ema z2 = ha5Var.L0().z();
                    uj2 t2 = ha5Var.L0().t();
                    long D = ha5Var.L0().D();
                    n29 n29Var = (n29) ha5Var.L0().b;
                    Function1 function12 = (Function1) obj2;
                    kx4 u2 = wj2Var.b.u();
                    ema z3 = wj2Var.b.z();
                    uj2 t3 = wj2Var.b.t();
                    long D2 = wj2Var.b.D();
                    sx2 sx2Var = wj2Var.b;
                    try {
                        n29 n29Var2 = (n29) sx2Var.b;
                        sx2Var.L(u);
                        sx2Var.M(z2);
                        sx2Var.K(t2);
                        sx2Var.N(D);
                        sx2Var.b = n29Var;
                        t2.o();
                        try {
                            function12.invoke(ymaVar);
                            t2.h();
                            sx2 sx2Var2 = wj2Var.b;
                            sx2Var2.L(u2);
                            sx2Var2.M(z3);
                            sx2Var2.K(t3);
                            sx2Var2.N(D2);
                            sx2Var2.b = n29Var2;
                            ymaVar.b = ga5Var2;
                            return Unit.a;
                        } catch (Throwable th) {
                            ga5Var = ga5Var2;
                            try {
                                t2.h();
                                sx2 sx2Var3 = wj2Var.b;
                                sx2Var3.L(u2);
                                sx2Var3.M(z3);
                                sx2Var3.K(t3);
                                sx2Var3.N(D2);
                                sx2Var3.b = n29Var2;
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                                ymaVar.b = ga5Var;
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        ga5Var = ga5Var2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ga5Var = ga5Var2;
                }
            case 8:
                zij zijVar = (zij) obj4;
                uij uijVar = (uij) obj3;
                if (xd5.c(zijVar.a(), uijVar.b) < 0) {
                    long j = uijVar.b;
                    AtomicReference atomicReference = zijVar.b;
                    yij yijVar = new yij(j);
                    while (true) {
                        Object obj5 = atomicReference.get();
                        Object invoke = yijVar.invoke(obj5);
                        while (!atomicReference.compareAndSet(obj5, invoke)) {
                            if (atomicReference.get() != obj5) {
                                break;
                            }
                        }
                    }
                }
                xw3.L(zijVar, null, null, new n7a((o7a) obj2, r4, i2), 3);
                return Unit.a;
            case 9:
                ppf ppfVar = (ppf) obj4;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                yuk yukVar = (yuk) obj2;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(yukVar);
                } else {
                    ppfVar.a.getViewTreeObserver().removeOnPreDrawListener(yukVar);
                }
                return Unit.a;
            default:
                ((View) obj).getClass();
                ((WebView) obj4).loadDataWithBaseURL((String) obj3, (String) obj2, null, null, null);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x40(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.i = i;
        this.j = obj;
        this.k = obj2;
        this.l = obj3;
    }
}
