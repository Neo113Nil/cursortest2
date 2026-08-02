package com.vk.music.snippet.player.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.snippet.api.di.AudioSnippetComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.ix4;
import xsna.lx4;
import xsna.nwy;
import xsna.oo;
import xsna.qcy;
import xsna.wx4;

/* compiled from: AudioSnippetComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AudioSnippetComponentImpl implements AudioSnippetComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final wx4 a;
    public final nwy b = new nwy(new oo(this, 5));

    /* compiled from: AudioSnippetComponentImpl.kt */
    public static final class a implements b7m<AudioSnippetComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new AudioSnippetComponentImpl(new wx4(new ix4()));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioSnippetComponentImpl.class, "audioSnippetInteractor", "getAudioSnippetInteractor()Lcom/vk/music/snippet/api/domain/interactor/AudioSnippetInteractor;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public AudioSnippetComponentImpl(wx4 wx4Var) {
        this.a = wx4Var;
    }

    @Override // com.vk.music.snippet.api.di.AudioSnippetComponent
    public final lx4 H3() {
        qcy<Object> qcyVar = c[0];
        return (lx4) this.b.c();
    }
}
