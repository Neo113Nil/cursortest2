package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

@TargetApi(14)
/* loaded from: classes.dex */
final class zzio implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzip zza;

    /* synthetic */ zzio(zzip zzipVar, zzin zzinVar) {
        this.zza = zzipVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzio zzioVar;
        zzgk zzgkVar;
        Intent intent;
        try {
            try {
                this.zza.zzs.zzay().zzj().zza("onActivityCreated");
                intent = activity.getIntent();
            } catch (Throwable th2) {
                th = th2;
                zzioVar.zza.zzs.zzs().zzr(activity, bundle);
                throw th;
            }
        } catch (RuntimeException e11) {
            e = e11;
            zzioVar = this;
        } catch (Throwable th3) {
            th = th3;
            zzioVar = this;
            zzioVar.zza.zzs.zzs().zzr(activity, bundle);
            throw th;
        }
        if (intent == null) {
            zzgkVar = this.zza.zzs;
        } else {
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                zzgkVar = this.zza.zzs;
            } else {
                this.zza.zzs.zzv();
                String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                String str = ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto";
                String queryParameter = data.getQueryParameter("referrer");
                zzioVar = this;
                try {
                    this.zza.zzs.zzaz().zzp(new zzim(zzioVar, bundle == null, data, str, queryParameter));
                    zzgkVar = zzioVar.zza.zzs;
                } catch (RuntimeException e12) {
                    e = e12;
                    zzioVar.zza.zzs.zzay().zzd().zzb("Throwable caught in onActivityCreated", e);
                    zzgkVar = zzioVar.zza.zzs;
                    zzgkVar.zzs().zzr(activity, bundle);
                }
            }
        }
        zzgkVar.zzs().zzr(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzs.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.zza.zzs.zzs().zzt(activity);
        zzku zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzkn(zzu, zzu.zzs.zzav().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzku zzu = this.zza.zzs.zzu();
        zzu.zzs.zzaz().zzp(new zzkm(zzu, zzu.zzs.zzav().elapsedRealtime()));
        this.zza.zzs.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzs.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
