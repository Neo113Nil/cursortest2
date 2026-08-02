package ru.ozon.android.messenger.framework.presentation.search.composable;

import S0.C3969l;
import S0.D1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class E {
    public static final void a(androidx.compose.ui.e eVar, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull ru.ozon.android.messenger.framework.presentation.models.e blockItem, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(blockItem, "blockItem");
        C3969l u11 = interfaceC3967k.u(826656946);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(references) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(blockItem) : u11.F(blockItem) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12 | 3072;
        if ((i13 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            ru.ozon.android.messenger.framework.data.b a11 = references.a();
            int d11 = blockItem.d();
            u11.o(1110689560);
            int i14 = i13 & 896;
            boolean z11 = i14 == 256 || ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(blockItem));
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new D(blockItem);
                u11.x(C11);
            }
            u11.k();
            ru.ozon.android.messenger.framework.core.viewmapper.a<?, ru.ozon.android.messenger.framework.presentation.models.g, X4.a> e11 = ru.ozon.android.messenger.framework.data.d.e(a11, d11, (Function0) C11);
            u11.o(1110692451);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = n1.f(null, D1.f25195a);
                u11.x(C12);
            }
            InterfaceC3978p0 interfaceC3978p0 = (InterfaceC3978p0) C12;
            u11.k();
            Unit unit = Unit.f71690a;
            u11.o(1110695621);
            Object C13 = u11.C();
            if (C13 == InterfaceC3967k.a.a()) {
                C13 = new x(interfaceC3978p0);
                u11.x(C13);
            }
            u11.k();
            Q.c(unit, (Function1) C13, u11);
            u11.o(1110700014);
            boolean z12 = i14 == 256 || ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(blockItem));
            Object C14 = u11.C();
            if (z12 || C14 == InterfaceC3967k.a.a()) {
                C14 = new y(blockItem, interfaceC3978p0);
                u11.x(C14);
            }
            u11.k();
            androidx.compose.ui.e a12 = ru.ozon.android.messenger.utils.compose.c.a(eVar, (Function0) C14);
            u11.o(1110703320);
            boolean n11 = ((i13 & 7168) == 2048 || ((i13 & 4096) != 0 && u11.F(null))) | u11.n(e11) | u11.F(references);
            Object C15 = u11.C();
            if (n11 || C15 == InterfaceC3967k.a.a()) {
                C15 = new A(e11, references, interfaceC3978p0);
                u11.x(C15);
            }
            Function1 function1 = (Function1) C15;
            u11.k();
            u11.o(1110739007);
            boolean n12 = u11.n(e11) | (i14 == 256 || ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 && u11.F(blockItem)));
            Object C16 = u11.C();
            if (n12 || C16 == InterfaceC3967k.a.a()) {
                C16 = new B(e11, blockItem);
                u11.x(C16);
            }
            u11.k();
            androidx.compose.ui.viewinterop.a.a(function1, a12, (Function1) C16, u11, 0, 0);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new C(eVar, references, blockItem, i11));
        }
    }
}
