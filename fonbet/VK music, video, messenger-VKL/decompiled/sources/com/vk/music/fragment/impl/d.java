package com.vk.music.fragment.impl;

import android.view.View;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.fragment.impl.b;
import xsna.ifb0;
import xsna.rfb0;

/* compiled from: PlaylistsFragment.java */
/* loaded from: classes3.dex */
public final class d implements b.a {
    public final /* synthetic */ MusicPlaybackLaunchContext b;
    public final /* synthetic */ PlaylistsFragment c;

    public d(PlaylistsFragment playlistsFragment, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.c = playlistsFragment;
        this.b = musicPlaybackLaunchContext;
    }

    @Override // com.vk.music.fragment.impl.b.a
    public final View a(b bVar) {
        rfb0 rfb0Var = (rfb0) bVar.c[0];
        int i = PlaylistsFragment.O;
        PlaylistsFragment playlistsFragment = this.c;
        return new ifb0(playlistsFragment, rfb0Var, this.b, playlistsFragment.J);
    }
}
