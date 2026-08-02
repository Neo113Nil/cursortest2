package defpackage;

import android.view.ViewGroup;
import com.sofascore.results.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class hxj {
    public static final gs0 a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        gs0 gs0Var = new gs0();
        gs0Var.F = false;
        gs0Var.P(new ym6(2));
        gs0Var.P(new gn2());
        gs0Var.P(new ym6(1));
        a = gs0Var;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(ViewGroup viewGroup, xwj xwjVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (xwjVar == null) {
            xwjVar = a;
        }
        xwj clone = xwjVar.clone();
        c(viewGroup, clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        gxj gxjVar = new gxj();
        gxjVar.a = clone;
        gxjVar.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(gxjVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(gxjVar);
    }

    public static dh0 b() {
        dh0 dh0Var;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (dh0Var = (dh0) weakReference.get()) != null) {
            return dh0Var;
        }
        dh0 dh0Var2 = new dh0(0);
        threadLocal.set(new WeakReference(dh0Var2));
        return dh0Var2;
    }

    public static void c(ViewGroup viewGroup, xwj xwjVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((xwj) it.next()).y(viewGroup);
            }
        }
        if (xwjVar != null) {
            xwjVar.h(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) == null) {
            return;
        }
        pvd.j();
    }
}
