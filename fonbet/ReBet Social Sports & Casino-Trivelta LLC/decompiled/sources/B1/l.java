package B1;

import B1.f;
import H1.C1174g;
import H1.C1177j;
import h1.AbstractC4417m;
import h1.C4401D;
import h1.C4418n;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public final class l extends e {

    /* renamed from: j, reason: collision with root package name */
    public final f f600j;

    /* renamed from: k, reason: collision with root package name */
    public f.b f601k;

    /* renamed from: l, reason: collision with root package name */
    public C1174g f602l;

    /* renamed from: m, reason: collision with root package name */
    public long f603m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f604n;

    public l(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, f fVar) {
        super(interfaceC4411g, c4418n, 2, aVar, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f600j = fVar;
    }

    @Override // D1.m.e
    public void a() {
        if (this.f603m == 0) {
            this.f600j.d(this.f601k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C4418n e10 = this.f557b.e(this.f603m);
            C4401D c4401d = this.f564i;
            C1177j c1177j = new C1177j(c4401d, e10.f47559f, c4401d.b(e10));
            while (!this.f604n && this.f600j.a(c1177j)) {
                try {
                } finally {
                    this.f603m = c1177j.getPosition() - this.f557b.f47559f;
                    this.f602l = this.f600j.b();
                }
            }
        } finally {
            AbstractC4417m.a(this.f564i);
        }
    }

    @Override // D1.m.e
    public void c() {
        this.f604n = true;
    }

    public void g(f.b bVar) {
        this.f601k = bVar;
    }
}
