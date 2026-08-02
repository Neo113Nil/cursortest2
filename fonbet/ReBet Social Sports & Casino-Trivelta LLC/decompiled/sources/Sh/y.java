package Sh;

import Ph.InterfaceC1456i0;
import Ph.InterfaceC1465n;
import Ph.W;
import Ph.Z;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class y extends Ph.L implements Z {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z f10824b;

    /* renamed from: c, reason: collision with root package name */
    public final Ph.L f10825c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10826d;

    /* JADX WARN: Multi-variable type inference failed */
    public y(Ph.L l10, String str) {
        Z z10 = l10 instanceof Z ? (Z) l10 : null;
        this.f10824b = z10 == null ? W.a() : z10;
        this.f10825c = l10;
        this.f10826d = str;
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f10824b.J(j10, runnable, coroutineContext);
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f10825c.Y1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        this.f10825c.Z1(coroutineContext, runnable);
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext coroutineContext) {
        return this.f10825c.a2(coroutineContext);
    }

    @Override // Ph.L
    public String toString() {
        return this.f10826d;
    }

    @Override // Ph.Z
    public void w0(long j10, InterfaceC1465n interfaceC1465n) {
        this.f10824b.w0(j10, interfaceC1465n);
    }
}
