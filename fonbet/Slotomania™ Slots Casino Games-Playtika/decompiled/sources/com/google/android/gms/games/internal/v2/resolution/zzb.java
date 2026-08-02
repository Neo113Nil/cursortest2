package com.google.android.gms.games.internal.v2.resolution;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.tasks.Task;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes7.dex */
public final class zzb {
    zzb() {
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, "com.google.android.gms.games");
        p0.startActivity(p1);
    }

    public static zzb zza() {
        return new zzb();
    }

    public static final Task zzb(Activity activity, PendingIntent pendingIntent) {
        zza zzaVar = new zza();
        Intent intent = new Intent(activity, (Class<?>) GamesResolutionActivity.class);
        intent.putExtra(BaseGmsClient.KEY_PENDING_INTENT, pendingIntent);
        intent.putExtra("resultReceiver", zzaVar);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        return zzaVar.zza();
    }
}
