package com.vk.video.playlist.common.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.oab0;
import xsna.qcy;
import xsna.wv0;

/* compiled from: PlaylistComponentImpl.kt */
/* loaded from: classes6.dex */
public final class PlaylistComponentImpl implements PlaylistComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new wv0(25));

    /* compiled from: PlaylistComponentImpl.kt */
    public static final class a implements b7m<PlaylistComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new PlaylistComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PlaylistComponentImpl.class, "playlistLauncher", "getPlaylistLauncher()Lcom/vk/video/playlist/common/PlaylistLauncher;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.video.playlist.common.di.PlaylistComponent
    public final oab0 U() {
        qcy<Object> qcyVar = b[0];
        return (oab0) this.a.c();
    }
}
