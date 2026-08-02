package ru.ozon.android.messenger.blocks.dangerousText;

import D1.InterfaceC2801g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.screen.compose.p;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.e f84992a = T.h(androidx.compose.ui.e.f40358c0, 12, 0.0f, 2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TextDTO textDTO, ButtonV3DTO buttonV3DTO, Function1 function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        ButtonV3DTO buttonV3DTO2;
        Function1 function12;
        C3969l u11 = interfaceC3967k.u(-115514662);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(textDTO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(buttonV3DTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            buttonV3DTO2 = buttonV3DTO;
            function12 = function1;
        } else {
            C5179b.i n11 = C5179b.n(6);
            e.a aVar = androidx.compose.ui.e.f40358c0;
            C5194q a11 = C5193p.a(n11, InterfaceC6250b.a.k(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f7 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            U7.i.b(u11, f7, -1956733337);
            if (textDTO != null) {
                DsTextAtomKt.DsTextAtom(textDTO, null, u11, 0, 2);
            }
            u11.k();
            u11.o(-1956731373);
            if (buttonV3DTO == null) {
                buttonV3DTO2 = buttonV3DTO;
                function12 = function1;
            } else {
                buttonV3DTO2 = buttonV3DTO;
                function12 = function1;
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO2, null, false, function12, u11, (i12 << 3) & 7168, 6);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new a(textDTO, buttonV3DTO2, function12, i11));
        }
    }

    public static final void b(boolean z11, IconDTO iconDTO, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull Function1 onAction, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        int i13;
        androidx.compose.ui.e f7;
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        C3969l u11 = interfaceC3967k.u(687906708);
        if ((i11 & 6) == 0) {
            i12 = (u11.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? u11.n(iconDTO) : u11.F(iconDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(textDTO) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.n(buttonV3DTO) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i11 & 24576) == 0) {
            i12 |= u11.F(onAction) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && u11.b()) {
            u11.j();
        } else {
            float f11 = 8;
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f12 = androidx.compose.ui.c.f(u11, f84992a);
            Function0 a12 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e.a aVar = androidx.compose.ui.e.f40358c0;
            if (z11) {
                i13 = 0;
                f7 = T.j(aVar, 0.0f, 0.0f, 0.0f, f11, 7);
            } else {
                i13 = 0;
                f7 = a0.f(aVar, 0);
            }
            p.a(f7, UniCompositionLocalKt.getThemedColor(new UniColorToken("graphicNeutral"), u11, UniColorToken.$stable), u11, i13);
            Y b11 = X.b(C5179b.n(f11), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, aVar);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                Ep.a.d(I12, u11, I12, h11);
            }
            U7.i.b(u11, f13, 548587490);
            if (iconDTO != null) {
                DsIconAtomKt.DsIconAtom(iconDTO, null, u11, IconDTO.$stable, 2);
            }
            u11.k();
            a(textDTO, buttonV3DTO, onAction, u11, (i12 >> 6) & 1022);
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new b(z11, iconDTO, textDTO, buttonV3DTO, onAction, i11));
        }
    }

    @NotNull
    public static final androidx.compose.ui.e d() {
        return f84992a;
    }
}
