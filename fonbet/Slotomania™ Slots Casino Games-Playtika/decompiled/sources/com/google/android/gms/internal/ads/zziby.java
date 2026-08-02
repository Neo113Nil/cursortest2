package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
public abstract class zziby implements zzifk {
    static {
        int i = zzidb.zzb;
        int i2 = zzica.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifk
    public final /* synthetic */ Object zza(InputStream inputStream, zzidb zzidbVar) throws zzieg {
        zzigg zzaU;
        zzicr zzH = zzicr.zzH(inputStream, 4096);
        zzifc zzifcVar = (zzifc) zzb(zzH, zzidbVar);
        zzH.zzb(0);
        if (zzifcVar == null || zzifcVar.zzbi()) {
            return zzifcVar;
        }
        if (zzifcVar instanceof zzibw) {
            zzaU = ((zzibw) zzifcVar).zzaU();
        } else {
            if (zzifcVar instanceof zzibx) {
                throw null;
            }
            zzaU = new zzigg(zzifcVar);
        }
        throw zzaU.zza();
    }
}
