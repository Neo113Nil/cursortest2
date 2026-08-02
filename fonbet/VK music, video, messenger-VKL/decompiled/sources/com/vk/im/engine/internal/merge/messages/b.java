package com.vk.im.engine.internal.merge.messages;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import xsna.arf;
import xsna.b920;
import xsna.d040;
import xsna.dxf;
import xsna.e43;
import xsna.exf;
import xsna.eyf;
import xsna.iie;
import xsna.iyf;
import xsna.m6o0;
import xsna.vum;
import xsna.w2w;
import xsna.wwf0;
import xsna.xgl0;

/* compiled from: DialogMsgHistoryFromServerMergeTask.kt */
/* loaded from: classes2.dex */
public final class b extends b920 {
    public final Peer c;
    public final int d;
    public final List<Msg> e;
    public final boolean f;
    public final boolean g;
    public final Boolean h;
    public final Boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Peer peer, int i, List<? extends Msg> list, boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.c = peer;
        this.d = i;
        this.e = list;
        this.f = z;
        this.g = z2;
        this.h = bool;
        this.i = bool2;
    }

    @Override // xsna.b920
    public final Object o(w2w w2wVar) {
        MessagesMergerInput messagesMergerInput = new MessagesMergerInput(this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
        xgl0 I0 = w2wVar.I0();
        vum vumVar = new vum(w2wVar.I0());
        d040 o = w2wVar.I0().o();
        dxf dxfVar = new dxf(w2wVar.I0().o(), new exf(w2wVar.I0(), w2wVar.I0().o(), new vum(w2wVar.I0())), new eyf(), w2wVar);
        m6o0 m6o0Var = new m6o0(w2wVar);
        wwf0 wwf0Var = new wwf0();
        arf arfVar = new arf(w2wVar, 8);
        iie iieVar = new iie(w2wVar, 9);
        ChannelMsgHistoryFromServerMergeTask.k.getClass();
        return new iyf(I0, vumVar, o, dxfVar, m6o0Var, wwf0Var, arfVar, iieVar, ChannelMsgHistoryFromServerMergeTask.l).a(messagesMergerInput);
    }

    public /* synthetic */ b(Peer peer, int i, List list, boolean z, boolean z2, Boolean bool, int i2) {
        this(peer, i, (List<? extends Msg>) list, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : bool, (i2 & 64) != 0 ? null : Boolean.FALSE);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(Msg msg) {
        this(Peer.a.b(r0), msg, false, false, 60);
        long j = msg.c;
        Serializer.c<Peer> cVar = Peer.CREATOR;
    }

    public b(Peer peer, Msg msg, boolean z, boolean z2, int i) {
        this(peer, msg != null ? msg.d : Integer.MAX_VALUE, (List<? extends Msg>) e43.m(msg), (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (Boolean) null, (Boolean) null);
    }
}
