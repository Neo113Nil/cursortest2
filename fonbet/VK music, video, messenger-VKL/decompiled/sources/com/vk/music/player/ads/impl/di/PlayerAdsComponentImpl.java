package com.vk.music.player.ads.impl.di;

import com.vk.ads.adchoice.api.di.AdChoiceComponent;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.music.player.ads.api.di.PlayerAdsComponent;
import com.vk.music.playerservice.impl.PlayerService;
import xsna.ah0;
import xsna.bhz;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.hx40;
import xsna.jb4;
import xsna.kb4;
import xsna.mb4;
import xsna.nb4;
import xsna.pb4;
import xsna.pwj0;
import xsna.zg0;

/* compiled from: PlayerAdsComponentImpl.kt */
/* loaded from: classes3.dex */
public final class PlayerAdsComponentImpl implements PlayerAdsComponent {
    public final AdChoiceComponent a;
    public final AuthBridgeComponent b;

    /* compiled from: PlayerAdsComponentImpl.kt */
    public static final class a implements c8m<PlayerAdsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PlayerAdsComponentImpl((AdChoiceComponent) g8mVar.a(fpf0.a(AdChoiceComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    public PlayerAdsComponentImpl(AdChoiceComponent adChoiceComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = adChoiceComponent;
        this.b = authBridgeComponent;
    }

    @Override // com.vk.music.player.ads.api.di.PlayerAdsComponent
    public final zg0 N2(PlayerService playerService, hx40 hx40Var) {
        return new ah0(playerService, hx40Var);
    }

    @Override // com.vk.music.player.ads.api.di.PlayerAdsComponent
    public final nb4 O4(mb4 mb4Var, bhz bhzVar) {
        return new pb4(new jb4(mb4Var, this.a.M3(), this.b.s()), new kb4(), bhzVar);
    }
}
