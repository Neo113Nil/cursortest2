package com.bumptech.glide;

import X5.i;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import com.bumptech.glide.c;
import com.bumptech.glide.g;
import i6.p;
import j6.AbstractC7287a;
import j6.InterfaceC7288b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private V5.l f57554c;

    /* renamed from: d, reason: collision with root package name */
    private W5.d f57555d;

    /* renamed from: e, reason: collision with root package name */
    private W5.i f57556e;

    /* renamed from: f, reason: collision with root package name */
    private X5.h f57557f;

    /* renamed from: g, reason: collision with root package name */
    private Y5.a f57558g;

    /* renamed from: h, reason: collision with root package name */
    private Y5.a f57559h;

    /* renamed from: i, reason: collision with root package name */
    private X5.g f57560i;

    /* renamed from: j, reason: collision with root package name */
    private X5.i f57561j;

    /* renamed from: k, reason: collision with root package name */
    private i6.e f57562k;

    /* renamed from: n, reason: collision with root package name */
    private p.b f57565n;

    /* renamed from: o, reason: collision with root package name */
    private Y5.a f57566o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57567p;

    /* renamed from: q, reason: collision with root package name */
    private List<l6.h<Object>> f57568q;

    /* renamed from: a, reason: collision with root package name */
    private final C5132a f57552a = new C5132a();

    /* renamed from: b, reason: collision with root package name */
    private final g.a f57553b = new g.a();

    /* renamed from: l, reason: collision with root package name */
    private int f57563l = 4;

    /* renamed from: m, reason: collision with root package name */
    private c.a f57564m = new a();

    final class a implements c.a {
        @Override // com.bumptech.glide.c.a
        @NonNull
        public final l6.i build() {
            return new l6.i();
        }
    }

    static final class b {
        b() {
        }
    }

    public static final class c {
    }

    @NonNull
    final com.bumptech.glide.c a(@NonNull Context context, List<InterfaceC7288b> list, AbstractC7287a abstractC7287a) {
        if (this.f57558g == null) {
            this.f57558g = Y5.a.c();
        }
        if (this.f57559h == null) {
            this.f57559h = Y5.a.b();
        }
        if (this.f57566o == null) {
            this.f57566o = Y5.a.a();
        }
        if (this.f57561j == null) {
            this.f57561j = new i.a(context).a();
        }
        if (this.f57562k == null) {
            this.f57562k = new i6.e();
        }
        if (this.f57555d == null) {
            int b11 = this.f57561j.b();
            if (b11 > 0) {
                this.f57555d = new W5.j(b11);
            } else {
                this.f57555d = new W5.e();
            }
        }
        if (this.f57556e == null) {
            this.f57556e = new W5.i(this.f57561j.a());
        }
        if (this.f57557f == null) {
            this.f57557f = new X5.h(this.f57561j.c());
        }
        if (this.f57560i == null) {
            this.f57560i = new X5.g(262144000L, context);
        }
        if (this.f57554c == null) {
            this.f57554c = new V5.l(this.f57557f, this.f57560i, this.f57559h, this.f57558g, Y5.a.d(), this.f57566o, this.f57567p);
        }
        List<l6.h<Object>> list2 = this.f57568q;
        if (list2 == null) {
            this.f57568q = Collections.EMPTY_LIST;
        } else {
            this.f57568q = Collections.unmodifiableList(list2);
        }
        g.a aVar = this.f57553b;
        aVar.getClass();
        g gVar = new g(aVar);
        return new com.bumptech.glide.c(context, this.f57554c, this.f57557f, this.f57555d, this.f57556e, new p(this.f57565n), this.f57562k, this.f57563l, this.f57564m, this.f57552a, this.f57568q, list, abstractC7287a, gVar);
    }

    @NonNull
    public final void b(l6.i iVar) {
        this.f57564m = new e(iVar);
    }

    @NonNull
    public final void c(X5.g gVar) {
        this.f57560i = gVar;
    }

    @NonNull
    public final void d(boolean z11) {
        this.f57567p = z11;
    }

    @NonNull
    public final void e(X5.i iVar) {
        this.f57561j = iVar;
    }

    final void f(p.b bVar) {
        this.f57565n = bVar;
    }
}
