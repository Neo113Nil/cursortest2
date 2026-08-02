package ru.ozon.uni.android.ds.compose.component.disclaimer;

import K1.C3422b;
import K1.T;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.components.disclaimer.FoundationDisclaimerKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¯\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "LK1/b;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lkotlin/Function0;", "", "mainButton", "additionalButton", "closeButton", "", "isClickable", "hasIcon", "", "icon", "Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;", "style", "titleModifier", "subtitleModifier", "iconModifier", "DsDisclaimer", "(Landroidx/compose/ui/e;LK1/b;LK1/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZZLjava/lang/String;Lru/ozon/uni/android/ds/compose/component/disclaimer/DsDisclaimerStyle;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/k;III)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsDisclaimerKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsDisclaimer(e eVar, C3422b c3422b, C3422b c3422b2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, boolean z11, boolean z12, String str, DsDisclaimerStyle dsDisclaimerStyle, e eVar2, e eVar3, e eVar4, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        e eVar5;
        int i14;
        C3422b c3422b3;
        int i15;
        int i16;
        int i17;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int i18;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25;
        int i19;
        boolean z13;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        boolean z14;
        boolean z15;
        String str2;
        DsDisclaimerStyle dsDisclaimerStyle2;
        e eVar6;
        e eVar7;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function27;
        C3422b c3422b4;
        e eVar8;
        AbstractC8972b abstractC8972b;
        e eVar9;
        C3422b c3422b5;
        int i33;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function28;
        AbstractC8972b abstractC8972b2;
        C3969l c3969l;
        DsDisclaimerStyle dsDisclaimerStyle3;
        boolean z16;
        boolean z17;
        String str3;
        e eVar10;
        e eVar11;
        e eVar12;
        e eVar13;
        C3422b c3422b6;
        C3422b c3422b7;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function29;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function210;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function211;
        J0 m02;
        int i34;
        C3969l u11 = interfaceC3967k.u(1097992734);
        int i35 = i13 & 1;
        if (i35 != 0) {
            i14 = i11 | 6;
            eVar5 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar5 = eVar;
            i14 = (u11.n(eVar5) ? 4 : 2) | i11;
        } else {
            eVar5 = eVar;
            i14 = i11;
        }
        int i36 = i13 & 2;
        if (i36 != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            c3422b3 = c3422b;
            i14 |= u11.n(c3422b3) ? 32 : 16;
            i15 = i13 & 4;
            if (i15 == 0) {
                i14 |= 384;
            } else if ((i11 & 384) == 0) {
                i14 |= u11.n(c3422b2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i16 = i13 & 8;
                if (i16 != 0) {
                    i14 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    i14 |= u11.F(function2) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    i17 = i13 & 16;
                    if (i17 == 0) {
                        i14 |= 24576;
                    } else if ((i11 & 24576) == 0) {
                        function24 = function22;
                        i14 |= u11.F(function24) ? 16384 : 8192;
                        i18 = i13 & 32;
                        if (i18 != 0) {
                            i14 |= 196608;
                            function25 = function23;
                        } else {
                            function25 = function23;
                            if ((i11 & 196608) == 0) {
                                i14 |= u11.F(function25) ? 131072 : 65536;
                            }
                        }
                        i19 = i13 & 64;
                        if (i19 != 0) {
                            i14 |= 1572864;
                            z13 = z11;
                        } else {
                            z13 = z11;
                            if ((i11 & 1572864) == 0) {
                                i14 |= u11.p(z13) ? 1048576 : 524288;
                            }
                        }
                        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i21 != 0) {
                            i14 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i22 = i35;
                            i14 |= u11.p(z12) ? 8388608 : 4194304;
                            i23 = i13 & 256;
                            if (i23 == 0) {
                                i14 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i24 = i23;
                                i14 |= u11.n(str) ? 67108864 : 33554432;
                                if ((i11 & 805306368) == 0) {
                                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) == 0 && u11.n(dsDisclaimerStyle)) {
                                        i34 = 536870912;
                                        i14 |= i34;
                                    }
                                    i34 = 268435456;
                                    i14 |= i34;
                                }
                                i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                                if (i25 != 0) {
                                    i27 = i12 | 6;
                                    i26 = i25;
                                } else if ((i12 & 6) == 0) {
                                    i26 = i25;
                                    i27 = i12 | (u11.n(eVar2) ? 4 : 2);
                                } else {
                                    i26 = i25;
                                    i27 = i12;
                                }
                                i28 = i13 & 2048;
                                if (i28 != 0) {
                                    i27 |= 48;
                                    i29 = i28;
                                } else if ((i12 & 48) == 0) {
                                    i29 = i28;
                                    i27 |= u11.n(eVar3) ? 32 : 16;
                                } else {
                                    i29 = i28;
                                }
                                int i37 = i27;
                                i31 = i13 & 4096;
                                if (i31 != 0) {
                                    i32 = i37 | 384;
                                } else {
                                    int i38 = i37;
                                    if ((i12 & 384) == 0) {
                                        i38 |= u11.n(eVar4) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                                    }
                                    i32 = i38;
                                }
                                if ((i14 & 306783379) != 306783378 && (i32 & 147) == 146 && u11.b()) {
                                    u11.j();
                                    c3422b7 = c3422b2;
                                    function210 = function2;
                                    eVar11 = eVar2;
                                    eVar13 = eVar4;
                                    c3969l = u11;
                                    eVar10 = eVar5;
                                    function211 = function24;
                                    function29 = function25;
                                    c3422b6 = c3422b3;
                                    z16 = z13;
                                    z17 = z12;
                                    str3 = str;
                                    dsDisclaimerStyle3 = dsDisclaimerStyle;
                                    eVar12 = eVar3;
                                } else {
                                    u11.Q0();
                                    if ((i11 & 1) != 0 || u11.w0()) {
                                        e eVar14 = i22 != 0 ? e.f40358c0 : eVar5;
                                        if (i36 != 0) {
                                            c3422b3 = null;
                                        }
                                        C3422b c3422b8 = i15 != 0 ? null : c3422b2;
                                        Function2<? super InterfaceC3967k, ? super Integer, Unit> function212 = i16 != 0 ? null : function2;
                                        if (i17 != 0) {
                                            function24 = null;
                                        }
                                        if (i18 != 0) {
                                            function25 = null;
                                        }
                                        z14 = i19 != 0 ? false : z13;
                                        z15 = i21 != 0 ? true : z12;
                                        str2 = i24 != 0 ? null : str;
                                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                            dsDisclaimerStyle2 = DsDisclaimerStyle.INSTANCE.neutral(u11, 6);
                                            i14 &= -1879048193;
                                        } else {
                                            dsDisclaimerStyle2 = dsDisclaimerStyle;
                                        }
                                        e eVar15 = i26 != 0 ? e.f40358c0 : eVar2;
                                        e eVar16 = i29 != 0 ? e.f40358c0 : eVar3;
                                        if (i31 != 0) {
                                            function26 = function24;
                                            function27 = function25;
                                            c3422b4 = c3422b3;
                                            eVar8 = eVar16;
                                            eVar6 = e.f40358c0;
                                            eVar9 = eVar14;
                                            eVar7 = eVar15;
                                            abstractC8972b = null;
                                            i33 = 100663296;
                                            c3422b5 = c3422b8;
                                        } else {
                                            eVar6 = eVar4;
                                            eVar7 = eVar15;
                                            function26 = function24;
                                            function27 = function25;
                                            c3422b4 = c3422b3;
                                            eVar8 = eVar16;
                                            abstractC8972b = null;
                                            eVar9 = eVar14;
                                            c3422b5 = c3422b8;
                                            i33 = 100663296;
                                        }
                                        function28 = function212;
                                    } else {
                                        u11.j();
                                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                            i14 &= -1879048193;
                                        }
                                        str2 = str;
                                        dsDisclaimerStyle2 = dsDisclaimerStyle;
                                        eVar7 = eVar2;
                                        eVar8 = eVar3;
                                        eVar6 = eVar4;
                                        eVar9 = eVar5;
                                        function26 = function24;
                                        function27 = function25;
                                        c3422b4 = c3422b3;
                                        z14 = z13;
                                        abstractC8972b = null;
                                        i33 = 100663296;
                                        c3422b5 = c3422b2;
                                        function28 = function2;
                                        z15 = z12;
                                    }
                                    u11.j0();
                                    u11.o(-1989091617);
                                    if (z15) {
                                        AbstractC8972b abstractC8972b3 = str2 == null ? abstractC8972b : TokenParserKt.tokenToIcon(str2, u11, (i14 >> 24) & 14);
                                        if (abstractC8972b3 == null) {
                                            abstractC8972b3 = dsDisclaimerStyle2.getIcon();
                                        }
                                        abstractC8972b2 = abstractC8972b3;
                                    } else {
                                        abstractC8972b2 = abstractC8972b;
                                    }
                                    u11.k();
                                    int i39 = z14 ? 1 : Integer.MAX_VALUE;
                                    long backgroundColor = dsDisclaimerStyle2.getBackgroundColor();
                                    long titleColor = dsDisclaimerStyle2.getTitleColor();
                                    long subtitleColor = dsDisclaimerStyle2.getSubtitleColor();
                                    long iconColor = dsDisclaimerStyle2.getIconColor();
                                    UniTheme uniTheme = UniTheme.INSTANCE;
                                    T compactControl500Medium = uniTheme.getTypography().getCompactControl500Medium();
                                    T body400Small = uniTheme.getTypography().getBody400Small();
                                    u11.o(-1989073206);
                                    if (z14) {
                                        uniTheme.getIcons();
                                        u11.B(-886331929);
                                        abstractC8972b = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_chevron_right_filled, "ic_m_chevron_right_filled", u11, 48);
                                        u11.K();
                                    }
                                    u11.k();
                                    int i41 = i32 << 3;
                                    int i42 = (i41 & 7168) | i33 | (i14 & 14) | (i41 & 112) | (i41 & 896);
                                    int i43 = i14 << 9;
                                    c3969l = u11;
                                    FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor, titleColor, subtitleColor, iconColor, compactControl500Medium, body400Small, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i42 | (57344 & i43) | (i43 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
                                    dsDisclaimerStyle3 = dsDisclaimerStyle2;
                                    z16 = z14;
                                    z17 = z15;
                                    str3 = str2;
                                    eVar10 = eVar9;
                                    eVar11 = eVar7;
                                    eVar12 = eVar8;
                                    eVar13 = eVar6;
                                    c3422b6 = c3422b4;
                                    c3422b7 = c3422b5;
                                    function29 = function27;
                                    function210 = function28;
                                    function211 = function26;
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new DsDisclaimerKt$DsDisclaimer$1(eVar10, c3422b6, c3422b7, function210, function211, function29, z16, z17, str3, dsDisclaimerStyle3, eVar11, eVar12, eVar13, i11, i12, i13));
                                    return;
                                }
                                return;
                            }
                            i24 = i23;
                            if ((i11 & 805306368) == 0) {
                            }
                            i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                            if (i25 != 0) {
                            }
                            i28 = i13 & 2048;
                            if (i28 != 0) {
                            }
                            int i372 = i27;
                            i31 = i13 & 4096;
                            if (i31 != 0) {
                            }
                            if ((i14 & 306783379) != 306783378) {
                            }
                            u11.Q0();
                            if ((i11 & 1) != 0) {
                            }
                            if (i22 != 0) {
                            }
                            if (i36 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i17 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i19 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            if (i24 != 0) {
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            if (i26 != 0) {
                            }
                            if (i29 != 0) {
                            }
                            if (i31 != 0) {
                            }
                            function28 = function212;
                            u11.j0();
                            u11.o(-1989091617);
                            if (z15) {
                            }
                            u11.k();
                            if (z14) {
                            }
                            long backgroundColor2 = dsDisclaimerStyle2.getBackgroundColor();
                            long titleColor2 = dsDisclaimerStyle2.getTitleColor();
                            long subtitleColor2 = dsDisclaimerStyle2.getSubtitleColor();
                            long iconColor2 = dsDisclaimerStyle2.getIconColor();
                            UniTheme uniTheme2 = UniTheme.INSTANCE;
                            T compactControl500Medium2 = uniTheme2.getTypography().getCompactControl500Medium();
                            T body400Small2 = uniTheme2.getTypography().getBody400Small();
                            u11.o(-1989073206);
                            if (z14) {
                            }
                            u11.k();
                            int i412 = i32 << 3;
                            int i422 = (i412 & 7168) | i33 | (i14 & 14) | (i412 & 112) | (i412 & 896);
                            int i432 = i14 << 9;
                            c3969l = u11;
                            FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor2, titleColor2, subtitleColor2, iconColor2, compactControl500Medium2, body400Small2, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i422 | (57344 & i432) | (i432 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
                            dsDisclaimerStyle3 = dsDisclaimerStyle2;
                            z16 = z14;
                            z17 = z15;
                            str3 = str2;
                            eVar10 = eVar9;
                            eVar11 = eVar7;
                            eVar12 = eVar8;
                            eVar13 = eVar6;
                            c3422b6 = c3422b4;
                            c3422b7 = c3422b5;
                            function29 = function27;
                            function210 = function28;
                            function211 = function26;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        i22 = i35;
                        i23 = i13 & 256;
                        if (i23 == 0) {
                        }
                        i24 = i23;
                        if ((i11 & 805306368) == 0) {
                        }
                        i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i25 != 0) {
                        }
                        i28 = i13 & 2048;
                        if (i28 != 0) {
                        }
                        int i3722 = i27;
                        i31 = i13 & 4096;
                        if (i31 != 0) {
                        }
                        if ((i14 & 306783379) != 306783378) {
                        }
                        u11.Q0();
                        if ((i11 & 1) != 0) {
                        }
                        if (i22 != 0) {
                        }
                        if (i36 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i17 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i19 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        if (i24 != 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        if (i26 != 0) {
                        }
                        if (i29 != 0) {
                        }
                        if (i31 != 0) {
                        }
                        function28 = function212;
                        u11.j0();
                        u11.o(-1989091617);
                        if (z15) {
                        }
                        u11.k();
                        if (z14) {
                        }
                        long backgroundColor22 = dsDisclaimerStyle2.getBackgroundColor();
                        long titleColor22 = dsDisclaimerStyle2.getTitleColor();
                        long subtitleColor22 = dsDisclaimerStyle2.getSubtitleColor();
                        long iconColor22 = dsDisclaimerStyle2.getIconColor();
                        UniTheme uniTheme22 = UniTheme.INSTANCE;
                        T compactControl500Medium22 = uniTheme22.getTypography().getCompactControl500Medium();
                        T body400Small22 = uniTheme22.getTypography().getBody400Small();
                        u11.o(-1989073206);
                        if (z14) {
                        }
                        u11.k();
                        int i4122 = i32 << 3;
                        int i4222 = (i4122 & 7168) | i33 | (i14 & 14) | (i4122 & 112) | (i4122 & 896);
                        int i4322 = i14 << 9;
                        c3969l = u11;
                        FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor22, titleColor22, subtitleColor22, iconColor22, compactControl500Medium22, body400Small22, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i4222 | (57344 & i4322) | (i4322 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
                        dsDisclaimerStyle3 = dsDisclaimerStyle2;
                        z16 = z14;
                        z17 = z15;
                        str3 = str2;
                        eVar10 = eVar9;
                        eVar11 = eVar7;
                        eVar12 = eVar8;
                        eVar13 = eVar6;
                        c3422b6 = c3422b4;
                        c3422b7 = c3422b5;
                        function29 = function27;
                        function210 = function28;
                        function211 = function26;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    function24 = function22;
                    i18 = i13 & 32;
                    if (i18 != 0) {
                    }
                    i19 = i13 & 64;
                    if (i19 != 0) {
                    }
                    i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i21 != 0) {
                    }
                    i22 = i35;
                    i23 = i13 & 256;
                    if (i23 == 0) {
                    }
                    i24 = i23;
                    if ((i11 & 805306368) == 0) {
                    }
                    i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i25 != 0) {
                    }
                    i28 = i13 & 2048;
                    if (i28 != 0) {
                    }
                    int i37222 = i27;
                    i31 = i13 & 4096;
                    if (i31 != 0) {
                    }
                    if ((i14 & 306783379) != 306783378) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i22 != 0) {
                    }
                    if (i36 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i19 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i24 != 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i31 != 0) {
                    }
                    function28 = function212;
                    u11.j0();
                    u11.o(-1989091617);
                    if (z15) {
                    }
                    u11.k();
                    if (z14) {
                    }
                    long backgroundColor222 = dsDisclaimerStyle2.getBackgroundColor();
                    long titleColor222 = dsDisclaimerStyle2.getTitleColor();
                    long subtitleColor222 = dsDisclaimerStyle2.getSubtitleColor();
                    long iconColor222 = dsDisclaimerStyle2.getIconColor();
                    UniTheme uniTheme222 = UniTheme.INSTANCE;
                    T compactControl500Medium222 = uniTheme222.getTypography().getCompactControl500Medium();
                    T body400Small222 = uniTheme222.getTypography().getBody400Small();
                    u11.o(-1989073206);
                    if (z14) {
                    }
                    u11.k();
                    int i41222 = i32 << 3;
                    int i42222 = (i41222 & 7168) | i33 | (i14 & 14) | (i41222 & 112) | (i41222 & 896);
                    int i43222 = i14 << 9;
                    c3969l = u11;
                    FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor222, titleColor222, subtitleColor222, iconColor222, compactControl500Medium222, body400Small222, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i42222 | (57344 & i43222) | (i43222 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
                    dsDisclaimerStyle3 = dsDisclaimerStyle2;
                    z16 = z14;
                    z17 = z15;
                    str3 = str2;
                    eVar10 = eVar9;
                    eVar11 = eVar7;
                    eVar12 = eVar8;
                    eVar13 = eVar6;
                    c3422b6 = c3422b4;
                    c3422b7 = c3422b5;
                    function29 = function27;
                    function210 = function28;
                    function211 = function26;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i17 = i13 & 16;
                if (i17 == 0) {
                }
                function24 = function22;
                i18 = i13 & 32;
                if (i18 != 0) {
                }
                i19 = i13 & 64;
                if (i19 != 0) {
                }
                i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i21 != 0) {
                }
                i22 = i35;
                i23 = i13 & 256;
                if (i23 == 0) {
                }
                i24 = i23;
                if ((i11 & 805306368) == 0) {
                }
                i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i25 != 0) {
                }
                i28 = i13 & 2048;
                if (i28 != 0) {
                }
                int i372222 = i27;
                i31 = i13 & 4096;
                if (i31 != 0) {
                }
                if ((i14 & 306783379) != 306783378) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i22 != 0) {
                }
                if (i36 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                if (i18 != 0) {
                }
                if (i19 != 0) {
                }
                if (i21 != 0) {
                }
                if (i24 != 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                if (i26 != 0) {
                }
                if (i29 != 0) {
                }
                if (i31 != 0) {
                }
                function28 = function212;
                u11.j0();
                u11.o(-1989091617);
                if (z15) {
                }
                u11.k();
                if (z14) {
                }
                long backgroundColor2222 = dsDisclaimerStyle2.getBackgroundColor();
                long titleColor2222 = dsDisclaimerStyle2.getTitleColor();
                long subtitleColor2222 = dsDisclaimerStyle2.getSubtitleColor();
                long iconColor2222 = dsDisclaimerStyle2.getIconColor();
                UniTheme uniTheme2222 = UniTheme.INSTANCE;
                T compactControl500Medium2222 = uniTheme2222.getTypography().getCompactControl500Medium();
                T body400Small2222 = uniTheme2222.getTypography().getBody400Small();
                u11.o(-1989073206);
                if (z14) {
                }
                u11.k();
                int i412222 = i32 << 3;
                int i422222 = (i412222 & 7168) | i33 | (i14 & 14) | (i412222 & 112) | (i412222 & 896);
                int i432222 = i14 << 9;
                c3969l = u11;
                FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor2222, titleColor2222, subtitleColor2222, iconColor2222, compactControl500Medium2222, body400Small2222, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i422222 | (57344 & i432222) | (i432222 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
                dsDisclaimerStyle3 = dsDisclaimerStyle2;
                z16 = z14;
                z17 = z15;
                str3 = str2;
                eVar10 = eVar9;
                eVar11 = eVar7;
                eVar12 = eVar8;
                eVar13 = eVar6;
                c3422b6 = c3422b4;
                c3422b7 = c3422b5;
                function29 = function27;
                function210 = function28;
                function211 = function26;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            i16 = i13 & 8;
            if (i16 != 0) {
            }
            i17 = i13 & 16;
            if (i17 == 0) {
            }
            function24 = function22;
            i18 = i13 & 32;
            if (i18 != 0) {
            }
            i19 = i13 & 64;
            if (i19 != 0) {
            }
            i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i21 != 0) {
            }
            i22 = i35;
            i23 = i13 & 256;
            if (i23 == 0) {
            }
            i24 = i23;
            if ((i11 & 805306368) == 0) {
            }
            i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i25 != 0) {
            }
            i28 = i13 & 2048;
            if (i28 != 0) {
            }
            int i3722222 = i27;
            i31 = i13 & 4096;
            if (i31 != 0) {
            }
            if ((i14 & 306783379) != 306783378) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i22 != 0) {
            }
            if (i36 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            if (i18 != 0) {
            }
            if (i19 != 0) {
            }
            if (i21 != 0) {
            }
            if (i24 != 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            if (i26 != 0) {
            }
            if (i29 != 0) {
            }
            if (i31 != 0) {
            }
            function28 = function212;
            u11.j0();
            u11.o(-1989091617);
            if (z15) {
            }
            u11.k();
            if (z14) {
            }
            long backgroundColor22222 = dsDisclaimerStyle2.getBackgroundColor();
            long titleColor22222 = dsDisclaimerStyle2.getTitleColor();
            long subtitleColor22222 = dsDisclaimerStyle2.getSubtitleColor();
            long iconColor22222 = dsDisclaimerStyle2.getIconColor();
            UniTheme uniTheme22222 = UniTheme.INSTANCE;
            T compactControl500Medium22222 = uniTheme22222.getTypography().getCompactControl500Medium();
            T body400Small22222 = uniTheme22222.getTypography().getBody400Small();
            u11.o(-1989073206);
            if (z14) {
            }
            u11.k();
            int i4122222 = i32 << 3;
            int i4222222 = (i4122222 & 7168) | i33 | (i14 & 14) | (i4122222 & 112) | (i4122222 & 896);
            int i4322222 = i14 << 9;
            c3969l = u11;
            FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor22222, titleColor22222, subtitleColor22222, iconColor22222, compactControl500Medium22222, body400Small22222, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i4222222 | (57344 & i4322222) | (i4322222 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
            dsDisclaimerStyle3 = dsDisclaimerStyle2;
            z16 = z14;
            z17 = z15;
            str3 = str2;
            eVar10 = eVar9;
            eVar11 = eVar7;
            eVar12 = eVar8;
            eVar13 = eVar6;
            c3422b6 = c3422b4;
            c3422b7 = c3422b5;
            function29 = function27;
            function210 = function28;
            function211 = function26;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        c3422b3 = c3422b;
        i15 = i13 & 4;
        if (i15 == 0) {
        }
        i16 = i13 & 8;
        if (i16 != 0) {
        }
        i17 = i13 & 16;
        if (i17 == 0) {
        }
        function24 = function22;
        i18 = i13 & 32;
        if (i18 != 0) {
        }
        i19 = i13 & 64;
        if (i19 != 0) {
        }
        i21 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i21 != 0) {
        }
        i22 = i35;
        i23 = i13 & 256;
        if (i23 == 0) {
        }
        i24 = i23;
        if ((i11 & 805306368) == 0) {
        }
        i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i25 != 0) {
        }
        i28 = i13 & 2048;
        if (i28 != 0) {
        }
        int i37222222 = i27;
        i31 = i13 & 4096;
        if (i31 != 0) {
        }
        if ((i14 & 306783379) != 306783378) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i22 != 0) {
        }
        if (i36 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        if (i18 != 0) {
        }
        if (i19 != 0) {
        }
        if (i21 != 0) {
        }
        if (i24 != 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        if (i26 != 0) {
        }
        if (i29 != 0) {
        }
        if (i31 != 0) {
        }
        function28 = function212;
        u11.j0();
        u11.o(-1989091617);
        if (z15) {
        }
        u11.k();
        if (z14) {
        }
        long backgroundColor222222 = dsDisclaimerStyle2.getBackgroundColor();
        long titleColor222222 = dsDisclaimerStyle2.getTitleColor();
        long subtitleColor222222 = dsDisclaimerStyle2.getSubtitleColor();
        long iconColor222222 = dsDisclaimerStyle2.getIconColor();
        UniTheme uniTheme222222 = UniTheme.INSTANCE;
        T compactControl500Medium222222 = uniTheme222222.getTypography().getCompactControl500Medium();
        T body400Small222222 = uniTheme222222.getTypography().getBody400Small();
        u11.o(-1989073206);
        if (z14) {
        }
        u11.k();
        int i41222222 = i32 << 3;
        int i42222222 = (i41222222 & 7168) | i33 | (i14 & 14) | (i41222222 & 112) | (i41222222 & 896);
        int i43222222 = i14 << 9;
        c3969l = u11;
        FoundationDisclaimerKt.m2989FoundationDisclaimer4FN_7CA(eVar9, eVar7, eVar8, eVar6, c3422b4, c3422b5, abstractC8972b2, i39, Integer.MAX_VALUE, function27, function28, function26, backgroundColor222222, titleColor222222, subtitleColor222222, iconColor222222, compactControl500Medium222222, body400Small222222, abstractC8972b, dsDisclaimerStyle2.getIconChevronColor(), DsSpacings.INSTANCE.m1859getDp6D9Ej5fM(), c3969l, i42222222 | (57344 & i43222222) | (i43222222 & 458752) | ((i14 << 12) & 1879048192), (i14 >> 9) & 126, 6, 0);
        dsDisclaimerStyle3 = dsDisclaimerStyle2;
        z16 = z14;
        z17 = z15;
        str3 = str2;
        eVar10 = eVar9;
        eVar11 = eVar7;
        eVar12 = eVar8;
        eVar13 = eVar6;
        c3422b6 = c3422b4;
        c3422b7 = c3422b5;
        function29 = function27;
        function210 = function28;
        function211 = function26;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
