package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28785a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28786b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.b f28787c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.o f28788d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.b f28789e;

    /* renamed from: f, reason: collision with root package name */
    public final F3.b f28790f;

    /* renamed from: g, reason: collision with root package name */
    public final F3.b f28791g;

    /* renamed from: h, reason: collision with root package name */
    public final F3.b f28792h;

    /* renamed from: i, reason: collision with root package name */
    public final F3.b f28793i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28794j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f28795k;

    public enum a {
        STAR(1),
        POLYGON(2);


        /* renamed from: a, reason: collision with root package name */
        public final int f28798a;

        a(int i10) {
            this.f28798a = i10;
        }

        public static a b(int i10) {
            for (a aVar : values()) {
                if (aVar.f28798a == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public k(String str, a aVar, F3.b bVar, F3.o oVar, F3.b bVar2, F3.b bVar3, F3.b bVar4, F3.b bVar5, F3.b bVar6, boolean z10, boolean z11) {
        this.f28785a = str;
        this.f28786b = aVar;
        this.f28787c = bVar;
        this.f28788d = oVar;
        this.f28789e = bVar2;
        this.f28790f = bVar3;
        this.f28791g = bVar4;
        this.f28792h = bVar5;
        this.f28793i = bVar6;
        this.f28794j = z10;
        this.f28795k = z11;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.n(k10, bVar, this);
    }

    public F3.b b() {
        return this.f28790f;
    }

    public F3.b c() {
        return this.f28792h;
    }

    public String d() {
        return this.f28785a;
    }

    public F3.b e() {
        return this.f28791g;
    }

    public F3.b f() {
        return this.f28793i;
    }

    public F3.b g() {
        return this.f28787c;
    }

    public F3.o h() {
        return this.f28788d;
    }

    public F3.b i() {
        return this.f28789e;
    }

    public a j() {
        return this.f28786b;
    }

    public boolean k() {
        return this.f28794j;
    }

    public boolean l() {
        return this.f28795k;
    }
}
