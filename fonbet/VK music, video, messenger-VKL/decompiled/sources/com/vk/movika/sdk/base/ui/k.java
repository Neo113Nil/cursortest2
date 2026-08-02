package com.vk.movika.sdk.base.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.ui.platform.ComposeView;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingServiceType;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.music.playlist.display.domain.a;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.voip.ui.actions.menu.fragments.CallParticipantPermissionsFragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuActionsFragment;
import com.vk.voip.ui.menu.feature.VoipCallMainMenuComponentProvider;
import com.vungle.ads.internal.protos.Sdk;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.player.OneVideoPlayer;
import xsna.b320;
import xsna.b7q;
import xsna.byf0;
import xsna.djc;
import xsna.dw20;
import xsna.e43;
import xsna.eoj0;
import xsna.evb0;
import xsna.ey50;
import xsna.fcn;
import xsna.fee;
import xsna.fxc0;
import xsna.g620;
import xsna.gbn;
import xsna.gjj0;
import xsna.go9;
import xsna.gzs;
import xsna.hbn;
import xsna.izs;
import xsna.j5g;
import xsna.k150;
import xsna.k3g;
import xsna.l1t;
import xsna.lab0;
import xsna.mbt0;
import xsna.mm00;
import xsna.mvb0;
import xsna.o9t;
import xsna.oj80;
import xsna.pbt0;
import xsna.pn60;
import xsna.qn60;
import xsna.r3q;
import xsna.r9;
import xsna.rg50;
import xsna.rhc0;
import xsna.rw40;
import xsna.s1;
import xsna.s290;
import xsna.s3q0;
import xsna.siu0;
import xsna.tfm0;
import xsna.u59;
import xsna.uc2;
import xsna.udt;
import xsna.vco0;
import xsna.vxf0;
import xsna.w1g;
import xsna.w950;
import xsna.wco0;
import xsna.wh50;
import xsna.wow;
import xsna.ww50;
import xsna.y2p0;
import xsna.y7r;
import xsna.yd40;
import xsna.ydt0;
import xsna.ym8;
import xsna.zd40;
import xsna.zhf0;
import xsna.zp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ww50<?> Y;
        ExposedFunction invoke$lambda$23;
        PostingUserMessage postingUserMessage;
        int i = this.b;
        int i2 = 1;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                String str = "state = " + ((l0) obj2);
                Chapter chapter = ((y) obj).i;
                return j5g.g0(e43.l("render: ", str, go9.b("InteractivePlayerView@currentChapter.id = ", chapter != null ? chapter.a : null)), "\t\n", null, null, 0, null, 62);
            case 1:
                uc2 uc2Var = (uc2) obj2;
                r9 r9Var = uc2Var.f;
                s1 s1Var = new s1((wco0) obj, 5);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                uc2Var.e.d("dataBuilder", r9Var, new p(i2, ref$ObjectRef, s1Var));
                Object obj3 = ref$ObjectRef.element;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = s3q0.a;
                }
                return (vco0) obj4;
            case 2:
                ((izs) obj2).invoke(new a.d((BookingServiceType) j5g.Y(new wow((List) obj))));
                return s3q0.a;
            case 3:
                u59 u59Var = (u59) obj2;
                CallParticipantPermissionsFragment callParticipantPermissionsFragment = (CallParticipantPermissionsFragment) obj;
                int i3 = CallParticipantPermissionsFragment.S;
                Bundle arguments = callParticipantPermissionsFragment.getArguments();
                if (arguments == null || !arguments.getBoolean("STANDALONE_ARGS")) {
                    VoipMainMenuActionsFragment voipMainMenuActionsFragment = new VoipMainMenuActionsFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("call_main_menu", new VoipCallMainMenuComponentProvider(u59Var));
                    voipMainMenuActionsFragment.setArguments(bundle);
                    u59Var.c(voipMainMenuActionsFragment, true);
                } else {
                    callParticipantPermissionsFragment.tn();
                }
                return s3q0.a;
            case 4:
                fcn fcnVar = (fcn) obj;
                LayoutInflater.Factory activity = ((ClipsWrapperFragment) obj2).getActivity();
                ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.H(fcnVar);
                }
                return s3q0.a;
            case 5:
                w1g w1gVar = (w1g) obj;
                l1t l1tVar = ((k3g) obj2).x;
                (l1tVar != null ? l1tVar : null).d(w1gVar.b, w1gVar.g);
                return s3q0.a;
            case 6:
                hbn hbnVar = (hbn) obj;
                y7r c = ((gbn) obj2).c();
                evb0 evb0Var = hbnVar.b;
                b320 b = evb0Var.b(hbnVar.e);
                mvb0 c2 = evb0Var.c();
                r3q r3qVar = hbnVar.c;
                return new ym8(c, b, c2, r3qVar.b(), r3qVar.c(), hbnVar.d);
            case 7:
                b7q b7qVar = (b7q) obj;
                ((oj80) obj2).invoke();
                b7qVar.f = false;
                b7qVar.k();
                return s3q0.a;
            case 8:
                return new Result(((qn60) obj2).f(new vxf0(), new gjj0((pn60) obj)));
            case 9:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it = ((one.video.player.j) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().d(oneVideoPlayer);
                }
                return s3q0.a;
            case 10:
                ((com.vk.core.fragments.e) obj2).e.c.Lb((ArrayList) obj);
                return s3q0.a;
            case 11:
                ((FriendsItemSearchListVh) obj2).b((UIBlockProfile) obj);
                return s3q0.a;
            case 12:
                ((izs) obj2).invoke(new o9t.m(new djc.b(((udt.c) obj).c.d, null, null, null)));
                return s3q0.a;
            case 13:
                invoke$lambda$23 = HandleInvocationsFromAdViewer.invoke$lambda$23((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$23;
            case 14:
                ((mm00) obj2).p((byf0) obj);
                return s3q0.a;
            case 15:
                gzs gzsVar = (gzs) obj;
                w950 w950Var = ((zd40) obj2).b;
                if (w950Var != null) {
                    return new yd40(w950Var, gzsVar);
                }
                return null;
            case 16:
                izs izsVar = (izs) obj2;
                ActionsAvailabilityState.Availability availability = ((ActionsAvailabilityState.AttachmentState) obj).c;
                PostingAction.Editing.Attach.RemoveMusic removeMusic = PostingAction.Editing.Attach.RemoveMusic.b;
                if (availability instanceof ActionsAvailabilityState.Availability.Available) {
                    izsVar.invoke(removeMusic);
                } else if ((availability instanceof ActionsAvailabilityState.Availability.NotAvailable) && (postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b) != null) {
                    izsVar.invoke(new PostingAction.ShowMessage(postingUserMessage, removeMusic, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
                }
                return s3q0.a;
            case 17:
                ((rw40) obj2).y.J1((String) obj);
                return s3q0.a;
            case 18:
                ((k150) obj2).m.a.invoke(new a.f.e(((lab0.a) obj).a));
                return s3q0.a;
            case 19:
                ((rhc0) obj2).k.a(false);
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj).element;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return Boolean.TRUE;
            case 20:
                ClipsRouter.j(g620.f().a(), (Activity) obj2, (ClipGridParams.OnlyId.Hashtag) obj, false, null, null, 60);
                return s3q0.a;
            case 21:
                return "Failed to collect logs. Archive dir is " + ((String) obj2) + ", archive path is " + ((File) obj) + JwtParser.SEPARATOR_CHAR;
            case 22:
                ((eoj0) obj2).a.d((VideoFile) obj);
                return s3q0.a;
            case 23:
                ((rg50) obj2).C(0);
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 24:
                y2p0 y2p0Var = (y2p0) obj2;
                y2p0.a aVar = (y2p0.a) obj;
                fee feeVar = y2p0Var.a;
                VkTopBar vkTopBar = y2p0Var.b;
                zhf0 rightMainRect = vkTopBar.getRightMainRect();
                feeVar.c2(vkTopBar, new Rect((int) rightMainRect.a, (int) rightMainRect.b, (int) rightMainRect.c, (int) rightMainRect.d), ((y2p0.a.C4071a) aVar).a, new tfm0(y2p0Var, aVar));
                return s3q0.a;
            case 25:
                ((UserProfileDialogs) obj2).a.a(new UserProfileAction.s.a.b.C1692b((zp0.a) obj));
                return s3q0.a;
            case 26:
                return ((s290) ((pbt0) obj2).f.getValue()).a(((mbt0) obj).b.w2());
            case 27:
                UIBlockVideo uIBlockVideo = (UIBlockVideo) obj;
                ydt0 Y2 = fxc0.B().Y();
                Context context = ((ComposeView) obj2).getContext();
                VideoFile videoFile = uIBlockVideo.B;
                Y2.k(context, videoFile, (r43 & 4) != 0 ? null : uIBlockVideo.f, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : videoFile.r(), true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
                return s3q0.a;
            default:
                int i4 = VkCellButton.l;
                return new siu0((Context) obj2, (AttributeSet) obj);
        }
    }
}
