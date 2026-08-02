package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes2.dex */
public final class zzaom implements zzane {
    private final zzes zza = new zzes();

    @Override // com.google.android.gms.internal.ads.zzane
    public final void zza(byte[] bArr, int i, int i2, zzand zzandVar, zzds zzdsVar) {
        zzcx zzr;
        zzes zzesVar = this.zza;
        zzesVar.zzb(bArr, i2 + i);
        zzesVar.zzh(i);
        ArrayList arrayList = new ArrayList();
        while (zzesVar.zzd() > 0) {
            zzgsw.zzb(zzesVar.zzd() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int zzB = zzesVar.zzB() - 8;
            if (zzesVar.zzB() == 1987343459) {
                CharSequence charSequence = null;
                zzcw zzcwVar = null;
                while (zzB > 0) {
                    zzgsw.zzb(zzB >= 8, "Incomplete vtt cue box header found.");
                    int zzB2 = zzesVar.zzB();
                    int zzB3 = zzesVar.zzB();
                    int i3 = zzB - 8;
                    int i4 = zzB2 - 8;
                    String zzk = zzfk.zzk(zzesVar.zzi(), zzesVar.zzg(), i4);
                    zzesVar.zzk(i4);
                    if (zzB3 == 1937011815) {
                        zzcwVar = zzaov.zzb(zzk);
                    } else if (zzB3 == 1885436268) {
                        charSequence = zzaov.zzc(null, zzk.trim(), Collections.emptyList());
                    }
                    zzB = i3 - i4;
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (zzcwVar != null) {
                    zzcwVar.zza(charSequence);
                    zzr = zzcwVar.zzr();
                } else {
                    Pattern pattern = zzaov.zza;
                    zzaou zzaouVar = new zzaou();
                    zzaouVar.zzc = charSequence;
                    zzr = zzaouVar.zza().zzr();
                }
                arrayList.add(zzr);
            } else {
                zzesVar.zzk(zzB);
            }
        }
        zzdsVar.zza(new zzamw(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
