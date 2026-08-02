package com.airbnb.lottie.animation.content;

import B3.a;
import com.airbnb.lottie.model.content.t;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28669a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28670b;

    /* renamed from: c, reason: collision with root package name */
    public final List f28671c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final t.a f28672d;

    /* renamed from: e, reason: collision with root package name */
    public final B3.a f28673e;

    /* renamed from: f, reason: collision with root package name */
    public final B3.a f28674f;

    /* renamed from: g, reason: collision with root package name */
    public final B3.a f28675g;

    public u(com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.t tVar) {
        this.f28669a = tVar.c();
        this.f28670b = tVar.g();
        this.f28672d = tVar.f();
        B3.d a10 = tVar.e().a();
        this.f28673e = a10;
        B3.d a11 = tVar.b().a();
        this.f28674f = a11;
        B3.d a12 = tVar.d().a();
        this.f28675g = a12;
        bVar.j(a10);
        bVar.j(a11);
        bVar.j(a12);
        a10.a(this);
        a11.a(this);
        a12.a(this);
    }

    @Override // B3.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f28671c.size(); i10++) {
            ((a.b) this.f28671c.get(i10)).a();
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public void b(List list, List list2) {
    }

    public void e(a.b bVar) {
        this.f28671c.add(bVar);
    }

    public B3.a g() {
        return this.f28674f;
    }

    public B3.a i() {
        return this.f28675g;
    }

    public B3.a j() {
        return this.f28673e;
    }

    public t.a k() {
        return this.f28672d;
    }

    public boolean m() {
        return this.f28670b;
    }
}
