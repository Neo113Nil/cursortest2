package com.vk.movika.tools.controls.seekbar;

import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.community.design.compose.topbar.PassthroughThemedComposeView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.instantjobs.components.appstate.AppState;
import com.vk.lists.DefaultEmptyView;
import com.vk.movika.tools.controls.seekbar.DefaultSeekBarView;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoState;
import com.vk.stories.design.view.polls.AbstractPollView;
import kotlin.NoWhenBranchMatchedException;
import xsna.a070;
import xsna.a6o0;
import xsna.alj;
import xsna.b5i0;
import xsna.b6o0;
import xsna.cgh;
import xsna.coo;
import xsna.d64;
import xsna.dxq0;
import xsna.e670;
import xsna.es60;
import xsna.f15;
import xsna.f4f0;
import xsna.f64;
import xsna.fcy;
import xsna.fm60;
import xsna.fxc0;
import xsna.g4f0;
import xsna.gi60;
import xsna.gu0;
import xsna.gzs;
import xsna.h2s0;
import xsna.h5f0;
import xsna.his0;
import xsna.hod;
import xsna.i6t0;
import xsna.ic1;
import xsna.isi;
import xsna.izs;
import xsna.j4f0;
import xsna.jai;
import xsna.jih;
import xsna.k7k0;
import xsna.kai;
import xsna.kd60;
import xsna.kz60;
import xsna.lt60;
import xsna.lv90;
import xsna.n4;
import xsna.ne7;
import xsna.nge0;
import xsna.nn50;
import xsna.oal;
import xsna.ot60;
import xsna.pj60;
import xsna.q630;
import xsna.qhg0;
import xsna.qwl0;
import xsna.rcl0;
import xsna.rrv0;
import xsna.rui;
import xsna.s3q0;
import xsna.sj50;
import xsna.sp;
import xsna.ul60;
import xsna.uoi;
import xsna.us2;
import xsna.v5o0;
import xsna.vn60;
import xsna.vs60;
import xsna.vxq0;
import xsna.vyh0;
import xsna.ws2;
import xsna.wzs;
import xsna.x5o0;
import xsna.y4f0;
import xsna.y5o0;
import xsna.z1o;
import xsna.z5o0;
import xsna.zak0;
import xsna.zz60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 14;
        us2 us2Var = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                Float f = (Float) obj2;
                f.floatValue();
                DefaultSeekBarView.a aVar = DefaultSeekBarView.Companion;
                ((DefaultSeekBarView) obj3).h(f);
                return Boolean.TRUE;
            case 1:
                ((n4) obj3).f.g = (VideoFile) obj;
                return s3q0.a;
            case 2:
                com.vk.stories.design.view.polls.a aVar2 = (com.vk.stories.design.view.polls.a) obj;
                ((Integer) obj2).intValue();
                int i3 = AbstractPollView.S;
                ((Transition) obj3).excludeTarget((View) aVar2.d, true).excludeTarget((View) aVar2.c, true);
                return s3q0.a;
            case 3:
                AiAssistantCardVh aiAssistantCardVh = (AiAssistantCardVh) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1314616843, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardVh.createComposeView.<anonymous>.<anonymous>.<anonymous> (AiAssistantCardVh.kt:155)");
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.assistant.c cVar = (com.vk.catalog2.common.ui.mvp.holder.video.assistant.c) ((zak0) aiAssistantCardVh.l).getValue();
                    boolean y = aVar3.y(aiAssistantCardVh);
                    Object x = aVar3.x();
                    if (y || x == c0012a) {
                        x = new ic1(aiAssistantCardVh);
                        aVar3.R(x);
                    }
                    com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.b(cVar, (izs) ((fcy) x), aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((f15) obj3).h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                View view = (View) obj3;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                view.setTranslationX(floatValue);
                view.setTranslationY(floatValue2);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                jih.a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 7:
                b5i0 b5i0Var = (b5i0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2090686107, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSegmentedControlKt.lambda$1070649632.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSegmentedControl.kt:291)");
                    }
                    Object x2 = aVar4.x();
                    if (x2 == c0012a) {
                        x2 = new n(i2);
                        aVar4.R(x2);
                    }
                    b5i0Var.c(true, x2, uoi.d, null, aVar4, 438, 8);
                    Object x3 = aVar4.x();
                    if (x3 == c0012a) {
                        x3 = new gu0(10);
                        aVar4.R(x3);
                    }
                    b5i0Var.c(false, (gzs) x3, uoi.e, null, aVar4, 438, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 8:
                oal oalVar = (oal) obj3;
                AppState appState = (AppState) obj2;
                oalVar.getClass();
                Handler handler = oal.j;
                handler.postAtTime(new hod(oalVar, true ? 1 : 0), oal.l, SystemClock.uptimeMillis() + oal.k);
                handler.removeCallbacksAndMessages(oal.n);
                oalVar.g(appState, oal.d((AppState) obj, appState));
                return s3q0.a;
            case 9:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj3;
                String str = (String) obj;
                MusicOfflineCatalogRootVh.a aVar5 = musicOfflineCatalogRootVh.B;
                if (aVar5 != null) {
                    aVar5.a(str);
                }
                if (!musicOfflineCatalogRootVh.j0()) {
                    musicOfflineCatalogRootVh.z.d();
                } else if (str.length() > 0) {
                    musicOfflineCatalogRootVh.i8(vyh0.a);
                    musicOfflineCatalogRootVh.A.d();
                } else {
                    musicOfflineCatalogRootVh.i8(alj.a);
                    musicOfflineCatalogRootVh.I.a(OfflineCatalogCategories.All.n());
                }
                return s3q0.a;
            case 10:
                zz60 zz60Var = (zz60) obj3;
                isi isiVar = (isi) obj;
                sj50 sj50Var = (sj50) obj2;
                ot60 ot60Var = zz60Var.u;
                final d64 a = isiVar.a(new lt60(ot60Var, sj50Var));
                final d64 a2 = isiVar.a(new gi60(ot60Var, zz60Var, sj50Var));
                final d64 a3 = isiVar.a(new fm60(ot60Var, sj50Var));
                final d64 a4 = isiVar.a(new vn60(ot60Var, sj50Var, zz60Var.j, zz60Var.k, zz60Var.a, zz60Var.e, zz60Var.d));
                final d64 a5 = isiVar.a(new a070(sj50Var));
                final d64 a6 = isiVar.a(new kz60(sj50Var));
                final d64 a7 = isiVar.a(new kd60(sj50Var, zz60Var.g, zz60Var.o));
                final d64 a8 = isiVar.a(new pj60(sj50Var));
                final d64 a9 = isiVar.a(new ul60(sj50Var));
                isiVar.c = new wzs() { // from class: xsna.uz60
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        rj50 rj50Var = (rj50) obj4;
                        vs60 vs60Var = (vs60) obj5;
                        if (vs60Var instanceof vs60.g) {
                            return rj50Var.a(d64.this, vs60Var);
                        }
                        if (vs60Var instanceof vs60.b) {
                            return rj50Var.a(a2, vs60Var);
                        }
                        if (vs60Var instanceof vs60.e) {
                            return rj50Var.a(a3, vs60Var);
                        }
                        if (vs60Var instanceof vs60.f) {
                            return rj50Var.a(a4, vs60Var);
                        }
                        if (vs60Var instanceof vs60.i) {
                            return rj50Var.a(a5, vs60Var);
                        }
                        if (vs60Var instanceof vs60.h) {
                            return rj50Var.a(a6, vs60Var);
                        }
                        if (vs60Var instanceof vs60.a) {
                            return rj50Var.a(a7, vs60Var);
                        }
                        if (vs60Var instanceof vs60.c) {
                            return rj50Var.a(a8, vs60Var);
                        }
                        if (vs60Var instanceof vs60.d) {
                            return rj50Var.a(a9, vs60Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 11:
                ((Integer) obj2).getClass();
                ((e670) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 12:
                ((Integer) obj2).getClass();
                int i4 = PassthroughThemedComposeView.o;
                ((PassthroughThemedComposeView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                ((lv90) obj3).fo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 14:
                h5f0 h5f0Var = (h5f0) obj3;
                rui ruiVar = (rui) obj;
                nn50 nn50Var = (nn50) obj2;
                final f64 a10 = ruiVar.a(new j4f0(h5f0Var, nn50Var));
                es60 es60Var = h5f0Var.k;
                g4f0 g4f0Var = h5f0Var.j;
                final f64 a11 = ruiVar.a(new x5o0(es60Var, g4f0Var, nn50Var));
                final f64 a12 = ruiVar.a(new f4f0(g4f0Var, es60Var, nn50Var));
                final f64 a13 = ruiVar.a(new z5o0(es60Var, g4f0Var, nn50Var));
                final f64 a14 = ruiVar.a(new y5o0(es60Var, g4f0Var, nn50Var));
                final f64 a15 = ruiVar.a(new b6o0(es60Var, g4f0Var, nn50Var));
                final f64 a16 = ruiVar.a(new v5o0(es60Var, g4f0Var, nn50Var));
                final f64 a17 = ruiVar.a(new a6o0(es60Var, g4f0Var, nn50Var));
                ruiVar.b = new wzs() { // from class: xsna.q4f0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj4, Object obj5) {
                        qk50 qk50Var = (qk50) obj4;
                        y4f0 y4f0Var = (y4f0) obj5;
                        if (y4f0Var instanceof y4f0.a) {
                            return qk50Var.a(f64.this, y4f0Var);
                        }
                        if (y4f0Var instanceof u4f0) {
                            return qk50Var.a(a11, y4f0Var);
                        }
                        if (y4f0Var instanceof w4f0) {
                            return qk50Var.a(a13, y4f0Var);
                        }
                        if (y4f0Var instanceof t4f0) {
                            return qk50Var.a(a12, y4f0Var);
                        }
                        if (y4f0Var instanceof v4f0) {
                            return qk50Var.a(a14, y4f0Var);
                        }
                        if (y4f0Var instanceof x4f0) {
                            return qk50Var.a(a15, y4f0Var);
                        }
                        if (y4f0Var instanceof s4f0) {
                            return qk50Var.a(a16, y4f0Var);
                        }
                        if (y4f0Var instanceof z4f0) {
                            return qk50Var.a(a17, y4f0Var);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 15:
                jai jaiVar = sp.f;
                Object obj4 = (k7k0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2017516783, intValue3, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
                    }
                    jaiVar.invoke(obj4, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 16:
                ((rcl0) obj3).b((nge0) obj2);
                return s3q0.a;
            case 17:
                qwl0 qwl0Var = (qwl0) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1066755308, intValue4, -1, "com.vk.story.viewer.impl.presentation.holders.StoryAchievementHolder.bindData.<anonymous> (StoryAchievementHolder.kt:20)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(851034321, new j(qwl0Var, i2), aVar7), aVar7, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 18:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultEmptyView defaultEmptyView = ((SuggestedPostsFragment) obj3).f0;
                if (defaultEmptyView != null) {
                    defaultEmptyView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 19:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.h((UserProfileBaseInfoState.c) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 20:
                ((vxq0) obj3).j.x6(new dxq0.a.i(((Integer) obj2).intValue()));
                return s3q0.a;
            case 21:
                h2s0.a aVar8 = (h2s0.a) obj3;
                i6t0 i6t0Var = (i6t0) obj;
                VkCell.f fVar = (VkCell.f) obj2;
                if ((fVar instanceof h2s0.b ? (h2s0.b) fVar : null) != null) {
                    h2s0.b bVar = (h2s0.b) fVar;
                    AttachVideo attachVideo = bVar.a;
                    ImageList imageList = bVar.b;
                    coo cooVar = aVar8.q;
                    boolean W9 = attachVideo.b.W9();
                    if (W9) {
                        i6t0Var.getInteractiveDurationView().setDurationText(cooVar.a(attachVideo.b.getDuration()));
                        i6t0Var.getInteractiveDurationView().setTextDescriptionVisible(false);
                    } else {
                        i6t0Var.getDurationView().setText(cooVar.a(attachVideo.b.getDuration()));
                    }
                    fxc0.B().Q().d(i6t0Var.getOverlayView(), attachVideo.b, i6t0Var.getImageView(), new cgh(i6t0Var, W9, aVar8, imageList), new qhg0(aVar8, 18), (128 & 64) != 0 ? null : W9 ? i6t0Var.getInteractiveDurationView() : i6t0Var.getDurationView());
                }
                return s3q0.a;
            case 22:
                DonutVideoUiModel.PreviewBadge previewBadge = (DonutVideoUiModel.PreviewBadge) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                aVar9.K(-582799441);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-582799441, intValue5, -1, "com.vk.catalog.mvi.block.video.impl.video.largelist.toDonutBadge.<anonymous>.<anonymous> (VideoLargeListViewStateMapper.kt:502)");
                }
                DonutPriceTemplate donutPriceTemplate = previewBadge.c;
                if (donutPriceTemplate == null) {
                    aVar9.K(-1920296873);
                } else {
                    aVar9.K(-1724513046);
                    us2Var = z1o.a(donutPriceTemplate, null, aVar9, 1);
                }
                aVar9.j();
                if (us2Var == null) {
                    aVar9.K(-1724511062);
                    us2Var = ws2.b(previewBadge.b, aVar9, 0);
                    aVar9.j();
                } else {
                    aVar9.K(-1724513635);
                    aVar9.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar9.j();
                return us2Var;
            default:
                ((Integer) obj2).getClass();
                his0.b(ne7.I(7), (androidx.compose.runtime.a) obj, (jai) obj3);
                return s3q0.a;
        }
    }

    public /* synthetic */ i(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
