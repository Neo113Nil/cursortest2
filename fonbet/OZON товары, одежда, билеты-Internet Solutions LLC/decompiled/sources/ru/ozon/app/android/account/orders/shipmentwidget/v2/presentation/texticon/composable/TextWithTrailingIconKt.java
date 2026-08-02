package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.composable;

import K1.C3422b;
import K1.K;
import K1.M;
import K1.N;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.d;
import a1.c;
import androidx.compose.foundation.layout.C5191n;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import ru.ozon.pikazon.compose.painter.PikazonImagePainter;
import ru.ozon.pikazon.compose.painter.f;
import ru.ozon.uni.android.ds.compose.html.SpannedAnnotateConvertorKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/atoms/data/text/TextDTO;", "dto", "", "icon", "", "timerEnabled", "Landroidx/compose/ui/e;", "modifier", "", "TextWithTrailingIcon", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;ZLandroidx/compose/ui/e;LS0/k;II)V", "LK1/K;", "", "textEnd", "", "iconSizePx", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/composable/IconSpot;", "resolveIconSpot", "(LK1/K;IF)Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/composable/IconSpot;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextWithTrailingIconKt {
    /* JADX WARN: Removed duplicated region for block: B:22:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027f A[LOOP:0: B:66:0x027d->B:67:0x027f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextWithTrailingIcon(@NotNull TextDTO dto, @NotNull String icon, boolean z11, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        boolean n11;
        Object C11;
        T t2;
        T t11;
        boolean n12;
        Object C12;
        T t12;
        boolean q11;
        Object C13;
        int intValue;
        boolean n13;
        Object C14;
        boolean n14;
        Object C15;
        boolean n15;
        Object C16;
        int i15;
        C3969l c3969l;
        e eVar3;
        J0 m02;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(icon, "icon");
        C3969l u11 = interfaceC3967k.u(-1312839180);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(icon) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i16 = i12 & 8;
        if (i16 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i13;
            if ((i14 & 1171) == 1170 || !u11.b()) {
                e eVar4 = i16 == 0 ? e.f40358c0 : eVar2;
                M a11 = N.a(u11);
                PikazonImagePainter a12 = f.a(icon, null, null, null, u11, (i14 >> 3) & 14, 14);
                d dVar = (d) u11.m(K0.e());
                String typographyToken = dto.getTypographyToken();
                u11.o(1013191320);
                n11 = u11.n(typographyToken) | ((i14 & 896) != 256);
                C11 = u11.C();
                if (!n11 || C11 == InterfaceC3967k.a.a()) {
                    t2 = TokenParserKt.tokenToTextStyle(dto.getTypographyToken());
                    if (t2 == null) {
                        t2 = T.f15012d;
                    }
                    C11 = T.c(t2, 0L, 0L, null, null, !z11 ? "tnum" : null, 0L, null, null, 0L, null, null, 16777151);
                    u11.x(C11);
                }
                t11 = (T) C11;
                u11.k();
                C7807Z c7807z = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
                u11.o(1013199246);
                long graphicPrimary = c7807z != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimary() : c7807z.w();
                u11.k();
                Integer maxLines = dto.getMaxLines();
                int intValue2 = maxLines == null ? maxLines.intValue() : Integer.MAX_VALUE;
                float v12 = dVar.v1(24);
                u11.o(1013205614);
                n12 = u11.n(t11);
                C12 = u11.C();
                if (!n12 || C12 == InterfaceC3967k.a.a()) {
                    t12 = t11;
                    C12 = Float.valueOf((int) (M.b(a11, new C3422b(6, " ", null), t12, 0, false, 0, 0L, null, null, null, 2044).A() >> 32));
                    u11.x(C12);
                } else {
                    t12 = t11;
                }
                float floatValue = ((Number) C12).floatValue();
                u11.k();
                u11.o(1013210440);
                q11 = u11.q(v12) | u11.q(floatValue);
                C13 = u11.C();
                if (!q11 || C13 == InterfaceC3967k.a.a()) {
                    C13 = Integer.valueOf(floatValue <= 0.0f ? h.e(((int) Math.ceil(v12 / floatValue)) + 1, 1, 50) : 3);
                    u11.x(C13);
                }
                intValue = ((Number) C13).intValue();
                u11.k();
                C3422b m1836toAnnotateStringiJQMabo = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, OzonSpannableString.$stable, 1);
                u11.o(1013218489);
                n13 = u11.n(m1836toAnnotateStringiJQMabo);
                C14 = u11.C();
                if (!n13 || C14 == InterfaceC3967k.a.a()) {
                    u11.x(m1836toAnnotateStringiJQMabo);
                    C14 = m1836toAnnotateStringiJQMabo;
                }
                C3422b c3422b = (C3422b) C14;
                u11.k();
                u11.o(1013220554);
                n14 = u11.n(m1836toAnnotateStringiJQMabo);
                C15 = u11.C();
                if (!n14 || C15 == InterfaceC3967k.a.a()) {
                    C15 = Integer.valueOf(kotlin.text.h.C0(c3422b.h()).toString().length());
                    u11.x(C15);
                }
                int intValue3 = ((Number) C15).intValue();
                u11.k();
                u11.o(1013223281);
                n15 = u11.n(m1836toAnnotateStringiJQMabo) | u11.r(intValue);
                C16 = u11.C();
                if (!n15 || C16 == InterfaceC3967k.a.a()) {
                    C3422b.a aVar = new C3422b.a();
                    aVar.d(c3422b);
                    aVar.c((char) 8288);
                    for (i15 = 0; i15 < intValue; i15++) {
                        aVar.c((char) 160);
                    }
                    C16 = aVar.i();
                    u11.x(C16);
                }
                u11.k();
                e eVar5 = eVar4;
                C5191n.a(eVar5, null, c.c(693642462, new TextWithTrailingIconKt$TextWithTrailingIcon$1((C3422b) C16, t12, intValue2, intValue3, v12, dto, a12, graphicPrimary, a11), u11), u11, ((i14 >> 9) & 14) | 3072, 6);
                c3969l = u11;
                eVar3 = eVar5;
            } else {
                u11.j();
                e eVar6 = eVar2;
                c3969l = u11;
                eVar3 = eVar6;
            }
            m02 = c3969l.m0();
            if (m02 == null) {
                m02.G(new TextWithTrailingIconKt$TextWithTrailingIcon$2(dto, icon, z11, eVar3, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        i14 = i13;
        if ((i14 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        M a112 = N.a(u11);
        PikazonImagePainter a122 = f.a(icon, null, null, null, u11, (i14 >> 3) & 14, 14);
        d dVar2 = (d) u11.m(K0.e());
        String typographyToken2 = dto.getTypographyToken();
        u11.o(1013191320);
        n11 = u11.n(typographyToken2) | ((i14 & 896) != 256);
        C11 = u11.C();
        if (!n11) {
        }
        t2 = TokenParserKt.tokenToTextStyle(dto.getTypographyToken());
        if (t2 == null) {
        }
        C11 = T.c(t2, 0L, 0L, null, null, !z11 ? "tnum" : null, 0L, null, null, 0L, null, null, 16777151);
        u11.x(C11);
        t11 = (T) C11;
        u11.k();
        C7807Z c7807z2 = TokenParserKt.tokenToColor(dto.getTextColor(), u11, 0);
        u11.o(1013199246);
        long graphicPrimary2 = c7807z2 != null ? UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicPrimary() : c7807z2.w();
        u11.k();
        Integer maxLines2 = dto.getMaxLines();
        int intValue22 = maxLines2 == null ? maxLines2.intValue() : Integer.MAX_VALUE;
        float v122 = dVar2.v1(24);
        u11.o(1013205614);
        n12 = u11.n(t11);
        C12 = u11.C();
        if (n12) {
        }
        t12 = t11;
        C12 = Float.valueOf((int) (M.b(a112, new C3422b(6, " ", null), t12, 0, false, 0, 0L, null, null, null, 2044).A() >> 32));
        u11.x(C12);
        float floatValue2 = ((Number) C12).floatValue();
        u11.k();
        u11.o(1013210440);
        q11 = u11.q(v122) | u11.q(floatValue2);
        C13 = u11.C();
        if (!q11) {
        }
        C13 = Integer.valueOf(floatValue2 <= 0.0f ? h.e(((int) Math.ceil(v122 / floatValue2)) + 1, 1, 50) : 3);
        u11.x(C13);
        intValue = ((Number) C13).intValue();
        u11.k();
        C3422b m1836toAnnotateStringiJQMabo2 = SpannedAnnotateConvertorKt.m1836toAnnotateStringiJQMabo(dto.getText(), 0L, u11, OzonSpannableString.$stable, 1);
        u11.o(1013218489);
        n13 = u11.n(m1836toAnnotateStringiJQMabo2);
        C14 = u11.C();
        if (!n13) {
        }
        u11.x(m1836toAnnotateStringiJQMabo2);
        C14 = m1836toAnnotateStringiJQMabo2;
        C3422b c3422b2 = (C3422b) C14;
        u11.k();
        u11.o(1013220554);
        n14 = u11.n(m1836toAnnotateStringiJQMabo2);
        C15 = u11.C();
        if (!n14) {
        }
        C15 = Integer.valueOf(kotlin.text.h.C0(c3422b2.h()).toString().length());
        u11.x(C15);
        int intValue32 = ((Number) C15).intValue();
        u11.k();
        u11.o(1013223281);
        n15 = u11.n(m1836toAnnotateStringiJQMabo2) | u11.r(intValue);
        C16 = u11.C();
        if (!n15) {
        }
        C3422b.a aVar2 = new C3422b.a();
        aVar2.d(c3422b2);
        aVar2.c((char) 8288);
        while (i15 < intValue) {
        }
        C16 = aVar2.i();
        u11.x(C16);
        u11.k();
        e eVar52 = eVar4;
        C5191n.a(eVar52, null, c.c(693642462, new TextWithTrailingIconKt$TextWithTrailingIcon$1((C3422b) C16, t12, intValue22, intValue32, v122, dto, a122, graphicPrimary2, a112), u11), u11, ((i14 >> 9) & 14) | 3072, 6);
        c3969l = u11;
        eVar3 = eVar52;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconSpot resolveIconSpot(K k11, int i11, float f7) {
        int m11 = k11.m();
        if (m11 <= 0) {
            return null;
        }
        int e11 = h.e(i11, 0, k11.k().j().length());
        if (e11 <= 0) {
            return null;
        }
        int i12 = e11 - 1;
        int p11 = k11.p(i12 >= 0 ? i12 : 0);
        if (p11 < 0 || p11 >= m11) {
            return null;
        }
        float i13 = k11.i(e11, true);
        float u11 = k11.u(p11);
        return new IconSpot(i13, (((k11.l(p11) - u11) - f7) / 2.0f) + u11);
    }
}
