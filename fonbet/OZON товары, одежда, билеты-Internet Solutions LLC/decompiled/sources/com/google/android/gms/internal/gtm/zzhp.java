package com.google.android.gms.internal.gtm;

import B0.A0;
import E0.C2942q;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@VisibleForTesting
/* loaded from: classes9.dex */
final class zzhp implements zzhd {
    private static final String zza = "CREATE TABLE IF NOT EXISTS gtm_hit_unique_ids ('hit_unique_id' TEXT UNIQUE);";
    private static final String zzb = "CREATE TABLE IF NOT EXISTS gtm_hits ( 'hit_id' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, 'hit_time' INTEGER NOT NULL, 'hit_url' TEXT NOT NULL, 'hit_first_send_time' INTEGER NOT NULL, 'hit_method' TEXT NOT NULL, 'hit_unique_id' TEXT UNIQUE, 'hit_headers' TEXT, 'hit_body' TEXT);";
    private static final String zzc = "CREATE TRIGGER IF NOT EXISTS save_unique_on_delete DELETE ON gtm_hits FOR EACH ROW WHEN OLD.hit_unique_id NOTNULL BEGIN     INSERT OR IGNORE INTO gtm_hit_unique_ids (hit_unique_id) VALUES (OLD.hit_unique_id); END;";
    private static final String zzd = "CREATE TRIGGER IF NOT EXISTS check_unique_on_insert BEFORE INSERT ON gtm_hits FOR EACH ROW WHEN NEW.hit_unique_id NOT NULL BEGIN     SELECT RAISE(ABORT, 'Duplicate unique ID.')     WHERE EXISTS (SELECT 1 FROM gtm_hit_unique_ids WHERE hit_unique_id = NEW.hit_unique_id); END;";
    private final zzho zze;
    private volatile zzgw zzf;
    private final Context zzg;
    private final String zzh;
    private long zzi;
    private final Clock zzj;
    private final int zzk;
    private final zzie zzl;

    zzhp(zzie zzieVar, Context context, byte[] bArr) {
        Context applicationContext = context.getApplicationContext();
        this.zzg = applicationContext;
        this.zzh = "gtm_urls.db";
        this.zzl = zzieVar;
        this.zzj = DefaultClock.getInstance();
        this.zze = new zzho(this, applicationContext, "gtm_urls.db");
        this.zzf = new zzin(applicationContext, new zzhn(this));
        this.zzi = 0L;
        this.zzk = 2000;
    }

    static /* bridge */ /* synthetic */ void zzl(zzhp zzhpVar, long j11, long j12) {
        SQLiteDatabase zzn = zzhpVar.zzn("Error opening database for getNumStoredHits.");
        if (zzn == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_first_send_time", Long.valueOf(j12));
        try {
            zzn.update("gtm_hits", contentValues, "hit_id=?", new String[]{String.valueOf(j11)});
        } catch (SQLiteException e11) {
            String message = e11.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 70);
            C2942q.f(sb2, "Error setting HIT_FIRST_DISPATCH_TIME for hitId ", j11, ": ");
            sb2.append(message);
            zzhl.zze(sb2.toString());
            zzhpVar.zzo(j11);
        }
    }

