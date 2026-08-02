package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import D1.InterfaceC2801g;
import K1.C3422b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.B0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.w0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.C6285b;
import f3.AbstractC6409a;
import g3.C6616a;
import g3.C6617b;
import i1.C6988h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.uni.android.ds.compose.component.textarea.DsTextAreaKt;
import ru.ozon.uni.android.ds.compose.component.textarea.DsTextAreaStatus;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.compose.theme.UniCompositionLocalKt;
import ru.ozon.uni.core.models.UniColorToken;

/* loaded from: classes10.dex */
public final class r {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(i iVar, Function1 function1, Function0 function0, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        y b11;
        C3969l c3969l;
        C3969l u11 = interfaceC3967k.u(-790545064);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
            c3969l = u11;
        } else {
            if (iVar == null || (b11 = iVar.b()) == null) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new m(iVar, function1, function0, i11));
                    return;
                }
                return;
            }
            DsTextAreaStatus dsTextAreaStatus = iVar.c() ? DsTextAreaStatus.DISABLED : iVar.d() ? DsTextAreaStatus.ERROR : DsTextAreaStatus.DEFAULT;
            C3422b c3422b = (!iVar.d() || b11.b() == null) ? null : new C3422b(6, b11.b(), null);
            u11.o(43141315);
            boolean z11 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new j(function1);
                u11.x(C11);
            }
            Function1 function12 = (Function1) C11;
            u11.k();
            String f7 = b11.f().f();
            String c11 = b11.c();
            androidx.compose.ui.e a11 = Q1.a(a0.b(androidx.compose.ui.e.f40358c0, 0.0f, 56, 1), "fast_answer_input");
            int e11 = b11.e();
            int d11 = b11.d();
            u11.o(43159553);
            boolean z12 = (i12 & 896) == 256;
            Object C12 = u11.C();
            if (z12 || C12 == InterfaceC3967k.a.a()) {
                C12 = new k(function0);
                u11.x(C12);
            }
            u11.k();
            c3969l = u11;
            DsTextAreaKt.m1820DsTextAreas9ZHXeI(function12, f7, c11, dsTextAreaStatus, a11, c3422b, e11, 0, d11, null, false, true, true, true, null, null, null, null, null, null, (Function0) C12, null, null, c3969l, 805330944, 3510, 0, 7323776);
        }
        J0 m03 = c3969l.m0();
        if (m03 != null) {
            m03.G(new l(iVar, function1, function0, i11));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull t item, u uVar, InterfaceC3967k interfaceC3967k, int i11) {
        androidx.compose.ui.e b11;
        Intrinsics.checkNotNullParameter(item, "item");
        C3969l u11 = interfaceC3967k.u(-824424336);
        int i12 = (u11.n(item) ? 4 : 2) | i11 | 16;
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            u11.Q0();
            if ((i11 & 1) == 0 || u11.w0()) {
                u11.B(1729797275);
                B0 a11 = C6616a.a(u11);
                if (a11 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                w0 a12 = C6617b.a(N.b(u.class), a11, null, null, a11 instanceof InterfaceC5431s ? ((InterfaceC5431s) a11).getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b, u11);
                u11.K();
                uVar = (u) a12;
            } else {
                u11.j();
            }
            int i13 = i12 & (-113);
            u11.j0();
            InterfaceC3978p0 c11 = C6285b.c(uVar.getState(), u11, 0);
            u11.o(-963486594);
            u11.o(-1558377931);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new w(uVar);
                u11.x(C11);
            }
            Function1 function1 = (Function1) C11;
            u11.k();
            u11.k();
            float f7 = 8;
            float f11 = 16;
            y b12 = item.b();
            u11.o(490898914);
            if (b12 != null) {
                y b13 = item.b();
                u11.o(-192275886);
                boolean n11 = ((i13 & 14) == 4) | u11.n(function1);
                Object C12 = u11.C();
                if (n11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new n(function1, item, null);
                    u11.x(C12);
                }
                u11.k();
                Q.e(u11, b13, (Function2) C12);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            b11 = androidx.compose.foundation.e.b(C6988h.a(T.h(a0.e(androidx.compose.ui.e.f40358c0, 1.0f), 0.0f, f7, 1), A0.h.b(CornerRadius.RADIUS_600.getPx())), UniCompositionLocalKt.getThemedColor(new UniColorToken(StatusWidgetDTO.DEFAULT_BACKGROUND_COLOR), u11, UniColorToken.$stable), y0.a());
            androidx.compose.ui.e f12 = T.f(b11, f11);
            C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            androidx.compose.ui.e f13 = androidx.compose.ui.c.f(u11, f12);
            Function0 a14 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a14);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a13, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                Ep.a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f13, InterfaceC2801g.a.f());
            i iVar = (i) c11.getValue();
            u11.o(-192260905);
            boolean n12 = u11.n(function1);
            Object C13 = u11.C();
            if (n12 || C13 == InterfaceC3967k.a.a()) {
                C13 = new o(function1);
                u11.x(C13);
            }
            Function1 function12 = (Function1) C13;
            u11.k();
            u11.o(-192258185);
            boolean n13 = u11.n(function1);
            Object C14 = u11.C();
            if (n13 || C14 == InterfaceC3967k.a.a()) {
                C14 = new p(function1);
                u11.x(C14);
            }
            u11.k();
            a(iVar, function12, (Function0) C14, u11, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new q(item, uVar, i11));
        }
    }
}
