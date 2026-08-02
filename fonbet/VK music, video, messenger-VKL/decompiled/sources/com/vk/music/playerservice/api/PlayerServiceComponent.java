package com.vk.music.playerservice.api;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.playerservice.api.a;
import xsna.pwj0;

/* compiled from: PlayerServiceComponent.kt */
/* loaded from: classes3.dex */
public interface PlayerServiceComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlayerServiceComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlayerServiceComponent STUB = new PlayerServiceComponent() { // from class: com.vk.music.playerservice.api.PlayerServiceComponent$Companion$STUB$1
            public final a a = a.C1336a.a.getSTUB();

            @Override // com.vk.music.playerservice.api.PlayerServiceComponent
            public final a i7() {
                return this.a;
            }
        };

        public final PlayerServiceComponent getSTUB() {
            return STUB;
        }
    }

    a i7();
}
