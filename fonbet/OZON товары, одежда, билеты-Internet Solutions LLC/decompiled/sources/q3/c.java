package q3;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import m3.N;
import p3.C8847g;
import p3.InterfaceC8846f;
import p3.i;
import p3.n;
import p3.v;
import p3.y;
import p3.z;
import q3.InterfaceC8980a;
import q3.b;

/* loaded from: classes.dex */
public final class c implements InterfaceC8846f {

    /* renamed from: a, reason: collision with root package name */
    private final q f81406a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f f81407b;

    /* renamed from: c, reason: collision with root package name */
    private final y f81408c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC8846f f81409d;

    /* renamed from: e, reason: collision with root package name */
    private final g f81410e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f81411f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f81412g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f81413h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f81414i;

    /* renamed from: j, reason: collision with root package name */
    private p3.i f81415j;

    /* renamed from: k, reason: collision with root package name */
    private p3.i f81416k;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC8846f f81417l;

    /* renamed from: m, reason: collision with root package name */
    private long f81418m;

    /* renamed from: n, reason: collision with root package name */
    private long f81419n;

    /* renamed from: o, reason: collision with root package name */
    private long f81420o;

    /* renamed from: p, reason: collision with root package name */
    private h f81421p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f81422q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f81423r;

    /* renamed from: s, reason: collision with root package name */
    private long f81424s;

    public static final class a implements InterfaceC8846f.a {

        /* renamed from: a, reason: collision with root package name */
        private q f81425a;

        /* renamed from: b, reason: collision with root package name */
        private n.a f81426b = new n.a();

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC8846f.a f81427c;

        private c d(InterfaceC8846f interfaceC8846f, int i11, int i12) {
            b a11;
            q qVar = this.f81425a;
            qVar.getClass();
            if (interfaceC8846f == null) {
                a11 = null;
            } else {
                b.C1374b c1374b = new b.C1374b();
                c1374b.b(qVar);
                a11 = c1374b.a();
            }
            return new c(qVar, interfaceC8846f, this.f81426b.createDataSource(), a11, i11, i12);
        }

        @Override // p3.InterfaceC8846f.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createDataSource() {
            InterfaceC8846f.a aVar = this.f81427c;
            return d(aVar != null ? aVar.createDataSource() : null, 0, 0);
        }

        public final c b() {
            InterfaceC8846f.a aVar = this.f81427c;
            return d(aVar != null ? aVar.createDataSource() : null, 1, -4000);
        }

        public final c c() {
            return d(null, 1, -4000);
        }

        public final InterfaceC8980a e() {
            return this.f81425a;
        }

        public final void f(q qVar) {
            this.f81425a = qVar;
        }

        public final void g(n.a aVar) {
            this.f81426b = aVar;
        }

