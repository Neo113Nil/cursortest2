package com.vk.games.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.oft;

/* compiled from: GamesFragmentsComponent.kt */
/* loaded from: classes17.dex */
public interface GamesFragmentsComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: GamesFragmentsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final GamesFragmentsComponent STUB = new GamesFragmentsComponent() { // from class: com.vk.games.di.GamesFragmentsComponent$Companion$STUB$1
            @Override // com.vk.games.di.GamesFragmentsComponent
            public final oft E() {
                return oft.a.a.getSTUB();
            }
        };

        public final GamesFragmentsComponent getSTUB() {
            return STUB;
        }
    }

    oft E();
}
