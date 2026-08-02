package ru.ozon.app.android.pdp.widgets.curtainPrice.presentation;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import WZ.l;
import WZ.t;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.z;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7809a0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.pdp.compose.layout.RowComponentsKt;
import ru.ozon.app.android.pdp.widgets.curtainPrice.data.CurtainPriceDTO;
import ru.ozon.app.android.pdp.widgets.curtainPrice.presentation.CurtainPriceVI;
import ru.ozon.uni.android.ds.compose.component.price.DsPriceAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.EnumC9909s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007\u001a+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\t2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a5\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0001\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00132\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "CurtainPriceComposable", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "CurtainPrice", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;", "Island", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$Island;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;", "Lkotlin/Function0;", "onClick", "RegularPrice", "(Landroidx/compose/ui/e;Lru/ozon/app/android/pdp/widgets/curtainPrice/data/CurtainPriceDTO$PriceWrapperDTO;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$AdditionalInfo;", "AdditionalItem", "(Lru/ozon/app/android/pdp/widgets/curtainPrice/presentation/CurtainPriceVI$AdditionalInfo;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurtainPriceComposableKt {
    public static final void AdditionalItem(@NotNull CurtainPriceVI.AdditionalInfo state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar;
        boolean z11;
        float f7;
        int i13;
        int i14;
        float f11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-722336805);
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
        } else {
            e.a aVar2 = e.f40358c0;
            e e11 = a0.e(aVar2, 1.0f);
            u11.o(35806619);
            boolean F11 = ((i12 & 112) == 32) | u11.F(state);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CurtainPriceComposableKt$AdditionalItem$1$1(state, actionHandler);
                u11.x(C11);
            }
            u11.k();
            e j11 = T.j(i.b(e11, null, null, false, null, null, (Function0) C11, 28), 24, 8, 12, 0.0f, 8);
            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f12 = c.f(u11, j11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            CommonAtomIconDTO icon = state.getIcon();
            u11.o(-2085668502);
            if (icon == null) {
                aVar = aVar2;
                f7 = 1.0f;
                z11 = true;
            } else {
                C7807Z c7807z = TokenParserKt.tokenToColor(icon.getTintColor(), u11, 0);
                u11.o(-2085667767);
                long graphicPremium = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPremium() : c7807z.w();
                u11.k();
                AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getIcon(), u11, 0);
                u11.o(-2085664451);
                if (abstractC8972b == null) {
                    aVar = aVar2;
                    f7 = 1.0f;
                    z11 = true;
                } else {
                    aVar = aVar2;
                    z11 = true;
                    f7 = 1.0f;
                    C8366G.a(abstractC8972b, null, a0.n(aVar2, 16), null, null, 0.0f, C7809a0.a.a(5, graphicPremium), u11, 432, 56);
                    Unit unit = Unit.f71690a;
                }
                u11.k();
            }
            u11.k();
            TextDTO text = state.getText();
            if (f7 <= 0.0d) {
                throw new IllegalArgumentException(C2942q.b(f7, "invalid weight ", "; must be greater than zero").toString());
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(f7 <= Float.MAX_VALUE ? f7 : Float.MAX_VALUE, z11);
            if (state.getIcon() == null) {
                i14 = 0;
                f11 = 0;
                i13 = 5;
            } else {
                i13 = 5;
                i14 = 0;
                f11 = 5;
            }
            DsTextAtomKt.DsTextAtom(text, T.j(layoutWeightElement, f11, 0.0f, 0.0f, 0.0f, 14), u11, i14, i14);
            AtomAction action = state.getAction();
            u11.o(-2085648369);
            if (action != null) {
                e n11 = a0.n(aVar, 16);
                UniTheme uniTheme = UniTheme.INSTANCE;
                uniTheme.getIcons();
                u11.B(-524256677);
                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_s_chevron_right_filled, "ic_s_chevron_right_filled", u11, 48);
                u11.K();
                C8366G.a(uniPainterResource, null, n11, null, null, 0.0f, C7809a0.a.a(i13, uniTheme.getColors(u11, UniTheme.$stable).getGraphicQuaternary()), u11, 432, 56);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CurtainPriceComposableKt$AdditionalItem$3(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CurtainPrice(CurtainPriceVI curtainPriceVI, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1882053139);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(curtainPriceVI) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(curtainPriceVI.getSettings().getInnerBackgroundColor(), u11, 0);
            u11.o(357129881);
            long bgPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : c7807z.w();
            u11.k();
            float m1866getDpD9Ej5fM = curtainPriceVI.getSettings().getCornerRadius().m1866getDpD9Ej5fM();
            e.a aVar = e.f40358c0;
            float f7 = 12;
            e e11 = a0.e(T.j(androidx.compose.foundation.e.b(T.h(aVar, 16, 0.0f, 2), bgPrimary, h.b(m1866getDpD9Ej5fM)), 0.0f, curtainPriceVI.getIsland() == null ? 4 : 0, 0.0f, f7, 5), 1.0f);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f11 = c.f(u11, e11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f11, InterfaceC2801g.a.f());
            CurtainPriceVI.Island island = curtainPriceVI.getIsland();
            u11.o(-1986922082);
            if (island != null) {
                Island(island, function1, u11, i12 & 112);
            }
            u11.k();
            CurtainPriceDTO.PriceWrapperDTO regularPrice = curtainPriceVI.getRegularPrice();
            u11.o(-1986919144);
            if (regularPrice != null) {
                e a13 = z.a(T.j(aVar, (curtainPriceVI.getIsland() == null && curtainPriceVI.getAdditionalInfo() == null) ? 0 : f7, 0.0f, f7, 0.0f, 10), z.b(u11));
                Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                int I12 = u11.I();
                A0 d12 = u11.d();
                e f12 = c.f(u11, a13);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, h11);
                }
                F1.b(u11, f12, InterfaceC2801g.a.f());
                RegularPrice(T.j(aVar, 0.0f, 8, 0.0f, 0.0f, 13), regularPrice, null, u11, ((PriceDTO.$stable | CommonAtomIconDTO.$stable) << 3) | 6, 4);
                u11.f();
            }
            u11.k();
            List<CurtainPriceVI.AdditionalInfo> additionalInfo = curtainPriceVI.getAdditionalInfo();
            u11.o(-1986906629);
            if (additionalInfo != null) {
                u11.o(-1986905988);
                Iterator<T> it = additionalInfo.iterator();
                while (it.hasNext()) {
                    AdditionalItem((CurtainPriceVI.AdditionalInfo) it.next(), function1, u11, i12 & 112);
                }
                u11.k();
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CurtainPriceComposableKt$CurtainPrice$2(curtainPriceVI, function1, i11));
        }
    }

    public static final void CurtainPriceComposable(@NotNull CurtainPriceVI state, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(244438790);
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
        } else {
            l lVar = (l) u11.m(f.e());
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(-925204165);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1447505974);
                boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                Object C11 = u11.C();
                if (F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CurtainPriceComposableKt$CurtainPriceComposable$1$1$1(lVar, tokenizedEvent);
                    u11.x(C11);
                }
                u11.k();
                e3.i.a(aVar, null, (Function0) C11, u11, 6);
                Unit unit = Unit.f71690a;
            }
            u11.k();
            CurtainPrice(state, actionHandler, u11, i12 & 126);
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CurtainPriceComposableKt$CurtainPriceComposable$2(state, actionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Island(CurtainPriceVI.Island island, Function1<? super AtomAction, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(1449019488);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(island) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(island.getBackgroundColor(), u11, 0);
            u11.o(1592304235);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            e.a aVar = e.f40358c0;
            float f7 = 12;
            float f11 = 8;
            e j11 = T.j(androidx.compose.foundation.e.b(T.j(a0.e(aVar, 1.0f), f7, f7, f7, 0.0f, 8), layerFloor1, h.b(island.getCornerRadius().m1866getDpD9Ej5fM())), 0.0f, f11, 0.0f, f11, 5);
            u11.o(1592317878);
            boolean F11 = ((i12 & 112) == 32) | u11.F(island);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new CurtainPriceComposableKt$Island$1$1(island, function1);
                u11.x(C11);
            }
            u11.k();
            e b11 = i.b(j11, null, null, false, null, null, (Function0) C11, 28);
            V f12 = C5185h.f(InterfaceC6250b.a.o(), false);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f13 = c.f(u11, b11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f14 = E.f(u11, f12, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f14);
            }
            RowComponentsKt.AdaptiveScrollRow(GZ.e.c(u11, f13, aVar, 1.0f), C5179b.d(), a1.c.c(-2075452688, new CurtainPriceComposableKt$Island$2$1(island, function1), u11), a1.c.c(-925620401, new CurtainPriceComposableKt$Island$2$2(island, function1), u11), u11, 3510, 0);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CurtainPriceComposableKt$Island$3(island, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RegularPrice(e eVar, CurtainPriceDTO.PriceWrapperDTO priceWrapperDTO, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        Function0<Unit> function02;
        Function0<Unit> function03;
        int I11;
        boolean z11;
        Object C11;
        CurtainPriceDTO.PriceDescription description;
        e eVar3;
        Function0<Unit> function04;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1701770450);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? u11.n(priceWrapperDTO) : u11.F(priceWrapperDTO) ? 32 : 16;
        }
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            function02 = function0;
            i13 |= u11.F(function02) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? null : eVar2;
                function03 = i15 == 0 ? null : function02;
                e.a aVar = e.f40358c0;
                C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, aVar);
                Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a12);
                }
                Function2 g10 = b.g(u11, a11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                e eVar5 = eVar4 != null ? aVar : eVar4;
                u11.o(-638972264);
                int i16 = i13 & 896;
                z11 = i16 != 256;
                C11 = u11.C();
                if (!z11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new CurtainPriceComposableKt$RegularPrice$1$1$1(function03);
                    u11.x(C11);
                }
                u11.k();
                float f11 = 12;
                DsPriceAtomKt.DsPriceAtom(T.j(M.c(i.b(eVar5, null, null, false, null, null, (Function0) C11, 28), EnumC9909s.Max), f11, 0.0f, f11, 0.0f, 10), priceWrapperDTO.getPrice(), u11, PriceDTO.$stable << 3, 0);
                description = priceWrapperDTO.getDescription();
                u11.o(-638962375);
                if (description != null) {
                    d.b i17 = InterfaceC6250b.a.i();
                    C5179b.i n11 = C5179b.n(-2);
                    e j11 = T.j(aVar, f11, 0.0f, 0.0f, 0.0f, 14);
                    u11.o(1119408159);
                    boolean z12 = i16 == 256;
                    Object C12 = u11.C();
                    if (z12 || C12 == InterfaceC3967k.a.a()) {
                        C12 = new CurtainPriceComposableKt$RegularPrice$1$2$1$1(function03);
                        u11.x(C12);
                    }
                    u11.k();
                    e b11 = i.b(j11, null, null, false, null, null, (Function0) C12, 28);
                    Y b12 = X.b(n11, i17, u11, 54);
                    int I12 = u11.I();
                    A0 d12 = u11.d();
                    e f12 = c.f(u11, b11);
                    Function0 a13 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a13);
                    } else {
                        u11.e();
                    }
                    Function2 h11 = Cm.e.h(u11, b12, u11, d12);
                    if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, h11);
                    }
                    F1.b(u11, f12, InterfaceC2801g.a.f());
                    DsTextAtomKt.DsTextAtom(description.getText(), null, u11, 0, 2);
                    CommonAtomIconDTO icon = description.getIcon();
                    u11.o(765925623);
                    if (icon != null) {
                        C7807Z c7807z = TokenParserKt.tokenToColor(icon.getTintColor(), u11, 0);
                        u11.o(765926780);
                        long graphicPremium = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPremium() : c7807z.w();
                        u11.k();
                        AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getIcon(), u11, 0);
                        u11.o(765930534);
                        if (abstractC8972b != null) {
                            C8366G.a(abstractC8972b, null, a0.n(aVar, 16), null, null, 0.0f, C7809a0.a.a(5, graphicPremium), u11, 432, 56);
                            Unit unit = Unit.f71690a;
                        }
                        u11.k();
                        Unit unit2 = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    Unit unit3 = Unit.f71690a;
                }
                u11.k();
                u11.f();
                eVar3 = eVar4;
                function04 = function03;
            } else {
                u11.j();
                eVar3 = eVar2;
                function04 = function02;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new CurtainPriceComposableKt$RegularPrice$2(eVar3, priceWrapperDTO, function04, i11, i12));
                return;
            }
            return;
        }
        function02 = function0;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        e.a aVar2 = e.f40358c0;
        C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f72 = c.f(u11, aVar2);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f72, InterfaceC2801g.a.f());
        if (eVar4 != null) {
        }
        u11.o(-638972264);
        int i162 = i13 & 896;
        if (i162 != 256) {
        }
        C11 = u11.C();
        if (!z11) {
        }
        C11 = new CurtainPriceComposableKt$RegularPrice$1$1$1(function03);
        u11.x(C11);
        u11.k();
        float f112 = 12;
        DsPriceAtomKt.DsPriceAtom(T.j(M.c(i.b(eVar5, null, null, false, null, null, (Function0) C11, 28), EnumC9909s.Max), f112, 0.0f, f112, 0.0f, 10), priceWrapperDTO.getPrice(), u11, PriceDTO.$stable << 3, 0);
        description = priceWrapperDTO.getDescription();
        u11.o(-638962375);
        if (description != null) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        function04 = function03;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
