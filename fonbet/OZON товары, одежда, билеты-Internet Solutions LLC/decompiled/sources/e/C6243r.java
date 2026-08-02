package e;

import S0.C3969l;
import S0.D;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import androidx.activity.J;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import xe.M;

/* renamed from: e.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6243r {
    public static final void a(boolean z11, @NotNull Function2 function2, InterfaceC3967k interfaceC3967k, int i11) {
        C3969l u11 = interfaceC3967k.u(-642000585);
        if ((((u11.p(z11) ? 4 : 2) | i11 | (u11.n(function2) ? 32 : 16)) & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            InterfaceC3978p0 l11 = n1.l(function2, u11);
            u11.B(-723524056);
            u11.B(-3687241);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            u11.K();
            M a11 = ((D) C11).a();
            u11.K();
            u11.B(-1071578902);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = new C6242q(z11, a11, l11);
                u11.x(C12);
            }
            C6242q c6242q = (C6242q) C12;
            u11.K();
            Boolean valueOf = Boolean.valueOf(z11);
            u11.B(-1071576804);
            boolean n11 = u11.n(c6242q) | u11.p(z11);
            Object C13 = u11.C();
            if (n11 || C13 == InterfaceC3967k.a.a()) {
                C13 = new C6238m(c6242q, z11, null);
                u11.x(C13);
            }
            u11.K();
            Q.e(u11, valueOf, (Function2) C13);
            androidx.activity.M a12 = C6235j.a(u11);
            if (a12 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            J onBackPressedDispatcher = a12.getOnBackPressedDispatcher();
            androidx.lifecycle.J j11 = (androidx.lifecycle.J) u11.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            u11.B(-1071576432);
            boolean n12 = u11.n(onBackPressedDispatcher) | u11.n(j11) | u11.n(c6242q);
            Object C14 = u11.C();
            if (n12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new C6240o(onBackPressedDispatcher, j11, c6242q);
                u11.x(C14);
            }
            u11.K();
            Q.b(j11, onBackPressedDispatcher, (Function1) C14, u11);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C6241p(z11, function2, i11));
        }
    }
}
