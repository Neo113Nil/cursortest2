package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vx0 implements n55 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vx0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.n55
    public final void d() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((qx0) obj2).b((zd3) obj);
                return;
            case 1:
                try {
                    ((Context) obj2).unbindService((ca4) obj);
                    return;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                ((d6d) obj2).h.j.d((v15) obj);
                return;
            case 3:
                ((u6b) obj2).getLifecycle().d((us5) obj);
                return;
            case 4:
                ((h2a) obj2).a.q((f2a) obj);
                return;
            case 5:
                ((ssa) obj2).c.k(obj);
                return;
            case 6:
                ((u6b) obj2).getLifecycle().d((ob3) obj);
                return;
            case 7:
                ((keb) obj2).i((leb) obj);
                return;
            case 8:
                Iterator it = ((List) ((cdi) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((oe3) obj).b().c((d6d) it.next());
                }
                return;
            case 9:
                ((me3) obj2).f();
                ((o8d) obj).e = null;
                return;
            case 10:
                ((u6b) obj2).getLifecycle().d((ob3) obj);
                return;
            case 11:
                axe axeVar = (axe) obj2;
                if (axeVar != null) {
                    ((ale) obj).z(axeVar);
                    return;
                }
                return;
            case 12:
                ((qx0) obj2).b((te3) obj);
                return;
            case 13:
                ((u6b) obj2).getLifecycle().d((ga) obj);
                return;
            case 14:
                e1d e1dVar = (e1d) obj2;
                l6f l6fVar = (l6f) e1dVar.getValue();
                if (l6fVar != null) {
                    k6f k6fVar = new k6f(l6fVar);
                    wzc wzcVar = (wzc) obj;
                    if (wzcVar != null) {
                        wzcVar.c(k6fVar);
                    }
                    e1dVar.setValue(null);
                    return;
                }
                return;
            case 15:
                ((hej) obj2).c.remove((Function1) obj);
                return;
            case 16:
                ((axj) obj2).j.remove((axj) obj);
                return;
            case 17:
                axj axjVar = (axj) obj2;
                axjVar.getClass();
                owj owjVar = (owj) ((eoh) ((pwj) obj).b).getValue();
                if (owjVar != null) {
                    axjVar.i.remove(owjVar.a);
                    return;
                }
                return;
            case 18:
                ((axj) obj2).i.remove((vwj) obj);
                return;
            default:
                cal calVar = (cal) obj2;
                View view = (View) obj;
                int i2 = calVar.u - 1;
                calVar.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = bsk.a;
                    srk.c(view, null);
                    d9l.a(view, null);
                    view.removeOnAttachStateChangeListener(calVar.v);
                    return;
                }
                return;
        }
    }
}
