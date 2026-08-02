package com.vk.biometrics.lock.impl.presentation.base.mvi.setup;

import android.content.Context;
import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.e;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.c3j;
import xsna.d370;
import xsna.f3;
import xsna.f4z;
import xsna.f5z;
import xsna.gv3;
import xsna.gzs;
import xsna.h2p0;
import xsna.i6v0;
import xsna.i87;
import xsna.izs;
import xsna.jk50;
import xsna.k87;
import xsna.kai;
import xsna.l87;
import xsna.m87;
import xsna.n0u0;
import xsna.n87;
import xsna.p87;
import xsna.phv0;
import xsna.ra0;
import xsna.s3q0;
import xsna.wh50;
import xsna.wj50;
import xsna.yzt0;

/* compiled from: BiometricsLockSecuritySetupView.kt */
/* loaded from: classes15.dex */
public final class g extends i6v0<p87, a> {
    public final wj50<f> f;

    public g(f4z f4zVar, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = f4zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((p87) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(e.b bVar, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-1869831670);
        int i3 = i | (M.y(bVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1869831670, i3, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupView.MainScreen (BiometricsLockSecuritySetupView.kt:57)");
            }
            yzt0<Boolean> yzt0Var = bVar.a;
            Boolean bool = Boolean.FALSE;
            boolean booleanValue = ((Boolean) jk50.d(yzt0Var, bool, M, 48).getValue()).booleanValue();
            boolean booleanValue2 = ((Boolean) jk50.d(bVar.b, bool, M, 48).getValue()).booleanValue();
            aVar2 = M;
            phv0.b(null, kai.c(772406371, new k87(izsVar, 0), M), null, null, null, 0, 0L, 0L, kai.c(742258990, new l87(izsVar, 0), M), aVar2, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (booleanValue) {
                aVar2.K(1573215547);
                String N = d370.N(R.string.bl_biometrics_disabled_title, 0, aVar2);
                String N2 = d370.N(R.string.bl_biometrics_disabled_description, 0, aVar2);
                String N3 = d370.N(R.string.bl_open_settings, 0, aVar2);
                String N4 = d370.N(R.string.bl_cancel, 0, aVar2);
                Object x = aVar2.x();
                if (x == c0012a2) {
                    x = new gv3(2);
                    aVar2.R(x);
                }
                izs izsVar2 = (izs) x;
                boolean y = aVar2.y(this);
                Object x2 = aVar2.x();
                if (y || x2 == c0012a2) {
                    x2 = new ra0(this, 13);
                    aVar2.R(x2);
                }
                gzs gzsVar = (gzs) x2;
                boolean z = (i3 & 112) == 32;
                Object x3 = aVar2.x();
                if (z || x3 == c0012a2) {
                    x3 = new m87(izsVar, 0);
                    aVar2.R(x3);
                }
                i2 = 1568246712;
                c0012a = c0012a2;
                c3j.a(N3, N4, null, N, N2, false, izsVar2, gzsVar, (gzs) x3, aVar2, 1769472, 4);
                aVar2 = aVar2;
            } else {
                i2 = 1568246712;
                c0012a = c0012a2;
                aVar2.K(1568246712);
            }
            aVar2.j();
            if (booleanValue2) {
                aVar2.K(1573985029);
                String N5 = d370.N(R.string.bl_too_many_biometrics_attempts_settings_title, 0, aVar2);
                String N6 = d370.N(R.string.bl_too_many_biometrics_attempts_settings_description, 0, aVar2);
                boolean z2 = (i3 & 112) == 32;
                Object x4 = aVar2.x();
                if (z2 || x4 == c0012a) {
                    x4 = new f3(izsVar, 1);
                    aVar2.R(x4);
                }
                h2p0.a(null, N5, N6, (gzs) x4, aVar2, 0, 1);
            } else {
                aVar2.K(i2);
            }
            aVar2.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n87(this, bVar, izsVar, i, 0);
        }
    }

    public final void i(p87 p87Var, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1501541108);
        int i2 = (M.J(p87Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1501541108, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupView.ThemedContent (BiometricsLockSecuritySetupView.kt:45)");
            }
            wh50 d = d(e.a.a, new n0u0[]{p87Var.a}, M, (i2 & 896) | 6);
            if (((e) d.getValue()) instanceof e.b) {
                M.K(-326382603);
                h((e.b) ((e) d.getValue()), izsVar, M, i2 & 1008);
            } else {
                M.K(-328578922);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i87(i, 0, this, p87Var, izsVar);
        }
    }
}
