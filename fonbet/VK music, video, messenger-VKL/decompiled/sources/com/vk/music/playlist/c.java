package com.vk.music.playlist;

import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.music.PlaylistPermissions;
import com.vk.music.playlist.ModernPlaylistModel;
import xsna.b9b0;
import xsna.izs;
import xsna.k840;
import xsna.r5v0;
import xsna.s3q0;
import xsna.xx1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ Playlist b;
    public final /* synthetic */ ModernPlaylistModel c;

    public /* synthetic */ c(Playlist playlist, ModernPlaylistModel modernPlaylistModel) {
        this.b = playlist;
        this.c = modernPlaylistModel;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Playlist playlist = this.b;
        ModernPlaylistModel modernPlaylistModel = this.c;
        playlist.g = (PlaylistLink) obj;
        playlist.t = true;
        PlaylistPermissions playlistPermissions = playlist.B;
        playlist.B = playlistPermissions != null ? PlaylistPermissions.zb(playlistPermissions, false) : null;
        Playlist k = xx1.k(playlist);
        modernPlaylistModel.h = ModernPlaylistModel.PlaylistModelData.zb(modernPlaylistModel.h, k.c, k.b, k.x, k, null, 16);
        r5v0 r5v0Var = k840.a.h;
        (r5v0Var != null ? r5v0Var : null).b(new b9b0(playlist, k, true));
        return s3q0.a;
    }
}
