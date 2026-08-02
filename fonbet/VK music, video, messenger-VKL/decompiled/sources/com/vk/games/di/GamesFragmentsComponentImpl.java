package com.vk.games.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.oft;
import xsna.pft;

/* compiled from: GamesFragmentsComponentImpl.kt */
/* loaded from: classes17.dex */
public final class GamesFragmentsComponentImpl implements GamesFragmentsComponent {

    /* compiled from: GamesFragmentsComponentImpl.kt */
    public static final class a implements b7m<GamesFragmentsComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new GamesFragmentsComponentImpl();
        }
    }

    @Override // com.vk.games.di.GamesFragmentsComponent
    public final oft E() {
        return new pft();
    }
}
