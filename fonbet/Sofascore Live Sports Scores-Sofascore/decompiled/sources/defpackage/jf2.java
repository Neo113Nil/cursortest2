package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jf2 {
    public final qe2 a;
    public final he2 b;
    public final xe4 c;
    public final String d;
    public final byte[] e = new byte[131072];
    public long f;
    public long g;

    public jf2(qe2 qe2Var, xe4 xe4Var) {
        this.a = qe2Var;
        this.b = qe2Var.a;
        this.c = xe4Var;
        this.d = qe2Var.e.a(xe4Var);
        this.f = xe4Var.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f0 A[Catch: Exception -> 0x0102, TryCatch #3 {Exception -> 0x0102, blocks: (B:71:0x00e9, B:74:0x00f0, B:83:0x00f7, B:86:0x0100, B:92:0x0106, B:95:0x010f), top: B:70:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7 A[Catch: Exception -> 0x0102, TryCatch #3 {Exception -> 0x0102, blocks: (B:71:0x00e9, B:74:0x00f0, B:83:0x00f7, B:86:0x0100, B:92:0x0106, B:95:0x010f), top: B:70:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106 A[Catch: Exception -> 0x0102, TryCatch #3 {Exception -> 0x0102, blocks: (B:71:0x00e9, B:74:0x00f0, B:83:0x00f7, B:86:0x0100, B:92:0x0106, B:95:0x010f), top: B:70:0x00e9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        long j;
        long j2;
        int i;
        long j3;
        he2 he2Var = this.b;
        String str = this.d;
        xe4 xe4Var = this.c;
        long j4 = xe4Var.f;
        long j5 = xe4Var.g;
        ghh ghhVar = (ghh) he2Var;
        synchronized (ghhVar) {
            j = Long.MAX_VALUE;
            long j6 = j5 == -1 ? Long.MAX_VALUE : j5 + j4;
            long j7 = j6 < 0 ? Long.MAX_VALUE : j6;
            while (j4 < j7) {
                long e = ghhVar.e(str, j4, j7 - j4);
                if (e <= 0) {
                    e = -e;
                }
                j4 += e;
            }
        }
        xe4 xe4Var2 = this.c;
        long j8 = xe4Var2.g;
        if (j8 != -1) {
            this.g = xe4Var2.f + j8;
        } else {
            long a = ep3.a(((ghh) this.b).f(this.d));
            if (a == -1) {
                a = -1;
            }
            this.g = a;
        }
        while (true) {
            long j9 = this.g;
            if (j9 != -1 && this.f >= j9) {
                return;
            }
            long e2 = ((ghh) this.b).e(this.d, this.f, j9 == -1 ? j : j9 - this.f);
            if (e2 > 0) {
                this.f += e2;
            } else {
                long j10 = -e2;
                if (j10 == j) {
                    j10 = -1;
                }
                long j11 = this.f;
                xe4 xe4Var3 = this.c;
                qe2 qe2Var = this.a;
                boolean z = true;
                boolean z2 = j11 + j10 == this.g || j10 == -1;
                if (j10 != -1) {
                    ve4 a2 = xe4Var3.a();
                    a2.f = j11;
                    a2.g = j10;
                    try {
                        j2 = qe2Var.b(a2.a());
                    } catch (Exception unused) {
                        qx9.w(qe2Var);
                    }
                    if (!z) {
                        ve4 a3 = xe4Var3.a();
                        a3.f = j11;
                        a3.g = -1L;
                        try {
                            j2 = qe2Var.b(a3.a());
                        } catch (Exception e3) {
                            qx9.w(qe2Var);
                            throw e3;
                        }
                    }
                    if (z2 && j2 != -1) {
                        j3 = j2 + j11;
                        try {
                            if (this.g == j3) {
                                this.g = j3;
                            }
                        } catch (Exception e4) {
                            qx9.w(qe2Var);
                            throw e4;
                        }
                    }
                    i = 0;
                    int i2 = 0;
                    while (i != -1) {
                        byte[] bArr = this.e;
                        i = qe2Var.read(bArr, 0, bArr.length);
                        if (i != -1) {
                            i2 += i;
                        }
                    }
                    if (z2) {
                        long j12 = i2 + j11;
                        if (this.g != j12) {
                            this.g = j12;
                        }
                    }
                    qe2Var.close();
                    this.f = j11 + i2;
                }
                j2 = -1;
                z = false;
                if (!z) {
                }
                if (z2) {
                    j3 = j2 + j11;
                    if (this.g == j3) {
                    }
                }
                i = 0;
                int i22 = 0;
                while (i != -1) {
                }
                if (z2) {
                }
                qe2Var.close();
                this.f = j11 + i22;
            }
            j = Long.MAX_VALUE;
        }
    }
}
