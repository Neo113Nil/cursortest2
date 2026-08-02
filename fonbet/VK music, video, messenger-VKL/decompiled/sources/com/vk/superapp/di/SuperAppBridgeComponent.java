package com.vk.superapp.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.superapp.a;
import xsna.o7n0;
import xsna.pwj0;

/* compiled from: SuperAppBridgeComponent.kt */
/* loaded from: classes6.dex */
public interface SuperAppBridgeComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: SuperAppBridgeComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SuperAppBridgeComponent STUB = new SuperAppBridgeComponent() { // from class: com.vk.superapp.di.SuperAppBridgeComponent$Companion$STUB$1
            public final a a = a.a;

            @Override // com.vk.superapp.di.SuperAppBridgeComponent
            public final o7n0 E4() {
                return this.a;
            }
        };

        public final SuperAppBridgeComponent getSTUB() {
            return STUB;
        }
    }

    o7n0 E4();
}
