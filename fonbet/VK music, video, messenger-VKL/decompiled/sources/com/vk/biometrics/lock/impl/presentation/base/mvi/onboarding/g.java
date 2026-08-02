package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.e;
import xsna.ao50;
import xsna.f5z;
import xsna.i6v0;
import xsna.izs;
import xsna.kai;
import xsna.n0u0;
import xsna.phv0;
import xsna.r67;
import xsna.s3q0;
import xsna.s67;
import xsna.t67;
import xsna.u67;
import xsna.w67;

/* compiled from: BiometricsLockOnboardingView.kt */
/* loaded from: classes15.dex */
public final class g extends i6v0<w67, a> {
    public g(Context context, f5z f5zVar) {
        super(context, f5zVar);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((w67) ao50Var, izsVar, aVar, 512);
    }

    public final void h(izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(939585116);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(939585116, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingView.MainScreen (BiometricsLockOnboardingView.kt:46)");
            }
            phv0.b(null, kai.c(-321332253, new s67(izsVar, 0), M), null, null, null, 0, 0L, 0L, kai.c(1286487736, new t67(izsVar, 0), M), M, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u67(this, izsVar, i, 0);
        }
    }

    public final void i(w67 w67Var, izs<? super a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(192874200);
        int i2 = (M.J(w67Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(192874200, i2, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.BiometricsLockOnboardingView.ThemedContent (BiometricsLockOnboardingView.kt:36)");
            }
            if (((e) d(e.a.a, new n0u0[]{w67Var.a}, M, (i2 & 896) | 518).getValue()) instanceof e.a) {
                M.K(-750573506);
                int i3 = i2 >> 3;
                h(izsVar, M, (i3 & 112) | (i3 & 14) | 64);
            } else {
                M.K(-752266230);
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
            s.d = new r67(this, w67Var, izsVar, i, 0);
        }
    }
}
