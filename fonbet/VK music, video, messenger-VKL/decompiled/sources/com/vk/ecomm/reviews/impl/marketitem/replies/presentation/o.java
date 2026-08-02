package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.at;
import xsna.awg0;
import xsna.b25;
import xsna.bqs;
import xsna.c310;
import xsna.ed;
import xsna.evg0;
import xsna.fh4;
import xsna.fy2;
import xsna.gf0;
import xsna.h2g0;
import xsna.hn50;
import xsna.hoz;
import xsna.j3z;
import xsna.jm50;
import xsna.jn50;
import xsna.k2y;
import xsna.ljs;
import xsna.m40;
import xsna.nn50;
import xsna.on50;
import xsna.pdw;
import xsna.pq20;
import xsna.rkz;
import xsna.rsg0;
import xsna.tfx;
import xsna.w00;
import xsna.w11;
import xsna.wha;
import xsna.xd10;
import xsna.y00;
import xsna.yd10;
import xsna.yfb;
import xsna.z8f;

/* compiled from: MarketItemReviewRepliesTaskExecutor.kt */
/* loaded from: classes18.dex */
public final class o extends evg0<c310, on50, n, n, k, h2g0> {
    public final hoz f;
    public final fy2 g;
    public final b25 h;

    public o(hoz hozVar, fy2 fy2Var, b25 b25Var, nn50 nn50Var) {
        super(jm50.a.a, nn50Var);
        this.f = hozVar;
        this.g = fy2Var;
        this.h = b25Var;
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        n nVar = (n) hn50Var;
        boolean equals = nVar.equals(n.a.b);
        jm50 jm50Var = this.d;
        nn50<State, TaskId, OutTask, Patch, Event> nn50Var = this.b;
        if (equals) {
            return awg0.a.b(this, this.g.i(((c310) nn50Var.getCurrentState()).e).r0(jm50Var.c()), new wha(0), null, new k2y(this, 1), 2);
        }
        if (nVar.equals(n.d.b)) {
            e(new k.i(this.h.c()));
            return null;
        }
        boolean equals2 = nVar.equals(n.e.b);
        hoz hozVar = this.f;
        if (equals2) {
            UserId userId = ((c310) nn50Var.getCurrentState()).e;
            int i = (int) ((c310) nn50Var.getCurrentState()).c;
            int i2 = ((c310) nn50Var.getCurrentState()).b;
            int i3 = ((c310) nn50Var.getCurrentState()).f;
            yd10 yd10Var = (yd10) hozVar.a;
            Integer valueOf = Integer.valueOf(i3);
            Integer num = 20;
            ArrayList arrayList = (ArrayList) hozVar.d;
            yd10Var.getClass();
            tfx tfxVar = new tfx("market.getItemReviewComments", new w11(23), new at(21));
            tfx.l(tfxVar, "review_id", i2, 0, 0, 12);
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
            tfx.l(tfxVar, "item_id", i, 0, 0, 8);
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, valueOf.intValue(), 0, 0, 12);
            tfx.l(tfxVar, SignalingProtocol.KEY_LIMIT, num.intValue(), 0, 0, 12);
            if (arrayList != null) {
                tfxVar.i("comments_profile_fields", arrayList);
            }
            return g(rsg0.w0(yfb.x(tfxVar)).l(new ed(new fh4(hozVar, i2, 2), 22)).q(jm50Var.c()), new j3z(this, 2), new ljs(this, 7));
        }
        if (nVar instanceof n.f) {
            return g(rsg0.w0(yfb.x(xd10.x((yd10) hozVar.a, ((c310) nn50Var.getCurrentState()).b, ((c310) nn50Var.getCurrentState()).c, ((c310) nn50Var.getCurrentState()).e, 16))).l(new m40(new z8f(hozVar, 27), 24)).q(jm50Var.c()), new w00(this, 22), new gf0(this, 25));
        }
        if (nVar instanceof n.b) {
            n.b bVar = (n.b) nVar;
            String str = bVar.b;
            List<Attachment> list = bVar.c;
            e(new k.j(true));
            int i4 = ((c310) nn50Var.getCurrentState()).b;
            UserId userId2 = ((c310) nn50Var.getCurrentState()).e;
            long j = ((c310) nn50Var.getCurrentState()).c;
            UserId userId3 = ((c310) nn50Var.getCurrentState()).j.d;
            if (userId3 == null) {
                return null;
            }
            return g(this.f.a(i4, userId2, j, userId3, str, ((c310) nn50Var.getCurrentState()).j.b, pq20.c(((c310) nn50Var.getCurrentState()).d, list)).q(jm50Var.c()), new rkz(this, 2), new y00(this, 29));
        }
        if (nVar instanceof n.c) {
            final int i5 = ((n.c) nVar).b;
            e(new k.j(true));
            return h(this.f.b(((c310) nn50Var.getCurrentState()).b, (int) ((c310) nn50Var.getCurrentState()).c, i5, ((c310) nn50Var.getCurrentState()).e).q(jm50Var.c()), new pdw(this, 1), new io.reactivex.rxjava3.functions.a() { // from class: xsna.k310
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o oVar = com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o.this;
                    Map<Integer, k4g0> map = ((c310) oVar.b.getCurrentState()).i;
                    int i6 = i5;
                    k4g0 k4g0Var = map.get(Integer.valueOf(i6));
                    if (k4g0Var != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        linkedHashMap.put(Integer.valueOf(i6), k4g0.a(k4g0Var, true, false, 3967));
                        map = linkedHashMap;
                    }
                    oVar.e(new k.l(map));
                }
            });
        }
        if (!(nVar instanceof n.g)) {
            throw new NoWhenBranchMatchedException();
        }
        final int i6 = ((n.g) nVar).b;
        e(new k.j(true));
        return h(this.f.d(((c310) nn50Var.getCurrentState()).b, (int) ((c310) nn50Var.getCurrentState()).c, i6, ((c310) nn50Var.getCurrentState()).e).q(jm50Var.c()), new bqs(this, 6), new io.reactivex.rxjava3.functions.a() { // from class: xsna.j310
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o oVar = com.vk.ecomm.reviews.impl.marketitem.replies.presentation.o.this;
                Map<Integer, k4g0> map = ((c310) oVar.b.getCurrentState()).i;
                int i7 = i6;
                k4g0 k4g0Var = map.get(Integer.valueOf(i7));
                if (k4g0Var != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(Integer.valueOf(i7), k4g0.a(k4g0Var, false, false, 3967));
                    map = linkedHashMap;
                }
                oVar.e(new k.l(map));
            }
        });
    }
}
