package com.vk.music.playlist;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.List;
import xsna.izs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements izs {
    public final /* synthetic */ ModernPlaylistModel b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ModernPlaylistModel modernPlaylistModel = this.b;
        List<MusicTrack> list = (List) obj;
        Playlist playlist = modernPlaylistModel.h.e;
        return playlist == null ? list : modernPlaylistModel.d.a(playlist, list);
    }
}
