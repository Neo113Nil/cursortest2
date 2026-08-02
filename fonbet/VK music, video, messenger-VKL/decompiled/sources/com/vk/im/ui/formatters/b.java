package com.vk.im.ui.formatters;

import android.content.Context;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
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
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgGroupCallStarted;
import com.vk.im.engine.models.messages.MsgIncomingCallPrivacy;
import com.vk.im.engine.models.messages.MsgJoinByLink;
import com.vk.im.engine.models.messages.MsgMrAccepted;
import com.vk.im.engine.models.messages.MsgPin;
import com.vk.im.engine.models.messages.MsgRejectMessageRequest;
import com.vk.im.engine.models.messages.MsgScreenshot;
import com.vk.im.engine.models.messages.MsgSentMessageRequest;
import com.vk.im.engine.models.messages.MsgServiceCustom;
import com.vk.im.engine.models.messages.MsgUnPin;
import com.vk.im.engine.models.messages.MsgUnsupported;
import com.vk.im.engine.models.users.UserNameCase;
import com.vkontakte.android.R;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a1w;
import xsna.cpn0;
import xsna.d02;
import xsna.en30;
import xsna.epx;
import xsna.gdp;
import xsna.i0q0;
import xsna.i7o0;
import xsna.jgp;
import xsna.klm;
import xsna.ne7;
import xsna.pdg0;
import xsna.q1w;
import xsna.qtd0;
import xsna.qz30;
import xsna.tj2;
import xsna.zdw;

/* compiled from: MsgBodyFormatter.kt */
/* loaded from: classes2.dex */
public final class b {
    public final Context a;
    public final qz30 b;
    public final en30 c;
    public final a d;
    public final gdp e = new gdp();
    public final ne7 f = new ne7();
    public final cpn0 g = new cpn0(new tj2(15));

