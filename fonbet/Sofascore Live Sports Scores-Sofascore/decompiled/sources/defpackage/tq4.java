package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tq4 implements p6b {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public tq4(t6b t6bVar) {
        this.a = 5;
        this.b = t6bVar;
        bw2 bw2Var = bw2.c;
        Class<?> cls = t6bVar.getClass();
        zv2 zv2Var = (zv2) bw2Var.a.get(cls);
        this.c = zv2Var == null ? bw2Var.a(cls, null) : zv2Var;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                rq4 rq4Var = (rq4) obj;
                switch (sq4.a[d6bVar.ordinal()]) {
                    case 1:
                        rq4Var.i(u6bVar);
                        break;
                    case 2:
                        rq4Var.onStart(u6bVar);
                        break;
                    case 3:
                        rq4Var.e(u6bVar);
                        break;
                    case 4:
                        rq4Var.g(u6bVar);
                        break;
                    case 5:
                        rq4Var.onStop(u6bVar);
                        break;
                    case 6:
                        rq4Var.onDestroy(u6bVar);
                        break;
                    case 7:
                        a70.p("ON_ANY must not been send by anybody");
                        break;
                    default:
                        zzl.b();
                        break;
                }
                p6b p6bVar = (p6b) obj2;
                if (p6bVar != null) {
                    p6bVar.onStateChanged(u6bVar, d6bVar);
                    break;
                }
                break;
            case 1:
                vq8 vq8Var = (vq8) obj;
                wp8 wp8Var = (wp8) obj2;
                if (!wp8Var.b.S()) {
                    u6bVar.getLifecycle().d(this);
                    FrameLayout frameLayout = (FrameLayout) vq8Var.itemView;
                    WeakHashMap weakHashMap = bsk.a;
                    if (frameLayout.isAttachedToWindow()) {
                        wp8Var.t(vq8Var);
                        break;
                    }
                }
                break;
            case 2:
                if (d6bVar == d6b.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((b8) obj2);
                    u6bVar.getLifecycle().d(this);
                    break;
                }
                break;
            case 3:
                if (d6bVar == d6b.ON_START) {
                    ((g6b) obj).d(this);
                    ((nqg) obj2).d();
                    break;
                }
                break;
            case 4:
                opd opdVar = (opd) obj;
                int i2 = tpd.a[d6bVar.ordinal()];
                if (i2 == 1) {
                    opdVar.h(true);
                    break;
                } else if (i2 == 2) {
                    opdVar.h(false);
                    break;
                } else if (i2 == 3) {
                    opdVar.f();
                    ((g6b) obj2).d(this);
                    break;
                }
                break;
            default:
                t6b t6bVar = (t6b) obj;
                HashMap hashMap = ((zv2) obj2).a;
                zv2.a((List) hashMap.get(d6bVar), u6bVar, d6bVar, t6bVar);
                zv2.a((List) hashMap.get(d6b.ON_ANY), u6bVar, d6bVar, t6bVar);
                break;
        }
    }

    public /* synthetic */ tq4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public tq4(opd opdVar, upd updVar, g6b g6bVar) {
        this.a = 4;
        this.b = opdVar;
        this.c = g6bVar;
    }

    public tq4(wp8 wp8Var, vq8 vq8Var) {
        this.a = 1;
        this.c = wp8Var;
        this.b = vq8Var;
    }
}
