package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.dto.common.VideoFile;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.lists.DefaultEmptyView;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.a6o0;
import xsna.b6o0;
import xsna.c490;
import xsna.cef0;
import xsna.cp10;
import xsna.cri;
import xsna.cxl0;
import xsna.cy3;
import xsna.dri;
import xsna.dt1;
import xsna.dxq0;
import xsna.e64;
import xsna.em50;
import xsna.emi;
import xsna.es60;
import xsna.f64;
import xsna.fxq0;
import xsna.g7s0;
import xsna.gbi0;
import xsna.gcx;
import xsna.gtq0;
import xsna.gzs;
import xsna.h0b;
import xsna.hq5;
import xsna.huh0;
import xsna.ja8;
import xsna.k9q0;
import xsna.kai;
import xsna.kef0;
import xsna.kr;
import xsna.ksc0;
import xsna.lg90;
import xsna.lqq0;
import xsna.lsc0;
import xsna.lwq0;
import xsna.n34;
import xsna.naf;
import xsna.ne7;
import xsna.nn50;
import xsna.nzu0;
import xsna.o19;
import xsna.pg90;
import xsna.ppv;
import xsna.q630;
import xsna.qri;
import xsna.qzu0;
import xsna.ra8;
import xsna.rrv0;
import xsna.rui;
import xsna.rvi;
import xsna.s200;
import xsna.s3q0;
import xsna.sq60;
import xsna.svh;
import xsna.sy90;
import xsna.txj0;
import xsna.ur;
import xsna.uvq0;
import xsna.vjw;
import xsna.vvq0;
import xsna.vxq0;
import xsna.wzs;
import xsna.x5o0;
import xsna.y5o0;
import xsna.zph0;
import xsna.zvq0;
import xsna.zw80;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        Integer num2;
        View findViewByPosition;
        int i = this.b;
        int i2 = 4;
        int i3 = 9;
        int i4 = 2;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).k = Color.parseColor((String) obj2);
                return Boolean.TRUE;
            case 1:
                naf nafVar = (naf) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = naf.k1;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2034446028, intValue, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.ClipsTrendingHashtagBottomSheet.Content.<anonymous> (ClipsTrendingHashtagBottomSheet.kt:46)");
                    }
                    rvi.a(c490.a.b(null), kai.c(-981208180, new j(nafVar, i4), aVar2), aVar2, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i6 = CommunityReviewsFragment.o0;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1992223188, intValue2, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment.setupTopBar.<anonymous> (CommunityReviewsFragment.kt:541)");
                    }
                    rrv0.d(null, null, null, null, kai.c(143690151, new hq5(communityReviewsFragment, i2), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                dri driVar = (dri) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2045752401, intValue3, -1, "com.vk.profile.user.impl.ui.adapter.holders.compose.ComposeUserProfileViewHolder.<anonymous>.<anonymous> (ComposeUserProfileViewHolder.kt:21)");
                    }
                    driVar.q6(6, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj3;
                sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = faveFeedFragment.b0;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (sq60Var.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        r9 = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(r9);
                } else {
                    num2 = null;
                }
                faveFeedFragment.go().c().H0(recyclerView, new cy3(i2, faveFeedFragment, sq60Var), new svh(num, num2, linearLayoutManager, faveFeedFragment, sq60Var, 1), sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 5:
                ppv ppvVar = (ppv) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1847822460, intValue4, -1, "com.vk.design.demo.presentation.screens.IconButtonScreenContent.Content.<anonymous>.<anonymous> (IconButtonScreenContent.kt:58)");
                    }
                    ppvVar.b(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 6:
                gzs gzsVar = (gzs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2147462644, intValue5, -1, "com.vk.music.ui.subscription.MusicBuySubscription.<anonymous>.<anonymous>.<anonymous> (MusicBuySubscription.kt:71)");
                    }
                    q630.a aVar7 = q630.a.a;
                    q630 D = s200.D(aVar7, 4);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.e, false);
                    int hashCode = Long.hashCode(n34.n(aVar6));
                    sy90 D2 = aVar6.D();
                    q630 c = qri.c(aVar6, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar8);
                    } else {
                        aVar6.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar6, d, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar6, D2, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar6, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar6, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar6, c, dVar);
                    nzu0.e(gzsVar, txj0.q(aVar7, 48), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, o19.d, aVar6, 100663344, 252);
                    q630 f = txj0.f(aVar7, 1.0f);
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar6));
                    sy90 D3 = aVar6.D();
                    q630 c2 = qri.c(aVar6, f);
                    if (aVar6.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar6.H();
                    if (aVar6.L()) {
                        aVar6.I(aVar8);
                    } else {
                        aVar6.f();
                    }
                    k9q0.w(aVar6, d2, cVar);
                    k9q0.w(aVar6, D3, eVar);
                    ur.d(hashCode2, aVar6, bVar, aVar6, c2678a);
                    k9q0.w(aVar6, c2, dVar);
                    q630 b = ra8.a.b(aVar7, dt1.a.f);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2144431994, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-LogoVkMusicColorWithTextWhite24> (VkIcons.kt:7040)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_logo_vk_music_color_with_text_white_24, 0, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    vjw.a(a, "", b, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar6, 56, 120);
                    if (kr.f(aVar6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 7:
                zw80 zw80Var = (zw80) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1054331618, intValue6, -1, "com.vk.ecomm.cart.impl.checkout.ui.product.OrderProductModalBottomSheet.<anonymous> (OrderProductModalBottomSheet.kt:31)");
                    }
                    emi.e.g(6, aVar9, kai.c(1191666308, new q(zw80Var, i3), aVar9));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 8:
                e64 e64Var = (e64) obj3;
                em50 em50Var = (em50) obj;
                lsc0 lsc0Var = (lsc0) obj2;
                if (lsc0Var instanceof ksc0) {
                    return em50Var.a(e64Var, lsc0Var);
                }
                throw new NoWhenBranchMatchedException();
            case 9:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultEmptyView defaultEmptyView = ((PostsFromNotificationsFragment) obj3).d0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 10:
                gcx gcxVar = (gcx) obj3;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float f2 = (floatValue2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : floatValue / floatValue2;
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = 0.83f;
                }
                gcxVar.L.setRatio(f2);
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                cef0.a((kef0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                ((zph0) obj3).k(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 13:
                UIBlockSearchHistory.UIBlockSearchHistoryVideo uIBlockSearchHistoryVideo = (UIBlockSearchHistory.UIBlockSearchHistoryVideo) obj2;
                VideoFile videoFile = uIBlockSearchHistoryVideo.A;
                ((g7s0) ((huh0) obj3).c.getValue()).Y().k((Context) obj, videoFile, (r43 & 4) != 0 ? null : uIBlockSearchHistoryVideo.f, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : videoFile.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                int i7 = gbi0.o1;
                ((gbi0) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 15:
                StoryEntry storyEntry = (StoryEntry) obj;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                int i8 = StoryArchiveFragment.h0;
                cxl0 cxl0Var = (cxl0) ((StoryArchiveFragment) obj3).S;
                if (cxl0Var != null) {
                    cxl0Var.s0(storyEntry, booleanValue2);
                }
                return s3q0.a;
            case 16:
                fxq0 fxq0Var = (fxq0) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                es60 es60Var = fxq0Var.i;
                final f64 a2 = ruiVar.a(new zvq0(fxq0Var, es60Var, nn50Var));
                h0b h0bVar = fxq0Var.g;
                final f64 a3 = ruiVar.a(new x5o0(es60Var, h0bVar, nn50Var));
                final f64 a4 = ruiVar.a(new vvq0(es60Var, h0bVar, nn50Var));
                final f64 a5 = ruiVar.a(new gtq0(es60Var, h0bVar, nn50Var));
                final f64 a6 = ruiVar.a(new y5o0(es60Var, h0bVar, nn50Var));
                final f64 a7 = ruiVar.a(new b6o0(es60Var, h0bVar, nn50Var));
                final f64 a8 = ruiVar.a(new uvq0(es60Var, h0bVar, nn50Var));
                final f64 a9 = ruiVar.a(new a6o0(es60Var, h0bVar, nn50Var));
                final f64 a10 = ruiVar.a(new lqq0(es60Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.gwq0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        lwq0 lwq0Var = (lwq0) obj5;
                        if (lwq0Var instanceof lwq0.c) {
                            return qk50Var.a(f64.this, lwq0Var);
                        }
                        if (lwq0Var instanceof nwq0) {
                            return qk50Var.a(a3, lwq0Var);
                        }
                        if (lwq0Var instanceof pwq0) {
                            return qk50Var.a(a5, lwq0Var);
                        }
                        if (lwq0Var instanceof mwq0) {
                            return qk50Var.a(a4, lwq0Var);
                        }
                        if (lwq0Var instanceof owq0) {
                            return qk50Var.a(a6, lwq0Var);
                        }
                        if (lwq0Var instanceof qwq0) {
                            return qk50Var.a(a7, lwq0Var);
                        }
                        if (lwq0Var instanceof lwq0.a) {
                            return qk50Var.a(a8, lwq0Var);
                        }
                        if (lwq0Var instanceof rwq0) {
                            return qk50Var.a(a9, lwq0Var);
                        }
                        if (lwq0Var instanceof lwq0.b) {
                            return qk50Var.a(a10, lwq0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            default:
                ((vxq0) obj3).j.x6(new dxq0.a.e(((Integer) obj2).intValue()));
                return s3q0.a;
        }
    }

    public /* synthetic */ p(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
