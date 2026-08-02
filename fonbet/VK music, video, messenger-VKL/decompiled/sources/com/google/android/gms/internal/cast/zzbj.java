package com.google.android.gms.internal.cast;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.internal.featurehighlight.c;
import com.vk.core.preference.Preference;
import java.util.Objects;
import xsna.sc01;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
final class zzbj implements sc01 {
    final /* synthetic */ Activity zza;
    final /* synthetic */ c zzb;
    final /* synthetic */ zzbk zzc;

    public zzbj(zzbk zzbkVar, Activity activity, c cVar) {
        this.zza = activity;
        this.zzb = cVar;
        Objects.requireNonNull(zzbkVar);
        this.zzc = zzbkVar;
    }

    @Override // xsna.sc01
    public final void zza() {
        if (this.zzc.zzc()) {
            final Activity activity = this.zza;
            Preference.g(activity).edit().putBoolean("googlecast-introOverlayShown", true).apply();
            this.zzb.b(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbk zzbkVar = zzbj.this.zzc;
                    if (zzbkVar.zzc()) {
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzbkVar);
                        zzbkVar.zzb();
                        zzbkVar.zza();
                    }
                }
            });
        }
    }

    @Override // xsna.sc01
    public final void zzb() {
        if (this.zzc.zzc()) {
            final Activity activity = this.zza;
            Preference.g(activity).edit().putBoolean("googlecast-introOverlayShown", true).apply();
            this.zzb.a(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzbk zzbkVar = zzbj.this.zzc;
                    if (zzbkVar.zzc()) {
                        ((ViewGroup) activity.getWindow().getDecorView()).removeView(zzbkVar);
                        zzbkVar.zzb();
                        zzbkVar.zza();
                    }
                }
            });
        }
    }
}
