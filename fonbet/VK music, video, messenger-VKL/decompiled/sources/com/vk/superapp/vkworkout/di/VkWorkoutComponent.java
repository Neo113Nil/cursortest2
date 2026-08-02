package com.vk.superapp.vkworkout.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import xsna.f2w0;
import xsna.pwj0;
import xsna.z1w0;

/* compiled from: VkWorkoutComponent.kt */
/* loaded from: classes11.dex */
public interface VkWorkoutComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkWorkoutComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkWorkoutComponent STUB = new VkWorkoutComponent() { // from class: com.vk.superapp.vkworkout.di.VkWorkoutComponent$Companion$STUB$1
            public final f2w0 a = f2w0.a.a();
            public final z1w0 b = z1w0.a.a();
            public final VkWorkoutBridgeDelegatesFactory c = VkWorkoutBridgeDelegatesFactory.a.a();

            @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
            public final VkWorkoutBridgeDelegatesFactory Kc() {
                return this.c;
            }

            @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
            public final f2w0 Te() {
                return this.a;
            }

            @Override // com.vk.superapp.vkworkout.di.VkWorkoutComponent
            public final z1w0 je() {
                return this.b;
            }
        };

        public final VkWorkoutComponent getSTUB() {
            return STUB;
        }
    }

    VkWorkoutBridgeDelegatesFactory Kc();

    f2w0 Te();

    z1w0 je();
}
