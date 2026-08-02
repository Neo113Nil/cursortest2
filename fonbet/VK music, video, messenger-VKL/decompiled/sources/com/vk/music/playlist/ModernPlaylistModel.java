package com.vk.music.playlist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceSourceDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.PlaylistLink;
import com.vk.music.common.MusicPlaybackLaunchContext;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.observable.o1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import ru.ok.gl.tf.Tensorflow;
import xsna.abo;
import xsna.ac20;
import xsna.b8v;
import xsna.bpn0;
import xsna.bqt;
import xsna.bt;
import xsna.c2u;
import xsna.cfz;
import xsna.e4t;
import xsna.eiz;
import xsna.eml;
import xsna.epx;
import xsna.eq;
import xsna.gv;
import xsna.h2s;
import xsna.hx4;
import xsna.i630;
import xsna.i80;
import xsna.j5g;
import xsna.j630;
import xsna.j7;
import xsna.jnj;
import xsna.jr3;
import xsna.k220;
import xsna.kdn;
import xsna.kf3;
import xsna.m330;
import xsna.m3y;
import xsna.ms9;
import xsna.n3t;
import xsna.nb;
import xsna.np5;
import xsna.o010;
import xsna.o7;
import xsna.ozl;
import xsna.qs2;
import xsna.qxi;
import xsna.ro4;
import xsna.rsg0;
import xsna.rt0;
import xsna.s7;
import xsna.shy;
import xsna.sm4;
import xsna.svz;
import xsna.t750;
import xsna.wmi0;
import xsna.wq20;
import xsna.xb20;
import xsna.xpd;
import xsna.y8m;
import xsna.yfb;
import xsna.z410;
import xsna.zcl;
import xsna.zq3;

/* compiled from: ModernPlaylistModel.kt */
/* loaded from: classes3.dex */
public class ModernPlaylistModel implements i80 {
    public final String b;
    public final eml c;
    public final abo d;
    public final String e;
    public final qxi f;
    public final bpn0 g;
    public volatile PlaylistModelData h;

    /* compiled from: ModernPlaylistModel.kt */
    public static final class PlaylistModelData extends Serializer.StreamParcelableAdapter {
        public static final Serializer.c<PlaylistModelData> CREATOR = new a();
        public final UserId b;
        public final int c;
        public final String d;
        public final Playlist e;
        public final List<String> f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<PlaylistModelData> {
            @Override // com.vk.core.serialize.Serializer.c
            public final PlaylistModelData a(Serializer serializer) {
                return new PlaylistModelData(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaylistModelData[i];
            }
        }

        public /* synthetic */ PlaylistModelData(UserId userId, int i, String str, Playlist playlist, List list, int i2, zcl zclVar) {
            this(userId, i, str, (i2 & 8) != 0 ? null : playlist, (i2 & 16) != 0 ? null : list);
        }

        public static PlaylistModelData zb(PlaylistModelData playlistModelData, UserId userId, int i, String str, Playlist playlist, List list, int i2) {
            if ((i2 & 1) != 0) {
                userId = playlistModelData.b;
            }
            UserId userId2 = userId;
            if ((i2 & 2) != 0) {
                i = playlistModelData.c;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str = playlistModelData.d;
            }
            String str2 = str;
            if ((i2 & 16) != 0) {
                list = playlistModelData.f;
            }
            playlistModelData.getClass();
            return new PlaylistModelData(userId2, i3, str2, playlist, list);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.e0(this.b);
            serializer.S(this.c);
            serializer.j0(this.d);
            serializer.i0(this.e);
            serializer.l0(this.f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlaylistModelData)) {
                return false;
            }
            PlaylistModelData playlistModelData = (PlaylistModelData) obj;
            return epx.f(this.b, playlistModelData.b) && this.c == playlistModelData.c && epx.f(this.d, playlistModelData.d) && epx.f(this.e, playlistModelData.e) && epx.f(this.f, playlistModelData.f);
        }

