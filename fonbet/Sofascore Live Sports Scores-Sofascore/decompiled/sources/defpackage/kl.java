package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kl implements yi5 {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public vsj h;
    public vsj i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public vsj v;
    public long w;
    public final nm2 b = new nm2(new byte[7], 7, 3, (byte) 0);
    public final j9e c = new j9e(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = C.TIME_UNSET;
    public long u = C.TIME_UNSET;
    public int j = 0;
    public int k = 0;
    public int l = NotificationCompat.FLAG_LOCAL_ONLY;

    public kl(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    @Override // defpackage.yi5
    public final void b(j9e j9eVar) {
        int i;
        int i2;
        byte b;
        char c;
        ?? r4;
        int i3;
        char c2;
        int i4;
        char c3;
        int i5;
        this.h.getClass();
        String str = nik.a;
        while (j9eVar.a() > 0) {
            int i6 = this.j;
            char c4 = 65535;
            j9e j9eVar2 = this.c;
            int i7 = 3;
            nm2 nm2Var = this.b;
            int i8 = 0;
            int i9 = 4;
            int i10 = 1;
            if (i6 == 0) {
                byte[] bArr = j9eVar.a;
                int i11 = j9eVar.b;
                int i12 = j9eVar.c;
                while (true) {
                    if (i11 >= i12) {
                        j9eVar.N(i11);
                        break;
                    }
                    i = i11 + 1;
                    i2 = i7;
                    b = bArr[i11];
                    int i13 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (this.l != 512 || (((65280 | ((((byte) i13) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == true ? 1 : 0)) == true ? 1 : 0) & 65526) != 65520) {
                        c = c4;
                        r4 = i10;
                    } else {
                        if (this.n) {
                            break;
                        }
                        int i14 = i11 - 1;
                        j9eVar.N(i11);
                        byte[] bArr2 = nm2Var.d;
                        if (j9eVar.a() >= i10) {
                            j9eVar.k(bArr2, i8, i10);
                            nm2Var.q(i9);
                            int i15 = nm2Var.i(i10);
                            int i16 = this.o;
                            if (i16 == -1 || i15 == i16) {
                                if (this.p != -1) {
                                    byte[] bArr3 = nm2Var.d;
                                    if (j9eVar.a() < i10) {
                                        break;
                                    }
                                    j9eVar.k(bArr3, i8, i10);
                                    nm2Var.q(2);
                                    i5 = 4;
                                    if (nm2Var.i(4) == this.p) {
                                        j9eVar.N(i);
                                    }
                                } else {
                                    i5 = 4;
                                }
                                byte[] bArr4 = nm2Var.d;
                                if (j9eVar.a() >= i5) {
                                    j9eVar.k(bArr4, i8, i5);
                                    nm2Var.q(14);
                                    int i17 = nm2Var.i(13);
                                    if (i17 >= 7) {
                                        byte[] bArr5 = j9eVar.a;
                                        int i18 = j9eVar.c;
                                        int i19 = i14 + i17;
                                        if (i19 < i18) {
                                            byte b2 = bArr5[i19];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i20 = i19 + 1;
                                                    if (i20 != i18) {
                                                        if (bArr5[i20] == 68) {
                                                            int i21 = i19 + 2;
                                                            if (i21 != i18) {
                                                                if (bArr5[i21] == 51) {
                                                                    break;
                                                                }
                                                            } else {
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                            } else {
                                                int i22 = i19 + 1;
                                                if (i22 != i18) {
                                                    byte b3 = bArr5[i22];
                                                    if ((((65280 | ((b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == true ? 1 : 0)) == true ? 1 : 0) & 65526) == 65520 && ((b3 & 8) >> 3) == i15) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                c = 65535;
                            }
                            r4 = true;
                        }
                        c = 65535;
                        r4 = true;
                    }
                    int i23 = this.l;
                    int i24 = i13 | i23;
                    if (i24 == 329) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 768;
                    } else if (i24 == 511) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 512;
                    } else if (i24 == 836) {
                        i3 = 3;
                        c2 = 256;
                        i4 = 0;
                        c3 = 2;
                        this.l = 1024;
                    } else {
                        if (i24 == 1075) {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            j9eVar2.N(0);
                            j9eVar.N(i);
                            break;
                        }
                        c2 = 256;
                        if (i23 != 256) {
                            this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                            i10 = r4;
                            c4 = c;
                            i9 = 4;
                            i8 = i4;
                            i7 = i3;
                        } else {
                            i3 = 3;
                            i4 = 0;
                            c3 = 2;
                        }
                    }
                    i11 = i;
                    i10 = r4;
                    c4 = c;
                    i9 = 4;
                    i8 = i4;
                    i7 = i3;
                }
                this.q = (b & 8) >> 3;
                this.m = (b & 1) == 0;
                if (this.n) {
                    this.j = i2;
                    this.k = 0;
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                j9eVar.N(i);
            } else if (i6 != 1) {
                if (i6 == 2) {
                    byte[] bArr6 = j9eVar2.a;
                    int min = Math.min(j9eVar.a(), 10 - this.k);
                    j9eVar.k(bArr6, this.k, min);
                    int i25 = this.k + min;
                    this.k = i25;
                    if (i25 == 10) {
                        this.i.g(10, j9eVar2);
                        j9eVar2.N(6);
                        vsj vsjVar = this.i;
                        int z = j9eVar2.z() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = vsjVar;
                        this.w = 0L;
                        this.t = z;
                    }
                } else if (i6 == 3) {
                    int i26 = this.m ? 7 : 5;
                    byte[] bArr7 = nm2Var.d;
                    int min2 = Math.min(j9eVar.a(), i26 - this.k);
                    j9eVar.k(bArr7, this.k, min2);
                    int i27 = this.k + min2;
                    this.k = i27;
                    if (i27 == i26) {
                        nm2Var.q(0);
                        if (this.r) {
                            nm2Var.t(10);
                        } else {
                            int i28 = nm2Var.i(2) + 1;
                            if (i28 != 2) {
                                tgj.d0("Detected audio object type: " + i28 + ", but assuming AAC LC.");
                                i28 = 2;
                            }
                            nm2Var.t(5);
                            int i29 = nm2Var.i(3);
                            int i30 = this.p;
                            byte[] bArr8 = {(byte) (((i28 << 3) & 248) | ((i30 >> 1) & 7)), (byte) (((i29 << 3) & 120) | ((i30 << 7) & 128))};
                            d0 K = lz.K(new nm2(bArr8, 2, 3, (byte) 0), false);
                            qm8 qm8Var = new qm8();
                            qm8Var.a = this.g;
                            qm8Var.m = sjc.p(this.f);
                            qm8Var.n = sjc.p(MimeTypes.AUDIO_AAC);
                            qm8Var.j = K.c;
                            qm8Var.F = K.b;
                            qm8Var.G = K.a;
                            qm8Var.q = Collections.singletonList(bArr8);
                            qm8Var.d = this.d;
                            qm8Var.f = this.e;
                            b bVar = new b(qm8Var);
                            this.s = 1024000000 / bVar.H;
                            this.h.d(bVar);
                            this.r = true;
                        }
                        nm2Var.t(4);
                        int i31 = nm2Var.i(13);
                        int i32 = i31 - 7;
                        if (this.m) {
                            i32 = i31 - 9;
                        }
                        vsj vsjVar2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = vsjVar2;
                        this.w = j;
                        this.t = i32;
                    }
                } else {
                    if (i6 != 4) {
                        zzl.s();
                        return;
                    }
                    int min3 = Math.min(j9eVar.a(), this.t - this.k);
                    this.v.g(min3, j9eVar);
                    int i33 = this.k + min3;
                    this.k = i33;
                    if (i33 == this.t) {
                        z1a.E(this.u != C.TIME_UNSET);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                    }
                }
            } else if (j9eVar.a() != 0) {
                nm2Var.d[0] = j9eVar.a[j9eVar.b];
                nm2Var.q(2);
                int i34 = nm2Var.i(4);
                int i35 = this.p;
                if (i35 == -1 || i34 == i35) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = i34;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.g = c2kVar.f;
        c2kVar.b();
        vsj mo2track = pl6Var.mo2track(c2kVar.e, 1);
        this.h = mo2track;
        this.v = mo2track;
        if (!this.a) {
            this.i = new q35();
            return;
        }
        c2kVar.a();
        c2kVar.b();
        vsj mo2track2 = pl6Var.mo2track(c2kVar.e, 5);
        this.i = mo2track2;
        qm8 qm8Var = new qm8();
        c2kVar.b();
        qm8Var.a = c2kVar.f;
        qm8Var.m = sjc.p(this.f);
        qm8Var.n = sjc.p(MimeTypes.APPLICATION_ID3);
        w1l.r(qm8Var, mo2track2);
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.yi5
    public final void seek() {
        this.u = C.TIME_UNSET;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
    }
}
