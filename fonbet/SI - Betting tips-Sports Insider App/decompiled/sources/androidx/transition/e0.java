package androidx.transition;

import android.view.ViewGroup;
import com.sports.insider.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2692a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2693b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2694c = new ArrayList();

    public static void a(ViewGroup viewGroup, a0 a0Var) {
        ArrayList arrayList = f2694c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (a0Var == null) {
            a0Var = f2692a;
        }
        a0 mo68clone = a0Var.mo68clone();
        c(viewGroup, mo68clone);
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (mo68clone != null) {
            d0 d0Var = new d0();
            d0Var.f2683a = mo68clone;
            d0Var.f2684b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(d0Var);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(d0Var);
        }
    }

    public static s.e b() {
        s.e eVar;
        ThreadLocal threadLocal = f2693b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (s.e) weakReference.get()) != null) {
            return eVar;
        }
        s.e eVar2 = new s.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }

    public static void c(ViewGroup viewGroup, a0 a0Var) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).pause(viewGroup);
            }
        }
        if (a0Var != null) {
            a0Var.captureValues(viewGroup, true);
        }
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
    }
}
