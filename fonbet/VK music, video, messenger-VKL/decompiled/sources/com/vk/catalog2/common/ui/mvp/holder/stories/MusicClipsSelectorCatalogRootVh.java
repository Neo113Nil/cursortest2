package com.vk.catalog2.common.ui.mvp.holder.stories;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicVerticalListVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.clips.design.view.floatingbutton.FloatingButtonView;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.lists.c;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.bh6;
import xsna.c3b;
import xsna.cfp0;
import xsna.dhr0;
import xsna.epx;
import xsna.fch;
import xsna.fpf0;
import xsna.gf0;
import xsna.gko;
import xsna.h7m;
import xsna.h94;
import xsna.izs;
import xsna.jjc;
import xsna.kea;
import xsna.l7m;
import xsna.nle;
import xsna.per;
import xsna.pf40;
import xsna.pgn;
import xsna.ppk;
import xsna.qcy;
import xsna.rrr;
import xsna.s3q0;
import xsna.s77;
import xsna.srr;
import xsna.tlo0;
import xsna.tq;
import xsna.trr;
import xsna.u4a;
import xsna.vd7;
import xsna.vrr;
import xsna.vyh0;
import xsna.wia;
import xsna.ww;
import xsna.x5a;
import xsna.yia;
import xsna.z5a;

