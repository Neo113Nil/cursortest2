package ru.ozon.app.android.checkoutcomposer.couriersteps.composable;

import S0.C3969l;
import S0.InterfaceC3967k;
import S0.J0;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import n0.C8392m;
import ru.ozon.uni.atoms.data.common.Spacings;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aC\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/e;", "modifier", "", "segmentCount", "progress", "LZ1/h;", "spacing", "Ll1/Z;", "segmentColor", "progressColor", "", "SegmentedProgressBar-IRUPcdc", "(Landroidx/compose/ui/e;IIFJJLS0/k;II)V", "SegmentedProgressBar", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SegmentedProgressBarKt {
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012f  */
    /* renamed from: SegmentedProgressBar-IRUPcdc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m564SegmentedProgressBarIRUPcdc(e eVar, int i11, int i12, float f7, long j11, long j12, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        e eVar2;
        int i15;
        int i16;
        int i17;
        float f11;
        long j13;
        e eVar3;
        float px;
        boolean z11;
        Object C11;
        int i18;
        C3969l u11 = interfaceC3967k.u(-2053899459);
        int i19 = i14 & 1;
        if (i19 != 0) {
            i15 = i13 | 6;
            eVar2 = eVar;
        } else if ((i13 & 6) == 0) {
            eVar2 = eVar;
            i15 = (u11.n(eVar2) ? 4 : 2) | i13;
        } else {
            eVar2 = eVar;
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
            i16 = i11;
        } else {
            i16 = i11;
            if ((i13 & 48) == 0) {
                i15 |= u11.r(i16) ? 32 : 16;
            }
        }
        if ((i14 & 4) != 0) {
            i15 |= 384;
            i17 = i12;
        } else {
            i17 = i12;
            if ((i13 & 384) == 0) {
                i15 |= u11.r(i17) ? 256 : UserVerificationMethods.USER_VERIFY_PATTERN;
            }
        }
        if ((i13 & 3072) == 0) {
            if ((i14 & 8) == 0) {
                f11 = f7;
                if (u11.q(f11)) {
                    i18 = 2048;
                    i15 |= i18;
                }
            } else {
                f11 = f7;
            }
            i18 = UserVerificationMethods.USER_VERIFY_ALL;
            i15 |= i18;
        } else {
            f11 = f7;
        }
        if ((i14 & 16) != 0) {
            i15 |= 24576;
            j13 = j11;
        } else {
            j13 = j11;
            if ((i13 & 24576) == 0) {
                i15 |= u11.s(j13) ? 16384 : 8192;
            }
        }
        if ((i14 & 32) != 0) {
            i15 |= 196608;
        } else if ((i13 & 196608) == 0) {
            i15 |= u11.s(j12) ? 131072 : 65536;
        }
        if ((i15 & 74899) == 74898 && u11.b()) {
            u11.j();
            eVar3 = eVar2;
        } else {
            u11.Q0();
            if ((i13 & 1) == 0 || u11.w0()) {
                eVar3 = i19 != 0 ? e.f40358c0 : eVar2;
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                    px = Spacings.SPACING_2.getPx();
                    u11.j0();
                    e f12 = a0.f(a0.e(eVar3, 1.0f), Spacings.SPACING_4.getPx());
                    u11.o(1311662211);
                    z11 = ((((i15 & 7168) ^ 3072) <= 2048 && u11.q(px)) || (i15 & 3072) == 2048) | ((i15 & 112) != 32) | ((i15 & 896) != 256) | ((458752 & i15) != 131072) | ((i15 & 57344) == 16384);
                    C11 = u11.C();
                    if (!z11 || C11 == InterfaceC3967k.a.a()) {
                        SegmentedProgressBarKt$SegmentedProgressBar$1$1 segmentedProgressBarKt$SegmentedProgressBar$1$1 = new SegmentedProgressBarKt$SegmentedProgressBar$1$1(px, i16, i17, j12, j13);
                        u11.x(segmentedProgressBarKt$SegmentedProgressBar$1$1);
                        C11 = segmentedProgressBarKt$SegmentedProgressBar$1$1;
                    }
                    u11.k();
                    C8392m.a(f12, (Function1) C11, u11, 0);
                    f11 = px;
                }
            } else {
                u11.j();
                if ((i14 & 8) != 0) {
                    i15 &= -7169;
                }
                eVar3 = eVar2;
            }
            px = f11;
            u11.j0();
            e f122 = a0.f(a0.e(eVar3, 1.0f), Spacings.SPACING_4.getPx());
            u11.o(1311662211);
            z11 = ((((i15 & 7168) ^ 3072) <= 2048 && u11.q(px)) || (i15 & 3072) == 2048) | ((i15 & 112) != 32) | ((i15 & 896) != 256) | ((458752 & i15) != 131072) | ((i15 & 57344) == 16384);
            C11 = u11.C();
            if (!z11) {
            }
            SegmentedProgressBarKt$SegmentedProgressBar$1$1 segmentedProgressBarKt$SegmentedProgressBar$1$12 = new SegmentedProgressBarKt$SegmentedProgressBar$1$1(px, i16, i17, j12, j13);
            u11.x(segmentedProgressBarKt$SegmentedProgressBar$1$12);
            C11 = segmentedProgressBarKt$SegmentedProgressBar$1$12;
            u11.k();
            C8392m.a(f122, (Function1) C11, u11, 0);
            f11 = px;
        }
        J0 m02 = u11.m0();
        if (m02 != null) {
            m02.G(new SegmentedProgressBarKt$SegmentedProgressBar$2(eVar3, i11, i12, f11, j11, j12, i13, i14));
        }
    }
}
