package com.vk.movika.sdk.base.logic.processor.actions;

import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.logic.processor.e;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.j5g;
import xsna.rl3;

/* loaded from: classes3.dex */
public final class c extends j<com.vk.movika.sdk.base.model.actions.b> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.movika.sdk.base.logic.processor.actions.j
    public final List<com.vk.movika.sdk.base.logic.processor.e> b(j.a<com.vk.movika.sdk.base.model.actions.b> aVar) {
        com.vk.movika.sdk.base.logic.e eVar = aVar.a;
        Set S0 = j5g.S0(com.vk.movika.sdk.base.utils.a.a(eVar.e));
        List<String> list = eVar.c;
        com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) aVar.i.getValue();
        Object obj = null;
        if (fVar != null) {
            String str = fVar.a;
            e.b bVar = new e.b(Collections.singleton(new com.vk.movika.sdk.base.model.d(fVar)));
            e.j jVar = (com.vk.movika.sdk.base.utils.d.c(fVar) ? aVar : null) != null ? new e.j(Collections.singleton(str)) : null;
            e.f fVar2 = new e.f(Collections.singleton(str));
            if ((j5g.s0(j5g.t0(list, S0), str).isEmpty() ? aVar : null) != null) {
                Chapter chapter = (Chapter) aVar.h.getValue();
                com.vk.movika.sdk.base.model.h a = chapter != null ? com.vk.movika.sdk.base.utils.e.a(str, chapter.c) : null;
                if (a != null) {
                    obj = new e.c(Collections.singleton(a.a));
                }
            }
            obj = rl3.I(new com.vk.movika.sdk.base.logic.processor.e[]{bVar, jVar, fVar2, obj});
        }
        Object obj2 = EmptyList.b;
        if (obj == null) {
            obj = obj2;
        }
        return j5g.v0(e.g.a, (Collection) obj);
    }
}