/* compiled from: MusicClipsSelectorCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class MusicClipsSelectorCatalogRootVh extends MusicSelectorCatalogRootVh {
    public static final a J;
    public static final /* synthetic */ qcy<Object>[] K;
    public final nle E;
    public final h7m F;
    public final SearchResultsImplVh G;
    public final pgn H;
    public ppk I;

    /* compiled from: MusicClipsSelectorCatalogRootVh.kt */
    public static final class a {
    }

    /* compiled from: MusicClipsSelectorCatalogRootVh.kt */
    public static final class b implements vrr {
        public final Thumb a;

        public b(Thumb thumb) {
            this.a = thumb;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Thumb thumb = this.a;
            if (thumb == null) {
                return 0;
            }
            return thumb.hashCode();
        }

        public final String toString() {
            return "ThumbViewParams(thumb=" + this.a + ')';
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(MusicClipsSelectorCatalogRootVh.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        K = new qcy[]{mutablePropertyReference1Impl};
        J = new a();
    }

    public MusicClipsSelectorCatalogRootVh() {
        throw null;
    }

    public MusicClipsSelectorCatalogRootVh(FragmentActivity fragmentActivity, yia yiaVar, Bundle bundle, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, MusicSelectorCatalogRootVh.a aVar, nle nleVar, l7m l7mVar) {
        super(fragmentActivity, yiaVar, bundle, musicRestrictionPopupDisplayer, aVar);
        this.E = nleVar;
        this.F = l7mVar;
        x5a x5aVar = new x5a(this.m.b.s.N(), null, 6);
        u4a u4aVar = this.m;
        wia N = N();
        J.getClass();
        u4a.a aVar2 = u4aVar.b;
        CatalogConfiguration catalogConfiguration = aVar2.s;
        kea keaVar = new kea(x5aVar, catalogConfiguration.K(u4aVar), u4aVar, new vd7(aVar2.e), false, null, null, false, null, null, null, null, null, false, null, 131008);
        this.G = new SearchResultsImplVh(x5aVar, keaVar, new ClipsMusicVerticalListVh(catalogConfiguration, new c.h((c.m) keaVar), keaVar, u4aVar, N), null, null, null, null, new SearchResultsVh.a(false, 111), null, 376);
        pgn pgnVar = new pgn();
        this.H = pgnVar;
        io.reactivex.rxjava3.disposables.c subscribe = bh6.m.subscribe(new gf0(new pf40(this, 0), 28));
        qcy<Object> qcyVar = K[0];
        pgnVar.b(subscribe);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        dhr0.a.getClass();
        this.b.setTheme(dhr0.u().c);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (getState() instanceof vyh0) {
            com.vk.catalog2.common.ui.holders.search.b.a(com.vk.catalog2.common.ui.holders.search.b.a, cfp0Var.a, cfp0Var.b, false, null, 16);
            return;
        }
        nle nleVar = this.E;
        if (nleVar == null || nleVar.b(cfp0Var)) {
            return;
        }
        super.S(cfp0Var);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View X = super.X(layoutInflater, viewGroup, null);
        ModernSearchView modernSearchView = this.A.b.k;
        if (modernSearchView != null) {
            modernSearchView.setDynamicIconsColoringEnabled(false);
        }
        return X;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        qcy<Object> qcyVar = K[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.H.b;
        if (cVar != null) {
            cVar.dispose();
        }
        super.Y();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh
    public final SearchResultsImplVh i0() {
        return this.G;
    }

    public final void k0(UIBlockMusicTrack uIBlockMusicTrack, AudioFromMusicCatalogInfo audioFromMusicCatalogInfo) {
        ppk ppkVar = this.I;
        if (ppkVar != null) {
            u4a u4aVar = this.m;
            if (u4aVar.b.i.y0(uIBlockMusicTrack.z) && u4aVar.b.i.h()) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ppkVar.findViewById(R.id.coordinator);
                if (coordinatorLayout != null) {
                    CoordinatorLayout coordinatorLayout2 = (CoordinatorLayout) ppkVar.findViewById(R.id.coordinator);
                    if (coordinatorLayout2 != null && coordinatorLayout2.findViewById(R.id.floating_use_current_track_btn) == null) {
                        Activity ownerActivity = ppkVar.getOwnerActivity();
                        LayoutInflater layoutInflater = ownerActivity != null ? ownerActivity.getLayoutInflater() : null;
                        View inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.catalog_music_select_music_use_track, (ViewGroup) coordinatorLayout2, false) : null;
                        FloatingButtonView floatingButtonView = inflate instanceof FloatingButtonView ? (FloatingButtonView) inflate : null;
                        if (floatingButtonView != null) {
                            floatingButtonView.setLeftMainPictureController(new fch(new per(14), new s77(this, 8)));
                        }
                        coordinatorLayout2.addView(inflate);
                    }
                    c3b c3bVar = new c3b(this, uIBlockMusicTrack, audioFromMusicCatalogInfo, 2);
                    z5a z5aVar = new z5a(19, this, ppkVar);
                    FloatingButtonView floatingButtonView2 = (FloatingButtonView) coordinatorLayout.findViewById(R.id.floating_use_current_track_btn);
                    jjc.g(floatingButtonView2, c3bVar);
                    floatingButtonView2.setLeft(new rrr.b(new b(uIBlockMusicTrack.z.Jb())));
                    floatingButtonView2.setMiddle(new srr.a(tq.h(tlo0.Companion, R.string.music_catalog_use_audio)));
                    floatingButtonView2.setRight(new trr.a(new gko(R.drawable.vk_icon_cancel_20), new ww(15, z5aVar, floatingButtonView2)));
                }
                ModernSearchView modernSearchView = this.A.b.k;
                if (modernSearchView != null) {
                    h94 h94Var = ModernSearchView.y;
                    modernSearchView.b(0L);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.mba
    public final void m(int i, UIBlock uIBlock, izs<? super Boolean, s3q0> izsVar) {
        if (i == R.id.bookmark_btn && (uIBlock instanceof UIBlockMusicTrack)) {
            MusicTrack musicTrack = ((UIBlockMusicTrack) uIBlock).z;
            MusicSelectorCatalogRootVh.a aVar = this.q;
            if (aVar != null) {
                aVar.e(musicTrack, izsVar);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh, com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.mba
    public final void q(int i, UIBlock uIBlock, Object obj) {
        if (uIBlock instanceof UIBlockMusicTrack) {
            AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = obj instanceof AudioFromMusicCatalogInfo ? (AudioFromMusicCatalogInfo) obj : null;
            if (i == R.id.floating_use_current_track_btn) {
                super.q(i, uIBlock, audioFromMusicCatalogInfo);
            } else {
                super.z(R.id.audio_play_pause_btn, uIBlock);
                k0((UIBlockMusicTrack) uIBlock, audioFromMusicCatalogInfo);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh, xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicTrack) {
            if (i == R.id.floating_use_current_track_btn) {
                super.q(i, uIBlock, null);
            } else {
                super.z(R.id.audio_play_pause_btn, uIBlock);
                k0((UIBlockMusicTrack) uIBlock, null);
            }
        }
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
