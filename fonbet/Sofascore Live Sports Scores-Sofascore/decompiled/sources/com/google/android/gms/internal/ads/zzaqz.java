package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqz implements zzarh {
    public zzv a;
    public zzfj b;
    public zzaht c;

    public zzaqz(String str) {
        zzt zztVar = new zzt();
        zztVar.c("video/mp2t");
        zztVar.d(str);
        this.a = new zzv(zztVar);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void a(zzfj zzfjVar, zzagk zzagkVar, zzarv zzarvVar) {
        this.b = zzfjVar;
        zzarvVar.a();
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 5);
        this.c = b;
        b.e(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzarh
    public final void i(zzeu zzeuVar) {
        long a;
        long j;
        this.b.getClass();
        String str = zzfm.a;
        zzfj zzfjVar = this.b;
        synchronized (zzfjVar) {
            try {
                long j2 = zzfjVar.c;
                a = j2 != C.TIME_UNSET ? j2 + zzfjVar.b : zzfjVar.a();
            } finally {
            }
        }
        zzfj zzfjVar2 = this.b;
        synchronized (zzfjVar2) {
            j = zzfjVar2.b;
        }
        if (a == C.TIME_UNSET || j == C.TIME_UNSET) {
            return;
        }
        zzv zzvVar = this.a;
        if (j != zzvVar.t) {
            zzt zztVar = new zzt(zzvVar);
            zztVar.s = j;
            zzv zzvVar2 = new zzv(zztVar);
            this.a = zzvVar2;
            this.c.e(zzvVar2);
        }
        int B = zzeuVar.B();
        this.c.b(B, zzeuVar);
        this.c.f(a, 1, B, 0, null);
    }
}
