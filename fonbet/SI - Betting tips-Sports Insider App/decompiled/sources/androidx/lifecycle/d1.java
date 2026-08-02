package androidx.lifecycle;

import android.os.Bundle;
import eg.u1;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d1 {

    /* renamed from: b, reason: collision with root package name */
    public static final io.sentry.hints.j f2150b;

    /* renamed from: c, reason: collision with root package name */
    public static final m3.f f2151c;

    /* renamed from: a, reason: collision with root package name */
    public static final y8.d f2149a = new y8.d();

    /* renamed from: d, reason: collision with root package name */
    public static final s7.u f2152d = new s7.u(17);

    static {
        int i5 = 3;
        f2150b = new io.sentry.hints.j(i5);
        f2151c = new m3.f(i5);
    }

    public static i a(hg.g gVar) {
        kotlin.coroutines.g context = kotlin.coroutines.g.f19227a;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        p block = new p(gVar, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        i iVar = new i();
        iVar.f2186l = new p.f();
        eg.x key = eg.x.f9237b;
        context.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        u1 u1Var = new u1(null);
        lg.e eVar = eg.m0.f9201a;
        fg.e eVar2 = jg.q.f18523a.f9624e;
        eVar2.getClass();
        iVar.f2187m = new androidx.appcompat.widget.a0(iVar, block, eg.c0.b(kotlin.coroutines.e.c(eVar2, context).t(u1Var)), new a2.q(1, iVar));
        if (gVar instanceof hg.b1) {
            if (o.b.K0().L0()) {
                iVar.j(((hg.b1) gVar).getValue());
                return iVar;
            }
            iVar.h(((hg.b1) gVar).getValue());
        }
        return iVar;
    }

    public static final void b(k1 viewModel, q2.d registry, y lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        b1 b1Var = (b1) viewModel.c("androidx.lifecycle.savedstate.vm.tag");
        if (b1Var == null || b1Var.f2140c) {
            return;
        }
        b1Var.k(lifecycle, registry);
        x xVar = ((g0) lifecycle).f2169d;
        if (xVar == x.f2254b || xVar.a(x.f2256d)) {
            registry.d();
        } else {
            lifecycle.a(new l(lifecycle, registry));
        }
    }

    public static a1 c(Bundle source, Bundle bundle) {
        if (source == null) {
            source = bundle;
        }
        if (source == null) {
            a1 a1Var = new a1();
            new LinkedHashMap();
            a1Var.f2133a = new c4.d(kotlin.collections.n0.c());
            return a1Var;
        }
        ClassLoader classLoader = a1.class.getClassLoader();
        Intrinsics.checkNotNull(classLoader);
        source.setClassLoader(classLoader);
        Intrinsics.checkNotNullParameter(source, "source");
        hf.i builder = new hf.i(source.size());
        for (String str : source.keySet()) {
            Intrinsics.checkNotNull(str);
            builder.put(str, source.get(str));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        hf.i initialState = builder.c();
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        a1 a1Var2 = new a1();
        new LinkedHashMap();
        a1Var2.f2133a = new c4.d(initialState);
        return a1Var2;
    }

    public static final a1 d(t1.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        q2.f fVar = (q2.f) cVar.a(f2149a);
        if (fVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        p1 p1Var = (p1) cVar.a(f2150b);
        if (p1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) cVar.a(f2151c);
        String key = (String) cVar.a(n1.f2219b);
        if (key == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        q2.c b10 = fVar.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        e1 e1Var = b10 instanceof e1 ? (e1) b10 : null;
        if (e1Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        f1 h10 = h(p1Var);
        a1 a1Var = (a1) h10.f2164b.get(key);
        if (a1Var != null) {
            return a1Var;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        e1Var.b();
        Bundle source = e1Var.f2157c;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            if (source.containsKey(key)) {
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                Bundle source2 = source.getBundle(key);
                if (source2 == null) {
                    kotlin.collections.n0.c().getClass();
                    source2 = a.a.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
                    Intrinsics.checkNotNullParameter(source2, "source");
                }
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(key, "key");
                source.remove(key);
                Intrinsics.checkNotNullParameter(source, "source");
                if (source.isEmpty()) {
                    e1Var.f2157c = null;
                }
                bundle2 = source2;
            }
        }
        a1 c2 = c(bundle2, bundle);
        h10.f2164b.put(key, c2);
        return c2;
    }

    public static final void e(q2.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        x xVar = ((g0) fVar.getLifecycle()).f2169d;
        if (xVar != x.f2254b && xVar != x.f2255c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.getSavedStateRegistry().b() == null) {
            e1 e1Var = new e1(fVar.getSavedStateRegistry(), (p1) fVar);
            fVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", e1Var);
            fVar.getLifecycle().a(new g(e1Var));
        }
    }

    public static final hg.c f(hg.g gVar, y lifecycle) {
        x minActiveState = x.f2257e;
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return new hg.c(new o(lifecycle, gVar, (Continuation) null), kotlin.coroutines.g.f19227a, -2, gg.a.f10048a);
    }

    public static final z g(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        y lifecycle = e0Var.getLifecycle();
        Intrinsics.checkNotNullParameter(lifecycle, "<this>");
        while (true) {
            z zVar = (z) ((AtomicReference) lifecycle.f2259a.f2220a).get();
            if (zVar != null) {
                return zVar;
            }
            u1 d10 = eg.c0.d();
            lg.e eVar = eg.m0.f9201a;
            z zVar2 = new z(lifecycle, kotlin.coroutines.e.c(d10, jg.q.f18523a.f9624e));
            AtomicReference atomicReference = (AtomicReference) lifecycle.f2259a.f2220a;
            do {
                Continuation continuation = null;
                if (atomicReference.compareAndSet(null, zVar2)) {
                    lg.e eVar2 = eg.m0.f9201a;
                    eg.c0.t(zVar2, jg.q.f18523a.f9624e, null, new ab.b(zVar2, continuation, 1), 2);
                    return zVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final f1 h(p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        n1 t3 = io.sentry.hints.j.t(p1Var, new c1(0));
        ag.c modelClass = Reflection.getOrCreateKotlinClass(f1.class);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (f1) ((com.google.firebase.messaging.x) t3.f2220a).x(modelClass, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final u1.a i(k1 k1Var) {
        u1.a aVar;
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(k1Var, "<this>");
        synchronized (f2152d) {
            aVar = (u1.a) k1Var.c("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    try {
                        lg.e eVar = eg.m0.f9201a;
                        coroutineContext = jg.q.f18523a.f9624e;
                    } catch (gf.n unused) {
                        coroutineContext = kotlin.coroutines.g.f19227a;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = kotlin.coroutines.g.f19227a;
                }
                u1.a aVar2 = new u1.a(coroutineContext.t(eg.c0.d()));
                k1Var.a("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final Object j(y yVar, x xVar, Function2 function2, mf.i iVar) {
        if (xVar == x.f2254b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (((g0) yVar).f2169d == x.f2253a) {
            return Unit.f19194a;
        }
        Object i5 = eg.c0.i(new u0(yVar, xVar, function2, (Continuation) null), iVar);
        return i5 == lf.a.f20034a ? i5 : Unit.f19194a;
    }
}
