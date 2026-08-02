package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class rq8 extends mq8 {
    @Override // defpackage.mq8
    public final void a(View view, Object obj) {
        ((xwj) obj).b(view);
    }

    @Override // defpackage.mq8
    public final void b(Object obj, ArrayList arrayList) {
        xwj xwjVar = (xwj) obj;
        if (xwjVar == null) {
            return;
        }
        int i = 0;
        if (xwjVar instanceof jxj) {
            jxj jxjVar = (jxj) xwjVar;
            int size = jxjVar.E.size();
            while (i < size) {
                b(jxjVar.Q(i), arrayList);
                i++;
            }
            return;
        }
        if (mq8.k(xwjVar.e) && mq8.k(xwjVar.f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                xwjVar.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.mq8
    public final void c(Object obj) {
        ((swj) obj).g();
    }

    @Override // defpackage.mq8
    public final void d(Object obj, mc3 mc3Var) {
        swj swjVar = (swj) obj;
        swjVar.g = mc3Var;
        if (!swjVar.b) {
            swjVar.d = 2;
        } else {
            swjVar.h();
            swjVar.e.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // defpackage.mq8
    public final void e(ViewGroup viewGroup, Object obj) {
        hxj.a(viewGroup, (xwj) obj);
    }

    @Override // defpackage.mq8
    public final boolean g(Object obj) {
        return obj instanceof xwj;
    }

    @Override // defpackage.mq8
    public final Object h(Object obj) {
        if (obj != null) {
            return ((xwj) obj).clone();
        }
        return null;
    }

    @Override // defpackage.mq8
    public final Object i(ViewGroup viewGroup, Object obj) {
        xwj xwjVar = (xwj) obj;
        ArrayList arrayList = hxj.c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (xwjVar.t()) {
                arrayList.add(viewGroup);
                xwj clone = xwjVar.clone();
                jxj jxjVar = new jxj();
                jxjVar.P(clone);
                hxj.c(viewGroup, jxjVar);
                viewGroup.setTag(R.id.transition_current_scene, null);
                gxj gxjVar = new gxj();
                gxjVar.a = jxjVar;
                gxjVar.b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(gxjVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(gxjVar);
                viewGroup.invalidate();
                swj swjVar = new swj(jxjVar);
                jxjVar.y = swjVar;
                jxjVar.a(swjVar);
                return jxjVar.y;
            }
            a70.p("The Transition must support seeking.");
        }
        return null;
    }

    @Override // defpackage.mq8
    public final boolean l() {
        return true;
    }

    @Override // defpackage.mq8
    public final boolean m(Object obj) {
        boolean t = ((xwj) obj).t();
        if (!t) {
            Objects.toString(obj);
        }
        return t;
    }

    @Override // defpackage.mq8
    public final Object n(Object obj, Object obj2, Object obj3) {
        xwj xwjVar = (xwj) obj;
        xwj xwjVar2 = (xwj) obj2;
        xwj xwjVar3 = (xwj) obj3;
        if (xwjVar != null && xwjVar2 != null) {
            jxj jxjVar = new jxj();
            jxjVar.P(xwjVar);
            jxjVar.P(xwjVar2);
            jxjVar.F = false;
            xwjVar = jxjVar;
        } else if (xwjVar == null) {
            xwjVar = xwjVar2 != null ? xwjVar2 : null;
        }
        if (xwjVar3 == null) {
            return xwjVar;
        }
        jxj jxjVar2 = new jxj();
        if (xwjVar != null) {
            jxjVar2.P(xwjVar);
        }
        jxjVar2.P(xwjVar3);
        return jxjVar2;
    }

    @Override // defpackage.mq8
    public final Object o(Object obj, Object obj2) {
        jxj jxjVar = new jxj();
        if (obj != null) {
            jxjVar.P((xwj) obj);
        }
        jxjVar.P((xwj) obj2);
        return jxjVar;
    }

    @Override // defpackage.mq8
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((xwj) obj).a(new oq8(view, arrayList));
    }

    @Override // defpackage.mq8
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((xwj) obj).a(new pq8(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.mq8
    public final void r(Object obj, float f) {
        swj swjVar = (swj) obj;
        boolean z = swjVar.b;
        if (z) {
            jxj jxjVar = swjVar.h;
            long j = jxjVar.x;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (swjVar.e != null) {
                a70.r("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = swjVar.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!swjVar.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    jxjVar.E(j2, j3);
                    swjVar.a = j2;
                }
            }
            b10 b10Var = swjVar.f;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i = (b10Var.b + 1) % 20;
            b10Var.b = i;
            ((long[]) b10Var.c)[i] = currentAnimationTimeMillis;
            ((float[]) b10Var.d)[i] = j2;
        }
    }

    @Override // defpackage.mq8
    public final void s(View view, Object obj) {
        if (view != null) {
            mq8.j(new Rect(), view);
            ((xwj) obj).G(new nq8());
        }
    }

    @Override // defpackage.mq8
    public final void t(Object obj, Rect rect) {
        ((xwj) obj).G(new nq8());
    }

    @Override // defpackage.mq8
    public final void u(Fragment fragment, Object obj, rj2 rj2Var, Runnable runnable) {
        v(obj, rj2Var, null, runnable);
    }

    @Override // defpackage.mq8
    public final void v(Object obj, rj2 rj2Var, wb3 wb3Var, Runnable runnable) {
        xwj xwjVar = (xwj) obj;
        li3 li3Var = new li3(6, wb3Var, xwjVar, runnable);
        synchronized (rj2Var) {
            while (rj2Var.b) {
                try {
                    try {
                        rj2Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (((li3) rj2Var.c) != li3Var) {
                rj2Var.c = li3Var;
                if (rj2Var.a) {
                    Runnable runnable2 = (Runnable) li3Var.b;
                    xwj xwjVar2 = (xwj) li3Var.c;
                    Runnable runnable3 = (Runnable) li3Var.d;
                    if (runnable2 == null) {
                        xwjVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        xwjVar.a(new qq8(runnable));
    }

    @Override // defpackage.mq8
    public final void w(Object obj, View view, ArrayList arrayList) {
        jxj jxjVar = (jxj) obj;
        ArrayList arrayList2 = jxjVar.f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mq8.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(jxjVar, arrayList);
    }

    @Override // defpackage.mq8
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        jxj jxjVar = (jxj) obj;
        if (jxjVar != null) {
            ArrayList arrayList3 = jxjVar.f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(jxjVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.mq8
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        jxj jxjVar = new jxj();
        jxjVar.P((xwj) obj);
        return jxjVar;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        xwj xwjVar = (xwj) obj;
        int i = 0;
        if (xwjVar instanceof jxj) {
            jxj jxjVar = (jxj) xwjVar;
            int size = jxjVar.E.size();
            while (i < size) {
                z(jxjVar.Q(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (mq8.k(xwjVar.e)) {
            ArrayList arrayList3 = xwjVar.f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    xwjVar.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    xwjVar.B((View) arrayList.get(size3));
                }
            }
        }
    }
}
