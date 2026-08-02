package androidx.lifecycle;

import X0.a;
import android.os.Bundle;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.U;
import androidx.savedstate.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c f20262a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.c f20263b;

    /* renamed from: c, reason: collision with root package name */
    public static final a.c f20264c;

    public static final class a implements U.c {
        @Override // androidx.lifecycle.U.c
        public Q create(KClass modelClass, X0.a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return new SavedStateHandlesVM();
        }
    }

    public static final class b implements a.c {
    }

    public static final class c implements a.c {
    }

    public static final class d implements a.c {
    }

    static {
        a.C0276a c0276a = X0.a.f13373b;
        f20262a = new b();
        f20263b = new c();
        f20264c = new d();
    }

    public static final J a(B2.g gVar, W w10, String str, Bundle bundle) {
        M d10 = d(gVar);
        SavedStateHandlesVM e10 = e(w10);
        J j10 = (J) e10.getHandles().get(str);
        if (j10 != null) {
            return j10;
        }
        J a10 = J.f20259c.a(d10.c(str), bundle);
        e10.getHandles().put(str, a10);
        return a10;
    }

    public static final J b(X0.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        B2.g gVar = (B2.g) aVar.a(f20262a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        W w10 = (W) aVar.a(f20263b);
        if (w10 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f20264c);
        String str = (String) aVar.a(U.f20356c);
        if (str != null) {
            return a(gVar, w10, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final void c(B2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        AbstractC2185j.b b10 = gVar.getLifecycle().b();
        if (b10 != AbstractC2185j.b.f20391b && b10 != AbstractC2185j.b.f20392c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            M m10 = new M(gVar.getSavedStateRegistry(), (W) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", m10);
            gVar.getLifecycle().a(new SavedStateHandleAttacher(m10));
        }
    }

    public static final M d(B2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        a.b b10 = gVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        M m10 = b10 instanceof M ? (M) b10 : null;
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM e(W w10) {
        Intrinsics.checkNotNullParameter(w10, "<this>");
        return (SavedStateHandlesVM) U.b.c(U.f20355b, w10, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.getOrCreateKotlinClass(SavedStateHandlesVM.class));
    }
}
