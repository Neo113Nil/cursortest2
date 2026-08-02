package ru.ozon.app.android.regulardraw.ui;

import A0.h;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import J0.u3;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import Tg.b;
import Z1.d;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.K0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.regulardraw.ui.styles.RegularDrawTypographyKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;
import ru.ozon.uni.core.compose.tokens.TokensExtKt;
import ru.ozon.uni.core.models.UniIconToken;
import ru.ozon.uni.core.repository.UniTheme;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u001c\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "dto", "Landroidx/compose/ui/e;", "modifier", "", "badgeBorderColor", "LK1/T;", "textStyle", "Lu0/x;", "textPadding", "LZ1/h;", "cornerRadius", "Lkotlin/Function1;", "LTg/b;", "", "actionHandler", "CustomBadgeAtom-PfoAEA0", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Landroidx/compose/ui/e;Ljava/lang/String;LK1/T;Lu0/x;FLkotlin/jvm/functions/Function1;LS0/k;II)V", "CustomBadgeAtom", "iconId", "iconTint", "BadgeIcon", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;LS0/k;II)V", "width", "Ll1/Z;", "color", "borderOutside-aa2Vgzc", "(Landroidx/compose/ui/e;FJF)Landroidx/compose/ui/e;", "borderOutside", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CustomBadgeAtomKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void BadgeIcon(String str, String str2, e eVar, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        C3969l u11 = interfaceC3967k.u(-932364207);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(str) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= u11.n(str2) ? 32 : 16;
        }
        int i14 = i12 & 4;
        if (i14 != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(eVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i13 & 147) == 146 && u11.b()) {
            u11.j();
            eVar2 = eVar;
        } else {
            if (i14 != 0) {
                eVar = e.f40358c0;
            }
            e eVar3 = eVar;
            u11.o(-996510171);
            boolean z11 = (i13 & 14) == 4;
            Object C11 = u11.C();
            if (z11 || C11 == InterfaceC3967k.a.a()) {
                C11 = str != null ? UniTheme.INSTANCE.getIconTokens().getById(str) : null;
                u11.x(C11);
            }
            UniIconToken uniIconToken = (UniIconToken) C11;
            u11.k();
            if (uniIconToken != null) {
                AbstractC8972b icon = TokensExtKt.getIcon(uniIconToken, u11, UniIconToken.$stable);
                u11.o(-996503069);
                C7807Z c7807z = str2 != null ? TokenParserKt.tokenToColor(str2, u11, (i13 >> 3) & 14) : null;
                u11.k();
                T0.a(icon, null, eVar3, c7807z != null ? c7807z.w() : C7807Z.f72259m, u11, (i13 & 896) | 48);
            }
            eVar2 = eVar3;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new CustomBadgeAtomKt$BadgeIcon$1(str, str2, eVar2, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0329  */
    /* renamed from: CustomBadgeAtom-PfoAEA0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m909CustomBadgeAtomPfoAEA0(@NotNull BadgeDTO dto, e eVar, String str, T t2, InterfaceC9914x interfaceC9914x, float f7, Function1<? super b, Unit> function1, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        int i14;
        String str2;
        T t11;
        int i15;
        InterfaceC9914x interfaceC9914x2;
        int i16;
        float f11;
        int i17;
        Function1<? super b, Unit> function12;
        e eVar3;
        int i18;
        Function1<? super b, Unit> function13;
        T t12;
        InterfaceC9914x interfaceC9914x3;
        float f12;
        AtomAction atomAction;
        e b11;
        int I11;
        String text;
        C3969l c3969l;
        InterfaceC9914x interfaceC9914x4;
        float f13;
        String str3;
        e eVar4;
        Function1<? super b, Unit> function14;
        T t13;
        BadgeDTO.CustomBackground backgroundColor;
        J0 m02;
        int i19;
        Intrinsics.checkNotNullParameter(dto, "dto");
        C3969l u11 = interfaceC3967k.u(1415705789);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(dto) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            i14 = i12 & 4;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i11 & 384) == 0) {
                str2 = str;
                i13 |= u11.n(str2) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                if ((i11 & 3072) == 0) {
                    if ((i12 & 8) == 0) {
                        t11 = t2;
                        if (u11.n(t11)) {
                            i19 = 2048;
                            i13 |= i19;
                        }
                    } else {
                        t11 = t2;
                    }
                    i19 = UserVerificationMethods.USER_VERIFY_ALL;
                    i13 |= i19;
                } else {
                    t11 = t2;
                }
                i15 = i12 & 16;
                if (i15 != 0) {
                    i13 |= 24576;
                } else if ((i11 & 24576) == 0) {
                    interfaceC9914x2 = interfaceC9914x;
                    i13 |= u11.n(interfaceC9914x2) ? 16384 : 8192;
                    i16 = i12 & 32;
                    if (i16 == 0) {
                        i13 |= 196608;
                    } else if ((196608 & i11) == 0) {
                        f11 = f7;
                        i13 |= u11.q(f11) ? 131072 : 65536;
                        i17 = i12 & 64;
                        if (i17 != 0) {
                            i13 |= 1572864;
                            function12 = function1;
                        } else {
                            function12 = function1;
                            if ((i11 & 1572864) == 0) {
                                i13 |= u11.F(function12) ? 1048576 : 524288;
                            }
                        }
                        if ((i13 & 599187) == 599186 || !u11.b()) {
                            u11.Q0();
                            if ((i11 & 1) != 0 || u11.w0()) {
                                eVar3 = i21 != 0 ? e.f40358c0 : eVar2;
                                if (i14 != 0) {
                                    str2 = null;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                    t11 = RegularDrawTypographyKt.getText_10_10_W600();
                                }
                                if (i15 != 0) {
                                    interfaceC9914x2 = androidx.compose.foundation.layout.T.a(0.0f, 3, 0.0f);
                                }
                                if (i16 != 0) {
                                    f11 = 5;
                                }
                                if (i17 != 0) {
                                    u11.o(1872956798);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = CustomBadgeAtomKt$CustomBadgeAtom$1$1.INSTANCE;
                                        u11.x(C11);
                                    }
                                    function12 = (Function1) C11;
                                    u11.k();
                                }
                                i18 = i13;
                                function13 = function12;
                                t12 = t11;
                                interfaceC9914x3 = interfaceC9914x2;
                                f12 = f11;
                            } else {
                                u11.j();
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                function13 = function12;
                                eVar3 = eVar2;
                                t12 = t11;
                                f12 = f11;
                                i18 = i13;
                                interfaceC9914x3 = interfaceC9914x2;
                            }
                            u11.j0();
                            u11.o(1872977885);
                            u11.o(1872965524);
                            BadgeDTO.CustomStyle customBadgeStyle = dto.getCustomBadgeStyle();
                            C7807Z c7807z = TokenParserKt.tokenToColor((customBadgeStyle != null || (backgroundColor = customBadgeStyle.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), u11, 0);
                            e b12 = androidx.compose.foundation.e.b(eVar3, c7807z != null ? c7807z.w() : C7807Z.f72259m, h.b(f12));
                            u11.o(1872966192);
                            if (str2 != null) {
                                float f14 = (float) 1.5d;
                                C7807Z c7807z2 = TokenParserKt.tokenToColor(str2, u11, (i18 >> 6) & 14);
                                b12 = m910borderOutsideaa2Vgzc(b12, f14, c7807z2 != null ? c7807z2.w() : C7807Z.f72259m, f12);
                            }
                            e eVar5 = b12;
                            u11.k();
                            u11.k();
                            CommonControlSettings common = dto.getCommon();
                            atomAction = common != null ? common.toAtomAction() : null;
                            u11.o(1872979413);
                            if (atomAction == null) {
                                b11 = null;
                            } else {
                                u11.o(-1187595706);
                                boolean F11 = ((i18 & 3670016) == 1048576) | u11.F(atomAction);
                                Object C12 = u11.C();
                                if (F11 || C12 == InterfaceC3967k.a.a()) {
                                    C12 = new CustomBadgeAtomKt$CustomBadgeAtom$3$1$1$1(function13, atomAction);
                                    u11.x(C12);
                                }
                                u11.k();
                                b11 = i.b(eVar5, null, null, false, null, null, (Function0) C12, 28);
                            }
                            u11.k();
                            if (b11 == null) {
                                b11 = eVar5;
                            }
                            u11.k();
                            float f15 = 2;
                            e g10 = androidx.compose.foundation.layout.T.g(b11, 3, f15);
                            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f16 = c.f(u11, g10);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 h11 = Cm.e.h(u11, b13, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                a.d(I11, u11, I11, h11);
                            }
                            F1.b(u11, f16, InterfaceC2801g.a.f());
                            float p11 = ((d) u11.m(K0.e())).p(t12.o()) + f15;
                            String leftIcon = dto.getLeftIcon();
                            BadgeDTO.CustomStyle customBadgeStyle2 = dto.getCustomBadgeStyle();
                            String leftGraphicColor = customBadgeStyle2 != null ? customBadgeStyle2.getLeftGraphicColor() : null;
                            e.a aVar = e.f40358c0;
                            BadgeIcon(leftIcon, leftGraphicColor, a0.n(aVar, p11), u11, 0, 0);
                            text = dto.getText();
                            if (text == null) {
                                text = "";
                            }
                            BadgeDTO.CustomStyle customBadgeStyle3 = dto.getCustomBadgeStyle();
                            C7807Z c7807z3 = TokenParserKt.tokenToColor(customBadgeStyle3 != null ? customBadgeStyle3.getTextColor() : null, u11, 0);
                            u3.b(text, androidx.compose.foundation.layout.T.e(aVar, interfaceC9914x3), c7807z3 != null ? c7807z3.w() : C7807Z.f72259m, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t12, u11, 0, ((i18 << 9) & 3670016) | 3120, 55288);
                            u11.o(1642924122);
                            if (Intrinsics.d(dto.getHideDisclosure(), Boolean.FALSE)) {
                                BadgeDTO.CustomStyle customBadgeStyle4 = dto.getCustomBadgeStyle();
                                BadgeIcon("ic_m_chevron_right_filled", customBadgeStyle4 != null ? customBadgeStyle4.getRightGraphicColor() : null, a0.n(aVar, p11), u11, 6, 0);
                                c3969l = u11;
                            } else {
                                c3969l = u11;
                            }
                            c3969l.k();
                            c3969l.f();
                            interfaceC9914x4 = interfaceC9914x3;
                            f13 = f12;
                            str3 = str2;
                            eVar4 = eVar3;
                            function14 = function13;
                            t13 = t12;
                        } else {
                            u11.j();
                            String str4 = str2;
                            function14 = function12;
                            str3 = str4;
                            c3969l = u11;
                            eVar4 = eVar2;
                            t13 = t11;
                            interfaceC9914x4 = interfaceC9914x2;
                            f13 = f11;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new CustomBadgeAtomKt$CustomBadgeAtom$5(dto, eVar4, str3, t13, interfaceC9914x4, f13, function14, i11, i12));
                            return;
                        }
                        return;
                    }
                    f11 = f7;
                    i17 = i12 & 64;
                    if (i17 != 0) {
                    }
                    if ((i13 & 599187) == 599186) {
                    }
                    u11.Q0();
                    if ((i11 & 1) != 0) {
                    }
                    if (i21 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if ((i12 & 8) != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i17 != 0) {
                    }
                    i18 = i13;
                    function13 = function12;
                    t12 = t11;
                    interfaceC9914x3 = interfaceC9914x2;
                    f12 = f11;
                    u11.j0();
                    u11.o(1872977885);
                    u11.o(1872965524);
                    BadgeDTO.CustomStyle customBadgeStyle5 = dto.getCustomBadgeStyle();
                    C7807Z c7807z4 = TokenParserKt.tokenToColor((customBadgeStyle5 != null || (backgroundColor = customBadgeStyle5.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), u11, 0);
                    e b122 = androidx.compose.foundation.e.b(eVar3, c7807z4 != null ? c7807z4.w() : C7807Z.f72259m, h.b(f12));
                    u11.o(1872966192);
                    if (str2 != null) {
                    }
                    e eVar52 = b122;
                    u11.k();
                    u11.k();
                    CommonControlSettings common2 = dto.getCommon();
                    if (common2 != null) {
                    }
                    u11.o(1872979413);
                    if (atomAction == null) {
                    }
                    u11.k();
                    if (b11 == null) {
                    }
                    u11.k();
                    float f152 = 2;
                    e g102 = androidx.compose.foundation.layout.T.g(b11, 3, f152);
                    Y b132 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f162 = c.f(u11, g102);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h112 = Cm.e.h(u11, b132, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h112);
                    F1.b(u11, f162, InterfaceC2801g.a.f());
                    float p112 = ((d) u11.m(K0.e())).p(t12.o()) + f152;
                    String leftIcon2 = dto.getLeftIcon();
                    BadgeDTO.CustomStyle customBadgeStyle22 = dto.getCustomBadgeStyle();
                    if (customBadgeStyle22 != null) {
                    }
                    e.a aVar2 = e.f40358c0;
                    BadgeIcon(leftIcon2, leftGraphicColor, a0.n(aVar2, p112), u11, 0, 0);
                    text = dto.getText();
                    if (text == null) {
                    }
                    BadgeDTO.CustomStyle customBadgeStyle32 = dto.getCustomBadgeStyle();
                    C7807Z c7807z32 = TokenParserKt.tokenToColor(customBadgeStyle32 != null ? customBadgeStyle32.getTextColor() : null, u11, 0);
                    u3.b(text, androidx.compose.foundation.layout.T.e(aVar2, interfaceC9914x3), c7807z32 != null ? c7807z32.w() : C7807Z.f72259m, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t12, u11, 0, ((i18 << 9) & 3670016) | 3120, 55288);
                    u11.o(1642924122);
                    if (Intrinsics.d(dto.getHideDisclosure(), Boolean.FALSE)) {
                    }
                    c3969l.k();
                    c3969l.f();
                    interfaceC9914x4 = interfaceC9914x3;
                    f13 = f12;
                    str3 = str2;
                    eVar4 = eVar3;
                    function14 = function13;
                    t13 = t12;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                interfaceC9914x2 = interfaceC9914x;
                i16 = i12 & 32;
                if (i16 == 0) {
                }
                f11 = f7;
                i17 = i12 & 64;
                if (i17 != 0) {
                }
                if ((i13 & 599187) == 599186) {
                }
                u11.Q0();
                if ((i11 & 1) != 0) {
                }
                if (i21 != 0) {
                }
                if (i14 != 0) {
                }
                if ((i12 & 8) != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i17 != 0) {
                }
                i18 = i13;
                function13 = function12;
                t12 = t11;
                interfaceC9914x3 = interfaceC9914x2;
                f12 = f11;
                u11.j0();
                u11.o(1872977885);
                u11.o(1872965524);
                BadgeDTO.CustomStyle customBadgeStyle52 = dto.getCustomBadgeStyle();
                C7807Z c7807z42 = TokenParserKt.tokenToColor((customBadgeStyle52 != null || (backgroundColor = customBadgeStyle52.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), u11, 0);
                e b1222 = androidx.compose.foundation.e.b(eVar3, c7807z42 != null ? c7807z42.w() : C7807Z.f72259m, h.b(f12));
                u11.o(1872966192);
                if (str2 != null) {
                }
                e eVar522 = b1222;
                u11.k();
                u11.k();
                CommonControlSettings common22 = dto.getCommon();
                if (common22 != null) {
                }
                u11.o(1872979413);
                if (atomAction == null) {
                }
                u11.k();
                if (b11 == null) {
                }
                u11.k();
                float f1522 = 2;
                e g1022 = androidx.compose.foundation.layout.T.g(b11, 3, f1522);
                Y b1322 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1622 = c.f(u11, g1022);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h1122 = Cm.e.h(u11, b1322, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h1122);
                F1.b(u11, f1622, InterfaceC2801g.a.f());
                float p1122 = ((d) u11.m(K0.e())).p(t12.o()) + f1522;
                String leftIcon22 = dto.getLeftIcon();
                BadgeDTO.CustomStyle customBadgeStyle222 = dto.getCustomBadgeStyle();
                if (customBadgeStyle222 != null) {
                }
                e.a aVar22 = e.f40358c0;
                BadgeIcon(leftIcon22, leftGraphicColor, a0.n(aVar22, p1122), u11, 0, 0);
                text = dto.getText();
                if (text == null) {
                }
                BadgeDTO.CustomStyle customBadgeStyle322 = dto.getCustomBadgeStyle();
                C7807Z c7807z322 = TokenParserKt.tokenToColor(customBadgeStyle322 != null ? customBadgeStyle322.getTextColor() : null, u11, 0);
                u3.b(text, androidx.compose.foundation.layout.T.e(aVar22, interfaceC9914x3), c7807z322 != null ? c7807z322.w() : C7807Z.f72259m, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t12, u11, 0, ((i18 << 9) & 3670016) | 3120, 55288);
                u11.o(1642924122);
                if (Intrinsics.d(dto.getHideDisclosure(), Boolean.FALSE)) {
                }
                c3969l.k();
                c3969l.f();
                interfaceC9914x4 = interfaceC9914x3;
                f13 = f12;
                str3 = str2;
                eVar4 = eVar3;
                function14 = function13;
                t13 = t12;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            str2 = str;
            if ((i11 & 3072) == 0) {
            }
            i15 = i12 & 16;
            if (i15 != 0) {
            }
            interfaceC9914x2 = interfaceC9914x;
            i16 = i12 & 32;
            if (i16 == 0) {
            }
            f11 = f7;
            i17 = i12 & 64;
            if (i17 != 0) {
            }
            if ((i13 & 599187) == 599186) {
            }
            u11.Q0();
            if ((i11 & 1) != 0) {
            }
            if (i21 != 0) {
            }
            if (i14 != 0) {
            }
            if ((i12 & 8) != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i17 != 0) {
            }
            i18 = i13;
            function13 = function12;
            t12 = t11;
            interfaceC9914x3 = interfaceC9914x2;
            f12 = f11;
            u11.j0();
            u11.o(1872977885);
            u11.o(1872965524);
            BadgeDTO.CustomStyle customBadgeStyle522 = dto.getCustomBadgeStyle();
            C7807Z c7807z422 = TokenParserKt.tokenToColor((customBadgeStyle522 != null || (backgroundColor = customBadgeStyle522.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), u11, 0);
            e b12222 = androidx.compose.foundation.e.b(eVar3, c7807z422 != null ? c7807z422.w() : C7807Z.f72259m, h.b(f12));
            u11.o(1872966192);
            if (str2 != null) {
            }
            e eVar5222 = b12222;
            u11.k();
            u11.k();
            CommonControlSettings common222 = dto.getCommon();
            if (common222 != null) {
            }
            u11.o(1872979413);
            if (atomAction == null) {
            }
            u11.k();
            if (b11 == null) {
            }
            u11.k();
            float f15222 = 2;
            e g10222 = androidx.compose.foundation.layout.T.g(b11, 3, f15222);
            Y b13222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f16222 = c.f(u11, g10222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h11222 = Cm.e.h(u11, b13222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h11222);
            F1.b(u11, f16222, InterfaceC2801g.a.f());
            float p11222 = ((d) u11.m(K0.e())).p(t12.o()) + f15222;
            String leftIcon222 = dto.getLeftIcon();
            BadgeDTO.CustomStyle customBadgeStyle2222 = dto.getCustomBadgeStyle();
            if (customBadgeStyle2222 != null) {
            }
            e.a aVar222 = e.f40358c0;
            BadgeIcon(leftIcon222, leftGraphicColor, a0.n(aVar222, p11222), u11, 0, 0);
            text = dto.getText();
            if (text == null) {
            }
            BadgeDTO.CustomStyle customBadgeStyle3222 = dto.getCustomBadgeStyle();
            C7807Z c7807z3222 = TokenParserKt.tokenToColor(customBadgeStyle3222 != null ? customBadgeStyle3222.getTextColor() : null, u11, 0);
            u3.b(text, androidx.compose.foundation.layout.T.e(aVar222, interfaceC9914x3), c7807z3222 != null ? c7807z3222.w() : C7807Z.f72259m, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t12, u11, 0, ((i18 << 9) & 3670016) | 3120, 55288);
            u11.o(1642924122);
            if (Intrinsics.d(dto.getHideDisclosure(), Boolean.FALSE)) {
            }
            c3969l.k();
            c3969l.f();
            interfaceC9914x4 = interfaceC9914x3;
            f13 = f12;
            str3 = str2;
            eVar4 = eVar3;
            function14 = function13;
            t13 = t12;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar2 = eVar;
        i14 = i12 & 4;
        if (i14 == 0) {
        }
        str2 = str;
        if ((i11 & 3072) == 0) {
        }
        i15 = i12 & 16;
        if (i15 != 0) {
        }
        interfaceC9914x2 = interfaceC9914x;
        i16 = i12 & 32;
        if (i16 == 0) {
        }
        f11 = f7;
        i17 = i12 & 64;
        if (i17 != 0) {
        }
        if ((i13 & 599187) == 599186) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i21 != 0) {
        }
        if (i14 != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i17 != 0) {
        }
        i18 = i13;
        function13 = function12;
        t12 = t11;
        interfaceC9914x3 = interfaceC9914x2;
        f12 = f11;
        u11.j0();
        u11.o(1872977885);
        u11.o(1872965524);
        BadgeDTO.CustomStyle customBadgeStyle5222 = dto.getCustomBadgeStyle();
        C7807Z c7807z4222 = TokenParserKt.tokenToColor((customBadgeStyle5222 != null || (backgroundColor = customBadgeStyle5222.getBackgroundColor()) == null) ? null : backgroundColor.getColor(), u11, 0);
        e b122222 = androidx.compose.foundation.e.b(eVar3, c7807z4222 != null ? c7807z4222.w() : C7807Z.f72259m, h.b(f12));
        u11.o(1872966192);
        if (str2 != null) {
        }
        e eVar52222 = b122222;
        u11.k();
        u11.k();
        CommonControlSettings common2222 = dto.getCommon();
        if (common2222 != null) {
        }
        u11.o(1872979413);
        if (atomAction == null) {
        }
        u11.k();
        if (b11 == null) {
        }
        u11.k();
        float f152222 = 2;
        e g102222 = androidx.compose.foundation.layout.T.g(b11, 3, f152222);
        Y b132222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f162222 = c.f(u11, g102222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h112222 = Cm.e.h(u11, b132222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h112222);
        F1.b(u11, f162222, InterfaceC2801g.a.f());
        float p112222 = ((d) u11.m(K0.e())).p(t12.o()) + f152222;
        String leftIcon2222 = dto.getLeftIcon();
        BadgeDTO.CustomStyle customBadgeStyle22222 = dto.getCustomBadgeStyle();
        if (customBadgeStyle22222 != null) {
        }
        e.a aVar2222 = e.f40358c0;
        BadgeIcon(leftIcon2222, leftGraphicColor, a0.n(aVar2222, p112222), u11, 0, 0);
        text = dto.getText();
        if (text == null) {
        }
        BadgeDTO.CustomStyle customBadgeStyle32222 = dto.getCustomBadgeStyle();
        C7807Z c7807z32222 = TokenParserKt.tokenToColor(customBadgeStyle32222 != null ? customBadgeStyle32222.getTextColor() : null, u11, 0);
        u3.b(text, androidx.compose.foundation.layout.T.e(aVar2222, interfaceC9914x3), c7807z32222 != null ? c7807z32222.w() : C7807Z.f72259m, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, t12, u11, 0, ((i18 << 9) & 3670016) | 3120, 55288);
        u11.o(1642924122);
        if (Intrinsics.d(dto.getHideDisclosure(), Boolean.FALSE)) {
        }
        c3969l.k();
        c3969l.f();
        interfaceC9914x4 = interfaceC9914x3;
        f13 = f12;
        str3 = str2;
        eVar4 = eVar3;
        function14 = function13;
        t13 = t12;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* renamed from: borderOutside-aa2Vgzc, reason: not valid java name */
    private static final e m910borderOutsideaa2Vgzc(e eVar, float f7, long j11, float f11) {
        return androidx.compose.ui.draw.c.d(eVar, new CustomBadgeAtomKt$borderOutside$1(j11, f7, f11));
    }
}
