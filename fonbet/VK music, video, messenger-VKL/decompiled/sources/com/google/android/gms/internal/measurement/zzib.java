package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes12.dex */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;
    private static volatile zzhz zze = null;
    private static volatile boolean zzf = false;
    final zzhy zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private final boolean zzm;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(new Object() { // from class: com.google.android.gms.internal.measurement.zzht
    }, null);
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj, boolean z, zzia zziaVar) {
        if (zzhyVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzj = obj;
        this.zzm = true;
    }

    public static void zzd() {
        zzi.incrementAndGet();
    }

    public static void zze(final Context context) {
        if (zze == null) {
            Object obj = zzd;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            zzhz zzhzVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzhzVar != null) {
                                if (zzhzVar.zza() != context) {
                                }
                            }
                            zzhf.zze();
                            zzic.zzc();
                            zzhn.zze();
                            zze = new zzhc(context, zzim.zza(new zzii() { // from class: com.google.android.gms.internal.measurement.zzhs
                                @Override // com.google.android.gms.internal.measurement.zzii
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzib.zzc;
                                    return zzho.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:12:0x001c, B:14:0x0020, B:16:0x0026, B:18:0x002f, B:20:0x003d, B:22:0x0069, B:24:0x0073, B:27:0x00a4, B:29:0x00b4, B:31:0x00c8, B:32:0x00cb, B:33:0x00cf, B:34:0x007c, B:36:0x0082, B:39:0x0094, B:41:0x009a, B:43:0x00a2, B:44:0x0092, B:48:0x0059, B:49:0x00d4, B:50:0x00d9, B:51:0x00da), top: B:11:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzb() {
        zzhk zza;
        Object zzb;
        if (!this.zzm && this.zzb == null) {
            throw new NullPointerException("flagName must not be null");
        }
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                try {
                    if (this.zzk < i) {
                        zzhz zzhzVar = zze;
                        if (zzhzVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        zzhy zzhyVar = this.zza;
                        boolean z = zzhyVar.zzf;
                        if (zzhyVar.zzb == null) {
                            Context zza2 = zzhzVar.zza();
                            String str = this.zza.zza;
                            zza = zzic.zza(zza2, null, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzib.zzd();
                                }
                            });
                        } else if (zzhp.zza(zzhzVar.zza(), this.zza.zzb)) {
                            boolean z2 = this.zza.zzh;
                            zza = zzhf.zza(zzhzVar.zza().getContentResolver(), this.zza.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzib.zzd();
                                }
                            });
                        } else {
                            zza = null;
                        }
                        Object zza3 = (zza == null || (zzb = zza.zzb(zzc())) == null) ? null : zza(zzb);
                        if (zza3 == null) {
                            if (!this.zza.zze) {
                                String zzb2 = zzhn.zza(zzhzVar.zza()).zzb(this.zza.zze ? null : this.zzb);
                                if (zzb2 != null) {
                                    zza3 = zza(zzb2);
                                    if (zza3 == null) {
                                        zza3 = this.zzj;
                                    }
                                }
                            }
                            zza3 = null;
                            if (zza3 == null) {
                            }
                        }
                        zzig zzigVar = (zzig) zzhzVar.zzb().zza();
                        if (zzigVar.zzb()) {
                            zzhh zzhhVar = (zzhh) zzigVar.zza();
                            zzhy zzhyVar2 = this.zza;
                            String zza4 = zzhhVar.zza(zzhyVar2.zzb, null, zzhyVar2.zzd, this.zzb);
                            zza3 = zza4 == null ? this.zzj : zza(zza4);
                        }
                        this.zzl = zza3;
                        this.zzk = i;
                    }
                } finally {
                }
            }
        }
        return this.zzl;
    }

    public final String zzc() {
        String str = this.zza.zzd;
        return this.zzb;
    }
}
