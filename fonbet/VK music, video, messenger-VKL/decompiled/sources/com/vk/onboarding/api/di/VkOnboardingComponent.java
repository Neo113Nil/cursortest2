package com.vk.onboarding.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.onboarding.api.stat.VkOnboardingStat$Type;
import xsna.pwj0;
import xsna.q7v0;
import xsna.t7v0;

/* compiled from: VkOnboardingComponent.kt */
/* loaded from: classes4.dex */
public interface VkOnboardingComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkOnboardingComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkOnboardingComponent STUB = new VkOnboardingComponent() { // from class: com.vk.onboarding.api.di.VkOnboardingComponent$Companion$STUB$1
            public final t7v0 a = new t7v0();

            @Override // com.vk.onboarding.api.di.VkOnboardingComponent
            public final VkOnboardingStat$Delegate ac(VkOnboardingStat$Type vkOnboardingStat$Type, String str) {
                return new VkOnboardingComponent$Companion$STUB$1$createDefaultStatDelegate$1();
            }

            @Override // com.vk.onboarding.api.di.VkOnboardingComponent
            public final q7v0 p3() {
                return this.a;
            }
        };

        public final VkOnboardingComponent getSTUB() {
            return STUB;
        }
    }

    VkOnboardingStat$Delegate ac(VkOnboardingStat$Type vkOnboardingStat$Type, String str);

    q7v0 p3();
}
