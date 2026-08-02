package com.vk.movika.sdk.base.hooks;

import com.vk.movika.sdk.base.e;
import com.vk.movika.sdk.base.hooks.a;
import com.vk.movika.sdk.base.model.Chapter;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.epx;

/* loaded from: classes3.dex */
public final class q implements com.vk.movika.sdk.common.c {
    public static final a Companion = new a();
    public final long b;
    public Object c;
    public com.vk.movika.sdk.base.e d;
    public final com.vk.movika.sdk.base.hooks.a e;
    public final j f;
    public final k g;
    public final l h;
    public final m i;
    public final n j;
    public final o k;
    public b l;

    public static final class a {
    }

    public static final class b {
        public final com.vk.movika.sdk.base.b a;
        public final com.vk.movika.sdk.base.a b;
        public final com.vk.movika.sdk.player.base.observable.a c;

        public b(com.vk.movika.sdk.base.b bVar, com.vk.movika.sdk.base.a aVar, com.vk.movika.sdk.player.base.observable.a aVar2) {
            this.a = bVar;
            this.b = aVar;
            this.c = aVar2;
        }
    }

    public q() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.lang.Object] */
    public final void a(boolean z) {
        b bVar = this.l;
        com.vk.movika.sdk.base.e b2 = bVar != null ? bVar.a.b(Long.valueOf(this.b)) : this.d;
        if (z && epx.f(this.d, b2)) {
            return;
        }
        this.d = b2;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((s) it.next()).d(b2);
        }
    }

    public final void b(b bVar) {
        com.vk.movika.sdk.base.hooks.a aVar = this.e;
        aVar.b(null);
        b bVar2 = this.l;
        k kVar = this.g;
        n nVar = this.j;
        m mVar = this.i;
        l lVar = this.h;
        j jVar = this.f;
        o oVar = this.k;
        if (bVar2 != null) {
            com.vk.movika.sdk.base.a aVar2 = bVar2.b;
            aVar2.e().D(oVar);
            aVar2.f().D(jVar);
            aVar2.k().D(lVar);
            aVar2.o().D(mVar);
            aVar2.j().D(nVar);
            bVar2.c.f(kVar);
            aVar.b(null);
        }
        this.l = bVar;
        if (bVar != null) {
            com.vk.movika.sdk.base.a aVar3 = bVar.b;
            aVar3.e().y(oVar);
            aVar3.f().y(jVar);
            aVar3.k().y(lVar);
            aVar3.o().y(mVar);
            aVar3.j().y(nVar);
            bVar.c.e(kVar);
            aVar.b(new a.b(bVar.a, aVar3));
            a(false);
        }
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        this.c = EmptyList.b;
        b(null);
        this.e.destroy();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.movika.sdk.base.hooks.j] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.vk.movika.sdk.base.hooks.l] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.vk.movika.sdk.base.hooks.m] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.vk.movika.sdk.base.hooks.n] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.vk.movika.sdk.base.hooks.o] */
    public q(int i) {
        this.b = 3000L;
        this.c = EmptyList.b;
        this.d = e.f.a;
        com.vk.movika.sdk.base.hooks.a aVar = new com.vk.movika.sdk.base.hooks.a();
        this.e = aVar;
        this.f = new com.vk.movika.sdk.base.listener.d() { // from class: com.vk.movika.sdk.base.hooks.j
            @Override // com.vk.movika.sdk.base.listener.d
            public final void j(Chapter chapter) {
                q.this.a(true);
            }
        };
        int i2 = 0;
        this.g = new k(this, i2);
        this.h = new com.vk.movika.sdk.base.listener.c() { // from class: com.vk.movika.sdk.base.hooks.l
            @Override // com.vk.movika.sdk.base.listener.c
            public final void l(com.vk.movika.sdk.base.model.f fVar) {
                if (com.vk.movika.sdk.base.utils.d.c(fVar)) {
                    q.this.a(true);
                }
            }
        };
        this.i = new com.vk.movika.sdk.base.listener.b() { // from class: com.vk.movika.sdk.base.hooks.m
            @Override // com.vk.movika.sdk.base.listener.b
            public final void x(com.vk.movika.sdk.base.model.f fVar) {
                if (com.vk.movika.sdk.base.utils.d.c(fVar)) {
                    q.this.a(true);
                }
            }
        };
        this.j = new com.vk.movika.sdk.base.listener.k() { // from class: com.vk.movika.sdk.base.hooks.n
            @Override // com.vk.movika.sdk.base.listener.k
            public final void u(com.vk.movika.sdk.base.model.o oVar) {
                q.this.a(true);
            }
        };
        this.k = new com.vk.movika.sdk.base.listener.i() { // from class: com.vk.movika.sdk.base.hooks.o
            @Override // com.vk.movika.sdk.base.listener.i
            public final void onStart() {
                q.this.a(false);
            }
        };
        aVar.b = new p(this, i2);
    }
}
