package com.my.tracker.obfuscated;

import com.my.tracker.obfuscated.d1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f1 {
    final d1 a;
    final int b;
    final int c;
    final int d;
    final int e;
    long f;
    long g;

    private f1(d1 d1Var, int i, int i2, int i3, int i4) {
        this.a = d1Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        Long b = d1Var.b("timestamp_base");
        if (b == null) {
            this.f = 0L;
        } else {
            this.f = b.longValue();
        }
        this.g = d1Var.l();
    }

    public static f1 a(d1 d1Var) {
        return a(d1Var, 1000, 500, 500, 100);
    }

    public x1 b() {
        return new y1(this.a);
    }

    public z1 c() {
        return new a2(this.a, "default_session");
    }

    public boolean d(byte[] bArr, long j) {
        try {
            if (this.a.f(6L) >= this.c) {
                long j2 = 0;
                if (this.a.a(6L, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of custom events is exceeded, event has been skipped");
                    Long b = this.a.b("custom_events_skipped_count");
                    if (b != null) {
                        j2 = b.longValue();
                    }
                    long j3 = j2 + 1;
                    x2.a("MyTrackerRepository: skipped custom events count: " + j3);
                    this.a.a("custom_events_skipped_count", Long.valueOf(j3));
                    return false;
                }
            }
            return a(6, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: 6", th);
            return false;
        }
    }

    public List e() {
        ArrayList arrayList = new ArrayList();
        d1.b bVar = null;
        try {
            bVar = this.a.h();
            while (bVar.b()) {
                f a = f.a(bVar.m(), bVar.n(), bVar.o(), bVar.p(), bVar.e());
                if (a != null) {
                    arrayList.add(a.a(Long.valueOf(bVar.a())));
                }
            }
            bVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th);
                return arrayList;
            } finally {
                if (bVar != null) {
                    bVar.close();
                }
            }
        }
    }

    public long f() {
        try {
            Long b = this.a.b("custom_events_skipped_count");
            if (b == null) {
                return 0L;
            }
            return b.longValue();
        } catch (Throwable th) {
            x2.b("Error: get custom events skipped count", th);
            return 0L;
        }
    }

    public List g() {
        ArrayList arrayList = new ArrayList();
        d1.e eVar = null;
        try {
            eVar = this.a.k();
            while (eVar.b()) {
                o0 a = o0.a(eVar.m(), eVar.n(), eVar.e());
                if (a != null) {
                    arrayList.add(a.a(Long.valueOf(eVar.a())));
                }
            }
            eVar.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                x2.b("MyTrackerRepository error: error while reading purchases", th);
                return arrayList;
            } finally {
                if (eVar != null) {
                    eVar.close();
                }
            }
        }
    }

    public long h() {
        return this.g;
    }

    public boolean i(byte[] bArr, long j) {
        return a(1, bArr, true, false, j);
    }

    public boolean j(byte[] bArr, long j) {
        return c(9, bArr, j);
    }

    public boolean k(byte[] bArr, long j) {
        return c(13, bArr, j);
    }

    public boolean l(byte[] bArr, long j) {
        return a(25, bArr, false, true, j);
    }

    public boolean m(byte[] bArr, long j) {
        return a(7, bArr, true, true, j);
    }

    public boolean n(byte[] bArr, long j) {
        return a(26, bArr, false, true, j);
    }

    public boolean o(byte[] bArr, long j) {
        return a(28, bArr, false, true, j);
    }

    public boolean p(byte[] bArr, long j) {
        return a(29, bArr, false, true, j);
    }

    public boolean q(byte[] bArr, long j) {
        return a(2, bArr, true, false, j);
    }

    public boolean r(byte[] bArr, long j) {
        return a(8, bArr, true, true, j);
    }

    public boolean s(byte[] bArr, long j) {
        return a(5, bArr, true, false, j);
    }

    public static f1 a(d1 d1Var, int i, int i2, int i3, int i4) {
        try {
            return new f1(d1Var, i, i2, i3, i4);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: failed to create MyTrackerRepository instance", th);
            return null;
        }
    }

    public boolean b(long j) {
        return c(3, new byte[0], j);
    }

    public boolean c(byte[] bArr, long j) {
        return a(32, bArr, true, false, j);
    }

    public boolean h(byte[] bArr, long j) {
        return a(31, bArr, true, false, j);
    }

    public long i() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public boolean j() {
        ?? r2;
        d1.c i;
        try {
            i = this.a.i();
        } catch (Exception unused) {
            r2 = 0;
        }
        try {
            r2 = i.b();
            try {
                i.close();
                d1.f a = this.a.a("default_session");
                try {
                    r2 = r2;
                    if (a.b()) {
                        r2++;
                    }
                    a.close();
                } finally {
                }
            } catch (Exception unused2) {
            }
            return r2 != 0;
        } finally {
        }
    }

    public boolean b(byte[] bArr, long j) {
        return a(33, bArr, true, false, j);
    }

    public void c(long j) {
        try {
            this.a.a("timestamp_base", Long.valueOf(j));
            this.f = j;
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public boolean a(byte[] bArr, long j) {
        return a(14, bArr, true, false, j);
    }

    public boolean b(int i, byte[] bArr, long j) {
        Throwable th;
        int i2;
        boolean z = i == 20 || i == 21;
        if (i == 24) {
            try {
                long j2 = i;
                if (this.a.f(j2) >= this.c && this.a.a(j2, bArr) == 0) {
                    x2.a("MyTrackerRepository: maximum count of mini-app custom events is exceeded, event has been skipped");
                    return false;
                }
            } catch (Throwable th2) {
                th = th2;
                i2 = i;
                x2.b("MyTrackerRepository error: event serialization failed, type: " + i2, th);
                return false;
            }
        }
        i2 = i;
        try {
            return a(i2, bArr, z, true, j);
        } catch (Throwable th3) {
            th = th3;
            x2.b("MyTrackerRepository error: event serialization failed, type: " + i2, th);
            return false;
        }
    }

    public boolean f(byte[] bArr, long j) {
        return a(10, bArr, true, false, j);
    }

    public boolean a(int i, byte[] bArr, long j) {
        return a(i, bArr, true, true, j);
    }

    private boolean c(int i, byte[] bArr, long j) {
        try {
            return a(i, bArr, false, true, j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: event serialization failed, type: " + i, th);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0033: MOVE (r6 I:??[OBJECT, ARRAY]) = (r20 I:??[OBJECT, ARRAY]), block:B:34:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(long j, long j2) {
        boolean z;
        d1.f fVar;
        d1.f fVar2;
        d1.f fVar3 = null;
        try {
            fVar3 = this.a.a("default_session");
            try {
                z = fVar3.b();
                long j3 = 0;
                try {
                    if (z) {
                        long a = fVar3.a();
                        long m = fVar3.m();
                        long c = fVar3.c();
                        fVar2 = fVar3;
                        if (this.f == 0) {
                            c(m);
                        }
                        x2.a("MyTrackerRepository: finish previous session");
                        if (j2 == 0) {
                            this.a.a(a, m - this.f, true, 0L);
                        } else {
                            d1 d1Var = this.a;
                            long j4 = this.f;
                            d1Var.a(a, m - j4, false, j2 - j4);
                        }
                        long g = this.a.g(a);
                        x2.a("MyTrackerRepository: session timestamps count: " + g);
                        long j5 = (long) this.d;
                        if (g > j5) {
                            j3 = this.a.b(a, g - j5);
                            x2.a("MyTrackerRepository: maximum count of session timestamps is exceeded, remove oldest timestamps, count: " + j3);
                        }
                        x2.a("MyTrackerRepository: start new session");
                        this.a.a(a, j, c + j3);
                    } else {
                        fVar2 = fVar3;
                        x2.a("MyTrackerRepository: insert session");
                        if (this.a.a("default_session", j) == d1.y) {
                            x2.b("MyTrackerRepository error: session insertion failed ");
                            fVar2.close();
                            return false;
                        }
                        if (this.f == 0) {
                            c(j);
                        }
                    }
                    fVar2.close();
                    return true;
                } catch (Throwable th) {
                    th = th;
                    fVar3 = fVar;
                    try {
                        x2.b("MyTrackerRepository error: session insertion failed ", th);
                        return z;
                    } finally {
                        if (fVar3 != null) {
                            fVar3.close();
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
                x2.b("MyTrackerRepository error: session insertion failed ", th);
                return z;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void b(o0 o0Var) {
        Long b = o0Var.b();
        if (b != null) {
            try {
                this.a.b(b.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw purchase with id " + b, th);
            }
        }
    }

    public b d() {
        try {
            return this.a.f();
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
            return null;
        }
    }

    public void b(f fVar) {
        Long b = fVar.b();
        if (b != null) {
            try {
                this.a.a(b.longValue());
            } catch (Throwable th) {
                x2.b("MyTrackerRepository error: error while removing raw appgallery purchase with id " + b, th);
            }
        }
    }

    public boolean g(byte[] bArr, long j) {
        return a(27, bArr, false, true, j);
    }

    public boolean e(byte[] bArr, long j) {
        return a(15, bArr, true, true, j);
    }

    public void a(o0 o0Var) {
        String jSONObject = o0Var.d().toString();
        String a = o0Var.a();
        try {
            if (this.a.j() >= this.e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: raw purchase with data: " + jSONObject + ", signature " + a + " isn't inserted");
                return;
            }
            long a2 = this.a.a(jSONObject, a, o0Var.f());
            if (a2 >= 0) {
                x2.a("MyTrackerRepository: raw purchase was inserted; id: " + a2 + ", data: " + jSONObject + ", signature: " + a);
                o0Var.a(Long.valueOf(a2));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert raw purchase with data: " + jSONObject + ", signature " + a, th);
        }
    }

    public void a(f fVar) {
        String jSONObject = fVar.e().toString();
        String a = fVar.a();
        String f = fVar.f();
        int g = fVar.g();
        try {
            if (this.a.g() >= this.e) {
                x2.a("MyTrackerRepository: max count of raw purchases is reached");
                x2.a("MyTrackerRepository: appgalleery raw purchase with data: " + jSONObject + ", signature " + a + " isn't inserted");
                return;
            }
            long a2 = this.a.a(jSONObject, a, f, g, fVar.h());
            if (a2 >= 0) {
                x2.a("MyTrackerRepository: appgallery raw purchase was inserted; id: " + a2 + ", data: " + jSONObject + ", signature: " + a);
                fVar.a(Long.valueOf(a2));
            }
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: can't insert appgallery raw purchase with data: " + jSONObject + ", signature " + a, th);
        }
    }

    public boolean a(int i, byte[] bArr, boolean z, boolean z2, long j) {
        boolean z3;
        long j2;
        long j3;
        try {
            long j4 = d1.y;
            if (z2) {
                d1.c cVar = null;
                z3 = false;
                try {
                    try {
                        j2 = 0;
                        cVar = this.a.b(i, bArr);
                        if (cVar.b()) {
                            j4 = cVar.a();
                            j3 = cVar.c();
                        } else {
                            j3 = 0;
                        }
                        cVar.close();
                    } catch (Throwable th) {
                        if (cVar != null) {
                            cVar.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    x2.b("MyTrackerRepository error: event insertion failed, type: " + i, th);
                    return z3;
                }
            } else {
                z3 = false;
                j2 = 0;
                j3 = 0;
            }
            if (j4 == d1.y) {
                x2.a("MyTrackerRepository: insert " + i + " event");
                j4 = this.a.a(i, bArr, z);
                if (j4 != d1.y && z) {
                    this.g++;
                }
            } else {
                x2.a("MyTrackerRepository: aggregate " + i + " event");
            }
            if (j4 == d1.y) {
                x2.b("MyTrackerRepository error: event insertion failed, type: " + i);
                return z3;
            }
            if (this.f == j2) {
                c(j);
            }
            this.a.c(j4, j - this.f);
            long d = this.a.d(j4);
            x2.a("MyTrackerRepository: event timestamps count: " + d);
            long j5 = (long) this.b;
            if (d <= j5) {
                return true;
            }
            long a = this.a.a(j4, d - j5);
            this.a.d(j4, j3 + a);
            x2.a("MyTrackerRepository: maximum count of event timestamps is exceeded, remove oldest timestamps, count: " + a);
            return true;
        } catch (Throwable th3) {
            th = th3;
            z3 = false;
        }
    }

    public boolean a() {
        try {
            this.a.c();
            this.a.b();
            this.a.e();
            this.a.d();
            this.a.a();
            this.a.a("custom_events_skipped_count", (Long) null);
            this.g = 0L;
            d1.f a = this.a.a("default_session");
            try {
                if (a.b()) {
                    c(a.m());
                } else {
                    c(0L);
                }
                a.close();
                return true;
            } finally {
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(byte[] bArr) {
        try {
            this.a.i(14L);
            this.a.a(bArr);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }

    public void a(long j) {
        try {
            this.a.c(j);
        } catch (Throwable th) {
            x2.b("MyTrackerRepository error: ", th);
        }
    }
}
