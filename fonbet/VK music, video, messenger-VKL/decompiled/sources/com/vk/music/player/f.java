package com.vk.music.player;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.music.player.AdvertisementInfo;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import xsna.i5s;

/* compiled from: TrackInfo.java */
/* loaded from: classes3.dex */
public final class f {
    public PlayerTrack c;
    public PlayerTrack d;
    public int[] e;
    public int[] f;
    public int[] g;
    public long[] h;
    public final int i;
    public final a.C1335a j;
    public String a = "none";
    public int b = 0;
    public int k = 0;

    public f(int i, a.C1335a c1335a) {
        this.i = i;
        this.j = c1335a;
        a(false);
    }

    public final void a(boolean z) {
        if (this.d == null || this.c != null) {
            this.d = this.c;
        }
        this.c = null;
        int i = this.i;
        if (!z) {
            this.e = new int[i];
            this.f = new int[i];
        }
        this.g = new int[i];
        this.h = new long[i];
    }

    public final Set<PlayerAction> b() {
        return this.j.h(this, this.k);
    }

    @Nullable
    public final AdvertisementInfo c() {
        AdvertisementInfo d = this.j.d(this.k);
        if (d != null) {
            d.b = e();
        }
        return d;
    }

    public final int d() {
        return this.g[this.k];
    }

    public final int e() {
        return this.e[this.k];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(fVar.c, this.c) && fVar.k == this.k) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public final MusicTrack f() {
        PlayerTrack playerTrack = this.c;
        if (playerTrack == null) {
            return null;
        }
        return playerTrack.b;
    }

    @Nullable
    public final PlayerTrack g() {
        return this.c;
    }

    public final int h() {
        return this.f[this.k];
    }

    public final int hashCode() {
        if (this.b == 0) {
            int i = (this.k + 31) * 31;
            PlayerTrack playerTrack = this.c;
            this.b = i + (playerTrack == null ? 0 : playerTrack.hashCode());
        }
        return this.b;
    }

    public final int i() {
        int i = this.e[this.k];
        if (i > 0) {
            return (int) ((this.f[r1] * 100) / i);
        }
        return 0;
    }

    @Nullable
    public final PlayerTrack j() {
        return this.d;
    }

    public final float k() {
        int i = this.e[this.k];
        return i > 0 ? this.f[r1] / i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean l(PlayerAction playerAction) {
        return this.j.h(this, this.k).contains(playerAction);
    }

    public final boolean m() {
        return this.c != null;
    }

    public final boolean n() {
        return this.j.e(this.k);
    }

    public final void o(AdvertisementInfo.Action action) {
        AdvertisementInfo.Action action2 = AdvertisementInfo.Action.VIEW;
        a.C1335a c1335a = this.j;
        if (action == action2) {
            c1335a.a();
        } else if (action == AdvertisementInfo.Action.CLICK) {
            c1335a.b();
        } else {
            c1335a.f();
        }
    }

    public final void p(int i, int i2) {
        AudioBookChapter audioBookChapter;
        int i3;
        Episode episode;
        this.f[i] = i2;
        if (i == 0 && m()) {
            PlayerTrack playerTrack = this.c;
            long j = i2;
            playerTrack.e = j;
            MusicTrack musicTrack = playerTrack.b;
            if (musicTrack.Vb() && (episode = musicTrack.w) != null) {
                episode.d = j;
                return;
            }
            if (!musicTrack.Mb() || (audioBookChapter = musicTrack.O) == null) {
                return;
            }
            int ceil = (int) Math.ceil(j / 1000);
            AudioBookFile audioBookFile = audioBookChapter.d;
            if (audioBookFile != null && ceil > (i3 = audioBookFile.c)) {
                ceil = i3;
            }
            audioBookChapter.e = ceil;
        }
    }

    public final void q(PlayerTrack playerTrack) {
        AudioBookChapter audioBookChapter;
        Episode episode;
        this.c = playerTrack;
        MusicTrack musicTrack = playerTrack.b;
        int i = (int) playerTrack.e;
        if (musicTrack.Vb() && (episode = musicTrack.w) != null) {
            i = (int) episode.d;
        } else if (musicTrack.Mb() && (audioBookChapter = musicTrack.O) != null) {
            AudioBookFile audioBookFile = audioBookChapter.d;
            i = (audioBookFile == null || audioBookChapter.e != audioBookFile.c) ? audioBookChapter.e * 1000 : 0;
        }
        p(0, i);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackInfo(adPosition=");
        sb.append(this.f[1]);
        sb.append(" contentPosition=");
        sb.append(this.f[0]);
        sb.append(" current=");
        return i5s.a(sb, this.k == 0 ? HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT : "ad", " )");
    }

    /* compiled from: TrackInfo.java */
    public interface a {
        void a();

        void b();

        String c(f fVar, int i);

        @Nullable
        AdvertisementInfo d(int i);

        boolean e(int i);

        void f();

        CharSequence g(f fVar, int i);

        @NonNull
        Set<PlayerAction> h(f fVar, int i);

        String i(f fVar, int i);

        /* compiled from: TrackInfo.java */
        /* renamed from: com.vk.music.player.f$a$a, reason: collision with other inner class name */
        public static class C1335a implements a {
            @Override // com.vk.music.player.f.a
            public String c(f fVar, int i) {
                return "";
            }

            @Override // com.vk.music.player.f.a
            @Nullable
            public AdvertisementInfo d(int i) {
                return null;
            }

            @Override // com.vk.music.player.f.a
            public boolean e(int i) {
                return true;
            }

            @Override // com.vk.music.player.f.a
            public CharSequence g(f fVar, int i) {
                return "";
            }

            @Override // com.vk.music.player.f.a
            @NonNull
            public Set<PlayerAction> h(f fVar, int i) {
                return Collections.EMPTY_SET;
            }

            @Override // com.vk.music.player.f.a
            public String i(f fVar, int i) {
                return "";
            }

            @Override // com.vk.music.player.f.a
            public void a() {
            }

            @Override // com.vk.music.player.f.a
            public void b() {
            }

            @Override // com.vk.music.player.f.a
            public void f() {
            }
        }
    }
}
