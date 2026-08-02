package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cw0 implements kl6 {
    public int c;
    public ew0 e;
    public long h;
    public pu2 i;
    public int m;
    public boolean n;
    public final nkk a = new nkk(12);
    public final k9 b = new k9();
    public ol6 d = new q1f(21);
    public pu2[] g = new pu2[0];
    public long k = -1;
    public long l = -1;
    public int j = -1;
    public long f = C.TIME_UNSET;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        boolean z;
        pu2 pu2Var;
        int i;
        pu2 pu2Var2;
        long j = this.h;
        if (j != -1) {
            long j2 = ((ap4) ml6Var).d;
            if (j < j2 || j > 262144 + j2) {
                b78Var.a = j;
                z = true;
                this.h = -1L;
                if (!z) {
                    return 1;
                }
                int i2 = this.c;
                pu2 pu2Var3 = null;
                k9 k9Var = this.b;
                int i3 = 2;
                nkk nkkVar = this.a;
                switch (i2) {
                    case 0:
                        if (!d(ml6Var)) {
                            throw r9e.a("AVI Header List not found", null);
                        }
                        ((ap4) ml6Var).skipFully(12);
                        this.c = 1;
                        return 0;
                    case 1:
                        ((ap4) ml6Var).readFully(nkkVar.a, 0, 12, false);
                        nkkVar.E(0);
                        k9Var.a = nkkVar.h();
                        k9Var.b = nkkVar.h();
                        k9Var.c = 0;
                        if (k9Var.a != 1414744396) {
                            throw r9e.a("LIST expected, found: " + k9Var.a, null);
                        }
                        int h = nkkVar.h();
                        k9Var.c = h;
                        if (h == 1819436136) {
                            this.j = k9Var.b;
                            this.c = 2;
                            return 0;
                        }
                        throw r9e.a("hdrl expected, found: " + k9Var.c, null);
                    case 2:
                        int i4 = this.j - 4;
                        nkk nkkVar2 = new nkk(i4);
                        ((ap4) ml6Var).readFully(nkkVar2.a, 0, i4, false);
                        ybb b = ybb.b(1819436136, nkkVar2);
                        int i5 = b.b;
                        if (i5 != 1819436136) {
                            throw r9e.a("Unexpected header list type " + i5, null);
                        }
                        ew0 ew0Var = (ew0) b.a(ew0.class);
                        if (ew0Var == null) {
                            throw r9e.a("AviHeader not found", null);
                        }
                        this.e = ew0Var;
                        this.f = ew0Var.c * ew0Var.a;
                        ArrayList arrayList = new ArrayList();
                        av9 listIterator = b.a.listIterator(0);
                        int i6 = 0;
                        while (listIterator.hasNext()) {
                            yv0 yv0Var = (yv0) listIterator.next();
                            if (yv0Var.getType() == 1819440243) {
                                ybb ybbVar = (ybb) yv0Var;
                                int i7 = i6 + 1;
                                gw0 gw0Var = (gw0) ybbVar.a(gw0.class);
                                kgi kgiVar = (kgi) ybbVar.a(kgi.class);
                                if (gw0Var == null) {
                                    m6k.f0();
                                } else if (kgiVar == null) {
                                    m6k.f0();
                                } else {
                                    long D = lik.D(gw0Var.d, gw0Var.b * 1000000, gw0Var.c);
                                    sm8 sm8Var = kgiVar.a;
                                    pm8 a = sm8Var.a();
                                    a.a = Integer.toString(i6);
                                    int i8 = gw0Var.e;
                                    if (i8 != 0) {
                                        a.l = i8;
                                    }
                                    ogi ogiVar = (ogi) ybbVar.a(ogi.class);
                                    if (ogiVar != null) {
                                        a.b = ogiVar.a;
                                    }
                                    int f = rjc.f(sm8Var.l);
                                    if (f == 1 || f == i3) {
                                        usj track = this.d.track(i6, f);
                                        track.a(new sm8(a));
                                        pu2 pu2Var4 = new pu2(i6, f, D, gw0Var.d, track);
                                        this.f = D;
                                        pu2Var = pu2Var4;
                                        if (pu2Var != null) {
                                            arrayList.add(pu2Var);
                                        }
                                        i6 = i7;
                                    }
                                }
                                pu2Var = null;
                                if (pu2Var != null) {
                                }
                                i6 = i7;
                            }
                            i3 = 2;
                        }
                        this.g = (pu2[]) arrayList.toArray(new pu2[0]);
                        this.d.endTracks();
                        this.c = 3;
                        return 0;
                    case 3:
                        long j3 = this.k;
                        if (j3 != -1 && ((ap4) ml6Var).d != j3) {
                            this.h = j3;
                            return 0;
                        }
                        ((ap4) ml6Var).peekFully(nkkVar.a, 0, 12, false);
                        ap4 ap4Var = (ap4) ml6Var;
                        ap4Var.f = 0;
                        nkkVar.E(0);
                        k9Var.a = nkkVar.h();
                        k9Var.b = nkkVar.h();
                        k9Var.c = 0;
                        int h2 = nkkVar.h();
                        int i9 = k9Var.a;
                        if (i9 == 1179011410) {
                            ap4Var.skipFully(12);
                            return 0;
                        }
                        if (i9 != 1414744396 || h2 != 1769369453) {
                            this.h = ap4Var.d + k9Var.b + 8;
                            return 0;
                        }
                        long j4 = ap4Var.d;
                        this.k = j4;
                        this.l = j4 + k9Var.b + 8;
                        if (!this.n) {
                            ew0 ew0Var2 = this.e;
                            ew0Var2.getClass();
                            if ((ew0Var2.b & 16) == 16) {
                                this.c = 4;
                                this.h = this.l;
                                return 0;
                            }
                            this.d.d(new aw0(this.f));
                            this.n = true;
                        }
                        this.h = ap4Var.d + 12;
                        this.c = 6;
                        return 0;
                    case 4:
                        ((ap4) ml6Var).readFully(nkkVar.a, 0, 8, false);
                        nkkVar.E(0);
                        int h3 = nkkVar.h();
                        int h4 = nkkVar.h();
                        if (h3 != 829973609) {
                            this.h = ((ap4) ml6Var).d + h4;
                            return 0;
                        }
                        this.c = 5;
                        this.m = h4;
                        return 0;
                    case 5:
                        nkk nkkVar3 = new nkk(this.m);
                        ((ap4) ml6Var).readFully(nkkVar3.a, 0, this.m, false);
                        if (nkkVar3.c() >= 16) {
                            int i10 = nkkVar3.b;
                            nkkVar3.F(8);
                            long h5 = nkkVar3.h();
                            long j5 = this.k;
                            r5 = h5 <= j5 ? j5 + 8 : 0L;
                            nkkVar3.E(i10);
                        }
                        while (nkkVar3.c() >= 16) {
                            int h6 = nkkVar3.h();
                            int h7 = nkkVar3.h();
                            long h8 = nkkVar3.h() + r5;
                            nkkVar3.h();
                            pu2[] pu2VarArr = this.g;
                            int length = pu2VarArr.length;
                            while (true) {
                                if (i < length) {
                                    pu2Var2 = pu2VarArr[i];
                                    i = (pu2Var2.b == h6 || pu2Var2.c == h6) ? 0 : i + 1;
                                } else {
                                    pu2Var2 = null;
                                }
                            }
                            if (pu2Var2 != null) {
                                if ((h7 & 16) == 16) {
                                    int i11 = pu2Var2.j;
                                    int[] iArr = pu2Var2.l;
                                    if (i11 == iArr.length) {
                                        long[] jArr = pu2Var2.k;
                                        pu2Var2.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr2 = pu2Var2.l;
                                        iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                        pu2Var2.l = iArr;
                                    }
                                    long[] jArr2 = pu2Var2.k;
                                    int i12 = pu2Var2.j;
                                    jArr2[i12] = h8;
                                    iArr[i12] = pu2Var2.i;
                                    pu2Var2.j = i12 + 1;
                                }
                                pu2Var2.i++;
                            }
                        }
                        for (pu2 pu2Var5 : this.g) {
                            pu2Var5.k = Arrays.copyOf(pu2Var5.k, pu2Var5.j);
                            pu2Var5.l = Arrays.copyOf(pu2Var5.l, pu2Var5.j);
                        }
                        this.n = true;
                        this.d.d(new aw0(this, this.f, 0));
                        this.c = 6;
                        this.h = this.k;
                        return 0;
                    case 6:
                        if (((ap4) ml6Var).d >= this.l) {
                            return -1;
                        }
                        pu2 pu2Var6 = this.i;
                        if (pu2Var6 != null) {
                            usj usjVar = pu2Var6.a;
                            int i13 = pu2Var6.g;
                            int b2 = i13 - usjVar.b(ml6Var, i13, false);
                            pu2Var6.g = b2;
                            boolean z2 = b2 == 0;
                            if (z2) {
                                if (pu2Var6.f > 0) {
                                    int i14 = pu2Var6.h;
                                    usjVar.c((pu2Var6.d * i14) / pu2Var6.e, Arrays.binarySearch(pu2Var6.l, i14) >= 0 ? 1 : 0, pu2Var6.f, 0, null);
                                }
                                pu2Var6.h++;
                            }
                            if (z2) {
                                this.i = null;
                            }
                            return 0;
                        }
                        ap4 ap4Var2 = (ap4) ml6Var;
                        if ((ap4Var2.d & 1) == 1) {
                            ap4Var2.skipFully(1);
                        }
                        ap4Var2.peekFully(nkkVar.a, 0, 12, false);
                        nkkVar.E(0);
                        int h9 = nkkVar.h();
                        if (h9 == 1414744396) {
                            nkkVar.E(8);
                            ap4Var2.skipFully(nkkVar.h() == 1769369453 ? 12 : 8);
                            ap4Var2.f = 0;
                            return 0;
                        }
                        int h10 = nkkVar.h();
                        if (h9 == 1263424842) {
                            this.h = ap4Var2.d + h10 + 8;
                            return 0;
                        }
                        ap4Var2.skipFully(8);
                        ap4Var2.f = 0;
                        for (pu2 pu2Var7 : this.g) {
                            if (pu2Var7.b == h9 || pu2Var7.c == h9) {
                                pu2Var3 = pu2Var7;
                                if (pu2Var3 != null) {
                                    this.h = ap4Var2.d + h10;
                                    return 0;
                                }
                                pu2Var3.f = h10;
                                pu2Var3.g = h10;
                                this.i = pu2Var3;
                                return 0;
                            }
                        }
                        if (pu2Var3 != null) {
                        }
                        break;
                    default:
                        ogj.b();
                        return 0;
                }
            } else {
                ((ap4) ml6Var).skipFully((int) (j - j2));
            }
        }
        z = false;
        this.h = -1L;
        if (!z) {
        }
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.c = 0;
        this.d = ol6Var;
        this.h = -1L;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        nkk nkkVar = this.a;
        ml6Var.peekFully(nkkVar.a, 0, 12);
        nkkVar.E(0);
        if (nkkVar.h() == 1179011410) {
            nkkVar.F(4);
            if (nkkVar.h() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.h = -1L;
        this.i = null;
        for (pu2 pu2Var : this.g) {
            if (pu2Var.j == 0) {
                pu2Var.h = 0;
            } else {
                pu2Var.h = pu2Var.l[lik.e(pu2Var.k, j, true)];
            }
        }
        if (j != 0) {
            this.c = 6;
        } else if (this.g.length == 0) {
            this.c = 0;
        } else {
            this.c = 3;
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
