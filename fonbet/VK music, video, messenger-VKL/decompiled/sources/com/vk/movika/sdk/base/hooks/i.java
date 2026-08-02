package com.vk.movika.sdk.base.hooks;

import com.vk.movika.sdk.base.d;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class i implements com.vk.movika.sdk.common.c {
    public a d;
    public Object b = EmptyList.b;
    public com.vk.movika.sdk.base.d c = d.e.a;
    public final f e = new f(this, 0);
    public final g f = new com.vk.movika.sdk.base.listener.k() { // from class: com.vk.movika.sdk.base.hooks.g
        @Override // com.vk.movika.sdk.base.listener.k
        public final void u(com.vk.movika.sdk.base.model.o oVar) {
            i.this.a();
        }
    };
    public final h g = new com.vk.movika.sdk.base.listener.d() { // from class: com.vk.movika.sdk.base.hooks.h
        @Override // com.vk.movika.sdk.base.listener.d
        public final void j(Chapter chapter) {
            i.this.a();
        }
    };

    public static final class a {
        public final com.vk.movika.sdk.base.b a;
        public final com.vk.movika.sdk.base.a b;
        public final com.vk.movika.sdk.player.base.observable.a c;

        public a(com.vk.movika.sdk.base.b bVar, com.vk.movika.sdk.base.a aVar, com.vk.movika.sdk.player.base.observable.a aVar2) {
            this.a = bVar;
            this.b = aVar;
            this.c = aVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    public final void a() {
        com.vk.movika.sdk.base.d dVar;
        a aVar = this.d;
        if (aVar == null || (dVar = aVar.a.l()) == null) {
            dVar = this.c;
        }
        this.c = dVar;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((r) it.next()).b(dVar);
        }
    }

    public final void b(a aVar) {
        a aVar2 = this.d;
        f fVar = this.e;
        g gVar = this.f;
        h hVar = this.g;
        if (aVar2 != null) {
            com.vk.movika.sdk.base.a aVar3 = aVar2.b;
            aVar3.f().D(hVar);
            aVar3.j().D(gVar);
            aVar2.c.f(fVar);
        }
        this.d = aVar;
        if (aVar != null) {
            com.vk.movika.sdk.base.a aVar4 = aVar.b;
            aVar4.f().y(hVar);
            aVar4.j().y(gVar);
            aVar.c.e(fVar);
            a();
        }
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        this.b = EmptyList.b;
        b(null);
    }
}
