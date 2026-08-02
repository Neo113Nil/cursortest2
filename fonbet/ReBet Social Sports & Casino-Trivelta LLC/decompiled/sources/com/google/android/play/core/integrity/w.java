package com.google.android.play.core.integrity;

import Qa.C1521k;
import Qa.C1523m;
import Qa.InterfaceC1522l;
import android.content.Context;

/* loaded from: classes3.dex */
final class w implements aw {

    /* renamed from: a, reason: collision with root package name */
    private final w f36645a = this;

    /* renamed from: b, reason: collision with root package name */
    private final Qa.o f36646b;

    /* renamed from: c, reason: collision with root package name */
    private final Qa.o f36647c;

    /* renamed from: d, reason: collision with root package name */
    private final Qa.o f36648d;

    /* renamed from: e, reason: collision with root package name */
    private final Qa.o f36649e;

    /* renamed from: f, reason: collision with root package name */
    private final Qa.o f36650f;

    /* renamed from: g, reason: collision with root package name */
    private final Qa.o f36651g;

    public /* synthetic */ w(Context context, v vVar) {
        bc bcVar;
        o oVar;
        o oVar2;
        InterfaceC1522l b10 = C1523m.b(context);
        this.f36646b = b10;
        bcVar = bb.f36582a;
        Qa.o b11 = C1521k.b(bcVar);
        this.f36647c = b11;
        oVar = n.f36636a;
        au auVar = new au(b10, oVar);
        this.f36648d = auVar;
        oVar2 = n.f36636a;
        Qa.o b12 = C1521k.b(new bp(b10, b11, auVar, oVar2));
        this.f36649e = b12;
        Qa.o b13 = C1521k.b(new bu(b12));
        this.f36650f = b13;
        this.f36651g = C1521k.b(new ba(b12, b13));
    }

    @Override // com.google.android.play.core.integrity.aw
    public final StandardIntegrityManager a() {
        return (StandardIntegrityManager) this.f36651g.a();
    }
}
