package com.vk.movika.sdk.base.hooks;

import com.vk.movika.sdk.base.model.Chapter;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.epx;
import xsna.msy;
import xsna.swe0;

/* loaded from: classes3.dex */
public final class a implements com.vk.movika.sdk.common.c {
    public p b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public b g;

    /* renamed from: com.vk.movika.sdk.base.hooks.a$a, reason: collision with other inner class name */
    public final class C1293a implements com.vk.movika.sdk.base.listener.d {
        public C1293a() {
        }

        @Override // com.vk.movika.sdk.base.listener.d
        public final void j(Chapter chapter) {
            Object obj;
            Iterator it = chapter.d.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long j = ((com.vk.movika.sdk.base.model.f) next).c;
                    do {
                        Object next2 = it.next();
                        long j2 = ((com.vk.movika.sdk.base.model.f) next2).c;
                        if (j > j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            com.vk.movika.sdk.base.model.f fVar = (com.vk.movika.sdk.base.model.f) obj;
            if (fVar == null) {
                return;
            }
            a.a(a.this, fVar, 0L);
        }
    }

    public static final class b {
        public final com.vk.movika.sdk.base.b a;
        public final com.vk.movika.sdk.base.a b;

        public b(com.vk.movika.sdk.base.b bVar, com.vk.movika.sdk.base.a aVar) {
            this.a = bVar;
            this.b = aVar;
        }
    }

    public final class c implements com.vk.movika.sdk.base.listener.b {
        public c() {
        }

        @Override // com.vk.movika.sdk.base.listener.b
        public final void x(com.vk.movika.sdk.base.model.f fVar) {
            Chapter d;
            com.vk.movika.sdk.base.model.f d2;
            List<com.vk.movika.sdk.base.model.f> a;
            Long l = fVar.d;
            if (l != null) {
                long longValue = l.longValue();
                a aVar = a.this;
                b bVar = aVar.g;
                if (bVar == null || (d = bVar.a.d()) == null) {
                    return;
                }
                b bVar2 = aVar.g;
                if ((bVar2 == null || (a = bVar2.a.a()) == null || !(!a.isEmpty())) && (d2 = com.vk.movika.sdk.base.utils.d.d(d, longValue)) != null) {
                    b bVar3 = aVar.g;
                    a.a(aVar, d2, bVar3 != null ? bVar3.a.g() : 0L);
                }
            }
        }
    }

    public static final class d {
        public final com.vk.movika.sdk.base.model.f a;

        public d(com.vk.movika.sdk.base.model.f fVar) {
            this.a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "InteractiveEventNixTimePoint(event=" + this.a + ")";
        }
    }

    public final class e implements com.vk.movika.sdk.base.listener.n {
        public e() {
        }

        @Override // com.vk.movika.sdk.base.listener.n
        public final void b(long j) {
            Chapter d;
            com.vk.movika.sdk.base.model.f d2;
            a aVar = a.this;
            b bVar = aVar.g;
            if (bVar == null || (d = bVar.a.d()) == null || (d2 = com.vk.movika.sdk.base.utils.d.d(d, j)) == null) {
                return;
            }
            a.a(aVar, d2, j);
        }
    }

    public final class f implements com.vk.movika.sdk.player.base.listener.a {
        public f() {
        }

        @Override // com.vk.movika.sdk.player.base.listener.a
        public final void a(Object obj) {
            p pVar;
            if (!(obj instanceof d) || (pVar = a.this.b) == null) {
                return;
            }
            pVar.invoke(((d) obj).a);
        }
    }

    public a() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.hooks.c(0, this, c.class, "<init>", "<init>(Lcom/vk/movika/sdk/base/hooks/ContainerEventNix;)V", 0));
        this.d = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.hooks.b(0, this, C1293a.class, "<init>", "<init>(Lcom/vk/movika/sdk/base/hooks/ContainerEventNix;)V", 0));
        this.e = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.hooks.d(0, this, e.class, "<init>", "<init>(Lcom/vk/movika/sdk/base/hooks/ContainerEventNix;)V", 0));
        this.f = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.hooks.e(0, this, f.class, "<init>", "<init>(Lcom/vk/movika/sdk/base/hooks/ContainerEventNix;)V", 0));
    }

    public static final void a(a aVar, com.vk.movika.sdk.base.model.f fVar, long j) {
        aVar.getClass();
        long j2 = fVar.c;
        long i = swe0.i(j2 - 3000, j > j2 ? j2 : j, j > j2 ? j : j2);
        b bVar = aVar.g;
        if (bVar != null) {
            bVar.a.m(i, new d(fVar));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(b bVar) {
        b bVar2 = this.g;
        ?? r1 = this.f;
        ?? r2 = this.e;
        ?? r3 = this.c;
        ?? r4 = this.d;
        if (bVar2 != null) {
            com.vk.movika.sdk.base.a aVar = bVar2.b;
            aVar.f().D((C1293a) r4.getValue());
            aVar.o().D((c) r3.getValue());
            aVar.c().D((e) r2.getValue());
            bVar2.a.n((f) r1.getValue());
        }
        this.g = bVar;
        if (bVar != null) {
            com.vk.movika.sdk.base.a aVar2 = bVar.b;
            aVar2.f().y((C1293a) r4.getValue());
            aVar2.o().y((c) r3.getValue());
            aVar2.c().y((e) r2.getValue());
            bVar.a.h((f) r1.getValue());
        }
    }

    @Override // com.vk.movika.sdk.common.c
    public final void destroy() {
        this.b = null;
        b(null);
    }
}
