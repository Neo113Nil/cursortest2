package com.vk.geo.impl.presentation;

import com.vk.geo.impl.presentation.e;
import com.vk.geo.impl.presentation.i;
import kotlin.NoWhenBranchMatchedException;
import xsna.c4r;
import xsna.dm50;
import xsna.epx;
import xsna.jnt;
import xsna.wq3;

/* compiled from: GeoReducer.kt */
/* loaded from: classes2.dex */
public final class g extends dm50<j, e, jnt> {
    @Override // xsna.dm50
    public final jnt c(jnt jntVar, e eVar) {
        jnt jntVar2 = jntVar;
        e eVar2 = eVar;
        if (eVar2 instanceof e.b) {
            e.b bVar = (e.b) eVar2;
            if (epx.f(bVar, e.b.C1085b.b)) {
                return jnt.a(jntVar2, null, null, null, 29);
            }
            if (bVar instanceof e.b.c) {
                return jnt.a(jntVar2, null, null, null, 12);
            }
            if (bVar instanceof e.b.a) {
                return jnt.a(jntVar2, null, new i.a(), null, 29);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(eVar2 instanceof e.a)) {
            if (eVar2 instanceof e.c) {
                return jnt.a(jntVar2, null, null, null, 15);
            }
            throw new NoWhenBranchMatchedException();
        }
        e.a aVar = (e.a) eVar2;
        if (aVar instanceof e.a.b) {
            return jnt.a(jntVar2, null, null, null, 13);
        }
        if (aVar instanceof e.a.C1084a) {
            return jnt.a(jntVar2, null, new i.a(), null, 13);
        }
        if (!(aVar instanceof e.a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        e.a.c cVar = (e.a.c) aVar;
        return jnt.a(jntVar2, cVar.b, null, cVar.c, 4);
    }

    @Override // xsna.dm50
    public final j d() {
        return new j(e(new wq3(28)), e(new c4r(6)), e(f.b));
    }

    @Override // xsna.dm50
    public final void h(jnt jntVar, j jVar) {
        jnt jntVar2 = jntVar;
        j jVar2 = jVar;
        f(jVar2.a, jntVar2);
        f(jVar2.c, jntVar2);
        f(jVar2.b, jntVar2);
    }
}
