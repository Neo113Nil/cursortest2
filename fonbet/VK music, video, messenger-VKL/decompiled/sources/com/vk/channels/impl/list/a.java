package com.vk.channels.impl.list;

import android.content.Context;
import android.os.Bundle;
import com.vk.channels.impl.list.e;
import xsna.asu0;
import xsna.bhb;
import xsna.bzb0;
import xsna.feb;
import xsna.fib;
import xsna.i7o0;
import xsna.o25;
import xsna.pbw;
import xsna.thb;
import xsna.tta;
import xsna.uhb;
import xsna.vk50;
import xsna.wd8;
import xsna.wdj;
import xsna.xgb;
import xsna.xn50;
import xsna.yj50;
import xsna.zdw;
import xsna.zeb;

/* compiled from: ChannelsListComponent.kt */
/* loaded from: classes16.dex */
public final class a extends yj50<b, bhb, e, f, g, c, d> {
    public final ChannelsListFragment n;
    public final zeb o;
    public final thb p;
    public final bzb0 q;
    public final pbw r;

    public a(ChannelsListFragment channelsListFragment, ChannelsListFragment channelsListFragment2, zeb zebVar, uhb uhbVar, bzb0 bzb0Var, pbw pbwVar) {
        super(channelsListFragment, channelsListFragment2, e.class, false);
        this.n = channelsListFragment;
        this.o = zebVar;
        this.p = uhbVar;
        this.q = bzb0Var;
        this.r = pbwVar;
    }

    @Override // xsna.yj50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        xn50.a.c(this, e.d.b);
    }

    @Override // xsna.yj50
    public final b a(Bundle bundle) {
        zeb zebVar = this.o;
        xgb b = zebVar.b();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        tta ttaVar = new tta(zdwVar.b, asu0.a);
        wdj a = zebVar.a();
        feb b2 = this.r.b();
        zdw zdwVar2 = i7o0.b;
        return new b(b, ttaVar, a, this.p, b2, (zdwVar2 != null ? zdwVar2 : null).b.r().h);
    }

    @Override // xsna.yj50
    public final d b() {
        Context requireContext = this.n.requireContext();
        fib c = this.o.c();
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        return new d(requireContext, c, zdwVar.d(), new wd8(1, this, a.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 2));
    }

    @Override // xsna.yj50
    public final f d() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        return new f(this.q, zdwVar.b.r().h, o25.c(o25.a()), this.r.t().y(), this.n);
    }
}
