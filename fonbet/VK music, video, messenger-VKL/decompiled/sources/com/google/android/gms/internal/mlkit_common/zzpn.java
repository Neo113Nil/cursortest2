package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.ModelType;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import xsna.bc00;
import xsna.f3u;
import xsna.gng;
import xsna.hyi;
import xsna.mwz;
import xsna.oaj0;
import xsna.pvf0;
import xsna.t2z;
import xsna.zd01;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes12.dex */
public final class zzpn {

    @Nullable
    private static zzar zza;
    private static final zzau zzb = zzau.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzpf zze;
    private final oaj0 zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzpn(Context context, final oaj0 oaj0Var, zzpf zzpfVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = gng.a(context);
        this.zzf = oaj0Var;
        this.zze = zzpfVar;
        zzqb.zza();
        this.zzi = str;
        bc00 a = bc00.a();
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzpn.this.zza();
            }
        };
        a.getClass();
        this.zzg = bc00.b(callable);
        bc00 a2 = bc00.a();
        oaj0Var.getClass();
        Callable callable2 = new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzpk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return oaj0.this.a();
            }
        };
        a2.getClass();
        this.zzh = bc00.b(callable2);
        zzau zzauVar = zzb;
        this.zzj = zzauVar.containsKey(str) ? DynamiteModule.d(context, (String) zzauVar.get(str), false) : -1;
    }

    @NonNull
    private static synchronized zzar zzh() {
        synchronized (zzpn.class) {
            try {
                zzar zzarVar = zza;
                if (zzarVar != null) {
                    return zzarVar;
                }
                mwz a = hyi.a(Resources.getSystem().getConfiguration());
                zzao zzaoVar = new zzao();
                for (int i = 0; i < a.a.a.size(); i++) {
                    Locale locale = a.a.a.get(i);
                    f3u f3uVar = gng.a;
                    zzaoVar.zzb(locale.toLanguageTag());
                }
                zzar zzc = zzaoVar.zzc();
                zza = zzc;
                return zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final zznz zzi(String str, String str2) {
        zznz zznzVar = new zznz();
        zznzVar.zzb(this.zzc);
        zznzVar.zzc(this.zzd);
        zznzVar.zzh(zzh());
        zznzVar.zzg(Boolean.TRUE);
        zznzVar.zzl(str);
        zznzVar.zzj(str2);
        zznzVar.zzi(this.zzh.isSuccessful() ? (String) this.zzh.getResult() : this.zzf.a());
        zznzVar.zzd(10);
        zznzVar.zzk(Integer.valueOf(this.zzj));
        return zznzVar;
    }

    private final String zzj() {
        return this.zzg.isSuccessful() ? (String) this.zzg.getResult() : t2z.c.a(this.zzi);
    }

    public final String zza() throws Exception {
        return t2z.c.a(this.zzi);
    }

    public final /* synthetic */ void zzb(zzpe zzpeVar, zzld zzldVar, String str) {
        zzpeVar.zza(zzldVar);
        zzpeVar.zzc(zzi(zzpeVar.zzd(), str));
        this.zze.zza(zzpeVar);
    }

    public final /* synthetic */ void zzc(zzpe zzpeVar, zzpp zzppVar, pvf0 pvf0Var) {
        zzpeVar.zza(zzld.MODEL_DOWNLOAD);
        zzpeVar.zzc(zzi(zzppVar.zze(), zzj()));
        zzpeVar.zzb(zzpz.zza(pvf0Var, this.zzf, zzppVar));
        this.zze.zza(zzpeVar);
    }

    public final void zzd(final zzpe zzpeVar, final zzld zzldVar) {
        final String zzj = zzj();
        zd01.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpl
            @Override // java.lang.Runnable
            public final void run() {
                zzpn.this.zzb(zzpeVar, zzldVar, zzj);
            }
        });
    }

    public final void zze(zzpe zzpeVar, pvf0 pvf0Var, boolean z, int i) {
        zzpo zzh = zzpp.zzh();
        zzh.zzf(false);
        pvf0Var.getClass();
        zzh.zzd(null);
        zzh.zza(zzli.FAILED);
        zzh.zzb(zzlc.DOWNLOAD_FAILED);
        zzh.zzc(i);
        zzg(zzpeVar, pvf0Var, zzh.zzh());
    }

    public final void zzf(zzpe zzpeVar, pvf0 pvf0Var, zzlc zzlcVar, boolean z, ModelType modelType, zzli zzliVar) {
        zzpo zzh = zzpp.zzh();
        zzh.zzf(z);
        zzh.zzd(modelType);
        zzh.zzb(zzlcVar);
        zzh.zza(zzliVar);
        zzg(zzpeVar, pvf0Var, zzh.zzh());
    }

    public final void zzg(final zzpe zzpeVar, final pvf0 pvf0Var, final zzpp zzppVar) {
        zd01.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzpm
            @Override // java.lang.Runnable
            public final void run() {
                zzpn.this.zzc(zzpeVar, zzppVar, pvf0Var);
            }
        });
    }
}
