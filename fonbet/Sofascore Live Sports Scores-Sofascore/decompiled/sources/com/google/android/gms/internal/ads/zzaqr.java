package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaqr implements zzaqh {
    public zzaht b;
    public boolean c;
    public int e;
    public int f;
    public final zzeu a = new zzeu(10);
    public long d = C.TIME_UNSET;

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void a(zzagk zzagkVar, zzarv zzarvVar) {
        zzarvVar.a();
        zzarvVar.b();
        zzaht b = zzagkVar.b(zzarvVar.d, 5);
        this.b = b;
        zzt zztVar = new zzt();
        zzarvVar.b();
        zztVar.a = zzarvVar.e;
        zztVar.c("video/mp2t");
        zztVar.d(MimeTypes.APPLICATION_ID3);
        b.e(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void b(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void c(zzeu zzeuVar) {
        this.b.getClass();
        if (this.c) {
            int B = zzeuVar.B();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(B, 10 - i);
                byte[] bArr = zzeuVar.a;
                int i2 = zzeuVar.b;
                zzeu zzeuVar2 = this.a;
                System.arraycopy(bArr, i2, zzeuVar2.a, this.f, min);
                if (this.f + min == 10) {
                    zzeuVar2.D(0);
                    if (zzeuVar2.I() != 73 || zzeuVar2.I() != 68 || zzeuVar2.I() != 51) {
                        zzeh.c("Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        zzeuVar2.E(3);
                        this.e = zzeuVar2.g() + 10;
                    }
                }
            }
            int min2 = Math.min(B, this.e - this.f);
            this.b.b(min2, zzeuVar);
            this.f += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zza() {
        this.c = false;
        this.d = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzf() {
        int i;
        this.b.getClass();
        if (this.c && (i = this.e) != 0 && this.f == i) {
            zzguk.f(this.d != C.TIME_UNSET);
            this.b.f(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }
}
