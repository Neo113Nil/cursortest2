package com.vk.channels.impl.channel_screen.send_msg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channels.api.Channel;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgIdType;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.gallerypicker.di.PhotoEditorComponent;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.conversations.BotButton;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendHidePopupsReason;
import com.vk.im.ui.views.RichEditText;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.stickers.ContextUser;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.keyboard.StickersView;
import com.vk.toggle.features.ImFeatures;
import com.vk.writebar.WriteBar;
import com.vk.writebar.WriteBarPermissionsHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.FwdMessagesAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.a1w;
import xsna.a60;
import xsna.am0;
import xsna.asp;
import xsna.asu0;
import xsna.bpn0;
import xsna.c5g;
import xsna.c9s;
import xsna.ca3;
import xsna.cew;
import xsna.ci3;
import xsna.cvk;
import xsna.dg;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e4w;
import xsna.e7;
import xsna.enj;
import xsna.epx;
import xsna.fsx0;
import xsna.g2v;
import xsna.g5g;
import xsna.gt;
import xsna.gv3;
import xsna.h20;
import xsna.h9l0;
import xsna.hfr;
import xsna.i5g;
import xsna.ify;
import xsna.ixa;
import xsna.j5g;
import xsna.jbs;
import xsna.ka0;
import xsna.kkm;
import xsna.lt0;
import xsna.mhy;
import xsna.mxv;
import xsna.n34;
import xsna.o25;
import xsna.o2b;
import xsna.oz30;
import xsna.p040;
import xsna.pf1;
import xsna.pla;
import xsna.q7v0;
import xsna.qb3;
import xsna.r040;
import xsna.rf;
import xsna.rli0;
import xsna.rnv;
import xsna.s3q0;
import xsna.s420;
import xsna.tf;
import xsna.ulp0;
import xsna.wdw;
import xsna.wg8;
import xsna.xey;
import xsna.xgy;
import xsna.xx0;
import xsna.y50;
import xsna.ybb;
import xsna.yh30;
import xsna.zbb;
import xsna.zcl;
import xsna.zdw;
import xsna.zrp;
import xsna.zzs;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class a implements rnv, ify.a, xey.a {
    public View A;
    public RichEditText B;
    public StickersView C;
    public View D;
    public zbb.b E;
    public xgy F;
    public final C0530a G;
    public final e4w H;
    public final Handler I;
    public final int J;
    public boolean K;
    public boolean L;
    public List<? extends Attachment> M;
    public final bpn0 N;
    public Long O;
    public final zdw b;
    public final kkm c;
    public final q7v0 d;
    public final PhotoEditorComponent e;
    public final ixa f;
    public long g;
    public boolean h;
    public final boolean i;
    public final boolean j;
    public final a1w k;
    public final mxv l;
    public final r040 m;
    public final p040 n;
    public final Activity o;
    public ChannelMsgSendConfig p;
    public MsgFromChannel q;
    public ChannelMsgSendConfig r;
    public DialogExt s;
    public HashSet t;
    public b u;
    public final io.reactivex.rxjava3.disposables.b v;
    public ContextUser w;
    public WriteBar x;
    public View y;
    public View z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelMsgSendVc.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b EDITING;
        public static final b NORMAL;

        static {
            b bVar = new b("NORMAL", 0);
            NORMAL = bVar;
            b bVar2 = new b("EDITING", 1);
            EDITING = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: ChannelMsgSendVc.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ChannelMsgSendVc.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements zzs<String, String, List<? extends Attach>, BotButton, s3q0> {
        @Override // xsna.zzs
        public final s3q0 invoke(String str, String str2, List<? extends Attach> list, BotButton botButton) {
            ((a) this.receiver).getClass();
            return s3q0.a;
        }
    }

    public a(zdw zdwVar, jbs jbsVar, kkm kkmVar, q7v0 q7v0Var, PhotoEditorComponent photoEditorComponent, ixa ixaVar, long j, boolean z, boolean z2, boolean z3) {
        p040 p040Var;
        r040 r040Var;
        this.b = zdwVar;
        this.c = kkmVar;
        this.d = q7v0Var;
        this.e = photoEditorComponent;
        this.f = ixaVar;
        this.g = j;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = zdwVar.b;
        this.l = zdwVar.d();
        zdw.c cVar = zdwVar.l;
        this.m = (cVar == null || (r040Var = cVar.a) == null) ? r040.a.a.getSTUB() : r040Var;
        this.n = (cVar == null || (p040Var = cVar.b) == null) ? p040.a.a.getSTUB() : p040Var;
        FragmentActivity kn = jbsVar.a.kn();
        bpn0 bpn0Var = enj.a;
        this.o = e3m.h(kn);
        ChannelMsgSendConfig channelMsgSendConfig = ChannelMsgSendConfig.c;
        cew.b.getClass();
        this.p = ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, false, false, false, null, null, null, null, false, cew.i(), false, false, null, 30719);
        this.r = new ChannelMsgSendConfig(null, false, false, false, false, null, null, null, false, null, false, false, false, false, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
        this.s = new DialogExt(this.g, (ProfilesInfo) null, 2, (zcl) null);
        this.t = new LinkedHashSet();
        this.u = b.NORMAL;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.v = bVar;
        this.G = new C0530a();
        this.H = new e4w(zdwVar);
        this.I = new Handler(Looper.getMainLooper());
        this.J = 10;
        this.M = EmptyList.b;
        this.N = new bpn0(new h20(this, 8));
        bVar.b(ixaVar.a().a0(asu0.a.d()).subscribe(new y50(new dg(this, 14), 10)));
    }

    public static boolean G(xgy xgyVar) {
        if (xgyVar == null || !xgyVar.e()) {
            return false;
        }
        xgyVar.d();
        s3q0 s3q0Var = s3q0.a;
        return true;
    }

    public static ArrayList O(FwdMessagesAttachment fwdMessagesAttachment) {
        List<Integer> list = fwdMessagesAttachment.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CnvMsgId(fwdMessagesAttachment.f, ((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // xsna.rnv
    public final void A() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.G();
    }

    @Override // xsna.rnv
    public final void B(Msg msg) {
        MsgFromChannel msgFromChannel = (MsgFromChannel) msg;
        MsgFromChannel msgFromChannel2 = this.q;
        if (msgFromChannel2 == null || msgFromChannel2.b != msgFromChannel.b) {
            int i = 0;
            this.v.b(this.k.F(this, new o2b(this.g, Collections.singletonList(Integer.valueOf(msgFromChannel.b)), MsgIdType.LOCAL_ID, Source.CACHE, false, this.i, "ChannelMessagesGetByIdExtCmd")).subscribe(new tf(new e(1, this, a.class, "onStartMsgEditLoadSuccess", "onStartMsgEditLoadSuccess(Lcom/vk/im/engine/models/messages/MsgsExt;)V", i, 0), 10), new pf1(new wg8(1, this, a.class, "onStartMsgEditLoadError", "onStartMsgEditLoadError(Ljava/lang/Throwable;)V", i, 2), 2)));
        }
    }

    @Override // xsna.rnv
    public final void C(long j) {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setTimeProgress(((int) j) / 1000);
    }

    public final ChannelMsgSendConfig E() {
        return ChannelMsgSendConfig.a(this.p, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 32761);
    }

    public final xgy F() {
        xgy xgyVar = this.F;
        if (xgyVar != null) {
            return xgyVar;
        }
        View view = this.y;
        View view2 = view == null ? null : view;
        StickersView stickersView = this.C;
        xgy xgyVar2 = new xgy(this.o, view2, stickersView == null ? null : stickersView, null, new e7(this, 11), 88);
        WriteBar writeBar = this.x;
        xgyVar2.a((writeBar != null ? writeBar : null).getEmojiAnchor(), 0);
        xgyVar2.o = this.G;
        this.F = xgyVar2;
        return xgyVar2;
    }

    public final void H() {
        xgy xgyVar = this.F;
        if (xgyVar == null || !xgyVar.e()) {
            return;
        }
        StickersView stickersView = this.C;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(4);
        zbb.b bVar = this.E;
        (bVar != null ? bVar : null).getClass();
    }

    public final boolean I() {
        return this.q != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(ChannelMsgSendConfig channelMsgSendConfig) {
        c9s c9sVar;
        Object obj;
        boolean z;
        String obj2;
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        ArrayList<Attachment> attachments = writeBar.getAttachments();
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        Editable editableText = richEditText.getEditableText();
        String str = "";
        if (editableText == null || editableText.length() == 0) {
            c9sVar = new c9s("", MsgTextFormat.d);
        } else {
            bpn0 bpn0Var = yh30.a;
            CharSequence a = yh30.a(drm0.p0(editableText));
            Editable editable = a instanceof Editable ? (Editable) a : null;
            MsgTextFormat b2 = this.n.b(editable);
            if (editable != null && (obj2 = editable.toString()) != null) {
                str = obj2;
            }
            c9sVar = new c9s(str, b2);
        }
        String obj3 = c9sVar.a.toString();
        List B = rli0.B(rli0.m(new ulp0(rli0.j(new i5g(attachments), new gt(5)), new a60(12))));
        int i = 13;
        Set C = rli0.C(new ulp0(rli0.p(rli0.j(new i5g(attachments), new lt0(i)), new xx0(this)), new am0(17)));
        WriteBar writeBar2 = this.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        MsgFromUser replyMessage = writeBar2.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        hfr.a aVar = new hfr.a(rli0.j(new i5g(attachments), new ci3(6)));
        while (aVar.hasNext()) {
            Attachment attachment = (Attachment) aVar.next();
            zbb.b bVar = this.E;
            if (bVar == null) {
                bVar = null;
            }
            ca3.b(attachment);
            bVar.getClass();
        }
        b bVar2 = this.u;
        b bVar3 = b.EDITING;
        MsgTextFormat msgTextFormat = c9sVar.b;
        if (bVar2 == bVar3) {
            if (drm0.p0(obj3).toString().length() == 0) {
                if (!((ArrayList) B).isEmpty() && !B.isEmpty()) {
                    Iterator it = B.iterator();
                    while (it.hasNext()) {
                        if (!(((Attach) it.next()) instanceof AttachQuestion)) {
                            break;
                        }
                    }
                }
                if (C.isEmpty()) {
                    zbb.b bVar4 = this.E;
                    zbb.b bVar5 = bVar4 != null ? bVar4 : null;
                    MsgFromChannel msgFromChannel = this.q;
                    ka0 ka0Var = new ka0(this, 16);
                    if (msgFromChannel != null) {
                        zbb.this.O(new ybb.c(msgFromChannel, ka0Var));
                        return;
                    } else {
                        bVar5.getClass();
                        return;
                    }
                }
            }
            MsgFromChannel msgFromChannel2 = this.q;
            Set C2 = rli0.C(new ulp0(rli0.j(new i5g(msgFromChannel2.F), new rf(i)), new gv3(7)));
            Iterator it2 = msgFromChannel2.F.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (((NestedMsg) obj).b == NestedMsg.Type.REPLY) {
                        break;
                    }
                }
            }
            NestedMsg nestedMsg = (NestedMsg) obj;
            Integer valueOf2 = nestedMsg != null ? Integer.valueOf(nestedMsg.d) : null;
            if (epx.f(msgFromChannel2.I.a, obj3) && epx.f(msgFromChannel2.T, msgTextFormat)) {
                List<? extends Attachment> list = this.M;
                WriteBar writeBar3 = this.x;
                if (writeBar3 == null) {
                    writeBar3 = null;
                }
                if (epx.f(list, j5g.O0(writeBar3.getAttachments())) && epx.f(C, C2) && epx.f(valueOf, valueOf2) && epx.f(this.r, this.p)) {
                    z = true;
                    this.M = EmptyList.b;
                    if (z) {
                        WriteBar writeBar4 = this.x;
                        (writeBar4 != null ? writeBar4 : null).O();
                        f();
                        return;
                    }
                }
            }
            z = false;
            this.M = EmptyList.b;
            if (z) {
            }
        }
        WriteBar writeBar5 = this.x;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        ChannelMsgSendConfig a2 = ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, false, false, false, null, null, null, null, false, false, false, false, writeBar5.e0.n ? "fullscreen_posting_channel" : "im_channel", 16383);
        WriteBar writeBar6 = this.x;
        if (writeBar6 == null) {
            writeBar6 = null;
        }
        writeBar6.O();
        zbb.b bVar6 = this.E;
        zbb.b bVar7 = bVar6 == null ? null : bVar6;
        MsgFromChannel msgFromChannel3 = this.q;
        oz30.c(bVar7, msgFromChannel3 != null ? msgFromChannel3.b : 0, obj3, msgTextFormat, null, B, valueOf, null, C, a2, 72);
    }

    public final void K(boolean z) {
        if (this.i || z) {
            WriteBar writeBar = this.x;
            (writeBar != null ? writeBar : null).b0();
        } else {
            WriteBar writeBar2 = this.x;
            (writeBar2 != null ? writeBar2 : null).Z();
        }
    }

    public final void M(Msg msg, AttachWithTranscription attachWithTranscription) {
        P(b.EDITING);
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setAddAttachAllowed(false);
        WriteBar writeBar2 = this.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.setEmojiAllowed(false);
        WriteBar writeBar3 = this.x;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        writeBar3.setText(attachWithTranscription.Y4());
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        RichEditText richEditText2 = this.B;
        RichEditText richEditText3 = richEditText2 == null ? null : richEditText2;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        Editable text = richEditText2.getText();
        richEditText3.setSelection(text != null ? text.length() : 0);
        RichEditText richEditText4 = this.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        mhy.j(richEditText4);
        zbb.b bVar = this.E;
        (bVar != null ? bVar : null).getClass();
    }

    public final void N(CharSequence charSequence, List list, ArrayList arrayList) {
        P(b.EDITING);
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText(charSequence);
        RichEditText richEditText = this.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.requestFocus();
        RichEditText richEditText2 = this.B;
        RichEditText richEditText3 = richEditText2 == null ? null : richEditText2;
        if (richEditText2 == null) {
            richEditText2 = null;
        }
        Editable text = richEditText2.getText();
        richEditText3.setSelection(text != null ? text.length() : 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            WriteBar writeBar2 = this.x;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.A1(attachment);
        }
        this.M = list;
        if (!arrayList.isEmpty()) {
            WriteBar writeBar3 = this.x;
            if (writeBar3 == null) {
                writeBar3 = null;
            }
            writeBar3.x(arrayList);
        }
        RichEditText richEditText4 = this.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        mhy.j(richEditText4);
        zbb.b bVar = this.E;
        (bVar != null ? bVar : null).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(b bVar) {
        boolean z;
        Object[] objArr;
        WriteBar writeBar;
        WriteBar writeBar2;
        WriteBar writeBar3;
        WriteBar writeBar4;
        WriteBar writeBar5;
        WriteBar writeBar6;
        WriteBar writeBar7;
        WriteBar writeBar8;
        WriteBar writeBar9;
        WriteBar writeBar10;
        WriteBar writeBar11;
        WriteBar writeBar12;
        WriteBar writeBar13;
        WriteBar writeBar14;
        WriteBar writeBar15;
        WriteBar writeBar16;
        WriteBar writeBar17;
        StickersView stickersView;
        WriteBar writeBar18;
        WriteBar writeBar19;
        WriteBar writeBar20;
        WriteBar writeBar21;
        WriteBar writeBar22;
        WriteBar writeBar23;
        b bVar2;
        WriteBar writeBar24;
        this.u = bVar;
        Object[] objArr2 = bVar == b.NORMAL;
        if (objArr2 != false) {
            ImFeatures imFeatures = ImFeatures.IM_CHANNELS_STICKERS;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                z = true;
                if (!this.t.isEmpty()) {
                    HashSet hashSet = this.t;
                    if (hashSet == null || !hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            if (com.vk.dto.common.b.a(((UserId) it.next()).b)) {
                            }
                        }
                    }
                    objArr = true;
                    writeBar = this.x;
                    if (writeBar == null) {
                        writeBar = null;
                    }
                    writeBar.setStickersSuggestEnabled(true);
                    writeBar2 = this.x;
                    if (writeBar2 == null) {
                        writeBar2 = null;
                    }
                    HashSet hashSet2 = this.t;
                    boolean z2 = !objArr2 == true && objArr == true;
                    Dialog Cb = this.s.Cb();
                    writeBar2.X(hashSet2, z2, Cb == null && Cb.Db(), false);
                    writeBar3 = this.x;
                    if (writeBar3 == null) {
                        writeBar3 = null;
                    }
                    writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, false);
                    writeBar3.getState().e = false;
                    writeBar4 = this.x;
                    if (writeBar4 == null) {
                        writeBar4 = null;
                    }
                    writeBar4.setMoneySendAllowed(false);
                    writeBar5 = this.x;
                    if (writeBar5 == null) {
                        writeBar5 = null;
                    }
                    writeBar5.setMoneyRequestAllowed(false);
                    writeBar6 = this.x;
                    if (writeBar6 == null) {
                        writeBar6 = null;
                    }
                    writeBar6.setPhotoVideoFromVkAllowed(false);
                    writeBar7 = this.x;
                    if (writeBar7 == null) {
                        writeBar7 = null;
                    }
                    writeBar7.setDocumentsSearchAllowed(false);
                    writeBar8 = this.x;
                    if (writeBar8 == null) {
                        writeBar8 = null;
                    }
                    writeBar8.setGraffitiAllowed(false);
                    writeBar9 = this.x;
                    if (writeBar9 == null) {
                        writeBar9 = null;
                    }
                    writeBar9.setAudioMsgRecordingAllowed(false);
                    writeBar10 = this.x;
                    if (writeBar10 == null) {
                        writeBar10 = null;
                    }
                    writeBar10.setVideoMsgRecordingAllowed(true);
                    writeBar11 = this.x;
                    if (writeBar11 == null) {
                        writeBar11 = null;
                    }
                    writeBar11.setStoriesAllowed(false);
                    writeBar12 = this.x;
                    if (writeBar12 == null) {
                        writeBar12 = null;
                    }
                    writeBar12.setBotKeyboardAllowed(false);
                    writeBar13 = this.x;
                    if (writeBar13 == null) {
                        writeBar13 = null;
                    }
                    writeBar13.setPollAllowed(true);
                    writeBar14 = this.x;
                    if (writeBar14 == null) {
                        writeBar14 = null;
                    }
                    writeBar14.setAchievementsAllowed(false);
                    writeBar15 = this.x;
                    if (writeBar15 == null) {
                        writeBar15 = null;
                    }
                    writeBar15.setDialogId(this.g);
                    writeBar16 = this.x;
                    if (writeBar16 == null) {
                        writeBar16 = null;
                    }
                    writeBar16.setFullscreenModeAllowed(true);
                    writeBar17 = this.x;
                    if (writeBar17 == null) {
                        writeBar17 = null;
                    }
                    writeBar17.setSettingsAvailable(true);
                    stickersView = this.C;
                    if (stickersView == null) {
                        stickersView = null;
                    }
                    stickersView.setStickersEnabled(z);
                    writeBar18 = this.x;
                    if (writeBar18 == null) {
                        writeBar18 = null;
                    }
                    int i = this.J;
                    writeBar18.setAttachLimits(i);
                    writeBar19 = this.x;
                    if (writeBar19 == null) {
                        writeBar19 = null;
                    }
                    a1w a1wVar = this.k;
                    a1wVar.r().getClass();
                    writeBar19.setAttachLimitHintEnabled(i > 10);
                    writeBar20 = this.x;
                    if (writeBar20 == null) {
                        writeBar20 = null;
                    }
                    writeBar20.setAddAttachAllowed(true);
                    writeBar21 = this.x;
                    if (writeBar21 == null) {
                        writeBar21 = null;
                    }
                    writeBar21.setEmojiAllowed(z);
                    writeBar22 = this.x;
                    if (writeBar22 == null) {
                        writeBar22 = null;
                    }
                    writeBar22.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                    writeBar23 = this.x;
                    if (writeBar23 == null) {
                        writeBar23 = null;
                    }
                    bVar2 = b.EDITING;
                    writeBar23.setIsSendButtonAlwaysEnabled(bVar == bVar2);
                    if (this.u == bVar2) {
                        WriteBar writeBar25 = this.x;
                        if (writeBar25 == null) {
                            writeBar25 = null;
                        }
                        writeBar25.setPlaceholderHint("");
                    } else {
                        WriteBar writeBar26 = this.x;
                        if (writeBar26 == null) {
                            writeBar26 = null;
                        }
                        writeBar26.setPlaceholderHint(this.i ? R.string.vkim_channel_new_postponed_message_hint : R.string.vkim_channel_new_message_hint);
                    }
                    boolean z3 = this.u != bVar2;
                    writeBar24 = this.x;
                    if (writeBar24 == null) {
                        writeBar24 = null;
                    }
                    writeBar24.setShowPhotoEditorEntryPoints(z3);
                    if (c.$EnumSwitchMapping$0[this.u.ordinal()] != 1) {
                        WriteBar writeBar27 = this.x;
                        if (writeBar27 == null) {
                            writeBar27 = null;
                        }
                        writeBar27.setVisibility(0);
                        RichEditText richEditText = this.B;
                        (richEditText != null ? richEditText : null).setFilters(new InputFilter[0]);
                        K(this.p.l() != null);
                        return;
                    }
                    WriteBar writeBar28 = this.x;
                    if (writeBar28 == null) {
                        writeBar28 = null;
                    }
                    writeBar28.setVisibility(0);
                    RichEditText richEditText2 = this.B;
                    if (richEditText2 == null) {
                        richEditText2 = null;
                    }
                    a1wVar.a.getClass();
                    richEditText2.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4000)});
                    WriteBar writeBar29 = this.x;
                    if (writeBar29 == null) {
                        writeBar29 = null;
                    }
                    writeBar29.W();
                    WriteBar writeBar30 = this.x;
                    if (writeBar30 == null) {
                        writeBar30 = null;
                    }
                    a1wVar.r().getClass();
                    writeBar30.setAttachLimits(10);
                    WriteBar writeBar31 = this.x;
                    (writeBar31 != null ? writeBar31 : null).setAttachLimitHintEnabled(false);
                    return;
                }
                objArr = false;
                writeBar = this.x;
                if (writeBar == null) {
                }
                writeBar.setStickersSuggestEnabled(true);
                writeBar2 = this.x;
                if (writeBar2 == null) {
                }
                HashSet hashSet22 = this.t;
                if (objArr2 == true) {
                }
                Dialog Cb2 = this.s.Cb();
                writeBar2.X(hashSet22, z2, Cb2 == null && Cb2.Db(), false);
                writeBar3 = this.x;
                if (writeBar3 == null) {
                }
                writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, false);
                writeBar3.getState().e = false;
                writeBar4 = this.x;
                if (writeBar4 == null) {
                }
                writeBar4.setMoneySendAllowed(false);
                writeBar5 = this.x;
                if (writeBar5 == null) {
                }
                writeBar5.setMoneyRequestAllowed(false);
                writeBar6 = this.x;
                if (writeBar6 == null) {
                }
                writeBar6.setPhotoVideoFromVkAllowed(false);
                writeBar7 = this.x;
                if (writeBar7 == null) {
                }
                writeBar7.setDocumentsSearchAllowed(false);
                writeBar8 = this.x;
                if (writeBar8 == null) {
                }
                writeBar8.setGraffitiAllowed(false);
                writeBar9 = this.x;
                if (writeBar9 == null) {
                }
                writeBar9.setAudioMsgRecordingAllowed(false);
                writeBar10 = this.x;
                if (writeBar10 == null) {
                }
                writeBar10.setVideoMsgRecordingAllowed(true);
                writeBar11 = this.x;
                if (writeBar11 == null) {
                }
                writeBar11.setStoriesAllowed(false);
                writeBar12 = this.x;
                if (writeBar12 == null) {
                }
                writeBar12.setBotKeyboardAllowed(false);
                writeBar13 = this.x;
                if (writeBar13 == null) {
                }
                writeBar13.setPollAllowed(true);
                writeBar14 = this.x;
                if (writeBar14 == null) {
                }
                writeBar14.setAchievementsAllowed(false);
                writeBar15 = this.x;
                if (writeBar15 == null) {
                }
                writeBar15.setDialogId(this.g);
                writeBar16 = this.x;
                if (writeBar16 == null) {
                }
                writeBar16.setFullscreenModeAllowed(true);
                writeBar17 = this.x;
                if (writeBar17 == null) {
                }
                writeBar17.setSettingsAvailable(true);
                stickersView = this.C;
                if (stickersView == null) {
                }
                stickersView.setStickersEnabled(z);
                writeBar18 = this.x;
                if (writeBar18 == null) {
                }
                int i2 = this.J;
                writeBar18.setAttachLimits(i2);
                writeBar19 = this.x;
                if (writeBar19 == null) {
                }
                a1w a1wVar2 = this.k;
                a1wVar2.r().getClass();
                writeBar19.setAttachLimitHintEnabled(i2 > 10);
                writeBar20 = this.x;
                if (writeBar20 == null) {
                }
                writeBar20.setAddAttachAllowed(true);
                writeBar21 = this.x;
                if (writeBar21 == null) {
                }
                writeBar21.setEmojiAllowed(z);
                writeBar22 = this.x;
                if (writeBar22 == null) {
                }
                writeBar22.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
                writeBar23 = this.x;
                if (writeBar23 == null) {
                }
                bVar2 = b.EDITING;
                writeBar23.setIsSendButtonAlwaysEnabled(bVar == bVar2);
                if (this.u == bVar2) {
                }
                if (this.u != bVar2) {
                }
                writeBar24 = this.x;
                if (writeBar24 == null) {
                }
                writeBar24.setShowPhotoEditorEntryPoints(z3);
                if (c.$EnumSwitchMapping$0[this.u.ordinal()] != 1) {
                }
            }
        }
        z = false;
        if (!this.t.isEmpty()) {
        }
        objArr = false;
        writeBar = this.x;
        if (writeBar == null) {
        }
        writeBar.setStickersSuggestEnabled(true);
        writeBar2 = this.x;
        if (writeBar2 == null) {
        }
        HashSet hashSet222 = this.t;
        if (objArr2 == true) {
        }
        Dialog Cb22 = this.s.Cb();
        writeBar2.X(hashSet222, z2, Cb22 == null && Cb22.Db(), false);
        writeBar3 = this.x;
        if (writeBar3 == null) {
        }
        writeBar3.y.a(WriteBarPermissionsHolder.Permission.APPS, false);
        writeBar3.getState().e = false;
        writeBar4 = this.x;
        if (writeBar4 == null) {
        }
        writeBar4.setMoneySendAllowed(false);
        writeBar5 = this.x;
        if (writeBar5 == null) {
        }
        writeBar5.setMoneyRequestAllowed(false);
        writeBar6 = this.x;
        if (writeBar6 == null) {
        }
        writeBar6.setPhotoVideoFromVkAllowed(false);
        writeBar7 = this.x;
        if (writeBar7 == null) {
        }
        writeBar7.setDocumentsSearchAllowed(false);
        writeBar8 = this.x;
        if (writeBar8 == null) {
        }
        writeBar8.setGraffitiAllowed(false);
        writeBar9 = this.x;
        if (writeBar9 == null) {
        }
        writeBar9.setAudioMsgRecordingAllowed(false);
        writeBar10 = this.x;
        if (writeBar10 == null) {
        }
        writeBar10.setVideoMsgRecordingAllowed(true);
        writeBar11 = this.x;
        if (writeBar11 == null) {
        }
        writeBar11.setStoriesAllowed(false);
        writeBar12 = this.x;
        if (writeBar12 == null) {
        }
        writeBar12.setBotKeyboardAllowed(false);
        writeBar13 = this.x;
        if (writeBar13 == null) {
        }
        writeBar13.setPollAllowed(true);
        writeBar14 = this.x;
        if (writeBar14 == null) {
        }
        writeBar14.setAchievementsAllowed(false);
        writeBar15 = this.x;
        if (writeBar15 == null) {
        }
        writeBar15.setDialogId(this.g);
        writeBar16 = this.x;
        if (writeBar16 == null) {
        }
        writeBar16.setFullscreenModeAllowed(true);
        writeBar17 = this.x;
        if (writeBar17 == null) {
        }
        writeBar17.setSettingsAvailable(true);
        stickersView = this.C;
        if (stickersView == null) {
        }
        stickersView.setStickersEnabled(z);
        writeBar18 = this.x;
        if (writeBar18 == null) {
        }
        int i22 = this.J;
        writeBar18.setAttachLimits(i22);
        writeBar19 = this.x;
        if (writeBar19 == null) {
        }
        a1w a1wVar22 = this.k;
        a1wVar22.r().getClass();
        writeBar19.setAttachLimitHintEnabled(i22 > 10);
        writeBar20 = this.x;
        if (writeBar20 == null) {
        }
        writeBar20.setAddAttachAllowed(true);
        writeBar21 = this.x;
        if (writeBar21 == null) {
        }
        writeBar21.setEmojiAllowed(z);
        writeBar22 = this.x;
        if (writeBar22 == null) {
        }
        writeBar22.setAttachNewDot(pla.e().b().m(HintId.INFO_SUPERAPP_IM_INTEGRATION_PICKER_TOOLTIP));
        writeBar23 = this.x;
        if (writeBar23 == null) {
        }
        bVar2 = b.EDITING;
        writeBar23.setIsSendButtonAlwaysEnabled(bVar == bVar2);
        if (this.u == bVar2) {
        }
        if (this.u != bVar2) {
        }
        writeBar24 = this.x;
        if (writeBar24 == null) {
        }
        writeBar24.setShowPhotoEditorEntryPoints(z3);
        if (c.$EnumSwitchMapping$0[this.u.ordinal()] != 1) {
        }
    }

    @Override // xsna.ify.a
    public final void Y0() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setKeyboardHeight(0);
    }

    @Override // xsna.rnv
    public final boolean a0() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.n(false);
        WriteBar writeBar2 = this.x;
        if ((writeBar2 == null ? null : writeBar2).e0.n) {
            (writeBar2 != null ? writeBar2 : null).O();
            return true;
        }
        if (this.u != b.EDITING) {
            return G(this.F);
        }
        f();
        return true;
    }

    @Override // xsna.rnv
    public final void b(Bundle bundle) {
        n34.w(bundle, this.s, null);
        bundle.putParcelableArrayList("users", new ArrayList<>(this.t));
        bundle.putParcelable("msg_config", this.p);
        if (this.u != b.EDITING) {
            return;
        }
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        ArrayList<Attachment> attachments = writeBar.getAttachments();
        ArrayList arrayList = new ArrayList();
        for (Object obj : attachments) {
            if (obj instanceof FwdMessagesAttachment) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g5g.y(O((FwdMessagesAttachment) it.next()), arrayList2);
        }
        bundle.putParcelableArrayList("fwd_messages", new ArrayList<>(arrayList2));
        bundle.putParcelable("edit_msg_id", this.q);
        WriteBar writeBar2 = this.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        bundle.putString("body", writeBar2.getText().toString());
        WriteBar writeBar3 = this.x;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        bundle.putParcelableArrayList("attachments", writeBar3.getAttachments());
        WriteBar writeBar4 = this.x;
        if (writeBar4 == null) {
            writeBar4 = null;
        }
        ArrayList<Attachment> attachments2 = writeBar4.getAttachments();
        ArrayList arrayList3 = new ArrayList(c5g.u(attachments2, 10));
        Iterator<T> it2 = attachments2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((Attachment) it2.next()).c));
        }
        bundle.putIntegerArrayList("attachments_ids", new ArrayList<>(arrayList3));
        WriteBar writeBar5 = this.x;
        if (writeBar5 == null) {
            writeBar5 = null;
        }
        bundle.putParcelable("reply_msg", writeBar5.getReplyMessage());
        WriteBar writeBar6 = this.x;
        if (writeBar6 == null) {
            writeBar6 = null;
        }
        bundle.putParcelable("profiles", writeBar6.getReplyMsgMembers());
        p040 p040Var = this.n;
        RichEditText richEditText = this.B;
        bundle.putParcelable("body_format", p040Var.b((richEditText != null ? richEditText : null).getEditableText()));
    }

    @Override // xsna.xey.a
    public final void c() {
        View view = this.A;
        if (view == null) {
            view = null;
        }
        view.setClickable(false);
    }

    @Override // xsna.xey.a
    public final void d() {
        this.L = false;
        View view = this.D;
        if (view == null) {
            view = null;
        }
        view.setVisibility(8);
        zbb.b bVar = this.E;
        if (bVar == null) {
            bVar = null;
        }
        bVar.getClass();
        View view2 = this.A;
        (view2 != null ? view2 : null).setClickable(true);
    }

    @Override // xsna.xey.a
    public final void e() {
        if (this.L) {
            return;
        }
        View view = this.D;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
    }

    public final void f() {
        Boolean bool;
        y();
        ChannelMsgSendConfig channelMsgSendConfig = ChannelMsgSendConfig.c;
        cew.b.getClass();
        boolean i = cew.i();
        Channel b2 = this.f.b();
        this.p = ChannelMsgSendConfig.a(channelMsgSendConfig, null, false, (b2 == null || (bool = b2.H) == null) ? true : bool.booleanValue(), false, false, null, null, null, null, false, i, false, false, null, 30715);
        this.r = new ChannelMsgSendConfig(null, false, false, false, false, null, null, null, false, null, false, false, false, false, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
        this.q = null;
        K(this.i);
        P(b.NORMAL);
    }

    @Override // xsna.rnv
    public final void g(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("dialog_ext_state")) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("dialog_ext_state");
        Peer peer = (Peer) bundle2.getParcelable("dialog_id");
        long j = peer != null ? peer.b : 0L;
        DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
        if (dialogExt == null) {
            dialogExt = new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null);
        }
        this.s = dialogExt;
        this.t = new HashSet(bundle.getParcelableArrayList("users"));
        ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) bundle.getParcelable("msg_config");
        if (channelMsgSendConfig == null) {
            channelMsgSendConfig = this.p;
        }
        this.p = channelMsgSendConfig;
        if (bundle.get("edit_msg_id") == null) {
            return;
        }
        this.q = (MsgFromChannel) bundle.getParcelable("edit_msg_id");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("attachments");
        if (parcelableArrayList == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("attachments_ids");
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            ((Attachment) parcelableArrayList.get(i)).c = (integerArrayList != null ? integerArrayList.get(i) : null).intValue();
        }
        MsgFromChannel msgFromChannel = this.q;
        if (msgFromChannel == null) {
            return;
        }
        if (msgFromChannel.da()) {
            M(msgFromChannel, msgFromChannel.ec());
            return;
        }
        cvk cvkVar = s420.a;
        CharSequence a = s420.a(bundle.getString("body"));
        MsgTextFormat msgTextFormat = (MsgTextFormat) bundle.getParcelable("body_format");
        if (msgTextFormat == null) {
            msgTextFormat = MsgTextFormat.d;
        }
        CharSequence a2 = this.m.a(a, msgTextFormat);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("fwd_messages");
        N(a2, parcelableArrayList, parcelableArrayList2);
    }

    @Override // xsna.rnv
    public final void h(MsgSendHidePopupsReason msgSendHidePopupsReason) {
        G(this.F);
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.n(false);
    }

    @Override // xsna.rnv
    public final void m() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.B.f = false;
        writeBar.R();
    }

    @Override // xsna.rnv
    public final void n(Bundle bundle, long j) {
        long j2;
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        if (this.g != j) {
            this.g = j;
            y();
            WriteBar writeBar = this.x;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.setDialogId(j);
        }
        if (bundle == null) {
            return;
        }
        if (bundle.containsKey("fwd_ids") && (parcelableArrayList2 = bundle.getParcelableArrayList("fwd_ids")) != null && !parcelableArrayList2.isEmpty()) {
            WriteBar writeBar2 = this.x;
            if (writeBar2 == null) {
                writeBar2 = null;
            }
            writeBar2.x(parcelableArrayList2);
        }
        if (bundle.containsKey("text")) {
            WriteBar writeBar3 = this.x;
            if (writeBar3 == null) {
                writeBar3 = null;
            }
            writeBar3.setText(bundle.getString("text"));
        }
        if (bundle.containsKey("post")) {
            Parcelable parcelable = bundle.getParcelable("post");
            Parcelable parcelable2 = parcelable instanceof NewsEntry ? (NewsEntry) parcelable : null;
            fsx0 fsx0Var = parcelable2 instanceof fsx0 ? (fsx0) parcelable2 : null;
            Attachment R1 = fsx0Var != null ? fsx0Var.R1() : null;
            if (R1 != null) {
                WriteBar writeBar4 = this.x;
                if (writeBar4 == null) {
                    writeBar4 = null;
                }
                writeBar4.A1(R1);
            }
        }
        if (bundle.containsKey("photos")) {
            Iterator<String> it = bundle.getStringArrayList("photos").iterator();
            while (it.hasNext()) {
                String next = it.next();
                WriteBar writeBar5 = this.x;
                if (writeBar5 == null) {
                    writeBar5 = null;
                }
                writeBar5.A1(new PendingPhotoAttachment(next));
            }
        }
        if (bundle.containsKey("attachments")) {
            for (Parcelable parcelable3 : bundle.getParcelableArray("attachments")) {
                WriteBar writeBar6 = this.x;
                if (writeBar6 == null) {
                    writeBar6 = null;
                }
                writeBar6.A1((Attachment) parcelable3);
            }
        }
        if (bundle.containsKey("dialog_ext_state")) {
            Bundle bundle2 = bundle.getBundle("dialog_ext_state");
            Peer peer = (Peer) bundle2.getParcelable("dialog_id");
            long j3 = peer != null ? peer.b : 0L;
            DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle2, bundle2.getString("dialog_ext_state_key"));
            if (dialogExt == null) {
                dialogExt = new DialogExt(j3, (ProfilesInfo) null, 2, (zcl) null);
            }
            u(dialogExt);
            j2 = j;
        } else {
            j2 = j;
            u(new DialogExt(j2, (ProfilesInfo) null, 2, (zcl) null));
        }
        if (bundle.containsKey("arguments")) {
            n(bundle.getBundle("arguments"), j2);
        }
        d dVar = new d(4, this, a.class, "onInlineButtonSendMsg", "onInlineButtonSendMsg(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/vk/im/engine/models/conversations/BotButton;)V", 0);
        BotButton botButton = (BotButton) bundle.getParcelable("inline_button");
        if (botButton != null) {
            String string = bundle.getString("inline_button_msg_text", "");
            String string2 = bundle.getString("payload", "");
            ArrayList parcelableArrayList3 = bundle.getParcelableArrayList("attaches");
            if (parcelableArrayList3 == null) {
                parcelableArrayList3 = new ArrayList(0);
            }
            dVar.invoke(string, string2, parcelableArrayList3, botButton);
        } else if (bundle.containsKey("attaches") && (parcelableArrayList = bundle.getParcelableArrayList("attaches")) != null) {
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Attachment b2 = wdw.b((Attach) parcelableArrayList.get(i), null, false, 6);
                if (b2 != null) {
                    WriteBar writeBar7 = this.x;
                    if (writeBar7 == null) {
                        writeBar7 = null;
                    }
                    writeBar7.A1(b2);
                }
            }
        }
        if (bundle.getBoolean("open_keyboard", false)) {
            this.I.postDelayed(new qb3(this, 3), 200L);
        }
    }

    @Override // xsna.rnv
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i > 10000) {
            WriteBar writeBar = this.x;
            if (writeBar == null) {
                writeBar = null;
            }
            writeBar.onActivityResult(i, i2, intent);
        }
    }

    @Override // xsna.rnv
    public final void onPause() {
        this.H.a();
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.getState().f = false;
    }

    @Override // xsna.rnv
    public final void onResume() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.getState().f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    @Override // xsna.rnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(DialogExt dialogExt) {
        Object obj;
        ContextUser contextUser;
        this.s = dialogExt;
        P(this.q == null ? b.NORMAL : b.EDITING);
        if (com.vk.dto.common.b.d(this.g) && !o25.a().a(new UserId(this.g))) {
            Iterator it = dialogExt.b.b.c.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((User) obj).b == this.g) {
                        break;
                    }
                }
            }
            User user = (User) obj;
            if (user != null) {
                contextUser = new ContextUser(new UserId(user.b), user.s, user.h.Hb(h9l0.j), null, 8, null);
                this.w = contextUser;
                WriteBar writeBar = this.x;
                (writeBar != null ? writeBar : null).setContextUser(contextUser);
            }
        }
        contextUser = null;
        this.w = contextUser;
        WriteBar writeBar2 = this.x;
        (writeBar2 != null ? writeBar2 : null).setContextUser(contextUser);
    }

    @Override // xsna.rnv
    public final void x(int i) {
        if (this.u != b.NORMAL) {
            this.l.getClass();
            g2v.d().a().j(this.o, i, GiftData.d, null, "message");
            return;
        }
        xgy F = F();
        int i2 = xgy.F;
        F.h(null);
        StickersView stickersView = this.C;
        (stickersView != null ? stickersView : null).g(i);
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        StickersView stickersView = this.C;
        if (stickersView == null) {
            stickersView = null;
        }
        stickersView.setVisibility(0);
        G(this.F);
        zbb.b bVar = this.E;
        if (bVar == null) {
            bVar = null;
        }
        bVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        WriteBar writeBar = this.x;
        (writeBar != null ? writeBar : null).setKeyboardHeight(i);
    }

    @Override // xsna.rnv
    public final void y() {
        WriteBar writeBar = this.x;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setText("");
        WriteBar writeBar2 = this.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.F();
        WriteBar writeBar3 = this.x;
        (writeBar3 != null ? writeBar3 : null).L();
    }

    /* compiled from: ChannelMsgSendVc.kt */
    /* renamed from: com.vk.channels.impl.channel_screen.send_msg.a$a, reason: collision with other inner class name */
    public final class C0530a implements xgy.b {
        public C0530a() {
        }

        @Override // xsna.xgy.b
        public final void E(boolean z, xgy xgyVar) {
            a aVar = a.this;
            if (xgyVar.equals(aVar.F)) {
                WriteBar writeBar = aVar.x;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.o0(aVar.c.f(R.attr.vk_ui_text_accent));
                WriteBar writeBar2 = aVar.x;
                (writeBar2 != null ? writeBar2 : null).z.c(R.id.writebar_bot_keyboard, R.attr.im_ic_bot_keyboard, a());
            }
        }

        public final int a() {
            boolean M = dhr0.M();
            a aVar = a.this;
            if (M) {
                WriteBar writeBar = aVar.x;
                return (writeBar != null ? writeBar : null).getContext().getColor(R.color.vk_gray_400);
            }
            WriteBar writeBar2 = aVar.x;
            return (writeBar2 != null ? writeBar2 : null).getContext().getColor(R.color.vk_steel_gray_300);
        }

        @Override // xsna.xgy.b
        public final void q(xgy xgyVar) {
            a aVar = a.this;
            if (xgyVar.equals(aVar.F)) {
                WriteBar writeBar = aVar.x;
                if (writeBar == null) {
                    writeBar = null;
                }
                writeBar.o0(a());
            }
            zbb.b bVar = aVar.E;
            if (bVar == null) {
                bVar = null;
            }
            bVar.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            WriteBar writeBar2 = aVar.x;
            (writeBar2 != null ? writeBar2 : null).n(false);
        }

        @Override // xsna.xgy.b
        public final void D() {
        }
    }
}
