package com.vk.music.podcast.impl.ui.episode;

import com.vk.api.generated.podcasts.dto.PodcastsGetEpisodesOrderDto;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Episode;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.PodcastPage;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import io.reactivex.rxjava3.core.q;
import java.util.Locale;
import xsna.azt;
import xsna.b25;
import xsna.cfz;
import xsna.clb0;
import xsna.epx;
import xsna.f2u;
import xsna.fhb0;
import xsna.gb;
import xsna.ghb0;
import xsna.gm6;
import xsna.ha40;
import xsna.irt;
import xsna.ju;
import xsna.kmq;
import xsna.ktt;
import xsna.lrq;
import xsna.m3y;
import xsna.mh1;
import xsna.mzp0;
import xsna.nd50;
import xsna.nex;
import xsna.or50;
import xsna.pb;
import xsna.rsg0;
import xsna.t3v;
import xsna.u2b0;
import xsna.u750;
import xsna.uh40;
import xsna.uk40;
import xsna.vk40;
import xsna.wgb0;
import xsna.wx00;
import xsna.yfb;

/* compiled from: PodcastEpisodeScreenContract.kt */
/* loaded from: classes3.dex */
public final class b implements gm6, ghb0, c.l<VKList<MusicTrack>> {
    public final PodcastEpisodeFragment b;
    public final mzp0 c;
    public PodcastPage e;
    public c f;
    public int i;
    public MusicTrack.AssistantData j;
    public boolean k;
    public final u2b0 l;
    public final u750 m;
    public final nd50 n;
    public String d = "unknown";
    public UserId g = UserId.d;
    public String h = "recent";
    public final clb0 o = new clb0();

    public b(PodcastEpisodeFragment podcastEpisodeFragment, u2b0 u2b0Var, b25 b25Var, u750 u750Var, mzp0 mzp0Var) {
        this.b = podcastEpisodeFragment;
        this.c = mzp0Var;
        this.l = u2b0Var;
        this.m = u750Var;
        this.n = new nd50(u2b0Var, b25Var);
    }

    @Override // xsna.ghb0
    public final void C4(String str) {
        this.h = str;
    }

    @Override // xsna.ghb0
    public final nd50 D6() {
        return this.n;
    }

    @Override // xsna.ghb0
    public final void O0(MusicTrack musicTrack, FragmentImpl fragmentImpl) {
        PodcastEpisodeFragment.a aVar = new PodcastEpisodeFragment.a(musicTrack.c, musicTrack.b);
        aVar.y(musicTrack.I);
        aVar.A(n());
        aVar.z(this.d);
        aVar.j.putInt("state", 16);
        aVar.C(musicTrack.y);
        aVar.l(fragmentImpl);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b(MusicTrack musicTrack) {
        Episode episode = musicTrack.w;
        if (episode != null) {
            if (episode.c) {
                rsg0.y0(new lrq(musicTrack.c, musicTrack.b, n().t()), null, null, 3).subscribe(new nex(new gb(26, musicTrack, this), 12), new wx00(new ha40(this), 10));
            } else {
                rsg0.y0(new kmq(musicTrack.c, musicTrack.b, n().t(), null), null, null, 3).subscribe(new uk40(new ju(19, musicTrack, this), 8), new vk40(new azt(this, 16), 14));
            }
        }
    }

    @Override // xsna.ghb0
    public final void c(UserId userId) {
        this.g = userId;
    }

    @Override // xsna.ghb0
    public final String getOrder() {
        return this.h;
    }

    @Override // com.vk.lists.c.k
    public final q<VKList<MusicTrack>> hj(c cVar, boolean z) {
        mzp0 mzp0Var = this.c;
        if (mzp0Var != null) {
            mzp0Var.a();
        }
        return rsg0.y0(new ktt(this.g, this.i, n().Lb()), null, null, 3).U(new cfz(new or50(this, 10), 11));
    }

    @Override // xsna.ghb0
    public final MusicPlaybackLaunchContext n() {
        return (epx.f(this.d, "kids_section") ? MusicPlaybackLaunchContext.w : MusicPlaybackLaunchContext.v).Cb(this.d);
    }

    @Override // xsna.gm6
    public final void onStart() {
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.c = 10;
        PodcastEpisodeFragment podcastEpisodeFragment = this.b;
        hVar.f = new wgb0(podcastEpisodeFragment);
        RecyclerPaginatedView recyclerPaginatedView = podcastEpisodeFragment.U;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        this.f = f.a(hVar, recyclerPaginatedView);
    }

    @Override // xsna.ghb0
    public final UserId q() {
        return this.g;
    }

    @Override // xsna.ghb0
    public final u2b0 r() {
        return this.l;
    }

    @Override // com.vk.lists.c.l
    public final q<VKList<MusicTrack>> ui(int i, c cVar) {
        return rsg0.T(yfb.x(this.o.b(this.g, Integer.valueOf(cVar.k()), Integer.valueOf(cVar.i()), PodcastsGetEpisodesOrderDto.valueOf(this.h.toUpperCase(Locale.ROOT)), n().Lb()))).U(new pb(new t3v(11), 29)).U(new fhb0(new irt(12), 0)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<VKList<MusicTrack>> qVar, boolean z, c cVar) {
        this.b.eo(qVar.subscribe(new m3y(new mh1(z, this, cVar), 11), new f2u(new uh40(this, 10), 12)));
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
