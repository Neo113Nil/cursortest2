package defpackage;

import android.util.Pair;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d59 implements yi5 {
    public static final double[] r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public vsj b;
    public final ejg c;
    public final String d;
    public final j9e e;
    public final w2d f;
    public final boolean[] g = new boolean[4];
    public final b59 h;
    public long i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public boolean q;

    public d59(ejg ejgVar, String str) {
        this.c = ejgVar;
        this.d = str;
        b59 b59Var = new b59(1);
        b59Var.e = new byte[128];
        this.h = b59Var;
        if (ejgVar != null) {
            this.f = new w2d(178, 1);
            this.e = new j9e();
        } else {
            this.f = null;
            this.e = null;
        }
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01eb  */
    @Override // defpackage.yi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j9e j9eVar) {
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
        this.b.getClass();
        int i5 = j9eVar.b;
        int i6 = j9eVar.c;
        byte[] bArr = j9eVar.a;
        this.i += j9eVar.a();
        this.b.g(j9eVar.a(), j9eVar);
        while (true) {
            int q = kik.q(bArr, i5, i6, this.g);
            b59Var = this.h;
            w2dVar = this.f;
            if (q == i6) {
                break;
            }
            int i7 = q + 3;
            int i8 = j9eVar.a[i7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i9 = q - i5;
            if (this.k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    b59Var.a(bArr, i5, q);
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
                            qm8 qm8Var = new qm8();
                            qm8Var.a = str;
                            qm8Var.m = sjc.p(this.d);
                            qm8Var.n = sjc.p(MimeTypes.VIDEO_MPEG2);
                            qm8Var.u = i13;
                            qm8Var.v = i14;
                            qm8Var.A = f2;
                            qm8Var.q = Collections.singletonList(copyOf);
                            b bVar = new b(qm8Var);
                            i4 = (copyOf[7] & 15) - 1;
                            if (i4 >= 0 || i4 >= 8) {
                                j4 = 0;
                            } else {
                                double d = r[i4];
                                byte b2 = copyOf[b59Var.d + 9];
                                int i16 = (b2 & 96) >> 5;
                                if (i16 != (b2 & 31)) {
                                    d = ((i16 + 1.0d) / (r6 + 1)) * d;
                                }
                                j4 = (long) (1000000.0d / d);
                            }
                            Pair create = Pair.create(bVar, Long.valueOf(j4));
                            this.b.d((b) create.first);
                            this.l = ((Long) create.second).longValue();
                            this.k = true;
                        } else {
                            f = i14 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                            i3 = i13 * 100;
                        }
                        f2 = f / i3;
                        qm8 qm8Var2 = new qm8();
                        qm8Var2.a = str;
                        qm8Var2.m = sjc.p(this.d);
                        qm8Var2.n = sjc.p(MimeTypes.VIDEO_MPEG2);
                        qm8Var2.u = i13;
                        qm8Var2.v = i14;
                        qm8Var2.A = f2;
                        qm8Var2.q = Collections.singletonList(copyOf);
                        b bVar2 = new b(qm8Var2);
                        i4 = (copyOf[7] & 15) - 1;
                        if (i4 >= 0) {
                        }
                        j4 = 0;
                        Pair create2 = Pair.create(bVar2, Long.valueOf(j4));
                        this.b.d((b) create2.first);
                        this.l = ((Long) create2.second).longValue();
                        this.k = true;
                    }
                } else {
                    i = i6;
                    if (i8 == 179) {
                        b59Var.b = true;
                    }
                }
                b59Var.a(b59.g, 0, 3);
            }
            if (w2dVar != null) {
                if (i9 > 0) {
                    w2dVar.a(bArr, i5, q);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (w2dVar.b(i2)) {
                    int d0 = kik.d0((byte[]) w2dVar.e, w2dVar.f);
                    String str2 = nik.a;
                    byte[] bArr2 = (byte[]) w2dVar.e;
                    j9e j9eVar2 = this.e;
                    j9eVar2.L(bArr2, d0);
                    this.c.e(this.o, j9eVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (j9eVar.a[q + 2] == 1) {
                        w2dVar.e(i8);
                    }
                    if (i8 != 0 || i8 == 179) {
                        int i17 = i - q;
                        if (this.q && this.k) {
                            j3 = this.o;
                            if (j3 != C.TIME_UNSET) {
                                j = -9223372036854775807L;
                                this.b.a(j3, this.p ? 1 : 0, ((int) (this.i - this.n)) - i17, i17, null);
                                if (this.j || this.q) {
                                    this.n = this.i - i17;
                                    j2 = this.m;
                                    if (j2 == j) {
                                        long j5 = this.o;
                                        j2 = j5 != j ? j5 + this.l : j;
                                    }
                                    this.o = j2;
                                    z2 = false;
                                    this.p = false;
                                    this.m = j;
                                    z3 = true;
                                    this.j = true;
                                } else {
                                    z3 = true;
                                    z2 = false;
                                }
                                this.q = i8 == 0 ? z3 : z2;
                            }
                        }
                        j = -9223372036854775807L;
                        if (this.j) {
                        }
                        this.n = this.i - i17;
                        j2 = this.m;
                        if (j2 == j) {
                        }
                        this.o = j2;
                        z2 = false;
                        this.p = false;
                        this.m = j;
                        z3 = true;
                        this.j = true;
                        this.q = i8 == 0 ? z3 : z2;
                    } else if (i8 == 184) {
                        this.p = z;
                    }
                    i5 = i7;
                    i6 = i;
                }
            }
            z = true;
            if (i8 != 0) {
            }
            int i172 = i - q;
            if (this.q) {
                j3 = this.o;
                if (j3 != C.TIME_UNSET) {
                }
            }
            j = -9223372036854775807L;
            if (this.j) {
            }
            this.n = this.i - i172;
            j2 = this.m;
            if (j2 == j) {
            }
            this.o = j2;
            z2 = false;
            this.p = false;
            this.m = j;
            z3 = true;
            this.j = true;
            this.q = i8 == 0 ? z3 : z2;
            i5 = i7;
            i6 = i;
        }
        if (!this.k) {
            b59Var.a(bArr, i5, i6);
        }
        if (w2dVar != null) {
            w2dVar.a(bArr, i5, i6);
        }
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
        this.b.getClass();
        if (z) {
            boolean z2 = this.p;
            this.b.a(this.o, z2 ? 1 : 0, (int) (this.i - this.n), 0, null);
        }
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.a = c2kVar.f;
        c2kVar.b();
        this.b = pl6Var.mo2track(c2kVar.e, 2);
        ejg ejgVar = this.c;
        if (ejgVar != null) {
            ejgVar.g(pl6Var, c2kVar);
        }
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.m = j;
    }

    @Override // defpackage.yi5
    public final void seek() {
        kik.m(this.g);
        b59 b59Var = this.h;
        b59Var.b = false;
        b59Var.c = 0;
        b59Var.d = 0;
        w2d w2dVar = this.f;
        if (w2dVar != null) {
            w2dVar.d();
        }
        this.i = 0L;
        this.j = false;
        this.m = C.TIME_UNSET;
        this.o = C.TIME_UNSET;
    }
}
