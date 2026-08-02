package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqt implements zzaqh {
    public final zzeu a;
    public final zzahe b;
    public final String c;
    public final int d;
    public final String e;
    public zzaht f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public zzaqt(String str, int i, String str2) {
        zzeu zzeuVar = new zzeu(4);
        this.a = zzeuVar;
        zzeuVar.a[0] = -1;
        this.b = new zzahe();
        this.n = C.TIME_UNSET;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        this.g = zzarvVar.e;
        zzarvVar.b();
        this.f = zzagkVar.b(zzarvVar.d, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        this.n = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void c(zzeu zzeuVar) {
        this.f.getClass();
        while (zzeuVar.B() > 0) {
            int i = this.h;
            zzeu zzeuVar2 = this.a;
            if (i == 0) {
                byte[] bArr = zzeuVar.a;
                int i2 = zzeuVar.b;
                int i3 = zzeuVar.c;
                while (true) {
                    if (i2 >= i3) {
                        zzeuVar.D(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        zzeuVar.D(i4);
                        this.k = false;
                        zzeuVar2.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int min = Math.min(zzeuVar.B(), this.m - this.i);
                this.f.b(min, zzeuVar);
                int i5 = this.i + min;
                this.i = i5;
                if (i5 >= this.m) {
                    zzguk.f(this.n != C.TIME_UNSET);
                    this.f.f(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int min2 = Math.min(zzeuVar.B(), 4 - this.i);
                zzeuVar.F(this.i, min2, zzeuVar2.a);
                int i6 = this.i + min2;
                this.i = i6;
                if (i6 >= 4) {
                    zzeuVar2.D(0);
                    int b2 = zzeuVar2.b();
                    zzahe zzaheVar = this.b;
                    if (zzaheVar.a(b2)) {
                        this.m = zzaheVar.c;
                        if (!this.j) {
                            this.l = (zzaheVar.g * 1000000) / zzaheVar.d;
                            zzt zztVar = new zzt();
                            zztVar.a = this.g;
                            zztVar.c(this.e);
                            zztVar.d(zzaheVar.b);
                            zztVar.o = 4096;
                            zztVar.G = zzaheVar.e;
                            zztVar.I = zzaheVar.d;
                            zztVar.d = this.c;
                            zztVar.f = this.d;
                            this.f.e(new zzv(zztVar));
                            this.j = true;
                        }
                        zzeuVar2.D(0);
                        this.f.b(4, zzeuVar2);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = C.TIME_UNSET;
    }
}
