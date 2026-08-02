package m1;

import b1.C2340I;
import e1.InterfaceC4143j;

/* loaded from: classes.dex */
public final class p1 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4143j f56304a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f56305b;

    /* renamed from: c, reason: collision with root package name */
    public long f56306c;

    /* renamed from: d, reason: collision with root package name */
    public long f56307d;

    /* renamed from: e, reason: collision with root package name */
    public C2340I f56308e = C2340I.f24312d;

    public p1(InterfaceC4143j interfaceC4143j) {
        this.f56304a = interfaceC4143j;
    }

    @Override // m1.Q0
    public long H() {
        long j10 = this.f56306c;
        if (!this.f56305b) {
            return j10;
        }
        long b10 = this.f56304a.b() - this.f56307d;
        C2340I c2340i = this.f56308e;
        return j10 + (c2340i.f24315a == 1.0f ? e1.Z.a1(b10) : c2340i.a(b10));
    }

    public void a(long j10) {
        this.f56306c = j10;
        if (this.f56305b) {
            this.f56307d = this.f56304a.b();
        }
    }

    public void b() {
        if (this.f56305b) {
            return;
        }
        this.f56307d = this.f56304a.b();
        this.f56305b = true;
    }

    public void c() {
        if (this.f56305b) {
            a(H());
            this.f56305b = false;
        }
    }

    @Override // m1.Q0
    public C2340I d() {
        return this.f56308e;
    }

    @Override // m1.Q0
    public void e(C2340I c2340i) {
        if (this.f56305b) {
            a(H());
        }
        this.f56308e = c2340i;
    }
}
