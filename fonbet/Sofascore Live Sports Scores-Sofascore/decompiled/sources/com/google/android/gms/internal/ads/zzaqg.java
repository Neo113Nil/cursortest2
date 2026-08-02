package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqg implements zzaqh {
    public final List a;
    public final zzaht[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = C.TIME_UNSET;

    public zzaqg(List list) {
        this.a = list;
        this.b = new zzaht[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        int i = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.b;
            if (i >= zzahtVarArr.length) {
                return;
            }
            zzars zzarsVar = (zzars) this.a.get(i);
            zzarvVar.a();
            zzarvVar.b();
            zzaht b = zzagkVar.b(zzarvVar.d, 3);
            zzt zztVar = new zzt();
            zzarvVar.b();
            zztVar.a = zzarvVar.e;
            zztVar.c("video/mp2t");
            zztVar.d(MimeTypes.APPLICATION_DVBSUBS);
            zztVar.q = Collections.singletonList(zzarsVar.b);
            zztVar.d = zzarsVar.a;
            b.e(new zzv(zztVar));
            zzahtVarArr[i] = b;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void c(zzeu zzeuVar) {
        boolean z;
        boolean z2;
        if (!this.c) {
            return;
        }
        int i = 0;
        if (this.d == 2) {
            if (zzeuVar.B() == 0) {
                z2 = false;
            } else {
                if (zzeuVar.I() != 32) {
                    this.c = false;
                }
                this.d--;
                z2 = this.c;
            }
            if (!z2) {
                return;
            }
        }
        if (this.d == 1) {
            if (zzeuVar.B() == 0) {
                z = false;
            } else {
                if (zzeuVar.I() != 0) {
                    this.c = false;
                }
                this.d--;
                z = this.c;
            }
            if (!z) {
                return;
            }
        }
        int i2 = zzeuVar.b;
        int B = zzeuVar.B();
        while (true) {
            zzaht[] zzahtVarArr = this.b;
            if (i >= zzahtVarArr.length) {
                this.e += B;
                return;
            }
            zzaht zzahtVar = zzahtVarArr[i];
            zzeuVar.D(i2);
            zzahtVar.b(B, zzeuVar);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.c = false;
        this.f = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzf() {
        if (!this.c) {
            return;
        }
        zzguk.f(this.f != C.TIME_UNSET);
        int i = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.b;
            if (i >= zzahtVarArr.length) {
                this.c = false;
                return;
            } else {
                zzahtVarArr[i].f(this.f, 1, this.e, 0, null);
                i++;
            }
        }
    }
}
