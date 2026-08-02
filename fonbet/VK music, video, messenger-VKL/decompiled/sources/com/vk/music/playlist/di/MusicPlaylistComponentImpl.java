package com.vk.music.playlist.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.la0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: MusicPlaylistComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicPlaylistComponentImpl implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: MusicPlaylistComponentImpl.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new MusicPlaylistComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicPlaylistComponentImpl.class, "playlistLauncher", "getPlaylistLauncher()Lcom/vk/music/playlist/api/MusicPlaylistLauncher;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public MusicPlaylistComponentImpl() {
        new nwy(new la0(17));
    }
}
