package com.vk.music.playlist;

import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.music.playlist.ModernPlaylistModel;
import kotlin.Pair;
import xsna.b9b0;
import xsna.izs;
import xsna.k840;
import xsna.r5v0;
import xsna.xx1;

/* compiled from: ModernPlaylistModel.kt */
/* loaded from: classes3.dex */
public final class f implements izs {
    public final /* synthetic */ Playlist b;
    public final /* synthetic */ ModernPlaylistModel c;

    public f(Playlist playlist, ModernPlaylistModel modernPlaylistModel) {
        this.b = playlist;
        this.c = modernPlaylistModel;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Playlist m = xx1.m(this.b);
        m.g = null;
        m.t = false;
        PlaylistPermissions playlistPermissions = m.B;
        m.B = playlistPermissions != null ? PlaylistPermissions.zb(playlistPermissions, true) : null;
        ModernPlaylistModel modernPlaylistModel = this.c;
        modernPlaylistModel.h = ModernPlaylistModel.PlaylistModelData.zb(modernPlaylistModel.h, m.c, m.b, m.x, m, null, 16);
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new b9b0(this.b, m, false));
        Playlist playlist = this.b;
        playlist.f = null;
        playlist.g = null;
        playlist.t = false;
        Playlist playlist2 = this.b;
        return new Pair(m, new PlaylistLink(playlist2.b, playlist2.c, null, 4, null));
    }
}
