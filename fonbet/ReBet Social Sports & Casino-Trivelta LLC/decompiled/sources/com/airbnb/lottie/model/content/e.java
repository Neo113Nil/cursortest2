package com.airbnb.lottie.model.content;

import android.graphics.Path;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final g f28726a;

    /* renamed from: b, reason: collision with root package name */
    public final Path.FillType f28727b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.c f28728c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.d f28729d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.f f28730e;

    /* renamed from: f, reason: collision with root package name */
    public final F3.f f28731f;

    /* renamed from: g, reason: collision with root package name */
    public final String f28732g;

    /* renamed from: h, reason: collision with root package name */
    public final F3.b f28733h;

    /* renamed from: i, reason: collision with root package name */
    public final F3.b f28734i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28735j;

    public e(String str, g gVar, Path.FillType fillType, F3.c cVar, F3.d dVar, F3.f fVar, F3.f fVar2, F3.b bVar, F3.b bVar2, boolean z10) {
        this.f28726a = gVar;
        this.f28727b = fillType;
        this.f28728c = cVar;
        this.f28729d = dVar;
        this.f28730e = fVar;
        this.f28731f = fVar2;
        this.f28732g = str;
        this.f28733h = bVar;
        this.f28734i = bVar2;
        this.f28735j = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.h(k10, c2940j, bVar, this);
    }

    public F3.f b() {
        return this.f28731f;
    }

    public Path.FillType c() {
        return this.f28727b;
    }

    public F3.c d() {
        return this.f28728c;
    }

    public g e() {
        return this.f28726a;
    }

    public String f() {
        return this.f28732g;
    }

    public F3.d g() {
        return this.f28729d;
    }

    public F3.f h() {
        return this.f28730e;
    }

    public boolean i() {
        return this.f28735j;
    }
}
