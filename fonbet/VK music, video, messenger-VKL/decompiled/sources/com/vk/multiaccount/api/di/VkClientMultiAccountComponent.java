package com.vk.multiaccount.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hlu0;
import xsna.jlu0;
import xsna.pwj0;
import xsna.xku0;

/* compiled from: VkClientMultiAccountComponent.kt */
/* loaded from: classes.dex */
public interface VkClientMultiAccountComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VkClientMultiAccountComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VkClientMultiAccountComponent STUB = new VkClientMultiAccountComponent() { // from class: com.vk.multiaccount.api.di.VkClientMultiAccountComponent$Companion$STUB$1
            public final xku0 a = xku0.a.a.getSTUB();
            public final jlu0 b = jlu0.a.a.getSTUB();
            public final hlu0 c = hlu0.a.a.getSTUB();

            @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
            public final xku0 Vc() {
                return this.a;
            }

            @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
            public final jlu0 a() {
                return this.b;
            }

            @Override // com.vk.multiaccount.api.di.VkClientMultiAccountComponent
            public final hlu0 getExperiments() {
                return this.c;
            }
        };

        public final VkClientMultiAccountComponent getSTUB() {
            return STUB;
        }
    }

    xku0 Vc();

    jlu0 a();

    hlu0 getExperiments();
}
