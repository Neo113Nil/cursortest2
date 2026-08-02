package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzhh extends zzhb {
    private zzhn zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzhh() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        String str = zzfk.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzh(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final long zzb(zzhn zzhnVar) throws IOException {
        zzf(zzhnVar);
        this.zza = zzhnVar;
        Uri normalizeScheme = zzhnVar.zza.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        zzgsw.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = zzfk.zza;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            String valueOf = String.valueOf(normalizeScheme);
            String.valueOf(valueOf);
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(valueOf)), null);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                String.valueOf(str2);
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j = zzhnVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new zzhk(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzhnVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) Math.min(i2, j2);
        }
        zzg(zzhnVar);
        return j2 != -1 ? j2 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final Uri zzc() {
        zzhn zzhnVar = this.zza;
        if (zzhnVar != null) {
            return zzhnVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhj
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
