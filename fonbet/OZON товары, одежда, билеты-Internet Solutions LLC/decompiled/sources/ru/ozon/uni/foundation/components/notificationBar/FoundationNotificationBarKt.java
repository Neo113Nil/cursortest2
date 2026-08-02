package ru.ozon.uni.foundation.components.notificationBar;

import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.C3349u1;
import J0.u3;
import K00.b;
import K1.T;
import S0.A0;
import S0.C3969l;
import S0.F1;
import S0.InterfaceC3967k;
import S0.J0;
import T7.E;
import U7.i;
import androidx.compose.foundation.layout.C5179b;
import androidx.compose.foundation.layout.C5185h;
import androidx.compose.foundation.layout.C5193p;
import androidx.compose.foundation.layout.C5194q;
import androidx.compose.foundation.layout.X;
import androidx.compose.foundation.layout.Y;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import u0.C9891D;

@Metadata(d1 = {"\u00000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001aµ\u0001\u0010\u0019\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "titleLinesLimit", "subtitleLinesLimit", "Lkotlin/Function0;", "", "icon", "closeButton", "firstButton", "secondButton", "Landroidx/compose/ui/e;", "modifier", "LK1/T;", "subtitleTextStyle", "Ll1/Z;", "subtitleColor", "subtitleModifier", "titleTextStyle", "titleColor", "titleModifier", "iconModifier", "FoundationNotificationBar-sGQTBBs", "(Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LK1/T;JLandroidx/compose/ui/e;LK1/T;JLandroidx/compose/ui/e;Landroidx/compose/ui/e;LS0/k;III)V", "FoundationNotificationBar", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FoundationNotificationBarKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0456 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0372  */
    /* renamed from: FoundationNotificationBar-sGQTBBs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3025FoundationNotificationBarsGQTBBs(String str, String str2, int i11, int i12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, Function2<? super InterfaceC3967k, ? super Integer, Unit> function24, e eVar, @NotNull T subtitleTextStyle, long j11, @NotNull e subtitleModifier, @NotNull T titleTextStyle, long j12, @NotNull e titleModifier, @NotNull e iconModifier, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        e eVar2;
        int I11;
        int I12;
        e eVar3;
        C9891D c9891d;
        e.a aVar;
        float f7;
        C3969l c3969l;
        int i22;
        int i23;
        e.a aVar2;
        int I13;
        boolean z11;
        e eVar4;
        J0 m02;
        int i24;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25 = function22;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26 = function23;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function27 = function24;
        Intrinsics.checkNotNullParameter(subtitleTextStyle, "subtitleTextStyle");
        Intrinsics.checkNotNullParameter(subtitleModifier, "subtitleModifier");
        Intrinsics.checkNotNullParameter(titleTextStyle, "titleTextStyle");
        Intrinsics.checkNotNullParameter(titleModifier, "titleModifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        C3969l u11 = interfaceC3967k.u(87817704);
        if ((i15 & 1) != 0) {
            i16 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i16 = i13 | (u11.n(str) ? 4 : 2);
        } else {
            i16 = i13;
        }
        if ((i15 & 2) != 0) {
            i16 |= 48;
        } else if ((i13 & 48) == 0) {
            i16 |= u11.n(str2) ? 32 : 16;
        }
        int i25 = i16;
        if ((i15 & 4) != 0) {
            i25 |= 384;
        } else if ((i13 & 384) == 0) {
            i25 |= u11.r(i11) ? 256 : 128;
            if ((i15 & 8) == 0) {
                i25 |= 3072;
            } else if ((i13 & 3072) == 0) {
                i25 |= u11.r(i12) ? 2048 : 1024;
                if ((i15 & 16) != 0) {
                    i25 |= 24576;
                } else if ((i13 & 24576) == 0) {
                    i25 |= u11.F(function2) ? 16384 : 8192;
                }
                if ((i15 & 32) != 0) {
                    i25 |= 196608;
                } else if ((i13 & 196608) == 0) {
                    i25 |= u11.F(function25) ? 131072 : 65536;
                }
                if ((i15 & 64) != 0) {
                    i25 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    i25 |= u11.F(function26) ? 1048576 : 524288;
                }
                if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    i25 |= 12582912;
                } else if ((i13 & 12582912) == 0) {
                    i25 |= u11.F(function27) ? 8388608 : 4194304;
                }
                i17 = i15 & 256;
                if (i17 != 0) {
                    i25 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    i18 = i17;
                    i25 |= u11.n(eVar) ? 67108864 : 33554432;
                    if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                        i24 = (805306368 & i13) == 0 ? u11.n(subtitleTextStyle) ? 536870912 : 268435456 : 805306368;
                        if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                            i19 = i14 | 6;
                        } else if ((i14 & 6) == 0) {
                            i19 = i14 | (u11.s(j11) ? 4 : 2);
                        } else {
                            i19 = i14;
                        }
                        if ((i15 & 2048) != 0) {
                            i19 |= 48;
                        } else if ((i14 & 48) == 0) {
                            i19 |= u11.n(subtitleModifier) ? 32 : 16;
                        }
                        int i26 = i19;
                        if ((i15 & 4096) != 0) {
                            i26 |= 384;
                        } else if ((i14 & 384) == 0) {
                            i26 |= u11.n(titleTextStyle) ? 256 : 128;
                        }
                        if ((i15 & 8192) != 0) {
                            i21 = i26 | 3072;
                        } else {
                            int i27 = i26;
                            if ((i14 & 3072) == 0) {
                                i27 |= u11.s(j12) ? 2048 : 1024;
                            }
                            i21 = i27;
                        }
                        if ((i15 & 16384) != 0) {
                            i21 |= 24576;
                        } else if ((i14 & 24576) == 0) {
                            i21 |= u11.n(titleModifier) ? 16384 : 8192;
                        }
                        if ((32768 & i15) != 0) {
                            i21 |= 196608;
                        } else if ((i14 & 196608) == 0) {
                            i21 |= u11.n(iconModifier) ? 131072 : 65536;
                        }
                        int i28 = i21;
                        if ((306783379 & i25) != 306783378 && (i28 & 74899) == 74898 && u11.b()) {
                            u11.j();
                            eVar4 = eVar;
                            c3969l = u11;
                        } else {
                            eVar2 = i18 != 0 ? e.f40358c0 : eVar;
                            if (str != null && str2 == null) {
                                J0 m03 = u11.m0();
                                if (m03 != null) {
                                    m03.G(new FoundationNotificationBarKt$FoundationNotificationBar$1(str, str2, i11, i12, function2, function25, function26, function27, eVar2, subtitleTextStyle, j11, subtitleModifier, titleTextStyle, j12, titleModifier, iconModifier, i13, i14, i15));
                                    return;
                                }
                                return;
                            }
                            e eVar5 = eVar2;
                            e h11 = a0.h(eVar5, 44, 0.0f, 2);
                            Y b11 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                            I11 = u11.I();
                            A0 d11 = u11.d();
                            e f11 = c.f(u11, h11);
                            Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                            if (u11.t()) {
                                u11.H(a11);
                            } else {
                                u11.e();
                            }
                            Function2 h12 = Cm.e.h(u11, b11, u11, d11);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                                a.d(I11, u11, I11, h12);
                            }
                            F1.b(u11, f11, InterfaceC2801g.a.f());
                            C9891D c9891d2 = C9891D.f99599a;
                            u11.o(686542271);
                            if (function2 != null) {
                                float f12 = 10;
                                e j13 = androidx.compose.foundation.layout.T.j(c9891d2.b(iconModifier, InterfaceC6250b.a.l()), 0.0f, f12, f12, f12, 1);
                                P9.a.b(j13, "icon");
                                V f13 = C5185h.f(InterfaceC6250b.a.o(), false);
                                int I14 = u11.I();
                                A0 d12 = u11.d();
                                e f14 = c.f(u11, j13);
                                Function0 a12 = InterfaceC2801g.a.a();
                                u11.i();
                                if (u11.t()) {
                                    u11.H(a12);
                                } else {
                                    u11.e();
                                }
                                Function2 f15 = E.f(u11, f13, u11, d12);
                                if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                                    a.d(I14, u11, I14, f15);
                                }
                                F1.b(u11, f14, InterfaceC2801g.a.f());
                                C3349u1.e((i25 >> 12) & 14, function2, u11);
                            }
                            u11.k();
                            e.a aVar3 = e.f40358c0;
                            e b12 = c9891d2.b(androidx.compose.foundation.layout.T.h(c9891d2.a(aVar3, 1.0f, true), 0.0f, 10, 1), InterfaceC6250b.a.i());
                            float f16 = 2;
                            C5194q a13 = C5193p.a(C5179b.n(f16), InterfaceC6250b.a.k(), u11, 6);
                            I12 = u11.I();
                            A0 d13 = u11.d();
                            e f17 = c.f(u11, b12);
                            Function0 a14 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a14);
                            } else {
                                u11.e();
                            }
                            Function2 g10 = b.g(u11, a13, u11, d13);
                            if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I12))) {
                                a.d(I12, u11, I12, g10);
                            }
                            i.b(u11, f17, -1168123347);
                            if (str != null) {
                                aVar = aVar3;
                                eVar3 = eVar5;
                                c9891d = c9891d2;
                                i22 = i25;
                                f7 = f16;
                                u3.b(str, titleModifier, j12, 0L, null, 0L, null, 0L, 2, false, i11, 0, null, titleTextStyle, u11, (i25 & 14) | ((i28 >> 9) & 112) | ((i28 >> 3) & 896), ((i25 << 3) & 7168) | 48 | ((i28 << 12) & 3670016), 55288);
                                c3969l = u11;
                            } else {
                                eVar3 = eVar5;
                                c9891d = c9891d2;
                                aVar = aVar3;
                                f7 = f16;
                                c3969l = u11;
                                i22 = i25;
                            }
                            c3969l.k();
                            c3969l.o(-1168112033);
                            if (str2 != null) {
                                int i29 = i22;
                                C3969l c3969l2 = c3969l;
                                u3.b(str2, subtitleModifier, j11, 0L, null, 0L, null, 0L, 2, false, i12, 0, null, subtitleTextStyle, c3969l2, ((i29 >> 3) & 14) | (i28 & 112) | ((i28 << 6) & 896), (i29 & 7168) | 48 | ((i29 >> 9) & 3670016), 55288);
                                c3969l = c3969l2;
                            }
                            c3969l.k();
                            c3969l.o(-1168099955);
                            function26 = function23;
                            function27 = function24;
                            if (function26 == null || function27 != null) {
                                i23 = 6;
                                e.a aVar4 = aVar;
                                e j14 = androidx.compose.foundation.layout.T.j(aVar4, 0.0f, 6, 0.0f, f7, 5);
                                aVar2 = aVar4;
                                Y b13 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), c3969l, 54);
                                I13 = c3969l.I();
                                A0 d14 = c3969l.d();
                                e f18 = c.f(c3969l, j14);
                                Function0 a15 = InterfaceC2801g.a.a();
                                c3969l.i();
                                if (c3969l.t()) {
                                    c3969l.H(a15);
                                } else {
                                    c3969l.e();
                                }
                                Function2 h13 = Cm.e.h(c3969l, b13, c3969l, d14);
                                if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                                    a.d(I13, c3969l, I13, h13);
                                }
                                i.b(c3969l, f18, 2123403570);
                                if (function26 != null) {
                                    P9.a.b(aVar2, "firstButton");
                                    z11 = false;
                                    V f19 = C5185h.f(InterfaceC6250b.a.o(), false);
                                    int I15 = c3969l.I();
                                    A0 d15 = c3969l.d();
                                    e f21 = c.f(c3969l, aVar2);
                                    Function0 a16 = InterfaceC2801g.a.a();
                                    c3969l.i();
                                    if (c3969l.t()) {
                                        c3969l.H(a16);
                                    } else {
                                        c3969l.e();
                                    }
                                    Function2 f22 = E.f(c3969l, f19, c3969l, d15);
                                    if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I15))) {
                                        a.d(I15, c3969l, I15, f22);
                                    }
                                    F1.b(c3969l, f21, InterfaceC2801g.a.f());
                                    C3349u1.e((i22 >> 18) & 14, function26, c3969l);
                                } else {
                                    z11 = false;
                                }
                                c3969l.k();
                                c3969l.o(2123407125);
                                if (function27 != null) {
                                    P9.a.b(aVar2, "secondButton");
                                    V f23 = C5185h.f(InterfaceC6250b.a.o(), z11);
                                    int I16 = c3969l.I();
                                    A0 d16 = c3969l.d();
                                    e f24 = c.f(c3969l, aVar2);
                                    Function0 a17 = InterfaceC2801g.a.a();
                                    c3969l.i();
                                    if (c3969l.t()) {
                                        c3969l.H(a17);
                                    } else {
                                        c3969l.e();
                                    }
                                    Function2 f25 = E.f(c3969l, f23, c3969l, d16);
                                    if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I16))) {
                                        a.d(I16, c3969l, I16, f25);
                                    }
                                    F1.b(c3969l, f24, InterfaceC2801g.a.f());
                                    C3349u1.e((i22 >> 21) & 14, function27, c3969l);
                                }
                                c3969l.k();
                                c3969l.f();
                            } else {
                                aVar2 = aVar;
                                i23 = 6;
                                z11 = false;
                            }
                            c3969l.k();
                            c3969l.f();
                            c3969l.o(686604836);
                            function25 = function22;
                            if (function25 != null) {
                                e f26 = androidx.compose.foundation.layout.T.f(c9891d.b(aVar2, InterfaceC6250b.a.l()), i23);
                                V f27 = C5185h.f(InterfaceC6250b.a.o(), z11);
                                int I17 = c3969l.I();
                                A0 d17 = c3969l.d();
                                e f28 = c.f(c3969l, f26);
                                Function0 a18 = InterfaceC2801g.a.a();
                                c3969l.i();
                                if (c3969l.t()) {
                                    c3969l.H(a18);
                                } else {
                                    c3969l.e();
                                }
                                Function2 f29 = E.f(c3969l, f27, c3969l, d17);
                                if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I17))) {
                                    a.d(I17, c3969l, I17, f29);
                                }
                                F1.b(c3969l, f28, InterfaceC2801g.a.f());
                                C3349u1.e((i22 >> 15) & 14, function25, c3969l);
                            }
                            c3969l.k();
                            c3969l.f();
                            eVar4 = eVar3;
                        }
                        m02 = c3969l.m0();
                        if (m02 != null) {
                            m02.G(new FoundationNotificationBarKt$FoundationNotificationBar$3(str, str2, i11, i12, function2, function25, function26, function27, eVar4, subtitleTextStyle, j11, subtitleModifier, titleTextStyle, j12, titleModifier, iconModifier, i13, i14, i15));
                            return;
                        }
                        return;
                    }
                    i25 |= i24;
                    if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                    }
                    if ((i15 & 2048) != 0) {
                    }
                    int i262 = i19;
                    if ((i15 & 4096) != 0) {
                    }
                    if ((i15 & 8192) != 0) {
                    }
                    if ((i15 & 16384) != 0) {
                    }
                    if ((32768 & i15) != 0) {
                    }
                    int i282 = i21;
                    if ((306783379 & i25) != 306783378) {
                    }
                    if (i18 != 0) {
                    }
                    if (str != null) {
                    }
                    e eVar52 = eVar2;
                    e h112 = a0.h(eVar52, 44, 0.0f, 2);
                    Y b112 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                    I11 = u11.I();
                    A0 d112 = u11.d();
                    e f112 = c.f(u11, h112);
                    Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                    if (u11.t()) {
                    }
                    Function2 h122 = Cm.e.h(u11, b112, u11, d112);
                    if (!u11.t()) {
                    }
                    a.d(I11, u11, I11, h122);
                    F1.b(u11, f112, InterfaceC2801g.a.f());
                    C9891D c9891d22 = C9891D.f99599a;
                    u11.o(686542271);
                    if (function2 != null) {
                    }
                    u11.k();
                    e.a aVar32 = e.f40358c0;
                    e b122 = c9891d22.b(androidx.compose.foundation.layout.T.h(c9891d22.a(aVar32, 1.0f, true), 0.0f, 10, 1), InterfaceC6250b.a.i());
                    float f162 = 2;
                    C5194q a132 = C5193p.a(C5179b.n(f162), InterfaceC6250b.a.k(), u11, 6);
                    I12 = u11.I();
                    A0 d132 = u11.d();
                    e f172 = c.f(u11, b122);
                    Function0 a142 = InterfaceC2801g.a.a();
                    u11.i();
                    if (u11.t()) {
                    }
                    Function2 g102 = b.g(u11, a132, u11, d132);
                    if (!u11.t()) {
                    }
                    a.d(I12, u11, I12, g102);
                    i.b(u11, f172, -1168123347);
                    if (str != null) {
                    }
                    c3969l.k();
                    c3969l.o(-1168112033);
                    if (str2 != null) {
                    }
                    c3969l.k();
                    c3969l.o(-1168099955);
                    function26 = function23;
                    function27 = function24;
                    if (function26 == null) {
                    }
                    i23 = 6;
                    e.a aVar42 = aVar;
                    e j142 = androidx.compose.foundation.layout.T.j(aVar42, 0.0f, 6, 0.0f, f7, 5);
                    aVar2 = aVar42;
                    Y b132 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), c3969l, 54);
                    I13 = c3969l.I();
                    A0 d142 = c3969l.d();
                    e f182 = c.f(c3969l, j142);
                    Function0 a152 = InterfaceC2801g.a.a();
                    c3969l.i();
                    if (c3969l.t()) {
                    }
                    Function2 h132 = Cm.e.h(c3969l, b132, c3969l, d142);
                    if (!c3969l.t()) {
                    }
                    a.d(I13, c3969l, I13, h132);
                    i.b(c3969l, f182, 2123403570);
                    if (function26 != null) {
                    }
                    c3969l.k();
                    c3969l.o(2123407125);
                    if (function27 != null) {
                    }
                    c3969l.k();
                    c3969l.f();
                    c3969l.k();
                    c3969l.f();
                    c3969l.o(686604836);
                    function25 = function22;
                    if (function25 != null) {
                    }
                    c3969l.k();
                    c3969l.f();
                    eVar4 = eVar3;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i18 = i17;
                if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                }
                i25 |= i24;
                if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                }
                if ((i15 & 2048) != 0) {
                }
                int i2622 = i19;
                if ((i15 & 4096) != 0) {
                }
                if ((i15 & 8192) != 0) {
                }
                if ((i15 & 16384) != 0) {
                }
                if ((32768 & i15) != 0) {
                }
                int i2822 = i21;
                if ((306783379 & i25) != 306783378) {
                }
                if (i18 != 0) {
                }
                if (str != null) {
                }
                e eVar522 = eVar2;
                e h1122 = a0.h(eVar522, 44, 0.0f, 2);
                Y b1122 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
                I11 = u11.I();
                A0 d1122 = u11.d();
                e f1122 = c.f(u11, h1122);
                Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h1222 = Cm.e.h(u11, b1122, u11, d1122);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h1222);
                F1.b(u11, f1122, InterfaceC2801g.a.f());
                C9891D c9891d222 = C9891D.f99599a;
                u11.o(686542271);
                if (function2 != null) {
                }
                u11.k();
                e.a aVar322 = e.f40358c0;
                e b1222 = c9891d222.b(androidx.compose.foundation.layout.T.h(c9891d222.a(aVar322, 1.0f, true), 0.0f, 10, 1), InterfaceC6250b.a.i());
                float f1622 = 2;
                C5194q a1322 = C5193p.a(C5179b.n(f1622), InterfaceC6250b.a.k(), u11, 6);
                I12 = u11.I();
                A0 d1322 = u11.d();
                e f1722 = c.f(u11, b1222);
                Function0 a1422 = InterfaceC2801g.a.a();
                u11.i();
                if (u11.t()) {
                }
                Function2 g1022 = b.g(u11, a1322, u11, d1322);
                if (!u11.t()) {
                }
                a.d(I12, u11, I12, g1022);
                i.b(u11, f1722, -1168123347);
                if (str != null) {
                }
                c3969l.k();
                c3969l.o(-1168112033);
                if (str2 != null) {
                }
                c3969l.k();
                c3969l.o(-1168099955);
                function26 = function23;
                function27 = function24;
                if (function26 == null) {
                }
                i23 = 6;
                e.a aVar422 = aVar;
                e j1422 = androidx.compose.foundation.layout.T.j(aVar422, 0.0f, 6, 0.0f, f7, 5);
                aVar2 = aVar422;
                Y b1322 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), c3969l, 54);
                I13 = c3969l.I();
                A0 d1422 = c3969l.d();
                e f1822 = c.f(c3969l, j1422);
                Function0 a1522 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                }
                Function2 h1322 = Cm.e.h(c3969l, b1322, c3969l, d1422);
                if (!c3969l.t()) {
                }
                a.d(I13, c3969l, I13, h1322);
                i.b(c3969l, f1822, 2123403570);
                if (function26 != null) {
                }
                c3969l.k();
                c3969l.o(2123407125);
                if (function27 != null) {
                }
                c3969l.k();
                c3969l.f();
                c3969l.k();
                c3969l.f();
                c3969l.o(686604836);
                function25 = function22;
                if (function25 != null) {
                }
                c3969l.k();
                c3969l.f();
                eVar4 = eVar3;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            if ((i15 & 16) != 0) {
            }
            if ((i15 & 32) != 0) {
            }
            if ((i15 & 64) != 0) {
            }
            if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            }
            i17 = i15 & 256;
            if (i17 != 0) {
            }
            i18 = i17;
            if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            }
            i25 |= i24;
            if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            }
            if ((i15 & 2048) != 0) {
            }
            int i26222 = i19;
            if ((i15 & 4096) != 0) {
            }
            if ((i15 & 8192) != 0) {
            }
            if ((i15 & 16384) != 0) {
            }
            if ((32768 & i15) != 0) {
            }
            int i28222 = i21;
            if ((306783379 & i25) != 306783378) {
            }
            if (i18 != 0) {
            }
            if (str != null) {
            }
            e eVar5222 = eVar2;
            e h11222 = a0.h(eVar5222, 44, 0.0f, 2);
            Y b11222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
            I11 = u11.I();
            A0 d11222 = u11.d();
            e f11222 = c.f(u11, h11222);
            Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h12222 = Cm.e.h(u11, b11222, u11, d11222);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h12222);
            F1.b(u11, f11222, InterfaceC2801g.a.f());
            C9891D c9891d2222 = C9891D.f99599a;
            u11.o(686542271);
            if (function2 != null) {
            }
            u11.k();
            e.a aVar3222 = e.f40358c0;
            e b12222 = c9891d2222.b(androidx.compose.foundation.layout.T.h(c9891d2222.a(aVar3222, 1.0f, true), 0.0f, 10, 1), InterfaceC6250b.a.i());
            float f16222 = 2;
            C5194q a13222 = C5193p.a(C5179b.n(f16222), InterfaceC6250b.a.k(), u11, 6);
            I12 = u11.I();
            A0 d13222 = u11.d();
            e f17222 = c.f(u11, b12222);
            Function0 a14222 = InterfaceC2801g.a.a();
            u11.i();
            if (u11.t()) {
            }
            Function2 g10222 = b.g(u11, a13222, u11, d13222);
            if (!u11.t()) {
            }
            a.d(I12, u11, I12, g10222);
            i.b(u11, f17222, -1168123347);
            if (str != null) {
            }
            c3969l.k();
            c3969l.o(-1168112033);
            if (str2 != null) {
            }
            c3969l.k();
            c3969l.o(-1168099955);
            function26 = function23;
            function27 = function24;
            if (function26 == null) {
            }
            i23 = 6;
            e.a aVar4222 = aVar;
            e j14222 = androidx.compose.foundation.layout.T.j(aVar4222, 0.0f, 6, 0.0f, f7, 5);
            aVar2 = aVar4222;
            Y b13222 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), c3969l, 54);
            I13 = c3969l.I();
            A0 d14222 = c3969l.d();
            e f18222 = c.f(c3969l, j14222);
            Function0 a15222 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
            }
            Function2 h13222 = Cm.e.h(c3969l, b13222, c3969l, d14222);
            if (!c3969l.t()) {
            }
            a.d(I13, c3969l, I13, h13222);
            i.b(c3969l, f18222, 2123403570);
            if (function26 != null) {
            }
            c3969l.k();
            c3969l.o(2123407125);
            if (function27 != null) {
            }
            c3969l.k();
            c3969l.f();
            c3969l.k();
            c3969l.f();
            c3969l.o(686604836);
            function25 = function22;
            if (function25 != null) {
            }
            c3969l.k();
            c3969l.f();
            eVar4 = eVar3;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i15 & 8) == 0) {
        }
        if ((i15 & 16) != 0) {
        }
        if ((i15 & 32) != 0) {
        }
        if ((i15 & 64) != 0) {
        }
        if ((i15 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
        }
        i17 = i15 & 256;
        if (i17 != 0) {
        }
        i18 = i17;
        if ((i15 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
        }
        i25 |= i24;
        if ((i15 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
        }
        if ((i15 & 2048) != 0) {
        }
        int i262222 = i19;
        if ((i15 & 4096) != 0) {
        }
        if ((i15 & 8192) != 0) {
        }
        if ((i15 & 16384) != 0) {
        }
        if ((32768 & i15) != 0) {
        }
        int i282222 = i21;
        if ((306783379 & i25) != 306783378) {
        }
        if (i18 != 0) {
        }
        if (str != null) {
        }
        e eVar52222 = eVar2;
        e h112222 = a0.h(eVar52222, 44, 0.0f, 2);
        Y b112222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), u11, 48);
        I11 = u11.I();
        A0 d112222 = u11.d();
        e f112222 = c.f(u11, h112222);
        Function0 a112222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h122222 = Cm.e.h(u11, b112222, u11, d112222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h122222);
        F1.b(u11, f112222, InterfaceC2801g.a.f());
        C9891D c9891d22222 = C9891D.f99599a;
        u11.o(686542271);
        if (function2 != null) {
        }
        u11.k();
        e.a aVar32222 = e.f40358c0;
        e b122222 = c9891d22222.b(androidx.compose.foundation.layout.T.h(c9891d22222.a(aVar32222, 1.0f, true), 0.0f, 10, 1), InterfaceC6250b.a.i());
        float f162222 = 2;
        C5194q a132222 = C5193p.a(C5179b.n(f162222), InterfaceC6250b.a.k(), u11, 6);
        I12 = u11.I();
        A0 d132222 = u11.d();
        e f172222 = c.f(u11, b122222);
        Function0 a142222 = InterfaceC2801g.a.a();
        u11.i();
        if (u11.t()) {
        }
        Function2 g102222 = b.g(u11, a132222, u11, d132222);
        if (!u11.t()) {
        }
        a.d(I12, u11, I12, g102222);
        i.b(u11, f172222, -1168123347);
        if (str != null) {
        }
        c3969l.k();
        c3969l.o(-1168112033);
        if (str2 != null) {
        }
        c3969l.k();
        c3969l.o(-1168099955);
        function26 = function23;
        function27 = function24;
        if (function26 == null) {
        }
        i23 = 6;
        e.a aVar42222 = aVar;
        e j142222 = androidx.compose.foundation.layout.T.j(aVar42222, 0.0f, 6, 0.0f, f7, 5);
        aVar2 = aVar42222;
        Y b132222 = X.b(C5179b.n(8), InterfaceC6250b.a.i(), c3969l, 54);
        I13 = c3969l.I();
        A0 d142222 = c3969l.d();
        e f182222 = c.f(c3969l, j142222);
        Function0 a152222 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 h132222 = Cm.e.h(c3969l, b132222, c3969l, d142222);
        if (!c3969l.t()) {
        }
        a.d(I13, c3969l, I13, h132222);
        i.b(c3969l, f182222, 2123403570);
        if (function26 != null) {
        }
        c3969l.k();
        c3969l.o(2123407125);
        if (function27 != null) {
        }
        c3969l.k();
        c3969l.f();
        c3969l.k();
        c3969l.f();
        c3969l.o(686604836);
        function25 = function22;
        if (function25 != null) {
        }
        c3969l.k();
        c3969l.f();
        eVar4 = eVar3;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
