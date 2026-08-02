package defpackage;

import androidx.core.app.NotificationCompat;
import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g9 implements yi5 {
    public final /* synthetic */ int a;
    public final nm2 b;
    public final j9e c;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public vsj h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public b m;
    public int n;
    public long o;

    public g9(String str, int i, String str2, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                nm2 nm2Var = new nm2(new byte[16], 16, 3, (byte) 0);
                this.b = nm2Var;
                this.c = new j9e(nm2Var.d);
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = C.TIME_UNSET;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
            default:
                nm2 nm2Var2 = new nm2(new byte[128], 128, 3, (byte) 0);
                this.b = nm2Var2;
                this.c = new j9e(nm2Var2.d);
                this.i = 0;
                this.o = C.TIME_UNSET;
                this.d = str;
                this.e = i;
                this.f = str2;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03ec  */
    @Override // defpackage.yi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(j9e j9eVar) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        long j;
        j9e j9eVar2 = j9eVar;
        int i19 = this.a;
        int i20 = this.e;
        String str2 = this.d;
        String str3 = this.f;
        nm2 nm2Var = this.b;
        long j2 = C.TIME_UNSET;
        int i21 = 0;
        int i22 = 1;
        int i23 = 2;
        j9e j9eVar3 = this.c;
        int i24 = 16;
        switch (i19) {
            case 0:
                this.h.getClass();
                while (j9eVar2.a() > 0) {
                    int i25 = this.i;
                    if (i25 == 0) {
                        while (true) {
                            if (j9eVar.a() <= 0) {
                                j9eVar2 = j9eVar;
                                i21 = 0;
                                i22 = 1;
                                i23 = 2;
                            } else if (this.k) {
                                int A = j9eVar.A();
                                if (A == 119) {
                                    this.k = false;
                                    i22 = 1;
                                    this.i = 1;
                                    byte[] bArr = j9eVar3.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.j = 2;
                                    j9eVar2 = j9eVar;
                                    i23 = 2;
                                    i21 = 0;
                                } else {
                                    this.k = A == 11;
                                }
                            } else {
                                this.k = j9eVar.A() == 11;
                            }
                        }
                    } else if (i25 == i22) {
                        byte[] bArr2 = j9eVar3.a;
                        int min = Math.min(j9eVar2.a(), 128 - this.j);
                        j9eVar2.k(bArr2, this.j, min);
                        int i26 = this.j + min;
                        this.j = i26;
                        if (i26 == 128) {
                            nm2Var.q(i21);
                            int[] iArr = dy0.e;
                            int[] iArr2 = dy0.c;
                            int g = nm2Var.g();
                            nm2Var.t(40);
                            int i27 = nm2Var.i(5) > 10 ? i22 : 0;
                            nm2Var.q(g);
                            if (i27 != 0) {
                                nm2Var.t(i24);
                                int i28 = nm2Var.i(i23);
                                int i29 = i28 != 0 ? i28 != i22 ? i28 != i23 ? -1 : i23 : i22 : 0;
                                nm2Var.t(3);
                                i5 = (nm2Var.i(11) + i22) * i23;
                                int i30 = nm2Var.i(i23);
                                if (i30 == 3) {
                                    i6 = dy0.d[nm2Var.i(i23)];
                                    i7 = 3;
                                    i8 = 6;
                                } else {
                                    int i31 = nm2Var.i(i23);
                                    int i32 = dy0.b[i31];
                                    i6 = iArr2[i30];
                                    i7 = i31;
                                    i8 = i32;
                                }
                                i4 = i8 * NotificationCompat.FLAG_LOCAL_ONLY;
                                int i33 = (i5 * i6) / (i8 * 32);
                                int i34 = nm2Var.i(3);
                                boolean h = nm2Var.h();
                                int i35 = iArr[i34] + (h ? 1 : 0);
                                nm2Var.t(10);
                                if (nm2Var.h()) {
                                    nm2Var.t(8);
                                }
                                if (i34 == 0) {
                                    nm2Var.t(5);
                                    if (nm2Var.h()) {
                                        nm2Var.t(8);
                                    }
                                }
                                if (i29 == 1 && nm2Var.h()) {
                                    nm2Var.t(16);
                                }
                                if (nm2Var.h()) {
                                    if (i34 > 2) {
                                        nm2Var.t(2);
                                    }
                                    if ((i34 & 1) == 0 || i34 <= 2) {
                                        i14 = 6;
                                    } else {
                                        i14 = 6;
                                        nm2Var.t(6);
                                    }
                                    if ((i34 & 4) != 0) {
                                        nm2Var.t(i14);
                                    }
                                    if (h && nm2Var.h()) {
                                        nm2Var.t(5);
                                    }
                                    if (i29 == 0) {
                                        if (nm2Var.h()) {
                                            i15 = 6;
                                            nm2Var.t(6);
                                        } else {
                                            i15 = 6;
                                        }
                                        if (i34 == 0 && nm2Var.h()) {
                                            nm2Var.t(i15);
                                        }
                                        if (nm2Var.h()) {
                                            nm2Var.t(i15);
                                        }
                                        i9 = i35;
                                        int i36 = nm2Var.i(2);
                                        if (i36 == 1) {
                                            nm2Var.t(5);
                                        } else if (i36 == 2) {
                                            nm2Var.t(12);
                                        } else if (i36 == 3) {
                                            int i37 = nm2Var.i(5);
                                            if (nm2Var.h()) {
                                                nm2Var.t(5);
                                                if (nm2Var.h()) {
                                                    i17 = 4;
                                                    nm2Var.t(4);
                                                } else {
                                                    i17 = 4;
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(i17);
                                                }
                                                if (nm2Var.h()) {
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i17);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i17);
                                                    }
                                                }
                                            }
                                            if (nm2Var.h()) {
                                                nm2Var.t(5);
                                                if (nm2Var.h()) {
                                                    nm2Var.t(7);
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(8);
                                                        i16 = 2;
                                                        nm2Var.t((i37 + i16) * 8);
                                                        nm2Var.c();
                                                        if (i34 < i16) {
                                                            if (nm2Var.h()) {
                                                                nm2Var.t(14);
                                                            }
                                                            if (i34 == 0 && nm2Var.h()) {
                                                                nm2Var.t(14);
                                                            }
                                                        }
                                                        i10 = i7;
                                                        if (nm2Var.h()) {
                                                            if (i10 == 0) {
                                                                nm2Var.t(5);
                                                            } else {
                                                                int i38 = 0;
                                                                while (i38 < i8) {
                                                                    if (nm2Var.h()) {
                                                                        i18 = i38;
                                                                        nm2Var.t(5);
                                                                    } else {
                                                                        i18 = i38;
                                                                    }
                                                                    i38 = i18 + 1;
                                                                }
                                                            }
                                                        }
                                                        if (nm2Var.h()) {
                                                            i11 = 3;
                                                        } else {
                                                            nm2Var.t(5);
                                                            if (i34 == 2) {
                                                                nm2Var.t(4);
                                                            }
                                                            if (i34 >= 6) {
                                                                nm2Var.t(2);
                                                            }
                                                            if (nm2Var.h()) {
                                                                i13 = 8;
                                                                nm2Var.t(8);
                                                            } else {
                                                                i13 = 8;
                                                            }
                                                            if (i34 == 0 && nm2Var.h()) {
                                                                nm2Var.t(i13);
                                                            }
                                                            i11 = 3;
                                                            if (i30 < 3) {
                                                                nm2Var.s();
                                                            }
                                                        }
                                                        if (i29 == 0 && i10 != i11) {
                                                            nm2Var.s();
                                                        }
                                                        if (i29 == 2 || !(i10 == i11 || nm2Var.h())) {
                                                            i12 = 6;
                                                        } else {
                                                            i12 = 6;
                                                            nm2Var.t(6);
                                                        }
                                                        str = (!nm2Var.h() && nm2Var.i(i12) == 1 && nm2Var.i(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                                                        i = i33;
                                                        i3 = i9;
                                                    }
                                                }
                                            }
                                            i16 = 2;
                                            nm2Var.t((i37 + i16) * 8);
                                            nm2Var.c();
                                            if (i34 < i16) {
                                            }
                                            i10 = i7;
                                            if (nm2Var.h()) {
                                            }
                                            if (nm2Var.h()) {
                                            }
                                            if (i29 == 0) {
                                                nm2Var.s();
                                            }
                                            if (i29 == 2) {
                                            }
                                            i12 = 6;
                                            if (!nm2Var.h()) {
                                            }
                                            i = i33;
                                            i3 = i9;
                                        }
                                        i16 = 2;
                                        if (i34 < i16) {
                                        }
                                        i10 = i7;
                                        if (nm2Var.h()) {
                                        }
                                        if (nm2Var.h()) {
                                        }
                                        if (i29 == 0) {
                                        }
                                        if (i29 == 2) {
                                        }
                                        i12 = 6;
                                        if (!nm2Var.h()) {
                                        }
                                        i = i33;
                                        i3 = i9;
                                    }
                                }
                                i9 = i35;
                                i10 = i7;
                                if (nm2Var.h()) {
                                }
                                if (i29 == 0) {
                                }
                                if (i29 == 2) {
                                }
                                i12 = 6;
                                if (!nm2Var.h()) {
                                }
                                i = i33;
                                i3 = i9;
                            } else {
                                nm2Var.t(32);
                                int i39 = nm2Var.i(2);
                                String str4 = i39 == 3 ? null : MimeTypes.AUDIO_AC3;
                                int i40 = nm2Var.i(6);
                                i = dy0.f[i40 / 2] * 1000;
                                int v = dy0.v(i39, i40);
                                nm2Var.t(8);
                                int i41 = nm2Var.i(3);
                                if ((i41 & 1) == 0 || i41 == 1) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                    nm2Var.t(2);
                                }
                                if ((i41 & 4) != 0) {
                                    nm2Var.t(i2);
                                }
                                if (i41 == i2) {
                                    nm2Var.t(i2);
                                }
                                int i42 = i39 < 3 ? iArr2[i39] : -1;
                                i3 = iArr[i41] + (nm2Var.h() ? 1 : 0);
                                i4 = 1536;
                                str = str4;
                                i5 = v;
                                i6 = i42;
                            }
                            b bVar = this.m;
                            if (bVar == null || i3 != bVar.G || i6 != bVar.H || !Objects.equals(str, bVar.o)) {
                                qm8 qm8Var = new qm8();
                                qm8Var.a = this.g;
                                qm8Var.m = sjc.p(str3);
                                qm8Var.n = sjc.p(str);
                                qm8Var.F = i3;
                                qm8Var.G = i6;
                                qm8Var.d = str2;
                                qm8Var.f = i20;
                                qm8Var.i = i;
                                if (MimeTypes.AUDIO_AC3.equals(str)) {
                                    qm8Var.h = i;
                                }
                                b bVar2 = new b(qm8Var);
                                this.m = bVar2;
                                this.h.d(bVar2);
                            }
                            this.n = i5;
                            this.l = (i4 * 1000000) / this.m.H;
                            j9eVar3.N(0);
                            this.h.g(128, j9eVar3);
                            this.i = 2;
                            j9eVar2 = j9eVar;
                            i23 = 2;
                            i21 = 0;
                            i22 = 1;
                        } else {
                            j9eVar2 = j9eVar;
                        }
                    } else if (i25 == i23) {
                        int min2 = Math.min(j9eVar2.a(), this.n - this.j);
                        this.h.g(min2, j9eVar2);
                        int i43 = this.j + min2;
                        this.j = i43;
                        if (i43 == this.n) {
                            z1a.E(this.o != C.TIME_UNSET ? i22 : i21);
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = i21;
                        }
                    }
                    i24 = 16;
                }
                break;
            default:
                this.h.getClass();
                while (j9eVar2.a() > 0) {
                    int i44 = this.i;
                    if (i44 == 0) {
                        j = j2;
                        while (j9eVar2.a() > 0) {
                            if (this.k) {
                                int A2 = j9eVar2.A();
                                this.k = A2 == 172;
                                if (A2 == 64 || A2 == 65) {
                                    Object[] objArr = A2 == 65;
                                    this.i = 1;
                                    byte[] bArr3 = j9eVar3.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.j = 2;
                                }
                            } else {
                                this.k = j9eVar2.A() == 172;
                            }
                        }
                    } else if (i44 == 1) {
                        j = j2;
                        byte[] bArr4 = j9eVar3.a;
                        int min3 = Math.min(j9eVar2.a(), 16 - this.j);
                        j9eVar2.k(bArr4, this.j, min3);
                        int i45 = this.j + min3;
                        this.j = i45;
                        if (i45 == 16) {
                            nm2Var.q(0);
                            k9 W = s02.W(nm2Var);
                            int i46 = W.a;
                            b bVar3 = this.m;
                            if (bVar3 == null || 2 != bVar3.G || i46 != bVar3.H || !"audio/ac4".equals(bVar3.o)) {
                                qm8 qm8Var2 = new qm8();
                                qm8Var2.a = this.g;
                                qm8Var2.m = sjc.p(str3);
                                qm8Var2.n = sjc.p("audio/ac4");
                                qm8Var2.F = 2;
                                qm8Var2.G = i46;
                                qm8Var2.d = str2;
                                qm8Var2.f = i20;
                                b bVar4 = new b(qm8Var2);
                                this.m = bVar4;
                                this.h.d(bVar4);
                            }
                            this.n = W.b;
                            this.l = (W.c * 1000000) / this.m.H;
                            j9eVar3.N(0);
                            this.h.g(16, j9eVar3);
                            this.i = 2;
                        }
                    } else if (i44 == 2) {
                        int min4 = Math.min(j9eVar2.a(), this.n - this.j);
                        this.h.g(min4, j9eVar2);
                        int i47 = this.j + min4;
                        this.j = i47;
                        if (i47 == this.n) {
                            z1a.E(this.o != j2);
                            j = j2;
                            this.h.a(this.o, 1, this.n, 0, null);
                            this.o += this.l;
                            this.i = 0;
                        }
                    }
                    j2 = j;
                }
                break;
        }
    }

    @Override // defpackage.yi5
    public final void c(boolean z) {
        int i = this.a;
    }

    @Override // defpackage.yi5
    public final void d(pl6 pl6Var, c2k c2kVar) {
        switch (this.a) {
            case 0:
                c2kVar.a();
                c2kVar.b();
                this.g = c2kVar.f;
                c2kVar.b();
                this.h = pl6Var.mo2track(c2kVar.e, 1);
                break;
            default:
                c2kVar.a();
                c2kVar.b();
                this.g = c2kVar.f;
                c2kVar.b();
                this.h = pl6Var.mo2track(c2kVar.e, 1);
                break;
        }
    }

    @Override // defpackage.yi5
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                this.o = j;
                break;
            default:
                this.o = j;
                break;
        }
    }

    @Override // defpackage.yi5
    public final void seek() {
        switch (this.a) {
            case 0:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = C.TIME_UNSET;
                break;
            default:
                this.i = 0;
                this.j = 0;
                this.k = false;
                this.o = C.TIME_UNSET;
                break;
        }
    }

    private final void a(boolean z) {
    }

    private final void e(boolean z) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g9(String str) {
        this(null, 0, str, 0);
        this.a = 0;
    }
}
