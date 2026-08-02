package ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation;

import P9.a;
import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import Z1.s;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import k1.C7464j;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.h;
import l1.C7790H;
import l1.s0;
import n0.C8392m;
import n0.c0;
import n1.InterfaceC8412e;
import ru.ozon.uni.core.repository.UniTheme;

@Metadata(d1 = {"\u0000*\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\u001a5\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u0011\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a;\u0010\u0016\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"", "progress", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "backgroundColor", "", "RoundStartProgressBar-eaDK9VM", "(FLandroidx/compose/ui/e;JJLS0/k;II)V", "RoundStartProgressBar", "Ln1/e;", "strokeWidth", "", "strokeCap", "drawLinearIndicatorBackground-AZGd3zU", "(Ln1/e;JFI)V", "drawLinearIndicatorBackground", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Ln1/e;FFJFI)V", "drawLinearIndicator", "ugc_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundStartProgressBarKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0057  */
    /* renamed from: RoundStartProgressBar-eaDK9VM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1535RoundStartProgressBareaDK9VM(float f7, e eVar, long j11, long j12, InterfaceC3967k interfaceC3967k, int i11, int i12) {
        int i13;
        e eVar2;
        long j13;
        long j14;
        long j15;
        e eVar3;
        long j16;
        Object C11;
        boolean z11;
        Object roundStartProgressBarKt$RoundStartProgressBar$1$1;
        int i14;
        long j17;
        long j18;
        long j19;
        long j21;
        e eVar4;
        J0 m02;
        C3969l u11 = interfaceC3967k.u(-1512298964);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (u11.q(f7) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i15 = i12 & 2;
        if (i15 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            eVar2 = eVar;
            i13 |= u11.n(eVar2) ? 32 : 16;
            if ((i11 & 384) != 0) {
                j13 = j11;
                i13 |= ((i12 & 4) == 0 && u11.s(j13)) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            } else {
                j13 = j11;
            }
            if ((i11 & 3072) != 0) {
                j14 = j12;
                i13 |= ((i12 & 8) == 0 && u11.s(j14)) ? 2048 : UserVerificationMethods.USER_VERIFY_ALL;
            } else {
                j14 = j12;
            }
            if ((i13 & 1171) == 1170 || !u11.b()) {
                u11.Q0();
                if ((i11 & 1) != 0 || u11.w0()) {
                    e eVar5 = i15 == 0 ? e.f40358c0 : eVar2;
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                        j13 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getGraphicActionPrimary();
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                        j14 = UniTheme.INSTANCE.getColors(u11, UniTheme.$stable).getBgSecondary();
                    }
                    j15 = j13;
                    eVar3 = eVar5;
                } else {
                    u11.j();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    j15 = j13;
                    eVar3 = eVar2;
                }
                j16 = j15;
                u11.j0();
                u11.o(606692576);
                C11 = u11.C();
                if (C11 == InterfaceC3967k.a.a()) {
                    C11 = C7790H.a();
                    u11.x(C11);
                }
                s0 s0Var = (s0) C11;
                u11.k();
                e f11 = a0.f(a0.e(c0.b(eVar3, f7), 1.0f), 4);
                u11.o(606699347);
                boolean z12 = true;
                boolean F11 = ((i13 & 14) != 4) | ((((i13 & 7168) ^ 3072) <= 2048 && u11.s(j14)) || (i13 & 3072) == 2048) | u11.F(s0Var) | u11.r(2);
                if ((((i13 & 896) ^ 384) > 256 || !u11.s(j16)) && (i13 & 384) != 256) {
                    z12 = false;
                }
                z11 = F11 | z12;
                Object C12 = u11.C();
                if (!z11 || C12 == InterfaceC3967k.a.a()) {
                    long j22 = j14;
                    i14 = 0;
                    j17 = j16;
                    j18 = j22;
                    roundStartProgressBarKt$RoundStartProgressBar$1$1 = new RoundStartProgressBarKt$RoundStartProgressBar$1$1(s0Var, j18, 2, f7, j17);
                    u11.x(roundStartProgressBarKt$RoundStartProgressBar$1$1);
                } else {
                    roundStartProgressBarKt$RoundStartProgressBar$1$1 = C12;
                    long j23 = j14;
                    i14 = 0;
                    j17 = j16;
                    j18 = j23;
                }
                u11.k();
                C8392m.a(f11, (Function1) roundStartProgressBarKt$RoundStartProgressBar$1$1, u11, i14);
                j19 = j18;
                j21 = j17;
                eVar4 = eVar3;
            } else {
                u11.j();
                eVar4 = eVar2;
                j21 = j13;
                j19 = j14;
            }
            m02 = u11.m0();
            if (m02 == null) {
                m02.G(new RoundStartProgressBarKt$RoundStartProgressBar$2(f7, eVar4, j21, j19, i11, i12));
                return;
            }
            return;
        }
        eVar2 = eVar;
        if ((i11 & 384) != 0) {
        }
        if ((i11 & 3072) != 0) {
        }
        if ((i13 & 1171) == 1170) {
        }
        u11.Q0();
        if ((i11 & 1) != 0) {
        }
        if (i15 == 0) {
        }
        if ((i12 & 4) != 0) {
        }
        if ((i12 & 8) != 0) {
        }
        j15 = j13;
        eVar3 = eVar5;
        j16 = j15;
        u11.j0();
        u11.o(606692576);
        C11 = u11.C();
        if (C11 == InterfaceC3967k.a.a()) {
        }
        s0 s0Var2 = (s0) C11;
        u11.k();
        e f112 = a0.f(a0.e(c0.b(eVar3, f7), 1.0f), 4);
        u11.o(606699347);
        boolean z122 = true;
        boolean F112 = ((i13 & 14) != 4) | ((((i13 & 7168) ^ 3072) <= 2048 && u11.s(j14)) || (i13 & 3072) == 2048) | u11.F(s0Var2) | u11.r(2);
        if (((i13 & 896) ^ 384) > 256) {
        }
        z122 = false;
        z11 = F112 | z122;
        Object C122 = u11.C();
        if (z11) {
        }
        long j222 = j14;
        i14 = 0;
        j17 = j16;
        j18 = j222;
        roundStartProgressBarKt$RoundStartProgressBar$1$1 = new RoundStartProgressBarKt$RoundStartProgressBar$1$1(s0Var2, j18, 2, f7, j17);
        u11.x(roundStartProgressBarKt$RoundStartProgressBar$1$1);
        u11.k();
        C8392m.a(f112, (Function1) roundStartProgressBarKt$RoundStartProgressBar$1$1, u11, i14);
        j19 = j18;
        j21 = j17;
        eVar4 = eVar3;
        m02 = u11.m0();
        if (m02 == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m1538drawLinearIndicatorqYKTg0g(InterfaceC8412e interfaceC8412e, float f7, float f11, long j11, float f12, int i11) {
        float f13 = C7464j.f(interfaceC8412e.i());
        float f14 = 2;
        float d11 = C7464j.d(interfaceC8412e.i()) / f14;
        boolean z11 = interfaceC8412e.getLayoutDirection() == s.Ltr;
        float f15 = (z11 ? f7 : 1.0f - f11) * f13;
        float f16 = (z11 ? f11 : 1.0f - f7) * f13;
        float f17 = f12 / f14;
        InterfaceC7663b l11 = h.l(f17, f13 - f17);
        float floatValue = ((Number) h.i(Float.valueOf(f15), l11)).floatValue();
        float floatValue2 = ((Number) h.i(Float.valueOf(f16), l11)).floatValue();
        if (Math.abs(f11 - f7) > 0.0f) {
            interfaceC8412e.U(j11, a.a(floatValue, d11), a.a(floatValue2, d11), f12, (r21 & 16) != 0 ? 0 : i11, (r21 & 32) != 0 ? null : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawLinearIndicatorBackground-AZGd3zU, reason: not valid java name */
    public static final void m1539drawLinearIndicatorBackgroundAZGd3zU(InterfaceC8412e interfaceC8412e, long j11, float f7, int i11) {
        m1538drawLinearIndicatorqYKTg0g(interfaceC8412e, 0.0f, 1.0f, j11, f7, i11);
    }
}
