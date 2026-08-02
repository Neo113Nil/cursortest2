package com.vk.im.engine.models.dialogs;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.WritePermission;
import com.vk.im.engine.models.ConversationCard;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.MsgRequestStatus;
import com.vk.im.engine.models.conversations.BotKeyboard;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.engine.models.im_item.ImItemType;
import com.vk.im.engine.models.messages.DraftMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.a5w;
import xsna.b5w;
import xsna.bh10;
import xsna.bpn0;
import xsna.btx0;
import xsna.e43;
import xsna.epx;
import xsna.fw3;
import xsna.gkx0;
import xsna.lmm;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.uy2;
import xsna.vjm;
import xsna.x5;
import xsna.x7w;
import xsna.xo9;
import xsna.zcl;

/* compiled from: Dialog.kt */
/* loaded from: classes2.dex */
public final class Dialog extends Serializer.StreamParcelableAdapter implements Serializable, btx0, Comparable<Dialog>, a5w {
    public static final Serializer.c<Dialog> CREATOR = new c();
    public static final bpn0 b = new bpn0(new x5(15));
    public static final long serialVersionUID = 5615058008590650429L;
    private InfoBar bar;
    private BusinessNotifyInfo businessNotifyInfo;
    private boolean businessNotifyInfoVisible;
    private boolean canMarkAsSpam;
    private boolean canPromoGifts;
    private boolean canReceiveMoney;
    private boolean canSendMoney;
    private ChatSettings chatSettings;
    private ConversationCard conversationCard;
    private int countUnread;
    private DraftMsg draftMsg;
    private List<Integer> expireMsgCnvIds;
    private long flags;
    private boolean groupCallBarHiddenLocally;
    private GroupCallInProgress groupCallInProgress;
    private long id;
    private b5w imItemId;
    private final ImItemType imItemType;
    private x7w imItemWeight;
    private boolean isArchived;
    private boolean isDead;
    private boolean isMarkReadAvailable;
    private boolean isMarkUnreadAvailable;
    private boolean isNew;
    private boolean isPromo;
    private boolean isService;
    private boolean isWithSelf;
    private BotKeyboard keyboard;
    private boolean keyboardVisible;
    private int lastMsgCnvId;
    private boolean markedAsUnread;
    private long msgRequestDate;
    private Peer msgRequestInviter;
    private MsgRequestStatus msgRequestStatus;
    public long notificationsDisabledUntil;
    public boolean notificationsIsUseSound;
    private JSONObject payload;
    private PinnedMsg pinnedMsg;
    private boolean pinnedMsgVisible;
    private int readTillInMsgCnvId;
    private int readTillOutMsgCnvId;
    private List<Integer> tags;
    private DialogTheme theme;
    private com.vk.im.engine.models.dialogs.c themeId;
    private int timestamp;
    private TransitionData transitionData;
    private int type;
    private List<Integer> unreadMentionMsgCnvIds;
    private List<Integer> unreadReactions;
    private gkx0 weight;
    private WritePermission writePermission;

    /* compiled from: Dialog.kt */
    public static final class a {
    }

