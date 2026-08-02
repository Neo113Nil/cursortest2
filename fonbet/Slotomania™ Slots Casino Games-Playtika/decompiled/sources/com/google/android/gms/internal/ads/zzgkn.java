package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgkn {
    private final File zza;
    private final zzfwl zzb;
    private final zzgpu zzc;

    public zzgkn(File file, zzfwl zzfwlVar, zzgpu zzgpuVar) {
        this.zza = file;
        this.zzb = zzfwlVar;
        this.zzc = zzgpuVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean z;
        try {
            File file = this.zza;
            zzgzg.zzb(file);
            zzgzg.zza(bArr, file);
            z = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e) {
            this.zzc.zzd(2027, e);
            z = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return z;
    }
}
