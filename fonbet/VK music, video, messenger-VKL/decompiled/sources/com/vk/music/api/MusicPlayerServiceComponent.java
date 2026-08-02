package com.vk.music.api;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: MusicPlayerServiceComponent.kt */
/* loaded from: classes3.dex */
public interface MusicPlayerServiceComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicPlayerServiceComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicPlayerServiceComponent STUB = new MusicPlayerServiceComponent() { // from class: com.vk.music.api.MusicPlayerServiceComponent$Companion$STUB$1
            public final a a = a.a.getSTUB();

            @Override // com.vk.music.api.MusicPlayerServiceComponent
            public final a o4() {
                return this.a;
            }
        };

        public final MusicPlayerServiceComponent getSTUB() {
            return STUB;
        }
    }

    a o4();
}
