package com.vk.music.player.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.player.api.PlayerBottomSheetStateHolder;
import java.util.UUID;
import xsna.c550;
import xsna.e5b0;
import xsna.i5b0;
import xsna.p2k0;
import xsna.pwj0;
import xsna.qww;
import xsna.s4b0;
import xsna.zza0;

/* compiled from: PlayerUIComponent.kt */
/* loaded from: classes.dex */
public interface PlayerUIComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: PlayerUIComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PlayerUIComponent STUB = new PlayerUIComponent() { // from class: com.vk.music.player.api.di.PlayerUIComponent$Companion$STUB$1
            public final c550 a = c550.a.a.getSTUB();
            public final qww b = qww.a.a.getSTUB();
            public final zza0 c;
            public final PlayerBottomSheetStateHolder d;
            public final s4b0 e;
            public final p2k0 f;
            public final e5b0 g;

            {
                i5b0.a.a.getSTUB();
                this.c = new zza0(BottomPlayerAppearance.COMPACT);
                this.d = PlayerBottomSheetStateHolder.a.a.getSTUB();
                this.e = s4b0.a.a.getSTUB();
                this.f = p2k0.a.a.getSTUB();
                this.g = new e5b0(UUID.randomUUID());
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final PlayerBottomSheetStateHolder J9() {
                return this.d;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final c550 Ne() {
                return this.a;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final qww O6() {
                return this.b;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final zza0 Ra() {
                return this.c;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final s4b0 a3() {
                return this.e;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final p2k0 ub() {
                return this.f;
            }

            @Override // com.vk.music.player.api.di.PlayerUIComponent
            public final e5b0 w4() {
                return this.g;
            }
        };

        public final PlayerUIComponent getSTUB() {
            return STUB;
        }
    }

    PlayerBottomSheetStateHolder J9();

    c550 Ne();

    qww O6();

    zza0 Ra();

    s4b0 a3();

    p2k0 ub();

    e5b0 w4();
}
