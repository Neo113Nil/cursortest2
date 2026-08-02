package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcud implements zzddp {
    public final zzfld a;
    public final zzcga b;

    public zzcud(zzfld zzfldVar, zzcga zzcgaVar) {
        this.a = zzfldVar;
        this.b = zzcgaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void I() {
        if (this.a.r0) {
            zzcga zzcgaVar = this.b;
            synchronized (zzcgaVar.a) {
                zzcfx zzcfxVar = zzcgaVar.d;
                synchronized (zzcfxVar.f) {
                    zzcfxVar.l++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void L() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void a0() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzddp
    public final void n(zzcce zzcceVar, String str, String str2) {
    }
}
