package com.vk.music.playlist.display.domain;

import android.text.Spanned;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.music.playlist.display.presentation.MusicPlaylistPaginationState;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.h9b0;
import xsna.kbb0;
import xsna.l050;
import xsna.sr;
import xsna.tr;
import xsna.vby;
import xsna.w050;
import xsna.yfn;
import xsna.yzt0;

/* compiled from: DisplayMusicPlaylistViewState.kt */
/* loaded from: classes3.dex */
public final class i implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: DisplayMusicPlaylistViewState.kt */
    public interface a extends fm50<yfn> {

        /* compiled from: DisplayMusicPlaylistViewState.kt */
        /* renamed from: com.vk.music.playlist.display.domain.i$a$a, reason: collision with other inner class name */
        public static final class C1350a implements a {
            public final yzt0<Boolean> a;
            public final yzt0<Boolean> b;
            public final yzt0<h9b0> c;
            public final yzt0<kbb0> d;
            public final yzt0<l050> e;
            public final yzt0<Spanned> f;
            public final yzt0<Integer> g;
            public final yzt0<w050> h;
            public final yzt0<Long> i;
            public final yzt0<MusicPlaylistPaginationState> j;
            public final yzt0<Boolean> k;
            public final yzt0<UIBlockList> l;
            public final yzt0<List<UIBlockPlaceholder>> m;
            public final yzt0<Boolean> n;

            public C1350a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12, h0u0 h0u0Var13, h0u0 h0u0Var14) {
                this.a = h0u0Var;
                this.b = h0u0Var2;
                this.c = h0u0Var3;
                this.d = h0u0Var4;
                this.e = h0u0Var5;
                this.f = h0u0Var6;
                this.g = h0u0Var7;
                this.h = h0u0Var8;
                this.i = h0u0Var9;
                this.j = h0u0Var10;
                this.k = h0u0Var11;
                this.l = h0u0Var12;
                this.m = h0u0Var13;
                this.n = h0u0Var14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1350a)) {
                    return false;
                }
                C1350a c1350a = (C1350a) obj;
                return epx.f(this.a, c1350a.a) && epx.f(this.b, c1350a.b) && epx.f(this.c, c1350a.c) && epx.f(this.d, c1350a.d) && epx.f(this.e, c1350a.e) && epx.f(this.f, c1350a.f) && epx.f(this.g, c1350a.g) && epx.f(this.h, c1350a.h) && epx.f(this.i, c1350a.i) && epx.f(this.j, c1350a.j) && epx.f(this.k, c1350a.k) && epx.f(this.l, c1350a.l) && epx.f(this.m, c1350a.m) && epx.f(this.n, c1350a.n);
            }

            public final int hashCode() {
                return this.n.hashCode() + sr.a(this.m, sr.a(this.l, sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(isRefreshing=");
                sb.append(this.a);
                sb.append(", hasActionsForBottomSheet=");
                sb.append(this.b);
                sb.append(", header=");
                sb.append(this.c);
                sb.append(", metadata=");
                sb.append(this.d);
                sb.append(", buttons=");
                sb.append(this.e);
                sb.append(", summary=");
                sb.append(this.f);
                sb.append(", tracksCount=");
                sb.append(this.g);
                sb.append(", items=");
                sb.append(this.h);
                sb.append(", duration=");
                sb.append(this.i);
                sb.append(", paginationState=");
                sb.append(this.j);
                sb.append(", hasAllItems=");
                sb.append(this.k);
                sb.append(", catalogBlock=");
                sb.append(this.l);
                sb.append(", albumBanners=");
                sb.append(this.m);
                sb.append(", isKidsLimitedPlaylist=");
                return tr.c(sb, this.n, ')');
            }
        }

        /* compiled from: DisplayMusicPlaylistViewState.kt */
        @vby
        public static final class b implements a {
            public final h0u0 a;

            public final boolean equals(Object obj) {
                if (obj instanceof b) {
                    return this.a.equals(((b) obj).a);
                }
                return false;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(errorData=" + this.a + ')';
            }
        }

        /* compiled from: DisplayMusicPlaylistViewState.kt */
        public static final class c implements a {
            public static final c a = new c();
        }
    }

    public i(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
