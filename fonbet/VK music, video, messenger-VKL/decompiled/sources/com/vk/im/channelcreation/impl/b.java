package com.vk.im.channelcreation.impl;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.channelcreation.impl.c;
import com.vk.im.channelcreation.impl.e;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.utils.CreateChannelFlowTracker;
import com.vk.movika.sdk.base.observable.p;
import com.vk.movika.sdk.base.ui.p0;
import io.reactivex.rxjava3.internal.operators.single.n;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.az;
import xsna.b25;
import xsna.bg1;
import xsna.ca6;
import xsna.cq3;
import xsna.cz;
import xsna.di6;
import xsna.epx;
import xsna.gn0;
import xsna.hz;
import xsna.ig4;
import xsna.io1;
import xsna.iz;
import xsna.j5n;
import xsna.j7g0;
import xsna.kya;
import xsna.kza;
import xsna.lg4;
import xsna.lh;
import xsna.lz;
import xsna.o25;
import xsna.ov2;
import xsna.ozo;
import xsna.p4g;
import xsna.ph3;
import xsna.pxa;
import xsna.qu;
import xsna.r6k;
import xsna.rl3;
import xsna.tb;
import xsna.v3q;
import xsna.xf1;
import xsna.xul;
import xsna.xx0;
import xsna.ywa;
import xsna.zwa;

/* compiled from: ChannelCreationFeature.kt */
/* loaded from: classes2.dex */
public final class b extends di6<j, g, i, c> {
    public final r6k h;
    public final ozo i;
    public final xul j;
    public final v3q k;
    public final boolean l;
    public final long m;
    public io.reactivex.rxjava3.disposables.c n;

    public b(r6k r6kVar, ozo ozoVar, j7g0 j7g0Var, xul xulVar, v3q v3qVar, boolean z, long j, b25 b25Var) {
        super(new j((z || o25.b(b25Var)) ? false : true, 6));
        this.h = r6kVar;
        this.i = ozoVar;
        this.j = xulVar;
        this.k = v3qVar;
        this.l = z;
        this.m = j;
        if (z) {
            di6.l(this, j7g0Var.a.C(j7g0Var, new kza(j, false)).q(j7g0Var.b.c()).m(v3qVar.d()), new ov2(this, 6), 1);
        }
    }

    @Override // xsna.di6
    public final void d(g gVar) {
        g gVar2 = gVar;
        if (gVar2.equals(g.b.b)) {
            ArrayList w0 = rl3.w0(AvatarAction.values());
            p4g.l(w0, AvatarAction.REMOVE, g().b.a.length() == 0);
            w0.remove(AvatarAction.CHANGE_BY_MINI_APP);
            n(new i.d(new e.a(w0)));
            return;
        }
        if (gVar2.equals(g.l.b)) {
            m(c.e.a);
            return;
        }
        if (gVar2.equals(g.m.b)) {
            m(c.f.a);
            return;
        }
        if (gVar2.equals(g.k.b)) {
            n(new i.d(e.b.a));
            return;
        }
        boolean z = gVar2 instanceof g.n;
        boolean z2 = this.l;
        if (z) {
            if (!z2) {
                CreateChannelFlowTracker.a(CreateChannelFlowTracker.CreateChannelFlowTrackEvent.CHOOSE_AVATAR_PERSONAL_CHANNEL);
            }
            q(new lh(6, this, gVar2));
            return;
        }
        if (gVar2.equals(g.c.b)) {
            if (z2 && g().c()) {
                n(new i.d(e.C1095e.a));
                return;
            } else if (z2 || !g().b()) {
                m(c.d.a);
                return;
            } else {
                n(new i.d(e.d.a));
                return;
            }
        }
        if (gVar2.equals(g.j.b)) {
            m(c.d.a);
            return;
        }
        if (gVar2.equals(g.o.b)) {
            q(new iz(this, 13));
            return;
        }
        if (gVar2 instanceof g.e) {
            q(new cq3(4, this, gVar2));
            return;
        }
        boolean equals = gVar2.equals(g.f.b);
        int i = 2;
        int i2 = 9;
        int i3 = 11;
        v3q v3qVar = this.k;
        long j = this.m;
        if (equals) {
            String str = g().b.c;
            String str2 = g().b.a;
            boolean z3 = g().b.d;
            io.reactivex.rxjava3.disposables.c cVar = this.n;
            if (cVar != null) {
                cVar.dispose();
            }
            r6k r6kVar = this.h;
            r6kVar.getClass();
            this.n = j(new io.reactivex.rxjava3.internal.operators.single.j(new n(r6kVar.a.C(r6kVar, new ywa(4, new UserId(j), str, str2, z3)).l(new p0(new xx0(24), 15)).q(r6kVar.b.c()).m(v3qVar.d()), new gn0(new qu(this, 13), 8)), new ig4(this, 2)), new hz(this, 11), new bg1(this, 9));
            return;
        }
        if (gVar2.equals(g.i.b)) {
            String str3 = g().b.c;
            String str4 = g().b.a;
            if (epx.f(str4, g().b.b)) {
                str4 = null;
            }
            boolean z4 = g().b.d;
            io.reactivex.rxjava3.disposables.c cVar2 = this.n;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            ozo ozoVar = this.i;
            ozoVar.getClass();
            this.n = j(new io.reactivex.rxjava3.internal.operators.single.j(new n(ozoVar.a.C(ozoVar, new kya(new UserId(j), z4, str3, str4)).l(new ca6(new j5n(1), 14)).q(ozoVar.b.c()).m(v3qVar.d()), new az(new com.vk.movika.sdk.base.observable.c(this, 19), 9)), new zwa(this, 0)), new io1(this, 11), new cz(this, 11));
            return;
        }
        if (gVar2.equals(g.d.b)) {
            io.reactivex.rxjava3.disposables.c cVar3 = this.n;
            if (cVar3 != null) {
                cVar3.dispose();
                return;
            }
            return;
        }
        if (gVar2.equals(g.a.b)) {
            n(new i.d(e.c.a));
            return;
        }
        if (!gVar2.equals(g.h.b)) {
            if (!gVar2.equals(g.C1096g.b)) {
                throw new NoWhenBranchMatchedException();
            }
            q(new p(this, 16));
        } else {
            xul xulVar = this.j;
            xulVar.getClass();
            Serializer.c<Peer> cVar4 = Peer.CREATOR;
            j(new io.reactivex.rxjava3.internal.operators.single.j(new n(xulVar.a.C(xulVar, new pxa(Peer.a.b(j))).q(xulVar.b.c()).m(v3qVar.d()), new lz(new tb(this, 22), i2)), new lg4(this, i)), new xf1(this, 8), new ph3(this, i3));
        }
    }

    @Override // xsna.di6, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        io.reactivex.rxjava3.disposables.c cVar = this.n;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
