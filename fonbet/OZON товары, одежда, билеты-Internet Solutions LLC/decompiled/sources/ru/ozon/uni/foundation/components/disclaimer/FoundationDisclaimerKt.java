package ru.ozon.uni.foundation.components.disclaimer;

import A0.h;
import B1.V;
import D1.InterfaceC2801g;
import Ep.a;
import Fr.g;
import J0.T0;
import J0.u3;
import K00.b;
import K1.C3422b;
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
import i1.C6988h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.y0;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.foundation.utils.SpacersKt;
import u0.C9891D;
import u0.C9896e;
import u0.InterfaceC9890C;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÝ\u0001\u0010 \u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "titleModifier", "subtitleModifier", "iconModifier", "LK1/b;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lq1/b;", "icon", "", "titleLinesLimit", "subtitleLinesLimit", "Lkotlin/Function0;", "", "closeButton", "firstButton", "secondButton", "Ll1/Z;", "backgroundColor", "titleColor", "subtitleColor", "iconColor", "LK1/T;", "titleStyle", "subtitleStyle", "chevronIcon", "chevronTintColor", "LZ1/h;", "contentSpacerHeight", "FoundationDisclaimer-4FN_7CA", "(Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;Landroidx/compose/ui/e;LK1/b;LK1/b;Lq1/b;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJJJLK1/T;LK1/T;Lq1/b;JFLS0/k;IIII)V", "FoundationDisclaimer", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FoundationDisclaimerKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x05e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* renamed from: FoundationDisclaimer-4FN_7CA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2989FoundationDisclaimer4FN_7CA(@NotNull e modifier, @NotNull e titleModifier, @NotNull e subtitleModifier, @NotNull e iconModifier, C3422b c3422b, C3422b c3422b2, AbstractC8972b abstractC8972b, int i11, int i12, Function2<? super InterfaceC3967k, ? super Integer, Unit> function2, Function2<? super InterfaceC3967k, ? super Integer, Unit> function22, Function2<? super InterfaceC3967k, ? super Integer, Unit> function23, long j11, long j12, long j13, long j14, @NotNull T titleStyle, @NotNull T subtitleStyle, AbstractC8972b abstractC8972b2, long j15, float f7, InterfaceC3967k interfaceC3967k, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        int i19;
        long j16;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        long j17;
        float f11;
        e b11;
        int I11;
        float f12;
        float f13;
        boolean z11;
        int i26;
        ?? r42;
        float f14;
        C3969l c3969l;
        int i27;
        int I12;
        C9896e c9896e;
        int i28;
        float f15;
        int i29;
        e.a aVar;
        InterfaceC9890C interfaceC9890C;
        e.a aVar2;
        float f16;
        int i31;
        int I13;
        e.a aVar3;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function24;
        int i32;
        InterfaceC9890C interfaceC9890C2;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function25;
        Function2<? super InterfaceC3967k, ? super Integer, Unit> function26;
        float f17;
        AbstractC8972b abstractC8972b3;
        long j18;
        long j19;
        J0 m02;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(titleModifier, "titleModifier");
        Intrinsics.checkNotNullParameter(subtitleModifier, "subtitleModifier");
        Intrinsics.checkNotNullParameter(iconModifier, "iconModifier");
        Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
        Intrinsics.checkNotNullParameter(subtitleStyle, "subtitleStyle");
        C3969l u11 = interfaceC3967k.u(1570129979);
        if ((i16 & 1) != 0) {
            i17 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i17 = i13 | (u11.n(modifier) ? 4 : 2);
        } else {
            i17 = i13;
        }
        if ((i16 & 2) != 0) {
            i17 |= 48;
        } else if ((i13 & 48) == 0) {
            i17 |= u11.n(titleModifier) ? 32 : 16;
        }
        int i33 = i17;
        if ((i16 & 4) != 0) {
            i33 |= 384;
        } else if ((i13 & 384) == 0) {
            i33 |= u11.n(subtitleModifier) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if ((i16 & 8) != 0) {
            i33 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i33 |= u11.n(iconModifier) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
        }
        if ((i16 & 16) != 0) {
            i33 |= 24576;
        } else if ((i13 & 24576) == 0) {
            i33 |= u11.n(c3422b) ? 16384 : 8192;
        }
        if ((i16 & 32) != 0) {
            i33 |= 196608;
        } else if ((i13 & 196608) == 0) {
            i33 |= u11.n(c3422b2) ? 131072 : 65536;
        }
        if ((i16 & 64) != 0) {
            i33 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            i33 |= u11.n(abstractC8972b) ? 1048576 : 524288;
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            i33 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            i33 |= u11.r(i11) ? 8388608 : 4194304;
        }
        if ((i16 & 256) != 0) {
            i33 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            i33 |= u11.r(i12) ? 67108864 : 33554432;
            if ((i16 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
                i33 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                i33 |= u11.F(function2) ? 536870912 : 268435456;
            }
            i18 = i33;
            if ((i16 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                i19 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                i19 = (u11.F(function22) ? 4 : 2) | i14;
            } else {
                i19 = i14;
            }
            if ((i16 & 2048) == 0) {
                i19 |= 48;
            } else if ((i14 & 48) == 0) {
                i19 |= u11.F(function23) ? 32 : 16;
            }
            if ((i16 & 4096) == 0) {
                i19 |= 384;
                j16 = j11;
            } else {
                j16 = j11;
                if ((i14 & 384) == 0) {
                    i19 |= u11.s(j16) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
                }
            }
            if ((i16 & 8192) == 0) {
                i19 |= 3072;
            } else if ((i14 & 3072) == 0) {
                i19 |= u11.s(j12) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            }
            if ((i16 & 16384) == 0) {
                i19 |= 24576;
            } else if ((i14 & 24576) == 0) {
                i19 |= u11.s(j13) ? 16384 : 8192;
            }
            if ((32768 & i16) == 0) {
                i19 |= 196608;
            } else if ((i14 & 196608) == 0) {
                i19 |= u11.s(j14) ? 131072 : 65536;
            }
            if ((i16 & 65536) == 0) {
                i19 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                i19 |= u11.n(titleStyle) ? 1048576 : 524288;
            }
            if ((i16 & 131072) == 0) {
                i19 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                i19 |= u11.n(subtitleStyle) ? 8388608 : 4194304;
                i21 = i16 & 262144;
                if (i21 != 0) {
                    i19 |= 100663296;
                } else if ((i14 & 100663296) == 0) {
                    i19 |= u11.n(abstractC8972b2) ? 67108864 : 33554432;
                }
                i22 = i16 & 524288;
                if (i22 != 0) {
                    i19 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i19 |= u11.s(j15) ? 536870912 : 268435456;
                }
                int i34 = i19;
                i23 = i16 & 1048576;
                if (i23 != 0) {
                    i25 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    i25 = i15 | (u11.q(f7) ? 4 : 2);
                } else {
                    i24 = i15;
                    if ((i18 & 306783379) != 306783378 && (i34 & 306783379) == 306783378) {
                        if ((i24 & 3) == 2 && u11.b()) {
                            u11.j();
                            function26 = function2;
                            function24 = function22;
                            abstractC8972b3 = abstractC8972b2;
                            j18 = j15;
                            f17 = f7;
                            c3969l = u11;
                            function25 = function23;
                            m02 = c3969l.m0();
                            if (m02 != null) {
                                m02.G(new FoundationDisclaimerKt$FoundationDisclaimer$6(modifier, titleModifier, subtitleModifier, iconModifier, c3422b, c3422b2, abstractC8972b, i11, i12, function26, function24, function25, j11, j12, j13, j14, titleStyle, subtitleStyle, abstractC8972b3, j18, f17, i13, i14, i15, i16));
                                return;
                            }
                            return;
                        }
                    }
                    AbstractC8972b abstractC8972b4 = i21 == 0 ? null : abstractC8972b2;
                    if (i22 == 0) {
                        j19 = C7807Z.f72259m;
                        j17 = j19;
                    } else {
                        j17 = j15;
                    }
                    f11 = i23 == 0 ? 8 : f7;
                    if (c3422b == null || c3422b2 != null) {
                        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(modifier, 1.0f), h.b(16)), j16, y0.a());
                        float f18 = 12;
                        e j21 = androidx.compose.foundation.layout.T.j(b11, f18, 0.0f, function2 == null ? 0 : f18, 0.0f, 10);
                        Y b12 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                        I11 = u11.I();
                        A0 d11 = u11.d();
                        e f19 = c.f(u11, j21);
                        Function0 a11 = g.a(InterfaceC2801g.f5440U, u11);
                        if (u11.t()) {
                            u11.e();
                        } else {
                            u11.H(a11);
                        }
                        Function2 h11 = Cm.e.h(u11, b12, u11, d11);
                        if (!u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I11))) {
                            a.d(I11, u11, I11, h11);
                        }
                        F1.b(u11, f19, InterfaceC2801g.a.f());
                        C9891D c9891d = C9891D.f99599a;
                        u11.o(1912006584);
                        if (abstractC8972b != null) {
                            f12 = f11;
                            c3969l = u11;
                            f13 = f18;
                            z11 = 48;
                            i26 = 2;
                            r42 = 1;
                            f14 = 1.0f;
                            i27 = 54;
                        } else {
                            e h12 = androidx.compose.foundation.layout.T.h(c9891d.b(e.f40358c0, InterfaceC6250b.a.l()), 0.0f, f18, 1);
                            V f21 = C5185h.f(InterfaceC6250b.a.o(), false);
                            int I14 = u11.I();
                            A0 d12 = u11.d();
                            e f22 = c.f(u11, h12);
                            f12 = f11;
                            Function0 a12 = InterfaceC2801g.a.a();
                            u11.i();
                            if (u11.t()) {
                                u11.H(a12);
                            } else {
                                u11.e();
                            }
                            Function2 f23 = E.f(u11, f21, u11, d12);
                            if (u11.t() || !Intrinsics.d(u11.C(), Integer.valueOf(I14))) {
                                a.d(I14, u11, I14, f23);
                            }
                            F1.b(u11, f22, InterfaceC2801g.a.f());
                            f13 = f18;
                            z11 = 48;
                            i26 = 2;
                            r42 = 1;
                            f14 = 1.0f;
                            T0.a(abstractC8972b, null, a0.n(iconModifier, 24), j14, u11, ((i18 >> 18) & 14) | 48 | ((i34 >> 6) & 7168));
                            c3969l = u11;
                            c3969l.f();
                            i27 = 54;
                            SpacersKt.m3044SpacerWidthziNgDLE(c9891d, 8, c3969l, 54);
                            Unit unit = Unit.f71690a;
                        }
                        c3969l.k();
                        e.a aVar4 = e.f40358c0;
                        e h13 = androidx.compose.foundation.layout.T.h(c9891d.a(aVar4, f14, r42), 0.0f, f13, r42);
                        C5194q a13 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
                        I12 = c3969l.I();
                        A0 d13 = c3969l.d();
                        e f24 = c.f(c3969l, h13);
                        Function0 a14 = InterfaceC2801g.a.a();
                        c3969l.i();
                        if (c3969l.t()) {
                            c3969l.e();
                        } else {
                            c3969l.H(a14);
                        }
                        Function2 g10 = b.g(c3969l, a13, c3969l, d13);
                        if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I12))) {
                            a.d(I12, c3969l, I12, g10);
                        }
                        F1.b(c3969l, f24, InterfaceC2801g.a.f());
                        c9896e = C9896e.f99653a;
                        c3969l.o(456080929);
                        if (c3422b != null) {
                            aVar = aVar4;
                            i29 = i27;
                            f15 = f12;
                            i28 = i26;
                        } else {
                            e e11 = a0.e(aVar4, f14);
                            Y b13 = X.b(C5179b.f(), InterfaceC6250b.a.l(), c3969l, 0);
                            int I15 = c3969l.I();
                            A0 d14 = c3969l.d();
                            e f25 = c.f(c3969l, e11);
                            Function0 a15 = InterfaceC2801g.a.a();
                            c3969l.i();
                            if (c3969l.t()) {
                                c3969l.H(a15);
                            } else {
                                c3969l.e();
                            }
                            Function2 h14 = Cm.e.h(c3969l, b13, c3969l, d14);
                            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I15))) {
                                a.d(I15, c3969l, I15, h14);
                            }
                            F1.b(c3969l, f25, InterfaceC2801g.a.f());
                            i28 = i26;
                            e a16 = c9891d.a(androidx.compose.foundation.layout.T.j(titleModifier, 0.0f, i26, 0.0f, 0.0f, 13), 1.0f, false);
                            int i35 = i18 >> 12;
                            f15 = f12;
                            i29 = i27;
                            C3969l c3969l2 = c3969l;
                            aVar = aVar4;
                            u3.c(c3422b, a16, j12, 0L, 0L, null, 0L, 2, false, i11, 0, null, null, titleStyle, c3969l2, (i35 & 14) | ((i34 >> 3) & 896), (i35 & 7168) | 48 | ((i34 << 3) & 29360128), 120824);
                            c3969l = c3969l2;
                            c3969l.o(-1091815991);
                            if (abstractC8972b4 != null) {
                                SpacersKt.m3044SpacerWidthziNgDLE(c9891d, 4, c3969l, i29);
                                T0.a(abstractC8972b4, null, a0.n(aVar, 24), j17, c3969l, ((i34 >> 18) & 7168) | 432);
                                Unit unit2 = Unit.f71690a;
                            }
                            c3969l.k();
                            c3969l.f();
                            Unit unit3 = Unit.f71690a;
                        }
                        c3969l.k();
                        c3969l.o(456114630);
                        if (c3422b2 != null) {
                            interfaceC9890C = c9891d;
                            aVar2 = aVar;
                            f16 = f15;
                            i31 = i28;
                        } else {
                            SpacersKt.m3043SpacerHeightziNgDLE(c9896e, i28, c3969l, i29);
                            int i36 = i18 >> 15;
                            C3969l c3969l3 = c3969l;
                            interfaceC9890C = c9891d;
                            aVar2 = aVar;
                            f16 = f15;
                            i31 = i28;
                            u3.c(c3422b2, subtitleModifier, j13, 0L, 0L, null, 0L, 2, false, i12, 0, null, null, subtitleStyle, c3969l3, (i36 & 14) | ((i18 >> 3) & 112) | ((i34 >> 6) & 896), (i36 & 7168) | 48 | (i34 & 29360128), 120824);
                            c3969l = c3969l3;
                            Unit unit4 = Unit.f71690a;
                        }
                        c3969l.k();
                        SpacersKt.m3043SpacerHeightziNgDLE(c9896e, i31, c3969l, 54);
                        c3969l.o(456129584);
                        if (function22 == null || function23 != null) {
                            f11 = f16;
                            SpacersKt.m3043SpacerHeightziNgDLE(c9896e, f11, c3969l, 6 | ((i24 << 3) & 112));
                            Y b14 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                            I13 = c3969l.I();
                            A0 d15 = c3969l.d();
                            aVar3 = aVar2;
                            e f26 = c.f(c3969l, aVar3);
                            Function0 a17 = InterfaceC2801g.a.a();
                            c3969l.i();
                            if (c3969l.t()) {
                                c3969l.e();
                            } else {
                                c3969l.H(a17);
                            }
                            Function2 h15 = Cm.e.h(c3969l, b14, c3969l, d15);
                            if (!c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I13))) {
                                a.d(I13, c3969l, I13, h15);
                            }
                            i.b(c3969l, f26, -1041951512);
                            if (function22 != null) {
                                function24 = function22;
                                interfaceC9890C2 = interfaceC9890C;
                                i32 = 8;
                            } else {
                                function24 = function22;
                                function24.invoke(c3969l, Integer.valueOf(i34 & 14));
                                i32 = 8;
                                interfaceC9890C2 = interfaceC9890C;
                                SpacersKt.m3044SpacerWidthziNgDLE(interfaceC9890C2, 8, c3969l, 54);
                                Unit unit5 = Unit.f71690a;
                            }
                            c3969l.k();
                            c3969l.o(-1041946277);
                            if (function23 != null) {
                                function25 = function23;
                            } else {
                                function25 = function23;
                                function25.invoke(c3969l, Integer.valueOf((i34 >> 3) & 14));
                                Unit unit6 = Unit.f71690a;
                            }
                            c3969l.k();
                            c3969l.f();
                        } else {
                            function24 = function22;
                            function25 = function23;
                            interfaceC9890C2 = interfaceC9890C;
                            f11 = f16;
                            aVar3 = aVar2;
                            i32 = 8;
                        }
                        c3969l.k();
                        c3969l.f();
                        c3969l.o(1912095910);
                        function26 = function2;
                        if (function26 != null) {
                            e f27 = androidx.compose.foundation.layout.T.f(interfaceC9890C2.b(aVar3, InterfaceC6250b.a.l()), i32);
                            V f28 = C5185h.f(InterfaceC6250b.a.o(), false);
                            int I16 = c3969l.I();
                            A0 d16 = c3969l.d();
                            e f29 = c.f(c3969l, f27);
                            Function0 a18 = InterfaceC2801g.a.a();
                            c3969l.i();
                            if (c3969l.t()) {
                                c3969l.H(a18);
                            } else {
                                c3969l.e();
                            }
                            Function2 f31 = E.f(c3969l, f28, c3969l, d16);
                            if (c3969l.t() || !Intrinsics.d(c3969l.C(), Integer.valueOf(I16))) {
                                a.d(I16, c3969l, I16, f31);
                            }
                            F1.b(c3969l, f29, InterfaceC2801g.a.f());
                            function26.invoke(c3969l, 0);
                            c3969l.f();
                            Unit unit7 = Unit.f71690a;
                        }
                        c3969l.k();
                        c3969l.f();
                    } else {
                        function26 = function2;
                        function24 = function22;
                        c3969l = u11;
                        function25 = function23;
                    }
                    f17 = f11;
                    abstractC8972b3 = abstractC8972b4;
                    j18 = j17;
                    m02 = c3969l.m0();
                    if (m02 != null) {
                    }
                }
                i24 = i25;
                if ((i18 & 306783379) != 306783378) {
                }
                if (i21 == 0) {
                }
                if (i22 == 0) {
                }
                if (i23 == 0) {
                }
                if (c3422b == null) {
                }
                b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(modifier, 1.0f), h.b(16)), j16, y0.a());
                float f182 = 12;
                e j212 = androidx.compose.foundation.layout.T.j(b11, f182, 0.0f, function2 == null ? 0 : f182, 0.0f, 10);
                Y b122 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
                I11 = u11.I();
                A0 d112 = u11.d();
                e f192 = c.f(u11, j212);
                Function0 a112 = g.a(InterfaceC2801g.f5440U, u11);
                if (u11.t()) {
                }
                Function2 h112 = Cm.e.h(u11, b122, u11, d112);
                if (!u11.t()) {
                }
                a.d(I11, u11, I11, h112);
                F1.b(u11, f192, InterfaceC2801g.a.f());
                C9891D c9891d2 = C9891D.f99599a;
                u11.o(1912006584);
                if (abstractC8972b != null) {
                }
                c3969l.k();
                e.a aVar42 = e.f40358c0;
                e h132 = androidx.compose.foundation.layout.T.h(c9891d2.a(aVar42, f14, r42), 0.0f, f13, r42);
                C5194q a132 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
                I12 = c3969l.I();
                A0 d132 = c3969l.d();
                e f242 = c.f(c3969l, h132);
                Function0 a142 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                }
                Function2 g102 = b.g(c3969l, a132, c3969l, d132);
                if (!c3969l.t()) {
                }
                a.d(I12, c3969l, I12, g102);
                F1.b(c3969l, f242, InterfaceC2801g.a.f());
                c9896e = C9896e.f99653a;
                c3969l.o(456080929);
                if (c3422b != null) {
                }
                c3969l.k();
                c3969l.o(456114630);
                if (c3422b2 != null) {
                }
                c3969l.k();
                SpacersKt.m3043SpacerHeightziNgDLE(c9896e, i31, c3969l, 54);
                c3969l.o(456129584);
                if (function22 == null) {
                }
                f11 = f16;
                SpacersKt.m3043SpacerHeightziNgDLE(c9896e, f11, c3969l, 6 | ((i24 << 3) & 112));
                Y b142 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
                I13 = c3969l.I();
                A0 d152 = c3969l.d();
                aVar3 = aVar2;
                e f262 = c.f(c3969l, aVar3);
                Function0 a172 = InterfaceC2801g.a.a();
                c3969l.i();
                if (c3969l.t()) {
                }
                Function2 h152 = Cm.e.h(c3969l, b142, c3969l, d152);
                if (!c3969l.t()) {
                }
                a.d(I13, c3969l, I13, h152);
                i.b(c3969l, f262, -1041951512);
                if (function22 != null) {
                }
                c3969l.k();
                c3969l.o(-1041946277);
                if (function23 != null) {
                }
                c3969l.k();
                c3969l.f();
                c3969l.k();
                c3969l.f();
                c3969l.o(1912095910);
                function26 = function2;
                if (function26 != null) {
                }
                c3969l.k();
                c3969l.f();
                f17 = f11;
                abstractC8972b3 = abstractC8972b4;
                j18 = j17;
                m02 = c3969l.m0();
                if (m02 != null) {
                }
            }
            i21 = i16 & 262144;
            if (i21 != 0) {
            }
            i22 = i16 & 524288;
            if (i22 != 0) {
            }
            int i342 = i19;
            i23 = i16 & 1048576;
            if (i23 != 0) {
            }
            i24 = i25;
            if ((i18 & 306783379) != 306783378) {
            }
            if (i21 == 0) {
            }
            if (i22 == 0) {
            }
            if (i23 == 0) {
            }
            if (c3422b == null) {
            }
            b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(modifier, 1.0f), h.b(16)), j16, y0.a());
            float f1822 = 12;
            e j2122 = androidx.compose.foundation.layout.T.j(b11, f1822, 0.0f, function2 == null ? 0 : f1822, 0.0f, 10);
            Y b1222 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
            I11 = u11.I();
            A0 d1122 = u11.d();
            e f1922 = c.f(u11, j2122);
            Function0 a1122 = g.a(InterfaceC2801g.f5440U, u11);
            if (u11.t()) {
            }
            Function2 h1122 = Cm.e.h(u11, b1222, u11, d1122);
            if (!u11.t()) {
            }
            a.d(I11, u11, I11, h1122);
            F1.b(u11, f1922, InterfaceC2801g.a.f());
            C9891D c9891d22 = C9891D.f99599a;
            u11.o(1912006584);
            if (abstractC8972b != null) {
            }
            c3969l.k();
            e.a aVar422 = e.f40358c0;
            e h1322 = androidx.compose.foundation.layout.T.h(c9891d22.a(aVar422, f14, r42), 0.0f, f13, r42);
            C5194q a1322 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
            I12 = c3969l.I();
            A0 d1322 = c3969l.d();
            e f2422 = c.f(c3969l, h1322);
            Function0 a1422 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
            }
            Function2 g1022 = b.g(c3969l, a1322, c3969l, d1322);
            if (!c3969l.t()) {
            }
            a.d(I12, c3969l, I12, g1022);
            F1.b(c3969l, f2422, InterfaceC2801g.a.f());
            c9896e = C9896e.f99653a;
            c3969l.o(456080929);
            if (c3422b != null) {
            }
            c3969l.k();
            c3969l.o(456114630);
            if (c3422b2 != null) {
            }
            c3969l.k();
            SpacersKt.m3043SpacerHeightziNgDLE(c9896e, i31, c3969l, 54);
            c3969l.o(456129584);
            if (function22 == null) {
            }
            f11 = f16;
            SpacersKt.m3043SpacerHeightziNgDLE(c9896e, f11, c3969l, 6 | ((i24 << 3) & 112));
            Y b1422 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
            I13 = c3969l.I();
            A0 d1522 = c3969l.d();
            aVar3 = aVar2;
            e f2622 = c.f(c3969l, aVar3);
            Function0 a1722 = InterfaceC2801g.a.a();
            c3969l.i();
            if (c3969l.t()) {
            }
            Function2 h1522 = Cm.e.h(c3969l, b1422, c3969l, d1522);
            if (!c3969l.t()) {
            }
            a.d(I13, c3969l, I13, h1522);
            i.b(c3969l, f2622, -1041951512);
            if (function22 != null) {
            }
            c3969l.k();
            c3969l.o(-1041946277);
            if (function23 != null) {
            }
            c3969l.k();
            c3969l.f();
            c3969l.k();
            c3969l.f();
            c3969l.o(1912095910);
            function26 = function2;
            if (function26 != null) {
            }
            c3969l.k();
            c3969l.f();
            f17 = f11;
            abstractC8972b3 = abstractC8972b4;
            j18 = j17;
            m02 = c3969l.m0();
            if (m02 != null) {
            }
        }
        if ((i16 & UserVerificationMethods.USER_VERIFY_NONE) == 0) {
        }
        i18 = i33;
        if ((i16 & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
        }
        if ((i16 & 2048) == 0) {
        }
        if ((i16 & 4096) == 0) {
        }
        if ((i16 & 8192) == 0) {
        }
        if ((i16 & 16384) == 0) {
        }
        if ((32768 & i16) == 0) {
        }
        if ((i16 & 65536) == 0) {
        }
        if ((i16 & 131072) == 0) {
        }
        i21 = i16 & 262144;
        if (i21 != 0) {
        }
        i22 = i16 & 524288;
        if (i22 != 0) {
        }
        int i3422 = i19;
        i23 = i16 & 1048576;
        if (i23 != 0) {
        }
        i24 = i25;
        if ((i18 & 306783379) != 306783378) {
        }
        if (i21 == 0) {
        }
        if (i22 == 0) {
        }
        if (i23 == 0) {
        }
        if (c3422b == null) {
        }
        b11 = androidx.compose.foundation.e.b(C6988h.a(a0.e(modifier, 1.0f), h.b(16)), j16, y0.a());
        float f18222 = 12;
        e j21222 = androidx.compose.foundation.layout.T.j(b11, f18222, 0.0f, function2 == null ? 0 : f18222, 0.0f, 10);
        Y b12222 = X.b(C5179b.f(), InterfaceC6250b.a.l(), u11, 0);
        I11 = u11.I();
        A0 d11222 = u11.d();
        e f19222 = c.f(u11, j21222);
        Function0 a11222 = g.a(InterfaceC2801g.f5440U, u11);
        if (u11.t()) {
        }
        Function2 h11222 = Cm.e.h(u11, b12222, u11, d11222);
        if (!u11.t()) {
        }
        a.d(I11, u11, I11, h11222);
        F1.b(u11, f19222, InterfaceC2801g.a.f());
        C9891D c9891d222 = C9891D.f99599a;
        u11.o(1912006584);
        if (abstractC8972b != null) {
        }
        c3969l.k();
        e.a aVar4222 = e.f40358c0;
        e h13222 = androidx.compose.foundation.layout.T.h(c9891d222.a(aVar4222, f14, r42), 0.0f, f13, r42);
        C5194q a13222 = C5193p.a(C5179b.g(), InterfaceC6250b.a.k(), c3969l, 0);
        I12 = c3969l.I();
        A0 d13222 = c3969l.d();
        e f24222 = c.f(c3969l, h13222);
        Function0 a14222 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 g10222 = b.g(c3969l, a13222, c3969l, d13222);
        if (!c3969l.t()) {
        }
        a.d(I12, c3969l, I12, g10222);
        F1.b(c3969l, f24222, InterfaceC2801g.a.f());
        c9896e = C9896e.f99653a;
        c3969l.o(456080929);
        if (c3422b != null) {
        }
        c3969l.k();
        c3969l.o(456114630);
        if (c3422b2 != null) {
        }
        c3969l.k();
        SpacersKt.m3043SpacerHeightziNgDLE(c9896e, i31, c3969l, 54);
        c3969l.o(456129584);
        if (function22 == null) {
        }
        f11 = f16;
        SpacersKt.m3043SpacerHeightziNgDLE(c9896e, f11, c3969l, 6 | ((i24 << 3) & 112));
        Y b14222 = X.b(C5179b.f(), InterfaceC6250b.a.i(), c3969l, 48);
        I13 = c3969l.I();
        A0 d15222 = c3969l.d();
        aVar3 = aVar2;
        e f26222 = c.f(c3969l, aVar3);
        Function0 a17222 = InterfaceC2801g.a.a();
        c3969l.i();
        if (c3969l.t()) {
        }
        Function2 h15222 = Cm.e.h(c3969l, b14222, c3969l, d15222);
        if (!c3969l.t()) {
        }
        a.d(I13, c3969l, I13, h15222);
        i.b(c3969l, f26222, -1041951512);
        if (function22 != null) {
        }
        c3969l.k();
        c3969l.o(-1041946277);
        if (function23 != null) {
        }
        c3969l.k();
        c3969l.f();
        c3969l.k();
        c3969l.f();
        c3969l.o(1912095910);
        function26 = function2;
        if (function26 != null) {
        }
        c3969l.k();
        c3969l.f();
        f17 = f11;
        abstractC8972b3 = abstractC8972b4;
        j18 = j17;
        m02 = c3969l.m0();
        if (m02 != null) {
        }
    }
}
