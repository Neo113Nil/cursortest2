package o1;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j1;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21091a = c.f21088c;

    public static c a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                j1 parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f21091a;
    }

    public static void b(c cVar, m mVar) {
        Fragment fragment = mVar.f21092a;
        String name = fragment.getClass().getName();
        Set set = cVar.f21089a;
        if (set.contains(b.f21079a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), mVar);
        }
        if (set.contains(b.f21080b)) {
            io.sentry.android.replay.util.c cVar2 = new io.sentry.android.replay.util.c(14, name, mVar);
            if (!fragment.isAdded()) {
                cVar2.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().f1983w.f2088c;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                cVar2.run();
                throw null;
            }
            handler.post(cVar2);
        }
    }

    public static void c(m mVar) {
        if (j1.L(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(mVar.f21092a.getClass().getName()), mVar);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        a aVar = new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        c(aVar);
        c a7 = a(fragment);
        if (a7.f21089a.contains(b.f21081c) && e(a7, fragment.getClass(), a.class)) {
            b(a7, aVar);
        }
    }

    public static boolean e(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.f21090b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), m.class) || !CollectionsKt.A(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
