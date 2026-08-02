package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.ae01;
import xsna.bc00;
import xsna.f3u;
import xsna.gng;
import xsna.hyi;
import xsna.mwz;
import xsna.oaj0;
import xsna.rf01;
import xsna.t2z;
import xsna.zd01;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.2.0 */
/* loaded from: classes12.dex */
public final class zzrl {

    @Nullable
    private static zzcd zza;
    private static final zzcf zzb = zzcf.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrb zze;
    private final oaj0 zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzrl(Context context, final oaj0 oaj0Var, zzrb zzrbVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = gng.a(context);
        this.zzf = oaj0Var;
        this.zze = zzrbVar;
        zzrx.zza();
        this.zzi = str;
        bc00 a = bc00.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzrl.this.zzb();
            }
        };
        a.getClass();
        this.zzg = bc00.b(callable);
        bc00 a2 = bc00.a();
        oaj0Var.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oaj0.this.a();
            }
        };
        a2.getClass();
        this.zzh = bc00.b(callable2);
        zzcf zzcfVar = zzb;
        this.zzj = zzcfVar.containsKey(str) ? DynamiteModule.d(context, (String) zzcfVar.get(str), false) : -1;
    }

    public static long zza(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcd zzi() {
        synchronized (zzrl.class) {
            try {
                zzcd zzcdVar = zza;
                if (zzcdVar != null) {
                    return zzcdVar;
                }
                mwz a = hyi.a(Resources.getSystem().getConfiguration());
                zzca zzcaVar = new zzca();
                for (int i = 0; i < a.a.a.size(); i++) {
                    Locale locale = a.a.a.get(i);
                    f3u f3uVar = gng.a;
                    zzcaVar.zzd(locale.toLanguageTag());
                }
                zzcd zzf = zzcaVar.zzf();
                zza = zzf;
                return zzf;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : t2z.c.a(this.zzi);
    }

    private final boolean zzk(zzne zzneVar, long j, long j2) {
        return this.zzk.get(zzneVar) == null || j - ((Long) this.zzk.get(zzneVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    public final String zzb() throws Exception {
        return t2z.c.a(this.zzi);
    }

    public final /* synthetic */ void zzc(zzra zzraVar, zzne zzneVar, String str) {
        zzraVar.zzb(zzneVar);
        String zzd = zzraVar.zzd();
        zzpx zzpxVar = new zzpx();
        zzpxVar.zzb(this.zzc);
        zzpxVar.zzc(this.zzd);
        zzpxVar.zzh(zzi());
        zzpxVar.zzg(Boolean.TRUE);
        zzpxVar.zzl(zzd);
        zzpxVar.zzj(str);
        zzpxVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzpxVar.zzd(10);
        zzpxVar.zzk(Integer.valueOf(this.zzj));
        zzraVar.zzc(zzpxVar);
        this.zze.zza(zzraVar);
    }

    public final void zzd(zzra zzraVar, zzne zzneVar) {
        zze(zzraVar, zzneVar, zzj());
    }

    public final void zze(final zzra zzraVar, final zzne zzneVar, final String str) {
        zd01.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrh
            @Override // java.lang.Runnable
            public final void run() {
                zzrl.this.zzc(zzraVar, zzneVar, str);
            }
        });
    }

    public final void zzf(zzrk zzrkVar, zzne zzneVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzneVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzneVar, Long.valueOf(elapsedRealtime));
            zze(zzrkVar.zza(), zzneVar, zzj());
        }
    }

    public final void zzg(zzne zzneVar, ae01 ae01Var) {
        zzci zzciVar = (zzci) this.zzl.get(zzneVar);
        if (zzciVar != null) {
            for (Object obj : zzciVar.zzo()) {
                ArrayList arrayList = new ArrayList(zzciVar.zzc(obj));
                Collections.sort(arrayList);
                zzmh zzmhVar = new zzmh();
                Iterator it = arrayList.iterator();
                long j = 0;
                while (it.hasNext()) {
                    j += ((Long) it.next()).longValue();
                }
                zzmhVar.zza(Long.valueOf(j / arrayList.size()));
                zzmhVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzmhVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzmhVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzmhVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzmhVar.zze(Long.valueOf(zza(arrayList, ConnectivityTracker.DEFAULT_UPLINK_BITRATE)));
                zzmj zzg = zzmhVar.zzg();
                int size = arrayList.size();
                rf01 rf01Var = ae01Var.a;
                zzdz zzdzVar = (zzdz) obj;
                rf01Var.getClass();
                zznf zznfVar = new zznf();
                zznfVar.zze(rf01Var.i ? zznc.TYPE_THICK : zznc.TYPE_THIN);
                zzdw zzdwVar = new zzdw();
                zzdwVar.zza(Integer.valueOf(size));
                zzdwVar.zzc(zzdzVar);
                zzdwVar.zzb(zzg);
                zznfVar.zzd(zzdwVar.zze());
                zze(zzro.zzf(zznfVar), zzneVar, zzj());
            }
            this.zzl.remove(zzneVar);
        }
    }

    public final void zzh(final zzne zzneVar, Object obj, long j, final ae01 ae01Var) {
        if (!this.zzl.containsKey(zzneVar)) {
            this.zzl.put(zzneVar, zzbh.zzp());
        }
        ((zzci) this.zzl.get(zzneVar)).zzm(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzneVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzneVar, Long.valueOf(elapsedRealtime));
            zd01.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzrj
                @Override // java.lang.Runnable
                public final void run() {
                    zzrl.this.zzg(zzneVar, ae01Var);
                }
            });
        }
    }
}
