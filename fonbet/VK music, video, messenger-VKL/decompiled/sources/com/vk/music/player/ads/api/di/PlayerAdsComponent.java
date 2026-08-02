package com.vk.music.player.ads.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.playerservice.impl.PlayerService;
import xsna.bhz;
import xsna.hx40;
import xsna.mb4;
import xsna.nb4;
import xsna.pwj0;
import xsna.yg0;
import xsna.zg0;

/* compiled from: PlayerAdsComponent.kt */
/* loaded from: classes3.dex */
public interface PlayerAdsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlayerAdsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlayerAdsComponent STUB = new PlayerAdsComponent() { // from class: com.vk.music.player.ads.api.di.PlayerAdsComponent$Companion$STUB$1
            @Override // com.vk.music.player.ads.api.di.PlayerAdsComponent
            public final zg0 N2(PlayerService playerService, hx40 hx40Var) {
                return new yg0(playerService);
            }

            @Override // com.vk.music.player.ads.api.di.PlayerAdsComponent
            public final nb4 O4(mb4 mb4Var, bhz bhzVar) {
                return nb4.a.getSTUB();
            }
        };

        public final PlayerAdsComponent getSTUB() {
            return STUB;
        }
    }

    zg0 N2(PlayerService playerService, hx40 hx40Var);

    nb4 O4(mb4 mb4Var, bhz bhzVar);
}
