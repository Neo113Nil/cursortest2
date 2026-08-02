package com.vk.music.subscription.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.g950;
import xsna.pwj0;

/* compiled from: MusicSubscriptionComponent.kt */
/* loaded from: classes.dex */
public interface MusicSubscriptionComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicSubscriptionComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicSubscriptionComponent STUB = new MusicSubscriptionComponent() { // from class: com.vk.music.subscription.api.di.MusicSubscriptionComponent$Companion$STUB$1
            public final g950 a = g950.a.a.getSTUB();

            @Override // com.vk.music.subscription.api.di.MusicSubscriptionComponent
            public final g950 q1() {
                return this.a;
            }
        };

        public final MusicSubscriptionComponent getSTUB() {
            return STUB;
        }
    }

    g950 q1();
}
