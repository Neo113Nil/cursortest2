package defpackage;

import com.appsflyer.internal.i;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ah9 implements ie6 {
    public static final List g = yol.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = yol.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final qof a;
    public final epf b;
    public final zg9 c;
    public volatile ih9 d;
    public final qff e;
    public volatile boolean f;

    public ah9(jod jodVar, qof qofVar, epf epfVar, zg9 zg9Var) {
        jodVar.getClass();
        zg9Var.getClass();
        this.a = qofVar;
        this.b = epfVar;
        this.c = zg9Var;
        List list = jodVar.s;
        qff qffVar = qff.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(qffVar) ? qffVar : qff.HTTP_2;
    }

    @Override // defpackage.ie6
    public final void a() {
        ih9 ih9Var = this.d;
        ih9Var.getClass();
        ih9Var.i.close();
    }

    @Override // defpackage.ie6
    public final ejh b(qzf qzfVar, long j) {
        qzfVar.getClass();
        ih9 ih9Var = this.d;
        ih9Var.getClass();
        return ih9Var.i;
    }

    @Override // defpackage.ie6
    public final void c(qzf qzfVar) {
        int i;
        ih9 ih9Var;
        boolean z;
        qzfVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = qzfVar.d != null;
        q89 q89Var = qzfVar.c;
        ArrayList arrayList = new ArrayList(q89Var.size() + 4);
        arrayList.add(new v79(qzfVar.b, v79.f));
        gc2 gc2Var = v79.g;
        jl9 jl9Var = qzfVar.a;
        jl9Var.getClass();
        String b = jl9Var.b();
        String d = jl9Var.d();
        if (d != null) {
            b = b + '?' + d;
        }
        arrayList.add(new v79(b, gc2Var));
        String a = qzfVar.c.a("Host");
        if (a != null) {
            arrayList.add(new v79(a, v79.i));
        }
        arrayList.add(new v79(jl9Var.a, v79.h));
        int size = q89Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String j = vha.j(q89Var, i2);
            Locale locale = Locale.US;
            String k = i.k(locale, j, locale);
            if (!g.contains(k) || (k.equals("te") && vha.l(q89Var, i2).equals("trailers"))) {
                arrayList.add(new v79(k, vha.l(q89Var, i2)));
            }
        }
        zg9 zg9Var = this.c;
        zg9Var.getClass();
        boolean z3 = !z2;
        synchronized (zg9Var.x) {
            synchronized (zg9Var) {
                try {
                    if (zg9Var.e > 1073741823) {
                        zg9Var.h(tp5.REFUSED_STREAM);
                    }
                    if (zg9Var.f) {
                        throw new ek3();
                    }
                    i = zg9Var.e;
                    zg9Var.e = i + 2;
                    ih9Var = new ih9(i, zg9Var, z3, false, null);
                    z = !z2 || zg9Var.u >= zg9Var.v || ih9Var.d >= ih9Var.e;
                    if (ih9Var.h()) {
                        zg9Var.b.put(Integer.valueOf(i), ih9Var);
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            zg9Var.x.i(i, arrayList, z3);
        }
        if (z) {
            zg9Var.x.flush();
        }
        this.d = ih9Var;
        boolean z4 = this.f;
        ih9 ih9Var2 = this.d;
        if (z4) {
            ih9Var2.getClass();
            ih9Var2.e(tp5.CANCEL);
            is8.e("Canceled");
        } else {
            ih9Var2.getClass();
            ih9Var2.j.g(this.b.g);
            ih9 ih9Var3 = this.d;
            ih9Var3.getClass();
            ih9Var3.k.g(this.b.h);
        }
    }

    @Override // defpackage.ie6
    public final void cancel() {
        this.f = true;
        ih9 ih9Var = this.d;
        if (ih9Var != null) {
            ih9Var.e(tp5.CANCEL);
        }
    }

    @Override // defpackage.ie6
    public final cwh d(d2g d2gVar) {
        ih9 ih9Var = this.d;
        ih9Var.getClass();
        return ih9Var.h;
    }

    @Override // defpackage.ie6
    public final boolean e() {
        boolean z;
        ih9 ih9Var = this.d;
        if (ih9Var != null) {
            synchronized (ih9Var) {
                gh9 gh9Var = ih9Var.h;
                if (gh9Var.b) {
                    if (gh9Var.d.w()) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ie6
    public final long f(d2g d2gVar) {
        if (yi9.a(d2gVar)) {
            return yol.e(d2gVar);
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002b, code lost:
    
        if (r4 == false) goto L20;
     */
    @Override // defpackage.ie6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2g g(boolean z) {
        q89 q89Var;
        ih9 ih9Var = this.d;
        if (ih9Var == null) {
            is8.e("stream wasn't created");
            return null;
        }
        synchronized (ih9Var) {
            while (true) {
                boolean z2 = false;
                if (!ih9Var.f.isEmpty() || ih9Var.f() != null) {
                    break;
                }
                if (!z) {
                    ih9Var.b.getClass();
                    fh9 fh9Var = ih9Var.i;
                }
                z2 = true;
                if (z2) {
                    ih9Var.j.h();
                }
                try {
                    try {
                        ih9Var.wait();
                        if (z2) {
                            ih9Var.j.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        ih9Var.j.k();
                    }
                    throw th;
                }
            }
            if (ih9Var.f.isEmpty()) {
                IOException iOException = ih9Var.m;
                if (iOException != null) {
                    throw iOException;
                }
                tp5 f = ih9Var.f();
                f.getClass();
                throw new sgi(f);
            }
            Object removeFirst = ih9Var.f.removeFirst();
            removeFirst.getClass();
            q89Var = (q89) removeFirst;
        }
        qff qffVar = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = q89Var.size();
        b10 b10Var = null;
        for (int i = 0; i < size; i++) {
            String j = vha.j(q89Var, i);
            String l = vha.l(q89Var, i);
            if (j.equals(":status")) {
                b10Var = aba.D("HTTP/1.1 ".concat(l));
            } else if (!h.contains(j)) {
                arrayList.add(j);
                arrayList.add(StringsKt.l0(l).toString());
            }
        }
        if (b10Var == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        b2g b2gVar = new b2g();
        b2gVar.b = qffVar;
        b2gVar.c = b10Var.b;
        b2gVar.d = (String) b10Var.d;
        b2gVar.f = vha.k(new q89((String[]) arrayList.toArray(new String[0])));
        if (z && b2gVar.c == 100) {
            return null;
        }
        return b2gVar;
    }

    @Override // defpackage.ie6
    public final void h() {
        this.c.x.flush();
    }

    @Override // defpackage.ie6
    public final ooh i() {
        ih9 ih9Var = this.d;
        ih9Var.getClass();
        return ih9Var;
    }

    @Override // defpackage.ie6
    public final he6 j() {
        return this.a;
    }
}
