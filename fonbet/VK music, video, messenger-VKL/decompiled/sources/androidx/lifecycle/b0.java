package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.e0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import xsna.c2h0;
import xsna.fg50;
import xsna.jgz;
import xsna.nyt0;
import xsna.rfc;
import xsna.v1h0;
import xsna.z1h0;
import xsna.zd2;

/* compiled from: SavedStateViewModelFactory.android.kt */
/* loaded from: classes12.dex */
public final class b0 extends e0.e implements e0.c {
    public final Application a;
    public final e0.a b;
    public final Bundle c;
    public final Lifecycle d;
    public final v1h0 e;

    @SuppressLint({"LambdaLast"})
    public b0(Application application, z1h0 z1h0Var, Bundle bundle) {
        e0.a aVar;
        this.e = z1h0Var.getSavedStateRegistry();
        this.d = z1h0Var.getLifecycle();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (e0.a.c == null) {
                e0.a.c = new e0.a(application);
            }
            aVar = e0.a.c;
        } else {
            aVar = new e0.a(null);
        }
        this.b = aVar;
    }

    @Override // androidx.lifecycle.e0.c
    public final <T extends nyt0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 b(rfc rfcVar, fg50 fg50Var) {
        return c(rfcVar.a(), fg50Var);
    }

    @Override // androidx.lifecycle.e0.c
    public final nyt0 c(Class cls, fg50 fg50Var) {
        LinkedHashMap linkedHashMap = fg50Var.a;
        String str = (String) linkedHashMap.get(e0.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(a0.a) == null || linkedHashMap.get(a0.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(e0.a.d);
        boolean isAssignableFrom = zd2.class.isAssignableFrom(cls);
        Constructor a = (!isAssignableFrom || application == null) ? c2h0.a(c2h0.b, cls) : c2h0.a(c2h0.a, cls);
        return a == null ? this.b.c(cls, fg50Var) : (!isAssignableFrom || application == null) ? c2h0.b(cls, a, a0.a(fg50Var)) : c2h0.b(cls, a, application, a0.a(fg50Var));
    }

    @Override // androidx.lifecycle.e0.e
    public final void d(nyt0 nyt0Var) {
        Lifecycle lifecycle = this.d;
        if (lifecycle != null) {
            g.a(nyt0Var, this.e, lifecycle);
        }
    }

    public final nyt0 e(Class cls, String str) {
        Lifecycle lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = zd2.class.isAssignableFrom(cls);
        Application application = this.a;
        Constructor a = (!isAssignableFrom || application == null) ? c2h0.a(c2h0.b, cls) : c2h0.a(c2h0.a, cls);
        if (a != null) {
            y b = g.b(this.e, lifecycle, str, this.c);
            w wVar = b.c;
            nyt0 b2 = (!isAssignableFrom || application == null) ? c2h0.b(cls, a, wVar) : c2h0.b(cls, a, application, wVar);
            b2.e("androidx.lifecycle.savedstate.vm.tag", b);
            return b2;
        }
        if (application != null) {
            return this.b.a(cls);
        }
        if (e0.d.a == null) {
            e0.d.a = new e0.d();
        }
        e0.d.a.getClass();
        return jgz.o(cls);
    }
}
