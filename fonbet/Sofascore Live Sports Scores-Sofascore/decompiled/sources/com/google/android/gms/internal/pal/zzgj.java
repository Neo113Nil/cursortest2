package com.google.android.gms.internal.pal;

import defpackage.pao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzgj implements zzis {
    @Override // com.google.android.gms.internal.pal.zzis
    public final Object zza() {
        pao paoVar = zzgk.a;
        zzgi zzgiVar = zzfv.d.c;
        if (!zzgiVar.c) {
            synchronized (zzgiVar.a) {
                try {
                    if (!zzgiVar.c) {
                        if (zzgiVar.d) {
                            throw null;
                        }
                        zzgiVar.d = true;
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }
}
