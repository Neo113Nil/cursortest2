package com.vk.music.analytics.api.collector.strategy;

import com.vk.music.analytics.api.collector.strategy.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import xsna.ax1;
import xsna.epx;
import xsna.g7z;
import xsna.iwa0;
import xsna.jx40;
import xsna.k82;
import xsna.q940;
import xsna.qu;
import xsna.r9k;
import xsna.t940;
import xsna.uoh;
import xsna.v43;
import xsna.ykk;
import xsna.zkk;

/* compiled from: CumulativeOverflowCollectorStrategy.kt */
/* loaded from: classes3.dex */
public final class a<T extends t940> extends b<T> {
    public ykk h;
    public final ArrayList i;

    public a(g7z g7zVar, CollectorStrategy collectorStrategy, jx40 jx40Var, q940 q940Var) {
        super(g7zVar, collectorStrategy, jx40Var, q940Var);
        this.i = new ArrayList();
    }

    @Override // com.vk.music.analytics.api.collector.strategy.b
    public final boolean c() {
        return false;
    }

    public final ax1 e(ykk ykkVar) {
        ax1 ax1Var = null;
        if (ykkVar.isFinal()) {
            ax1Var = this.f.a(ykkVar);
            ykkVar = null;
        }
        this.h = ykkVar;
        return ax1Var == null ? ykkVar : ax1Var;
    }

    @Override // com.vk.music.analytics.api.collector.strategy.b, com.vk.music.analytics.api.collector.strategy.CollectorStrategy
    public final ax1 g(iwa0 iwa0Var) {
        ax1 ax1Var;
        Object next;
        ax1 e;
        CollectorStrategy<T> collectorStrategy = this.c;
        Object obj = null;
        if (!collectorStrategy.j(iwa0Var)) {
            return null;
        }
        ax1 g = collectorStrategy.g(iwa0Var);
        ArrayList arrayList = this.i;
        if (g != null) {
            boolean z = g instanceof ykk;
            b.a<T> aVar = this.f;
            if (z) {
                ykk ykkVar = this.h;
                if (ykkVar == null) {
                    e = e((ykk) g);
                } else if (epx.f(ykkVar.getId(), g.getId())) {
                    e = e(ykkVar.a((ykk) g));
                } else {
                    aVar.a(ykkVar);
                    arrayList.add(ykkVar);
                    e = e((ykk) g);
                }
            } else {
                e = aVar.a(g);
            }
            ax1Var = e;
        } else {
            ax1Var = null;
        }
        if (ax1Var != null) {
            if (!(ax1Var instanceof ykk)) {
                d(ax1Var, new zkk(new Ref$BooleanRef(), obj, new r9k(ax1Var, 2), this, 0));
                return ax1Var;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                while (it.hasNext()) {
                    next = ((ykk) next).a((ykk) it.next());
                }
            } else {
                next = null;
            }
            ykk ykkVar2 = (ykk) next;
            ykk ykkVar3 = (ykk) ax1Var;
            if (ykkVar3.isFinal()) {
                uoh uohVar = new uoh(ax1Var, 3);
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                d(ax1Var, new zkk(ref$BooleanRef, obj, uohVar, this, 0));
                if (!ref$BooleanRef.element && ykkVar2 != null) {
                    d(ykkVar2.a(ykkVar3), new zkk(new Ref$BooleanRef(), obj, new com.vk.libvideo.design.view.video.a(13, ykkVar2, ax1Var), this, 0));
                }
                arrayList.clear();
                return ax1Var;
            }
            v43 v43Var = new v43(8, this, ax1Var);
            qu quVar = new qu(ax1Var, 29);
            Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            d(ax1Var, new zkk(ref$BooleanRef2, v43Var, quVar, this, 0));
            if (!ref$BooleanRef2.element && ykkVar2 != null) {
                d(ykkVar2.a(ykkVar3), new zkk(new Ref$BooleanRef(), v43Var, new k82(6, ykkVar2, ax1Var), this, 0));
            }
        }
        return ax1Var;
    }
}
