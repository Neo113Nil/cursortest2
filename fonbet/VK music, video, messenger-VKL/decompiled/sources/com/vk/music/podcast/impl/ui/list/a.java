package com.vk.music.podcast.impl.ui.list;

import com.vk.api.generated.podcasts.dto.PodcastsGetEpisodesOrderDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import io.reactivex.rxjava3.core.q;
import java.util.Locale;
import xsna.b25;
import xsna.clb0;
import xsna.d750;
import xsna.dl70;
import xsna.ghb0;
import xsna.ie90;
import xsna.jtt;
import xsna.jz30;
import xsna.lxz;
import xsna.mzp0;
import xsna.nd50;
import xsna.ox80;
import xsna.qj4;
import xsna.r7a0;
import xsna.rj4;
import xsna.rsg0;
import xsna.sh3;
import xsna.u2b0;
import xsna.u750;
import xsna.y510;
import xsna.yfb;
import xsna.z8;

/* compiled from: PodcastEpisodesListScreenContract.kt */
/* loaded from: classes3.dex */
public final class a implements ghb0, c.l<VKList<MusicTrack>> {
    public final mzp0 b;
    public final PodcastEpisodesListFragment c;
    public final u2b0 e;
    public final u750 f;
    public final nd50 g;
    public final clb0 d = new clb0();
    public final MusicPlaybackLaunchContext h = MusicPlaybackLaunchContext.x;
    public UserId i = UserId.d;
    public String j = "recent";

    public a(mzp0 mzp0Var, PodcastEpisodesListFragment podcastEpisodesListFragment, u2b0 u2b0Var, b25 b25Var, u750 u750Var) {
        this.b = mzp0Var;
        this.c = podcastEpisodesListFragment;
        this.e = u2b0Var;
        this.f = u750Var;
        this.g = new nd50(u2b0Var, b25Var);
    }

    @Override // xsna.ghb0
    public final void C4(String str) {
        this.j = str;
    }

    @Override // xsna.ghb0
    public final nd50 D6() {
        return this.g;
    }

    @Override // xsna.ghb0
    public final void O0(MusicTrack musicTrack, FragmentImpl fragmentImpl) {
        PodcastEpisodeFragment.a aVar = new PodcastEpisodeFragment.a(musicTrack.c, musicTrack.b);
        aVar.A(this.h);
        aVar.j.putInt("state", 16);
        aVar.C(musicTrack.y);
        aVar.l(fragmentImpl);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.ghb0
    public final void c(UserId userId) {
        this.i = userId;
    }

    @Override // xsna.ghb0
    public final String getOrder() {
        return this.j;
    }

    @Override // com.vk.lists.c.k
    public final q<VKList<MusicTrack>> hj(c cVar, boolean z) {
        mzp0 mzp0Var = this.b;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        cVar.r(true);
        return rsg0.y0(new jtt(cVar.k(), this.i, this.j), null, null, 3).F(new ox80(new ie90(this, 5), 2)).U(new z8(new lxz(this, 19), 24));
    }

    @Override // xsna.ghb0
    public final MusicPlaybackLaunchContext n() {
        return this.h;
    }

    @Override // xsna.gm6
    public final void onStart() {
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.c = 10;
        RecyclerPaginatedView recyclerPaginatedView = this.c.T;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        f.a(hVar, recyclerPaginatedView);
    }

    @Override // xsna.ghb0
    public final UserId q() {
        return this.i;
    }

    @Override // xsna.ghb0
    public final u2b0 r() {
        return this.e;
    }

    @Override // com.vk.lists.c.l
    public final q<VKList<MusicTrack>> ui(int i, c cVar) {
        return rsg0.T(yfb.x(this.d.b(this.i, Integer.valueOf(cVar.k()), Integer.valueOf(i), PodcastsGetEpisodesOrderDto.valueOf(this.j.toUpperCase(Locale.ROOT)), this.h.t()))).U(new qj4(new jz30(7), 26)).U(new rj4(new y510(13), 28)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<VKList<MusicTrack>> qVar, boolean z, c cVar) {
        this.c.eo(qVar.subscribe(new r7a0(new sh3(25, this, cVar), 2), new d750(new dl70(this), 3)));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
