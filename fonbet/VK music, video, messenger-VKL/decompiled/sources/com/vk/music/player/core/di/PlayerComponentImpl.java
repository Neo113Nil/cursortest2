package com.vk.music.player.core.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.player.api.di.PlayerComponent;
import xsna.b7m;
import xsna.bx40;
import xsna.e7m;

/* compiled from: PlayerComponentImpl.kt */
/* loaded from: classes3.dex */
public final class PlayerComponentImpl implements PlayerComponent {
    public final bx40 a;

    /* compiled from: PlayerComponentImpl.kt */
    public static final class a implements b7m<PlayerComponent> {
        public final bx40 a = new bx40(0);

        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new PlayerComponentImpl(this.a);
        }
    }

    public PlayerComponentImpl(bx40 bx40Var) {
        this.a = bx40Var;
    }

    @Override // com.vk.music.player.api.di.PlayerComponent
    public final bx40 q3() {
        return this.a;
    }
}
