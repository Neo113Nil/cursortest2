package com.vk.music.offline.configs.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.offline.configs.api.di.AudioReactionsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bu4;
import xsna.c8m;
import xsna.cu1;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: AudioReactionsComponentImpl.kt */
/* loaded from: classes3.dex */
public final class AudioReactionsComponentImpl implements AudioReactionsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new cu1(this));

    /* compiled from: AudioReactionsComponentImpl.kt */
    public static final class a implements c8m<AudioReactionsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new AudioReactionsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AudioReactionsComponentImpl.class, "interactor", "getInteractor()Lcom/vk/music/offline/configs/api/domain/interactor/AudioReactionsInteractor;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.offline.configs.api.di.AudioReactionsComponent
    public final bu4 b() {
        qcy<Object> qcyVar = b[0];
        return (bu4) this.a.c();
    }
}
