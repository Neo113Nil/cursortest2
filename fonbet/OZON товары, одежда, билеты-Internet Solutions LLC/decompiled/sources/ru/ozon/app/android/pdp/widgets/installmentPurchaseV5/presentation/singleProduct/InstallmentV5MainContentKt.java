package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import K00.b;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.h;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7809a0;
import n0.C8366G;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.component.text.DsTextAtomKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;
import u0.C9891D;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0011\u001a\u00020\u0006*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;", "content", "Landroidx/compose/ui/e;", "modifier", "", "isSelect", "", "InstallmentV5MainContent", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent;Landroidx/compose/ui/e;ZLS0/k;II)V", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;", "leftBlock", "InstallmentLeftBlock", "(Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/InstallmentPurchaseV5VO$SingleProduct$SingleProductContent$LeftBlock;ZLS0/k;I)V", "Lu0/C;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "InstallmentTextBlock", "(Lu0/C;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;LS0/k;I)V", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5MainContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstallmentLeftBlock(InstallmentPurchaseV5VO.SingleProduct.SingleProductContent.LeftBlock leftBlock, boolean z11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e eVar;
        C3969l u11 = interfaceC3967k.u(-1924501385);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(leftBlock) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.p(z11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
        } else {
            C7807Z c7807z = TokenParserKt.tokenToColor(leftBlock.getBackground(), u11, 0);
            u11.o(699717833);
            long bgInstalmentSecondary = c7807z == null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgInstalmentSecondary() : c7807z.w();
            u11.k();
            u11.o(699721180);
            boolean z12 = (i12 & 112) == 32;
            Object C11 = u11.C();
            if (z12 || C11 == InterfaceC3967k.a.a()) {
                C11 = h.a((z11 ? CornerRadius.RADIUS_400 : CornerRadius.RADIUS_350).m1866getDpD9Ej5fM());
                u11.x(C11);
            }
            float d11 = ((h) C11).d();
            u11.k();
            e.a aVar = e.f40358c0;
            e g10 = T.g(androidx.compose.foundation.e.b(a0.t(aVar, 0.0f, InstallmentV5SingleDefaults.INSTANCE.m883getMAX_LEFT_BLOCK_WIDTHD9Ej5fM(), 1), bgInstalmentSecondary, A0.h.b(d11)), Paddings.PADDING_350.m1867getDpD9Ej5fM(), Paddings.PADDING_250.m1867getDpD9Ej5fM());
            CommonAtomIconDTO icon = leftBlock.getIcon();
            u11.o(699733405);
            Unit unit = null;
            if (icon != null) {
                Y b11 = X.b(C5179b.n(4), InterfaceC6250b.a.i(), u11, 54);
                int I11 = u11.I();
                A0 d12 = u11.d();
                e f7 = c.f(u11, g10);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a11);
                } else {
                    u11.e();
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(icon.getIcon(), u11, 0);
                u11.o(1597638651);
                if (abstractC8972b == null) {
                    eVar = null;
                } else {
                    C7807Z c7807z2 = TokenParserKt.tokenToColor(icon.getTintColor(), u11, 0);
                    eVar = null;
                    C8366G.a(abstractC8972b, null, a0.n(aVar, 20), null, null, 0.0f, c7807z2 != null ? C7809a0.a.a(5, c7807z2.w()) : null, u11, 432, 56);
                }
                u11.k();
                DsTextAtomKt.DsTextAtom(leftBlock.getTitle(), eVar, u11, 0, 2);
                u11.f();
                unit = Unit.f71690a;
            }
            u11.k();
            if (unit == null) {
                DsTextAtomKt.DsTextAtom(leftBlock.getTitle(), g10, u11, 0, 0);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5MainContentKt$InstallmentLeftBlock$2(leftBlock, z11, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstallmentTextBlock(InterfaceC9890C interfaceC9890C, TextDTO textDTO, TextDTO textDTO2, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        C3969l u11 = interfaceC3967k.u(-1808275249);
        if ((i11 & 6) == 0) {
            i12 = (u11.n(interfaceC9890C) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.n(textDTO) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= u11.n(textDTO2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 147) == 146 && u11.b()) {
            u11.j();
        } else {
            e a11 = interfaceC9890C.a(e.f40358c0, 1.0f, true);
            u11.o(1034609442);
            Unit unit = null;
            if (textDTO2 != null) {
                C5194q a12 = C5193p.a(C5179b.b(), InterfaceC6250b.a.k(), u11, 6);
                int I11 = u11.I();
                A0 d11 = u11.d();
                e f7 = c.f(u11, a11);
                Function0 a13 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.H(a13);
                } else {
                    u11.e();
                }
                Function2 g10 = b.g(u11, a12, u11, d11);
                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, g10);
                }
                F1.b(u11, f7, InterfaceC2801g.a.f());
                DsTextAtomKt.DsTextAtom(textDTO, null, u11, (i12 >> 3) & 14, 2);
                DsTextAtomKt.DsTextAtom(textDTO2, null, u11, (i12 >> 6) & 14, 2);
                u11.f();
                unit = Unit.f71690a;
            }
            u11.k();
            if (unit == null) {
                DsTextAtomKt.DsTextAtom(textDTO, a11, u11, (i12 >> 3) & 14, 0);
            }
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new InstallmentV5MainContentKt$InstallmentTextBlock$2(interfaceC9890C, textDTO, textDTO2, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstallmentV5MainContent(@NotNull InstallmentPurchaseV5VO.SingleProduct.SingleProductContent content, e eVar, boolean z11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int I11;
        CommonAtomIconDTO chevronIcon;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(content, "content");
        C3969l u11 = interfaceC3967k.u(1797095057);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(content) ? 4 : 2) | i11;
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
                i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            if ((i13 & 147) == 146 || !u11.b()) {
                e eVar4 = i14 == 0 ? e.f40358c0 : eVar2;
                C5179b.i n11 = C5179b.n(8);
                d.b i15 = InterfaceC6250b.a.i();
                e f7 = T.f(eVar4, Paddings.PADDING_300.m1867getDpD9Ej5fM());
                Y b11 = X.b(n11, i15, u11, 54);
                I11 = u11.I();
                A0 d11 = u11.d();
                e f11 = c.f(u11, f7);
                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                    u11.e();
                } else {
                    u11.H(a11);
                }
                Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                    a.d(I11, u11, I11, h11);
                }
                F1.b(u11, f11, InterfaceC2801g.a.f());
                C9891D c9891d = C9891D.f99599a;
                InstallmentLeftBlock(content.getLeftBlock(), z11, u11, (i13 >> 3) & 112);
                InstallmentTextBlock(c9891d, content.getTitle(), content.getSubtitle(), u11, 6);
                chevronIcon = content.getChevronIcon();
                u11.o(516883306);
                if (chevronIcon != null) {
                    AbstractC8972b abstractC8972b = TokenParserKt.tokenToIcon(chevronIcon.getIcon(), u11, 0);
                    u11.o(516884567);
                    if (abstractC8972b != null) {
                        C7807Z c7807z = TokenParserKt.tokenToColor(chevronIcon.getTintColor(), u11, 0);
                        C8366G.a(abstractC8972b, null, a0.n(e.f40358c0, 16), null, null, 0.0f, c7807z != null ? C7809a0.a.a(5, c7807z.w()) : null, u11, 432, 56);
                    }
                    u11.k();
                }
                u11.k();
                u11.f();
                eVar3 = eVar4;
            } else {
                u11.j();
                eVar3 = eVar2;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new InstallmentV5MainContentKt$InstallmentV5MainContent$2(content, eVar3, z11, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i12 & 4) == 0) {
        }
        if ((i13 & 147) == 146) {
        }
        if (i14 == 0) {
        }
        C5179b.i n112 = C5179b.n(8);
        d.b i152 = InterfaceC6250b.a.i();
        e f72 = T.f(eVar4, Paddings.PADDING_300.m1867getDpD9Ej5fM());
        Y b112 = X.b(n112, i152, u11, 54);
        I11 = u11.I();
        A0 d112 = u11.d();
        e f112 = c.f(u11, f72);
        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112 = Cm.e.h(u11, b112, u11, d112);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112);
        F1.b(u11, f112, InterfaceC2801g.a.f());
        C9891D c9891d2 = C9891D.f99599a;
        InstallmentLeftBlock(content.getLeftBlock(), z11, u11, (i13 >> 3) & 112);
        InstallmentTextBlock(c9891d2, content.getTitle(), content.getSubtitle(), u11, 6);
        chevronIcon = content.getChevronIcon();
        u11.o(516883306);
        if (chevronIcon != null) {
        }
        u11.k();
        u11.f();
        eVar3 = eVar4;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }
}
