package ru.ozon.uni.foundation.components.button;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import S0.A0;
import S0.A1;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import S0.S;
import S0.m1;
import Sc.InterfaceC3999a;
import T7.E;
import U7.i;
import a1.C4912a;
import a1.c;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import i1.C6981a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "iconModifier", "Lq1/b;", "icon", "", "isLoading", "LS0/A1;", "", "iconAlpha", "Ll1/Z;", "iconColor", "LZ1/h;", "iconSize", "Lkotlin/Function0;", "", "loader", "FoundationIconButton-5IdfQCw", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Lq1/b;ZLS0/A1;JFLkotlin/jvm/functions/Function2;LS0/k;I)V", "FoundationIconButton", "Ll1/Q;", "iconGradientBrush", "LS0/S;", "FoundationIconButton-M1461ms", "(Lq1/b;JLl1/Q;FLkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/S;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationIconButtonKt {
    @InterfaceC3999a
    /* renamed from: FoundationIconButton-5IdfQCw, reason: not valid java name */
    public static final void m2983FoundationIconButton5IdfQCw(@NotNull e modifier, @NotNull e iconModifier, @NotNull AbstractC8972b icon, boolean z11, @NotNull A1<Float> iconAlpha, long j11, float f7, @NotNull Function2<? super InterfaceC3967k, ? super Integer, Unit> loader, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconAlpha, "iconAlpha");
        Intrinsics.checkNotNullParameter(loader, "loader");
        interfaceC3967k.o(-1299069474);
        S a11 = m1.a(iconAlpha);
        interfaceC3967k.o(1536961879);
        C4912a c11 = z11 ? c.c(404253731, new FoundationIconButtonKt$FoundationIconButton$1(loader), interfaceC3967k) : null;
        interfaceC3967k.k();
        int i12 = i11 << 15;
        m2984FoundationIconButtonM1461ms(icon, j11, null, f7, c11, modifier, iconModifier, a11, interfaceC3967k, ((i11 >> 6) & 14) | 384 | ((i11 >> 12) & 112) | ((i11 >> 9) & 7168) | (458752 & i12) | (i12 & 3670016), 0);
        interfaceC3967k.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    /* renamed from: FoundationIconButton-M1461ms, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2984FoundationIconButtonM1461ms(@NotNull AbstractC8972b icon, long j11, AbstractC7799Q abstractC7799Q, float f7, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, e eVar, e eVar2, S s11, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar3;
        int i14;
        e eVar4;
        int i15;
        S s12;
        int I11;
        S s13;
        J0 m02;
        Intrinsics.checkNotNullParameter(icon, "icon");
        C3969l u11 = interfaceC3967k.u(-1049369392);
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
            i13 |= u11.s(j11) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= u11.n(abstractC7799Q) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            i13 |= u11.q(f7) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            i13 |= u11.F(function2) ? 16384 : 8192;
        }
        int i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= 196608;
        } else if ((196608 & i11) == 0) {
            eVar3 = eVar;
            i13 |= u11.n(eVar3) ? 131072 : 65536;
            i14 = i12 & 64;
            if (i14 == 0) {
                i13 |= 1572864;
            } else if ((1572864 & i11) == 0) {
                eVar4 = eVar2;
                i13 |= u11.n(eVar4) ? 1048576 : 524288;
                i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i15 != 0) {
                    i13 |= 12582912;
                    s12 = s11;
                } else {
                    s12 = s11;
                    if ((i11 & 12582912) == 0) {
                        i13 |= u11.n(s12) ? 8388608 : 4194304;
                    }
                }
                if ((i13 & 4793491) == 4793490 || !u11.b()) {
                    e eVar5 = i16 != 0 ? e.f40358c0 : eVar3;
                    if (i14 != 0) {
                        eVar4 = e.f40358c0;
                    }
                    S s14 = i15 != 0 ? null : s12;
                    V f11 = C5185h.f(InterfaceC6250b.a.e(), false);
                    I11 = u11.I();
                    A0 d11 = u11.d();
                    e f12 = androidx.compose.ui.c.f(u11, eVar5);
                    e eVar6 = eVar5;
                    Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                        u11.H(a11);
                    } else {
                        u11.e();
                    }
                    Function2 f13 = E.f(u11, f11, u11, d11);
                    if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                        a.d(I11, u11, I11, f13);
                    }
                    i.b(u11, f12, 876174221);
                    if (function2 != null) {
                        function2.invoke(u11, Integer.valueOf((i13 >> 12) & 14));
                    }
                    u11.k();
                    u11.o(876179890);
                    e a12 = C6981a.a(a0.n(eVar4, f7), function2 != null ? 0.0f : 1.0f);
                    if (abstractC7799Q != null) {
                        e.a aVar = e.f40358c0;
                        u11.o(1664454555);
                        Object C11 = u11.C();
                        if (C11 == InterfaceC3967k.a.a()) {
                            C11 = FoundationIconButtonKt$FoundationIconButton$2$1$1$1.INSTANCE;
                            u11.x(C11);
                        }
                        u11.k();
                        e a13 = androidx.compose.ui.graphics.a.a(aVar, (Function1) C11);
                        u11.o(1664457784);
                        boolean z11 = (i13 & 896) == 256;
                        Object C12 = u11.C();
                        if (z11 || C12 == InterfaceC3967k.a.a()) {
                            C12 = new FoundationIconButtonKt$FoundationIconButton$2$1$2$1(abstractC7799Q);
                            u11.x(C12);
                        }
                        u11.k();
                        a12 = a12.l0(androidx.compose.ui.draw.c.c(a13, (Function1) C12));
                    }
                    e eVar7 = a12;
                    u11.k();
                    T0.a(icon, null, eVar7, abstractC7799Q != null ? C7807Z.f72259m : s14 != null ? C7807Z.o(s14.getValue().floatValue(), j11) : j11, u11, (i13 & 14) | 48);
                    u11.f();
                    s13 = s14;
                    eVar3 = eVar6;
                } else {
                    u11.j();
                    s13 = s12;
                }
                e eVar8 = eVar4;
                m02 = u11.m0();
                if (m02 != null) {
                    m02.G(new FoundationIconButtonKt$FoundationIconButton$3(icon, j11, abstractC7799Q, f7, function2, eVar3, eVar8, s13, i11, i12));
                    return;
                }
                return;
            }
            eVar4 = eVar2;
            i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 != 0) {
            }
            if ((i13 & 4793491) == 4793490) {
            }
            if (i16 != 0) {
            }
            if (i14 != 0) {
            }
            if (i15 != 0) {
            }
            V f112 = C5185h.f(InterfaceC6250b.a.e(), false);
            I11 = u11.I();
            A0 d112 = u11.d();
            e f122 = androidx.compose.ui.c.f(u11, eVar5);
            e eVar62 = eVar5;
            Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 f132 = E.f(u11, f112, u11, d112);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, f132);
            i.b(u11, f122, 876174221);
            if (function2 != null) {
            }
            u11.k();
            u11.o(876179890);
            e a122 = C6981a.a(a0.n(eVar4, f7), function2 != null ? 0.0f : 1.0f);
            if (abstractC7799Q != null) {
            }
            e eVar72 = a122;
            u11.k();
            T0.a(icon, null, eVar72, abstractC7799Q != null ? C7807Z.f72259m : s14 != null ? C7807Z.o(s14.getValue().floatValue(), j11) : j11, u11, (i13 & 14) | 48);
            u11.f();
            s13 = s14;
            eVar3 = eVar62;
            e eVar82 = eVar4;
            m02 = u11.m0();
            if (m02 != null) {
            }
        }
        eVar3 = eVar;
        i14 = i12 & 64;
        if (i14 == 0) {
        }
        eVar4 = eVar2;
        i15 = i12 & UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i15 != 0) {
        }
        if ((i13 & 4793491) == 4793490) {
        }
        if (i16 != 0) {
        }
        if (i14 != 0) {
        }
        if (i15 != 0) {
        }
        V f1122 = C5185h.f(InterfaceC6250b.a.e(), false);
        I11 = u11.I();
        A0 d1122 = u11.d();
        e f1222 = androidx.compose.ui.c.f(u11, eVar5);
        e eVar622 = eVar5;
        Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 f1322 = E.f(u11, f1122, u11, d1122);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, f1322);
        i.b(u11, f1222, 876174221);
        if (function2 != null) {
        }
        u11.k();
        u11.o(876179890);
        e a1222 = C6981a.a(a0.n(eVar4, f7), function2 != null ? 0.0f : 1.0f);
        if (abstractC7799Q != null) {
        }
        e eVar722 = a1222;
        u11.k();
        T0.a(icon, null, eVar722, abstractC7799Q != null ? C7807Z.f72259m : s14 != null ? C7807Z.o(s14.getValue().floatValue(), j11) : j11, u11, (i13 & 14) | 48);
        u11.f();
        s13 = s14;
        eVar3 = eVar622;
        e eVar822 = eVar4;
        m02 = u11.m0();
        if (m02 != null) {
        }
    }
}
