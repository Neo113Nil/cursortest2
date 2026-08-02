package ru.ozon.app.android.storefront.widgets.financeWidgetV2.presentation;

import A0.g;
import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import J0.r;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import a1.c;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.financeWidgetV2.data.FinanceWidgetCardDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;
import u0.InterfaceC9890C;
import x1.L;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\f\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeWidgetV2/presentation/FinanceWidgetV2VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "FinanceWidgetV2", "(Lru/ozon/app/android/storefront/widgets/financeWidgetV2/presentation/FinanceWidgetV2VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lu0/C;", "Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;", "Landroidx/compose/ui/e;", "modifier", "FinanceWidgetCard", "(Lu0/C;Lru/ozon/app/android/storefront/widgets/financeWidgetV2/data/FinanceWidgetCardDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinanceWidgetV2Kt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinanceWidgetCard(InterfaceC9890C interfaceC9890C, FinanceWidgetCardDTO financeWidgetCardDTO, e eVar, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        Object C11;
        boolean z11;
        Object C12;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1342100843);
        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 1) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(financeWidgetCardDTO) : u11.F(financeWidgetCardDTO) ? 32 : 16;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 4) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                i13 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                u11.o(-1410031113);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = h.b(UniTheme.INSTANCE.getPaddings().getPadding500());
                    u11.x(C11);
                }
                g gVar = (g) C11;
                u11.k();
                e a11 = interfaceC9890C.a(C6988h.a(a0.e(a0.f(e.f40358c0, 60), 1.0f), gVar), 1.0f, true);
                Unit unit = Unit.f71690a;
                u11.o(-1410022883);
                z11 = ((i13 & 112) != 32 || ((i13 & 64) != 0 && u11.F(financeWidgetCardDTO))) | ((i13 & 7168) == 2048);
                C12 = u11.C();
                if (!z11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new FinanceWidgetV2Kt$FinanceWidgetCard$1$1(financeWidgetCardDTO, function1, null);
                    u11.x(C12);
                }
                u11.k();
                e l02 = L.b(a11, unit, (Function2) C12).l0(eVar4);
                C7807Z c7807z = TokenParserKt.tokenToColor(financeWidgetCardDTO.getBackgroundColor(), u11, 0);
                u11.o(-1410012753);
                long bgPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : c7807z.w();
                u11.k();
                r.a(l02, gVar, bgPrimary, 0.0f, c.c(486838798, new FinanceWidgetV2Kt$FinanceWidgetCard$2(financeWidgetCardDTO, function1), u11), u11, 1572912, 56);
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new FinanceWidgetV2Kt$FinanceWidgetCard$3(interfaceC9890C, financeWidgetCardDTO, eVar3, function1, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 == 0) {
        }
        u11.o(-1410031113);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        g gVar2 = (g) C11;
        u11.k();
        e a112 = interfaceC9890C.a(C6988h.a(a0.e(a0.f(e.f40358c0, 60), 1.0f), gVar2), 1.0f, true);
        Unit unit2 = Unit.f71690a;
        u11.o(-1410022883);
        z11 = ((i13 & 112) != 32 || ((i13 & 64) != 0 && u11.F(financeWidgetCardDTO))) | ((i13 & 7168) == 2048);
        C12 = u11.C();
        if (!z11) {
        }
        C12 = new FinanceWidgetV2Kt$FinanceWidgetCard$1$1(financeWidgetCardDTO, function1, null);
        u11.x(C12);
        u11.k();
        e l022 = L.b(a112, unit2, (Function2) C12).l0(eVar4);
        C7807Z c7807z2 = TokenParserKt.tokenToColor(financeWidgetCardDTO.getBackgroundColor(), u11, 0);
        u11.o(-1410012753);
        if (c7807z2 != null) {
        }
        u11.k();
        r.a(l022, gVar2, bgPrimary, 0.0f, c.c(486838798, new FinanceWidgetV2Kt$FinanceWidgetCard$2(financeWidgetCardDTO, function1), u11), u11, 1572912, 56);
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    public static final void FinanceWidgetV2(@NotNull FinanceWidgetV2VO state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(1555057190);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            l lVar = (l) u11.m(f.e());
            C7807Z c7807z = TokenParserKt.tokenToColor(state.getBackgroundColor(), u11, 0);
            u11.o(-680217219);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-680213128);
            boolean F11 = u11.F(state) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new FinanceWidgetV2Kt$FinanceWidgetV2$1$1(state, lVar);
                u11.x(C11);
            }
            u11.k();
            i.a(aVar, null, (Function0) C11, u11, 6);
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(aVar2, 1.0f);
            UniTheme uniTheme = UniTheme.INSTANCE;
            b11 = androidx.compose.foundation.e.b(T.h(e11, uniTheme.getPaddings().getPadding300(), 0.0f, 2), layerFloor1, y0.a());
            Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = androidx.compose.ui.c.f(u11, b11);
            Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            FinanceWidgetCardDTO leftCard = state.getLeftCard();
            int i13 = (IconDTO.$stable << 3) | 6 | ((i12 << 6) & 7168);
            function1 = actionHandler;
            FinanceWidgetCard(c9891d, leftCard, null, function1, u11, i13, 2);
            FinanceWidgetCardDTO rightCard = state.getRightCard();
            u11.o(59231233);
            if (rightCard != null) {
                E.a(u11, a0.r(aVar2, uniTheme.getPaddings().getPadding300()));
                FinanceWidgetCard(c9891d, rightCard, null, function1, u11, i13, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new FinanceWidgetV2Kt$FinanceWidgetV2$3(state, function1, i11));
        }
    }
}
