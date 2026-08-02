package com.vk.music.playerservice.impl;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.playerservice.api.PlayerServiceComponent;
import xsna.bpn0;
import xsna.c8m;
import xsna.g8m;
import xsna.nd1;
import xsna.pwj0;

/* compiled from: PlayerServiceComponentImpl.kt */
/* loaded from: classes3.dex */
public final class PlayerServiceComponentImpl implements PlayerServiceComponent {
    public final bpn0 a = new bpn0(new nd1(28));

    /* compiled from: PlayerServiceComponentImpl.kt */
    public static final class a implements c8m<PlayerServiceComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PlayerServiceComponentImpl();
        }
    }

    @Override // com.vk.music.playerservice.api.PlayerServiceComponent
    public final com.vk.music.playerservice.api.a i7() {
        return (com.vk.music.playerservice.api.a) this.a.getValue();
    }
}
