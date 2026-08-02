package com.vk.music.view.player.holders.tracklist;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.newtork.NetworkState;
import com.vk.core.utils.newtork.b;
import com.vk.dto.hints.HintId;
import com.vk.movika.sdk.base.ui.s0;
import com.vk.music.player.PlayerTrack;
import com.vk.music.view.player.holders.tracklist.MusicBigPlayerTrackListHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.f;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.v;
import io.reactivex.rxjava3.subjects.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asu0;
import xsna.bbw;
import xsna.bwt0;
import xsna.bz40;
import xsna.c07;
import xsna.c5g;
import xsna.cmy;
import xsna.dcn;
import xsna.f4m;
import xsna.fl30;
import xsna.hms;
import xsna.i630;
import xsna.iah0;
import xsna.izs;
import xsna.jsv;
import xsna.m0q0;
import xsna.mp3;
import xsna.ob40;
import xsna.oey;
import xsna.pla;
import xsna.qg3;
import xsna.rb40;
import xsna.s350;
import xsna.tsk;
import xsna.u2b0;
import xsna.ugp0;
import xsna.w6b0;
import xsna.w7u;
import xsna.wa5;
import xsna.whp0;
import xsna.x310;
import xsna.xhp0;
import xsna.yb40;

/* compiled from: MusicBigPlayerTrackListHolder.kt */
/* loaded from: classes3.dex */
public final class MusicBigPlayerTrackListHolder extends rb40 implements m0q0, cmy.a {
    public c A;
    public c B;
    public final w C;
    public final u2b0 n;
    public PlayerTrack o;
    public boolean p;
    public final Handler q;
    public dcn r;
    public final tsk s;
    public final TextView t;
    public final bz40 u;
    public final ob40 v;
    public final RecyclerView w;
    public final TextView x;
    public final s350 y;
    public final w6b0<?> z;

    /* compiled from: MusicBigPlayerTrackListHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<whp0, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(whp0 whp0Var) {
            return Boolean.valueOf(((List) this.receiver).contains(whp0Var));
        }
    }

    public MusicBigPlayerTrackListHolder(ViewGroup viewGroup, u2b0 u2b0Var, yb40 yb40Var, c07 c07Var, com.vk.music.podcast.api.di.a aVar) {
        super(R.layout.music_player_fr_playlist, viewGroup);
        this.n = u2b0Var;
        if (!com.vk.core.apps.a.b()) {
            f4m.y(iah0.a(32), this.itemView);
        }
        this.q = new Handler(Looper.getMainLooper());
        this.s = new tsk(this, 3);
        TextView textView = (TextView) this.itemView.findViewById(R.id.tv_create_playlist);
        bwt0.h0(yb40Var, textView);
        this.t = textView;
        bz40 bz40Var = new bz40(u2b0Var, yb40Var, aVar, new wa5(this, 7));
        this.u = bz40Var;
        ob40 ob40Var = new ob40(u2b0Var);
        this.v = ob40Var;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycle);
        recyclerView.setAdapter(bz40Var);
        this.itemView.getContext();
        MusicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1 musicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1 = new MusicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1();
        musicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1.setItemPrefetchEnabled(false);
        recyclerView.setLayoutManager(musicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1);
        recyclerView.setItemAnimator(null);
        new r(ob40Var).l(recyclerView);
        cmy cmyVar = new cmy(musicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1, 15);
        cmyVar.e = this;
        recyclerView.addOnScrollListener(cmyVar);
        this.w = recyclerView;
        this.x = (TextView) this.itemView.findViewById(R.id.player_tracklist_title);
        this.y = new s350(recyclerView, null, 6);
        this.z = new w6b0<>(recyclerView, u2b0Var, bz40Var, new qg3(3));
        a.m mVar = io.reactivex.rxjava3.internal.functions.a.b;
        this.A = new f(mVar);
        this.B = new f(mVar);
        this.C = asu0.a.A(1, "vk-music-big-player-track");
    }

    @Override // xsna.cmy.a
    public final void I2() {
        this.n.I0();
    }

    @Override // xsna.se50
    public final void a6() {
        b.a.getClass();
        d<NetworkState> dVar = b.e;
        dVar.getClass();
        this.A = new i0(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).U(new i630(new w7u(this, 17), 1)), new x310(new oey(9), 3)).r0(this.C).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new jsv(new bbw(this, 13), 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.se50
    public final void b6(com.vk.music.player.domain.state.a aVar) {
        com.vk.music.player.domain.state.a aVar2;
        com.vk.music.player.domain.state.a aVar3 = aVar;
        com.vk.music.player.domain.state.a aVar4 = (com.vk.music.player.domain.state.a) this.l;
        tsk tskVar = this.s;
        Handler handler = this.q;
        if (aVar4 == null || aVar4.j) {
            handler.removeCallbacks(tskVar);
            dcn dcnVar = this.r;
            if (dcnVar != null) {
                dcnVar.dismiss();
            }
        }
        String id = HintId.INFO_BUBBLE_CREATE_PLAYLIST_FROM_PLAYER.getId();
        if (bwt0.K(this.t) && pla.e().b().a(id) && (aVar2 = (com.vk.music.player.domain.state.a) this.l) != null && !aVar2.j && !this.p) {
            this.p = true;
            handler.postDelayed(tskVar, 500L);
        }
        if (aVar3.e == null) {
            return;
        }
        List<PlayerTrack> list = aVar3.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xhp0((PlayerTrack) it.next()));
        }
        final ArrayList arrayList2 = new ArrayList(arrayList);
        this.B = new o(new v(new Callable() { // from class: xsna.ac40
            /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
            
                if (r0.v.k != false) goto L18;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                MusicBigPlayerTrackListHolder musicBigPlayerTrackListHolder = MusicBigPlayerTrackListHolder.this;
                ArrayList arrayList3 = (ArrayList) musicBigPlayerTrackListHolder.u.y0();
                int size = arrayList3.size();
                ArrayList arrayList4 = arrayList2;
                boolean z = false;
                if (size == arrayList4.size()) {
                    Iterator it2 = arrayList3.iterator();
                    int i = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            e43.t();
                            throw null;
                        }
                        if (epx.f((whp0) next, arrayList4.get(i))) {
                            i = i2;
                        }
                    }
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
        }), new fl30(new s0(18, this, arrayList2), 3)).q(this.C).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new hms(new mp3(18, this, aVar3), 13));
    }

    @Override // xsna.se50
    public final void h6() {
        this.A.dispose();
        this.B.dispose();
    }

    public final void m6(com.vk.music.player.domain.state.a aVar) {
        if (aVar.j) {
            RecyclerView recyclerView = this.w;
            Object layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.K(this.n.k(), 0);
            }
        }
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_PLAYER_TRACK_LIST;
    }

    @Override // xsna.rb40
    public final void l6(ugp0 ugp0Var) {
    }
}
