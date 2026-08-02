package ru.ozon.app.android.ugc.core.widgets.timerButton.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import WZ.t;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.common.ExtKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.J;
import u0.O;
import u0.Y;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\r\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;", "state", "", "secondsLeft", "Lkotlin/Function2;", "LWZ/t;", "", "onView", "Lkotlin/Function1;", "LTg/b;", "actionHandler", "TimerButton", "(Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;ILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "TimerButtonContent", "(Lru/ozon/app/android/ugc/core/widgets/timerButton/presentation/TimerButtonVO;ILkotlin/jvm/functions/Function1;LS0/k;I)V", "LZ1/h;", "DEFAULT_PADDING", "F", "DEFAULT_CORNER_RADIUS", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerButtonKt {
    private static final float DEFAULT_PADDING = Paddings.PADDING_300.m1867getDpD9Ej5fM();
    private static final float DEFAULT_CORNER_RADIUS = CornerRadius.RADIUS_600.m1866getDpD9Ej5fM();

    public static final void TimerButton(@NotNull TimerButtonVO state, int i11, Function2<? super TimerButtonVO, ? super t, Unit> function2, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i12, int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(492313709);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (u11.F(state) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 48) == 0) {
            i14 |= u11.r(i11) ? 32 : 16;
        }
        int i15 = i13 & 4;
        if (i15 != 0) {
            i14 |= 384;
        } else if ((i12 & 384) == 0) {
            i14 |= u11.F(function2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 3072) == 0) {
            i14 |= u11.F(actionHandler) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i14 & 1171) == 1170 && u11.b()) {
            u11.j();
        } else {
            if (i15 != 0) {
                u11.o(1162525841);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = TimerButtonKt$TimerButton$1$1.INSTANCE;
                    u11.x(C11);
                }
                function2 = (Function2) C11;
                u11.k();
            }
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(1162529431);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1162532091);
                boolean F11 = ((i14 & 896) == 256) | u11.F(state) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new TimerButtonKt$TimerButton$2$1(function2, state, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
            }
            u11.k();
            TimerButtonContent(state, i11, actionHandler, u11, ((i14 >> 3) & 896) | (i14 & 126));
        }
        Function2<? super TimerButtonVO, ? super t, Unit> function22 = function2;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TimerButtonKt$TimerButton$3(state, i11, function22, actionHandler, i12, i13));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TimerButtonContent(TimerButtonVO timerButtonVO, int i11, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i12) {
        int i13;
        C3969l u11 = interfaceC3967k.u(468028916);
        if ((i12 & 6) == 0) {
            i13 = (u11.F(timerButtonVO) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= u11.r(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= u11.F(function1) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(timerButtonVO.getBackgroundColor(), u11, 0);
            u11.o(-1818216260);
            long layerFloor1OnDark = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1OnDark() : c7807z.w();
            u11.k();
            long graphicNeutralOnDark = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutralOnDark();
            CornerRadius cornerRadius = timerButtonVO.getCornerRadius();
            float m1866getDpD9Ej5fM = cornerRadius != null ? cornerRadius.m1866getDpD9Ej5fM() : DEFAULT_CORNER_RADIUS;
            e.a aVar = e.f40358c0;
            e m1482addStrokey6ga9Xk$default = ExtKt.m1482addStrokey6ga9Xk$default(a0.u(a0.e(aVar, 1.0f), 3), graphicNeutralOnDark, 0.0f, m1866getDpD9Ej5fM, 2, null);
            V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, m1482addStrokey6ga9Xk$default);
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
            e b11 = androidx.compose.foundation.e.b(T.j(GZ.e.c(u11, f11, aVar, 1.0f), 0.0f, 1, 0.0f, 0.0f, 13), layerFloor1OnDark, h.d(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, 0.0f, 0.0f, 12));
            int i14 = J.f99608a;
            e f13 = T.f(O.d(b11, Y.a(u11)), DEFAULT_PADDING);
            V f14 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I12 = u11.I();
            A0 d12 = u11.d();
            e f15 = c.f(u11, f13);
            Function0 a12 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 f16 = E.f(u11, f14, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                a.d(I12, u11, I12, f16);
            }
            F1.b(u11, f15, InterfaceC2801g.a.f());
            if (i11 > 0) {
                u11.o(1724598281);
                e e11 = a0.e(aVar, 1.0f);
                ButtonV3DTO initialState = timerButtonVO.getInitialState();
                String subtitle = timerButtonVO.getInitialState().getSubtitle();
                DsButtonAtomKt.DsButtonAtom(ButtonV3DTO.copy$default(initialState, null, null, null, subtitle != null ? kotlin.text.h.X(subtitle, "%s", String.valueOf(i11), false) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131063, null), e11, false, null, u11, 48, 12);
                u11.k();
            } else {
                u11.o(1724895416);
                e e12 = a0.e(aVar, 1.0f);
                boolean z11 = true;
                ButtonV3DTO finalState = timerButtonVO.getFinalState();
                u11.o(-1606921178);
                if ((i13 & 896) != 256) {
                    z11 = false;
                }
                Object C11 = u11.C();
                if (z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new TimerButtonKt$TimerButtonContent$1$1$1$1(function1);
                    u11.x(C11);
                }
                u11.k();
                DsButtonAtomKt.DsButtonAtom(finalState, e12, false, (Function1) ((kotlin.reflect.h) C11), u11, 48, 4);
                u11.k();
            }
            u11.f();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new TimerButtonKt$TimerButtonContent$2(timerButtonVO, i11, function1, i12));
        }
    }
}
