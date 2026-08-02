package defpackage;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qgf implements kl6 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public x68 i;
    public ol6 j;
    public boolean k;
    public final cjj a = new cjj(0);
    public final nkk c = new nkk(4096);
    public final SparseArray b = new SparseArray();
    public final mgf d = new mgf(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        char c;
        long j;
        ?? r3;
        ?? r4;
        long j2;
        int i;
        int i2;
        long j3;
        xi5 c59Var;
        long j4;
        mgf mgfVar = this.d;
        cjj cjjVar = mgfVar.b;
        qx9.u(this.j);
        long j5 = ((ap4) ml6Var).c;
        long j6 = C.TIME_UNSET;
        if (j5 != -1) {
            c = 3;
            if (!mgfVar.d) {
                nkk nkkVar = mgfVar.c;
                if (!mgfVar.f) {
                    ap4 ap4Var = (ap4) ml6Var;
                    long j7 = ap4Var.c;
                    int min = (int) Math.min(20000L, j7);
                    long j8 = j7 - min;
                    if (ap4Var.d != j8) {
                        b78Var.a = j8;
                        return 1;
                    }
                    nkkVar.B(min);
                    ap4Var.f = 0;
                    ap4Var.peekFully(nkkVar.a, 0, min, false);
                    int i3 = nkkVar.b;
                    int i4 = nkkVar.c - 4;
                    while (true) {
                        if (i4 < i3) {
                            break;
                        }
                        if (mgf.b(i4, nkkVar.a) == 442) {
                            nkkVar.E(i4 + 4);
                            long c2 = mgf.c(nkkVar);
                            if (c2 != C.TIME_UNSET) {
                                j6 = c2;
                                break;
                            }
                        }
                        i4--;
                    }
                    mgfVar.h = j6;
                    mgfVar.f = true;
                    return 0;
                }
                if (mgfVar.h == C.TIME_UNSET) {
                    mgfVar.a(ml6Var);
                    return 0;
                }
                if (mgfVar.e) {
                    long j9 = mgfVar.g;
                    if (j9 == C.TIME_UNSET) {
                        mgfVar.a(ml6Var);
                        return 0;
                    }
                    long b = cjjVar.b(mgfVar.h) - cjjVar.b(j9);
                    mgfVar.i = b;
                    if (b < 0) {
                        m6k.f0();
                        mgfVar.i = C.TIME_UNSET;
                    }
                    mgfVar.a(ml6Var);
                    return 0;
                }
                ap4 ap4Var2 = (ap4) ml6Var;
                int min2 = (int) Math.min(20000L, ap4Var2.c);
                if (ap4Var2.d != 0) {
                    b78Var.a = 0L;
                    return 1;
                }
                nkkVar.B(min2);
                ap4Var2.f = 0;
                ap4Var2.peekFully(nkkVar.a, 0, min2, false);
                int i5 = nkkVar.b;
                int i6 = nkkVar.c;
                while (true) {
                    if (i5 >= i6 - 3) {
                        j4 = -9223372036854775807L;
                        break;
                    }
                    if (mgf.b(i5, nkkVar.a) == 442) {
                        nkkVar.E(i5 + 4);
                        long c3 = mgf.c(nkkVar);
                        if (c3 != C.TIME_UNSET) {
                            j4 = c3;
                            break;
                        }
                    }
                    i5++;
                }
                mgfVar.g = j4;
                mgfVar.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            j = 0;
            r3 = 1;
            r4 = 0;
            j2 = j5;
            i = 4;
        } else {
            this.k = true;
            long j10 = mgfVar.i;
            if (j10 != C.TIME_UNSET) {
                j2 = j5;
                j = 0;
                r4 = 0;
                i = 4;
                r3 = 1;
                x68 x68Var = new x68(new inb(17), new k1d(cjjVar), j10, j10 + 1, 0L, j2, 188L, 1000);
                this.i = x68Var;
                this.j.d((yv1) x68Var.c);
            } else {
                j = 0;
                r3 = 1;
                r4 = 0;
                j2 = j5;
                i = 4;
                this.j.d(new aw0(j10));
            }
        }
        x68 x68Var2 = this.i;
        if (x68Var2 != null && ((aw1) x68Var2.e) != null) {
            return x68Var2.a(ml6Var, b78Var);
        }
        ap4 ap4Var3 = (ap4) ml6Var;
        ap4Var3.f = r4;
        long peekPosition = j5 != -1 ? j2 - ap4Var3.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        nkk nkkVar2 = this.c;
        if (!ap4Var3.peekFully(nkkVar2.a, r4, i, r3)) {
            return -1;
        }
        nkkVar2.E(r4);
        int f = nkkVar2.f();
        if (f == 441) {
            return -1;
        }
        if (f == 442) {
            ap4Var3.peekFully(nkkVar2.a, r4, 10, r4);
            nkkVar2.E(9);
            ap4Var3.skipFully((nkkVar2.s() & 7) + 14);
            return r4;
        }
        if (f == 443) {
            ap4Var3.peekFully(nkkVar2.a, r4, 2, r4);
            nkkVar2.E(r4);
            ap4Var3.skipFully(nkkVar2.x() + 6);
            return r4;
        }
        if (((f & (-256)) >> 8) != r3) {
            ap4Var3.skipFully(r3);
            return r4;
        }
        int i7 = f & 255;
        SparseArray sparseArray = this.b;
        ogf ogfVar = (ogf) sparseArray.get(i7);
        if (!this.e) {
            if (ogfVar == null) {
                xi5 xi5Var = null;
                if (i7 == 189) {
                    c59Var = new f9(null, r4);
                    this.f = r3;
                    this.h = ap4Var3.d;
                } else if ((f & 224) == 192) {
                    c59Var = new jxc(null);
                    this.f = r3;
                    this.h = ap4Var3.d;
                } else {
                    if ((f & 240) == 224) {
                        c59Var = new c59(null);
                        this.g = r3;
                        this.h = ap4Var3.d;
                    }
                    if (xi5Var != null) {
                        xi5Var.h(this.j, new c2k(i7, NotificationCompat.FLAG_LOCAL_ONLY, (int) r4, (byte) r4));
                        ogfVar = new ogf(xi5Var, this.a);
                        sparseArray.put(i7, ogfVar);
                    }
                }
                xi5Var = c59Var;
                if (xi5Var != null) {
                }
            }
            if (ap4Var3.d > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r3;
                this.j.endTracks();
            }
        }
        ap4Var3.peekFully(nkkVar2.a, r4, 2, r4);
        nkkVar2.E(r4);
        int x = nkkVar2.x() + 6;
        if (ogfVar == null) {
            ap4Var3.skipFully(x);
            return r4;
        }
        nkkVar2.B(x);
        ap4Var3.readFully(nkkVar2.a, r4, x, r4);
        nkkVar2.E(6);
        xi5 xi5Var2 = ogfVar.a;
        nm2 nm2Var = ogfVar.c;
        nkkVar2.e(nm2Var.d, r4, 3);
        nm2Var.q(r4);
        nm2Var.t(8);
        ogfVar.d = nm2Var.h();
        ogfVar.e = nm2Var.h();
        nm2Var.t(6);
        nkkVar2.e(nm2Var.d, r4, nm2Var.i(8));
        nm2Var.q(r4);
        cjj cjjVar2 = ogfVar.b;
        if (ogfVar.d) {
            nm2Var.t(i);
            nm2Var.t(r3);
            nm2Var.t(r3);
            long i8 = (nm2Var.i(3) << 30) | (nm2Var.i(15) << 15) | nm2Var.i(15);
            nm2Var.t(r3);
            if (ogfVar.f || !ogfVar.e) {
                i2 = r4;
            } else {
                nm2Var.t(i);
                nm2Var.t(r3);
                i2 = r4;
                nm2Var.t(r3);
                nm2Var.t(r3);
                cjjVar2.b((nm2Var.i(15) << 15) | (nm2Var.i(3) << 30) | nm2Var.i(15));
                ogfVar.f = r3;
            }
            j3 = cjjVar2.b(i8);
            i = 4;
        } else {
            i2 = r4;
            j3 = j;
        }
        xi5Var2.g(i, j3);
        xi5Var2.f(nkkVar2);
        xi5Var2.packetFinished();
        nkkVar2.D(nkkVar2.a.length);
        return i2;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.j = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        byte[] bArr = new byte[14];
        ap4 ap4Var = (ap4) ml6Var;
        ap4Var.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            ap4Var.b(bArr[13] & 7, false);
            ap4Var.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        cjj cjjVar = this.a;
        synchronized (cjjVar) {
            j3 = cjjVar.b;
        }
        boolean z = j3 == C.TIME_UNSET;
        if (!z) {
            long c = cjjVar.c();
            z = (c == C.TIME_UNSET || c == 0 || c == j2) ? false : true;
        }
        if (z) {
            cjjVar.d(j2);
        }
        x68 x68Var = this.i;
        if (x68Var != null) {
            x68Var.e(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            ogf ogfVar = (ogf) sparseArray.valueAt(i);
            ogfVar.f = false;
            ogfVar.a.seek();
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
