package com.facebook.drawee.backends.pipeline;

import A7.x;
import D6.n;
import android.content.res.Resources;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public Resources f30393a;

    /* renamed from: b, reason: collision with root package name */
    public V6.a f30394b;

    /* renamed from: c, reason: collision with root package name */
    public G7.a f30395c;

    /* renamed from: d, reason: collision with root package name */
    public G7.a f30396d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f30397e;

    /* renamed from: f, reason: collision with root package name */
    public x f30398f;

    /* renamed from: g, reason: collision with root package name */
    public D6.f f30399g;

    /* renamed from: h, reason: collision with root package name */
    public n f30400h;

    public void a(Resources resources, V6.a aVar, G7.a aVar2, G7.a aVar3, Executor executor, x xVar, D6.f fVar, n nVar) {
        this.f30393a = resources;
        this.f30394b = aVar;
        this.f30395c = aVar2;
        this.f30396d = aVar3;
        this.f30397e = executor;
        this.f30398f = xVar;
        this.f30399g = fVar;
        this.f30400h = nVar;
    }

    public e b(Resources resources, V6.a aVar, G7.a aVar2, G7.a aVar3, Executor executor, x xVar, D6.f fVar) {
        return new e(resources, aVar, aVar2, aVar3, executor, xVar, fVar);
    }

    public e c() {
        e b10 = b(this.f30393a, this.f30394b, this.f30395c, this.f30396d, this.f30397e, this.f30398f, this.f30399g);
        n nVar = this.f30400h;
        if (nVar != null) {
            b10.A0(((Boolean) nVar.get()).booleanValue());
        }
        return b10;
    }
}
