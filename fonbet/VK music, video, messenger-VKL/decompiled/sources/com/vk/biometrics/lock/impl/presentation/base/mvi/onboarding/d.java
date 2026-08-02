package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.c;
import kotlin.NoWhenBranchMatchedException;
import xsna.dm50;
import xsna.g8;
import xsna.q67;
import xsna.w67;

/* compiled from: BiometricsLockOnboardingReducer.kt */
/* loaded from: classes15.dex */
public final class d extends dm50<w67, c, q67> {
    @Override // xsna.dm50
    public final q67 c(q67 q67Var, c cVar) {
        q67 q67Var2 = q67Var;
        if (cVar instanceof c.a) {
            return q67Var2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final w67 d() {
        return new w67(e(new g8(3)));
    }

    @Override // xsna.dm50
    public final void h(q67 q67Var, w67 w67Var) {
        f(w67Var.a, q67Var);
    }
}
