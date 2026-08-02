package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28814a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f28815b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28816c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.a f28817d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.d f28818e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28819f;

    public p(String str, boolean z10, Path.FillType fillType, F3.a aVar, F3.d dVar, boolean z11) {
        this.f28816c = str;
        this.f28814a = z10;
        this.f28815b = fillType;
        this.f28817d = aVar;
        this.f28818e = dVar;
        this.f28819f = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.g(k10, bVar, this);
    }

    public F3.a b() {
        return this.f28817d;
    }

    public Path.FillType c() {
        return this.f28815b;
    }

    public String d() {
        return this.f28816c;
    }

    public F3.d e() {
        return this.f28818e;
    }

    public boolean f() {
        return this.f28819f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f28814a + '}';
    }
}
