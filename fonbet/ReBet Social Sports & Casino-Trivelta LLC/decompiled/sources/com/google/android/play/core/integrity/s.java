package com.google.android.play.core.integrity;

import Qa.C1521k;
import Qa.C1523m;
import Qa.InterfaceC1522l;
import android.content.Context;

/* loaded from: classes3.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    private final s f36638a = this;

    /* renamed from: b, reason: collision with root package name */
    private final Qa.o f36639b;

    /* renamed from: c, reason: collision with root package name */
    private final Qa.o f36640c;

    /* renamed from: d, reason: collision with root package name */
    private final Qa.o f36641d;

    /* renamed from: e, reason: collision with root package name */
    private final Qa.o f36642e;

    /* renamed from: f, reason: collision with root package name */
    private final Qa.o f36643f;

    public /* synthetic */ s(Context context, r rVar) {
        ad adVar;
        m mVar;
        m mVar2;
        InterfaceC1522l b10 = C1523m.b(context);
        this.f36639b = b10;
        adVar = ac.f36529a;
        Qa.o b11 = C1521k.b(adVar);
        this.f36640c = b11;
        mVar = l.f36631a;
        au auVar = new au(b10, mVar);
        this.f36641d = auVar;
        mVar2 = l.f36631a;
        Qa.o b12 = C1521k.b(new al(b10, b11, auVar, mVar2));
        this.f36642e = b12;
        this.f36643f = C1521k.b(new ab(b12));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f36643f.a();
    }
}
