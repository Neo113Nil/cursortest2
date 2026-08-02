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
/* loaded from: classes2.dex */
public final class id8 implements kl6 {
    public final nkk a = new nkk(4);
    public final nkk b = new nkk(9);
    public final nkk c = new nkk(11);
    public final nkk d = new nkk(4, false);
    public final utg e;
    public ol6 f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public ap0 o;
    public ark p;

    public id8() {
        utg utgVar = new utg(new vd5(), 9);
        utgVar.c = C.TIME_UNSET;
        utgVar.d = new long[0];
        utgVar.e = new long[0];
        this.e = utgVar;
        this.g = 1;
    }

    public final nkk a(ml6 ml6Var) {
        int i = this.l;
        nkk nkkVar = this.d;
        byte[] bArr = nkkVar.a;
        if (i > bArr.length) {
            nkkVar.C(new byte[Math.max(bArr.length * 2, i)], 0);
        } else {
            nkkVar.E(0);
        }
        nkkVar.D(this.l);
        ml6Var.readFully(nkkVar.a, 0, this.l);
        return nkkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0007 A[SYNTHETIC] */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        long j;
        long j2;
        int i;
        long j3;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        qx9.u(this.f);
        while (true) {
            int i4 = this.g;
            if (i4 == 1) {
                nkk nkkVar = this.b;
                if (!((ap4) ml6Var).readFully(nkkVar.a, 0, 9, true)) {
                    return -1;
                }
                nkkVar.E(0);
                nkkVar.F(4);
                int s = nkkVar.s();
                boolean z4 = (s & 4) != 0;
                boolean z5 = (s & 1) != 0;
                if (z4 && this.o == null) {
                    i2 = 9;
                    this.o = new ap0(this.f.track(8, 1), 9);
                } else {
                    i2 = 9;
                }
                if (z5 && this.p == null) {
                    i3 = 2;
                    this.p = new ark(this.f.track(i2, 2));
                } else {
                    i3 = 2;
                }
                this.f.endTracks();
                this.j = nkkVar.f() - 5;
                this.g = i3;
            } else if (i4 == 2) {
                ((ap4) ml6Var).skipFully(this.j);
                this.j = 0;
                this.g = 3;
            } else if (i4 == 3) {
                nkk nkkVar2 = this.c;
                if (!((ap4) ml6Var).readFully(nkkVar2.a, 0, 11, true)) {
                    return -1;
                }
                nkkVar2.E(0);
                this.k = nkkVar2.s();
                this.l = nkkVar2.u();
                this.m = nkkVar2.u();
                this.m = ((nkkVar2.s() << 24) | this.m) * 1000;
                nkkVar2.F(3);
                this.g = 4;
            } else {
                if (i4 != 4) {
                    zzl.s();
                    return 0;
                }
                boolean z6 = this.h;
                utg utgVar = this.e;
                if (z6) {
                    j = this.i + this.m;
                } else if (utgVar.c == C.TIME_UNSET) {
                    j2 = 0;
                    i = this.k;
                    if (i != 8 && this.o != null) {
                        if (!this.n) {
                            this.f.d(new aw0(C.TIME_UNSET));
                            this.n = true;
                        }
                        ap0 ap0Var = this.o;
                        nkk a = a(ml6Var);
                        usj usjVar = (usj) ap0Var.b;
                        if (ap0Var.c) {
                            a.F(1);
                        } else {
                            int s2 = a.s();
                            int i5 = (s2 >> 4) & 15;
                            ap0Var.e = i5;
                            if (i5 == 2) {
                                int i6 = ap0.f[(s2 >> 2) & 3];
                                pm8 pm8Var = new pm8();
                                pm8Var.k = MimeTypes.AUDIO_MPEG;
                                pm8Var.x = 1;
                                pm8Var.y = i6;
                                usjVar.a(new sm8(pm8Var));
                                ap0Var.d = true;
                            } else if (i5 == 7 || i5 == 8) {
                                String str = i5 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW;
                                pm8 pm8Var2 = new pm8();
                                pm8Var2.k = str;
                                pm8Var2.x = 1;
                                pm8Var2.y = 8000;
                                usjVar.a(new sm8(pm8Var2));
                                ap0Var.d = true;
                            } else if (i5 != 10) {
                                throw new eti("Audio format not supported: " + ap0Var.e);
                            }
                            ap0Var.c = true;
                        }
                        usj usjVar2 = (usj) ap0Var.b;
                        if (ap0Var.e == 2) {
                            int c = a.c();
                            usjVar2.d(c, a);
                            ((usj) ap0Var.b).c(j2, 1, c, 0, null);
                        } else {
                            int s3 = a.s();
                            if (s3 == 0 && !ap0Var.d) {
                                int c2 = a.c();
                                byte[] bArr = new byte[c2];
                                a.e(bArr, 0, c2);
                                d0 O = kik.O(new nm2(bArr, c2, 2, (byte) 0), false);
                                pm8 pm8Var3 = new pm8();
                                pm8Var3.k = MimeTypes.AUDIO_AAC;
                                pm8Var3.h = O.c;
                                pm8Var3.x = O.b;
                                pm8Var3.y = O.a;
                                pm8Var3.m = Collections.singletonList(bArr);
                                usjVar2.a(new sm8(pm8Var3));
                                ap0Var.d = true;
                            } else if (ap0Var.e != 10 || s3 == 1) {
                                int c3 = a.c();
                                usjVar2.d(c3, a);
                                ((usj) ap0Var.b).c(j2, 1, c3, 0, null);
                            }
                            z = false;
                            z2 = true;
                            j3 = -9223372036854775807L;
                        }
                        z = true;
                        z2 = true;
                        j3 = -9223372036854775807L;
                    } else if (i == 9 || this.p == null) {
                        j3 = -9223372036854775807L;
                        if (i == 18 || this.n) {
                            ((ap4) ml6Var).skipFully(this.l);
                            z = false;
                            z2 = false;
                        } else {
                            nkk a2 = a(ml6Var);
                            if (a2.s() == 2 && "onMetaData".equals(utg.T(a2)) && a2.c() != 0 && a2.s() == 8) {
                                HashMap S = utg.S(a2);
                                Object obj = S.get(IronSourceConstants.EVENTS_DURATION);
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        utgVar.c = (long) (doubleValue * 1000000.0d);
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
                                        utgVar.d = new long[size];
                                        utgVar.e = new long[size];
                                        for (int i7 = 0; i7 < size; i7++) {
                                            Object obj5 = list.get(i7);
                                            Object obj6 = list2.get(i7);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                utgVar.d = new long[0];
                                                utgVar.e = new long[0];
                                                break;
                                            }
                                            utgVar.d[i7] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            utgVar.e[i7] = ((Double) obj5).longValue();
                                        }
                                    }
                                }
                            }
                            long j4 = utgVar.c;
                            if (j4 != C.TIME_UNSET) {
                                this.f.d(new w0a(utgVar.e, utgVar.d, j4));
                                this.n = true;
                            }
                            z2 = true;
                            z = false;
                        }
                    } else {
                        if (!this.n) {
                            this.f.d(new aw0(C.TIME_UNSET));
                            this.n = true;
                        }
                        ark arkVar = this.p;
                        nkk a3 = a(ml6Var);
                        arkVar.getClass();
                        int s4 = a3.s();
                        int i8 = (s4 >> 4) & 15;
                        int i9 = s4 & 15;
                        if (i9 != 7) {
                            throw new eti(ljg.j(i9, "Video format not supported: "));
                        }
                        arkVar.h = i8;
                        if (i8 != 5) {
                            nkk nkkVar3 = arkVar.c;
                            usj usjVar3 = (usj) arkVar.b;
                            nkk nkkVar4 = arkVar.d;
                            int s5 = a3.s();
                            byte[] bArr2 = a3.a;
                            j3 = -9223372036854775807L;
                            int i10 = a3.b;
                            int i11 = i10 + 1;
                            a3.b = i11;
                            int i12 = ((bArr2[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) >> 8;
                            a3.b = i10 + 2;
                            int i13 = i12 | ((bArr2[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                            a3.b = i10 + 3;
                            long j5 = ((i13 | (bArr2[r5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) * 1000) + j2;
                            if (s5 == 0 && !arkVar.f) {
                                byte[] bArr3 = new byte[a3.c()];
                                nkk nkkVar5 = new nkk(bArr3);
                                a3.e(bArr3, 0, a3.c());
                                vv0 a4 = vv0.a(nkkVar5);
                                arkVar.e = a4.b;
                                pm8 pm8Var4 = new pm8();
                                pm8Var4.k = "video/avc";
                                pm8Var4.h = a4.f;
                                pm8Var4.p = a4.c;
                                pm8Var4.q = a4.d;
                                pm8Var4.t = a4.e;
                                pm8Var4.m = a4.a;
                                usjVar3.a(new sm8(pm8Var4));
                                arkVar.f = true;
                            } else if (s5 == 1 && arkVar.f) {
                                int i14 = arkVar.h == 1 ? 1 : 0;
                                if (arkVar.g || i14 != 0) {
                                    byte[] bArr4 = nkkVar4.a;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i15 = 4 - arkVar.e;
                                    int i16 = 0;
                                    while (a3.c() > 0) {
                                        a3.e(nkkVar4.a, i15, arkVar.e);
                                        nkkVar4.E(0);
                                        int v = nkkVar4.v();
                                        nkkVar3.E(0);
                                        usjVar3.d(4, nkkVar3);
                                        usjVar3.d(v, a3);
                                        i16 = i16 + 4 + v;
                                    }
                                    ((usj) arkVar.b).c(j5, i14, i16, 0, null);
                                    arkVar.g = true;
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
                    if (!this.h && z) {
                        this.h = true;
                        this.i = utgVar.c != j3 ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (!z2) {
                        return 0;
                    }
                } else {
                    j = this.m;
                }
                j2 = j;
                i = this.k;
                if (i != 8) {
                }
                if (i == 9) {
                }
                j3 = -9223372036854775807L;
                if (i == 18) {
                }
                ((ap4) ml6Var).skipFully(this.l);
                z = false;
                z2 = false;
                if (!this.h) {
                    this.h = true;
                    this.i = utgVar.c != j3 ? -this.m : 0L;
                }
                this.j = 4;
                this.g = 2;
                if (!z2) {
                }
            }
        }
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.f = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        nkk nkkVar = this.a;
        ap4 ap4Var = (ap4) ml6Var;
        ap4Var.peekFully(nkkVar.a, 0, 3, false);
        nkkVar.E(0);
        if (nkkVar.u() == 4607062) {
            ap4Var.peekFully(nkkVar.a, 0, 2, false);
            nkkVar.E(0);
            if ((nkkVar.x() & 250) == 0) {
                ap4Var.peekFully(nkkVar.a, 0, 4, false);
                nkkVar.E(0);
                int f = nkkVar.f();
                ap4Var.f = 0;
                ap4Var.b(f, false);
                ap4Var.peekFully(nkkVar.a, 0, 4, false);
                nkkVar.E(0);
                if (nkkVar.f() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