        public final int hashCode() {
            int a2 = shy.a(this.c, Long.hashCode(this.b.b) * 31, 31);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            Playlist playlist = this.e;
            int hashCode2 = (hashCode + (playlist == null ? 0 : playlist.hashCode())) * 31;
            List<String> list = this.f;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaylistModelData(ownerId=");
            sb.append(this.b);
            sb.append(", playlistId=");
            sb.append(this.c);
            sb.append(", accessKey=");
            sb.append(this.d);
            sb.append(", loadedPlaylist=");
            sb.append(this.e);
            sb.append(", audioIds=");
            return ms9.a(')', sb, this.f);
        }

        public PlaylistModelData(UserId userId, int i, String str, Playlist playlist, List<String> list) {
            this.b = userId;
            this.c = i;
            this.d = str;
            this.e = playlist;
            this.f = list;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public PlaylistModelData(Serializer serializer) {
            this(r2, r3, r4, r5, r8 != null ? j5g.V(r8) : null);
            UserId userId = (UserId) serializer.A(UserId.class.getClassLoader());
            int u = serializer.u();
            String H = serializer.H();
            Playlist playlist = (Playlist) serializer.G(Playlist.class.getClassLoader());
            ArrayList<String> h = serializer.h();
        }
    }

    public ModernPlaylistModel() {
        throw null;
    }

    public ModernPlaylistModel(Class cls, eml emlVar, abo aboVar, int i, UserId userId, String str) {
        this(cls.getCanonicalName(), emlVar, aboVar, i, userId, str, null, Tensorflow.FRAME_HEIGHT);
    }

    public static boolean E(Playlist playlist) {
        return (playlist != null ? playlist.g : null) != null;
    }

    public static void M(ModernPlaylistModel modernPlaylistModel, Playlist playlist, List list, int i) {
        if ((i & 1) != 0) {
            playlist = modernPlaylistModel.h.e;
        }
        Playlist playlist2 = playlist;
        if ((i & 2) != 0) {
            list = modernPlaylistModel.h.f;
        }
        List list2 = list;
        synchronized (modernPlaylistModel) {
            modernPlaylistModel.h = PlaylistModelData.zb(modernPlaylistModel.h, null, 0, null, playlist2, list2, 7);
        }
    }

    public static j1 y(Playlist playlist) {
        m1 y0 = rsg0.y0(new sm4(playlist.b, playlist.c), null, null, 3);
        b8v b8vVar = new b8v(new h2s(playlist, 18), 6);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(b8vVar, lVar, kVar, kVar).U(new ac20(new eiz(playlist, 8), 2));
    }

    public final String D() {
        return this.h.d;
    }

    public q F(MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        t E;
        int i = 4;
        if (30 <= 30) {
            return G(30, musicPlaybackLaunchContext).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new eq(new k220(i), 24));
        }
        byte b = 0;
        q G = G(0, musicPlaybackLaunchContext);
        List<String> list = this.h.f;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                E = q.T(list);
                q<R> L = q.I0(G, E, new bt(new xpd(b, 5))).U(new j7(new bqt(8), 29)).L(new i630(new np5(15, this, musicPlaybackLaunchContext), b), false);
                int i2 = 22;
                return new o1(L.U(new rt0(new a(this), i2)), new o7(new b(this), i2)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
            }
        }
        hx4 hx4Var = (hx4) this.g.getValue();
        AudioGetIdsBySourceSourceDto audioGetIdsBySourceSourceDto = AudioGetIdsBySourceSourceDto.PLAYLIST;
        Set<Integer> set = Playlist.P;
        j1 U = rsg0.T(yfb.x(hx4Var.e(audioGetIdsBySourceSourceDto, Playlist.a.b(this.h.c, this.h.b, this.h.d), musicPlaybackLaunchContext.Lb()))).U(new cfz(new y8m(14), i));
        m3y m3yVar = new m3y(new wq20(this, 2), 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        E = U.E(m3yVar, lVar, kVar, kVar);
        q<R> L2 = q.I0(G, E, new bt(new xpd(b, 5))).U(new j7(new bqt(8), 29)).L(new i630(new np5(15, this, musicPlaybackLaunchContext), b), false);
        int i22 = 22;
        return new o1(L2.U(new rt0(new a(this), i22)), new o7(new b(this), i22)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    public final q G(int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        Playlist playlist = this.h.e;
        if (playlist != null) {
            if (playlist.y.size() < i) {
                playlist = null;
            }
            if (playlist != null) {
                return q.T(playlist);
            }
        }
        hx4 hx4Var = (hx4) this.g.getValue();
        UserId userId = this.h.b;
        int i2 = this.h.c;
        String str = this.h.d;
        String Lb = musicPlaybackLaunchContext.Lb();
        if (i > 30) {
            i = 30;
        }
        j1 U = new o1(rsg0.T(yfb.x(hx4.x(hx4Var, userId, i2, str, Integer.valueOf(i), Lb, 12))).U(new nb(new svz(5), 23)), new gv(new e(this), 28)).U(new kf3(new kdn(this, 24), 26));
        m330 m330Var = new m330(new o010(this, 5), 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return U.E(m330Var, lVar, kVar, kVar);
    }

    @ozl
    public final q<Pair<Playlist, PlaylistLink>> J(Playlist playlist, t750 t750Var) {
        q y0;
        boolean E = E(playlist);
        qxi qxiVar = this.f;
        if (E) {
            PlaylistLink playlistLink = playlist.g;
            Integer valueOf = playlistLink != null ? Integer.valueOf(playlistLink.b) : null;
            PlaylistLink playlistLink2 = playlist.g;
            UserId userId = playlistLink2 != null ? playlistLink2.c : null;
            if (valueOf == null || userId == null) {
                return g0.b;
            }
            return (jnj.h(playlist.O) ? rsg0.y0(yfb.x(qxiVar.f(valueOf.intValue(), userId, t750Var.t())), null, null, 3) : rsg0.y0(new sm4(valueOf.intValue(), userId), null, null, 3)).U(new j630(new f(playlist, this), 0));
        }
        if (jnj.h(playlist.O)) {
            y0 = rsg0.y0(yfb.x(qxiVar.d(playlist.b, playlist.c, t750Var.t())), null, null, 3).U(new e4t(new z410(4), 5));
        } else {
            int i = playlist.b;
            UserId userId2 = playlist.c;
            String str = playlist.x;
            String t = t750Var.t();
            ro4 ro4Var = new ro4("audio.followPlaylist");
            ro4Var.C(i, "playlist_id");
            ro4Var.F(userId2, "owner_id");
            ro4Var.K("ref", t);
            if (str != null) {
                ro4Var.K("access_key", str);
            }
            y0 = rsg0.y0(ro4Var, null, null, 3);
        }
        n3t n3tVar = new n3t(new c(playlist, this), 10);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return y0.E(n3tVar, lVar, kVar, kVar).U(new s7(new c2u(playlist, 15), 21)).L(new xb20(new jr3(26), 2), false);
    }

    public final Playlist Z0() {
        return this.h.e;
    }

    @Override // xsna.i80
    public final Bundle e() {
        wmi0.a.a(this.b, this.h);
        return Bundle.EMPTY;
    }

    @Override // xsna.i80
    @SuppressLint({"CheckResult"})
    public final void u(Bundle bundle) {
        wmi0.a.i(this.b, true).subscribe(new qs2(new d(this), 25));
    }

    public ModernPlaylistModel(Playlist playlist, String str, eml emlVar, abo aboVar) {
        this(str, emlVar, aboVar, playlist.b, playlist.c, playlist.x, playlist, 896);
    }

    public ModernPlaylistModel(String str, eml emlVar, abo aboVar, int i, UserId userId, String str2, Playlist playlist, int i2) {
        Playlist playlist2 = (i2 & 64) != 0 ? null : playlist;
        qxi qxiVar = new qxi();
        bpn0 bpn0Var = new bpn0(new zq3(20));
        this.b = str;
        this.c = emlVar;
        this.d = aboVar;
        this.e = null;
        this.f = qxiVar;
        this.g = bpn0Var;
        this.h = new PlaylistModelData(userId, i, str2, playlist2, null, 16, null);
    }

    @Override // xsna.i80
    public final void G1() {
    }

    @Override // xsna.i80
    public final void release() {
    }
}
