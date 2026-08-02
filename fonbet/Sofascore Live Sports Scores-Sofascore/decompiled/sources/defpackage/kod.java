package defpackage;

import com.ironsource.C4427z5;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kod {
    public static final nic L = h8a.a(":status", new f8h(25));
    public boolean A;
    public int B;
    public int C;
    public final zd6 D;
    public final axn E;
    public final ood F;
    public boolean G;
    public final dti H;
    public qwd I;
    public int J;
    public final /* synthetic */ lod K;
    public tgc a;
    public final Object b;
    public final j0l c;
    public final tgc d;
    public int e;
    public boolean f;
    public boolean g;
    public final uei h;
    public boolean i;
    public ay2 j;
    public om4 k;
    public boolean l;
    public n2 m;
    public volatile boolean n;
    public boolean o;
    public boolean p;
    public xei q;
    public qic r;
    public Charset s;
    public boolean t;
    public final int u;
    public final Object v;
    public ArrayList w;
    public final x52 x;
    public boolean y;
    public boolean z;

    public kod(lod lodVar, int i, uei ueiVar, Object obj, zd6 zd6Var, axn axnVar, ood oodVar, int i2) {
        this.K = lodVar;
        j0l j0lVar = lodVar.a;
        this.b = new Object();
        z1a.y(j0lVar, "transportTracer");
        this.c = j0lVar;
        tgc tgcVar = new tgc(this, i, ueiVar, j0lVar);
        this.d = tgcVar;
        this.a = tgcVar;
        this.k = om4.d;
        this.l = false;
        this.h = ueiVar;
        this.s = xp2.c;
        this.x = new x52();
        this.y = false;
        this.z = false;
        this.A = false;
        this.G = true;
        this.J = -1;
        z1a.y(obj, "lock");
        this.v = obj;
        this.D = zd6Var;
        this.E = axnVar;
        this.F = oodVar;
        this.B = i2;
        this.C = i2;
        this.u = i2;
        jde.a.getClass();
        this.H = bw9.a;
    }

    public static Charset e(qic qicVar) {
        String str = (String) qicVar.c(n49.i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return xp2.c;
    }

    public static xei n(qic qicVar) {
        char charAt;
        Integer num = (Integer) qicVar.c(L);
        if (num == null) {
            return xei.l.h("Missing HTTP status code");
        }
        String str = (String) qicVar.c(n49.i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                return null;
            }
        }
        return n49.g(num.intValue()).b("invalid content-type: " + str);
    }

    public final void a(int i) {
        int i2 = this.C - i;
        this.C = i2;
        float f = i2;
        int i3 = this.u;
        if (f <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.B += i4;
            this.C = i2 + i4;
            this.D.i(this.J, i4);
        }
    }

    public final void b(xei xeiVar, boolean z, qic qicVar) {
        if (this.A) {
            return;
        }
        this.A = true;
        boolean z2 = this.G;
        ood oodVar = this.F;
        if (!z2) {
            oodVar.g(this.J, xeiVar, zx2.a, z, up5.CANCEL, qicVar);
            return;
        }
        LinkedList linkedList = oodVar.D;
        lod lodVar = this.K;
        linkedList.remove(lodVar);
        oodVar.l(lodVar);
        this.w = null;
        this.x.k();
        this.G = false;
        if (qicVar == null) {
            qicVar = new qic();
        }
        m(xeiVar, true, qicVar);
    }

    public final void c(xei xeiVar, zx2 zx2Var, qic qicVar) {
        if (this.i) {
            return;
        }
        this.i = true;
        uei ueiVar = this.h;
        if (ueiVar.b.compareAndSet(false, true)) {
            for (cy2 cy2Var : ueiVar.a) {
                cy2Var.m(xeiVar);
            }
        }
        if (this.c != null) {
            xeiVar.f();
        }
        this.j.z(xeiVar, zx2Var, qicVar);
    }

    public final void d(Throwable th) {
        b(xei.e(th), true, new qic());
    }

    public final void f(qic qicVar) {
        mx9 mx9Var = mx9.b;
        z1a.D("Received headers on closed stream", !this.o);
        for (cy2 cy2Var : this.h.a) {
            cy2Var.b();
        }
        String str = (String) qicVar.c(n49.d);
        if (str != null) {
            nm4 nm4Var = (nm4) this.k.a.get(str);
            tz2 tz2Var = nm4Var != null ? nm4Var.a : null;
            if (tz2Var == null) {
                d(xei.l.h("Can't find decompressor for ".concat(str)).a());
                return;
            } else if (tz2Var != mx9Var) {
                tgc tgcVar = this.a;
                tgcVar.getClass();
                z1a.D("Already set full stream decompressor", true);
                tgcVar.e = tz2Var;
            }
        }
        this.j.q(qicVar);
    }

    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.f && this.e < 32768 && !this.g;
            } finally {
            }
        }
        return z;
    }

    public final void h(x52 x52Var, boolean z, boolean z2) {
        if (this.A) {
            return;
        }
        if (!this.G) {
            z1a.D("streamId should be set", this.J != -1);
            this.E.a(z, this.I, x52Var, z2);
        } else {
            this.x.W(x52Var, (int) x52Var.b);
            this.y |= z;
            this.z |= z2;
        }
    }

    public final void i(qic qicVar, String str) {
        lod lodVar = this.K;
        String str2 = lodVar.k;
        String str3 = lodVar.i;
        boolean z = lodVar.o;
        ood oodVar = this.F;
        boolean z2 = oodVar.B == null;
        x79 x79Var = m89.a;
        z1a.y(qicVar, "headers");
        z1a.y(str2, "authority");
        qicVar.a(n49.i);
        qicVar.a(n49.j);
        jic jicVar = n49.k;
        qicVar.a(jicVar);
        Charset charset = h8a.a;
        ArrayList arrayList = new ArrayList(qicVar.b + 7);
        if (z2) {
            arrayList.add(m89.b);
        } else {
            arrayList.add(m89.a);
        }
        if (z) {
            arrayList.add(m89.d);
        } else {
            arrayList.add(m89.c);
        }
        arrayList.add(new x79(str2, x79.h));
        arrayList.add(new x79(str, x79.f));
        arrayList.add(new x79(jicVar.a, str3));
        arrayList.add(m89.e);
        arrayList.add(m89.f);
        Logger logger = yxj.a;
        int i = qicVar.b * 2;
        byte[][] bArr = new byte[i][];
        Object[] objArr = qicVar.a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, i);
        } else {
            for (int i2 = 0; i2 < qicVar.b; i2++) {
                int i3 = i2 * 2;
                Object[] objArr2 = qicVar.a;
                bArr[i3] = (byte[]) objArr2[i3];
                int i4 = i3 + 1;
                Object obj = objArr2[i4];
                if (!(obj instanceof byte[])) {
                    wt3.z(obj);
                    throw null;
                }
                bArr[i4] = (byte[]) obj;
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6 += 2) {
            byte[] bArr2 = bArr[i6];
            byte[] bArr3 = bArr[i6 + 1];
            if (yxj.a(bArr2, yxj.b)) {
                bArr[i5] = bArr2;
                bArr[i5 + 1] = h8a.b.c(bArr3).getBytes(xp2.a);
            } else {
                for (byte b : bArr3) {
                    if (b < 32 || b > 126) {
                        String str4 = new String(bArr2, xp2.a);
                        Logger logger2 = yxj.a;
                        StringBuilder q = wt3.q("Metadata key=", str4, ", value=");
                        q.append(Arrays.toString(bArr3));
                        q.append(" contains invalid ASCII characters");
                        logger2.warning(q.toString());
                        break;
                    }
                }
                bArr[i5] = bArr2;
                bArr[i5 + 1] = bArr3;
            }
            i5 += 2;
        }
        if (i5 != i) {
            bArr = (byte[][]) Arrays.copyOfRange(bArr, 0, i5);
        }
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            byte[] bArr4 = bArr[i7];
            gc2 gc2Var = gc2.d;
            gc2 r = q1f.r(bArr4);
            byte[] bArr5 = r.a;
            if (bArr5.length != 0 && bArr5[0] != 58) {
                arrayList.add(new x79(r, q1f.r(bArr[i7 + 1])));
            }
        }
        this.w = arrayList;
        xei xeiVar = oodVar.v;
        if (xeiVar != null) {
            lodVar.l.l(xeiVar, zx2.d, true, new qic());
            return;
        }
        if (oodVar.n.size() < oodVar.C) {
            oodVar.s(lodVar);
            return;
        }
        oodVar.D.add(lodVar);
        if (!oodVar.z) {
            oodVar.z = true;
            oia oiaVar = oodVar.F;
            if (oiaVar != null) {
                oiaVar.b();
            }
        }
        if (lodVar.c) {
            oodVar.M.N(lodVar, true);
        }
    }

    public final void j(int i, x52 x52Var, boolean z) {
        Throwable th;
        long j = x52Var.b;
        int i2 = this.B - (((int) j) + i);
        this.B = i2;
        this.C -= i;
        if (i2 < 0) {
            this.D.h(this.J, up5.FLOW_CONTROL_ERROR);
            this.F.g(this.J, xei.l.h("Received data size exceeded our receiving window size"), zx2.a, false, null, null);
            return;
        }
        uod uodVar = new uod(x52Var);
        xei xeiVar = this.q;
        boolean z2 = false;
        if (xeiVar != null) {
            Charset charset = this.s;
            bof bofVar = cof.a;
            z1a.y(charset, C4427z5.N);
            int i3 = (int) x52Var.b;
            byte[] bArr = new byte[i3];
            uodVar.t(bArr, 0, i3);
            this.q = xeiVar.b("DATA-----------------------------\n".concat(new String(bArr, charset)));
            uodVar.close();
            if (this.q.b.length() > 1000 || z) {
                b(this.q, false, this.r);
                return;
            }
            return;
        }
        if (!this.t) {
            b(xei.l.h("headers not received before payload"), false, new qic());
            return;
        }
        int i4 = (int) j;
        boolean z3 = true;
        try {
            if (this.o) {
                o2.g.log(Level.INFO, "Received data on closed stream");
                uodVar.close();
            } else {
                try {
                    tgc tgcVar = this.a;
                    tgcVar.getClass();
                    try {
                        if (!tgcVar.isClosed() && !tgcVar.q) {
                            tgcVar.l.T(uodVar);
                            try {
                                tgcVar.h();
                            } catch (Throwable th2) {
                                th = th2;
                                z3 = false;
                                if (z3) {
                                    uodVar.close();
                                }
                                throw th;
                            }
                        }
                        uodVar.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        d(th4);
                    } catch (Throwable th5) {
                        th = th5;
                        if (!z2) {
                            throw th;
                        }
                        uodVar.close();
                        throw th;
                    }
                }
            }
            if (z) {
                if (i4 > 0) {
                    this.q = xei.l.h("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.q = xei.l.h("Received unexpected EOS on empty DATA frame from server");
                }
                qic qicVar = new qic();
                this.r = qicVar;
                m(this.q, false, qicVar);
            }
        } catch (Throwable th6) {
            th = th6;
            z2 = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void k(ArrayList arrayList, boolean z) {
        xei b;
        nic nicVar = L;
        if (z) {
            byte[][] a = uik.a(arrayList);
            int length = a.length / 2;
            qic qicVar = new qic();
            qicVar.b = length;
            qicVar.a = a;
            xei xeiVar = this.q;
            if (xeiVar == null && !this.t) {
                xeiVar = n(qicVar);
                this.q = xeiVar;
                if (xeiVar != null) {
                    this.r = qicVar;
                }
            }
            if (xeiVar != null) {
                xei b2 = xeiVar.b("trailers: " + qicVar);
                this.q = b2;
                b(b2, false, this.r);
                return;
            }
            nic nicVar2 = l8a.b;
            xei xeiVar2 = (xei) qicVar.c(nicVar2);
            if (xeiVar2 != null) {
                b = xeiVar2.h((String) qicVar.c(l8a.a));
            } else if (this.t) {
                b = xei.g.h("missing GRPC status in response");
            } else {
                Integer num = (Integer) qicVar.c(nicVar);
                b = (num != null ? n49.g(num.intValue()) : xei.l.h("missing HTTP status code")).b("missing GRPC status, inferred error from HTTP status code");
            }
            qicVar.a(nicVar);
            qicVar.a(nicVar2);
            qicVar.a(l8a.a);
            if (this.o) {
                o2.g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{b, qicVar});
                return;
            }
            for (cy2 cy2Var : this.h.a) {
                cy2Var.e(qicVar);
            }
            m(b, false, qicVar);
            return;
        }
        byte[][] a2 = uik.a(arrayList);
        int length2 = a2.length / 2;
        qic qicVar2 = new qic();
        qicVar2.b = length2;
        qicVar2.a = a2;
        xei xeiVar3 = this.q;
        if (xeiVar3 != null) {
            this.q = xeiVar3.b("headers: " + qicVar2);
            return;
        }
        try {
            if (this.t) {
                xei h = xei.l.h("Received headers twice");
                this.q = h;
                this.q = h.b("headers: " + qicVar2);
                this.r = qicVar2;
                this.s = e(qicVar2);
                return;
            }
            Integer num2 = (Integer) qicVar2.c(nicVar);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                xei xeiVar4 = this.q;
                if (xeiVar4 != null) {
                    this.q = xeiVar4.b("headers: " + qicVar2);
                    this.r = qicVar2;
                    this.s = e(qicVar2);
                    return;
                }
                return;
            }
            this.t = true;
            xei n = n(qicVar2);
            this.q = n;
            if (n != null) {
                this.q = n.b("headers: " + qicVar2);
                this.r = qicVar2;
                this.s = e(qicVar2);
                return;
            }
            qicVar2.a(nicVar);
            qicVar2.a(l8a.b);
            qicVar2.a(l8a.a);
            f(qicVar2);
            xei xeiVar5 = this.q;
            if (xeiVar5 != null) {
                this.q = xeiVar5.b("headers: " + qicVar2);
                this.r = qicVar2;
                this.s = e(qicVar2);
            }
        } catch (Throwable th) {
            xei xeiVar6 = this.q;
            if (xeiVar6 != null) {
                this.q = xeiVar6.b("headers: " + qicVar2);
                this.r = qicVar2;
                this.s = e(qicVar2);
            }
            throw th;
        }
    }

    public final void l(xei xeiVar, zx2 zx2Var, boolean z, qic qicVar) {
        z1a.y(xeiVar, "status");
        if (!this.o || z) {
            this.o = true;
            this.p = xeiVar.f();
            synchronized (this.b) {
                this.g = true;
            }
            if (this.l) {
                this.m = null;
                c(xeiVar, zx2Var, qicVar);
                return;
            }
            this.m = new n2(this, xeiVar, zx2Var, qicVar, 0);
            tgc tgcVar = this.a;
            if (z) {
                tgcVar.close();
            } else {
                if (tgcVar.isClosed()) {
                    return;
                }
                if (tgcVar.l.c == 0) {
                    tgcVar.close();
                } else {
                    tgcVar.q = true;
                }
            }
        }
    }

    public final void m(xei xeiVar, boolean z, qic qicVar) {
        l(xeiVar, zx2.a, z, qicVar);
    }
}
