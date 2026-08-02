package com.google.android.gms.internal.play_billing;

import defpackage.e5p;
import defpackage.fbo;
import defpackage.hda;
import defpackage.k6p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzu {
    public static k6p a(zzr zzrVar) {
        zzp zzpVar = new zzp();
        k6p k6pVar = new k6p(zzpVar);
        zzpVar.b = k6pVar;
        zzpVar.a = zzrVar.getClass();
        try {
            zzpVar.a = zzrVar.zza(zzpVar);
            return k6pVar;
        } catch (Exception e) {
            fbo fboVar = new fbo(e);
            hda hdaVar = zzo.f;
            e5p e5pVar = k6pVar.b;
            if (hdaVar.b0(e5pVar, null, fboVar)) {
                zzo.c(e5pVar);
            }
            return k6pVar;
        }
    }
}
