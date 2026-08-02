package com.vk.photo.editor.features.filter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.photo.editor.features.filter.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.izi0;
import xsna.xcr;

/* compiled from: VisibleFiltersTracker.kt */
/* loaded from: classes4.dex */
public final class f {
    public final d a;
    public final LinearLayoutManager b;
    public final a c;
    public final xcr d;
    public c e;
    public Object f = EmptySet.b;

    /* compiled from: VisibleFiltersTracker.kt */
    public interface a {
        void c(FilterUiModel filterUiModel);

        void d(FilterUiModel filterUiModel);
    }

    /* compiled from: VisibleFiltersTracker.kt */
    public static final class b {
        public final FilterUiModel a;

        public b(FilterUiModel filterUiModel) {
            this.a = filterUiModel;
        }

        public final boolean equals(Object obj) {
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar == null) {
                return false;
            }
            return epx.f(this.a.a, bVar.a.a);
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    }

    /* compiled from: VisibleFiltersTracker.kt */
    public final class c extends RecyclerView.t {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            f.this.a();
        }
    }

    public f(d dVar, LinearLayoutManager linearLayoutManager, a aVar, xcr xcrVar) {
        this.a = dVar;
        this.b = linearLayoutManager;
        this.c = aVar;
        this.d = xcrVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    public final void a() {
        xcr xcrVar;
        HashSet hashSet = new HashSet();
        LinearLayoutManager linearLayoutManager = this.b;
        int v = linearLayoutManager.v();
        int x = linearLayoutManager.x();
        if (v <= x) {
            while (true) {
                com.vk.photo.editor.features.filter.a x0 = this.a.x0(v);
                a.C1457a c1457a = x0 instanceof a.C1457a ? (a.C1457a) x0 : null;
                if (c1457a != null) {
                    hashSet.add(new b(c1457a.a));
                }
                if (v == x) {
                    break;
                } else {
                    v++;
                }
            }
        }
        Set g = izi0.g(hashSet, (Iterable) this.f);
        Set<b> g2 = izi0.g(this.f, hashSet);
        Iterator it = g.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            xcrVar = this.d;
            if (!hasNext) {
                break;
            }
            final b bVar = (b) it.next();
            xcrVar.o(new RecyclerView.l.a() { // from class: xsna.j5u0
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    com.vk.photo.editor.features.filter.f.this.c.d(bVar.a);
                }
            });
        }
        for (final b bVar2 : g2) {
            xcrVar.o(new RecyclerView.l.a() { // from class: xsna.k5u0
                @Override // androidx.recyclerview.widget.RecyclerView.l.a
                public final void a() {
                    com.vk.photo.editor.features.filter.f.this.c.c(bVar2.a);
                }
            });
        }
        this.f = hashSet;
    }
}
