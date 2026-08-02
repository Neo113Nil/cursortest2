package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.common.util.concurrent.ListenableFuture;
import com.safedk.android.analytics.brandsafety.m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzgln implements zzgko {
    private final zzgok zza;
    private final zzgnr zzb;
    private final ExecutorService zzc;
    private final zzgop zzd;
    private final zzgpu zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private final boolean zzj;
    private final boolean zzk;
    private zzglm zzl;

    zzgln(zzimx zzimxVar, zzgok zzgokVar, zzgnr zzgnrVar, zzgop zzgopVar, zzgpu zzgpuVar, zzgco zzgcoVar, ExecutorService executorService) {
        this.zza = zzgokVar;
        this.zzb = zzgnrVar;
        this.zzc = executorService;
        this.zzd = zzgopVar;
        this.zze = zzgpuVar;
        this.zzg = zzgcoVar.zzd();
        this.zzh = zzgcoVar.zzm();
        this.zzi = zzgcoVar.zzl();
        this.zzj = zzgcoVar.zzb();
        this.zzk = zzgcoVar.zzc();
    }

    private final ListenableFuture zzs() {
        return zzhbi.zzk(this.zzb.zzf(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglh
            @Override // com.google.android.gms.internal.ads.zzgsn
            public final /* synthetic */ Object apply(Object obj) {
                zzgln.this.zzo((byte[]) obj);
                return null;
            }
        }, zzhbz.zza());
    }

    private final void zzt(zzauq zzauqVar, byte[] bArr, boolean z) {
        zzgps zza = this.zze.zza(20102);
        try {
            try {
                zza.zza();
                synchronized (this.zzf) {
                    this.zzl = zzglm.zza(zzauqVar, bArr, z);
                }
                zza.zzc();
            } catch (zzauo e) {
                e = e;
                zza.zzb(e);
                throw new zzgkp(2, e);
            } catch (zzaus e2) {
                e = e2;
                zza.zzb(e);
                throw new zzgkp(2, e);
            } catch (Throwable th) {
                zza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zza.zzc();
            throw th2;
        }
    }

    private final String zzu(Map map) throws zzaus, zzauo {
        String zzb;
        zzgpu zzgpuVar = this.zze;
        try {
            zzgpuVar.zza(20110).zza();
            synchronized (this.zzf) {
                zzglm zzglmVar = this.zzl;
                if (zzglmVar == null) {
                    zzgpuVar.zzb(20109);
                    zzb = "";
                } else {
                    zzb = zzglmVar.zzb(map);
                }
            }
            return zzb;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final String zza() {
        synchronized (this.zzf) {
            zzglm zzglmVar = this.zzl;
            if (zzglmVar == null) {
                return "3.869425873.-1";
            }
            return zzglmVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzb() {
        if (this.zzk) {
            return zzs();
        }
        zzhba zzw = zzhba.zzw(this.zzb.zzb());
        ExecutorService executorService = this.zzc;
        return (zzhba) zzhbi.zzh((zzhba) zzhbi.zzj((zzhba) zzhbi.zzg(zzw, Throwable.class, zzgll.zza, executorService), new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglb
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgln.this.zzi((zzgfd) obj);
            }
        }, executorService), Throwable.class, new zzhaq() { // from class: com.google.android.gms.internal.ads.zzglc
            @Override // com.google.android.gms.internal.ads.zzhaq
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgln.this.zzj((Throwable) obj);
            }
        }, zzhbz.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzc(final Context context) {
        return zzhbi.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgld
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgln.this.zzk(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzhbi.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgle
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgln.this.zzl(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzhbi.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzglf
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzgln.this.zzm(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                zzglm zzglmVar = this.zzl;
                if (zzglmVar != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("evt", inputEvent);
                    zzglmVar.zzc(hashMap);
                } else {
                    this.zze.zzb(20105);
                }
            }
        } catch (zzauo | zzaus e) {
            this.zze.zzd(20104, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgko
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzh(Map map) {
        String str;
        zzgps zza;
        String str2;
        map.put("v", this.zzg);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get("ai");
        byte[] bArr = null;
        long j = -1;
        if (listenableFuture != null) {
            zza = this.zze.zza(20107);
            try {
                try {
                    zza.zza();
                    zzayf zzayfVar = (zzayf) listenableFuture.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzayfVar != null) {
                        bArr = zzayfVar.zzh().zzaN();
                        str = zzayfVar.zzb().length() > 1 ? zzayfVar.zzb() : ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzayfVar.zzc()) {
                                j = zzayfVar.zzd();
                            }
                        } catch (ClassCastException e) {
                            e = e;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (InterruptedException e2) {
                            e = e2;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (ExecutionException e3) {
                            e = e3;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        } catch (TimeoutException e4) {
                            e = e4;
                            zza.zzb(e);
                            zza.zzc();
                            if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                            }
                            map.put(m.w, str);
                            if (bArr != null) {
                            }
                            map.put("gv", Long.valueOf(j));
                        }
                    } else {
                        str = ExifInterface.LONGITUDE_EAST;
                    }
                } finally {
                }
            } catch (ClassCastException e5) {
                e = e5;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                    zza = this.zze.zza(20108);
                    try {
                        try {
                            zza.zza();
                            str2 = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                            if (true != zzgtn.zzc(str2)) {
                            }
                        } finally {
                        }
                    } catch (ClassCastException e6) {
                        e = e6;
                        zza.zzb(e);
                    } catch (InterruptedException e7) {
                        e = e7;
                        zza.zzb(e);
                    } catch (ExecutionException e8) {
                        e = e8;
                        Throwable cause2 = e.getCause();
                        if (cause2 != null) {
                            e = cause2;
                        }
                        zza.zzb(e);
                    } catch (TimeoutException e9) {
                        e = e9;
                        zza.zzb(e);
                    }
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (InterruptedException e10) {
                e = e10;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            } catch (ExecutionException e11) {
                e = e11;
                str = ExifInterface.LONGITUDE_EAST;
            } catch (TimeoutException e12) {
                e = e12;
                str = ExifInterface.LONGITUDE_EAST;
                zza.zzb(e);
                zza.zzc();
                if (str.equals(ExifInterface.LONGITUDE_EAST)) {
                }
                map.put(m.w, str);
                if (bArr != null) {
                }
                map.put("gv", Long.valueOf(j));
            }
            zza.zzc();
        } else {
            str = ExifInterface.LONGITUDE_EAST;
        }
        if (str.equals(ExifInterface.LONGITUDE_EAST) && listenableFuture2 != null) {
            zza = this.zze.zza(20108);
            zza.zza();
            str2 = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgtn.zzc(str2)) {
                str = str2;
            }
        }
        map.put(m.w, str);
        if (bArr != null) {
            map.put("att", bArr);
        }
        map.put("gv", Long.valueOf(j));
    }

    final /* synthetic */ ListenableFuture zzi(zzgfd zzgfdVar) {
        if (this.zza.zzb(zzgfdVar)) {
            return zzhbi.zzk(this.zzb.zze(), new zzgsn() { // from class: com.google.android.gms.internal.ads.zzglg
                @Override // com.google.android.gms.internal.ads.zzgsn
                public final /* synthetic */ Object apply(Object obj) {
                    zzgln.this.zzn((byte[]) obj);
                    return null;
                }
            }, zzhbz.zza());
        }
        this.zze.zzb(20103);
        throw new zzgkp(1);
    }

    final /* synthetic */ ListenableFuture zzj(Throwable th) {
        return this.zzj ? zzs() : zzhbi.zzc(th);
    }

    final /* synthetic */ String zzk(final Context context) {
        final HashMap hashMap = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgli
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgln.this.zzp(hashMap, context);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ String zzl(final Context context, String str, final View view, final Activity activity) {
        final HashMap hashMap = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzglj
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgln.this.zzq(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ String zzm(final Context context, final String str, final View view, Activity activity) {
        final HashMap hashMap = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzglk
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzgln.this.zzr(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String zzu = zzu(hashMap);
        hashMap.clear();
        return zzu;
    }

    final /* synthetic */ Void zzn(byte[] bArr) {
        zzt(zzglq.zzc(), bArr, false);
        return null;
    }

    final /* synthetic */ Void zzo(byte[] bArr) {
        zzt(zzglq.zzc(), bArr, true);
        return null;
    }

    final /* synthetic */ void zzp(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    final /* synthetic */ void zzq(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put(ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void zzr(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put(ViewHierarchyConstants.VIEW_KEY, view);
        map.put("act", null);
        map.put("bds", str);
    }
}
