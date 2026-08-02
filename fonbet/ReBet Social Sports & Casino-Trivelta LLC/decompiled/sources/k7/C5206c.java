package k7;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5206c {

    /* renamed from: a, reason: collision with root package name */
    public final m7.b f54315a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f54316b;

    /* renamed from: c, reason: collision with root package name */
    public long f54317c;

    /* renamed from: d, reason: collision with root package name */
    public long f54318d;

    /* renamed from: e, reason: collision with root package name */
    public long f54319e;

    /* renamed from: f, reason: collision with root package name */
    public long f54320f;

    /* renamed from: g, reason: collision with root package name */
    public long f54321g;

    /* renamed from: h, reason: collision with root package name */
    public long f54322h;

    /* renamed from: i, reason: collision with root package name */
    public long f54323i;

    /* renamed from: j, reason: collision with root package name */
    public int f54324j;

    /* renamed from: k, reason: collision with root package name */
    public int f54325k;

    /* renamed from: l, reason: collision with root package name */
    public int f54326l;

    public C5206c(m7.b frameScheduler) {
        Intrinsics.checkNotNullParameter(frameScheduler, "frameScheduler");
        this.f54315a = frameScheduler;
        this.f54317c = 8L;
        this.f54324j = -1;
        this.f54325k = -1;
    }

    public final int a() {
        long d10 = this.f54316b ? (d() - this.f54320f) + this.f54318d : Math.max(this.f54322h, 0L);
        int b10 = this.f54315a.b(d10, this.f54322h);
        this.f54322h = d10;
        return b10;
    }

    public final boolean b() {
        return this.f54316b;
    }

    public final long c() {
        if (!this.f54316b) {
            return -1L;
        }
        long a10 = this.f54315a.a(d() - this.f54320f);
        if (a10 == -1) {
            this.f54316b = false;
            return -1L;
        }
        long j10 = a10 + this.f54317c;
        this.f54321g = this.f54320f + j10;
        return j10;
    }

    public final long d() {
        return SystemClock.uptimeMillis();
    }

    public final void e() {
        this.f54326l++;
    }

    public final void f(int i10) {
        this.f54324j = i10;
    }

    public final void g(boolean z10) {
        this.f54316b = z10;
    }

    public final boolean h() {
        return this.f54324j != -1 && d() >= this.f54321g;
    }

    public final void i() {
        if (this.f54316b) {
            return;
        }
        long d10 = d();
        long j10 = d10 - this.f54319e;
        this.f54320f = j10;
        this.f54321g = j10;
        this.f54322h = d10 - this.f54323i;
        this.f54324j = this.f54325k;
        this.f54316b = true;
    }

    public final void j() {
        if (this.f54316b) {
            long d10 = d();
            this.f54319e = d10 - this.f54320f;
            this.f54323i = d10 - this.f54322h;
            this.f54320f = 0L;
            this.f54321g = 0L;
            this.f54322h = -1L;
            this.f54324j = -1;
            this.f54316b = false;
        }
    }
}
