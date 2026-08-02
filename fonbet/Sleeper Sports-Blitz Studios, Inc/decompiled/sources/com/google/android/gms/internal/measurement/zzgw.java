package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzgt;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.1 */
/* loaded from: classes7.dex */
public abstract class zzgw<T> {
    private static final Object zza = new Object();

    @Nullable
    private static volatile zzhh zzb = null;
    private static volatile boolean zzc = false;
    private static zzhl zzd;
    private static final AtomicInteger zze;
    private final zzhe zzf;
    private final String zzg;
    private Object zzh;
    private volatile int zzi;
    private volatile T zzj;
    private final boolean zzk;
    private volatile boolean zzl;

    static /* synthetic */ boolean zzd() {
        return true;
    }

    abstract T zza(Object obj);

    static /* synthetic */ zzgw zza(zzhe zzheVar, String str, Boolean bool, boolean z) {
        return new zzhd(zzheVar, str, bool, true);
    }

    static /* synthetic */ zzgw zza(zzhe zzheVar, String str, Double d, boolean z) {
        return new zzhc(zzheVar, str, d, true);
    }

    static /* synthetic */ zzgw zza(zzhe zzheVar, String str, Long l, boolean z) {
        return new zzha(zzheVar, str, l, true);
    }

    static /* synthetic */ zzgw zza(zzhe zzheVar, String str, String str2, boolean z) {
        return new zzhf(zzheVar, str, str2, true);
    }

    public final T zza() {
        T zzb2;
        if (!this.zzk) {
            Preconditions.checkState(zzd.zza(this.zzg), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i = zze.get();
        if (this.zzi < i) {
            synchronized (this) {
                if (this.zzi < i) {
                    zzhh zzhhVar = zzb;
                    Optional<zzgu> absent = Optional.absent();
                    String str = null;
                    if (zzhhVar != null) {
                        absent = zzhhVar.zzb().get();
                        if (absent.isPresent()) {
                            str = absent.get().zza(this.zzf.zzb, this.zzf.zza, this.zzf.zzd, this.zzg);
                        }
                    }
                    Preconditions.checkState(zzhhVar != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    if (!this.zzf.zzf ? (zzb2 = zzb(zzhhVar)) == null && (zzb2 = zza(zzhhVar)) == null : (zzb2 = zza(zzhhVar)) == null && (zzb2 = zzb(zzhhVar)) == null) {
                        zzb2 = zze();
                    }
                    if (absent.isPresent()) {
                        zzb2 = str == null ? zze() : zza((Object) str);
                    }
                    this.zzj = zzb2;
                    this.zzi = i;
                }
            }
        }
        return this.zzj;
    }

    private final T zze() {
        return (T) this.zzh;
    }

    @Nullable
    private final T zza(zzhh zzhhVar) {
        if (!this.zzf.zze && (this.zzf.zzh == null || this.zzf.zzh.apply(zzhhVar.zza()).booleanValue())) {
            Object zza2 = zzgp.zza(zzhhVar.zza()).zza(this.zzf.zze ? null : zza(this.zzf.zzc));
            if (zza2 != null) {
                return zza(zza2);
            }
        }
        return null;
    }

    @Nullable
    private final T zzb(zzhh zzhhVar) {
        zzgo zza2;
        Object zza3;
        if (this.zzf.zzb != null) {
            if (!zzgv.zza(zzhhVar.zza(), this.zzf.zzb)) {
                zza2 = null;
            } else if (this.zzf.zzg) {
                zza2 = zzgh.zza(zzhhVar.zza().getContentResolver(), zzgx.zza(zzgx.zza(zzhhVar.zza(), this.zzf.zzb.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgw.zzc();
                    }
                });
            } else {
                zza2 = zzgh.zza(zzhhVar.zza().getContentResolver(), this.zzf.zzb, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzgw.zzc();
                    }
                });
            }
        } else {
            zza2 = zzhj.zza(zzhhVar.zza(), this.zzf.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzgz
                @Override // java.lang.Runnable
                public final void run() {
                    zzgw.zzc();
                }
            });
        }
        if (zza2 == null || (zza3 = zza2.zza(zzb())) == null) {
            return null;
        }
        return zza(zza3);
    }

    public final String zzb() {
        return zza(this.zzf.zzd);
    }

    private final String zza(String str) {
        if (str != null && str.isEmpty()) {
            return this.zzg;
        }
        return str + this.zzg;
    }

    static {
        new AtomicReference();
        zzd = new zzhl(new zzhk() { // from class: com.google.android.gms.internal.measurement.zzhb
            @Override // com.google.android.gms.internal.measurement.zzhk
            public final boolean zza() {
                return zzgw.zzd();
            }
        });
        zze = new AtomicInteger();
    }

    private zzgw(zzhe zzheVar, String str, T t, boolean z) {
        this.zzi = -1;
        if (zzheVar.zza == null && zzheVar.zzb == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (zzheVar.zza != null && zzheVar.zzb != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzf = zzheVar;
        this.zzg = str;
        this.zzh = t;
        this.zzk = z;
        this.zzl = false;
    }

    public static void zzc() {
        zze.incrementAndGet();
    }

    public static void zzb(final Context context) {
        if (zzb != null || context == null) {
            return;
        }
        Object obj = zza;
        synchronized (obj) {
            if (zzb == null && context != null) {
                synchronized (obj) {
                    zzhh zzhhVar = zzb;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzhhVar == null || zzhhVar.zza() != context) {
                        if (zzhhVar != null) {
                            zzgh.zzc();
                            zzhj.zza();
                            zzgp.zza();
                        }
                        zzb = new zzgi(context, Suppliers.memoize(new Supplier() { // from class: com.google.android.gms.internal.measurement.zzgy
                            @Override // com.google.common.base.Supplier
                            public final Object get() {
                                Optional zza2;
                                zza2 = zzgt.zza.zza(context);
                                return zza2;
                            }
                        }));
                        zze.incrementAndGet();
                    }
                }
            }
        }
    }
}
