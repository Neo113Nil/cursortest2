package com.google.android.gms.internal.wearable;

import defpackage.m6o;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzac extends zzdg implements zzem {
    private static final zzac zzh;
    private static volatile zzes zzi;
    private int zzb;
    private zzab zzf;
    private byte zzg = 2;
    private String zze = "";

    static {
        zzac zzacVar = new zzac();
        zzh = zzacVar;
        zzdg.k(zzac.class, zzacVar);
    }

    private zzac() {
    }

    public static zzv n() {
        return (zzv) ((zzdb) zzh.d(5, null));
    }

    @Override // com.google.android.gms.internal.wearable.zzdg
    public final Object d(int i, zzdg zzdgVar) {
        zzes zzesVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i2 == 2) {
            return new m6o(zzh, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzac();
        }
        if (i2 == 4) {
            return new zzv(zzh);
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
        synchronized (zzac.class) {
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

    public final /* synthetic */ void o(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void p(zzab zzabVar) {
        zzabVar.getClass();
        this.zzf = zzabVar;
        this.zzb |= 2;
    }
}
