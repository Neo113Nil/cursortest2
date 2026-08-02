package Y0;

import X0.a;
import androidx.lifecycle.InterfaceC2184i;
import androidx.lifecycle.Q;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f13899a = new g();

    public final X0.a a(W owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC2184i ? ((InterfaceC2184i) owner).getDefaultViewModelCreationExtras() : a.b.f13375c;
    }

    public final U.c b(W owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC2184i ? ((InterfaceC2184i) owner).getDefaultViewModelProviderFactory() : c.f13893a;
    }

    public final String c(KClass modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String a10 = h.a(modelClass);
        if (a10 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a10;
    }

    public final Q d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
