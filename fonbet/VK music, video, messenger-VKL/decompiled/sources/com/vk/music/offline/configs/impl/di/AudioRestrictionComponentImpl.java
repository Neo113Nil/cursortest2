package com.vk.music.offline.configs.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.offline.configs.api.di.AudioRestrictionComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gu0;
import xsna.mw4;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.zy;

/* compiled from: AudioRestrictionComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AudioRestrictionComponentImpl implements AudioRestrictionComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(AudioRestrictionComponentImpl.class, "audioRestrictionInteractor", "getAudioRestrictionInteractor()Lcom/vk/music/offline/configs/api/domain/interactor/AudioRestrictionInteractor;", 0), fp.c(0, AudioRestrictionComponentImpl.class, "repository", "getRepository()Lcom/vk/music/offline/configs/api/domain/repository/AudioRestrictionRepository;", fpf0.a)};
    public final nwy a = new nwy(new zy(this, 6));
    public final nwy b = new nwy(new gu0(1));

    /* compiled from: AudioRestrictionComponentImpl.kt */
    public static final class a implements c8m<AudioRestrictionComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudioRestrictionComponentImpl();
        }
    }

    @Override // com.vk.music.offline.configs.api.di.AudioRestrictionComponent
    public final mw4 h6() {
        qcy<Object> qcyVar = c[0];
        return (mw4) this.a.c();
    }
}
