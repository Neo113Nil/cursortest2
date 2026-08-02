package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a2;
import com.sports.insider.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n extends a2 {
    public static boolean z(a0 a0Var) {
        return (a2.k(a0Var.getTargetIds()) && a2.k(a0Var.getTargetNames()) && a2.k(a0Var.getTargetTypes())) ? false : true;
    }

    public final void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        a0 a0Var = (a0) obj;
        int i5 = 0;
        if (a0Var instanceof i0) {
            i0 i0Var = (i0) a0Var;
            int size = i0Var.f2709a.size();
            while (i5 < size) {
                A(i0Var.h(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (z(a0Var)) {
            return;
        }
        List<View> targets = a0Var.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i5 < size2) {
                a0Var.addTarget((View) arrayList2.get(i5));
                i5++;
            }
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                a0Var.removeTarget((View) arrayList.get(size3));
            }
        }
    }

    @Override // androidx.fragment.app.a2
    public final void a(View view, Object obj) {
        ((a0) obj).addTarget(view);
    }

    @Override // androidx.fragment.app.a2
    public final void b(Object obj, ArrayList arrayList) {
        a0 a0Var = (a0) obj;
        if (a0Var == null) {
            return;
        }
        int i5 = 0;
        if (a0Var instanceof i0) {
            i0 i0Var = (i0) a0Var;
            int size = i0Var.f2709a.size();
            while (i5 < size) {
                b(i0Var.h(i5), arrayList);
                i5++;
            }
            return;
        }
        if (z(a0Var) || !a2.k(a0Var.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i5 < size2) {
            a0Var.addTarget((View) arrayList.get(i5));
            i5++;
        }
    }

    @Override // androidx.fragment.app.a2
    public final void c(Object obj) {
        x xVar = (x) ((g0) obj);
        xVar.a();
        xVar.f2762d.a(xVar.f2765g.getTotalDurationMillis() + 1);
    }

    @Override // androidx.fragment.app.a2
    public final void d(Object obj, androidx.fragment.app.c cVar) {
        x xVar = (x) ((g0) obj);
        xVar.f2764f = cVar;
        xVar.a();
        xVar.f2762d.a(0.0f);
    }

    @Override // androidx.fragment.app.a2
    public final void e(ViewGroup viewGroup, Object obj) {
        e0.a(viewGroup, (a0) obj);
    }

    @Override // androidx.fragment.app.a2
    public final boolean g(Object obj) {
        return obj instanceof a0;
    }

    @Override // androidx.fragment.app.a2
    public final Object h(Object obj) {
        if (obj != null) {
            return ((a0) obj).mo68clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.a2
    public final Object i(ViewGroup viewGroup, Object obj) {
        a0 a0Var = (a0) obj;
        ArrayList arrayList = e0.f2694c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!a0Var.isSeekingSupported()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        a0 mo68clone = a0Var.mo68clone();
        i0 i0Var = new i0();
        i0Var.g(mo68clone);
        e0.c(viewGroup, i0Var);
        viewGroup.setTag(R.id.transition_current_scene, null);
        d0 d0Var = new d0();
        d0Var.f2683a = i0Var;
        d0Var.f2684b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(d0Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(d0Var);
        viewGroup.invalidate();
        return i0Var.createSeekController();
    }

    @Override // androidx.fragment.app.a2
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.a2
    public final boolean m(Object obj) {
        boolean isSeekingSupported = ((a0) obj).isSeekingSupported();
        if (!isSeekingSupported) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return isSeekingSupported;
    }

    @Override // androidx.fragment.app.a2
    public final Object n(Object obj, Object obj2, Object obj3) {
        a0 a0Var = (a0) obj;
        a0 a0Var2 = (a0) obj2;
        a0 a0Var3 = (a0) obj3;
        if (a0Var != null && a0Var2 != null) {
            i0 i0Var = new i0();
            i0Var.g(a0Var);
            i0Var.g(a0Var2);
            i0Var.l(1);
            a0Var = i0Var;
        } else if (a0Var == null) {
            a0Var = a0Var2 != null ? a0Var2 : null;
        }
        if (a0Var3 == null) {
            return a0Var;
        }
        i0 i0Var2 = new i0();
        if (a0Var != null) {
            i0Var2.g(a0Var);
        }
        i0Var2.g(a0Var3);
        return i0Var2;
    }

    @Override // androidx.fragment.app.a2
    public final Object o(Object obj, Object obj2) {
        i0 i0Var = new i0();
        if (obj != null) {
            i0Var.g((a0) obj);
        }
        i0Var.g((a0) obj2);
        return i0Var;
    }

    @Override // androidx.fragment.app.a2
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((a0) obj).addListener(new k(view, arrayList));
    }

    @Override // androidx.fragment.app.a2
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((a0) obj).addListener(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.a2
    public final void r(Object obj, float f6) {
        x xVar = (x) ((g0) obj);
        if (xVar.f2760b) {
            a0 a0Var = xVar.f2765g;
            long totalDurationMillis = (long) (f6 * a0Var.getTotalDurationMillis());
            if (totalDurationMillis == 0) {
                totalDurationMillis = 1;
            }
            if (totalDurationMillis == a0Var.getTotalDurationMillis()) {
                totalDurationMillis = a0Var.getTotalDurationMillis() - 1;
            }
            if (xVar.f2762d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j = xVar.f2759a;
            if (totalDurationMillis == j || !xVar.f2760b) {
                return;
            }
            if (!xVar.f2761c) {
                if (totalDurationMillis != 0 || j <= 0) {
                    long totalDurationMillis2 = a0Var.getTotalDurationMillis();
                    if (totalDurationMillis == totalDurationMillis2 && xVar.f2759a < totalDurationMillis2) {
                        totalDurationMillis = totalDurationMillis2 + 1;
                    }
                } else {
                    totalDurationMillis = -1;
                }
                long j6 = xVar.f2759a;
                if (totalDurationMillis != j6) {
                    a0Var.setCurrentPlayTimeMillis(totalDurationMillis, j6);
                    xVar.f2759a = totalDurationMillis;
                }
            }
            n0 n0Var = xVar.f2763e;
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int i5 = (n0Var.f2733b + 1) % 20;
            n0Var.f2733b = i5;
            ((long[]) n0Var.f2734c)[i5] = currentAnimationTimeMillis;
            ((float[]) n0Var.f2735d)[i5] = totalDurationMillis;
        }
    }

    @Override // androidx.fragment.app.a2
    public final void s(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            a2.j(rect, view);
            ((a0) obj).setEpicenterCallback(new j(0, rect));
        }
    }

    @Override // androidx.fragment.app.a2
    public final void t(Object obj, Rect rect) {
        ((a0) obj).setEpicenterCallback(new j(1, rect));
    }

    @Override // androidx.fragment.app.a2
    public final void u(Fragment fragment, Object obj, l0.d dVar, Runnable runnable) {
        v(obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.a2
    public final void v(Object obj, l0.d dVar, androidx.fragment.app.z zVar, Runnable runnable) {
        a0 a0Var = (a0) obj;
        i iVar = new i(zVar, a0Var, runnable);
        synchronized (dVar) {
            while (dVar.f19302c) {
                try {
                    try {
                        dVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (dVar.f19301b != iVar) {
                dVar.f19301b = iVar;
                if (dVar.f19300a) {
                    Runnable runnable2 = (Runnable) iVar.f2706b;
                    a0 a0Var2 = (a0) iVar.f2708d;
                    Runnable runnable3 = (Runnable) iVar.f2707c;
                    if (runnable2 == null) {
                        a0Var2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        a0Var.addListener(new m(runnable));
    }

    @Override // androidx.fragment.app.a2
    public final void w(Object obj, View view, ArrayList arrayList) {
        i0 i0Var = (i0) obj;
        List<View> targets = i0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            a2.f((View) arrayList.get(i5), targets);
        }
        targets.add(view);
        arrayList.add(view);
        b(i0Var, arrayList);
    }

    @Override // androidx.fragment.app.a2
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        i0 i0Var = (i0) obj;
        if (i0Var != null) {
            i0Var.getTargets().clear();
            i0Var.getTargets().addAll(arrayList2);
            A(i0Var, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.a2
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        i0 i0Var = new i0();
        i0Var.g((a0) obj);
        return i0Var;
    }
}
