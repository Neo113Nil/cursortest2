package ru.ozon.uni.android.ds.compose.component.tabs;

import A0.h;
import B1.U;
import B1.V;
import B1.W;
import B1.m0;
import D1.InterfaceC2801g;
import E0.C2942q;
import Ep.a;
import Fr.g;
import I1.o;
import J0.C3354v2;
import K00.b;
import P0.p2;
import S0.A0;
import S0.C3956f1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3972m0;
import S0.J0;
import T7.E;
import android.content.Context;
import androidx.compose.foundation.i;
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
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import e1.j;
import i1.C6988h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.ds.compose.component.common.CommonAtomIconKt;
import ru.ozon.uni.android.ds.compose.factory.DSComposeAtomsFactoryKt;
import ru.ozon.uni.android.ds.compose.modifier.AnalyticsModifierKt;
import ru.ozon.uni.android.ds.compose.modifier.AtomLocatorKt;
import ru.ozon.uni.android.ds.compose.modifier.ShadowKt;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.common.Rounds;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001aO\u0010$\u001a\u00020\u0002*\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u0015\u001a\u00020\u00112\b\b\u0002\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0003¢\u0006\u0004\b\"\u0010#\"\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006)"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "", "onTabSelected", "DsTabsAtom", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;Landroidx/compose/ui/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LS0/k;II)V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;", "styleType", "Lkotlin/Function0;", "onSelect", "", "roundCorners", "Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;", "style", "isSelected", "showSubtitle", "DsTabAtom", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;Lru/ozon/uni/atoms/data/tabs/TabsDTO$Style;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/e;Lru/ozon/uni/android/ds/compose/component/tabs/DsTabsStyle;ZZLS0/k;II)V", "Ll1/Z;", "titleColor", "TabRow-RPmYEkk", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO$TabDTO;JLS0/k;I)V", "TabRow", "Ll1/Q;", "bgGradient", "bgColor", "hasShadow", "tabModifier-TgFrcIs", "(Landroidx/compose/ui/e;Ll1/Q;JZZZLkotlin/jvm/functions/Function0;LS0/k;II)Landroidx/compose/ui/e;", "tabModifier", "LZ1/h;", "rowContentGap", "F", "contentMinWidth", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DsTabsAtomKt {
    private static final float contentMinWidth;
    private static final float rowContentGap;

    static {
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        rowContentGap = dsSpacings.m1854getDp4D9Ej5fM();
        contentMinWidth = dsSpacings.m1849getDp22D9Ej5fM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTabAtom(TabsDTO.TabDTO tabDTO, TabsDTO.Style style, Function0<Unit> function0, boolean z11, e eVar, DsTabsStyle dsTabsStyle, boolean z12, boolean z13, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        boolean z14;
        int i14;
        e eVar2;
        DsTabsStyle dsTabsStyle2;
        int i15;
        boolean z15;
        int i16;
        boolean z16;
        boolean z17;
        boolean z18;
        long bgColor;
        int I11;
        C3969l c3969l;
        e eVar3;
        boolean z19;
        boolean z21;
        String subtitle;
        String subtitleColor;
        String titleColor;
        String selectedBackgroundColor;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-152233373);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(tabDTO) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(style) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.F(function0) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            if ((i12 & 8) == 0) {
                i13 |= 3072;
            } else if ((i11 & 3072) == 0) {
                z14 = z11;
                i13 |= u11.p(z14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                i14 = i12 & 16;
                if (i14 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    eVar2 = eVar;
                    i13 |= u11.n(eVar2) ? 16384 : 8192;
                    if ((i12 & 32) == 0) {
                        i13 |= 196608;
                    } else if ((i11 & 196608) == 0) {
                        dsTabsStyle2 = dsTabsStyle;
                        i13 |= u11.n(dsTabsStyle2) ? 131072 : 65536;
                        i15 = i12 & 64;
                        if (i15 != 0) {
                            i13 |= 1572864;
                        } else if ((1572864 & i11) == 0) {
                            z15 = z12;
                            i13 |= u11.p(z15) ? 1048576 : 524288;
                            i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                            if (i16 == 0) {
                                i13 |= 12582912;
                            } else if ((12582912 & i11) == 0) {
                                z16 = z13;
                                i13 |= u11.p(z16) ? 8388608 : 4194304;
                                int i17 = i13;
                                if ((4793491 & i13) == 4793490 || !u11.b()) {
                                    if (i14 != 0) {
                                        eVar2 = e.f40358c0;
                                    }
                                    z17 = i15 != 0 ? false : z15;
                                    z18 = i16 != 0 ? true : z16;
                                    u11.o(-1353493406);
                                    C7807Z c7807z = null;
                                    AbstractC7799Q abstractC7799Q = (z17 || style != TabsDTO.Style.CUSTOM || (selectedBackgroundColor = tabDTO.getSelectedBackgroundColor()) == null) ? null : TokenParserKt.tokenToGradient(selectedBackgroundColor, u11, 0);
                                    u11.k();
                                    u11.o(-1353489474);
                                    if (z17) {
                                        if (style == TabsDTO.Style.CUSTOM) {
                                            String selectedBackgroundColor2 = tabDTO.getSelectedBackgroundColor();
                                            C7807Z c7807z2 = selectedBackgroundColor2 == null ? null : TokenParserKt.tokenToColor(selectedBackgroundColor2, u11, 0);
                                            if (c7807z2 != null) {
                                                bgColor = c7807z2.w();
                                            }
                                        }
                                        bgColor = dsTabsStyle2.getBgColorSelected();
                                    } else {
                                        bgColor = dsTabsStyle2.getBgColor();
                                    }
                                    u11.k();
                                    u11.o(-1353482524);
                                    TabsDTO.Style style2 = TabsDTO.Style.CUSTOM;
                                    C7807Z c7807z3 = (style == style2 || (titleColor = tabDTO.getTitleColor()) == null) ? null : TokenParserKt.tokenToColor(titleColor, u11, 0);
                                    u11.k();
                                    long w11 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
                                    e m1793tabModifierTgFrcIs = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i17 >> 9) & 7168) | ((i17 >> 12) & 14) | ((i17 << 6) & 458752) | ((i17 << 12) & 3670016), 0);
                                    boolean z22 = z17;
                                    C5194q a11 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                                    I11 = u11.I();
                                    A0 d11 = u11.d();
                                    e f7 = c.f(u11, m1793tabModifierTgFrcIs);
                                    Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                                    if (u11.t()) {
                                        u11.H(a12);
                                    } else {
                                        u11.e();
                                    }
                                    Function2 g10 = b.g(u11, a11, u11, d11);
                                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                        a.d(I11, u11, I11, g10);
                                    }
                                    F1.b(u11, f7, InterfaceC2801g.a.f());
                                    m1791TabRowRPmYEkk(tabDTO, w11, u11, i17 & 14);
                                    u11.o(1610760130);
                                    if (z18 || (subtitle = tabDTO.getSubtitle()) == null) {
                                        c3969l = u11;
                                    } else {
                                        u11.o(1610762534);
                                        if (style == style2 && (subtitleColor = tabDTO.getSubtitleColor()) != null) {
                                            c7807z = TokenParserKt.tokenToColor(subtitleColor, u11, 0);
                                        }
                                        u11.k();
                                        p2.b(subtitle, null, c7807z != null ? c7807z.w() : z22 ? dsTabsStyle2.getSubtitleColorSelected() : dsTabsStyle2.getSubtitleColor(), 0L, 0L, null, 0L, 2, false, 1, 0, UniTheme.INSTANCE.getTypography().getBody300XSmall(), u11, 0, 3120, 55290);
                                        c3969l = u11;
                                    }
                                    c3969l.k();
                                    c3969l.f();
                                    eVar3 = eVar2;
                                    z19 = z18;
                                    z21 = z22;
                                } else {
                                    u11.j();
                                    c3969l = u11;
                                    eVar3 = eVar2;
                                    z21 = z15;
                                    z19 = z16;
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new DsTabsAtomKt$DsTabAtom$2(tabDTO, style, function0, z11, eVar3, dsTabsStyle, z21, z19, i11, i12));
                                    return;
                                }
                                return;
                            }
                            z16 = z13;
                            int i172 = i13;
                            if ((4793491 & i13) == 4793490) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            u11.o(-1353493406);
                            C7807Z c7807z4 = null;
                            if (z17) {
                            }
                            u11.k();
                            u11.o(-1353489474);
                            if (z17) {
                            }
                            u11.k();
                            u11.o(-1353482524);
                            TabsDTO.Style style22 = TabsDTO.Style.CUSTOM;
                            if (style == style22) {
                            }
                            u11.k();
                            long w112 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
                            e m1793tabModifierTgFrcIs2 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i172 >> 9) & 7168) | ((i172 >> 12) & 14) | ((i172 << 6) & 458752) | ((i172 << 12) & 3670016), 0);
                            boolean z222 = z17;
                            C5194q a112 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                            I11 = u11.I();
                            A0 d112 = u11.d();
                            e f72 = c.f(u11, m1793tabModifierTgFrcIs2);
                            Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 g102 = b.g(u11, a112, u11, d112);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, g102);
                            F1.b(u11, f72, InterfaceC2801g.a.f());
                            m1791TabRowRPmYEkk(tabDTO, w112, u11, i172 & 14);
                            u11.o(1610760130);
                            if (z18) {
                            }
                            c3969l = u11;
                            c3969l.k();
                            c3969l.f();
                            eVar3 = eVar2;
                            z19 = z18;
                            z21 = z222;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        z15 = z12;
                        i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i16 == 0) {
                        }
                        z16 = z13;
                        int i1722 = i13;
                        if ((4793491 & i13) == 4793490) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        u11.o(-1353493406);
                        C7807Z c7807z42 = null;
                        if (z17) {
                        }
                        u11.k();
                        u11.o(-1353489474);
                        if (z17) {
                        }
                        u11.k();
                        u11.o(-1353482524);
                        TabsDTO.Style style222 = TabsDTO.Style.CUSTOM;
                        if (style == style222) {
                        }
                        u11.k();
                        long w1122 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
                        e m1793tabModifierTgFrcIs22 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i1722 >> 9) & 7168) | ((i1722 >> 12) & 14) | ((i1722 << 6) & 458752) | ((i1722 << 12) & 3670016), 0);
                        boolean z2222 = z17;
                        C5194q a1122 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                        I11 = u11.I();
                        A0 d1122 = u11.d();
                        e f722 = c.f(u11, m1793tabModifierTgFrcIs22);
                        Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 g1022 = b.g(u11, a1122, u11, d1122);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, g1022);
                        F1.b(u11, f722, InterfaceC2801g.a.f());
                        m1791TabRowRPmYEkk(tabDTO, w1122, u11, i1722 & 14);
                        u11.o(1610760130);
                        if (z18) {
                        }
                        c3969l = u11;
                        c3969l.k();
                        c3969l.f();
                        eVar3 = eVar2;
                        z19 = z18;
                        z21 = z2222;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    dsTabsStyle2 = dsTabsStyle;
                    i15 = i12 & 64;
                    if (i15 != 0) {
                    }
                    z15 = z12;
                    i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i16 == 0) {
                    }
                    z16 = z13;
                    int i17222 = i13;
                    if ((4793491 & i13) == 4793490) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    u11.o(-1353493406);
                    C7807Z c7807z422 = null;
                    if (z17) {
                    }
                    u11.k();
                    u11.o(-1353489474);
                    if (z17) {
                    }
                    u11.k();
                    u11.o(-1353482524);
                    TabsDTO.Style style2222 = TabsDTO.Style.CUSTOM;
                    if (style == style2222) {
                    }
                    u11.k();
                    long w11222 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
                    e m1793tabModifierTgFrcIs222 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i17222 >> 9) & 7168) | ((i17222 >> 12) & 14) | ((i17222 << 6) & 458752) | ((i17222 << 12) & 3670016), 0);
                    boolean z22222 = z17;
                    C5194q a11222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f7222 = c.f(u11, m1793tabModifierTgFrcIs222);
                    Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 g10222 = b.g(u11, a11222, u11, d11222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, g10222);
                    F1.b(u11, f7222, InterfaceC2801g.a.f());
                    m1791TabRowRPmYEkk(tabDTO, w11222, u11, i17222 & 14);
                    u11.o(1610760130);
                    if (z18) {
                    }
                    c3969l = u11;
                    c3969l.k();
                    c3969l.f();
                    eVar3 = eVar2;
                    z19 = z18;
                    z21 = z22222;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                eVar2 = eVar;
                if ((i12 & 32) == 0) {
                }
                dsTabsStyle2 = dsTabsStyle;
                i15 = i12 & 64;
                if (i15 != 0) {
                }
                z15 = z12;
                i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i16 == 0) {
                }
                z16 = z13;
                int i172222 = i13;
                if ((4793491 & i13) == 4793490) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                u11.o(-1353493406);
                C7807Z c7807z4222 = null;
                if (z17) {
                }
                u11.k();
                u11.o(-1353489474);
                if (z17) {
                }
                u11.k();
                u11.o(-1353482524);
                TabsDTO.Style style22222 = TabsDTO.Style.CUSTOM;
                if (style == style22222) {
                }
                u11.k();
                long w112222 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
                e m1793tabModifierTgFrcIs2222 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i172222 >> 9) & 7168) | ((i172222 >> 12) & 14) | ((i172222 << 6) & 458752) | ((i172222 << 12) & 3670016), 0);
                boolean z222222 = z17;
                C5194q a112222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
                I11 = u11.I();
                A0 d112222 = u11.d();
                e f72222 = c.f(u11, m1793tabModifierTgFrcIs2222);
                Function0 a122222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 g102222 = b.g(u11, a112222, u11, d112222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, g102222);
                F1.b(u11, f72222, InterfaceC2801g.a.f());
                m1791TabRowRPmYEkk(tabDTO, w112222, u11, i172222 & 14);
                u11.o(1610760130);
                if (z18) {
                }
                c3969l = u11;
                c3969l.k();
                c3969l.f();
                eVar3 = eVar2;
                z19 = z18;
                z21 = z222222;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            z14 = z11;
            i14 = i12 & 16;
            if (i14 != 0) {
            }
            eVar2 = eVar;
            if ((i12 & 32) == 0) {
            }
            dsTabsStyle2 = dsTabsStyle;
            i15 = i12 & 64;
            if (i15 != 0) {
            }
            z15 = z12;
            i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i16 == 0) {
            }
            z16 = z13;
            int i1722222 = i13;
            if ((4793491 & i13) == 4793490) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            u11.o(-1353493406);
            C7807Z c7807z42222 = null;
            if (z17) {
            }
            u11.k();
            u11.o(-1353489474);
            if (z17) {
            }
            u11.k();
            u11.o(-1353482524);
            TabsDTO.Style style222222 = TabsDTO.Style.CUSTOM;
            if (style == style222222) {
            }
            u11.k();
            long w1122222 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
            e m1793tabModifierTgFrcIs22222 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i1722222 >> 9) & 7168) | ((i1722222 >> 12) & 14) | ((i1722222 << 6) & 458752) | ((i1722222 << 12) & 3670016), 0);
            boolean z2222222 = z17;
            C5194q a1122222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
            I11 = u11.I();
            A0 d1122222 = u11.d();
            e f722222 = c.f(u11, m1793tabModifierTgFrcIs22222);
            Function0 a1222222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 g1022222 = b.g(u11, a1122222, u11, d1122222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, g1022222);
            F1.b(u11, f722222, InterfaceC2801g.a.f());
            m1791TabRowRPmYEkk(tabDTO, w1122222, u11, i1722222 & 14);
            u11.o(1610760130);
            if (z18) {
            }
            c3969l = u11;
            c3969l.k();
            c3969l.f();
            eVar3 = eVar2;
            z19 = z18;
            z21 = z2222222;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i12 & 8) == 0) {
        }
        z14 = z11;
        i14 = i12 & 16;
        if (i14 != 0) {
        }
        eVar2 = eVar;
        if ((i12 & 32) == 0) {
        }
        dsTabsStyle2 = dsTabsStyle;
        i15 = i12 & 64;
        if (i15 != 0) {
        }
        z15 = z12;
        i16 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i16 == 0) {
        }
        z16 = z13;
        int i17222222 = i13;
        if ((4793491 & i13) == 4793490) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        u11.o(-1353493406);
        C7807Z c7807z422222 = null;
        if (z17) {
        }
        u11.k();
        u11.o(-1353489474);
        if (z17) {
        }
        u11.k();
        u11.o(-1353482524);
        TabsDTO.Style style2222222 = TabsDTO.Style.CUSTOM;
        if (style == style2222222) {
        }
        u11.k();
        long w11222222 = c7807z3 != null ? c7807z3.w() : z17 ? dsTabsStyle2.getTitleColorSelected() : dsTabsStyle2.getTitleColor();
        e m1793tabModifierTgFrcIs222222 = m1793tabModifierTgFrcIs(eVar2, abstractC7799Q, bgColor, z17, style == TabsDTO.Style.BASE, z14, function0, u11, ((i17222222 >> 9) & 7168) | ((i17222222 >> 12) & 14) | ((i17222222 << 6) & 458752) | ((i17222222 << 12) & 3670016), 0);
        boolean z22222222 = z17;
        C5194q a11222222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.g(), u11, 48);
        I11 = u11.I();
        A0 d11222222 = u11.d();
        e f7222222 = c.f(u11, m1793tabModifierTgFrcIs222222);
        Function0 a12222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 g10222222 = b.g(u11, a11222222, u11, d11222222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, g10222222);
        F1.b(u11, f7222222, InterfaceC2801g.a.f());
        m1791TabRowRPmYEkk(tabDTO, w11222222, u11, i17222222 & 14);
        u11.o(1610760130);
        if (z18) {
        }
        c3969l = u11;
        c3969l.k();
        c3969l.f();
        eVar3 = eVar2;
        z19 = z18;
        z21 = z22222222;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsTabsAtom(@NotNull TabsDTO tabsDTO, e eVar, Function1<? super AtomAction, Unit> function1, Function1<? super Integer, Unit> function12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        Function1<? super AtomAction, Unit> function13;
        int i15;
        Function1<? super Integer, Unit> function14;
        Function1<? super AtomAction, Unit> function15;
        Object C11;
        List<TabsDTO.TabDTO> tabs;
        Iterator<T> it;
        boolean z11;
        int I11;
        C3969l c3969l;
        e eVar3;
        Function1<? super Integer, Unit> function16;
        Function1<? super AtomAction, Unit> function17;
        char c11;
        Function0 function0;
        String backgroundColor;
        String backgroundColor2;
        J0 m02;
        TabsDTO dto = tabsDTO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(40540062);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.F(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                function13 = function1;
                i13 |= u11.F(function13) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                i15 = i12 & 8;
                if (i15 != 0) {
                    i13 |= 3072;
                } else if ((i11 & 3072) == 0) {
                    function14 = function12;
                    i13 |= u11.F(function14) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
                    if ((i13 & 1171) == 1170 || !u11.b()) {
                        e eVar4 = i16 == 0 ? e.f40358c0 : eVar2;
                        if (i14 == 0) {
                            u11.o(955796506);
                            Object C12 = u11.C();
                            if (C12 == InterfaceC3967k.a.a()) {
                                C12 = DsTabsAtomKt$DsTabsAtom$1$1.INSTANCE;
                                u11.x(C12);
                            }
                            function15 = (Function1) C12;
                            u11.k();
                        } else {
                            function15 = function13;
                        }
                        Function1<? super Integer, Unit> function18 = i15 == 0 ? null : function14;
                        e viewAnalytics = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                        DsTabsStyle tabsStyle = DsTabsAtomMappersKt.getTabsStyle(dto.getTabStyle(), u11, 0);
                        u11.o(955801996);
                        C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = C3956f1.a(dto.getSelectedTabIndex());
                            u11.x(C11);
                        }
                        InterfaceC3972m0 interfaceC3972m0 = (InterfaceC3972m0) C11;
                        u11.k();
                        tabs = dto.getTabs();
                        if ((tabs instanceof Collection) || !tabs.isEmpty()) {
                            it = tabs.iterator();
                            while (it.hasNext()) {
                                String subtitle = ((TabsDTO.TabDTO) it.next()).getSubtitle();
                                if (subtitle == null || subtitle.length() == 0) {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        z11 = true;
                        boolean z12 = true;
                        boolean z13 = !Intrinsics.d(dto.getHideSubtitle(), Boolean.FALSE) && z11 && (dto.getTabStyle() == TabsDTO.Style.BASE || dto.getTabStyle() == TabsDTO.Style.CUSTOM);
                        DsTabsLocator dsTabsLocator = new DsTabsLocator(dto.getTestInfo(), null, 2, null);
                        Rounds round = dto.getRound();
                        Boolean valueOf = round == null ? Boolean.valueOf(round.getRoundCorners()) : null;
                        u11.o(955812792);
                        boolean roundCornersFlag = valueOf != null ? UniGlobalConfigKt.getRoundCornersFlag((Context) u11.m(AndroidCompositionLocals_androidKt.d())) : valueOf.booleanValue();
                        u11.k();
                        DsSpacings dsSpacings = DsSpacings.INSTANCE;
                        float m1848getDp20D9Ej5fM = !roundCornersFlag ? dsSpacings.m1848getDp20D9Ej5fM() : dsSpacings.m1845getDp16D9Ej5fM();
                        u11.o(955817898);
                        TabsDTO.Style tabStyle = dto.getTabStyle();
                        TabsDTO.Style style = TabsDTO.Style.CUSTOM;
                        AbstractC7799Q abstractC7799Q = (tabStyle == style || (backgroundColor2 = dto.getBackgroundColor()) == null) ? null : TokenParserKt.tokenToGradient(backgroundColor2, u11, 0);
                        u11.k();
                        u11.o(955822631);
                        C7807Z c7807z = (dto.getTabStyle() == style || (backgroundColor = dto.getBackgroundColor()) == null) ? null : TokenParserKt.tokenToColor(backgroundColor, u11, 0);
                        u11.k();
                        boolean z14 = z13;
                        long w11 = c7807z == null ? c7807z.w() : tabsStyle.getBgColor();
                        float f7 = 1.0f;
                        e a11 = C6988h.a(a0.e(viewAnalytics, 1.0f), h.b(m1848getDp20D9Ej5fM));
                        e testTag = AtomLocatorKt.testTag(T.f(abstractC7799Q == null ? androidx.compose.foundation.e.a(a11, abstractC7799Q, null, 6) : androidx.compose.foundation.e.b(a11, w11, y0.a()), DsSpacings.INSTANCE.m1847getDp2D9Ej5fM()), dsTabsLocator);
                        boolean z15 = false;
                        Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f11 = c.f(u11, testTag);
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a12);
                        }
                        Function2 h11 = Cm.e.h(u11, b11, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        F1.b(u11, f11, InterfaceC2801g.a.f());
                        u11.o(1235324625);
                        int i17 = 0;
                        for (Object obj : C7714v.K0(dto.getTabs(), 3)) {
                            int i18 = i17 + 1;
                            if (i17 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            TabsDTO.TabDTO tabDTO = (TabsDTO.TabDTO) obj;
                            CommonControlSettings common = tabDTO.getCommon();
                            AtomAction atomAction = common != null ? common.toAtomAction() : null;
                            u11.o(1235326348);
                            if (atomAction == null) {
                                c11 = 256;
                                function0 = null;
                            } else {
                                u11.o(1908965976);
                                c11 = 256;
                                boolean n11 = ((i13 & 896) == 256 ? z12 : z15) | u11.n(atomAction);
                                Object C13 = u11.C();
                                if (n11 || C13 == InterfaceC3967k.a.a()) {
                                    C13 = new DsTabsAtomKt$DsTabsAtom$3$1$tabAction$1$1$1(function15, atomAction);
                                    u11.x(C13);
                                }
                                function0 = (Function0) C13;
                                u11.k();
                            }
                            u11.k();
                            boolean z16 = interfaceC3972m0.getIntValue() == i17 ? z12 : z15;
                            BadgeDTO badge = tabDTO.getBadge();
                            BadgeDTO tabBadge = badge != null ? DsTabsAtomMappersKt.toTabBadge(badge) : null;
                            IndicatorDTO indicator = tabDTO.getIndicator();
                            TabsDTO.TabDTO copy$default = TabsDTO.TabDTO.copy$default(tabDTO, null, null, tabBadge, indicator != null ? DsTabsAtomMappersKt.toTabIndicator(indicator, dto.getStyleType()) : null, null, null, null, null, null, null, 1011, null);
                            e.a aVar = e.f40358c0;
                            C3969l c3969l2 = u11;
                            if (f7 <= 0.0d) {
                                throw new IllegalArgumentException(C2942q.b(1.0f, "invalid weight ", "; must be greater than zero").toString());
                            }
                            e testTag2 = AtomLocatorKt.testTag(j.a(new LayoutWeightElement(f7 <= Float.MAX_VALUE ? f7 : Float.MAX_VALUE, z12), z16 ? 1.0f : 0.0f), dsTabsLocator.getTab().invoke(Integer.valueOf(i17)));
                            e eVar5 = eVar4;
                            TabsDTO.Style tabStyle2 = dto.getTabStyle();
                            Function1<? super AtomAction, Unit> function19 = function15;
                            c3969l2.o(-1916109473);
                            boolean n12 = ((i13 & 7168) == 2048) | c3969l2.n(tabDTO) | c3969l2.r(i17) | c3969l2.n(function0);
                            Object C14 = c3969l2.C();
                            if (n12 || C14 == InterfaceC3967k.a.a()) {
                                DsTabsAtomKt$DsTabsAtom$3$1$1$1 dsTabsAtomKt$DsTabsAtom$3$1$1$1 = new DsTabsAtomKt$DsTabsAtom$3$1$1$1(tabDTO, interfaceC3972m0, i17, function18, function0);
                                c3969l2.x(dsTabsAtomKt$DsTabsAtom$3$1$1$1);
                                C14 = dsTabsAtomKt$DsTabsAtom$3$1$1$1;
                            }
                            Function0 function02 = (Function0) C14;
                            c3969l2.k();
                            boolean z17 = roundCornersFlag;
                            u11 = c3969l2;
                            DsTabAtom(copy$default, tabStyle2, function02, z17, testTag2, tabsStyle, z16, z14, u11, 0, 0);
                            dto = tabsDTO;
                            eVar4 = eVar5;
                            roundCornersFlag = z17;
                            z15 = false;
                            i17 = i18;
                            function15 = function19;
                            f7 = 1.0f;
                            z12 = true;
                        }
                        c3969l = u11;
                        c3969l.k();
                        c3969l.f();
                        eVar3 = eVar4;
                        function16 = function18;
                        function17 = function15;
                    } else {
                        u11.j();
                        eVar3 = eVar2;
                        function17 = function13;
                        function16 = function14;
                        c3969l = u11;
                    }
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new DsTabsAtomKt$DsTabsAtom$4(tabsDTO, eVar3, function17, function16, i11, i12));
                        return;
                    }
                    return;
                }
                function14 = function12;
                if ((i13 & 1171) == 1170) {
                }
                if (i16 == 0) {
                }
                if (i14 == 0) {
                }
                if (i15 == 0) {
                }
                e viewAnalytics2 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
                DsTabsStyle tabsStyle2 = DsTabsAtomMappersKt.getTabsStyle(dto.getTabStyle(), u11, 0);
                u11.o(955801996);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                }
                InterfaceC3972m0 interfaceC3972m02 = (InterfaceC3972m0) C11;
                u11.k();
                tabs = dto.getTabs();
                if (tabs instanceof Collection) {
                }
                it = tabs.iterator();
                while (it.hasNext()) {
                }
                z11 = true;
                boolean z122 = true;
                if (Intrinsics.d(dto.getHideSubtitle(), Boolean.FALSE)) {
                }
                DsTabsLocator dsTabsLocator2 = new DsTabsLocator(dto.getTestInfo(), null, 2, null);
                Rounds round2 = dto.getRound();
                if (round2 == null) {
                }
                u11.o(955812792);
                if (valueOf != null) {
                }
                u11.k();
                DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                if (!roundCornersFlag) {
                }
                u11.o(955817898);
                TabsDTO.Style tabStyle3 = dto.getTabStyle();
                TabsDTO.Style style2 = TabsDTO.Style.CUSTOM;
                if (tabStyle3 == style2) {
                }
                u11.k();
                u11.o(955822631);
                if (dto.getTabStyle() == style2) {
                }
                u11.k();
                boolean z142 = z13;
                long w112 = c7807z == null ? c7807z.w() : tabsStyle2.getBgColor();
                float f72 = 1.0f;
                e a112 = C6988h.a(a0.e(viewAnalytics2, 1.0f), h.b(m1848getDp20D9Ej5fM));
                e testTag3 = AtomLocatorKt.testTag(T.f(abstractC7799Q == null ? androidx.compose.foundation.e.a(a112, abstractC7799Q, null, 6) : androidx.compose.foundation.e.b(a112, w112, y0.a()), DsSpacings.INSTANCE.m1847getDp2D9Ej5fM()), dsTabsLocator2);
                boolean z152 = false;
                Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f112 = c.f(u11, testTag3);
                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b112, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h112);
                F1.b(u11, f112, InterfaceC2801g.a.f());
                u11.o(1235324625);
                int i172 = 0;
                while (r23.hasNext()) {
                }
                c3969l = u11;
                c3969l.k();
                c3969l.f();
                eVar3 = eVar4;
                function16 = function18;
                function17 = function15;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            function13 = function1;
            i15 = i12 & 8;
            if (i15 != 0) {
            }
            function14 = function12;
            if ((i13 & 1171) == 1170) {
            }
            if (i16 == 0) {
            }
            if (i14 == 0) {
            }
            if (i15 == 0) {
            }
            e viewAnalytics22 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
            DsTabsStyle tabsStyle22 = DsTabsAtomMappersKt.getTabsStyle(dto.getTabStyle(), u11, 0);
            u11.o(955801996);
            C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
            }
            InterfaceC3972m0 interfaceC3972m022 = (InterfaceC3972m0) C11;
            u11.k();
            tabs = dto.getTabs();
            if (tabs instanceof Collection) {
            }
            it = tabs.iterator();
            while (it.hasNext()) {
            }
            z11 = true;
            boolean z1222 = true;
            if (Intrinsics.d(dto.getHideSubtitle(), Boolean.FALSE)) {
            }
            DsTabsLocator dsTabsLocator22 = new DsTabsLocator(dto.getTestInfo(), null, 2, null);
            Rounds round22 = dto.getRound();
            if (round22 == null) {
            }
            u11.o(955812792);
            if (valueOf != null) {
            }
            u11.k();
            DsSpacings dsSpacings22 = DsSpacings.INSTANCE;
            if (!roundCornersFlag) {
            }
            u11.o(955817898);
            TabsDTO.Style tabStyle32 = dto.getTabStyle();
            TabsDTO.Style style22 = TabsDTO.Style.CUSTOM;
            if (tabStyle32 == style22) {
            }
            u11.k();
            u11.o(955822631);
            if (dto.getTabStyle() == style22) {
            }
            u11.k();
            boolean z1422 = z13;
            long w1122 = c7807z == null ? c7807z.w() : tabsStyle22.getBgColor();
            float f722 = 1.0f;
            e a1122 = C6988h.a(a0.e(viewAnalytics22, 1.0f), h.b(m1848getDp20D9Ej5fM));
            e testTag32 = AtomLocatorKt.testTag(T.f(abstractC7799Q == null ? androidx.compose.foundation.e.a(a1122, abstractC7799Q, null, 6) : androidx.compose.foundation.e.b(a1122, w1122, y0.a()), DsSpacings.INSTANCE.m1847getDp2D9Ej5fM()), dsTabsLocator22);
            boolean z1522 = false;
            Y b1122 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f1122 = c.f(u11, testTag32);
            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1122, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h1122);
            F1.b(u11, f1122, InterfaceC2801g.a.f());
            u11.o(1235324625);
            int i1722 = 0;
            while (r23.hasNext()) {
            }
            c3969l = u11;
            c3969l.k();
            c3969l.f();
            eVar3 = eVar4;
            function16 = function18;
            function17 = function15;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        function13 = function1;
        i15 = i12 & 8;
        if (i15 != 0) {
        }
        function14 = function12;
        if ((i13 & 1171) == 1170) {
        }
        if (i16 == 0) {
        }
        if (i14 == 0) {
        }
        if (i15 == 0) {
        }
        e viewAnalytics222 = AnalyticsModifierKt.viewAnalytics(eVar4, dto);
        DsTabsStyle tabsStyle222 = DsTabsAtomMappersKt.getTabsStyle(dto.getTabStyle(), u11, 0);
        u11.o(955801996);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        InterfaceC3972m0 interfaceC3972m0222 = (InterfaceC3972m0) C11;
        u11.k();
        tabs = dto.getTabs();
        if (tabs instanceof Collection) {
        }
        it = tabs.iterator();
        while (it.hasNext()) {
        }
        z11 = true;
        boolean z12222 = true;
        if (Intrinsics.d(dto.getHideSubtitle(), Boolean.FALSE)) {
        }
        DsTabsLocator dsTabsLocator222 = new DsTabsLocator(dto.getTestInfo(), null, 2, null);
        Rounds round222 = dto.getRound();
        if (round222 == null) {
        }
        u11.o(955812792);
        if (valueOf != null) {
        }
        u11.k();
        DsSpacings dsSpacings222 = DsSpacings.INSTANCE;
        if (!roundCornersFlag) {
        }
        u11.o(955817898);
        TabsDTO.Style tabStyle322 = dto.getTabStyle();
        TabsDTO.Style style222 = TabsDTO.Style.CUSTOM;
        if (tabStyle322 == style222) {
        }
        u11.k();
        u11.o(955822631);
        if (dto.getTabStyle() == style222) {
        }
        u11.k();
        boolean z14222 = z13;
        long w11222 = c7807z == null ? c7807z.w() : tabsStyle222.getBgColor();
        float f7222 = 1.0f;
        e a11222 = C6988h.a(a0.e(viewAnalytics222, 1.0f), h.b(m1848getDp20D9Ej5fM));
        e testTag322 = AtomLocatorKt.testTag(T.f(abstractC7799Q == null ? androidx.compose.foundation.e.a(a11222, abstractC7799Q, null, 6) : androidx.compose.foundation.e.b(a11222, w11222, y0.a()), DsSpacings.INSTANCE.m1847getDp2D9Ej5fM()), dsTabsLocator222);
        boolean z15222 = false;
        Y b11222 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f11222 = c.f(u11, testTag322);
        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b11222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h11222);
        F1.b(u11, f11222, InterfaceC2801g.a.f());
        u11.o(1235324625);
        int i17222 = 0;
        while (r23.hasNext()) {
        }
        c3969l = u11;
        c3969l.k();
        c3969l.f();
        eVar3 = eVar4;
        function16 = function18;
        function17 = function15;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TabRow-RPmYEkk, reason: not valid java name */
    public static final void m1791TabRowRPmYEkk(TabsDTO.TabDTO tabDTO, long j11, InterfaceC3967k interfaceC3967k, int i11) {
        int i12;
        e.a aVar;
        Unit unit;
        long j12;
        CommonAtomIconDTO icon;
        C3969l u11 = interfaceC3967k.u(1448498844);
        if ((i11 & 6) == 0) {
            i12 = i11 | (u11.n(tabDTO) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && u11.b()) {
            u11.j();
            j12 = j11;
        } else {
            u11.o(-963662959);
            Object C11 = u11.C();
            if (C11 == InterfaceC3967k.a.a()) {
                C11 = new V() { // from class: ru.ozon.uni.android.ds.compose.component.tabs.DsTabsAtomKt$TabRow$2$1

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LB1/m0$a;", "", "invoke", "(LB1/m0$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
                    /* renamed from: ru.ozon.uni.android.ds.compose.component.tabs.DsTabsAtomKt$TabRow$2$1$1, reason: invalid class name */
                    static final class AnonymousClass1 extends AbstractC7737t implements Function1<m0.a, Unit> {
                        final /* synthetic */ m0 $centerPlaceable;
                        final /* synthetic */ m0 $leftPlaceable;
                        final /* synthetic */ int $leftWidth;
                        final /* synthetic */ int $maxHeight;
                        final /* synthetic */ m0 $rightPlaceable;
                        final /* synthetic */ int $rowCenter;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(m0 m0Var, int i11, int i12, m0 m0Var2, int i13, m0 m0Var3) {
                            super(1);
                            this.$leftPlaceable = m0Var;
                            this.$rowCenter = i11;
                            this.$maxHeight = i12;
                            this.$centerPlaceable = m0Var2;
                            this.$leftWidth = i13;
                            this.$rightPlaceable = m0Var3;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(m0.a aVar) {
                            invoke2(aVar);
                            return Unit.f71690a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(m0.a layout) {
                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                            m0 m0Var = this.$leftPlaceable;
                            if (m0Var != null) {
                                layout.h(m0Var, this.$rowCenter, C3354v2.d(this.$maxHeight, 2, m0Var), 0.0f);
                            }
                            m0 m0Var2 = this.$centerPlaceable;
                            layout.h(m0Var2, this.$rowCenter + this.$leftWidth, C3354v2.d(this.$maxHeight, 2, m0Var2), 0.0f);
                            m0 m0Var3 = this.$rightPlaceable;
                            if (m0Var3 != null) {
                                layout.h(m0Var3, this.$centerPlaceable.u0() + this.$rowCenter + this.$leftWidth, C3354v2.d(this.$maxHeight, 2, this.$rightPlaceable), 0.0f);
                            }
                        }
                    }

                    @Override // B1.V
                    /* renamed from: measure-3p2s80s */
                    public final W mo2measure3p2s80s(B1.Y Layout, List<? extends U> measurable, long j13) {
                        Object obj;
                        Object obj2;
                        float f7;
                        int Y02;
                        float f11;
                        int Y03;
                        float f12;
                        int Y04;
                        W z02;
                        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                        Intrinsics.checkNotNullParameter(measurable, "measurable");
                        int k11 = Z1.b.k(j13);
                        List<? extends U> list = measurable;
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (androidx.compose.ui.layout.a.a((U) obj) == LayoutIds.Right) {
                                break;
                            }
                        }
                        U u12 = (U) obj;
                        for (U u13 : list) {
                            if (androidx.compose.ui.layout.a.a(u13) == LayoutIds.Center) {
                                Iterator<T> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        obj2 = null;
                                        break;
                                    }
                                    obj2 = it2.next();
                                    if (androidx.compose.ui.layout.a.a((U) obj2) == LayoutIds.Left) {
                                        break;
                                    }
                                }
                                U u14 = (U) obj2;
                                if (u14 == null) {
                                    Y02 = 0;
                                } else {
                                    f7 = DsTabsAtomKt.contentMinWidth;
                                    Y02 = Layout.Y0(f7);
                                }
                                if (u12 == null) {
                                    Y03 = 0;
                                } else {
                                    f11 = DsTabsAtomKt.contentMinWidth;
                                    Y03 = Layout.Y0(f11);
                                }
                                int i13 = (k11 - Y02) - Y03;
                                Integer valueOf = Integer.valueOf(i13);
                                if (i13 <= 0) {
                                    valueOf = null;
                                }
                                if (valueOf != null) {
                                    Y04 = valueOf.intValue();
                                } else {
                                    f12 = DsTabsAtomKt.contentMinWidth;
                                    Y04 = Layout.Y0(f12);
                                }
                                m0 a02 = u13.a0(Z1.b.c(0, Y04, 0, 0, 13, j13));
                                int u02 = k11 - a02.u0();
                                m0 a03 = u12 != null ? u12.a0(Z1.b.c(Y03, u02 - Y02, 0, 0, 12, j13)) : null;
                                int u03 = a03 != null ? a03.u0() : 0;
                                m0 a04 = u14 != null ? u14.a0(Z1.b.c(Y02, u02 - u03, 0, 0, 12, j13)) : null;
                                int u04 = a04 != null ? a04.u0() : 0;
                                int u05 = (k11 - ((a02.u0() + u04) + u03)) / 2;
                                int max = Math.max(a04 != null ? a04.l0() : 0, Math.max(a02.l0(), a03 != null ? a03.l0() : 0));
                                z02 = Layout.z0(k11, max, kotlin.collections.U.c(), new AnonymousClass1(a04, u05, max, a02, u04, a03));
                                return z02;
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                u11.x(C11);
            }
            V v11 = (V) C11;
            u11.k();
            e.a aVar2 = e.f40358c0;
            int I11 = u11.I();
            A0 d11 = u11.d();
            e f7 = c.f(u11, aVar2);
            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
                u11.H(a11);
            } else {
                u11.e();
            }
            Function2 f11 = E.f(u11, v11, u11, d11);
            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                a.d(I11, u11, I11, f11);
            }
            F1.b(u11, f7, InterfaceC2801g.a.f());
            BadgeDTO badge = tabDTO.getBadge();
            u11.o(805017190);
            if (badge == null) {
                unit = null;
                aVar = aVar2;
            } else {
                aVar = aVar2;
                DSComposeAtomsFactoryKt.Atom(badge, androidx.compose.ui.layout.a.b(T.j(aVar2, 0.0f, 0.0f, rowContentGap, 0.0f, 11), LayoutIds.Left), null, u11, 48, 2);
                u11 = u11;
                unit = Unit.f71690a;
            }
            u11.k();
            u11.o(805017091);
            if (unit == null && (icon = tabDTO.getIcon()) != null) {
                C3969l c3969l = u11;
                CommonAtomIconKt.m1702ScaleIconcf5BqRc(icon, androidx.compose.ui.layout.a.b(T.j(a0.n(aVar, DsSpacings.INSTANCE.m1848getDp20D9Ej5fM()), 0.0f, 0.0f, rowContentGap, 0.0f, 11), LayoutIds.Left), UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicTertiary(), null, c3969l, 48, 4);
                u11 = c3969l;
            }
            u11.k();
            C3969l c3969l2 = u11;
            e.a aVar3 = aVar;
            p2.b(tabDTO.getTitle(), androidx.compose.ui.layout.a.b(aVar, LayoutIds.Center), j11, 0L, 0L, null, 0L, 2, false, 1, 0, UniTheme.INSTANCE.getTypography().getBody500Medium(), c3969l2, ((i12 << 3) & 896) | 48, 3120, 55288);
            j12 = j11;
            u11 = c3969l2;
            IndicatorDTO indicator = tabDTO.getIndicator();
            u11.o(805039209);
            if (indicator != null) {
                DSComposeAtomsFactoryKt.Atom(indicator, androidx.compose.ui.layout.a.b(T.j(aVar3, rowContentGap, 0.0f, 0.0f, 0.0f, 14), LayoutIds.Right), null, u11, 48, 2);
            }
            u11.k();
            u11.f();
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new DsTabsAtomKt$TabRow$3(tabDTO, j12, i11));
        }
    }

    /* renamed from: tabModifier-TgFrcIs, reason: not valid java name */
    private static final e m1793tabModifierTgFrcIs(e eVar, AbstractC7799Q abstractC7799Q, long j11, boolean z11, boolean z12, boolean z13, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        e c11;
        long j12;
        interfaceC3967k.o(-203241761);
        boolean z14 = (i12 & 4) != 0 ? false : z11;
        boolean z15 = (i12 & 8) != 0 ? false : z12;
        A0.g b11 = h.b(z13 ? 19 : DsSpacings.INSTANCE.m1844getDp14D9Ej5fM());
        if (z14 && z15) {
            j12 = C7807Z.f72248b;
            DsSpacings dsSpacings = DsSpacings.INSTANCE;
            c11 = ShadowKt.m1837shadowKolsjDY(eVar, b11, 0.08f, j12, dsSpacings.m1847getDp2D9Ej5fM(), dsSpacings.m1839getDp1D9Ej5fM(), dsSpacings.m1847getDp2D9Ej5fM(), dsSpacings.m1838getDp0D9Ej5fM());
        } else {
            c11 = i.c(C6988h.a(eVar, b11), false, null, null, function0, 7);
        }
        interfaceC3967k.o(-1077483749);
        boolean z16 = (((i11 & 7168) ^ 3072) > 2048 && interfaceC3967k.p(z14)) || (i11 & 3072) == 2048;
        Object C11 = interfaceC3967k.C();
        if (z16 || C11 == InterfaceC3967k.a.a()) {
            C11 = new DsTabsAtomKt$tabModifier$1$1(z14);
            interfaceC3967k.x(C11);
        }
        interfaceC3967k.k();
        e a11 = C6988h.a(o.c(c11, false, (Function1) C11), b11);
        if (z14) {
            a11 = abstractC7799Q != null ? androidx.compose.foundation.e.a(a11, abstractC7799Q, null, 6) : androidx.compose.foundation.e.b(a11, j11, y0.a());
        }
        e f7 = T.f(a11, DsSpacings.INSTANCE.m1861getDp8D9Ej5fM());
        interfaceC3967k.k();
        return f7;
    }
}
