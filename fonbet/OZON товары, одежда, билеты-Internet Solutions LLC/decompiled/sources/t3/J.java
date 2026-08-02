package t3;

import android.os.SystemClock;
import m3.C8053F;
import m3.N;

/* loaded from: classes.dex */
public final class J implements InterfaceC9731C {

    /* renamed from: a, reason: collision with root package name */
    private final C8053F f99002a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f99003b;

    /* renamed from: c, reason: collision with root package name */
    private long f99004c;

    /* renamed from: d, reason: collision with root package name */
    private long f99005d;

    /* renamed from: e, reason: collision with root package name */
    private j3.x f99006e = j3.x.f69344d;

    public J(C8053F c8053f) {
        this.f99002a = c8053f;
    }

    public final void a(long j11) {
        this.f99004c = j11;
        if (this.f99003b) {
            this.f99002a.getClass();
            this.f99005d = SystemClock.elapsedRealtime();
        }
    }

    @Override // t3.InterfaceC9731C
    public final void b(j3.x xVar) {
        if (this.f99003b) {
            a(z());
        }
        this.f99006e = xVar;
    }

    public final void c() {
        if (this.f99003b) {
            return;
        }
        this.f99002a.getClass();
        this.f99005d = SystemClock.elapsedRealtime();
        this.f99003b = true;
    }

    @Override // t3.InterfaceC9731C
    public final j3.x d() {
        return this.f99006e;
    }

    public final void e() {
        if (this.f99003b) {
            a(z());
            this.f99003b = false;
        }
    }

    @Override // t3.InterfaceC9731C
    public final long z() {
        long j11 = this.f99004c;
        if (!this.f99003b) {
            return j11;
        }
        this.f99002a.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f99005d;
        j3.x xVar = this.f99006e;
        return (xVar.f69345a == 1.0f ? N.Q(elapsedRealtime) : xVar.a(elapsedRealtime)) + j11;
    }
}
