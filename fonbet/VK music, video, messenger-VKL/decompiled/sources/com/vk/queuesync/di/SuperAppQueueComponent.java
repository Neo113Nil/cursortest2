package com.vk.queuesync.di;

import com.vk.di.component.DiScopedComponent;
import xsna.fvr;
import xsna.pwj0;
import xsna.tan0;

/* compiled from: SuperAppQueueComponent.kt */
/* loaded from: classes5.dex */
public interface SuperAppQueueComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: SuperAppQueueComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final SuperAppQueueComponent STUB = new SuperAppQueueComponent() { // from class: com.vk.queuesync.di.SuperAppQueueComponent$Companion$STUB$1
            public final fvr a = new fvr();

            @Override // com.vk.queuesync.di.SuperAppQueueComponent
            public final tan0 X4() {
                return this.a;
            }
        };

        public final SuperAppQueueComponent getSTUB() {
            return STUB;
        }
    }

    tan0 X4();
}
