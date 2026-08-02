package defpackage;

import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jl implements xi5 {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public usj f;
    public usj g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public usj t;
    public long u;
    public final nm2 b = new nm2(new byte[7], 7, 2, (byte) 0);
    public final nkk c = new nkk(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = NotificationCompat.FLAG_LOCAL_ONLY;
    public int m = -1;
    public int n = -1;
    public long q = C.TIME_UNSET;
    public long s = C.TIME_UNSET;

    public jl(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    @Override // defpackage.xi5
    public final void f(nkk nkkVar) {
        int i;
        int i2;
        byte b;
        char c;
        int i3;
        int i4;
        char c2;
        int i5;
        char c3;
        int i6;
        this.f.getClass();
        int i7 = lik.a;
        while (nkkVar.c() > 0) {
            int i8 = this.h;
            char c4 = 65535;
            nkk nkkVar2 = this.c;
            int i9 = 3;
            nm2 nm2Var = this.b;
            int i10 = 4;
            int i11 = 1;
            int i12 = 0;
            if (i8 == 0) {
                byte[] bArr = nkkVar.a;
                int i13 = nkkVar.b;
                int i14 = nkkVar.c;
                while (true) {
                    if (i13 >= i14) {
                        nkkVar.E(i13);
                        break;
                    }
                    i = i13 + 1;
                    i2 = i9;
                    b = bArr[i13];
                    int i15 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    if (this.j != 512 || ((65280 | (((byte) i15) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 65526) != 65520) {
                        c = c4;
                        i3 = i11;
                    } else {
                        if (this.l) {
                            break;
                        }
                        int i16 = i13 - 1;
                        nkkVar.E(i13);
                        byte[] bArr2 = nm2Var.d;
                        if (nkkVar.c() >= i11) {
                            nkkVar.e(bArr2, i12, i11);
                            nm2Var.q(i10);
                            int i17 = nm2Var.i(i11);
                            int i18 = this.m;
                            if (i18 == -1 || i17 == i18) {
                                if (this.n != -1) {
                                    byte[] bArr3 = nm2Var.d;
                                    if (nkkVar.c() < i11) {
                                        break;
                                    }
                                    nkkVar.e(bArr3, i12, i11);
                                    nm2Var.q(2);
                                    i6 = 4;
                                    if (nm2Var.i(4) == this.n) {
                                        nkkVar.E(i);
                                    }
                                } else {
                                    i6 = 4;
                                }
                                byte[] bArr4 = nm2Var.d;
                                if (nkkVar.c() >= i6) {
                                    nkkVar.e(bArr4, i12, i6);
                                    nm2Var.q(14);
                                    int i19 = nm2Var.i(13);
                                    if (i19 >= 7) {
                                        byte[] bArr5 = nkkVar.a;
                                        int i20 = nkkVar.c;
                                        int i21 = i16 + i19;
                                        if (i21 < i20) {
                                            byte b2 = bArr5[i21];
                                            c = 65535;
                                            if (b2 != -1) {
                                                if (b2 == 73) {
                                                    int i22 = i21 + 1;
                                                    if (i22 != i20) {
                                                        if (bArr5[i22] == 68) {
                                                            int i23 = i21 + 2;
                                                            if (i23 != i20) {
                                                                if (bArr5[i23] == 51) {
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
                                                int i24 = i21 + 1;
                                                if (i24 != i20) {
                                                    byte b3 = bArr5[i24];
                                                    if (((65280 | (b3 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 65526) == 65520 && ((b3 & 8) >> 3) == i17) {
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
                            i3 = 1;
                        }
                        c = 65535;
                        i3 = 1;
                    }
                    int i25 = this.j;
                    int i26 = i15 | i25;
                    if (i26 == 329) {
                        i4 = 3;
                        c2 = 256;
                        i5 = 0;
                        c3 = 2;
                        this.j = 768;
                    } else if (i26 == 511) {
                        i4 = 3;
                        c2 = 256;
                        i5 = 0;
                        c3 = 2;
                        this.j = 512;
                    } else if (i26 == 836) {
                        i4 = 3;
                        c2 = 256;
                        i5 = 0;
                        c3 = 2;
                        this.j = 1024;
                    } else {
                        if (i26 == 1075) {
                            this.h = 2;
                            this.i = 3;
                            this.r = 0;
                            nkkVar2.E(0);
                            nkkVar.E(i);
                            break;
                        }
                        c2 = 256;
                        if (i25 != 256) {
                            this.j = NotificationCompat.FLAG_LOCAL_ONLY;
                            i4 = 3;
                            i5 = 0;
                            c3 = 2;
                            i11 = i3;
                            c4 = c;
                            i10 = 4;
                            i12 = i5;
                            i9 = i4;
                        } else {
                            i4 = 3;
                            i5 = 0;
                            c3 = 2;
                        }
                    }
                    i13 = i;
                    i11 = i3;
                    c4 = c;
                    i10 = 4;
                    i12 = i5;
                    i9 = i4;
                }
                this.o = (b & 8) >> 3;
                this.k = (b & 1) == 0;
                if (this.l) {
                    this.h = i2;
                    this.i = 0;
                } else {
                    this.h = 1;
                    this.i = 0;
                }
                nkkVar.E(i);
            } else if (i8 != 1) {
                if (i8 == 2) {
                    byte[] bArr6 = nkkVar2.a;
                    int min = Math.min(nkkVar.c(), 10 - this.i);
                    nkkVar.e(bArr6, this.i, min);
                    int i27 = this.i + min;
                    this.i = i27;
                    if (i27 == 10) {
                        this.g.d(10, nkkVar2);
                        nkkVar2.E(6);
                        usj usjVar = this.g;
                        int r = nkkVar2.r() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = usjVar;
                        this.u = 0L;
                        this.r = r;
                    }
                } else if (i8 == 3) {
                    int i28 = this.k ? 7 : 5;
                    byte[] bArr7 = nm2Var.d;
                    int min2 = Math.min(nkkVar.c(), i28 - this.i);
                    nkkVar.e(bArr7, this.i, min2);
                    int i29 = this.i + min2;
                    this.i = i29;
                    if (i29 == i28) {
                        nm2Var.q(0);
                        if (this.p) {
                            nm2Var.t(10);
                        } else {
                            int i30 = nm2Var.i(2) + 1;
                            if (i30 != 2) {
                                m6k.f0();
                                i30 = 2;
                            }
                            nm2Var.t(5);
                            int i31 = nm2Var.i(3);
                            int i32 = this.n;
                            byte[] bArr8 = {(byte) (((i30 << 3) & 248) | ((i32 >> 1) & 7)), (byte) (((i31 << 3) & 120) | ((i32 << 7) & 128))};
                            d0 O = kik.O(new nm2(bArr8, 2, 2, (byte) 0), false);
                            pm8 pm8Var = new pm8();
                            pm8Var.a = this.e;
                            pm8Var.k = MimeTypes.AUDIO_AAC;
                            pm8Var.h = O.c;
                            pm8Var.x = O.b;
                            pm8Var.y = O.a;
                            pm8Var.m = Collections.singletonList(bArr8);
                            pm8Var.c = this.d;
                            sm8 sm8Var = new sm8(pm8Var);
                            this.q = 1024000000 / sm8Var.z;
                            this.f.a(sm8Var);
                            this.p = true;
                        }
                        nm2Var.t(4);
                        int i33 = nm2Var.i(13);
                        int i34 = i33 - 7;
                        if (this.k) {
                            i34 = i33 - 9;
                        }
                        usj usjVar2 = this.f;
                        long j = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = usjVar2;
                        this.u = j;
                        this.r = i34;
                    }
                } else {
                    if (i8 != 4) {
                        zzl.s();
                        return;
                    }
                    int min3 = Math.min(nkkVar.c(), this.r - this.i);
                    this.t.d(min3, nkkVar);
                    int i35 = this.i + min3;
                    this.i = i35;
                    int i36 = this.r;
                    if (i35 == i36) {
                        long j2 = this.s;
                        if (j2 != C.TIME_UNSET) {
                            this.t.c(j2, 1, i36, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = NotificationCompat.FLAG_LOCAL_ONLY;
                    }
                }
            } else if (nkkVar.c() != 0) {
                nm2Var.d[0] = nkkVar.a[nkkVar.b];
                nm2Var.q(2);
                int i37 = nm2Var.i(4);
                int i38 = this.n;
                if (i38 == -1 || i37 == i38) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = i37;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.s = j;
        }
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.e = c2kVar.f;
        c2kVar.b();
        usj track = ol6Var.track(c2kVar.e, 1);
        this.f = track;
        this.t = track;
        if (!this.a) {
            this.g = new vd5();
            return;
        }
        c2kVar.a();
        c2kVar.b();
        usj track2 = ol6Var.track(c2kVar.e, 5);
        this.g = track2;
        pm8 pm8Var = new pm8();
        c2kVar.b();
        pm8Var.a = c2kVar.f;
        pm8Var.k = MimeTypes.APPLICATION_ID3;
        track2.a(new sm8(pm8Var));
    }

    @Override // defpackage.xi5
    public final void seek() {
        this.s = C.TIME_UNSET;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
    }
}