        public final void h(InterfaceC8846f.a aVar) {
            this.f81427c = aVar;
        }
    }

    c(q qVar, InterfaceC8846f interfaceC8846f, InterfaceC8846f interfaceC8846f2, b bVar, int i11, int i12) {
        Pk0.f fVar = g.f81433j0;
        this.f81406a = qVar;
        this.f81407b = interfaceC8846f2;
        this.f81410e = fVar;
        this.f81411f = (i11 & 1) != 0;
        this.f81412g = false;
        this.f81413h = false;
        if (interfaceC8846f != null) {
            this.f81409d = interfaceC8846f;
            this.f81408c = bVar != null ? new y(interfaceC8846f, bVar) : null;
        } else {
            this.f81409d = v.f80125a;
            this.f81408c = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void i() throws IOException {
        q qVar = this.f81406a;
        InterfaceC8846f interfaceC8846f = this.f81417l;
        if (interfaceC8846f == null) {
            return;
        }
        try {
            interfaceC8846f.close();
        } finally {
            this.f81416k = null;
            this.f81417l = null;
            h hVar = this.f81421p;
            if (hVar != null) {
                qVar.o(hVar);
                this.f81421p = null;
            }
        }
    }

    private void l(p3.i iVar, boolean z11) throws IOException {
        h t2;
        long j11;
        p3.i a11;
        InterfaceC8846f interfaceC8846f;
        String str = iVar.f80073h;
        int i11 = N.f74289a;
        if (this.f81423r) {
            t2 = null;
        } else if (this.f81411f) {
            try {
                q qVar = this.f81406a;
                long j12 = this.f81419n;
                long j13 = this.f81420o;
                synchronized (qVar) {
                    qVar.i();
                    while (true) {
                        t2 = qVar.t(str, j12, j13);
                        if (t2 != null) {
                            break;
                        } else {
                            qVar.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            t2 = this.f81406a.t(str, this.f81419n, this.f81420o);
        }
        q qVar2 = this.f81406a;
        InterfaceC8846f interfaceC8846f2 = this.f81409d;
        if (t2 == null) {
            i.a a12 = iVar.a();
            a12.h(this.f81419n);
            a12.g(this.f81420o);
            a11 = a12.a();
            interfaceC8846f = interfaceC8846f2;
            j11 = -1;
        } else {
            boolean z12 = t2.f81437d;
            long j14 = t2.f81436c;
            if (z12) {
                Uri fromFile = Uri.fromFile(t2.f81438e);
                long j15 = this.f81419n;
                long j16 = t2.f81435b;
                long j17 = j15 - j16;
                long j18 = j14 - j17;
                j11 = -1;
                long j19 = this.f81420o;
                if (j19 != -1) {
                    j18 = Math.min(j18, j19);
                }
                i.a a13 = iVar.a();
                a13.i(fromFile);
                a13.k(j16);
                a13.h(j17);
                a13.g(j18);
                a11 = a13.a();
                interfaceC8846f = this.f81407b;
            } else {
                j11 = -1;
                if (j14 == -1) {
                    j14 = this.f81420o;
                } else {
                    long j21 = this.f81420o;
                    if (j21 != -1) {
                        j14 = Math.min(j14, j21);
                    }
                }
                i.a a14 = iVar.a();
                a14.h(this.f81419n);
                a14.g(j14);
                a11 = a14.a();
                interfaceC8846f = this.f81408c;
                if (interfaceC8846f == null) {
                    qVar2.o(t2);
                    interfaceC8846f = interfaceC8846f2;
                    t2 = null;
                }
            }
        }
        this.f81424s = (this.f81423r || interfaceC8846f != interfaceC8846f2) ? Long.MAX_VALUE : this.f81419n + 102400;
        if (z11) {
            G10.a.h(this.f81417l == interfaceC8846f2);
            if (interfaceC8846f == interfaceC8846f2) {
                return;
            }
            try {
                i();
            } catch (Throwable th2) {
                if (!t2.f81437d) {
                    qVar2.o(t2);
                }
                throw th2;
            }
        }
        if (t2 != null && !t2.f81437d) {
            this.f81421p = t2;
        }
        this.f81417l = interfaceC8846f;
        this.f81416k = a11;
        this.f81418m = 0L;
        long open = interfaceC8846f.open(a11);
        l lVar = new l();
        if (a11.f80072g == j11 && open != j11) {
            this.f81420o = open;
            l.c(lVar, this.f81419n + open);
        }
        if (!(this.f81417l == this.f81407b)) {
            Uri uri = interfaceC8846f.getUri();
            this.f81414i = uri;
            l.d(lVar, iVar.f80066a.equals(uri) ? null : this.f81414i);
        }
        if (this.f81417l == this.f81408c) {
            qVar2.h(str, lVar);
        }
    }

    @Override // p3.InterfaceC8846f
    public final void addTransferListener(z zVar) {
        zVar.getClass();
        this.f81407b.addTransferListener(zVar);
        this.f81409d.addTransferListener(zVar);
    }

    @Override // p3.InterfaceC8846f
    public final void close() throws IOException {
        this.f81415j = null;
        this.f81414i = null;
        this.f81419n = 0L;
        try {
            i();
        } catch (Throwable th2) {
            if (this.f81417l == this.f81407b || (th2 instanceof InterfaceC8980a.C1373a)) {
                this.f81422q = true;
            }
            throw th2;
        }
    }

    @Override // p3.InterfaceC8846f
    public final Map<String, List<String>> getResponseHeaders() {
        return !(this.f81417l == this.f81407b) ? this.f81409d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // p3.InterfaceC8846f
    public final Uri getUri() {
        return this.f81414i;
    }

    public final InterfaceC8980a j() {
        return this.f81406a;
    }

    public final g k() {
        return this.f81410e;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0007, B:5:0x0011, B:10:0x0033, B:13:0x0040, B:17:0x0050, B:19:0x0056, B:22:0x0081, B:25:0x008d, B:26:0x0089, B:27:0x008f, B:34:0x009f, B:36:0x0099, B:37:0x005d, B:39:0x006d, B:42:0x0075, B:43:0x007c, B:44:0x0045, B:49:0x002c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0007, B:5:0x0011, B:10:0x0033, B:13:0x0040, B:17:0x0050, B:19:0x0056, B:22:0x0081, B:25:0x008d, B:26:0x0089, B:27:0x008f, B:34:0x009f, B:36:0x0099, B:37:0x005d, B:39:0x006d, B:42:0x0075, B:43:0x007c, B:44:0x0045, B:49:0x002c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[Catch: all -> 0x005b, TRY_LEAVE, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0007, B:5:0x0011, B:10:0x0033, B:13:0x0040, B:17:0x0050, B:19:0x0056, B:22:0x0081, B:25:0x008d, B:26:0x0089, B:27:0x008f, B:34:0x009f, B:36:0x0099, B:37:0x005d, B:39:0x006d, B:42:0x0075, B:43:0x007c, B:44:0x0045, B:49:0x002c), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:3:0x0007, B:5:0x0011, B:10:0x0033, B:13:0x0040, B:17:0x0050, B:19:0x0056, B:22:0x0081, B:25:0x008d, B:26:0x0089, B:27:0x008f, B:34:0x009f, B:36:0x0099, B:37:0x005d, B:39:0x006d, B:42:0x0075, B:43:0x007c, B:44:0x0045, B:49:0x002c), top: B:2:0x0007 }] */
    @Override // p3.InterfaceC8846f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long open(p3.i iVar) throws IOException {
        boolean z11;
        long j11;
        long j12;
        q qVar = this.f81406a;
        try {
            String a11 = ((Pk0.f) this.f81410e).a(iVar);
            long j13 = iVar.f80071f;
            i.a a12 = iVar.a();
            a12.f(a11);
            p3.i a13 = a12.a();
            this.f81415j = a13;
            Uri uri = a13.f80066a;
            String d11 = qVar.a(a11).d();
            Uri parse = d11 == null ? null : Uri.parse(d11);
            if (parse != null) {
                uri = parse;
            }
            this.f81414i = uri;
            this.f81419n = j13;
            boolean z12 = this.f81412g;
            long j14 = iVar.f80072g;
            if ((!z12 || !this.f81422q) && (!this.f81413h || j14 != -1)) {
                z11 = false;
                this.f81423r = z11;
                if (z11) {
                    j11 = -1;
                    long c11 = qVar.a(a11).c();
                    this.f81420o = c11;
                    if (c11 != -1) {
                        long j15 = c11 - j13;
                        this.f81420o = j15;
                        if (j15 < 0) {
                            throw new C8847g(2008);
                        }
                    }
                } else {
                    this.f81420o = -1L;
                    j11 = -1;
                }
                if (j14 != j11) {
                    long j16 = this.f81420o;
                    this.f81420o = j16 == j11 ? j14 : Math.min(j16, j14);
                }
                j12 = this.f81420o;
                if (j12 <= 0 || j12 == j11) {
                    l(a13, false);
                }
                return j14 == j11 ? j14 : this.f81420o;
            }
            z11 = true;
            this.f81423r = z11;
            if (z11) {
            }
            if (j14 != j11) {
            }
            j12 = this.f81420o;
            if (j12 <= 0) {
            }
            l(a13, false);
            if (j14 == j11) {
            }
        } catch (Throwable th2) {
            if (this.f81417l == this.f81407b || (th2 instanceof InterfaceC8980a.C1373a)) {
                this.f81422q = true;
            }
            throw th2;
        }
    }

    @Override // j3.InterfaceC7268j
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        long j11;
        InterfaceC8846f interfaceC8846f = this.f81407b;
        if (i12 == 0) {
            return 0;
        }
        if (this.f81420o == 0) {
            return -1;
        }
        p3.i iVar = this.f81415j;
        iVar.getClass();
        p3.i iVar2 = this.f81416k;
        iVar2.getClass();
        try {
            if (this.f81419n >= this.f81424s) {
                l(iVar, true);
            }
            InterfaceC8846f interfaceC8846f2 = this.f81417l;
            interfaceC8846f2.getClass();
            int read = interfaceC8846f2.read(bArr, i11, i12);
            if (read != -1) {
                long j12 = read;
                this.f81419n += j12;
                this.f81418m += j12;
                long j13 = this.f81420o;
                if (j13 == -1) {
                    return read;
                }
                this.f81420o = j13 - j12;
                return read;
            }
            InterfaceC8846f interfaceC8846f3 = this.f81417l;
            if (!(interfaceC8846f3 == interfaceC8846f)) {
                j11 = -1;
                long j14 = iVar2.f80072g;
                if (j14 != -1) {
                    i13 = read;
                    if (this.f81418m < j14) {
                    }
                } else {
                    i13 = read;
                }
                String str = iVar.f80073h;
                int i14 = N.f74289a;
                this.f81420o = 0L;
                if (!(interfaceC8846f3 == this.f81408c)) {
                    return i13;
                }
                l lVar = new l();
                l.c(lVar, this.f81419n);
                this.f81406a.h(str, lVar);
                return i13;
            }
            i13 = read;
            j11 = -1;
            long j15 = this.f81420o;
            if (j15 <= 0 && j15 != j11) {
                return i13;
            }
            i();
            l(iVar, false);
            return read(bArr, i11, i12);
        } catch (Throwable th2) {
            if (this.f81417l == interfaceC8846f || (th2 instanceof InterfaceC8980a.C1373a)) {
                this.f81422q = true;
            }
            throw th2;
        }
    }
}
