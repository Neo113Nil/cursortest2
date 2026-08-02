package io.sentry;

import io.sentry.C7209u1;
import m3.r;
import u3.InterfaceC9928b;

/* loaded from: classes10.dex */
public final /* synthetic */ class d3 implements C7209u1.c, r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f67858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f67859b;

    public /* synthetic */ d3(Object obj, Object obj2) {
        this.f67858a = obj;
        this.f67859b = obj2;
    }

    @Override // io.sentry.C7209u1.c
    public void a(InterfaceC7142f0 interfaceC7142f0) {
        e3 e3Var = (e3) this.f67858a;
        e3Var.getClass();
        if (interfaceC7142f0 == e3Var) {
            ((U) this.f67859b).v();
        }
    }

    @Override // m3.r.a
    public void invoke(Object obj) {
        ((InterfaceC9928b) obj).onPlayerError((InterfaceC9928b.a) this.f67858a, (j3.w) this.f67859b);
    }
}
