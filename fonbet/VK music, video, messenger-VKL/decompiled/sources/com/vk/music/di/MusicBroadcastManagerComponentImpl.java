package com.vk.music.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.api.di.MusicBroadcastManagerComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.d4;
import xsna.e7m;
import xsna.fpf0;
import xsna.mc40;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MusicBroadcastManagerComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicBroadcastManagerComponentImpl implements MusicBroadcastManagerComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new d4(23));

    /* compiled from: MusicBroadcastManagerComponentImpl.kt */
    public static final class a implements b7m<MusicBroadcastManagerComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicBroadcastManagerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicBroadcastManagerComponentImpl.class, "broadcastManager", "getBroadcastManager()Lcom/vk/music/api/MusicBroadcastManager;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.music.api.di.MusicBroadcastManagerComponent
    public final mc40 M() {
        qcy<Object> qcyVar = b[0];
        return (mc40) this.a.c();
    }
}
