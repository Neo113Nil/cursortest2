package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzctr implements zzdek {
    public final zzfmu a;

    public zzctr(zzfmu zzfmuVar) {
        this.a = zzfmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void M(Context context) {
        zzfmd zzfmdVar;
        try {
            try {
                zzbvx zzbvxVar = this.a.a;
                zzbvxVar.M3();
                if (context != null) {
                    try {
                        zzbvxVar.B(new ObjectWrapper(context));
                    } finally {
                    }
                }
            } finally {
            }
        } catch (zzfmd e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onResume for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void c(Context context) {
        zzfmd zzfmdVar;
        try {
            try {
                this.a.a.zzi();
            } finally {
            }
        } catch (zzfmd e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdek
    public final void zza(Context context) {
        zzfmd zzfmdVar;
        try {
            try {
                this.a.a.zzl();
            } finally {
            }
        } catch (zzfmd e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Cannot invoke onPause for the mediation adapter.", e);
        }
    }
}
