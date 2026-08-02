package Og;

import ah.C2027t;
import ah.InterfaceC2019k;
import ah.P;
import ch.InterfaceC2925b;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Wg.b {

    /* renamed from: a, reason: collision with root package name */
    public final e f8651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Wg.b f8652b;

    public f(e call, Wg.b origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f8651a = call;
        this.f8652b = origin;
    }

    @Override // ah.InterfaceC2025q
    public InterfaceC2019k a() {
        return this.f8652b.a();
    }

    @Override // Wg.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e r() {
        return this.f8651a;
    }

    @Override // Wg.b
    public InterfaceC2925b getAttributes() {
        return this.f8652b.getAttributes();
    }

    @Override // Wg.b, Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f8652b.getCoroutineContext();
    }

    @Override // Wg.b
    public C2027t getMethod() {
        return this.f8652b.getMethod();
    }

    @Override // Wg.b
    public P getUrl() {
        return this.f8652b.getUrl();
    }
}
