package Ug;

import ah.C2027t;
import ah.InterfaceC2019k;
import ah.P;
import ch.InterfaceC2925b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements Wg.b {

    /* renamed from: a, reason: collision with root package name */
    public final Og.b f12245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wg.b f12246b;

    public c(Og.b call, Wg.b origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f12245a = call;
        this.f12246b = origin;
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f12246b.a();
    }

    @Override // Wg.b
    public InterfaceC2925b getAttributes() {
        return this.f12246b.getAttributes();
    }

    @Override // Wg.b, Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f12246b.getCoroutineContext();
    }

    @Override // Wg.b
    public C2027t getMethod() {
        return this.f12246b.getMethod();
    }

    @Override // Wg.b
    public P getUrl() {
        return this.f12246b.getUrl();
    }

    @Override // Wg.b
    public Og.b r() {
        return this.f12245a;
    }
}
