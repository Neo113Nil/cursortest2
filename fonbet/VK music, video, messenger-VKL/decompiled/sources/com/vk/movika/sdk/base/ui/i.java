package com.vk.movika.sdk.base.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.ui.mvp.holder.group.CommunitiesCatalogRootVh;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.tools.VkViewStub;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.bonus.StickersBonusReward;
import com.vk.ecomm.clipproductattaches.di.ClipProductAttachesComponent;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.a;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.permission.PermissionHelper;
import com.vk.photoviewer.PhotoViewer;
import com.vk.profile.community.impl.ui.trust_mark.CommunityTrustMarksArgs;
import com.vk.profile.community.impl.ui.trust_mark.c;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vk.qrcode.QRStatsTracker;
import com.vk.search.communities.map.api.router.SearchCommunitiesOnMapRouter;
import com.vk.search.communities.map.api.router.SearchMapPreviewStateWrapper;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.vk.superapp.dating.sdk.js.bridge.api.events.NavigateToSettings$Parameters;
import com.vk.voip.OKVoipEngine;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.a60;
import xsna.b11;
import xsna.b4y;
import xsna.b7q;
import xsna.bug0;
import xsna.bz60;
import xsna.cgt;
import xsna.d3h;
import xsna.d4h;
import xsna.dhw0;
import xsna.f24;
import xsna.f3c;
import xsna.fpc;
import xsna.fpf0;
import xsna.fvv0;
import xsna.fw00;
import xsna.fw3;
import xsna.gzs;
import xsna.hjf;
import xsna.i6w;
import xsna.i9z;
import xsna.il90;
import xsna.io70;
import xsna.izs;
import xsna.jjc;
import xsna.k7m;
import xsna.keq0;
import xsna.kl90;
import xsna.l0u0;
import xsna.l6w;
import xsna.lbf;
import xsna.lqg;
import xsna.m20;
import xsna.m7;
import xsna.m7m;
import xsna.o1d;
import xsna.o6a0;
import xsna.p1;
import xsna.p550;
import xsna.p7w;
import xsna.pi40;
import xsna.pp3;
import xsna.pt10;
import xsna.q8z;
import xsna.qef;
import xsna.qmk0;
import xsna.r2c;
import xsna.r6y;
import xsna.r7t;
import xsna.rjo0;
import xsna.rmh;
import xsna.rq3;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sns0;
import xsna.tfx;
import xsna.us2;
import xsna.v8l0;
import xsna.viu;
import xsna.w2y;
import xsna.x7l0;
import xsna.xdw0;
import xsna.xjk;
import xsna.xwk;
import xsna.xyh0;
import xsna.y2p0;
import xsna.yfb;
import xsna.z63;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v115, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        long longValue;
        String str;
        xdw0 xdw0Var;
        sns0 sns0Var;
        PostingUserMessage postingUserMessage;
        ByteStringDataSource initialize$lambda$220$lambda$17;
        i9z i9zVar;
        int i = 2;
        Long l = null;
        l = null;
        switch (this.b) {
            case 0:
                y yVar = (y) this.c;
                Chapter chapter = (Chapter) this.d;
                Long r = yVar.r.d.a.r();
                if (r != null) {
                    longValue = r.longValue();
                } else {
                    com.vk.movika.sdk.base.model.s sVar = yVar.j;
                    if (sVar != null) {
                        com.vk.movika.sdk.base.model.v vVar = (com.vk.movika.sdk.base.model.v) sVar.g.get(chapter != null ? chapter.b : null);
                        if (vVar != null) {
                            l = vVar.b;
                        }
                    }
                    longValue = l != null ? l.longValue() : Long.MAX_VALUE;
                }
                return Long.valueOf(longValue);
            case 1:
                BonusCatalogFragment bonusCatalogFragment = (BonusCatalogFragment) this.c;
                StickersBonusReward stickersBonusReward = (StickersBonusReward) this.d;
                int i2 = BonusCatalogFragment.f0;
                if (stickersBonusReward.h) {
                    v8l0 eo = bonusCatalogFragment.eo();
                    String str2 = stickersBonusReward.b;
                    eo.a.getClass();
                    tfx tfxVar = new tfx("store.getStickersBonusRewardTerms", new qmk0(i), new bz60(10));
                    tfx.o(tfxVar, "reward_id", str2, 0, 0, 12);
                    bug0.d(rsg0.T(yfb.x(tfxVar)).U(new pi40(new viu(eo), 9)).a0(io.reactivex.rxjava3.android.schedulers.a.b()), bonusCatalogFragment.mo2getContext(), null, 6).subscribe(new pp3(new m7(bonusCatalogFragment, 12), i), new m20(new a60(8), 7));
                }
                return s3q0.a;
            case 2:
                VkViewStub vkViewStub = (VkViewStub) this.c;
                b11 b11Var = (b11) this.d;
                ClipActionButton clipActionButton = new ClipActionButton(vkViewStub.getContext());
                jjc.g(clipActionButton, new p1(b11Var, 3));
                return clipActionButton;
            case 3:
                ((izs) this.c).invoke(new AuthorHeaderEvent.Info.b(((AuthorHeaderConfig.Info.InfoSlotData.d) ((zak0) ((rq3) this.d).a).getValue()).a));
                return s3q0.a;
            case 4:
                BaseVideoPlayer baseVideoPlayer = (BaseVideoPlayer) this.c;
                OneVideoPlayer.f fVar = (OneVideoPlayer.f) this.d;
                return "removeTransferListener() - count= " + baseVideoPlayer.n.a.size() + " listener= " + fVar;
            case 5:
                ChatClipsReplyFragment chatClipsReplyFragment = (ChatClipsReplyFragment) this.c;
                View view = (View) this.d;
                int i3 = ChatClipsReplyFragment.T;
                chatClipsReplyFragment.ho(view);
                return s3q0.a;
            case 6:
                ((izs) this.c).invoke(new r2c.n(((f3c) this.d).f));
                return s3q0.a;
            case 7:
                ((izs) this.c).invoke(new fpc.d(((xjk) this.d).a));
                return s3q0.a;
            case 8:
                o1d o1dVar = (o1d) this.c;
                Context context = (Context) this.d;
                ClipProductAttachesComponent clipProductAttachesComponent = (ClipProductAttachesComponent) ((k7m) m7m.f(o1dVar)).mo408a(fpf0.a(ClipProductAttachesComponent.class));
                ClipProductAttachesComponent.Companion companion = ClipProductAttachesComponent.Companion;
                return clipProductAttachesComponent.C0(context, true, f24.a.a);
            case 9:
                hjf hjfVar = (hjf) this.c;
                qef.f0 f0Var = (qef.f0) this.d;
                String str3 = ClipsUploadFragmentImpl.a0;
                hjfVar.b(new lbf.a.c(f0Var.c));
                return s3q0.a;
            case 10:
                CommunitiesCatalogRootVh communitiesCatalogRootVh = (CommunitiesCatalogRootVh) this.c;
                xyh0 xyh0Var = (xyh0) this.d;
                SearchCommunitiesOnMapRouter searchCommunitiesOnMapRouter = (SearchCommunitiesOnMapRouter) communitiesCatalogRootVh.E.getValue();
                Activity activity = communitiesCatalogRootVh.b;
                String str4 = communitiesCatalogRootVh.B.e;
                if (str4 == null) {
                    str4 = "";
                }
                SearchMapPreviewStateWrapper searchMapPreviewStateWrapper = new SearchMapPreviewStateWrapper(xyh0Var.b);
                SearchCommunitiesOnMapRouter.MapEntrypoint mapEntrypoint = SearchCommunitiesOnMapRouter.MapEntrypoint.SearchInService;
                String V = communitiesCatalogRootVh.R.V();
                searchCommunitiesOnMapRouter.a(activity, str4, searchMapPreviewStateWrapper, mapEntrypoint, V == null ? "" : V);
                return s3q0.a;
            case 11:
                d4h d4hVar = (d4h) this.c;
                lqg lqgVar = (lqg) this.d;
                d3h d3hVar = (d3h) d4hVar.c.invoke();
                UserId userId = lqgVar.b;
                rmh rmhVar = d3hVar.f;
                rmhVar.b.a().c(rmhVar.a, new z63(rmhVar, userId, "onboarding_2025", 5));
                return s3q0.a;
            case 12:
                ((izs) this.c).invoke(new c.a(((CommunityTrustMarksArgs.ActionButton) this.d).b));
                return s3q0.a;
            case 13:
                fw00 fw00Var = (fw00) this.c;
                b7q b7qVar = (b7q) this.d;
                fw00Var.invoke();
                b7qVar.f = false;
                b7qVar.k();
                return s3q0.a;
            case 14:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().f(oneVideoPlayer);
                }
                return s3q0.a;
            case 15:
                ((cgt) this.c).c.invoke((r7t) this.d);
                return s3q0.a;
            case 16:
                ((p7w) this.c).d.invoke(new i6w.h(((l6w.b.j) ((l6w.b) this.d)).a));
                return s3q0.a;
            case 17:
                b4y b4yVar = (b4y) this.c;
                NavigateToSettings$Parameters.Type type = (NavigateToSettings$Parameters.Type) this.d;
                Context context2 = ((r6y) b4yVar.b.c).l;
                int i4 = b4y.a.$EnumSwitchMapping$0[type.ordinal()];
                if (i4 == 1) {
                    str = "android.settings.APPLICATION_DETAILS_SETTINGS";
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "android.settings.VPN_SETTINGS";
                }
                Intent intent = new Intent(str);
                if (str.equals("android.settings.APPLICATION_DETAILS_SETTINGS")) {
                    StringBuilder sb = new StringBuilder("package:");
                    sb.append(context2 != null ? context2.getPackageName() : null);
                    intent.setData(Uri.parse(sb.toString()));
                }
                intent.addFlags(268435456);
                if (context2 != null) {
                    context2.startActivity(intent);
                }
                return s3q0.a;
            case 18:
                return new w2y((r6y) this.c, (fvv0) this.d);
            case 19:
                FragmentImpl fragmentImpl = (FragmentImpl) this.c;
                pt10 pt10Var = (pt10) this.d;
                PermissionHelper permissionHelper = PermissionHelper.a;
                Context requireContext = fragmentImpl.requireContext();
                String[] strArr = PermissionHelper.c;
                permissionHelper.getClass();
                pt10Var.m().b(new a.k(!PermissionHelper.c(requireContext, strArr)));
                return s3q0.a;
            case 20:
                p550 p550Var = (p550) this.c;
                l0u0 l0u0Var = (l0u0) this.d;
                x7l0 x7l0Var = x7l0.b;
                return x7l0.a(p550Var.j, l0u0Var.c.n);
            case 21:
                io70 io70Var = (io70) this.c;
                String str5 = (String) this.d;
                dhw0 dhw0Var = OKVoipEngine.B;
                if (dhw0Var == null || (xdw0Var = dhw0Var.A) == null) {
                    return s3q0.a;
                }
                io70Var.b.invoke(dhw0.a(dhw0Var, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, xdw0.a(xdw0Var, str5, null, 251), null, false, false, 0, null, false, false, false, false, null, null, -67108865, ApiInvocationException.ErrorCodes.IDS_BLOCKED));
                return s3q0.a;
            case 22:
                kl90 kl90Var = (kl90) this.c;
                il90.d dVar = (il90.d) this.d;
                StringBuilder sb2 = new StringBuilder("participantsListeners: ");
                CopyOnWriteArraySet<il90> copyOnWriteArraySet = kl90Var.b;
                L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb2));
                Iterator<il90> it2 = copyOnWriteArraySet.iterator();
                while (it2.hasNext()) {
                    it2.next().s(dVar);
                }
                return s3q0.a;
            case 23:
                o6a0 o6a0Var = (o6a0) this.c;
                return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(o6a0Var.c(), o6a0Var.b.a(), null, (MobileOfficialAppsCorePhotoEditorStat$EditorEvent) this.d, null, null, null, null, null, null, null, null, null, null, null, null, 65520, null);
            case 24:
                ?? r1 = (FunctionReferenceImpl) this.c;
                PhotoViewer.AnimationState animationState = (PhotoViewer.AnimationState) this.d;
                r1.invoke();
                if (animationState.c == PhotoViewer.AnimationState.VideoGifState.PLAY_ON_START_ANIMATION && (sns0Var = animationState.b) != null) {
                    sns0Var.d();
                }
                return s3q0.a;
            case 25:
                izs izsVar = (izs) this.c;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) this.d).c;
                PostingAction.Editing.RemovePhotoTag removePhotoTag = PostingAction.Editing.RemovePhotoTag.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(removePhotoTag);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, removePhotoTag, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 26:
                xwk.d().e().a((Activity) this.c, ((com.vk.qrcode.c) this.d).r());
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_MONEY_TRANSFER);
                return s3q0.a;
            case 27:
                initialize$lambda$220$lambda$17 = ServiceProvider.initialize$lambda$220$lambda$17((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$17;
            case 28:
                us2.d dVar2 = (us2.d) this.c;
                keq0 keq0Var = (keq0) this.d;
                q8z q8zVar = (q8z) dVar2.a;
                if (q8zVar instanceof q8z.b) {
                    i9z i9zVar2 = ((q8z.b) q8zVar).c;
                    if (i9zVar2 != null) {
                        i9zVar2.a(q8zVar);
                    } else {
                        try {
                            keq0Var.a(((q8z.b) q8zVar).a);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } else if ((q8zVar instanceof q8z.a) && (i9zVar = ((q8z.a) q8zVar).c) != null) {
                    i9zVar.a(q8zVar);
                }
                return s3q0.a;
            default:
                ((y2p0) this.c).a.g2(((y2p0.a.d) ((y2p0.a) this.d)).a);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ i(gzs gzsVar, PhotoViewer.AnimationState animationState) {
        this.b = 24;
        this.c = (FunctionReferenceImpl) gzsVar;
        this.d = animationState;
    }

    public /* synthetic */ i(rjo0 rjo0Var, us2.d dVar, keq0 keq0Var) {
        this.b = 28;
        this.c = dVar;
        this.d = keq0Var;
    }
}
