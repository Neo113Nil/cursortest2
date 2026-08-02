package o2;

import H1.InterfaceC1183p;
import H1.InterfaceC1184q;
import H1.J;
import android.util.SparseArray;
import com.plaid.internal.EnumC3631g;
import e1.AbstractC4134a;
import e1.Q;
import io.sentry.F3;
import kotlin.UByte;
import o2.L;

/* renamed from: o2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5776C implements InterfaceC1183p {

    /* renamed from: l, reason: collision with root package name */
    public static final H1.u f58908l = new H1.u() { // from class: o2.B
        @Override // H1.u
        public final InterfaceC1183p[] f() {
            return C5776C.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Q f58909a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f58910b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.J f58911c;

    /* renamed from: d, reason: collision with root package name */
    public final C5774A f58912d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f58913e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58914f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f58915g;

    /* renamed from: h, reason: collision with root package name */
    public long f58916h;

    /* renamed from: i, reason: collision with root package name */
    public z f58917i;

    /* renamed from: j, reason: collision with root package name */
    public H1.r f58918j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f58919k;

    /* renamed from: o2.C$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC5793m f58920a;

        /* renamed from: b, reason: collision with root package name */
        public final Q f58921b;

        /* renamed from: c, reason: collision with root package name */
        public final e1.I f58922c = new e1.I(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f58923d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f58924e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f58925f;

        /* renamed from: g, reason: collision with root package name */
        public int f58926g;

        /* renamed from: h, reason: collision with root package name */
        public long f58927h;

        public a(InterfaceC5793m interfaceC5793m, Q q10) {
            this.f58920a = interfaceC5793m;
            this.f58921b = q10;
        }

        public void a(e1.J j10) {
            j10.q(this.f58922c.data, 0, 3);
            this.f58922c.p(0);
            b();
            j10.q(this.f58922c.data, 0, this.f58926g);
            this.f58922c.p(0);
            c();
            this.f58920a.e(this.f58927h, 4);
            this.f58920a.a(j10);
            this.f58920a.c(false);
        }

        public final void b() {
            this.f58922c.r(8);
            this.f58923d = this.f58922c.g();
            this.f58924e = this.f58922c.g();
            this.f58922c.r(6);
            this.f58926g = this.f58922c.h(8);
        }

        public final void c() {
            this.f58927h = 0L;
            if (this.f58923d) {
                this.f58922c.r(4);
                this.f58922c.r(1);
                this.f58922c.r(1);
                long h10 = (this.f58922c.h(3) << 30) | (this.f58922c.h(15) << 15) | this.f58922c.h(15);
                this.f58922c.r(1);
                if (!this.f58925f && this.f58924e) {
                    this.f58922c.r(4);
                    this.f58922c.r(1);
                    this.f58922c.r(1);
                    this.f58922c.r(1);
                    this.f58921b.b((this.f58922c.h(3) << 30) | (this.f58922c.h(15) << 15) | this.f58922c.h(15));
                    this.f58925f = true;
                }
                this.f58927h = this.f58921b.b(h10);
            }
        }

        public void d() {
            this.f58925f = false;
            this.f58920a.b();
        }
    }

    public C5776C() {
        this(new Q(0L));
    }

    public static /* synthetic */ InterfaceC1183p[] b() {
        return new InterfaceC1183p[]{new C5776C()};
    }

    @Override // H1.InterfaceC1183p
    public void a(long j10, long j11) {
        boolean z10 = this.f58909a.f() == -9223372036854775807L;
        if (!z10) {
            long d10 = this.f58909a.d();
            z10 = (d10 == -9223372036854775807L || d10 == 0 || d10 == j11) ? false : true;
        }
        if (z10) {
            this.f58909a.i(j11);
        }
        z zVar = this.f58917i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f58910b.size(); i10++) {
            ((a) this.f58910b.valueAt(i10)).d();
        }
    }

    @Override // H1.InterfaceC1183p
    public void c(H1.r rVar) {
        this.f58918j = rVar;
    }

    public final void d(long j10) {
        if (this.f58919k) {
            return;
        }
        this.f58919k = true;
        if (this.f58912d.c() == -9223372036854775807L) {
            this.f58918j.q(new J.b(this.f58912d.c()));
            return;
        }
        z zVar = new z(this.f58912d.d(), this.f58912d.c(), j10);
        this.f58917i = zVar;
        this.f58918j.q(zVar.b());
    }

    @Override // H1.InterfaceC1183p
    public int g(InterfaceC1184q interfaceC1184q, H1.I i10) {
        InterfaceC5793m interfaceC5793m;
        AbstractC4134a.i(this.f58918j);
        long length = interfaceC1184q.getLength();
        if (length != -1 && !this.f58912d.e()) {
            return this.f58912d.g(interfaceC1184q, i10);
        }
        d(length);
        z zVar = this.f58917i;
        if (zVar != null && zVar.d()) {
            return this.f58917i.c(interfaceC1184q, i10);
        }
        interfaceC1184q.g();
        long i11 = length != -1 ? length - interfaceC1184q.i() : -1L;
        if ((i11 != -1 && i11 < 4) || !interfaceC1184q.e(this.f58911c.f(), 0, 4, true)) {
            return -1;
        }
        this.f58911c.b0(0);
        int v10 = this.f58911c.v();
        if (v10 == 441) {
            return -1;
        }
        if (v10 == 442) {
            interfaceC1184q.n(this.f58911c.f(), 0, 10);
            this.f58911c.b0(9);
            interfaceC1184q.l((this.f58911c.M() & 7) + 14);
            return 0;
        }
        if (v10 == 443) {
            interfaceC1184q.n(this.f58911c.f(), 0, 2);
            this.f58911c.b0(0);
            interfaceC1184q.l(this.f58911c.U() + 6);
            return 0;
        }
        if (((v10 & (-256)) >> 8) != 1) {
            interfaceC1184q.l(1);
            return 0;
        }
        int i12 = v10 & 255;
        a aVar = (a) this.f58910b.get(i12);
        if (!this.f58913e) {
            if (aVar == null) {
                if (i12 == 189) {
                    interfaceC5793m = new C5783c("video/mp2p");
                    this.f58914f = true;
                    this.f58916h = interfaceC1184q.getPosition();
                } else if ((v10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE) == 192) {
                    interfaceC5793m = new t("video/mp2p");
                    this.f58914f = true;
                    this.f58916h = interfaceC1184q.getPosition();
                } else if ((v10 & EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE) == 224) {
                    interfaceC5793m = new C5794n("video/mp2p");
                    this.f58915g = true;
                    this.f58916h = interfaceC1184q.getPosition();
                } else {
                    interfaceC5793m = null;
                }
                if (interfaceC5793m != null) {
                    interfaceC5793m.d(this.f58918j, new L.d(i12, 256));
                    aVar = new a(interfaceC5793m, this.f58909a);
                    this.f58910b.put(i12, aVar);
                }
            }
            if (interfaceC1184q.getPosition() > ((this.f58914f && this.f58915g) ? this.f58916h + 8192 : F3.MAX_EVENT_SIZE_BYTES)) {
                this.f58913e = true;
                this.f58918j.s();
            }
        }
        interfaceC1184q.n(this.f58911c.f(), 0, 2);
        this.f58911c.b0(0);
        int U10 = this.f58911c.U() + 6;
        if (aVar == null) {
            interfaceC1184q.l(U10);
        } else {
            this.f58911c.X(U10);
            interfaceC1184q.readFully(this.f58911c.f(), 0, U10);
            this.f58911c.b0(6);
            aVar.a(this.f58911c);
            e1.J j10 = this.f58911c;
            j10.a0(j10.b());
        }
        return 0;
    }

    @Override // H1.InterfaceC1183p
    public boolean j(InterfaceC1184q interfaceC1184q) {
        byte[] bArr = new byte[14];
        interfaceC1184q.n(bArr, 0, 14);
        if (442 != (((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC1184q.j(bArr[13] & 7);
        interfaceC1184q.n(bArr, 0, 3);
        return 1 == ((((bArr[0] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) | (bArr[2] & UByte.MAX_VALUE));
    }

    public C5776C(Q q10) {
        this.f58909a = q10;
        this.f58911c = new e1.J(4096);
        this.f58910b = new SparseArray();
        this.f58912d = new C5774A();
    }

    @Override // H1.InterfaceC1183p
    public void release() {
    }
}
