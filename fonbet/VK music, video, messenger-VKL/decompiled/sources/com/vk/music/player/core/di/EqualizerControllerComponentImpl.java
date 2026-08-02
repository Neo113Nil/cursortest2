package com.vk.music.player.core.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.audioeffect.AudioEffectSettingsComponent;
import com.vk.music.player.api.di.EqualizerControllerComponent;
import com.vk.music.pref.MusicPrefsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.otp;
import xsna.pwj0;
import xsna.qcy;
import xsna.trf;

/* compiled from: EqualizerControllerComponentImpl.kt */
/* loaded from: classes3.dex */
public final class EqualizerControllerComponentImpl implements EqualizerControllerComponent {
    public static final /* synthetic */ qcy<Object>[] d;
    public final MusicPrefsComponent a;
    public final AudioEffectSettingsComponent b;
    public final nwy c = new nwy(new trf(this, 22));

    /* compiled from: EqualizerControllerComponentImpl.kt */
    public static final class a implements c8m<EqualizerControllerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new EqualizerControllerComponentImpl((MusicPrefsComponent) g8mVar.a(fpf0.a(MusicPrefsComponent.class)), (AudioEffectSettingsComponent) g8mVar.a(fpf0.a(AudioEffectSettingsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(EqualizerControllerComponentImpl.class, "equalizerController", "getEqualizerController()Lcom/vk/music/player/api/equalizer/EqualizerController;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public EqualizerControllerComponentImpl(MusicPrefsComponent musicPrefsComponent, AudioEffectSettingsComponent audioEffectSettingsComponent) {
        this.a = musicPrefsComponent;
        this.b = audioEffectSettingsComponent;
    }

    @Override // com.vk.music.player.api.di.EqualizerControllerComponent
    public final otp F9() {
        qcy<Object> qcyVar = d[0];
        return (otp) this.c.c();
    }
}
