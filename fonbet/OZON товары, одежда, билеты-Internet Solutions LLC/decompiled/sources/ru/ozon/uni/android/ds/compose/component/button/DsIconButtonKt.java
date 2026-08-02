package ru.ozon.uni.android.ds.compose.component.button;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.S;
import T7.E;
import androidx.compose.foundation.i;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.J0;
import l1.K0;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.foundation.components.button.FoundationIconButtonKt;
import t0.p;
import t0.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ay\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0083\u0001\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lq1/b;", "icon", "Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;", "style", "Ll1/J0;", "shape", "Landroidx/compose/ui/e;", "modifier", "iconModifier", "", "enabled", "Lkotlin/Function0;", "", "loader", "hoverDisabled", "Lt0/q;", "interactionSource", "onClick", "DsIconButton", "(Lq1/b;Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;Ll1/J0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function2;ZLt0/q;Lkotlin/jvm/functions/Function0;LS0/k;II)V", "containerModifier", "(Lq1/b;Lru/ozon/uni/android/ds/compose/component/button/DsIconButtonStyle;Ll1/J0;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;ZLkotlin/jvm/functions/Function2;ZLt0/q;Lkotlin/jvm/functions/Function0;LS0/k;III)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsIconButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsIconButton(@NotNull AbstractC8972b icon, @NotNull DsIconButtonStyle style, @NotNull J0 shape, e eVar, e eVar2, boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z12, q qVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar3;
        int i14;
        e eVar4;
        int i15;
        boolean z13;
        int i16;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        boolean z14;
        q qVar2;
        int I11;
        e b11;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function23;
        C3969l c3969l;
        e eVar5;
        boolean z15;
        q qVar3;
        boolean z16;
        e b12;
        S0.J0 m02;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(73048691);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.n(icon) ? 4 : 2) | i11;
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
            i13 |= u11.n(shape) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i23 = i12 & 8;
        if (i23 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar3 = eVar;
            i13 |= u11.n(eVar3) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i14 = i12 & 16;
            if (i14 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                eVar4 = eVar2;
                i13 |= u11.n(eVar4) ? 16384 : 8192;
                i15 = i12 & 32;
                if (i15 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    z13 = z11;
                    i13 |= u11.p(z13) ? 131072 : 65536;
                    i16 = i12 & 64;
                    if (i16 == 0) {
                        i13 |= 1572864;
                    } else if ((1572864 & i11) == 0) {
                        function22 = function2;
                        i13 |= u11.F(function22) ? 1048576 : 524288;
                        i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i17 != 0) {
                            i13 |= 12582912;
                        } else if ((i11 & 12582912) == 0) {
                            i18 = i17;
                            i13 |= u11.p(z12) ? 8388608 : 4194304;
                            i19 = i12 & 256;
                            if (i19 == 0) {
                                i13 |= 100663296;
                            } else if ((i11 & 100663296) == 0) {
                                i21 = i19;
                                i13 |= u11.n(qVar) ? 67108864 : 33554432;
                                if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                                    i13 |= 805306368;
                                } else if ((i11 & 805306368) == 0) {
                                    i13 |= u11.F(onClick) ? 536870912 : 268435456;
                                }
                                i22 = i13;
                                if ((306783379 & i22) == 306783378 || !u11.b()) {
                                    e eVar6 = i23 != 0 ? e.f40358c0 : eVar3;
                                    e eVar7 = i14 != 0 ? e.f40358c0 : eVar4;
                                    boolean z17 = i15 != 0 ? true : z13;
                                    if (i16 != 0) {
                                        function22 = null;
                                    }
                                    z14 = i18 != 0 ? false : z12;
                                    if (i21 != 0) {
                                        u11.o(2097904583);
                                        Object C11 = u11.C();
                                        if (C11 == InterfaceC3967k.a.a()) {
                                            C11 = p.a();
                                            u11.x(C11);
                                        }
                                        u11.k();
                                        qVar2 = (q) C11;
                                    } else {
                                        qVar2 = qVar;
                                    }
                                    S animateBackgroundAlpha = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
                                    e.a aVar = e.f40358c0;
                                    V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    I11 = u11.I();
                                    A0 d11 = u11.d();
                                    e f11 = c.f(u11, aVar);
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
                                    b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
                                    q qVar4 = qVar2;
                                    boolean z18 = z17;
                                    Function2<? super InterfaceC3967k, ? super Integer, Unit> function24 = function22;
                                    e eVar8 = eVar6;
                                    e eVar9 = eVar7;
                                    FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function24, i.b(b11, qVar4, null, z17, null, I1.i.a(0), onClick, 8), eVar9, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
                                    u11.o(-1699603885);
                                    if (!z14) {
                                        b12 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar8, style.getSize()), shape), C7807Z.o(animateBackgroundAlpha.getFloatValue(), style.getIconColor()), y0.a());
                                        C5185h.a(b12, u11, 0);
                                    }
                                    u11.k();
                                    u11.f();
                                    function23 = function24;
                                    eVar4 = eVar9;
                                    c3969l = u11;
                                    eVar5 = eVar8;
                                    z15 = z18;
                                    qVar3 = qVar4;
                                    z16 = z14;
                                } else {
                                    u11.j();
                                    eVar5 = eVar3;
                                    z15 = z13;
                                    c3969l = u11;
                                    function23 = function22;
                                    z16 = z12;
                                    qVar3 = qVar;
                                }
                                m02 = c3969l.m0();
                                if (m02 != null) {
                                    m02.G(new DsIconButtonKt$DsIconButton$3(icon, style, shape, eVar5, eVar4, z15, function23, z16, qVar3, onClick, i11, i12));
                                    return;
                                }
                                return;
                            }
                            i21 = i19;
                            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                            }
                            i22 = i13;
                            if ((306783379 & i22) == 306783378) {
                            }
                            if (i23 != 0) {
                            }
                            if (i14 != 0) {
                            }
                            if (i15 != 0) {
                            }
                            if (i16 != 0) {
                            }
                            if (i18 != 0) {
                            }
                            if (i21 != 0) {
                            }
                            S animateBackgroundAlpha2 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
                            e.a aVar2 = e.f40358c0;
                            V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                            I11 = u11.I();
                            A0 d112 = u11.d();
                            e f112 = c.f(u11, aVar2);
                            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                            }
                            Function2 f122 = E.f(u11, f72, u11, d112);
                            if (!u11.t()) {
                            }
                            a.d(I11, u11, I11, f122);
                            F1.b(u11, f112, InterfaceC2801g.a.f());
                            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
                            q qVar42 = qVar2;
                            boolean z182 = z17;
                            Function2<? super InterfaceC3967k, ? super Integer, Unit> function242 = function22;
                            e eVar82 = eVar6;
                            e eVar92 = eVar7;
                            FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function242, i.b(b11, qVar42, null, z17, null, I1.i.a(0), onClick, 8), eVar92, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
                            u11.o(-1699603885);
                            if (!z14) {
                            }
                            u11.k();
                            u11.f();
                            function23 = function242;
                            eVar4 = eVar92;
                            c3969l = u11;
                            eVar5 = eVar82;
                            z15 = z182;
                            qVar3 = qVar42;
                            z16 = z14;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                            }
                        }
                        i18 = i17;
                        i19 = i12 & 256;
                        if (i19 == 0) {
                        }
                        i21 = i19;
                        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        }
                        i22 = i13;
                        if ((306783379 & i22) == 306783378) {
                        }
                        if (i23 != 0) {
                        }
                        if (i14 != 0) {
                        }
                        if (i15 != 0) {
                        }
                        if (i16 != 0) {
                        }
                        if (i18 != 0) {
                        }
                        if (i21 != 0) {
                        }
                        S animateBackgroundAlpha22 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
                        e.a aVar22 = e.f40358c0;
                        V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d1122 = u11.d();
                        e f1122 = c.f(u11, aVar22);
                        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                        }
                        Function2 f1222 = E.f(u11, f722, u11, d1122);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f1222);
                        F1.b(u11, f1122, InterfaceC2801g.a.f());
                        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
                        q qVar422 = qVar2;
                        boolean z1822 = z17;
                        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2422 = function22;
                        e eVar822 = eVar6;
                        e eVar922 = eVar7;
                        FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function2422, i.b(b11, qVar422, null, z17, null, I1.i.a(0), onClick, 8), eVar922, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
                        u11.o(-1699603885);
                        if (!z14) {
                        }
                        u11.k();
                        u11.f();
                        function23 = function2422;
                        eVar4 = eVar922;
                        c3969l = u11;
                        eVar5 = eVar822;
                        z15 = z1822;
                        qVar3 = qVar422;
                        z16 = z14;
                        m02 = c3969l.m0();
                        if (m02 != null) {
                        }
                    }
                    function22 = function2;
                    i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i17 != 0) {
                    }
                    i18 = i17;
                    i19 = i12 & 256;
                    if (i19 == 0) {
                    }
                    i21 = i19;
                    if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                    }
                    i22 = i13;
                    if ((306783379 & i22) == 306783378) {
                    }
                    if (i23 != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i15 != 0) {
                    }
                    if (i16 != 0) {
                    }
                    if (i18 != 0) {
                    }
                    if (i21 != 0) {
                    }
                    S animateBackgroundAlpha222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
                    e.a aVar222 = e.f40358c0;
                    V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d11222 = u11.d();
                    e f11222 = c.f(u11, aVar222);
                    Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 f12222 = E.f(u11, f7222, u11, d11222);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f12222);
                    F1.b(u11, f11222, InterfaceC2801g.a.f());
                    b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
                    q qVar4222 = qVar2;
                    boolean z18222 = z17;
                    Function2<? super InterfaceC3967k, ? super Integer, Unit> function24222 = function22;
                    e eVar8222 = eVar6;
                    e eVar9222 = eVar7;
                    FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function24222, i.b(b11, qVar4222, null, z17, null, I1.i.a(0), onClick, 8), eVar9222, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
                    u11.o(-1699603885);
                    if (!z14) {
                    }
                    u11.k();
                    u11.f();
                    function23 = function24222;
                    eVar4 = eVar9222;
                    c3969l = u11;
                    eVar5 = eVar8222;
                    z15 = z18222;
                    qVar3 = qVar4222;
                    z16 = z14;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                z13 = z11;
                i16 = i12 & 64;
                if (i16 == 0) {
                }
                function22 = function2;
                i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i17 != 0) {
                }
                i18 = i17;
                i19 = i12 & 256;
                if (i19 == 0) {
                }
                i21 = i19;
                if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i22 = i13;
                if ((306783379 & i22) == 306783378) {
                }
                if (i23 != 0) {
                }
                if (i14 != 0) {
                }
                if (i15 != 0) {
                }
                if (i16 != 0) {
                }
                if (i18 != 0) {
                }
                if (i21 != 0) {
                }
                S animateBackgroundAlpha2222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
                e.a aVar2222 = e.f40358c0;
                V f72222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d112222 = u11.d();
                e f112222 = c.f(u11, aVar2222);
                Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 f122222 = E.f(u11, f72222, u11, d112222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f122222);
                F1.b(u11, f112222, InterfaceC2801g.a.f());
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
                q qVar42222 = qVar2;
                boolean z182222 = z17;
                Function2<? super InterfaceC3967k, ? super Integer, Unit> function242222 = function22;
                e eVar82222 = eVar6;
                e eVar92222 = eVar7;
                FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function242222, i.b(b11, qVar42222, null, z17, null, I1.i.a(0), onClick, 8), eVar92222, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
                u11.o(-1699603885);
                if (!z14) {
                }
                u11.k();
                u11.f();
                function23 = function242222;
                eVar4 = eVar92222;
                c3969l = u11;
                eVar5 = eVar82222;
                z15 = z182222;
                qVar3 = qVar42222;
                z16 = z14;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            eVar4 = eVar2;
            i15 = i12 & 32;
            if (i15 != 0) {
            }
            z13 = z11;
            i16 = i12 & 64;
            if (i16 == 0) {
            }
            function22 = function2;
            i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i17 != 0) {
            }
            i18 = i17;
            i19 = i12 & 256;
            if (i19 == 0) {
            }
            i21 = i19;
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i22 = i13;
            if ((306783379 & i22) == 306783378) {
            }
            if (i23 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            if (i16 != 0) {
            }
            if (i18 != 0) {
            }
            if (i21 != 0) {
            }
            S animateBackgroundAlpha22222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
            e.a aVar22222 = e.f40358c0;
            V f722222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d1122222 = u11.d();
            e f1122222 = c.f(u11, aVar22222);
            Function0 a1122222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f1222222 = E.f(u11, f722222, u11, d1122222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f1222222);
            F1.b(u11, f1122222, InterfaceC2801g.a.f());
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
            q qVar422222 = qVar2;
            boolean z1822222 = z17;
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function2422222 = function22;
            e eVar822222 = eVar6;
            e eVar922222 = eVar7;
            FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function2422222, i.b(b11, qVar422222, null, z17, null, I1.i.a(0), onClick, 8), eVar922222, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
            u11.o(-1699603885);
            if (!z14) {
            }
            u11.k();
            u11.f();
            function23 = function2422222;
            eVar4 = eVar922222;
            c3969l = u11;
            eVar5 = eVar822222;
            z15 = z1822222;
            qVar3 = qVar422222;
            z16 = z14;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        eVar3 = eVar;
        i14 = i12 & 16;
        if (i14 == 0) {
        }
        eVar4 = eVar2;
        i15 = i12 & 32;
        if (i15 != 0) {
        }
        z13 = z11;
        i16 = i12 & 64;
        if (i16 == 0) {
        }
        function22 = function2;
        i17 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i17 != 0) {
        }
        i18 = i17;
        i19 = i12 & 256;
        if (i19 == 0) {
        }
        i21 = i19;
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i22 = i13;
        if ((306783379 & i22) == 306783378) {
        }
        if (i23 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        if (i16 != 0) {
        }
        if (i18 != 0) {
        }
        if (i21 != 0) {
        }
        S animateBackgroundAlpha222222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i22 >> 24) & 14, 3), 0.0f, 0.1f, u11, 432);
        e.a aVar222222 = e.f40358c0;
        V f7222222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d11222222 = u11.d();
        e f11222222 = c.f(u11, aVar222222);
        Function0 a11222222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f12222222 = E.f(u11, f7222222, u11, d11222222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f12222222);
        F1.b(u11, f11222222, InterfaceC2801g.a.f());
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar6, style.getSize()), shape), style.getBackgroundColor(), y0.a());
        q qVar4222222 = qVar2;
        boolean z18222222 = z17;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24222222 = function22;
        e eVar8222222 = eVar6;
        e eVar9222222 = eVar7;
        FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function24222222, i.b(b11, qVar4222222, null, z17, null, I1.i.a(0), onClick, 8), eVar9222222, null, u11, (i22 & 14) | 3072 | ((i22 >> 6) & 57344) | (3670016 & (i22 << 6)), UserVerificationMethods.USER_VERIFY_PATTERN);
        u11.o(-1699603885);
        if (!z14) {
        }
        u11.k();
        u11.f();
        function23 = function24222222;
        eVar4 = eVar9222222;
        c3969l = u11;
        eVar5 = eVar8222222;
        z15 = z18222222;
        qVar3 = qVar4222222;
        z16 = z14;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DsIconButton(@NotNull AbstractC8972b icon, @NotNull DsIconButtonStyle style, @NotNull J0 shape, e eVar, e eVar2, e eVar3, boolean z11, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, boolean z12, q qVar, @NotNull Function0<Unit> onClick, InterfaceC3967k interfaceC3967k, int i11, int i12, int i13) {
        int i14;
        e eVar4;
        int i15;
        e eVar5;
        int i16;
        e eVar6;
        int i17;
        boolean z13;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z14;
        q qVar2;
        int I11;
        AbstractC7799Q backgroundGradient;
        e eVar7;
        e eVar8;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function22;
        C3969l c3969l;
        e eVar9;
        e eVar10;
        boolean z15;
        e eVar11;
        q qVar3;
        boolean z16;
        e b11;
        S0.J0 m02;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        C3969l u11 = interfaceC3967k.u(154388326);
        if ((i13 & 1) != 0) {
            i14 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i14 = (u11.n(icon) ? 4 : 2) | i11;
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
            i14 |= u11.n(shape) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        int i27 = i13 & 8;
        if (i27 != 0) {
            i14 |= 3072;
        } else if ((i11 & 3072) == 0) {
            eVar4 = eVar;
            i14 |= u11.n(eVar4) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            i15 = i13 & 16;
            if (i15 == 0) {
                i14 |= 24576;
            } else if ((i11 & 24576) == 0) {
                eVar5 = eVar2;
                i14 |= u11.n(eVar5) ? 16384 : 8192;
                i16 = i13 & 32;
                if (i16 != 0) {
                    i14 |= 196608;
                } else if ((196608 & i11) == 0) {
                    eVar6 = eVar3;
                    i14 |= u11.n(eVar6) ? 131072 : 65536;
                    i17 = i13 & 64;
                    if (i17 == 0) {
                        i14 |= 1572864;
                        z13 = z11;
                    } else {
                        z13 = z11;
                        if ((i11 & 1572864) == 0) {
                            i14 |= u11.p(z13) ? 1048576 : 524288;
                        }
                    }
                    i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                    if (i18 == 0) {
                        i14 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        i19 = i14 | (u11.F(function2) ? 8388608 : 4194304);
                        i21 = i13 & 256;
                        if (i21 != 0) {
                            i19 |= 100663296;
                        } else if ((i11 & 100663296) == 0) {
                            i22 = i21;
                            i19 |= u11.p(z12) ? 67108864 : 33554432;
                            i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                            if (i23 == 0) {
                                i24 = i23;
                                i25 = i19 | 805306368;
                            } else {
                                if ((i11 & 805306368) == 0) {
                                    i24 = i23;
                                    i19 |= u11.n(qVar) ? 536870912 : 268435456;
                                } else {
                                    i24 = i23;
                                }
                                i25 = i19;
                            }
                            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                                i26 = i12 | 6;
                            } else if ((i12 & 6) == 0) {
                                i26 = i12 | (u11.F(onClick) ? 4 : 2);
                            } else {
                                i26 = i12;
                            }
                            int i28 = i26;
                            if ((i25 & 306783379) != 306783378 && (i28 & 3) == 2 && u11.b()) {
                                u11.j();
                                function22 = function2;
                                qVar3 = qVar;
                                eVar10 = eVar4;
                                eVar9 = eVar5;
                                c3969l = u11;
                                eVar11 = eVar6;
                                z16 = z12;
                                z15 = z13;
                            } else {
                                e eVar12 = i27 == 0 ? e.f40358c0 : eVar4;
                                e eVar13 = i15 == 0 ? e.f40358c0 : eVar5;
                                e eVar14 = i16 == 0 ? e.f40358c0 : eVar6;
                                if (i17 != 0) {
                                    z13 = true;
                                }
                                boolean z17 = z13;
                                Function2<? super InterfaceC3967k, ? super Integer, Unit> function23 = i18 == 0 ? null : function2;
                                z14 = i22 == 0 ? false : z12;
                                if (i24 == 0) {
                                    u11.o(2097975111);
                                    Object C11 = u11.C();
                                    if (C11 == InterfaceC3967k.a.a()) {
                                        C11 = p.a();
                                        u11.x(C11);
                                    }
                                    u11.k();
                                    qVar2 = (q) C11;
                                } else {
                                    qVar2 = qVar;
                                }
                                S animateBackgroundAlpha = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
                                V f7 = C5185h.f(InterfaceC6250b.a.o(), false);
                                I11 = u11.I();
                                A0 d11 = u11.d();
                                e f11 = c.f(u11, eVar14);
                                Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                                if (!u11.t()) {
                                    u11.H(a11);
                                } else {
                                    u11.e();
                                }
                                Function2 f12 = E.f(u11, f7, u11, d11);
                                if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                    a.d(I11, u11, I11, f12);
                                }
                                F1.b(u11, f11, InterfaceC2801g.a.f());
                                e a12 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
                                backgroundGradient = style.getBackgroundGradient();
                                if (backgroundGradient != null) {
                                    eVar7 = eVar12;
                                    eVar8 = eVar13;
                                    backgroundGradient = new K0(style.getBackgroundColor());
                                } else {
                                    eVar7 = eVar12;
                                    eVar8 = eVar13;
                                }
                                q qVar4 = qVar2;
                                Function2<? super InterfaceC3967k, ? super Integer, Unit> function24 = function23;
                                e eVar15 = eVar7;
                                e eVar16 = eVar8;
                                e eVar17 = eVar14;
                                FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function24, i.b(androidx.compose.foundation.e.a(a12, backgroundGradient, null, 6), qVar4, null, z17, null, I1.i.a(0), onClick, 8), eVar16, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
                                u11.o(-1699531469);
                                if (!z14) {
                                    b11 = androidx.compose.foundation.e.b(C6988h.a(a0.j(eVar15, style.getSize()), shape), C7807Z.o(animateBackgroundAlpha.getFloatValue(), style.getIconColor()), y0.a());
                                    C5185h.a(b11, u11, 0);
                                }
                                u11.k();
                                u11.f();
                                function22 = function24;
                                c3969l = u11;
                                eVar9 = eVar16;
                                eVar10 = eVar15;
                                z15 = z17;
                                eVar11 = eVar17;
                                qVar3 = qVar4;
                                z16 = z14;
                            }
                            m02 = c3969l.m0();
                            if (m02 == null) {
                                m02.G(new DsIconButtonKt$DsIconButton$6(icon, style, shape, eVar10, eVar9, eVar11, z15, function22, z16, qVar3, onClick, i11, i12, i13));
                                return;
                            }
                            return;
                        }
                        i22 = i21;
                        i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                        if (i23 == 0) {
                        }
                        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                        }
                        int i282 = i26;
                        if ((i25 & 306783379) != 306783378) {
                        }
                        if (i27 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 != 0) {
                        }
                        boolean z172 = z13;
                        if (i18 == 0) {
                        }
                        if (i22 == 0) {
                        }
                        if (i24 == 0) {
                        }
                        S animateBackgroundAlpha2 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
                        V f72 = C5185h.f(InterfaceC6250b.a.o(), false);
                        I11 = u11.I();
                        A0 d112 = u11.d();
                        e f112 = c.f(u11, eVar14);
                        Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                        if (!u11.t()) {
                        }
                        Function2 f122 = E.f(u11, f72, u11, d112);
                        if (!u11.t()) {
                        }
                        a.d(I11, u11, I11, f122);
                        F1.b(u11, f112, InterfaceC2801g.a.f());
                        e a122 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
                        backgroundGradient = style.getBackgroundGradient();
                        if (backgroundGradient != null) {
                        }
                        q qVar42 = qVar2;
                        Function2<? super InterfaceC3967k, ? super Integer, Unit> function242 = function23;
                        e eVar152 = eVar7;
                        e eVar162 = eVar8;
                        e eVar172 = eVar14;
                        FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function242, i.b(androidx.compose.foundation.e.a(a122, backgroundGradient, null, 6), qVar42, null, z172, null, I1.i.a(0), onClick, 8), eVar162, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
                        u11.o(-1699531469);
                        if (!z14) {
                        }
                        u11.k();
                        u11.f();
                        function22 = function242;
                        c3969l = u11;
                        eVar9 = eVar162;
                        eVar10 = eVar152;
                        z15 = z172;
                        eVar11 = eVar172;
                        qVar3 = qVar42;
                        z16 = z14;
                        m02 = c3969l.m0();
                        if (m02 == null) {
                        }
                    }
                    i19 = i14;
                    i21 = i13 & 256;
                    if (i21 != 0) {
                    }
                    i22 = i21;
                    i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                    if (i23 == 0) {
                    }
                    if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                    }
                    int i2822 = i26;
                    if ((i25 & 306783379) != 306783378) {
                    }
                    if (i27 == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 != 0) {
                    }
                    boolean z1722 = z13;
                    if (i18 == 0) {
                    }
                    if (i22 == 0) {
                    }
                    if (i24 == 0) {
                    }
                    S animateBackgroundAlpha22 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
                    V f722 = C5185h.f(InterfaceC6250b.a.o(), false);
                    I11 = u11.I();
                    A0 d1122 = u11.d();
                    e f1122 = c.f(u11, eVar14);
                    Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                    if (!u11.t()) {
                    }
                    Function2 f1222 = E.f(u11, f722, u11, d1122);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, f1222);
                    F1.b(u11, f1122, InterfaceC2801g.a.f());
                    e a1222 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
                    backgroundGradient = style.getBackgroundGradient();
                    if (backgroundGradient != null) {
                    }
                    q qVar422 = qVar2;
                    Function2<? super InterfaceC3967k, ? super Integer, Unit> function2422 = function23;
                    e eVar1522 = eVar7;
                    e eVar1622 = eVar8;
                    e eVar1722 = eVar14;
                    FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function2422, i.b(androidx.compose.foundation.e.a(a1222, backgroundGradient, null, 6), qVar422, null, z1722, null, I1.i.a(0), onClick, 8), eVar1622, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
                    u11.o(-1699531469);
                    if (!z14) {
                    }
                    u11.k();
                    u11.f();
                    function22 = function2422;
                    c3969l = u11;
                    eVar9 = eVar1622;
                    eVar10 = eVar1522;
                    z15 = z1722;
                    eVar11 = eVar1722;
                    qVar3 = qVar422;
                    z16 = z14;
                    m02 = c3969l.m0();
                    if (m02 == null) {
                    }
                }
                eVar6 = eVar3;
                i17 = i13 & 64;
                if (i17 == 0) {
                }
                i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i18 == 0) {
                }
                i19 = i14;
                i21 = i13 & 256;
                if (i21 != 0) {
                }
                i22 = i21;
                i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
                if (i23 == 0) {
                }
                if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                }
                int i28222 = i26;
                if ((i25 & 306783379) != 306783378) {
                }
                if (i27 == 0) {
                }
                if (i15 == 0) {
                }
                if (i16 == 0) {
                }
                if (i17 != 0) {
                }
                boolean z17222 = z13;
                if (i18 == 0) {
                }
                if (i22 == 0) {
                }
                if (i24 == 0) {
                }
                S animateBackgroundAlpha222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
                V f7222 = C5185h.f(InterfaceC6250b.a.o(), false);
                I11 = u11.I();
                A0 d11222 = u11.d();
                e f11222 = c.f(u11, eVar14);
                Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
                if (!u11.t()) {
                }
                Function2 f12222 = E.f(u11, f7222, u11, d11222);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, f12222);
                F1.b(u11, f11222, InterfaceC2801g.a.f());
                e a12222 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
                backgroundGradient = style.getBackgroundGradient();
                if (backgroundGradient != null) {
                }
                q qVar4222 = qVar2;
                Function2<? super InterfaceC3967k, ? super Integer, Unit> function24222 = function23;
                e eVar15222 = eVar7;
                e eVar16222 = eVar8;
                e eVar17222 = eVar14;
                FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function24222, i.b(androidx.compose.foundation.e.a(a12222, backgroundGradient, null, 6), qVar4222, null, z17222, null, I1.i.a(0), onClick, 8), eVar16222, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
                u11.o(-1699531469);
                if (!z14) {
                }
                u11.k();
                u11.f();
                function22 = function24222;
                c3969l = u11;
                eVar9 = eVar16222;
                eVar10 = eVar15222;
                z15 = z17222;
                eVar11 = eVar17222;
                qVar3 = qVar4222;
                z16 = z14;
                m02 = c3969l.m0();
                if (m02 == null) {
                }
            }
            eVar5 = eVar2;
            i16 = i13 & 32;
            if (i16 != 0) {
            }
            eVar6 = eVar3;
            i17 = i13 & 64;
            if (i17 == 0) {
            }
            i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i18 == 0) {
            }
            i19 = i14;
            i21 = i13 & 256;
            if (i21 != 0) {
            }
            i22 = i21;
            i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
            if (i23 == 0) {
            }
            if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            }
            int i282222 = i26;
            if ((i25 & 306783379) != 306783378) {
            }
            if (i27 == 0) {
            }
            if (i15 == 0) {
            }
            if (i16 == 0) {
            }
            if (i17 != 0) {
            }
            boolean z172222 = z13;
            if (i18 == 0) {
            }
            if (i22 == 0) {
            }
            if (i24 == 0) {
            }
            S animateBackgroundAlpha2222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
            V f72222 = C5185h.f(InterfaceC6250b.a.o(), false);
            I11 = u11.I();
            A0 d112222 = u11.d();
            e f112222 = c.f(u11, eVar14);
            Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
            if (!u11.t()) {
            }
            Function2 f122222 = E.f(u11, f72222, u11, d112222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f122222);
            F1.b(u11, f112222, InterfaceC2801g.a.f());
            e a122222 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
            backgroundGradient = style.getBackgroundGradient();
            if (backgroundGradient != null) {
            }
            q qVar42222 = qVar2;
            Function2<? super InterfaceC3967k, ? super Integer, Unit> function242222 = function23;
            e eVar152222 = eVar7;
            e eVar162222 = eVar8;
            e eVar172222 = eVar14;
            FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function242222, i.b(androidx.compose.foundation.e.a(a122222, backgroundGradient, null, 6), qVar42222, null, z172222, null, I1.i.a(0), onClick, 8), eVar162222, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
            u11.o(-1699531469);
            if (!z14) {
            }
            u11.k();
            u11.f();
            function22 = function242222;
            c3969l = u11;
            eVar9 = eVar162222;
            eVar10 = eVar152222;
            z15 = z172222;
            eVar11 = eVar172222;
            qVar3 = qVar42222;
            z16 = z14;
            m02 = c3969l.m0();
            if (m02 == null) {
            }
        }
        eVar4 = eVar;
        i15 = i13 & 16;
        if (i15 == 0) {
        }
        eVar5 = eVar2;
        i16 = i13 & 32;
        if (i16 != 0) {
        }
        eVar6 = eVar3;
        i17 = i13 & 64;
        if (i17 == 0) {
        }
        i18 = i13 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i18 == 0) {
        }
        i19 = i14;
        i21 = i13 & 256;
        if (i21 != 0) {
        }
        i22 = i21;
        i23 = i13 & UserVerificationMethods.USER_VERIFY_NONE;
        if (i23 == 0) {
        }
        if ((i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        int i2822222 = i26;
        if ((i25 & 306783379) != 306783378) {
        }
        if (i27 == 0) {
        }
        if (i15 == 0) {
        }
        if (i16 == 0) {
        }
        if (i17 != 0) {
        }
        boolean z1722222 = z13;
        if (i18 == 0) {
        }
        if (i22 == 0) {
        }
        if (i24 == 0) {
        }
        S animateBackgroundAlpha22222 = ButtonUtilsKt.animateBackgroundAlpha(ButtonUtilsKt.m1680rememberIndicationTransitionFbhrOv8(qVar2, 0L, 0L, u11, (i25 >> 27) & 14, 3), 0.0f, 0.1f, u11, 432);
        V f722222 = C5185h.f(InterfaceC6250b.a.o(), false);
        I11 = u11.I();
        A0 d1122222 = u11.d();
        e f1122222 = c.f(u11, eVar14);
        Function0 a1122222 = g.a(InterfaceC2801g.f5440U, u11);
        if (!u11.t()) {
        }
        Function2 f1222222 = E.f(u11, f722222, u11, d1122222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1222222);
        F1.b(u11, f1122222, InterfaceC2801g.a.f());
        e a1222222 = C6988h.a(a0.j(eVar12, style.getSize()), shape);
        backgroundGradient = style.getBackgroundGradient();
        if (backgroundGradient != null) {
        }
        q qVar422222 = qVar2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function2422222 = function23;
        e eVar1522222 = eVar7;
        e eVar1622222 = eVar8;
        e eVar1722222 = eVar14;
        FoundationIconButtonKt.m2984FoundationIconButtonM1461ms(icon, style.getIconColor(), style.getIconGradientBrush(), Float.NaN, function2422222, i.b(androidx.compose.foundation.e.a(a1222222, backgroundGradient, null, 6), qVar422222, null, z1722222, null, I1.i.a(0), onClick, 8), eVar1622222, null, u11, ((i25 << 6) & 3670016) | (i25 & 14) | 3072 | ((i25 >> 9) & 57344), UserVerificationMethods.USER_VERIFY_PATTERN);
        u11.o(-1699531469);
        if (!z14) {
        }
        u11.k();
        u11.f();
        function22 = function2422222;
        c3969l = u11;
        eVar9 = eVar1622222;
        eVar10 = eVar1522222;
        z15 = z1722222;
        eVar11 = eVar1722222;
        qVar3 = qVar422222;
        z16 = z14;
        m02 = c3969l.m0();
        if (m02 == null) {
        }
    }
}
