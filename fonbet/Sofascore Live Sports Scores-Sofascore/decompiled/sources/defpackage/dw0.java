package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dw0 implements ll6 {
    public final j9e a;
    public final k9 b;
    public final boolean c;
    public final zic d;
    public int e;
    public pl6 f;
    public fw0 g;
    public long h;
    public qu2[] i;
    public long j;
    public qu2 k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public dw0(int i, zic zicVar) {
        this.d = zicVar;
        this.c = (i & 1) == 0;
        this.a = new j9e(12);
        this.b = new k9();
        this.f = new kpg(28);
        this.i = new qu2[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = C.TIME_UNSET;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        j9e j9eVar = this.a;
        nl6Var.peekFully(j9eVar.a, 0, 12);
        j9eVar.N(0);
        if (j9eVar.o() == 1179011410) {
            j9eVar.O(4);
            if (j9eVar.o() == 541677121) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        boolean z;
        int i;
        qu2 qu2Var;
        long j;
        int i2;
        int i3;
        qu2 qu2Var2;
        int i4 = 0;
        if (this.j != -1) {
            long position = nl6Var.getPosition();
            long j2 = this.j;
            if (j2 < position || j2 > 262144 + position) {
                b78Var.a = j2;
                z = true;
                this.j = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.e;
                int i6 = 4;
                qu2 qu2Var3 = null;
                k9 k9Var = this.b;
                int i7 = 2;
                j9e j9eVar = this.a;
                switch (i5) {
                    case 0:
                        if (!a(nl6Var)) {
                            throw s9e.a(null, "AVI Header List not found");
                        }
                        nl6Var.skipFully(12);
                        this.e = 1;
                        return 0;
                    case 1:
                        nl6Var.readFully(j9eVar.a, 0, 12);
                        j9eVar.N(0);
                        k9Var.a = j9eVar.o();
                        k9Var.b = j9eVar.o();
                        k9Var.c = 0;
                        if (k9Var.a != 1414744396) {
                            throw s9e.a(null, "LIST expected, found: " + k9Var.a);
                        }
                        int o = j9eVar.o();
                        k9Var.c = o;
                        if (o == 1819436136) {
                            this.l = k9Var.b;
                            this.e = 2;
                            return 0;
                        }
                        throw s9e.a(null, "hdrl expected, found: " + k9Var.c);
                    case 2:
                        int i8 = this.l - 4;
                        j9e j9eVar2 = new j9e(i8);
                        nl6Var.readFully(j9eVar2.a, 0, i8);
                        zbb b = zbb.b(1819436136, j9eVar2);
                        int i9 = b.b;
                        if (i9 != 1819436136) {
                            throw s9e.a(null, "Unexpected header list type " + i9);
                        }
                        fw0 fw0Var = (fw0) b.a(fw0.class);
                        if (fw0Var == null) {
                            throw s9e.a(null, "AviHeader not found");
                        }
                        this.g = fw0Var;
                        this.h = fw0Var.c * fw0Var.a;
                        ArrayList arrayList = new ArrayList();
                        av9 listIterator = b.a.listIterator(0);
                        int i10 = 0;
                        while (listIterator.hasNext()) {
                            zv0 zv0Var = (zv0) listIterator.next();
                            if (zv0Var.getType() == 1819440243) {
                                zbb zbbVar = (zbb) zv0Var;
                                int i11 = i10 + 1;
                                hw0 hw0Var = (hw0) zbbVar.a(hw0.class);
                                lgi lgiVar = (lgi) zbbVar.a(lgi.class);
                                if (hw0Var == null) {
                                    tgj.d0("Missing Stream Header");
                                } else if (lgiVar == null) {
                                    tgj.d0("Missing Stream Format");
                                } else {
                                    i = i11;
                                    long j3 = hw0Var.c;
                                    String str = nik.a;
                                    long b0 = nik.b0(hw0Var.d, hw0Var.b * 1000000, j3, RoundingMode.DOWN);
                                    b bVar = lgiVar.a;
                                    qm8 a = bVar.a();
                                    a.a = Integer.toString(i10);
                                    int i12 = hw0Var.e;
                                    if (i12 != 0) {
                                        a.o = i12;
                                    }
                                    pgi pgiVar = (pgi) zbbVar.a(pgi.class);
                                    if (pgiVar != null) {
                                        a.b = pgiVar.a;
                                    }
                                    int i13 = sjc.i(bVar.o);
                                    if (i13 == 1 || i13 == i7) {
                                        vsj mo2track = this.f.mo2track(i10, i13);
                                        mo2track.d(new b(a));
                                        mo2track.f(b0);
                                        this.h = Math.max(this.h, b0);
                                        qu2Var = new qu2(i10, hw0Var, mo2track);
                                        if (qu2Var != null) {
                                            arrayList.add(qu2Var);
                                        }
                                        i10 = i;
                                    }
                                    qu2Var = null;
                                    if (qu2Var != null) {
                                    }
                                    i10 = i;
                                }
                                i = i11;
                                qu2Var = null;
                                if (qu2Var != null) {
                                }
                                i10 = i;
                            }
                            i4 = 0;
                            i7 = 2;
                        }
                        int i14 = i4;
                        this.i = (qu2[]) arrayList.toArray(new qu2[i14]);
                        this.f.endTracks();
                        this.e = 3;
                        return i14;
                    case 3:
                        if (this.m != -1) {
                            long position2 = nl6Var.getPosition();
                            long j4 = this.m;
                            if (position2 != j4) {
                                this.j = j4;
                                return 0;
                            }
                        }
                        nl6Var.peekFully(j9eVar.a, 0, 12);
                        nl6Var.resetPeekPosition();
                        j9eVar.N(0);
                        k9Var.a = j9eVar.o();
                        k9Var.b = j9eVar.o();
                        k9Var.c = 0;
                        int o2 = j9eVar.o();
                        int i15 = k9Var.a;
                        if (i15 == 1179011410) {
                            nl6Var.skipFully(12);
                            return 0;
                        }
                        if (i15 != 1414744396 || o2 != 1769369453) {
                            this.j = nl6Var.getPosition() + k9Var.b + 8;
                            return 0;
                        }
                        long position3 = nl6Var.getPosition();
                        this.m = position3;
                        this.n = position3 + k9Var.b + 8;
                        if (!this.p) {
                            fw0 fw0Var2 = this.g;
                            fw0Var2.getClass();
                            if ((fw0Var2.b & 16) == 16) {
                                this.e = 4;
                                this.j = this.n;
                                return 0;
                            }
                            this.f.m(new bw0(this.h));
                            this.p = true;
                        }
                        this.j = nl6Var.getPosition() + 12;
                        this.e = 6;
                        return 0;
                    case 4:
                        nl6Var.readFully(j9eVar.a, 0, 8);
                        j9eVar.N(0);
                        int o3 = j9eVar.o();
                        int o4 = j9eVar.o();
                        if (o3 != 829973609) {
                            this.j = nl6Var.getPosition() + o4;
                            return 0;
                        }
                        this.e = 5;
                        this.o = o4;
                        return 0;
                    case 5:
                        j9e j9eVar3 = new j9e(this.o);
                        nl6Var.readFully(j9eVar3.a, 0, this.o);
                        if (j9eVar3.a() < 16) {
                            j = 0;
                        } else {
                            int i16 = j9eVar3.b;
                            j9eVar3.O(8);
                            long o5 = j9eVar3.o();
                            long j5 = this.m;
                            j = o5 > j5 ? 0L : j5 + 8;
                            j9eVar3.N(i16);
                        }
                        while (j9eVar3.a() >= 16) {
                            int o6 = j9eVar3.o();
                            int o7 = j9eVar3.o();
                            long o8 = j9eVar3.o() + j;
                            j9eVar3.O(i6);
                            qu2[] qu2VarArr = this.i;
                            int length = qu2VarArr.length;
                            while (true) {
                                if (i3 < length) {
                                    qu2Var2 = qu2VarArr[i3];
                                    i3 = (qu2Var2.c == o6 || qu2Var2.d == o6) ? 0 : i3 + 1;
                                } else {
                                    qu2Var2 = null;
                                }
                            }
                            if (qu2Var2 != null) {
                                boolean z2 = (o7 & 16) == 16;
                                if (qu2Var2.l == -1) {
                                    qu2Var2.l = o8;
                                }
                                if (z2) {
                                    int i17 = qu2Var2.k;
                                    int[] iArr = qu2Var2.n;
                                    if (i17 == iArr.length) {
                                        long[] jArr = qu2Var2.m;
                                        qu2Var2.m = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                                        int[] iArr2 = qu2Var2.n;
                                        iArr = Arrays.copyOf(iArr2, (iArr2.length * 3) / 2);
                                        qu2Var2.n = iArr;
                                    }
                                    long[] jArr2 = qu2Var2.m;
                                    int i18 = qu2Var2.k;
                                    jArr2[i18] = o8;
                                    iArr[i18] = qu2Var2.j;
                                    qu2Var2.k = i18 + 1;
                                }
                                qu2Var2.j++;
                            }
                            i6 = 4;
                        }
                        for (qu2 qu2Var4 : this.i) {
                            qu2Var4.m = Arrays.copyOf(qu2Var4.m, qu2Var4.k);
                            qu2Var4.n = Arrays.copyOf(qu2Var4.n, qu2Var4.k);
                            if ((qu2Var4.c & 1651965952) == 1651965952 && qu2Var4.a.f != 0 && (i2 = qu2Var4.k) > 0) {
                                qu2Var4.f = i2;
                            }
                        }
                        this.p = true;
                        int length2 = this.i.length;
                        pl6 pl6Var = this.f;
                        long j6 = this.h;
                        if (length2 == 0) {
                            pl6Var.m(new bw0(j6));
                        } else {
                            pl6Var.m(new bw0(this, j6, 0));
                        }
                        this.e = 6;
                        this.j = this.m;
                        return 0;
                    case 6:
                        if (nl6Var.getPosition() >= this.n) {
                            return -1;
                        }
                        qu2 qu2Var5 = this.k;
                        if (qu2Var5 != null) {
                            vsj vsjVar = qu2Var5.b;
                            int i19 = qu2Var5.h;
                            int c = i19 - vsjVar.c(nl6Var, i19, false);
                            qu2Var5.h = c;
                            boolean z3 = c == 0;
                            if (z3) {
                                if (qu2Var5.g > 0) {
                                    int i20 = qu2Var5.i;
                                    vsjVar.a((qu2Var5.e * i20) / qu2Var5.f, Arrays.binarySearch(qu2Var5.n, i20) >= 0 ? 1 : 0, qu2Var5.g, 0, null);
                                }
                                qu2Var5.i++;
                            }
                            if (z3) {
                                this.k = null;
                            }
                            return 0;
                        }
                        if ((nl6Var.getPosition() & 1) == 1) {
                            nl6Var.skipFully(1);
                        }
                        nl6Var.peekFully(j9eVar.a, 0, 12);
                        j9eVar.N(0);
                        int o9 = j9eVar.o();
                        if (o9 == 1414744396) {
                            j9eVar.N(8);
                            nl6Var.skipFully(j9eVar.o() == 1769369453 ? 12 : 8);
                            nl6Var.resetPeekPosition();
                            return 0;
                        }
                        int o10 = j9eVar.o();
                        if (o9 == 1263424842) {
                            this.j = nl6Var.getPosition() + o10 + 8;
                            return 0;
                        }
                        nl6Var.skipFully(8);
                        nl6Var.resetPeekPosition();
                        for (qu2 qu2Var6 : this.i) {
                            if (qu2Var6.c == o9 || qu2Var6.d == o9) {
                                qu2Var3 = qu2Var6;
                                if (qu2Var3 != null) {
                                    this.j = nl6Var.getPosition() + o10;
                                    return 0;
                                }
                                qu2Var3.g = o10;
                                qu2Var3.h = o10;
                                this.k = qu2Var3;
                                return 0;
                            }
                        }
                        if (qu2Var3 != null) {
                        }
                        break;
                    default:
                        ogj.b();
                        return 0;
                }
            } else {
                nl6Var.skipFully((int) (j2 - position));
            }
        }
        z = false;
        this.j = -1L;
        if (!z) {
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.e = 0;
        if (this.c) {
            pl6Var = new en0(pl6Var, this.d);
        }
        this.f = pl6Var;
        this.j = -1L;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (qu2 qu2Var : this.i) {
            if (qu2Var.k == 0) {
                qu2Var.i = 0;
            } else {
                qu2Var.i = qu2Var.n[nik.f(qu2Var.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
