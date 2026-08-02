package com.google.android.gms.internal.mlkit_common;

import U8.b;
import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.core.os.f;
import androidx.core.os.i;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.C5947c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.k;
import com.google.mlkit.common.sdkinternal.m;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class zzsh {
    private static zzaf zza;
    private static final zzai zzb = zzai.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzrz zze;
    private final m zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;

    public zzsh(Context context, final m mVar, zzrz zzrzVar, String str) {
        new HashMap();
        new HashMap();
        this.zzc = context.getPackageName();
        this.zzd = C5947c.a(context);
        this.zzf = mVar;
        this.zze = zzrzVar;
        zzsv.zza();
        this.zzi = str;
        g a11 = g.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzsh.this.zza();
            }
        };
        a11.getClass();
        this.zzg = g.b(callable);
        g a12 = g.a();
        Objects.requireNonNull(mVar);
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzsf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m.this.a();
            }
        };
        a12.getClass();
        this.zzh = g.b(callable2);
        zzai zzaiVar = zzb;
        this.zzj = zzaiVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzaiVar.get(str)) : -1;
    }

    @NonNull
    private static synchronized zzaf zzh() {
        synchronized (zzsh.class) {
            try {
                zzaf zzafVar = zza;
                if (zzafVar != null) {
                    return zzafVar;
                }
                i a11 = f.a(Resources.getSystem().getConfiguration());
                zzac zzacVar = new zzac();
                for (int i11 = 0; i11 < a11.g(); i11++) {
                    zzacVar.zzb(C5947c.b(a11.c(i11)));
                }
                zzaf zzc = zzacVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final zzqt zzi(String str, String str2) {
        zzqt zzqtVar = new zzqt();
        zzqtVar.zzb(this.zzc);
        zzqtVar.zzc(this.zzd);
        zzqtVar.zzh(zzh());
        zzqtVar.zzg(Boolean.TRUE);
        zzqtVar.zzl(str);
        zzqtVar.zzj(str2);
        zzqtVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zzqtVar.zzd(10);
        zzqtVar.zzk(Integer.valueOf(this.zzj));
        return zzqtVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ String zza() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    final /* synthetic */ void zzb(zzry zzryVar, zzmv zzmvVar, String str) {
        zzryVar.zza(zzmvVar);
        zzryVar.zzc(zzi(zzryVar.zzd(), str));
        this.zze.zza(zzryVar);
    }

    final /* synthetic */ void zzc(zzry zzryVar, zzsj zzsjVar, b bVar) {
        zzryVar.zza(zzmv.MODEL_DOWNLOAD);
        zzryVar.zzc(zzi(zzsjVar.zze(), zzj()));
        zzryVar.zzb(zzst.zza(bVar, this.zzf, zzsjVar));
        this.zze.zza(zzryVar);
    }

    public final void zzd(final zzry zzryVar, final zzmv zzmvVar) {
        final String zzj = zzj();
        g.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsd
            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.zzb(zzryVar, zzmvVar, zzj);
            }
        });
    }

    public final void zze(zzry zzryVar, b bVar, boolean z11, int i11) {
        zzsi zzh = zzsj.zzh();
        zzh.zzf(false);
        bVar.getClass();
        zzh.zzd(null);
        zzh.zza(zzna.FAILED);
        zzh.zzb(zzmu.DOWNLOAD_FAILED);
        zzh.zzc(i11);
        zzg(zzryVar, bVar, zzh.zzh());
    }

    public final void zzf(zzry zzryVar, b bVar, zzmu zzmuVar, boolean z11, k kVar, zzna zznaVar) {
        zzsi zzh = zzsj.zzh();
        zzh.zzf(z11);
        zzh.zzd(kVar);
        zzh.zzb(zzmuVar);
        zzh.zza(zznaVar);
        zzg(zzryVar, bVar, zzh.zzh());
    }

    public final void zzg(final zzry zzryVar, final b bVar, final zzsj zzsjVar) {
        g.c().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzsg
            @Override // java.lang.Runnable
            public final void run() {
                zzsh.this.zzc(zzryVar, zzsjVar, bVar);
            }
        });
    }
}
