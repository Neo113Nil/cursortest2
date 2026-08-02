package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfmu {
    public final zzbvx a;

    public zzfmu(zzbvx zzbvxVar) {
        this.a = zzbvxVar;
    }

    public final boolean a() {
        try {
            return this.a.zzq();
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }

    public final void b(boolean z) {
        try {
            this.a.Q0(z);
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }
}
