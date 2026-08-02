package defpackage;

import android.net.Uri;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qe2 implements re4 {
    public final he2 a;
    public final re4 b;
    public final c5j c;
    public final re4 d;
    public final ye2 e;
    public final wwl f;
    public final boolean g = false;
    public final boolean h;
    public final boolean i;
    public Uri j;
    public xe4 k;
    public xe4 l;
    public re4 m;
    public long n;
    public long o;
    public long p;
    public hhh q;
    public boolean r;
    public boolean s;
    public long t;
    public long u;

    public qe2(he2 he2Var, re4 re4Var, re4 re4Var2, oe2 oe2Var, ye2 ye2Var, int i, wwl wwlVar) {
        this.a = he2Var;
        this.b = re4Var2;
        this.e = ye2Var;
        this.h = (i & 2) != 0;
        this.i = false;
        if (re4Var != null) {
            this.d = re4Var;
            this.c = oe2Var != null ? new c5j(re4Var, oe2Var) : null;
        } else {
            this.d = uhe.a;
            this.c = null;
        }
        this.f = wwlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0003, B:5:0x002f, B:10:0x0042, B:12:0x004d, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:21:0x006f, B:23:0x0075, B:29:0x00a9, B:30:0x00a5, B:38:0x00b9, B:40:0x00b3, B:41:0x007b, B:43:0x008b, B:46:0x0093, B:47:0x009a, B:48:0x0052, B:53:0x003b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0003, B:5:0x002f, B:10:0x0042, B:12:0x004d, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:21:0x006f, B:23:0x0075, B:29:0x00a9, B:30:0x00a5, B:38:0x00b9, B:40:0x00b3, B:41:0x007b, B:43:0x008b, B:46:0x0093, B:47:0x009a, B:48:0x0052, B:53:0x003b), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:3:0x0003, B:5:0x002f, B:10:0x0042, B:12:0x004d, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:21:0x006f, B:23:0x0075, B:29:0x00a9, B:30:0x00a5, B:38:0x00b9, B:40:0x00b3, B:41:0x007b, B:43:0x008b, B:46:0x0093, B:47:0x009a, B:48:0x0052, B:53:0x003b), top: B:2:0x0003 }] */
    @Override // defpackage.re4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(xe4 xe4Var) {
        boolean z;
        long a;
        wwl wwlVar;
        he2 he2Var = this.a;
        try {
            String a2 = this.e.a(xe4Var);
            ve4 a3 = xe4Var.a();
            long j = xe4Var.f;
            long j2 = xe4Var.g;
            a3.h = a2;
            xe4 a4 = a3.a();
            this.k = a4;
            Uri uri = a4.a;
            byte[] bArr = (byte[]) ((ghh) he2Var).f(a2).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.j = uri;
            this.o = j;
            if ((!this.h || !this.r) && (!this.i || j2 != -1)) {
                z = false;
                this.s = z;
                if (z && (wwlVar = this.f) != null) {
                    String str2 = wwlVar.a;
                    String str3 = wwlVar.b;
                    str2.getClass();
                    str3.getClass();
                }
                if (this.s) {
                    a = ep3.a(((ghh) he2Var).f(a2));
                    this.p = a;
                    if (a != -1) {
                        a -= j;
                        this.p = a;
                        if (a < 0) {
                            throw new te4(2008);
                        }
                    }
                } else {
                    this.p = -1L;
                    a = -1;
                }
                if (j2 != -1) {
                    a = a == -1 ? j2 : Math.min(a, j2);
                    this.p = a;
                }
                if (a <= 0 || a == -1) {
                    d(a4, false);
                }
                return j2 == -1 ? j2 : this.p;
            }
            z = true;
            this.s = z;
            if (z) {
                String str22 = wwlVar.a;
                String str32 = wwlVar.b;
                str22.getClass();
                str32.getClass();
            }
            if (this.s) {
            }
            if (j2 != -1) {
            }
            if (a <= 0) {
            }
            d(a4, false);
            if (j2 == -1) {
            }
        } catch (Throwable th) {
            if (this.m == this.b || (th instanceof ce2)) {
                this.r = true;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        he2 he2Var = this.a;
        re4 re4Var = this.m;
        if (re4Var == null) {
            return;
        }
        try {
            re4Var.close();
        } finally {
            this.l = null;
            this.m = null;
            hhh hhhVar = this.q;
            if (hhhVar != null) {
                ((ghh) he2Var).j(hhhVar);
                this.q = null;
            }
        }
    }

    @Override // defpackage.re4
    public final void close() {
        this.k = null;
        this.j = null;
        this.o = 0L;
        wwl wwlVar = this.f;
        if (wwlVar != null && this.t > 0) {
            synchronized (((ghh) this.a)) {
            }
            String str = wwlVar.a;
            String str2 = wwlVar.b;
            str.getClass();
            str2.getClass();
            this.t = 0L;
        }
        try {
            c();
        } catch (Throwable th) {
            if (this.m == this.b || (th instanceof ce2)) {
                this.r = true;
            }
            throw th;
        }
    }

    public final void d(xe4 xe4Var, boolean z) {
        hhh m;
        xe4 a;
        re4 re4Var;
        String str = xe4Var.h;
        String str2 = nik.a;
        if (this.s) {
            m = null;
        } else {
            boolean z2 = this.g;
            he2 he2Var = this.a;
            long j = this.o;
            if (z2) {
                try {
                    long j2 = this.p;
                    ghh ghhVar = (ghh) he2Var;
                    synchronized (ghhVar) {
                        ghhVar.c();
                        while (true) {
                            m = ghhVar.m(j, j2, str);
                            if (m != null) {
                                break;
                            } else {
                                ghhVar.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                m = ((ghh) he2Var).m(j, this.p, str);
            }
        }
        if (m == null) {
            re4Var = this.d;
            ve4 a2 = xe4Var.a();
            a2.f = this.o;
            a2.g = this.p;
            a = a2.a();
        } else if (m.d) {
            Uri fromFile = Uri.fromFile(m.e);
            long j3 = m.b;
            long j4 = this.o - j3;
            long j5 = m.c - j4;
            long j6 = this.p;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            ve4 a3 = xe4Var.a();
            a3.a = fromFile;
            a3.b = j3;
            a3.f = j4;
            a3.g = j5;
            a = a3.a();
            re4Var = this.b;
        } else {
            long j7 = m.c;
            long j8 = this.p;
            if (j7 == -1) {
                j7 = j8;
            } else if (j8 != -1) {
                j7 = Math.min(j7, j8);
            }
            ve4 a4 = xe4Var.a();
            a4.f = this.o;
            a4.g = j7;
            a = a4.a();
            re4Var = this.c;
            if (re4Var == null) {
                re4Var = this.d;
                ((ghh) this.a).j(m);
                m = null;
            }
        }
        this.u = (this.s || re4Var != this.d) ? Long.MAX_VALUE : this.o + 102400;
        if (z) {
            z1a.E(this.m == this.d);
            if (re4Var == this.d) {
                return;
            }
            try {
                c();
            } catch (Throwable th) {
                if (!m.d) {
                    ((ghh) this.a).j(m);
                }
                throw th;
            }
        }
        if (m != null && !m.d) {
            this.q = m;
        }
        this.m = re4Var;
        this.l = a;
        this.n = 0L;
        long b = re4Var.b(a);
        fp3 fp3Var = new fp3(0);
        if (a.g == -1 && b != -1) {
            this.p = b;
            fp3Var.a(Long.valueOf(this.o + b), "exo_len");
        }
        if (!(this.m == this.b)) {
            Uri uri = re4Var.getUri();
            this.j = uri;
            Uri uri2 = xe4Var.a.equals(uri) ? null : this.j;
            if (uri2 == null) {
                fp3Var.a.add("exo_redir");
                fp3Var.b.remove("exo_redir");
            } else {
                fp3Var.a(uri2.toString(), "exo_redir");
            }
        }
        if (this.m == this.c) {
            ((ghh) this.a).b(str, fp3Var);
        }
    }

    @Override // defpackage.re4
    public final void f(tn4 tn4Var) {
        tn4Var.getClass();
        this.b.f(tn4Var);
        this.d.f(tn4Var);
    }

    @Override // defpackage.re4
    public final Map getResponseHeaders() {
        return !(this.m == this.b) ? this.d.getResponseHeaders() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.re4
    public final Uri getUri() {
        return this.j;
    }

    @Override // defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        re4 re4Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.p == 0) {
            return -1;
        }
        xe4 xe4Var = this.k;
        xe4Var.getClass();
        xe4 xe4Var2 = this.l;
        xe4Var2.getClass();
        try {
            if (this.o >= this.u) {
                d(xe4Var, true);
            }
            re4 re4Var2 = this.m;
            re4Var2.getClass();
            int read = re4Var2.read(bArr, i, i2);
            re4 re4Var3 = this.m;
            if (read != -1) {
                if (re4Var3 == re4Var) {
                    this.t += read;
                }
                long j2 = read;
                this.o += j2;
                this.n += j2;
                long j3 = this.p;
                if (j3 == -1) {
                    return read;
                }
                this.p = j3 - j2;
                return read;
            }
            if (!(re4Var3 == re4Var)) {
                j = -1;
                long j4 = xe4Var2.g;
                if (j4 != -1) {
                    i3 = read;
                    if (this.n < j4) {
                    }
                } else {
                    i3 = read;
                }
                String str = xe4Var.h;
                String str2 = nik.a;
                this.p = 0L;
                if (!(re4Var3 == this.c)) {
                    return i3;
                }
                fp3 fp3Var = new fp3(0);
                fp3Var.a(Long.valueOf(this.o), "exo_len");
                ((ghh) this.a).b(str, fp3Var);
                return i3;
            }
            i3 = read;
            j = -1;
            long j5 = this.p;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            c();
            d(xe4Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.m == re4Var || (th instanceof ce2)) {
                this.r = true;
            }
            throw th;
        }
    }
}
