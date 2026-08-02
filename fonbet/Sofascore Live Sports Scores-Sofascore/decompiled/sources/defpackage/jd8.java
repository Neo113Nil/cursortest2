package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jd8 implements ll6 {
    public final j9e a = new j9e(4);
    public final j9e b = new j9e(9);
    public final j9e c = new j9e(11);
    public final j9e d = new j9e();
    public final vtg e;
    public pl6 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public bp0 o;
    public brk p;

    public jd8() {
        vtg vtgVar = new vtg(new q35(), 10);
        vtgVar.c = C.TIME_UNSET;
        vtgVar.d = new long[0];
        vtgVar.e = new long[0];
        this.e = vtgVar;
        this.g = 1;
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        j9e j9eVar = this.a;
        bp4 bp4Var = (bp4) nl6Var;
        bp4Var.peekFully(j9eVar.a, 0, 3, false);
        j9eVar.N(0);
        if (j9eVar.D() == 4607062) {
            bp4Var.peekFully(j9eVar.a, 0, 2, false);
            j9eVar.N(0);
            if ((j9eVar.H() & 250) == 0) {
                bp4Var.peekFully(j9eVar.a, 0, 4, false);
                j9eVar.N(0);
                int m = j9eVar.m();
                bp4Var.f = 0;
                bp4Var.c(m, false);
                bp4Var.peekFully(j9eVar.a, 0, 4, false);
                j9eVar.N(0);
                if (j9eVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0009 A[SYNTHETIC] */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i;
        long j;
        long j2;
        int i2;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        this.f.getClass();
        while (true) {
            int i4 = this.g;
            int i5 = 10;
            if (i4 == 1) {
                j9e j9eVar = this.b;
                if (!nl6Var.readFully(j9eVar.a, 0, 9, true)) {
                    return -1;
                }
                j9eVar.N(0);
                j9eVar.O(4);
                int A = j9eVar.A();
                boolean z4 = (A & 4) != 0;
                boolean z5 = (A & 1) != 0;
                if (z4 && this.o == null) {
                    this.o = new bp0(this.f.mo2track(8, 1), i5);
                }
                if (z5 && this.p == null) {
                    i3 = 2;
                    this.p = new brk(this.f.mo2track(9, 2));
                } else {
                    i3 = 2;
                }
                this.f.endTracks();
                this.j = j9eVar.m() - 5;
                this.g = i3;
            } else if (i4 == 2) {
                nl6Var.skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i4 == 3) {
                j9e j9eVar2 = this.c;
                if (!nl6Var.readFully(j9eVar2.a, 0, 11, true)) {
                    return -1;
                }
                j9eVar2.N(0);
                this.k = j9eVar2.A();
                this.l = j9eVar2.D();
                this.m = j9eVar2.D();
                this.m = ((j9eVar2.A() << 24) | this.m) * 1000;
                j9eVar2.O(3);
                this.g = 4;
            } else {
                if (i4 != 4) {
                    zzl.s();
                    return 0;
                }
                boolean z6 = this.h;
                vtg vtgVar = this.e;
                if (z6) {
                    i = 3;
                    j = this.i + this.m;
                } else {
                    i = 3;
                    if (vtgVar.c == C.TIME_UNSET) {
                        j2 = 0;
                        i2 = this.k;
                        if (i2 == 8 || this.o == null) {
                            int i6 = 4;
                            if (i2 == 9 || this.p == null) {
                                j3 = -9223372036854775807L;
                                if (i2 == 18 || this.n) {
                                    nl6Var.skipFully(this.l);
                                    z = false;
                                    z2 = false;
                                } else {
                                    j9e f = f(nl6Var);
                                    if (f.A() == 2 && "onMetaData".equals(vtg.T(f)) && f.a() != 0 && f.A() == 8) {
                                        HashMap S = vtg.S(f);
                                        Object obj = S.get(IronSourceConstants.EVENTS_DURATION);
                                        if (obj instanceof Double) {
                                            double doubleValue = ((Double) obj).doubleValue();
                                            if (doubleValue > 0.0d) {
                                                vtgVar.c = (long) (doubleValue * 1000000.0d);
                                            }
                                        }
                                        Object obj2 = S.get("keyframes");
                                        if (obj2 instanceof Map) {
                                            Map map = (Map) obj2;
                                            Object obj3 = map.get("filepositions");
                                            Object obj4 = map.get("times");
                                            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                                List list = (List) obj3;
                                                List list2 = (List) obj4;
                                                int size = list2.size();
                                                vtgVar.d = new long[size];
                                                vtgVar.e = new long[size];
                                                for (int i7 = 0; i7 < size; i7++) {
                                                    Object obj5 = list.get(i7);
                                                    Object obj6 = list2.get(i7);
                                                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                        vtgVar.d = new long[0];
                                                        vtgVar.e = new long[0];
                                                        break;
                                                    }
                                                    vtgVar.d[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                                    vtgVar.e[i7] = ((Double) obj5).longValue();
                                                }
                                            }
                                        }
                                    }
                                    long j4 = vtgVar.c;
                                    if (j4 != C.TIME_UNSET) {
                                        this.f.m(new x0a(vtgVar.e, vtgVar.d, j4));
                                        this.n = true;
                                    }
                                    z2 = true;
                                    z = false;
                                }
                            } else {
                                if (!this.n) {
                                    this.f.m(new bw0(C.TIME_UNSET));
                                    this.n = true;
                                }
                                brk brkVar = this.p;
                                j9e f2 = f(nl6Var);
                                brkVar.getClass();
                                int A2 = f2.A();
                                int i8 = (A2 >> 4) & 15;
                                int i9 = A2 & 15;
                                if (i9 != 7) {
                                    throw new fti(ljg.j(i9, "Video format not supported: "));
                                }
                                brkVar.h = i8;
                                if (i8 != 5) {
                                    j9e j9eVar3 = brkVar.c;
                                    vsj vsjVar = (vsj) brkVar.b;
                                    j9e j9eVar4 = brkVar.d;
                                    int A3 = f2.A();
                                    f2.f(3);
                                    byte[] bArr = f2.a;
                                    j3 = -9223372036854775807L;
                                    int i10 = f2.b;
                                    int i11 = i10 + 1;
                                    f2.b = i11;
                                    int i12 = ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
                                    f2.b = i10 + 2;
                                    int i13 = i12 | ((bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                                    f2.b = i10 + 3;
                                    long j5 = (((bArr[r7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | i13) * 1000) + j2;
                                    if (A3 == 0 && !brkVar.f) {
                                        byte[] bArr2 = new byte[f2.a()];
                                        j9e j9eVar5 = new j9e(bArr2);
                                        f2.k(bArr2, 0, f2.a());
                                        wv0 a = wv0.a(j9eVar5);
                                        brkVar.e = a.b;
                                        qm8 qm8Var = new qm8();
                                        qm8Var.m = sjc.p("video/x-flv");
                                        qm8Var.n = sjc.p("video/avc");
                                        qm8Var.j = a.l;
                                        qm8Var.u = a.c;
                                        qm8Var.v = a.d;
                                        qm8Var.A = a.k;
                                        qm8Var.q = a.a;
                                        w1l.r(qm8Var, vsjVar);
                                        brkVar.f = true;
                                    } else if (A3 == 1 && brkVar.f) {
                                        int i14 = brkVar.h == 1 ? 1 : 0;
                                        if (brkVar.g || i14 != 0) {
                                            byte[] bArr3 = j9eVar4.a;
                                            int i15 = 0;
                                            bArr3[0] = 0;
                                            bArr3[1] = 0;
                                            bArr3[2] = 0;
                                            int i16 = 4 - brkVar.e;
                                            int i17 = 0;
                                            while (f2.a() > 0) {
                                                f2.k(j9eVar4.a, i16, brkVar.e);
                                                j9eVar4.N(i15);
                                                int E = j9eVar4.E();
                                                j9eVar3.N(i15);
                                                vsjVar.g(i6, j9eVar3);
                                                vsjVar.g(E, f2);
                                                i17 = i17 + 4 + E;
                                                i15 = 0;
                                                i6 = 4;
                                            }
                                            ((vsj) brkVar.b).a(j5, i14, i17, 0, null);
                                            brkVar.g = true;
                                            z3 = true;
                                            if (z3) {
                                                z = true;
                                                z2 = true;
                                            }
                                        }
                                    }
                                    z3 = false;
                                    if (z3) {
                                    }
                                } else {
                                    j3 = -9223372036854775807L;
                                }
                                z = false;
                                z2 = true;
                            }
                        } else {
                            if (!this.n) {
                                this.f.m(new bw0(C.TIME_UNSET));
                                this.n = true;
                            }
                            bp0 bp0Var = this.o;
                            j9e f3 = f(nl6Var);
                            vsj vsjVar2 = (vsj) bp0Var.b;
                            if (bp0Var.c) {
                                f3.O(1);
                            } else {
                                int A4 = f3.A();
                                int i18 = (A4 >> 4) & 15;
                                bp0Var.e = i18;
                                if (i18 == 2) {
                                    int i19 = bp0.f[(A4 >> 2) & 3];
                                    qm8 qm8Var2 = new qm8();
                                    qm8Var2.m = sjc.p("video/x-flv");
                                    qm8Var2.n = sjc.p(MimeTypes.AUDIO_MPEG);
                                    qm8Var2.F = 1;
                                    qm8Var2.G = i19;
                                    w1l.r(qm8Var2, vsjVar2);
                                    bp0Var.d = true;
                                } else if (i18 == 7 || i18 == 8) {
                                    String str = i18 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                                    qm8 qm8Var3 = new qm8();
                                    qm8Var3.m = sjc.p("video/x-flv");
                                    qm8Var3.n = sjc.p(str);
                                    qm8Var3.F = 1;
                                    qm8Var3.G = 8000;
                                    w1l.r(qm8Var3, vsjVar2);
                                    bp0Var.d = true;
                                } else if (i18 != 10) {
                                    throw new fti("Audio format not supported: " + bp0Var.e);
                                }
                                bp0Var.c = true;
                            }
                            vsj vsjVar3 = (vsj) bp0Var.b;
                            if (bp0Var.e == 2) {
                                int a2 = f3.a();
                                vsjVar3.g(a2, f3);
                                ((vsj) bp0Var.b).a(j2, 1, a2, 0, null);
                            } else {
                                int A5 = f3.A();
                                if (A5 == 0 && !bp0Var.d) {
                                    int a3 = f3.a();
                                    byte[] bArr4 = new byte[a3];
                                    f3.k(bArr4, 0, a3);
                                    d0 K = lz.K(new nm2(bArr4, a3, i, (byte) 0), false);
                                    qm8 qm8Var4 = new qm8();
                                    qm8Var4.m = sjc.p("video/x-flv");
                                    qm8Var4.n = sjc.p(MimeTypes.AUDIO_AAC);
                                    qm8Var4.j = K.c;
                                    qm8Var4.F = K.b;
                                    qm8Var4.G = K.a;
                                    qm8Var4.q = Collections.singletonList(bArr4);
                                    w1l.r(qm8Var4, vsjVar3);
                                    bp0Var.d = true;
                                } else if (bp0Var.e != 10 || A5 == 1) {
                                    int a4 = f3.a();
                                    vsjVar3.g(a4, f3);
                                    ((vsj) bp0Var.b).a(j2, 1, a4, 0, null);
                                }
                                z = false;
                                z2 = true;
                                j3 = -9223372036854775807L;
                            }
                            z = true;
                            z2 = true;
                            j3 = -9223372036854775807L;
                        }
                        if (!this.h && z) {
                            this.h = true;
                            this.i = vtgVar.c != j3 ? -this.m : 0L;
                        }
                        this.j = 4;
                        this.g = 2;
                        if (!z2) {
                            return 0;
                        }
                    } else {
                        j = this.m;
                    }
                }
                j2 = j;
                i2 = this.k;
                if (i2 == 8) {
                }
                int i62 = 4;
                if (i2 == 9) {
                }
                j3 = -9223372036854775807L;
                if (i2 == 18) {
                }
                nl6Var.skipFully(this.l);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = vtgVar.c != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.f = pl6Var;
    }

    public final j9e f(nl6 nl6Var) {
        int i = this.l;
        j9e j9eVar = this.d;
        byte[] bArr = j9eVar.a;
        if (i > bArr.length) {
            j9eVar.L(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            j9eVar.N(0);
        }
        j9eVar.M(this.l);
        nl6Var.readFully(j9eVar.a, 0, this.l);
        return j9eVar;
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
