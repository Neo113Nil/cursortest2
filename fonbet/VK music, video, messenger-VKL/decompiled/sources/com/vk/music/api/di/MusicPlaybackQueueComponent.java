package com.vk.music.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.khz;
import xsna.nxa0;
import xsna.p05;
import xsna.pwj0;

/* compiled from: MusicPlaybackQueueComponent.kt */
/* loaded from: classes3.dex */
public interface MusicPlaybackQueueComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicPlaybackQueueComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicPlaybackQueueComponent STUB = new MusicPlaybackQueueComponent() { // from class: com.vk.music.api.di.MusicPlaybackQueueComponent$Companion$STUB$1
            public final nxa0 a = nxa0.a.a.getSTUB();
            public final khz b = khz.a.a.getSTUB();
            public final p05 c = p05.a.getSTUB();

            @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
            public final p05 P2() {
                return this.c;
            }

            @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
            public final khz e4() {
                return this.b;
            }

            @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
            public final nxa0 za() {
                return this.a;
            }
        };

        public final MusicPlaybackQueueComponent getSTUB() {
            return STUB;
        }
    }

    p05 P2();

    khz e4();

    nxa0 za();
}
