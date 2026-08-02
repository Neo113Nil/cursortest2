package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes9.dex */
public final class zzhc extends zzep {
    private final zzll zza;
    private Boolean zzb;
    private String zzc;

    public zzhc(zzll zzllVar, String str) {
        Preconditions.checkNotNull(zzllVar);
        this.zza = zzllVar;
        this.zzc = null;
    }

    private final void zzA(zzaw zzawVar, zzq zzqVar) {
        this.zza.zzA();
        this.zza.zzD(zzawVar, zzqVar);
    }

    private final void zzy(zzq zzqVar, boolean z11) {
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        this.zza.zzv().zzX(zzqVar.zzb, zzqVar.zzq);
    }

    private final void zzz(String str, boolean z11) {
        if (TextUtils.isEmpty(str)) {
            this.zza.zzay().zzd().zza("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z11) {
            try {
                if (this.zzb == null) {
                    boolean z12 = true;
                    if (!"com.google.android.gms".equals(this.zzc) && !UidVerifier.isGooglePlayServicesUid(this.zza.zzau(), Binder.getCallingUid()) && !GoogleSignatureVerifier.getInstance(this.zza.zzau()).isUidGoogleSigned(Binder.getCallingUid())) {
                        z12 = false;
                    }
                    this.zzb = Boolean.valueOf(z12);
                }
                if (this.zzb.booleanValue()) {
                    return;
                }
            } catch (SecurityException e11) {
                this.zza.zzay().zzd().zzb("Measurement Service called with invalid calling package. appId", zzfa.zzn(str));
                throw e11;
            }
        }
        if (this.zzc == null && GooglePlayServicesUtilLight.uidHasPackageName(this.zza.zzau(), Binder.getCallingUid(), str)) {
            this.zzc = str;
        }
        if (str.equals(this.zzc)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @VisibleForTesting
    final zzaw zzb(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.zza) && (zzauVar = zzawVar.zzb) != null && zzauVar.zza() != 0) {
            String zzg = zzawVar.zzb.zzg("_cis");
            if ("referrer broadcast".equals(zzg) || "referrer API".equals(zzg)) {
                this.zza.zzay().zzi().zzb("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.zzb, zzawVar.zzc, zzawVar.zzd);
            }
        }
        return zzawVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final String zzd(zzq zzqVar) {
        zzy(zzqVar, false);
        return this.zza.zzx(zzqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final List zze(zzq zzqVar, boolean z11) {
        zzy(zzqVar, false);
        String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgz(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlqVar : list) {
                if (!z11 && zzlt.zzah(zzlqVar.zzc)) {
                }
                arrayList.add(new zzlo(zzlqVar));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzfa.zzn(zzqVar.zza), e);
            return null;
        } catch (ExecutionException e12) {
            e = e12;
            this.zza.zzay().zzd().zzc("Failed to get user properties. appId", zzfa.zzn(zzqVar.zza), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final List zzf(String str, String str2, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            return (List) this.zza.zzaz().zzh(new zzgq(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e11) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties", e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final List zzg(String str, String str2, String str3) {
        zzz(str, true);
        try {
            return (List) this.zza.zzaz().zzh(new zzgr(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e11) {
            this.zza.zzay().zzd().zzb("Failed to get conditional user properties as", e11);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final List zzh(String str, String str2, boolean z11, zzq zzqVar) {
        zzy(zzqVar, false);
        String str3 = zzqVar.zza;
        Preconditions.checkNotNull(str3);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgo(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlqVar : list) {
                if (!z11 && zzlt.zzah(zzlqVar.zzc)) {
                }
                arrayList.add(new zzlo(zzlqVar));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzfa.zzn(zzqVar.zza), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e12) {
            e = e12;
            this.zza.zzay().zzd().zzc("Failed to query user properties. appId", zzfa.zzn(zzqVar.zza), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final List zzi(String str, String str2, String str3, boolean z11) {
        zzz(str, true);
        try {
            List<zzlq> list = (List) this.zza.zzaz().zzh(new zzgp(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (zzlq zzlqVar : list) {
                if (!z11 && zzlt.zzah(zzlqVar.zzc)) {
                }
                arrayList.add(new zzlo(zzlqVar));
            }
            return arrayList;
        } catch (InterruptedException e11) {
            e = e11;
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzfa.zzn(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e12) {
            e = e12;
            this.zza.zzay().zzd().zzc("Failed to get user properties as. appId", zzfa.zzn(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzj(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzha(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzk(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzawVar);
        zzy(zzqVar, false);
        zzx(new zzgv(this, zzawVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzl(zzaw zzawVar, String str, String str2) {
        Preconditions.checkNotNull(zzawVar);
        Preconditions.checkNotEmpty(str);
        zzz(str, true);
        zzx(new zzgw(this, zzawVar, str));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzm(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzz(zzqVar.zza, false);
        zzx(new zzgs(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzn(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        zzy(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.zza = zzqVar.zza;
        zzx(new zzgm(this, zzacVar2, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzo(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotNull(zzacVar.zzc);
        Preconditions.checkNotEmpty(zzacVar.zza);
        zzz(zzacVar.zza, true);
        zzx(new zzgn(this, new zzac(zzacVar)));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzp(zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.zza);
        Preconditions.checkNotNull(zzqVar.zzv);
        zzgu zzguVar = new zzgu(this, zzqVar);
        Preconditions.checkNotNull(zzguVar);
        if (this.zza.zzaz().zzs()) {
            zzguVar.run();
        } else {
            this.zza.zzaz().zzq(zzguVar);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzq(long j11, String str, String str2, String str3) {
        zzx(new zzhb(this, str2, str3, str, j11));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzr(final Bundle bundle, zzq zzqVar) {
        zzy(zzqVar, false);
        final String str = zzqVar.zza;
        Preconditions.checkNotNull(str);
        zzx(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzgl
            @Override // java.lang.Runnable
            public final void run() {
                zzhc.this.zzw(str, bundle);
            }
        });
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzs(zzq zzqVar) {
        zzy(zzqVar, false);
        zzx(new zzgt(this, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final void zzt(zzlo zzloVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzloVar);
        zzy(zzqVar, false);
        zzx(new zzgy(this, zzloVar, zzqVar));
    }

    @Override // com.google.android.gms.measurement.internal.zzeq
    public final byte[] zzu(zzaw zzawVar, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzawVar);
        zzz(str, true);
        this.zza.zzay().zzc().zzb("Log and bundle. event", this.zza.zzj().zzd(zzawVar.zza));
        long nanoTime = this.zza.zzav().nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) this.zza.zzaz().zzi(new zzgx(this, zzawVar, str)).get();
            if (bArr == null) {
                this.zza.zzay().zzd().zzb("Log and bundle returned null. appId", zzfa.zzn(str));
                bArr = new byte[0];
            }
            this.zza.zzay().zzc().zzd("Log and bundle processed. event, size, time_ms", this.zza.zzj().zzd(zzawVar.zza), Integer.valueOf(bArr.length), Long.valueOf((this.zza.zzav().nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e11) {
            e = e11;
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzfa.zzn(str), this.zza.zzj().zzd(zzawVar.zza), e);
            return null;
        } catch (ExecutionException e12) {
            e = e12;
            this.zza.zzay().zzd().zzd("Failed to log and bundle. appId, event, error", zzfa.zzn(str), this.zza.zzj().zzd(zzawVar.zza), e);
            return null;
        }
    }

    final void zzv(zzaw zzawVar, zzq zzqVar) {
        if (!this.zza.zzo().zzo(zzqVar.zza)) {
            zzA(zzawVar, zzqVar);
            return;
        }
        this.zza.zzay().zzj().zzb("EES config found for", zzqVar.zza);
        zzgb zzo = this.zza.zzo();
        String str = zzqVar.zza;
        com.google.android.gms.internal.measurement.zzc zzcVar = TextUtils.isEmpty(str) ? null : (com.google.android.gms.internal.measurement.zzc) zzo.zzd.get(str);
        if (zzcVar == null) {
            this.zza.zzay().zzj().zzb("EES not loaded for", zzqVar.zza);
            zzA(zzawVar, zzqVar);
            return;
        }
        try {
            Map zzs = this.zza.zzu().zzs(zzawVar.zzb.zzc(), true);
            String zza = zzhh.zza(zzawVar.zza);
            if (zza == null) {
                zza = zzawVar.zza;
            }
            if (zzcVar.zze(new com.google.android.gms.internal.measurement.zzaa(zza, zzawVar.zzd, zzs))) {
                if (zzcVar.zzg()) {
                    this.zza.zzay().zzj().zzb("EES edited event", zzawVar.zza);
                    zzA(this.zza.zzu().zzi(zzcVar.zza().zzb()), zzqVar);
                } else {
                    zzA(zzawVar, zzqVar);
                }
                if (zzcVar.zzf()) {
                    for (com.google.android.gms.internal.measurement.zzaa zzaaVar : zzcVar.zza().zzc()) {
                        this.zza.zzay().zzj().zzb("EES logging created event", zzaaVar.zzd());
                        zzA(this.zza.zzu().zzi(zzaaVar), zzqVar);
                    }
                    return;
                }
                return;
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zza.zzay().zzd().zzc("EES error. appId, eventName", zzqVar.zzb, zzawVar.zza);
        }
        this.zza.zzay().zzj().zzb("EES was not applied to event", zzawVar.zza);
        zzA(zzawVar, zzqVar);
    }

    final /* synthetic */ void zzw(String str, Bundle bundle) {
        zzam zzi = this.zza.zzi();
        zzi.zzg();
        zzi.zzW();
        byte[] zzby = zzi.zzf.zzu().zzj(new zzar(zzi.zzs, "", str, "dep", 0L, 0L, bundle)).zzby();
        zzi.zzs.zzay().zzj().zzc("Saving default event parameters, appId, data size", zzi.zzs.zzj().zzd(str), Integer.valueOf(zzby.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", zzby);
        try {
            if (zzi.zzh().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzi.zzs.zzay().zzd().zzb("Failed to insert default event parameters (got -1). appId", zzfa.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzi.zzs.zzay().zzd().zzc("Error storing default event parameters. appId", zzfa.zzn(str), e11);
        }
    }

    @VisibleForTesting
    final void zzx(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        if (this.zza.zzaz().zzs()) {
            runnable.run();
        } else {
            this.zza.zzaz().zzp(runnable);
        }
    }
}
