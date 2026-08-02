package com.vk.music.player.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.otp;
import xsna.pwj0;

/* compiled from: EqualizerControllerComponent.kt */
/* loaded from: classes3.dex */
public interface EqualizerControllerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: EqualizerControllerComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final EqualizerControllerComponent STUB = new EqualizerControllerComponent() { // from class: com.vk.music.player.api.di.EqualizerControllerComponent$Companion$STUB$1
            public final otp a = otp.a.getSTUB();

            @Override // com.vk.music.player.api.di.EqualizerControllerComponent
            public final otp F9() {
                return this.a;
            }
        };

        public final EqualizerControllerComponent getSTUB() {
            return STUB;
        }
    }

    otp F9();
}
