package com.vk.biometrics.lock.impl.presentation.base.mvi.pin;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.a6;
import xsna.cri;
import xsna.d77;
import xsna.dt1;
import xsna.gzs;
import xsna.hr80;
import xsna.izs;
import xsna.kai;
import xsna.l5g;
import xsna.phv0;
import xsna.q630;
import xsna.s3q0;
import xsna.sp;
import xsna.wj50;
import xsna.wzs;
import xsna.yzs;

/* compiled from: BiometricsLockPinView.kt */
/* loaded from: classes15.dex */
public final class j {
    public static final void a(float f, long j, gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final gzs gzsVar2;
        final long j2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(746010163);
        int i2 = i | 54 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            float f3 = 64;
            long j3 = l5g.j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(746010163, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.BiometricButton (BiometricsLockPinView.kt:277)");
            }
            hr80.j(j3, f3, gzsVar, sp.d, M, 3126 | (i2 & 896));
            gzsVar2 = gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
            f2 = f3;
        } else {
            gzsVar2 = gzsVar;
            M.h();
            j2 = j;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f2, j2, gzsVar2, i) { // from class: xsna.o77
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ gzs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.biometrics.lock.impl.presentation.base.mvi.pin.j.a(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(float f, long j, gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        final gzs gzsVar2;
        final long j2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(1266790152);
        int i2 = i | 54 | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            float f3 = 64;
            long j3 = l5g.j;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1266790152, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ClearButton (BiometricsLockPinView.kt:258)");
            }
            hr80.j(j3, f3, gzsVar, sp.c, M, 3126 | (i2 & 896));
            gzsVar2 = gzsVar;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j2 = j3;
            f2 = f3;
        } else {
            gzsVar2 = gzsVar;
            M.h();
            j2 = j;
            f2 = f;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(f2, j2, gzsVar2, i) { // from class: xsna.p77
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ gzs d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.biometrics.lock.impl.presentation.base.mvi.pin.j.b(this.b, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final wj50<g> wj50Var, final izs<? super a, s3q0> izsVar, final d77 d77Var, final c cVar, final boolean z, boolean z2, boolean z3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        final boolean z6;
        final boolean z7;
        androidx.compose.runtime.a M = aVar.M(-12976496);
        int i5 = i | (M.y(wj50Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(d77Var) ? 256 : 128) | (M.J(cVar) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192);
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 = i5 | 196608;
            z4 = z2;
        } else {
            z4 = z2;
            i3 = i5 | (M.l(z4) ? 131072 : 65536);
        }
        int i7 = i2 & 64;
        if (i7 != 0) {
            i4 = i3 | 1572864;
            z5 = z3;
        } else {
            z5 = z3;
            i4 = i3 | (M.l(z5) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (M.t(i4 & 1, (599187 & i4) != 599186)) {
            if (i6 != 0) {
                z4 = false;
            }
            final boolean z8 = i7 != 0 ? false : z5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-12976496, i4, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ContentScene (BiometricsLockPinView.kt:166)");
            }
            final boolean z9 = z4;
            boolean z10 = z8;
            phv0.b(null, kai.c(-230980951, new a6(1, cVar, izsVar), M), null, null, null, 0, 0L, 0L, kai.c(-1907323724, new yzs() { // from class: xsna.q77
                /* JADX WARN: Code restructure failed: missing block: B:41:0x024a, code lost:
                
                    if (r6 == r5) goto L69;
                 */
                @Override // xsna.yzs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i8;
                    String N;
                    izs izsVar2;
                    int i9;
                    a.C0011a.C0012a c0012a;
                    a.C0011a.C0012a c0012a2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1907323724, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.pin.ContentScene.<anonymous> (BiometricsLockPinView.kt:175)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(q630.a.a, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar2, 48);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, m);
                        cri.h7.getClass();
                        LayoutNode.a aVar3 = cri.a.b;
                        String str = null;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar3);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a, cri.a.f);
                        k9q0.w(aVar2, D, cri.a.e);
                        k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                        k9q0.t(aVar2, cri.a.h);
                        k9q0.w(aVar2, c, cri.a.d);
                        d77 d77Var2 = d77.this;
                        String str2 = d77Var2.a;
                        wla0 wla0Var = d77Var2.d;
                        boolean z11 = wla0Var.b;
                        long j = wla0Var.c;
                        com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c cVar2 = cVar;
                        if (z11) {
                            aVar2.K(2123014395);
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            long minutes = timeUnit.toMinutes(j);
                            N = d370.O(R.string.bl_backoff_wait, new Object[]{String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(minutes), Long.valueOf(timeUnit.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes))}, 2))}, aVar2);
                            aVar2.j();
                        } else {
                            aVar2.K(2123216174);
                            if (cVar2 instanceof c.f) {
                                i8 = R.string.bl_come_up_new_pin_password;
                            } else if ((cVar2 instanceof c.e) || (cVar2 instanceof c.d)) {
                                i8 = R.string.bl_enter_pin_password;
                            } else if (cVar2 instanceof c.b) {
                                i8 = R.string.bl_set_new_pin_password;
                            } else if (cVar2 instanceof c.g) {
                                i8 = R.string.bl_enter_old_pin_password;
                            } else {
                                if (!(cVar2 instanceof c.C0426c)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i8 = R.string.bl_repeat_pin_password;
                            }
                            N = d370.N(i8, 0, aVar2);
                            aVar2.j();
                        }
                        if (wla0Var.b) {
                            aVar2.K(2123386922);
                            Context context = (Context) aVar2.r(AndroidCompositionLocals_androidKt.b);
                            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                            long minutes2 = timeUnit2.toMinutes(j);
                            long seconds = timeUnit2.toSeconds(j) - TimeUnit.MINUTES.toSeconds(minutes2);
                            StringBuilder sb = new StringBuilder();
                            int i10 = (int) minutes2;
                            sb.append(context.getResources().getQuantityString(R.plurals.minutes, i10, Integer.valueOf(i10)));
                            sb.append(" ");
                            if (seconds != 0) {
                                int i11 = (int) seconds;
                                sb.append(context.getResources().getQuantityString(R.plurals.seconds, i11, Integer.valueOf(i11)));
                            }
                            str = sb.toString();
                            aVar2.j();
                        } else {
                            aVar2.K(2123511480);
                            aVar2.j();
                        }
                        String str3 = str;
                        xla0 xla0Var = d77Var2.c;
                        boolean f = epx.f(cVar2, c.e.a);
                        jai c2 = kai.c(529307765, new s77(cVar2, 0), aVar2);
                        boolean z12 = z;
                        wj50 wj50Var2 = wj50Var;
                        izs izsVar3 = izsVar;
                        jai c3 = kai.c(390522358, new t77(z12, wj50Var2, izsVar3), aVar2);
                        boolean J = aVar2.J(izsVar3);
                        Object x = aVar2.x();
                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                        if (J || x == c0012a3) {
                            x = new d74(izsVar3, 1);
                            aVar2.R(x);
                        }
                        izs izsVar4 = (izs) x;
                        boolean J2 = aVar2.J(izsVar3);
                        Object x2 = aVar2.x();
                        if (J2 || x2 == c0012a3) {
                            x2 = new u77(izsVar3, 0);
                            aVar2.R(x2);
                        }
                        dk6.a(c2, c3, N, str3, xla0Var, null, str2, f, izsVar4, (gzs) x2, 0, aVar2, 54);
                        if (z9) {
                            aVar2.K(2124331399);
                            String N2 = d370.N(R.string.bl_biometrics_changed, 0, aVar2);
                            String N3 = d370.N(R.string.bl_clearly, 0, aVar2);
                            boolean J3 = aVar2.J(izsVar3);
                            Object x3 = aVar2.x();
                            if (J3) {
                                c0012a2 = c0012a3;
                            } else {
                                c0012a2 = c0012a3;
                            }
                            x3 = new v77(izsVar3, 0);
                            aVar2.R(x3);
                            izs izsVar5 = (izs) x3;
                            boolean J4 = aVar2.J(izsVar3);
                            Object x4 = aVar2.x();
                            if (J4 || x4 == c0012a2) {
                                x4 = new w77(izsVar3, 0);
                                aVar2.R(x4);
                            }
                            izsVar2 = izsVar3;
                            c0012a = c0012a2;
                            i9 = 2114814244;
                            p7u0.e("", N2, N3, izsVar5, (gzs) x4, null, null, null, null, null, null, null, null, aVar2, 6, 0, 8160);
                            aVar2 = aVar2;
                        } else {
                            izsVar2 = izsVar3;
                            i9 = 2114814244;
                            c0012a = c0012a3;
                            aVar2.K(2114814244);
                        }
                        aVar2.j();
                        if (z8) {
                            aVar2.K(2124940921);
                            izs izsVar6 = izsVar2;
                            boolean J5 = aVar2.J(izsVar6);
                            Object x5 = aVar2.x();
                            if (J5 || x5 == c0012a) {
                                x5 = new h74(izsVar6, 1);
                                aVar2.R(x5);
                            }
                            h2p0.a(null, null, null, (gzs) x5, aVar2, 0, 7);
                        } else {
                            aVar2.K(i9);
                        }
                        aVar2.j();
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z6 = z9;
            z7 = z10;
        } else {
            M.h();
            z6 = z4;
            z7 = z5;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(izsVar, d77Var, cVar, z, z6, z7, i, i2) { // from class: xsna.r77
                public final /* synthetic */ izs c;
                public final /* synthetic */ d77 d;
                public final /* synthetic */ com.vk.biometrics.lock.impl.presentation.base.mvi.pin.c e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;

                {
                    this.i = i2;
                }

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    com.vk.biometrics.lock.impl.presentation.base.mvi.pin.j.c(wj50.this, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I, this.i);
                    return s3q0.a;
                }
            };
        }
    }
}
