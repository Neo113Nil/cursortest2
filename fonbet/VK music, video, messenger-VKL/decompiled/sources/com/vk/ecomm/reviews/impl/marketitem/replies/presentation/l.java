package com.vk.ecomm.reviews.impl.marketitem.replies.presentation;

import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.k;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bm50;
import xsna.c310;
import xsna.c5g;
import xsna.j2g0;
import xsna.k4g0;
import xsna.n210;
import xsna.on00;
import xsna.pn00;
import xsna.s410;
import xsna.x210;
import xsna.y210;
import xsna.z210;

/* compiled from: MarketItemReviewRepliesReducer.kt */
/* loaded from: classes18.dex */
public final class l implements bm50<c310, k> {
    @Override // xsna.bm50
    public final c310 a(c310 c310Var, k kVar) {
        c310 c310Var2 = c310Var;
        k kVar2 = kVar;
        if (kVar2 instanceof k.d) {
            k.d dVar = (k.d) kVar2;
            n210 n210Var = dVar.a;
            int i = n210Var.p;
            List<k4g0> list = n210Var.n;
            List<k4g0> list2 = list;
            int e = on00.e(c5g.u(list2, 10));
            if (e < 16) {
                e = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(e);
            for (Object obj : list2) {
                linkedHashMap.put(Integer.valueOf(((k4g0) obj).a), obj);
            }
            return c310.a(c310Var2, null, list.size(), i, n210Var, linkedHashMap, null, dVar.b, false, null, false, false, false, false, false, 196879);
        }
        if (kVar2.equals(k.f.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, true, false, false, false, false, 206799);
        }
        if (kVar2.equals(k.h.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, false, true, false, false, false, 198639);
        }
        if (kVar2.equals(x210.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, s410.a(c310Var2.j, null, null, null, null, 24), null, false, null, false, false, false, false, false, 229119);
        }
        if (kVar2.equals(k.b.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, false, false, false, false, false, 196607);
        }
        if (kVar2.equals(k.c.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, true, null, false, false, false, false, false, 197631);
        }
        if (kVar2 instanceof k.e) {
            j2g0 j2g0Var = ((k.e) kVar2).a;
            int i2 = j2g0Var.a;
            LinkedHashMap linkedHashMap2 = j2g0Var.b;
            return c310.a(c310Var2, null, c310Var2.f + linkedHashMap2.size(), i2, null, pn00.n(c310Var2.i, linkedHashMap2), null, pn00.n(c310Var2.k, j2g0Var.c), false, null, false, false, false, false, false, 196943);
        }
        if (kVar2 instanceof k.g) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, ((k.g) kVar2).a, false, false, false, false, false, 210943);
        }
        if (kVar2 instanceof y210) {
            y210 y210Var = (y210) kVar2;
            return c310.a(c310Var2, null, 0, 0, null, null, s410.a(c310Var2.j, y210Var.b, y210Var.a, y210Var.c, y210Var.d, 16), null, false, null, false, false, false, false, false, 261887);
        }
        if (kVar2 instanceof z210) {
            return c310.a(c310Var2, null, 0, 0, null, null, s410.a(c310Var2.j, null, null, null, ((z210) kVar2).a, 23), null, false, null, false, false, false, false, false, 261887);
        }
        if (kVar2.equals(k.C1020k.a)) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, false, false, true, false, false, 210943);
        }
        if (kVar2 instanceof k.l) {
            return c310.a(c310Var2, null, 0, 0, null, ((k.l) kVar2).a, null, null, false, null, false, false, false, false, false, 163711);
        }
        if (kVar2 instanceof k.m) {
            return c310.a(c310Var2, null, 0, 0, ((k.m) kVar2).a, null, null, null, false, null, false, false, false, false, false, 262079);
        }
        if (kVar2 instanceof k.a) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, false, false, false, false, ((k.a) kVar2).a, 131071);
        }
        if (kVar2 instanceof k.i) {
            return c310.a(c310Var2, ((k.i) kVar2).a, 0, 0, null, null, null, null, false, null, false, false, false, false, false, 262139);
        }
        if (kVar2 instanceof k.j) {
            return c310.a(c310Var2, null, 0, 0, null, null, null, null, false, null, false, false, false, ((k.j) kVar2).a, false, 229375);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        return true;
    }
}
