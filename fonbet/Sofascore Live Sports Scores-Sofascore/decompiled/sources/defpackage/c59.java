package defpackage;

import android.util.Pair;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c59 implements xi5 {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public usj b;
    public final b2h c;
    public final nkk d;
    public final w2d e;
    public final boolean[] f = new boolean[4];
    public final b59 g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public c59(b2h b2hVar) {
        this.c = b2hVar;
        b59 b59Var = new b59(0);
        b59Var.e = new byte[128];
        this.g = b59Var;
        if (b2hVar != null) {
            this.e = new w2d(178, 0);
            this.d = new nkk(4, false);
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = C.TIME_UNSET;
        this.n = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nkk nkkVar) {
        b59 b59Var;
        w2d w2dVar;
        int i;
        boolean z;
        long j;
        long j2;
        boolean z2;
        boolean z3;
        long j3;
        int i2;
        float f;
        int i3;
        float f2;
        int i4;
        long j4;
        qx9.u(this.b);
        int i5 = nkkVar.b;
        int i6 = nkkVar.c;
        byte[] bArr = nkkVar.a;
        this.h += nkkVar.c();
        this.b.d(nkkVar.c(), nkkVar);
        while (true) {
            int L = hkg.L(bArr, i5, i6, this.f);
            b59Var = this.g;
            w2dVar = this.e;
            if (L == i6) {
                break;
            }
            int i7 = L + 3;
            int i8 = nkkVar.a[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = L - i5;
            if (this.j) {
                i = i6;
            } else {
                if (i9 > 0) {
                    b59Var.a(bArr, i5, L);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                if (b59Var.b) {
                    int i11 = b59Var.c - i10;
                    b59Var.c = i11;
                    if (b59Var.d == 0 && i8 == 181) {
                        b59Var.d = i11;
                        i = i6;
                    } else {
                        b59Var.b = false;
                        String str = this.a;
                        str.getClass();
                        byte[] copyOf = Arrays.copyOf((byte[]) b59Var.e, b59Var.c);
                        int i12 = copyOf[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                        byte b = copyOf[5];
                        i = i6;
                        int i13 = ((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4) | (i12 << 4);
                        int i14 = (copyOf[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((b & 15) << 8);
                        int i15 = (copyOf[7] & 240) >> 4;
                        if (i15 == 2) {
                            f = i14 * 4;
                            i3 = i13 * 3;
                        } else if (i15 == 3) {
                            f = i14 * 16;
                            i3 = i13 * 9;
                        } else if (i15 != 4) {
                            f2 = 1.0f;
                            pm8 pm8Var = new pm8();
                            pm8Var.a = str;
                            pm8Var.k = MimeTypes.VIDEO_MPEG2;
                            pm8Var.p = i13;
                            pm8Var.q = i14;
                            pm8Var.t = f2;
                            pm8Var.m = Collections.singletonList(copyOf);
                            sm8 sm8Var = new sm8(pm8Var);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = q[i4];
                                byte b2 = copyOf[b59Var.d + 9];
                                int i16 = (b2 & 96) >> 5;
                                if (i16 != (b2 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(sm8Var, Long.valueOf(j4));
                            this.b.a((sm8) create.first);
                            this.k = ((Long) create.second).longValue();
                            this.j = true;
                        } else {
                            f = i14 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        pm8 pm8Var2 = new pm8();
                        pm8Var2.a = str;
                        pm8Var2.k = MimeTypes.VIDEO_MPEG2;
                        pm8Var2.p = i13;
                        pm8Var2.q = i14;
                        pm8Var2.t = f2;
                        pm8Var2.m = Collections.singletonList(copyOf);
                        sm8 sm8Var2 = new sm8(pm8Var2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(sm8Var2, Long.valueOf(j4));
                        this.b.a((sm8) create2.first);
                        this.k = ((Long) create2.second).longValue();
                        this.j = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        b59Var.b = true;
                    }
                }
                b59Var.a(b59.f, 0, 3);
            }
            if (w2dVar != null) {
                if (i9 > 0) {
                    w2dVar.a(bArr, i5, L);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (w2dVar.b(i2)) {
                    int t0 = hkg.t0((byte[]) w2dVar.e, w2dVar.f);
                    int i17 = lik.a;
                    byte[] bArr2 = (byte[]) w2dVar.e;
                    nkk nkkVar2 = this.d;
                    nkkVar2.C(bArr2, t0);
                    this.c.a(this.n, nkkVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (nkkVar.a[L + 2] == 1) {
                        w2dVar.e(i8);
                    }
                    if (i8 != 0 || i8 == 179) {
                        int i18 = i - L;
                        if (this.p && this.j) {
                            j3 = this.n;
                            if (j3 != C.TIME_UNSET) {
                                j = -9223372036854775807L;
                                this.b.c(j3, this.o ? 1 : 0, ((int) (this.h - this.m)) - i18, i18, null);
                                if (this.i || this.p) {
                                    this.m = this.h - i18;
                                    j2 = this.l;
                                    if (j2 == j) {
                                        long j5 = this.n;
                                        j2 = j5 != j ? j5 + this.k : j;
                                    }
                                    this.n = j2;
                                    z2 = false;
                                    this.o = false;
                                    this.l = j;
                                    z3 = true;
                                    this.i = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.p = i8 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.i) {
                        }
                        this.m = this.h - i18;
                        j2 = this.l;
                        if (j2 == j) {
                        }
                        this.n = j2;
                        z2 = false;
                        this.o = false;
                        this.l = j;
                        z3 = true;
                        this.i = true;
                        this.p = i8 == 0 ? z3 : z2;
                    } else if (i8 == 184) {
                        this.o = z;
                    }
                    i5 = i7;
                    i6 = i;
                }
            }
            z = true;
            if (i8 != 0) {
            }
            int i182 = i - L;
            if (this.p) {
                j3 = this.n;
                if (j3 != C.TIME_UNSET) {
                }
            }
            j = -9223372036854775807L;
            if (this.i) {
            }
            this.m = this.h - i182;
            j2 = this.l;
            if (j2 == j) {
            }
            this.n = j2;
            z2 = false;
            this.o = false;
            this.l = j;
            z3 = true;
            this.i = true;
            this.p = i8 == 0 ? z3 : z2;
            i5 = i7;
            i6 = i;
        }
        if (!this.j) {
            b59Var.a(bArr, i5, i6);
        }
        if (w2dVar != null) {
            w2dVar.a(bArr, i5, i6);
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.a = c2kVar.f;
        c2kVar.b();
        this.b = ol6Var.track(c2kVar.e, 2);
        b2h b2hVar = this.c;
        if (b2hVar != null) {
            b2hVar.b(ol6Var, c2kVar);
        }
    }

    @Override // defpackage.xi5
    public final void seek() {
        hkg.z(this.f);
        b59 b59Var = this.g;
        b59Var.b = false;
        b59Var.c = 0;
        b59Var.d = 0;
        w2d w2dVar = this.e;
        if (w2dVar != null) {
            w2dVar.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = C.TIME_UNSET;
        this.n = C.TIME_UNSET;
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
    }
}
