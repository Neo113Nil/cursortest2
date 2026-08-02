package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.n;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.a2g0;
import xsna.al50;
import xsna.big0;
import xsna.c310;
import xsna.c5g;
import xsna.h2g0;
import xsna.i2g0;
import xsna.k4g0;
import xsna.n210;
import xsna.on50;
import xsna.sj50;
import xsna.tlo0;
import xsna.tq;
import xsna.up2;
import xsna.w1g0;
import xsna.x1g0;
import xsna.x210;
import xsna.y1g0;
import xsna.y210;
import xsna.y2u0;
import xsna.z210;

/* compiled from: MarketItemReviewRepliesActor.kt */
/* loaded from: classes18.dex */
public final class a extends al50<c310, w1g0, on50, n, k, h2g0> {
    public a(sj50<c310, on50, n, k, h2g0> sj50Var) {
        super(sj50Var);
    }

    @Override // xsna.al50, xsna.qj50
    public final void init() {
        p(w1g0.a.b);
    }

    @Override // xsna.qj50
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void p(w1g0 w1g0Var) {
        UserId userId;
        UserId userId2;
        CharSequence charSequence;
        String obj;
        ListBuilder k;
        if (w1g0Var.equals(w1g0.a.b)) {
            e(k.f.a);
            a(n.f.b);
            return;
        }
        if (w1g0Var.equals(w1g0.m.b)) {
            e(k.h.a);
            a(n.f.b);
            return;
        }
        boolean equals = w1g0Var.equals(w1g0.d.b);
        sj50<State, TaskId, Task, Patch, Event> sj50Var = this.b;
        if (equals) {
            if (((c310) sj50Var.getCurrentState()).o || ((c310) sj50Var.getCurrentState()).p || ((c310) sj50Var.getCurrentState()).n) {
                return;
            }
            c310 c310Var = (c310) sj50Var.getCurrentState();
            if (c310Var.g <= 0 || c310Var.m == null) {
                return;
            }
            a(n.e.b);
            return;
        }
        if (w1g0Var.equals(w1g0.l.b)) {
            c310 c310Var2 = (c310) sj50Var.getCurrentState();
            int size = c310Var2.i.size();
            int i = c310Var2.g;
            if (size >= i || c310Var2.n || c310Var2.p || c310Var2.l || c310Var2.o) {
                return;
            }
            if (i <= 0 || c310Var2.m == null) {
                e(k.C1020k.a);
                a(n.e.b);
                return;
            }
            return;
        }
        if (w1g0Var.equals(w1g0.b.b)) {
            c(new h2g0.b(((c310) sj50Var.getCurrentState()).r));
            return;
        }
        if (w1g0Var.equals(w1g0.c.b)) {
            e(k.f.a);
            a(n.f.b);
            return;
        }
        if (w1g0Var.equals(w1g0.f.b)) {
            UserId userId3 = ((c310) sj50Var.getCurrentState()).e;
            UserId userId4 = ((c310) sj50Var.getCurrentState()).j.d;
            if (userId4 == null) {
                userId4 = UserId.d;
            }
            c(new i2g0.c(userId3, userId4));
            return;
        }
        if (w1g0Var.equals(w1g0.i.b)) {
            e(x210.a);
            return;
        }
        if (w1g0Var.equals(w1g0.h.b)) {
            if (((c310) sj50Var.getCurrentState()).j.b == null) {
                c(h2g0.d.a);
                return;
            } else {
                q(((c310) sj50Var.getCurrentState()).j.b);
                return;
            }
        }
        if (w1g0Var instanceof w1g0.j) {
            w1g0.j jVar = (w1g0.j) w1g0Var;
            a(new n.b(jVar.b, jVar.c));
            return;
        }
        if (w1g0Var instanceof w1g0.e) {
            w1g0.e eVar = (w1g0.e) w1g0Var;
            Integer num = eVar.c;
            UserId userId5 = ((c310) sj50Var.getCurrentState()).j.d;
            if (userId5 == null) {
                userId5 = ((c310) sj50Var.getCurrentState()).d;
            }
            if (((c310) sj50Var.getCurrentState()).s) {
                userId5 = ((c310) sj50Var.getCurrentState()).e;
            }
            Integer num2 = eVar.b;
            e(new y210(num2, num, eVar.d, userId5));
            if (num != null) {
                c(h2g0.d.a);
                return;
            } else {
                q(num2);
                return;
            }
        }
        if (w1g0Var instanceof w1g0.g) {
            e(new z210(((w1g0.g) w1g0Var).b));
            return;
        }
        if (w1g0Var instanceof w1g0.k) {
            c(new i2g0.d(((w1g0.k) w1g0Var).b));
            return;
        }
        if (!(w1g0Var instanceof w1g0.n)) {
            if (w1g0Var instanceof w1g0.o) {
                w1g0.o oVar = (w1g0.o) w1g0Var;
                if (oVar instanceof w1g0.o.a) {
                    n210 n210Var = ((c310) sj50Var.getCurrentState()).h;
                    if (n210Var == null) {
                        return;
                    }
                    e(new k.m(n210.a(n210Var, !n210Var.i, false, null, 130815)));
                    return;
                }
                if (oVar instanceof w1g0.o.c) {
                    int i2 = ((w1g0.o.c) oVar).b;
                    n210 n210Var2 = ((c310) sj50Var.getCurrentState()).h;
                    if (n210Var2 != null) {
                        List<y2u0> list = n210Var2.j;
                        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new Image(((y2u0) it.next()).b));
                        }
                        c(new i2g0.b(arrayList, i2));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        w1g0.n nVar = (w1g0.n) w1g0Var;
        if (nVar instanceof y1g0) {
            a(new n.c(((y1g0) nVar).b));
            return;
        }
        if (nVar instanceof w1g0.n.b) {
            a(new n.g(((w1g0.n.b) nVar).b));
            return;
        }
        if (nVar instanceof w1g0.n.a) {
            int i3 = ((w1g0.n.a) nVar).b;
            k4g0 k4g0Var = ((c310) sj50Var.getCurrentState()).i.get(Integer.valueOf(i3));
            if (k4g0Var == null || (k = up2.k(k4g0Var.f.toString(), k4g0Var.g, k4g0Var.i, k4g0Var.e)) == null) {
                return;
            }
            c(new i2g0.a(i3, k));
            return;
        }
        if (nVar instanceof w1g0.n.c) {
            int i4 = ((w1g0.n.c) nVar).b;
            Map<Integer, k4g0> map = ((c310) sj50Var.getCurrentState()).i;
            k4g0 k4g0Var2 = map.get(Integer.valueOf(i4));
            if (k4g0Var2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put(Integer.valueOf(i4), k4g0.a(k4g0Var2, false, true, 2047));
                map = linkedHashMap;
            }
            e(new k.l(map));
            return;
        }
        if (nVar instanceof x1g0) {
            k4g0 k4g0Var3 = ((c310) sj50Var.getCurrentState()).i.get(Integer.valueOf(((x1g0) nVar).b));
            if (k4g0Var3 == null || (charSequence = k4g0Var3.f) == null || (obj = charSequence.toString()) == null) {
                return;
            }
            c(new h2g0.a(obj));
            c(new h2g0.f(tq.h(tlo0.Companion, R.string.text_copied)));
            return;
        }
        if (nVar instanceof a2g0) {
            Map<Integer, k4g0> map2 = ((c310) sj50Var.getCurrentState()).i;
            int i5 = ((a2g0) nVar).b;
            k4g0 k4g0Var4 = map2.get(Integer.valueOf(i5));
            if (k4g0Var4 == null) {
                return;
            }
            big0 big0Var = k4g0Var4.c;
            if (!((c310) sj50Var.getCurrentState()).s) {
                if (big0Var == null || (userId = big0Var.a) == null) {
                    userId = UserId.d;
                }
                p(new w1g0.e(userId, Integer.valueOf(i5), null));
                return;
            }
            if (big0Var == null || (userId2 = big0Var.a) == null) {
                userId2 = UserId.d;
            }
            e(new y210(Integer.valueOf(i5), null, userId2, ((c310) sj50Var.getCurrentState()).e));
            q(Integer.valueOf(i5));
        }
    }

    public final void q(Integer num) {
        k4g0 k4g0Var = ((c310) this.b.getCurrentState()).i.get(num);
        if (k4g0Var != null) {
            c(new h2g0.c(k4g0Var.k));
        }
    }
}
