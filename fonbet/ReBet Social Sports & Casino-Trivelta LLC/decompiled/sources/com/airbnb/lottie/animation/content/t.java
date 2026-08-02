package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.K;
import com.airbnb.lottie.S;

/* loaded from: classes.dex */
public class t extends a {

    /* renamed from: p, reason: collision with root package name */
    public final com.airbnb.lottie.model.layer.b f28664p;

    /* renamed from: q, reason: collision with root package name */
    public final String f28665q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f28666r;

    /* renamed from: s, reason: collision with root package name */
    public final B3.a f28667s;

    /* renamed from: t, reason: collision with root package name */
    public B3.a f28668t;

    public t(K k10, com.airbnb.lottie.model.layer.b bVar, com.airbnb.lottie.model.content.s sVar) {
        super(k10, bVar, sVar.b().b(), sVar.e().b(), sVar.g(), sVar.i(), sVar.j(), sVar.f(), sVar.d());
        this.f28664p = bVar;
        this.f28665q = sVar.h();
        this.f28666r = sVar.k();
        B3.a a10 = sVar.c().a();
        this.f28667s = a10;
        a10.a(this);
        bVar.j(a10);
    }

    @Override // com.airbnb.lottie.animation.content.a, com.airbnb.lottie.animation.content.e
    public void d(Canvas canvas, Matrix matrix, int i10, com.airbnb.lottie.utils.d dVar) {
        if (this.f28666r) {
            return;
        }
        this.f28535h.setColor(((B3.b) this.f28667s).r());
        B3.a aVar = this.f28668t;
        if (aVar != null) {
            this.f28535h.setColorFilter((ColorFilter) aVar.h());
        }
        super.d(canvas, matrix, i10, dVar);
    }

    @Override // com.airbnb.lottie.animation.content.a, E3.f
    public void e(Object obj, G3.c cVar) {
        super.e(obj, cVar);
        if (obj == S.f28459b) {
            this.f28667s.o(cVar);
            return;
        }
        if (obj == S.f28453N) {
            B3.a aVar = this.f28668t;
            if (aVar != null) {
                this.f28664p.I(aVar);
            }
            if (cVar == null) {
                this.f28668t = null;
                return;
            }
            B3.t tVar = new B3.t(cVar);
            this.f28668t = tVar;
            tVar.a(this);
            this.f28664p.j(this.f28667s);
        }
    }

    @Override // com.airbnb.lottie.animation.content.c
    public String getName() {
        return this.f28665q;
    }
}
