package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;
import xsna.f5z;
import xsna.nyt0;
import xsna.v1h0;
import xsna.wyt0;
import xsna.xyt0;
import xsna.z1h0;

/* compiled from: LegacySavedStateHandleController.android.kt */
/* loaded from: classes12.dex */
public final class g {

    /* compiled from: LegacySavedStateHandleController.android.kt */
    public static final class a implements v1h0.a {
        @Override // xsna.v1h0.a
        public final void a(z1h0 z1h0Var) {
            if (!(z1h0Var instanceof xyt0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + z1h0Var).toString());
            }
            wyt0 viewModelStore = ((xyt0) z1h0Var).getViewModelStore();
            v1h0 savedStateRegistry = z1h0Var.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                nyt0 nyt0Var = (nyt0) linkedHashMap.get((String) it.next());
                if (nyt0Var != null) {
                    g.a(nyt0Var, savedStateRegistry, z1h0Var.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    /* compiled from: LegacySavedStateHandleController.android.kt */
    public static final class b implements l {
        public final /* synthetic */ Lifecycle b;
        public final /* synthetic */ v1h0 c;

        public b(Lifecycle lifecycle, v1h0 v1h0Var) {
            this.b = lifecycle;
            this.c = v1h0Var;
        }

        @Override // androidx.lifecycle.l
        public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.b.removeObserver(this);
                this.c.d();
            }
        }
    }

    public static final void a(nyt0 nyt0Var, v1h0 v1h0Var, Lifecycle lifecycle) {
        y yVar = (y) nyt0Var.g("androidx.lifecycle.savedstate.vm.tag");
        if (yVar == null || yVar.d) {
            return;
        }
        yVar.b(lifecycle, v1h0Var);
        c(lifecycle, v1h0Var);
    }

    public static final y b(v1h0 v1h0Var, Lifecycle lifecycle, String str, Bundle bundle) {
        w wVar;
        Bundle a2 = v1h0Var.a(str);
        if (a2 != null) {
            bundle = a2;
        }
        if (bundle == null) {
            wVar = new w();
        } else {
            bundle.setClassLoader(w.class.getClassLoader());
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str2 : bundle.keySet()) {
                mapBuilder.put(str2, bundle.get(str2));
            }
            wVar = new w(mapBuilder.h());
        }
        y yVar = new y(str, wVar);
        yVar.b(lifecycle, v1h0Var);
        c(lifecycle, v1h0Var);
        return yVar;
    }

    public static void c(Lifecycle lifecycle, v1h0 v1h0Var) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.a(Lifecycle.State.STARTED)) {
            v1h0Var.d();
        } else {
            lifecycle.addObserver(new b(lifecycle, v1h0Var));
        }
    }
}
