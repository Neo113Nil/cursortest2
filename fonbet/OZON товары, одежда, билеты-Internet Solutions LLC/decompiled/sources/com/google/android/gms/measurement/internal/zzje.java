package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzje extends zzf {

    @VisibleForTesting
    protected zziw zza;
    private volatile zziw zzb;
    private volatile zziw zzc;
    private final Map zzd;
    private Activity zze;
    private volatile boolean zzf;
    private volatile zziw zzg;
    private zziw zzh;
    private boolean zzi;
    private final Object zzj;
    private zziw zzk;
    private String zzl;

    public zzje(zzgk zzgkVar) {
        super(zzgkVar);
        this.zzj = new Object();
        this.zzd = new ConcurrentHashMap();
    }

    private final void zzA(Activity activity, zziw zziwVar, boolean z11) {
        zziw zziwVar2;
        zziw zziwVar3 = this.zzb == null ? this.zzc : this.zzb;
        if (zziwVar.zzb == null) {
            zziwVar2 = new zziw(zziwVar.zza, activity != null ? zzl(activity.getClass(), "Activity") : null, zziwVar.zzc, zziwVar.zze, zziwVar.zzf);
        } else {
            zziwVar2 = zziwVar;
        }
        this.zzc = this.zzb;
        this.zzb = zziwVar2;
        this.zzs.zzaz().zzp(new zziz(this, zziwVar2, zziwVar3, this.zzs.zzav().elapsedRealtime(), z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzB(zziw zziwVar, zziw zziwVar2, long j11, boolean z11, Bundle bundle) {
        long j12;
        zzg();
        boolean z12 = false;
        boolean z13 = (zziwVar2 != null && zziwVar2.zzc == zziwVar.zzc && zzix.zza(zziwVar2.zzb, zziwVar.zzb) && zzix.zza(zziwVar2.zza, zziwVar.zza)) ? false : true;
        if (z11 && this.zza != null) {
            z12 = true;
        }
        if (z13) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            zzlt.zzK(zziwVar, bundle2, true);
            if (zziwVar2 != null) {
                String str = zziwVar2.zza;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = zziwVar2.zzb;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", zziwVar2.zzc);
            }
            if (z12) {
                zzks zzksVar = this.zzs.zzu().zzb;
                long j13 = j11 - zzksVar.zzb;
                zzksVar.zzb = j11;
                if (j13 > 0) {
                    this.zzs.zzv().zzI(bundle2, j13);
                }
            }
            if (!this.zzs.zzf().zzu()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != zziwVar.zze ? "auto" : "app";
            long currentTimeMillis = this.zzs.zzav().currentTimeMillis();
            if (zziwVar.zze) {
                long j14 = zziwVar.zzf;
                if (j14 != 0) {
                    j12 = j14;
                    this.zzs.zzq().zzI(str3, "_vs", j12, bundle2);
                }
            }
            j12 = currentTimeMillis;
            this.zzs.zzq().zzI(str3, "_vs", j12, bundle2);
        }
        if (z12) {
            zzC(this.zza, true, j11);
        }
        this.zza = zziwVar;
        if (zziwVar.zze) {
            this.zzh = zziwVar;
        }
        this.zzs.zzt().zzG(zziwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzC(zziw zziwVar, boolean z11, long j11) {
        this.zzs.zzd().zzf(this.zzs.zzav().elapsedRealtime());
        if (!this.zzs.zzu().zzb.zzd(zziwVar != null && zziwVar.zzd, z11, j11) || zziwVar == null) {
            return;
        }
        zziwVar.zzd = false;
    }

    static /* bridge */ /* synthetic */ void zzp(zzje zzjeVar, Bundle bundle, zziw zziwVar, zziw zziwVar2, long j11) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        zzjeVar.zzB(zziwVar, zziwVar2, j11, true, zzjeVar.zzs.zzv().zzy(null, "screen_view", bundle, null, false));
    }

    private final zziw zzz(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity);
        zziw zziwVar = (zziw) this.zzd.get(activity);
        if (zziwVar == null) {
            zziw zziwVar2 = new zziw(null, zzl(activity.getClass(), "Activity"), this.zzs.zzv().zzq());
            this.zzd.put(activity, zziwVar2);
            zziwVar = zziwVar2;
        }
        return this.zzg != null ? this.zzg : zziwVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzf() {
        return false;
    }

    public final zziw zzi() {
        return this.zzb;
    }

    public final zziw zzj(boolean z11) {
        zza();
        zzg();
        if (!z11) {
            return this.zza;
        }
        zziw zziwVar = this.zza;
        return zziwVar != null ? zziwVar : this.zzh;
    }

    @VisibleForTesting
    final String zzl(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.zzs.zzf();
        if (length2 <= 100) {
            return str2;
        }
        this.zzs.zzf();
        return str2.substring(0, 100);
    }

    public final void zzr(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.zzs.zzf().zzu() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.zzd.put(activity, new zziw(bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void zzs(Activity activity) {
        synchronized (this.zzj) {
            try {
                if (activity == this.zze) {
                    this.zze = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.zzs.zzf().zzu()) {
            this.zzd.remove(activity);
        }
    }

    public final void zzt(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = false;
            this.zzf = true;
        }
        long elapsedRealtime = this.zzs.zzav().elapsedRealtime();
        if (!this.zzs.zzf().zzu()) {
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzjb(this, elapsedRealtime));
        } else {
            zziw zzz = zzz(activity);
            this.zzc = this.zzb;
            this.zzb = null;
            this.zzs.zzaz().zzp(new zzjc(this, zzz, elapsedRealtime));
        }
    }

    public final void zzu(Activity activity) {
        synchronized (this.zzj) {
            this.zzi = true;
            if (activity != this.zze) {
                synchronized (this.zzj) {
                    this.zze = activity;
                    this.zzf = false;
                }
                if (this.zzs.zzf().zzu()) {
                    this.zzg = null;
                    this.zzs.zzaz().zzp(new zzjd(this));
                }
            }
        }
        if (!this.zzs.zzf().zzu()) {
            this.zzb = this.zzg;
            this.zzs.zzaz().zzp(new zzja(this));
        } else {
            zzA(activity, zzz(activity), false);
            zzd zzd = this.zzs.zzd();
            zzd.zzs.zzaz().zzp(new zzc(zzd, zzd.zzs.zzav().elapsedRealtime()));
        }
    }

    public final void zzv(Activity activity, Bundle bundle) {
        zziw zziwVar;
        if (!this.zzs.zzf().zzu() || bundle == null || (zziwVar = (zziw) this.zzd.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", zziwVar.zzc);
        bundle2.putString(AppMeasurementSdk.ConditionalUserProperty.NAME, zziwVar.zza);
        bundle2.putString("referrer_name", zziwVar.zzb);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        if (r5.length() <= 100) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        if (r6.length() <= 100) goto L39;
     */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzw(@NonNull Activity activity, String str, String str2) {
        if (!this.zzs.zzf().zzu()) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        zziw zziwVar = this.zzb;
        if (zziwVar == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.zzd.get(activity) == null) {
            this.zzs.zzay().zzl().zza("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = zzl(activity.getClass(), "Activity");
        }
        boolean zza = zzix.zza(zziwVar.zzb, str2);
        boolean zza2 = zzix.zza(zziwVar.zza, str);
        if (zza && zza2) {
            this.zzs.zzay().zzl().zza("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null) {
            if (str.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                this.zzs.zzf();
            }
            this.zzs.zzay().zzl().zzb("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        this.zzs.zzay().zzj().zzc("Setting current screen to name, class", str == null ? "null" : str, str2);
        zziw zziwVar2 = new zziw(str, str2, this.zzs.zzv().zzq());
        this.zzd.put(activity, zziwVar2);
        zzA(activity, zziwVar2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r2 > 100) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r4 > 100) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzx(Bundle bundle, long j11) {
        synchronized (this.zzj) {
            try {
                if (!this.zzi) {
                    this.zzs.zzay().zzl().zza("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null) {
                    if (string.length() > 0) {
                        int length = string.length();
                        this.zzs.zzf();
                    }
                    this.zzs.zzay().zzl().zzb("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null) {
                    if (string2.length() > 0) {
                        int length2 = string2.length();
                        this.zzs.zzf();
                    }
                    this.zzs.zzay().zzl().zzb("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = this.zze;
                    string2 = activity != null ? zzl(activity.getClass(), "Activity") : "Activity";
                }
                String str = string2;
                zziw zziwVar = this.zzb;
                if (this.zzf && zziwVar != null) {
                    this.zzf = false;
                    boolean zza = zzix.zza(zziwVar.zzb, str);
                    boolean zza2 = zzix.zza(zziwVar.zza, string);
                    if (zza && zza2) {
                        this.zzs.zzay().zzl().zza("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                this.zzs.zzay().zzj().zzc("Logging screen view with name, class", string == null ? "null" : string, str == null ? "null" : str);
                zziw zziwVar2 = this.zzb == null ? this.zzc : this.zzb;
                zziw zziwVar3 = new zziw(string, str, this.zzs.zzv().zzq(), true, j11);
                this.zzb = zziwVar3;
                this.zzc = zziwVar2;
                this.zzg = zziwVar3;
                this.zzs.zzaz().zzp(new zziy(this, bundle, zziwVar3, zziwVar2, this.zzs.zzav().elapsedRealtime()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzy(String str, zziw zziwVar) {
        zzg();
        synchronized (this) {
            try {
                String str2 = this.zzl;
                if (str2 != null) {
                    if (!str2.equals(str)) {
                        if (zziwVar != null) {
                        }
                    }
                }
                this.zzl = str;
                this.zzk = zziwVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
