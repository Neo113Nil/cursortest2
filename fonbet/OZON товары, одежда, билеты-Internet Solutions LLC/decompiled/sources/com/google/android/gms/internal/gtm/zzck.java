package com.google.android.gms.internal.gtm;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import g.C6594f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    protected zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Preconditions.checkNotNull(zzbwVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzy = zzy();
        if (zzy.zze()) {
            zzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long j11;
        zzcy zzy = zzy();
        if (zzy.zzc() && !zzy.zze()) {
            com.google.android.gms.analytics.zzr.zzh();
            zzW();
            try {
                j11 = this.zzb.zzc();
            } catch (SQLiteException e11) {
                zzK("Failed to get min/max hit times from local store", e11);
                j11 = 0;
            }
            if (j11 != 0) {
                long abs = Math.abs(zzC().currentTimeMillis() - j11);
                zzw();
                if (abs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzy.zzb();
                }
            }
        }
    }

    private final void zzaj(zzbx zzbxVar, zzaw zzawVar) {
        Preconditions.checkNotNull(zzbxVar);
        Preconditions.checkNotNull(zzawVar);
        com.google.android.gms.analytics.zza zzaVar = new com.google.android.gms.analytics.zza(zzt());
        zzaVar.zzc(zzbxVar.zzc());
        zzaVar.zzd(zzbxVar.zzf());
        com.google.android.gms.analytics.zzh zza = zzaVar.zza();
        zzbe zzbeVar = (zzbe) zza.zzb(zzbe.class);
        zzbeVar.zzk("data");
        zzbeVar.zzl(true);
        zza.zzg(zzawVar);
        zzaz zzazVar = (zzaz) zza.zzb(zzaz.class);
        zzav zzavVar = (zzav) zza.zzb(zzav.class);
        for (Map.Entry<String, String> entry : zzbxVar.zzd().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("an".equals(key)) {
                zzavVar.zzk(value);
            } else if ("av".equals(key)) {
                zzavVar.zzl(value);
            } else if ("aid".equals(key)) {
                zzavVar.zzi(value);
            } else if ("aiid".equals(key)) {
                zzavVar.zzj(value);
            } else if ("uid".equals(key)) {
                zzbeVar.zzm(value);
            } else {
                zzazVar.zze(key, value);
            }
        }
        zzH("Sending installation campaign to", zzbxVar.zzc(), zzawVar);
        zza.zzj(zzA().zza());
        zza.zzk();
    }

    private final boolean zzak(String str) {
        return Wrappers.packageManager(zzo()).checkCallingOrSelfPermission(str) == 0;
    }

    static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e11) {
            zzckVar.zzS("Failed to delete stale hits", e11);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final void zzZ(long j11) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (j11 < 0) {
            j11 = 0;
        }
        this.zzf = j11;
        zzae();
    }

    public final long zza() {
        long j11 = this.zzf;
        if (j11 != Long.MIN_VALUE) {
            return j11;
        }
        zzw();
        long longValue = zzeu.zzi.zzb().longValue();
        zzft zzB = zzB();
        zzB.zzW();
        if (!zzB.zzc) {
            return longValue;
        }
        zzB().zzW();
        return r0.zzd * 1000;
    }

    final void zzaa() {
        zzW();
        Preconditions.checkState(!this.zza, "Analytics backend already started");
        this.zza = true;
        zzq().zzi(new zzci(this));
    }

    protected final void zzab() {
        zzW();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        Context zza = zzt().zza();
        if (!zzfi.zza(zza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(zza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!CampaignTrackingReceiver.zzb(zza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzac() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzF("Sync dispatching local hits");
        long j11 = this.zzj;
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (this.zzj != j11) {
                this.zzd.zzb();
            }
        } catch (Exception e11) {
            zzK("Sync local dispatch failed", e11);
            zzae();
        }
    }

    public final void zzad() {
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long min;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long zza = zza();
                long zzb = zzA().zzb();
                if (zzb != 0) {
                    min = zza - Math.abs(zzC().currentTimeMillis() - zzb);
                    if (min <= 0) {
                        zzw();
                        min = Math.min(zzct.zze(), zza);
                    }
                } else {
                    zzw();
                    min = Math.min(zzct.zze(), zza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(min));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(min);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, min + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    protected final boolean zzaf() {
        boolean z11;
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z11 = false;
        } else {
            zzw();
            z11 = true;
        }
        boolean zze = this.zzc.zze();
        if (z11 && !zze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int zzh = zzct.zzh();
        zzw();
        long max = Math.max(zzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        while (true) {
            try {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List<zzex> zzj = this.zzb.zzj(max);
                        if (zzj.isEmpty()) {
                            zzO("Store is empty, nothing to dispatch");
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e11) {
                                zzK("Failed to commit local dispatch transaction", e11);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        zzP("Hits loaded from store. count", Integer.valueOf(zzj.size()));
                        Iterator<zzex> it = zzj.iterator();
                        while (it.hasNext()) {
                            if (it.next().zzb() == j11) {
                                zzL("Database contains successfully uploaded hit", Long.valueOf(j11), Integer.valueOf(zzj.size()));
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e12) {
                                    zzK("Failed to commit local dispatch transaction", e12);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (this.zze.zzg()) {
                            zzw();
                            zzO("Service connected, sending hits to the service");
                            while (!zzj.isEmpty()) {
                                zzex zzexVar = zzj.get(0);
                                if (!this.zze.zzh(zzexVar)) {
                                    break;
                                }
                                j11 = Math.max(j11, zzexVar.zzb());
                                zzj.remove(zzexVar);
                                zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                                try {
                                    this.zzb.zzn(zzexVar.zzb());
                                    arrayList.add(Long.valueOf(zzexVar.zzb()));
                                } catch (SQLiteException e13) {
                                    zzK("Failed to remove hit that was send for delivery", e13);
                                    zzah();
                                    zzag();
                                    try {
                                        this.zzb.zzab();
                                        this.zzb.zzaa();
                                        return false;
                                    } catch (SQLiteException e14) {
                                        zzK("Failed to commit local dispatch transaction", e14);
                                        zzah();
                                        zzag();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzc.zze()) {
                            List<Long> zzc = this.zzc.zzc(zzj);
                            Iterator<Long> it2 = zzc.iterator();
                            while (it2.hasNext()) {
                                j11 = Math.max(j11, it2.next().longValue());
                            }
                            try {
                                this.zzb.zzZ(zzc);
                                arrayList.addAll(zzc);
                            } catch (SQLiteException e15) {
                                zzK("Failed to remove successfully uploaded hits", e15);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e16) {
                                    zzK("Failed to commit local dispatch transaction", e16);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e17) {
                                zzK("Failed to commit local dispatch transaction", e17);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                        } catch (SQLiteException e18) {
                            zzK("Failed to commit local dispatch transaction", e18);
                            zzah();
                            zzag();
                            return false;
                        }
                    } catch (SQLiteException e19) {
                        zzS("Failed to read hits from persisted store", e19);
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e21) {
                            zzK("Failed to commit local dispatch transaction", e21);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    this.zzb.zzab();
                    this.zzb.zzaa();
                    throw th2;
                }
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th2;
            } catch (SQLiteException e22) {
                zzK("Failed to commit local dispatch transaction", e22);
                zzah();
                zzag();
                return false;
            }
        }
    }

    public final long zzb(zzbx zzbxVar, boolean z11) {
        Preconditions.checkNotNull(zzbxVar);
        zzW();
        com.google.android.gms.analytics.zzr.zzh();
        try {
            try {
                this.zzb.zzm();
                zzce zzceVar = this.zzb;
                String zzb = zzbxVar.zzb();
                Preconditions.checkNotEmpty(zzb);
                zzceVar.zzW();
                com.google.android.gms.analytics.zzr.zzh();
                int delete = zzceVar.zzf().delete("properties", "app_uid=? AND cid<>?", new String[]{"0", zzb});
                if (delete > 0) {
                    zzceVar.zzP("Deleted property records", Integer.valueOf(delete));
                }
                long zze = this.zzb.zze(0L, zzbxVar.zzb(), zzbxVar.zzc());
                zzbxVar.zze(1 + zze);
                zzce zzceVar2 = this.zzb;
                Preconditions.checkNotNull(zzbxVar);
                zzceVar2.zzW();
                com.google.android.gms.analytics.zzr.zzh();
                SQLiteDatabase zzf = zzceVar2.zzf();
                Map<String, String> zzd = zzbxVar.zzd();
                Preconditions.checkNotNull(zzd);
                Uri.Builder builder = new Uri.Builder();
                for (Map.Entry<String, String> entry : zzd.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", (Long) 0L);
                contentValues.put("cid", zzbxVar.zzb());
                contentValues.put("tid", zzbxVar.zzc());
                contentValues.put("adid", Integer.valueOf(zzbxVar.zzf() ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbxVar.zza()));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf.insertWithOnConflict("properties", null, contentValues, 5) == -1) {
                        zzceVar2.zzJ("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e11) {
                    zzceVar2.zzK("Error storing a property", e11);
                }
                this.zzb.zzab();
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e12) {
                    zzK("Failed to end transaction", e12);
                }
                return zze;
            } catch (SQLiteException e13) {
                zzK("Failed to update Analytics property", e13);
                try {
                    this.zzb.zzaa();
                } catch (SQLiteException e14) {
                    zzK("Failed to end transaction", e14);
                }
                return -1L;
            }
        } catch (Throwable th2) {
            try {
                this.zzb.zzaa();
            } catch (SQLiteException e15) {
                zzK("Failed to end transaction", e15);
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j11) {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        long zzb = zzA().zzb();
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(zzb != 0 ? Math.abs(zzC().currentTimeMillis() - zzb) : -1L));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j11) {
                this.zzd.zzb();
            }
        } catch (Exception e11) {
            zzK("Local dispatch failed", e11);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e11);
            }
        }
    }

    public final void zzh() {
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzw();
        zzO("Delete all hits from local store");
        try {
            zzce zzceVar = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzceVar.zzW();
            zzceVar.zzf().delete("hits2", null, null);
            zzce zzceVar2 = this.zzb;
            com.google.android.gms.analytics.zzr.zzh();
            zzceVar2.zzW();
            zzceVar2.zzf().delete("properties", null, null);
            zzae();
        } catch (SQLiteException e11) {
            zzS("Failed to delete hits from store", e11);
        }
        zzi();
        if (this.zze.zze()) {
            zzO("Device service unavailable. Can't clear hits stored on the device service.");
        }
    }

    protected final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzct.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
                this.zzi.zzb();
                zzO("Connecting to service");
                if (this.zze.zzf()) {
                    zzO("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        if (r2 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199 A[Catch: SQLiteException -> 0x00d6, TryCatch #1 {SQLiteException -> 0x00d6, blocks: (B:16:0x0083, B:17:0x00a2, B:19:0x00a8, B:22:0x00bc, B:25:0x00c4, B:28:0x00cc, B:35:0x00d9, B:38:0x00e5, B:40:0x00ee, B:41:0x0202, B:43:0x00f9, B:45:0x0114, B:47:0x0125, B:48:0x0186, B:49:0x0128, B:60:0x0172, B:69:0x0199, B:70:0x019c, B:75:0x019d, B:77:0x01cb, B:78:0x01da, B:88:0x01fd, B:89:0x01d3, B:80:0x01df, B:82:0x01eb, B:85:0x01f3), top: B:15:0x0083, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj(zzex zzexVar) {
        String zzk;
        Cursor cursor;
        List<Long> list;
        Pair<String, Long> zza;
        zzex zzexVar2 = zzexVar;
        Preconditions.checkNotNull(zzexVar2);
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        if (this.zzk) {
            zzF("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
        } else {
            zzP("Delivering hit", zzexVar2);
        }
        if (TextUtils.isEmpty(zzexVar2.zzf()) && (zza = zzA().zze().zza()) != null) {
            Long l11 = (Long) zza.second;
            String str = (String) zza.first;
            String valueOf = String.valueOf(l11);
            String a11 = C6594f.a(valueOf, ProductContainerDTO.RATIO_DELIMITER, str, new StringBuilder(valueOf.length() + 1 + String.valueOf(str).length()));
            HashMap hashMap = new HashMap(zzexVar2.zzg());
            hashMap.put("_m", a11);
            zzexVar2 = zzex.zze(this, zzexVar2, hashMap);
        }
        zzex zzexVar3 = zzexVar2;
        zzi();
        if (this.zze.zzh(zzexVar3)) {
            zzF("Hit sent to the device AnalyticsService for delivery");
            return;
        }
        zzw();
        try {
            zzce zzceVar = this.zzb;
            Preconditions.checkNotNull(zzexVar3);
            com.google.android.gms.analytics.zzr.zzh();
            zzceVar.zzW();
            Preconditions.checkNotNull(zzexVar3);
            Uri.Builder builder = new Uri.Builder();
            for (Map.Entry<String, String> entry : zzexVar3.zzg().entrySet()) {
                String key = entry.getKey();
                if (!"ht".equals(key) && !"qt".equals(key) && !"AppUID".equals(key)) {
                    builder.appendQueryParameter(key, entry.getValue());
                }
            }
            String encodedQuery = builder.build().getEncodedQuery();
            if (encodedQuery == null) {
                encodedQuery = "";
            }
            String str2 = encodedQuery;
            if (str2.length() > 8192) {
                zzceVar.zzz().zzb(zzexVar3, "Hit length exceeds the maximum allowed size");
            } else {
                zzceVar.zzw();
                int intValue = zzeu.zzf.zzb().intValue();
                long zzb = zzceVar.zzb();
                Cursor cursor2 = null;
                if (zzb > intValue - 1) {
                    long j11 = (zzb - intValue) + 1;
                    com.google.android.gms.analytics.zzr.zzh();
                    zzceVar.zzW();
                    if (j11 <= 0) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        SQLiteDatabase zzf = zzceVar.zzf();
                        ArrayList arrayList = new ArrayList();
                        try {
                            cursor = zzf.query("hits2", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Long.toString(j11));
                            try {
                                try {
                                    if (cursor.moveToFirst()) {
                                        do {
                                            arrayList.add(Long.valueOf(cursor.getLong(0)));
                                        } while (cursor.moveToNext());
                                    }
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    zzceVar.zzS("Error selecting hit ids", e);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            cursor = null;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cursor2 != null) {
                            }
                            throw th;
                        }
                        cursor.close();
                        list = arrayList;
                    }
                    zzceVar.zzS("Store full, deleting hits to make room, count", Integer.valueOf(list.size()));
                    zzceVar.zzZ(list);
                }
                SQLiteDatabase zzf2 = zzceVar.zzf();
                ContentValues contentValues = new ContentValues();
                contentValues.put("hit_string", str2);
                contentValues.put("hit_time", Long.valueOf(zzexVar3.zzd()));
                contentValues.put("hit_app_id", Integer.valueOf(zzexVar3.zza()));
                if (zzexVar3.zzh()) {
                    zzceVar.zzw();
                    zzk = zzct.zzi();
                } else {
                    zzceVar.zzw();
                    zzk = zzct.zzk();
                }
                contentValues.put("hit_url", zzk);
                try {
                    long insert = zzf2.insert("hits2", null, contentValues);
                    if (insert == -1) {
                        zzceVar.zzJ("Failed to insert a hit (got -1)");
                    } else {
                        zzceVar.zzH("Hit saved to database. db-id, hit", Long.valueOf(insert), zzexVar3);
                    }
                } catch (SQLiteException e13) {
                    zzceVar.zzK("Error storing a hit", e13);
                }
            }
            zzae();
        } catch (SQLiteException e14) {
            zzK("Delivery failed to save hit to a database", e14);
            zzz().zzb(zzexVar3, "deliver: failed to insert hit to database");
        }
    }

    protected final void zzk(zzbx zzbxVar) {
        com.google.android.gms.analytics.zzr.zzh();
        zzG("Sending first hit to property", zzbxVar.zzc());
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            return;
        }
        String zzg = zzA().zzg();
        if (TextUtils.isEmpty(zzg)) {
            return;
        }
        zzaw zzb = zzfs.zzb(zzz(), zzg);
        zzG("Found relevant installation campaign", zzb);
        zzaj(zzbxVar, zzb);
    }

    final void zzl() {
        com.google.android.gms.analytics.zzr.zzh();
        this.zzj = zzC().currentTimeMillis();
    }

    protected final void zzm() {
        com.google.android.gms.analytics.zzr.zzh();
        zzw();
        com.google.android.gms.analytics.zzr.zzh();
        zzW();
        zzE();
        zzw();
        if (!zzct.zzl()) {
            zzR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzO("Service not connected");
            return;
        }
        if (this.zzb.zzac()) {
            return;
        }
        zzO("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzce zzceVar = this.zzb;
                zzw();
                List<zzex> zzj = zzceVar.zzj(zzct.zzh());
                if (zzj.isEmpty()) {
                    zzae();
                    return;
                }
                while (!zzj.isEmpty()) {
                    zzex zzexVar = zzj.get(0);
                    if (!this.zze.zzh(zzexVar)) {
                        zzae();
                        return;
                    }
                    zzj.remove(zzexVar);
                    try {
                        this.zzb.zzn(zzexVar.zzb());
                    } catch (SQLiteException e11) {
                        zzK("Failed to remove hit that was send for delivery", e11);
                        zzah();
                        zzag();
                        return;
                    }
                }
            } catch (SQLiteException e12) {
                zzK("Failed to read hits from store", e12);
                zzah();
                zzag();
                return;
            }
        }
    }

    public final void zzn(String str) {
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.analytics.zzr.zzh();
        zzE();
        zzaw zzb = zzfs.zzb(zzz(), str);
        if (zzb == null) {
            zzS("Parsing failed. Ignoring invalid campaign data", str);
            return;
        }
        String zzg = zzA().zzg();
        if (str.equals(zzg)) {
            zzR("Ignoring duplicate install campaign");
            return;
        }
        if (!TextUtils.isEmpty(zzg)) {
            zzL("Ignoring multiple install campaigns. original, new", zzg, str);
            return;
        }
        zzA().zzh(str);
        zzfo zzf = zzA().zzf();
        zzw();
        if (zzf.zzc(zzct.zzc())) {
            zzS("Campaign received too late, ignoring", zzb);
            return;
        }
        zzG("Received installation campaign", zzb);
        zzce zzceVar = this.zzb;
        zzceVar.zzW();
        com.google.android.gms.analytics.zzr.zzh();
        SQLiteDatabase zzf2 = zzceVar.zzf();
        Cursor cursor = null;
        try {
            try {
                zzceVar.zzw();
                int intValue = zzeu.zzh.zzb().intValue();
                cursor = zzf2.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(intValue));
                ArrayList arrayList = new ArrayList();
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        boolean z11 = cursor.getInt(2) != 0;
                        long j11 = cursor.getInt(3);
                        Map<String, String> zzl = zzceVar.zzl(cursor.getString(4));
                        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                            zzceVar.zzT("Read property with empty client id or tracker id", string, string2);
                        } else {
                            arrayList.add(new zzbx(0L, string, string2, z11, j11, zzl));
                        }
                    } while (cursor.moveToNext());
                }
                if (arrayList.size() >= intValue) {
                    zzceVar.zzR("Sending hits to too many properties. Campaign report might be incorrect");
                }
                cursor.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzaj((zzbx) it.next(), zzb);
                }
            } catch (SQLiteException e11) {
                zzceVar.zzK("Error loading hits from the database", e11);
                throw e11;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }
}
