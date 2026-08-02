package com.vk.superapp.vkhealth.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.v0v;

/* compiled from: VkHealthComponent.kt */
/* loaded from: classes11.dex */
public interface VkHealthComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkHealthComponent.kt */
    /* loaded from: classes6.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkHealthComponent STUB = new VkHealthComponent() { // from class: com.vk.superapp.vkhealth.api.di.VkHealthComponent$Companion$STUB$1
            public final v0v a = v0v.a.a();

            @Override // com.vk.superapp.vkhealth.api.di.VkHealthComponent
            public final v0v Ee() {
                return this.a;
            }
        };

        public final VkHealthComponent getSTUB() {
            return STUB;
        }
    }

    v0v Ee();
}
