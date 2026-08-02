package ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.compose;

import A0.h;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import I1.o;
import K00.b;
import P1.F;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import WZ.l;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.material.Q;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.Q1;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import n0.InterfaceC8369J;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.BlockV3VO;
import ru.ozon.app.android.storefront.widgets.naviBlocksV3.presentation.NaviBlocksV3VO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015\"\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015\"\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "NaviBlocksV3Composable", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/NaviBlocksV3VO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3VO;", "block", "Landroidx/compose/ui/e;", "modifier", "BlockV3Composable", "(Lru/ozon/app/android/storefront/widgets/naviBlocksV3/presentation/BlockV3VO;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/e;LS0/k;II)V", "", "index", "", "blockId", "(I)Ljava/lang/String;", "LZ1/h;", "BLOCK_HEIGHT", "F", "ICON_HEIGHT", "START_PADDING", "END_PADDING", "BOTTOM_PADDING", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksV3ComposableKt {
    private static final float BOTTOM_PADDING;
    private static final float END_PADDING;
    private static final float BLOCK_HEIGHT = 76;
    private static final float ICON_HEIGHT = 28;
    private static final float START_PADDING = 8;

    static {
        float f7 = 7;
        END_PADDING = f7;
        BOTTOM_PADDING = f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlockV3Composable(BlockV3VO blockV3VO, Function1<? super AtomAction, Unit> function1, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        e b11;
        boolean F11;
        Object C11;
        int I11;
        Object C12;
        Object C13;
        F f7;
        Object C14;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(1326817159);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(blockV3VO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function1) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                String backgroundColor = blockV3VO.getBackgroundColor();
                u11.o(-1803831014);
                C7807Z c7807z = backgroundColor != null ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
                u11.k();
                u11.o(-1803831691);
                long clearLightKey300 = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey300() : c7807z.w();
                u11.k();
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(eVar4, BLOCK_HEIGHT), h.b(blockV3VO.getCornerRadius().m1866getDpD9Ej5fM())), clearLightKey300, y0.a());
                boolean z11 = blockV3VO.getAction() == null;
                InterfaceC8369J f11 = Q.f(6, 0L);
                u11.o(-1803817876);
                F11 = u11.F(blockV3VO) | ((i13 & 112) == 32);
                C11 = u11.C();
                if (!F11 || C11 == InterfaceC3967k.a.a()) {
                    C11 = new NaviBlocksV3ComposableKt$BlockV3Composable$1$1(blockV3VO, function1);
                    u11.x(C11);
                }
                u11.k();
                e b12 = i.b(b11, null, f11, z11, null, null, (Function0) C11, 24);
                C5194q a11 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f12 = c.f(u11, b12);
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
                F1.b(u11, f12, InterfaceC2801g.a.f());
                CommonAtomIconDTO commonAtomIconDTO = new CommonAtomIconDTO(blockV3VO.getIcon().getImage(), blockV3VO.getIcon().getTintColor());
                UniTheme uniTheme = UniTheme.INSTANCE;
                IconDTO iconDTO = new IconDTO(IconDTO.IconSize.SIZE_400, null, null, null, commonAtomIconDTO, null, uniTheme.getColorTokens().getClearLightKey0().getId(), null, null, null, null, null, null, null, null, null, 65454, null);
                e.a aVar = e.f40358c0;
                e n11 = a0.n(aVar, ICON_HEIGHT);
                u11.o(-2069359368);
                C12 = u11.C();
                if (C12 == InterfaceC3967k.a.a()) {
                    C12 = NaviBlocksV3ComposableKt$BlockV3Composable$2$1$1.INSTANCE;
                    u11.x(C12);
                }
                u11.k();
                e c11 = o.c(n11, false, (Function1) C12);
                float f13 = START_PADDING;
                DsIconAtomKt.DsIconAtom(iconDTO, T.j(c11, f13, 0.0f, 0.0f, BOTTOM_PADDING, 6), u11, IconDTO.$stable, 0);
                u11.o(-2069351443);
                C13 = u11.C();
                if (C13 == InterfaceC3967k.a.a()) {
                    C13 = NaviBlocksV3ComposableKt$BlockV3Composable$2$2$1.INSTANCE;
                    u11.x(C13);
                }
                u11.k();
                e c12 = o.c(aVar, false, (Function1) C13);
                e eVar5 = eVar4;
                String title = blockV3VO.getTitle();
                C7807Z c7807z2 = TokenParserKt.tokenToColor(blockV3VO.getTitleColor(), u11, 0);
                u11.o(-2069347479);
                long textPrimary = c7807z2 != null ? uniTheme.getColors(u11, UniTheme.$stable).getTextPrimary() : c7807z2.w();
                u11.k();
                K1.T compactControl400Small = uniTheme.getTypography().getCompactControl400Small();
                f7 = F.f21510h;
                K1.T c13 = K1.T.c(compactControl400Small, 0L, 0L, f7, null, null, Hj0.T.f((float) 0.01d, 8589934592L), null, null, 0L, null, null, 16777083);
                float f14 = END_PADDING;
                DsTextKt.m1815DsTextkme9oNY(title, c12, 0, textPrimary, 0, 0, c13, 0L, false, 0.0f, f13, f14, 0.0f, (InterfaceC3967k) u11, 0, 54, 5044);
                u11.o(-2069334992);
                C14 = u11.C();
                if (C14 == InterfaceC3967k.a.a()) {
                    C14 = NaviBlocksV3ComposableKt$BlockV3Composable$2$3$1.INSTANCE;
                    u11.x(C14);
                }
                u11.k();
                e c14 = o.c(aVar, false, (Function1) C14);
                String subtitle = blockV3VO.getSubtitle();
                C7807Z c7807z3 = TokenParserKt.tokenToColor(blockV3VO.getSubtitleColor(), u11, 0);
                u11.o(-2069330834);
                long textSecondary = c7807z3 != null ? uniTheme.getColors(u11, UniTheme.$stable).getTextSecondary() : c7807z3.w();
                u11.k();
                c3969l = u11;
                DsTextKt.m1815DsTextkme9oNY(subtitle, c14, 0, textSecondary, 0, 0, uniTheme.getTypography().getCompact300XSmall(), 0L, false, 0.0f, f13, f14, 0.0f, (InterfaceC3967k) c3969l, 0, 54, 5044);
                c3969l.f();
                eVar3 = eVar5;
            } else {
                u11.j();
                c3969l = u11;
                eVar3 = eVar2;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new NaviBlocksV3ComposableKt$BlockV3Composable$3(blockV3VO, function1, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        String backgroundColor2 = blockV3VO.getBackgroundColor();
        u11.o(-1803831014);
        if (backgroundColor2 != null) {
        }
        u11.k();
        u11.o(-1803831691);
        if (c7807z != null) {
        }
        u11.k();
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.f(eVar4, BLOCK_HEIGHT), h.b(blockV3VO.getCornerRadius().m1866getDpD9Ej5fM())), clearLightKey300, y0.a());
        if (blockV3VO.getAction() == null) {
        }
        InterfaceC8369J f112 = Q.f(6, 0L);
        u11.o(-1803817876);
        F11 = u11.F(blockV3VO) | ((i13 & 112) == 32);
        C11 = u11.C();
        if (!F11) {
        }
        C11 = new NaviBlocksV3ComposableKt$BlockV3Composable$1$1(blockV3VO, function1);
        u11.x(C11);
        u11.k();
        e b122 = i.b(b11, null, f112, z11, null, null, (Function0) C11, 24);
        C5194q a112 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f122 = c.f(u11, b122);
        Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g102 = b.g(u11, a112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g102);
        F1.b(u11, f122, InterfaceC2801g.a.f());
        CommonAtomIconDTO commonAtomIconDTO2 = new CommonAtomIconDTO(blockV3VO.getIcon().getImage(), blockV3VO.getIcon().getTintColor());
        UniTheme uniTheme2 = UniTheme.INSTANCE;
        IconDTO iconDTO2 = new IconDTO(IconDTO.IconSize.SIZE_400, null, null, null, commonAtomIconDTO2, null, uniTheme2.getColorTokens().getClearLightKey0().getId(), null, null, null, null, null, null, null, null, null, 65454, null);
        e.a aVar2 = e.f40358c0;
        e n112 = a0.n(aVar2, ICON_HEIGHT);
        u11.o(-2069359368);
        C12 = u11.C();
        if (C12 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c112 = o.c(n112, false, (Function1) C12);
        float f132 = START_PADDING;
        DsIconAtomKt.DsIconAtom(iconDTO2, T.j(c112, f132, 0.0f, 0.0f, BOTTOM_PADDING, 6), u11, IconDTO.$stable, 0);
        u11.o(-2069351443);
        C13 = u11.C();
        if (C13 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c122 = o.c(aVar2, false, (Function1) C13);
        e eVar52 = eVar4;
        String title2 = blockV3VO.getTitle();
        C7807Z c7807z22 = TokenParserKt.tokenToColor(blockV3VO.getTitleColor(), u11, 0);
        u11.o(-2069347479);
        if (c7807z22 != null) {
        }
        u11.k();
        K1.T compactControl400Small2 = uniTheme2.getTypography().getCompactControl400Small();
        f7 = F.f21510h;
        K1.T c132 = K1.T.c(compactControl400Small2, 0L, 0L, f7, null, null, Hj0.T.f((float) 0.01d, 8589934592L), null, null, 0L, null, null, 16777083);
        float f142 = END_PADDING;
        DsTextKt.m1815DsTextkme9oNY(title2, c122, 0, textPrimary, 0, 0, c132, 0L, false, 0.0f, f132, f142, 0.0f, (InterfaceC3967k) u11, 0, 54, 5044);
        u11.o(-2069334992);
        C14 = u11.C();
        if (C14 == InterfaceC3967k.a.a()) {
        }
        u11.k();
        e c142 = o.c(aVar2, false, (Function1) C14);
        String subtitle2 = blockV3VO.getSubtitle();
        C7807Z c7807z32 = TokenParserKt.tokenToColor(blockV3VO.getSubtitleColor(), u11, 0);
        u11.o(-2069330834);
        long textSecondary2 = c7807z32 != null ? uniTheme2.getColors(u11, UniTheme.$stable).getTextSecondary() : c7807z32.w();
        u11.k();
        c3969l = u11;
        DsTextKt.m1815DsTextkme9oNY(subtitle2, c142, 0, textSecondary2, 0, 0, uniTheme2.getTypography().getCompact300XSmall(), 0L, false, 0.0f, f132, f142, 0.0f, (InterfaceC3967k) c3969l, 0, 54, 5044);
        c3969l.f();
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    public static final void NaviBlocksV3Composable(@NotNull NaviBlocksV3VO item, @NotNull Function1<? super AtomAction, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11) {
        e b11;
        Function1<? super AtomAction, Unit> function1;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-1012977178);
        int i12 = (i11 & 6) == 0 ? (u11.F(item) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= u11.F(actionHandler) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            function1 = actionHandler;
        } else {
            l lVar = (l) u11.m(f.e());
            AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
            u11.o(-1505392090);
            boolean F11 = u11.F(item) | u11.F(lVar);
            Object C11 = u11.C();
            if (F11 || C11 == InterfaceC3967k.a.a()) {
                C11 = new NaviBlocksV3ComposableKt$NaviBlocksV3Composable$1$1(item, lVar);
                u11.x(C11);
            }
            u11.k();
            e3.i.a(aVar, null, (Function0) C11, u11, 6);
            e e11 = a0.e(e.f40358c0, 1.0f);
            C7807Z c7807z = TokenParserKt.tokenToColor(item.getBackgroundColorToken(), u11, 0);
            u11.o(-1505384728);
            long layerFloor1 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1() : c7807z.w();
            u11.k();
            b11 = androidx.compose.foundation.e.b(e11, layerFloor1, y0.a());
            e i13 = T.i(b11, item.getPaddings().getLeftPadding().m1867getDpD9Ej5fM(), item.getPaddings().getTopPadding().m1867getDpD9Ej5fM(), item.getPaddings().getRightPadding().m1867getDpD9Ej5fM(), item.getPaddings().getBottomPadding().m1867getDpD9Ej5fM());
            u11.o(-1505373636);
            Object C12 = u11.C();
            if (C12 == InterfaceC3967k.a.a()) {
                C12 = NaviBlocksV3ComposableKt$NaviBlocksV3Composable$2$1.INSTANCE;
                u11.x(C12);
            }
            u11.k();
            e c11 = o.c(i13, false, (Function1) C12);
            Y b12 = X.b(C5179b.e(), InterfaceC6250b.a.l(), u11, 6);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, c11);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
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
            u11.o(-1232683419);
            int i14 = 0;
            for (Object obj : item.getBlocks()) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C7714v.O0();
                    throw null;
                }
                BlockV3VO blockV3VO = (BlockV3VO) obj;
                e.a aVar2 = e.f40358c0;
                if (1.0f <= 0.0d) {
                    throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                }
                Function1<? super AtomAction, Unit> function12 = actionHandler;
                BlockV3Composable(blockV3VO, function12, Q1.a(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), blockId(i14)), u11, i12 & 112, 0);
                u11.o(-1232674687);
                if (i14 != C7714v.P(item.getBlocks())) {
                    E.a(u11, a0.r(aVar2, item.getCentralBlockMargin().m1867getDpD9Ej5fM()));
                }
                u11.k();
                actionHandler = function12;
                i14 = i15;
            }
            function1 = actionHandler;
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new NaviBlocksV3ComposableKt$NaviBlocksV3Composable$4(item, function1, i11));
        }
    }

    private static final String blockId(int i11) {
        return i11 != 0 ? i11 != 1 ? "reviewBlock" : "purchaseBlock" : "favBlock";
    }
}
