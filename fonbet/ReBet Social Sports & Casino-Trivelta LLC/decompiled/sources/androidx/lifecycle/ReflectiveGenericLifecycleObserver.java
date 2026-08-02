package androidx.lifecycle;

import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.C2179d;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC2191p {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20311a;

    /* renamed from: b, reason: collision with root package name */
    public final C2179d.a f20312b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f20311a = obj;
        this.f20312b = C2179d.f20376c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC2191p
    public void k(InterfaceC2193s interfaceC2193s, AbstractC2185j.a aVar) {
        this.f20312b.a(interfaceC2193s, aVar, this.f20311a);
    }
}
