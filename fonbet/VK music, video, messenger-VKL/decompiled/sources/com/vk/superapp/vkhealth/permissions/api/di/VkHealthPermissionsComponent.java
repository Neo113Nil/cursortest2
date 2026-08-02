package com.vk.superapp.vkhealth.permissions.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.ayu0;
import xsna.pwj0;

/* compiled from: VkHealthPermissionsComponent.kt */
/* loaded from: classes11.dex */
public interface VkHealthPermissionsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkHealthPermissionsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkHealthPermissionsComponent STUB = new VkHealthPermissionsComponent() { // from class: com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent$Companion$STUB$1
            public final ayu0 a;

            {
                ayu0.a.getClass();
                this.a = ayu0.a.a();
            }

            @Override // com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent
            public final ayu0 Wb() {
                return this.a;
            }
        };

        public final VkHealthPermissionsComponent getSTUB() {
            return STUB;
        }
    }

    ayu0 Wb();
}
