package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzgar;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzay extends zzauh {
    public final Context c;

    public zzay(Context context, zzaut zzautVar) {
        super(zzautVar);
        this.c = context;
    }

    public static zzatv zzb(Context context) {
        zzay zzayVar = new zzay(context, new zzaut());
        File cacheDir = context.getCacheDir();
        int i = zzgar.a;
        zzatv zzatvVar = new zzatv(new zzauo(new File(new File(cacheDir, "admob_volley").getPath())), zzayVar);
        zzatvVar.a();
        return zzatvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauh, com.google.android.gms.internal.ads.zzatl
    public final zzato zza(zzats zzatsVar) throws zzaub {
        if (zzatsVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.z5), zzatsVar.zzh())) {
                com.google.android.gms.ads.internal.client.zzay.zza();
                Context context = this.c;
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    zzato zza = new zzbsg(context).zza(zzatsVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzatsVar.zzh())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzatsVar.zzh())));
                }
            }
        }
        return super.zza(zzatsVar);
    }
}
