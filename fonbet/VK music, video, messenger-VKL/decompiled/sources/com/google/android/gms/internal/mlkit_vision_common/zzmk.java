package com.google.android.gms.internal.mlkit_vision_common;

import com.ironsource.B5;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import xsna.exc0;
import xsna.oby;
import xsna.v8y;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes12.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzc = this.zza.zzf().zzc();
        if (zzc == null || zzg.zzb(zzc.zzk())) {
            return "NA";
        }
        String zzk = zzc.zzk();
        exc0.i(zzk);
        return zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z) {
        this.zzb.zzf(Boolean.valueOf(1 == (i ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            if (i != 0) {
                zziy zzf = this.zza.zzf();
                zzam zzamVar = new zzam();
                zzhe.zza.configure(zzamVar);
                return zzamVar.zza().zza(zzf);
            }
            zziy zzf2 = this.zza.zzf();
            v8y v8yVar = new v8y();
            zzhe.zza.configure(v8yVar);
            v8yVar.d = true;
            StringWriter stringWriter = new StringWriter();
            try {
                oby obyVar = new oby(stringWriter, v8yVar.a, v8yVar.b, v8yVar.c, v8yVar.d);
                obyVar.a(zzf2);
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
