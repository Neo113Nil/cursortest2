package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqa implements zzaqh {
    public final zzet a;
    public final zzeu b;
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public zzaht g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public zzv l;
    public int m;
    public long n;

    public zzaqa(String str, int i, String str2) {
        zzet zzetVar = new zzet(new byte[16], 16);
        this.a = zzetVar;
        this.b = new zzeu(zzetVar.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.f = zzarvVar.e;
        zzarvVar.b();
        this.g = zzagkVar.b(zzarvVar.d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.n = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0118  */
    @Override // com.google.android.gms.internal.ads.zzaqh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(zzeu zzeuVar) {
        boolean z;
        this.g.getClass();
        while (zzeuVar.B() > 0) {
            int i = this.h;
            zzeu zzeuVar2 = this.b;
            if (i == 0) {
                while (zzeuVar.B() > 0) {
                    if (this.j) {
                        int I = zzeuVar.I();
                        this.j = I == 172;
                        if (I != 64) {
                            if (I == 65) {
                            }
                        } else if (I != 65) {
                            z = false;
                            this.h = 1;
                            byte[] bArr = zzeuVar2.a;
                            bArr[0] = -84;
                            bArr[1] = true == z ? (byte) 65 : (byte) 64;
                            this.i = 2;
                        }
                        z = true;
                        this.h = 1;
                        byte[] bArr2 = zzeuVar2.a;
                        bArr2[0] = -84;
                        bArr2[1] = true == z ? (byte) 65 : (byte) 64;
                        this.i = 2;
                    } else {
                        this.j = zzeuVar.I() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzeuVar.B(), this.m - this.i);
                this.g.b(min, zzeuVar);
                int i2 = this.i + min;
                this.i = i2;
                if (i2 == this.m) {
                    zzguk.f(this.n != C.TIME_UNSET);
                    this.g.f(this.n, 1, this.m, 0, null);
                    this.n += this.k;
                    this.h = 0;
                }
            } else {
                byte[] bArr3 = zzeuVar2.a;
                int min2 = Math.min(zzeuVar.B(), 16 - this.i);
                zzeuVar.F(this.i, min2, bArr3);
                int i3 = this.i + min2;
                this.i = i3;
                if (i3 == 16) {
                    zzet zzetVar = this.a;
                    zzetVar.d(0);
                    zzafj a = zzafk.a(zzetVar);
                    int i4 = a.a;
                    zzv zzvVar = this.l;
                    if (zzvVar == null || zzvVar.H != 2 || i4 != zzvVar.J || !"audio/ac4".equals(zzvVar.o)) {
                        zzt zztVar = new zzt();
                        zztVar.a = this.f;
                        zztVar.c(this.e);
                        zztVar.d("audio/ac4");
                        zztVar.G = 2;
                        zztVar.I = i4;
                        zztVar.d = this.c;
                        zztVar.f = this.d;
                        zzv zzvVar2 = new zzv(zztVar);
                        this.l = zzvVar2;
                        this.g.e(zzvVar2);
                    }
                    this.m = a.b;
                    this.k = (a.c * 1000000) / this.l.J;
                    zzeuVar2.D(0);
                    this.g.b(16, zzeuVar2);
                    this.h = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C.TIME_UNSET;
    }
}
