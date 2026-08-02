package com.vk.movika.sdk.base.logic.processor;

import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.s;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.fpf0;

/* loaded from: classes3.dex */
public final class i implements g {
    public static final a Companion = new a();
    public final LinkedHashMap a;

    public static final class a {
    }

    public i(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    @Override // com.vk.movika.sdk.base.logic.processor.g
    public final List<e> a(com.vk.movika.sdk.base.logic.e eVar, com.vk.movika.sdk.base.model.actions.a aVar, k kVar, s sVar, boolean z) {
        g gVar = (g) this.a.get(fpf0.a(aVar.getClass()));
        if (gVar != null) {
            return gVar.a(eVar, aVar, kVar, sVar, z);
        }
        com.vk.movika.sdk.utils.c.c(this, "CompositeActionProcessor", null, new h(aVar, 0), 2);
        return EmptyList.b;
    }
}
