package com.google.android.play.core.integrity;

import Qa.G;
import Qa.InterfaceC1522l;
import android.content.Context;

/* loaded from: classes3.dex */
public final class bp implements InterfaceC1522l {

    /* renamed from: a, reason: collision with root package name */
    private final Qa.o f36615a;

    /* renamed from: b, reason: collision with root package name */
    private final Qa.o f36616b;

    /* renamed from: c, reason: collision with root package name */
    private final Qa.o f36617c;

    /* renamed from: d, reason: collision with root package name */
    private final Qa.o f36618d;

    public bp(Qa.o oVar, Qa.o oVar2, Qa.o oVar3, Qa.o oVar4) {
        this.f36615a = oVar;
        this.f36616b = oVar2;
        this.f36617c = oVar3;
        this.f36618d = oVar4;
    }

    @Override // Qa.o
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.f36615a.a(), (G) this.f36616b.a(), ((au) this.f36617c).a(), new j());
    }
}
