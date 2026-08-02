package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.App;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
public final class zzfv extends zzkt implements zzaf {
    final Map zza;
    final Map zzb;
    final Map zzc;
    final LruCache zzd;
    final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    zzfv(zzlg zzlgVar) {
        super(zzlgVar);
        this.zzg = new ArrayMap();
        this.zza = new ArrayMap();
        this.zzb = new ArrayMap();
        this.zzc = new ArrayMap();
        this.zzh = new ArrayMap();
        this.zzj = new ArrayMap();
        this.zzk = new ArrayMap();
        this.zzl = new ArrayMap();
        this.zzi = new ArrayMap();
        this.zzd = new zzfs(this, 20);
        this.zze = new zzft(this);
    }

    private final com.google.android.gms.internal.measurement.zzff zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzli.zzl(com.google.android.gms.internal.measurement.zzff.zze(), bArr)).zzaD();
            this.zzt.zzaA().zzj().zzc("Parsed config. version, gmp_app_id", zzffVar.zzu() ? Long.valueOf(zzffVar.zzc()) : null, zzffVar.zzt() ? zzffVar.zzh() : null);
            return zzffVar;
        } catch (com.google.android.gms.internal.measurement.zzll e) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzeu.zzn(str), e);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        } catch (RuntimeException e2) {
            this.zzt.zzaA().zzk().zzc("Unable to merge remote config. appId", zzeu.zzn(str), e2);
            return com.google.android.gms.internal.measurement.zzff.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        Iterator it = zzfeVar.zzg().iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfb) it.next()).zzb());
        }
        for (int i = 0; i < zzfeVar.zza(); i++) {
            com.google.android.gms.internal.measurement.zzfc zzfcVar = (com.google.android.gms.internal.measurement.zzfc) zzfeVar.zzb(i).zzbB();
            if (zzfcVar.zzc().isEmpty()) {
                this.zzt.zzaA().zzk().zza("EventConfig contained null event name");
            } else {
                String zzc = zzfcVar.zzc();
                String zzb = zzhb.zzb(zzfcVar.zzc());
                if (!TextUtils.isEmpty(zzb)) {
                    zzfcVar.zzb(zzb);
                    zzfeVar.zzd(i, zzfcVar);
                }
                if (zzfcVar.zzf() && zzfcVar.zzd()) {
                    arrayMap.put(zzc, true);
                }
                if (zzfcVar.zzg() && zzfcVar.zze()) {
                    arrayMap2.put(zzfcVar.zzc(), true);
                }
                if (zzfcVar.zzh()) {
                    if (zzfcVar.zza() < 2 || zzfcVar.zza() > 65535) {
                        this.zzt.zzaA().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    } else {
                        arrayMap3.put(zzfcVar.zzc(), Integer.valueOf(zzfcVar.zza()));
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, arrayMap);
        this.zzc.put(str, arrayMap2);
        this.zzi.put(str, arrayMap3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzC(String str) {
        Throwable th;
        Cursor cursor;
        zzaj zzajVar;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzam zzi = this.zzf.zzi();
            Preconditions.checkNotEmpty(str);
            zzi.zzg();
            zzi.zzW();
            Cursor cursor2 = null;
            try {
                cursor = zzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                        zzi.zzt.zzaA().zzd().zzc("Error querying remote config. appId", zzeu.zzn(str), e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th;
                    }
                    cursor2.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                }
            }
            if (cursor.moveToFirst()) {
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                String string2 = cursor.getString(2);
                if (cursor.moveToNext()) {
                    zzi.zzt.zzaA().zzd().zzb("Got multiple records for app config, expected one. appId", zzeu.zzn(str));
                }
                if (blob == null) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    zzajVar = null;
                } else {
                    zzajVar = new zzaj(blob, string, string2);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } else {
                if (cursor != null) {
                    cursor.close();
                }
                zzajVar = null;
            }
            if (zzajVar != null) {
                com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, zzajVar.zza).zzbB();
                zzB(str, zzfeVar);
                this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
                this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
                zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
                this.zzj.put(str, zzfeVar.zze());
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
        }
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzt.zzaA().zzj().zzb("EES programs found", Integer.valueOf(zzffVar.zza()));
        com.google.android.gms.internal.measurement.zzgt zzgtVar = (com.google.android.gms.internal.measurement.zzgt) zzffVar.zzo().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfu(zzfv.this, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfv zzfvVar = zzfv.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfo
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfv zzfvVar2 = zzfv.this;
                            String str3 = str2;
                            zzh zzj = zzfvVar2.zzf.zzi().zzj(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            zzfvVar2.zzt.zzf().zzh();
                            hashMap.put("gmp_version", 77000L);
                            if (zzj != null) {
                                String zzx = zzj.zzx();
                                if (zzx != null) {
                                    hashMap.put(App.JsonKeys.APP_VERSION, zzx);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzj.zzb()));
                                hashMap.put("dynamite_version", Long.valueOf(zzj.zzk()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfr
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(zzfv.this.zze);
                }
            });
            zzcVar.zzc(zzgtVar);
            this.zzd.put(str, zzcVar);
            this.zzt.zzaA().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgtVar.zza().zza()));
            Iterator it = zzgtVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzt.zzaA().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgr) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzt.zzaA().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzff zzffVar) {
        ArrayMap arrayMap = new ArrayMap();
        if (zzffVar != null) {
            for (com.google.android.gms.internal.measurement.zzfj zzfjVar : zzffVar.zzp()) {
                arrayMap.put(zzfjVar.zzb(), zzfjVar.zzc());
            }
        }
        return arrayMap;
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfv zzfvVar, String str) {
        zzfvVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfvVar.zzo(str)) {
            return null;
        }
        if (!zzfvVar.zzh.containsKey(str) || zzfvVar.zzh.get(str) == null) {
            zzfvVar.zzC(str);
        } else {
            zzfvVar.zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfvVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfvVar.zzd.snapshot().get(str);
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

    @Override // com.google.android.gms.measurement.internal.zzkt
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

    protected final com.google.android.gms.internal.measurement.zzff zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str);
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
        com.google.android.gms.internal.measurement.zzff zze = zze(str);
        if (zze == null) {
            return false;
        }
        return zze.zzs();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzff zzffVar;
        return (TextUtils.isEmpty(str) || (zzffVar = (com.google.android.gms.internal.measurement.zzff) this.zzh.get(str)) == null || zzffVar.zza() == 0) ? false : true;
    }

    final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    final boolean zzq(String str, String str2) {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
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
        if (zzp(str) && zzlo.zzaj(str2)) {
            return true;
        }
        if (zzs(str) && zzlo.zzak(str2)) {
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
        com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) zzA(str, bArr).zzbB();
        zzB(str, zzfeVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
        this.zzj.put(str, zzfeVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfeVar.zzf()));
        try {
            zzfeVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD()).zzbx();
        } catch (RuntimeException e) {
            this.zzt.zzaA().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeu.zzn(str), e);
        }
        zzam zzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzi.zzg();
        zzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzi.zzt.zzaA().zzd().zzb("Failed to update remote config (got 0). appId", zzeu.zzn(str));
            }
        } catch (SQLiteException e2) {
            zzi.zzt.zzaA().zzd().zzc("Error storing remote config. appId", zzeu.zzn(str), e2);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzff) zzfeVar.zzaD());
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
            return ((Set) this.zza.get(str)).contains(ProfilingTraceData.JsonKeys.DEVICE_MODEL) || ((Set) this.zza.get(str)).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
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
            return ((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains(DeviceRequestsHelper.DEVICE_INFO_PARAM);
        }
        return false;
    }

    final boolean zzz(String str) {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
