package ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.presentation;

import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.D1;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import S0.Q;
import S0.n1;
import Z1.h;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b00.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import java.util.Iterator;
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
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.edoProviders.v2.domain.EdoProvidersV2VO;
import ru.ozon.uni.android.ds.compose.component.badge.DsBadgeAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.button.DsIconButtonAtomKt;
import ru.ozon.uni.android.ds.compose.component.cell.DsCellAtomKt;
import ru.ozon.uni.android.ds.compose.component.disclaimer.DsDisclaimerAtomKt;
import ru.ozon.uni.android.ds.compose.component.image.DsImageAtomKt;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.E;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a{\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a]\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001e²\u0006\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;", "state", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAtomAction", "LZ1/h;", "horizontalPadding", "zeroPadding", "headerTopPadding", "verticalPadding", "emptyStateTopPadding", "emptyStateBetweenPadding", "emptyStateBottomPadding", "EdoProvidersV2Composable-LLhsUjk", "(Landroidx/compose/ui/e;Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO;Lkotlin/jvm/functions/Function1;FFFFFFFLS0/k;II)V", "EdoProvidersV2Composable", "Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;", "customCell", "textBetweenPadding", "badgeListBetweenPadding", "CustomCellContent-J8oBhFo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/edoProviders/v2/domain/EdoProvidersV2VO$CustomCell;Lkotlin/jvm/functions/Function1;FFFFLandroidx/compose/ui/e;LS0/k;II)V", "CustomCellContent", "LA00/a;", "composerEvent", "", "areAllProvidersVisible", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EdoProvidersV2ComposableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x03d4, code lost:
    
        if (r4.getHideSeparator() == true) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e8  */
    /* renamed from: CustomCellContent-J8oBhFo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m742CustomCellContentJ8oBhFo(EdoProvidersV2VO.CustomCell customCell, Function1<? super AtomAction, Unit> function1, float f7, float f11, float f12, float f13, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        EdoProvidersV2VO.CustomCell customCell2;
        int i13;
        Function1<? super AtomAction, Unit> function12;
        float f14;
        int i14;
        float f15;
        int i15;
        float f16;
        int i16;
        float f17;
        int i17;
        e eVar2;
        int I11;
        int I12;
        float f18;
        int i18;
        Paddings rightPadding;
        float f19;
        float f21;
        e eVar3;
        float f22;
        float f23;
        e b11;
        Paddings titleSpaceBetween;
        Paddings topPadding;
        Paddings bottomPadding;
        Paddings leftPadding;
        C3969l u11 = interfaceC3967k.u(1363617244);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            customCell2 = customCell;
        } else if ((i11 & 6) == 0) {
            customCell2 = customCell;
            i13 = (u11.F(customCell2) ? 4 : 2) | i11;
        } else {
            customCell2 = customCell;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
            function12 = function1;
        } else {
            function12 = function1;
            if ((i11 & 48) == 0) {
                i13 |= u11.F(function12) ? 32 : 16;
            }
        }
        int i19 = i12 & 4;
        if (i19 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            f14 = f7;
            i13 |= u11.q(f14) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                f15 = f11;
                i13 |= u11.q(f15) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    f16 = f12;
                    i13 |= u11.q(f16) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                        f17 = f13;
                    } else {
                        f17 = f13;
                        if ((i11 & 196608) == 0) {
                            i13 |= u11.q(f17) ? 131072 : 65536;
                        }
                    }
                    i17 = i12 & 64;
                    if (i17 == 0) {
                        i13 |= 1572864;
                        eVar2 = eVar;
                    } else {
                        eVar2 = eVar;
                        if ((i11 & 1572864) == 0) {
                            i13 |= u11.n(eVar2) ? 1048576 : 524288;
                        }
                    }
                    if ((i13 & 599187) == 599186 || !u11.b()) {
                        float f24 = i19 == 0 ? 16 : f14;
                        float f25 = i14 == 0 ? 10 : f15;
                        float f26 = i15 == 0 ? 2 : f16;
                        if (i16 != 0) {
                            f17 = 6;
                        }
                        e eVar4 = i17 == 0 ? e.f40358c0 : eVar2;
                        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f27 = c.f(u11, eVar4);
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
                        F1.b(u11, f27, InterfaceC2801g.a.f());
                        e.a aVar = e.f40358c0;
                        e e11 = a0.e(aVar, 1.0f);
                        EdoProvidersV2VO.Settings settings = customCell2.getSettings();
                        e j11 = T.j(e11, (settings != null || (leftPadding = settings.getLeftPadding()) == null) ? f24 : leftPadding.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
                        Y b12 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                        I12 = u11.I();
                        A0 d12 = u11.d();
                        e f28 = c.f(u11, j11);
                        Function0 a13 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a13);
                        }
                        Function2 h11 = Cm.e.h(u11, b12, u11, d12);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                            a.d(I12, u11, I12, h11);
                        }
                        F1.b(u11, f28, InterfaceC2801g.a.f());
                        if (1.0f > 0.0d) {
                            throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                        }
                        e l02 = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true).l0(new VerticalAlignElement(InterfaceC6250b.a.l()));
                        EdoProvidersV2VO.Settings settings2 = customCell2.getSettings();
                        e j12 = T.j(l02, 0.0f, 0.0f, 0.0f, (settings2 == null || (bottomPadding = settings2.getBottomPadding()) == null) ? f25 : bottomPadding.m1867getDpD9Ej5fM(), 7);
                        C5194q a14 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                        int I13 = u11.I();
                        A0 d13 = u11.d();
                        e f29 = c.f(u11, j12);
                        Function0 a15 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.H(a15);
                        } else {
                            u11.e();
                        }
                        Function2 g11 = b.g(u11, a14, u11, d13);
                        if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                            a.d(I13, u11, I13, g11);
                        }
                        F1.b(u11, f29, InterfaceC2801g.a.f());
                        TextDTO title = customCell2.getTitle();
                        EdoProvidersV2VO.Settings settings3 = customCell2.getSettings();
                        DsTextAtomKt.DsTextAtom(title, T.j(aVar, 0.0f, (settings3 == null || (topPadding = settings3.getTopPadding()) == null) ? f25 : topPadding.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), u11, 0, 0);
                        TextDTO subtitle = customCell2.getSubtitle();
                        u11.o(1595187570);
                        if (subtitle != null) {
                            EdoProvidersV2VO.Settings settings4 = customCell2.getSettings();
                            DsTextAtomKt.DsTextAtom(subtitle, T.j(aVar, 0.0f, (settings4 == null || (titleSpaceBetween = settings4.getTitleSpaceBetween()) == null) ? f26 : titleSpaceBetween.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 13), u11, 0, 0);
                            Unit unit = Unit.f71690a;
                        }
                        u11.k();
                        List<BadgeDTO> badgeList = customCell2.getBadgeList();
                        u11.o(1595198745);
                        if (badgeList == null) {
                            f18 = f17;
                        } else {
                            Iterator<T> it = badgeList.iterator();
                            while (it.hasNext()) {
                                float f31 = f17;
                                DsBadgeAtomKt.DsBadgeAtom((BadgeDTO) it.next(), T.j(e.f40358c0, 0.0f, f31, 0.0f, 0.0f, 13), function12, u11, (i13 << 3) & 896, 0);
                                function12 = function1;
                                f17 = f31;
                            }
                            f18 = f17;
                            Unit unit2 = Unit.f71690a;
                        }
                        u11.k();
                        u11.f();
                        IconButtonV3DTO iconButton = customCell2.getIconButton();
                        u11.o(897095393);
                        if (iconButton == null) {
                            i18 = 0;
                        } else {
                            EdoProvidersV2VO.Settings settings5 = customCell2.getSettings();
                            float m1867getDpD9Ej5fM = ((settings5 == null || (rightPadding = settings5.getRightPadding()) == null) ? f24 : rightPadding.m1867getDpD9Ej5fM()) + 32;
                            IconButtonV3DTO.Sizes size = iconButton.getSize();
                            if (size == null) {
                                size = IconButtonV3DTO.Sizes.SIZE_400;
                            }
                            i18 = 0;
                            DsIconButtonAtomKt.DsIconButtonAtom(iconButton, T.j(e.f40358c0, 0.0f, 0.0f, ((h) kotlin.ranges.h.b(h.a(m1867getDpD9Ej5fM - size.getSize()), h.a(0))).d(), 0.0f, 11), false, function1, u11, IconButtonV3DTO.$stable | ((i13 << 6) & 7168), 4);
                            Unit unit3 = Unit.f71690a;
                        }
                        u11.k();
                        u11.f();
                        u11.o(506736988);
                        EdoProvidersV2VO.Settings settings6 = customCell2.getSettings();
                        int i21 = settings6 != null ? 1 : 1;
                        b11 = androidx.compose.foundation.e.b(T.j(a0.f(a0.e(e.f40358c0, 1.0f), i21), f24, 0.0f, 0.0f, 0.0f, 14), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicNeutral(), y0.a());
                        C5185h.a(b11, u11, i18);
                        u11.k();
                        u11.f();
                        f19 = f25;
                        f21 = f26;
                        eVar3 = eVar4;
                        f22 = f18;
                        f23 = f24;
                    } else {
                        u11.j();
                        f22 = f17;
                        eVar3 = eVar2;
                        f23 = f14;
                        f19 = f15;
                        f21 = f16;
                    }
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new EdoProvidersV2ComposableKt$CustomCellContent$2(customCell, function1, f23, f19, f21, f22, eVar3, i11, i12));
                        return;
                    }
                    return;
                }
                f16 = f12;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                i17 = i12 & 64;
                if (i17 == 0) {
                }
                if ((i13 & 599187) == 599186) {
                }
                if (i19 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 != 0) {
                }
                if (i17 == 0) {
                }
                C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f272 = c.f(u11, eVar4);
                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g102 = b.g(u11, a112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, g102);
                F1.b(u11, f272, InterfaceC2801g.a.f());
                e.a aVar2 = e.f40358c0;
                e e112 = a0.e(aVar2, 1.0f);
                EdoProvidersV2VO.Settings settings7 = customCell2.getSettings();
                e j112 = T.j(e112, (settings7 != null || (leftPadding = settings7.getLeftPadding()) == null) ? f24 : leftPadding.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
                Y b122 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
                I12 = u11.I();
                A0 d122 = u11.d();
                e f282 = c.f(u11, j112);
                Function0 a132 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b122, u11, d122);
                if (!u11.t()) {
                }
                a.d(I12, u11, I12, h112);
                F1.b(u11, f282, InterfaceC2801g.a.f());
                if (1.0f > 0.0d) {
                }
            }
            f15 = f11;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            f16 = f12;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            i17 = i12 & 64;
            if (i17 == 0) {
            }
            if ((i13 & 599187) == 599186) {
            }
            if (i19 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 != 0) {
            }
            if (i17 == 0) {
            }
            C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f2722 = c.f(u11, eVar4);
            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g1022 = b.g(u11, a1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g1022);
            F1.b(u11, f2722, InterfaceC2801g.a.f());
            e.a aVar22 = e.f40358c0;
            e e1122 = a0.e(aVar22, 1.0f);
            EdoProvidersV2VO.Settings settings72 = customCell2.getSettings();
            e j1122 = T.j(e1122, (settings72 != null || (leftPadding = settings72.getLeftPadding()) == null) ? f24 : leftPadding.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
            Y b1222 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
            I12 = u11.I();
            A0 d1222 = u11.d();
            e f2822 = c.f(u11, j1122);
            Function0 a1322 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1222, u11, d1222);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, h1122);
            F1.b(u11, f2822, InterfaceC2801g.a.f());
            if (1.0f > 0.0d) {
            }
        }
        f14 = f7;
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        f15 = f11;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        f16 = f12;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        i17 = i12 & 64;
        if (i17 == 0) {
        }
        if ((i13 & 599187) == 599186) {
        }
        if (i19 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 != 0) {
        }
        if (i17 == 0) {
        }
        C5194q a11222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f27222 = c.f(u11, eVar4);
        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g10222 = b.g(u11, a11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g10222);
        F1.b(u11, f27222, InterfaceC2801g.a.f());
        e.a aVar222 = e.f40358c0;
        e e11222 = a0.e(aVar222, 1.0f);
        EdoProvidersV2VO.Settings settings722 = customCell2.getSettings();
        e j11222 = T.j(e11222, (settings722 != null || (leftPadding = settings722.getLeftPadding()) == null) ? f24 : leftPadding.m1867getDpD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14);
        Y b12222 = X.b(C5179b.d(), InterfaceC6250b.a.i(), u11, 54);
        I12 = u11.I();
        A0 d12222 = u11.d();
        e f28222 = c.f(u11, j11222);
        Function0 a13222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b12222, u11, d12222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h11222);
        F1.b(u11, f28222, InterfaceC2801g.a.f());
        if (1.0f > 0.0d) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06d8  */
    /* renamed from: EdoProvidersV2Composable-LLhsUjk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m743EdoProvidersV2ComposableLLhsUjk(e eVar, @NotNull EdoProvidersV2VO state, @NotNull Function1<? super AtomAction, Unit> onAtomAction, float f7, float f11, float f12, float f13, float f14, float f15, float f16, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        float f17;
        int i14;
        float f18;
        int i15;
        float f19;
        int i16;
        float f21;
        int i17;
        float f22;
        int i18;
        int i19;
        int i21;
        int I11;
        EdoProvidersV2VO.Header header;
        float f23;
        EdoProvidersV2VO.Providers providers;
        Throwable th2;
        float f24;
        float f25;
        float f26;
        int i22;
        float f27;
        Throwable th3;
        float f28;
        EdoProvidersV2VO.Providers providers2;
        boolean z11;
        float f29;
        float f31;
        int i23;
        float f32;
        InterfaceC3978p0 interfaceC3978p0;
        float f33;
        A0.g gVar;
        float f34;
        float f35;
        float f36;
        Throwable th4;
        EdoProvidersV2VO.EmptyState emptyState;
        float f37;
        int i24;
        float f38;
        EdoProvidersV2VO.Footer footer;
        float f39;
        float f41;
        C3969l c3969l;
        float f42;
        float f43;
        float f44;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onAtomAction, "onAtomAction");
        C3969l u11 = interfaceC3967k.u(-746111647);
        int i25 = i12 & 1;
        if (i25 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = i11 | (u11.n(eVar2) ? 4 : 2);
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.F(state) ? 32 : 16;
        }
        int i26 = i13;
        if ((4 & i12) != 0) {
            i26 |= 384;
        } else if ((i11 & 384) == 0) {
            i26 |= u11.F(onAtomAction) ? 256 : 128;
        }
        int i27 = i12 & 8;
        if (i27 != 0) {
            i26 |= 3072;
        } else if ((i11 & 3072) == 0) {
            f17 = f7;
            i26 |= u11.q(f17) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i26 |= 24576;
            } else if ((i11 & 24576) == 0) {
                f18 = f11;
                i26 |= u11.q(f18) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i26 |= 196608;
                    f19 = f12;
                } else {
                    f19 = f12;
                    if ((i11 & 196608) == 0) {
                        i26 |= u11.q(f19) ? 131072 : 65536;
                    }
                }
                i16 = i12 & 64;
                if (i16 != 0) {
                    i26 |= 1572864;
                    f21 = f13;
                } else {
                    f21 = f13;
                    if ((i11 & 1572864) == 0) {
                        i26 |= u11.q(f21) ? 1048576 : 524288;
                    }
                }
                i17 = 128 & i12;
                if (i17 != 0) {
                    i26 |= 12582912;
                    f22 = f14;
                } else {
                    f22 = f14;
                    if ((i11 & 12582912) == 0) {
                        i26 |= u11.q(f22) ? 8388608 : 4194304;
                    }
                }
                i18 = 256 & i12;
                if (i18 != 0) {
                    i26 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i26 |= u11.q(f15) ? 67108864 : 33554432;
                }
                i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i19 != 0) {
                    i26 |= 805306368;
                } else if ((i11 & 805306368) == 0) {
                    i21 = i19;
                    i26 |= u11.q(f16) ? 536870912 : 268435456;
                    if ((i26 & 306783379) == 306783378 || !u11.b()) {
                        e eVar4 = i25 == 0 ? e.f40358c0 : eVar2;
                        if (i27 != 0) {
                            f17 = 16;
                        }
                        if (i14 != 0) {
                            f18 = 0;
                        }
                        float f45 = i15 == 0 ? 20 : f19;
                        float f46 = i16 == 0 ? 8 : f21;
                        float f47 = i17 == 0 ? 8 : f22;
                        float f48 = i18 == 0 ? 2 : f15;
                        float f49 = i21 == 0 ? 8 : f16;
                        e i28 = T.i(androidx.compose.animation.a.a(a0.e(eVar4, 1.0f), null, 3), f17, f45, f17, f46);
                        C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f51 = c.f(u11, i28);
                        e eVar5 = eVar4;
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
                        F1.b(u11, f51, InterfaceC2801g.a.f());
                        header = state.getHeader();
                        u11.o(1684273096);
                        if (header != null) {
                            f23 = f46;
                        } else {
                            e.a aVar = e.f40358c0;
                            e e11 = a0.e(aVar, 1.0f);
                            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                            int I12 = u11.I();
                            A0 d12 = u11.d();
                            e f52 = c.f(u11, e11);
                            Function0 a13 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a13);
                            } else {
                                u11.e();
                            }
                            Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                a.d(I12, u11, I12, h11);
                            }
                            F1.b(u11, f52, InterfaceC2801g.a.f());
                            TextDTO title = header.getTitle();
                            if (1.0f <= 0.0d) {
                                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                            }
                            DsTextAtomKt.DsTextAtom(title, T.j(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 0.0f, 0.0f, 0.0f, f46, 7), u11, 0, 0);
                            IconButtonV3DTO iconButton = header.getIconButton();
                            u11.o(-347117696);
                            if (iconButton == null) {
                                f23 = f46;
                            } else {
                                float f53 = f46;
                                f23 = f53;
                                DsIconButtonAtomKt.DsIconButtonAtom(iconButton, T.j(aVar, 0.0f, 0.0f, 0.0f, f53, 7), false, onAtomAction, u11, IconButtonV3DTO.$stable | ((i26 << 3) & 7168), 4);
                                Unit unit = Unit.f71690a;
                            }
                            u11.k();
                            u11.f();
                            DisclaimerDTO disclaimer = header.getDisclaimer();
                            u11.o(1684297700);
                            if (disclaimer != null) {
                                DsDisclaimerAtomKt.DsDisclaimerAtom(disclaimer, T.h(aVar, 0.0f, f23, 1), onAtomAction, u11, DisclaimerDTO.$stable | (i26 & 896), 0);
                                Unit unit2 = Unit.f71690a;
                            }
                            u11.k();
                        }
                        u11.k();
                        providers = state.getBody().getProviders();
                        u11.o(1684312687);
                        if (providers != null) {
                            f24 = f23;
                            f25 = f48;
                            f26 = f49;
                            i22 = i26;
                            f27 = f45;
                            f28 = f17;
                            th3 = null;
                        } else {
                            InterfaceC3978p0 a14 = n1.a(((InterfaceC7851b) u11.m(f.c())).getEventsFlow(), null, null, u11, 48, 2);
                            u11.o(1208827073);
                            Object C11 = u11.C();
                            if (C11 == InterfaceC3967k.a.a()) {
                                C11 = n1.f(Boolean.FALSE, D1.f25195a);
                                u11.x(C11);
                            }
                            InterfaceC3978p0 interfaceC3978p02 = (InterfaceC3978p0) C11;
                            u11.k();
                            A00.a EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4 = EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4(a14);
                            u11.o(1208831997);
                            boolean n11 = u11.n(a14);
                            Object C12 = u11.C();
                            if (n11 || C12 == InterfaceC3967k.a.a()) {
                                th2 = null;
                                C12 = new EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$1$1(a14, interfaceC3978p02, null);
                                u11.x(C12);
                            } else {
                                th2 = null;
                            }
                            u11.k();
                            Q.e(u11, EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4, (Function2) C12);
                            boolean z12 = (providers.getMaxProviders() == null || providers.getMoreProviders() == null) ? false : true;
                            List<EdoProvidersV2VO.Provider> items = (!z12 || EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$6(interfaceC3978p02)) ? providers.getItems() : C7714v.K0(providers.getItems(), providers.getMaxProviders().intValue());
                            boolean z13 = z12 && !EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$6(interfaceC3978p02);
                            u11.o(1684343584);
                            int i29 = 0;
                            for (Object obj : items) {
                                int i31 = i29 + 1;
                                if (i29 < 0) {
                                    Throwable th5 = th2;
                                    C7714v.O0();
                                    throw th5;
                                }
                                EdoProvidersV2VO.Provider provider = (EdoProvidersV2VO.Provider) obj;
                                boolean z14 = i29 == 0;
                                boolean z15 = i29 == C7714v.P(items) && !z13;
                                CornerRadius cornerRadius = providers.getCornerRadius();
                                float m1866getDpD9Ej5fM = cornerRadius != null ? cornerRadius.m1866getDpD9Ej5fM() : f18;
                                A0.g b12 = (z14 && z15) ? A0.h.b(m1866getDpD9Ej5fM) : z14 ? A0.h.c(m1866getDpD9Ej5fM, m1866getDpD9Ej5fM, f18, f18) : z15 ? A0.h.c(f18, f18, m1866getDpD9Ej5fM, m1866getDpD9Ej5fM) : A0.h.b(f18);
                                float f54 = z14 ? f23 : f18;
                                float f55 = (!z15 || z13) ? f18 : f23;
                                InterfaceC3978p0 interfaceC3978p03 = interfaceC3978p02;
                                EdoProvidersV2VO.CustomCell customCell = provider.getCustomCell();
                                u11.o(1684383647);
                                if (customCell == null) {
                                    providers2 = providers;
                                    z11 = z13;
                                    f35 = f48;
                                    f36 = f49;
                                    i23 = i26;
                                    f31 = f55;
                                    f34 = f45;
                                    f29 = f54;
                                    f32 = f17;
                                    interfaceC3978p0 = interfaceC3978p03;
                                    th4 = null;
                                    f33 = f23;
                                    gVar = b12;
                                } else {
                                    EdoProvidersV2VO.Settings settings = customCell.getSettings();
                                    providers2 = providers;
                                    C7807Z c7807z = TokenParserKt.tokenToColor(settings != null ? settings.getBackgroundColor() : null, u11, 0);
                                    u11.o(-347018706);
                                    z11 = z13;
                                    long bgPrimary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgPrimary() : c7807z.w();
                                    u11.k();
                                    float f56 = f55;
                                    float f57 = f54;
                                    f29 = f57;
                                    f31 = f56;
                                    i23 = i26;
                                    f32 = f17;
                                    interfaceC3978p0 = interfaceC3978p03;
                                    f33 = f23;
                                    gVar = b12;
                                    f34 = f45;
                                    f35 = f48;
                                    f36 = f49;
                                    th4 = null;
                                    m742CustomCellContentJ8oBhFo(customCell, onAtomAction, 0.0f, 0.0f, 0.0f, 0.0f, androidx.compose.foundation.e.b(C6988h.a(T.j(e.f40358c0, 0.0f, f57, 0.0f, f56, 5), b12), bgPrimary, b12), u11, (i26 >> 3) & 112, 60);
                                    Unit unit3 = Unit.f71690a;
                                }
                                u11.k();
                                CellDTO cell = provider.getCell();
                                u11.o(1684408918);
                                if (cell != null) {
                                    DsCellAtomKt.DsCellAtom(cell, C6988h.a(T.j(e.f40358c0, 0.0f, f29, 0.0f, f31, 5), gVar), onAtomAction, u11, CellDTO.$stable | (i23 & 896), 0);
                                    Unit unit4 = Unit.f71690a;
                                }
                                u11.k();
                                f45 = f34;
                                i26 = i23;
                                f48 = f35;
                                interfaceC3978p02 = interfaceC3978p0;
                                i29 = i31;
                                f23 = f33;
                                providers = providers2;
                                z13 = z11;
                                f17 = f32;
                                th2 = th4;
                                f49 = f36;
                            }
                            EdoProvidersV2VO.Providers providers3 = providers;
                            boolean z16 = z13;
                            f24 = f23;
                            f25 = f48;
                            f26 = f49;
                            i22 = i26;
                            f27 = f45;
                            th3 = th2;
                            f28 = f17;
                            InterfaceC3978p0 interfaceC3978p04 = interfaceC3978p02;
                            u11.k();
                            CellDTO moreProviders = providers3.getMoreProviders();
                            u11.o(1684425145);
                            if (moreProviders != null) {
                                u11.o(1208938719);
                                if (z16) {
                                    CornerRadius cornerRadius2 = providers3.getCornerRadius();
                                    float m1866getDpD9Ej5fM2 = cornerRadius2 != null ? cornerRadius2.m1866getDpD9Ej5fM() : f18;
                                    e a15 = C6988h.a(T.j(e.f40358c0, 0.0f, 0.0f, 0.0f, f24, 7), A0.h.c(f18, f18, m1866getDpD9Ej5fM2, m1866getDpD9Ej5fM2));
                                    u11.o(-346951745);
                                    Object C13 = u11.C();
                                    if (C13 == InterfaceC3967k.a.a()) {
                                        C13 = new EdoProvidersV2ComposableKt$EdoProvidersV2Composable$1$2$3$1$1(interfaceC3978p04);
                                        u11.x(C13);
                                    }
                                    u11.k();
                                    DsCellAtomKt.DsCellAtom(moreProviders, i.c(a15, false, null, null, (Function0) C13, 7), onAtomAction, u11, CellDTO.$stable | (i22 & 896), 0);
                                }
                                u11.k();
                                Unit unit5 = Unit.f71690a;
                            }
                            u11.k();
                        }
                        u11.k();
                        emptyState = state.getBody().getEmptyState();
                        u11.o(1684457597);
                        if (emptyState != null) {
                            f37 = f24;
                            f17 = f28;
                            f38 = f26;
                            i24 = 0;
                        } else {
                            e.a aVar2 = e.f40358c0;
                            e e12 = a0.e(aVar2, 1.0f);
                            C5194q a16 = C5193p.a(C5179b.b(), InterfaceC6250b.a.g(), u11, 54);
                            int I13 = u11.I();
                            A0 d13 = u11.d();
                            e f58 = c.f(u11, e12);
                            Function0 a17 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a17);
                            } else {
                                u11.e();
                            }
                            Function2 g11 = b.g(u11, a16, u11, d13);
                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                                a.d(I13, u11, I13, g11);
                            }
                            F1.b(u11, f58, InterfaceC2801g.a.f());
                            float f59 = f24;
                            float f61 = f28;
                            f17 = f61;
                            f37 = f59;
                            i24 = 0;
                            DsImageAtomKt.DsImageAtom(emptyState.getImageAtom(), T.j(aVar2, f61, f59, f28, 0.0f, 8), u11, 0, 0);
                            TextDTO title2 = emptyState.getTitle();
                            u11.o(-346927828);
                            if (title2 != null) {
                                DsTextAtomKt.DsTextAtom(title2, T.i(aVar2, f17, f47, f17, f25), u11, 0, 0);
                                Unit unit6 = Unit.f71690a;
                            }
                            u11.k();
                            TextDTO message = emptyState.getMessage();
                            u11.o(-346912845);
                            if (message == null) {
                                f38 = f26;
                            } else {
                                f38 = f26;
                                DsTextAtomKt.DsTextAtom(message, T.i(aVar2, f17, f25, f17, f38), u11, 0, 0);
                                Unit unit7 = Unit.f71690a;
                            }
                            u11.k();
                            u11.f();
                            Unit unit8 = Unit.f71690a;
                        }
                        u11.k();
                        footer = state.getFooter();
                        u11.o(1684507105);
                        if (footer != null) {
                            if (footer.getButtons().size() == 1) {
                                u11.o(-1175074688);
                                DsButtonAtomKt.DsButtonAtom((ButtonV3DTO) C7714v.K(footer.getButtons()), T.h(a0.e(e.f40358c0, 1.0f), 0.0f, f37, 1), false, onAtomAction, u11, (i22 << 3) & 7168, 4);
                                u11.k();
                            } else {
                                u11.o(-1174703153);
                                e h12 = T.h(a0.e(e.f40358c0, 1.0f), 0.0f, f37, 1);
                                Y b13 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                                int I14 = u11.I();
                                A0 d14 = u11.d();
                                e f62 = c.f(u11, h12);
                                Function0 a18 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.H(a18);
                                } else {
                                    u11.e();
                                }
                                Function2 h13 = Cm.e.h(u11, b13, u11, d14);
                                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                                    a.d(I14, u11, I14, h13);
                                }
                                F1.b(u11, f62, InterfaceC2801g.a.f());
                                u11.o(-346870981);
                                for (Object obj2 : footer.getButtons()) {
                                    int i32 = i24 + 1;
                                    if (i24 < 0) {
                                        C7714v.O0();
                                        throw th3;
                                    }
                                    ButtonV3DTO buttonV3DTO = (ButtonV3DTO) obj2;
                                    u11.o(-346869364);
                                    if (i24 > 0) {
                                        E.a(u11, a0.r(e.f40358c0, 8));
                                    }
                                    u11.k();
                                    DsButtonAtomKt.DsButtonAtom(buttonV3DTO, null, false, onAtomAction, u11, (i22 << 3) & 7168, 6);
                                    i24 = i32;
                                }
                                u11.k();
                                u11.f();
                                u11.k();
                            }
                            Unit unit9 = Unit.f71690a;
                        }
                        u11.k();
                        u11.f();
                        f39 = f27;
                        f41 = f25;
                        c3969l = u11;
                        f42 = f37;
                        f43 = f38;
                        f44 = f47;
                        eVar3 = eVar5;
                    } else {
                        u11.j();
                        f41 = f15;
                        f44 = f22;
                        c3969l = u11;
                        f39 = f19;
                        eVar3 = eVar2;
                        f42 = f21;
                        f43 = f16;
                    }
                    float f63 = f18;
                    float f64 = f17;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new EdoProvidersV2ComposableKt$EdoProvidersV2Composable$2(eVar3, state, onAtomAction, f64, f63, f39, f42, f44, f41, f43, i11, i12));
                        return;
                    }
                    return;
                }
                i21 = i19;
                if ((i26 & 306783379) == 306783378) {
                }
                if (i25 == 0) {
                }
                if (i27 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if (i21 == 0) {
                }
                e i282 = T.i(androidx.compose.animation.a.a(a0.e(eVar4, 1.0f), null, 3), f17, f45, f17, f46);
                C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f512 = c.f(u11, i282);
                e eVar52 = eVar4;
                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g102 = b.g(u11, a112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, g102);
                F1.b(u11, f512, InterfaceC2801g.a.f());
                header = state.getHeader();
                u11.o(1684273096);
                if (header != null) {
                }
                u11.k();
                providers = state.getBody().getProviders();
                u11.o(1684312687);
                if (providers != null) {
                }
                u11.k();
                emptyState = state.getBody().getEmptyState();
                u11.o(1684457597);
                if (emptyState != null) {
                }
                u11.k();
                footer = state.getFooter();
                u11.o(1684507105);
                if (footer != null) {
                }
                u11.k();
                u11.f();
                f39 = f27;
                f41 = f25;
                c3969l = u11;
                f42 = f37;
                f43 = f38;
                f44 = f47;
                eVar3 = eVar52;
                float f632 = f18;
                float f642 = f17;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            f18 = f11;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            i16 = i12 & 64;
            if (i16 != 0) {
            }
            i17 = 128 & i12;
            if (i17 != 0) {
            }
            i18 = 256 & i12;
            if (i18 != 0) {
            }
            i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i19 != 0) {
            }
            i21 = i19;
            if ((i26 & 306783379) == 306783378) {
            }
            if (i25 == 0) {
            }
            if (i27 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if (i21 == 0) {
            }
            e i2822 = T.i(androidx.compose.animation.a.a(a0.e(eVar4, 1.0f), null, 3), f17, f45, f17, f46);
            C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f5122 = c.f(u11, i2822);
            e eVar522 = eVar4;
            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g1022 = b.g(u11, a1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g1022);
            F1.b(u11, f5122, InterfaceC2801g.a.f());
            header = state.getHeader();
            u11.o(1684273096);
            if (header != null) {
            }
            u11.k();
            providers = state.getBody().getProviders();
            u11.o(1684312687);
            if (providers != null) {
            }
            u11.k();
            emptyState = state.getBody().getEmptyState();
            u11.o(1684457597);
            if (emptyState != null) {
            }
            u11.k();
            footer = state.getFooter();
            u11.o(1684507105);
            if (footer != null) {
            }
            u11.k();
            u11.f();
            f39 = f27;
            f41 = f25;
            c3969l = u11;
            f42 = f37;
            f43 = f38;
            f44 = f47;
            eVar3 = eVar522;
            float f6322 = f18;
            float f6422 = f17;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        f17 = f7;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        f18 = f11;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        i16 = i12 & 64;
        if (i16 != 0) {
        }
        i17 = 128 & i12;
        if (i17 != 0) {
        }
        i18 = 256 & i12;
        if (i18 != 0) {
        }
        i19 = i12 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i19 != 0) {
        }
        i21 = i19;
        if ((i26 & 306783379) == 306783378) {
        }
        if (i25 == 0) {
        }
        if (i27 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if (i21 == 0) {
        }
        e i28222 = T.i(androidx.compose.animation.a.a(a0.e(eVar4, 1.0f), null, 3), f17, f45, f17, f46);
        C5194q a11222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), u11, 0);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f51222 = c.f(u11, i28222);
        e eVar5222 = eVar4;
        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g10222 = b.g(u11, a11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g10222);
        F1.b(u11, f51222, InterfaceC2801g.a.f());
        header = state.getHeader();
        u11.o(1684273096);
        if (header != null) {
        }
        u11.k();
        providers = state.getBody().getProviders();
        u11.o(1684312687);
        if (providers != null) {
        }
        u11.k();
        emptyState = state.getBody().getEmptyState();
        u11.o(1684457597);
        if (emptyState != null) {
        }
        u11.k();
        footer = state.getFooter();
        u11.o(1684507105);
        if (footer != null) {
        }
        u11.k();
        u11.f();
        f39 = f27;
        f41 = f25;
        c3969l = u11;
        f42 = f37;
        f43 = f38;
        f44 = f47;
        eVar3 = eVar5222;
        float f63222 = f18;
        float f64222 = f17;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A00.a EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$4(A1<? extends A00.a> a12) {
        return a12.getValue();
    }

    private static final boolean EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$6(InterfaceC3978p0<Boolean> interfaceC3978p0) {
        return interfaceC3978p0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EdoProvidersV2Composable_LLhsUjk$lambda$22$lambda$14$lambda$7(InterfaceC3978p0<Boolean> interfaceC3978p0, boolean z11) {
        interfaceC3978p0.setValue(Boolean.valueOf(z11));
    }
}
