package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.U;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class N extends U.e implements U.c {

    /* renamed from: a, reason: collision with root package name */
    public Application f20286a;

    /* renamed from: b, reason: collision with root package name */
    public final U.c f20287b;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f20288d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC2185j f20289e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.savedstate.a f20290f;

    public N(Application application, B2.g owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f20290f = owner.getSavedStateRegistry();
        this.f20289e = owner.getLifecycle();
        this.f20288d = bundle;
        this.f20286a = application;
        this.f20287b = application != null ? U.a.f20358f.a(application) : new U.a();
    }

    @Override // androidx.lifecycle.U.e
    public void a(Q viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (this.f20289e != null) {
            androidx.savedstate.a aVar = this.f20290f;
            Intrinsics.checkNotNull(aVar);
            AbstractC2185j abstractC2185j = this.f20289e;
            Intrinsics.checkNotNull(abstractC2185j);
            LegacySavedStateHandleController.a(viewModel, aVar, abstractC2185j);
        }
    }

    public final Q b(String key, Class modelClass) {
        List list;
        Constructor c10;
        Q d10;
        Application application;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC2185j abstractC2185j = this.f20289e;
        if (abstractC2185j == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || this.f20286a == null) {
            list = O.f20292b;
            c10 = O.c(modelClass, list);
        } else {
            list2 = O.f20291a;
            c10 = O.c(modelClass, list2);
        }
        if (c10 == null) {
            return this.f20286a != null ? this.f20287b.create(modelClass) : U.d.f20364a.a().create(modelClass);
        }
        androidx.savedstate.a aVar = this.f20290f;
        Intrinsics.checkNotNull(aVar);
        SavedStateHandleController b10 = LegacySavedStateHandleController.b(aVar, abstractC2185j, key, this.f20288d);
        if (!isAssignableFrom || (application = this.f20286a) == null) {
            d10 = O.d(modelClass, c10, b10.getHandle());
        } else {
            Intrinsics.checkNotNull(application);
            d10 = O.d(modelClass, c10, application, b10.getHandle());
        }
        d10.addCloseable("androidx.lifecycle.savedstate.vm.tag", b10);
        return d10;
    }

    @Override // androidx.lifecycle.U.c
    public Q create(KClass modelClass, X0.a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return create(JvmClassMappingKt.getJavaClass(modelClass), extras);
    }

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass, X0.a extras) {
        List list;
        Constructor c10;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(U.f20356c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(K.f20262a) == null || extras.a(K.f20263b) == null) {
            if (this.f20289e != null) {
                return b(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(U.a.f20360h);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = O.f20292b;
            c10 = O.c(modelClass, list);
        } else {
            list2 = O.f20291a;
            c10 = O.c(modelClass, list2);
        }
        return c10 == null ? this.f20287b.create(modelClass, extras) : (!isAssignableFrom || application == null) ? O.d(modelClass, c10, K.b(extras)) : O.d(modelClass, c10, application, K.b(extras));
    }

    @Override // androidx.lifecycle.U.c
    public Q create(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
