package androidx.lifecycle;

import androidx.lifecycle.e0;
import xsna.fg50;
import xsna.nyt0;
import xsna.ozl;
import xsna.v1h0;
import xsna.z1h0;

/* compiled from: AbstractSavedStateViewModelFactory.android.kt */
@ozl
/* loaded from: classes12.dex */
public abstract class a extends e0.e implements e0.c {
    public final v1h0 a;
    public final Lifecycle b;

    public a(z1h0 z1h0Var) {
        this.a = z1h0Var.getSavedStateRegistry();
        this.b = z1h0Var.getLifecycle();
    }

    @Override // androidx.lifecycle.e0.c
    public final <T extends nyt0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        Lifecycle lifecycle = this.b;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        y b = g.b(this.a, lifecycle, canonicalName, null);
        T t = (T) e(cls, b.c);
        t.e("androidx.lifecycle.savedstate.vm.tag", b);
        return t;
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        String str = (String) fg50Var.a.get(e0.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        v1h0 v1h0Var = this.a;
        if (v1h0Var == null) {
            return e(cls, a0.a(fg50Var));
        }
        y b = g.b(v1h0Var, this.b, str, null);
        nyt0 e = e(cls, b.c);
        e.e("androidx.lifecycle.savedstate.vm.tag", b);
        return e;
    }

    @Override // androidx.lifecycle.e0.e
    public final void d(nyt0 nyt0Var) {
        v1h0 v1h0Var = this.a;
        if (v1h0Var != null) {
            g.a(nyt0Var, v1h0Var, this.b);
        }
    }

    public abstract nyt0 e(Class cls, w wVar);
}
