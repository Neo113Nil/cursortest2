package com.vk.libvideo.bottomsheet.about.delegate;

import android.view.ViewGroup;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.ui.EpisodeRedesignButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c4;
import xsna.hfz;
import xsna.p1u0;
import xsna.vfz;

/* compiled from: AboutVideoEpisodeRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class k extends p1u0<AboutVideoItem.m> {
    public final c4 a;

    /* compiled from: AboutVideoEpisodeRedesignDelegate.kt */
    public final class a extends vfz<AboutVideoItem.m> {
        public final c4 l;
        public final EpisodeRedesignButton m;

        public a(ViewGroup viewGroup, c4 c4Var) {
            super(bwt0.I(R.layout.video_about_episode_redesign, viewGroup, false));
            this.l = c4Var;
            EpisodeRedesignButton episodeRedesignButton = (EpisodeRedesignButton) this.itemView.findViewById(R.id.episode);
            episodeRedesignButton.setTag("episode_button");
            this.m = episodeRedesignButton;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void h6(AboutVideoItem.m mVar) {
            AboutVideoItem.m mVar2 = mVar;
            int i = mVar2.b;
            String str = mVar2.c;
            EpisodeRedesignButton episodeRedesignButton = this.m;
            episodeRedesignButton.u.setText(episodeRedesignButton.getResources().getQuantityString(R.plurals.video_episodes_count, i, Integer.valueOf(i)));
            episodeRedesignButton.t.setText(str);
            bwt0.i0(episodeRedesignButton, new com.vk.movika.sdk.base.logic.interactor.e(this, 1));
        }
    }

    public k(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.m> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.m;
    }
}
