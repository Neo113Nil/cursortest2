package com.vk.dto.stories.model.clickable;

import com.vk.core.serialize.Serializer;
import com.vk.dto.music.MusicDynamicRestriction;
import com.vk.dto.music.Playlist;
import com.vk.superapp.api.dto.story.WebClickablePoint;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import xsna.epx;
import xsna.q500;
import xsna.zcl;

/* compiled from: ClickableMusicPlaylist.kt */
/* loaded from: classes18.dex */
public final class ClickableMusicPlaylist extends ClickableSticker {
    public static final Serializer.c<ClickableMusicPlaylist> CREATOR = new a();
    public final Playlist e;
    public final MusicDynamicRestriction f;
    public final WebStickerType g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ClickableMusicPlaylist> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ClickableMusicPlaylist a(Serializer serializer) {
            return new ClickableMusicPlaylist(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ClickableMusicPlaylist[i];
        }
    }

    public /* synthetic */ ClickableMusicPlaylist(long j, List list, q500 q500Var, Playlist playlist, MusicDynamicRestriction musicDynamicRestriction, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, list, (i & 4) != 0 ? null : q500Var, playlist, (i & 16) != 0 ? null : musicDynamicRestriction);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final WebStickerType Cb() {
        return this.g;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.W(this.c);
        serializer.d0(this.d);
        serializer.i0(this.e);
        serializer.i0(this.f);
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker, xsna.bxx
    public final JSONObject e5() {
        JSONObject e5 = super.e5();
        Playlist playlist = this.e;
        e5.put("playlist_id", playlist != null ? Integer.valueOf(playlist.b) : null);
        e5.put("playlist_owner_id", playlist != null ? playlist.c : null);
        e5.put("playlist_access_key", playlist != null ? playlist.x : null);
        return e5;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableMusicPlaylist) || !super.equals(obj)) {
            return false;
        }
        ClickableMusicPlaylist clickableMusicPlaylist = (ClickableMusicPlaylist) obj;
        return epx.f(this.e, clickableMusicPlaylist.e) && epx.f(this.f, clickableMusicPlaylist.f) && this.g == clickableMusicPlaylist.g;
    }

    @Override // com.vk.dto.stories.model.clickable.ClickableSticker
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Playlist playlist = this.e;
        int hashCode2 = (hashCode + (playlist != null ? playlist.hashCode() : 0)) * 31;
        MusicDynamicRestriction musicDynamicRestriction = this.f;
        return this.g.hashCode() + ((hashCode2 + (musicDynamicRestriction != null ? musicDynamicRestriction.hashCode() : 0)) * 31);
    }

    public ClickableMusicPlaylist(long j, List<WebClickablePoint> list, q500 q500Var, Playlist playlist, MusicDynamicRestriction musicDynamicRestriction) {
        super(j, list, q500Var);
        this.e = playlist;
        this.f = musicDynamicRestriction;
        this.g = WebStickerType.MUSIC_PLAYLIST;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClickableMusicPlaylist(Serializer serializer) {
        this(r1, r0 == null ? new ArrayList() : r0, serializer.y(), (Playlist) serializer.G(Playlist.class.getClassLoader()), (MusicDynamicRestriction) serializer.G(MusicDynamicRestriction.class.getClassLoader()));
        long w = serializer.w();
        ArrayList k = serializer.k(WebClickablePoint.class);
    }
}
