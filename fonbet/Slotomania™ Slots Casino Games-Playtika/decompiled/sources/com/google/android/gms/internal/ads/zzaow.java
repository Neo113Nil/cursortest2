package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaow implements zzane {
    private final zzes zza = new zzes();
    private final zzaon zzb = new zzaon();

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        try {
            int zzg = zzesVar.zzg();
            String zzN = zzesVar.zzN(StandardCharsets.UTF_8);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzesVar.zzh(zzg);
                String zzN2 = zzesVar.zzN(StandardCharsets.UTF_8);
                String.valueOf(zzN2);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzN2)), null);
            }
            while (!TextUtils.isEmpty(zzesVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzesVar.zzg();
                    String zzN3 = zzesVar.zzN(StandardCharsets.UTF_8);
                    c = zzN3 == null ? (char) 0 : "STYLE".equals(zzN3) ? (char) 2 : zzN3.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzesVar.zzh(i3);
                if (c == 0) {
                    zzamy.zza(new zzaoz(arrayList2), zzandVar, zzdsVar);
                    return;
                }
                if (c == 1) {
                    while (!TextUtils.isEmpty(zzesVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    zzaop zza = zzaov.zza(zzesVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzesVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzesVar));
                }
            }
        } catch (zzat e) {
            throw new IllegalArgumentException(e);
        }
    }
}
