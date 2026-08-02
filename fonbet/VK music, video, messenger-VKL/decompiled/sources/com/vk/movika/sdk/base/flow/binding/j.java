package com.vk.movika.sdk.base.flow.binding;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.widget.ProgressBar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.catalog2.feature.music.holders.search.SearchHistoryItemVh;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.g;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.polls.Poll;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.log.L;
import com.vk.movika.sdk.base.ui.l0;
import com.vk.movika.sdk.base.ui.y;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.qrcode.QRStatsTracker;
import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;
import org.json.JSONObject;
import xsna.b2c0;
import xsna.b4;
import xsna.b7d0;
import xsna.b9a0;
import xsna.bex0;
import xsna.c57;
import xsna.cqi;
import xsna.cvk;
import xsna.d80;
import xsna.dhr0;
import xsna.dm20;
import xsna.dw20;
import xsna.e25;
import xsna.eqd;
import xsna.fee;
import xsna.fpc;
import xsna.fq60;
import xsna.fzc;
import xsna.g9m0;
import xsna.gq60;
import xsna.gvw0;
import xsna.gzs;
import xsna.ine0;
import xsna.izs;
import xsna.jun0;
import xsna.k740;
import xsna.k930;
import xsna.l7s;
import xsna.l7v;
import xsna.lpj;
import xsna.mkl;
import xsna.nme;
import xsna.nvn0;
import xsna.o6a0;
import xsna.o740;
import xsna.o9t;
import xsna.p7y;
import xsna.pw;
import xsna.qi6;
import xsna.s3q0;
import xsna.so20;
import xsna.tbj0;
import xsna.tmh;
import xsna.ume0;
import xsna.v19;
import xsna.v1m0;
import xsna.vmb0;
import xsna.vmh;
import xsna.w7t;
import xsna.x6y;
import xsna.x7t;
import xsna.xjk;
import xsna.xvn0;
import xsna.y2j0;
import xsna.y2p0;
import xsna.yo60;
import xsna.ys8;
import xsna.z4d0;
import xsna.z4g;
import xsna.zhf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        DonutVideoUiModel.PreviewBadge previewBadge;
        DonutVideoAction donutVideoAction;
        ProgressBar clipsGestureProgress;
        UserId userId;
        int i = this.b;
        Object obj = null;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.player.base.observable.c) obj3).j((i) obj2);
                break;
            case 1:
                ((y) obj3).d.r.u(((l0) obj2).j);
                break;
            case 2:
                DonutVideoUiModel donutVideoUiModel = (DonutVideoUiModel) obj3;
                x.b bVar = (x.b) obj2;
                if (donutVideoUiModel != null && (previewBadge = donutVideoUiModel.b) != null && (donutVideoAction = previewBadge.e) != null) {
                    bVar.l.d(new b4.p(donutVideoAction));
                }
                break;
            case 3:
                izs izsVar = (izs) obj2;
                Subscription a = ((ys8) obj3).a();
                if (a != null) {
                    izsVar.invoke(a);
                }
                break;
            case 4:
                v19 v19Var = (v19) obj3;
                com.vk.contacts.d.a.P0(v19Var.b, false, new pw(2, v19Var, (com.vk.movika.sdk.base.model.e) obj2), null);
                break;
            case 5:
                CameraUIView cameraUIView = (CameraUIView) obj3;
                float f = CameraUIView.w1;
                ClipsControlsView clipsControls = cameraUIView.getClipsControls();
                if (clipsControls != null && (clipsGestureProgress = clipsControls.getClipsGestureProgress()) != null) {
                    clipsGestureProgress.setVisibility(8);
                }
                io.reactivex.rxjava3.disposables.c cVar = cameraUIView.a1;
                if (cVar != null) {
                    cVar.dispose();
                }
                cameraUIView.a1 = null;
                cvk.u(R.string.clips_gesture_detector_loading_failed, false);
                L.j(((com.vk.ml.g) obj2).b, cqi.c(obj2, "load failed: "));
                break;
            case 6:
                ((com.vk.channels.impl.list.f) obj3).O(new e.m(((g.C0539g) obj2).a));
                break;
            case 7:
                ((izs) obj3).invoke(new fpc.d(((xjk) obj2).a));
                break;
            case 8:
                ((eqd) ((d80) obj3).b).invoke((e25) obj2);
                break;
            case 9:
                vmh vmhVar = (vmh) obj3;
                GroupMarketInfo.MarketAvitoBadge.Status status = ((GroupMarketInfo.MarketAvitoBadge) obj2).d;
                Integer valueOf = status != null ? Integer.valueOf(status.h()) : null;
                tmh tmhVar = vmhVar.a;
                dw20 dw20Var = tmhVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                tmhVar.d.invoke(new CommunityProfileAction.e.d.C1581d(valueOf));
                break;
            case 10:
                break;
            case 11:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj2;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj3).b.iterator();
                while (it.hasNext()) {
                    it.next().v(oneVideoPlayer);
                }
                break;
            case 12:
                ((l7v) obj3).d.remove((String) obj2);
                break;
            case 13:
                break;
            case 14:
                p7y p7yVar = (p7y) obj2;
                x6y x6yVar = p7yVar.a;
                if (c57.c((Activity) obj3).a(255) == 0) {
                    boolean e = p7yVar.e(null);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("result", e);
                    bex0.a.b(x6yVar, JsApiMethodType.SECURE_TOKEN_REMOVE, jSONObject, null, 12);
                } else {
                    x6yVar.A(JsApiMethodType.SECURE_TOKEN_REMOVE, VkAppsErrors.Client.i(VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, 7));
                }
                break;
            case 15:
                dm20 dm20Var = (dm20) obj3;
                fq60 fq60Var = (fq60) dm20Var.d.getValue();
                gq60 gq60Var = dm20Var.e;
                fq60Var.getClass();
                fq60.c((yo60.j) obj2, gq60Var);
                break;
            case 16:
                so20 so20Var = (so20) obj3;
                so20.a aVar = (so20.a) obj2;
                gvw0 gvw0Var = so20Var.b;
                if (gvw0Var.d()) {
                    so20Var.a(aVar);
                } else {
                    gvw0Var.getClass();
                    com.vk.voip.ui.c.b.B(false);
                    so20Var.a(aVar);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            case 17:
                nme.a(MobileOfficialAppsClipsStat$ClipsExtendedFeedbackItem.EventSubtype.WITHOUT_REASONS, SchemeStat$TypeClipViewerItem.EventType.UNHIDE, fzc.b(((nme) obj3).a), ((k930.a) obj2).d);
                break;
            case 18:
                ((izs) obj3).invoke(new k740.c(((o740) obj2).a));
                break;
            case 19:
                o6a0 o6a0Var = (o6a0) obj3;
                break;
            case 20:
                ((com.vk.photos.root.photoflow.presentation.b) obj3).h.b(new b9a0.d.b((String) obj2));
                break;
            case 21:
                b2c0 b2c0Var = (b2c0) obj3;
                int layoutPosition = ((qi6) obj2).getLayoutPosition();
                RecyclerView.o layoutManager = b2c0Var.d.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer valueOf2 = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.v()) : null;
                if (valueOf2 != null && layoutPosition == valueOf2.intValue()) {
                    int i2 = layoutPosition - 1;
                    b2c0Var.d.scrollToPosition(i2 >= 0 ? i2 : 0);
                }
                break;
            case 22:
                b7d0 b7d0Var = (b7d0) obj3;
                ine0 ine0Var = b7d0Var.F;
                Context context = b7d0Var.itemView.getContext();
                vmb0 vmb0Var = b7d0Var.E;
                ine0Var.getClass();
                AttachmentInfo e2 = vmb0Var.a().u().e((Poll) ((mkl) obj2).b);
                ActionsInfo h = vmb0Var.a().v().h();
                tbj0 a2 = vmb0Var.a().F2().a(context);
                a2.c = e2;
                a2.d = h;
                a2.c();
                break;
            case 23:
                ((izs) obj3).invoke(new o9t.m(x7t.a((w7t) obj2)));
                break;
            case 24:
                z4g.d().i((Activity) obj3, null, ((UserProfile) obj2).c.b, false);
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.SEND_MESSAGE);
                break;
            case 25:
                SearchHistoryItemVh searchHistoryItemVh = (SearchHistoryItemVh) obj3;
                UIBlockSearchHistory<?> uIBlockSearchHistory = searchHistoryItemVh.d;
                Context context2 = ((ComposeView) obj2).getContext();
                if (uIBlockSearchHistory != null && context2 != null) {
                    searchHistoryItemVh.c.z(0, uIBlockSearchHistory);
                    searchHistoryItemVh.a(uIBlockSearchHistory, context2);
                }
                break;
            case 26:
                Context context3 = (Context) obj3;
                g9m0 g9m0Var = (g9m0) obj2;
                lpj lpjVar = context3 instanceof lpj ? (lpj) context3 : null;
                Integer valueOf3 = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i3 = dhr0.u().c;
                if (valueOf3 == null || valueOf3.intValue() != i3) {
                    context3 = new l7s(context3, dhr0.u().c);
                }
                ((dw20.b) dw20.a.Q(new dw20.b(context3, null).M(R.drawable.vk_icon_lock_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).h0(R.string.story_privacy_open_profile, new ume0(6, g9m0Var, context3)).v0(R.string.story_privacy_for_all_closed_hint), R.string.story_privacy_open_profile_hint)).I0("AccountBottomSheet");
                break;
            case 27:
                izs izsVar2 = (izs) obj2;
                Iterator<T> it2 = ((y2j0.a) ((y2j0) obj3)).d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (((xvn0) next).f != null) {
                            obj = next;
                        }
                    }
                }
                xvn0 xvn0Var = (xvn0) obj;
                if (xvn0Var != null && (userId = xvn0Var.f) != null) {
                    nvn0.o.getClass();
                    izsVar2.invoke(new jun0.e(nvn0.r, userId));
                }
                break;
            default:
                y2p0 y2p0Var = (y2p0) obj3;
                y2p0.a aVar2 = (y2p0.a) obj2;
                fee feeVar = y2p0Var.a;
                VkTopBar vkTopBar = y2p0Var.b;
                zhf0 rightExtraRect = vkTopBar.getRightExtraRect();
                feeVar.c2(vkTopBar, new Rect((int) rightExtraRect.a, (int) rightExtraRect.b, (int) rightExtraRect.c, (int) rightExtraRect.d), ((y2p0.a.C4071a) aVar2).a, new z4d0(y2p0Var, aVar2));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ j(v1m0 v1m0Var, Context context, g9m0 g9m0Var) {
        this.b = 26;
        this.c = context;
        this.d = g9m0Var;
    }
}
