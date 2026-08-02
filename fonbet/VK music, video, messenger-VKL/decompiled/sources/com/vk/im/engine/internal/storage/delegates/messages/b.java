package com.vk.im.engine.internal.storage.delegates.messages;

import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.antispam.SpammerModel;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.monetization.presentation.ChannelMonetizationFragment;
import com.vk.clips.design.view.camera.controls.ClipsControlsView;
import com.vk.clips.sdk.shared.item.ads.c;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.common.links.LinksParserData;
import com.vk.content.design.view.camera.CameraUIView;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.voip.VoipCallSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachWithDownload;
import com.vk.dto.attaches.AttachWithId;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.ecomm.cart.impl.cart.feature.state.c;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.cart.impl.cart.ui.items.IslandPart;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.MsgCallAsrFailed;
import com.vk.im.engine.models.messages.MsgChatAvatarRemove;
import com.vk.im.engine.models.messages.MsgChatAvatarUpdate;
import com.vk.im.engine.models.messages.MsgChatCreate;
import com.vk.im.engine.models.messages.MsgChatDonKick;
import com.vk.im.engine.models.messages.MsgChatMemberInvite;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCall;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByCallLink;
import com.vk.im.engine.models.messages.MsgChatMemberInviteByMr;
import com.vk.im.engine.models.messages.MsgChatMemberKick;
import com.vk.im.engine.models.messages.MsgChatMemberKickCallBlock;
import com.vk.im.engine.models.messages.MsgChatOwnerUpdate;
import com.vk.im.engine.models.messages.MsgChatStyleUpdate;
import com.vk.im.engine.models.messages.MsgChatTitleUpdate;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgGroupCallStarted;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.messages.MsgJoinByLink;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.MsgRejectMessageRequest;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.MsgSentMessageRequest;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.MsgUnPin;
import com.vk.im.engine.models.messages.MsgUnsupported;
import com.vk.im.ui.calls.CallStartAction;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.live.impl.broadcast_settings.BroadcastSettingsFragment;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.promo.calls.CallsPromoActivity;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.v;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.text.Regex;
import ru.ok.gleffects.dto.UserInfo;
import xsna.a37;
import xsna.adp0;
import xsna.apm0;
import xsna.bm9;
import xsna.bq1;
import xsna.bsb;
import xsna.bwt0;
import xsna.by5;
import xsna.c5g;
import xsna.cq1;
import xsna.cw2;
import xsna.cy9;
import xsna.d990;
import xsna.dya;
import xsna.e0w;
import xsna.e43;
import xsna.ea6;
import xsna.egz;
import xsna.epx;
import xsna.eya;
import xsna.f4m;
import xsna.fh1;
import xsna.g2v;
import xsna.gm50;
import xsna.h1e;
import xsna.hg1;
import xsna.hu4;
import xsna.hxr0;
import xsna.isb;
import xsna.izs;
import xsna.j14;
import xsna.j5g;
import xsna.jx2;
import xsna.jy;
import xsna.k15;
import xsna.kea;
import xsna.ki8;
import xsna.l7s;
import xsna.lck0;
import xsna.lu4;
import xsna.m6d0;
import xsna.nad;
import xsna.nl;
import xsna.nlh0;
import xsna.nv3;
import xsna.o20;
import xsna.oq;
import xsna.orf;
import xsna.ov3;
import xsna.oy9;
import xsna.p4g;
import xsna.pno0;
import xsna.pv3;
import xsna.rdi;
import xsna.s3q0;
import xsna.sa;
import xsna.saz;
import xsna.t7;
import xsna.taz;
import xsna.tlo0;
import xsna.tm0;
import xsna.tpu;
import xsna.tq;
import xsna.tuq;
import xsna.tx4;
import xsna.uf1;
import xsna.va9;
import xsna.w8b;
import xsna.wjs0;
import xsna.wt4;
import xsna.x27;
import xsna.x3b;
import xsna.xh5;
import xsna.y50;
import xsna.yg5;
import xsna.ywe;
import xsna.yxa;
import xsna.zi30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0cbd  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0cb3  */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.vk.im.engine.models.messages.Msg, java.lang.Object, xsna.vsx0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v93 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        MsgDbType msgDbType;
        Peer.Type type;
        byte[] bArr;
        byte[] bArr2;
        byte[] byteArray;
        yg5 yg5Var;
        Collection<yg5> values;
        oy9 oy9Var;
        d990 d990Var;
        Iterator it;
        Throwable th;
        int i;
        int i2;
        List<a.b> list;
        boolean z;
        tlo0.a aVar;
        int i3;
        tlo0 h;
        CartItem.d.a.InterfaceC0923a interfaceC0923a;
        int i4 = this.b;
        int i5 = 6;
        int i6 = 24;
        int i7 = 2;
        int i8 = 3;
        int i9 = 8;
        Throwable th2 = null;
        int i10 = 0;
        boolean z2 = true;
        Object obj2 = this.c;
        switch (i4) {
            case 0:
                Collection<??> collection = (Collection) obj2;
                e0w e0wVar = (e0w) obj;
                int i11 = 14;
                String k = p4g.k(collection, StringUtils.COMMA, new tuq(i11));
                StringBuilder sb = new StringBuilder("DELETE FROM message_attaches WHERE msg_local_id IN(");
                sb.append(k);
                int i12 = 41;
                sb.append(')');
                e0wVar.execSQL(sb.toString());
                SQLiteStatement g = e0wVar.g("\n            REPLACE INTO messages(\n                local_id, dialog_id, cnv_msg_id, random_id,\n                time, weight, from_member_type, from_member_id,\n                is_incoming, is_important, is_hidden, is_edited,\n                sync_state, has_space_before, has_space_after, weight_before, weight_after, expire_ttl, delete_ttl, \n                pinned_at, is_expired, is_silent, phase_id, type,\n                title, avatar, member_type, member_id, body, payload,\n                attach, nested, was_played_server, was_played_local, ref, ref_source,\n                keyboard_exists, keyboard_author_type, keyboard_author_id, keyboard_one_time,\n                keyboard_column_count, keyboard_buttons, \n                carousel, \n                pinned_msg_body, pinned_msg_conv_id,\n                chat_style,\n                reactions, my_reaction_id,\n                force_autoplay_media,\n                version,\n                body_format,\n                source,\n                linked_local_id, linked_cmid,\n                nested_msgs_has_more, nested_msgs_count\n                )\n            VALUES(\n                ?,?,?,?,\n                ?,?,?,?,\n                ?,?,?,?,\n                ?,?,?,?,?,?,?,\n                ?,?,?,?,?,\n                ?,?,?,?,?,?,\n                ?,?,?,?,?,?,\n                ?,?,?,?,\n                ?,?,\n                ?,\n                ?,?,\n                ?,\n                ?,?,\n                ?,\n                ?,\n                ?,\n                ?,\n                ?, ?,\n                ?, ?\n                )\n            ");
                SQLiteStatement g2 = e0wVar.g("\n            REPLACE INTO messages_search(docid, body)\n            VALUES(?,?)\n            ");
                SQLiteStatement compileStatement = e0wVar.compileStatement("\n            INSERT INTO message_attaches(msg_local_id,attach_local_id,content_type,content_id,content_owner_id,dialog_id,mv_cnv_msg_id,position,msg_date,msg_expire_ttl) VALUES (?,?,?,?,?,?,?,?,?,?)\n            ");
                for (?? r12 : collection) {
                    g.clearBindings();
                    g.bindLong(1, r12.b);
                    g.bindLong(2, r12.c);
                    g.bindLong(3, r12.d);
                    g.bindLong(4, r12.f);
                    g.bindLong(5, r12.g);
                    g.bindLong(i5, r12.p.b);
                    g.bindLong(7, r12.getFrom().c.h());
                    g.bindLong(i9, r12.getFrom().d);
                    rdi.i(g, 9, r12.i);
                    rdi.i(g, 10, r12.j);
                    rdi.i(g, 11, r12.k);
                    rdi.i(g, 12, r12.Hb());
                    g.bindLong(13, r12.o.j());
                    rdi.i(g, i11, r12.q);
                    rdi.i(g, 15, r12.r);
                    g.bindLong(16, r12.s.b);
                    g.bindLong(17, r12.t.b);
                    rdi.l(g, 18, r12.v);
                    rdi.l(g, 19, r12.w);
                    rdi.l(g, 20, r12.y);
                    rdi.i(g, 21, r12.D);
                    rdi.i(g, 22, r12.x);
                    g.bindLong(23, r12.u);
                    MsgDbType.Companion.getClass();
                    if (r12 instanceof MsgUnsupported) {
                        msgDbType = MsgDbType.UNSUPPORTED;
                    } else if (r12 instanceof MsgFromUser) {
                        msgDbType = MsgDbType.FROM_USER;
                    } else if (r12 instanceof MsgChatCreate) {
                        msgDbType = MsgDbType.CHAT_CREATE;
                    } else if (r12 instanceof MsgChatTitleUpdate) {
                        msgDbType = MsgDbType.CHAT_TITLE_UPDATE;
                    } else if (r12 instanceof MsgChatAvatarUpdate) {
                        msgDbType = MsgDbType.CHAT_AVATAR_UPDATE;
                    } else if (r12 instanceof MsgChatAvatarRemove) {
                        msgDbType = MsgDbType.CHAT_AVATAR_REMOVE;
                    } else if (r12 instanceof MsgChatMemberInvite) {
                        msgDbType = MsgDbType.CHAT_MEMBER_INVITE;
                    } else if (r12 instanceof MsgChatMemberInviteByMr) {
                        msgDbType = MsgDbType.CHAT_MEMBER_INVITE_BY_MR;
                    } else if (r12 instanceof MsgChatMemberInviteByCall) {
                        msgDbType = MsgDbType.CHAT_MEMBER_INVITE_BY_CALL;
                    } else if (r12 instanceof MsgChatMemberInviteByCallLink) {
                        msgDbType = MsgDbType.CHAT_MEMBER_INVITE_BY_CALL_LINK;
                    } else if (r12 instanceof MsgChatMemberKick) {
                        msgDbType = MsgDbType.CHAT_MEMBER_KICK;
                    } else if (r12 instanceof MsgJoinByLink) {
                        msgDbType = MsgDbType.CHAT_JOIN_BY_LINK;
                    } else if (r12 instanceof MsgPin) {
                        msgDbType = MsgDbType.PIN;
                    } else if (r12 instanceof MsgUnPin) {
                        msgDbType = MsgDbType.UNPIN;
                    } else if (r12 instanceof MsgScreenshot) {
                        msgDbType = MsgDbType.SCREENSHOT;
                    } else if (r12 instanceof MsgGroupCallStarted) {
                        msgDbType = MsgDbType.GROUP_CALL_STARTED;
                    } else if (r12 instanceof MsgMrAccepted) {
                        msgDbType = MsgDbType.MR_ACCEPTED;
                    } else if (r12 instanceof MsgServiceCustom) {
                        msgDbType = MsgDbType.CUSTOM;
                    } else if (r12 instanceof MsgChatMemberKickCallBlock) {
                        msgDbType = MsgDbType.CHAT_MEMBER_KICK_CALL_BLOCK;
                    } else if (r12 instanceof MsgChatDonKick) {
                        msgDbType = MsgDbType.CHAT_DON_KICK;
                    } else if (r12 instanceof MsgChatStyleUpdate) {
                        msgDbType = MsgDbType.CHAT_UPDATE_STYLE;
                    } else if (r12 instanceof MsgFromChannel) {
                        msgDbType = MsgDbType.FROM_CHANNEL;
                    } else if (r12 instanceof MsgCallAsrFailed) {
                        msgDbType = MsgDbType.CALL_ASR_FAILED;
                    } else if (r12 instanceof MsgSentMessageRequest) {
                        msgDbType = MsgDbType.CHAT_REQUEST_SENT;
                    } else if (r12 instanceof MsgRejectMessageRequest) {
                        msgDbType = MsgDbType.CHAT_REQUEST_REJECT;
                    } else if (r12 instanceof MsgChatOwnerUpdate) {
                        msgDbType = MsgDbType.CHAT_OWNER_UDPATE;
                    } else {
                        if (!(r12 instanceof MsgIncomingCallPrivacy)) {
                            throw new IllegalArgumentException("Unknown class: " + r12);
                        }
                        msgDbType = MsgDbType.CANNOT_CALL_PRIVACY_SETTINGS;
                    }
                    g.bindLong(i6, msgDbType.i());
                    g.bindLong(37, 0L);
                    rdi.i(g, 49, r12.z);
                    g.bindLong(50, r12.e);
                    g.bindLong(52, r12.A.h());
                    boolean z3 = r12 instanceof MsgFromUser;
                    if (z3) {
                        MsgFromUser msgFromUser = (MsgFromUser) r12;
                        g.bindString(25, msgFromUser.E);
                        g.bindString(29, msgFromUser.F);
                        g.bindString(30, msgFromUser.N);
                        if (msgFromUser.g8()) {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            bArr = Serializer.b.f(msgFromUser.H);
                        } else {
                            bArr = null;
                        }
                        rdi.h(g, 31, bArr);
                        if (msgFromUser.j7()) {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                            bArr2 = Serializer.b.f(msgFromUser.I);
                        } else {
                            bArr2 = null;
                        }
                        rdi.h(g, 32, bArr2);
                        rdi.i(g, 33, msgFromUser.L);
                        rdi.j(g, 34, msgFromUser.M);
                        g.bindString(35, msgFromUser.O);
                        g.bindString(36, msgFromUser.P);
                        BotKeyboard botKeyboard = msgFromUser.J;
                        if (botKeyboard != null) {
                            Peer peer = botKeyboard.b;
                            rdi.i(g, 37, true);
                            g.bindLong(38, peer.c.h());
                            g.bindLong(39, peer.d);
                            rdi.i(g, 40, botKeyboard.c);
                            g.bindLong(i12, botKeyboard.e);
                            g.bindBlob(42, apm0.b(botKeyboard.f));
                        }
                        List<CarouselItem> list2 = msgFromUser.K;
                        if (list2 == null) {
                            byteArray = null;
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                            new Serializer.e(new DataOutputStream(byteArrayOutputStream)).W(list2);
                            byteArray = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                        }
                        rdi.h(g, 43, byteArray);
                        g.bindString(47, MsgReaction.a.a(msgFromUser.S));
                        rdi.k(g, 48, msgFromUser.T);
                        rdi.m(g, 51, msgFromUser.G.zb());
                        rdi.k(g, 53, msgFromUser.Q);
                        rdi.k(g, 54, msgFromUser.R);
                    } else if (r12 instanceof MsgPin) {
                        g.bindString(44, ((MsgPin) r12).E);
                        g.bindLong(45, r0.F);
                    } else if (r12 instanceof MsgUnPin) {
                        g.bindLong(45, ((MsgUnPin) r12).E);
                    } else if (r12 instanceof MsgChatCreate) {
                        g.bindString(25, ((MsgChatCreate) r12).E);
                    } else if (r12 instanceof MsgChatTitleUpdate) {
                        MsgChatTitleUpdate msgChatTitleUpdate = (MsgChatTitleUpdate) r12;
                        g.bindString(25, msgChatTitleUpdate.E);
                        String str = msgChatTitleUpdate.F;
                        if (str != null) {
                            g.bindString(30, str);
                        }
                    } else if (r12 instanceof MsgChatAvatarUpdate) {
                        HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                        g.bindBlob(26, Serializer.b.e(((MsgChatAvatarUpdate) r12).E));
                    } else if (r12 instanceof MsgChatMemberInvite) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgChatMemberInvite) r12).E.d);
                    } else if (r12 instanceof MsgChatMemberInviteByMr) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgChatMemberInviteByMr) r12).E.d);
                    } else if (r12 instanceof MsgChatMemberInviteByCall) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgChatMemberInviteByCall) r12).E.d);
                    } else if (r12 instanceof MsgChatMemberKick) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgChatMemberKick) r12).E.d);
                    } else if (r12 instanceof MsgChatMemberKickCallBlock) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgChatMemberKickCallBlock) r12).E.d);
                    } else if (r12 instanceof MsgMrAccepted) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgMrAccepted) r12).E.d);
                    } else if (r12 instanceof MsgSentMessageRequest) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgSentMessageRequest) r12).E.d);
                    } else if (r12 instanceof MsgRejectMessageRequest) {
                        g.bindLong(27, r0.E.c.h());
                        g.bindLong(28, ((MsgRejectMessageRequest) r12).E.d);
                    } else if (r12 instanceof MsgChatOwnerUpdate) {
                        MsgChatOwnerUpdate msgChatOwnerUpdate = (MsgChatOwnerUpdate) r12;
                        g.bindString(29, msgChatOwnerUpdate.E.getId());
                        Peer peer2 = msgChatOwnerUpdate.F;
                        rdi.k(g, 27, (peer2 == null || (type = peer2.c) == null) ? null : Integer.valueOf(type.h()));
                        Peer peer3 = msgChatOwnerUpdate.F;
                        rdi.l(g, 28, peer3 != null ? Long.valueOf(peer3.d) : null);
                    } else if (r12 instanceof MsgChatStyleUpdate) {
                        rdi.m(g, 46, ((MsgChatStyleUpdate) r12).E);
                    } else if (r12 instanceof MsgServiceCustom) {
                        g.bindString(29, ((MsgServiceCustom) r12).E);
                    } else if (r12 instanceof MsgIncomingCallPrivacy) {
                        g.bindString(29, ((MsgIncomingCallPrivacy) r12).E);
                    }
                    rdi.i(g, 55, r12.B);
                    g.bindLong(56, r12.C);
                    g.executeInsert();
                    if (z3) {
                        g2.bindLong(1, r0.b);
                        zi30 zi30Var = zi30.a;
                        List singletonList = Collections.singletonList((MsgFromUser) r12);
                        zi30Var.getClass();
                        zi30.b().setLength(0);
                        zi30.a(zi30.b(), singletonList);
                        g2.bindString(2, zi30.b().toString());
                        g2.executeInsert();
                    }
                    if (r12 instanceof com.vk.im.engine.models.messages.a) {
                        for (Attach attach : ((com.vk.im.engine.models.messages.a) r12).x7()) {
                            compileStatement.bindLong(1, r12.b);
                            compileStatement.bindLong(2, attach.xb());
                            Object obj3 = j14.a;
                            compileStatement.bindLong(3, j14.b(attach.getClass()));
                            compileStatement.bindLong(4, j14.a(attach));
                            compileStatement.bindLong(5, attach.q().b);
                            boolean z4 = attach instanceof AttachForMediaViewer;
                            AttachForMediaViewer attachForMediaViewer = z4 ? (AttachForMediaViewer) attach : null;
                            rdi.l(compileStatement, 6, attachForMediaViewer != null ? Long.valueOf(attachForMediaViewer.y()) : null);
                            AttachForMediaViewer attachForMediaViewer2 = z4 ? (AttachForMediaViewer) attach : null;
                            rdi.k(compileStatement, 7, attachForMediaViewer2 != null ? Integer.valueOf(attachForMediaViewer2.sa()) : null);
                            AttachForMediaViewer attachForMediaViewer3 = z4 ? (AttachForMediaViewer) attach : null;
                            rdi.k(compileStatement, 8, attachForMediaViewer3 != null ? Integer.valueOf(attachForMediaViewer3.getPosition()) : null);
                            if (z4) {
                                AttachForMediaViewer attachForMediaViewer4 = (AttachForMediaViewer) attach;
                                if (attachForMediaViewer4.Y1() != 0) {
                                    rdi.l(compileStatement, 9, Long.valueOf(attachForMediaViewer4.Y1()));
                                    AttachForMediaViewer attachForMediaViewer5 = !z4 ? (AttachForMediaViewer) attach : null;
                                    rdi.l(compileStatement, 10, attachForMediaViewer5 == null ? attachForMediaViewer5.y5() : null);
                                    compileStatement.executeInsert();
                                }
                            }
                            rdi.l(compileStatement, 9, Long.valueOf(r12.g));
                            if (!z4) {
                            }
                            rdi.l(compileStatement, 10, attachForMediaViewer5 == null ? attachForMediaViewer5.y5() : null);
                            compileStatement.executeInsert();
                        }
                    }
                    i12 = 41;
                    i11 = 14;
                    i5 = 6;
                    i6 = 24;
                    i9 = 8;
                }
                g.close();
                g2.close();
                compileStatement.close();
                return s3q0.a;
            case 1:
                ((nl) obj2).h((String) obj);
                return s3q0.a;
            case 2:
                o20 o20Var = (o20) obj2;
                TextView textView = o20Var.f;
                if (textView != null) {
                    ViewGroup viewGroup = o20Var.g;
                    if (viewGroup != null) {
                        int id = textView.getId();
                        for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            bwt0.p0(childAt, id == childAt.getId());
                        }
                    }
                    textView.setText(R.string.error);
                }
                return s3q0.a;
            case 3:
                return c.q((c) obj2, (String) obj);
            case 4:
                com.vk.photos.root.albumdetails.presentation.c cVar = (com.vk.photos.root.albumdetails.presentation.c) obj2;
                k.a aVar2 = (k.a) obj;
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                cVar.g.setSwipeRefreshEnabled(true);
                cVar.r.submitList(EmptyList.b);
                gm50.a.a(cVar, aVar2.a, new tm0(cVar, i8));
                gm50.a.a(cVar, aVar2.b, new fh1(0, cVar, ref$BooleanRef));
                gm50.a.a(cVar, aVar2.c, new uf1(1, cVar, ref$BooleanRef));
                return s3q0.a;
            case 5:
                cq1 cq1Var = (cq1) obj2;
                cq1.a aVar3 = (cq1.a) obj;
                return new v(cq1Var.g.b(aVar3.a.b, aVar3.b, aVar3.c, aVar3.d).g(new bq1(aVar3, 0)).i(new y50(new jy(cq1Var, i7), i7)), io.reactivex.rxjava3.internal.functions.a.g);
            case 6:
                ((ov3) obj2).a(new pv3.c(((nv3.a) obj).a));
                return s3q0.a;
            case 7:
                Attach attach2 = (Attach) obj;
                return Boolean.valueOf((attach2 instanceof AttachWithId) && ((AttachWithId) attach2).Ua((AttachWithDownload) obj2));
            case 8:
                lu4.a.c cVar2 = (lu4.a.c) obj;
                hu4 hu4Var = ((wt4) obj2).i1;
                (hu4Var == null ? null : hu4Var).a(cVar2);
                return s3q0.a;
            case 9:
                Iterator it2 = ((tx4) obj2).c.iterator();
                while (it2.hasNext()) {
                    ((lck0) it2.next()).getClass();
                }
                return s3q0.a;
            case 10:
                com.vk.libvideo.autoplay.b bVar = (com.vk.libvideo.autoplay.b) obj2;
                Triple triple = (Triple) obj;
                Boolean bool = (Boolean) triple.d();
                VideoMinimizableState videoMinimizableState = (VideoMinimizableState) triple.g();
                Boolean bool2 = (Boolean) triple.h();
                Map<String, yg5> c = bVar.c();
                if (c != null && (values = c.values()) != null) {
                    for (yg5 yg5Var2 : values) {
                        yg5Var2.r0(bVar.g(yg5Var2, bool.booleanValue(), videoMinimizableState, bool2.booleanValue()));
                    }
                }
                xh5 xh5Var = bVar.c;
                if (xh5Var == null || (yg5Var = xh5Var.a) == null) {
                    return s3q0.a;
                }
                if (yg5Var.G() && yg5Var.isPlaying()) {
                    yg5Var.C(true);
                    bVar.i = yg5Var;
                } else if (epx.f(bVar.i, yg5Var) && !bool2.booleanValue()) {
                    yg5Var.play();
                    bVar.i = null;
                } else if (!epx.f(bVar.i, yg5Var)) {
                    bVar.i = null;
                }
                return s3q0.a;
            case 11:
                ((ea6.c) obj2).c.d((Throwable) obj);
                return s3q0.a;
            case 12:
                pno0 pno0Var = (pno0) obj;
                Object obj4 = ((a37) obj2).o;
                ((x27) (obj4 != null ? obj4 : null)).Y(pno0Var.d().toString());
                return s3q0.a;
            case 13:
                ((BroadcastSettingsFragment.b) obj2).invoke(ki8.c.b);
                return s3q0.a;
            case 14:
                va9 va9Var = (va9) obj2;
                va9.c cVar3 = (va9.c) obj;
                if (cVar3 instanceof va9.c.b) {
                    return va9Var.h();
                }
                if (cVar3 instanceof va9.c.a) {
                    return q.T(Boolean.FALSE);
                }
                throw new NoWhenBranchMatchedException();
            case 15:
                CallsPromoActivity callsPromoActivity = (CallsPromoActivity) obj2;
                int i14 = CallsPromoActivity.l;
                g2v.c().j().c(callsPromoActivity, new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.USER_PROMO, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_USER_PROMO), Collections.singleton(CallStartAction.f.a));
                callsPromoActivity.finish();
                return s3q0.a;
            case 16:
                com.vk.cameraui.impl.a aVar4 = (com.vk.cameraui.impl.a) obj2;
                Pair pair = (Pair) obj;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) pair.d();
                boolean booleanValue = ((Boolean) pair.g()).booleanValue();
                if (mediaStoreEntry != null) {
                    aVar4.b.b0(mediaStoreEntry.f());
                    aVar4.q = mediaStoreEntry.f();
                } else if (booleanValue) {
                    CameraUIView cameraUIView = aVar4.b;
                    if (cameraUIView.r1) {
                        VkPicture photosButtonThumbBottom = cameraUIView.getPhotosButtonThumbBottom();
                        if (photosButtonThumbBottom != null) {
                            f4m.j(photosButtonThumbBottom);
                        }
                        View photosButtonRollBottom = cameraUIView.getPhotosButtonRollBottom();
                        if (photosButtonRollBottom != null) {
                            photosButtonRollBottom.setBackgroundResource(R.drawable.vk_icon_picture_outline_shadow_large_48_gallery);
                        }
                    }
                    VkPicture photosButtonThumbBottom2 = cameraUIView.getPhotosButtonThumbBottom();
                    if (photosButtonThumbBottom2 != null) {
                        photosButtonThumbBottom2.setImageResource(R.drawable.vk_icon_gallery_32);
                    }
                    VkPicture photosButtonThumbTop = cameraUIView.getPhotosButtonThumbTop();
                    if (photosButtonThumbTop != null) {
                        f4m.j(photosButtonThumbTop);
                    }
                    VkPicture photosButtonThumbTop2 = cameraUIView.getPhotosButtonThumbTop();
                    if (photosButtonThumbTop2 != null) {
                        photosButtonThumbTop2.setImageResource(R.drawable.vk_icon_gallery_32);
                    }
                }
                return s3q0.a;
            case 17:
                float f = CameraUIView.w1;
                bm9 presenter = ((CameraUIView) obj2).getPresenter();
                if (presenter != null) {
                    presenter.E3();
                }
                return s3q0.a;
            case 18:
                oy9 oy9Var2 = (oy9) obj;
                com.vk.ecomm.cart.impl.cart.feature.state.b bVar2 = ((cy9) obj2).d;
                bVar2.getClass();
                d990 d990Var2 = oy9Var2.d;
                ListBuilder e = e43.e();
                Iterator it3 = oy9Var2.c.values().iterator();
                int i15 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        Throwable th3 = th2;
                        e43.t();
                        throw th3;
                    }
                    Cart cart = (Cart) next;
                    boolean z5 = cart.h;
                    LinkedHashMap<Long, com.vk.ecomm.cart.impl.cart.feature.state.a> linkedHashMap = cart.b;
                    if (z5) {
                        oy9Var = oy9Var2;
                        d990Var = d990Var2;
                        it = it3;
                        th = th2;
                        i = i16;
                    } else {
                        Cart.Type type2 = cart.j;
                        com.vk.ecomm.cart.impl.cart.feature.state.c cVar4 = cart.a;
                        if (linkedHashMap.isEmpty()) {
                            i2 = i10;
                        } else {
                            Iterator<Map.Entry<Long, com.vk.ecomm.cart.impl.cart.feature.state.a>> it4 = linkedHashMap.entrySet().iterator();
                            i2 = i10;
                            while (it4.hasNext()) {
                                if (it4.next().getValue().f) {
                                    i2++;
                                }
                            }
                        }
                        boolean z6 = i2 > 0 ? z2 : false;
                        th = th2;
                        UserId userId = cVar4.a;
                        String str2 = cVar4.c;
                        String str3 = cVar4.b;
                        boolean z7 = cVar4.d;
                        List<c.a> list3 = cVar4.e;
                        it = it3;
                        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(((c.a) it5.next()).a);
                        }
                        e.add(new CartItem.b(userId, str2, str3, z7, arrayList, type2 == Cart.Type.MARKET, IslandPart.Top));
                        if (cart.c && !cart.g) {
                            e.add(new CartItem.a(cVar4.a, tq.h(tlo0.Companion, R.string.ecomm_cart_some_items_deleted), IslandPart.Middle));
                        }
                        Iterator<Map.Entry<Long, com.vk.ecomm.cart.impl.cart.feature.state.a>> it6 = linkedHashMap.entrySet().iterator();
                        while (it6.hasNext()) {
                            com.vk.ecomm.cart.impl.cart.feature.state.a value = it6.next().getValue();
                            a.C0919a c0919a = value.a;
                            List<a.b> list4 = value.h;
                            boolean z8 = value.f;
                            String str4 = value.g;
                            Iterator<Map.Entry<Long, com.vk.ecomm.cart.impl.cart.feature.state.a>> it7 = it6;
                            m6d0 m6d0Var = value.c;
                            int i17 = m6d0Var.a;
                            ?? valueOf = i17 != 0 ? Integer.valueOf(i17) : th;
                            if (z8) {
                                list = list4;
                                z = z8;
                                h = oq.d(tlo0.Companion, m6d0Var.c);
                            } else {
                                list = list4;
                                z = z8;
                                if (list.isEmpty()) {
                                    aVar = tlo0.Companion;
                                    i3 = R.string.ecomm_cart_product_finished;
                                } else {
                                    aVar = tlo0.Companion;
                                    i3 = R.string.ecomm_cart_no_selectet_product;
                                }
                                h = tq.h(aVar, i3);
                            }
                            String str5 = value.b;
                            ?? r2 = z ? m6d0Var.b : th;
                            int i18 = i16;
                            List<a.b> list5 = list;
                            oy9 oy9Var3 = oy9Var2;
                            d990 d990Var3 = d990Var2;
                            ArrayList arrayList2 = new ArrayList(c5g.u(list5, 10));
                            for (Iterator it8 = list5.iterator(); it8.hasNext(); it8 = it8) {
                                a.b bVar3 = (a.b) it8.next();
                                arrayList2.add(new CartItem.d.b.a(bVar3.a, bVar3.b));
                            }
                            CartItem.d.b bVar4 = new CartItem.d.b(h, str5, r2, j5g.H0(arrayList2, 5));
                            boolean z9 = value.i;
                            if (z) {
                                int i19 = value.k;
                                int i20 = value.d;
                                interfaceC0923a = new CartItem.d.a.InterfaceC0923a.C0924a(i19, i19 < i20 || (i20 == 0 && z), i19 > 1);
                            } else {
                                interfaceC0923a = !list.isEmpty() ? CartItem.d.a.InterfaceC0923a.b.a : CartItem.d.a.InterfaceC0923a.c.a;
                            }
                            e.add(new CartItem.d(c0919a, z, str4, valueOf, bVar4, new CartItem.d.a(z9, interfaceC0923a), IslandPart.Middle));
                            it6 = it7;
                            i16 = i18;
                            oy9Var2 = oy9Var3;
                            d990Var2 = d990Var3;
                        }
                        oy9Var = oy9Var2;
                        d990Var = d990Var2;
                        i = i16;
                        d990 d990Var4 = cart.f;
                        if (d990Var4.a) {
                            e.add(new CartItem.c.b.C0922c(userId, IslandPart.Middle));
                        } else if (d990Var4.b) {
                            e.add(new CartItem.c.b.a(userId, IslandPart.Middle));
                        } else if (d990Var4.c) {
                            e.add(new CartItem.c.b.C0921b(d990Var4.d, userId, IslandPart.Middle));
                        }
                        UserId userId2 = cVar4.a;
                        tlo0.a aVar5 = tlo0.Companion;
                        adp0 adp0Var = cart.d;
                        int i21 = adp0Var.a;
                        boolean z10 = adp0Var.c;
                        Object[] objArr = {Integer.valueOf(i21)};
                        aVar5.getClass();
                        e.add(new CartItem.Summary(userId2, tlo0.a.a(R.plurals.ecomm_cart_products_amount, i21, objArr), !z10 ? new tlo0.h(new Regex("<br ?/> ?").g(adp0Var.d, System.lineSeparator())) : type2 == Cart.Type.OZON ? new tlo0.f(R.string.ecomm_cart_summary_description_with_ozon) : cart.e ? new tlo0.f(R.string.ecomm_cart_summary_description_with_vk_pay) : new tlo0.f(R.string.ecomm_cart_summary_description_without_vk_pay), adp0Var.b.c, z10 ? new CartItem.Summary.Action(new tlo0.f(R.string.ecomm_cart_checkout_button), CartItem.Summary.Action.Style.Primary, CartItem.Summary.Action.Type.Checkout, z6) : new CartItem.Summary.Action(new tlo0.f(R.string.ecomm_cart_community_shop_button), CartItem.Summary.Action.Style.Secondary, CartItem.Summary.Action.Type.CommunityShop, true), z10 ? SpannableString.valueOf(bVar2.a.d(cart.l, new LinksParserData(32, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))) : th, IslandPart.Bottom));
                    }
                    it3 = it;
                    th2 = th;
                    i15 = i;
                    oy9Var2 = oy9Var;
                    d990Var2 = d990Var;
                    i10 = 0;
                    z2 = true;
                }
                oy9 oy9Var4 = oy9Var2;
                d990 d990Var5 = d990Var2;
                if (d990Var5.a) {
                    e.add(new CartItem.c.a.b(IslandPart.None));
                } else if (d990Var5.b) {
                    e.add(new CartItem.c.a.C0920a(IslandPart.None));
                }
                return new egz(e.g(), d990Var5.c, oy9Var4.h, oy9Var4.l);
            case 19:
                orf orfVar = ((kea) obj2).G;
                if (orfVar != null) {
                    orfVar.invoke();
                }
                return s3q0.a;
            case 20:
                yxa yxaVar = (yxa) obj2;
                Throwable th4 = (Throwable) obj;
                yxaVar.i.b(dya.a.a);
                yxaVar.T(new eya.b(th4));
                L.i(th4);
                return s3q0.a;
            case 21:
                int i22 = ChannelMonetizationFragment.T;
                ((ChannelMonetizationFragment) obj2).getFeature().C((x3b) obj);
                return s3q0.a;
            case 22:
                w8b w8bVar = (w8b) obj2;
                Channel channel = (Channel) obj;
                return w8bVar.a.C(w8bVar, new tpu(Collections.singletonList(channel.A), Source.NETWORK, z2, i9)).l(new t7(new by5(i8, channel, w8bVar), i5));
            case 23:
                ChatFragment chatFragment = (ChatFragment) obj2;
                ChatFragment.d dVar = ChatFragment.w1;
                ((cw2) chatFragment.j1.getValue()).b(chatFragment.getChildFragmentManager(), chatFragment.requireContext(), (SpammerModel) obj);
                return s3q0.a;
            case 24:
                isb Y0 = ((bsb) obj2).Y0();
                View view = Y0.l;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(0);
                TextView textView2 = Y0.k;
                (textView2 != null ? textView2 : null).setVisibility(8);
                return s3q0.a;
            case 25:
                VideoFile A = k15.A(((nlh0) obj2).k());
                ClipVideoFile clipVideoFile = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
                if (clipVideoFile != null) {
                    wjs0.a(new hxr0(clipVideoFile, false));
                }
                return s3q0.a;
            case 26:
                return ClipFeedSideControlsView.i((ClipFeedSideControlsView) obj2, (VideoFile) obj);
            case 27:
                nad nadVar = (nad) obj2;
                List<PrivacySetting.PrivacyRule> h2 = ywe.h((PostingVisibilityMode) obj);
                if (nadVar.p == null) {
                    nadVar.p = new PrivacySetting();
                }
                PrivacySetting privacySetting = nadVar.p;
                if (privacySetting != null) {
                    privacySetting.e = h2;
                }
                l7s l7sVar = nadVar.e;
                if (privacySetting == null) {
                    privacySetting = nadVar.m;
                }
                EmptyList emptyList = EmptyList.b;
                nadVar.S0(l7sVar, privacySetting, emptyList, emptyList);
                jx2 b = ywe.b(nadVar.f, nadVar.p, null, null, new sa(nadVar, i6));
                b.g = nadVar.c;
                io.reactivex.rxjava3.disposables.c a = b.a();
                View view2 = nadVar.h;
                hg1.b(view2 != null ? view2 : null, a);
                return s3q0.a;
            case 28:
                int i23 = ClipsControlsView.P;
                ((ClipsControlsView.a) obj2).f();
                return s3q0.a;
            default:
                h1e h1eVar = (h1e) obj2;
                UserInfo userInfo = (UserInfo) obj;
                h1eVar.j = userInfo;
                h1eVar.a.f(userInfo);
                h1eVar.d = true;
                return s3q0.a;
        }
    }
}
