package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgah extends zzidr implements zzifd {
    private static final zzgah zzb;
    private static volatile zzifk zzc;
    private zziew zza = zziew.zza();

    static {
        zzgah zzgahVar = new zzgah();
        zzb = zzgahVar;
        zzidr.zzbu(zzgah.class, zzgahVar);
    }

    private zzgah() {
    }

    public static zzgah zzc(InputStream inputStream) throws IOException {
        return (zzgah) zzidr.zzbW(zzb, inputStream);
    }

    public static zzgah zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzidr
    protected final Object zzdc(zzidq zzidqVar, Object obj, Object obj2) {
        zzifk zzifkVar;
        int ordinal = zzidqVar.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzgag.zza});
        }
        if (ordinal == 3) {
            return new zzgah();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zzgaf(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        zzifk zzifkVar2 = zzc;
        if (zzifkVar2 != null) {
            return zzifkVar2;
        }
        synchronized (zzgah.class) {
            zzifkVar = zzc;
            if (zzifkVar == null) {
                zzifkVar = new zzidm(zzb);
                zzc = zzifkVar;
            }
        }
        return zzifkVar;
    }

    final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
