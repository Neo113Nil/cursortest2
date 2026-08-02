package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import B1.V;
import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import androidx.compose.foundation.layout.C5185h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.K0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.components.iconButton.UniIconButtonAtomKt;
import ru.ozon.uni.core.repository.UniTheme;

/* loaded from: classes10.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(androidx.compose.ui.e eVar, boolean z11, IconButtonV3DTO iconButtonV3DTO, @NotNull Function2 onSendClick, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l c3969l;
        J0 m02;
        Intrinsics.checkNotNullParameter(onSendClick, "onSendClick");
        C3969l u11 = interfaceC3967k.u(-957006344);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= (i11 & UserVerificationMethods.USER_VERIFY_NONE) == 0 ? u11.n(iconButtonV3DTO) : u11.F(iconButtonV3DTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(onSendClick) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else if (iconButtonV3DTO != null) {
            String backgroundColor = iconButtonV3DTO.getBackgroundColor();
            u11.o(167583840);
            AbstractC7799Q a11 = backgroundColor == null ? null : ru.ozon.android.messenger.utils.compose.a.a(backgroundColor, u11, 0);
            u11.k();
            u11.o(167588105);
            if (a11 == null) {
                a11 = new K0(UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0());
            }
            u11.k();
            androidx.compose.ui.e a12 = androidx.compose.foundation.e.a(eVar, a11, A0.h.e(), 4);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f11 = androidx.compose.ui.c.f(u11, a12);
            Function0 a13 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            int i13 = i12;
            IconButtonV3DTO copy$default = IconButtonV3DTO.copy$default(iconButtonV3DTO, null, null, null, null, Boolean.valueOf(!z11), null, null, null, null, null, null, null, null, null, 16367, null);
            u11.o(560347548);
            boolean z12 = true;
            boolean z13 = (i13 & 7168) == 2048;
            if ((i13 & 896) != 256 && ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 || !u11.F(iconButtonV3DTO))) {
                z12 = false;
            }
            boolean z14 = z13 | z12;
            Object C11 = u11.C();
            if (z14 || C11 == InterfaceC3967k.a.a()) {
                C11 = new c(onSendClick, iconButtonV3DTO);
                u11.x(C11);
            }
            u11.k();
            c3969l = u11;
            UniIconButtonAtomKt.UniIconButtonAtom(copy$default, null, null, false, (Function1) C11, c3969l, IconButtonV3DTO.$stable, 14);
            c3969l.f();
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new d(eVar, z11, iconButtonV3DTO, onSendClick, i11));
                return;
            }
            return;
        }
        c3969l = u11;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
