package com.google.firebase.encoders.proto;

import qb.C6135c;

/* loaded from: classes3.dex */
public class i implements qb.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f37784a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f37785b = false;

    /* renamed from: c, reason: collision with root package name */
    public qb.d f37786c;

    /* renamed from: d, reason: collision with root package name */
    public final f f37787d;

    public i(f fVar) {
        this.f37787d = fVar;
    }

    public final void a() {
        if (this.f37784a) {
            throw new C6135c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f37784a = true;
    }

    @Override // qb.h
    public qb.h add(String str) {
        a();
        this.f37787d.l(this.f37786c, str, this.f37785b);
        return this;
    }

    public void b(qb.d dVar, boolean z10) {
        this.f37784a = false;
        this.f37786c = dVar;
        this.f37785b = z10;
    }

    @Override // qb.h
    public qb.h d(boolean z10) {
        a();
        this.f37787d.i(this.f37786c, z10, this.f37785b);
        return this;
    }
}
