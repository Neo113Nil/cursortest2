package net.time4j.format.expert;

import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class p implements InterfaceC5908d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC5908d f58029a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5908d f58030b;

    public p(InterfaceC5908d interfaceC5908d, InterfaceC5908d interfaceC5908d2) {
        this.f58029a = interfaceC5908d;
        this.f58030b = interfaceC5908d2;
    }

    @Override // oi.InterfaceC5908d
    public Object a(InterfaceC5907c interfaceC5907c) {
        return this.f58029a.c(interfaceC5907c) ? this.f58029a.a(interfaceC5907c) : this.f58030b.a(interfaceC5907c);
    }

    @Override // oi.InterfaceC5908d
    public Object b(InterfaceC5907c interfaceC5907c, Object obj) {
        return this.f58029a.c(interfaceC5907c) ? this.f58029a.a(interfaceC5907c) : this.f58030b.b(interfaceC5907c, obj);
    }

    @Override // oi.InterfaceC5908d
    public boolean c(InterfaceC5907c interfaceC5907c) {
        return this.f58029a.c(interfaceC5907c) || this.f58030b.c(interfaceC5907c);
    }
}
