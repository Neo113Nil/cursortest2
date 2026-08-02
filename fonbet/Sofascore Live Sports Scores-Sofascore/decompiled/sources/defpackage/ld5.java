package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ld5 implements xi5 {
    public final String b;
    public String c;
    public usj d;
    public int f;
    public int g;
    public long h;
    public sm8 i;
    public int j;
    public final nkk a = new nkk(new byte[18]);
    public int e = 0;
    public long k = C.TIME_UNSET;

    public ld5(String str) {
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0279  */
    @Override // defpackage.xi5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(nkk nkkVar) {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b2;
        int i8;
        byte b3;
        int i9;
        nm2 nm2Var;
        byte[] bArr;
        qx9.u(this.d);
        while (nkkVar.c() > 0) {
            int i10 = this.e;
            int i11 = 8;
            int i12 = 2;
            nkk nkkVar2 = this.a;
            int i13 = 0;
            if (i10 == 0) {
                while (nkkVar.c() > 0) {
                    int i14 = this.g << 8;
                    this.g = i14;
                    int s = i14 | nkkVar.s();
                    this.g = s;
                    if (s == 2147385345 || s == -25230976 || s == 536864768 || s == -14745368) {
                        byte[] bArr2 = nkkVar2.a;
                        bArr2[0] = (byte) ((s >> 24) & 255);
                        bArr2[1] = (byte) ((s >> 16) & 255);
                        bArr2[2] = (byte) ((s >> 8) & 255);
                        bArr2[3] = (byte) (s & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i10 == 1) {
                byte[] bArr3 = nkkVar2.a;
                int min = Math.min(nkkVar.c(), 18 - this.f);
                nkkVar.e(bArr3, this.f, min);
                int i15 = this.f + min;
                this.f = i15;
                if (i15 == 18) {
                    byte[] bArr4 = nkkVar2.a;
                    if (this.i == null) {
                        String str = this.c;
                        if (bArr4[0] == Byte.MAX_VALUE) {
                            nm2Var = new nm2(bArr4, bArr4.length, 2, (byte) 0);
                            i = 8;
                            i9 = 2;
                            i2 = 0;
                        } else {
                            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length);
                            byte b4 = copyOf[0];
                            if (b4 == -2 || b4 == -1) {
                                for (int i16 = 0; i16 < copyOf.length - 1; i16 += 2) {
                                    byte b5 = copyOf[i16];
                                    int i17 = i16 + 1;
                                    copyOf[i16] = copyOf[i17];
                                    copyOf[i17] = b5;
                                }
                            }
                            nm2 nm2Var2 = new nm2(copyOf, copyOf.length, 2, (byte) 0);
                            if (copyOf[0] == 31) {
                                nm2 nm2Var3 = new nm2(copyOf, copyOf.length, 2, (byte) 0);
                                while (true) {
                                    i2 = i13;
                                    if (nm2Var3.b() < 16) {
                                        break;
                                    }
                                    nm2Var3.t(i12);
                                    int i18 = nm2Var3.i(14) & 16383;
                                    int min2 = Math.min(8 - nm2Var2.c, 14);
                                    int i19 = nm2Var2.c;
                                    int i20 = (8 - i19) - min2;
                                    int i21 = i12;
                                    byte[] bArr5 = nm2Var2.d;
                                    int i22 = nm2Var2.b;
                                    byte b6 = (byte) (bArr5[i22] & ((65280 >> i19) | ((1 << i20) - 1)));
                                    bArr5[i22] = b6;
                                    int i23 = 14 - min2;
                                    bArr5[i22] = (byte) (b6 | ((i18 >>> i23) << i20));
                                    int i24 = i22 + 1;
                                    while (true) {
                                        bArr = nm2Var2.d;
                                        if (i23 > i11) {
                                            bArr[i24] = (byte) (i18 >>> (i23 - 8));
                                            i23 -= 8;
                                            i24++;
                                            i11 = i11;
                                        }
                                    }
                                    int i25 = i11;
                                    byte b7 = (byte) (bArr[i24] & ((1 << r5) - 1));
                                    bArr[i24] = b7;
                                    bArr[i24] = (byte) (((i18 & ((1 << i23) - 1)) << (8 - i23)) | b7);
                                    nm2Var2.t(14);
                                    nm2Var2.a();
                                    i13 = i2;
                                    i12 = i21;
                                    i11 = i25;
                                }
                            } else {
                                i2 = 0;
                            }
                            i = i11;
                            i9 = i12;
                            nm2Var2.p(copyOf, copyOf.length);
                            nm2Var = nm2Var2;
                        }
                        nm2Var.t(60);
                        int i26 = l98.e[nm2Var.i(6)];
                        int i27 = l98.f[nm2Var.i(4)];
                        int i28 = nm2Var.i(5);
                        int i29 = i28 >= 29 ? -1 : (l98.g[i28] * 1000) / 2;
                        nm2Var.t(10);
                        int i30 = i26 + (nm2Var.i(i9) > 0 ? 1 : i2);
                        pm8 pm8Var = new pm8();
                        pm8Var.a = str;
                        pm8Var.k = MimeTypes.AUDIO_DTS;
                        pm8Var.f = i29;
                        pm8Var.x = i30;
                        pm8Var.y = i27;
                        pm8Var.n = null;
                        pm8Var.c = this.b;
                        sm8 sm8Var = new sm8(pm8Var);
                        this.i = sm8Var;
                        this.d.a(sm8Var);
                    } else {
                        i = 8;
                        i2 = 0;
                    }
                    byte b8 = bArr4[i2];
                    if (b8 != -2) {
                        if (b8 == -1) {
                            i8 = ((bArr4[7] & 3) << 12) | ((bArr4[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b3 = bArr4[9];
                        } else if (b8 != 31) {
                            i3 = ((bArr4[5] & 3) << 12) | ((bArr4[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b = bArr4[7];
                        } else {
                            i8 = ((bArr4[6] & 3) << 12) | ((bArr4[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                            b3 = bArr4[i];
                        }
                        i5 = (i8 | ((b3 & 60) >> 2)) + 1;
                        i4 = 1;
                        if (i4 != 0) {
                            i5 = (i5 * 16) / 14;
                        }
                        this.j = i5;
                        if (b8 == -2) {
                            if (b8 == -1) {
                                i6 = (bArr4[4] & 7) << 4;
                                b2 = bArr4[7];
                            } else if (b8 != 31) {
                                i6 = (bArr4[4] & 1) << 6;
                                i7 = bArr4[5] & 252;
                            } else {
                                i6 = (bArr4[5] & 7) << 4;
                                b2 = bArr4[6];
                            }
                            i7 = b2 & 60;
                        } else {
                            i6 = (bArr4[5] & 1) << 6;
                            i7 = bArr4[4] & 252;
                        }
                        this.h = (int) ((((((i7 >> 2) | i6) + 1) * 32) * 1000000) / this.i.z);
                        nkkVar2.E(i2);
                        this.d.d(18, nkkVar2);
                        this.e = 2;
                    } else {
                        i3 = ((bArr4[4] & 3) << 12) | ((bArr4[7] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 4);
                        b = bArr4[6];
                    }
                    i5 = (i3 | ((b & 240) >> 4)) + 1;
                    i4 = i2;
                    if (i4 != 0) {
                    }
                    this.j = i5;
                    if (b8 == -2) {
                    }
                    this.h = (int) ((((((i7 >> 2) | i6) + 1) * 32) * 1000000) / this.i.z);
                    nkkVar2.E(i2);
                    this.d.d(18, nkkVar2);
                    this.e = 2;
                }
            } else {
                if (i10 != 2) {
                    zzl.s();
                    return;
                }
                int min3 = Math.min(nkkVar.c(), this.j - this.f);
                this.d.d(min3, nkkVar);
                int i31 = this.f + min3;
                this.f = i31;
                int i32 = this.j;
                if (i31 == i32) {
                    long j = this.k;
                    if (j != C.TIME_UNSET) {
                        this.d.c(j, 1, i32, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            }
        }
    }

    @Override // defpackage.xi5
    public final void g(int i, long j) {
        if (j != C.TIME_UNSET) {
            this.k = j;
        }
    }

    @Override // defpackage.xi5
    public final void h(ol6 ol6Var, c2k c2kVar) {
        c2kVar.a();
        c2kVar.b();
        this.c = c2kVar.f;
        c2kVar.b();
        this.d = ol6Var.track(c2kVar.e, 1);
    }

    @Override // defpackage.xi5
    public final void seek() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = C.TIME_UNSET;
    }

    @Override // defpackage.xi5
    public final void packetFinished() {
    }
}
