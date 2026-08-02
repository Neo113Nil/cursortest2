package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import com.vk.dto.attaches.AttachArtist;
import com.vk.dto.attaches.AttachAudio;
import com.vk.dto.attaches.AttachAudioMsg;
import com.vk.dto.attaches.AttachGraffiti;
import com.vk.dto.attaches.AttachImage;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgSyncState;
import com.vk.dto.music.MusicTrack;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.attaches.AttachWall;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgUnsupported;
import com.vk.im.engine.models.messages.a;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import xsna.epx;
import xsna.gkx0;
import xsna.gzn;
import xsna.j5g;
import xsna.ltx0;
import xsna.t3w0;
import xsna.u620;
import xsna.utr0;
import xsna.xuo0;

/* compiled from: ChatListModelsConverters.kt */
/* loaded from: classes2.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0272  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c a(Msg msg, Peer peer) {
        c.b bVar;
        MsgSyncState msgSyncState;
        gkx0 gkx0Var;
        Long l;
        Long l2;
        c.C1166c c1166c;
        c.g gVar;
        boolean z;
        boolean z2;
        AttachVideo attachVideo;
        AttachAudio attachAudio;
        MusicTrack musicTrack;
        boolean z3 = msg instanceof MsgFromChannel;
        MsgFromChannel msgFromChannel = z3 ? (MsgFromChannel) msg : null;
        if (msgFromChannel != null) {
            Object a0 = j5g.a0(msgFromChannel.E);
            bVar = new c.b((a0 instanceof AttachWall ? (AttachWall) a0 : null) != null, msgFromChannel.P0(), msgFromChannel.ic(), msgFromChannel.N(), msgFromChannel.I.r, new c.a(msgFromChannel.R5(), msgFromChannel.K(), msgFromChannel.Qa()), msgFromChannel.L, msgFromChannel.I.s, !msgFromChannel.Qb());
        } else {
            bVar = null;
        }
        int i = msg.b;
        long j = msg.c;
        Long l3 = msg.w;
        Long l4 = msg.v;
        int i2 = msg.d;
        Peer from = msg.getFrom();
        boolean z4 = msg.i;
        boolean Mb = msg.Mb();
        boolean Hb = msg.Hb();
        boolean Lb = msg.Lb();
        boolean z5 = msg.D;
        boolean H6 = msg.H6();
        boolean z6 = bVar != null ? bVar.i : !msg.i;
        boolean z7 = msg.w != null;
        boolean Nb = msg.Nb();
        MsgFromChannel msgFromChannel2 = z3 ? (MsgFromChannel) msg : null;
        boolean f = epx.f(msgFromChannel2 != null ? Boolean.valueOf(msgFromChannel2.M) : null, Boolean.TRUE);
        long j2 = msg.g;
        MsgSyncState msgSyncState2 = msg.o;
        gkx0 gkx0Var2 = msg.p;
        boolean z8 = msgSyncState2 == MsgSyncState.SENDING;
        boolean Pb = msg.Pb();
        t3w0 t3w0Var = msg instanceof t3w0 ? (t3w0) msg : null;
        String body = t3w0Var != null ? t3w0Var.getBody() : null;
        if (body == null) {
            body = "";
        }
        String str = body;
        boolean z9 = msg.c == peer.d;
        boolean Jb = msg.Jb(peer);
        boolean a = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.a(msg, peer);
        boolean z10 = true;
        long Fb = msg.Fb();
        boolean Ib = msg.Ib();
        boolean b = com.vk.im.ui.components.viewcontrollers.msg_list.entry.b.b(msg);
        MsgFromUser msgFromUser = msg instanceof MsgFromUser ? (MsgFromUser) msg : null;
        if (msgFromUser != null) {
            boolean Qb = msgFromUser.Qb();
            msgSyncState = msgSyncState2;
            boolean z11 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, new gzn(17), true) != null;
            gkx0Var = gkx0Var2;
            boolean z12 = com.vk.im.engine.models.messages.a.Q7(msgFromUser, new u620(4), true) != null;
            boolean g8 = msgFromUser.g8();
            int size = msgFromUser.H.size();
            boolean z13 = msgFromUser.D;
            boolean z14 = msgFromUser.w != null;
            boolean db = msgFromUser.db();
            int U9 = msgFromUser.U9();
            boolean P0 = msgFromUser.P0();
            boolean D3 = msgFromUser.D3(AttachSticker.class, false);
            boolean hc = msgFromUser.hc();
            boolean p3 = msgFromUser.p3();
            boolean k8 = msgFromUser.k8();
            boolean N = msgFromUser.N();
            boolean D32 = msgFromUser.D3(AttachGraffiti.class, false);
            boolean dc = msgFromUser.dc();
            if (msgFromUser.D3(AttachImage.class, false)) {
                AttachImage attachImage = (AttachImage) a.C1125a.a(msgFromUser, AttachImage.class);
                if ((attachImage != null ? attachImage.w : null) != null) {
                    z2 = true;
                    boolean F0 = msgFromUser.F0();
                    boolean z15 = msgFromUser.i;
                    boolean da = msgFromUser.da();
                    Peer peer2 = msgFromUser.h;
                    long j3 = msgFromUser.g;
                    boolean z16 = msgFromUser.l2(AttachVideoMsg.class, true) == null;
                    boolean z17 = msgFromUser.l2(AttachAudio.class, false) == null;
                    boolean z18 = msgFromUser.l2(AttachArtist.class, false) == null;
                    boolean z19 = msgFromUser.l2(AttachPlaylist.class, false) == null;
                    l = l3;
                    l2 = l4;
                    c.a aVar = new c.a(msgFromUser.R5(), msgFromUser.K(), !msgFromUser.Qa());
                    boolean gc = msgFromUser.gc();
                    boolean z20 = (msgFromUser.gc() || (attachAudio = (AttachAudio) a.C1125a.a(msgFromUser, AttachAudio.class)) == null || (musicTrack = attachAudio.b) == null || musicTrack.B()) ? false : true;
                    boolean S0 = msgFromUser.S0();
                    boolean ic = msgFromUser.ic();
                    boolean fc = msgFromUser.fc();
                    boolean D33 = msgFromUser.D3(AttachWall.class, true);
                    boolean z21 = (msgFromUser.A4(false) || msgFromUser.c9().A) ? false : true;
                    boolean z22 = (msgFromUser.D3(AttachVideo.class, false) || (attachVideo = (AttachVideo) a.C1125a.a(msgFromUser, AttachVideo.class)) == null || !attachVideo.k()) ? false : true;
                    Object a02 = j5g.a0(msgFromUser.H);
                    AttachVideo attachVideo2 = !(a02 instanceof AttachVideo) ? (AttachVideo) a02 : null;
                    z10 = true;
                    c1166c = new c.C1166c(peer2, z14, Qb, z11, z12, g8, size, z13, db, U9, p3, k8, N, da, P0, D3, D32, dc, z2, hc, z15, F0, z16, z19, z18, z17, msgFromUser.H.size() != 1 && ((attachVideo2 != null && attachVideo2.k()) || (attachVideo2 != null && attachVideo2.isExternal())), gc, z20, S0, ic, fc, j3, aVar, D33, z21, z22, msgFromUser.Yb(), msgFromUser.D3(AttachChannelMessage.class, false));
                }
            }
            z2 = false;
            boolean F02 = msgFromUser.F0();
            boolean z152 = msgFromUser.i;
            boolean da2 = msgFromUser.da();
            Peer peer22 = msgFromUser.h;
            long j32 = msgFromUser.g;
            if (msgFromUser.l2(AttachVideoMsg.class, true) == null) {
            }
            if (msgFromUser.l2(AttachAudio.class, false) == null) {
            }
            if (msgFromUser.l2(AttachArtist.class, false) == null) {
            }
            if (msgFromUser.l2(AttachPlaylist.class, false) == null) {
            }
            l = l3;
            l2 = l4;
            c.a aVar2 = new c.a(msgFromUser.R5(), msgFromUser.K(), !msgFromUser.Qa());
            boolean gc2 = msgFromUser.gc();
            if (msgFromUser.gc()) {
            }
            boolean S02 = msgFromUser.S0();
            boolean ic2 = msgFromUser.ic();
            boolean fc2 = msgFromUser.fc();
            boolean D332 = msgFromUser.D3(AttachWall.class, true);
            if (msgFromUser.A4(false)) {
            }
            if (msgFromUser.D3(AttachVideo.class, false)) {
            }
            Object a022 = j5g.a0(msgFromUser.H);
            if (!(a022 instanceof AttachVideo)) {
            }
            z10 = true;
            c1166c = new c.C1166c(peer22, z14, Qb, z11, z12, g8, size, z13, db, U9, p3, k8, N, da2, P0, D3, D32, dc, z2, hc, z152, F02, z16, z19, z18, z17, msgFromUser.H.size() != 1 && ((attachVideo2 != null && attachVideo2.k()) || (attachVideo2 != null && attachVideo2.isExternal())), gc2, z20, S02, ic2, fc2, j32, aVar2, D332, z21, z22, msgFromUser.Yb(), msgFromUser.D3(AttachChannelMessage.class, false));
        } else {
            msgSyncState = msgSyncState2;
            gkx0Var = gkx0Var2;
            l = l3;
            l2 = l4;
            c1166c = null;
        }
        com.vk.im.engine.models.messages.a aVar3 = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
        if (aVar3 != null) {
            boolean k82 = aVar3.k8();
            boolean F03 = aVar3.F0();
            boolean j7 = aVar3.j7();
            boolean p8 = aVar3.p8();
            boolean L1 = aVar3.L1();
            int size2 = aVar3.K0().size();
            AttachAudioMsg attachAudioMsg = (AttachAudioMsg) aVar3.l2(AttachAudioMsg.class, false);
            int i3 = attachAudioMsg != null ? attachAudioMsg.f : 0;
            if (aVar3.N()) {
                AttachStory story = aVar3.getStory();
                xuo0.a.getClass();
                if (!story.b(peer, xuo0.a())) {
                    z = z10;
                    gVar = new c.g(k82, F03, j7, p8, L1, size2, i3, z);
                }
            }
            z = false;
            gVar = new c.g(k82, F03, j7, p8, L1, size2, i3, z);
        } else {
            gVar = null;
        }
        c.e eVar = new c.e(msg.getFrom());
        ltx0 ltx0Var = msg instanceof ltx0 ? (ltx0) msg : null;
        return new c(i, i, i2, Fb, j, l, l2, j2, msgSyncState, from, gkx0Var, Lb, Nb, Mb, z4, z7, z6, Hb, z5, H6, f, Ib, Jb, a, z9, z8, Pb, b, str, c1166c, gVar, bVar, msg instanceof MsgUnsupported ? c.d.a : null, eVar, new c.f(ltx0Var != null ? ltx0Var.H0() : null), msg.A, msg.u, msg.e, msg.q, msg.r, msg.s, msg.t);
    }

    public static final utr0 b(g gVar) {
        utr0 utr0Var = new utr0(gVar.l(), gVar.t(), gVar.K0(), gVar.v(), gVar.M0(), gVar.E0());
        utr0Var.h = gVar.Q();
        return utr0Var;
    }
}
