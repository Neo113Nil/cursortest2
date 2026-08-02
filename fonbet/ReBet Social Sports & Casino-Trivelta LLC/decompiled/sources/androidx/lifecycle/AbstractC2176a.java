package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2176a extends U.e implements U.c {

    /* renamed from: a, reason: collision with root package name */
    public androidx.savedstate.a f20372a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC2185j f20373b;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f20374d;

    public AbstractC2176a(B2.g owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f20372a = owner.getSavedStateRegistry();
        this.f20373b = owner.getLifecycle();
        this.f20374d = bundle;
    }

    private final Q b(String str, Class cls) {
        androidx.savedstate.a aVar = this.f20372a;
        Intrinsics.checkNotNull(aVar);
        AbstractC2185j abstractC2185j = this.f20373b;
        Intrinsics.checkNotNull(abstractC2185j);
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, abstractC2185j, str, this.f20374d);
        Q c10 = c(str, cls, b10.getHandle());
        c10.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
        return c10;
    }

    @Override // androidx.lifecycle.U.e
    public void a(Q viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        androidx.savedstate.a aVar = this.f20372a;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            AbstractC2185j abstractC2185j = this.f20373b;
            Intrinsics.checkNotNull(abstractC2185j);
            LegacySavedStateHandleController.a(viewModel, aVar, abstractC2185j);
        }
    }

    public abstract Q c(String str, Class cls, J j10);

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass, X0.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(U.d.f20366d);
        if (str != null) {
            return this.f20372a != null ? b(str, modelClass) : c(str, modelClass, K.b(extras));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f20373b != null) {
                return b(canonicalName, modelClass);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
