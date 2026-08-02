package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzara implements zzarw {
    public final zzaqh a;
    public final zzet b = new zzet(new byte[10], 10);
    public int c = 0;
    public int d;
    public zzfj e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public zzara(zzaqh zzaqhVar) {
        this.a = zzaqhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void a(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.e = zzfjVar;
        this.a.a(zzagkVar, zzarvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void b(int i, zzeu zzeuVar) {
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        long j3;
        this.e.getClass();
        int i5 = i & 1;
        zzaqh zzaqhVar = this.a;
        int i6 = 0;
        int i7 = -1;
        int i8 = 2;
        if (i5 != 0) {
            int i9 = this.c;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.j;
                    if (i10 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i10);
                        sb.append(" more bytes");
                        zzeh.c(sb.toString());
                    }
                    zzaqhVar.zzf();
                } else {
                    zzeh.c("Unexpected start indicator reading extended header");
                }
            }
            if (zzeuVar.c == 0) {
                zzaqhVar.zzn();
            }
            this.c = 1;
            this.d = 0;
        }
        int i11 = i;
        while (zzeuVar.B() > 0) {
            int i12 = this.c;
            if (i12 != 0) {
                zzet zzetVar = this.b;
                if (i12 != 1) {
                    if (i12 != i8) {
                        int B = zzeuVar.B();
                        int i13 = this.j;
                        int i14 = i13 == i7 ? i6 : B - i13;
                        if (i14 > 0) {
                            B -= i14;
                            zzeuVar.C(zzeuVar.b + B);
                        }
                        zzaqhVar.c(zzeuVar);
                        int i15 = this.j;
                        if (i15 != i7) {
                            int i16 = i15 - B;
                            this.j = i16;
                            if (i16 == 0) {
                                zzaqhVar.zzf();
                                this.c = 1;
                                this.d = i6;
                            }
                        }
                    } else {
                        if (c(zzeuVar, zzetVar.a, Math.min(10, this.i)) && c(zzeuVar, null, this.i)) {
                            zzetVar.d(i6);
                            if (this.f) {
                                zzetVar.f(4);
                                long h = zzetVar.h(3);
                                zzetVar.f(1);
                                int h2 = zzetVar.h(15) << 15;
                                zzetVar.f(1);
                                long h3 = zzetVar.h(15);
                                zzetVar.f(1);
                                if (this.h || !this.g) {
                                    j2 = h3;
                                    j3 = h;
                                } else {
                                    zzetVar.f(4);
                                    j3 = h;
                                    zzetVar.f(1);
                                    int h4 = zzetVar.h(15) << 15;
                                    zzetVar.f(1);
                                    j2 = h3;
                                    long h5 = zzetVar.h(15);
                                    zzetVar.f(1);
                                    this.e.c(h5 | h4 | (zzetVar.h(3) << 30));
                                    this.h = true;
                                }
                                j = this.e.c((j3 << 30) | h2 | j2);
                            } else {
                                j = C.TIME_UNSET;
                            }
                            i11 |= true != this.k ? 0 : 4;
                            zzaqhVar.b(i11, j);
                            this.c = 3;
                            this.d = 0;
                            i6 = 0;
                            i7 = -1;
                            i8 = 2;
                        }
                    }
                    i2 = i6;
                    i3 = i7;
                } else {
                    i2 = i6;
                    if (c(zzeuVar, zzetVar.a, 9)) {
                        zzetVar.d(i2);
                        int h6 = zzetVar.h(24);
                        if (h6 != 1) {
                            x5n.p(h6, "Unexpected start code prefix: ", new StringBuilder(String.valueOf(h6).length() + 30));
                            i3 = -1;
                            this.j = -1;
                            i4 = 0;
                            i8 = 2;
                        } else {
                            zzetVar.f(8);
                            int h7 = zzetVar.h(16);
                            zzetVar.f(5);
                            this.k = zzetVar.g();
                            i8 = 2;
                            zzetVar.f(2);
                            this.f = zzetVar.g();
                            this.g = zzetVar.g();
                            zzetVar.f(6);
                            int h8 = zzetVar.h(8);
                            this.i = h8;
                            if (h7 == 0) {
                                this.j = -1;
                                i4 = 2;
                                i3 = -1;
                            } else {
                                int i17 = (h7 - 3) - h8;
                                this.j = i17;
                                if (i17 < 0) {
                                    x5n.p(i17, "Found negative packet payload size: ", new StringBuilder(String.valueOf(i17).length() + 36));
                                    i3 = -1;
                                    this.j = -1;
                                } else {
                                    i3 = -1;
                                }
                                i4 = 2;
                            }
                        }
                        this.c = i4;
                        i2 = 0;
                        this.d = 0;
                    } else {
                        i3 = -1;
                        i8 = 2;
                    }
                }
            } else {
                i2 = i6;
                i3 = i7;
                zzeuVar.E(zzeuVar.B());
            }
            i7 = i3;
            i6 = i2;
        }
    }

    public final boolean c(zzeu zzeuVar, byte[] bArr, int i) {
        int min = Math.min(zzeuVar.B(), i - this.d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zzeuVar.E(min);
        } else {
            zzeuVar.F(this.d, min, bArr);
        }
        int i2 = this.d + min;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzarw
    public final void zzb() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zza();
    }
}
