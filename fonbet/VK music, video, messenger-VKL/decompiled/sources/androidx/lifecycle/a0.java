package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.e0;
import androidx.lifecycle.w;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import xsna.fg50;
import xsna.fpf0;
import xsna.qbk;
import xsna.r1h0;
import xsna.s1h0;
import xsna.v1h0;
import xsna.xyt0;
import xsna.yfb;
import xsna.z1h0;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: classes.dex */
public final class a0 {
    public static final a a = new a();
    public static final b b = new b();
    public static final c c = new c();

    /* compiled from: CreationExtras.kt */
    public static final class a implements qbk.b<z1h0> {
    }

    /* compiled from: CreationExtras.kt */
    public static final class b implements qbk.b<xyt0> {
    }

    /* compiled from: CreationExtras.kt */
    public static final class c implements qbk.b<Bundle> {
    }

    public static final w a(fg50 fg50Var) {
        LinkedHashMap linkedHashMap = fg50Var.a;
        z1h0 z1h0Var = (z1h0) linkedHashMap.get(a);
        if (z1h0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        xyt0 xyt0Var = (xyt0) linkedHashMap.get(b);
        if (xyt0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(e0.b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        v1h0.b b2 = z1h0Var.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        r1h0 r1h0Var = b2 instanceof r1h0 ? (r1h0) b2 : null;
        if (r1h0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        s1h0 s1h0Var = (s1h0) e0.b.a(xyt0Var, new z(), 4).a.a("androidx.lifecycle.internal.SavedStateHandlesVM", fpf0.a(s1h0.class));
        w wVar = (w) s1h0Var.b.get(str);
        if (wVar != null) {
            return wVar;
        }
        r1h0Var.a();
        Bundle bundle3 = r1h0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = yfb.b((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                r1h0Var.c = null;
            }
            bundle2 = bundle4;
        }
        w a2 = w.a.a(bundle2, bundle);
        s1h0Var.b.put(str, a2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends z1h0 & xyt0> void b(T t) {
        Lifecycle.State currentState = t.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            r1h0 r1h0Var = new r1h0(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", r1h0Var);
            t.getLifecycle().addObserver(new x(r1h0Var));
        }
    }
}
