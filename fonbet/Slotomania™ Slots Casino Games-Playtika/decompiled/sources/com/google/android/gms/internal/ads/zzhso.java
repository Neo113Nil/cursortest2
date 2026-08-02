package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzhso extends zzidr implements zzifd {
    private static final zzhso zzc;
    private static volatile zzifk zzd;
    private int zza;
    private zzied zzb = zzbM();

    static {
        zzhso zzhsoVar = new zzhso();
        zzc = zzhsoVar;
        zzidr.zzbu(zzhso.class, zzhsoVar);
    }

    private zzhso() {
    }

    public static zzhso zze(byte[] bArr, zzidb zzidbVar) throws zzieg {
        return (zzhso) zzidr.zzbV(zzc, bArr, zzidbVar);
    }

    public static zzhso zzg(InputStream inputStream, zzidb zzidbVar) throws IOException {
        return (zzhso) zzidr.zzbX(zzc, inputStream, zzidbVar);
    }

    public static zzhsl zzh() {
        return (zzhsl) zzc.zzbn();
    }

    public final int zza() {
        return this.zza;
    }

    public final List zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzhsn zzd(int i) {
        return (zzhsn) this.zzb.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", zzhsn.class});
        }
        if (ordinal == 3) {
            return new zzhso();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzhsl(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzd;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzhso.class) {
            zzifkVar = zzd;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzc);
                zzd = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ void zzi(int i) {
        this.zza = i;
    }

    final /* synthetic */ void zzj(zzhsn zzhsnVar) {
        zzhsnVar.getClass();
        zzied zziedVar = this.zzb;
        if (!zziedVar.zza()) {
            this.zzb = zzidr.zzbN(zziedVar);
        }
        this.zzb.add(zzhsnVar);
    }
}
