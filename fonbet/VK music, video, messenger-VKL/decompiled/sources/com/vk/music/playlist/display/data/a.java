package com.vk.music.playlist.display.data;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.List;
import xsna.abo;
import xsna.afa;
import xsna.d120;
import xsna.e3a;
import xsna.f5y;
import xsna.gzn;
import xsna.iu4;
import xsna.ix4;
import xsna.jnj;
import xsna.jz30;
import xsna.mr;
import xsna.oc40;
import xsna.pj4;
import xsna.pn;
import xsna.pq40;
import xsna.pyz;
import xsna.q520;
import xsna.q66;
import xsna.qxi;
import xsna.rsg0;
import xsna.t520;
import xsna.tfx;
import xsna.xga;
import xsna.yfb;

/* compiled from: MusicPlaylistRepository.kt */
/* loaded from: classes3.dex */
public final class a {
    public final oc40 a;
    public final abo b;
    public final pq40 c;
    public final ix4 d;
    public final xga e;
    public final qxi f;
    public final afa g;
    public final e3a h;

    public a(oc40 oc40Var, abo aboVar, pq40 pq40Var) {
        ix4 ix4Var = new ix4();
        xga xgaVar = new xga();
        qxi qxiVar = new qxi();
        this.a = oc40Var;
        this.b = aboVar;
        this.c = pq40Var;
        this.d = ix4Var;
        this.e = xgaVar;
        this.f = qxiVar;
        this.g = new afa();
        this.h = new e3a();
    }

    public final q<PlaylistLink> a(Playlist playlist, List<MusicTrack> list, String str) {
        j1 U;
        PlaylistLink playlistLink = playlist.g;
        if (playlistLink != null) {
            return q.T(playlistLink);
        }
        if (jnj.h(playlist.O)) {
            U = rsg0.T(yfb.x(this.f.d(playlist.b, playlist.c, str))).F(new f5y(new pyz(10), 7)).U(new iu4(new gzn(21), 24));
        } else {
            UserId userId = playlist.c;
            int i = playlist.b;
            String str2 = playlist.x;
            this.d.getClass();
            tfx tfxVar = new tfx("audio.followPlaylist", new pn(5), new mr(4));
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx.l(tfxVar, "playlist_id", i, 0, 0, 8);
            if (str2 != null) {
                tfx.o(tfxVar, "access_key", str2, 0, 0, 12);
            }
            if (str != null) {
                tfx.o(tfxVar, "ref", str, 0, 0, 12);
                tfxVar = tfxVar;
            }
            U = rsg0.T(yfb.x(tfxVar)).F(new d120(new q520(5), 3)).U(new pj4(new jz30(3), 29));
        }
        t520 t520Var = new t520(new q66(playlist, list, this, 4), 8);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(t520Var, lVar, kVar, kVar);
    }
}
