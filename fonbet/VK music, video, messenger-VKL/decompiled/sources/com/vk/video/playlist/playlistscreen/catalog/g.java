package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.catalog.mvi.block.BlockId;
import xsna.bab0;
import xsna.jcb0;
import xsna.u1a;

/* compiled from: PlaylistHeaderView.kt */
/* loaded from: classes6.dex */
public final class g extends u1a<PlaylistHeaderView$State, bab0> {
    @Override // xsna.u1a
    public final void g(bab0 bab0Var) {
        t(new jcb0(new BlockId.Simple(bab0Var.b)));
    }

    @Override // xsna.u1a
    public final PlaylistHeaderView$State h(PlaylistHeaderView$State playlistHeaderView$State, PlaylistHeaderView$State playlistHeaderView$State2) {
        PlaylistHeaderView$State playlistHeaderView$State3 = playlistHeaderView$State2;
        return new PlaylistHeaderView$State(playlistHeaderView$State3.b, playlistHeaderView$State3.c, playlistHeaderView$State3.d, playlistHeaderView$State3.e, playlistHeaderView$State.f, playlistHeaderView$State3.g, null);
    }
}
