package com.vk.voip.calls.join.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.tkw0;

/* compiled from: VoipCallsJoinRouterComponent.kt */
/* loaded from: classes7.dex */
public interface VoipCallsJoinRouterComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VoipCallsJoinRouterComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VoipCallsJoinRouterComponent STUB = new VoipCallsJoinRouterComponent() { // from class: com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent$Companion$STUB$1
            public final tkw0 a = tkw0.a.a.getSTUB();

            @Override // com.vk.voip.calls.join.api.di.VoipCallsJoinRouterComponent
            public final tkw0 a() {
                return this.a;
            }
        };

        public final VoipCallsJoinRouterComponent getSTUB() {
            return STUB;
        }
    }

    tkw0 a();
}
