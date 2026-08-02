package com.vk.superapp.miniapps.impl;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.EmptySet;
import xsna.ay1;
import xsna.j5g;
import xsna.jgp;

/* compiled from: AppsCatalogAnalytics.kt */
/* loaded from: classes6.dex */
public final class a implements ay1 {
    public C1885a a;

    /* compiled from: AppsCatalogAnalytics.kt */
    /* renamed from: com.vk.superapp.miniapps.impl.a$a, reason: collision with other inner class name */
    public static final class C1885a {
        public final RecyclerView a;
        public Integer c;
        public int b = -1;
        public Boolean d = Boolean.FALSE;
        public Set<String> e = EmptySet.b;
        public Object f = jgp.b;

        public C1885a(RecyclerView recyclerView) {
            this.a = recyclerView;
        }
    }

    @Override // xsna.ay1
    public final void a(Integer num, String str, boolean z) {
        C1885a c1885a = this.a;
        if (c1885a != null) {
            c1885a.b = j5g.c0(c1885a.e, str);
            c1885a.c = num;
            c1885a.d = Boolean.valueOf(z);
        }
    }

    @Override // xsna.ay1
    public final void b() {
        this.a = null;
    }

    @Override // xsna.ay1
    public final void c(RecyclerView recyclerView) {
        this.a = new C1885a(recyclerView);
    }

    @Override // xsna.ay1
    public final void d(Set<String> set) {
        C1885a c1885a = this.a;
        if (c1885a != null) {
            c1885a.e = set;
        }
    }

    @Override // xsna.ay1
    public final void e(LinkedHashMap linkedHashMap) {
        C1885a c1885a = this.a;
        if (c1885a != null) {
            c1885a.f = linkedHashMap;
        }
    }
}
