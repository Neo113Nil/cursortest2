package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.mbp;
import defpackage.mio;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzwy implements zzzi {
    public final s a;
    public long b;

    public zzwy(List list, List list2) {
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        zzguk.a(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            zzgxjVar.c(new mbp((zzzi) list.get(i), (List) list2.get(i)));
        }
        this.a = zzgxjVar.f();
        this.b = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void a(long j) {
        int i = 0;
        while (true) {
            s sVar = this.a;
            if (i >= sVar.d) {
                return;
            }
            ((mbp) sVar.get(i)).a(j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean f(zzme zzmeVar) {
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            z = false;
            while (true) {
                s sVar = this.a;
                if (i >= sVar.d) {
                    break;
                }
                long zzc2 = ((mbp) sVar.get(i)).a.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= zzmeVar.a;
                if (zzc2 == zzc || z3) {
                    z |= ((mbp) sVar.get(i)).a.f(zzmeVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzb() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            s sVar = this.a;
            if (i >= sVar.d) {
                break;
            }
            mbp mbpVar = (mbp) sVar.get(i);
            long zzb = mbpVar.a.zzb();
            zzgxm zzgxmVar = mbpVar.b;
            if ((zzgxmVar.contains(1) || zzgxmVar.contains(2) || zzgxmVar.contains(4)) && zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
            if (zzb != Long.MIN_VALUE) {
                j2 = Math.min(j2, zzb);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.b = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.b;
        return j3 != C.TIME_UNSET ? j3 : j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final long zzc() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            s sVar = this.a;
            if (i >= sVar.d) {
                break;
            }
            long zzc = ((mbp) sVar.get(i)).a.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zze() {
        int i = 0;
        while (true) {
            s sVar = this.a;
            if (i >= sVar.d) {
                return false;
            }
            if (((mbp) sVar.get(i)).a.zze()) {
                return true;
            }
            i++;
        }
    }
}
