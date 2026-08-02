package defpackage;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rgf implements ll6 {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public y68 i;
    public pl6 j;
    public boolean k;
    public final djj a = new djj(0);
    public final j9e c = new j9e(4096);
    public final SparseArray b = new SparseArray();
    public final ngf d = new ngf(0);

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        byte[] bArr = new byte[14];
        bp4 bp4Var = (bp4) nl6Var;
        bp4Var.peekFully(bArr, 0, 14, false);
        if (442 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            bp4Var.c(bArr[13] & 7, false);
            bp4Var.peekFully(bArr, 0, 3, false);
            if (1 == (((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        char c;
        int i;
        long j;
        int i2;
        ?? r4;
        ?? r5;
        long j2;
        yi5 yi5Var;
        long j3;
        long j4;
        ngf ngfVar = this.d;
        djj djjVar = ngfVar.b;
        this.j.getClass();
        long length = nl6Var.getLength();
        int i3 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        if (i3 != 0) {
            c = 3;
            if (!ngfVar.d) {
                j9e j9eVar = ngfVar.c;
                if (!ngfVar.f) {
                    long length2 = nl6Var.getLength();
                    int min = (int) Math.min(20000L, length2);
                    long j5 = length2 - min;
                    if (nl6Var.getPosition() != j5) {
                        b78Var.a = j5;
                        return 1;
                    }
                    j9eVar.K(min);
                    nl6Var.resetPeekPosition();
                    nl6Var.peekFully(j9eVar.a, 0, min);
                    int i4 = j9eVar.b;
                    int i5 = j9eVar.c - 4;
                    while (true) {
                        if (i5 < i4) {
                            j4 = -9223372036854775807L;
                            break;
                        }
                        if (ngf.b(i5, j9eVar.a) == 442) {
                            j9eVar.N(i5 + 4);
                            long c2 = ngf.c(j9eVar);
                            if (c2 != C.TIME_UNSET) {
                                j4 = c2;
                                break;
                            }
                        }
                        i5--;
                    }
                    ngfVar.h = j4;
                    ngfVar.f = true;
                    return 0;
                }
                if (ngfVar.h == C.TIME_UNSET) {
                    ngfVar.a(nl6Var);
                    return 0;
                }
                if (ngfVar.e) {
                    long j6 = ngfVar.g;
                    if (j6 == C.TIME_UNSET) {
                        ngfVar.a(nl6Var);
                        return 0;
                    }
                    ngfVar.i = djjVar.c(ngfVar.h) - djjVar.b(j6);
                    ngfVar.a(nl6Var);
                    return 0;
                }
                int min2 = (int) Math.min(20000L, nl6Var.getLength());
                if (nl6Var.getPosition() != 0) {
                    b78Var.a = 0L;
                    return 1;
                }
                j9eVar.K(min2);
                nl6Var.resetPeekPosition();
                nl6Var.peekFully(j9eVar.a, 0, min2);
                int i6 = j9eVar.b;
                int i7 = j9eVar.c;
                while (true) {
                    if (i6 >= i7 - 3) {
                        j3 = -9223372036854775807L;
                        break;
                    }
                    if (ngf.b(i6, j9eVar.a) == 442) {
                        j9eVar.N(i6 + 4);
                        long c3 = ngf.c(j9eVar);
                        if (c3 != C.TIME_UNSET) {
                            j3 = c3;
                            break;
                        }
                    }
                    i6++;
                }
                ngfVar.g = j3;
                ngfVar.e = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            i = i3;
            j = 0;
            i2 = 4;
            r4 = 1;
            r5 = 0;
        } else {
            this.k = true;
            long j7 = ngfVar.i;
            if (j7 != C.TIME_UNSET) {
                j = 0;
                i2 = 4;
                i = i3;
                r5 = 0;
                r4 = 1;
                y68 y68Var = new y68(new uic(17), new lgf(djjVar), j7, 1 + j7, 0L, length, 188L, 1000);
                this.i = y68Var;
                this.j.m((zv1) y68Var.c);
            } else {
                i = i3;
                j = 0;
                i2 = 4;
                r4 = 1;
                r5 = 0;
                this.j.m(new bw0(j7));
            }
        }
        y68 y68Var2 = this.i;
        if (y68Var2 != null && ((aw1) y68Var2.e) != null) {
            return y68Var2.b(nl6Var, b78Var);
        }
        nl6Var.resetPeekPosition();
        long peekPosition = i != 0 ? length - nl6Var.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        j9e j9eVar2 = this.c;
        if (!nl6Var.peekFully(j9eVar2.a, r5, i2, r4)) {
            return -1;
        }
        j9eVar2.N(r5);
        int m = j9eVar2.m();
        if (m == 441) {
            return -1;
        }
        if (m == 442) {
            nl6Var.peekFully(j9eVar2.a, r5, 10);
            j9eVar2.N(9);
            nl6Var.skipFully((j9eVar2.A() & 7) + 14);
            return r5;
        }
        if (m == 443) {
            nl6Var.peekFully(j9eVar2.a, r5, 2);
            j9eVar2.N(r5);
            nl6Var.skipFully(j9eVar2.H() + 6);
            return r5;
        }
        if (((m & (-256)) >> 8) != r4) {
            nl6Var.skipFully(r4);
            return r5;
        }
        int i8 = m & 255;
        SparseArray sparseArray = this.b;
        pgf pgfVar = (pgf) sparseArray.get(i8);
        if (!this.e) {
            if (pgfVar == null) {
                if (i8 == 189) {
                    yi5Var = new g9("video/mp2p");
                    this.f = r4;
                    this.h = nl6Var.getPosition();
                } else if ((m & 224) == 192) {
                    yi5Var = new kxc(null, r5, "video/mp2p");
                    this.f = r4;
                    this.h = nl6Var.getPosition();
                } else if ((m & 240) == 224) {
                    yi5Var = new d59(null, "video/mp2p");
                    this.g = r4;
                    this.h = nl6Var.getPosition();
                } else {
                    yi5Var = null;
                }
                if (yi5Var != null) {
                    yi5Var.d(this.j, new c2k(i8, NotificationCompat.FLAG_LOCAL_ONLY, (int) r4, (byte) r5));
                    pgfVar = new pgf(yi5Var, this.a);
                    sparseArray.put(i8, pgfVar);
                }
            }
            if (nl6Var.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r4;
                this.j.endTracks();
            }
        }
        nl6Var.peekFully(j9eVar2.a, r5, 2);
        j9eVar2.N(r5);
        int H = j9eVar2.H() + 6;
        if (pgfVar == null) {
            nl6Var.skipFully(H);
            return r5;
        }
        j9eVar2.K(H);
        nl6Var.readFully(j9eVar2.a, r5, H);
        j9eVar2.N(6);
        yi5 yi5Var2 = pgfVar.a;
        nm2 nm2Var = pgfVar.c;
        j9eVar2.k(nm2Var.d, r5, 3);
        nm2Var.q(r5);
        nm2Var.t(8);
        pgfVar.d = nm2Var.h();
        pgfVar.e = nm2Var.h();
        nm2Var.t(6);
        j9eVar2.k(nm2Var.d, r5, nm2Var.i(8));
        nm2Var.q(r5);
        djj djjVar2 = pgfVar.b;
        if (pgfVar.d) {
            nm2Var.t(4);
            nm2Var.t(r4);
            nm2Var.t(r4);
            long i9 = (nm2Var.i(3) << 30) | (nm2Var.i(15) << 15) | nm2Var.i(15);
            nm2Var.t(r4);
            if (!pgfVar.f && pgfVar.e) {
                nm2Var.t(4);
                nm2Var.t(r4);
                nm2Var.t(r4);
                nm2Var.t(r4);
                djjVar2.b(nm2Var.i(15) | (nm2Var.i(3) << 30) | (nm2Var.i(15) << 15));
                pgfVar.f = r4;
            }
            j2 = djjVar2.b(i9);
        } else {
            j2 = j;
        }
        yi5Var2.g(4, j2);
        yi5Var2.b(j9eVar2);
        yi5Var2.c(r5);
        j9eVar2.M(j9eVar2.a.length);
        return r5;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.j = pl6Var;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        long j3;
        SparseArray sparseArray = this.b;
        djj djjVar = this.a;
        synchronized (djjVar) {
            j3 = djjVar.b;
        }
        boolean z = j3 == C.TIME_UNSET;
        if (!z) {
            long d = djjVar.d();
            z = (d == C.TIME_UNSET || d == 0 || d == j2) ? false : true;
        }
        if (z) {
            djjVar.f(j2);
        }
        y68 y68Var = this.i;
        if (y68Var != null) {
            y68Var.e(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            pgf pgfVar = (pgf) sparseArray.valueAt(i);
            pgfVar.f = false;
            pgfVar.a.seek();
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
