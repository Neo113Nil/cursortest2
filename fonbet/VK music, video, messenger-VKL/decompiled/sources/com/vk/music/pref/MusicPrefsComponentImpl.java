package com.vk.music.pref;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.y0f;

/* compiled from: MusicPrefsComponentImpl.kt */
/* loaded from: classes.dex */
public final class MusicPrefsComponentImpl implements MusicPrefsComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new y0f(3));

    /* compiled from: MusicPrefsComponentImpl.kt */
    public static final class a implements c8m<MusicPrefsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicPrefsComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicPrefsComponentImpl.class, "musicPrefs", "getMusicPrefs()Lcom/vk/music/pref/MusicPrefs;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.pref.MusicPrefsComponent
    public final com.vk.music.pref.a Q0() {
        qcy<Object> qcyVar = b[0];
        return (com.vk.music.pref.a) this.a.c();
    }
}
