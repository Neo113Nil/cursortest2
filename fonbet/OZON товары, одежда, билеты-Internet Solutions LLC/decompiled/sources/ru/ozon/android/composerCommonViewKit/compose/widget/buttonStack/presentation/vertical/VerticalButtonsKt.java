package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.presentation.vertical;

import A0.g;
import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import Tg.b;
import android.content.Context;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.K0;
import l1.y0;
import n0.C8385f;
import n0.C8391l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackVO;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.components.button.UniButtonAtomKt;
import ru.ozon.uni.components.button.UniButtonResizing;
import ru.ozon.uni.components.iconButton.UniIconButtonAtomKt;
import ru.ozon.uni.components.iconButton.UniIconButtonResizing;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;", "vo", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "VerticalButtons", "(Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VerticalButtonsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStackVO.ButtonsSize.values().length];
            try {
                iArr[ButtonStackVO.ButtonsSize.SIZE_500.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStackVO.ButtonsSize.SIZE_600.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerticalButtons(@NotNull ButtonStackVO vo, @NotNull Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        float m1866getDpD9Ej5fM;
        boolean z11;
        int I11;
        int I12;
        e b11;
        g gVar;
        Function1<? super b, Unit> actionHandler = function1;
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1314686618);
        int i13 = (i11 & 6) == 0 ? (u11.F(vo) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= u11.F(actionHandler) ? 32 : 16;
        }
        int i14 = i13;
        if ((i14 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            String backgroundColor = vo.getBackgroundColor();
            u11.o(-173368497);
            C7807Z c7807z = backgroundColor == null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
            u11.k();
            u11.o(-173369083);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            boolean roundCornersFlag = UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d()));
            int i15 = WhenMappings.$EnumSwitchMapping$0[vo.getButtonsSize().ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    CornerRadius backgroundRadius = vo.getBackgroundRadius();
                    if (backgroundRadius == null) {
                        backgroundRadius = CornerRadius.NO_RADIUS;
                    }
                    m1866getDpD9Ej5fM = backgroundRadius.m1866getDpD9Ej5fM();
                } else {
                    CornerRadius backgroundRadius2 = vo.getBackgroundRadius();
                    if (backgroundRadius2 != null) {
                        m1866getDpD9Ej5fM = backgroundRadius2.m1866getDpD9Ej5fM();
                    } else {
                        i12 = roundCornersFlag ? 36 : 24;
                        m1866getDpD9Ej5fM = i12;
                    }
                }
                CornerRadius cornerRadius = CornerRadius.NO_RADIUS;
                g c11 = h.c(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, cornerRadius.m1866getDpD9Ej5fM(), cornerRadius.m1866getDpD9Ej5fM());
                z11 = !vo.getIsSticky() && (vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_500 || vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_600);
                CornerRadius backgroundRadius3 = vo.getBackgroundRadius();
                g b12 = h.b(backgroundRadius3 != null ? backgroundRadius3.m1866getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM());
                e.a aVar = e.f40358c0;
                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, aVar);
                Function0 a11 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 f12 = E.f(u11, f7, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, f12);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                C5187j c5187j = C5187j.f39515a;
                e b13 = androidx.compose.foundation.e.b(aVar, clearLightKey0, vo.getIsSticky() ? c11 : b12);
                if (vo.getIsSticky()) {
                    b13 = C6988h.a(b13, c11);
                    if (vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_500 || vo.getButtonsSize() == ButtonStackVO.ButtonsSize.SIZE_600) {
                        Paddings leftPadding = vo.getLeftPadding();
                        float m1867getDpD9Ej5fM = leftPadding != null ? leftPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings topPadding = vo.getTopPadding();
                        float m1867getDpD9Ej5fM2 = topPadding != null ? topPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings bottomPadding = vo.getBottomPadding();
                        float m1867getDpD9Ej5fM3 = bottomPadding != null ? bottomPadding.m1867getDpD9Ej5fM() : 8;
                        Paddings rightPadding = vo.getRightPadding();
                        b13 = T.i(b13, m1867getDpD9Ej5fM, m1867getDpD9Ej5fM2, rightPadding != null ? rightPadding.m1867getDpD9Ej5fM() : 8, m1867getDpD9Ej5fM3);
                    }
                }
                if (!vo.getIsSticky()) {
                    e a12 = C6988h.a(b13, b12);
                    Paddings leftPadding2 = vo.getLeftPadding();
                    float m1867getDpD9Ej5fM4 = leftPadding2 != null ? leftPadding2.m1867getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM();
                    Paddings topPadding2 = vo.getTopPadding();
                    float m1867getDpD9Ej5fM5 = topPadding2 != null ? topPadding2.m1867getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM();
                    Paddings rightPadding2 = vo.getRightPadding();
                    float m1867getDpD9Ej5fM6 = rightPadding2 != null ? rightPadding2.m1867getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM();
                    Paddings bottomPadding2 = vo.getBottomPadding();
                    b13 = T.i(a12, m1867getDpD9Ej5fM4, m1867getDpD9Ej5fM5, m1867getDpD9Ej5fM6, bottomPadding2 != null ? bottomPadding2.m1867getDpD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM());
                }
                int i16 = C5179b.f39454h;
                C5194q a13 = C5193p.a(C5179b.n(vo.getButtonsSize().getVerticalGap()), InterfaceC6250b.a.k(), u11, 0);
                I12 = u11.I();
                A0 d12 = u11.d();
                e f13 = c.f(u11, b13);
                Function0 a14 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                    u11.H(a14);
                } else {
                    u11.e();
                }
                Function2 g10 = K00.b.g(u11, a13, u11, d12);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                    a.d(I12, u11, I12, g10);
                }
                F1.b(u11, f13, InterfaceC2801g.a.f());
                u11.o(-952688430);
                for (ButtonStackVO.WidgetButtons widgetButtons : vo.getButtons()) {
                    ButtonsDTO button = widgetButtons.getButton();
                    if (button instanceof ButtonV3DTO) {
                        u11.o(1830972300);
                        gVar = c11;
                        UniButtonAtomKt.UniButtonAtom(ButtonV3DTO.copy$default((ButtonV3DTO) widgetButtons.getButton(), null, ButtonV3DTO.Sizes.valueOf(vo.getButtonsSize().name()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131069, null), null, UniButtonResizing.FILL, false, actionHandler, u11, ((i14 << 9) & 57344) | 384, 10);
                        u11.k();
                        actionHandler = function1;
                    } else {
                        gVar = c11;
                        if (button instanceof IconButtonV3DTO) {
                            u11.o(1831325824);
                            actionHandler = function1;
                            UniIconButtonAtomKt.UniIconButtonAtom(IconButtonV3DTO.copy$default((IconButtonV3DTO) widgetButtons.getButton(), IconButtonV3DTO.Sizes.valueOf(vo.getButtonsSize().name()), null, null, null, null, null, null, null, null, null, null, null, null, null, 16382, null), null, UniIconButtonResizing.FILL, false, actionHandler, u11, IconButtonV3DTO.$stable | 384 | ((i14 << 9) & 57344), 10);
                            u11.k();
                        } else {
                            actionHandler = function1;
                            u11.o(-495103294);
                            u11.k();
                        }
                    }
                    c11 = gVar;
                }
                g gVar2 = c11;
                u11.k();
                u11.f();
                u11.o(1682161298);
                if (z11) {
                    float f14 = 1;
                    long graphicDisabled = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicDisabled();
                    e.a aVar2 = e.f40358c0;
                    e b14 = c5187j.b(aVar2);
                    C8391l c8391l = new C8391l(new K0(graphicDisabled), f14);
                    C5185h.a(C8385f.d(b14, c8391l.c(), c8391l.b(), gVar2), u11, 0);
                    b11 = androidx.compose.foundation.e.b(T.h(a0.f(a0.e(aVar2, 1.0f), f14), f14, 0.0f, 2), clearLightKey0, y0.a());
                    C5185h.a(c5187j.a(b11, InterfaceC6250b.a.b()), u11, 0);
                }
                u11.k();
                u11.f();
            } else {
                CornerRadius backgroundRadius4 = vo.getBackgroundRadius();
                if (backgroundRadius4 != null) {
                    m1866getDpD9Ej5fM = backgroundRadius4.m1866getDpD9Ej5fM();
                    CornerRadius cornerRadius2 = CornerRadius.NO_RADIUS;
                    g c112 = h.c(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, cornerRadius2.m1866getDpD9Ej5fM(), cornerRadius2.m1866getDpD9Ej5fM());
                    if (vo.getIsSticky()) {
                    }
                    CornerRadius backgroundRadius32 = vo.getBackgroundRadius();
                    g b122 = h.b(backgroundRadius32 != null ? backgroundRadius32.m1866getDpD9Ej5fM() : cornerRadius2.m1866getDpD9Ej5fM());
                    e.a aVar3 = e.f40358c0;
                    V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f112 = c.f(u11, aVar3);
                    Function0 a112 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f122 = E.f(u11, f72, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f122);
                    F1.b(u11, f112, InterfaceC2801g.a.f());
                    C5187j c5187j2 = C5187j.f39515a;
                    e b132 = androidx.compose.foundation.e.b(aVar3, clearLightKey0, vo.getIsSticky() ? c112 : b122);
                    if (vo.getIsSticky()) {
                    }
                    if (!vo.getIsSticky()) {
                    }
                    int i162 = C5179b.f39454h;
                    C5194q a132 = C5193p.a(C5179b.n(vo.getButtonsSize().getVerticalGap()), InterfaceC6250b.a.k(), u11, 0);
                    I12 = u11.I();
                    A0 d122 = u11.d();
                    e f132 = c.f(u11, b132);
                    Function0 a142 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 g102 = K00.b.g(u11, a132, u11, d122);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, g102);
                    F1.b(u11, f132, InterfaceC2801g.a.f());
                    u11.o(-952688430);
                    while (r12.hasNext()) {
                    }
                    g gVar22 = c112;
                    u11.k();
                    u11.f();
                    u11.o(1682161298);
                    if (z11) {
                    }
                    u11.k();
                    u11.f();
                } else {
                    i12 = roundCornersFlag ? 30 : 20;
                    m1866getDpD9Ej5fM = i12;
                    CornerRadius cornerRadius22 = CornerRadius.NO_RADIUS;
                    g c1122 = h.c(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, cornerRadius22.m1866getDpD9Ej5fM(), cornerRadius22.m1866getDpD9Ej5fM());
                    if (vo.getIsSticky()) {
                    }
                    CornerRadius backgroundRadius322 = vo.getBackgroundRadius();
                    g b1222 = h.b(backgroundRadius322 != null ? backgroundRadius322.m1866getDpD9Ej5fM() : cornerRadius22.m1866getDpD9Ej5fM());
                    e.a aVar32 = e.f40358c0;
                    V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f1122 = c.f(u11, aVar32);
                    Function0 a1122 = Fr.g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f1222 = E.f(u11, f722, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f1222);
                    F1.b(u11, f1122, InterfaceC2801g.a.f());
                    C5187j c5187j22 = C5187j.f39515a;
                    e b1322 = androidx.compose.foundation.e.b(aVar32, clearLightKey0, vo.getIsSticky() ? c1122 : b1222);
                    if (vo.getIsSticky()) {
                    }
                    if (!vo.getIsSticky()) {
                    }
                    int i1622 = C5179b.f39454h;
                    C5194q a1322 = C5193p.a(C5179b.n(vo.getButtonsSize().getVerticalGap()), InterfaceC6250b.a.k(), u11, 0);
                    I12 = u11.I();
                    A0 d1222 = u11.d();
                    e f1322 = c.f(u11, b1322);
                    Function0 a1422 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 g1022 = K00.b.g(u11, a1322, u11, d1222);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, g1022);
                    F1.b(u11, f1322, InterfaceC2801g.a.f());
                    u11.o(-952688430);
                    while (r12.hasNext()) {
                    }
                    g gVar222 = c1122;
                    u11.k();
                    u11.f();
                    u11.o(1682161298);
                    if (z11) {
                    }
                    u11.k();
                    u11.f();
                }
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new VerticalButtonsKt$VerticalButtons$2(vo, actionHandler, i11));
        }
    }
}
