package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.Q;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v0.I;
import xe.M;

/* loaded from: classes10.dex */
public final class z {
    public static final void a(@NotNull I lazyListState, @NotNull u paginationController, int i11, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        I i14;
        u uVar;
        int i15;
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(paginationController, "paginationController");
        C3969l u11 = interfaceC3967k.u(719415639);
        if ((i12 & 6) == 0) {
            i13 = (u11.n(lazyListState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= (i12 & 64) == 0 ? u11.n(paginationController) : u11.F(paginationController) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.r(i11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            i14 = lazyListState;
            uVar = paginationController;
            i15 = i11;
        } else {
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = Pk0.f.b(Q.j(kotlin.coroutines.g.f71771a, u11), u11);
            }
            M a11 = ((S0.D) C11).a();
            u11.o(-285326896);
            boolean F11 = ((i13 & 14) == 4) | ((i13 & 112) == 32 || ((i13 & 64) != 0 && u11.F(paginationController))) | ((i13 & 896) == 256) | u11.F(a11);
            Object C12 = u11.C();
            if (F11 || C12 == InterfaceC3967k.a.a()) {
                i14 = lazyListState;
                uVar = paginationController;
                i15 = i11;
                v vVar = new v(i14, uVar, i15, a11, null);
                u11.x(vVar);
                C12 = vVar;
            } else {
                i14 = lazyListState;
                uVar = paginationController;
                i15 = i11;
            }
            u11.k();
            Q.e(u11, i14, (Function2) C12);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new y(i14, uVar, i15, i12));
        }
    }
}
