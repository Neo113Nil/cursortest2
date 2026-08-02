package i1;

import android.net.Uri;
import b1.AbstractC2342K;
import e1.AbstractC4134a;
import e1.Z;
import h1.C4399B;
import h1.C4402E;
import h1.C4415k;
import h1.C4418n;
import h1.C4423s;
import h1.InterfaceC4403F;
import h1.InterfaceC4410f;
import h1.InterfaceC4411g;
import i1.C4518b;
import i1.InterfaceC4517a;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes.dex */
public final class c implements InterfaceC4411g {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4517a f47927a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4411g f47928b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4411g f47929c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC4411g f47930d;

    /* renamed from: e, reason: collision with root package name */
    public final h f47931e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47932f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47933g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f47934h;

    /* renamed from: i, reason: collision with root package name */
    public Uri f47935i;

    /* renamed from: j, reason: collision with root package name */
    public C4418n f47936j;

    /* renamed from: k, reason: collision with root package name */
    public C4418n f47937k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC4411g f47938l;

    /* renamed from: m, reason: collision with root package name */
    public long f47939m;

    /* renamed from: n, reason: collision with root package name */
    public long f47940n;

    /* renamed from: o, reason: collision with root package name */
    public long f47941o;

    /* renamed from: p, reason: collision with root package name */
    public i f47942p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f47943q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f47944r;

    /* renamed from: s, reason: collision with root package name */
    public long f47945s;

    /* renamed from: t, reason: collision with root package name */
    public long f47946t;

    public interface b {
    }

    /* renamed from: i1.c$c, reason: collision with other inner class name */
    public static final class C0723c implements InterfaceC4411g.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC4517a f47947a;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC4410f.a f47949c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f47951e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC4411g.a f47952f;

        /* renamed from: g, reason: collision with root package name */
        public int f47953g;

        /* renamed from: h, reason: collision with root package name */
        public int f47954h;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC4411g.a f47948b = new C4423s.a();

        /* renamed from: d, reason: collision with root package name */
        public h f47950d = h.f47959a;

