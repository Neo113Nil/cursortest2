package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.search.MovieSearchSuggestionVh;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VkPlaceholderVideoGrowthVh;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b;
import com.vk.clips.edit.impl.deps.features.ClipEditVkFeatures;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkComponent;
import com.vk.core.compose.component.alert.Alert$DismissReason;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.autoplay.b;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.ui.u0;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.common.js.bridge.api.events.GyroscopeStop$Response;
import com.vk.video.growth.api.CommunityGrowthTrapEvent;
import com.vk.video.growth.api.CommunityGrowthTrapScreen;
import com.vk.video.ui.albums.fragments.VideoAlbumFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import xsna.a1w;
import xsna.aka0;
import xsna.bpn0;
import xsna.e43;
import xsna.eeu0;
import xsna.epx;
import xsna.f4z;
import xsna.fxc0;
import xsna.g5g;
import xsna.gg1;
import xsna.gzs;
import xsna.hg40;
import xsna.hwe;
import xsna.i4y;
import xsna.izs;
import xsna.j5g;
import xsna.jbs;
import xsna.jf30;
import xsna.m0x;
import xsna.mb90;
import xsna.mba;
import xsna.mc90;
import xsna.mj80;
import xsna.myc0;
import xsna.n0d;
import xsna.ojh0;
import xsna.pjl0;
import xsna.q610;
import xsna.qgp0;
import xsna.rv9;
import xsna.rvd;
import xsna.rw40;
import xsna.s16;
import xsna.s2f;
import xsna.s3q0;
import xsna.sos0;
import xsna.sw7;
import xsna.tho0;
import xsna.u710;
import xsna.us1;
import xsna.vrm;
import xsna.w4p0;
import xsna.wh50;
import xsna.wqs0;
import xsna.xim;
import xsna.xl40;
import xsna.xn50;
import xsna.xq8;
import xsna.y1e;
import xsna.ydt0;
import xsna.yof;
import xsna.yvj;
import xsna.zak0;
import xsna.zn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$33;
        int i = this.b;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) obj2;
                Chapter chapter = (Chapter) obj;
                String str = fVar.a;
                List m = e43.m(com.vk.movika.sdk.base.model.m.b(fVar));
                ArrayList arrayList = fVar.g;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5g.y(((com.vk.movika.sdk.base.model.g) it.next()).f, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (com.vk.movika.sdk.utils.h.a(((com.vk.movika.sdk.base.model.j) next).a, "onSuspense")) {
                        arrayList3.add(next);
                    }
                }
                ArrayList u0 = j5g.u0(arrayList3, m);
                String str2 = chapter.a;
                String str3 = fVar.b;
                StringBuilder sb = new StringBuilder("processContainerTimeout: \tcontainer.id = ");
                sb.append(str);
                sb.append(", onSuspense = ");
                sb.append(u0);
                sb.append("\n\tcurrentChapter.id = ");
                break;
            case 1:
                break;
            case 2:
                ((gg1) obj2).C(a.d.a((a.d) obj));
                break;
            case 3:
                int i2 = AlbumDetailsFragment.p0;
                xn50.a.c((AlbumDetailsFragment) obj2, new a.j.AbstractC1478a.C1479a((List) obj));
                break;
            case 4:
                us1 us1Var = (us1) obj;
                eeu0.a aVar = new eeu0.a((Context) obj2, R.style.VkAlertDialogNewTheme);
                Boolean bool = (Boolean) ((zak0) us1Var.c).getValue();
                Boolean bool2 = Boolean.TRUE;
                if (epx.f(bool, bool2)) {
                    aVar.setTitle(((tho0) ((zak0) us1Var.d).getValue()).a.c);
                }
                if (epx.f((Boolean) ((zak0) us1Var.e).getValue(), bool2)) {
                    aVar.a.f = ((tho0) ((zak0) us1Var.f).getValue()).a.c;
                }
                if (epx.f((Boolean) ((zak0) us1Var.g).getValue(), bool2)) {
                    aVar.f(((tho0) ((zak0) us1Var.h).getValue()).a.c, null);
                }
                aVar.j(((tho0) ((zak0) us1Var.i).getValue()).a.c, null);
                aVar.m();
                break;
            case 5:
                ((izs) obj2).invoke(new rv9.i.h((a.C0919a) obj));
                break;
            case 6:
                ChatFragment chatFragment = (ChatFragment) obj2;
                Peer peer = (Peer) obj;
                ChatFragment.d dVar = ChatFragment.w1;
                a1w jo = chatFragment.jo();
                DialogExt dialogExt = chatFragment.V;
                jo.D(chatFragment, new vrm((dialogExt != null ? dialogExt : null).f, new vrm.a.b(peer)));
                break;
            case 7:
                com.vk.clips.sdk.shared.item.clip.a aVar2 = (com.vk.clips.sdk.shared.item.clip.a) obj2;
                f4z f4zVar = aVar2.z;
                m0x m0xVar = aVar2.k;
                s16 s16Var = aVar2.l;
                ojh0 ojh0Var = aVar2.n;
                zn50 zn50Var = aVar2.o;
                n0d n0dVar = aVar2.g;
                y1e y1eVar = aVar2.p;
                gzs<Boolean> gzsVar = aVar2.r;
                izs<String, Boolean> izsVar = aVar2.s;
                izs<String, Boolean> izsVar2 = aVar2.t;
                yof yofVar = aVar2.i;
                break;
            case 8:
                ((izs) obj2).invoke(new ClipListView.b.C0463b(((ClipListView.c) obj).b));
                break;
            case 9:
                Set set = (Set) obj;
                rvd rvdVar = new rvd(((ClipsUploadUiVkComponent) obj2).V0());
                if (set.contains(ClipEditVkFeatures.TrendingHashtags) || set.contains(ClipEditVkFeatures.All)) {
                    break;
                }
                break;
            case 10:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                b.C1208b.a().e(((s2f) ((hwe) obj2).c.getValue()).a((SdkVideoFile) obj), null).B0().start();
                break;
            case 11:
                break;
            case 12:
                invoke$lambda$33 = HandleInvocationsFromAdViewer.invoke$lambda$33((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                break;
            case 13:
                i4y i4yVar = (i4y) obj2;
                String str4 = (String) obj;
                try {
                    io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) i4yVar.a;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    i4yVar.a = null;
                    com.vk.superapp.base.js.bridge.b.p(i4yVar.b.a, new JsMethod("VKWebAppGyroscopeStop"), new GyroscopeStop$Response(null, new GyroscopeStop$Response.Data(true, str4), str4, 1, null), null, null, false, null, 60);
                } catch (Throwable th) {
                    i4yVar.c.j(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, th.getMessage(), null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), str4, 1, null));
                }
                break;
            case 14:
                u710 u710Var = (u710) obj;
                ((izs) obj2).invoke(new q610.a(u710Var.d, u710Var.c, 0, true, true, 4));
                break;
            case 15:
                ydt0 ydt0Var = ((MovieSearchSuggestionVh) obj2).b;
                ((LayoutInflater) obj).getContext();
                ydt0Var.getClass();
                break;
            case 16:
                ((rw40) obj2).A.U((hg40) obj);
                break;
            case 17:
                ((izs) obj2).invoke((OfflinePodcastEpisodesMviState.SortType) obj);
                break;
            case 18:
                ((wh50) obj2).setValue(Boolean.TRUE);
                ((wh50) obj).setValue(Boolean.FALSE);
                break;
            case 19:
                mj80 mj80Var = (mj80) obj;
                mj80Var.e.invoke().post(new xq8(2, mj80Var, new sw7(1, (u0) obj2)));
                break;
            case 20:
                mc90 mc90Var = (mc90) obj2;
                yvj yvjVar = (yvj) obj;
                if (mc90Var.c()) {
                    myc0.h(yvjVar, null, null, new mb90(mc90Var, null), 3);
                    z = true;
                }
                break;
            case 21:
                ((aka0) obj2).a((aka0.b) obj);
                break;
            case 22:
                int i3 = PodcastEpisodeFragment.u0;
                xl40 xl40Var = (xl40) ((PodcastEpisodeFragment) obj2).o0.getValue();
                xl40.a aVar3 = xl40.a;
                xl40Var.a((FragmentActivity) obj);
                break;
            case 23:
                ((izs) obj2).invoke((b.a) obj);
                break;
            case 24:
                ((izs) obj2).invoke(new pjl0(((w4p0) obj).a));
                break;
            case 25:
                qgp0 qgp0Var = (qgp0) obj2;
                UserId userId = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId.b});
                }
                break;
            case 26:
                VideoAlbumFragment videoAlbumFragment = (VideoAlbumFragment) obj2;
                VideoAlbumFragment videoAlbumFragment2 = (VideoAlbumFragment) obj;
                if (videoAlbumFragment.d1 != null) {
                    fxc0.B().Y().F(videoAlbumFragment.e1, new jbs(videoAlbumFragment2));
                }
                break;
            case 27:
                ((izs) obj2).invoke(new wqs0.p.a((BlockId.CompositeId) obj));
                break;
            case 28:
                izs izsVar3 = (izs) obj;
                if (((xim) obj2).a) {
                    izsVar3.invoke(Alert$DismissReason.BACK_PRESS);
                }
                break;
            default:
                VkPlaceholderVideoGrowthVh vkPlaceholderVideoGrowthVh = (VkPlaceholderVideoGrowthVh) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                sos0 sos0Var = vkPlaceholderVideoGrowthVh.c;
                if (sos0Var != null) {
                    sos0Var.e(CommunityGrowthTrapScreen.VIDEO_GROUP_MAIN, CommunityGrowthTrapEvent.BANNER);
                }
                mba mbaVar = vkPlaceholderVideoGrowthVh.b;
                if (mbaVar != null) {
                    VkBanner vkBanner = vkPlaceholderVideoGrowthVh.d;
                    mbaVar.z((vkBanner != null ? vkBanner : null).getId(), uIBlock);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ c(MovieSearchSuggestionVh movieSearchSuggestionVh, LayoutInflater layoutInflater, jf30 jf30Var) {
        this.b = 15;
        this.c = movieSearchSuggestionVh;
        this.d = layoutInflater;
    }
}
