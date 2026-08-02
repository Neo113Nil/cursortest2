package qe;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qe.InterfaceC9035f;
import td.p0;

/* renamed from: qe.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9045p implements InterfaceC9035f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9045p f81968a = new C9045p();

    @Override // qe.InterfaceC9035f
    public final boolean a(@NotNull Ed.e functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        List<p0> f7 = functionDescriptor.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        List<p0> list = f7;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (p0 p0Var : list) {
            Intrinsics.f(p0Var);
            if (Zd.e.a(p0Var) || p0Var.x0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // qe.InterfaceC9035f
    public final String b(@NotNull Ed.e eVar) {
        return InterfaceC9035f.a.a(this, eVar);
    }

    @Override // qe.InterfaceC9035f
    @NotNull
    public final String getDescription() {
        return "should not have varargs or parameters with default values";
    }
}
