package com.airbnb.lottie.model.content;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f28769a;

    /* renamed from: b, reason: collision with root package name */
    public final F3.h f28770b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.d f28771c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28772d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, F3.h hVar, F3.d dVar, boolean z10) {
        this.f28769a = aVar;
        this.f28770b = hVar;
        this.f28771c = dVar;
        this.f28772d = z10;
    }

    public a a() {
        return this.f28769a;
    }

    public F3.h b() {
        return this.f28770b;
    }

    public F3.d c() {
        return this.f28771c;
    }

    public boolean d() {
        return this.f28772d;
    }
}
