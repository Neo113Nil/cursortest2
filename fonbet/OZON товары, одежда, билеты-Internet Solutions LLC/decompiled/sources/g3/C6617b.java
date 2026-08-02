package g3;

import S0.InterfaceC3967k;
import androidx.lifecycle.A0;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import h3.C6789b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6617b {
    @NotNull
    public static final w0 a(@NotNull d modelClass, B0 owner, String str, z0.b factory, AbstractC6409a extras, InterfaceC3967k interfaceC3967k) {
        z0 z0Var;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        interfaceC3967k.B(1673618944);
        Intrinsics.checkNotNullParameter(owner, "<this>");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (factory != null) {
            A0 store = owner.getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            z0Var = new z0(store, factory, extras);
        } else {
            boolean z11 = owner instanceof InterfaceC5431s;
            if (z11) {
                A0 store2 = owner.getViewModelStore();
                z0.b factory2 = ((InterfaceC5431s) owner).getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(store2, "store");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(extras, "extras");
                z0Var = new z0(store2, factory2, extras);
            } else {
                Intrinsics.checkNotNullParameter(owner, "owner");
                z0.b factory3 = z11 ? ((InterfaceC5431s) owner).getDefaultViewModelProviderFactory() : C6789b.f64735a;
                Intrinsics.checkNotNullParameter(owner, "owner");
                AbstractC6409a extras2 = z11 ? ((InterfaceC5431s) owner).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(extras2, "extras");
                z0Var = new z0(owner.getViewModelStore(), factory3, extras2);
            }
        }
        w0 c11 = str != null ? z0Var.c(str, modelClass) : z0Var.d(modelClass);
        interfaceC3967k.K();
        return c11;
    }
}
