package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzclf implements zzbpe {
    final /* synthetic */ zzcll zza;

    zzclf(zzcll zzcllVar) {
        Objects.requireNonNull(zzcllVar);
        this.zza = zzcllVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpe
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int parseInt = Integer.parseInt(str);
                zzcll zzcllVar = this.zza;
                synchronized (zzcllVar) {
                    if (zzcllVar.zzaX() != parseInt) {
                        zzcllVar.zzaY(parseInt);
                        zzcllVar.requestLayout();
                    }
                }
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e);
            }
        }
    }
}
