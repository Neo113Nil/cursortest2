package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LegacySavedStateHandleController {

    /* renamed from: a, reason: collision with root package name */
    public static final LegacySavedStateHandleController f20266a = new LegacySavedStateHandleController();

    public static final class a implements a.InterfaceC0409a {
        @Override // androidx.savedstate.a.InterfaceC0409a
        public void a(B2.g owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof W)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            V viewModelStore = ((W) owner).getViewModelStore();
            androidx.savedstate.a savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                Q b10 = viewModelStore.b((String) it.next());
                if (b10 != null) {
                    LegacySavedStateHandleController.a(b10, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    public static final void a(Q viewModel, androidx.savedstate.a registry, AbstractC2185j lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.getIsAttached()) {
            return;
        }
        savedStateHandleController.d(registry, lifecycle);
        f20266a.c(registry, lifecycle);
    }

    public static final SavedStateHandleController b(androidx.savedstate.a registry, AbstractC2185j lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, J.f20259c.a(registry.a(str), bundle));
        savedStateHandleController.d(registry, lifecycle);
        f20266a.c(registry, lifecycle);
        return savedStateHandleController;
    }

    public final void c(final androidx.savedstate.a aVar, final AbstractC2185j abstractC2185j) {
        AbstractC2185j.b b10 = abstractC2185j.b();
        if (b10 == AbstractC2185j.b.f20391b || b10.b(AbstractC2185j.b.f20393d)) {
            aVar.d(a.class);
        } else {
            abstractC2185j.a(new InterfaceC2191p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.InterfaceC2191p
                public void k(InterfaceC2193s source, AbstractC2185j.a event) {
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (event == AbstractC2185j.a.ON_START) {
                        AbstractC2185j.this.d(this);
                        aVar.d(LegacySavedStateHandleController.a.class);
                    }
                }
            });
        }
    }
}
