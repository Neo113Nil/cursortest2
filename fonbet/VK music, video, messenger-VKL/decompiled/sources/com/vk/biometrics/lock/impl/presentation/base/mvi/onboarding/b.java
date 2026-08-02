package com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding;

import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.a;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.c;
import com.vk.biometrics.lock.impl.presentation.base.mvi.onboarding.f;
import kotlin.NoWhenBranchMatchedException;
import xsna.f4z;
import xsna.q67;
import xsna.w67;
import xsna.wj50;
import xsna.wk50;

/* compiled from: BiometricsLockOnboardingFeature.kt */
/* loaded from: classes15.dex */
public final class b extends wk50<w67, q67, a, c> {
    public final f4z f;

    public b() {
        super(a.C0424a.b, new d(new q67()));
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(q67 q67Var, a aVar) {
        a aVar2 = aVar;
        if (aVar2 instanceof a.C0424a) {
            T(c.a.b);
            return;
        }
        boolean z = aVar2 instanceof a.b;
        f4z f4zVar = this.f;
        if (z) {
            f4zVar.b(f.a.a);
        } else {
            if (!(aVar2 instanceof a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(f.b.a);
        }
    }

    public final wj50<f> U() {
        return this.f;
    }
}
