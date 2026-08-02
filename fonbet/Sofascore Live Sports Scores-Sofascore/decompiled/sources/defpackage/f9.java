package defpackage;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f9 implements xi5 {
    public final /* synthetic */ int a;
    public final nm2 b;
    public final nkk c;
    public final String d;
    public String e;
    public usj f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public sm8 k;
    public int l;
    public long m;

    public f9(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                byte[] bArr = new byte[16];
                this.b = new nm2(bArr, 16, 2, (byte) 0);
                this.c = new nkk(bArr);
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = C.TIME_UNSET;
                this.d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.b = new nm2(bArr2, 128, 2, (byte) 0);
                this.c = new nkk(bArr2);
                this.g = 0;
                this.m = C.TIME_UNSET;
                this.d = str;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03a3  */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nkk nkkVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
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
        int i17 = this.a;
        String str2 = this.d;
        nm2 nm2Var = this.b;
        long j = C.TIME_UNSET;
        int i18 = 0;
        int i19 = 1;
        int i20 = 2;
        nkk nkkVar2 = this.c;
        int i21 = 16;
        switch (i17) {
            case 0:
                qx9.u(this.f);
                while (nkkVar.c() > 0) {
                    int i22 = this.g;
                    if (i22 == 0) {
                        while (true) {
                            if (nkkVar.c() <= 0) {
                                j = C.TIME_UNSET;
                                i18 = 0;
                                i19 = 1;
                                i20 = 2;
                            } else if (this.i) {
                                int s = nkkVar.s();
                                if (s == 119) {
                                    this.i = false;
                                    this.g = 1;
                                    byte[] bArr = nkkVar2.a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.h = 2;
                                    i19 = 1;
                                    i20 = 2;
                                    i18 = 0;
                                    j = C.TIME_UNSET;
                                } else {
                                    this.i = s == 11;
                                }
                            } else {
                                this.i = nkkVar.s() == 11;
                            }
                        }
                    } else if (i22 == i19) {
                        byte[] bArr2 = nkkVar2.a;
                        int min = Math.min(nkkVar.c(), 128 - this.h);
                        nkkVar.e(bArr2, this.h, min);
                        int i23 = this.h + min;
                        this.h = i23;
                        if (i23 == 128) {
                            nm2Var.q(i18);
                            int[] iArr = un0.e;
                            int[] iArr2 = un0.c;
                            int g = nm2Var.g();
                            nm2Var.t(40);
                            int i24 = nm2Var.i(5) > 10 ? i19 : i18;
                            nm2Var.q(g);
                            if (i24 != 0) {
                                nm2Var.t(i21);
                                int i25 = nm2Var.i(i20);
                                int i26 = i25 != 0 ? i25 != i19 ? i25 != i20 ? -1 : i20 : i19 : 0;
                                nm2Var.t(3);
                                i4 = (nm2Var.i(11) + i19) * i20;
                                int i27 = nm2Var.i(i20);
                                if (i27 == 3) {
                                    i5 = un0.d[nm2Var.i(i20)];
                                    i6 = 3;
                                    i7 = 6;
                                } else {
                                    int i28 = nm2Var.i(i20);
                                    int i29 = un0.b[i28];
                                    i5 = iArr2[i27];
                                    i6 = i28;
                                    i7 = i29;
                                }
                                i3 = i7 * NotificationCompat.FLAG_LOCAL_ONLY;
                                int i30 = nm2Var.i(3);
                                boolean h = nm2Var.h();
                                i2 = iArr[i30] + (h ? 1 : 0);
                                nm2Var.t(10);
                                if (nm2Var.h()) {
                                    nm2Var.t(8);
                                }
                                if (i30 == 0) {
                                    nm2Var.t(5);
                                    if (nm2Var.h()) {
                                        nm2Var.t(8);
                                    }
                                }
                                if (i26 == 1 && nm2Var.h()) {
                                    nm2Var.t(16);
                                }
                                if (nm2Var.h()) {
                                    if (i30 > 2) {
                                        nm2Var.t(2);
                                    }
                                    if ((i30 & 1) == 0 || i30 <= 2) {
                                        i12 = 6;
                                    } else {
                                        i12 = 6;
                                        nm2Var.t(6);
                                    }
                                    if ((i30 & 4) != 0) {
                                        nm2Var.t(i12);
                                    }
                                    if (h && nm2Var.h()) {
                                        nm2Var.t(5);
                                    }
                                    if (i26 == 0) {
                                        if (nm2Var.h()) {
                                            i13 = 6;
                                            nm2Var.t(6);
                                        } else {
                                            i13 = 6;
                                        }
                                        if (i30 == 0 && nm2Var.h()) {
                                            nm2Var.t(i13);
                                        }
                                        if (nm2Var.h()) {
                                            nm2Var.t(i13);
                                        }
                                        int i31 = nm2Var.i(2);
                                        if (i31 == 1) {
                                            nm2Var.t(5);
                                            i15 = 2;
                                        } else {
                                            if (i31 == 2) {
                                                nm2Var.t(12);
                                            } else if (i31 == 3) {
                                                int i32 = nm2Var.i(5);
                                                if (nm2Var.h()) {
                                                    nm2Var.t(5);
                                                    if (nm2Var.h()) {
                                                        i16 = 4;
                                                        nm2Var.t(4);
                                                    } else {
                                                        i16 = 4;
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(i16);
                                                    }
                                                    if (nm2Var.h()) {
                                                        if (nm2Var.h()) {
                                                            nm2Var.t(i16);
                                                        }
                                                        if (nm2Var.h()) {
                                                            nm2Var.t(i16);
                                                        }
                                                    }
                                                }
                                                if (nm2Var.h()) {
                                                    nm2Var.t(5);
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(7);
                                                        if (nm2Var.h()) {
                                                            i14 = 8;
                                                            nm2Var.t(8);
                                                            i15 = 2;
                                                            nm2Var.t((i32 + 2) * i14);
                                                            nm2Var.c();
                                                        }
                                                    }
                                                }
                                                i14 = 8;
                                                i15 = 2;
                                                nm2Var.t((i32 + 2) * i14);
                                                nm2Var.c();
                                            }
                                            i15 = 2;
                                        }
                                        if (i30 < i15) {
                                            if (nm2Var.h()) {
                                                nm2Var.t(14);
                                            }
                                            if (i30 == 0 && nm2Var.h()) {
                                                nm2Var.t(14);
                                            }
                                        }
                                        if (nm2Var.h()) {
                                            i8 = i6;
                                            if (i8 == 0) {
                                                nm2Var.t(5);
                                            } else {
                                                for (int i33 = 0; i33 < i7; i33++) {
                                                    if (nm2Var.h()) {
                                                        nm2Var.t(5);
                                                    }
                                                }
                                            }
                                            if (nm2Var.h()) {
                                                i9 = 3;
                                            } else {
                                                nm2Var.t(5);
                                                if (i30 == 2) {
                                                    nm2Var.t(4);
                                                }
                                                if (i30 >= 6) {
                                                    nm2Var.t(2);
                                                }
                                                if (nm2Var.h()) {
                                                    i11 = 8;
                                                    nm2Var.t(8);
                                                } else {
                                                    i11 = 8;
                                                }
                                                if (i30 == 0 && nm2Var.h()) {
                                                    nm2Var.t(i11);
                                                }
                                                i9 = 3;
                                                if (i27 < 3) {
                                                    nm2Var.s();
                                                }
                                            }
                                            if (i26 == 0 && i8 != i9) {
                                                nm2Var.s();
                                            }
                                            if (i26 == 2 || !(i8 == i9 || nm2Var.h())) {
                                                i10 = 6;
                                            } else {
                                                i10 = 6;
                                                nm2Var.t(6);
                                            }
                                            str = (!nm2Var.h() && nm2Var.i(i10) == 1 && nm2Var.i(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
                                        }
                                    }
                                }
                                i8 = i6;
                                if (nm2Var.h()) {
                                }
                                if (i26 == 0) {
                                    nm2Var.s();
                                }
                                if (i26 == 2) {
                                }
                                i10 = 6;
                                if (!nm2Var.h()) {
                                }
                            } else {
                                nm2Var.t(32);
                                int i34 = nm2Var.i(2);
                                str = i34 == 3 ? null : MimeTypes.AUDIO_AC3;
                                int x = un0.x(i34, nm2Var.i(6));
                                nm2Var.t(8);
                                int i35 = nm2Var.i(3);
                                if ((i35 & 1) == 0 || i35 == 1) {
                                    i = 2;
                                } else {
                                    i = 2;
                                    nm2Var.t(2);
                                }
                                if ((i35 & 4) != 0) {
                                    nm2Var.t(i);
                                }
                                if (i35 == i) {
                                    nm2Var.t(i);
                                }
                                int i36 = i34 < 3 ? iArr2[i34] : -1;
                                i2 = iArr[i35] + (nm2Var.h() ? 1 : 0);
                                i3 = 1536;
                                i4 = x;
                                i5 = i36;
                            }
                            sm8 sm8Var = this.k;
                            if (sm8Var == null || i2 != sm8Var.y || i5 != sm8Var.z || !lik.a(str, sm8Var.l)) {
                                pm8 pm8Var = new pm8();
                                pm8Var.a = this.e;
                                pm8Var.k = str;
                                pm8Var.x = i2;
                                pm8Var.y = i5;
                                pm8Var.c = str2;
                                sm8 sm8Var2 = new sm8(pm8Var);
                                this.k = sm8Var2;
                                this.f.a(sm8Var2);
                            }
                            this.l = i4;
                            this.j = (i3 * 1000000) / this.k.z;
                            nkkVar2.E(0);
                            this.f.d(128, nkkVar2);
                            this.g = 2;
                            i20 = 2;
                            j = C.TIME_UNSET;
                            i18 = 0;
                            i19 = 1;
                        }
                    } else if (i22 == i20) {
                        int min2 = Math.min(nkkVar.c(), this.l - this.h);
                        this.f.d(min2, nkkVar);
                        int i37 = this.h + min2;
                        this.h = i37;
                        int i38 = this.l;
                        if (i37 == i38) {
                            long j2 = this.m;
                            if (j2 != j) {
                                this.f.c(j2, 1, i38, 0, null);
                                this.m += this.j;
                            }
                            this.g = i18;
                        }
                    }
                    i21 = 16;
                }
                break;
            default:
                qx9.u(this.f);
                while (nkkVar.c() > 0) {
                    int i39 = this.g;
                    if (i39 == 0) {
                        while (nkkVar.c() > 0) {
                            if (this.i) {
                                int s2 = nkkVar.s();
                                this.i = s2 == 172;
                                if (s2 == 64 || s2 == 65) {
                                    Object[] objArr = s2 == 65;
                                    this.g = 1;
                                    byte[] bArr3 = nkkVar2.a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr == true ? 65 : 64);
                                    this.h = 2;
                                }
                            } else {
                                this.i = nkkVar.s() == 172;
                            }
                        }
                    } else if (i39 == 1) {
                        byte[] bArr4 = nkkVar2.a;
                        int min3 = Math.min(nkkVar.c(), 16 - this.h);
                        nkkVar.e(bArr4, this.h, min3);
                        int i40 = this.h + min3;
                        this.h = i40;
                        if (i40 == 16) {
                            nm2Var.q(0);
                            k9 j0 = o02.j0(nm2Var);
                            int i41 = j0.a;
                            sm8 sm8Var3 = this.k;
                            if (sm8Var3 == null || 2 != sm8Var3.y || i41 != sm8Var3.z || !"audio/ac4".equals(sm8Var3.l)) {
                                pm8 pm8Var2 = new pm8();
                                pm8Var2.a = this.e;
                                pm8Var2.k = "audio/ac4";
                                pm8Var2.x = 2;
                                pm8Var2.y = i41;
                                pm8Var2.c = str2;
                                sm8 sm8Var4 = new sm8(pm8Var2);
                                this.k = sm8Var4;
                                this.f.a(sm8Var4);
                            }
                            this.l = j0.b;
                            this.j = (j0.c * 1000000) / this.k.z;
                            nkkVar2.E(0);
                            this.f.d(16, nkkVar2);
                            this.g = 2;
                        }
                    } else if (i39 == 2) {
                        int min4 = Math.min(nkkVar.c(), this.l - this.h);
                        this.f.d(min4, nkkVar);
                        int i42 = this.h + min4;
                        this.h = i42;
                        int i43 = this.l;
                        if (i42 == i43) {
                            long j3 = this.m;
                            if (j3 != C.TIME_UNSET) {
                                this.f.c(j3, 1, i43, 0, null);
                                this.m += this.j;
                            }
                            this.g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        switch (this.a) {
            case 0:
                if (j != C.TIME_UNSET) {
                    this.m = j;
                    break;
                }
                break;
            default:
                if (j != C.TIME_UNSET) {
                    this.m = j;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        switch (this.a) {
            case 0:
                c2kVar.a();
                c2kVar.b();
                this.e = c2kVar.f;
                c2kVar.b();
                this.f = ol6Var.track(c2kVar.e, 1);
                break;
            default:
                c2kVar.a();
                c2kVar.b();
                this.e = c2kVar.f;
                c2kVar.b();
                this.f = ol6Var.track(c2kVar.e, 1);
                break;
        }
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
        int i = this.a;
    }

    @Override // defpackage.xi5
    public final void seek() {
        switch (this.a) {
            case 0:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = C.TIME_UNSET;
                break;
            default:
                this.g = 0;
                this.h = 0;
                this.i = false;
                this.m = C.TIME_UNSET;
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
