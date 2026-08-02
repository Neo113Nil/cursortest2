package com.google.android.gms.internal.pal;

import android.os.Bundle;
import defpackage.pao;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeu extends zzfg {
    @Override // com.google.android.gms.internal.pal.zzfg
    public final void a() {
        Object obj;
        final pao paoVar = zzgk.a;
        final zzgi zzgiVar = zzfv.d.c;
        if (!zzgiVar.b.block(5000L)) {
            synchronized (zzgiVar.a) {
                try {
                    if (!zzgiVar.d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } finally {
                }
            }
        }
        if (!zzgiVar.c || zzgiVar.e == null) {
            synchronized (zzgiVar.a) {
                if (!zzgiVar.c || zzgiVar.e == null) {
                    obj = paoVar.c;
                }
            }
            ((Boolean) obj).getClass();
            throw null;
        }
        int i = paoVar.a;
        if (i == 2) {
            Bundle bundle = zzgiVar.f;
            obj = bundle == null ? paoVar.c : paoVar.b(bundle);
        } else {
            obj = (i == 1 && zzgiVar.h.has(paoVar.b)) ? paoVar.a(zzgiVar.h) : zzgl.a(new zzis() { // from class: com.google.android.gms.internal.pal.zzgf
                @Override // com.google.android.gms.internal.pal.zzis
                public final Object zza() {
                    return paoVar.c(zzgi.this.e);
                }
            });
        }
        ((Boolean) obj).getClass();
        throw null;
    }
}
