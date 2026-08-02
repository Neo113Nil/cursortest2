package com.vk.music.audioeffect;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: AudioEffectSettingsComponent.kt */
/* loaded from: classes3.dex */
public interface AudioEffectSettingsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AudioEffectSettingsComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AudioEffectSettingsComponent STUB = new AudioEffectSettingsComponent() { // from class: com.vk.music.audioeffect.AudioEffectSettingsComponent$Companion$STUB$1
            public final a a = a.a.getSTUB();

            @Override // com.vk.music.audioeffect.AudioEffectSettingsComponent
            public final a f0() {
                return this.a;
            }
        };

        public final AudioEffectSettingsComponent getSTUB() {
            return STUB;
        }
    }

    a f0();
}