    /* compiled from: Dialog.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WritePermission.State.values().length];
            try {
                iArr[WritePermission.State.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WritePermission.State.DISABLED_RESTRICTED_TO_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class c extends Serializer.c<Dialog> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Dialog a(Serializer serializer) {
            return new Dialog(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Dialog[i];
        }
    }

    public Dialog() {
        this.weight = gkx0.d;
        this.imItemWeight = x7w.f;
        ImItemType imItemType = ImItemType.DIALOG;
        this.imItemType = imItemType;
        this.imItemId = new b5w(this.id, imItemType);
        this.writePermission = new WritePermission(WritePermission.State.ENABLED);
        this.draftMsg = DraftMsg.h;
        this.themeId = c.C1124c.c;
        uy2 uy2Var = DialogTheme.f;
        this.theme = DialogTheme.a.a();
        this.msgRequestStatus = MsgRequestStatus.ACCEPTED;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.msgRequestInviter = Peer.Unknown.e;
        EmptyList emptyList = EmptyList.b;
        this.unreadMentionMsgCnvIds = emptyList;
        this.tags = emptyList;
        this.expireMsgCnvIds = emptyList;
        this.flags = 0L;
        this.unreadReactions = emptyList;
    }

    public final BusinessNotifyInfo Ab() {
        return this.businessNotifyInfo;
    }

    public final boolean Ac(long j) {
        long j2 = this.notificationsDisabledUntil;
        if (j2 == 0) {
            return true;
        }
        return j2 >= 0 && j2 < j;
    }

    public final void Ad(ArrayList arrayList) {
        this.unreadReactions = arrayList;
    }

    public final boolean Bb() {
        return this.businessNotifyInfoVisible;
    }

    public final boolean Bc() {
        gkx0 gkx0Var = this.weight;
        Pair<Integer, Integer> pair = lmm.a;
        return new vjm((int) xo9.j(gkx0Var.b, lmm.a), (int) xo9.j(gkx0Var.b, lmm.c)).i();
    }

    public final void Bd(gkx0 gkx0Var) {
        this.weight = gkx0Var;
    }

    public final boolean Cb() {
        return this.canMarkAsSpam;
    }

    public final boolean Cc() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.L;
    }

    public final void Cd(boolean z) {
        this.isWithSelf = z;
    }

    public final boolean Db() {
        return this.canPromoGifts;
    }

    public final boolean Dc() {
        return this.isPromo;
    }

    public final void Dd(WritePermission writePermission) {
        this.writePermission = writePermission;
    }

    public final boolean E8() {
        return bc() == Peer.Type.CONTACT;
    }

    public final boolean Eb() {
        return this.canReceiveMoney;
    }

    public final boolean Ec() {
        return (this.markedAsUnread || Qb()) ? false : true;
    }

    public final Peer.Type Ed() {
        Peer.Type type = Zb().c;
        if (e43.l(Peer.Type.USER, Peer.Type.CONTACT, Peer.Type.EMAIL, Peer.Type.GROUP).contains(type)) {
            return type;
        }
        return null;
    }

    public final boolean Fb() {
        return this.canSendMoney;
    }

    public final boolean Fc(Msg msg) {
        return msg.i ? msg.d <= this.readTillInMsgCnvId : msg.d <= this.readTillOutMsgCnvId;
    }

    public final boolean Gb() {
        return this.writePermission.a == WritePermission.State.ENABLED;
    }

    public final boolean Gc() {
        return this.isService;
    }

    public final ChatSettings Hb() {
        return this.chatSettings;
    }

    public final boolean Hc() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.K;
    }

    public final ConversationCard Ib() {
        return this.conversationCard;
    }

    public final boolean Ic() {
        return !Ec();
    }

    public final int Jb() {
        return this.countUnread;
    }

    public final boolean Jc() {
        return this.isWithSelf;
    }

    public final DraftMsg Kb() {
        return this.draftMsg;
    }

    public final boolean Kc() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.H;
    }

    public final List<Integer> Lb() {
        return this.expireMsgCnvIds;
    }

    public final void Lc(boolean z) {
        this.isArchived = z;
    }

    @Override // xsna.a5w
    public final ImItemType M8() {
        return this.imItemType;
    }

    public final long Mb() {
        return this.flags;
    }

    public final void Mc(InfoBar infoBar) {
        this.bar = infoBar;
    }

    public final boolean Nb() {
        return this.groupCallBarHiddenLocally;
    }

    public final void Nc(BusinessNotifyInfo businessNotifyInfo) {
        this.businessNotifyInfo = businessNotifyInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.id);
        serializer.S(this.type);
        serializer.S(this.countUnread);
        serializer.Y(this.notificationsDisabledUntil);
        serializer.L(this.notificationsIsUseSound ? (byte) 1 : (byte) 0);
        serializer.S(this.readTillInMsgCnvId);
        serializer.S(this.readTillOutMsgCnvId);
        serializer.S(this.lastMsgCnvId);
        serializer.L(this.markedAsUnread ? (byte) 1 : (byte) 0);
        serializer.L(this.isService ? (byte) 1 : (byte) 0);
        serializer.L(this.canSendMoney ? (byte) 1 : (byte) 0);
        serializer.L(this.canReceiveMoney ? (byte) 1 : (byte) 0);
        serializer.L(this.isWithSelf ? (byte) 1 : (byte) 0);
        serializer.i0(this.pinnedMsg);
        serializer.L(this.pinnedMsgVisible ? (byte) 1 : (byte) 0);
        serializer.i0(this.draftMsg);
        serializer.i0(this.bar);
        serializer.i0(this.conversationCard);
        serializer.i0(this.chatSettings);
        serializer.i0(this.groupCallInProgress);
        serializer.L(this.groupCallBarHiddenLocally ? (byte) 1 : (byte) 0);
        serializer.i0(this.theme);
        serializer.j0(this.themeId.a);
        serializer.i0(this.keyboard);
        serializer.L(this.keyboardVisible ? (byte) 1 : (byte) 0);
        serializer.S(this.msgRequestStatus.j());
        serializer.Y(this.msgRequestDate);
        serializer.i0(this.msgRequestInviter);
        serializer.U(this.unreadMentionMsgCnvIds);
        serializer.U(this.tags);
        serializer.U(this.expireMsgCnvIds);
        serializer.i0(this.businessNotifyInfo);
        serializer.L(this.businessNotifyInfoVisible ? (byte) 1 : (byte) 0);
        serializer.L(this.isMarkReadAvailable ? (byte) 1 : (byte) 0);
        serializer.L(this.isMarkUnreadAvailable ? (byte) 1 : (byte) 0);
        serializer.L(this.isArchived ? (byte) 1 : (byte) 0);
        serializer.L(this.isPromo ? (byte) 1 : (byte) 0);
        JSONObject Yb = Yb();
        serializer.j0(Yb != null ? Yb.toString() : null);
        serializer.h0(this.unreadReactions);
        serializer.L(this.isDead ? (byte) 1 : (byte) 0);
        serializer.L(this.canPromoGifts ? (byte) 1 : (byte) 0);
        serializer.i0(this.transitionData);
    }

    public final GroupCallInProgress Ob() {
        return this.groupCallInProgress;
    }

    public final void Oc(boolean z) {
        this.businessNotifyInfoVisible = z;
    }

    public final boolean Pb() {
        return this.lastMsgCnvId > 0;
    }

    public final void Pc(boolean z) {
        this.canMarkAsSpam = z;
    }

    public final boolean Qb() {
        return this.countUnread > 0;
    }

    public final void Qc(boolean z) {
        this.canPromoGifts = z;
    }

    public final boolean Rb() {
        return this.readTillOutMsgCnvId < this.lastMsgCnvId;
    }

    public final void Rc(boolean z) {
        this.canReceiveMoney = z;
    }

    public final Long Sb() {
        return Long.valueOf(this.id);
    }

    public final void Sc(boolean z) {
        this.canSendMoney = z;
    }

    public final boolean T8() {
        int i = b.$EnumSwitchMapping$0[this.writePermission.a.ordinal()];
        if (i != 1 && i != 2) {
            return false;
        }
        ChatSettings chatSettings = this.chatSettings;
        if (chatSettings == null || chatSettings.F) {
            return chatSettings == null || chatSettings.Q;
        }
        return false;
    }

    public final boolean Tb() {
        return this.keyboardVisible;
    }

    public final void Tc(ChatSettings chatSettings) {
        this.chatSettings = chatSettings;
    }

    public final int Ub() {
        return this.lastMsgCnvId;
    }

    public final void Uc(ConversationCard conversationCard) {
        this.conversationCard = conversationCard;
    }

    public final BotKeyboard V2() {
        return this.keyboard;
    }

    public final boolean Va() {
        return bc() == Peer.Type.GROUP;
    }

    public final boolean Vb() {
        return this.markedAsUnread;
    }

    public final void Vc(int i) {
        this.countUnread = i;
    }

    public final Peer Wb() {
        return this.msgRequestInviter;
    }

    public final void Wc(boolean z) {
        this.isDead = z;
    }

    public final MsgRequestStatus Xb() {
        return this.msgRequestStatus;
    }

    public final void Xc(DraftMsg draftMsg) {
        this.draftMsg = draftMsg;
    }

    public final JSONObject Yb() {
        JSONObject jSONObject = this.payload;
        if (jSONObject == null) {
            return null;
        }
        int length = jSONObject.length();
        String[] strArr = new String[length];
        Iterator<String> keys = jSONObject.keys();
        for (int i = 0; i < length; i++) {
            strArr[i] = keys.next();
        }
        return new JSONObject(jSONObject, strArr);
    }

    public final void Yc(ArrayList arrayList) {
        this.expireMsgCnvIds = arrayList;
    }

    public final Peer Zb() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.b(this.id);
    }

    public final void Zc(long j) {
        this.flags = j;
    }

    public final long ac() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.d(this.id);
    }

    public final void ad(boolean z) {
        this.groupCallBarHiddenLocally = z;
    }

    public final Peer.Type bc() {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return Peer.a.f(this.id);
    }

    public final void bd(GroupCallInProgress groupCallInProgress) {
        this.groupCallInProgress = groupCallInProgress;
    }

    public final int cc() {
        gkx0 gkx0Var = this.weight;
        Pair<Integer, Integer> pair = lmm.a;
        return new vjm((int) xo9.j(gkx0Var.b, lmm.a), (int) xo9.j(gkx0Var.b, lmm.c)).h();
    }

    public final void cd(x7w x7wVar) {
        this.imItemWeight = x7wVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Dialog dialog) {
        return this.weight.compareTo(dialog.weight);
    }

    public final PinnedMsg dc() {
        return this.pinnedMsg;
    }

    public final void dd(BotKeyboard botKeyboard) {
        this.keyboard = botKeyboard;
    }

    public final boolean ec() {
        return this.pinnedMsgVisible;
    }

    public final void ed(boolean z) {
        this.keyboardVisible = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dialog)) {
            return false;
        }
        Dialog dialog = (Dialog) obj;
        if (this.id == dialog.id && this.type == dialog.type && epx.f(this.weight, dialog.weight) && bc() == dialog.bc() && ac() == dialog.ac() && this.countUnread == dialog.countUnread && this.notificationsDisabledUntil == dialog.notificationsDisabledUntil && this.notificationsIsUseSound == dialog.notificationsIsUseSound && this.readTillInMsgCnvId == dialog.readTillInMsgCnvId && this.readTillOutMsgCnvId == dialog.readTillOutMsgCnvId && this.lastMsgCnvId == dialog.lastMsgCnvId && this.markedAsUnread == dialog.markedAsUnread && this.isService == dialog.isService && epx.f(this.writePermission, dialog.writePermission) && this.canSendMoney == dialog.canSendMoney && this.canReceiveMoney == dialog.canReceiveMoney && epx.f(this.pinnedMsg, dialog.pinnedMsg) && this.pinnedMsgVisible == dialog.pinnedMsgVisible) {
            return (!((Boolean) b.getValue()).booleanValue() || epx.f(this.draftMsg, dialog.draftMsg)) && epx.f(this.bar, dialog.bar) && epx.f(this.conversationCard, dialog.conversationCard) && epx.f(this.chatSettings, dialog.chatSettings) && epx.f(this.groupCallInProgress, dialog.groupCallInProgress) && this.groupCallBarHiddenLocally == dialog.groupCallBarHiddenLocally && epx.f(this.theme, dialog.theme) && epx.f(this.themeId, dialog.themeId) && epx.f(this.keyboard, dialog.keyboard) && this.keyboardVisible == dialog.keyboardVisible && this.msgRequestStatus == dialog.msgRequestStatus && this.msgRequestDate == dialog.msgRequestDate && epx.f(this.msgRequestInviter, dialog.msgRequestInviter) && epx.f(this.unreadMentionMsgCnvIds, dialog.unreadMentionMsgCnvIds) && epx.f(this.tags, dialog.tags) && epx.f(this.expireMsgCnvIds, dialog.expireMsgCnvIds) && epx.f(this.businessNotifyInfo, dialog.businessNotifyInfo) && this.businessNotifyInfoVisible == dialog.businessNotifyInfoVisible && this.isMarkReadAvailable == dialog.isMarkReadAvailable && this.isMarkUnreadAvailable == dialog.isMarkUnreadAvailable && this.isArchived == dialog.isArchived && this.isDead == dialog.isDead && this.isPromo == dialog.isPromo && String.valueOf(Yb()).equals(String.valueOf(dialog.Yb())) && epx.f(this.unreadReactions, dialog.unreadReactions) && epx.f(this.transitionData, dialog.transitionData);
        }
        return false;
    }

    public final int fc() {
        return this.readTillInMsgCnvId;
    }

    public final void fd(int i) {
        this.lastMsgCnvId = i;
    }

    public final int gc() {
        return this.readTillOutMsgCnvId;
    }

    public final void gd(boolean z) {
        this.isMarkReadAvailable = z;
    }

    @Override // xsna.btx0
    public final Number getId() {
        return Long.valueOf(this.id);
    }

    public final int hashCode() {
        int b2 = qoy.b(qoy.b(qoy.b((this.writePermission.hashCode() + qoy.b(qoy.b((((((qoy.b(bh10.a((((Long.hashCode(ac()) + ((bc().hashCode() + bh10.a(shy.a(this.type, Long.hashCode(this.id) * 31, 31), 31, this.weight.b)) * 31)) * 31) + this.countUnread) * 31, 31, this.notificationsDisabledUntil), 31, this.notificationsIsUseSound) + this.readTillInMsgCnvId) * 31) + this.readTillOutMsgCnvId) * 31) + this.lastMsgCnvId) * 31, 31, this.markedAsUnread), 31, this.isService)) * 31, 31, this.canSendMoney), 31, this.canReceiveMoney), 31, this.isWithSelf);
        PinnedMsg pinnedMsg = this.pinnedMsg;
        int hashCode = Boolean.hashCode(this.pinnedMsgVisible) + ((b2 + (pinnedMsg != null ? pinnedMsg.hashCode() : 0)) * 31);
        if (((Boolean) b.getValue()).booleanValue()) {
            hashCode = (hashCode * 31) + this.draftMsg.hashCode();
        }
        int i = hashCode * 31;
        InfoBar infoBar = this.bar;
        int hashCode2 = (i + (infoBar != null ? infoBar.hashCode() : 0)) * 31;
        ConversationCard conversationCard = this.conversationCard;
        int hashCode3 = (hashCode2 + (conversationCard != null ? conversationCard.hashCode() : 0)) * 31;
        ChatSettings chatSettings = this.chatSettings;
        int hashCode4 = (hashCode3 + (chatSettings != null ? chatSettings.hashCode() : 0)) * 31;
        GroupCallInProgress groupCallInProgress = this.groupCallInProgress;
        int a2 = urd0.a((this.theme.hashCode() + qoy.b((hashCode4 + (groupCallInProgress != null ? groupCallInProgress.hashCode() : 0)) * 31, 31, this.groupCallBarHiddenLocally)) * 31, 31, this.themeId.a);
        BotKeyboard botKeyboard = this.keyboard;
        int a3 = fw3.a(fw3.a(fw3.a(bh10.a(bh10.a((this.msgRequestStatus.hashCode() + qoy.b((a2 + (botKeyboard != null ? botKeyboard.hashCode() : 0)) * 31, 31, this.keyboardVisible)) * 31, 31, this.msgRequestDate), 31, this.msgRequestInviter.b), 31, this.unreadMentionMsgCnvIds), 31, this.tags), 31, this.expireMsgCnvIds);
        BusinessNotifyInfo businessNotifyInfo = this.businessNotifyInfo;
        int a4 = fw3.a((String.valueOf(Yb()).hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((a3 + (businessNotifyInfo != null ? businessNotifyInfo.hashCode() : 0)) * 31, 31, this.businessNotifyInfoVisible), 31, this.isMarkReadAvailable), 31, this.isMarkUnreadAvailable), 31, this.isArchived), 31, this.isDead), 31, this.isPromo)) * 31, 31, this.unreadReactions);
        TransitionData transitionData = this.transitionData;
        return a4 + (transitionData != null ? transitionData.hashCode() : 0);
    }

    public final DialogTheme hc() {
        return this.theme;
    }

    public final void hd(boolean z) {
        this.isMarkUnreadAvailable = z;
    }

    public final com.vk.im.engine.models.dialogs.c ic() {
        return this.themeId;
    }

    public final void id(boolean z) {
        this.markedAsUnread = z;
    }

    public final TransitionData jc() {
        return this.transitionData;
    }

    public final void jd(long j) {
        this.msgRequestDate = j;
    }

    public final int kc() {
        return this.type;
    }

    public final void kd(Peer peer) {
        this.msgRequestInviter = peer;
    }

    public final List<Integer> lc() {
        return this.unreadMentionMsgCnvIds;
    }

    public final void ld(MsgRequestStatus msgRequestStatus) {
        this.msgRequestStatus = msgRequestStatus;
    }

    public final List<Integer> mc() {
        return this.unreadReactions;
    }

    public final void md(boolean z) {
        this.isNew = z;
    }

    public final gkx0 nc() {
        return this.weight;
    }

    public final void nd(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject != null) {
            int length = jSONObject.length();
            String[] strArr = new String[length];
            Iterator<String> keys = jSONObject.keys();
            for (int i = 0; i < length; i++) {
                strArr[i] = keys.next();
            }
            jSONObject2 = new JSONObject(jSONObject, strArr);
        } else {
            jSONObject2 = null;
        }
        this.payload = jSONObject2;
    }

    public final boolean o1() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.l;
    }

    public final WritePermission oc() {
        return this.writePermission;
    }

    public final void od(PinnedMsg pinnedMsg) {
        this.pinnedMsg = pinnedMsg;
    }

    public final boolean pc() {
        return this.isArchived;
    }

    public final void pd(boolean z) {
        this.pinnedMsgVisible = z;
    }

    public final boolean qc() {
        return !sc();
    }

    public final void qd(boolean z) {
        this.isPromo = z;
    }

    public final boolean rc() {
        return this.type == 1;
    }

    public final void rd(int i) {
        this.readTillInMsgCnvId = i;
    }

    public final boolean sc() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.g;
    }

    public final void sd(int i) {
        this.readTillOutMsgCnvId = i;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final boolean t1() {
        return bc() == Peer.Type.USER;
    }

    @Override // xsna.a5w
    public final b5w t3() {
        long j = this.imItemId.a;
        long j2 = this.id;
        if (j != j2) {
            this.imItemId = new b5w(j2, this.imItemType);
        }
        return this.imItemId;
    }

    public final boolean tc() {
        ChatSettings chatSettings = this.chatSettings;
        return chatSettings != null && chatSettings.h;
    }

    public final void td(List<Integer> list) {
        this.tags = list;
    }

    public final String toString() {
        return "Dialog(id=" + this.id + ", type=" + this.type + ", weight=" + this.weight + ",peerType=" + bc() + ", peerId=" + ac() + ", countUnread=" + this.countUnread + ", notificationsDisabledUntil=" + this.notificationsDisabledUntil + ", notificationsIsUseSound=" + this.notificationsIsUseSound + ", readTillInMsgCnvId=" + this.readTillInMsgCnvId + ", readTillOutMsgCnvId=" + this.readTillOutMsgCnvId + ", lastMsgCnvId=" + this.lastMsgCnvId + ", markedAsUnread=" + this.markedAsUnread + ", writePermission=" + this.writePermission + ", canSendMoney=" + this.canSendMoney + ", canReceiveMoney=" + this.canReceiveMoney + ", isWithSelf=" + this.isWithSelf + ", pinnedMsg=" + this.pinnedMsg + ", pinnedMsgVisible=" + this.pinnedMsgVisible + ", banner=" + this.bar + ", conversationBar=" + this.conversationCard + ", chatSettings=" + this.chatSettings + ", groupCallInProgress=" + this.groupCallInProgress + ", groupCallBarHiddenLocally=" + this.groupCallBarHiddenLocally + ", msgRequestStatus=" + this.msgRequestStatus + ", unreadMentionMsgCnvIds=" + this.unreadMentionMsgCnvIds + ", tags=" + this.tags + ", expireMsgCnvIds=" + this.expireMsgCnvIds + ", businessNotifyInfo=" + this.businessNotifyInfo + ", businessNotifyInfoVisible=" + this.businessNotifyInfoVisible + ", isMarkReadAvailable=" + this.isMarkReadAvailable + ", isMarkUnreadAvailable=" + this.isMarkUnreadAvailable + ", isArchived=" + this.isArchived + ", isDead=" + this.isDead + ", isPromo=" + this.isPromo + ", payload=" + Yb() + "unreadReactions=" + this.unreadReactions.size() + ')';
    }

    public final boolean uc() {
        return bc() == Peer.Type.CHAT;
    }

    public final void ud(DialogTheme dialogTheme) {
        this.theme = dialogTheme;
    }

    public final boolean vc() {
        return bc() == Peer.Type.CHAT && !tc();
    }

    public final void vd(com.vk.im.engine.models.dialogs.c cVar) {
        this.themeId = cVar;
    }

    public final boolean wc() {
        return this.isDead;
    }

    public final void wd(int i) {
        this.timestamp = i;
    }

    public final boolean xc() {
        return this.isMarkReadAvailable;
    }

    public final void xd(TransitionData transitionData) {
        this.transitionData = transitionData;
    }

    @Override // xsna.a5w
    public final x7w y9() {
        return this.imItemWeight;
    }

    public final boolean yc() {
        return this.isMarkUnreadAvailable;
    }

    public final void yd(int i) {
        this.type = i;
    }

    public final InfoBar zb() {
        return this.bar;
    }

    public final boolean zc() {
        return this.isNew;
    }

    public final void zd(List<Integer> list) {
        this.unreadMentionMsgCnvIds = list;
    }

    public Dialog(Dialog dialog) {
        this.weight = gkx0.d;
        this.imItemWeight = x7w.f;
        ImItemType imItemType = ImItemType.DIALOG;
        this.imItemType = imItemType;
        this.imItemId = new b5w(this.id, imItemType);
        this.writePermission = new WritePermission(WritePermission.State.ENABLED);
        this.draftMsg = DraftMsg.h;
        this.themeId = c.C1124c.c;
        uy2 uy2Var = DialogTheme.f;
        this.theme = DialogTheme.a.a();
        this.msgRequestStatus = MsgRequestStatus.ACCEPTED;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.msgRequestInviter = Peer.Unknown.e;
        EmptyList emptyList = EmptyList.b;
        this.unreadMentionMsgCnvIds = emptyList;
        this.tags = emptyList;
        this.expireMsgCnvIds = emptyList;
        this.flags = 0L;
        this.unreadReactions = emptyList;
        this.id = dialog.id;
        this.type = dialog.type;
        this.weight = dialog.weight;
        this.countUnread = dialog.countUnread;
        this.notificationsDisabledUntil = dialog.notificationsDisabledUntil;
        this.notificationsIsUseSound = dialog.notificationsIsUseSound;
        this.readTillInMsgCnvId = dialog.readTillInMsgCnvId;
        this.readTillOutMsgCnvId = dialog.readTillOutMsgCnvId;
        this.lastMsgCnvId = dialog.lastMsgCnvId;
        this.markedAsUnread = dialog.markedAsUnread;
        this.isService = dialog.isService;
        this.writePermission = dialog.writePermission;
        this.canSendMoney = dialog.canSendMoney;
        this.canReceiveMoney = dialog.canReceiveMoney;
        this.isWithSelf = dialog.isWithSelf;
        this.pinnedMsg = dialog.pinnedMsg;
        this.pinnedMsgVisible = dialog.pinnedMsgVisible;
        this.draftMsg = dialog.draftMsg;
        this.bar = dialog.bar;
        this.conversationCard = dialog.conversationCard;
        this.chatSettings = dialog.chatSettings;
        this.groupCallInProgress = dialog.groupCallInProgress;
        this.groupCallBarHiddenLocally = dialog.groupCallBarHiddenLocally;
        this.theme = dialog.theme;
        this.themeId = dialog.themeId;
        this.keyboard = dialog.keyboard;
        this.keyboardVisible = dialog.keyboardVisible;
        this.msgRequestStatus = dialog.msgRequestStatus;
        this.msgRequestDate = dialog.msgRequestDate;
        this.msgRequestInviter = dialog.msgRequestInviter;
        this.unreadMentionMsgCnvIds = dialog.unreadMentionMsgCnvIds;
        this.tags = dialog.tags;
        this.expireMsgCnvIds = dialog.expireMsgCnvIds;
        this.businessNotifyInfo = dialog.businessNotifyInfo;
        this.businessNotifyInfoVisible = dialog.businessNotifyInfoVisible;
        this.isMarkReadAvailable = dialog.isMarkReadAvailable;
        this.isMarkUnreadAvailable = dialog.isMarkUnreadAvailable;
        this.isArchived = dialog.isArchived;
        this.isDead = dialog.isDead;
        this.isPromo = dialog.isPromo;
        nd(dialog.Yb());
        this.unreadReactions = dialog.unreadReactions;
        this.canPromoGifts = dialog.canPromoGifts;
        this.transitionData = dialog.transitionData;
    }

    public Dialog(long j, int i, int i2, long j2, boolean z, int i3, int i4, int i5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ConversationCard conversationCard, PinnedMsg pinnedMsg, boolean z7, DraftMsg draftMsg, InfoBar infoBar, ChatSettings chatSettings, GroupCallInProgress groupCallInProgress, boolean z8, DialogTheme dialogTheme, com.vk.im.engine.models.dialogs.c cVar, BotKeyboard botKeyboard, boolean z9, MsgRequestStatus msgRequestStatus, long j3, Peer peer, List<Integer> list, List<Integer> list2, List<Integer> list3, BusinessNotifyInfo businessNotifyInfo, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, List<Integer> list4, boolean z16, TransitionData transitionData) {
        this.weight = gkx0.d;
        this.imItemWeight = x7w.f;
        ImItemType imItemType = ImItemType.DIALOG;
        this.imItemType = imItemType;
        this.imItemId = new b5w(this.id, imItemType);
        this.writePermission = new WritePermission(WritePermission.State.ENABLED);
        this.draftMsg = DraftMsg.h;
        this.themeId = c.C1124c.c;
        uy2 uy2Var = DialogTheme.f;
        this.theme = DialogTheme.a.a();
        this.msgRequestStatus = MsgRequestStatus.ACCEPTED;
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        this.msgRequestInviter = Peer.Unknown.e;
        EmptyList emptyList = EmptyList.b;
        this.flags = 0L;
        this.unreadReactions = emptyList;
        this.id = j;
        this.type = i;
        this.countUnread = i2;
        this.notificationsDisabledUntil = j2;
        this.notificationsIsUseSound = z;
        this.readTillInMsgCnvId = i3;
        this.readTillOutMsgCnvId = i4;
        this.lastMsgCnvId = i5;
        this.markedAsUnread = z2;
        this.isService = z3;
        this.canSendMoney = z4;
        this.canReceiveMoney = z5;
        this.isWithSelf = z6;
        this.pinnedMsg = pinnedMsg;
        this.pinnedMsgVisible = z7;
        this.draftMsg = draftMsg;
        this.bar = infoBar;
        this.conversationCard = conversationCard;
        this.chatSettings = chatSettings;
        this.groupCallInProgress = groupCallInProgress;
        this.groupCallBarHiddenLocally = z8;
        this.theme = dialogTheme;
        this.themeId = cVar;
        this.keyboard = botKeyboard;
        this.keyboardVisible = z9;
        this.msgRequestStatus = msgRequestStatus;
        this.msgRequestDate = j3;
        this.msgRequestInviter = peer;
        this.unreadMentionMsgCnvIds = list;
        this.tags = list2;
        this.expireMsgCnvIds = list3;
        this.businessNotifyInfo = businessNotifyInfo;
        this.businessNotifyInfoVisible = z10;
        this.isMarkReadAvailable = z11;
        this.isMarkUnreadAvailable = z12;
        this.isArchived = z13;
        this.isDead = z14;
        this.isPromo = z15;
        nd(new JSONObject(str == null ? "" : str));
        this.unreadReactions = list4;
        this.canPromoGifts = z16;
        this.transitionData = transitionData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Dialog(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r1, r18, r1, r2, r21, r22, r23, r24, r25, r26, r27, MsgRequestStatus.a.a(r28), serializer.w(), (Peer) serializer.G(Peer.class.getClassLoader()), serializer.d(), serializer.d(), serializer.d(), (BusinessNotifyInfo) serializer.G(BusinessNotifyInfo.class.getClassLoader()), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.m(), serializer.H(), serializer.D(), serializer.m(), (TransitionData) serializer.G(TransitionData.class.getClassLoader()));
        long w = serializer.w();
        int u = serializer.u();
        int u2 = serializer.u();
        long w2 = serializer.w();
        boolean m = serializer.m();
        int u3 = serializer.u();
        int u4 = serializer.u();
        int u5 = serializer.u();
        boolean m2 = serializer.m();
        boolean m3 = serializer.m();
        boolean m4 = serializer.m();
        boolean m5 = serializer.m();
        boolean m6 = serializer.m();
        PinnedMsg pinnedMsg = (PinnedMsg) serializer.G(PinnedMsg.class.getClassLoader());
        boolean m7 = serializer.m();
        DraftMsg draftMsg = (DraftMsg) serializer.G(DraftMsg.class.getClassLoader());
        InfoBar infoBar = (InfoBar) serializer.G(InfoBar.class.getClassLoader());
        ConversationCard conversationCard = (ConversationCard) serializer.G(ConversationCard.class.getClassLoader());
        ChatSettings chatSettings = (ChatSettings) serializer.G(ChatSettings.class.getClassLoader());
        GroupCallInProgress groupCallInProgress = (GroupCallInProgress) serializer.G(GroupCallInProgress.class.getClassLoader());
        boolean m8 = serializer.m();
        DialogTheme dialogTheme = (DialogTheme) serializer.G(DialogTheme.class.getClassLoader());
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        com.vk.im.engine.models.dialogs.c a2 = c.a.a(serializer.H());
        BotKeyboard botKeyboard = (BotKeyboard) serializer.G(BotKeyboard.class.getClassLoader());
        boolean m9 = serializer.m();
        MsgRequestStatus.a aVar = MsgRequestStatus.Companion;
        int u6 = serializer.u();
        aVar.getClass();
    }
}
