package com.vk.music.player.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.bx40;

/* compiled from: PlayerComponent.kt */
/* loaded from: classes3.dex */
public interface PlayerComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlayerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlayerComponent STUB = new PlayerComponent() { // from class: com.vk.music.player.api.di.PlayerComponent$Companion$STUB$1
            public final bx40 a = new bx40(0);

            @Override // com.vk.music.player.api.di.PlayerComponent
            public final bx40 q3() {
                return this.a;
            }
        };

        public final PlayerComponent getSTUB() {
            return STUB;
        }
    }

    bx40 q3();
}
