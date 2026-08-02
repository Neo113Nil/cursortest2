package f3;

import androidx.lifecycle.A0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import ed.C6345a;
import h3.C6792e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: f3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6414f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A0 f62501a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z0.b f62502b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AbstractC6409a f62503c;

    public C6414f(@NotNull A0 store, @NotNull z0.b factory, @NotNull AbstractC6409a extras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.f62501a = store;
        this.f62502b = factory;
        this.f62503c = extras;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final w0 a(@NotNull String key, @NotNull kotlin.reflect.d modelClass) {
        w0 create;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        A0 a02 = this.f62501a;
        w0 b11 = a02.b(key);
        boolean A11 = modelClass.A(b11);
        z0.b factory = this.f62502b;
        if (A11) {
            if (factory instanceof z0.d) {
                Intrinsics.f(b11);
                ((z0.d) factory).a(b11);
            }
            Intrinsics.g(b11, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b11;
        }
        C6412d extras = new C6412d(this.f62503c);
        extras.c(C6792e.f64740a, key);
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        try {
            try {
                create = factory.create((kotlin.reflect.d<w0>) modelClass, extras);
            } catch (AbstractMethodError unused) {
                create = factory.create((Class<w0>) C6345a.b(modelClass), extras);
            }
        } catch (AbstractMethodError unused2) {
            create = factory.create(C6345a.b(modelClass));
        }
        a02.d(key, create);
        return create;
    }
}
