package com.google.android.gms.measurement.internal;

import U7.C4056a;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C5132a;
import androidx.collection.C5155y;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public final class zzgb extends zzkz implements zzaf {

    @VisibleForTesting
    final Map zza;

    @VisibleForTesting
    final Map zzb;

    @VisibleForTesting
    final Map zzc;

    @VisibleForTesting
    final C5155y zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzgb(zzll zzllVar) {
        super(zzllVar);
        this.zzg = new C5132a();
        this.zza = new C5132a();
        this.zzb = new C5132a();
        this.zzc = new C5132a();
        this.zzh = new C5132a();
        this.zzj = new C5132a();
        this.zzk = new C5132a();
        this.zzl = new C5132a();
        this.zzi = new C5132a();
        this.zzd = new zzfy(this, 20);
        this.zze = new zzfz(this);
    }

    private final com.google.android.gms.internal.measurement.zzfe zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) ((com.google.android.gms.internal.measurement.zzfd) zzln.zzl(com.google.android.gms.internal.measurement.zzfe.zze(), bArr)).zzaE();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfeVar.zzs() ? Long.valueOf(zzfeVar.zzc()) : null, zzfeVar.zzr() ? zzfeVar.zzh() : null);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzkm e11) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzfa.zzn(str), e11);
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        } catch (RuntimeException e12) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzfa.zzn(str), e12);
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        C5132a c5132a = new C5132a();
        C5132a c5132a2 = new C5132a();
        C5132a c5132a3 = new C5132a();
        if (zzfdVar != null) {
            zzpj.zzc();
            if (this.zzs.zzf().zzs(null, zzen.zzaB)) {
                Iterator it = zzfdVar.zzg().iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.zzfa) it.next()).zzb());
                }
            }
            for (int i11 = 0; i11 < zzfdVar.zza(); i11++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i11).zzbB();
                if (zzfbVar.zzc().isEmpty()) {
                    C4056a.a(this.zzs, "EventConfig contained null event name");
                } else {
                    String zzc = zzfbVar.zzc();
                    String zzb = zzhh.zzb(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(zzb)) {
                        zzfbVar.zzb(zzb);
                        zzfdVar.zzd(i11, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        c5132a.put(zzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        c5132a2.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() < 2 || zzfbVar.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            c5132a3.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, c5132a);
        this.zzc.put(str, c5132a2);
        this.zzi.put(str, c5132a3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0093: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:37:0x0093 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzC(String str) {
        Throwable th2;
        Cursor cursor;
        Cursor cursor2;
        zzaj zzajVar;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) != null) {
            return;
        }
        zzam zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        Cursor cursor3 = null;
        try {
            try {
                cursor = zzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                } catch (SQLiteException e11) {
                    e = e11;
                    zzi.zzs.zzay().zzd().zzc("Error querying remote config. appId", zzfa.zzn(str), e);
                }
            } catch (Throwable th3) {
                th2 = th3;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th2;
                }
                cursor3.close();
                throw th2;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th4) {
            th2 = th4;
            if (cursor3 != null) {
            }
        }
        if (cursor.moveToFirst()) {
            byte[] blob = cursor.getBlob(0);
            String string = cursor.getString(1);
            String string2 = zzi.zzs.zzf().zzs(null, zzen.zzaM) ? cursor.getString(2) : null;
            if (cursor.moveToNext()) {
                zzi.zzs.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzfa.zzn(str));
            }
            if (blob != null) {
                zzajVar = new zzaj(blob, string, string2);
                cursor.close();
                if (zzajVar == null) {
                    com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzA(str, zzajVar.zza).zzbB();
                    zzB(str, zzfdVar);
                    this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()));
                    this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
                    zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
                    this.zzj.put(str, zzfdVar.zze());
                    this.zzk.put(str, zzajVar.zzb);
                    this.zzl.put(str, zzajVar.zzc);
                    return;
                }
                this.zzg.put(str, null);
                this.zzb.put(str, null);
                this.zza.put(str, null);
                this.zzc.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
        }
        cursor.close();
        zzajVar = null;
        if (zzajVar == null) {
        }
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        if (zzfeVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfeVar.zza()));
        com.google.android.gms.internal.measurement.zzgs zzgsVar = (com.google.android.gms.internal.measurement.zzgs) zzfeVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzga(zzgb.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgb zzgbVar = zzgb.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgb zzgbVar2 = zzgb.this;
                            String str3 = str2;
                            zzh zzj = zzgbVar2.zzf.zzi().zzj(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            zzgbVar2.zzs.zzf().zzh();
                            hashMap.put("gmp_version", 64000L);
                            if (zzj != null) {
                                String zzw = zzj.zzw();
                                if (zzw != null) {
                                    hashMap.put("app_version", zzw);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(zzgb.this.zze);
                }
            });
            zzcVar.zzc(zzgsVar);
            this.zzd.put(str, zzcVar);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
            Iterator it = zzgsVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzs.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgq) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        C5132a c5132a = new C5132a();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                c5132a.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return c5132a;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzgb zzgbVar, String str) {
        zzgbVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzgbVar.zzo(str)) {
            return null;
        }
        if (!zzgbVar.zzh.containsKey(str) || zzgbVar.zzh.get(str) == null) {
            zzgbVar.zzC(str);
        } else {
            zzgbVar.zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzgbVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzgbVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final String zza(String str, String str2) {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkz
    protected final boolean zzb() {
        return false;
    }

    final int zzc(String str, String str2) {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    protected final com.google.android.gms.internal.measurement.zzfe zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str);
    }

    protected final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    protected final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    final String zzi(String str) {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    protected final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfe zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzq();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzfe zzfeVar;
        return (TextUtils.isEmpty(str) || (zzfeVar = (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str)) == null || zzfeVar.zza() == 0) ? false : true;
    }

    final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || ProductAction.ACTION_REFUND.equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzr(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlt.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlt.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    protected final boolean zzt(String str, byte[] bArr, String str2, String str3) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzA(str, bArr).zzbB();
        if (zzfdVar == null) {
            return false;
        }
        zzB(str, zzfdVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzj.put(str, zzfdVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfdVar.zzf()));
        try {
            zzfdVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()).zzby();
        } catch (RuntimeException e11) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzfa.zzn(str), e11);
        }
        zzam zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzi.zzs.zzf().zzs(null, zzen.zzaM)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzfa.zzn(str));
            }
        } catch (SQLiteException e12) {
            zzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzfa.zzn(str), e12);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        return true;
    }

    final boolean zzu(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    final boolean zzv(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("device_model") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzw(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    final boolean zzx(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    final boolean zzy(String str) {
        zzg();
        zzC(str);
        if (this.zza.get(str) != null) {
            return ((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains("device_info");
        }
        return false;
    }

    final boolean zzz(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
