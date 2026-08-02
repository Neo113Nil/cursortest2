package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.PlaybackException;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzbaa implements zzbad {
    private static zzbaa zzb;
    private final Context zzc;
    private final zzfya zzd;
    private final zzfyh zze;
    private final zzfyj zzf;
    private final zzbbf zzg;
    private final zzfwq zzh;
    private final Executor zzi;
    private final zzbdh zzj;
    private final zzfyg zzk;
    private final zzbbu zzm;
    private final zzbbm zzn;
    private final zzbbd zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    zzbaa(Context context, zzfwq zzfwqVar, zzfya zzfyaVar, zzfyh zzfyhVar, zzfyj zzfyjVar, zzbbf zzbbfVar, Executor executor, zzfwl zzfwlVar, zzbdh zzbdhVar, zzbbu zzbbuVar, zzbbm zzbbmVar, zzbbd zzbbdVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfwqVar;
        this.zzd = zzfyaVar;
        this.zze = zzfyhVar;
        this.zzf = zzfyjVar;
        this.zzg = zzbbfVar;
        this.zzi = executor;
        this.zzj = zzbdhVar;
        this.zzm = zzbbuVar;
        this.zzn = zzbbmVar;
        this.zzo = zzbbdVar;
        this.zzr = false;
        this.zzk = new zzazy(this, zzfwlVar);
    }

    public static synchronized zzbaa zza(Context context, zzawh zzawhVar, boolean z) {
        zzbaa zzs;
        synchronized (zzbaa.class) {
            zzfwr zzh = zzfws.zzh();
            zzh.zza(zzawhVar.zza());
            zzh.zzb(zzawhVar.zzb());
            zzs = zzs(context, Executors.newCachedThreadPool(), zzh.zzh(), z);
        }
        return zzs;
    }

    private static synchronized zzbaa zzs(Context context, Executor executor, zzfws zzfwsVar, boolean z) {
        zzbaa zzbaaVar;
        synchronized (zzbaa.class) {
            if (zzb == null) {
                zzfwq zza = zzfwq.zza(context, executor, z);
                zzbao zza2 = zzbao.zza(context);
                zzbbu zza3 = zzbbu.zza(context, executor);
                zzbbm zzbbmVar = new zzbbm();
                zzbbd zzbbdVar = new zzbbd();
                zzfxg zza4 = zzfxg.zza(context, executor, zza, zzfwsVar);
                zzbbe zzbbeVar = new zzbbe(context);
                zzbbf zzbbfVar = new zzbbf(zzfwsVar, zza4, new zzbbs(context, zzbbeVar), zzbbeVar, zza2, zza3, zzbbmVar, zzbbdVar);
                zzbdh zzb2 = zzfxn.zzb(context, zza);
                zzfwl zzfwlVar = new zzfwl();
                zzbaa zzbaaVar2 = new zzbaa(context, zza, new zzfya(context, zzb2), new zzfyh(context, zzb2, new zzazx(zza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdl)).booleanValue()), new zzfyj(context, zzbbfVar, zza, zzfwlVar, false), zzbbfVar, executor, zzfwlVar, zzb2, zza3, zzbbmVar, zzbbdVar);
                zzb = zzbaaVar2;
                zzbaaVar2.zzc();
                zzb.zzm();
            }
            zzbaaVar = zzb;
        }
        return zzbaaVar;
    }

    private final zzfxz zzt(int i) {
        if (zzfxn.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdj)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfxz zzt = zzt(1);
        if (zzt == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.zzf.zza(zzt)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzd(MotionEvent motionEvent) {
        zzfwt zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (zzfyi e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zznt)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = i2;
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, 0, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain);
        obtain.recycle();
        MotionEvent obtain2 = MotionEvent.obtain(0L, 0L, 2, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain2);
        obtain2.recycle();
        MotionEvent obtain3 = MotionEvent.obtain(0L, i3, 1, f * displayMetrics.density, f2 * displayMetrics.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(obtain3);
        obtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzf(Context context, String str, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzc();
        zzm();
        zzfwt zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzc = zzb2.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - currentTimeMillis, zzc, null);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        this.zzo.zza(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzj(Context context, View view, Activity activity) {
        this.zzm.zzb();
        this.zzn.zzb(context, view);
        zzm();
        zzfwt zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zzb3 = zzb2.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - currentTimeMillis, zzb3, null);
        return zzb3;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final String zzl(Context context) {
        this.zzm.zzb();
        this.zzn.zza();
        zzm();
        zzfwt zzb2 = this.zzf.zzb();
        if (zzb2 == null) {
            return "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        String zza = zzb2.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - currentTimeMillis, zza, null);
        return zza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            if (!this.zzq) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfxz zzc = this.zzf.zzc();
                if ((zzc == null || zzc.zze(3600L)) && zzfxn.zza(this.zzj)) {
                    this.zzi.execute(new zzazz(this));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        if (r4.zza().zzb().equals(r5.zzb()) == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzn() {
        String str;
        String str2;
        int length;
        boolean zza;
        long currentTimeMillis = System.currentTimeMillis();
        zzfxz zzt = zzt(1);
        if (zzt != null) {
            String zza2 = zzt.zza().zza();
            str2 = zzt.zza().zzb();
            str = zza2;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbdh zzbdhVar = this.zzj;
                zzfwq zzfwqVar = this.zzh;
                zzfye zza3 = zzfwz.zza(context, 1, zzbdhVar, str, str2, "1", zzfwqVar);
                byte[] bArr = zza3.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfwqVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - currentTimeMillis);
                } else {
                    try {
                        zzbdj zzd = zzbdj.zzd(zzicn.zzt(bArr, 0, length), zzidb.zza());
                        if (!zzd.zza().zza().isEmpty()) {
                            if (!zzd.zza().zzb().isEmpty()) {
                                if (zzd.zzc().zzA().length != 0) {
                                    zzfxz zzt2 = zzt(1);
                                    if (zzt2 != null) {
                                        zzbdp zza4 = zzt2.zza();
                                        if (zza4 != null) {
                                            if (zzd.zza().zza().equals(zza4.zza())) {
                                            }
                                        }
                                    }
                                    zzfyg zzfygVar = this.zzk;
                                    int i = zza3.zzc;
                                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzdj)).booleanValue()) {
                                        zza = this.zzd.zza(zzd, zzfygVar);
                                    } else if (i == 3) {
                                        zza = this.zze.zzb(zzd);
                                    } else {
                                        if (i == 4) {
                                            zza = this.zze.zza(zzd, zzfygVar);
                                        }
                                        this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                    }
                                    if (zza) {
                                        zzfxz zzt3 = zzt(1);
                                        if (zzt3 != null) {
                                            if (this.zzf.zza(zzt3)) {
                                                this.zzr = true;
                                            }
                                            this.zza = System.currentTimeMillis() / 1000;
                                        }
                                    }
                                    this.zzh.zzb(4009, System.currentTimeMillis() - currentTimeMillis);
                                }
                            }
                        }
                        this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - currentTimeMillis);
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - currentTimeMillis);
                    }
                }
            } catch (zzieg e) {
                this.zzh.zzc(PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED, System.currentTimeMillis() - currentTimeMillis, e);
            }
        } finally {
            this.zzl.countDown();
        }
    }

    final /* synthetic */ zzfwq zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z) {
        this.zzq = z;
    }
}
