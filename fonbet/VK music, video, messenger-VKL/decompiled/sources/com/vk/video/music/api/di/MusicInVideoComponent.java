package com.vk.video.music.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.jsf0;
import xsna.nxs0;
import xsna.pwj0;

/* compiled from: MusicInVideoComponent.kt */
/* loaded from: classes6.dex */
public interface MusicInVideoComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicInVideoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicInVideoComponent$Companion$STUB$1 STUB = new MusicInVideoComponent() { // from class: com.vk.video.music.api.di.MusicInVideoComponent$Companion$STUB$1
            public final jsf0 a = jsf0.a.a.getSTUB();
            public final nxs0 b = nxs0.a.a.getSTUB();

            @Override // com.vk.video.music.api.di.MusicInVideoComponent
            public final nxs0 T0() {
                return this.b;
            }

            @Override // com.vk.video.music.api.di.MusicInVideoComponent
            public final jsf0 pb() {
                return this.a;
            }
        };
    }

    nxs0 T0();

    jsf0 pb();
}
