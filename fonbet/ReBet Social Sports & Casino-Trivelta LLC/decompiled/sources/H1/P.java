package H1;

import H1.O;
import e1.AbstractC4134a;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4353a;

    /* renamed from: b, reason: collision with root package name */
    public int f4354b;

    /* renamed from: c, reason: collision with root package name */
    public long f4355c;

    /* renamed from: d, reason: collision with root package name */
    public int f4356d;

    /* renamed from: e, reason: collision with root package name */
    public int f4357e;

    /* renamed from: f, reason: collision with root package name */
    public int f4358f;
    private final byte[] syncframePrefix = new byte[10];

    public void a(O o10, O.a aVar) {
        if (this.f4354b > 0) {
            o10.g(this.f4355c, this.f4356d, this.f4357e, this.f4358f, aVar);
            this.f4354b = 0;
        }
    }

    public void b() {
        this.f4353a = false;
        this.f4354b = 0;
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        AbstractC4134a.h(this.f4358f <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f4353a) {
            int i13 = this.f4354b;
            int i14 = i13 + 1;
            this.f4354b = i14;
            if (i13 == 0) {
                this.f4355c = j10;
                this.f4356d = i10;
                this.f4357e = 0;
            }
            this.f4357e += i11;
            this.f4358f = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC1184q interfaceC1184q) {
        if (this.f4353a) {
            return;
        }
        interfaceC1184q.n(this.syncframePrefix, 0, 10);
        interfaceC1184q.g();
        if (AbstractC1169b.j(this.syncframePrefix) == 0) {
            return;
        }
        this.f4353a = true;
    }
}
