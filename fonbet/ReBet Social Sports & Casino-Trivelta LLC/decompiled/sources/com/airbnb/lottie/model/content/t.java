package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.K;

/* loaded from: classes.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f28843a;

    /* renamed from: b, reason: collision with root package name */
    public final a f28844b;

    /* renamed from: c, reason: collision with root package name */
    public final F3.b f28845c;

    /* renamed from: d, reason: collision with root package name */
    public final F3.b f28846d;

    /* renamed from: e, reason: collision with root package name */
    public final F3.b f28847e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28848f;

    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a b(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, F3.b bVar, F3.b bVar2, F3.b bVar3, boolean z10) {
        this.f28843a = str;
        this.f28844b = aVar;
        this.f28845c = bVar;
        this.f28846d = bVar2;
        this.f28847e = bVar3;
        this.f28848f = z10;
    }

    @Override // com.airbnb.lottie.model.content.c
    public com.airbnb.lottie.animation.content.c a(K k10, C2940j c2940j, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.animation.content.u(bVar, this);
    }

    public F3.b b() {
        return this.f28846d;
    }

    public String c() {
        return this.f28843a;
    }

    public F3.b d() {
        return this.f28847e;
    }

    public F3.b e() {
        return this.f28845c;
    }

    public a f() {
        return this.f28844b;
    }

    public boolean g() {
        return this.f28848f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f28845c + ", end: " + this.f28846d + ", offset: " + this.f28847e + "}";
    }
}
