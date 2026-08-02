package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzevd implements zzfdg {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzr b;
    public final ArrayList c;

    public zzevd(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, ArrayList arrayList) {
        this.a = context;
        this.b = zzrVar;
        this.c = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzblk.a.c()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            com.google.android.gms.ads.internal.zzt.zzc();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    str = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            com.google.android.gms.ads.internal.client.zzr zzrVar = this.b;
            bundle3.putInt("width", zzrVar.zze);
            bundle3.putInt("height", zzrVar.zzb);
            bundle2.putBundle("size", bundle3);
            ArrayList arrayList = this.c;
            if (!arrayList.isEmpty()) {
                bundle2.putParcelableArray("parents", (Parcelable[]) arrayList.toArray(new Parcelable[arrayList.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
