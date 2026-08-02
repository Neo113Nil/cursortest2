package com.vk.movika.sdk.base.model;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.clips.edit.editor.ClipsChoosePreviewActivity;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.community.strikes.api.di.CommunityStrikesComponent;
import com.vk.dto.stories.model.clickable.ClickableQuestion;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.log.L;
import com.vk.medianative.MediaNative;
import com.vk.newsfeed.posting.action_button.presentation.ActionButtonsFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.ui.settings.CallParticipantsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.api.interceptor.MethodListenerInterceptor;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import xsna.azb;
import xsna.bwt0;
import xsna.c99;
import xsna.ccr0;
import xsna.dhr0;
import xsna.dw20;
import xsna.eq4;
import xsna.fpf0;
import xsna.fq4;
import xsna.g5g;
import xsna.gzs;
import xsna.hg1;
import xsna.i4h;
import xsna.isc;
import xsna.j5g;
import xsna.j5i;
import xsna.jbl;
import xsna.k7m;
import xsna.kj30;
import xsna.l50;
import xsna.lx4;
import xsna.m7m;
import xsna.m99;
import xsna.mf1;
import xsna.mtk0;
import xsna.mwg;
import xsna.nce;
import xsna.nqj;
import xsna.o1d;
import xsna.o7d;
import xsna.pb6;
import xsna.qcy;
import xsna.qsg;
import xsna.roe;
import xsna.s3q0;
import xsna.tp0;
import xsna.tsu;
import xsna.u1j;
import xsna.u6e;
import xsna.urh0;
import xsna.vs;
import xsna.w29;
import xsna.wyb;
import xsna.x65;
import xsna.xyb;
import xsna.yvg;
import xsna.zx0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        MethodListenerInterceptor loginApiInterceptor_delegate$lambda$0;
        int i = this.b;
        Object[] objArr = 0;
        int i2 = 7;
        Object obj = this.c;
        switch (i) {
            case 0:
                f fVar = (f) obj;
                List<j> list = fVar.j;
                ArrayList arrayList = fVar.g;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5g.y(((g) it.next()).f, arrayList2);
                }
                return j5g.u0(arrayList2, list);
            case 1:
                qcy<Object>[] qcyVarArr = ActionButtonsFragment.U;
                return ((InfoBridgeComponent) m7m.d((ActionButtonsFragment) obj).a(fpf0.a(InfoBridgeComponent.class))).t().b();
            case 2:
                loginApiInterceptor_delegate$lambda$0 = ApiModuleImpl.loginApiInterceptor_delegate$lambda$0((ApiModuleImpl) obj);
                return loginApiInterceptor_delegate$lambda$0;
            case 3:
                return new eq4(new fq4((lx4) obj));
            case 4:
                ((jbl) ((x65) obj)).b.finish();
                return s3q0.a;
            case 5:
                return pb6.P4((pb6) obj);
            case 6:
                Pattern pattern = BoardTopicViewFragment.H0;
                return ((CommunityStrikesComponent) m7m.d((BoardTopicViewFragment) obj).a(fpf0.a(CommunityStrikesComponent.class))).ge();
            case 7:
                dw20 dw20Var = ((com.vk.newsfeed.impl.posting.viewpresenter.bottom.attachment.d) obj).j;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 8:
                com.vk.voip.call_effects.a aVar = (com.vk.voip.call_effects.a) obj;
                if (MediaNative.isCallEffectsSupported()) {
                    aVar.f.onNext(CallEffectsDependency.DynamicLibsState.LOADED);
                } else {
                    L.l("CallEffectsDependencyImpl", "Failed to attach CALL_EFFECTS (TFLite + GLEffects) libraries");
                    aVar.f.onNext(CallEffectsDependency.DynamicLibsState.ERROR);
                }
                return s3q0.a;
            case 9:
                int i3 = CallParticipantsFragment.W;
                ((m99) obj).b(c99.e0.a);
                return s3q0.a;
            case 10:
                return (ClipsEntryPointsComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.util.a) obj)).mo408a(fpf0.a(ClipsEntryPointsComponent.class));
            case 11:
                azb azbVar = (azb) obj;
                azbVar.a().a();
                tsu tsuVar = azbVar.k;
                if (tsuVar != null) {
                    xyb xybVar = (xyb) tsuVar.b;
                    if (!hg1.d(xybVar.s)) {
                        xybVar.s = new io.reactivex.rxjava3.internal.operators.single.j(new io.reactivex.rxjava3.internal.operators.single.n(xybVar.l.b(xybVar, new kj30(xybVar.q.a.f, false, false, false, xyb.D, 44)).m(io.reactivex.rxjava3.android.schedulers.a.b()), new mf1(new com.vk.voip.ui.menu.feature.a(xybVar, 20), i2)), new wyb(xybVar, objArr == true ? 1 : 0)).subscribe(new l50(new vs(xybVar, 17), 9), new tp0(new zx0(xybVar, 21), 8));
                    }
                }
                return s3q0.a;
            case 12:
                List<ClickableSticker> list2 = ((ClickableStickers) obj).d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof ClickableQuestion) {
                        arrayList3.add(obj2);
                    }
                }
                return arrayList3;
            case 13:
                qcy<Object>[] qcyVarArr2 = isc.t1;
                ((isc) obj).dismiss();
                return s3q0.a;
            case 14:
                int i4 = ClipFeedListFragment.a2;
                return ((ClipsPlaylistsComponent) m7m.d((ClipFeedListFragment) obj).mo408a(fpf0.a(ClipsPlaylistsComponent.class))).N9();
            case 15:
                return o1d.A((o1d) obj);
            case 16:
                return new urh0(((ClipSearchRootVh) obj).z);
            case 17:
                return ((StoriesComponent) ((k7m) m7m.f((com.vk.clips.upload.vk.impl.uploader.b) obj)).a(fpf0.a(StoriesComponent.class))).S9();
            case 18:
                int i5 = ClipsChoosePreviewActivity.y;
                return ((CameraClipsComponent) m7m.a((ClipsChoosePreviewActivity) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 19:
                return ((u6e) obj).f.p.a;
            case 20:
                return Boolean.valueOf(((nce) obj).j.invoke().intValue() > 1);
            case 21:
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a = ((roe) obj).a();
                aVar2.getClass();
                return ClipsWrapperInputArguments.a.d(a);
            case 22:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                return new o7d(clipsViewerComponentImpl.b.getExperiments(), clipsViewerComponentImpl.pe(), clipsViewerComponentImpl.Y(), clipsViewerComponentImpl.c.d6(), (ClipsViewersSdkComponentImpl) clipsViewerComponentImpl.f);
            case 23:
                ((qsg) obj).k.a();
                return s3q0.a;
            case 24:
                return new mwg(((yvg) obj).l);
            case 25:
                j5i j5iVar = (j5i) obj;
                ccr0 ccr0Var = new ccr0(j5iVar.itemView.getContext());
                int i6 = j5iVar.e0;
                ccr0Var.m = i6;
                ccr0Var.n = i6;
                ccr0Var.setColorFilter(new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_medium), PorterDuff.Mode.SRC_IN));
                ccr0Var.q(j5iVar.G);
                return ccr0Var;
            case 26:
                u1j u1jVar = (u1j) obj;
                View findViewById = u1jVar.findViewById(R.id.open_rooms_button);
                bwt0.i0(findViewById, new i4h(u1jVar, i2));
                return findViewById;
            case 27:
                return (List) ((mtk0) obj).getValue();
            default:
                nqj nqjVar = (nqj) obj;
                nqjVar.a(true);
                Handler handler = nqjVar.a;
                String str = nqjVar.b;
                handler.removeCallbacksAndMessages(str);
                handler.postDelayed(new w29(nqjVar, 3), str, 5000L);
                return s3q0.a;
        }
    }
}
