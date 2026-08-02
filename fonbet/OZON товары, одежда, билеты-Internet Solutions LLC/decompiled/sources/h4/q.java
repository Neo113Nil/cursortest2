package h4;

import N3.C3659j;
import java.io.IOException;
import m3.C8050C;

/* loaded from: classes8.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public C6796b f64927a;

    /* renamed from: b, reason: collision with root package name */
    public long f64928b;

    /* renamed from: c, reason: collision with root package name */
    public long f64929c;

    /* renamed from: d, reason: collision with root package name */
    public int f64930d;

    /* renamed from: e, reason: collision with root package name */
    public int f64931e;

    /* renamed from: k, reason: collision with root package name */
    public boolean f64937k;

    /* renamed from: m, reason: collision with root package name */
    public p f64939m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f64941o;

    /* renamed from: p, reason: collision with root package name */
    public long f64942p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f64943q;

    /* renamed from: f, reason: collision with root package name */
    public long[] f64932f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    public int[] f64933g = new int[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f64934h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public long[] f64935i = new long[0];

    /* renamed from: j, reason: collision with root package name */
    public boolean[] f64936j = new boolean[0];

    /* renamed from: l, reason: collision with root package name */
    public boolean[] f64938l = new boolean[0];

    /* renamed from: n, reason: collision with root package name */
    public final C8050C f64940n = new C8050C();

    public final void a(C3659j c3659j) throws IOException {
        C8050C c8050c = this.f64940n;
        c3659j.b(c8050c.e(), 0, c8050c.i(), false);
        c8050c.R(0);
        this.f64941o = false;
    }

    public final void b(C8050C c8050c) {
        C8050C c8050c2 = this.f64940n;
        c8050c.n(0, c8050c2.i(), c8050c2.e());
        c8050c2.R(0);
        this.f64941o = false;
    }

    public final void c(int i11) {
        this.f64940n.O(i11);
        this.f64937k = true;
        this.f64941o = true;
    }

    public final void d(int i11, int i12) {
        this.f64930d = i11;
        this.f64931e = i12;
        if (this.f64933g.length < i11) {
            this.f64932f = new long[i11];
            this.f64933g = new int[i11];
        }
        if (this.f64934h.length < i12) {
            int i13 = (i12 * 125) / 100;
            this.f64934h = new int[i13];
            this.f64935i = new long[i13];
            this.f64936j = new boolean[i13];
            this.f64938l = new boolean[i13];
        }
    }
}
