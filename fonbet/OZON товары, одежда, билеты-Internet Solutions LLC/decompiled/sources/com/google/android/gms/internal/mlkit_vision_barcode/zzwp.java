package com.google.android.gms.internal.mlkit_vision_barcode;

import Z8.j;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.os.f;
import androidx.core.os.i;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C5947c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class zzwp {
    private static zzcs zza;
    private static final zzcu zzb = zzcu.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzwf zze;
    private final m zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzwp(Context context, final m mVar, zzwf zzwfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = C5947c.a(context);
        this.zzf = mVar;
        this.zze = zzwfVar;
        zzxb.zza();
        this.zzi = str;
        g a11 = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzwp.this.zzb();
            }
        };
        a11.getClass();
        this.zzg = g.b(callable);
        g a12 = g.a();
        Objects.requireNonNull(mVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.this.a();
            }
        };
        a12.getClass();
        this.zzh = g.b(callable2);
        zzcu zzcuVar = zzb;
        this.zzj = zzcuVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzcuVar.get(str)) : -1;
    }

    static long zza(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    @NonNull
    private static synchronized zzcs zzi() {
        synchronized (zzwp.class) {
            try {
                zzcs zzcsVar = zza;
                if (zzcsVar != null) {
                    return zzcsVar;
                }
                i a11 = f.a(Resources.getSystem().getConfiguration());
                zzcp zzcpVar = new zzcp();
                for (int i11 = 0; i11 < a11.g(); i11++) {
                    zzcpVar.zzd(C5947c.b(a11.c(i11)));
                }
                zzcs zzf = zzcpVar.zzf();
                zza = zzf;
                return zzf;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzrc zzrcVar, long j11, long j12) {
        return this.zzk.get(zzrcVar) == null || j11 - ((Long) this.zzk.get(zzrcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ String zzb() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzc(zzwe zzweVar, zzrc zzrcVar, String str) {
        zzweVar.zzb(zzrcVar);
        String zzd = zzweVar.zzd();
        zzvb zzvbVar = new zzvb();
        zzvbVar.zzb(this.zzc);
        zzvbVar.zzc(this.zzd);
        zzvbVar.zzh(zzi());
        zzvbVar.zzg(Boolean.TRUE);
        zzvbVar.zzl(zzd);
        zzvbVar.zzj(str);
        zzvbVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzvbVar.zzd(10);
        zzvbVar.zzk(Integer.valueOf(this.zzj));
        zzweVar.zzc(zzvbVar);
        this.zze.zza(zzweVar);
    }

    public final void zzd(zzwe zzweVar, zzrc zzrcVar) {
        zze(zzweVar, zzrcVar, zzj());
    }

    public final void zze(final zzwe zzweVar, final zzrc zzrcVar, final String str) {
        g.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwj
            @Override // java.lang.Runnable
            public final void run() {
                zzwp.this.zzc(zzweVar, zzrcVar, str);
            }
        });
    }

    public final void zzf(zzwo zzwoVar, zzrc zzrcVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(elapsedRealtime));
            zze(zzwoVar.zza(), zzrcVar, zzj());
        }
    }

    final /* synthetic */ void zzg(zzrc zzrcVar, j jVar) {
        zzcy zzcyVar = (zzcy) this.zzl.get(zzrcVar);
        if (zzcyVar != null) {
            for (Object obj : zzcyVar.zzw()) {
                ArrayList arrayList = new ArrayList(zzcyVar.zze(obj));
                Collections.sort(arrayList);
                zzqb zzqbVar = new zzqb();
                Iterator it = arrayList.iterator();
                long j11 = 0;
                while (it.hasNext()) {
                    j11 += ((Long) it.next()).longValue();
                }
                zzqbVar.zza(Long.valueOf(j11 / arrayList.size()));
                zzqbVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzqbVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzqbVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzqbVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzqbVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(jVar.a(obj, arrayList.size(), zzqbVar.zzg()), zzrcVar, zzj());
            }
            this.zzl.remove(zzrcVar);
        }
    }

    final /* synthetic */ void zzh(final zzrc zzrcVar, Object obj, long j11, final j jVar) {
        if (!this.zzl.containsKey(zzrcVar)) {
            this.zzl.put(zzrcVar, zzbw.zzz());
        }
        ((zzcy) this.zzl.get(zzrcVar)).zzt(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzrcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzrcVar, Long.valueOf(elapsedRealtime));
            g.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzwk
                @Override // java.lang.Runnable
                public final void run() {
                    zzwp.this.zzg(zzrcVar, jVar);
                }
            });
        }
    }
}
