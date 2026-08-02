package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.community.design.view.cover.CommunityStaticCover;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.dto.music.MusicTrack;
import com.vk.fave.api.FaveLoadState;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.newsfeed.common.views.fave.FavesAllEmptyView;
import com.vk.newsfeed.common.views.fave.FavesEmptyListView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;
import xsna.ahn;
import xsna.atn;
import xsna.ca10;
import xsna.cfz;
import xsna.cg4;
import xsna.cq;
import xsna.d370;
import xsna.ffa;
import xsna.fs00;
import xsna.fsc0;
import xsna.ftc0;
import xsna.fv70;
import xsna.gzs;
import xsna.hfa;
import xsna.huh0;
import xsna.irk0;
import xsna.izs;
import xsna.jai;
import xsna.jnj;
import xsna.kai;
import xsna.ki4;
import xsna.lxs;
import xsna.mo60;
import xsna.muv0;
import xsna.n0w;
import xsna.ne7;
import xsna.o83;
import xsna.ogd;
import xsna.pqz;
import xsna.q630;
import xsna.qcy;
import xsna.r37;
import xsna.rd80;
import xsna.rrv0;
import xsna.s3q0;
import xsna.sl50;
import xsna.sti;
import xsna.ux00;
import xsna.v4w;
import xsna.w9z;
import xsna.wh50;
import xsna.wsc;
import xsna.wzs;
import xsna.xnq;
import xsna.y6h;
import xsna.yzs;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = 4;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i3 = 9;
        int i4 = 17;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).j = Color.parseColor((String) obj2);
                break;
            case 1:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(814848226, intValue, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment.ScreenContent.<anonymous> (CatalogSectionScreenFragment.kt:98)");
                    }
                    boolean J = aVar2.J(catalogSectionScreenFragment);
                    Object x = aVar2.x();
                    if (J || x == c0012a) {
                        x = new com.vk.im.ui.fragments.b(catalogSectionScreenFragment, i4);
                        aVar2.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean J2 = aVar2.J(catalogSectionScreenFragment);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new hfa(catalogSectionScreenFragment, null);
                        aVar2.R(x2);
                    }
                    r37.a(izsVar, (yzs) x2, kai.c(-881397501, new ffa(catalogSectionScreenFragment, r9), aVar2), aVar2, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((sti) obj).a(new wsc((sl50) obj2, (irk0) obj3));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.vk.community.design.view.cover.b.c((CommunityStaticCover.a.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 4:
                atn.a aVar3 = (atn.a) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(444436415, intValue2, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.Doc2DocBannerDelegate.ViewHolder.<anonymous> (Doc2DocBannerDelegate.kt:54)");
                    }
                    AboutVideoItem.l lVar = (AboutVideoItem.l) ((zak0) aVar3.m).getValue();
                    if (lVar == null) {
                        aVar4.K(-1178900946);
                        aVar4.j();
                    } else {
                        aVar4.K(-1178900945);
                        rrv0.e(true, null, null, null, null, null, kai.c(29162007, new cg4(i2, lVar, aVar3), aVar4), aVar4, 1572870, 62);
                        aVar4.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 5:
                break;
            case 6:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj3;
                xnq xnqVar = (xnq) obj2;
                qcy<Object>[] qcyVarArr2 = FaveFeedFragment.s0;
                boolean z = xnqVar.b;
                boolean z2 = xnqVar.a;
                FavesEmptyListView favesEmptyListView = faveFeedFragment.f0;
                if (favesEmptyListView != null) {
                    favesEmptyListView.setVisibility(z2 ? 0 : 8);
                }
                FavesAllEmptyView favesAllEmptyView = faveFeedFragment.g0;
                if (favesAllEmptyView != null) {
                    favesAllEmptyView.setVisibility(z ? 0 : 8);
                }
                FavesAllEmptyView favesAllEmptyView2 = faveFeedFragment.g0;
                if (favesAllEmptyView2 != null) {
                    favesAllEmptyView2.setState(xnqVar.c);
                }
                if (z2 || z) {
                    faveFeedFragment.jo(FaveLoadState.EMPTY);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((w9z) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-745896836, intValue3, -1, "com.vk.music.playlist.display.audiobook.offline.presentation.compose.OfflineAudioBookChaptersMviComposeComponent.Theme.<anonymous> (OfflineAudioBookChaptersMviComposeComponent.kt:94)");
                    }
                    if (cq.i(0, aVar5, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                rd80.b((wh50) obj3, (androidx.compose.runtime.a) obj, ne7.I(55));
                break;
            case 10:
                mo60 mo60Var = ((ftc0) obj3).e;
                ((sti) obj).a(new fsc0((sl50) obj2, mo60Var.v, mo60Var.i0));
                break;
            case 11:
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-262201954, intValue4, -1, "com.vk.donut.privacy.levels.PrivacyEditDonutLevelsView.ThemedContent.<anonymous> (PrivacyEditDonutLevelsView.kt:47)");
                    }
                    TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.donut_levels, 0, aVar6), null, null, null, null, aVar6, 196608, 30), null, null, null, aVar6, 14);
                    String N = d370.N(R.string.back, 0, aVar6);
                    SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.Merge;
                    Object x3 = aVar6.x();
                    if (x3 == c0012a) {
                        x3 = new pqz(17);
                        aVar6.R(x3);
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x3, 2);
                    boolean J3 = aVar6.J(izsVar2);
                    Object x4 = aVar6.x();
                    if (J3 || x4 == c0012a) {
                        x4 = new y6h(izsVar2, 4);
                        aVar6.R(x4);
                    }
                    muv0.h(a, ahn.E(q630.a.a, "PrivacyVideoForDonutsToolbar"), null, null, e.a.a((gzs) x4, N, null, null, a2, aVar6, 196608, 12), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, 48, 0, 8172);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 12:
                huh0 huh0Var = (huh0) obj3;
                Context context = (Context) obj;
                UIBlockSearchHistory.UIBlockSearchHistoryTrack uIBlockSearchHistoryTrack = (UIBlockSearchHistory.UIBlockSearchHistoryTrack) obj2;
                MusicTrack musicTrack = uIBlockSearchHistoryTrack.A;
                com.vk.music.track.a aVar7 = huh0Var.e;
                int i5 = 7;
                if (aVar7.i(musicTrack)) {
                    MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(uIBlockSearchHistoryTrack.f).Bb(uIBlockSearchHistoryTrack.b).Cb(jnj.a(musicTrack.V));
                    (musicTrack.P ? aVar7.p1(musicTrack, true, false).L(new cfz(new o83(huh0Var, musicTrack, Cb, i5), 12), false) : aVar7.e1(musicTrack, Cb, true)).F(new ux00(new n0w(huh0Var, context), i4)).subscribe();
                } else if (aVar7.i0(musicTrack)) {
                    io.reactivex.rxjava3.core.q<List<String>> u1 = aVar7.u1(musicTrack, true);
                    fv70 fv70Var = new fv70(new ogd(huh0Var, context, musicTrack, i5), i3);
                    a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    u1.E(fv70Var, lVar2, kVar, kVar).F(new fs00(new ki4(huh0Var, context, musicTrack, i5), 19)).F(new ca10(new v4w(huh0Var, context), 18)).subscribe();
                }
                break;
            default:
                ((lxs) obj3).invoke((Throwable) obj, (izs) obj2);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ t(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
