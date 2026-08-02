package com.vk.channels.impl.channel_screen.footer;

import android.content.Context;
import com.vk.channels.impl.channel_screen.footer.g;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.b6m;
import xsna.hm50;
import xsna.jbs;
import xsna.kwg0;
import xsna.mxv;

/* compiled from: ChannelFooterRouter.kt */
/* loaded from: classes16.dex */
public final class h implements hm50<g> {
    public final MviComponentFragment a;
    public final mxv b;
    public final io.reactivex.rxjava3.disposables.b c;

    public h(MviComponentFragment mviComponentFragment, mxv mxvVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.a = mviComponentFragment;
        this.b = mxvVar;
        this.c = bVar;
    }

    @Override // xsna.hm50
    public final void a(g gVar) {
        g gVar2 = gVar;
        boolean z = gVar2 instanceof g.b;
        mxv mxvVar = this.b;
        MviComponentFragment mviComponentFragment = this.a;
        if (z) {
            io.reactivex.rxjava3.core.a m = mxvVar.a().m(((g.b) gVar2).a, new jbs(mviComponentFragment));
            int i = kwg0.a;
            this.c.b(m.subscribe(io.reactivex.rxjava3.internal.functions.a.c));
            return;
        }
        if (gVar2 instanceof g.c) {
            mxvVar.a().j(new jbs(mviComponentFragment), ((g.c) gVar2).a);
            return;
        }
        if (!(gVar2 instanceof g.a)) {
            throw new NoWhenBranchMatchedException();
        }
        g.a aVar = (g.a) gVar2;
        Context B = mviComponentFragment.B();
        if (B != null) {
            b6m.a().j(B, aVar.a);
        }
    }
}
