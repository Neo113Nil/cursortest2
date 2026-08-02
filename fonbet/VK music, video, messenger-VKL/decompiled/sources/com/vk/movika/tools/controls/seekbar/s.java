package com.vk.movika.tools.controls.seekbar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.fave.api.FaveLoadState;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.offline.ui.a;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.log.L;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.poll.fragments.PollEditorFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.a390;
import xsna.bei0;
import xsna.bpn0;
import xsna.c1b0;
import xsna.dlv0;
import xsna.e5p0;
import xsna.epx;
import xsna.fgb0;
import xsna.fi80;
import xsna.fu7;
import xsna.fxc0;
import xsna.fy0;
import xsna.gho0;
import xsna.gri;
import xsna.gua0;
import xsna.gzs;
import xsna.h4;
import xsna.hto0;
import xsna.i1t0;
import xsna.izs;
import xsna.k82;
import xsna.kuj;
import xsna.l5g;
import xsna.l7k0;
import xsna.lg90;
import xsna.lv90;
import xsna.mqe0;
import xsna.mqv;
import xsna.ne7;
import xsna.or;
import xsna.pg90;
import xsna.ppv;
import xsna.q630;
import xsna.qcy;
import xsna.qko0;
import xsna.rrv0;
import xsna.s200;
import xsna.s3q0;
import xsna.tco0;
import xsna.us2;
import xsna.v8t;
import xsna.vpj0;
import xsna.vu7;
import xsna.w5l;
import xsna.wlb0;
import xsna.wys0;
import xsna.wzs;
import xsna.y860;
import xsna.yg5;
import xsna.ylu0;
import xsna.zak0;
import xsna.zkv0;
import xsna.zvs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        VideoFile A;
        int i = this.b;
        r5 = null;
        String str2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).i = Color.parseColor((String) obj2);
                break;
            case 1:
                dlv0 dlv0Var = (dlv0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1397078012, intValue, -1, "com.vk.biometrics.lock.impl.presentation.base.mvi.settings.ContentScene.<anonymous> (BiometricsLockSettingsView.kt:165)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(521903826, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOn24> (VkSdkIcons.kt:360)");
                    }
                    lg90 a = pg90.a(R.drawable.vk_icon_check_circle_on_24, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    mqv z = s200.z(a, ylu0Var.q().b, aVar2);
                    l7k0 b = dlv0Var.b();
                    if (b == null || (str = b.a) == null) {
                        str = "";
                    }
                    zkv0.c(dlv0Var, wlb0.m(str, null, null, aVar2, 6), null, z, null, null, aVar2, 0, 116);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                fu7.e((vu7) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 3:
                CatalogSectionScreenFragment catalogSectionScreenFragment = (CatalogSectionScreenFragment) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1418852286, intValue2, -1, "com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment.onCreateView.<anonymous>.<anonymous> (CatalogSectionScreenFragment.kt:90)");
                    }
                    catalogSectionScreenFragment.eo(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                gri.b((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                kuj.d((gho0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                w5l.c((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 7:
                FaveFeedFragment faveFeedFragment = (FaveFeedFragment) obj3;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                VkErrorView vkErrorView = faveFeedFragment.e0;
                if (vkErrorView != null) {
                    vkErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                if (booleanValue) {
                    faveFeedFragment.jo(FaveLoadState.ERROR);
                }
                break;
            case 8:
                y860 y860Var = (y860) obj;
                List list = (List) obj2;
                ArrayList arrayList = ((zvs) obj3).a.a;
                arrayList.clear();
                arrayList.addAll(list);
                VKList vKList = new VKList(zvs.a(y860Var.b, list, true));
                vKList.l(y860Var.a);
                break;
            case 9:
                ((Integer) obj2).getClass();
                v8t.d((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((ppv) obj3).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 11:
                fi80 fi80Var = (fi80) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1029936386, intValue3, -1, "com.vk.ecomm.reviews.impl.communities.reviews.ui.view.OnboardingTopBarAfter.Content.<anonymous> (OnboardingTopBarAfter.kt:36)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2048237034, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-SettingsOutline28> (VkSdkIcons.kt:3322)");
                    }
                    lg90 b2 = or.b(aVar4, 429284277, R.drawable.vk_icon_settings_outline_28, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    d.a.a(d.c.C0760d.a.a(b2, null, (gzs) ((zak0) fi80Var.d).getValue(), null, new l5g(ylu0Var2.getIcon().b), null, aVar4, 1572872, 42), null, null, null, aVar4, 24576, 14).a(q630.a.a, aVar4, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((lv90) obj3).go(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 13:
                ((izs) obj3).invoke(new c1b0.e(((Integer) obj).intValue(), ((Short) obj2).shortValue()));
                break;
            case 14:
                fgb0 fgb0Var = (fgb0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(946958849, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content.<anonymous> (PodcastBigPlayerControls.kt:41)");
                    }
                    fgb0Var.f(0, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 15:
                PollEditorFragment pollEditorFragment = (PollEditorFragment) obj3;
                int i2 = PollEditorFragment.X;
                Intent intent = new Intent();
                intent.putExtra("poll", ((PollAttachment) obj).f);
                pollEditorFragment.io().a(intent);
                pollEditorFragment.Mf(-1, intent);
                break;
            case 16:
                bei0 bei0Var = (bei0) obj3;
                tco0 tco0Var = (tco0) obj;
                Context context = (Context) obj2;
                Pair<us2, qko0> d = bei0Var.d();
                gua0.a(tco0Var, context, false, d != null ? d.i() : null, d != null ? d.j() : null, bei0Var.x, new k82(22, bei0Var, context));
                break;
            case 17:
                e5p0 e5p0Var = (e5p0) obj;
                View view = (View) obj2;
                wzs<? super e5p0, ? super View, s3q0> wzsVar = ((VideoEditTimelineView) obj3).G;
                if (wzsVar != null) {
                    wzsVar.invoke(e5p0Var, view);
                }
                break;
            default:
                com.vk.libvideo.offline.ui.a aVar6 = (com.vk.libvideo.offline.ui.a) obj3;
                Uri uri = (Uri) obj;
                Throwable th = (Throwable) obj2;
                a.C1244a c1244a = aVar6.p;
                c1244a.e.setVisibility(0);
                if (th == null) {
                    VideoFileOld videoFileOld = ((wys0) aVar6.m).a;
                    bpn0 bpn0Var = VideoOverlayView.I;
                    VKImageView vKImageView = c1244a.e;
                    VideoOverlayView videoOverlayView = c1244a.f;
                    DurationView durationView = c1244a.h;
                    boolean c = fxc0.B().c(videoFileOld);
                    VideoRestriction videoRestriction = videoFileOld.O0;
                    com.vk.libvideo.design.view.overlay.b a2 = videoRestriction != null ? ((a390) aVar6.v.getValue()).a(videoRestriction) : null;
                    boolean z2 = videoFileOld.d8() || videoFileOld.z0();
                    VideoPipStateHolder.a.getClass();
                    yg5 c2 = VideoPipStateHolder.c();
                    if (c2 != null && (A = c2.A()) != null) {
                        str2 = A.a1();
                    }
                    int i3 = 26;
                    int i4 = 19;
                    VideoOverlayView.b.a(new VideoOverlayView.a(vKImageView, videoOverlayView, new fy0(i3, aVar6, uri), null, durationView, false, false, c, new mqe0(videoFileOld, i3), new h4(i4, aVar6, videoFileOld), a2, z2, epx.f(str2, videoFileOld.a1()), new vpj0(aVar6, i4), (i1t0) aVar6.w.getValue(), new hto0(3, aVar6, uri), 232));
                    break;
                } else {
                    c1244a.e.clear();
                    L.i(th);
                    break;
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ s(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ s(fi80 fi80Var) {
        this.b = 11;
        this.c = fi80Var;
    }
}
