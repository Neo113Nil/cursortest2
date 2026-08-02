package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapz implements zzagh {
    public final zzaqa a = new zzaqa(null, 0, "audio/ac4");
    public final zzeu b = new zzeu(16384);
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.c = false;
        this.a.zza();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // com.google.android.gms.internal.ads.zzagh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(zzagi zzagiVar) {
        zzafy zzafyVar;
        int i;
        zzeu zzeuVar = new zzeu(10);
        int i2 = 0;
        while (true) {
            zzafyVar = (zzafy) zzagiVar;
            zzafyVar.f(zzeuVar.a, 0, 10, false);
            zzeuVar.D(0);
            if (zzeuVar.M() != 4801587) {
                break;
            }
            zzeuVar.E(3);
            int g = zzeuVar.g();
            i2 += g + 10;
            zzafyVar.k(g, false);
        }
        zzafyVar.f = 0;
        zzafyVar.k(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzafyVar.f(zzeuVar.a, 0, 7, false);
            zzeuVar.D(0);
            int J = zzeuVar.J();
            if (J == 44096 || J == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = zzeuVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i5 = 4;
                    }
                    if (J == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                zzafyVar.k(i - 7, false);
            } else {
                zzafyVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                zzafyVar.k(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void d(zzagk zzagkVar) {
        this.a.a(zzagkVar, new zzarv(Integer.MIN_VALUE, 0, 1));
        zzagkVar.zzv();
        zzagkVar.c(new zzahj(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int e(zzagi zzagiVar, zzahh zzahhVar) {
        zzeu zzeuVar = this.b;
        int b = zzagiVar.b(0, 16384, zzeuVar.a);
        if (b == -1) {
            return -1;
        }
        zzeuVar.D(0);
        zzeuVar.C(b);
        boolean z = this.c;
        zzaqa zzaqaVar = this.a;
        if (!z) {
            zzaqaVar.n = 0L;
            this.c = true;
        }
        zzaqaVar.c(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
