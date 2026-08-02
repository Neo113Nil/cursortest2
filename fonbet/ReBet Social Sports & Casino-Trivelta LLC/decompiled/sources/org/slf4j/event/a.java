package org.slf4j.event;

import Ai.e;
import java.util.Queue;
import zi.InterfaceC7015a;
import zi.InterfaceC7017c;

/* loaded from: classes5.dex */
public class a implements InterfaceC7015a {

    /* renamed from: a, reason: collision with root package name */
    public String f62204a;

    /* renamed from: b, reason: collision with root package name */
    public e f62205b;

    /* renamed from: c, reason: collision with root package name */
    public Queue f62206c;

    public a(e eVar, Queue queue) {
        this.f62205b = eVar;
        this.f62204a = eVar.getName();
        this.f62206c = queue;
    }

    @Override // zi.InterfaceC7015a
    public void a(String str) {
        d(b.WARN, null, str, null);
    }

    @Override // zi.InterfaceC7015a
    public void b(String str) {
        d(b.TRACE, null, str, null);
    }

    public final void c(b bVar, InterfaceC7017c interfaceC7017c, String str, Object[] objArr, Throwable th2) {
        d dVar = new d();
        dVar.j(System.currentTimeMillis());
        dVar.c(bVar);
        dVar.d(this.f62205b);
        dVar.e(this.f62204a);
        dVar.f(interfaceC7017c);
        dVar.g(str);
        dVar.h(Thread.currentThread().getName());
        dVar.b(objArr);
        dVar.i(th2);
        this.f62206c.add(dVar);
    }

    public final void d(b bVar, InterfaceC7017c interfaceC7017c, String str, Throwable th2) {
        c(bVar, interfaceC7017c, str, null, th2);
    }

    @Override // zi.InterfaceC7015a
    public String getName() {
        return this.f62204a;
    }
}
