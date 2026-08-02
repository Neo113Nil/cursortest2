package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqc implements zzagh {
    public final zzaqd a;
    public final zzeu b;
    public final zzeu c;
    public final zzet d;
    public zzagk e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    public zzaqc(int i) {
        this.a = new zzaqd(0, null, MimeTypes.AUDIO_AAC, true);
        this.b = new zzeu(com.ironsource.mediationsdk.metadata.a.o);
        this.g = -1L;
        zzeu zzeuVar = new zzeu(10);
        this.c = zzeuVar;
        byte[] bArr = zzeuVar.a;
        this.d = new zzet(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.h = false;
        this.a.zza();
        this.f = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzeu zzeuVar;
        zzafy zzafyVar;
        int i = 0;
        while (true) {
            zzeuVar = this.c;
            zzafyVar = (zzafy) zzagiVar;
            zzafyVar.f(zzeuVar.a, 0, 10, false);
            zzeuVar.D(0);
            if (zzeuVar.M() != 4801587) {
                break;
            }
            zzeuVar.E(3);
            int g = zzeuVar.g();
            i += g + 10;
            zzafyVar.k(g, false);
        }
        zzafyVar.f = 0;
        zzafyVar.k(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzafyVar.f(zzeuVar.a, 0, 2, false);
            zzeuVar.D(0);
            if ((zzeuVar.J() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzafyVar.f(zzeuVar.a, 0, 4, false);
                zzet zzetVar = this.d;
                zzetVar.d(14);
                int h = zzetVar.h(13);
                if (h <= 6) {
                    i4++;
                    zzafyVar.f = 0;
                    zzafyVar.k(i4, false);
                } else {
                    zzafyVar.k(h - 6, false);
                    i3 += h;
                }
            } else {
                i4++;
                zzafyVar.f = 0;
                zzafyVar.k(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.e = zzagkVar;
        this.a.a(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        this.e.getClass();
        zzeu zzeuVar = this.b;
        int b = zzagiVar.b(0, com.ironsource.mediationsdk.metadata.a.o, zzeuVar.a);
        if (!this.i) {
            this.e.c(new zzahj(C.TIME_UNSET, 0L));
            this.i = true;
        }
        if (b == -1) {
            return -1;
        }
        zzeuVar.D(0);
        zzeuVar.C(b);
        boolean z = this.h;
        zzaqd zzaqdVar = this.a;
        if (!z) {
            zzaqdVar.u = this.f;
            this.h = true;
        }
        zzaqdVar.c(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }

    public zzaqc() {
        throw null;
    }
}
