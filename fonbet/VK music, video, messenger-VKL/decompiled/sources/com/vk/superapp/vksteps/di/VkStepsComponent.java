package com.vk.superapp.vksteps.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import xsna.cmv0;
import xsna.hmv0;
import xsna.pwj0;

/* compiled from: VkStepsComponent.kt */
/* loaded from: classes11.dex */
public interface VkStepsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkStepsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkStepsComponent STUB = new VkStepsComponent() { // from class: com.vk.superapp.vksteps.di.VkStepsComponent$Companion$STUB$1
            public final hmv0 a = hmv0.a.a.getSTUB();
            public final cmv0 b = cmv0.a.a();
            public final VkStepsBridgeDelegatesFactory c = VkStepsBridgeDelegatesFactory.a.a();

            @Override // com.vk.superapp.vksteps.di.VkStepsComponent
            public final VkStepsBridgeDelegatesFactory H0() {
                return this.c;
            }

            @Override // com.vk.superapp.vksteps.di.VkStepsComponent
            public final cmv0 I5() {
                return this.b;
            }

            @Override // com.vk.superapp.vksteps.di.VkStepsComponent
            public final hmv0 l3() {
                return this.a;
            }
        };

        public final VkStepsComponent getSTUB() {
            return STUB;
        }
    }

    VkStepsBridgeDelegatesFactory H0();

    cmv0 I5();

    hmv0 l3();
}
