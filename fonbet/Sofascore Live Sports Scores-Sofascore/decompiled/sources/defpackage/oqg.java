package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class oqg {
    public final pqg a;
    public final nqg b;

    public oqg(pqg pqgVar) {
        this.a = pqgVar;
        this.b = new nqg(pqgVar);
    }

    public final void a(Bundle bundle) {
        pqg pqgVar = this.a;
        qqg qqgVar = (qqg) pqgVar.d;
        if (!pqgVar.a) {
            pqgVar.c();
        }
        if (qqgVar.getLifecycle().b().compareTo(e6b.d) >= 0) {
            i3c.i(qqgVar.getLifecycle().b(), "performRestore cannot be called when owner is ");
            return;
        }
        if (pqgVar.b) {
            a70.r("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = o3a.B(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        pqgVar.h = bundle2;
        pqgVar.b = true;
    }

    public final void b(Bundle bundle) {
        bundle.getClass();
        pqg pqgVar = this.a;
        lm5.a.getClass();
        Bundle E = hz8.E((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = (Bundle) pqgVar.h;
        if (bundle2 != null) {
            E.putAll(bundle2);
        }
        synchronized (((haf) pqgVar.f)) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) pqgVar.g).entrySet()) {
                    r4a.G(E, (String) entry.getKey(), ((mqg) entry.getValue()).a());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (E.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", E);
    }
}
