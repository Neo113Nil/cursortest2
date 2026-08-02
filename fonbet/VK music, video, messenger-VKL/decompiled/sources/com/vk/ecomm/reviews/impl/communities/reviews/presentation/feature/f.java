package com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.big0;
import xsna.dm50;
import xsna.dye0;
import xsna.kzh;
import xsna.nj;
import xsna.pn00;
import xsna.sdz;
import xsna.t3h;
import xsna.txh;
import xsna.uzh;
import xsna.ve0;
import xsna.vzh;
import xsna.yig0;
import xsna.yo9;
import xsna.z8f;

/* compiled from: CommunityReviewsReducer.kt */
/* loaded from: classes18.dex */
public final class f extends dm50<g, e, vzh> {
    public final uzh d;

    public f(vzh vzhVar, sdz sdzVar) {
        super(vzhVar);
        this.d = new uzh(sdzVar);
    }

    @Override // xsna.dm50
    public final vzh c(vzh vzhVar, e eVar) {
        vzh vzhVar2 = vzhVar;
        e eVar2 = eVar;
        if (eVar2 instanceof e.l) {
            e.l lVar = (e.l) eVar2;
            return vzh.a(vzhVar2, lVar.b, lVar.c, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -7, 7);
        }
        if (eVar2 instanceof e.f) {
            e.f fVar = (e.f) eVar2;
            return vzh.a(vzhVar2, false, false, fVar.b, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, fVar.c, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -1048609, 7);
        }
        if (eVar2 instanceof e.i) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, new kzh(0), null, true, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -40961, 7);
        }
        if (eVar2 instanceof e.h) {
            e.h hVar = (e.h) eVar2;
            boolean z = hVar.g;
            yo9 yo9Var = hVar.h;
            boolean z2 = hVar.c;
            Float f = hVar.d;
            int i = hVar.b;
            List<dye0> list = hVar.j;
            LinkedHashMap linkedHashMap = hVar.e;
            return vzh.a(vzhVar2, false, false, null, f, i, list, z2, z, yo9Var, linkedHashMap, new kzh(hVar.f, Integer.valueOf(linkedHashMap.size())), null, false, false, false, null, hVar.i, null, hVar.k, hVar.l, null, hVar.m, null, false, null, hVar.n, null, null, false, false, false, false, -493617089, 7);
        }
        if (eVar2 instanceof e.g) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, ((e.g) eVar2).b, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -134463489, 7);
        }
        if (eVar2 instanceof e.n) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, true, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -201523201, 7);
        }
        if (eVar2 instanceof e.a) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -65537, 7);
        }
        if (eVar2 instanceof e.m) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, ((e.m) eVar2).b, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -1048577, 7);
        }
        if (eVar2 instanceof e.s) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, ((e.s) eVar2).b, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -67293185, 7);
        }
        if (eVar2 instanceof e.j) {
            e.j jVar = (e.j) eVar2;
            boolean z3 = vzhVar2.q;
            Map<Integer, txh> map = vzhVar2.n;
            if (!z3) {
                if (vzhVar2.p != null) {
                    return vzhVar2;
                }
                if (!map.isEmpty()) {
                    if (jVar instanceof e.j.c) {
                        return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, true, null, false, null, null, false, false, false, false, -201392129, 7);
                    }
                    if (!(jVar instanceof e.j.b)) {
                        if (jVar instanceof e.j.a) {
                            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, ((e.j.a) jVar).b, false, null, null, false, false, false, false, -201457665, 7);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    e.j.b bVar = (e.j.b) jVar;
                    LinkedHashMap linkedHashMap2 = bVar.b;
                    LinkedHashMap n = pn00.n(map, linkedHashMap2);
                    kzh kzhVar = vzhVar2.o;
                    int i2 = bVar.c;
                    Integer valueOf = Integer.valueOf(linkedHashMap2.size());
                    kzhVar.getClass();
                    return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, n, new kzh(i2, valueOf), null, false, false, false, null, null, null, 0, null, null, bVar.d, null, false, null, false, null, null, false, false, false, false, -218296321, 7);
                }
            }
            return vzhVar2;
        }
        if (eVar2 instanceof e.c) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, ((e.c) eVar2).b, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -262145, 7);
        }
        if (eVar2 instanceof e.p) {
            e.p pVar = (e.p) eVar2;
            if (!(pVar instanceof e.p.b)) {
                if (pVar instanceof e.p.a) {
                    return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, yig0.a(vzhVar2.y, null, 8), null, null, false, null, false, null, null, false, false, false, false, -41943041, 7);
                }
                if (pVar instanceof e.p.d) {
                    return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, yig0.a(vzhVar2.y, ((e.p.d) pVar).b, 7), null, null, false, null, false, null, null, false, false, false, false, -8388609, 7);
                }
                if (pVar instanceof e.p.c) {
                    return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, ((e.p.c) pVar).b, false, null, false, null, null, false, false, false, false, -33554433, 7);
                }
                throw new NoWhenBranchMatchedException();
            }
            yig0 yig0Var = vzhVar2.y;
            e.p.b bVar2 = (e.p.b) pVar;
            Integer num = bVar2.b;
            Integer num2 = bVar2.c;
            UserId userId = bVar2.d;
            UserId userId2 = bVar2.e;
            yig0Var.getClass();
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, new yig0(num, num2, userId, userId2), null, null, false, null, false, null, null, false, false, false, false, -8388609, 7);
        }
        if (eVar2 instanceof e.o) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -268435457, 7);
        }
        if (eVar2 instanceof e.q) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, ((e.q) eVar2).b, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -131073, 7);
        }
        if (eVar2 instanceof e.d) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, ((e.d) eVar2).b, false, false, false, Integer.MAX_VALUE, 7);
        }
        if (eVar2 instanceof e.r) {
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, ((e.r) eVar2).b, false, -1, 5);
        }
        if (eVar2 instanceof e.b) {
            ((e.b) eVar2).getClass();
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, false, false, false, -1, 3);
        }
        if (eVar2 instanceof e.k) {
            e.k kVar = (e.k) eVar2;
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, kVar.b, Integer.valueOf(kVar.c), false, false, false, false, -1610612737, 7);
        }
        if (eVar2 instanceof e.C1018e) {
            e.C1018e c1018e = (e.C1018e) eVar2;
            return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, null, null, null, false, false, false, null, null, null, 0, null, null, null, null, false, null, false, null, null, false, c1018e.b, false, c1018e.c, -1, 2);
        }
        if (!(eVar2 instanceof e.t)) {
            throw new NoWhenBranchMatchedException();
        }
        e.t tVar = (e.t) eVar2;
        Map<Integer, txh> map2 = tVar.b;
        Map<UserId, big0> map3 = tVar.d;
        boolean z4 = tVar.e;
        return vzh.a(vzhVar2, false, false, null, null, 0, null, false, false, null, map2, new kzh(tVar.c, Integer.valueOf(map2.size())), null, false, false, false, null, null, null, 0, null, null, map3, null, false, null, false, null, null, tVar.f, z4, false, false, 1929121791, 6);
    }

    @Override // xsna.dm50
    public final g d() {
        return new g(e(new z8f(this, 6)), e(new nj(13)), e(new ve0(20)), e(new t3h(this, 4)));
    }

    @Override // xsna.dm50
    public final void h(vzh vzhVar, g gVar) {
        vzh vzhVar2 = vzhVar;
        g gVar2 = gVar;
        if (vzhVar2.q) {
            f(gVar2.c, vzhVar2);
            return;
        }
        if (vzhVar2.p != null) {
            f(gVar2.b, vzhVar2);
        } else if (vzhVar2.n.isEmpty()) {
            f(gVar2.d, vzhVar2);
        } else {
            f(gVar2.a, vzhVar2);
        }
    }
}
