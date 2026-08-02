package com.vk.music.attach.dto;

import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.List;
import xsna.o25;

/* loaded from: classes3.dex */
public class PlaylistSearchResult extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PlaylistSearchResult> CREATOR = new a();
    public ArrayList b;
    public ArrayList c;

    public class a extends Serializer.c<PlaylistSearchResult> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PlaylistSearchResult a(@NonNull Serializer serializer) {
            PlaylistSearchResult playlistSearchResult = new PlaylistSearchResult();
            Serializer.c<Playlist> cVar = Playlist.CREATOR;
            playlistSearchResult.b = serializer.j(cVar);
            playlistSearchResult.c = serializer.j(cVar);
            return playlistSearchResult;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlaylistSearchResult[i];
        }
    }

    public PlaylistSearchResult(@NonNull List<Playlist> list) {
        for (Playlist playlist : list) {
            if (o25.a().a(playlist.c)) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                this.b.add(playlist);
            } else {
                if (this.c == null) {
                    this.c = new ArrayList();
                }
                this.c.add(playlist);
            }
        }
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.o0(this.b);
        serializer.o0(this.c);
    }
}
