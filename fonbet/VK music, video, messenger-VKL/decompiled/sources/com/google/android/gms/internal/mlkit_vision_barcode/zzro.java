package com.google.android.gms.internal.mlkit_vision_barcode;

import com.ironsource.B5;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xsna.exc0;
import xsna.oby;
import xsna.v8y;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzro implements zzra {
    private final zznf zza;
    private zzpx zzb = new zzpx();
    private final int zzc;

    private zzro(zznf zznfVar, int i) {
        this.zza = zznfVar;
        zzrx.zza();
        this.zzc = i;
    }

    public static zzra zzf(zznf zznfVar) {
        return new zzro(zznfVar, 0);
    }

    public static zzra zzg(zznf zznfVar, int i) {
        return new zzro(zznfVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzra
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzra
    public final zzra zzb(zzne zzneVar) {
        this.zza.zzf(zzneVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzra
    public final zzra zzc(zzpx zzpxVar) {
        this.zzb = zzpxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzra
    public final String zzd() {
        zzpz zzf = this.zza.zzj().zzf();
        if (zzf == null || zzar.zzb(zzf.zzk())) {
            return "NA";
        }
        String zzk = zzf.zzk();
        exc0.i(zzk);
        return zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzra
    public final byte[] zze(int i, boolean z) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzrx.zza();
            if (i != 0) {
                zznh zzj = this.zza.zzj();
                zzdo zzdoVar = new zzdo();
                zzlh.zza.configure(zzdoVar);
                return zzdoVar.zza().zza(zzj);
            }
            zznh zzj2 = this.zza.zzj();
            v8y v8yVar = new v8y();
            zzlh.zza.configure(v8yVar);
            v8yVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                oby obyVar = new oby(stringWriter, v8yVar.a, v8yVar.b, v8yVar.c, v8yVar.d);
                obyVar.a(zzj2);
                obyVar.c();
                obyVar.b.flush();
            } catch (IOException unused) {
            }
            return stringWriter.toString().getBytes(B5.O);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
