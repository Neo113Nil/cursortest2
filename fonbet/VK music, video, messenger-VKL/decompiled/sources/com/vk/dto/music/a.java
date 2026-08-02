package com.vk.dto.music;

import com.vk.dto.common.data.VKList;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;
import xsna.s3q0;
import xsna.w9y;

/* compiled from: UserPlaylists.kt */
/* loaded from: classes18.dex */
public final class a implements bxx {
    public final VKList<Playlist> b;
    public final PlaylistOwner c;

    public a(VKList<Playlist> vKList, PlaylistOwner playlistOwner) {
        this.b = vKList;
        this.c = playlistOwner;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        w9y w9yVar = new w9y();
        w9yVar.g("list_owner", this.c);
        w9yVar.g("vk_list", this.b);
        s3q0 s3q0Var = s3q0.a;
        return w9yVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        PlaylistOwner playlistOwner = this.c;
        return hashCode + (playlistOwner == null ? 0 : playlistOwner.hashCode());
    }

    public final String toString() {
        return "UserPlaylists(playlists=" + this.b + ", listOwner=" + this.c + ')';
    }
}
