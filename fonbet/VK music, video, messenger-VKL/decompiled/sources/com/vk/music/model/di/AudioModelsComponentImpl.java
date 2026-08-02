package com.vk.music.model.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.snippet.api.di.AudioSnippetPlayerComponent;
import com.vk.music.subscription.api.di.MusicSubscriptionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dr4;
import xsna.ep;
import xsna.er4;
import xsna.ewy;
import xsna.f53;
import xsna.fa40;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.u2b0;

/* compiled from: AudioModelsComponentImpl.kt */
/* loaded from: classes.dex */
public final class AudioModelsComponentImpl implements AudioModelsComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final MusicSubscriptionComponent a;
    public final AudioSnippetPlayerComponent b;
    public final ewy c = new ewy(new dr4(this, 0));
    public final nwy d = new nwy(new f53(this, 1));
    public final nwy e = new nwy(new er4(this, 0));

    /* compiled from: AudioModelsComponentImpl.kt */
    public static final class a implements c8m<AudioModelsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudioModelsComponentImpl((MusicSubscriptionComponent) g8mVar.a(fpf0.a(MusicSubscriptionComponent.class)), (AudioSnippetPlayerComponent) g8mVar.a(fpf0.a(AudioSnippetPlayerComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioModelsComponentImpl.class, "playerModel", "getPlayerModel()Lcom/vk/music/model/player/PlayerModel;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, AudioModelsComponentImpl.class, "snippetPlayerModel", "getSnippetPlayerModel()Lcom/vk/music/model/player/PlayerModel;", hpf0Var), ep.a(0, AudioModelsComponentImpl.class, "artistModel", "getArtistModel()Lcom/vk/music/model/artist/MusicArtistModel;", hpf0Var)};
    }

    public AudioModelsComponentImpl(MusicSubscriptionComponent musicSubscriptionComponent, AudioSnippetPlayerComponent audioSnippetPlayerComponent) {
        this.a = musicSubscriptionComponent;
        this.b = audioSnippetPlayerComponent;
    }

    @Override // com.vk.music.model.di.AudioModelsComponent
    public final fa40 P1() {
        qcy<Object> qcyVar = f[2];
        return (fa40) this.e.c();
    }

    @Override // com.vk.music.model.di.AudioModelsComponent
    public final u2b0 r() {
        qcy<Object> qcyVar = f[0];
        return (u2b0) this.c.c();
    }

    @Override // com.vk.music.model.di.AudioModelsComponent
    public final u2b0 s8() {
        qcy<Object> qcyVar = f[1];
        return (u2b0) this.d.c();
    }
}
