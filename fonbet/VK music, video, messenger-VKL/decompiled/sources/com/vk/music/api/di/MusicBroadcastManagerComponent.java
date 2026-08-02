package com.vk.music.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.mc40;

/* compiled from: MusicBroadcastManagerComponent.kt */
/* loaded from: classes3.dex */
public interface MusicBroadcastManagerComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicBroadcastManagerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicBroadcastManagerComponent STUB = new MusicBroadcastManagerComponent() { // from class: com.vk.music.api.di.MusicBroadcastManagerComponent$Companion$STUB$1
            public final mc40 a = mc40.a.a.getSTUB();

            @Override // com.vk.music.api.di.MusicBroadcastManagerComponent
            public final mc40 M() {
                return this.a;
            }
        };

        public final MusicBroadcastManagerComponent getSTUB() {
            return STUB;
        }
    }

    mc40 M();
}
