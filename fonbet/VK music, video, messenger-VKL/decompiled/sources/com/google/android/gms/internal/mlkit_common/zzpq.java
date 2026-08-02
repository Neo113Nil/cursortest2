package com.google.android.gms.internal.mlkit_common;

import com.ironsource.B5;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xsna.exc0;
import xsna.oby;
import xsna.v8y;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzpq implements zzpe {
    private final zzle zza;
    private zznz zzb = new zznz();

    private zzpq(zzle zzleVar, int i) {
        this.zza = zzleVar;
        zzqb.zza();
    }

    public static zzpe zzf(zzle zzleVar) {
        return new zzpq(zzleVar, 0);
    }

    public static zzpe zzg() {
        return new zzpq(new zzle(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zza(zzld zzldVar) {
        this.zza.zzf(zzldVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zzb(zzlk zzlkVar) {
        this.zza.zzi(zzlkVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final zzpe zzc(zznz zznzVar) {
        this.zzb = zznzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final String zzd() {
        zzob zzf = this.zza.zzk().zzf();
        if (zzf == null || zzag.zzc(zzf.zzk())) {
            return "NA";
        }
        String zzk = zzf.zzk();
        exc0.i(zzk);
        return zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzpe
    public final byte[] zze(int i, boolean z) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzqb.zza();
            if (i != 0) {
                zzlg zzk = this.zza.zzk();
                zzbs zzbsVar = new zzbs();
                zzjh.zza.configure(zzbsVar);
                return zzbsVar.zza().zza(zzk);
            }
            zzlg zzk2 = this.zza.zzk();
            v8y v8yVar = new v8y();
            zzjh.zza.configure(v8yVar);
            v8yVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                oby obyVar = new oby(stringWriter, v8yVar.a, v8yVar.b, v8yVar.c, v8yVar.d);
                obyVar.a(zzk2);
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
