package com.vk.im.engine.internal.storage.delegates.messages;

import android.database.Cursor;
import com.vk.core.serialize.Serializer;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.messages.MessageSource;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.internal.storage.delegates.messages.MsgDbType;
import com.vk.im.engine.models.carousel.CarouselItem;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.messages.Msg;
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
import com.vk.im.engine.models.messages.NestedMsg;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.apm0;
import xsna.e43;
import xsna.fl3;
import xsna.gkx0;
import xsna.j5g;
import xsna.lj30;

/* compiled from: MsgDbReader.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final List<String> a;
    public static final String b;

    /* compiled from: MsgDbReader.kt */
    /* renamed from: com.vk.im.engine.internal.storage.delegates.messages.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1120a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgDbType.values().length];
            try {
                iArr[MsgDbType.UNSUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgDbType.FROM_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgDbType.CHAT_CREATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgDbType.CHAT_TITLE_UPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MsgDbType.CHAT_AVATAR_UPDATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MsgDbType.CHAT_AVATAR_REMOVE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_INVITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_INVITE_BY_MR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_INVITE_BY_CALL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_INVITE_BY_CALL_LINK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_KICK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MsgDbType.CHAT_MEMBER_KICK_CALL_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MsgDbType.CHAT_DON_KICK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MsgDbType.CHAT_JOIN_BY_LINK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MsgDbType.PIN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MsgDbType.UNPIN.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MsgDbType.SCREENSHOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MsgDbType.GROUP_CALL_STARTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MsgDbType.CALL_ASR_FAILED.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MsgDbType.MR_ACCEPTED.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MsgDbType.CHAT_UPDATE_STYLE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MsgDbType.CUSTOM.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MsgDbType.FROM_CHANNEL.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MsgDbType.CHAT_REQUEST_SENT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MsgDbType.CHAT_REQUEST_REJECT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MsgDbType.CHAT_OWNER_UDPATE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MsgDbType.CANNOT_CALL_PRIVACY_SETTINGS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> l = e43.l("dialog_id", "local_id", "cnv_msg_id", "is_hidden", "has_space_before", "has_space_after", "weight_before", "weight_after", "weight", "sync_state", "phase_id", "time");
        a = l;
        b = j5g.g0(l, null, null, null, 0, null, 63);
    }

    public static lj30 a(Cursor cursor) {
        int i = cursor.getInt(2);
        long j = cursor.getLong(0);
        int i2 = cursor.getInt(1);
        boolean w = fl3.w(cursor, 3);
        boolean w2 = fl3.w(cursor, 4);
        boolean w3 = fl3.w(cursor, 5);
        gkx0 gkx0Var = new gkx0(cursor.getLong(6));
        gkx0 gkx0Var2 = new gkx0(cursor.getLong(7));
        gkx0 gkx0Var3 = new gkx0(cursor.getLong(8));
        MsgSyncState.a aVar = MsgSyncState.Companion;
        int i3 = cursor.getInt(9);
        aVar.getClass();
        return new lj30(j, i2, i, w, gkx0Var, gkx0Var2, gkx0Var3, w2, w3, MsgSyncState.a.a(i3), cursor.getInt(10), i == 0, cursor.getLong(11));
    }

    public static Msg b(Cursor cursor) {
        BotKeyboard botKeyboard;
        Msg msgChatOwnerUpdate;
        MsgDbType.a aVar = MsgDbType.Companion;
        int A = fl3.A(cursor, "type");
        aVar.getClass();
        MsgDbType a2 = MsgDbType.a.a(A);
        ArrayList arrayList = null;
        r12 = null;
        Peer peer = null;
        switch (C1120a.$EnumSwitchMapping$0[a2.ordinal()]) {
            case 1:
                msgChatOwnerUpdate = new MsgUnsupported();
                break;
            case 2:
                MsgFromUser msgFromUser = new MsgFromUser();
                msgFromUser.E = fl3.E(cursor, "title");
                msgFromUser.F = fl3.E(cursor, "body");
                MsgTextFormat msgTextFormat = MsgTextFormat.d;
                msgFromUser.G = MsgTextFormat.a.a(fl3.F(cursor, "body_format"));
                msgFromUser.N = fl3.E(cursor, "payload");
                msgFromUser.L = fl3.x(cursor, "was_played_server");
                msgFromUser.M = fl3.y(cursor, "was_played_local");
                msgFromUser.O = fl3.E(cursor, "ref");
                msgFromUser.P = fl3.E(cursor, "ref_source");
                byte[] v = fl3.v(cursor, "attach");
                if (v != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                    msgFromUser.H = Serializer.b.b(v, Attach.class.getClassLoader());
                }
                byte[] v2 = fl3.v(cursor, "nested");
                if (v2 != null) {
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap2 = Serializer.a;
                    msgFromUser.I = Serializer.b.b(v2, NestedMsg.class.getClassLoader());
                }
                if (fl3.x(cursor, "keyboard_exists")) {
                    byte[] v3 = fl3.v(cursor, "keyboard_buttons");
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    Peer.Type.a aVar2 = Peer.Type.Companion;
                    int A2 = fl3.A(cursor, "keyboard_author_type");
                    aVar2.getClass();
                    botKeyboard = new BotKeyboard(Peer.a.a(fl3.C(cursor, "keyboard_author_id"), Peer.Type.a.a(A2)), fl3.x(cursor, "keyboard_one_time"), true, fl3.A(cursor, "keyboard_column_count"), v3 != null ? apm0.a(v3) : EmptyList.b);
                } else {
                    botKeyboard = null;
                }
                msgFromUser.J = botKeyboard;
                byte[] v4 = fl3.v(cursor, "carousel");
                if (v4 != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(v4);
                    HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap3 = Serializer.a;
                    arrayList = new Serializer.d(new DataInputStream(byteArrayInputStream)).l(CarouselItem.class.getClassLoader());
                    byteArrayInputStream.close();
                }
                msgFromUser.K = arrayList;
                msgFromUser.T = fl3.B(cursor, "my_reaction_id");
                msgFromUser.S = MsgReaction.a.b(fl3.F(cursor, "reactions"));
                msgFromUser.Q = fl3.B(cursor, "linked_local_id");
                msgFromUser.R = fl3.B(cursor, "linked_cmid");
                msgChatOwnerUpdate = msgFromUser;
                break;
            case 3:
                MsgChatCreate msgChatCreate = new MsgChatCreate();
                msgChatCreate.E = fl3.E(cursor, "title");
                msgChatOwnerUpdate = msgChatCreate;
                break;
            case 4:
                MsgChatTitleUpdate msgChatTitleUpdate = new MsgChatTitleUpdate();
                msgChatTitleUpdate.E = fl3.E(cursor, "title");
                msgChatTitleUpdate.F = fl3.F(cursor, "payload");
                msgChatOwnerUpdate = msgChatTitleUpdate;
                break;
            case 5:
                MsgChatAvatarUpdate msgChatAvatarUpdate = new MsgChatAvatarUpdate();
                HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap4 = Serializer.a;
                msgChatAvatarUpdate.E = (ImageList) Serializer.b.a(cursor.getBlob(cursor.getColumnIndexOrThrow("avatar")), ImageList.class.getClassLoader());
                msgChatOwnerUpdate = msgChatAvatarUpdate;
                break;
            case 6:
                msgChatOwnerUpdate = new MsgChatAvatarRemove();
                break;
            case 7:
                MsgChatMemberInvite msgChatMemberInvite = new MsgChatMemberInvite();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                Peer.Type.a aVar3 = Peer.Type.Companion;
                int A3 = fl3.A(cursor, "member_type");
                aVar3.getClass();
                msgChatMemberInvite.E = Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A3));
                msgChatOwnerUpdate = msgChatMemberInvite;
                break;
            case 8:
                Serializer.c<Peer> cVar3 = Peer.CREATOR;
                Peer.Type.a aVar4 = Peer.Type.Companion;
                int A4 = fl3.A(cursor, "member_type");
                aVar4.getClass();
                msgChatOwnerUpdate = new MsgChatMemberInviteByMr(Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A4)));
                break;
            case 9:
                MsgChatMemberInviteByCall msgChatMemberInviteByCall = new MsgChatMemberInviteByCall();
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                Peer.Type.a aVar5 = Peer.Type.Companion;
                int A5 = fl3.A(cursor, "member_type");
                aVar5.getClass();
                msgChatMemberInviteByCall.E = Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A5));
                msgChatOwnerUpdate = msgChatMemberInviteByCall;
                break;
            case 10:
                msgChatOwnerUpdate = new MsgChatMemberInviteByCallLink();
                break;
            case 11:
                MsgChatMemberKick msgChatMemberKick = new MsgChatMemberKick();
                Serializer.c<Peer> cVar5 = Peer.CREATOR;
                Peer.Type.a aVar6 = Peer.Type.Companion;
                int A6 = fl3.A(cursor, "member_type");
                aVar6.getClass();
                msgChatMemberKick.E = Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A6));
                msgChatOwnerUpdate = msgChatMemberKick;
                break;
            case 12:
                MsgChatMemberKickCallBlock msgChatMemberKickCallBlock = new MsgChatMemberKickCallBlock();
                Serializer.c<Peer> cVar6 = Peer.CREATOR;
                Peer.Type.a aVar7 = Peer.Type.Companion;
                int A7 = fl3.A(cursor, "member_type");
                aVar7.getClass();
                msgChatMemberKickCallBlock.E = Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A7));
                msgChatOwnerUpdate = msgChatMemberKickCallBlock;
                break;
            case 13:
                msgChatOwnerUpdate = new MsgChatDonKick();
                break;
            case 14:
                msgChatOwnerUpdate = new MsgJoinByLink();
                break;
            case 15:
                MsgPin msgPin = new MsgPin(null, 0, 3, null);
                String F = fl3.F(cursor, "pinned_msg_body");
                msgPin.E = F != null ? F : "";
                Integer B = fl3.B(cursor, "pinned_msg_conv_id");
                msgPin.F = B != null ? B.intValue() : -1;
                msgChatOwnerUpdate = msgPin;
                break;
            case 16:
                MsgUnPin msgUnPin = new MsgUnPin(0, 1, null);
                Integer B2 = fl3.B(cursor, "pinned_msg_conv_id");
                msgUnPin.E = B2 != null ? B2.intValue() : -1;
                msgChatOwnerUpdate = msgUnPin;
                break;
            case 17:
                msgChatOwnerUpdate = new MsgScreenshot();
                break;
            case 18:
                msgChatOwnerUpdate = new MsgGroupCallStarted();
                break;
            case 19:
                msgChatOwnerUpdate = new MsgCallAsrFailed();
                break;
            case 20:
                Serializer.c<Peer> cVar7 = Peer.CREATOR;
                Peer.Type.a aVar8 = Peer.Type.Companion;
                int A8 = fl3.A(cursor, "member_type");
                aVar8.getClass();
                msgChatOwnerUpdate = new MsgMrAccepted(Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A8)));
                break;
            case 21:
                msgChatOwnerUpdate = new MsgChatStyleUpdate(fl3.F(cursor, "chat_style"));
                break;
            case 22:
                MsgServiceCustom msgServiceCustom = new MsgServiceCustom(null, 1, null);
                String F2 = fl3.F(cursor, "body");
                msgServiceCustom.E = F2 != null ? F2 : "";
                msgChatOwnerUpdate = msgServiceCustom;
                break;
            case 23:
                throw new IllegalArgumentException("type  = " + a2 + " not supported in dialog messages");
            case 24:
                Serializer.c<Peer> cVar8 = Peer.CREATOR;
                Peer.Type.a aVar9 = Peer.Type.Companion;
                int A9 = fl3.A(cursor, "member_type");
                aVar9.getClass();
                msgChatOwnerUpdate = new MsgSentMessageRequest(Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A9)));
                break;
            case 25:
                Serializer.c<Peer> cVar9 = Peer.CREATOR;
                Peer.Type.a aVar10 = Peer.Type.Companion;
                int A10 = fl3.A(cursor, "member_type");
                aVar10.getClass();
                msgChatOwnerUpdate = new MsgRejectMessageRequest(Peer.a.a(fl3.C(cursor, "member_id"), Peer.Type.a.a(A10)));
                break;
            case 26:
                MsgChatOwnerUpdate.Type.a aVar11 = MsgChatOwnerUpdate.Type.Companion;
                String E = fl3.E(cursor, "body");
                aVar11.getClass();
                MsgChatOwnerUpdate.Type a3 = MsgChatOwnerUpdate.Type.a.a(E);
                Integer B3 = fl3.B(cursor, "member_type");
                Long D = fl3.D(cursor, "member_id");
                if (B3 != null && D != null) {
                    long longValue = D.longValue();
                    int intValue = B3.intValue();
                    Serializer.c<Peer> cVar10 = Peer.CREATOR;
                    Peer.Type.Companion.getClass();
                    peer = Peer.a.a(longValue, Peer.Type.a.a(intValue));
                }
                msgChatOwnerUpdate = new MsgChatOwnerUpdate(a3, peer);
                break;
            case 27:
                MsgIncomingCallPrivacy msgIncomingCallPrivacy = new MsgIncomingCallPrivacy(null, 1, null);
                String F3 = fl3.F(cursor, "body");
                msgIncomingCallPrivacy.E = F3 != null ? F3 : "";
                msgChatOwnerUpdate = msgIncomingCallPrivacy;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        msgChatOwnerUpdate.b = fl3.A(cursor, "local_id");
        msgChatOwnerUpdate.c = fl3.C(cursor, "dialog_id");
        msgChatOwnerUpdate.d = fl3.A(cursor, "cnv_msg_id");
        msgChatOwnerUpdate.f = fl3.A(cursor, "random_id");
        msgChatOwnerUpdate.g = fl3.C(cursor, "time");
        Serializer.c<Peer> cVar11 = Peer.CREATOR;
        Peer.Type.a aVar12 = Peer.Type.Companion;
        int A11 = fl3.A(cursor, "from_member_type");
        aVar12.getClass();
        msgChatOwnerUpdate.Vb(Peer.a.a(fl3.C(cursor, "from_member_id"), Peer.Type.a.a(A11)));
        msgChatOwnerUpdate.i = fl3.x(cursor, "is_incoming");
        msgChatOwnerUpdate.j = fl3.x(cursor, "is_important");
        msgChatOwnerUpdate.k = fl3.x(cursor, "is_hidden");
        msgChatOwnerUpdate.Ub(fl3.x(cursor, "is_edited"));
        MsgSyncState.a aVar13 = MsgSyncState.Companion;
        int A12 = fl3.A(cursor, "sync_state");
        aVar13.getClass();
        msgChatOwnerUpdate.o = MsgSyncState.a.a(A12);
        msgChatOwnerUpdate.v = fl3.D(cursor, "expire_ttl");
        msgChatOwnerUpdate.w = fl3.D(cursor, "delete_ttl");
        msgChatOwnerUpdate.y = fl3.D(cursor, "pinned_at");
        msgChatOwnerUpdate.D = fl3.x(cursor, "is_expired");
        msgChatOwnerUpdate.x = fl3.x(cursor, "is_silent");
        msgChatOwnerUpdate.z = fl3.x(cursor, "force_autoplay_media");
        msgChatOwnerUpdate.e = fl3.C(cursor, "version");
        MessageSource.a aVar14 = MessageSource.Companion;
        int A13 = fl3.A(cursor, "source");
        aVar14.getClass();
        msgChatOwnerUpdate.A = MessageSource.a.a(A13);
        msgChatOwnerUpdate.B = fl3.x(cursor, "nested_msgs_has_more");
        msgChatOwnerUpdate.C = fl3.A(cursor, "nested_msgs_count");
        msgChatOwnerUpdate.p = new gkx0(fl3.C(cursor, "weight"));
        msgChatOwnerUpdate.q = fl3.x(cursor, "has_space_before");
        msgChatOwnerUpdate.r = fl3.x(cursor, "has_space_after");
        msgChatOwnerUpdate.s = new gkx0(fl3.C(cursor, "weight_before"));
        msgChatOwnerUpdate.t = new gkx0(fl3.C(cursor, "weight_after"));
        msgChatOwnerUpdate.u = fl3.A(cursor, "phase_id");
        return msgChatOwnerUpdate;
    }
}
