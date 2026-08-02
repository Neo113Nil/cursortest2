package com.vk.catalog2.common.ui.mvp.holder.stories;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.core.design.tools.view.BannersFrameLayout;
import com.vk.catalog2.common.ui.holders.DimOverlayVh;
import com.vk.catalog2.common.ui.holders.ErrorStateVh;
import com.vk.catalog2.common.ui.holders.ProgressVh;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.CatalogLongButtonBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.header.SearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.header.VkSlidableSearchQueryVh;
import com.vk.catalog2.common.ui.mvp.holder.search.SearchResultsImplVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.view.search.ModernSearchView;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlaySingleTrackSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.alj;
import xsna.b0u0;
import xsna.b5a;
import xsna.bnn0;
import xsna.bwt0;
import xsna.d3m;
import xsna.dml;
import xsna.e420;
import xsna.epx;
import xsna.f4m;
import xsna.f5z;
import xsna.g3a;
import xsna.iut0;
import xsna.izs;
import xsna.j5g;
import xsna.kb40;
import xsna.lqk0;
import xsna.ltz;
import xsna.n0q0;
import xsna.n7w;
import xsna.nda;
import xsna.nuv;
import xsna.qpk;
import xsna.rkt;
import xsna.s3q0;
import xsna.sl30;
import xsna.swp;
import xsna.tw3;
import xsna.u0a;
import xsna.u2b0;
import xsna.u4a;
import xsna.vyh0;
import xsna.wp40;
import xsna.y8g0;
import xsna.yia;
import xsna.z5;
import xsna.zl20;

/* compiled from: MusicSelectorCatalogRootVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicSelectorCatalogRootVh extends CatalogRootViewHolder implements SwitchCatalogVh.b, CatalogStatesViewHolder, qpk.a, n0q0 {
    public static boolean C;
    public static a D;
    public final VkSlidableSearchQueryVh A;
    public SwitchCatalogVh B;
    public final MusicRestrictionPopupDisplayer p;
    public final a q;
    public final boolean r;
    public final g3a s;
    public final TabsOrListVh t;
    public final CatalogLongButtonBannerVh u;
    public final DimOverlayVh v;
    public final ErrorStateVh w;
    public final ProgressVh x;
    public boolean y;
    public final SearchQueryVh z;

    /* compiled from: MusicSelectorCatalogRootVh.kt */
    public interface a {
        void a(boolean z);

        void b(MusicTrack musicTrack, AudioFromMusicCatalogInfo audioFromMusicCatalogInfo);

        void c();

        void d();

        void e(MusicTrack musicTrack, izs<? super Boolean, s3q0> izsVar);

        void f(MusicTrack musicTrack);
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ BannersFrameLayout b;

        public b(BannersFrameLayout bannersFrameLayout) {
            this.b = bannersFrameLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            bwt0.f0(this.b, y8g0.a(R.dimen.clips_music_extraction_banner_padding), 0, y8g0.a(R.dimen.clips_music_extraction_banner_padding), 0, 10);
        }
    }

    public MusicSelectorCatalogRootVh(FragmentActivity fragmentActivity, yia yiaVar, Bundle bundle, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, a aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) yiaVar, false, (f5z) null, 112);
        this.p = musicRestrictionPopupDisplayer;
        this.q = aVar;
        this.r = true;
        u4a u4aVar = this.m;
        g3a S = u4aVar.b.s.S(u4aVar, null);
        this.s = S;
        TabsOrListVh tabsOrListVh = new TabsOrListVh(this.m, null, 0, null, false, S, N(), null, null, null, false, null, 261372);
        this.t = tabsOrListVh;
        this.u = null;
        this.v = new DimOverlayVh(tabsOrListVh);
        MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh = (MusicClipsSelectorCatalogRootVh) this;
        this.w = new ErrorStateVh(this, new wp40(musicClipsSelectorCatalogRootVh, 1));
        this.x = new ProgressVh((Object) null);
        D = aVar;
        C = bundle.getBoolean("need_clips_audio_from_video");
        dml dmlVar = new dml(new z5(musicClipsSelectorCatalogRootVh, 4), null, new kb40(musicClipsSelectorCatalogRootVh, 4), null, null, 0L, 58);
        n7w n7wVar = new n7w(musicClipsSelectorCatalogRootVh, 11);
        nuv nuvVar = new nuv(musicClipsSelectorCatalogRootVh, 14);
        SearchQueryVh searchQueryVh = new SearchQueryVh(R.string.search, n7wVar, nuvVar, null, dmlVar, 96);
        this.z = searchQueryVh;
        this.A = new VkSlidableSearchQueryVh(searchQueryVh);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return false;
    }

    @Override // xsna.qpk.a
    public final void C(float f) {
        ImageView imageView;
        ImageView imageView2;
        VkSlidableSearchQueryVh vkSlidableSearchQueryVh = this.A;
        int i = vkSlidableSearchQueryVh.i;
        float f2 = 1;
        float f3 = f2 - 0.9f;
        float f4 = ((f3 / 3) * 2) + 0.9f;
        float f5 = (f - 0.9f) / f3;
        if (f < f4 && (imageView2 = vkSlidableSearchQueryVh.c) != null) {
            imageView2.setScaleX(0.6f);
            imageView2.setScaleY(0.6f);
            imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            imageView2.setVisibility(8);
        }
        if (f < 0.9f) {
            FrameLayout frameLayout = vkSlidableSearchQueryVh.d;
            if (frameLayout != null) {
                f4m.s(i, frameLayout);
                return;
            }
            return;
        }
        float f6 = (f - f4) / (f2 - f4);
        if (f6 >= 0.6f && (imageView = vkSlidableSearchQueryVh.c) != null) {
            imageView.setScaleX(f6);
            imageView.setScaleY(f6);
        }
        ImageView imageView3 = vkSlidableSearchQueryVh.c;
        if (imageView3 != null) {
            imageView3.setAlpha(f6);
            imageView3.setVisibility(f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 8);
        }
        FrameLayout frameLayout2 = vkSlidableSearchQueryVh.d;
        if (frameLayout2 != null) {
            int i2 = (int) (vkSlidableSearchQueryVh.h * f5);
            if (i2 >= i) {
                i = i2;
            }
            f4m.s(i, frameLayout2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0077, code lost:
    
        if (r2 == null) goto L41;
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        Object obj;
        Object obj2;
        s3q0 s3q0Var;
        if ((uIBlock instanceof UIBlockCatalog) && C && !this.r) {
            UIBlockCatalog uIBlockCatalog = (UIBlockCatalog) uIBlock;
            Iterator it = j5g.u0(uIBlockCatalog.z.y, uIBlockCatalog.y.y).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                UIBlock uIBlock2 = (UIBlock) obj;
                if ((uIBlock2 instanceof UIBlockList) && uIBlock2.d == CatalogViewType.BANNER) {
                    break;
                }
            }
            UIBlock uIBlock3 = (UIBlock) obj;
            CatalogLongButtonBannerVh catalogLongButtonBannerVh = this.u;
            if (uIBlock3 != null) {
                UIBlockList uIBlockList = uIBlock3 instanceof UIBlockList ? (UIBlockList) uIBlock3 : null;
                if (uIBlockList == null) {
                    return;
                }
                Iterator<T> it2 = uIBlockList.y.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((UIBlock) obj2) instanceof UIBlockPlaceholder) {
                            break;
                        }
                    }
                }
                UIBlock uIBlock4 = (UIBlock) obj2;
                if (uIBlock4 == null) {
                    return;
                }
                if (catalogLongButtonBannerVh != null) {
                    catalogLongButtonBannerVh.N6(uIBlock4);
                }
                if (catalogLongButtonBannerVh != null) {
                    catalogLongButtonBannerVh.a(true);
                    s3q0Var = s3q0.a;
                } else {
                    s3q0Var = null;
                }
            }
            if (catalogLongButtonBannerVh != null) {
                catalogLongButtonBannerVh.a(false);
            }
        }
        SwitchCatalogVh switchCatalogVh = this.B;
        (switchCatalogVh != null ? switchCatalogVh : null).N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        boolean z;
        ModernSearchView modernSearchView = this.A.b.k;
        if (modernSearchView != null) {
            modernSearchView.b(50L);
        }
        SwitchCatalogVh switchCatalogVh = this.B;
        if (switchCatalogVh == null) {
            switchCatalogVh = null;
        }
        if (epx.f(switchCatalogVh.r, vyh0.a)) {
            i8(alj.a);
            z = true;
        } else {
            z = false;
        }
        DimOverlayVh dimOverlayVh = this.v;
        if (f4m.h(dimOverlayVh.c)) {
            d3m.e(dimOverlayVh.c, (r15 & 1) != 0 ? 300L : 300L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            CatalogLongButtonBannerVh catalogLongButtonBannerVh = this.u;
            if (catalogLongButtonBannerVh != null) {
                catalogLongButtonBannerVh.a(true);
            }
            z = true;
        }
        return z;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        this.B = new SwitchCatalogVh(this.v, i0(), this.w, this.x, this, 0, this, null, false, false, null, 1952);
        View inflate = layoutInflater.inflate(R.layout.catalog_stories_music_selector, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        boolean z = this.r;
        VkSlidableSearchQueryVh vkSlidableSearchQueryVh = this.A;
        if (z) {
            viewGroup2.setBackgroundResource(R.drawable.catalog_bg_top_view_bottom_sheet);
            View k5 = vkSlidableSearchQueryVh.k5(layoutInflater, viewGroup2, null);
            f4m.t(y8g0.a(R.dimen.clips_music_search_top_margin), k5);
            viewGroup2.addView(k5);
        } else if (C) {
            View k52 = vkSlidableSearchQueryVh.k5(layoutInflater, viewGroup2, null);
            bwt0.f0(k52, 0, y8g0.a(R.dimen.clips_music_search_top_margin), 0, y8g0.a(R.dimen.clips_music_search_bottom_margin), 5);
            viewGroup2.addView(k52);
            CatalogLongButtonBannerVh catalogLongButtonBannerVh = this.u;
            if (catalogLongButtonBannerVh != null) {
                catalogLongButtonBannerVh.n = new rkt(this, 13);
                view = catalogLongButtonBannerVh.k5(layoutInflater, viewGroup2, null);
                view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (view.isLaidOut()) {
                    bwt0.f0(view, y8g0.a(R.dimen.clips_music_extraction_banner_padding), 0, y8g0.a(R.dimen.clips_music_extraction_banner_padding), 0, 10);
                } else {
                    view.addOnLayoutChangeListener(new b((BannersFrameLayout) view));
                }
            } else {
                view = null;
            }
            viewGroup2.addView(view);
        } else {
            viewGroup2.addView(vkSlidableSearchQueryVh.k5(layoutInflater, viewGroup2, null));
        }
        SwitchCatalogVh switchCatalogVh = this.B;
        if (switchCatalogVh == null) {
            switchCatalogVh = null;
        }
        View k53 = switchCatalogVh.k5(layoutInflater, viewGroup2, null);
        k53.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        viewGroup2.addView(k53);
        this.z.y8();
        ModernSearchView modernSearchView = vkSlidableSearchQueryVh.b.k;
        if (modernSearchView != null) {
            modernSearchView.setSearchBoxBackground(null);
        }
        d3m.e(this.v.c, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        i8(ltz.a);
        viewGroup2.post(new tw3(this, 14));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public void Y() {
        this.s.b();
        this.t.L();
        i0().L();
        this.m.b.i.stop(32);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final c g0(b5a b5aVar) {
        f<u0a> fVar = b5aVar.a;
        com.vk.movika.sdk.base.flow.binding.c cVar = new com.vk.movika.sdk.base.flow.binding.c(new e420(4), 25);
        fVar.getClass();
        return new i0(fVar, cVar).subscribe(new sl30(new zl20(this, 8), 4));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        SwitchCatalogVh switchCatalogVh = this.B;
        if (switchCatalogVh == null) {
            switchCatalogVh = null;
        }
        return switchCatalogVh.r;
    }

    public abstract SearchResultsImplVh i0();

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        SwitchCatalogVh switchCatalogVh = this.B;
        if (switchCatalogVh == null) {
            switchCatalogVh = null;
        }
        if (epx.f(switchCatalogVh.r, bnn0Var)) {
            return;
        }
        SwitchCatalogVh switchCatalogVh2 = this.B;
        (switchCatalogVh2 != null ? switchCatalogVh2 : null).i8(bnn0Var);
        if (!C || this.r) {
            return;
        }
        boolean z = bnn0Var instanceof alj;
        CatalogLongButtonBannerVh catalogLongButtonBannerVh = this.u;
        if (z && catalogLongButtonBannerVh != null && catalogLongButtonBannerVh.o) {
            catalogLongButtonBannerVh.a(true);
        } else if (catalogLongButtonBannerVh != null) {
            catalogLongButtonBannerVh.a(false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        boolean z = bnn0Var instanceof vyh0;
        VkSlidableSearchQueryVh vkSlidableSearchQueryVh = this.A;
        if (!z) {
            if (this.y && this.m.b.i.h()) {
                this.m.b.i.stop(32);
                this.y = false;
            }
            ModernSearchView modernSearchView = vkSlidableSearchQueryVh.b.k;
            if (modernSearchView != null) {
                if (!(bnn0Var instanceof ltz)) {
                    modernSearchView.a();
                }
                if (!f4m.h(this.v.c)) {
                    modernSearchView.b(50L);
                }
            }
        }
        if (bnn0Var instanceof swp) {
            vkSlidableSearchQueryVh.hide();
        } else {
            vkSlidableSearchQueryVh.show();
        }
    }

    public final void j0(UIBlockMusicTrack uIBlockMusicTrack) {
        MusicTrack musicTrack = uIBlockMusicTrack.z;
        if (musicTrack.B()) {
            this.p.g(musicTrack);
            return;
        }
        this.y = epx.f(getState(), vyh0.a);
        MusicTrack musicTrack2 = uIBlockMusicTrack.z;
        u4a u4aVar = this.m;
        u2b0 u2b0Var = u4aVar.b.i;
        String str = uIBlockMusicTrack.b;
        u2b0Var.N0(new lqk0(new StartPlaySingleTrackSource(str, uIBlockMusicTrack.c, musicTrack2.Ib()), musicTrack2, u4aVar.c.d.b(str), MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack.f), 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
        a aVar = this.q;
        if (aVar != null) {
            aVar.f(musicTrack2);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.t.n.onPause();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.t.n.onResume();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.mba
    public void q(int i, UIBlock uIBlock, Object obj) {
        if (uIBlock instanceof UIBlockMusicTrack) {
            if (i == R.id.audio_play_pause_btn) {
                j0((UIBlockMusicTrack) uIBlock);
                return;
            }
            AudioFromMusicCatalogInfo audioFromMusicCatalogInfo = obj != null ? (AudioFromMusicCatalogInfo) obj : null;
            MusicTrack musicTrack = ((UIBlockMusicTrack) uIBlock).z;
            if (musicTrack.B()) {
                this.p.g(musicTrack);
                return;
            }
            a aVar = this.q;
            if (aVar != null) {
                aVar.b(musicTrack, audioFromMusicCatalogInfo);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    public void z(int i, UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockMusicTrack) {
            if (i == R.id.audio_play_pause_btn) {
                j0((UIBlockMusicTrack) uIBlock);
                return;
            }
            MusicTrack musicTrack = ((UIBlockMusicTrack) uIBlock).z;
            if (musicTrack.B()) {
                this.p.g(musicTrack);
                return;
            }
            a aVar = this.q;
            if (aVar != null) {
                aVar.b(musicTrack, null);
            }
        }
    }

    @Override // xsna.qpk.a
    public final void r(int i) {
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
