package com.vk.music.player.core.audioeffect;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pu;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: AudioEffectSettingsComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AudioEffectSettingsComponentImpl implements AudioEffectSettingsComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final MusicPrefsComponent a;
    public final MusicSubscriptionComponent b;
    public final nwy c = new nwy(new pu(this, 8));

    /* compiled from: AudioEffectSettingsComponentImpl.kt */
    public static final class a implements c8m<AudioEffectSettingsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudioEffectSettingsComponentImpl((MusicPrefsComponent) g8mVar.a(fpf0.a(MusicPrefsComponent.class)), (MusicSubscriptionComponent) g8mVar.a(fpf0.a(MusicSubscriptionComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioEffectSettingsComponentImpl.class, "audioEffectSettings", "getAudioEffectSettings()Lcom/vk/music/audioeffect/AudioEffectSettings;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public AudioEffectSettingsComponentImpl(MusicPrefsComponent musicPrefsComponent, MusicSubscriptionComponent musicSubscriptionComponent) {
        this.a = musicPrefsComponent;
        this.b = musicSubscriptionComponent;
    }

    @Override // com.vk.music.audioeffect.AudioEffectSettingsComponent
    public final com.vk.music.audioeffect.a f0() {
        qcy<Object> qcyVar = d[0];
        return (com.vk.music.audioeffect.a) this.c.c();
    }
}
