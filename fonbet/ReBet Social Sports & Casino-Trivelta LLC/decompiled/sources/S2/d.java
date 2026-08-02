package S2;

import Q2.F;
import R2.C1549z;
import R2.U;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final F f10569a;

    /* renamed from: b, reason: collision with root package name */
    public final U f10570b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10571c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10572d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f10573e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(F runnableScheduler, U launcher) {
        this(runnableScheduler, launcher, 0L, 4, null);
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
    }

    public static final void d(d dVar, C1549z c1549z) {
        dVar.f10570b.c(c1549z, 3);
    }

    public final void b(C1549z token) {
        Runnable runnable;
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (this.f10572d) {
            runnable = (Runnable) this.f10573e.remove(token);
        }
        if (runnable != null) {
            this.f10569a.a(runnable);
        }
    }

    public final void c(final C1549z token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Runnable runnable = new Runnable() { // from class: S2.c
            @Override // java.lang.Runnable
            public final void run() {
                d.d(d.this, token);
            }
        };
        synchronized (this.f10572d) {
        }
        this.f10569a.b(this.f10571c, runnable);
    }

    public d(F runnableScheduler, U launcher, long j10) {
        Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        this.f10569a = runnableScheduler;
        this.f10570b = launcher;
        this.f10571c = j10;
        this.f10572d = new Object();
        this.f10573e = new LinkedHashMap();
    }

    public /* synthetic */ d(F f10, U u10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, u10, (i10 & 4) != 0 ? TimeUnit.MINUTES.toMillis(90L) : j10);
    }
}
