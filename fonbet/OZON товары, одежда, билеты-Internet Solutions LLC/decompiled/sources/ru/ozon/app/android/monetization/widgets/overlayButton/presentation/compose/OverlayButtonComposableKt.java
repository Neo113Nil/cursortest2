package ru.ozon.app.android.monetization.widgets.overlayButton.presentation.compose;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Sc.o;
import T7.E;
import WZ.t;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.y0;
import n0.C8385f;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.overlayButton.presentation.OverlayButtonVO;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;", "state", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "onView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "OverlayButtonComposable", "(Lru/ozon/app/android/monetization/widgets/overlayButton/presentation/OverlayButtonVO;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "TopOutlinedBackground", "(Landroidx/compose/ui/e;LS0/k;II)V", "monetization_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OverlayButtonComposableKt {
    public static final void OverlayButtonComposable(@NotNull OverlayButtonVO state, @NotNull Function2<? super OverlayButtonVO, ? super t, Unit> onView, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        List a02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onView, "onView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(159279489);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(onView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i13 = i12;
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-1098687429);
            boolean z11 = false;
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-1098684769);
                boolean F11 = ((i13 & 112) == 32) | u11.F(state) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new OverlayButtonComposableKt$OverlayButtonComposable$1$1(onView, state, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
            }
            u11.k();
            OverlayButtonVO.ButtonWrapper buttonWrapper = state.getButtonWrapper();
            if (buttonWrapper instanceof OverlayButtonVO.ButtonWrapper.DoubleButton) {
                a02 = C7714v.b0(((OverlayButtonVO.ButtonWrapper.DoubleButton) state.getButtonWrapper()).getFirstButton(), ((OverlayButtonVO.ButtonWrapper.DoubleButton) state.getButtonWrapper()).getSecondButton());
            } else {
                if (!(buttonWrapper instanceof OverlayButtonVO.ButtonWrapper.SingleButton)) {
                    throw new o();
                }
                a02 = C7714v.a0(((OverlayButtonVO.ButtonWrapper.SingleButton) state.getButtonWrapper()).getSingleButton());
            }
            List list = a02;
            e.a aVar2 = e.f40358c0;
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, aVar2);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f12 = E.f(u11, f7, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f12);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            TopOutlinedBackground(C5187j.f39515a.b(aVar2), u11, 0, 0);
            float f13 = 1.0f;
            e e11 = a0.e(aVar2, 1.0f);
            TestInfo testInfo = state.getTestInfo();
            String automatizationId = testInfo != null ? testInfo.getAutomatizationId() : null;
            if (automatizationId == null) {
                automatizationId = "";
            }
            e a12 = Q1.a(e11, automatizationId);
            float f14 = 8;
            e h11 = T.h(a12, f14, 0.0f, 2);
            Y b11 = X.b(C5179b.n(f14), InterfaceC6250b.a.l(), u11, 6);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, h11);
            Function0 a13 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a13);
            } else {
                u11.e();
            }
            Function2 h12 = Cm.e.h(u11, b11, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, h12);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            u11.o(-148634536);
            int size = list.size();
            int i14 = 0;
            while (i14 < size) {
                ButtonV3DTO buttonV3DTO = (ButtonV3DTO) list.get(i14);
                e.a aVar3 = e.f40358c0;
                if (f13 <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f13 <= Float.MAX_VALUE ? f13 : Float.MAX_VALUE, true);
                V f16 = C5185h.f(InterfaceC6250b.a.o(), z11);
                int I13 = u11.I();
                A0 d13 = u11.d();
                e f17 = c.f(u11, layoutWeightElement);
                Function0 a14 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 f18 = E.f(u11, f16, u11, d13);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                    a.d(I13, u11, I13, f18);
                }
                F1.b(u11, f17, InterfaceC2801g.a.f());
                float f19 = f14;
                DsButtonAtomKt.DsButtonAtom(buttonV3DTO, a0.e(T.j(aVar3, 0.0f, f19, 0.0f, 4, 5), 1.0f), false, actionHandler, u11, ((i13 << 3) & 7168) | 48, 4);
                u11.f();
                i14++;
                f14 = f19;
                f13 = 1.0f;
                z11 = false;
            }
            u11.k();
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OverlayButtonComposableKt$OverlayButtonComposable$3(state, onView, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TopOutlinedBackground(e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e b11;
        C3969l u11 = interfaceC3967k.u(1629952424);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(eVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 3) == 2 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar2 = eVar;
            UniTheme uniTheme = UniTheme.INSTANCE;
            int i15 = UniTheme.$stable;
            float f7 = 24;
            C5185h.a(C8385f.c((float) 0.5d, uniTheme.getColors(u11, i15).getGraphicStrokeSticky(), androidx.compose.foundation.e.b(eVar2, uniTheme.getColors(u11, i15).getLayerFloor1(), h.d(f7, f7, 0.0f, 0.0f, 12)), h.d(f7, f7, 0.0f, 0.0f, 12)), u11, 0);
            b11 = androidx.compose.foundation.e.b(T.j(eVar2, 0.0f, f7, 0.0f, 0.0f, 13), uniTheme.getColors(u11, i15).getLayerFloor1(), y0.a());
            C5185h.a(b11, u11, 0);
            eVar = eVar2;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new OverlayButtonComposableKt$TopOutlinedBackground$1(eVar, i11, i12));
        }
    }
}
