package com.vk.im.ui.components.msg_list;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.soloader.MinElf;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.bridges.ImageViewer;
import com.vk.core.serialize.Serializer;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Direction;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.gift.GiftSticker;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.WritePermission;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.dto.stories.entities.StoryImSharingData;
import com.vk.dto.stories.entities.StoryImSharingStats;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.im.engine.external.ImMsgPushSettingsProvider;
import com.vk.im.engine.internal.api_commands.friends.FriendsAddApiCmd;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachDonutLink;
import com.vk.im.engine.models.attaches.AttachGroupCallFinished;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWithVideo;
import com.vk.im.engine.models.attaches.CallParticipants;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgSendSource;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.a;
import com.vk.im.external.AudioTrack;
import com.vk.im.messageviews.api.MessageViewsFeatureComponent;
import com.vk.im.popup.Popup;
import com.vk.im.popup.b;
import com.vk.im.reporters.api.analytics.click.ImCallClickAnalyticsItem;
import com.vk.im.reporters.api.analytics.click.ImCallTypeAnalyticsItem;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.im.ui.components.viewcontrollers.msg_list.MsgLinearLayoutManager;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.fragments.chat.ChatFragment.h;
import com.vk.im.ui.reporters.ShareType;
import com.vk.metrics.eventtracking.Event;
import com.vk.movika.sdk.base.model.n;
import com.vk.movika.sdk.base.observable.g;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.CommonStat$TypeTrackCodeItem;
import com.vk.stat.scheme.CommonVasStat$TypeIvasItemViews;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import defpackage.k0;
import io.reactivex.rxjava3.core.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Stack;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.a1w;
import xsna.a94;
import xsna.afs;
import xsna.ah;
import xsna.al30;
import xsna.ams;
import xsna.arb;
import xsna.asu0;
import xsna.aux0;
import xsna.b040;
import xsna.b4v;
import xsna.b7u0;
import xsna.ba9;
import xsna.bgy;
import xsna.bi0;
import xsna.biu;
import xsna.bl30;
import xsna.bpn0;
import xsna.brb;
import xsna.btm;
import xsna.c5g;
import xsna.cl30;
import xsna.cvg;
import xsna.d410;
import xsna.da50;
import xsna.dke0;
import xsna.dl30;
import xsna.drm0;
import xsna.dw20;
import xsna.e0l0;
import xsna.e3m;
import xsna.e43;
import xsna.ebw;
import xsna.ebx;
import xsna.edw;
import xsna.eew;
import xsna.el3;
import xsna.enj;
import xsna.epx;
import xsna.er;
import xsna.ese;
import xsna.f4m;
import xsna.f880;
import xsna.f9q0;
import xsna.fbw;
import xsna.fi30;
import xsna.fpf0;
import xsna.g120;
import xsna.g2v;
import xsna.g5g;
import xsna.gj30;
import xsna.gl30;
import xsna.gz80;
import xsna.gzs;
import xsna.h2w;
import xsna.h5s;
import xsna.hg1;
import xsna.hr80;
import xsna.hzp0;
import xsna.i5g;
import xsna.i5s;
import xsna.imv;
import xsna.in0;
import xsna.ir4;
import xsna.iwv;
import xsna.j0u0;
import xsna.j20;
import xsna.j3f0;
import xsna.j3z;
import xsna.j4;
import xsna.j5g;
import xsna.j720;
import xsna.j9b;
import xsna.jeq0;
import xsna.ji30;
import xsna.jw5;
import xsna.k4;
import xsna.k7p;
import xsna.k9q0;
import xsna.k9w;
import xsna.kbj0;
import xsna.kl30;
import xsna.km1;
import xsna.knm;
import xsna.krl0;
import xsna.kyv;
import xsna.l5f0;
import xsna.l5v0;
import xsna.laz;
import xsna.lza0;
import xsna.m33;
import xsna.m330;
import xsna.m7m;
import xsna.mb8;
import xsna.mh80;
import xsna.mhy;
import xsna.mxv;
import xsna.nr4;
import xsna.nwv;
import xsna.o0r0;
import xsna.o0w;
import xsna.o25;
import xsna.o7y;
import xsna.oce;
import xsna.on00;
import xsna.orw;
import xsna.p4g;
import xsna.p8s0;
import xsna.p9w;
import xsna.pnp0;
import xsna.puo0;
import xsna.q;
import xsna.q1w;
import xsna.q9q;
import xsna.qex0;
import xsna.qi30;
import xsna.qk30;
import xsna.qtd0;
import xsna.r010;
import xsna.r820;
import xsna.rdi;
import xsna.rli0;
import xsna.rt10;
import xsna.rwv;
import xsna.rxz;
import xsna.s140;
import xsna.s3q0;
import xsna.s4;
import xsna.sz30;
import xsna.thp0;
import xsna.u370;
import xsna.u3u;
import xsna.u6k;
import xsna.uaw;
import xsna.uf1;
import xsna.ug30;
import xsna.uh30;
import xsna.umb;
import xsna.uqm;
import xsna.ur4;
import xsna.v2n0;
import xsna.vd6;
import xsna.vm30;
import xsna.vr4;
import xsna.w00;
import xsna.w4u;
import xsna.w7u;
import xsna.wdw;
import xsna.wij0;
import xsna.wmw;
import xsna.wn7;
import xsna.xcm;
import xsna.y7;
import xsna.ya20;
import xsna.yg;
import xsna.ym30;
import xsna.z4;
import xsna.z9x0;
import xsna.zdw;
import xsna.zg;
import xsna.zqn0;

/* compiled from: OnViewControllerCallbackImpl.kt */
/* loaded from: classes2.dex */
public final class d implements ym30 {
    public final a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // xsna.ym30
    public final void A(Peer peer, boolean z, Attach attach) {
        VideoFile A;
        a aVar = this.a;
        aVar.X.d(peer, true);
        String str = null;
        AttachWithVideo attachWithVideo = attach instanceof AttachWithVideo ? (AttachWithVideo) attach : null;
        if (attachWithVideo != null && (A = attachWithVideo.A()) != null) {
            str = A.r();
        }
        aVar.I0(o0r0.i(aVar.z.d(), com.vk.dto.common.a.b(peer), z, str, false, "IM_CHAT", 104).a0(asu0.a.d()).subscribe(new cl30(new cvg(aVar, peer, z, 2), 0), new o7y(new dl30(aVar, peer, z, 0), 3)));
    }

