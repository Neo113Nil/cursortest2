package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzimy;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
final class zzk implements zzbje {
    final /* synthetic */ zzbjf zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ Uri zzd;

    zzk(zzs zzsVar, zzbjf zzbjfVar, Bundle bundle, Context context, Uri uri) {
        this.zza = zzbjfVar;
        this.zzb = bundle;
        this.zzc = context;
        this.zzd = uri;
        Objects.requireNonNull(zzsVar);
    }

    public static void safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(CustomTabsIntent p0, Context p1, Uri p2) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/browser/customtabs/CustomTabsIntent;->launchUrl(Landroid/content/Context;Landroid/net/Uri;)V");
        if (p2 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p2, h.h);
        p0.launchUrl(p1, p2);
    }

    @Override // com.google.android.gms.internal.ads.zzbje
    public final void zza() {
        zzbjf zzbjfVar = this.zza;
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(zzbjfVar.zzc());
        zzs.zzai(builder, this.zzb);
        CustomTabsIntent build = builder.build();
        Intent intent = build.intent;
        Context context = this.zzc;
        intent.setPackage(zzimy.zza(context));
        safedk_CustomTabsIntent_launchUrl_46a735ad316dd66561bc1347435a4f91(build, context, this.zzd);
        zzbjfVar.zzb((Activity) context);
    }
}
