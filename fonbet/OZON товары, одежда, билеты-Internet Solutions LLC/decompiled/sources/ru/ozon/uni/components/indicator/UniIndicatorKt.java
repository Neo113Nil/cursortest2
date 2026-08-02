package ru.ozon.uni.components.indicator;

import A0.h;
import B0.C2510t;
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
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import q1.AbstractC8972b;
import ru.ozon.uni.components.indicator.UniIndicatorStyle;
import ru.ozon.uni.components.productMedia.UniProductMediaTestTags;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.PainterUtilsKt;
import ru.ozon.uni.utils.UniTestTagsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "text", "Lq1/b;", "icon", "Lru/ozon/uni/components/indicator/UniIndicatorStyle;", "styleType", "Lru/ozon/uni/components/indicator/UniIndicatorSize;", "size", "", "UniIndicator", "(Landroidx/compose/ui/e;Ljava/lang/String;Lq1/b;Lru/ozon/uni/components/indicator/UniIndicatorStyle;Lru/ozon/uni/components/indicator/UniIndicatorSize;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniIndicatorKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniIndicator(e eVar, String str, AbstractC8972b abstractC8972b, UniIndicatorStyle uniIndicatorStyle, UniIndicatorSize uniIndicatorSize, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e eVar2;
        int i13;
        String str2;
        AbstractC8972b abstractC8972b2;
        int i14;
        UniIndicatorStyle uniIndicatorStyle2;
        int i15;
        UniIndicatorSize uniIndicatorSize2;
        e eVar3;
        UniIndicatorSize uniIndicatorSize3;
        AbstractC8972b abstractC8972b3;
        int I11;
        String str3;
        AbstractC8972b abstractC8972b4;
        String str4;
        UniIndicatorSize uniIndicatorSize4;
        e eVar4;
        UniIndicatorStyle uniIndicatorStyle3;
        AbstractC8972b abstractC8972b5;
        int i16;
        C3969l u11 = interfaceC3967k.u(-1122943799);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i13 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            str2 = str;
            i13 |= u11.n(str2) ? 32 : 16;
            if ((i11 & 384) != 0) {
                if ((i12 & 4) == 0) {
                    abstractC8972b2 = abstractC8972b;
                    if (u11.n(abstractC8972b2)) {
                        i16 = 256;
                        i13 |= i16;
                    }
                } else {
                    abstractC8972b2 = abstractC8972b;
                }
                i16 = UserVerificationMethods.USER_VERIFY_PATTERN;
                i13 |= i16;
            } else {
                abstractC8972b2 = abstractC8972b;
            }
            i14 = i12 & 8;
            if (i14 == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                uniIndicatorStyle2 = uniIndicatorStyle;
                i13 |= u11.n(uniIndicatorStyle2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    uniIndicatorSize2 = uniIndicatorSize;
                    i13 |= u11.n(uniIndicatorSize2) ? 16384 : 8192;
                    if ((i13 & 9363) == 9362 || !u11.b()) {
                        u11.Q0();
                        if ((i11 & 1) != 0 || u11.w0()) {
                            eVar3 = i17 == 0 ? e.f40358c0 : eVar2;
                            String str5 = i18 == 0 ? "9" : str2;
                            if ((i12 & 4) != 0) {
                                UniTheme.INSTANCE.getIcons();
                                u11.B(-2119214843);
                                AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_dot_filled, "ic_m_dot_filled", u11, 48);
                                u11.K();
                                i13 &= -897;
                                abstractC8972b2 = uniPainterResource;
                            }
                            if (i14 != 0) {
                                uniIndicatorStyle2 = UniIndicatorStyle.Accent.INSTANCE;
                            }
                            if (i15 == 0) {
                                uniIndicatorSize3 = UniIndicatorSize.Size500;
                                str2 = str5;
                                abstractC8972b3 = abstractC8972b2;
                                int i19 = i13;
                                UniIndicatorStyle uniIndicatorStyle4 = uniIndicatorStyle2;
                                u11.j0();
                                e uniTestTag = UniTestTagsKt.uniTestTag(a0.u(androidx.compose.foundation.e.b(a0.l(a0.i(eVar3, uniIndicatorSize3.getSize()), uniIndicatorSize3.getSize(), 0.0f, 0.0f, 0.0f, 14), DeferredColor.getValue(uniIndicatorStyle4.getBackgroundColor(), u11, 0), h.e()), 1), UniIndicatorTestTags.Container, null, u11, 48, 2);
                                V f7 = C5185h.f(InterfaceC6250b.a.e(), false);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f11 = c.f(u11, uniTestTag);
                                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                if (u11.t()) {
                                    u11.e();
                                } else {
                                    u11.H(a11);
                                }
                                Function2 f12 = E.f(u11, f7, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, f12);
                                }
                                F1.b(u11, f11, InterfaceC2801g.a.f());
                                if (str2 != null || uniIndicatorSize3.getTextStyle() == null) {
                                    str3 = str2;
                                    if (abstractC8972b3 == null && uniIndicatorSize3.getCanHaveIcon()) {
                                        u11.o(1581259174);
                                        e uniTestTag2 = UniTestTagsKt.uniTestTag(a0.j(e.f40358c0, 16), UniProductMediaTestTags.Graphic, null, u11, 54, 2);
                                        P9.a.b(uniTestTag2, "icon");
                                        abstractC8972b4 = abstractC8972b3;
                                        P0.E.a(abstractC8972b4, null, uniTestTag2, PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(uniIndicatorStyle4.getIconColor(), u11, 0), abstractC8972b3), u11, ((i19 >> 6) & 14) | 48);
                                        u11.k();
                                    } else {
                                        abstractC8972b4 = abstractC8972b3;
                                        u11.o(1581626276);
                                        u11.k();
                                    }
                                } else {
                                    u11.o(1580716457);
                                    final long value = DeferredColor.getValue(uniIndicatorStyle4.getTextColor(), u11, 0);
                                    e uniTestTag3 = UniTestTagsKt.uniTestTag(T.h(e.f40358c0, uniIndicatorSize3.getHorizontalPadding(), 0.0f, 2), UniIndicatorTestTags.Text, null, u11, 48, 2);
                                    P9.a.b(uniTestTag3, "text");
                                    K1.T textStyle = uniIndicatorSize3.getTextStyle();
                                    u11.o(-364637063);
                                    boolean s11 = u11.s(value);
                                    Object C11 = u11.C();
                                    if (s11 || C11 == InterfaceC3967k.a.a()) {
                                        C11 = new InterfaceC7813c0() { // from class: ru.ozon.uni.components.indicator.UniIndicatorKt$UniIndicator$1$1$1
                                            @Override // l1.InterfaceC7813c0
                                            /* renamed from: invoke-0d7_KjU */
                                            public final long mo7invoke0d7_KjU() {
                                                return value;
                                            }
                                        };
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    C2510t.b(str2, uniTestTag3, textStyle, null, 2, false, 1, 0, (InterfaceC7813c0) C11, u11, ((i19 >> 3) & 14) | 1597440, 168);
                                    str3 = str2;
                                    u11 = u11;
                                    u11.k();
                                    abstractC8972b4 = abstractC8972b3;
                                }
                                u11.f();
                                str4 = str3;
                                uniIndicatorSize4 = uniIndicatorSize3;
                                eVar4 = eVar3;
                                uniIndicatorStyle3 = uniIndicatorStyle4;
                                abstractC8972b5 = abstractC8972b4;
                            } else {
                                str2 = str5;
                            }
                        } else {
                            u11.j();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            eVar3 = eVar2;
                        }
                        abstractC8972b3 = abstractC8972b2;
                        uniIndicatorSize3 = uniIndicatorSize2;
                        int i192 = i13;
                        UniIndicatorStyle uniIndicatorStyle42 = uniIndicatorStyle2;
                        u11.j0();
                        e uniTestTag4 = UniTestTagsKt.uniTestTag(a0.u(androidx.compose.foundation.e.b(a0.l(a0.i(eVar3, uniIndicatorSize3.getSize()), uniIndicatorSize3.getSize(), 0.0f, 0.0f, 0.0f, 14), DeferredColor.getValue(uniIndicatorStyle42.getBackgroundColor(), u11, 0), h.e()), 1), UniIndicatorTestTags.Container, null, u11, 48, 2);
                        V f72 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f112 = c.f(u11, uniTestTag4);
                        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f122 = E.f(u11, f72, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f122);
                        F1.b(u11, f112, InterfaceC2801g.a.f());
                        if (str2 != null) {
                        }
                        str3 = str2;
                        if (abstractC8972b3 == null) {
                        }
                        abstractC8972b4 = abstractC8972b3;
                        u11.o(1581626276);
                        u11.k();
                        u11.f();
                        str4 = str3;
                        uniIndicatorSize4 = uniIndicatorSize3;
                        eVar4 = eVar3;
                        uniIndicatorStyle3 = uniIndicatorStyle42;
                        abstractC8972b5 = abstractC8972b4;
                    } else {
                        u11.j();
                        eVar4 = eVar2;
                        str4 = str2;
                        abstractC8972b5 = abstractC8972b2;
                        uniIndicatorStyle3 = uniIndicatorStyle2;
                        uniIndicatorSize4 = uniIndicatorSize2;
                    }
                    J0 m02 = u11.m0();
                    if (m02 != null) {
                        m02.G(new UniIndicatorKt$UniIndicator$2(eVar4, str4, abstractC8972b5, uniIndicatorStyle3, uniIndicatorSize4, i11, i12));
                        return;
                    }
                    return;
                }
                uniIndicatorSize2 = uniIndicatorSize;
                if ((i13 & 9363) == 9362) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i17 == 0) {
                }
                if (i18 == 0) {
                }
                if ((i12 & 4) != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 == 0) {
                }
            }
            uniIndicatorStyle2 = uniIndicatorStyle;
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            uniIndicatorSize2 = uniIndicatorSize;
            if ((i13 & 9363) == 9362) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i17 == 0) {
            }
            if (i18 == 0) {
            }
            if ((i12 & 4) != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 == 0) {
            }
        }
        str2 = str;
        if ((i11 & 384) != 0) {
        }
        i14 = i12 & 8;
        if (i14 == 0) {
        }
        uniIndicatorStyle2 = uniIndicatorStyle;
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        uniIndicatorSize2 = uniIndicatorSize;
        if ((i13 & 9363) == 9362) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i17 == 0) {
        }
        if (i18 == 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 == 0) {
        }
    }
}
