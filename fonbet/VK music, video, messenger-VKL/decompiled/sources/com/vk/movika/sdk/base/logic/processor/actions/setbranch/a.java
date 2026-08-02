package com.vk.movika.sdk.base.logic.processor.actions.setbranch;

import com.vk.movika.sdk.base.logic.processor.actions.setbranch.b;
import com.vk.movika.sdk.base.model.actions.e;
import com.vk.movika.sdk.base.model.s;

/* loaded from: classes3.dex */
public final class a extends b<e.b> {
    @Override // com.vk.movika.sdk.base.logic.processor.actions.setbranch.b
    public final b.a c(com.vk.movika.sdk.base.logic.e eVar, e.b bVar, s sVar) {
        e.b bVar2 = bVar;
        com.vk.movika.sdk.base.model.a aVar = (com.vk.movika.sdk.base.model.a) sVar.f.get(bVar2.a);
        if (aVar == null) {
            return null;
        }
        return new b.a(aVar, bVar2.b);
    }
}
