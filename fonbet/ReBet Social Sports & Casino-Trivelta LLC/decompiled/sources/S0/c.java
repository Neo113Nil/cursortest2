package S0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f10511a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static C0202c f10512b = C0202c.f10523d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    /* renamed from: S0.c$c, reason: collision with other inner class name */
    public static final class C0202c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f10522c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final C0202c f10523d = new C0202c(SetsKt.emptySet(), null, MapsKt.emptyMap());

        /* renamed from: a, reason: collision with root package name */
        public final Set f10524a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f10525b;

        /* renamed from: S0.c$c$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        public C0202c(Set flags, b bVar, Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f10524a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f10525b = linkedHashMap;
        }

        public final Set a() {
            return this.f10524a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f10525b;
        }
    }

    public static final void d(String str, m violation) {
        Intrinsics.checkNotNullParameter(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    public static final void f(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        S0.a aVar = new S0.a(fragment, previousFragmentId);
        c cVar = f10511a;
        cVar.e(aVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(b10, fragment.getClass(), aVar.getClass())) {
            cVar.c(b10, aVar);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        d dVar = new d(fragment, viewGroup);
        c cVar = f10511a;
        cVar.e(dVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(b10, fragment.getClass(), dVar.getClass())) {
            cVar.c(b10, dVar);
        }
    }

    public static final void h(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        e eVar = new e(fragment);
        c cVar = f10511a;
        cVar.e(eVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, fragment.getClass(), eVar.getClass())) {
            cVar.c(b10, eVar);
        }
    }

    public static final void i(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        f fVar = new f(fragment);
        c cVar = f10511a;
        cVar.e(fVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, fragment.getClass(), fVar.getClass())) {
            cVar.c(b10, fVar);
        }
    }

    public static final void j(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        g gVar = new g(fragment);
        c cVar = f10511a;
        cVar.e(gVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, fragment.getClass(), gVar.getClass())) {
            cVar.c(b10, gVar);
        }
    }

    public static final void k(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        i iVar = new i(fragment);
        c cVar = f10511a;
        cVar.e(iVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b10, fragment.getClass(), iVar.getClass())) {
            cVar.c(b10, iVar);
        }
    }

    public static final void l(Fragment violatingFragment, Fragment targetFragment, int i10) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        j jVar = new j(violatingFragment, targetFragment, i10);
        c cVar = f10511a;
        cVar.e(jVar);
        C0202c b10 = cVar.b(violatingFragment);
        if (b10.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b10, violatingFragment.getClass(), jVar.getClass())) {
            cVar.c(b10, jVar);
        }
    }

    public static final void m(Fragment fragment, boolean z10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        k kVar = new k(fragment, z10);
        c cVar = f10511a;
        cVar.e(kVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(b10, fragment.getClass(), kVar.getClass())) {
            cVar.c(b10, kVar);
        }
    }

    public static final void n(Fragment fragment, ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        n nVar = new n(fragment, container);
        c cVar = f10511a;
        cVar.e(nVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(b10, fragment.getClass(), nVar.getClass())) {
            cVar.c(b10, nVar);
        }
    }

    public static final void o(Fragment fragment, Fragment expectedParentFragment, int i10) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        o oVar = new o(fragment, expectedParentFragment, i10);
        c cVar = f10511a;
        cVar.e(oVar);
        C0202c b10 = cVar.b(fragment);
        if (b10.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(b10, fragment.getClass(), oVar.getClass())) {
            cVar.c(b10, oVar);
        }
    }

    public final C0202c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.J0() != null) {
                    C0202c J02 = parentFragmentManager.J0();
                    Intrinsics.checkNotNull(J02);
                    return J02;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return f10512b;
    }

    public final void c(C0202c c0202c, final m mVar) {
        Fragment a10 = mVar.a();
        final String name = a10.getClass().getName();
        c0202c.a().contains(a.PENALTY_LOG);
        c0202c.b();
        if (c0202c.a().contains(a.PENALTY_DEATH)) {
            p(a10, new Runnable() { // from class: S0.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.d(name, mVar);
                }
            });
        }
    }

    public final void e(m mVar) {
        if (FragmentManager.Q0(3)) {
            mVar.a().getClass();
        }
    }

    public final void p(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler h10 = fragment.getParentFragmentManager().D0().h();
        if (Intrinsics.areEqual(h10.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            h10.post(runnable);
        }
    }

    public final boolean q(C0202c c0202c, Class cls, Class cls2) {
        Set set = (Set) c0202c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), m.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
