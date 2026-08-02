package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28721a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.o f28722b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.f f28723c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28724d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28725e;

    public b(String str, F3.o oVar, F3.f fVar, boolean z10, boolean z11) {
        this.f28721a = str;
        this.f28722b = oVar;
        this.f28723c = fVar;
        this.f28724d = z10;
        this.f28725e = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.f(k10, bVar, this);
    }

    public String b() {
        return this.f28721a;
    }

    public F3.o c() {
        return this.f28722b;
    }

    public F3.f d() {
        return this.f28723c;
    }

    public boolean e() {
        return this.f28725e;
    }

    public boolean f() {
        return this.f28724d;
    }
}
