package com.google.android.gms.internal.wearable;

import defpackage.i6o;
import defpackage.m6o;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzad extends zzdg implements zzem {
    private static final zzad zzf;
    private static volatile zzes zzg;
    private byte zze = 2;
    private zzdp zzb = i6o.e;

    static {
        zzad zzadVar = new zzad();
        zzf = zzadVar;
        zzdg.k(zzad.class, zzadVar);
    }

    private zzad() {
    }

    public static zzu n() {
        return (zzu) ((zzdb) zzf.d(5, null));
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    public final Object d(int i, zzdg zzdgVar) {
        zzes zzesVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new m6o(zzf, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzb", zzac.class});
        }
        if (i2 == 3) {
            return new zzad();
        }
        if (i2 == 4) {
            return new zzu(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = zzdgVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar2 = zzg;
        if (zzesVar2 != null) {
            return zzesVar2;
        }
        synchronized (zzad.class) {
            try {
                zzesVar = zzg;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzf);
                    zzg = zzesVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzesVar;
    }

    public final void o(ArrayList arrayList) {
        zzdp zzdpVar = this.zzb;
        if (!zzdpVar.zza()) {
            int size = zzdpVar.size();
            this.zzb = zzdpVar.f(size + size);
        }
        zzbq.h(arrayList, this.zzb);
    }
}
