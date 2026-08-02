package com.google.android.gms.internal.wearable;

import defpackage.m6o;
import defpackage.pbp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzab extends zzdg implements zzem {
    private static final zzab zzh;
    private static volatile zzes zzi;
    private int zzb;
    private zzaa zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        zzab zzabVar = new zzab();
        zzh = zzabVar;
        zzdg.k(zzab.class, zzabVar);
    }

    private zzab() {
    }

    public static zzw n() {
        return (zzw) ((zzdb) zzh.d(5, null));
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    public final Object d(int i, zzdg zzdgVar) {
        zzes zzesVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new m6o(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzb", "zze", pbp.a, "zzf"});
        }
        if (i2 == 3) {
            return new zzab();
        }
        if (i2 == 4) {
            return new zzw(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            this.zzg = zzdgVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzes zzesVar2 = zzi;
        if (zzesVar2 != null) {
            return zzesVar2;
        }
        synchronized (zzab.class) {
            try {
                zzesVar = zzi;
                if (zzesVar == null) {
                    zzesVar = new zzdc(zzh);
                    zzi = zzesVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzesVar;
    }

    public final /* synthetic */ void o(zzaa zzaaVar) {
        this.zzf = zzaaVar;
        this.zzb |= 2;
    }

    public final int p() {
        int a = zzy.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final /* synthetic */ void q(int i) {
        this.zze = i;
        this.zzb |= 1;
    }
}
