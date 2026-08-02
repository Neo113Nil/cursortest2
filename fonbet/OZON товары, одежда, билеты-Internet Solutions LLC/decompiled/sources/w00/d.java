package w00;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends z0.c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Pc.a<? extends w0> f103327a;

    d(Pc.a<? extends w0> aVar) {
        this.f103327a = aVar;
    }

    @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
    public final <T extends w0> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        w0 w0Var = this.f103327a.get();
        Intrinsics.g(w0Var, "null cannot be cast to non-null type T of ru.ozon.composer.debug.menu.utils.UtilsKt.getViewModelFactory.<no name provided>.create");
        return (T) w0Var;
    }
}
