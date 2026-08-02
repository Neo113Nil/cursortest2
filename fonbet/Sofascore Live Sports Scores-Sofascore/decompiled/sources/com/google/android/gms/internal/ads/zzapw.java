package com.google.android.gms.internal.ads;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzapw implements zzagh {
    public final zzapx a = new zzapx(null, 0, MimeTypes.AUDIO_AC3);
    public final zzeu b = new zzeu(2786);
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void a(long j, long j2) {
        this.c = false;
        this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean c(zzagi zzagiVar) {
        zzafy zzafyVar;
        int a;
        zzeu zzeuVar = new zzeu(10);
        int i = 0;
        while (true) {
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzafyVar.f(zzeuVar.a, 0, 6, false);
            zzeuVar.D(0);
            if (zzeuVar.J() != 2935) {
                zzafyVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                zzafyVar.k(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = zzeuVar.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    int i4 = (((bArr[2] & 7) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1;
                    a = i4 + i4;
                } else {
                    byte b = bArr[4];
                    a = zzafh.a((b & 192) >> 6, b & 63);
                }
                if (a == -1) {
                    break;
                }
                zzafyVar.k(a - 6, false);
            }
        }
        return false;
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
        int b = zzagiVar.b(0, 2786, zzeuVar.a);
        if (b == -1) {
            return -1;
        }
        zzeuVar.D(0);
        zzeuVar.C(b);
        boolean z = this.c;
        zzapx zzapxVar = this.a;
        if (!z) {
            zzapxVar.n = 0L;
            this.c = true;
        }
        zzapxVar.c(zzeuVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
