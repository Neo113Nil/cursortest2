package com.vk.movika.sdk.base.logic.processor.actions.setbranch;

import com.vk.movika.sdk.base.logic.processor.actions.setbranch.b;
import com.vk.movika.sdk.base.model.Chapter;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.s;
import kotlin.random.XorWowRandom;
import xsna.fpf0;
import xsna.j5g;

/* loaded from: classes3.dex */
public final class f extends b<e.f> {
    public final XorWowRandom e;

    public f(XorWowRandom xorWowRandom, com.vk.ecomm.catalog.impl.geo.a aVar, com.vk.movika.sdk.base.logic.interactor.a aVar2, boolean z) {
        super(fpf0.a(e.f.class), aVar, aVar2, z);
        this.e = xorWowRandom;
    }

    @Override // com.vk.movika.sdk.base.logic.processor.actions.setbranch.b
    public final b.a c(com.vk.movika.sdk.base.logic.e eVar, e.f fVar, s sVar) {
        com.vk.movika.sdk.base.model.a aVar;
        e.f fVar2 = fVar;
        Chapter a = sVar.a(eVar.b);
        if (a == null || (aVar = (com.vk.movika.sdk.base.model.a) j5g.x0(a.e, this.e)) == null) {
            return null;
        }
        return new b.a(aVar, fVar2.a);
    }
}
