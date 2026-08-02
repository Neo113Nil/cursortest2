package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class l implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28799a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.o f28800b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.o f28801c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.b f28802d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28803e;

    public l(String str, F3.o oVar, F3.o oVar2, F3.b bVar, boolean z10) {
        this.f28799a = str;
        this.f28800b = oVar;
        this.f28801c = oVar2;
        this.f28802d = bVar;
        this.f28803e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.o(k10, bVar, this);
    }

    public F3.b b() {
        return this.f28802d;
    }

    public String c() {
        return this.f28799a;
    }

    public F3.o d() {
        return this.f28800b;
    }

    public F3.o e() {
        return this.f28801c;
    }

    public boolean f() {
        return this.f28803e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f28800b + ", size=" + this.f28801c + '}';
    }
}
