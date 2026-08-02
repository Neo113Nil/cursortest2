package com.vk.music.analytics.api.collector.strategy;

import com.vk.music.analytics.api.collector.strategy.b;
import xsna.ax1;
import xsna.iwa0;
import xsna.t940;

/* compiled from: OverflowCollectorStrategy.kt */
/* loaded from: classes3.dex */
public final class c implements b.a<t940> {
    public final /* synthetic */ b<t940> a;

    public c(b<t940> bVar) {
        this.a = bVar;
    }

    @Override // com.vk.music.analytics.api.collector.strategy.b.a
    public final ax1 a(ax1 ax1Var) {
        b<t940> bVar = this.a;
        if (b.a(bVar)) {
            return null;
        }
        b.b(bVar, ax1Var);
        return ax1Var;
    }

    @Override // com.vk.music.analytics.api.collector.strategy.b.a
    public final ax1 b(iwa0 iwa0Var) {
        ax1 g;
        b<t940> bVar = this.a;
        if (b.a(bVar) || (g = bVar.c.g(iwa0Var)) == null) {
            return null;
        }
        b.b(bVar, g);
        return g;
    }
}
