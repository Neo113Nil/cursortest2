package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.CastDevice;
import com.vungle.ads.internal.protos.Sdk;
import xsna.exc0;
import xsna.g0a;
import xsna.o100;
import xsna.uz9;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzn {
    public static final /* synthetic */ int zza = 0;
    private static final o100 zzb = new o100("ApplicationAnalytics", null);
    private final zzj zzc;
    private final zzax zzd;
    private final zzp zze;
    private final SharedPreferences zzh;

    @Nullable
    private zzo zzi;

    @Nullable
    private g0a zzj;
    private boolean zzk;
    private final Handler zzg = new zzfk(Looper.getMainLooper());
    private final Runnable zzf = new Runnable() { // from class: com.google.android.gms.internal.cast.zzk
        @Override // java.lang.Runnable
        public final /* synthetic */ void run() {
            zzn.this.zza();
        }
    };

    public zzn(SharedPreferences sharedPreferences, zzj zzjVar, zzax zzaxVar, Bundle bundle, String str) {
        this.zzh = sharedPreferences;
        this.zzc = zzjVar;
        this.zzd = zzaxVar;
        this.zze = new zzp(bundle, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final void zzb() {
        Handler handler = this.zzg;
        exc0.i(handler);
        Runnable runnable = this.zzf;
        exc0.i(runnable);
        handler.postDelayed(runnable, 300000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzr, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        this.zzg.removeCallbacks(this.zzf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public final void zzd() {
        zzb.a("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        zzo zza2 = zzo.zza(this.zzd);
        this.zzi = zza2;
        exc0.i(zza2);
        g0a g0aVar = this.zzj;
        zza2.zzo = g0aVar != null && g0aVar.g.zzo();
        zzo zzoVar = this.zzi;
        exc0.i(zzoVar);
        zzoVar.zzb = zzx();
        g0a g0aVar2 = this.zzj;
        CastDevice j = g0aVar2 == null ? null : g0aVar2.j();
        if (j != null) {
            zzu(j);
        }
        zzo zzoVar2 = this.zzi;
        exc0.i(zzoVar2);
        g0a g0aVar3 = this.zzj;
        zzoVar2.zzp = g0aVar3 != null ? g0aVar3.i() : 0;
        exc0.i(this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzt, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        if (!zzv()) {
            zzb.c("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]);
            zzd();
            return;
        }
        g0a g0aVar = this.zzj;
        CastDevice j = g0aVar != null ? g0aVar.j() : null;
        if (j != null && !TextUtils.equals(this.zzi.zzc, j.m)) {
            zzu(j);
        }
        exc0.i(this.zzi);
    }

    private final void zzu(CastDevice castDevice) {
        zzo zzoVar = this.zzi;
        if (zzoVar == null) {
            return;
        }
        zzoVar.zzc = castDevice.m;
        zzoVar.zzg = castDevice.j.a;
        zzoVar.zzh = castDevice.f;
        zzoVar.zzn = castDevice.zzd();
        com.google.android.gms.cast.internal.zzaa k = castDevice.k();
        if (k != null) {
            String str = k.e;
            if (str != null) {
                zzoVar.zzi = str;
            }
            String str2 = k.f;
            if (str2 != null) {
                zzoVar.zzj = str2;
            }
            String str3 = k.g;
            if (str3 != null) {
                zzoVar.zzk = str3;
            }
            String str4 = k.h;
            if (str4 != null) {
                zzoVar.zzl = str4;
            }
            String str5 = k.i;
            if (str5 != null) {
                zzoVar.zzm = str5;
            }
        }
    }

    private final boolean zzv() {
        String str;
        if (this.zzi == null) {
            zzb.a("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        String zzx = zzx();
        if (zzx == null || (str = this.zzi.zzb) == null || !TextUtils.equals(str, zzx)) {
            zzb.a("The analytics session doesn't match the application ID %s", zzx);
            return false;
        }
        exc0.i(this.zzi);
        return true;
    }

    private final boolean zzw(String str) {
        String str2;
        if (!zzv()) {
            return false;
        }
        exc0.i(this.zzi);
        if (str != null && (str2 = this.zzi.zzf) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        zzb.a("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }

    private static String zzx() {
        o100 o100Var = uz9.m;
        exc0.e("Must be called from the main thread.");
        uz9 uz9Var = uz9.o;
        exc0.i(uz9Var);
        exc0.e("Must be called from the main thread.");
        return uz9Var.e.b;
    }

    public final /* synthetic */ void zza() {
        zzo zzoVar = this.zzi;
        if (zzoVar != null) {
            this.zzc.zzd(this.zze.zza(zzoVar), Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
        }
        zzb();
    }

    public final void zzf(SharedPreferences sharedPreferences, String str) {
        boolean z = false;
        if (zzw(str)) {
            zzb.a("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            exc0.i(this.zzi);
            return;
        }
        zzax zzaxVar = this.zzd;
        this.zzi = zzo.zzc(sharedPreferences, zzaxVar);
        if (zzw(str)) {
            zzb.a("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
            exc0.i(this.zzi);
            zzo.zza = this.zzi.zzd + 1;
            return;
        }
        zzb.a("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
        zzo zza2 = zzo.zza(zzaxVar);
        this.zzi = zza2;
        exc0.i(zza2);
        g0a g0aVar = this.zzj;
        if (g0aVar != null && g0aVar.g.zzo()) {
            z = true;
        }
        zza2.zzo = z;
        zzo zzoVar = this.zzi;
        exc0.i(zzoVar);
        zzoVar.zzb = zzx();
        zzo zzoVar2 = this.zzi;
        exc0.i(zzoVar2);
        zzoVar2.zzf = str;
    }

    public final /* synthetic */ void zzg() {
        this.zzi.zzd(this.zzh);
    }

    public final /* synthetic */ void zzh(int i) {
        zzb.a("log session ended with error = %d", Integer.valueOf(i));
        zze();
        this.zzc.zzd(this.zze.zze(this.zzi, i), 228);
        zzc();
        if (this.zzk) {
            return;
        }
        this.zzi = null;
    }

    public final /* synthetic */ zzj zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzp zzk() {
        return this.zze;
    }

    public final /* synthetic */ SharedPreferences zzl() {
        return this.zzh;
    }

    public final /* synthetic */ zzo zzm() {
        return this.zzi;
    }

    public final /* synthetic */ void zzn(zzo zzoVar) {
        this.zzi = null;
    }

    public final /* synthetic */ void zzo(g0a g0aVar) {
        this.zzj = g0aVar;
    }

    public final /* synthetic */ void zzp(boolean z) {
        this.zzk = z;
    }
}
