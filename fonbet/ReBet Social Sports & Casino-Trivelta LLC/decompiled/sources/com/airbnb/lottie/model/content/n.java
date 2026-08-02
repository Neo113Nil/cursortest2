package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class n implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28809a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.o f28810b;

    public n(String str, F3.o oVar) {
        this.f28809a = str;
        this.f28810b = oVar;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.q(k10, bVar, this);
    }

    public F3.o b() {
        return this.f28810b;
    }

    public String c() {
        return this.f28809a;
    }
}
