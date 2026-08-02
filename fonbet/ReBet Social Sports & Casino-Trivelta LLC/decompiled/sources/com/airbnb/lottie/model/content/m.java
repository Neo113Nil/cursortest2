package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28804a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.b f28805b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.b f28806c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.n f28807d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28808e;

    public m(String str, F3.b bVar, F3.b bVar2, F3.n nVar, boolean z10) {
        this.f28804a = str;
        this.f28805b = bVar;
        this.f28806c = bVar2;
        this.f28807d = nVar;
        this.f28808e = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.p(k10, bVar, this);
    }

    public F3.b b() {
        return this.f28805b;
    }

    public String c() {
        return this.f28804a;
    }

    public F3.b d() {
        return this.f28806c;
    }

    public F3.n e() {
        return this.f28807d;
    }

    public boolean f() {
        return this.f28808e;
    }
}
