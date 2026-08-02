package com.vk.profile.community.impl.ui.events;

import com.vk.profile.community.impl.ui.events.a;
import com.vk.profile.community.impl.ui.events.b;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.awg0;
import xsna.bl50;
import xsna.el50;
import xsna.il50;
import xsna.jl50;
import xsna.lj50;
import xsna.ll50;
import xsna.msy;
import xsna.on50;
import xsna.qqe;
import xsna.sj50;
import xsna.ur0;
import xsna.w5;
import xsna.x5;
import xsna.xr0;
import xsna.yvg0;

/* compiled from: CommunityEventsInlineActor.kt */
/* loaded from: classes5.dex */
public final class e extends bl50<CommunityEventsState, a, on50, yvg0, awg0, b> {
    public final Object c;

    public e(sj50<CommunityEventsState, on50, ll50<on50, yvg0, awg0>, jl50<CommunityEventsState>, b> sj50Var) {
        super(sj50Var);
        this.c = msy.a(LazyThreadSafetyMode.NONE, new x5(11));
    }

    @Override // xsna.bl50, xsna.qj50
    public final void init() {
        el50.a.b(this, new ur0(15));
        il50.a(this, new qqe(this, 2));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        a aVar = (a) lj50Var;
        if (aVar instanceof a.C1564a) {
            c(b.a.a);
            return;
        }
        if (aVar instanceof a.c) {
            el50.a.b(this, new ur0(15));
            il50.a(this, new qqe(this, 2));
            return;
        }
        if (aVar instanceof a.b) {
            c(new b.C1565b(((a.b) aVar).b));
            return;
        }
        if (aVar instanceof a.e) {
            el50.a.b(this, new xr0(20));
            il50.a(this, new w5(this, 25));
        } else {
            if (!aVar.equals(a.d.b)) {
                throw new NoWhenBranchMatchedException();
            }
            el50.a.b(this, new xr0(20));
            il50.a(this, new w5(this, 25));
        }
    }
}
