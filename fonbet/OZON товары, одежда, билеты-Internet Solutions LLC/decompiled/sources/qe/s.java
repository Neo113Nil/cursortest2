package qe;

import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9857w;
import td.p0;

/* loaded from: classes10.dex */
final class s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s f81973a = new s();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC9857w Checks = (InterfaceC9857w) obj;
        v vVar = v.f81976a;
        Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
        List<p0> f7 = Checks.f();
        Intrinsics.checkNotNullExpressionValue(f7, "getValueParameters(...)");
        p0 p0Var = (p0) C7714v.Z(f7);
        if (p0Var == null || Zd.e.a(p0Var) || p0Var.x0() != null) {
            return "last parameter should not have a default value or be a vararg";
        }
        return null;
    }
}
