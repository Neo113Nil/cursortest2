package com.vk.superapp.subscriptions.js.bridge.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.jq20;
import xsna.pwj0;
import xsna.spj;

/* compiled from: MiniAppSubscriptionComponent.kt */
/* loaded from: classes6.dex */
public interface MiniAppSubscriptionComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MiniAppSubscriptionComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final MiniAppSubscriptionComponent getSTUB() {
            return new MiniAppSubscriptionComponent() { // from class: com.vk.superapp.subscriptions.js.bridge.api.di.MiniAppSubscriptionComponent$Companion$STUB$1
                public final a a = new a();

                /* compiled from: MiniAppSubscriptionComponent.kt */
                public static final class a implements jq20 {
                    @Override // xsna.jq20
                    public final Object a(spj<? super Boolean> spjVar) {
                        return null;
                    }
                }

                @Override // com.vk.superapp.subscriptions.js.bridge.api.di.MiniAppSubscriptionComponent
                public final jq20 u2() {
                    return this.a;
                }
            };
        }
    }

    jq20 u2();
}
