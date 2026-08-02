package com.vk.bridges.di;

import com.vk.di.component.DiScopedComponent;
import xsna.afw0;
import xsna.pwj0;

/* compiled from: VoipBridgeComponent.kt */
/* loaded from: classes15.dex */
public interface VoipBridgeComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VoipBridgeComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VoipBridgeComponent STUB = new VoipBridgeComponent() { // from class: com.vk.bridges.di.VoipBridgeComponent$Companion$STUB$1
            public final afw0 a = afw0.a.getSTUB();

            @Override // com.vk.bridges.di.VoipBridgeComponent
            public final afw0 j1() {
                return this.a;
            }
        };

        public final VoipBridgeComponent getSTUB() {
            return STUB;
        }
    }

    afw0 j1();
}
