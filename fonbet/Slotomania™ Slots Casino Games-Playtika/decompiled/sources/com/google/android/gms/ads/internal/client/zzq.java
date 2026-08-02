package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes3.dex */
public final class zzq {
    public static final zzq zza = new zzq();

    protected zzq() {
    }

    public final zzm zza(Context context, zzeh zzehVar) {
        String str;
        String zza2 = zzehVar.zza();
        Set zzc = zzehVar.zzc();
        List unmodifiableList = !zzc.isEmpty() ? Collections.unmodifiableList(new ArrayList(zzc)) : null;
        boolean zzh = zzehVar.zzh(context);
        Bundle zzd = zzehVar.zzd(AdMobAdapter.class);
        String zzf = zzehVar.zzf();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzay.zza();
            str = com.google.android.gms.ads.internal.util.client.zzf.zzx(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean zzm = zzehVar.zzm();
        RequestConfiguration zzp = zzeu.zzb().zzp();
        return new zzm(8, -1L, zzd, -1, unmodifiableList, zzh, Math.max(zzehVar.zzj(), zzp.getTagForChildDirectedTreatment()), false, zzf, null, null, zza2, zzehVar.zzi(), zzehVar.zzk(), Collections.unmodifiableList(new ArrayList(zzehVar.zzl())), zzehVar.zzg(), str, zzm, null, zzp.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, zzp.getMaxAdContentRating()), zzp.zza), zzehVar.zzb(), zzehVar.zzo(), zzehVar.zzn(), zzp.getPublisherPrivacyPersonalizationState().getValue(), zzehVar.zzq(), zzehVar.zzr());
    }
}