        @Override // h1.InterfaceC4411g.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a() {
            InterfaceC4411g.a aVar = this.f47952f;
            return c(aVar != null ? aVar.a() : null, this.f47954h, this.f47953g);
        }

        public final c c(InterfaceC4411g interfaceC4411g, int i10, int i11) {
            InterfaceC4410f interfaceC4410f;
            InterfaceC4517a interfaceC4517a = (InterfaceC4517a) AbstractC4134a.e(this.f47947a);
            if (this.f47951e || interfaceC4411g == null) {
                interfaceC4410f = null;
            } else {
                InterfaceC4410f.a aVar = this.f47949c;
                interfaceC4410f = aVar != null ? aVar.a() : new C4518b.C0722b().b(interfaceC4517a).a();
            }
            return new c(interfaceC4517a, interfaceC4411g, this.f47948b.a(), interfaceC4410f, this.f47950d, i10, null, i11, null);
        }

        public C0723c d(InterfaceC4517a interfaceC4517a) {
            this.f47947a = interfaceC4517a;
            return this;
        }

        public C0723c e(InterfaceC4411g.a aVar) {
            this.f47952f = aVar;
            return this;
        }
    }

    public static Uri p(InterfaceC4517a interfaceC4517a, String str, Uri uri) {
        Uri c10 = l.c(interfaceC4517a.b(str));
        return c10 != null ? c10 : uri;
    }

    @Override // h1.InterfaceC4411g
    public long b(C4418n c4418n) {
        try {
            String b10 = this.f47931e.b(c4418n);
            C4418n a10 = c4418n.a().f(b10).a();
            this.f47936j = a10;
            this.f47935i = p(this.f47927a, b10, a10.f47554a);
            this.f47940n = c4418n.f47559f;
            int z10 = z(c4418n);
            boolean z11 = z10 != -1;
            this.f47944r = z11;
            if (z11) {
                w(z10);
            }
            if (this.f47944r) {
                this.f47941o = -1L;
            } else {
                long b11 = l.b(this.f47927a.b(b10));
                this.f47941o = b11;
                if (b11 != -1) {
                    long j10 = b11 - c4418n.f47559f;
                    this.f47941o = j10;
                    if (j10 < 0) {
                        throw new C4415k(2008);
                    }
                }
            }
            long j11 = c4418n.f47560g;
            if (j11 != -1) {
                long j12 = this.f47941o;
                if (j12 != -1) {
                    j11 = Math.min(j12, j11);
                }
                this.f47941o = j11;
            }
            long j13 = this.f47941o;
            if (j13 > 0 || j13 == -1) {
                x(a10, false);
            }
            long j14 = c4418n.f47560g;
            return j14 != -1 ? j14 : this.f47941o;
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    @Override // h1.InterfaceC4411g
    public void c(InterfaceC4403F interfaceC4403F) {
        AbstractC4134a.e(interfaceC4403F);
        this.f47928b.c(interfaceC4403F);
        this.f47930d.c(interfaceC4403F);
    }

    @Override // h1.InterfaceC4411g
    public void close() {
        this.f47936j = null;
        this.f47935i = null;
        this.f47940n = 0L;
        v();
        try {
            o();
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    @Override // h1.InterfaceC4411g
    public Map f() {
        return t() ? this.f47930d.f() : Collections.EMPTY_MAP;
    }

    @Override // h1.InterfaceC4411g
    public Uri getUri() {
        return this.f47935i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o() {
        InterfaceC4411g interfaceC4411g = this.f47938l;
        if (interfaceC4411g == null) {
            return;
        }
        try {
            interfaceC4411g.close();
        } finally {
            this.f47937k = null;
            this.f47938l = null;
            i iVar = this.f47942p;
            if (iVar != null) {
                this.f47927a.c(iVar);
                this.f47942p = null;
            }
        }
    }

    public final void q(Throwable th2) {
        if (s() || (th2 instanceof InterfaceC4517a.C0721a)) {
            this.f47943q = true;
        }
    }

    public final boolean r() {
        return this.f47938l == this.f47930d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r17.f47939m < r13) goto L29;
     */
    @Override // b1.InterfaceC2358l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int read(byte[] bArr, int i10, int i11) {
        long j10;
        if (i11 == 0) {
            return 0;
        }
        if (this.f47941o == 0) {
            return -1;
        }
        C4418n c4418n = (C4418n) AbstractC4134a.e(this.f47936j);
        C4418n c4418n2 = (C4418n) AbstractC4134a.e(this.f47937k);
        try {
            if (this.f47940n >= this.f47946t) {
                x(c4418n, true);
            }
            int read = ((InterfaceC4411g) AbstractC4134a.e(this.f47938l)).read(bArr, i10, i11);
            if (read == -1) {
                if (t()) {
                    long j11 = c4418n2.f47560g;
                    if (j11 != -1) {
                        j10 = 0;
                    }
                    y((String) Z.i(c4418n.f47561h));
                    return read;
                }
                j10 = 0;
                long j12 = this.f47941o;
                if (j12 <= j10) {
                    if (j12 == -1) {
                    }
                }
                o();
                x(c4418n, false);
                return read(bArr, i10, i11);
            }
            if (s()) {
                this.f47945s += read;
            }
            long j13 = read;
            this.f47940n += j13;
            this.f47939m += j13;
            long j14 = this.f47941o;
            if (j14 != -1) {
                this.f47941o = j14 - j13;
                return read;
            }
            return read;
        } catch (Throwable th2) {
            q(th2);
            throw th2;
        }
    }

    public final boolean s() {
        return this.f47938l == this.f47928b;
    }

    public final boolean t() {
        return !s();
    }

    public final boolean u() {
        return this.f47938l == this.f47929c;
    }

    public final void x(C4418n c4418n, boolean z10) {
        i f10;
        long j10;
        C4418n a10;
        InterfaceC4411g interfaceC4411g;
        String str = (String) Z.i(c4418n.f47561h);
        if (this.f47944r) {
            f10 = null;
        } else if (this.f47932f) {
            try {
                f10 = this.f47927a.f(str, this.f47940n, this.f47941o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            f10 = this.f47927a.d(str, this.f47940n, this.f47941o);
        }
        if (f10 == null) {
            interfaceC4411g = this.f47930d;
            a10 = c4418n.a().h(this.f47940n).g(this.f47941o).a();
        } else if (f10.f47963d) {
            Uri fromFile = Uri.fromFile((File) Z.i(f10.f47964e));
            long j11 = f10.f47961b;
            long j12 = this.f47940n - j11;
            long j13 = f10.f47962c - j12;
            long j14 = this.f47941o;
            if (j14 != -1) {
                j13 = Math.min(j13, j14);
            }
            a10 = c4418n.a().i(fromFile).k(j11).h(j12).g(j13).a();
            interfaceC4411g = this.f47928b;
        } else {
            if (f10.c()) {
                j10 = this.f47941o;
            } else {
                j10 = f10.f47962c;
                long j15 = this.f47941o;
                if (j15 != -1) {
                    j10 = Math.min(j10, j15);
                }
            }
            a10 = c4418n.a().h(this.f47940n).g(j10).a();
            interfaceC4411g = this.f47929c;
            if (interfaceC4411g == null) {
                interfaceC4411g = this.f47930d;
                this.f47927a.c(f10);
                f10 = null;
            }
        }
        this.f47946t = (this.f47944r || interfaceC4411g != this.f47930d) ? LongCompanionObject.MAX_VALUE : this.f47940n + 102400;
        if (z10) {
            AbstractC4134a.g(r());
            if (interfaceC4411g == this.f47930d) {
                return;
            }
            try {
                o();
            } catch (Throwable th2) {
                if (((i) Z.i(f10)).b()) {
                    this.f47927a.c(f10);
                }
                throw th2;
            }
        }
        if (f10 != null && f10.b()) {
            this.f47942p = f10;
        }
        this.f47938l = interfaceC4411g;
        this.f47937k = a10;
        this.f47939m = 0L;
        long b10 = interfaceC4411g.b(a10);
        m mVar = new m();
        if (a10.f47560g == -1 && b10 != -1) {
            this.f47941o = b10;
            m.g(mVar, this.f47940n + b10);
        }
        if (t()) {
            Uri uri = interfaceC4411g.getUri();
            this.f47935i = uri;
            m.h(mVar, c4418n.f47554a.equals(uri) ? null : this.f47935i);
        }
        if (u()) {
            this.f47927a.e(str, mVar);
        }
    }

    public final void y(String str) {
        this.f47941o = 0L;
        if (u()) {
            m mVar = new m();
            m.g(mVar, this.f47940n);
            this.f47927a.e(str, mVar);
        }
    }

    public final int z(C4418n c4418n) {
        if (this.f47933g && this.f47943q) {
            return 0;
        }
        return (this.f47934h && c4418n.f47560g == -1) ? 1 : -1;
    }

    public c(InterfaceC4517a interfaceC4517a, InterfaceC4411g interfaceC4411g, InterfaceC4411g interfaceC4411g2, InterfaceC4410f interfaceC4410f, h hVar, int i10, AbstractC2342K abstractC2342K, int i11, b bVar) {
        this.f47927a = interfaceC4517a;
        this.f47928b = interfaceC4411g2;
        this.f47931e = hVar == null ? h.f47959a : hVar;
        this.f47932f = (i10 & 1) != 0;
        this.f47933g = (i10 & 2) != 0;
        this.f47934h = (i10 & 4) != 0;
        if (interfaceC4411g != null) {
            this.f47930d = interfaceC4411g;
            this.f47929c = interfaceC4410f != null ? new C4402E(interfaceC4411g, interfaceC4410f) : null;
        } else {
            this.f47930d = C4399B.f47499a;
            this.f47929c = null;
        }
    }

    public final void v() {
    }

    public final void w(int i10) {
    }
}
