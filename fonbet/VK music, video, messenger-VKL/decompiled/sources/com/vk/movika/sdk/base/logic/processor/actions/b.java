package com.vk.movika.sdk.base.logic.processor.actions;

import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.j5g;
import xsna.msy;
import xsna.rl3;

/* loaded from: classes3.dex */
public final class b extends j<com.vk.movika.sdk.base.model.actions.c> {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.base.logic.processor.actions.j
    public final List<com.vk.movika.sdk.base.logic.processor.e> b(j.a<com.vk.movika.sdk.base.model.actions.c> aVar) {
        com.vk.movika.sdk.base.logic.e eVar = aVar.a;
        ArrayList a2 = com.vk.movika.sdk.base.utils.a.a(eVar.e);
        ArrayList d = com.vk.movika.sdk.base.logic.processor.actions.a.d(eVar, aVar.d);
        Lazy a3 = msy.a(LazyThreadSafetyMode.NONE, new d(aVar, 0));
        if (!a2.containsAll(com.vk.movika.sdk.utils.b.a(d, new PropertyReference1Impl() { // from class: com.vk.movika.sdk.base.logic.processor.actions.b.a
            @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
            public final Object get(Object obj) {
                return ((com.vk.movika.sdk.base.model.f) obj).a;
            }
        })) || !com.vk.movika.sdk.base.logic.processor.actions.openuri.d.b(d)) {
            return (((Boolean) a3.getValue()).booleanValue() && j5g.P(a2, com.vk.movika.sdk.base.logic.processor.actions.a.a(aVar.c))) ? EmptyList.b : Collections.singletonList(e.C1304e.a);
        }
        e.i iVar = new e.i(EmptySet.b);
        com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) aVar.i.getValue();
        e.c cVar = null;
        if (fVar != null) {
            Chapter chapter = (Chapter) aVar.h.getValue();
            com.vk.movika.sdk.base.model.h a4 = chapter != null ? com.vk.movika.sdk.base.utils.e.a(fVar.a, chapter.c) : null;
            if (a4 != null) {
                cVar = new e.c(Collections.singleton(a4.a));
            }
        }
        return rl3.I(new com.vk.movika.sdk.base.logic.processor.e[]{iVar, e.g.a, cVar});
    }
}
