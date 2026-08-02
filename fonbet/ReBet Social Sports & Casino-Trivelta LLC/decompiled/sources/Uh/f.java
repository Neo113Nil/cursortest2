package Uh;

import Ph.AbstractC1477t0;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public abstract class f extends AbstractC1477t0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f12282c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12283d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12284e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12285f;

    /* renamed from: g, reason: collision with root package name */
    public a f12286g = f2();

    public f(int i10, int i11, long j10, String str) {
        this.f12282c = i10;
        this.f12283d = i11;
        this.f12284e = j10;
        this.f12285f = str;
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        a.D0(this.f12286g, runnable, false, false, 6, null);
    }

    @Override // Ph.L
    public void Z1(CoroutineContext coroutineContext, Runnable runnable) {
        a.D0(this.f12286g, runnable, false, true, 2, null);
    }

    @Override // Ph.AbstractC1477t0
    public Executor e2() {
        return this.f12286g;
    }

    public final a f2() {
        return new a(this.f12282c, this.f12283d, this.f12284e, this.f12285f);
    }

    public final void g2(Runnable runnable, boolean z10, boolean z11) {
        this.f12286g.A0(runnable, z10, z11);
    }
}
