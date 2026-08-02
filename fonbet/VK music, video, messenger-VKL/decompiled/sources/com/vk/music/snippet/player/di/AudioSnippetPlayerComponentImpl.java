package com.vk.music.snippet.player.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.snippet.api.di.AudioSnippetPlayerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fck0;
import xsna.fpf0;
import xsna.g8m;
import xsna.gck0;
import xsna.hx40;
import xsna.nwy;
import xsna.osj0;
import xsna.ox4;
import xsna.pwj0;
import xsna.qcy;
import xsna.zbk0;

/* compiled from: AudioSnippetPlayerComponentImpl.kt */
/* loaded from: classes.dex */
public final class AudioSnippetPlayerComponentImpl implements AudioSnippetPlayerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new ox4(0));

    /* compiled from: AudioSnippetPlayerComponentImpl.kt */
    public static final class a implements c8m<AudioSnippetPlayerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudioSnippetPlayerComponentImpl();
        }
    }

    /* compiled from: AudioSnippetPlayerComponentImpl.kt */
    /* loaded from: classes3.dex */
    public static final class b implements gck0 {
        @Override // xsna.gck0
        public final zbk0 a(hx40 hx40Var, fck0 fck0Var) {
            return new osj0(hx40Var, fck0Var);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioSnippetPlayerComponentImpl.class, "simpleSnippetPlayerFactory", "getSimpleSnippetPlayerFactory()Lcom/vk/music/snippet/api/player/SnippetPlayerFactory;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.snippet.api.di.AudioSnippetPlayerComponent
    public final gck0 U2() {
        qcy<Object> qcyVar = b[0];
        return (gck0) this.a.c();
    }
}
