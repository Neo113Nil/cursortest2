package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class r implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28823a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28824b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.h f28825c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28826d;

    public r(String str, int i10, F3.h hVar, boolean z10) {
        this.f28823a = str;
        this.f28824b = i10;
        this.f28825c = hVar;
        this.f28826d = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.r(k10, bVar, this);
    }

    public String b() {
        return this.f28823a;
    }

    public F3.h c() {
        return this.f28825c;
    }

    public boolean d() {
        return this.f28826d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f28823a + ", index=" + this.f28824b + '}';
    }
}