    private final SQLiteDatabase zzn(String str) {
        try {
            return this.zze.getWritableDatabase();
        } catch (SQLiteException e11) {
            Context context = this.zzg;
            zzhl.zzf(str, e11);
            if (CrashUtils.addDynamiteErrorToDropBox(context, e11)) {
                zzhl.zzd("Crash reported successfully.");
                return null;
            }
            zzhl.zzd("Failed to report crash");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(long j11) {
        zzm(new String[]{String.valueOf(j11)});
    }

    private final void zzp(long j11, String str, String str2, String str3, Map<String, String> map, String str4) {
        SQLiteDatabase zzn = zzn("Error opening database for putHit");
        if (zzn == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("hit_time", Long.valueOf(j11));
        contentValues.put("hit_url", str);
        contentValues.put("hit_first_send_time", (Integer) 0);
        if (str2 == null) {
            str2 = "GET";
        }
        contentValues.put("hit_method", str2);
        contentValues.put("hit_unique_id", str3);
        contentValues.put("hit_headers", map == null ? null : new JSONObject(map).toString());
        contentValues.put("hit_body", str4);
        try {
            zzn.insertOrThrow("gtm_hits", null, contentValues);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 19);
            sb2.append("Hit stored (url = ");
            sb2.append(str);
            sb2.append(")");
            zzhl.zzd(sb2.toString());
            this.zzl.zza(false);
        } catch (SQLiteConstraintException unused) {
            String valueOf = String.valueOf(str);
            zzhl.zzd(valueOf.length() != 0 ? "Hit has already been sent: ".concat(valueOf) : new String("Hit has already been sent: "));
        } catch (SQLiteException e11) {
            String valueOf2 = String.valueOf(e11.getMessage());
            zzhl.zze(valueOf2.length() != 0 ? "Error storing hit: ".concat(valueOf2) : new String("Error storing hit: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01a1 A[Catch: all -> 0x011b, TryCatch #19 {all -> 0x011b, blocks: (B:72:0x00b3, B:75:0x00ba, B:77:0x00c7, B:80:0x00f0, B:82:0x00f6, B:83:0x0105, B:85:0x010b, B:88:0x0124, B:89:0x0169, B:90:0x016b, B:97:0x012e, B:98:0x014e, B:102:0x0191, B:104:0x01a1, B:105:0x01ab, B:106:0x01b8, B:108:0x01be, B:113:0x01d2, B:122:0x01a6), top: B:71:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01be A[Catch: all -> 0x011b, TryCatch #19 {all -> 0x011b, blocks: (B:72:0x00b3, B:75:0x00ba, B:77:0x00c7, B:80:0x00f0, B:82:0x00f6, B:83:0x0105, B:85:0x010b, B:88:0x0124, B:89:0x0169, B:90:0x016b, B:97:0x012e, B:98:0x014e, B:102:0x0191, B:104:0x01a1, B:105:0x01ab, B:106:0x01b8, B:108:0x01be, B:113:0x01d2, B:122:0x01a6), top: B:71:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a6 A[Catch: all -> 0x011b, TryCatch #19 {all -> 0x011b, blocks: (B:72:0x00b3, B:75:0x00ba, B:77:0x00c7, B:80:0x00f0, B:82:0x00f6, B:83:0x0105, B:85:0x010b, B:88:0x0124, B:89:0x0169, B:90:0x016b, B:97:0x012e, B:98:0x014e, B:102:0x0191, B:104:0x01a1, B:105:0x01ab, B:106:0x01b8, B:108:0x01be, B:113:0x01d2, B:122:0x01a6), top: B:71:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020c A[Catch: all -> 0x0211, TryCatch #11 {all -> 0x0211, blocks: (B:146:0x01fc, B:148:0x020c, B:149:0x0219, B:153:0x0214), top: B:145:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0214 A[Catch: all -> 0x0211, TryCatch #11 {all -> 0x0211, blocks: (B:146:0x01fc, B:148:0x020c, B:149:0x0219, B:153:0x0214), top: B:145:0x01fc }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0227  */
    @Override // com.google.android.gms.internal.gtm.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza() {
        Cursor cursor;
        boolean z11;
        Cursor cursor2;
        Cursor cursor3;
        Cursor cursor4;
        Cursor cursor5;
        Iterator it;
        HashMap hashMap;
        Cursor cursor6;
        int i11;
        zzhl.zzd("GTM Dispatch running...");
        if (this.zzf.zzb()) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase zzn = zzn("Error opening database for peekHits");
            if (zzn == null) {
                z11 = true;
            } else {
                try {
                    try {
                        try {
                            z11 = true;
                            try {
                                Cursor query = zzn.query("gtm_hits", new String[]{"hit_id", "hit_time", "hit_first_send_time"}, null, null, null, null, "hit_id ASC", Integer.toString(40));
                                try {
                                    try {
                                        ArrayList arrayList2 = new ArrayList();
                                        try {
                                            if (query.moveToFirst()) {
                                                do {
                                                    arrayList2.add(new zzgz(query.getLong(0), query.getLong(1), query.getLong(2)));
                                                } while (query.moveToNext());
                                            }
                                            query.close();
                                            try {
                                                try {
                                                    cursor4 = query;
                                                    arrayList = arrayList2;
                                                    try {
                                                        cursor5 = zzn.query("gtm_hits", new String[]{"hit_id", "hit_url", "hit_method", "hit_headers", "hit_body"}, null, null, null, null, "hit_id ASC", Integer.toString(40));
                                                        try {
                                                            try {
                                                                if (cursor5.moveToFirst()) {
                                                                    int i12 = 0;
                                                                    do {
                                                                        if (((SQLiteCursor) cursor5).getWindow().getNumRows() > 0) {
                                                                            ((zzgz) arrayList.get(i12)).zzj(cursor5.getString(1));
                                                                            ((zzgz) arrayList.get(i12)).zzi(cursor5.getString(2));
                                                                            ((zzgz) arrayList.get(i12)).zzg(cursor5.getString(4));
                                                                            try {
                                                                                String string = cursor5.getString(3);
                                                                                if (string != null) {
                                                                                    JSONObject jSONObject = new JSONObject(string);
                                                                                    JSONArray names = jSONObject.names();
                                                                                    hashMap = new HashMap();
                                                                                    for (int i13 = 0; i13 < names.length(); i13++) {
                                                                                        String string2 = names.getString(i13);
                                                                                        hashMap.put(string2, (String) jSONObject.opt(string2));
                                                                                    }
                                                                                } else {
                                                                                    hashMap = null;
                                                                                }
                                                                                ((zzgz) arrayList.get(i12)).zzh(hashMap);
                                                                            } catch (JSONException e11) {
                                                                                zzhl.zze(String.format("Failed to read headers for hitId %d: %s", Long.valueOf(((zzgz) arrayList.get(i12)).zzb()), e11.getMessage()));
                                                                            }
                                                                        } else {
                                                                            zzhl.zze(String.format("HitString for hitId %d too large. Hit will be deleted.", Long.valueOf(((zzgz) arrayList.get(i12)).zzb())));
                                                                        }
                                                                        i12++;
                                                                    } while (cursor5.moveToNext());
                                                                }
                                                                cursor5.close();
                                                            } catch (SQLiteException e12) {
                                                                e = e12;
                                                                String valueOf = String.valueOf(e.getMessage());
                                                                zzhl.zze(valueOf.length() == 0 ? "Error in peekHits fetching hit url: ".concat(valueOf) : new String("Error in peekHits fetching hit url: "));
                                                                ArrayList arrayList3 = new ArrayList();
                                                                it = arrayList.iterator();
                                                                boolean z12 = false;
                                                                while (it.hasNext()) {
                                                                    zzgz zzgzVar = (zzgz) it.next();
                                                                    if (TextUtils.isEmpty(zzgzVar.zze())) {
                                                                        if (z12) {
                                                                            break;
                                                                        } else {
                                                                            z12 = true;
                                                                        }
                                                                    }
                                                                    arrayList3.add(zzgzVar);
                                                                }
                                                                if (cursor5 != null) {
                                                                    cursor5.close();
                                                                }
                                                                arrayList = arrayList3;
                                                                if (arrayList.isEmpty()) {
                                                                }
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            if (cursor5 != null) {
                                                                cursor5.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        cursor5 = cursor4;
                                                        String valueOf2 = String.valueOf(e.getMessage());
                                                        zzhl.zze(valueOf2.length() == 0 ? "Error in peekHits fetching hit url: ".concat(valueOf2) : new String("Error in peekHits fetching hit url: "));
                                                        ArrayList arrayList32 = new ArrayList();
                                                        it = arrayList.iterator();
                                                        boolean z122 = false;
                                                        while (it.hasNext()) {
                                                        }
                                                        if (cursor5 != null) {
                                                        }
                                                        arrayList = arrayList32;
                                                        if (arrayList.isEmpty()) {
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        cursor5 = cursor4;
                                                        if (cursor5 != null) {
                                                        }
                                                        throw th;
                                                    }
                                                } catch (SQLiteException e14) {
                                                    e = e14;
                                                    arrayList = arrayList2;
                                                    cursor4 = query;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    cursor4 = query;
                                                }
                                            } catch (SQLiteException e15) {
                                                e = e15;
                                                cursor4 = query;
                                                arrayList = arrayList2;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor4 = query;
                                            }
                                        } catch (SQLiteException e16) {
                                            e = e16;
                                            cursor3 = query;
                                            arrayList = arrayList2;
                                            cursor2 = cursor3;
                                            try {
                                                String valueOf3 = String.valueOf(e.getMessage());
                                                zzhl.zze(valueOf3.length() == 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf3) : new String("Error in peekHits fetching hitIds: "));
                                                if (cursor2 != null) {
                                                    cursor2.close();
                                                }
                                                if (arrayList.isEmpty()) {
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                cursor = cursor2;
                                                if (cursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor = query;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    cursor3 = query;
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                cursor2 = null;
                                String valueOf32 = String.valueOf(e.getMessage());
                                zzhl.zze(valueOf32.length() == 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf32) : new String("Error in peekHits fetching hitIds: "));
                                if (cursor2 != null) {
                                }
                                if (arrayList.isEmpty()) {
                                }
                            }
                        } catch (SQLiteException e19) {
                            e = e19;
                            z11 = true;
                        }
                    } catch (SQLiteException e21) {
                        e = e21;
                        z11 = true;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    cursor = null;
                }
            }
            if (arrayList.isEmpty()) {
                zzhl.zzd("...nothing to dispatch");
                this.zzl.zza(z11);
                return;
            }
            this.zzf.zza(arrayList);
            SQLiteDatabase zzn2 = zzn("Error opening database for getNumStoredHits.");
            if (zzn2 == null) {
                return;
            }
            try {
                cursor6 = zzn2.query("gtm_hits", new String[]{"hit_id", "hit_first_send_time"}, "hit_first_send_time=0", null, null, null, null);
                try {
                    try {
                        i11 = cursor6.getCount();
                        cursor6.close();
                    } catch (SQLiteException e22) {
                        e = e22;
                        String valueOf4 = String.valueOf(e.getMessage());
                        zzhl.zze(valueOf4.length() != 0 ? "Error getting num untried hits: ".concat(valueOf4) : new String("Error getting num untried hits: "));
                        if (cursor6 != null) {
                            cursor6.close();
                            return;
                        } else {
                            i11 = 0;
                            if (i11 <= 0) {
                            }
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    if (cursor6 != null) {
                        cursor6.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e23) {
                e = e23;
                cursor6 = null;
            } catch (Throwable th10) {
                th = th10;
                cursor6 = null;
                if (cursor6 != null) {
                }
                throw th;
            }
            if (i11 <= 0) {
                zzik.zzf().zzi();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r2 == null) goto L35;
     */
    @Override // com.google.android.gms.internal.gtm.zzhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(long j11, String str, String str2, String str3, Map<String, String> map, String str4) {
        long currentTimeMillis = this.zzj.currentTimeMillis();
        if (currentTimeMillis > this.zzi + 86400000) {
            this.zzi = currentTimeMillis;
            SQLiteDatabase zzn = zzn("Error opening database for deleteStaleHits.");
            if (zzn != null) {
                int delete = zzn.delete("gtm_hits", "HIT_TIME < ?", new String[]{Long.toString(this.zzj.currentTimeMillis() - 2592000000L)});
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Removed ");
                sb2.append(delete);
                sb2.append(" stale hits.");
                zzhl.zzd(sb2.toString());
                this.zzl.zza(zzc("gtm_hits") == 0);
            }
        }
        int zzc2 = (zzc("gtm_hits") - this.zzk) + 1;
        if (zzc2 > 0) {
            ArrayList arrayList = new ArrayList();
            SQLiteDatabase zzn2 = zzn("Error opening database for peekHitIds.");
            if (zzn2 != null) {
                Cursor cursor = null;
                try {
                    try {
                        cursor = zzn2.query("gtm_hits", new String[]{"hit_id"}, null, null, null, null, "hit_id ASC", Integer.toString(zzc2));
                        if (cursor.moveToFirst()) {
                            do {
                                arrayList.add(String.valueOf(cursor.getLong(0)));
                            } while (cursor.moveToNext());
                        }
                    } catch (SQLiteException e11) {
                        String valueOf = String.valueOf(e11.getMessage());
                        zzhl.zze(valueOf.length() != 0 ? "Error in peekHits fetching hitIds: ".concat(valueOf) : new String("Error in peekHits fetching hitIds: "));
                    }
                    cursor.close();
                } catch (Throwable th2) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th2;
                }
            }
            int size = arrayList.size();
            StringBuilder sb3 = new StringBuilder(51);
            sb3.append("Store full, deleting ");
            sb3.append(size);
            sb3.append(" hits to make room.");
            zzhl.zzd(sb3.toString());
            zzm((String[]) arrayList.toArray(new String[0]));
        }
        zzp(j11, str, str2, str3, map, str4);
        if (zzhs.zza().zzd()) {
            zzhl.zzd("Sending hits immediately under preview.");
            zza();
        }
    }

    final int zzc(String str) {
        SQLiteDatabase zzn = zzn("Error opening database for getNumRecords.");
        if (zzn == null) {
            return 0;
        }
        Cursor cursor = null;
        try {
            try {
                cursor = zzn.rawQuery("SELECT COUNT(*) from gtm_hits", null);
                int i11 = cursor.moveToFirst() ? (int) cursor.getLong(0) : 0;
                cursor.close();
                return i11;
            } catch (SQLiteException e11) {
                String valueOf = String.valueOf(e11.getMessage());
                zzhl.zze(valueOf.length() != 0 ? "Error getting numStoredRecords: ".concat(valueOf) : new String("Error getting numStoredRecords: "));
                if (cursor == null) {
                    return 0;
                }
                cursor.close();
                return 0;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    final void zzm(String[] strArr) {
        int length;
        SQLiteDatabase zzn;
        if (strArr == null || (length = strArr.length) == 0 || (zzn = zzn("Error opening database for deleteHits.")) == null) {
            return;
        }
        try {
            zzn.delete("gtm_hits", A0.b("HIT_ID in (", TextUtils.join(",", Collections.nCopies(length, "?")), ")"), strArr);
            this.zzl.zza(zzc("gtm_hits") == 0);
        } catch (SQLiteException e11) {
            String valueOf = String.valueOf(e11.getMessage());
            zzhl.zze(valueOf.length() != 0 ? "Error deleting hits: ".concat(valueOf) : new String("Error deleting hits: "));
        }
    }
}
