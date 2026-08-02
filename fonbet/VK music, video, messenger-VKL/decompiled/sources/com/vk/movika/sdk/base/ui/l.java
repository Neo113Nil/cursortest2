package com.vk.movika.sdk.base.ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.facebook.soloader.MinElf;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListLargeVh;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemAction;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.dto.stories.model.clickable.ClickableSituationalTemplate;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.media.pipeline.utils.MediaMetadataUtils;
import com.vk.newsfeed.impl.postmodal.comments.CommentsOutherFragment;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingStepScreen;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.qrcode.QRStatsTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.aad0;
import xsna.anm0;
import xsna.asu0;
import xsna.c5g;
import xsna.c6h;
import xsna.de20;
import xsna.dxj0;
import xsna.ee20;
import xsna.f5y;
import xsna.f6m0;
import xsna.fkq0;
import xsna.fpf0;
import xsna.fw3;
import xsna.gd5;
import xsna.gzs;
import xsna.he3;
import xsna.hg1;
import xsna.il90;
import xsna.izs;
import xsna.kjj0;
import xsna.kl90;
import xsna.m7m;
import xsna.mdz;
import xsna.mhl;
import xsna.moq0;
import xsna.n1d;
import xsna.nex;
import xsna.nnf0;
import xsna.o0r0;
import xsna.o1d;
import xsna.o9t;
import xsna.olq0;
import xsna.pli;
import xsna.pn60;
import xsna.qn60;
import xsna.rl3;
import xsna.rsg0;
import xsna.rxp;
import xsna.s290;
import xsna.s3q0;
import xsna.s3w0;
import xsna.s9;
import xsna.slq0;
import xsna.tuz;
import xsna.txf0;
import xsna.ua20;
import xsna.uab0;
import xsna.ubb0;
import xsna.uc2;
import xsna.udt;
import xsna.ulz;
import xsna.vof0;
import xsna.w00;
import xsna.wco0;
import xsna.whg0;
import xsna.wn6;
import xsna.wto0;
import xsna.ww;
import xsna.xim0;
import xsna.xn50;
import xsna.xqu;
import xsna.xwk;
import xsna.y00;
import xsna.yfb;
import xsna.yzq0;
import xsna.z5h;
import xsna.zak0;
import xsna.zgn;
import xsna.zhf0;
import xsna.zim0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0255  */
    /* JADX WARN: Type inference failed for: r1v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ExposedFunction invoke$lambda$24;
        int i;
        String str;
        ReporterType reporterType;
        PostingUserMessage postingUserMessage;
        HashMap<String, Boolean> R;
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                ((y) obj2).d.C.f(((l0) obj).g);
                return s3q0.a;
            case 1:
                zim0 zim0Var = (zim0) obj2;
                ClickableSituationalTemplate clickableSituationalTemplate = (ClickableSituationalTemplate) obj;
                Integer num = clickableSituationalTemplate.e;
                if (num != null) {
                    ((anm0) zim0Var.j.getValue()).t(StoryViewAction.CLICK_ON_CLICKABLE_STICKER, zim0Var.d, zim0Var.c, zim0Var.e, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), new whg0(clickableSituationalTemplate, 12));
                    int i3 = 26;
                    zim0Var.g = rsg0.W(yfb.x(new dxj0().b(Collections.singletonList(num))), 7).l(new aad0(new xim0(zim0Var, clickableSituationalTemplate), 7)).m(asu0.a.d()).subscribe(new f5y(new f6m0(zim0Var, 2), i3), new nex(new ulz(29), i3));
                }
                return s3q0.a;
            case 2:
                uc2 uc2Var = (uc2) obj2;
                s9 s9Var = uc2Var.g;
                int i4 = 1;
                ww wwVar = new ww(i4, uc2Var, (wco0) obj);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                uc2Var.e.d("positioner", s9Var, new p(i4, ref$ObjectRef, wwVar));
                Object obj3 = ref$ObjectRef.element;
                if (obj3 == null) {
                    obj3 = s3q0.a;
                }
                return (zhf0) obj3;
            case 3:
                ((izs) obj2).invoke(new a.d((BookingServiceType) obj));
                return s3q0.a;
            case 4:
                o1d o1dVar = (o1d) obj2;
                o1dVar.i.b(new rxp.b((SdkClipVideoFile) obj, false));
                xn50.a.c(o1dVar, new ClipItemAction.v(false, true));
                return s3q0.a;
            case 5:
                int i5 = CommentsOutherFragment.h0;
                return ((CommentsOutherFragment) obj2).io((View) obj);
            case 6:
                c6h c6hVar = (c6h) obj2;
                UserId userId = c6hVar.i;
                z5h z5hVar = (z5h) obj;
                int i6 = z5h.j1;
                if (c6hVar.h) {
                    ((BridgeComponent) m7m.d(z5hVar).a(fpf0.a(BridgeComponent.class))).F().m(z5hVar.requireContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    z5hVar.dismiss();
                } else {
                    int i7 = 14;
                    hg1.a(hg1.m(rsg0.y0(yfb.x(xqu.a.c(null, null, null, (494 & 16) != 0 ? null : (String) ((zak0) z5hVar.i1).getValue(), fkq0.a(userId), null, null, null)), null, null, 3), z5hVar.requireContext(), 0L, false, 62).subscribe(new w00(new he3(i7, z5hVar, userId), i7), new y00(new n1d(z5hVar, 8), 15)), z5hVar);
                }
                return s3q0.a;
            case 7:
                ((com.vk.profile.community.impl.ui.profile.c) obj2).f(((d.j.b1) obj).a);
                return s3q0.a;
            case 8:
                return (View) ((mhl) obj2).b.invoke((Context) obj);
            case 9:
                ((zgn) obj2).a.l((zgn.a) obj);
                return s3q0.a;
            case 10:
                return new Result(((qn60) obj2).f(new txf0(), new kjj0((pn60) obj)));
            case 11:
                ((FriendsItemSearchListVh) obj2).b((UIBlockProfile) obj);
                return s3q0.a;
            case 12:
                ((izs) obj2).invoke(new o9t.b(((udt.c) obj).c));
                return s3q0.a;
            case 13:
                invoke$lambda$24 = HandleInvocationsFromAdViewer.invoke$lambda$24((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$24;
            case 14:
                PostingUserMessageButton postingUserMessageButton = (PostingUserMessageButton) obj2;
                ua20 ua20Var = (ua20) obj;
                int i8 = ua20.k1;
                boolean z = postingUserMessageButton.e;
                PostingAction postingAction = postingUserMessageButton.c;
                if (z) {
                    postingAction = com.vk.newsfeed.posting.impl.domain.model.d.a(ua20Var.i1, postingAction);
                }
                if (postingAction != null) {
                    ua20Var.j1.invoke(postingAction);
                }
                ua20Var.hide();
                return s3q0.a;
            case 15:
                de20 de20Var = (de20) obj2;
                mdz mdzVar = (mdz) obj;
                ReporterType reporterType2 = de20Var.i;
                Name name = mdzVar.b;
                MessagesEmptyHistoryMergeReporter.Span span = MessagesEmptyHistoryMergeReporter.Span.ROOT;
                String str2 = "messages";
                if (name == span) {
                    wto0 wto0Var = (wto0) de20Var.c.get(mdzVar);
                    Long a = wto0Var != null ? wto0Var.a() : null;
                    LinkedHashMap r = de20Var.r();
                    Long m = pli.m((Collection) r.get(MessagesEmptyHistoryMergeReporter.Span.FINDING_NEAREST_MESSAGES));
                    Long m2 = pli.m((Collection) r.get(MessagesEmptyHistoryMergeReporter.Span.TRIMMING_HISTORY_BEFORE));
                    Long m3 = pli.m((Collection) r.get(MessagesEmptyHistoryMergeReporter.Span.TRIMMING_HISTORY_AFTER));
                    Long m4 = pli.m((Collection) r.get(MessagesEmptyHistoryMergeReporter.Span.SAVING_PEER_IS_EMPTY));
                    Long m5 = pli.m((Collection) r.get(MessagesEmptyHistoryMergeReporter.Span.UPDATING_PEER));
                    if (a != null && m != null && m4 != null && m5 != null) {
                        int i9 = de20.a.$EnumSwitchMapping$1[reporterType2.ordinal()];
                        if (i9 != 1) {
                            i = 1;
                            if (i9 == 2) {
                                str = "group_messages";
                            } else {
                                if (i9 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                str = RTCStatsConstants.KEY_CHANNELS;
                            }
                        } else {
                            i = 1;
                            str = "messages";
                        }
                        reporterType = reporterType2;
                        s3w0 s3w0Var = new s3w0(PerformanceEventType.MESSAGES_EMPTY_HISTORY_MERGE.h(), false);
                        Long[] lArr = s3w0Var.j;
                        lArr[0] = a;
                        String[] strArr = s3w0Var.i;
                        strArr[i] = str;
                        strArr[2] = de20Var.j ? "1" : "0";
                        lArr[i] = m;
                        lArr[2] = m2;
                        lArr[3] = m3;
                        lArr[4] = m4;
                        lArr[5] = m5;
                        s3w0Var.q();
                        if ((mdzVar.b != span ? mdzVar : null) != null) {
                            de20Var.q(rl3.C(MessagesEmptyHistoryMergeReporter.Span.values()), mdzVar);
                            int i10 = de20.a.$EnumSwitchMapping$1[reporterType.ordinal()];
                            if (i10 != i) {
                                if (i10 == 2) {
                                    str2 = "group_messages";
                                } else {
                                    if (i10 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    str2 = RTCStatsConstants.KEY_CHANNELS;
                                }
                            }
                            wn6.w(de20Var, mdzVar, new gd5(span, PerformanceEventType.MESSAGES_EMPTY_HISTORY_MERGE.h(), ee20.b, 2), Collections.singletonList(new MobileOfficialAppsImStat$ImPerformanceMetricCustomFieldStr(1, str2)), null, 92);
                        }
                        return s3q0.a;
                    }
                }
                reporterType = reporterType2;
                i = 1;
                if ((mdzVar.b != span ? mdzVar : null) != null) {
                }
                return s3q0.a;
            case 16:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj).b;
                PostingAction.Navigation.OpenInCurrentStep openInCurrentStep = new PostingAction.Navigation.OpenInCurrentStep(PostingStepScreen.MusicPicker.b);
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(openInCurrentStep);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, openInCurrentStep, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 17:
                il90.a aVar = (il90.a) obj;
                StringBuilder sb = new StringBuilder("participantsListeners: ");
                CopyOnWriteArraySet<il90> copyOnWriteArraySet = ((kl90) obj2).b;
                L.e("ParticipantListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<il90> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().d(aVar);
                }
                return s3q0.a;
            case 18:
                ubb0 ubb0Var = (ubb0) obj2;
                UserId userId2 = (UserId) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", "uid=" + userId2.b});
                }
                List<uab0> j = ubb0Var.c.j(String.valueOf(userId2.b));
                ArrayList arrayList = new ArrayList(c5g.u(j, 10));
                for (uab0 uab0Var : j) {
                    Playlist playlist = new Playlist(new JSONObject(uab0Var.e));
                    playlist.H = uab0Var.d;
                    arrayList.add(playlist);
                }
                return arrayList;
            case 19:
                xwk.d().e().a((Activity) obj2, ((com.vk.qrcode.c) obj).r());
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_APP);
                return s3q0.a;
            case 20:
                vof0 vof0Var = (vof0) obj;
                nnf0 nnf0Var = ((com.vk.reefton.trackers.m) obj2).a;
                if (nnf0Var != null && (R = nnf0Var.R()) != null) {
                    vof0Var.a(new yzq0(R));
                }
                return s3q0.a;
            case 21:
                ((slq0) obj2).a(new UserProfileAction.s.c.a.b(new tuz((olq0) obj, 18)));
                return s3q0.a;
            case 22:
                ((UserProfileDialogs) obj2).a.a(new UserProfileAction.m.b((moq0.b) obj));
                return s3q0.a;
            case 23:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj2;
                Bundle bundle = (Bundle) obj;
                int i11 = VideoCatalogRootVh.M0;
                videoCatalogRootVh.m.b.getClass();
                boolean containsKey = bundle != null ? bundle.containsKey("enable_notifications") : false;
                boolean z2 = bundle != null ? bundle.getBoolean("enable_notifications") : false;
                return Boolean.valueOf((!containsKey || z2) && (videoCatalogRootVh.p0 || z2));
            case 24:
                return ((s290) ((VideoItemListLargeVh) obj2).R.getValue()).a(((VideoFile) obj).w2());
            default:
                return MediaMetadataUtils.a((Context) obj2, (Uri) obj);
        }
    }
}
