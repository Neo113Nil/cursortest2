package k5;

import android.content.Context;

/* renamed from: k5.d0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7504d0 implements Jb.e<InterfaceC7505d1> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f70725a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<R0> f70726b;

    public C7504d0(Pc.a<Context> aVar, Pc.a<R0> aVar2) {
        this.f70725a = aVar;
        this.f70726b = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        this.f70725a.get();
        this.f70726b.get();
        return new J2();
    }
}
