package com.vk.music.player;

import com.vk.di.component.DiScopedComponent;
import com.vk.music.api.MusicPlayerServiceComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.qo0;

/* compiled from: MusicPlayerServiceComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicPlayerServiceComponentImpl implements MusicPlayerServiceComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new qo0(25));

    /* compiled from: MusicPlayerServiceComponentImpl.kt */
    public static final class a implements c8m<MusicPlayerServiceComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicPlayerServiceComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicPlayerServiceComponentImpl.class, "musicPlayerServiceState", "getMusicPlayerServiceState()Lcom/vk/music/api/MusicPlayerServiceState;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.api.MusicPlayerServiceComponent
    public final com.vk.music.api.a o4() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.music.api.a) this.a.c();
    }
}
