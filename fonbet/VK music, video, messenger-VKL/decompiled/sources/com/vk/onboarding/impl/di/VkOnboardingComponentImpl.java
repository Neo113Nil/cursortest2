package com.vk.onboarding.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import com.vk.onboarding.impl.stat.VkOnboardingStatDelegateImpl;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;
import xsna.q7v0;
import xsna.vqf0;

/* compiled from: VkOnboardingComponentImpl.kt */
/* loaded from: classes4.dex */
public final class VkOnboardingComponentImpl implements VkOnboardingComponent {
    public final bpn0 a = new bpn0(new vqf0(15));

    /* compiled from: VkOnboardingComponentImpl.kt */
    public static final class a implements c8m<VkOnboardingComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VkOnboardingComponentImpl();
        }
    }

    @Override // com.vk.onboarding.api.di.VkOnboardingComponent
    public final VkOnboardingStat$Delegate ac(VkOnboardingStat$Type vkOnboardingStat$Type, String str) {
        return new VkOnboardingStatDelegateImpl(vkOnboardingStat$Type, str, 0, 0);
    }

    @Override // com.vk.onboarding.api.di.VkOnboardingComponent
    public final q7v0 p3() {
        return (q7v0) this.a.getValue();
    }
}
