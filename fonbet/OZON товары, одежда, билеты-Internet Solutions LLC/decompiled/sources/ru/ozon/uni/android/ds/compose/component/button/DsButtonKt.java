package ru.ozon.uni.android.ds.compose.component.button;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import I1.o;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import S0.S;
import T7.E;
import a1.C4912a;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5187j;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;
import ru.ozon.uni.foundation.components.button.FoundationButtonKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a³\u0001\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/ds/compose/component/button/DsButtonStyle;", "style", "", "canShowSubtitle", "Landroidx/compose/ui/e;", "modifier", "subtitle", "dataText", "Lq1/b;", "icon", "Lkotlin/Function0;", "", "loader", "enabled", "hoverDisabled", "titleModifier", "subtitleModifier", "accessibilityContentDescription", "Lt0/q;", "interactionSource", "onClick", "DsButton", "(Ljava/lang/String;Lru/ozon/uni/android/ds/compose/component/button/DsButtonStyle;ZLandroidx/compose/ui/e;Ljava/lang/String;Ljava/lang/String;Lq1/b;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/e;Landroidx/compose/ui/e;Ljava/lang/String;Lt0/q;Lkotlin/jvm/functions/Function0;LS0/k;III)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsButtonKt {
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03b7, code lost:
    
        if (r8 == null) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0312  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsButton(@NotNull String title, @NotNull DsButtonStyle style, boolean z11, e eVar, String str, String str2, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z12, boolean z13, e eVar2, e eVar3, String str3, q qVar, Function0<Unit> function0, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar4;
        int i15;
        String str4;
        int i16;
        String str5;
        int i17;
        AbstractC8972b abstractC8972b2;
        int i18;
        boolean z14;
        int i19;
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
        int i33;
        boolean z15;
        String str6;
        q qVar2;
        int i34;
        Function0<Unit> function02;
        int I11;
        boolean z16;
        Object C11;
        String str7;
        String str8;
        AbstractC7799Q backgroundGradient;
        e b11;
        int i35;
        C4912a c11;
        e eVar5;
        String str9;
        AbstractC8972b abstractC8972b3;
        C3969l c3969l;
        e eVar6;
        e eVar7;
        String str10;
        boolean z17;
        boolean z18;
        q qVar3;
        Function0<Unit> function03;
        String str11;
        e b12;
        J0 m02;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(style, "style");
        C3969l u11 = interfaceC3967k.u(1961063456);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(title) ? 4 : 2) | i11;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.n(style) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= u11.p(z11) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i36 = i13 & 8;
        int i37 = UserVerificationMethods.USER_VERIFY_ALL;
        if (i36 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar4 = eVar;
            i14 |= u11.n(eVar4) ? 2048 : 1024;
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                str4 = str;
                i14 |= u11.n(str4) ? 16384 : 8192;
                i16 = i13 & 32;
                if (i16 != 0) {
                    i14 |= 196608;
                    str5 = str2;
                } else {
                    str5 = str2;
                    if ((i11 & 196608) == 0) {
                        i14 |= u11.n(str5) ? 131072 : 65536;
                    }
                }
                i17 = i13 & 64;
                if (i17 != 0) {
                    i14 |= 1572864;
                    abstractC8972b2 = abstractC8972b;
                } else {
                    abstractC8972b2 = abstractC8972b;
                    if ((i11 & 1572864) == 0) {
                        i14 |= u11.n(abstractC8972b2) ? 1048576 : 524288;
                    }
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i14 |= 12582912;
                } else if ((i11 & 12582912) == 0) {
                    i14 |= u11.F(function2) ? 8388608 : 4194304;
                    i18 = i13 & 256;
                    if (i18 == 0) {
                        i14 |= 100663296;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i11 & 100663296) == 0) {
                            i14 |= u11.p(z14) ? 67108864 : 33554432;
                        }
                    }
                    i19 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i19 == 0) {
                        i14 |= 805306368;
                    } else if ((i11 & 805306368) == 0) {
                        i21 = i19;
                        i14 |= u11.p(z13) ? 536870912 : 268435456;
                        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                        if (i22 != 0) {
                            i24 = i12 | 6;
                            i23 = i22;
                        } else if ((i12 & 6) == 0) {
                            i23 = i22;
                            i24 = i12 | (u11.n(eVar2) ? 4 : 2);
                        } else {
                            i23 = i22;
                            i24 = i12;
                        }
                        i25 = i13 & 2048;
                        if (i25 != 0) {
                            i24 |= 48;
                            i26 = i25;
                        } else if ((i12 & 48) == 0) {
                            i26 = i25;
                            i24 |= u11.n(eVar3) ? 32 : 16;
                        } else {
                            i26 = i25;
                        }
                        int i38 = i24;
                        i27 = i13 & 4096;
                        if (i27 != 0) {
                            i28 = i38 | 384;
                        } else {
                            int i39 = i38;
                            if ((i12 & 384) == 0) {
                                i39 |= u11.n(str3) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                            }
                            i28 = i39;
                        }
                        i29 = i13 & 8192;
                        if (i29 != 0) {
                            i31 = i28 | 3072;
                        } else {
                            int i41 = i28;
                            if ((i12 & 3072) == 0) {
                                if (u11.n(qVar)) {
                                    i37 = 2048;
                                }
                                i31 = i41 | i37;
                            } else {
                                i31 = i41;
                            }
                        }
                        i32 = i13 & 16384;
                        if (i32 != 0) {
                            i33 = i31 | 24576;
                        } else {
                            int i42 = i31;
                            if ((i12 & 24576) == 0) {
                                i33 = i42 | (u11.F(function0) ? 16384 : 8192);
                            } else {
                                i33 = i42;
                            }
                        }
                        if ((i14 & 306783379) != 306783378 && (i33 & 9363) == 9362 && u11.b()) {
                            u11.j();
                            z17 = z13;
                            qVar3 = qVar;
                            c3969l = u11;
                            eVar5 = eVar4;
                            abstractC8972b3 = abstractC8972b2;
                            str9 = str4;
                            z18 = z14;
                            str10 = str5;
                            eVar6 = eVar2;
                            eVar7 = eVar3;
                            str11 = str3;
                            function03 = function0;
                        } else {
                            e eVar8 = i36 != 0 ? e.f40358c0 : eVar4;
                            if (i15 != 0) {
                                str4 = null;
                            }
                            if (i16 != 0) {
                                str5 = null;
                            }
                            if (i17 != 0) {
                                abstractC8972b2 = null;
                            }
                            if (i18 != 0) {
                                z14 = true;
                            }
                            z15 = i21 != 0 ? false : z13;
                            e eVar9 = i23 != 0 ? e.f40358c0 : eVar2;
                            e eVar10 = i26 != 0 ? e.f40358c0 : eVar3;
                            str6 = i27 != 0 ? null : str3;
                            if (i29 != 0) {
                                u11.o(-43825970);
                                Object C12 = u11.C();
                                if (C12 == InterfaceC3967k.a.a()) {
                                    C12 = p.a();
                                    u11.x(C12);
                                }
                                qVar2 = (q) C12;
                                u11.k();
                            } else {
                                qVar2 = qVar;
                            }
                            if (i32 != 0) {
                                u11.o(-43823863);
                                Object C13 = u11.C();
                                i34 = 0;
                                if (C13 == InterfaceC3967k.a.a()) {
                                    C13 = DsButtonKt$DsButton$2$1.INSTANCE;
                                    u11.x(C13);
                                }
                                function02 = (Function0) C13;
                                u11.k();
                            } else {
                                i34 = 0;
                                function02 = function0;
                            }
                            q qVar4 = qVar2;
                            Function0<Unit> function04 = function02;
                            S animateBackgroundAlpha = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar4, 0L, 0L, u11, (i33 >> 9) & 14, 3), 0.0f, 0.1f, u11, 432);
                            boolean z19 = z14;
                            e b13 = i.b(e.f40358c0, qVar4, null, z19, null, I1.i.a(i34), function04, 8);
                            boolean z21 = i34;
                            V f7 = C5185h.f(InterfaceC6250b.a.o(), z21);
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f11 = c.f(u11, b13);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
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
                            e f13 = a0.f(eVar8, style.getHeight());
                            u11.o(-915039531);
                            int i43 = i14 & 14;
                            z16 = (i43 == 4) | ((i33 & 896) == 256 ? true : z21 ? 1 : 0) | ((i14 & 896) == 256) | ((458752 & i14) == 131072) | ((57344 & i14) == 16384);
                            C11 = u11.C();
                            if (!z16 || C11 == InterfaceC3967k.a.a()) {
                                String str12 = str5;
                                String str13 = str6;
                                C11 = new DsButtonKt$DsButton$3$1$1(str13, title, z11, str12, str4);
                                str7 = str13;
                                str8 = str12;
                                u11.x(C11);
                            } else {
                                str8 = str5;
                                str7 = str6;
                            }
                            u11.k();
                            e a12 = C6988h.a(o.a(f13, (Function1) C11), h.b(style.getCornerRadius()));
                            backgroundGradient = style.getBackgroundGradient();
                            if (backgroundGradient != null) {
                                b11 = androidx.compose.foundation.e.a(a12, backgroundGradient, null, 6);
                            }
                            b11 = androidx.compose.foundation.e.b(a12, style.getBackgroundColor(), y0.a());
                            e e11 = T.e(b11, style.getContentPadding());
                            boolean z22 = !z11 && str8 == null;
                            K1.T titleTextStyle = style.getTitleTextStyle();
                            K1.T subtitleTextStyle = style.getSubtitleTextStyle();
                            long titleTextColor = style.getTitleTextColor();
                            boolean z23 = z22;
                            long subtitleTextColor = style.getSubtitleTextColor();
                            e eVar11 = eVar8;
                            AbstractC8972b abstractC8972b4 = abstractC8972b2;
                            e eVar12 = eVar10;
                            long iconColor = style.getIconColor();
                            DsSpacings dsSpacings = DsSpacings.INSTANCE;
                            float m1838getDp0D9Ej5fM = dsSpacings.m1838getDp0D9Ej5fM();
                            float m1861getDp8D9Ej5fM = dsSpacings.m1861getDp8D9Ej5fM();
                            u11.o(-914981635);
                            if (str8 == null) {
                                i35 = i33;
                                c11 = null;
                            } else {
                                i35 = i33;
                                c11 = a1.c.c(20639865, new DsButtonKt$DsButton$3$3$1(style, str8), u11);
                            }
                            u11.k();
                            C4912a c4912a = c11;
                            int i44 = i43 | 805306368 | ((i14 >> 9) & 112) | ((i14 >> 12) & 896);
                            int i45 = ((i14 >> 15) & 896) | 54;
                            int i46 = i35 << 18;
                            String str14 = str4;
                            String str15 = str8;
                            FoundationButtonKt.m2980FoundationButtonfOU4Dw4(title, str14, abstractC8972b4, z23, titleTextStyle, subtitleTextStyle, titleTextColor, subtitleTextColor, iconColor, Float.NaN, m1838getDp0D9Ej5fM, m1861getDp8D9Ej5fM, function2, c4912a, e11, null, eVar9, eVar12, null, null, null, u11, i44, i45 | (3670016 & i46) | (i46 & 29360128), 0, 1867776);
                            u11.o(-914962127);
                            if (!z15) {
                                b12 = androidx.compose.foundation.e.b(C6988h.a(c5187j.b(eVar11), h.b(style.getCornerRadius())), C7807Z.o(animateBackgroundAlpha.getFloatValue(), style.getTitleTextColor()), y0.a());
                                C5185h.a(b12, u11, 0);
                            }
                            u11.k();
                            u11.f();
                            eVar5 = eVar11;
                            str9 = str14;
                            abstractC8972b3 = abstractC8972b4;
                            c3969l = u11;
                            eVar6 = eVar9;
                            eVar7 = eVar12;
                            str10 = str15;
                            z17 = z15;
                            z18 = z19;
                            qVar3 = qVar4;
                            function03 = function04;
                            str11 = str7;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new DsButtonKt$DsButton$4(title, style, z11, eVar5, str9, str10, abstractC8972b3, function2, z18, z17, eVar6, eVar7, str11, qVar3, function03, i11, i12, i13));
                            return;
                        }
                        return;
                    }
                    i21 = i19;
                    i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i22 != 0) {
                    }
                    i25 = i13 & 2048;
                    if (i25 != 0) {
                    }
                    int i382 = i24;
                    i27 = i13 & 4096;
                    if (i27 != 0) {
                    }
                    i29 = i13 & 8192;
                    if (i29 != 0) {
                    }
                    i32 = i13 & 16384;
                    if (i32 != 0) {
                    }
                    if ((i14 & 306783379) != 306783378) {
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
                    if (i21 != 0) {
                    }
                    if (i23 != 0) {
                    }
                    if (i26 != 0) {
                    }
                    if (i27 != 0) {
                    }
                    if (i29 != 0) {
                    }
                    if (i32 != 0) {
                    }
                    q qVar42 = qVar2;
                    Function0<Unit> function042 = function02;
                    S animateBackgroundAlpha2 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar42, 0L, 0L, u11, (i33 >> 9) & 14, 3), 0.0f, 0.1f, u11, 432);
                    boolean z192 = z14;
                    e b132 = i.b(e.f40358c0, qVar42, null, z192, null, I1.i.a(i34), function042, 8);
                    boolean z212 = i34;
                    V f72 = C5185h.f(InterfaceC6250b.a.o(), z212);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f112 = c.f(u11, b132);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f122 = E.f(u11, f72, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f122);
                    F1.b(u11, f112, InterfaceC2801g.a.f());
                    C5187j c5187j2 = C5187j.f39515a;
                    e f132 = a0.f(eVar8, style.getHeight());
                    u11.o(-915039531);
                    if ((i33 & 896) == 256) {
                    }
                    int i432 = i14 & 14;
                    z16 = (i432 == 4) | ((i33 & 896) == 256 ? true : z212 ? 1 : 0) | ((i14 & 896) == 256) | ((458752 & i14) == 131072) | ((57344 & i14) == 16384);
                    C11 = u11.C();
                    if (z16) {
                    }
                    String str122 = str5;
                    String str132 = str6;
                    C11 = new DsButtonKt$DsButton$3$1$1(str132, title, z11, str122, str4);
                    str7 = str132;
                    str8 = str122;
                    u11.x(C11);
                    u11.k();
                    e a122 = C6988h.a(o.a(f132, (Function1) C11), h.b(style.getCornerRadius()));
                    backgroundGradient = style.getBackgroundGradient();
                    if (backgroundGradient != null) {
                    }
                    b11 = androidx.compose.foundation.e.b(a122, style.getBackgroundColor(), y0.a());
                    e e112 = T.e(b11, style.getContentPadding());
                    if (z11) {
                    }
                    K1.T titleTextStyle2 = style.getTitleTextStyle();
                    K1.T subtitleTextStyle2 = style.getSubtitleTextStyle();
                    long titleTextColor2 = style.getTitleTextColor();
                    boolean z232 = z22;
                    long subtitleTextColor2 = style.getSubtitleTextColor();
                    e eVar112 = eVar8;
                    AbstractC8972b abstractC8972b42 = abstractC8972b2;
                    e eVar122 = eVar10;
                    long iconColor2 = style.getIconColor();
                    DsSpacings dsSpacings2 = DsSpacings.INSTANCE;
                    float m1838getDp0D9Ej5fM2 = dsSpacings2.m1838getDp0D9Ej5fM();
                    float m1861getDp8D9Ej5fM2 = dsSpacings2.m1861getDp8D9Ej5fM();
                    u11.o(-914981635);
                    if (str8 == null) {
                    }
                    u11.k();
                    C4912a c4912a2 = c11;
                    int i442 = i432 | 805306368 | ((i14 >> 9) & 112) | ((i14 >> 12) & 896);
                    int i452 = ((i14 >> 15) & 896) | 54;
                    int i462 = i35 << 18;
                    String str142 = str4;
                    String str152 = str8;
                    FoundationButtonKt.m2980FoundationButtonfOU4Dw4(title, str142, abstractC8972b42, z232, titleTextStyle2, subtitleTextStyle2, titleTextColor2, subtitleTextColor2, iconColor2, Float.NaN, m1838getDp0D9Ej5fM2, m1861getDp8D9Ej5fM2, function2, c4912a2, e112, null, eVar9, eVar122, null, null, null, u11, i442, i452 | (3670016 & i462) | (i462 & 29360128), 0, 1867776);
                    u11.o(-914962127);
                    if (!z15) {
                    }
                    u11.k();
                    u11.f();
                    eVar5 = eVar112;
                    str9 = str142;
                    abstractC8972b3 = abstractC8972b42;
                    c3969l = u11;
                    eVar6 = eVar9;
                    eVar7 = eVar122;
                    str10 = str152;
                    z17 = z15;
                    z18 = z192;
                    qVar3 = qVar42;
                    function03 = function042;
                    str11 = str7;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i13 & 256;
                if (i18 == 0) {
                }
                i19 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i19 == 0) {
                }
                i21 = i19;
                i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i22 != 0) {
                }
                i25 = i13 & 2048;
                if (i25 != 0) {
                }
                int i3822 = i24;
                i27 = i13 & 4096;
                if (i27 != 0) {
                }
                i29 = i13 & 8192;
                if (i29 != 0) {
                }
                i32 = i13 & 16384;
                if (i32 != 0) {
                }
                if ((i14 & 306783379) != 306783378) {
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
                if (i21 != 0) {
                }
                if (i23 != 0) {
                }
                if (i26 != 0) {
                }
                if (i27 != 0) {
                }
                if (i29 != 0) {
                }
                if (i32 != 0) {
                }
                q qVar422 = qVar2;
                Function0<Unit> function0422 = function02;
                S animateBackgroundAlpha22 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar422, 0L, 0L, u11, (i33 >> 9) & 14, 3), 0.0f, 0.1f, u11, 432);
                boolean z1922 = z14;
                e b1322 = i.b(e.f40358c0, qVar422, null, z1922, null, I1.i.a(i34), function0422, 8);
                boolean z2122 = i34;
                V f722 = C5185h.f(InterfaceC6250b.a.o(), z2122);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1122 = c.f(u11, b1322);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f1222 = E.f(u11, f722, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f1222);
                F1.b(u11, f1122, InterfaceC2801g.a.f());
                C5187j c5187j22 = C5187j.f39515a;
                e f1322 = a0.f(eVar8, style.getHeight());
                u11.o(-915039531);
                if ((i33 & 896) == 256) {
                }
                int i4322 = i14 & 14;
                z16 = (i4322 == 4) | ((i33 & 896) == 256 ? true : z2122 ? 1 : 0) | ((i14 & 896) == 256) | ((458752 & i14) == 131072) | ((57344 & i14) == 16384);
                C11 = u11.C();
                if (z16) {
                }
                String str1222 = str5;
                String str1322 = str6;
                C11 = new DsButtonKt$DsButton$3$1$1(str1322, title, z11, str1222, str4);
                str7 = str1322;
                str8 = str1222;
                u11.x(C11);
                u11.k();
                e a1222 = C6988h.a(o.a(f1322, (Function1) C11), h.b(style.getCornerRadius()));
                backgroundGradient = style.getBackgroundGradient();
                if (backgroundGradient != null) {
                }
                b11 = androidx.compose.foundation.e.b(a1222, style.getBackgroundColor(), y0.a());
                e e1122 = T.e(b11, style.getContentPadding());
                if (z11) {
                }
                K1.T titleTextStyle22 = style.getTitleTextStyle();
                K1.T subtitleTextStyle22 = style.getSubtitleTextStyle();
                long titleTextColor22 = style.getTitleTextColor();
                boolean z2322 = z22;
                long subtitleTextColor22 = style.getSubtitleTextColor();
                e eVar1122 = eVar8;
                AbstractC8972b abstractC8972b422 = abstractC8972b2;
                e eVar1222 = eVar10;
                long iconColor22 = style.getIconColor();
                DsSpacings dsSpacings22 = DsSpacings.INSTANCE;
                float m1838getDp0D9Ej5fM22 = dsSpacings22.m1838getDp0D9Ej5fM();
                float m1861getDp8D9Ej5fM22 = dsSpacings22.m1861getDp8D9Ej5fM();
                u11.o(-914981635);
                if (str8 == null) {
                }
                u11.k();
                C4912a c4912a22 = c11;
                int i4422 = i4322 | 805306368 | ((i14 >> 9) & 112) | ((i14 >> 12) & 896);
                int i4522 = ((i14 >> 15) & 896) | 54;
                int i4622 = i35 << 18;
                String str1422 = str4;
                String str1522 = str8;
                FoundationButtonKt.m2980FoundationButtonfOU4Dw4(title, str1422, abstractC8972b422, z2322, titleTextStyle22, subtitleTextStyle22, titleTextColor22, subtitleTextColor22, iconColor22, Float.NaN, m1838getDp0D9Ej5fM22, m1861getDp8D9Ej5fM22, function2, c4912a22, e1122, null, eVar9, eVar1222, null, null, null, u11, i4422, i4522 | (3670016 & i4622) | (i4622 & 29360128), 0, 1867776);
                u11.o(-914962127);
                if (!z15) {
                }
                u11.k();
                u11.f();
                eVar5 = eVar1122;
                str9 = str1422;
                abstractC8972b3 = abstractC8972b422;
                c3969l = u11;
                eVar6 = eVar9;
                eVar7 = eVar1222;
                str10 = str1522;
                z17 = z15;
                z18 = z1922;
                qVar3 = qVar422;
                function03 = function0422;
                str11 = str7;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            str4 = str;
            i16 = i13 & 32;
            if (i16 != 0) {
            }
            i17 = i13 & 64;
            if (i17 != 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            i18 = i13 & 256;
            if (i18 == 0) {
            }
            i19 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i19 == 0) {
            }
            i21 = i19;
            i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i22 != 0) {
            }
            i25 = i13 & 2048;
            if (i25 != 0) {
            }
            int i38222 = i24;
            i27 = i13 & 4096;
            if (i27 != 0) {
            }
            i29 = i13 & 8192;
            if (i29 != 0) {
            }
            i32 = i13 & 16384;
            if (i32 != 0) {
            }
            if ((i14 & 306783379) != 306783378) {
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
            if (i21 != 0) {
            }
            if (i23 != 0) {
            }
            if (i26 != 0) {
            }
            if (i27 != 0) {
            }
            if (i29 != 0) {
            }
            if (i32 != 0) {
            }
            q qVar4222 = qVar2;
            Function0<Unit> function04222 = function02;
            S animateBackgroundAlpha222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar4222, 0L, 0L, u11, (i33 >> 9) & 14, 3), 0.0f, 0.1f, u11, 432);
            boolean z19222 = z14;
            e b13222 = i.b(e.f40358c0, qVar4222, null, z19222, null, I1.i.a(i34), function04222, 8);
            boolean z21222 = i34;
            V f7222 = C5185h.f(InterfaceC6250b.a.o(), z21222);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f11222 = c.f(u11, b13222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f12222 = E.f(u11, f7222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f12222);
            F1.b(u11, f11222, InterfaceC2801g.a.f());
            C5187j c5187j222 = C5187j.f39515a;
            e f13222 = a0.f(eVar8, style.getHeight());
            u11.o(-915039531);
            if ((i33 & 896) == 256) {
            }
            int i43222 = i14 & 14;
            z16 = (i43222 == 4) | ((i33 & 896) == 256 ? true : z21222 ? 1 : 0) | ((i14 & 896) == 256) | ((458752 & i14) == 131072) | ((57344 & i14) == 16384);
            C11 = u11.C();
            if (z16) {
            }
            String str12222 = str5;
            String str13222 = str6;
            C11 = new DsButtonKt$DsButton$3$1$1(str13222, title, z11, str12222, str4);
            str7 = str13222;
            str8 = str12222;
            u11.x(C11);
            u11.k();
            e a12222 = C6988h.a(o.a(f13222, (Function1) C11), h.b(style.getCornerRadius()));
            backgroundGradient = style.getBackgroundGradient();
            if (backgroundGradient != null) {
            }
            b11 = androidx.compose.foundation.e.b(a12222, style.getBackgroundColor(), y0.a());
            e e11222 = T.e(b11, style.getContentPadding());
            if (z11) {
            }
            K1.T titleTextStyle222 = style.getTitleTextStyle();
            K1.T subtitleTextStyle222 = style.getSubtitleTextStyle();
            long titleTextColor222 = style.getTitleTextColor();
            boolean z23222 = z22;
            long subtitleTextColor222 = style.getSubtitleTextColor();
            e eVar11222 = eVar8;
            AbstractC8972b abstractC8972b4222 = abstractC8972b2;
            e eVar12222 = eVar10;
            long iconColor222 = style.getIconColor();
            DsSpacings dsSpacings222 = DsSpacings.INSTANCE;
            float m1838getDp0D9Ej5fM222 = dsSpacings222.m1838getDp0D9Ej5fM();
            float m1861getDp8D9Ej5fM222 = dsSpacings222.m1861getDp8D9Ej5fM();
            u11.o(-914981635);
            if (str8 == null) {
            }
            u11.k();
            C4912a c4912a222 = c11;
            int i44222 = i43222 | 805306368 | ((i14 >> 9) & 112) | ((i14 >> 12) & 896);
            int i45222 = ((i14 >> 15) & 896) | 54;
            int i46222 = i35 << 18;
            String str14222 = str4;
            String str15222 = str8;
            FoundationButtonKt.m2980FoundationButtonfOU4Dw4(title, str14222, abstractC8972b4222, z23222, titleTextStyle222, subtitleTextStyle222, titleTextColor222, subtitleTextColor222, iconColor222, Float.NaN, m1838getDp0D9Ej5fM222, m1861getDp8D9Ej5fM222, function2, c4912a222, e11222, null, eVar9, eVar12222, null, null, null, u11, i44222, i45222 | (3670016 & i46222) | (i46222 & 29360128), 0, 1867776);
            u11.o(-914962127);
            if (!z15) {
            }
            u11.k();
            u11.f();
            eVar5 = eVar11222;
            str9 = str14222;
            abstractC8972b3 = abstractC8972b4222;
            c3969l = u11;
            eVar6 = eVar9;
            eVar7 = eVar12222;
            str10 = str15222;
            z17 = z15;
            z18 = z19222;
            qVar3 = qVar4222;
            function03 = function04222;
            str11 = str7;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar4 = eVar;
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        str4 = str;
        i16 = i13 & 32;
        if (i16 != 0) {
        }
        i17 = i13 & 64;
        if (i17 != 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        i18 = i13 & 256;
        if (i18 == 0) {
        }
        i19 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i19 == 0) {
        }
        i21 = i19;
        i22 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i22 != 0) {
        }
        i25 = i13 & 2048;
        if (i25 != 0) {
        }
        int i382222 = i24;
        i27 = i13 & 4096;
        if (i27 != 0) {
        }
        i29 = i13 & 8192;
        if (i29 != 0) {
        }
        i32 = i13 & 16384;
        if (i32 != 0) {
        }
        if ((i14 & 306783379) != 306783378) {
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
        if (i21 != 0) {
        }
        if (i23 != 0) {
        }
        if (i26 != 0) {
        }
        if (i27 != 0) {
        }
        if (i29 != 0) {
        }
        if (i32 != 0) {
        }
        q qVar42222 = qVar2;
        Function0<Unit> function042222 = function02;
        S animateBackgroundAlpha2222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar42222, 0L, 0L, u11, (i33 >> 9) & 14, 3), 0.0f, 0.1f, u11, 432);
        boolean z192222 = z14;
        e b132222 = i.b(e.f40358c0, qVar42222, null, z192222, null, I1.i.a(i34), function042222, 8);
        boolean z212222 = i34;
        V f72222 = C5185h.f(InterfaceC6250b.a.o(), z212222);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f112222 = c.f(u11, b132222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f122222 = E.f(u11, f72222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f122222);
        F1.b(u11, f112222, InterfaceC2801g.a.f());
        C5187j c5187j2222 = C5187j.f39515a;
        e f132222 = a0.f(eVar8, style.getHeight());
        u11.o(-915039531);
        if ((i33 & 896) == 256) {
        }
        int i432222 = i14 & 14;
        z16 = (i432222 == 4) | ((i33 & 896) == 256 ? true : z212222 ? 1 : 0) | ((i14 & 896) == 256) | ((458752 & i14) == 131072) | ((57344 & i14) == 16384);
        C11 = u11.C();
        if (z16) {
        }
        String str122222 = str5;
        String str132222 = str6;
        C11 = new DsButtonKt$DsButton$3$1$1(str132222, title, z11, str122222, str4);
        str7 = str132222;
        str8 = str122222;
        u11.x(C11);
        u11.k();
        e a122222 = C6988h.a(o.a(f132222, (Function1) C11), h.b(style.getCornerRadius()));
        backgroundGradient = style.getBackgroundGradient();
        if (backgroundGradient != null) {
        }
        b11 = androidx.compose.foundation.e.b(a122222, style.getBackgroundColor(), y0.a());
        e e112222 = T.e(b11, style.getContentPadding());
        if (z11) {
        }
        K1.T titleTextStyle2222 = style.getTitleTextStyle();
        K1.T subtitleTextStyle2222 = style.getSubtitleTextStyle();
        long titleTextColor2222 = style.getTitleTextColor();
        boolean z232222 = z22;
        long subtitleTextColor2222 = style.getSubtitleTextColor();
        e eVar112222 = eVar8;
        AbstractC8972b abstractC8972b42222 = abstractC8972b2;
        e eVar122222 = eVar10;
        long iconColor2222 = style.getIconColor();
        DsSpacings dsSpacings2222 = DsSpacings.INSTANCE;
        float m1838getDp0D9Ej5fM2222 = dsSpacings2222.m1838getDp0D9Ej5fM();
        float m1861getDp8D9Ej5fM2222 = dsSpacings2222.m1861getDp8D9Ej5fM();
        u11.o(-914981635);
        if (str8 == null) {
        }
        u11.k();
        C4912a c4912a2222 = c11;
        int i442222 = i432222 | 805306368 | ((i14 >> 9) & 112) | ((i14 >> 12) & 896);
        int i452222 = ((i14 >> 15) & 896) | 54;
        int i462222 = i35 << 18;
        String str142222 = str4;
        String str152222 = str8;
        FoundationButtonKt.m2980FoundationButtonfOU4Dw4(title, str142222, abstractC8972b42222, z232222, titleTextStyle2222, subtitleTextStyle2222, titleTextColor2222, subtitleTextColor2222, iconColor2222, Float.NaN, m1838getDp0D9Ej5fM2222, m1861getDp8D9Ej5fM2222, function2, c4912a2222, e112222, null, eVar9, eVar122222, null, null, null, u11, i442222, i452222 | (3670016 & i462222) | (i462222 & 29360128), 0, 1867776);
        u11.o(-914962127);
        if (!z15) {
        }
        u11.k();
        u11.f();
        eVar5 = eVar112222;
        str9 = str142222;
        abstractC8972b3 = abstractC8972b42222;
        c3969l = u11;
        eVar6 = eVar9;
        eVar7 = eVar122222;
        str10 = str152222;
        z17 = z15;
        z18 = z192222;
        qVar3 = qVar42222;
        function03 = function042222;
        str11 = str7;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
