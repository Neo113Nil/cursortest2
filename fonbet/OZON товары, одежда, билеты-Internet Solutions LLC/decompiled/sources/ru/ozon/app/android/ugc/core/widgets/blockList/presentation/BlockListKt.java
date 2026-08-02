package ru.ozon.app.android.ugc.core.widgets.blockList.presentation;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import WZ.l;
import WZ.t;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.AbstractC5434v;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e3.i;
import i1.C6988h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.blockList.presentation.BlockListVO;
import ru.ozon.uni.android.ds.compose.component.icon.DsIconAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.E;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aG\u0010\t\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a3\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001aC\u0010\u001c\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0003¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;", "state", "Lkotlin/Function2;", "LWZ/t;", "", "onView", "Lkotlin/Function1;", "LTg/b;", "actionHandler", "BlockList", "(Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "BlockListContent", "(Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO;Lkotlin/jvm/functions/Function1;LS0/k;I)V", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;", "topContainer", "LZ1/h;", "outerHorizontalPadding", "TopContainerContent-rAjV9yQ", "(Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$TopContainer;FLkotlin/jvm/functions/Function1;LS0/k;I)V", "TopContainerContent", "", "Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$BlockVO;", "blocks", "Landroidx/compose/ui/e;", "modifier", "verticalSpacing", "MultiBlockColumn-942rkJo", "(Ljava/util/List;Landroidx/compose/ui/e;FLkotlin/jvm/functions/Function1;LS0/k;II)V", "MultiBlockColumn", "block", "", "pinTextToBottom", "BlockItem", "(Lru/ozon/app/android/ugc/core/widgets/blockList/presentation/BlockListVO$BlockVO;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function1;LS0/k;II)V", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlockListKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x027b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlockItem(BlockListVO.BlockVO blockVO, e eVar, boolean z11, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        BlockListVO.BlockVO blockVO2;
        int i13;
        e eVar2;
        int i14;
        boolean z12;
        BlockListVO.CommonVO common;
        t tokenizedEvent;
        boolean z13;
        e b11;
        int I11;
        e e11;
        int I12;
        IconDTO icon;
        ImageDTO image;
        e eVar3;
        BlockListVO.LayoutPaddingsVO paddings;
        Paddings rightPadding;
        BlockListVO.LayoutPaddingsVO paddings2;
        Paddings leftPadding;
        BlockListVO.LayoutPaddingsVO paddings3;
        Paddings bottomPadding;
        BlockListVO.LayoutPaddingsVO paddings4;
        Paddings topPadding;
        CornerRadius cornerRadius;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-38961448);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            blockVO2 = blockVO;
        } else if ((i11 & 6) == 0) {
            blockVO2 = blockVO;
            i13 = (u11.F(blockVO2) ? 4 : 2) | i11;
        } else {
            blockVO2 = blockVO;
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                z12 = z11;
                i13 |= u11.p(z12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i13 |= u11.F(function1) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                }
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar4 = i15 != 0 ? e.f40358c0 : eVar2;
                    if (i14 != 0) {
                        z12 = false;
                    }
                    l lVar = (l) u11.m(f.e());
                    common = blockVO2.getCommon();
                    C7807Z c7807z = TokenParserKt.tokenToColor(common != null ? common.getBackgroundColor() : null, u11, 0);
                    u11.o(1707568526);
                    long layerFloor1OnDark = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1OnDark() : c7807z.w();
                    u11.k();
                    float m1469getDEFAULT_CORNER_RADIUSD9Ej5fM = (common != null || (cornerRadius = common.getCornerRadius()) == null) ? BlockListDefaults.INSTANCE.m1469getDEFAULT_CORNER_RADIUSD9Ej5fM() : cornerRadius.m1866getDpD9Ej5fM();
                    tokenizedEvent = common != null ? common.getTokenizedEvent() : null;
                    u11.o(1707575103);
                    if (tokenizedEvent != null) {
                        AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                        u11.o(888537146);
                        boolean F11 = u11.F(lVar) | u11.F(tokenizedEvent);
                        Object C11 = u11.C();
                        if (F11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new BlockListKt$BlockItem$1$1$1(lVar, tokenizedEvent);
                            u11.x(C11);
                        }
                        u11.k();
                        i.a(aVar, null, (Function0) C11, u11, 6);
                        Unit unit = Unit.f71690a;
                    }
                    u11.k();
                    float m1470getDEFAULT_INNER_PADDINGD9Ej5fM = (common != null || (paddings4 = common.getPaddings()) == null || (topPadding = paddings4.getTopPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : topPadding.m1867getDpD9Ej5fM();
                    float m1470getDEFAULT_INNER_PADDINGD9Ej5fM2 = (common != null || (paddings3 = common.getPaddings()) == null || (bottomPadding = paddings3.getBottomPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : bottomPadding.m1867getDpD9Ej5fM();
                    float m1470getDEFAULT_INNER_PADDINGD9Ej5fM3 = (common != null || (paddings2 = common.getPaddings()) == null || (leftPadding = paddings2.getLeftPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : leftPadding.m1867getDpD9Ej5fM();
                    float m1470getDEFAULT_INNER_PADDINGD9Ej5fM4 = (common != null || (paddings = common.getPaddings()) == null || (rightPadding = paddings.getRightPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : rightPadding.m1867getDpD9Ej5fM();
                    z13 = blockVO.getImage() != null;
                    u11.o(1707597955);
                    b11 = androidx.compose.foundation.e.b(C6988h.a(eVar4, h.b(m1469getDEFAULT_CORNER_RADIUSD9Ej5fM)), layerFloor1OnDark, y0.a());
                    if ((common != null ? common.getAction() : null) != null) {
                        u11.o(888561292);
                        boolean F12 = u11.F(common) | ((i13 & 7168) == 2048);
                        Object C12 = u11.C();
                        if (F12 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new BlockListKt$BlockItem$2$1$1(common, function1);
                            u11.x(C12);
                        }
                        u11.k();
                        b11 = androidx.compose.foundation.i.b(b11, null, null, false, null, null, (Function0) C12, 28);
                    }
                    u11.k();
                    C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f7 = c.f(u11, b11);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = K00.b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    F1.b(u11, f7, InterfaceC2801g.a.f());
                    e.a aVar2 = e.f40358c0;
                    e11 = a0.e(aVar2, 1.0f);
                    if (z13) {
                        if (1.0f <= 0.0d) {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                        e11 = e11.l0(new LayoutWeightElement(1.0f, true));
                    }
                    if (!z13 && z12) {
                        e11 = a0.c(e11);
                    }
                    e i16 = T.i(e11, m1470getDEFAULT_INNER_PADDINGD9Ej5fM3, m1470getDEFAULT_INNER_PADDINGD9Ej5fM, m1470getDEFAULT_INNER_PADDINGD9Ej5fM4, m1470getDEFAULT_INNER_PADDINGD9Ej5fM2);
                    C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                    I12 = u11.I();
                    A0 d12 = u11.d();
                    e f11 = c.f(u11, i16);
                    Function0 a14 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                        u11.H(a14);
                    } else {
                        u11.e();
                    }
                    Function2 g11 = K00.b.g(u11, a13, u11, d12);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                        a.d(I12, u11, I12, g11);
                    }
                    F1.b(u11, f11, InterfaceC2801g.a.f());
                    icon = blockVO.getIcon();
                    u11.o(-670838981);
                    if (icon != null) {
                        DsIconAtomKt.DsIconAtom(icon, null, u11, IconDTO.$stable, 2);
                        Unit unit2 = Unit.f71690a;
                    }
                    u11.k();
                    u11.o(-670836415);
                    if (!z13 && z12) {
                        if (1.0f > 0.0d) {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                        E.a(u11, new LayoutWeightElement(1.0f, true));
                    }
                    u11.k();
                    DsTextAtomKt.DsTextAtom(blockVO.getText(), a0.e(aVar2, 1.0f), u11, 48, 0);
                    u11.f();
                    image = blockVO.getImage();
                    u11.o(888590058);
                    if (image != null) {
                        DsImageAtomKt.DsImageAtom(image, a0.e(aVar2, 1.0f), u11, 48, 0);
                        Unit unit3 = Unit.f71690a;
                    }
                    u11.k();
                    u11.f();
                    eVar3 = eVar4;
                } else {
                    u11.j();
                    eVar3 = eVar2;
                }
                boolean z14 = z12;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new BlockListKt$BlockItem$4(blockVO, eVar3, z14, function1, i11, i12));
                    return;
                }
                return;
            }
            z12 = z11;
            if ((i12 & 8) != 0) {
            }
            if ((i13 & 1171) == 1170) {
            }
            if (i15 != 0) {
            }
            if (i14 != 0) {
            }
            l lVar2 = (l) u11.m(f.e());
            common = blockVO2.getCommon();
            C7807Z c7807z2 = TokenParserKt.tokenToColor(common != null ? common.getBackgroundColor() : null, u11, 0);
            u11.o(1707568526);
            long layerFloor1OnDark2 = c7807z2 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1OnDark() : c7807z2.w();
            u11.k();
            if (common != null) {
            }
            if (common != null) {
            }
            u11.o(1707575103);
            if (tokenizedEvent != null) {
            }
            u11.k();
            if (common != null) {
            }
            float m1470getDEFAULT_INNER_PADDINGD9Ej5fM22 = (common != null || (paddings3 = common.getPaddings()) == null || (bottomPadding = paddings3.getBottomPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : bottomPadding.m1867getDpD9Ej5fM();
            float m1470getDEFAULT_INNER_PADDINGD9Ej5fM32 = (common != null || (paddings2 = common.getPaddings()) == null || (leftPadding = paddings2.getLeftPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : leftPadding.m1867getDpD9Ej5fM();
            float m1470getDEFAULT_INNER_PADDINGD9Ej5fM42 = (common != null || (paddings = common.getPaddings()) == null || (rightPadding = paddings.getRightPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : rightPadding.m1867getDpD9Ej5fM();
            if (blockVO.getImage() != null) {
            }
            u11.o(1707597955);
            b11 = androidx.compose.foundation.e.b(C6988h.a(eVar4, h.b(m1469getDEFAULT_CORNER_RADIUSD9Ej5fM)), layerFloor1OnDark2, y0.a());
            if ((common != null ? common.getAction() : null) != null) {
            }
            u11.k();
            C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f72 = c.f(u11, b11);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = K00.b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            F1.b(u11, f72, InterfaceC2801g.a.f());
            e.a aVar22 = e.f40358c0;
            e11 = a0.e(aVar22, 1.0f);
            if (z13) {
            }
            if (!z13) {
                e11 = a0.c(e11);
            }
            e i162 = T.i(e11, m1470getDEFAULT_INNER_PADDINGD9Ej5fM32, m1470getDEFAULT_INNER_PADDINGD9Ej5fM, m1470getDEFAULT_INNER_PADDINGD9Ej5fM42, m1470getDEFAULT_INNER_PADDINGD9Ej5fM22);
            C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I12 = u11.I();
            A0 d122 = u11.d();
            e f112 = c.f(u11, i162);
            Function0 a142 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g112 = K00.b.g(u11, a132, u11, d122);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, g112);
            F1.b(u11, f112, InterfaceC2801g.a.f());
            icon = blockVO.getIcon();
            u11.o(-670838981);
            if (icon != null) {
            }
            u11.k();
            u11.o(-670836415);
            if (!z13) {
                if (1.0f > 0.0d) {
                }
            }
            u11.k();
            DsTextAtomKt.DsTextAtom(blockVO.getText(), a0.e(aVar22, 1.0f), u11, 48, 0);
            u11.f();
            image = blockVO.getImage();
            u11.o(888590058);
            if (image != null) {
            }
            u11.k();
            u11.f();
            eVar3 = eVar4;
            boolean z142 = z12;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        z12 = z11;
        if ((i12 & 8) != 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i15 != 0) {
        }
        if (i14 != 0) {
        }
        l lVar22 = (l) u11.m(f.e());
        common = blockVO2.getCommon();
        C7807Z c7807z22 = TokenParserKt.tokenToColor(common != null ? common.getBackgroundColor() : null, u11, 0);
        u11.o(1707568526);
        long layerFloor1OnDark22 = c7807z22 == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getLayerFloor1OnDark() : c7807z22.w();
        u11.k();
        if (common != null) {
        }
        if (common != null) {
        }
        u11.o(1707575103);
        if (tokenizedEvent != null) {
        }
        u11.k();
        if (common != null) {
        }
        float m1470getDEFAULT_INNER_PADDINGD9Ej5fM222 = (common != null || (paddings3 = common.getPaddings()) == null || (bottomPadding = paddings3.getBottomPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : bottomPadding.m1867getDpD9Ej5fM();
        float m1470getDEFAULT_INNER_PADDINGD9Ej5fM322 = (common != null || (paddings2 = common.getPaddings()) == null || (leftPadding = paddings2.getLeftPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : leftPadding.m1867getDpD9Ej5fM();
        float m1470getDEFAULT_INNER_PADDINGD9Ej5fM422 = (common != null || (paddings = common.getPaddings()) == null || (rightPadding = paddings.getRightPadding()) == null) ? BlockListDefaults.INSTANCE.m1470getDEFAULT_INNER_PADDINGD9Ej5fM() : rightPadding.m1867getDpD9Ej5fM();
        if (blockVO.getImage() != null) {
        }
        u11.o(1707597955);
        b11 = androidx.compose.foundation.e.b(C6988h.a(eVar4, h.b(m1469getDEFAULT_CORNER_RADIUSD9Ej5fM)), layerFloor1OnDark22, y0.a());
        if ((common != null ? common.getAction() : null) != null) {
        }
        u11.k();
        C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f722 = c.f(u11, b11);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = K00.b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        F1.b(u11, f722, InterfaceC2801g.a.f());
        e.a aVar222 = e.f40358c0;
        e11 = a0.e(aVar222, 1.0f);
        if (z13) {
        }
        if (!z13) {
        }
        e i1622 = T.i(e11, m1470getDEFAULT_INNER_PADDINGD9Ej5fM322, m1470getDEFAULT_INNER_PADDINGD9Ej5fM, m1470getDEFAULT_INNER_PADDINGD9Ej5fM422, m1470getDEFAULT_INNER_PADDINGD9Ej5fM222);
        C5194q a1322 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I12 = u11.I();
        A0 d1222 = u11.d();
        e f1122 = c.f(u11, i1622);
        Function0 a1422 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g1122 = K00.b.g(u11, a1322, u11, d1222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g1122);
        F1.b(u11, f1122, InterfaceC2801g.a.f());
        icon = blockVO.getIcon();
        u11.o(-670838981);
        if (icon != null) {
        }
        u11.k();
        u11.o(-670836415);
        if (!z13) {
        }
        u11.k();
        DsTextAtomKt.DsTextAtom(blockVO.getText(), a0.e(aVar222, 1.0f), u11, 48, 0);
        u11.f();
        image = blockVO.getImage();
        u11.o(888590058);
        if (image != null) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        boolean z1422 = z12;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    public static final void BlockList(@NotNull BlockListVO state, Function2<? super BlockListVO, ? super t, Unit> function2, @NotNull Function1<? super b, Unit> actionHandler, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        C3969l u11 = interfaceC3967k.u(-219193312);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(function2) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(actionHandler) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            if (i14 != 0) {
                u11.o(1783571057);
                Object C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = BlockListKt$BlockList$1$1.INSTANCE;
                    u11.x(C11);
                }
                function2 = (Function2) C11;
                u11.k();
            }
            t tokenizedEvent = state.getTokenizedEvent();
            u11.o(1783574647);
            if (tokenizedEvent != null) {
                AbstractC5434v.a aVar = AbstractC5434v.a.ON_RESUME;
                u11.o(1783577307);
                boolean F11 = ((i13 & 112) == 32) | u11.F(state) | u11.F(tokenizedEvent);
                Object C12 = u11.C();
                if (F11 || C12 == InterfaceC3967k.a.a()) {
                    C12 = new BlockListKt$BlockList$2$1(function2, state, tokenizedEvent);
                    u11.x(C12);
                }
                u11.k();
                i.a(aVar, null, (Function0) C12, u11, 6);
            }
            u11.k();
            BlockListContent(state, actionHandler, u11, ((i13 >> 3) & 112) | (i13 & 14));
        }
        Function2<? super BlockListVO, ? super t, Unit> function22 = function2;
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BlockListKt$BlockList$3(state, function22, actionHandler, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BlockListContent(BlockListVO blockListVO, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e b11;
        C3969l u11 = interfaceC3967k.u(774675471);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(blockListVO) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.F(function1) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(blockListVO.getBackgroundColor(), u11, 0);
            u11.o(1264918785);
            long clearLightKey0 = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getClearLightKey0() : c7807z.w();
            u11.k();
            Paddings horizontalPadding = blockListVO.getHorizontalPadding();
            float m1867getDpD9Ej5fM = horizontalPadding != null ? horizontalPadding.m1867getDpD9Ej5fM() : BlockListDefaults.INSTANCE.m1471getDEFAULT_OUTER_HORIZONTAL_PADDINGD9Ej5fM();
            b11 = androidx.compose.foundation.e.b(a0.e(e.f40358c0, 1.0f), clearLightKey0, y0.a());
            e h11 = T.h(b11, m1867getDpD9Ej5fM, 0.0f, 2);
            C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, h11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 g10 = K00.b.g(u11, a11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, g10);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            m1474TopContainerContentrAjV9yQ(blockListVO.getTopContainer(), m1867getDpD9Ej5fM, function1, u11, (i12 << 3) & 896);
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new BlockListKt$BlockListContent$2(blockListVO, function1, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0046  */
    /* renamed from: MultiBlockColumn-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1473MultiBlockColumn942rkJo(List<BlockListVO.BlockVO> list, e eVar, float f7, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        float f11;
        Function1<? super b, Unit> function12;
        int I11;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1465862652);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(list) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i12 & 4) == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                f11 = f7;
                i13 |= u11.q(f11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i12 & 8) != 0) {
                    i13 |= 3072;
                    function12 = function1;
                } else {
                    function12 = function1;
                    if ((i11 & 3072) == 0) {
                        i13 |= u11.F(function12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    }
                }
                if ((i13 & 1171) == 1170 || !u11.b()) {
                    e eVar3 = i14 != 0 ? e.f40358c0 : eVar2;
                    C5194q a11 = C5193p.a(C5179b.n(f11), InterfaceC6250b.a.k(), u11, 0);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f12 = c.f(u11, eVar3);
                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a12);
                    } else {
                        u11.e();
                    }
                    Function2 g10 = K00.b.g(u11, a11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, g10);
                    }
                    U7.i.b(u11, f12, -47211698);
                    for (BlockListVO.BlockVO blockVO : list) {
                        e e11 = a0.e(e.f40358c0, 1.0f);
                        if (1.0f <= 0.0d) {
                            throw new IllegalArgumentException("invalid weight 1.0; must be greater than zero");
                        }
                        BlockItem(blockVO, e11.l0(new LayoutWeightElement(1.0f, true)), true, function12, u11, (i13 & 7168) | 384, 0);
                        function12 = function1;
                    }
                    u11.k();
                    u11.f();
                    eVar2 = eVar3;
                } else {
                    u11.j();
                }
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new BlockListKt$MultiBlockColumn$2(list, eVar2, f11, function1, i11, i12));
                    return;
                }
                return;
            }
            f11 = f7;
            if ((i12 & 8) != 0) {
            }
            if ((i13 & 1171) == 1170) {
            }
            if (i14 != 0) {
            }
            C5194q a112 = C5193p.a(C5179b.n(f11), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f122 = c.f(u11, eVar3);
            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g102 = K00.b.g(u11, a112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g102);
            U7.i.b(u11, f122, -47211698);
            while (r2.hasNext()) {
            }
            u11.k();
            u11.f();
            eVar2 = eVar3;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        f11 = f7;
        if ((i12 & 8) != 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        if (i14 != 0) {
        }
        C5194q a1122 = C5193p.a(C5179b.n(f11), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1222 = c.f(u11, eVar3);
        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g1022 = K00.b.g(u11, a1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g1022);
        U7.i.b(u11, f1222, -47211698);
        while (r2.hasNext()) {
        }
        u11.k();
        u11.f();
        eVar2 = eVar3;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TopContainerContent-rAjV9yQ, reason: not valid java name */
    public static final void m1474TopContainerContentrAjV9yQ(BlockListVO.TopContainer topContainer, float f7, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        Function1<? super b, Unit> function12 = function1;
        C3969l u11 = interfaceC3967k.u(731377572);
        if ((i11 & 6) == 0) {
            i12 = (u11.F(topContainer) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.q(f7) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.F(function12) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            List K02 = C7714v.K0(topContainer.getBlocks(), 3);
            if (K02.isEmpty()) {
                J0 m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new BlockListKt$TopContainerContent$1(topContainer, f7, function12, i11));
                    return;
                }
                return;
            }
            Paddings horizontalPadding = topContainer.getHorizontalPadding();
            float m1867getDpD9Ej5fM = horizontalPadding != null ? horizontalPadding.m1867getDpD9Ej5fM() : BlockListDefaults.INSTANCE.m1468getDEFAULT_BLOCK_SPACINGD9Ej5fM();
            Paddings verticalPadding = topContainer.getVerticalPadding();
            float m1867getDpD9Ej5fM2 = verticalPadding != null ? verticalPadding.m1867getDpD9Ej5fM() : BlockListDefaults.INSTANCE.m1468getDEFAULT_BLOCK_SPACINGD9Ej5fM();
            u11.o(-619891568);
            if (K02.size() == 1) {
                BlockItem((BlockListVO.BlockVO) C7714v.K(K02), a0.e(e.f40358c0, 1.0f), false, function12, u11, ((i12 << 3) & 7168) | 48, 4);
                u11.k();
                J0 m03 = u11.m0();
                if (m03 != null) {
                    m03.G(new BlockListKt$TopContainerContent$2(topContainer, f7, function12, i11));
                    return;
                }
                return;
            }
            u11.k();
            BlockListVO.BlockVO blockVO = (BlockListVO.BlockVO) C7714v.K(K02);
            List D11 = C7714v.D(K02, 1);
            Z1.h a11 = Z1.h.a((((Configuration) u11.m(AndroidCompositionLocals_androidKt.c())).screenWidthDp - (2 * f7)) * 0.62032086f);
            Z1.h b11 = Z1.h.a(BlockListDefaults.INSTANCE.m1472getMIN_TOP_CONTAINER_HEIGHTD9Ej5fM());
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            if (a11.compareTo(b11) < 0) {
                a11 = b11;
            }
            float d11 = a11.d();
            e.a aVar = e.f40358c0;
            e f11 = a0.f(a0.e(aVar, 1.0f), d11);
            Y b12 = X.b(C5179b.n(m1867getDpD9Ej5fM), InterfaceC6250b.a.l(), u11, 0);
            int I11 = u11.I();
            A0 d12 = u11.d();
            e f12 = c.f(u11, f11);
            Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a12);
            } else {
                u11.e();
            }
            Function2 h11 = Cm.e.h(u11, b12, u11, d12);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, h11);
            }
            F1.b(u11, f12, InterfaceC2801g.a.f());
            C9891D c9891d = C9891D.f99599a;
            if (topContainer.getIsReversed()) {
                u11.o(-1106392886);
                int i13 = (i12 << 3) & 7168;
                m1473MultiBlockColumn942rkJo(D11, a0.c(c9891d.a(aVar, 0.6f, true)), m1867getDpD9Ej5fM2, function1, u11, i13, 0);
                function12 = function1;
                BlockItem(blockVO, a0.c(c9891d.a(aVar, 0.4f, true)), false, function12, u11, i13, 4);
                u11.k();
            } else {
                u11.o(-1106987094);
                int i14 = (i12 << 3) & 7168;
                BlockItem(blockVO, a0.c(c9891d.a(aVar, 0.4f, true)), false, function12, u11, i14, 4);
                function12 = function1;
                m1473MultiBlockColumn942rkJo(D11, a0.c(c9891d.a(aVar, 0.6f, true)), m1867getDpD9Ej5fM2, function12, u11, i14, 0);
                u11.k();
            }
            u11.f();
        }
        J0 m04 = u11.m0();
        if (m04 != null) {
            m04.G(new BlockListKt$TopContainerContent$4(topContainer, f7, function12, i11));
        }
    }
}
