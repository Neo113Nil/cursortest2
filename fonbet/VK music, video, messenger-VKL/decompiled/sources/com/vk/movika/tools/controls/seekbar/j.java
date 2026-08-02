package com.vk.movika.tools.controls.seekbar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.profile.user.impl.ui.view.skeleton.UserLegoHeaderSkeletonView;
import com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.a4f0;
import xsna.a8n;
import xsna.ac0;
import xsna.axq;
import xsna.b8n;
import xsna.c1b0;
import xsna.cq;
import xsna.cri;
import xsna.d64;
import xsna.dt1;
import xsna.e3m;
import xsna.e9n;
import xsna.exi0;
import xsna.f6c0;
import xsna.g4f0;
import xsna.g5c0;
import xsna.h5f0;
import xsna.hap;
import xsna.hn50;
import xsna.isi;
import xsna.izs;
import xsna.jai;
import xsna.jqu0;
import xsna.k9q0;
import xsna.lg90;
import xsna.lm50;
import xsna.lru;
import xsna.m4c0;
import xsna.mzp0;
import xsna.n34;
import xsna.naf;
import xsna.ne7;
import xsna.nzw;
import xsna.of60;
import xsna.p2c0;
import xsna.pg90;
import xsna.q630;
import xsna.q7n;
import xsna.qcy;
import xsna.qri;
import xsna.qwl0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3f0;
import xsna.s3q0;
import xsna.s5c0;
import xsna.sj50;
import xsna.sy90;
import xsna.t4c0;
import xsna.tf60;
import xsna.tkl0;
import xsna.v7n;
import xsna.vj50;
import xsna.vkl0;
import xsna.wg60;
import xsna.wiu0;
import xsna.wvq;
import xsna.wzs;
import xsna.x7n;
import xsna.xb0;
import xsna.yb0;
import xsna.yg60;
import xsna.ylu0;
import xsna.yw90;
import xsna.zb0;
import xsna.zx7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView defaultSeekBarView = (DefaultSeekBarView) obj3;
                ((Boolean) obj2).booleanValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                defaultSeekBarView.requestLayout();
                defaultSeekBarView.l();
                defaultSeekBarView.h(null);
                defaultSeekBarView.m();
                return Boolean.TRUE;
            case 1:
                hn50 hn50Var = (hn50) ((wzs) obj3).invoke((vj50) obj, (lm50) obj2);
                if (hn50Var != null) {
                    return Collections.singletonList(hn50Var);
                }
                return null;
            case 2:
                naf nafVar = (naf) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = naf.k1;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-981208180, intValue, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.ClipsTrendingHashtagBottomSheet.Content.<anonymous>.<anonymous> (ClipsTrendingHashtagBottomSheet.kt:47)");
                    }
                    nafVar.co(8, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                e9n e9nVar = (e9n) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                hap hapVar = e9nVar.k;
                final d64 a = isiVar.a(new b8n(hapVar, sj50Var));
                final d64 a2 = isiVar.a(new v7n(hapVar, sj50Var));
                final d64 a3 = isiVar.a(new x7n(hapVar, sj50Var));
                final d64 a4 = isiVar.a(new a8n(hapVar, sj50Var, e9nVar.g));
                isiVar.c = new wzs() { // from class: xsna.o8n
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        rj50 rj50Var = (rj50) obj4;
                        q7n q7nVar = (q7n) obj5;
                        if (q7nVar instanceof q7n.d) {
                            return rj50Var.a(d64.this, q7nVar);
                        }
                        if (q7nVar instanceof q7n.b) {
                            return rj50Var.a(a3, q7nVar);
                        }
                        if (q7nVar instanceof q7n.a) {
                            return rj50Var.a(a2, q7nVar);
                        }
                        if (q7nVar instanceof q7n.c) {
                            return rj50Var.a(a4, q7nVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((wvq) obj3).f(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((axq) obj3).h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                lru.a aVar3 = (lru.a) obj3;
                aVar3.o.e(new GroupSuggestion((Group) obj, null, null, (String) obj2, null), ((lru) aVar3.m).i);
                return s3q0.a;
            case 7:
                int intValue2 = ((Integer) obj).intValue();
                Intent intent = (Intent) obj2;
                Activity h = e3m.h((Context) obj3);
                if (h != null) {
                    h.startActivityForResult(intent, intValue2);
                }
                return s3q0.a;
            case 8:
                wg60 wg60Var = (wg60) obj3;
                isi isiVar2 = (isi) obj;
                sj50 sj50Var2 = (sj50) obj2;
                tf60 tf60Var = wg60Var.j;
                isiVar2.c = new zx7(isiVar2.a(new ac0(sj50Var2, tf60Var)), isiVar2.a(new yb0(sj50Var2, tf60Var)), isiVar2.a(new xb0(sj50Var2, tf60Var)), isiVar2.a(new of60(tf60Var, sj50Var2, wg60Var.g)), isiVar2.a(new yg60(sj50Var2)));
                return s3q0.a;
            case 9:
                ((izs) obj3).invoke(new c1b0.e(((Integer) obj).intValue(), ((Short) obj2).shortValue()));
                return s3q0.a;
            case 10:
                PlaylistScreenFragment playlistScreenFragment = (PlaylistScreenFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = PlaylistScreenFragment.T;
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(97799247, intValue3, -1, "com.vk.video.playlist.playlistscreen.ui.PlaylistScreenFragment.onCreateView.<anonymous>.<anonymous> (PlaylistScreenFragment.kt:92)");
                    }
                    playlistScreenFragment.eo(0, aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 11:
                s5c0 s5c0Var = (s5c0) obj3;
                isi isiVar3 = (isi) obj;
                sj50 sj50Var3 = (sj50) obj2;
                g5c0 g5c0Var = s5c0Var.j;
                final d64 a5 = isiVar3.a(new ac0(sj50Var3, g5c0Var));
                final d64 a6 = isiVar3.a(new xb0(sj50Var3, g5c0Var));
                final d64 a7 = isiVar3.a(new yb0(sj50Var3, g5c0Var));
                final d64 a8 = isiVar3.a(new zb0(g5c0Var, s5c0Var.f, sj50Var3));
                final d64 a9 = isiVar3.a(new f6c0(sj50Var3));
                final d64 a10 = isiVar3.a(new m4c0(sj50Var3));
                final d64 a11 = isiVar3.a(new p2c0(sj50Var3));
                isiVar3.c = new wzs() { // from class: xsna.p5c0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        rj50 rj50Var = (rj50) obj4;
                        t4c0 t4c0Var = (t4c0) obj5;
                        if (t4c0Var instanceof t4c0.e) {
                            return rj50Var.a(d64.this, t4c0Var);
                        }
                        if (t4c0Var instanceof t4c0.c) {
                            return rj50Var.a(a7, t4c0Var);
                        }
                        if (t4c0Var instanceof t4c0.b) {
                            return rj50Var.a(a6, t4c0Var);
                        }
                        if (t4c0Var instanceof u4c0) {
                            return rj50Var.a(a8, t4c0Var);
                        }
                        if (t4c0Var instanceof t4c0.f) {
                            return rj50Var.a(a9, t4c0Var);
                        }
                        if (t4c0Var instanceof t4c0.d) {
                            return rj50Var.a(a10, t4c0Var);
                        }
                        if (t4c0Var instanceof t4c0.a) {
                            return rj50Var.a(a11, t4c0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 12:
                h5f0 h5f0Var = (h5f0) obj3;
                isi isiVar4 = (isi) obj;
                sj50 sj50Var4 = (sj50) obj2;
                g4f0 g4f0Var = h5f0Var.j;
                final d64 a12 = isiVar4.a(new ac0(sj50Var4, g4f0Var));
                final d64 a13 = isiVar4.a(new xb0(sj50Var4, g4f0Var));
                final d64 a14 = isiVar4.a(new yb0(sj50Var4, g4f0Var));
                final d64 a15 = isiVar4.a(new zb0(g4f0Var, h5f0Var.f, sj50Var4));
                final d64 a16 = isiVar4.a(new s3f0(sj50Var4));
                isiVar4.c = new wzs() { // from class: xsna.p4f0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        rj50 rj50Var = (rj50) obj4;
                        a4f0 a4f0Var = (a4f0) obj5;
                        if (a4f0Var instanceof a4f0.d) {
                            return rj50Var.a(d64.this, a4f0Var);
                        }
                        if (a4f0Var instanceof a4f0.c) {
                            return rj50Var.a(a14, a4f0Var);
                        }
                        if (a4f0Var instanceof a4f0.b) {
                            return rj50Var.a(a13, a4f0Var);
                        }
                        if (a4f0Var instanceof b4f0) {
                            return rj50Var.a(a15, a4f0Var);
                        }
                        if (a4f0Var instanceof a4f0.a) {
                            return rj50Var.a(a16, a4f0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 13:
                StorefrontAlbumsFragment storefrontAlbumsFragment = (StorefrontAlbumsFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr2 = StorefrontAlbumsFragment.R;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1227870321, intValue4, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment.onCreateView.<anonymous>.<anonymous> (StorefrontAlbumsFragment.kt:91)");
                    }
                    nzw nzwVar = storefrontAlbumsFragment.P;
                    qcy<Object> qcyVar = StorefrontAlbumsFragment.R[0];
                    vkl0 vkl0Var = (vkl0) nzwVar.getValue();
                    mzp0 mzp0Var = storefrontAlbumsFragment.J;
                    yw90 On = storefrontAlbumsFragment.On();
                    boolean y = aVar5.y(storefrontAlbumsFragment);
                    Object x = aVar5.x();
                    if (y || x == a.C0011a.a) {
                        x = new exi0(storefrontAlbumsFragment, 5);
                        aVar5.R(x);
                    }
                    tkl0.b(vkl0Var, mzp0Var, On, (izs) x, aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 14:
                qwl0 qwl0Var = (qwl0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(851034321, intValue5, -1, "com.vk.story.viewer.impl.presentation.holders.StoryAchievementHolder.bindData.<anonymous>.<anonymous> (StoryAchievementHolder.kt:21)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a17 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar6, 0);
                    int hashCode = Long.hashCode(n34.n(aVar6));
                    sy90 D = aVar6.D();
                    q630.a aVar7 = q630.a.a;
                    q630 c = qri.c(aVar6, aVar7);
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
                    k9q0.w(aVar6, a17, cri.a.f);
                    k9q0.w(aVar6, D, cri.a.e);
                    k9q0.w(aVar6, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar6, cri.a.h);
                    k9q0.w(aVar6, c, cri.a.d);
                    lg90 a18 = pg90.a(R.drawable.vk_icon_statistics_outline_28, 0, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    wiu0.b(null, false, com.vk.core.compose.component.cell.content.f.a(a18, Cell$Left.Main.Size.Large, ylu0Var.getIcon().l, null, null, aVar6, 196664, 24), Cell$Middle.a.a(Cell$Middle.d.b.a(qwl0Var.a, null, null, 0, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), Cell$Middle.c.b.b(qwl0Var.b, 0, null, null, null, aVar6, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, aVar6, 196608, 28), null, null, null, aVar6, 0, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                    jqu0.a(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, 1, aVar7), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar6, 6, 14);
                    aVar6.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                int i3 = UserLegoHeaderSkeletonView.m;
                ((UserLegoHeaderSkeletonView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-480467370, intValue6, -1, "com.vk.core.compose.modal.VkThemeWithoutOverscroll.<anonymous>.<anonymous> (VkThemeWithoutOverscroll.kt:14)");
                    }
                    if (cq.i(0, aVar9, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ j(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