    public b(Context context) {
        this.a = context;
        this.b = new qz30(context);
        this.c = new en30(context);
        this.d = new a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CharSequence a(Msg msg, ProfilesSimpleInfo profilesSimpleInfo, Dialog dialog, UserId userId) {
        jgp jgpVar;
        String name;
        String str;
        boolean tc = dialog != null ? dialog.tc() : false;
        if (msg instanceof MsgUnsupported) {
            return this.a.getString(R.string.vkim_msg_unsupported);
        }
        if (msg instanceof MsgFromUser) {
            MsgFromUser msgFromUser = (MsgFromUser) msg;
            return msgFromUser.D ? this.a.getString(R.string.vkim_msg_content_expired) : msgFromUser.F;
        }
        String str2 = null;
        str2 = null;
        str2 = null;
        if (msg instanceof MsgFromChannel) {
            MsgFromChannel.b bVar = ((MsgFromChannel) msg).I;
            PostDonut postDonut = bVar.g;
            PostDonut.Paywall paywall = postDonut != null ? postDonut.g : null;
            if (paywall == null) {
                return bVar.a;
            }
            String str3 = paywall.b;
            String str4 = str3 != null ? str3 : "";
            PostDonut.Snippet snippet = paywall.d;
            return (snippet == null || (str = snippet.c) == null) ? str4 : str;
        }
        if (msg instanceof MsgChatCreate) {
            MsgChatCreate msgChatCreate = (MsgChatCreate) msg;
            qz30 qz30Var = this.b;
            qtd0 zb = profilesSimpleInfo.zb(msgChatCreate.h);
            String str5 = msgChatCreate.E;
            EmptyList emptyList = EmptyList.b;
            return qz30Var.e(zb, str5, emptyList, emptyList, tc);
        }
        if (msg instanceof MsgChatTitleUpdate) {
            MsgChatTitleUpdate msgChatTitleUpdate = (MsgChatTitleUpdate) msg;
            qz30 qz30Var2 = this.b;
            qtd0 zb2 = profilesSimpleInfo.zb(msgChatTitleUpdate.h);
            String str6 = msgChatTitleUpdate.E;
            String str7 = msgChatTitleUpdate.F;
            EmptyList emptyList2 = EmptyList.b;
            return qz30Var2.j(zb2, str6, str7, emptyList2, emptyList2, emptyList2, tc);
        }
        if (msg instanceof MsgChatAvatarUpdate) {
            return this.b.d(profilesSimpleInfo.zb(((MsgChatAvatarUpdate) msg).h), EmptyList.b, tc);
        }
        if (msg instanceof MsgChatAvatarRemove) {
            return this.b.c(profilesSimpleInfo.zb(((MsgChatAvatarRemove) msg).h), EmptyList.b, tc);
        }
        if (msg instanceof MsgChatMemberInviteByMr) {
            return this.b.a(profilesSimpleInfo.zb(((MsgChatMemberInviteByMr) msg).E), EmptyList.b, R.string.vkim_msg_invite_by_mr, R.string.vkim_msg_invite_by_mr, R.string.vkim_msg_invite_by_mr, "%who_name%", true);
        }
        if (msg instanceof MsgChatMemberInvite) {
            MsgChatMemberInvite msgChatMemberInvite = (MsgChatMemberInvite) msg;
            qz30 qz30Var3 = this.b;
            if (epx.f(msgChatMemberInvite.h, msgChatMemberInvite.E)) {
                qtd0 zb3 = profilesSimpleInfo.zb(msgChatMemberInvite.h);
                EmptyList emptyList3 = EmptyList.b;
                qz30Var3.getClass();
                return qz30.b(qz30Var3, zb3, emptyList3, R.string.vkim_msg_return_female, R.string.vkim_msg_return_male, R.string.vkim_msg_return_you, "%who_name%", 64);
            }
            qtd0 zb4 = profilesSimpleInfo.zb(msgChatMemberInvite.h);
            qtd0 zb5 = profilesSimpleInfo.zb(msgChatMemberInvite.E);
            EmptyList emptyList4 = EmptyList.b;
            return qz30Var3.f(zb4, zb5, emptyList4, emptyList4);
        }
        if (msg instanceof MsgChatMemberInviteByCall) {
            MsgChatMemberInviteByCall msgChatMemberInviteByCall = (MsgChatMemberInviteByCall) msg;
            qz30 qz30Var4 = this.b;
            qtd0 zb6 = profilesSimpleInfo.zb(msgChatMemberInviteByCall.h);
            qtd0 zb7 = profilesSimpleInfo.zb(msgChatMemberInviteByCall.E);
            EmptyList emptyList5 = EmptyList.b;
            return qz30Var4.g(zb6, zb7, emptyList5, emptyList5);
        }
        if (msg instanceof MsgChatMemberInviteByCallLink) {
            qz30 qz30Var5 = this.b;
            qtd0 zb8 = profilesSimpleInfo.zb(((MsgChatMemberInviteByCallLink) msg).h);
            EmptyList emptyList6 = EmptyList.b;
            qz30Var5.getClass();
            return qz30.b(qz30Var5, zb8, emptyList6, R.string.vkim_msg_invite_by_call_link_female, R.string.vkim_msg_invite_by_call_link_male, R.string.vkim_msg_invite_by_call_link_you, null, 96);
        }
        String str8 = "…";
        if (msg instanceof MsgChatOwnerUpdate) {
            MsgChatOwnerUpdate msgChatOwnerUpdate = (MsgChatOwnerUpdate) msg;
            qz30 qz30Var6 = this.b;
            MsgChatOwnerUpdate.Type type = msgChatOwnerUpdate.E;
            qtd0 zb9 = profilesSimpleInfo.zb(msgChatOwnerUpdate.F);
            EmptyList emptyList7 = EmptyList.b;
            Context context = qz30Var6.a;
            int i = qz30.a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return qz30.b(qz30Var6, zb9, emptyList7, R.string.vkim_msg_owner_update_female, R.string.vkim_msg_owner_update_male, R.string.vkim_msg_owner_update_you, "%who_name%", 64);
            }
            if (i == 2) {
                return context.getString(R.string.vkim_msg_owner_update_anyuser);
            }
            if (i != 3) {
                if (i == 4) {
                    return context.getString(R.string.vkim_msg_owner_update_anyadmin);
                }
                throw new NoWhenBranchMatchedException();
            }
            if (zb9 != null && (name = zb9.name()) != null) {
                str8 = name;
            }
            return context.getString(R.string.vkim_msg_owner_update_user, str8);
        }
        if (msg instanceof MsgChatMemberKick) {
            MsgChatMemberKick msgChatMemberKick = (MsgChatMemberKick) msg;
            qz30 qz30Var7 = this.b;
            qtd0 zb10 = profilesSimpleInfo.zb(msgChatMemberKick.h);
            qtd0 zb11 = profilesSimpleInfo.zb(msgChatMemberKick.E);
            EmptyList emptyList8 = EmptyList.b;
            return qz30Var7.h(zb10, zb11, emptyList8, emptyList8);
        }
        if (msg instanceof MsgChatMemberKickCallBlock) {
            return this.b.i(profilesSimpleInfo.zb(((MsgChatMemberKickCallBlock) msg).E), EmptyList.b, tc);
        }
        if (msg instanceof MsgChatDonKick) {
            return this.a.getString(R.string.vkim_msg_kick_don);
        }
        if (msg instanceof MsgPin) {
            MsgPin msgPin = (MsgPin) msg;
            qtd0 Ab = profilesSimpleInfo.Ab(Long.valueOf(msgPin.h.d));
            qz30 qz30Var8 = this.b;
            String str9 = msgPin.E;
            EmptyList emptyList9 = EmptyList.b;
            return qz30Var8.m(Ab, str9, userId, emptyList9, emptyList9);
        }
        if (msg instanceof MsgUnPin) {
            qtd0 Ab2 = profilesSimpleInfo.Ab(Long.valueOf(((MsgUnPin) msg).h.d));
            qz30 qz30Var9 = this.b;
            EmptyList emptyList10 = EmptyList.b;
            return qz30.l(qz30Var9, Ab2, R.string.vkim_msg_unpin_you, R.string.vkim_msg_unpin_female, R.string.vkim_msg_unpin_male, emptyList10, qz30Var9.a.getString(R.string.vkim_msg), "%message%", emptyList10, null, 514);
        }
        if (msg instanceof MsgJoinByLink) {
            qz30 qz30Var10 = this.b;
            qtd0 zb12 = profilesSimpleInfo.zb(((MsgJoinByLink) msg).h);
            EmptyList emptyList11 = EmptyList.b;
            qz30Var10.getClass();
            return qz30.b(qz30Var10, zb12, emptyList11, R.string.vkim_msg_join_link_female, R.string.vkim_msg_join_link_male, R.string.vkim_msg_join_link_you, null, 96);
        }
        if (msg instanceof MsgScreenshot) {
            return this.b.n(profilesSimpleInfo.zb(((MsgScreenshot) msg).h), EmptyList.b, tc);
        }
        if (msg instanceof MsgGroupCallStarted) {
            qz30 qz30Var11 = this.b;
            qtd0 zb13 = profilesSimpleInfo.zb(((MsgGroupCallStarted) msg).h);
            EmptyList emptyList12 = EmptyList.b;
            qz30Var11.getClass();
            return qz30.b(qz30Var11, zb13, emptyList12, R.string.vkim_msg_group_call_started_female, R.string.vkim_msg_group_call_started_male, R.string.vkim_msg_group_call_started_you, null, 96);
        }
        if (msg instanceof MsgMrAccepted) {
            boolean booleanValue = ((Boolean) this.g.a()).booleanValue();
            qz30 qz30Var12 = this.b;
            qtd0 zb14 = profilesSimpleInfo.zb(((MsgMrAccepted) msg).E);
            EmptyList emptyList13 = EmptyList.b;
            if (booleanValue) {
                return qz30Var12.a.getString(R.string.vkim_msg_mr_edu_accepted);
            }
            qz30Var12.getClass();
            return qz30.b(qz30Var12, zb14, emptyList13, R.string.vkim_msg_mr_accepted, R.string.vkim_msg_mr_accepted, R.string.vkim_msg_mr_accepted, "%contact%", 64);
        }
        if (!(msg instanceof MsgChatStyleUpdate)) {
            if (msg instanceof MsgCallAsrFailed) {
                return this.a.getString(R.string.vkim_msg_call_asr_failed);
            }
            if (msg instanceof MsgServiceCustom) {
                return ((MsgServiceCustom) msg).E;
            }
            if (msg instanceof MsgIncomingCallPrivacy) {
                MsgIncomingCallPrivacy msgIncomingCallPrivacy = (MsgIncomingCallPrivacy) msg;
                ne7 ne7Var = this.f;
                Context context2 = this.a;
                ne7Var.getClass();
                if (!msgIncomingCallPrivacy.i) {
                    return context2.getString(R.string.vkim_msg_incoming_call_privacy_outgoing);
                }
                qtd0 Ab3 = profilesSimpleInfo.Ab(Long.valueOf(msgIncomingCallPrivacy.c));
                if (Ab3 == null) {
                    return "";
                }
                return context2.getString(Ab3.B2() == UserSex.FEMALE ? R.string.vkim_msg_incoming_call_privacy_incoming_female : R.string.vkim_msg_incoming_call_privacy_incoming_male, Arrays.copyOf(new Object[]{Ab3.d6(UserNameCase.NOM)}, 1));
            }
            if (msg instanceof MsgRejectMessageRequest) {
                return ((Boolean) this.g.a()).booleanValue() ? this.b.a.getString(R.string.vkim_msg_chat_request_conversation_reject) : this.a.getString(R.string.vkim_msg_unsupported);
            }
            if (!(msg instanceof MsgSentMessageRequest)) {
                return "…";
            }
            if (!((Boolean) this.g.a()).booleanValue()) {
                return this.a.getString(R.string.vkim_msg_unsupported);
            }
            qz30 qz30Var13 = this.b;
            UserId b = com.vk.dto.common.a.b(((MsgSentMessageRequest) msg).E);
            Context context3 = qz30Var13.a;
            return b.equals(qz30Var13.b.c()) ? context3.getString(R.string.vkim_msg_chat_request_conversation_sender) : context3.getString(R.string.vkim_msg_chat_request_conversation_receiver);
        }
        MsgChatStyleUpdate msgChatStyleUpdate = (MsgChatStyleUpdate) msg;
        qz30 qz30Var14 = this.b;
        qtd0 zb15 = profilesSimpleInfo.zb(msgChatStyleUpdate.h);
        String str10 = msgChatStyleUpdate.E;
        if (str10 != null) {
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            d02 d02Var = zdwVar.r != null ? new d02() : null;
            if (d02Var != null) {
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                pdg0 o = a1wVar.o(d02Var, new klm(Source.CACHE, false), i0q0.b() ? 200L : 0L);
                if (o instanceof pdg0.a) {
                    jgpVar = jgp.b;
                } else {
                    if (!(o instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jgpVar = ((pdg0.b) o).a;
                }
                jgp jgpVar2 = jgpVar;
                if (jgpVar2 != null) {
                    str2 = (String) jgpVar2.get(str10);
                }
            }
            if (str2 == null) {
                str2 = "";
            }
        }
        EmptyList emptyList14 = EmptyList.b;
        return qz30Var14.k(zb15, emptyList14, str2, "", emptyList14);
    }
}
