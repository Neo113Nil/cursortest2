package com.vk.music.podcast.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.podcast.api.di.a;
import xsna.dgb0;
import xsna.phb0;
import xsna.pwj0;
import xsna.shb0;

/* compiled from: PodcastComponent.kt */
/* loaded from: classes.dex */
public interface PodcastComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: PodcastComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PodcastComponent STUB = new PodcastComponent() { // from class: com.vk.music.podcast.api.di.PodcastComponent$Companion$STUB$1
            public final phb0 a = phb0.a.a.getSTUB();
            public final shb0 b = shb0.a.a.getSTUB();
            public final a c = a.C1351a.a.getSTUB();
            public final dgb0 d = dgb0.a.a.getSTUB();

            @Override // com.vk.music.podcast.api.di.PodcastComponent
            public final dgb0 O0() {
                return this.d;
            }

            @Override // com.vk.music.podcast.api.di.PodcastComponent
            public final a cf() {
                return this.c;
            }

            @Override // com.vk.music.podcast.api.di.PodcastComponent
            public final shb0 t5() {
                return this.b;
            }

            @Override // com.vk.music.podcast.api.di.PodcastComponent
            public final phb0 x2() {
                return this.a;
            }
        };

        public final PodcastComponent getSTUB() {
            return STUB;
        }
    }

    dgb0 O0();

    a cf();

    shb0 t5();

    phb0 x2();
}
