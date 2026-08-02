package qe;

import java.util.List;
import je.C7379f0;
import je.H0;
import je.K0;
import je.N;
import je.Q;
import je.Y;
import je.o0;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import oe.C8701c;
import org.jetbrains.annotations.NotNull;
import qd.r;
import qd.s;
import qe.InterfaceC9035f;
import td.C9856v;
import td.InterfaceC9815F;
import td.InterfaceC9839e;
import td.i0;
import td.p0;

/* renamed from: qe.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9042m implements InterfaceC9035f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9042m f81963a = new C9042m();

    @Override // qe.InterfaceC9035f
    public final boolean a(@NotNull Ed.e functionDescriptor) {
        Y e11;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        p0 p0Var = functionDescriptor.f().get(1);
        r.b bVar = qd.r.f81849d;
        Intrinsics.f(p0Var);
        InterfaceC9815F module = Zd.e.j(p0Var);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(module, "module");
        InterfaceC9839e a11 = C9856v.a(module, s.a.f81888R);
        if (a11 == null) {
            e11 = null;
        } else {
            o0.f69907b.getClass();
            o0 o0Var = o0.f69908c;
            List<i0> parameters = a11.k().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            Object B02 = C7714v.B0(parameters);
            Intrinsics.checkNotNullExpressionValue(B02, "single(...)");
            e11 = Q.e(o0Var, a11, C7714v.a0(new C7379f0((i0) B02)));
        }
        if (e11 == null) {
            return false;
        }
        N type = p0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        Intrinsics.checkNotNullParameter(type, "<this>");
        K0 i11 = H0.i(type);
        Intrinsics.checkNotNullExpressionValue(i11, "makeNotNullable(...)");
        return C8701c.n(e11, i11);
    }

    @Override // qe.InterfaceC9035f
    public final String b(@NotNull Ed.e eVar) {
        return InterfaceC9035f.a.a(this, eVar);
    }

    @Override // qe.InterfaceC9035f
    @NotNull
    public final String getDescription() {
        return "second parameter must be of type KProperty<*> or its supertype";
    }
}
