package ru.ozon.app.android.ugc.core.widgets.stickyCell.presentation;

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
import WZ.l;
import WZ.t;
import a1.c;
import androidx.compose.animation.q;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.G;
import l1.C7807Z;
import m0.C8004n;
import m0.T0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.common.ExtKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;", "state", "", "isVisible", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "closeIfNeeded", "StickyCell", "(Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "StickyCellContent", "(Lru/ozon/app/android/ugc/core/widgets/stickyCell/presentation/StickyCellVO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StickyCellKt {
    public static final void StickyCell(@NotNull StickyCellVO state, boolean z11, @NotNull Function1<? super b, Unit> actionHandler, @NotNull Function1<? super b, Unit> closeIfNeeded, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        q qVar;
        boolean z12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(closeIfNeeded, "closeIfNeeded");
        C3969l u11 = interfaceC3967k.u(-551596115);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i11 & 3072) == 0) {
            i12 |= u11.F(closeIfNeeded) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 1171) == 1170 && u11.b()) {
            u11.j();
            z12 = z11;
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-891942228);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(-888440793);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new StickyCellKt$StickyCell$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            qVar = q.f38814a;
            T0 d11 = C8004n.d(0, 0, null, 7);
            u11.o(-891933170);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = StickyCellKt$StickyCell$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            z12 = z11;
            G.c(z12, null, qVar, androidx.compose.animation.b.r((Function1) C12, d11), null, c.c(-1085743147, new StickyCellKt$StickyCell$3(state, actionHandler, closeIfNeeded), u11), u11, ((i12 >> 3) & 14) | 196608, 18);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new StickyCellKt$StickyCell$4(state, z12, actionHandler, closeIfNeeded, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StickyCellContent(StickyCellVO stickyCellVO, Function1<? super b, Unit> function1, Function1<? super b, Unit> function12, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        CornerRadius cornerRadius;
        C3969l u11 = interfaceC3967k.u(-1717657392);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(stickyCellVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(stickyCellVO.getBackgroundColor(), u11, 0);
            u11.o(-365302764);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(stickyCellVO.getStrokeColor(), u11, 0);
            u11.o(-365299880);
            long graphicStrokeSticky = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicStrokeSticky() : c7807z2.w();
            u11.k();
            CornerRadius cornerRadius2 = stickyCellVO.getCornerRadius();
            float m1866getDpD9Ej5fM = cornerRadius2 != null ? cornerRadius2.m1866getDpD9Ej5fM() : StickyCellDefaults.INSTANCE.m1519getDEFAULT_CORNER_RADIUSD9Ej5fM();
            CellDTO.Settings settings = stickyCellVO.getCell().getSettings();
            float m1518getDEFAULT_CELL_BACKGROUND_RADIUSD9Ej5fM = (settings == null || (cornerRadius = settings.getCornerRadius()) == null) ? StickyCellDefaults.INSTANCE.m1518getDEFAULT_CELL_BACKGROUND_RADIUSD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM();
            e.a aVar = e.f40358c0;
            e f7 = T.f(ExtKt.m1482addStrokey6ga9Xk$default(androidx.compose.foundation.e.b(a0.u(a0.e(aVar, 1.0f), 3), layerFloor1, h.d(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, 0.0f, 0.0f, 12)), graphicStrokeSticky, 0.0f, m1866getDpD9Ej5fM, 2, null), StickyCellDefaults.INSTANCE.m1520getDEFAULT_PADDINGD9Ej5fM());
            V f11 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = androidx.compose.ui.c.f(u11, f7);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f13 = E.f(u11, f11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f13);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            e a12 = C6988h.a(aVar, h.b(m1518getDEFAULT_CELL_BACKGROUND_RADIUSD9Ej5fM));
            CellDTO cell = stickyCellVO.getCell();
            u11.o(-1222926423);
            boolean z11 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new StickyCellKt$StickyCellContent$1$1$1(function12, function1);
                u11.x(C11);
            }
            u11.k();
            DsCellAtomKt.DsCellAtom(cell, a12, (Function1) C11, u11, CellDTO.$stable, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new StickyCellKt$StickyCellContent$2(stickyCellVO, function1, function12, i11));
        }
    }
}
