package com.vk.clips.blacklists.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.tjd;

/* compiled from: ClipsBlacklistsComponent.kt */
/* loaded from: classes.dex */
public interface ClipsBlacklistsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsBlacklistsComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsBlacklistsComponent STUB = new ClipsBlacklistsComponent() { // from class: com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent$Companion$STUB$1
            public final tjd a = tjd.a.a.getSTUB();

            @Override // com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent
            public final tjd f4() {
                return this.a;
            }
        };

        public final ClipsBlacklistsComponent getSTUB() {
            return STUB;
        }
    }

    tjd f4();
}
