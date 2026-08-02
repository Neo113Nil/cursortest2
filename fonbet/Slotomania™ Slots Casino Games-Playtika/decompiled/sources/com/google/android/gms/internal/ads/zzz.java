package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzz {
    private String zza;
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzgvz zze;
    private final zzae zzf;
    private final zzai zzg;

    public zzz() {
        zzgvz.zzi();
        this.zzd = Collections.emptyList();
        this.zze = zzgvz.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzz zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzak zzc() {
        zzag zzagVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new zzag(uri, null, null, null, this.zzd, null, this.zze, null, C.TIME_UNSET, null);
        } else {
            zzagVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, bArr), zzan.zza, this.zzg, null);
    }
}
