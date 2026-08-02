package ru.ozon.uni.components.tagButton;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import P0.p2;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.InterfaceC3978p0;
import S0.J0;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.T;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.components.loader.UniLoaderKt;
import ru.ozon.uni.components.loader.UniLoaderSize;
import ru.ozon.uni.components.tagButton.UniTagButtonStyle;
import ru.ozon.uni.core.R$drawable;
import ru.ozon.uni.core.compose.tokens.UniComposeIconTokensKt;
import ru.ozon.uni.core.repository.UniTheme;
import ru.ozon.uni.foundation.utils.ModifierUtilsKt;
import ru.ozon.uni.foundation.utils.SpacersKt;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;
import ru.ozon.uni.utils.PainterUtilsKt;
import ru.ozon.uni.utils.UniTestTagsKt;
import ru.ozon.uni.utils.VisualEffectsKt;
import t0.p;
import t0.q;
import t0.u;
import u0.C9891D;
import u0.EnumC9909s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a·\u0001\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b²\u0006\f\u0010\u001a\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "text", "Lkotlin/Function0;", "", "onClick", "onCloseClick", "Lq1/b;", "icon", "image", "indicator", "Lru/ozon/uni/components/tagButton/UniTagButtonState;", "state", "Lru/ozon/uni/components/tagButton/UniTagButtonStyle;", "style", "Lru/ozon/uni/components/tagButton/UniTagButtonSize;", "size", "", "closable", "rounded", "Lt0/q;", "interactionSource", "closeInteractionSource", "UniTagButton", "(Landroidx/compose/ui/e;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lq1/b;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lru/ozon/uni/components/tagButton/UniTagButtonState;Lru/ozon/uni/components/tagButton/UniTagButtonStyle;Lru/ozon/uni/components/tagButton/UniTagButtonSize;ZZLt0/q;Lt0/q;LS0/k;III)V", "isPressed", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTagButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UniTagButton(e eVar, @NotNull String text, @NotNull Function0<Unit> onClick, Function0<Unit> function0, AbstractC8972b abstractC8972b, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, UniTagButtonState uniTagButtonState, UniTagButtonStyle uniTagButtonStyle, UniTagButtonSize uniTagButtonSize, boolean z11, boolean z12, q qVar, q qVar2, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        e eVar2;
        int i14;
        Function0<Unit> function02;
        int i15;
        AbstractC8972b abstractC8972b2;
        int i16;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        int i17;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int i18;
        UniTagButtonState uniTagButtonState2;
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
        Function0<Unit> function03;
        UniTagButtonSize uniTagButtonSize2;
        boolean z13;
        q qVar3;
        int I11;
        boolean z14;
        boolean n11;
        Object C11;
        int I12;
        int I13;
        AbstractC8972b abstractC8972b3;
        C9891D c9891d;
        e.a aVar;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25;
        UniTagButtonState uniTagButtonState3;
        UniTagButtonSize uniTagButtonSize3;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26;
        e eVar3;
        float f7;
        float f11;
        Function0<Unit> function04;
        q qVar4;
        int i34;
        Function0<Unit> function05;
        q qVar5;
        C3969l c3969l;
        UniTagButtonStyle uniTagButtonStyle2;
        boolean z15;
        boolean z16;
        q qVar6;
        AbstractC8972b abstractC8972b4;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function27;
        UniTagButtonSize uniTagButtonSize4;
        e eVar4;
        J0 m02;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(-312573127);
        int i35 = i13 & 1;
        if (i35 != 0) {
            i14 = i11 | 6;
            eVar2 = eVar;
        } else if ((i11 & 6) == 0) {
            eVar2 = eVar;
            i14 = (u11.n(eVar2) ? 4 : 2) | i11;
        } else {
            eVar2 = eVar;
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i11 & 48) == 0) {
            i14 |= u11.n(text) ? 32 : 16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i11 & 384) == 0) {
            i14 |= u11.F(onClick) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i36 = i13 & 8;
        if (i36 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function02 = function0;
            i14 |= u11.F(function02) ? 2048 : 1024;
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                abstractC8972b2 = abstractC8972b;
                i14 |= u11.n(abstractC8972b2) ? 16384 : 8192;
                i16 = i13 & 32;
                if (i16 != 0) {
                    i14 |= 196608;
                    function23 = function2;
                } else {
                    function23 = function2;
                    if ((i11 & 196608) == 0) {
                        i14 |= u11.F(function23) ? 131072 : 65536;
                    }
                }
                i17 = i13 & 64;
                if (i17 != 0) {
                    i14 |= 1572864;
                    function24 = function22;
                } else {
                    function24 = function22;
                    if ((i11 & 1572864) == 0) {
                        i14 |= u11.F(function24) ? 1048576 : 524288;
                    }
                }
                i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i18 != 0) {
                    i14 |= 12582912;
                    uniTagButtonState2 = uniTagButtonState;
                } else {
                    uniTagButtonState2 = uniTagButtonState;
                    if ((i11 & 12582912) == 0) {
                        i14 |= u11.n(uniTagButtonState2) ? 8388608 : 4194304;
                    }
                }
                i19 = i13 & 256;
                if (i19 != 0) {
                    i14 |= 100663296;
                } else if ((i11 & 100663296) == 0) {
                    i21 = i19;
                    i14 |= u11.n(uniTagButtonStyle) ? 67108864 : 33554432;
                    i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i22 == 0) {
                        i23 = i22;
                        i24 = i14 | 805306368;
                    } else {
                        if ((i11 & 805306368) == 0) {
                            i23 = i22;
                            i14 |= u11.n(uniTagButtonSize) ? 536870912 : 268435456;
                        } else {
                            i23 = i22;
                        }
                        i24 = i14;
                    }
                    i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                    if (i25 == 0) {
                        i26 = i12 | 6;
                    } else if ((i12 & 6) == 0) {
                        i26 = i12 | (u11.p(z11) ? 4 : 2);
                    } else {
                        i26 = i12;
                    }
                    i27 = i13 & 2048;
                    if (i27 == 0) {
                        i26 |= 48;
                        i28 = i27;
                    } else if ((i12 & 48) == 0) {
                        i28 = i27;
                        i26 |= u11.p(z12) ? 32 : 16;
                    } else {
                        i28 = i27;
                    }
                    int i37 = i26;
                    i29 = i13 & 4096;
                    if (i29 == 0) {
                        i31 = i37 | 384;
                    } else {
                        int i38 = i37;
                        if ((i12 & 384) == 0) {
                            i38 |= u11.n(qVar) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                        }
                        i31 = i38;
                    }
                    i32 = i13 & 8192;
                    if (i32 == 0) {
                        i33 = i31 | 3072;
                    } else {
                        int i39 = i31;
                        if ((i12 & 3072) == 0) {
                            i33 = i39 | (u11.n(qVar2) ? 2048 : 1024);
                        } else {
                            i33 = i39;
                        }
                    }
                    if ((i24 & 306783379) != 306783378 && (i33 & 1171) == 1170 && u11.b()) {
                        u11.j();
                        uniTagButtonSize4 = uniTagButtonSize;
                        z15 = z11;
                        c3969l = u11;
                        eVar4 = eVar2;
                        function05 = function02;
                        abstractC8972b4 = abstractC8972b2;
                        function27 = function23;
                        uniTagButtonStyle2 = uniTagButtonStyle;
                        z16 = z12;
                        qVar6 = qVar;
                        qVar5 = qVar2;
                    } else {
                        e eVar5 = i35 == 0 ? e.f40358c0 : eVar2;
                        if (i36 == 0) {
                            u11.o(-38894303);
                            Object C12 = u11.C();
                            if (C12 == InterfaceC3967k.a.a()) {
                                C12 = UniTagButtonKt$UniTagButton$1$1.INSTANCE;
                                u11.x(C12);
                            }
                            u11.k();
                            function03 = (Function0) C12;
                        } else {
                            function03 = function02;
                        }
                        if (i15 != 0) {
                            abstractC8972b2 = null;
                        }
                        Function2<? super InterfaceC3967k, ? super Integer, Unit> function28 = i16 == 0 ? null : function23;
                        if (i17 != 0) {
                            function24 = null;
                        }
                        UniTagButtonState uniTagButtonState4 = i18 == 0 ? UniTagButtonState.Default : uniTagButtonState2;
                        UniTagButtonStyle uniTagButtonStyle3 = i21 == 0 ? UniTagButtonStyle.Default.INSTANCE : uniTagButtonStyle;
                        uniTagButtonSize2 = i23 == 0 ? UniTagButtonSize.Size600 : uniTagButtonSize;
                        z13 = i25 == 0 ? false : z11;
                        boolean z17 = i28 == 0 ? false : z12;
                        if (i29 == 0) {
                            u11.o(-38881242);
                            Object C13 = u11.C();
                            if (C13 == InterfaceC3967k.a.a()) {
                                C13 = p.a();
                                u11.x(C13);
                            }
                            qVar3 = (q) C13;
                            u11.k();
                        } else {
                            qVar3 = qVar;
                        }
                        q qVar7 = i32 == 0 ? null : qVar2;
                        InterfaceC3978p0 a11 = u.a(qVar3, u11, (i33 >> 6) & 14);
                        boolean z18 = uniTagButtonState4 == UniTagButtonState.Disabled;
                        float horizontalPadding = uniTagButtonSize2.getHorizontalPadding();
                        UniTagButtonColors selectedColors = (uniTagButtonState4 != UniTagButtonState.Selected || uniTagButtonState4 == UniTagButtonState.LoadingSelected) ? uniTagButtonStyle3.getSelectedColors() : uniTagButtonStyle3.getColors();
                        V f12 = C5185h.f(InterfaceC6250b.a.e(), false);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f13 = c.f(u11, eVar5);
                        e eVar6 = eVar5;
                        Function0 a12 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a12);
                        }
                        Function2 f14 = E.f(u11, f12, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, f14);
                        }
                        F1.b(u11, f13, InterfaceC2801g.a.f());
                        z14 = uniTagButtonState4 != UniTagButtonState.Loading || uniTagButtonState4 == UniTagButtonState.LoadingSelected;
                        e.a aVar2 = e.f40358c0;
                        e a13 = androidx.compose.foundation.e.a(C6988h.a(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(a0.h(M.a(C6981a.a(UniTestTagsKt.uniTestTag(a0.x(aVar2, null, 3), UniTagButtonTestTags.Container, null, u11, 54, 2), !z18 ? 1.0f : 0.4f), EnumC9909s.Min), uniTagButtonSize2.getHeight(), 0.0f, 2)), h.b(!z17 ? 99 : uniTagButtonSize2.getCornerRadius())), DeferredBrush.getValue(selectedColors.getBackgroundColor(), u11, 0), null, 6);
                        u11.o(1975452075);
                        n11 = u11.n(a11);
                        C11 = u11.C();
                        if (!n11 || C11 == InterfaceC3967k.a.a()) {
                            C11 = new UniTagButtonKt$UniTagButton$3$1$1(a11);
                            u11.x(C11);
                        }
                        u11.k();
                        boolean z19 = z18;
                        e m3269hoverEffect8wvRk98$default = VisualEffectsKt.m3269hoverEffect8wvRk98$default(a13, (Function0) C11, z19, C7807Z.m(DeferredColor.getValue(selectedColors.getTextColor(), u11, 0)), 0.0f, 8, null);
                        Y b11 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                        I12 = u11.I();
                        A0 d12 = u11.d();
                        e f15 = c.f(u11, m3269hoverEffect8wvRk98$default);
                        Function0 a14 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a14);
                        }
                        Function2 h11 = Cm.e.h(u11, b11, u11, d12);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                            a.d(I12, u11, I12, h11);
                        }
                        F1.b(u11, f15, InterfaceC2801g.a.f());
                        C9891D c9891d2 = C9891D.f99599a;
                        q qVar8 = qVar3;
                        e j11 = T.j(i.b(c9891d2.a(C6981a.a(aVar2, !z14 ? 0.0f : 1.0f), 1.0f, false), qVar8, null, z19, null, null, onClick, 24), horizontalPadding, 0.0f, !z13 ? 0 : horizontalPadding, 0.0f, 10);
                        Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                        I13 = u11.I();
                        A0 d13 = u11.d();
                        e f16 = c.f(u11, j11);
                        Function0 a15 = InterfaceC2801g.a.a();
                        u11.i();
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a15);
                        }
                        Function2 h12 = Cm.e.h(u11, b12, u11, d13);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I13))) {
                            a.d(I13, u11, I13, h12);
                        }
                        U7.i.b(u11, f16, 794023174);
                        if (uniTagButtonSize2 == UniTagButtonSize.Size600) {
                            abstractC8972b3 = abstractC8972b2;
                        } else if (abstractC8972b2 != null) {
                            u11.o(-1155016808);
                            e n12 = a0.n(aVar2, 20);
                            P9.a.b(n12, "tagButton icon");
                            AbstractC8972b abstractC8972b5 = abstractC8972b2;
                            P0.E.a(abstractC8972b5, null, UniTestTagsKt.uniTestTag(n12, UniTagButtonTestTags.Icon, null, u11, 54, 2), PainterUtilsKt.m3266takeIfNotMulticolorIconDxMtmZc(DeferredColor.getValue(selectedColors.getIconColor(), u11, 0), abstractC8972b2), u11, ((i24 >> 12) & 14) | 48);
                            abstractC8972b3 = abstractC8972b5;
                            u11.k();
                        } else {
                            abstractC8972b3 = abstractC8972b2;
                            if (function28 != null) {
                                u11.o(-1154512221);
                                e j12 = a0.j(aVar2, 20);
                                V f17 = C5185h.f(InterfaceC6250b.a.o(), false);
                                int I14 = u11.I();
                                A0 d14 = u11.d();
                                e f18 = c.f(u11, j12);
                                Function0 a16 = InterfaceC2801g.a.a();
                                u11.i();
                                if (u11.t()) {
                                    u11.H(a16);
                                } else {
                                    u11.e();
                                }
                                Function2 f19 = E.f(u11, f17, u11, d14);
                                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                                    a.d(I14, u11, I14, f19);
                                }
                                F1.b(u11, f18, InterfaceC2801g.a.f());
                                function28.invoke(u11, Integer.valueOf((i24 >> 15) & 14));
                                u11.f();
                                u11.k();
                            } else {
                                u11.o(-1154355578);
                                u11.k();
                            }
                        }
                        u11.k();
                        u11.o(794048459);
                        if (kotlin.text.h.K(text)) {
                            e h13 = T.h(c9891d2.a(aVar2, 1.0f, false), 4, 0.0f, 2);
                            P9.a.b(h13, "tagButton text");
                            function25 = function28;
                            uniTagButtonState3 = uniTagButtonState4;
                            uniTagButtonSize3 = uniTagButtonSize2;
                            f7 = 1.0f;
                            f11 = 0.0f;
                            eVar3 = eVar6;
                            c9891d = c9891d2;
                            aVar = aVar2;
                            function26 = function24;
                            p2.b(text, UniTestTagsKt.uniTestTag(h13, UniTagButtonTestTags.Text, null, u11, 48, 2), DeferredColor.getValue(selectedColors.getTextColor(), u11, 0), 0L, 0L, null, 0L, 2, false, 1, 0, UniTheme.INSTANCE.getTypography().getBodyControl400Small(), u11, (i24 >> 3) & 14, 3120, 55288);
                            u11 = u11;
                        } else {
                            c9891d = c9891d2;
                            aVar = aVar2;
                            function25 = function28;
                            uniTagButtonState3 = uniTagButtonState4;
                            uniTagButtonSize3 = uniTagButtonSize2;
                            function26 = function24;
                            eVar3 = eVar6;
                            f7 = 1.0f;
                            f11 = 0.0f;
                        }
                        u11.k();
                        u11.o(794068435);
                        function24 = function26;
                        if (function24 != null) {
                            function24.invoke(u11, Integer.valueOf((i24 >> 18) & 14));
                            SpacersKt.m3044SpacerWidthziNgDLE(c9891d, 4, u11, 54);
                        }
                        u11.k();
                        u11.f();
                        u11.o(1477422421);
                        if (z13) {
                            function04 = function03;
                            qVar4 = qVar7;
                            i34 = 0;
                        } else {
                            e.a aVar3 = aVar;
                            Function0<Unit> function06 = function03;
                            q qVar9 = qVar7;
                            e b13 = i.b(a0.c(C6981a.a(aVar3, z14 ? f11 : f7)), qVar9, null, z19, null, null, function06, 24);
                            qVar4 = qVar9;
                            function04 = function06;
                            i34 = 0;
                            V f21 = C5185h.f(InterfaceC6250b.a.h(), false);
                            int I15 = u11.I();
                            A0 d15 = u11.d();
                            e f22 = c.f(u11, b13);
                            Function0 a17 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a17);
                            } else {
                                u11.e();
                            }
                            Function2 f23 = E.f(u11, f21, u11, d15);
                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I15))) {
                                a.d(I15, u11, I15, f23);
                            }
                            F1.b(u11, f22, InterfaceC2801g.a.f());
                            aVar = aVar3;
                            e n13 = a0.n(T.j(aVar3, 0.0f, 0.0f, horizontalPadding, 0.0f, 11), 16);
                            P9.a.b(n13, "tagButton closeIcon");
                            e uniTestTag = UniTestTagsKt.uniTestTag(n13, UniTagButtonTestTags.CloseButton, null, u11, 48, 2);
                            long value = DeferredColor.getValue(selectedColors.getCloseIconColor(), u11, 0);
                            UniTheme.INSTANCE.getIcons();
                            u11.B(945175447);
                            AbstractC8972b uniPainterResource = UniComposeIconTokensKt.uniPainterResource(R$drawable.ic_m_cross_filled, "ic_m_cross_filled", u11, 48);
                            u11.K();
                            P0.E.a(uniPainterResource, null, uniTestTag, value, u11, 48);
                            u11.f();
                        }
                        u11.k();
                        u11.f();
                        u11.o(1975565927);
                        if (z14) {
                            UniLoaderKt.m1924UniLoader3IgeMak(UniTestTagsKt.uniTestTag(aVar, UniTagButtonTestTags.Loader, null, u11, 54, 2), DeferredColor.getValue(selectedColors.getLoaderColor(), u11, i34), UniLoaderSize.Size200, u11, 384, 0);
                        }
                        u11.k();
                        u11.f();
                        function05 = function04;
                        qVar5 = qVar4;
                        c3969l = u11;
                        uniTagButtonStyle2 = uniTagButtonStyle3;
                        z15 = z13;
                        z16 = z17;
                        qVar6 = qVar8;
                        abstractC8972b4 = abstractC8972b3;
                        function27 = function25;
                        uniTagButtonState2 = uniTagButtonState3;
                        uniTagButtonSize4 = uniTagButtonSize3;
                        eVar4 = eVar3;
                    }
                    Function2<? super InterfaceC3967k, ? super Integer, Unit> function29 = function24;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                        m02.G(new UniTagButtonKt$UniTagButton$4(eVar4, text, onClick, function05, abstractC8972b4, function27, function29, uniTagButtonState2, uniTagButtonStyle2, uniTagButtonSize4, z15, z16, qVar6, qVar5, i11, i12, i13));
                        return;
                    }
                    return;
                }
                i21 = i19;
                i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i22 == 0) {
                }
                i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
                if (i25 == 0) {
                }
                i27 = i13 & 2048;
                if (i27 == 0) {
                }
                int i372 = i26;
                i29 = i13 & 4096;
                if (i29 == 0) {
                }
                i32 = i13 & 8192;
                if (i32 == 0) {
                }
                if ((i24 & 306783379) != 306783378) {
                }
                if (i35 == 0) {
                }
                if (i36 == 0) {
                }
                if (i15 != 0) {
                }
                if (i16 == 0) {
                }
                if (i17 != 0) {
                }
                if (i18 == 0) {
                }
                if (i21 == 0) {
                }
                if (i23 == 0) {
                }
                if (i25 == 0) {
                }
                if (i28 == 0) {
                }
                if (i29 == 0) {
                }
                if (i32 == 0) {
                }
                InterfaceC3978p0 a112 = u.a(qVar3, u11, (i33 >> 6) & 14);
                if (uniTagButtonState4 == UniTagButtonState.Disabled) {
                }
                float horizontalPadding2 = uniTagButtonSize2.getHorizontalPadding();
                UniTagButtonColors selectedColors2 = (uniTagButtonState4 != UniTagButtonState.Selected || uniTagButtonState4 == UniTagButtonState.LoadingSelected) ? uniTagButtonStyle3.getSelectedColors() : uniTagButtonStyle3.getColors();
                V f122 = C5185h.f(InterfaceC6250b.a.e(), false);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f132 = c.f(u11, eVar5);
                e eVar62 = eVar5;
                Function0 a122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f142 = E.f(u11, f122, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f142);
                F1.b(u11, f132, InterfaceC2801g.a.f());
                if (uniTagButtonState4 != UniTagButtonState.Loading) {
                }
                e.a aVar22 = e.f40358c0;
                e a132 = androidx.compose.foundation.e.a(C6988h.a(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(a0.h(M.a(C6981a.a(UniTestTagsKt.uniTestTag(a0.x(aVar22, null, 3), UniTagButtonTestTags.Container, null, u11, 54, 2), !z18 ? 1.0f : 0.4f), EnumC9909s.Min), uniTagButtonSize2.getHeight(), 0.0f, 2)), h.b(!z17 ? 99 : uniTagButtonSize2.getCornerRadius())), DeferredBrush.getValue(selectedColors2.getBackgroundColor(), u11, 0), null, 6);
                u11.o(1975452075);
                n11 = u11.n(a112);
                C11 = u11.C();
                if (!n11) {
                }
                C11 = new UniTagButtonKt$UniTagButton$3$1$1(a112);
                u11.x(C11);
                u11.k();
                boolean z192 = z18;
                e m3269hoverEffect8wvRk98$default2 = VisualEffectsKt.m3269hoverEffect8wvRk98$default(a132, (Function0) C11, z192, C7807Z.m(DeferredColor.getValue(selectedColors2.getTextColor(), u11, 0)), 0.0f, 8, null);
                Y b112 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
                I12 = u11.I();
                A0 d122 = u11.d();
                e f152 = c.f(u11, m3269hoverEffect8wvRk98$default2);
                Function0 a142 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b112, u11, d122);
                if (!u11.t()) {
                }
                a.d(I12, u11, I12, h112);
                F1.b(u11, f152, InterfaceC2801g.a.f());
                C9891D c9891d22 = C9891D.f99599a;
                q qVar82 = qVar3;
                e j112 = T.j(i.b(c9891d22.a(C6981a.a(aVar22, !z14 ? 0.0f : 1.0f), 1.0f, false), qVar82, null, z192, null, null, onClick, 24), horizontalPadding2, 0.0f, !z13 ? 0 : horizontalPadding2, 0.0f, 10);
                Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I13 = u11.I();
                A0 d132 = u11.d();
                e f162 = c.f(u11, j112);
                Function0 a152 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 h122 = Cm.e.h(u11, b122, u11, d132);
                if (!u11.t()) {
                }
                a.d(I13, u11, I13, h122);
                U7.i.b(u11, f162, 794023174);
                if (uniTagButtonSize2 == UniTagButtonSize.Size600) {
                }
                u11.k();
                u11.o(794048459);
                if (kotlin.text.h.K(text)) {
                }
                u11.k();
                u11.o(794068435);
                function24 = function26;
                if (function24 != null) {
                }
                u11.k();
                u11.f();
                u11.o(1477422421);
                if (z13) {
                }
                u11.k();
                u11.f();
                u11.o(1975565927);
                if (z14) {
                }
                u11.k();
                u11.f();
                function05 = function04;
                qVar5 = qVar4;
                c3969l = u11;
                uniTagButtonStyle2 = uniTagButtonStyle3;
                z15 = z13;
                z16 = z17;
                qVar6 = qVar82;
                abstractC8972b4 = abstractC8972b3;
                function27 = function25;
                uniTagButtonState2 = uniTagButtonState3;
                uniTagButtonSize4 = uniTagButtonSize3;
                eVar4 = eVar3;
                Function2<? super InterfaceC3967k, ? super Integer, Unit> function292 = function24;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            abstractC8972b2 = abstractC8972b;
            i16 = i13 & 32;
            if (i16 != 0) {
            }
            i17 = i13 & 64;
            if (i17 != 0) {
            }
            i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 != 0) {
            }
            i19 = i13 & 256;
            if (i19 != 0) {
            }
            i21 = i19;
            i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i22 == 0) {
            }
            i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
            if (i25 == 0) {
            }
            i27 = i13 & 2048;
            if (i27 == 0) {
            }
            int i3722 = i26;
            i29 = i13 & 4096;
            if (i29 == 0) {
            }
            i32 = i13 & 8192;
            if (i32 == 0) {
            }
            if ((i24 & 306783379) != 306783378) {
            }
            if (i35 == 0) {
            }
            if (i36 == 0) {
            }
            if (i15 != 0) {
            }
            if (i16 == 0) {
            }
            if (i17 != 0) {
            }
            if (i18 == 0) {
            }
            if (i21 == 0) {
            }
            if (i23 == 0) {
            }
            if (i25 == 0) {
            }
            if (i28 == 0) {
            }
            if (i29 == 0) {
            }
            if (i32 == 0) {
            }
            InterfaceC3978p0 a1122 = u.a(qVar3, u11, (i33 >> 6) & 14);
            if (uniTagButtonState4 == UniTagButtonState.Disabled) {
            }
            float horizontalPadding22 = uniTagButtonSize2.getHorizontalPadding();
            UniTagButtonColors selectedColors22 = (uniTagButtonState4 != UniTagButtonState.Selected || uniTagButtonState4 == UniTagButtonState.LoadingSelected) ? uniTagButtonStyle3.getSelectedColors() : uniTagButtonStyle3.getColors();
            V f1222 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f1322 = c.f(u11, eVar5);
            e eVar622 = eVar5;
            Function0 a1222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1422 = E.f(u11, f1222, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1422);
            F1.b(u11, f1322, InterfaceC2801g.a.f());
            if (uniTagButtonState4 != UniTagButtonState.Loading) {
            }
            e.a aVar222 = e.f40358c0;
            e a1322 = androidx.compose.foundation.e.a(C6988h.a(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(a0.h(M.a(C6981a.a(UniTestTagsKt.uniTestTag(a0.x(aVar222, null, 3), UniTagButtonTestTags.Container, null, u11, 54, 2), !z18 ? 1.0f : 0.4f), EnumC9909s.Min), uniTagButtonSize2.getHeight(), 0.0f, 2)), h.b(!z17 ? 99 : uniTagButtonSize2.getCornerRadius())), DeferredBrush.getValue(selectedColors22.getBackgroundColor(), u11, 0), null, 6);
            u11.o(1975452075);
            n11 = u11.n(a1122);
            C11 = u11.C();
            if (!n11) {
            }
            C11 = new UniTagButtonKt$UniTagButton$3$1$1(a1122);
            u11.x(C11);
            u11.k();
            boolean z1922 = z18;
            e m3269hoverEffect8wvRk98$default22 = VisualEffectsKt.m3269hoverEffect8wvRk98$default(a1322, (Function0) C11, z1922, C7807Z.m(DeferredColor.getValue(selectedColors22.getTextColor(), u11, 0)), 0.0f, 8, null);
            Y b1122 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
            I12 = u11.I();
            A0 d1222 = u11.d();
            e f1522 = c.f(u11, m3269hoverEffect8wvRk98$default22);
            Function0 a1422 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1122, u11, d1222);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, h1122);
            F1.b(u11, f1522, InterfaceC2801g.a.f());
            C9891D c9891d222 = C9891D.f99599a;
            q qVar822 = qVar3;
            e j1122 = T.j(i.b(c9891d222.a(C6981a.a(aVar222, !z14 ? 0.0f : 1.0f), 1.0f, false), qVar822, null, z1922, null, null, onClick, 24), horizontalPadding22, 0.0f, !z13 ? 0 : horizontalPadding22, 0.0f, 10);
            Y b1222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I13 = u11.I();
            A0 d1322 = u11.d();
            e f1622 = c.f(u11, j1122);
            Function0 a1522 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 h1222 = Cm.e.h(u11, b1222, u11, d1322);
            if (!u11.t()) {
            }
            a.d(I13, u11, I13, h1222);
            U7.i.b(u11, f1622, 794023174);
            if (uniTagButtonSize2 == UniTagButtonSize.Size600) {
            }
            u11.k();
            u11.o(794048459);
            if (kotlin.text.h.K(text)) {
            }
            u11.k();
            u11.o(794068435);
            function24 = function26;
            if (function24 != null) {
            }
            u11.k();
            u11.f();
            u11.o(1477422421);
            if (z13) {
            }
            u11.k();
            u11.f();
            u11.o(1975565927);
            if (z14) {
            }
            u11.k();
            u11.f();
            function05 = function04;
            qVar5 = qVar4;
            c3969l = u11;
            uniTagButtonStyle2 = uniTagButtonStyle3;
            z15 = z13;
            z16 = z17;
            qVar6 = qVar822;
            abstractC8972b4 = abstractC8972b3;
            function27 = function25;
            uniTagButtonState2 = uniTagButtonState3;
            uniTagButtonSize4 = uniTagButtonSize3;
            eVar4 = eVar3;
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function2922 = function24;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        function02 = function0;
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        abstractC8972b2 = abstractC8972b;
        i16 = i13 & 32;
        if (i16 != 0) {
        }
        i17 = i13 & 64;
        if (i17 != 0) {
        }
        i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 != 0) {
        }
        i19 = i13 & 256;
        if (i19 != 0) {
        }
        i21 = i19;
        i22 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i22 == 0) {
        }
        i25 = i13 & UserVerificationMethods.USER_VERIFY_ALL;
        if (i25 == 0) {
        }
        i27 = i13 & 2048;
        if (i27 == 0) {
        }
        int i37222 = i26;
        i29 = i13 & 4096;
        if (i29 == 0) {
        }
        i32 = i13 & 8192;
        if (i32 == 0) {
        }
        if ((i24 & 306783379) != 306783378) {
        }
        if (i35 == 0) {
        }
        if (i36 == 0) {
        }
        if (i15 != 0) {
        }
        if (i16 == 0) {
        }
        if (i17 != 0) {
        }
        if (i18 == 0) {
        }
        if (i21 == 0) {
        }
        if (i23 == 0) {
        }
        if (i25 == 0) {
        }
        if (i28 == 0) {
        }
        if (i29 == 0) {
        }
        if (i32 == 0) {
        }
        InterfaceC3978p0 a11222 = u.a(qVar3, u11, (i33 >> 6) & 14);
        if (uniTagButtonState4 == UniTagButtonState.Disabled) {
        }
        float horizontalPadding222 = uniTagButtonSize2.getHorizontalPadding();
        UniTagButtonColors selectedColors222 = (uniTagButtonState4 != UniTagButtonState.Selected || uniTagButtonState4 == UniTagButtonState.LoadingSelected) ? uniTagButtonStyle3.getSelectedColors() : uniTagButtonStyle3.getColors();
        V f12222 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f13222 = c.f(u11, eVar5);
        e eVar6222 = eVar5;
        Function0 a12222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f14222 = E.f(u11, f12222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f14222);
        F1.b(u11, f13222, InterfaceC2801g.a.f());
        if (uniTagButtonState4 != UniTagButtonState.Loading) {
        }
        e.a aVar2222 = e.f40358c0;
        e a13222 = androidx.compose.foundation.e.a(C6988h.a(ModifierUtilsKt.maxIntrinsicWidthIfInLazyRow(a0.h(M.a(C6981a.a(UniTestTagsKt.uniTestTag(a0.x(aVar2222, null, 3), UniTagButtonTestTags.Container, null, u11, 54, 2), !z18 ? 1.0f : 0.4f), EnumC9909s.Min), uniTagButtonSize2.getHeight(), 0.0f, 2)), h.b(!z17 ? 99 : uniTagButtonSize2.getCornerRadius())), DeferredBrush.getValue(selectedColors222.getBackgroundColor(), u11, 0), null, 6);
        u11.o(1975452075);
        n11 = u11.n(a11222);
        C11 = u11.C();
        if (!n11) {
        }
        C11 = new UniTagButtonKt$UniTagButton$3$1$1(a11222);
        u11.x(C11);
        u11.k();
        boolean z19222 = z18;
        e m3269hoverEffect8wvRk98$default222 = VisualEffectsKt.m3269hoverEffect8wvRk98$default(a13222, (Function0) C11, z19222, C7807Z.m(DeferredColor.getValue(selectedColors222.getTextColor(), u11, 0)), 0.0f, 8, null);
        Y b11222 = X.b(C5179b.b(), InterfaceC6250b.a.i(), u11, 54);
        I12 = u11.I();
        A0 d12222 = u11.d();
        e f15222 = c.f(u11, m3269hoverEffect8wvRk98$default222);
        Function0 a14222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b11222, u11, d12222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, h11222);
        F1.b(u11, f15222, InterfaceC2801g.a.f());
        C9891D c9891d2222 = C9891D.f99599a;
        q qVar8222 = qVar3;
        e j11222 = T.j(i.b(c9891d2222.a(C6981a.a(aVar2222, !z14 ? 0.0f : 1.0f), 1.0f, false), qVar8222, null, z19222, null, null, onClick, 24), horizontalPadding222, 0.0f, !z13 ? 0 : horizontalPadding222, 0.0f, 10);
        Y b12222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I13 = u11.I();
        A0 d13222 = u11.d();
        e f16222 = c.f(u11, j11222);
        Function0 a15222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 h12222 = Cm.e.h(u11, b12222, u11, d13222);
        if (!u11.t()) {
        }
        a.d(I13, u11, I13, h12222);
        U7.i.b(u11, f16222, 794023174);
        if (uniTagButtonSize2 == UniTagButtonSize.Size600) {
        }
        u11.k();
        u11.o(794048459);
        if (kotlin.text.h.K(text)) {
        }
        u11.k();
        u11.o(794068435);
        function24 = function26;
        if (function24 != null) {
        }
        u11.k();
        u11.f();
        u11.o(1477422421);
        if (z13) {
        }
        u11.k();
        u11.f();
        u11.o(1975565927);
        if (z14) {
        }
        u11.k();
        u11.f();
        function05 = function04;
        qVar5 = qVar4;
        c3969l = u11;
        uniTagButtonStyle2 = uniTagButtonStyle3;
        z15 = z13;
        z16 = z17;
        qVar6 = qVar8222;
        abstractC8972b4 = abstractC8972b3;
        function27 = function25;
        uniTagButtonState2 = uniTagButtonState3;
        uniTagButtonSize4 = uniTagButtonSize3;
        eVar4 = eVar3;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function29222 = function24;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean UniTagButton$lambda$2(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }
}