    @Override // xsna.ym30
    public final void B(Peer peer, boolean z) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            if (z) {
                a aVar = chatFragment.H0;
                (aVar != null ? aVar : null).L1(peer, z);
            } else {
                com.vk.im.popup.b bVar = chatFragment.k0;
                com.vk.im.popup.a.d(bVar == null ? null : bVar, qi30.j, new brb(chatFragment, peer, z, 0), null, new km1(3, chatFragment, peer), 4);
            }
        }
    }

    @Override // xsna.ym30
    public final void B0() {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            o0w b = g2v.c().b();
            ChatFragment chatFragment = ChatFragment.this;
            FragmentActivity kn = chatFragment.kn();
            DialogExt dialogExt = chatFragment.V;
            if (dialogExt == null) {
                dialogExt = null;
            }
            b.v(kn, dialogExt, true, chatFragment.no());
        }
    }

    @Override // xsna.ym30
    public final void C(int i) {
        ChatSettings Hb;
        a aVar = this.a;
        if (aVar.C1() || aVar.F1()) {
            return;
        }
        Msg l1 = aVar.l1(i);
        MsgFromUser msgFromUser = l1 instanceof MsgFromUser ? (MsgFromUser) l1 : null;
        if (msgFromUser == null) {
            return;
        }
        c cVar = aVar.O0;
        Dialog f = cVar.f();
        if (f != null && f.T8() && com.vk.im.engine.utils.a.j(msgFromUser)) {
            ChatFragment.j jVar = aVar.s;
            if (jVar != null) {
                jVar.e(ImSearchAnalytics.ClickAction.SET_REACTION_OUT);
            }
            j3f0 e = aVar.A.e();
            if (e != null) {
                ebw g = e.g(aVar.l);
                Context B = aVar.y.B();
                bpn0 bpn0Var = enj.a;
                Activity h = e3m.h(B);
                Dialog f2 = cVar.f();
                boolean z = false;
                if (f2 != null && (Hb = f2.Hb()) != null && Hb.m) {
                    z = true;
                }
                g.a(msgFromUser, msgFromUser.T, z, false, h);
            }
        }
        aVar.O1(msgFromUser);
    }

    @Override // xsna.ym30
    public final void C0() {
        this.a.W1();
    }

    @Override // xsna.ym30
    public final void D() {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            edw edwVar = edw.a;
            edw.g(R.string.video_popup_with_blocked_audio_title, ChatFragment.this.requireContext());
        }
    }

    @Override // xsna.ym30
    public final void D0() {
        a aVar = this.a;
        io.reactivex.rxjava3.disposables.c cVar = aVar.Z;
        if (cVar != null) {
            cVar.dispose();
        }
        aVar.Z = null;
    }

    @Override // xsna.ym30
    public final void E() {
        new hzp0.w(new SchemeStat$EventItem(SchemeStat$EventItem.Type.STICKERS, null, null, null, null, null, 62, null), new CommonVasStat$TypeIvasItemViews(CommonVasStat$TypeIvasItemViews.ItemType.ENTRYPOINT, Collections.singletonList(1), 1, CommonVasStat$TypeIvasItemViews.BlockType.BIRTHDAY_BANNER, null, null, new CommonStat$TypeTrackCodeItem("im_conversation_card_hb"), 1, Long.valueOf(this.a.n), null, null, null, 3632, null)).a();
    }

    @Override // xsna.ym30
    public final void F(StoryEntry storyEntry) {
        a aVar = this.a;
        aVar.z.k().b(aVar.k, er.a(HttpRequest.DEFAULT_SCHEME).authority(a0a.d).appendPath("story_editor").appendQueryParameter("repost", "story" + storyEntry.d.b + '_' + storyEntry.c).appendQueryParameter("from", "im").build().toString());
    }

    @Override // xsna.ym30
    public final void G(Peer peer) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            a aVar = ChatFragment.this.H0;
            if (aVar == null) {
                aVar = null;
            }
            io.reactivex.rxjava3.internal.operators.single.c C = aVar.l.C(aVar, new k7p(peer));
            asu0 asu0Var = asu0.a;
            aVar.I0(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new w00(new rxz(aVar, 3), 28), new rt10(new bl30(aVar, 0), 4)));
        }
    }

    @Override // xsna.ym30
    public final void H(int i) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            iwv.f(chatFragment.r0.k(), chatFragment.kn(), i, null, "", null, null, 48);
        }
    }

    @Override // xsna.ym30
    public final void I(boolean z) {
        a aVar = this.a;
        zdw zdwVar = aVar.A;
        if (!z) {
            zdwVar.d.x().a(ImCallClickAnalyticsItem.h.a);
            aVar.z.i().c(aVar.k);
            return;
        }
        zdwVar.d.x().a(ImCallClickAnalyticsItem.f.a);
        p9w p9wVar = aVar.l.r().f;
        ImMsgPushSettingsProvider.Type type = ImMsgPushSettingsProvider.Type.CALLS_INCOMING;
        String c = p9wVar.c(type);
        if (p9wVar.c.f()) {
            zqn0 zqn0Var = zqn0.a;
            zqn0Var.c();
            if (u370.e((NotificationManager) zqn0.e.getValue(), c)) {
                if (!p9wVar.h(type)) {
                    zqn0Var.g(p9wVar.d(type));
                }
                zqn0Var.h();
                return;
            }
        }
        zqn0.a.h();
    }

    @Override // xsna.ym30
    public final void J(Msg msg, int i) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            jVar.e(ImSearchAnalytics.ClickAction.SET_REACTION_OUT);
        }
    }

    @Override // xsna.ym30
    public final void K(Action action) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            qex0.a().a(chatFragment.kn(), action);
        }
    }

    @Override // xsna.ym30
    public final void L() {
        a aVar = this.a;
        io.reactivex.rxjava3.disposables.c cVar = aVar.Y;
        if (cVar != null) {
            cVar.dispose();
        }
        aVar.Y = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.vk.im.engine.models.messages.Msg] */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.vk.im.engine.models.messages.a] */
    @Override // xsna.ym30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Attach attach, Msg msg, NestedMsg nestedMsg) {
        Attach attach2;
        a aVar = this.a;
        if (aVar.C1()) {
            return;
        }
        NestedMsg nestedMsg2 = nestedMsg;
        if (aVar.F1()) {
            return;
        }
        if (nestedMsg == null) {
            nestedMsg2 = (com.vk.im.engine.models.messages.a) msg;
        }
        NestedMsg nestedMsg3 = nestedMsg2;
        if (aVar.O0.f() == null) {
            return;
        }
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            if (attach.G0() == AttachSyncState.DONE) {
                if (attach instanceof AttachDonutLink) {
                    a aVar2 = chatFragment.H0;
                    if (aVar2 == null) {
                        aVar2 = null;
                    }
                    AttachDonutLink attachDonutLink = (AttachDonutLink) attach;
                    View m1 = aVar2.m1(attachDonutLink.b);
                    a aVar3 = chatFragment.H0;
                    if (aVar3 == null) {
                        aVar3 = null;
                    }
                    qtd0 s1 = aVar3.s1(attachDonutLink.d.b);
                    b7u0 k = chatFragment.r0.k();
                    FragmentActivity kn = chatFragment.kn();
                    DialogExt dialogExt = chatFragment.V;
                    attach2 = attach;
                    iwv.l(k, kn, attach2, nestedMsg3, s1, Long.valueOf((dialogExt != null ? dialogExt : null).e), m1, false, 64);
                } else {
                    attach2 = attach;
                    if (attach2 instanceof AttachSticker) {
                        AttachSticker attachSticker = (AttachSticker) attach2;
                        if (attachSticker.g.z9()) {
                            chatFragment.Go(attachSticker.f, attachSticker, nestedMsg3);
                        }
                    }
                }
                if (attach2 instanceof AttachDonutLink) {
                    return;
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("donut_click_pay");
                b.a(((AttachDonutLink) attach2).d, "owner_id");
                b.c("source", "snippet_message");
                n.c(b, thp0.c, bVar);
                return;
            }
        }
        attach2 = attach;
        if (attach2 instanceof AttachDonutLink) {
        }
    }

    @Override // xsna.ym30
    public final void N(Msg msg, int i) {
        this.a.a1(msg, Integer.valueOf(i));
    }

    @Override // xsna.ym30
    public final void O(Attach attach) {
        this.a.f1(attach);
    }

    @Override // xsna.ym30
    public final void P(String str) {
        a aVar = this.a;
        if (aVar.v0 && aVar.a0 == null) {
            io.reactivex.rxjava3.internal.operators.single.c C = aVar.l.C(aVar, new xcm(aVar.n, str));
            asu0 asu0Var = asu0.a;
            aVar.I0(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new al30(new h2w(6)), new j3z(new r820(aVar, 3), 4)));
        }
    }

    @Override // xsna.ym30
    public final void Q(Msg msg, sz30 sz30Var) {
        ArrayList arrayList;
        ShareType shareType = ShareType.BUTTON;
        boolean b = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.b(msg);
        a aVar = this.a;
        if (!b || !msg.Qb()) {
            aVar.n1(msg.b, shareType);
            return;
        }
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        Attach attach = (msgFromUser == null || (arrayList = msgFromUser.H) == null) ? null : (Attach) j5g.a0(arrayList);
        if (attach != null) {
            aVar.z.getClass();
            Context context = aVar.k;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            kbj0.e(nr4.b(), context, wdw.b(attach, null, false, 6), false, null, false, Peer.Unknown.e, 28);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ym30
    public final void R(Attach attach, final Msg msg, NestedMsg nestedMsg) {
        int i;
        boolean z;
        boolean z2;
        ImageViewer.c<AttachForMediaViewer> i2;
        x n;
        x n2;
        a aVar = this.a;
        if (aVar.C1()) {
            return;
        }
        if (aVar.F1()) {
            if (aVar.E1(msg)) {
                aVar.R1(msg);
                return;
            } else {
                if (aVar.D1(msg)) {
                    aVar.d1(msg);
                    return;
                }
                return;
            }
        }
        com.vk.im.engine.models.messages.a aVar2 = nestedMsg != null ? nestedMsg : (com.vk.im.engine.models.messages.a) msg;
        c cVar = aVar.O0;
        final Dialog f = cVar.f();
        if (f != null) {
            ChatFragment.j jVar = aVar.s;
            if (jVar != null) {
                final ChatFragment chatFragment = ChatFragment.this;
                ChatFragment.d dVar = ChatFragment.w1;
                if (attach.G0() == AttachSyncState.DONE) {
                    boolean z3 = attach instanceof AttachImage;
                    if (z3) {
                        z = true;
                    } else if (attach instanceof AttachVideo) {
                        z = true;
                    } else if (attach instanceof AttachSticker) {
                        int i3 = ((AttachSticker) attach).f;
                        AttachWithId attachWithId = (AttachWithId) attach;
                        PopupStickerAnimation popupStickerAnimation = ((AttachSticker) attachWithId).g.k;
                        if (popupStickerAnimation != null) {
                            chatFragment.Fo(popupStickerAnimation, attachWithId);
                        } else {
                            chatFragment.Go(i3, attachWithId, aVar2);
                        }
                    } else if (attach instanceof AttachUgcSticker) {
                        if (!(aVar2 instanceof NestedMsg) || ((AttachUgcSticker) attach).d.b == f.Sb().longValue()) {
                            AttachUgcSticker attachUgcSticker = (AttachUgcSticker) attach;
                            UGCStickerModel uGCStickerModel = attachUgcSticker.f;
                            if (uGCStickerModel.f == UgcStatus.OK) {
                                imv imvVar = chatFragment.J0;
                                (imvVar == null ? null : imvVar).k(uGCStickerModel.d, attachUgcSticker.d);
                            }
                        } else {
                            Context mo2getContext = chatFragment.mo2getContext();
                            if (mo2getContext != null) {
                                g2v.d().a().C(mo2getContext);
                            }
                        }
                    } else if (attach instanceof AttachGift) {
                        AttachGift attachGift = (AttachGift) attach;
                        if (attachGift.e()) {
                            GiftSticker giftSticker = attachGift.h;
                            if (giftSticker != null) {
                                chatFragment.Go(giftSticker.b, (AttachWithId) attach, aVar2);
                            }
                        } else {
                            chatFragment.yo(attach, aVar2);
                        }
                    } else if (attach instanceof AttachDoc) {
                        AttachDoc attachDoc = (AttachDoc) attach;
                        if (drm0.D(rwv.a(attachDoc), "image", false) && (attachDoc.p.Jb() || attachDoc.n.Jb())) {
                            ArrayList M9 = aVar2.M9(aVar2.A4(true), aVar2.A4(true));
                            chatFragment.v0 = ImageViewer.a(chatFragment.t0, attachDoc, M9, chatFragment.kn(), new wmw(new uf1(11, M9, chatFragment), new q(chatFragment, 13), new j4(5, chatFragment, msg), new yg(chatFragment, 14), new zg(chatFragment, 18), !com.vk.im.engine.utils.a.k(f, msg)), chatFragment.ro(), com.vk.dto.common.a.b(chatFragment.ko().a()), 112);
                        } else {
                            com.vk.im.ui.fragments.chat.a aVar3 = new com.vk.im.ui.fragments.chat.a(chatFragment, f, msg, attachDoc, 0);
                            if (gz80.a(34)) {
                                aVar3.invoke();
                            } else {
                                PermissionHelper permissionHelper = PermissionHelper.a;
                                FragmentActivity kn = chatFragment.kn();
                                permissionHelper.getClass();
                                PermissionHelper.h(permissionHelper, kn, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, aVar3, null, 96);
                            }
                        }
                    } else if (attach instanceof AttachCall) {
                        umb umbVar = chatFragment.Y;
                        if (umbVar == null) {
                            umbVar = null;
                        }
                        umbVar.getClass();
                        VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
                        Context context = umbVar.a;
                        DialogExt dialogExt = umbVar.b;
                        boolean z4 = ((AttachCall) attach).h;
                        com.vk.im.engine.models.c cVar2 = umbVar.c;
                        kyv kyvVar = umbVar.d;
                        if (dialogExt.Cb() != null) {
                            n2 = x.k(dialogExt);
                        } else {
                            a1w a1wVar = q1w.a;
                            n2 = hg1.n((a1wVar != null ? a1wVar : null).E("DialogBundle", new uqm(dialogExt.f, Source.ACTUAL)).l(new y7(new oce(dialogExt, 16), 17)), context, false, null, 62);
                        }
                        hg1.i(n2, new ba9(context, voipCallSource, cVar2, kyvVar, z4));
                    } else if (attach instanceof AttachGroupCallFinished) {
                        umb umbVar2 = chatFragment.Y;
                        if (umbVar2 == null) {
                            umbVar2 = null;
                        }
                        umbVar2.getClass();
                        List<Long> list = ((AttachGroupCallFinished) attach).e.b;
                        CallParticipants callParticipants = CallParticipants.d;
                        CallParticipants.a.a(list);
                        VoipCallSource voipCallSource2 = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
                        Context context2 = umbVar2.a;
                        DialogExt dialogExt2 = umbVar2.b;
                        com.vk.im.engine.models.c cVar3 = umbVar2.c;
                        if (dialogExt2.Cb() != null) {
                            n = x.k(dialogExt2);
                        } else {
                            a1w a1wVar2 = q1w.a;
                            if (a1wVar2 == null) {
                                a1wVar2 = null;
                            }
                            n = hg1.n(a1wVar2.E("DialogBundle", new uqm(dialogExt2.f, Source.ACTUAL)).l(new y7(new oce(dialogExt2, 16), 17)), context2, false, null, 62);
                        }
                        hg1.i(n, new vd6(context2, voipCallSource2, cVar3, 2));
                    } else if (attach instanceof AttachDonutLink) {
                        qex0.a().a(chatFragment.kn(), ((AttachDonutLink) attach).n);
                    } else {
                        chatFragment.yo(attach, aVar2);
                    }
                    boolean A4 = aVar2.A4(z);
                    boolean z5 = z3 && ((AttachImage) attach).e == 0;
                    if (attach instanceof AttachVideo) {
                        AttachVideo attachVideo = (AttachVideo) attach;
                        String platform = attachVideo.b.getPlatform();
                        if ((platform != null && platform.length() != 0 && !attachVideo.b.H6()) || !attachVideo.b.Ia()) {
                            chatFragment.yo(attach, aVar2);
                        }
                    }
                    if (z3 && (A4 || z5)) {
                        ArrayList M92 = aVar2.M9(A4, A4);
                        chatFragment.v0 = ImageViewer.a(chatFragment.t0, (AttachWithImage) attach, M92, chatFragment.kn(), new wmw(new j20(5, M92, chatFragment), new q(chatFragment, 13), new j4(5, chatFragment, msg), new yg(chatFragment, 14), new zg(chatFragment, 18), !com.vk.im.engine.utils.a.k(f, msg)), chatFragment.ro(), com.vk.dto.common.a.b(chatFragment.ko().a()), 112);
                    } else if (msg instanceof com.vk.im.engine.models.messages.a) {
                        com.vk.im.engine.models.messages.a aVar4 = (com.vk.im.engine.models.messages.a) msg;
                        List<NestedMsg> q7 = aVar4.q7();
                        if (!(q7 instanceof Collection) || !q7.isEmpty()) {
                            Iterator<T> it = q7.iterator();
                            while (it.hasNext()) {
                                if (((NestedMsg) it.next()).b == NestedMsg.Type.REPLY) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        final List g = rdi.g(aVar4.Y5(!z2));
                        final boolean sc = f.sc();
                        g120 g120Var = new g120(chatFragment.jo(), new ah(chatFragment, 13), new wn7(1, g, chatFragment), new g(chatFragment, 15), new gzs() { // from class: xsna.tqb
                            /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
                            
                                if (r0 == false) goto L17;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
                            
                                r1 = true;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
                            
                                if (com.vk.im.engine.utils.a.k(r2, r3) == false) goto L17;
                             */
                            @Override // xsna.gzs
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke() {
                                ImageViewer.c<AttachForMediaViewer> cVar4 = ChatFragment.this.w0;
                                boolean z6 = false;
                                if (cVar4 != null) {
                                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) j5g.b0(cVar4.e(), g);
                                    boolean z7 = (attachForMediaViewer != null ? attachForMediaViewer.y5() : null) != null;
                                    if (!sc) {
                                    }
                                }
                                return Boolean.valueOf(z6);
                            }
                        }, new bi0(5, g, chatFragment), new s4(chatFragment, 18), new a94(4, chatFragment, msg), new in0(chatFragment, 15), new z4(chatFragment, 19));
                        ImageViewer imageViewer = chatFragment.t0;
                        int indexOf = g.indexOf(attach);
                        FragmentActivity activity = chatFragment.getActivity();
                        if (activity == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        i2 = imageViewer.i(indexOf, g, activity, g120Var, Long.valueOf(msg.c), (r18 & 256) != 0 ? true : chatFragment.ro(), (r18 & 512) != 0 ? o25.a().c() : com.vk.dto.common.a.b(chatFragment.ko().a()));
                        chatFragment.w0 = i2;
                    }
                }
            }
            if (attach instanceof AttachDonutLink) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                el3 el3Var = Event.b;
                Event.a b = h5s.b("donut_snippet_click");
                b.a(((AttachDonutLink) attach).d, "owner_id");
                b.c("source", "snippet_message");
                n.c(b, thp0.c, bVar);
            }
            nwv nwvVar = aVar.l0.b;
            if (attach instanceof AttachLink) {
                k9w k9wVar = nwvVar.a;
                if (((Regex) laz.u.getValue()).a(Uri.parse(((AttachLink) attach).e).toString())) {
                    k9wVar.a.a(new ImCallClickAnalyticsItem.e(ImCallTypeAnalyticsItem.GROUP));
                }
            } else {
                nwvVar.getClass();
            }
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                orw orwVar = aVar.L;
                int i4 = cVar.g().a;
                orwVar.c(msg, attach, (i4 == 0 || (i = msg.d) == 0 || i <= i4) ? false : true, vm30Var.t);
            }
        }
    }

    @Override // xsna.ym30
    public final void S() {
        List<Integer> list;
        a aVar = this.a;
        v2n0 v2n0Var = aVar.K0;
        vm30 vm30Var = aVar.o;
        Collection<? extends Msg> f = vm30Var != null ? vm30Var.f() : EmptyList.b;
        l5v0 l5v0Var = aVar.O0.e;
        Dialog a = l5v0Var.d().a();
        if (a == null || (list = a.mc()) == null) {
            list = EmptyList.b;
        }
        l5f0 l5f0Var = l5v0Var.m;
        Integer a2 = l5f0Var != null ? l5f0Var.a(f, list) : null;
        if (a2 == null) {
            v2n0Var.c();
            return;
        }
        int intValue = a2.intValue();
        v2n0Var.b(new CnvMsgId(aVar.j.a, intValue));
        aVar.a2(MsgIdType.CNV_ID, intValue, "scrollToNextUnreadReaction");
    }

    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ym30
    public final void T(ug30 ug30Var, Msg msg) {
        ChatFragment.j jVar;
        ChatFragment.j jVar2;
        ChatFragment.j jVar3;
        ChatFragment.j jVar4;
        ChatFragment.j jVar5;
        ImSearchAnalytics.ClickAction clickAction = epx.f(ug30Var, ug30.c.a) ? ImSearchAnalytics.ClickAction.COPY_MESSAGE_OUT : epx.f(ug30Var, ug30.g.a) ? ImSearchAnalytics.ClickAction.DELETE_MESSAGE_OUT : epx.f(ug30Var, ug30.i.a) ? ImSearchAnalytics.ClickAction.DOWNLOAD_OUT : epx.f(ug30Var, ug30.j.a) ? ImSearchAnalytics.ClickAction.EDIT_MESSAGE_OUT : epx.f(ug30Var, ug30.m.a) ? ImSearchAnalytics.ClickAction.SHARE_OUT : (epx.f(ug30Var, ug30.q.a) || epx.f(ug30Var, ug30.r.a)) ? ImSearchAnalytics.ClickAction.REPLY_OUT : null;
        if (clickAction != null && (jVar5 = this.a.s) != null) {
            jVar5.e(clickAction);
        }
        a1w a1wVar = q1w.a;
        if (a1wVar == null) {
            a1wVar = null;
        }
        mb8 mb8Var = a1wVar.a.a.e;
        a aVar = this.a;
        if (ug30Var instanceof ug30.q) {
            Msg e = aVar.O0.e(Integer.valueOf(msg.b));
            if ((e instanceof MsgFromUser) && ((MsgFromUser) e).Qb() && (jVar4 = aVar.s) != null) {
                MsgFromUser msgFromUser = (MsgFromUser) e;
                imv imvVar = ChatFragment.this.J0;
                (imvVar != null ? imvVar : null).t(msgFromUser);
                return;
            }
            return;
        }
        if (ug30Var instanceof ug30.r) {
            Msg e2 = aVar.O0.e(Integer.valueOf(msg.b));
            if (e2 instanceof MsgFromUser) {
                MsgFromUser msgFromUser2 = (MsgFromUser) e2;
                if (!msgFromUser2.Qb() || (jVar3 = aVar.s) == null) {
                    return;
                }
                List singletonList = Collections.singletonList(k9q0.n(msgFromUser2));
                ChatFragment chatFragment = ChatFragment.this;
                o0w.x(chatFragment.r0.b(), chatFragment.kn(), Long.valueOf(chatFragment.no().b), msgFromUser2.h.b, null, null, null, false, null, null, singletonList, null, null, null, "personal_reply", null, null, null, false, null, null, null, null, null, 1073733112);
                return;
            }
            return;
        }
        if (ug30Var instanceof ug30.m) {
            aVar.n1(msg.b, ShareType.MSG_ACTION);
            return;
        }
        if (ug30Var instanceof ug30.f) {
            aVar.j1(msg.b);
            return;
        }
        if (ug30Var instanceof ug30.c) {
            aVar.j1(msg.b);
            return;
        }
        if (ug30Var instanceof ug30.t) {
            int i = msg.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            aVar.l.D(aVar, new com.vk.im.engine.commands.messages.g(i, Peer.a.b(aVar.n)));
            return;
        }
        if (ug30Var instanceof ug30.y) {
            Msg e3 = aVar.O0.e(Integer.valueOf(msg.b));
            if (!(e3 instanceof MsgFromUser) || (jVar2 = aVar.s) == null) {
                return;
            }
            MsgFromUser msgFromUser3 = (MsgFromUser) e3;
            StoryImSharingStats storyImSharingStats = new StoryImSharingStats(msgFromUser3.c, msgFromUser3.d);
            ChatFragment chatFragment2 = ChatFragment.this;
            ListBuilder e4 = e43.e();
            for (Attach attach : msgFromUser3.H) {
                if (attach instanceof AttachImage) {
                    AttachImage attachImage = (AttachImage) attach;
                    if (attachImage.v == null) {
                        e4.add(new StoryImSharingData.Photo(attachImage.t7(), storyImSharingStats));
                    }
                } else if (attach instanceof AttachVideo) {
                    AttachVideo attachVideo = (AttachVideo) attach;
                    if (attachVideo.b.O() == null) {
                        e4.add(new StoryImSharingData.Video(jeq0.g(attachVideo.b.T7()), storyImSharingStats));
                    }
                } else {
                    if (attach instanceof AttachVideoMsg) {
                        imv imvVar2 = chatFragment2.J0;
                        if (imvVar2 == null) {
                            imvVar2 = null;
                        }
                        for (e0l0 e0l0Var : imvVar2.r()) {
                            AttachVideoMsg attachVideoMsg = (AttachVideoMsg) attach;
                            if (e0l0Var.a == attachVideoMsg.c) {
                                e4.add(new StoryImSharingData.VideoMsg(attachVideoMsg.t7(), storyImSharingStats, e0l0Var.b));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    continue;
                }
            }
            ((krl0) chatFragment2.m1.getValue()).q(chatFragment2.requireContext(), MobileOfficialAppsCoreNavStat$EventScreen.STORY, e4.g());
            return;
        }
        if (ug30Var instanceof ug30.i) {
            final int i2 = msg.b;
            ChatFragment.j jVar6 = aVar.s;
            if (jVar6 != null) {
                final ChatFragment chatFragment3 = ChatFragment.this;
                gzs gzsVar = new gzs() { // from class: xsna.zqb
                    @Override // xsna.gzs
                    public final Object invoke() {
                        com.vk.im.ui.components.msg_list.a aVar2 = ChatFragment.this.H0;
                        if (aVar2 == null) {
                            aVar2 = null;
                        }
                        a1w a1wVar2 = aVar2.l;
                        Serializer.c<Peer> cVar2 = Peer.CREATOR;
                        Peer b = Peer.a.b(aVar2.n);
                        int i3 = i2;
                        io.reactivex.rxjava3.internal.operators.single.c C = a1wVar2.C("MsgListComponentNew", new rh30(b, Collections.singletonList(Integer.valueOf(i3))));
                        asu0 asu0Var = asu0.a;
                        asu0Var.getClass();
                        io.reactivex.rxjava3.internal.operators.single.b0 m = new io.reactivex.rxjava3.internal.operators.single.r(C.q(asu0.i()).m(asu0Var.d()), new jo3(new yk30(aVar2, i3, 0), 24)).m(asu0Var.d());
                        z97 z97Var = new z97(new ehu(10), 3);
                        int i4 = kwg0.a;
                        aVar2.I0(m.subscribe(z97Var, new jwg0("MsgListComponentNew")));
                        return s3q0.a;
                    }
                };
                if (gz80.a(34)) {
                    gzsVar.invoke();
                    return;
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                FragmentActivity kn = chatFragment3.kn();
                permissionHelper.getClass();
                PermissionHelper.h(permissionHelper, kn, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, gzsVar, null, 96);
                return;
            }
            return;
        }
        if ((ug30Var instanceof ug30.l) || (ug30Var instanceof ug30.j)) {
            MsgFromUser msgFromUser4 = (MsgFromUser) msg;
            aVar.N1(msgFromUser4);
            ChatFragment.j jVar7 = this.a.s;
            if (jVar7 != null) {
                jVar7.d(msgFromUser4);
                return;
            }
            return;
        }
        if (ug30Var instanceof ug30.c0) {
            aVar.z.d().m(aVar.k, com.vk.dto.common.a.b(((ug30.c0) ug30Var).a), new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
            return;
        }
        int i3 = 0;
        if (ug30Var instanceof ug30.z) {
            aVar.q2((ug30.z) ug30Var, false);
            return;
        }
        if (ug30Var instanceof ug30.a0) {
            ChatFragment.j jVar8 = aVar.s;
            if (jVar8 != null) {
                ChatFragment chatFragment4 = ChatFragment.this;
                if (msg instanceof MsgFromUser) {
                    ChatFragment.d dVar = ChatFragment.w1;
                    pnp0 pnp0Var = (pnp0) chatFragment4.i1.getValue();
                    a1w jo = chatFragment4.jo();
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    pnp0Var.b(jo, Peer.a.b(chatFragment4.ho()), msg.d, ((MsgFromUser) msg).F, chatFragment4.getParentFragmentManager(), chatFragment4.requireContext().getApplicationContext());
                }
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            return;
        }
        if (ug30Var instanceof ug30.d0) {
            aVar.a1(msg, null);
            return;
        }
        if (ug30Var instanceof ug30.n) {
            if (msg == null || (jVar = aVar.s) == null) {
                return;
            }
            ChatFragment chatFragment5 = ChatFragment.this;
            ((MessageViewsFeatureComponent) m7m.d(chatFragment5).mo408a(fpf0.a(MessageViewsFeatureComponent.class))).a().a(chatFragment5.getParentFragmentManager(), msg.d, msg.c);
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if ((ug30Var instanceof ug30.w) || (ug30Var instanceof ug30.x)) {
            int i4 = msg.b;
            ChatFragment.j jVar9 = aVar.s;
            if (jVar9 != null) {
                ChatFragment chatFragment6 = ChatFragment.this;
                arb arbVar = new arb(chatFragment6, i4, i3);
                if (gz80.a(34)) {
                    arbVar.invoke();
                    return;
                }
                PermissionHelper permissionHelper2 = PermissionHelper.a;
                FragmentActivity kn2 = chatFragment6.kn();
                permissionHelper2.getClass();
                PermissionHelper.h(permissionHelper2, kn2, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, arbVar, null, 96);
            }
        }
    }

    @Override // xsna.ym30
    public final void U(Attach attach, Msg msg, NestedMsg nestedMsg) {
        u0(msg.b);
    }

    @Override // xsna.ym30
    public final void V(float f) {
        this.a.o1().B(f);
    }

    @Override // xsna.ym30
    public final void X(qtd0 qtd0Var, FriendsAddApiCmd.Source source, FriendsAddApiCmd.BlockType blockType) {
        a aVar = this.a;
        if (aVar.v0) {
            aVar.b0.a(qtd0Var, source, blockType);
        }
    }

    @Override // xsna.ym30
    public final void Z(Msg msg, StickerItem stickerItem) {
        a aVar = this.a;
        aVar.l.D(aVar, new f9q0(msg, stickerItem, aVar.m));
    }

    @Override // xsna.ym30
    public final void a(MsgSendSource.b bVar) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            imv imvVar = chatFragment.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.a(bVar);
            mh80 mh80Var = chatFragment.P.e.d;
            BotButton botButton = bVar.a;
            mh80Var.getClass();
            if (botButton.Bb() && botButton.Ab().b == -22822305 && (botButton instanceof BotButton.Link) && drm0.D(((BotButton.Link) botButton).k, "/onboarding_find_friends", false)) {
                el3 el3Var = Event.b;
                Event.a b = h5s.b("vkm_onboarding_find_friends_press");
                b.j(thp0.c);
                b.h();
                com.vk.metrics.eventtracking.b.a.k(b.e());
            }
        }
    }

    @Override // xsna.ym30
    public final void a0() {
        this.a.o2();
    }

    @Override // xsna.ym30
    public final void c(int i, View view) {
        a aVar = this.a;
        Msg l1 = aVar.l1(i);
        MsgFromUser msgFromUser = l1 instanceof MsgFromUser ? (MsgFromUser) l1 : null;
        if (msgFromUser != null) {
            aVar.A.d.w().h(aVar.n, msgFromUser.d);
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                vm30Var.C(msgFromUser, view, new j9b(vm30Var, 3));
            }
        }
    }

    @Override // xsna.ym30
    public final void c0() {
        this.a.o1().q(jw5.d);
    }

    @Override // xsna.ym30
    public final void d(int i, String str) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            chatFragment.r0.k().b(chatFragment.kn(), str);
            chatFragment.C0.b(i, chatFragment.ho(), "card_open_link");
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ym30
    public final void d0(Collection<? extends Msg> collection, Map<Msg, vm30.e> map) {
        List<Integer> list;
        fbw fbwVar;
        fbw fbwVar2;
        VideoFile videoFile;
        String r;
        Object obj;
        a aVar = this.a;
        Stack<Integer> stack = aVar.y0;
        aVar.j0.a(collection);
        ym30.a aVar2 = aVar.k0;
        if (aVar2 != null) {
            aVar2.a(collection);
        }
        if (!stack.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((Msg) obj).Nb()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Msg msg = (Msg) obj;
            if (msg != null) {
                int i = msg.d;
                for (int size = stack.size() - 1; -1 < size; size--) {
                    if (stack.get(size).intValue() <= i) {
                        stack.remove(size);
                    }
                }
                vm30 vm30Var = aVar.o;
                if (vm30Var != null) {
                    vm30Var.p0 = !stack.isEmpty();
                }
            }
        }
        z9x0 z9x0Var = aVar.D;
        LinkedHashSet linkedHashSet = z9x0Var.i;
        LinkedHashSet linkedHashSet2 = z9x0Var.h;
        linkedHashSet2.clear();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Msg, vm30.e> entry : map.entrySet()) {
            if (entry.getKey() instanceof MsgFromUser) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put((com.vk.im.engine.models.messages.a) entry2.getKey(), entry2.getValue());
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            arrayList.addAll(rli0.A(rli0.u(rli0.j(new i5g(((com.vk.im.engine.models.messages.a) entry3.getKey()).K0()), ese.e), new puo0(4, z9x0Var, (vm30.e) entry3.getValue()))));
        }
        z9x0Var.b(arrayList);
        linkedHashSet.removeAll(linkedHashSet2);
        z9x0Var.a(linkedHashSet2, linkedHashSet);
        linkedHashSet.clear();
        linkedHashSet.addAll(linkedHashSet2);
        p8s0 p8s0Var = (p8s0) aVar.E.getValue();
        if (p8s0Var != null) {
            LinkedHashSet linkedHashSet3 = p8s0Var.d;
            LinkedHashSet linkedHashSet4 = p8s0Var.c;
            linkedHashSet4.clear();
            for (Map.Entry<Msg, vm30.e> entry4 : map.entrySet()) {
                Msg key = entry4.getKey();
                MsgFromUser msgFromUser = key instanceof MsgFromUser ? (MsgFromUser) key : null;
                if (msgFromUser != null) {
                    vm30.e value = entry4.getValue();
                    for (Attach attach : msgFromUser.H) {
                        AttachVideo attachVideo = attach instanceof AttachVideo ? (AttachVideo) attach : null;
                        if (attachVideo != null && (videoFile = attachVideo.b) != null && (r = videoFile.r()) != null) {
                            Float f = value.b;
                            p4g.a(r, linkedHashSet4, value.a >= 0.8f || (f != null && f.floatValue() >= 0.8f));
                        }
                    }
                }
            }
            linkedHashSet3.removeAll(linkedHashSet4);
            p8s0Var.a(linkedHashSet4, linkedHashSet3);
            linkedHashSet3.clear();
            linkedHashSet3.addAll(linkedHashSet4);
        }
        vm30 vm30Var2 = aVar.o;
        if (vm30Var2 != null) {
            kl30 kl30Var = vm30Var2.h0;
            if (!kl30Var.h && kl30Var.k && (fbwVar2 = vm30Var2.e) != null) {
                long j = kl30Var.g.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collection) {
                    if (((Msg) obj2) instanceof aux0) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(Integer.valueOf(((Msg) it2.next()).d));
                }
                fbwVar2.b(j, arrayList3);
            }
        }
        Dialog f2 = aVar.O0.f();
        if (f2 == null || (list = f2.mc()) == null) {
            list = EmptyList.b;
        }
        Collection<? extends Msg> collection2 = collection;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : collection2) {
            if (list.contains(Integer.valueOf(((Msg) obj3).d))) {
                arrayList4.add(obj3);
            }
        }
        if (!arrayList4.isEmpty() && (fbwVar = (fbw) aVar.N0.getValue()) != null) {
            long j2 = aVar.n;
            ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Integer.valueOf(((Msg) it3.next()).d));
            }
            fbwVar.c(j2, arrayList5);
        }
        if (epx.f(aVar.j.r, "message_push")) {
            dke0 dke0Var = aVar.I0;
            if (dke0Var.c && !collection2.isEmpty()) {
                Iterator<T> it4 = collection2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    int i2 = ((Msg) it4.next()).d;
                    Integer num = dke0Var.b;
                    if (num != null && i2 == num.intValue()) {
                        dke0Var.c = false;
                        dke0Var.b = null;
                        dke0Var.a.a();
                        break;
                    }
                }
            }
        }
        Set<Map.Entry<Msg, vm30.e>> entrySet = map.entrySet();
        int e = on00.e(c5g.u(entrySet, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e);
        Iterator<T> it5 = entrySet.iterator();
        while (it5.hasNext()) {
            Map.Entry entry5 = (Map.Entry) it5.next();
            Pair pair = new Pair(k9q0.n((Msg) entry5.getKey()), Boolean.valueOf(((vm30.e) entry5.getValue()).a()));
            linkedHashMap3.put(pair.i(), pair.j());
        }
        aVar.J0.d(linkedHashMap3);
        aVar.K0.d(linkedHashMap3);
        aVar.L0.d(linkedHashMap3);
        aVar.M0.d(linkedHashMap3);
    }

    @Override // xsna.ym30
    public final void e(List<Integer> list) {
        a aVar = this.a;
        ArrayList E = g5g.E(aVar.O0.c(list), MsgFromUser.class);
        if (E.isEmpty() || aVar.C1()) {
            return;
        }
        if (!aVar.F1()) {
            if (aVar.y1(E)) {
                aVar.e1(E);
            }
        } else if (aVar.x0.containsAll(E)) {
            aVar.S1(E);
        } else if (aVar.y1(E)) {
            aVar.e1(E);
        }
    }

    @Override // xsna.ym30
    public final void e0(Collection<? extends Msg> collection, boolean z) {
        boolean z2;
        a aVar = this.a;
        a1w a1wVar = aVar.l;
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            jVar.e(ImSearchAnalytics.ClickAction.DELETE_MESSAGE_OUT);
        }
        Collection<? extends Msg> collection2 = collection;
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Msg) it.next()).b));
        }
        if (aVar.v0 && aVar.a0 == null) {
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                com.vk.im.popup.b bVar = vm30Var.e0;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                bVar.b(new ji30(com.vk.toggle.b.A.a(imFeatures)), new btm(vm30Var, 22));
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            z2 = z;
            aVar.a0 = a1wVar.E(aVar, new fi30(Peer.a.b(aVar.n), arrayList, z2, null, aVar.m, 24)).subscribe(new afs(new u3u(aVar, 10), 6), new j720(new w7u(aVar, 13), 1));
        } else {
            z2 = z;
        }
        if (aVar.z1(collection)) {
            a1wVar.D(aVar, new knm(z2, aVar.m));
        }
    }

    @Override // xsna.ym30
    public final void f(Msg msg, NestedMsg nestedMsg) {
        a aVar = this.a;
        Stack<Integer> stack = aVar.y0;
        if (!stack.contains(Integer.valueOf(msg.d))) {
            stack.push(Integer.valueOf(msg.d));
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                vm30Var.p0 = !stack.isEmpty();
            }
        }
        aVar.J0.b(new CnvMsgId(nestedMsg.e, nestedMsg.d));
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            NestedMsg nestedMsg2 = new NestedMsg(nestedMsg);
            aVar.O0.h();
            ChatFragment chatFragment = ChatFragment.this;
            if (nestedMsg2.p) {
                ChatFragment.d dVar = ChatFragment.w1;
                o0w b = chatFragment.r0.b();
                FragmentActivity kn = chatFragment.kn();
                DialogExt dialogExt = chatFragment.V;
                b.q(kn, nestedMsg2, dialogExt != null ? dialogExt : null, chatFragment.no());
                com.vk.metrics.eventtracking.b.a.n("messages_reply_view");
                return;
            }
            int i = nestedMsg2.d;
            a aVar2 = chatFragment.H0;
            a aVar3 = aVar2 != null ? aVar2 : null;
            MsgIdType msgIdType = MsgIdType.CNV_ID;
            if (aVar3.u1(msgIdType, i)) {
                chatFragment.Ao(msgIdType, i);
            } else {
                chatFragment.zo(msgIdType, i, Source.CACHE, false);
            }
        }
    }

    @Override // xsna.ym30
    public final void f0(View view) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            mhy.d(chatFragment.getView());
            imv imvVar = chatFragment.J0;
            if (imvVar == null) {
                imvVar = null;
            }
            imvVar.h(MsgSendHidePopupsReason.SCROLL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027e  */
    @Override // xsna.ym30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i) {
        boolean z;
        boolean z2;
        ChatFragment.j jVar;
        boolean z3;
        ug30.w wVar;
        ug30.x xVar;
        List<? extends ug30> list;
        int indexOf;
        int indexOf2;
        WritePermission oc;
        WritePermission oc2;
        a aVar = this.a;
        Msg l1 = aVar.l1(i);
        MsgFromUser msgFromUser = l1 instanceof MsgFromUser ? (MsgFromUser) l1 : null;
        if (msgFromUser == null || aVar.C1()) {
            return;
        }
        if (aVar.F1()) {
            if (aVar.E1(msgFromUser)) {
                aVar.R1(msgFromUser);
                return;
            } else {
                if (aVar.D1(msgFromUser)) {
                    aVar.d1(msgFromUser);
                    return;
                }
                return;
            }
        }
        vm30 vm30Var = aVar.o;
        if (vm30Var != null ? f4m.h(vm30Var.A) : false) {
            aVar.v1();
            return;
        }
        a1w a1wVar = aVar.l;
        c cVar = aVar.O0;
        Dialog f = cVar.f();
        if (f == null) {
            list = EmptyList.b;
        } else {
            ChatSettings Hb = f.Hb();
            boolean z4 = Hb != null ? Hb.h : false;
            ArrayList a = com.vk.im.ui.components.common.a.a(a1wVar, f, Collections.singletonList(msgFromUser));
            ug30.q qVar = ug30.q.a;
            Set<Long> f2 = a1wVar.r().f();
            p4g.l(a, qVar, !aVar.q || f2.contains(f.Sb()) || f2.contains(Long.valueOf(msgFromUser.h.b)));
            ug30.r rVar = ug30.r.a;
            boolean contains = a1wVar.r().f().contains(Long.valueOf(msgFromUser.h.b));
            ChatSettings Hb2 = f.Hb();
            p4g.l(a, rVar, !aVar.r || contains || (Hb2 != null && !Hb2.N));
            ug30.m mVar = ug30.m.a;
            ChatSettings Hb3 = f.Hb();
            p4g.l(a, mVar, !aVar.r || (Hb3 != null && !Hb3.N));
            ug30.i iVar = ug30.i.a;
            ChatSettings Hb4 = f.Hb();
            p4g.l(a, iVar, (Hb4 == null || Hb4.N) ? false : true);
            p4g.l(a, ug30.g.a, cVar.g().b > 0 || z4);
            ug30.s sVar = ug30.s.a;
            ChatSettings Hb5 = f.Hb();
            boolean z5 = Hb5 != null ? Hb5.h : false;
            Set<Long> value = a1wVar.r().W.getValue();
            p4g.l(a, sVar, cVar.g().b > 0 || z5 || value.contains(f.Sb()) || value.contains(Long.valueOf(msgFromUser.h.b)));
            ug30.c cVar2 = ug30.c.a;
            ArrayList arrayList = msgFromUser.H;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((Attach) it.next()).Ya()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            ChatSettings Hb6 = f.Hb();
            p4g.l(a, cVar2, z || (Hb6 != null && !Hb6.N));
            ug30.j jVar2 = ug30.j.a;
            ChatFragment.j jVar3 = aVar.s;
            if (jVar3 != null) {
                ChatFragment chatFragment = ChatFragment.this;
                DialogHeaderController dialogHeaderController = chatFragment.K0;
                if (dialogHeaderController == null) {
                    dialogHeaderController = null;
                }
                boolean z6 = dialogHeaderController.j == DialogHeaderController.Screen.EDIT;
                DialogExt dialogExt = chatFragment.V;
                if (dialogExt == null) {
                    dialogExt = null;
                }
                Dialog Cb = dialogExt.Cb();
                boolean z7 = ((Cb == null || (oc2 = Cb.oc()) == null) ? null : oc2.a) == WritePermission.State.ENABLED;
                Set<Long> value2 = chatFragment.jo().r().Z.getValue();
                DialogExt dialogExt2 = chatFragment.V;
                if (dialogExt2 == null) {
                    dialogExt2 = null;
                }
                Dialog Cb2 = dialogExt2.Cb();
                boolean P = j5g.P(value2, Cb2 != null ? Cb2.Sb() : null);
                if (z7 && !z6 && !P) {
                    z2 = true;
                    p4g.l(a, jVar2, !z2);
                    ug30.l lVar = ug30.l.a;
                    jVar = aVar.s;
                    if (jVar != null) {
                        ChatFragment chatFragment2 = ChatFragment.this;
                        DialogHeaderController dialogHeaderController2 = chatFragment2.K0;
                        if (dialogHeaderController2 == null) {
                            dialogHeaderController2 = null;
                        }
                        boolean z8 = dialogHeaderController2.j == DialogHeaderController.Screen.EDIT;
                        DialogExt dialogExt3 = chatFragment2.V;
                        if (dialogExt3 == null) {
                            dialogExt3 = null;
                        }
                        Dialog Cb3 = dialogExt3.Cb();
                        boolean z9 = ((Cb3 == null || (oc = Cb3.oc()) == null) ? null : oc.a) == WritePermission.State.ENABLED;
                        Set<Long> value3 = chatFragment2.jo().r().Z.getValue();
                        DialogExt dialogExt4 = chatFragment2.V;
                        if (dialogExt4 == null) {
                            dialogExt4 = null;
                        }
                        Dialog Cb4 = dialogExt4.Cb();
                        boolean P2 = j5g.P(value3, Cb4 != null ? Cb4.Sb() : null);
                        if (z9 && !z8 && !P2) {
                            z3 = true;
                            p4g.l(a, lVar, !z3);
                            ug30.w wVar2 = new ug30.w(true);
                            wVar = new ug30.w(false);
                            if (msgFromUser.ec() && (indexOf2 = a.indexOf(wVar2)) != -1) {
                                a.set(indexOf2, wVar);
                            }
                            ug30.x xVar2 = new ug30.x(true);
                            xVar = new ug30.x(false);
                            if (msgFromUser.ec() && (indexOf = a.indexOf(xVar2)) != -1) {
                                a.set(indexOf, xVar);
                            }
                            list = a;
                        }
                    }
                    z3 = false;
                    p4g.l(a, lVar, !z3);
                    ug30.w wVar22 = new ug30.w(true);
                    wVar = new ug30.w(false);
                    if (msgFromUser.ec()) {
                        a.set(indexOf2, wVar);
                    }
                    ug30.x xVar22 = new ug30.x(true);
                    xVar = new ug30.x(false);
                    if (msgFromUser.ec()) {
                        a.set(indexOf, xVar);
                    }
                    list = a;
                }
            }
            z2 = false;
            p4g.l(a, jVar2, !z2);
            ug30.l lVar2 = ug30.l.a;
            jVar = aVar.s;
            if (jVar != null) {
            }
            z3 = false;
            p4g.l(a, lVar2, !z3);
            ug30.w wVar222 = new ug30.w(true);
            wVar = new ug30.w(false);
            if (msgFromUser.ec()) {
            }
            ug30.x xVar222 = new ug30.x(true);
            xVar = new ug30.x(false);
            if (msgFromUser.ec()) {
            }
            list = a;
        }
        if (list.isEmpty()) {
            return;
        }
        boolean z1 = aVar.z1(Collections.singletonList(msgFromUser));
        vm30 vm30Var2 = aVar.o;
        if (vm30Var2 != null) {
            l5v0 l5v0Var = cVar.e;
            vm30Var2.F(msgFromUser, list, z1, ((Boolean) l5v0Var.i.getValue(l5v0Var, l5v0.s[2])).booleanValue());
        }
    }

    @Override // xsna.ym30
    public final void g0(Msg msg) {
        a aVar = this.a;
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            jVar.e(ImSearchAnalytics.ClickAction.SET_REACTION_OUT);
        }
        aVar.O1(msg);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    @Override // xsna.ym30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(List<Integer> list) {
        Drawable drawable;
        a aVar = this.a;
        ArrayList E = g5g.E(aVar.O0.c(list), MsgFromUser.class);
        if (E.isEmpty() || aVar.C1()) {
            return;
        }
        if (aVar.F1()) {
            if (aVar.x0.containsAll(E)) {
                aVar.S1(E);
                return;
            } else {
                if (aVar.y1(E)) {
                    aVar.e1(E);
                    return;
                }
                return;
            }
        }
        aVar.z.getClass();
        vm30 vm30Var = aVar.o;
        if (vm30Var != null) {
            com.vk.im.popup.b bVar = vm30Var.e0;
            q9q q9qVar = q9q.j;
            Context context = bVar.a;
            String str = q9qVar.i;
            String str2 = q9qVar.f;
            String str3 = q9qVar.d;
            int i = q9qVar.a;
            if (i != 0) {
                e3m.a aVar2 = e3m.a;
                drawable = m33.a(i, context);
            } else {
                drawable = null;
            }
            if (drawable != null) {
                drawable = drawable.mutate();
                drawable.setTint(e3m.f(q9qVar.b, context));
            }
            String str4 = "";
            if (str3.length() <= 0) {
                int i2 = q9qVar.c;
                str3 = i2 != 0 ? context.getString(i2) : "";
            }
            if (str2.length() <= 0) {
                int i3 = q9qVar.e;
                str2 = i3 != 0 ? context.getString(i3) : "";
            }
            Popup.ButtonStyle buttonStyle = q9qVar.g;
            if (str.length() <= 0) {
                int i4 = q9qVar.h;
                if (i4 != 0) {
                    str = context.getString(i4);
                }
                d410 d410Var = new d410(bVar, 22);
                da50 da50Var = new da50(bVar, 14);
                b.C1130b c1130b = bVar.c;
                dw20.b R = dw20.a.R(new dw20.b(context, null).N(drawable).w0(str3), str2, 0, 0, 6);
                if (buttonStyle == Popup.ButtonStyle.PRIMARY) {
                    R = (dw20.b) dw20.a.k0((dw20.b) R, str4, new b.d(d410Var), null, null, 8);
                }
                if (buttonStyle == Popup.ButtonStyle.SECONDARY) {
                    R = ((dw20.b) R).W(str4, new b.d(d410Var));
                }
                e3m.a aVar3 = e3m.a;
                dw20.b X = ((dw20.b) R.F(m33.a(R.drawable.ic_cancel_24_in_circle_bg_transparent, context), null)).b0(new bgy(da50Var, 24)).X(new f880(da50Var, 5));
                c1130b.a();
                c1130b.d = X.I0("CurrentBottomSheet");
            }
            str4 = str;
            d410 d410Var2 = new d410(bVar, 22);
            da50 da50Var2 = new da50(bVar, 14);
            b.C1130b c1130b2 = bVar.c;
            dw20.b R2 = dw20.a.R(new dw20.b(context, null).N(drawable).w0(str3), str2, 0, 0, 6);
            if (buttonStyle == Popup.ButtonStyle.PRIMARY) {
            }
            if (buttonStyle == Popup.ButtonStyle.SECONDARY) {
            }
            e3m.a aVar32 = e3m.a;
            dw20.b X2 = ((dw20.b) R2.F(m33.a(R.drawable.ic_cancel_24_in_circle_bg_transparent, context), null)).b0(new bgy(da50Var2, 24)).X(new f880(da50Var2, 5));
            c1130b2.a();
            c1130b2.d = X2.I0("CurrentBottomSheet");
        }
    }

    @Override // xsna.ym30
    public final void h0(qtd0 qtd0Var) {
        a aVar = this.a;
        if (aVar.v0) {
            aVar.b0.c(qtd0Var);
        }
    }

    @Override // xsna.ym30
    public final void i(List<AudioTrack> list, AudioTrack audioTrack, Long l) {
        this.a.G.g(list, audioTrack, l);
    }

    @Override // xsna.ym30
    public final void i0() {
        int i;
        a aVar = this.a;
        if (!aVar.v0 || aVar.O0.j) {
            return;
        }
        if (!aVar.y0.isEmpty()) {
            Integer pop = aVar.y0.pop();
            MsgIdType msgIdType = MsgIdType.CNV_ID;
            aVar.a2(msgIdType, pop.intValue(), "scrollToActual.else");
            aVar.w1(msgIdType, pop.intValue());
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                vm30Var.p0 = !aVar.y0.isEmpty();
                return;
            }
            return;
        }
        vm30 vm30Var2 = aVar.o;
        int i2 = -1;
        if (vm30Var2 != null) {
            int i3 = aVar.O0.g().a;
            MsgLinearLayoutManager msgLinearLayoutManager = vm30Var2.I;
            int v = msgLinearLayoutManager.v();
            int x = msgLinearLayoutManager.x();
            if (v != -1 && x != -1 && v <= x) {
                while (true) {
                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g b = qk30.b(x, vm30Var2.H);
                    if (b != null) {
                        Msg Q = b.Q();
                        if (b.C0() && Q != null && (i = Q.d) > i3) {
                            i2 = i;
                            break;
                        }
                    }
                    if (x == v) {
                        break;
                    } else {
                        x--;
                    }
                }
            }
        }
        Dialog f = aVar.O0.f();
        if ((f != null ? f.Qb() : false) && i2 > 0) {
            aVar.Z1("scrollToActual.hasUnreadIncomingAndVisible", true);
            return;
        }
        Dialog f2 = aVar.O0.f();
        if (!(f2 != null ? f2.Qb() : false) || i2 >= 0) {
            aVar.Z1("scrollToActual.else", true);
        } else {
            aVar.a2(MsgIdType.CNV_ID, aVar.O0.g().a, "scrollToActual.hasUnreadIncomingNotVisible");
        }
    }

    @Override // xsna.ym30
    public final void j(Msg msg) {
        WritePermission oc;
        a aVar = this.a;
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            DialogHeaderController dialogHeaderController = chatFragment.K0;
            if (dialogHeaderController == null) {
                dialogHeaderController = null;
            }
            boolean z = dialogHeaderController.j == DialogHeaderController.Screen.EDIT;
            DialogExt dialogExt = chatFragment.V;
            if (dialogExt == null) {
                dialogExt = null;
            }
            Dialog Cb = dialogExt.Cb();
            boolean z2 = ((Cb == null || (oc = Cb.oc()) == null) ? null : oc.a) == WritePermission.State.ENABLED;
            Set<Long> value = chatFragment.jo().r().Z.getValue();
            DialogExt dialogExt2 = chatFragment.V;
            if (dialogExt2 == null) {
                dialogExt2 = null;
            }
            Dialog Cb2 = dialogExt2.Cb();
            boolean P = j5g.P(value, Cb2 != null ? Cb2.Sb() : null);
            if (!z2 || z || P) {
                return;
            }
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            aVar.N1(msgFromUser);
            ChatFragment.j jVar2 = aVar.s;
            if (jVar2 != null) {
                jVar2.d(msgFromUser);
            }
        }
    }

    @Override // xsna.ym30
    public final void j0(Attach attach) {
        a aVar = this.a;
        aVar.z.k().u(aVar.k);
    }

    @Override // xsna.ym30
    public final void k(Attach attach) {
        long j;
        a aVar = this.a;
        List singletonList = com.vk.dto.common.b.d(aVar.n) ? Collections.singletonList(Long.valueOf(aVar.n)) : EmptyList.b;
        if (attach instanceof AttachGift) {
            AttachGift attachGift = (AttachGift) attach;
            j = attachGift.b;
            if (attachGift.e()) {
                j = -j;
            }
        } else {
            j = 0;
        }
        ams.a().g(aVar.k, k0.a(j, "gift_reply_"), singletonList);
    }

    @Override // xsna.ym30
    public final void k0(Msg msg, Integer num) {
        Integer valueOf = Integer.valueOf(msg.b);
        a aVar = this.a;
        if (aVar.v0 && aVar.c0 == null) {
            vm30 vm30Var = aVar.o;
            if (vm30Var != null) {
                com.vk.im.popup.b bVar = vm30Var.e0;
                ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
                imFeatures.getClass();
                bVar.b(new b040(com.vk.toggle.b.A.a(imFeatures)), new w4u(vm30Var, 13));
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            fi30 fi30Var = new fi30(Peer.a.b(aVar.n), Collections.singletonList(valueOf), false, num, aVar.m, 4);
            aVar.c0 = aVar.l.E(aVar, fi30Var).subscribe(new m330(new ebx(aVar, fi30Var), 2), new gl30(new u6k(aVar, 22), 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.vk.im.engine.models.messages.Msg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v20, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v10, types: [com.vk.im.engine.models.messages.Msg, java.lang.Object] */
    @Override // xsna.ym30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Msg msg, com.vk.im.engine.models.messages.a aVar, AttachAudioMsg attachAudioMsg) {
        Class<? extends Attach> cls;
        a aVar2;
        c cVar;
        ArrayList<MsgFromUser> arrayList;
        boolean z;
        ArrayList arrayList2;
        a aVar3 = this.a;
        c cVar2 = aVar3.O0;
        aVar3.p1().b();
        ur4 b = aVar3.o1().b();
        lza0 lza0Var = jw5.d;
        if (b != null && b.a == attachAudioMsg.b) {
            aVar3.o1().p(lza0Var);
            return;
        }
        if (!(aVar instanceof MsgFromUser)) {
            ArrayList m9 = aVar.m9(AttachAudioMsg.class, true, false);
            if (m9.isEmpty()) {
                return;
            }
            SparseArray sparseArray = new SparseArray();
            Iterator it = m9.iterator();
            while (it.hasNext()) {
                sparseArray.put(((AttachAudioMsg) it.next()).b, msg);
            }
            ProfilesInfo h = cVar2.h();
            ir4 o1 = aVar3.o1();
            o1.r(lza0Var, hr80.C(m9, sparseArray, h));
            o1.C(lza0Var, hr80.D(attachAudioMsg, msg, h));
            o1.p(lza0Var);
            return;
        }
        long j = a.Q0;
        gj30 c = cVar2.e.d.c();
        if (c.k().isEmpty()) {
            arrayList = EmptyList.b;
        } else {
            int t = c.t(attachAudioMsg.b);
            if (t >= 0) {
                Msg msg2 = c.k().get(t);
                ArrayList arrayList3 = new ArrayList();
                cls = AttachAudioMsg.class;
                long j2 = msg2.g;
                int i = t - 1;
                while (true) {
                    if (-1 >= i) {
                        aVar2 = aVar3;
                        cVar = cVar2;
                        break;
                    }
                    Msg msg3 = c.k().get(i);
                    if (msg3 instanceof MsgFromUser) {
                        aVar2 = aVar3;
                        if (((com.vk.im.engine.models.messages.a) msg3).D3(cls, false)) {
                            z = true;
                            cVar = cVar2;
                            long abs = Math.abs(msg3.g - j2);
                            if (z || abs > j) {
                                break;
                                break;
                            }
                            arrayList3.add(msg3);
                            j2 = ((MsgFromUser) msg3).g;
                            i--;
                            aVar3 = aVar2;
                            cVar2 = cVar;
                        }
                    } else {
                        aVar2 = aVar3;
                    }
                    z = false;
                    cVar = cVar2;
                    long abs2 = Math.abs(msg3.g - j2);
                    if (z) {
                        break;
                    }
                    arrayList3.add(msg3);
                    j2 = ((MsgFromUser) msg3).g;
                    i--;
                    aVar3 = aVar2;
                    cVar2 = cVar;
                }
                Collections.reverse(arrayList3);
                arrayList3.add(msg2);
                long j3 = msg2.g;
                int size = c.k().size();
                for (int i2 = t + 1; i2 < size; i2++) {
                    Msg msg4 = c.k().get(i2);
                    boolean z2 = (msg4 instanceof MsgFromUser) && ((com.vk.im.engine.models.messages.a) msg4).D3(cls, false);
                    long abs3 = Math.abs(msg4.g - j3);
                    if (!z2 || abs3 > j) {
                        break;
                    }
                    arrayList3.add(msg4);
                    j3 = ((MsgFromUser) msg4).g;
                }
                arrayList = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof MsgFromUser) {
                        arrayList.add(next);
                    }
                }
                arrayList2 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                SparseArray sparseArray2 = new SparseArray();
                for (MsgFromUser msgFromUser : arrayList) {
                    msgFromUser.getClass();
                    a.C1125a.e(msgFromUser, cls, false, arrayList4, false);
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        sparseArray2.put(((AttachAudioMsg) it3.next()).b, msgFromUser);
                    }
                    arrayList2.addAll(arrayList4);
                    arrayList4.clear();
                }
                if (arrayList2.isEmpty()) {
                    ProfilesInfo h2 = cVar.h();
                    ir4 o12 = aVar2.o1();
                    o12.r(lza0Var, hr80.C(arrayList2, sparseArray2, h2));
                    o12.C(lza0Var, hr80.D(attachAudioMsg, msg, h2));
                    o12.p(lza0Var);
                    ((MsgFromUser) j5g.i0(arrayList)).getClass();
                    return;
                }
                return;
            }
            arrayList = EmptyList.b;
        }
        aVar2 = aVar3;
        cVar = cVar2;
        cls = AttachAudioMsg.class;
        arrayList2 = new ArrayList();
        ArrayList arrayList42 = new ArrayList();
        SparseArray sparseArray22 = new SparseArray();
        while (r6.hasNext()) {
        }
        if (arrayList2.isEmpty()) {
        }
    }

    @Override // xsna.ym30
    public final void l0() {
        uaw a;
        a aVar = this.a;
        Dialog f = aVar.O0.f();
        if (f == null) {
            return;
        }
        fbw fbwVar = (fbw) aVar.N0.getValue();
        if (fbwVar != null) {
            fbwVar.c(f.Sb().longValue(), f.mc());
        }
        j3f0 e = aVar.A.e();
        if (e == null || (a = e.a()) == null) {
            return;
        }
        a.d(f.Sb().longValue());
    }

    @Override // xsna.ym30
    public final void m(Peer peer) {
        this.a.M1(peer);
    }

    @Override // xsna.ym30
    public final void n0(Attach attach, Boolean bool, long j) {
        this.a.P1(attach, bool, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ym30
    public final void o(ImageList imageList, Msg msg, int i) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ChatFragment.d dVar = ChatFragment.w1;
            List<CarouselItem> U4 = ((com.vk.im.engine.models.messages.a) msg).U4();
            if (U4 != null) {
                Iterator<CarouselItem> it = U4.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (epx.f(imageList, it.next().f)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = i2;
                List<CarouselItem> list = U4;
                int i4 = 10;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ImageList imageList2 = ((CarouselItem) it2.next()).f;
                    ArrayList arrayList2 = new ArrayList(c5g.u(imageList2, i4));
                    for (Image image : imageList2.b) {
                        arrayList2.add(new ImageSize(image.getUrl(), image.getWidth(), image.getHeight(), Boolean.valueOf(image.c7()), ImageSize.b.d(image.getWidth(), image.getHeight(), image.c7()), false, 32, null));
                    }
                    arrayList.add(arrayList2);
                    i4 = 10;
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new com.vk.dto.common.Image((List<ImageSize>) it3.next()));
                }
                chatFragment.v0 = ImageViewer.b(chatFragment.t0, i3, arrayList3, chatFragment.kn(), chatFragment.new h(msg), chatFragment.ro(), com.vk.dto.common.a.b(chatFragment.ko().a()), 112);
            }
            chatFragment.C0.b(i, chatFragment.ho(), "card_open_photo");
        }
    }

    @Override // xsna.ym30
    public final void o0() {
        this.a.Y1();
    }

    @Override // xsna.ym30
    public final void p() {
        this.a.G.pause();
    }

    @Override // xsna.ym30
    public final void p0(Group group, View view) {
        this.a.q2(new ug30.z(group.B7(), group.Cb(), view), true);
    }

    @Override // xsna.ym30
    public final void q(Msg msg, AttachWithTranscription attachWithTranscription, boolean z) {
        if (attachWithTranscription instanceof AttachAudioMsg) {
            a aVar = this.a;
            aVar.l.D(aVar, new vr4(msg, ((AttachAudioMsg) attachWithTranscription).b, z));
        }
    }

    @Override // xsna.ym30
    public final void q0(Msg msg) {
        this.a.K1(msg);
    }

    @Override // xsna.ym30
    public final void r(Attach attach) {
        qtd0 Bb;
        VideoFile A;
        AttachWithVideo attachWithVideo = attach instanceof AttachWithVideo ? (AttachWithVideo) attach : null;
        Serializer.StreamParcelableAdapter copy = (attachWithVideo == null || (A = attachWithVideo.A()) == null) ? null : A.copy();
        ClipVideoFile clipVideoFile = copy instanceof ClipVideoFile ? (ClipVideoFile) copy : null;
        if (clipVideoFile == null || clipVideoFile.v0 == null) {
            return;
        }
        a aVar = this.a;
        ProfilesInfo h = aVar.O0.h();
        Owner owner = clipVideoFile.v0;
        if (owner != null && (Bb = h.Bb(com.vk.dto.common.a.a(owner.b))) != null) {
            owner.g(4, a.G1(Bb));
            List<CoOwnerItem> list = clipVideoFile.N1;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((CoOwnerItem) it.next()).d);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Owner owner2 = (Owner) it2.next();
                qtd0 Bb2 = h.Bb(com.vk.dto.common.a.a(owner2.b));
                if (Bb2 != null) {
                    owner2.g(4, a.G1(Bb2));
                }
            }
        }
        aVar.j.P.d(aVar.k, clipVideoFile, false, new j0u0(aVar, clipVideoFile, 3));
    }

    @Override // xsna.ym30
    public final void s0() {
        this.a.V1();
    }

    @Override // xsna.ym30
    public final void t() {
        a aVar = this.a;
        c cVar = aVar.O0;
        Dialog f = cVar.f();
        if (f == null) {
            f = new Dialog();
            f.setId(aVar.n);
        }
        aVar.z.b().E(aVar.k, new DialogExt(f, cVar.h()));
    }

    @Override // xsna.ym30
    public final void t0(Msg msg) {
        this.a.n2(msg);
    }

    @Override // xsna.ym30
    public final void u(Attach attach) {
        String sb;
        a aVar = this.a;
        if (attach instanceof AttachGift) {
            AttachGift attachGift = (AttachGift) attach;
            boolean f = attachGift.f();
            boolean d = attachGift.d();
            if (f || d) {
                List singletonList = com.vk.dto.common.b.d(aVar.n) ? Collections.singletonList(Long.valueOf(aVar.n)) : EmptyList.b;
                if (f) {
                    sb = i5s.a(new StringBuilder("https://"), a0a.d, "/stickers/catalog");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("https://" + a0a.d + "/stickers/catalog");
                    sb2.append("/animated");
                    sb = sb2.toString();
                }
                g2v.d().a().v(aVar.k, sb, "gift_choose_sticker", singletonList);
            }
        }
    }

    @Override // xsna.ym30
    public final void u0(int i) {
        a aVar = this.a;
        Msg l1 = aVar.l1(i);
        MsgFromUser msgFromUser = l1 instanceof MsgFromUser ? (MsgFromUser) l1 : null;
        if (msgFromUser == null || aVar.C1()) {
            return;
        }
        if (!aVar.F1()) {
            if (aVar.D1(msgFromUser)) {
                aVar.d1(msgFromUser);
            }
        } else if (aVar.E1(msgFromUser)) {
            aVar.R1(msgFromUser);
        } else if (aVar.D1(msgFromUser)) {
            aVar.d1(msgFromUser);
        }
    }

    @Override // xsna.ym30
    public final void v(biu biuVar) {
        a aVar = this.a;
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            jVar.e(ImSearchAnalytics.ClickAction.CALL_OUT);
        }
        ChatFragment.j jVar2 = aVar.s;
        if (jVar2 != null) {
            VoipCallSource voipCallSource = new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.IM_JOIN_MESSAGE, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT);
            umb umbVar = ChatFragment.this.Y;
            if (umbVar == null) {
                umbVar = null;
            }
            umbVar.a(biuVar, voipCallSource);
        }
    }

    @Override // xsna.ym30
    public final int v0(Direction direction) {
        a aVar = this.a;
        c cVar = aVar.O0;
        double d = aVar.j.l;
        return ((direction == Direction.BEFORE && cVar.e.d.c().b) || (direction == Direction.AFTER && cVar.e.d.c().d)) ? (int) (d * 0.5d) : (int) (1.5d * d);
    }

    @Override // xsna.ym30
    public final void w(com.vk.im.engine.models.messages.a aVar) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            mxv mxvVar = chatFragment.r0;
            if (aVar instanceof MsgFromUser) {
                o0w b = mxvVar.b();
                FragmentActivity kn = chatFragment.kn();
                MsgFromUser msgFromUser = (MsgFromUser) aVar;
                DialogExt dialogExt = chatFragment.V;
                b.s(kn, msgFromUser, dialogExt != null ? dialogExt : null, chatFragment.no());
                return;
            }
            if (aVar instanceof NestedMsg) {
                o0w b2 = mxvVar.b();
                FragmentActivity kn2 = chatFragment.kn();
                NestedMsg nestedMsg = (NestedMsg) aVar;
                DialogExt dialogExt2 = chatFragment.V;
                b2.q(kn2, nestedMsg, dialogExt2 != null ? dialogExt2 : null, chatFragment.no());
            }
        }
    }

    @Override // xsna.ym30
    public final void w0() {
        this.a.U1();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ym30
    public final void x(uh30 uh30Var) {
        ChatFragment.j jVar = this.a.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            ((ya20) chatFragment.v1.getValue()).a(chatFragment.requireContext(), uh30Var);
        }
    }

    @Override // xsna.ym30
    public final void x0() {
        List<Integer> lc;
        a aVar = this.a;
        v2n0 v2n0Var = aVar.L0;
        Dialog a = aVar.O0.e.d().a();
        Integer num = (a == null || (lc = a.lc()) == null) ? null : (Integer) j5g.o0(lc);
        if (num == null) {
            v2n0Var.c();
            return;
        }
        int intValue = num.intValue();
        v2n0Var.b(new CnvMsgId(aVar.j.a, intValue));
        aVar.a2(MsgIdType.CNV_ID, intValue, "scrollToNextUnreadMention");
    }

    @Override // xsna.ym30
    public final void y() {
        a aVar = this.a;
        vm30 vm30Var = aVar.o;
        if (vm30Var != null) {
            com.vk.im.popup.a.d(vm30Var.e0, new Popup.e(R.string.vkim_theme_alert_disable_override_title, null, R.string.vkim_theme_alert_disable_override_body, null, R.string.enable, null, R.string.cancel, 938), new k4(11, new r010(aVar, 4), new WeakReference(vm30Var.t)), null, null, 12);
        }
    }

    @Override // xsna.ym30
    public final void y0(Msg msg, AttachWithTranscription attachWithTranscription) {
        a aVar = this.a;
        a1w a1wVar = aVar.l;
        boolean z = attachWithTranscription instanceof AttachAudioMsg;
        eew eewVar = aVar.A.e;
        s140 s140Var = z ? eewVar.a : eewVar.b;
        if (attachWithTranscription.m4()) {
            s140Var.g(msg, attachWithTranscription);
            a1wVar.D(aVar, new b4v(msg.b, attachWithTranscription.xb()));
            return;
        }
        s140Var.h(msg, attachWithTranscription);
        s140Var.f(msg, attachWithTranscription, false);
        int i = msg.b;
        int xb = attachWithTranscription.xb();
        Serializer.c<Peer> cVar = Peer.CREATOR;
        a1wVar.D(aVar, new wij0(i, xb, Peer.a.b(aVar.n)));
    }

    @Override // xsna.ym30
    public final void z(int i) {
        a aVar = this.a;
        aVar.M0.b(new CnvMsgId(aVar.j.a, i));
        ChatFragment.j jVar = aVar.s;
        if (jVar != null) {
            ChatFragment chatFragment = ChatFragment.this;
            a aVar2 = chatFragment.H0;
            if (aVar2 == null) {
                aVar2 = null;
            }
            MsgIdType msgIdType = MsgIdType.CNV_ID;
            if (aVar2.u1(msgIdType, i)) {
                chatFragment.Ao(msgIdType, i);
            } else {
                chatFragment.zo(msgIdType, i, Source.CACHE, false);
            }
        }
    }

    @Override // xsna.ym30
    public final void z0(String str, Direction direction) {
        this.a.O0.e.d.b(direction);
    }

    @Override // xsna.ym30
    public final void A0() {
    }

    @Override // xsna.ym30
    public final void W() {
    }

    @Override // xsna.ym30
    public final void Y() {
    }

    @Override // xsna.ym30
    public final void b() {
    }

    @Override // xsna.ym30
    public final void b0() {
    }

    @Override // xsna.ym30
    public final void m0() {
    }

    @Override // xsna.ym30
    public final void r0() {
    }

    @Override // xsna.ym30
    public final void E0(String str) {
    }

    @Override // xsna.ym30
    public final void n(Msg msg) {
    }

    @Override // xsna.ym30
    public final void s(int i, String str) {
    }
}
