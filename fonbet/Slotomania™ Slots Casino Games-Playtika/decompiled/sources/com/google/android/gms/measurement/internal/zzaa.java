package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzov;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes8.dex */
final class zzaa extends zzkt {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzlg zzlgVar) {
        super(zzlgVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(2:2|(2:4|(2:6|7)(1:553))(2:554|555))|8|(3:10|11|12)|16|(1:552)(7:19|20|21|22|23|24|(21:(8:26|27|28|29|30|(1:32)(3:520|(2:522|523)(1:525)|524)|33|(1:36)(1:35))|(1:38)|39|40|41|42|43|44|(3:46|(1:48)|49)(4:478|(6:479|480|481|482|483|(1:486)(1:485))|(1:488)|489)|50|(5:309|(9:311|312|313|314|315|316|317|318|(1:(4:320|(1:322)|323|(1:326)(1:325)))(1:462))(1:477)|372|(10:375|(3:379|(4:382|(5:384|385|(1:387)(1:391)|388|389)(1:392)|390|380)|393)|394|(3:398|(4:401|(3:406|407|408)|409|399)|412)|413|(3:415|(6:418|(2:420|(3:422|423|424))(1:427)|425|426|424|416)|428)|429|(3:438|(8:441|(1:443)|444|(1:446)|447|(3:449|450|451)(1:453)|452|439)|454)|455|373)|461)|52|53|(3:190|(4:193|(10:195|196|(1:198)(1:306)|199|(15:201|202|203|204|205|206|207|208|209|210|211|212|213|(4:215|(10:216|217|218|219|220|221|(3:223|224|225)(1:277)|226|227|(1:230)(1:229))|(1:232)|233)(3:284|285|(1:287))|234)(1:305)|235|(4:238|(3:256|257|258)(6:240|241|(2:242|(2:244|(1:246)(2:247|248))(2:254|255))|(1:250)|251|252)|253|236)|259|260|261)(1:307)|262|191)|308)|55|56|(3:58|(6:61|(7:63|64|65|66|67|(3:(9:69|70|71|72|73|(1:75)(1:142)|76|77|(1:80)(1:79))|(1:82)|83)(3:149|150|(1:152))|84)(1:163)|85|(2:86|(2:88|(3:124|125|126)(6:90|(2:91|(4:93|(3:95|(1:97)(1:120)|98)(1:121)|99|(1:1)(2:103|(1:105)(2:106|107)))(2:122|123))|(2:112|111)|109|110|111))(0))|127|59)|164)|165|(10:168|169|170|171|172|173|175|(3:177|178|179)(1:181)|180|166)|188|189)(2:537|538))|534|40|41|42|43|44|(0)(0)|50|(0)|52|53|(0)|55|56|(0)|165|(1:166)|188|189|(3:(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0a55, code lost:
    
        r0 = r46.zzt.zzaA().zzk();
        r8 = com.google.android.gms.measurement.internal.zzeu.zzn(r46.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0a69, code lost:
    
        if (r10.zzj() == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0a6b, code lost:
    
        r10 = java.lang.Integer.valueOf(r10.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0a75, code lost:
    
        r0.zzc("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0a74, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x02f0, code lost:
    
        if (r2 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x02f2, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0325, code lost:
    
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r11);
        r2 = new androidx.collection.ArrayMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0334, code lost:
    
        if (r11.isEmpty() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0338, code lost:
    
        r3 = r11.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0344, code lost:
    
        if (r3.hasNext() == false) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0346, code lost:
    
        r4 = ((java.lang.Integer) r3.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzgi) r11.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0360, code lost:
    
        if (r7 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0366, code lost:
    
        if (r7.isEmpty() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x036a, code lost:
    
        r5 = r46.zzf.zzu().zzq(r6.zzi(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x037c, code lost:
    
        if (r5.isEmpty() != false) goto L547;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x037e, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.zzgh) r6.zzbB();
        r8.zzf();
        r8.zzb(r5);
        r19 = r0;
        r0 = r46.zzf.zzu().zzq(r6.zzk(), r7);
        r8.zzh();
        r8.zzd(r0);
        r0 = new java.util.ArrayList();
        r5 = r6.zzh().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x03b1, code lost:
    
        if (r5.hasNext() == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x03b3, code lost:
    
        r22 = r3;
        r3 = (com.google.android.gms.internal.measurement.zzfr) r5.next();
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x03cb, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r3.zza())) != false) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x03cd, code lost:
    
        r0.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x03d0, code lost:
    
        r3 = r22;
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03d5, code lost:
    
        r22 = r3;
        r23 = r4;
        r8.zze();
        r8.zza(r0);
        r0 = new java.util.ArrayList();
        r3 = r6.zzj().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x03f0, code lost:
    
        if (r3.hasNext() == false) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03f2, code lost:
    
        r4 = (com.google.android.gms.internal.measurement.zzgk) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0404, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r4.zzb())) != false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0406, code lost:
    
        r0.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x040a, code lost:
    
        r8.zzg();
        r8.zzc(r0);
        r2.put(java.lang.Integer.valueOf(r23), (com.google.android.gms.internal.measurement.zzgi) r8.zzaD());
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0425, code lost:
    
        r0 = r19;
        r3 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x041e, code lost:
    
        r19 = r0;
        r22 = r3;
        r2.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x042b, code lost:
    
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x02fc, code lost:
    
        if (r2 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0322, code lost:
    
        if (r2 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x024f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0250, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0259, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x025a, code lost:
    
        r19 = r2;
        r20 = "audience_id";
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0255, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0256, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0198, code lost:
    
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x016c, code lost:
    
        r5.close();
        r7 = r7;
        r50 = r50;
        r51 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x016a, code lost:
    
        if (r5 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0aae  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01df A[Catch: SQLiteException -> 0x024f, all -> 0x0b3a, TRY_LEAVE, TryCatch #17 {all -> 0x0b3a, blocks: (B:44:0x01d9, B:46:0x01df, B:478:0x01ef, B:479:0x01f6, B:481:0x01ff, B:482:0x020f, B:483:0x0237, B:498:0x021c, B:501:0x022a, B:504:0x0230, B:492:0x025f), top: B:41:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x01ef A[Catch: SQLiteException -> 0x024f, all -> 0x0b3a, TRY_ENTER, TryCatch #17 {all -> 0x0b3a, blocks: (B:44:0x01d9, B:46:0x01df, B:478:0x01ef, B:479:0x01f6, B:481:0x01ff, B:482:0x020f, B:483:0x0237, B:498:0x021c, B:501:0x022a, B:504:0x0230, B:492:0x025f), top: B:41:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0b3e  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0978  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35, types: [int] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46, types: [int] */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r17v16, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r50v11 */
    /* JADX WARN: Type inference failed for: r50v12 */
    /* JADX WARN: Type inference failed for: r50v3 */
    /* JADX WARN: Type inference failed for: r51v18 */
    /* JADX WARN: Type inference failed for: r51v19 */
    /* JADX WARN: Type inference failed for: r51v3 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v72, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v75, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v76, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v49, types: [com.google.android.gms.measurement.internal.zzes] */
    /* JADX WARN: Type inference failed for: r7v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v47, types: [java.lang.String] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l, Long l2) {
        ?? r10;
        ?? r11;
        boolean z;
        Cursor cursor;
        Long l3;
        Long l4;
        Cursor cursor2;
        Map map;
        ?? r51;
        int i;
        Cursor cursor3;
        boolean z2;
        String str2;
        Cursor cursor4;
        Map map2;
        HashSet hashSet;
        Map map3;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        boolean z3;
        ?? r5;
        Cursor cursor5;
        zzas zzasVar;
        zzw zzwVar;
        Iterator it;
        zzas zzasVar2;
        String str3;
        Iterator it2;
        Map map4;
        long j;
        Cursor cursor6;
        Cursor cursor7;
        List list4;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Map map5;
        Cursor cursor8;
        List list5;
        ?? r52;
        Long l5;
        Long l6;
        Cursor cursor9;
        boolean z4;
        boolean z5;
        List list6;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it6 = list.iterator();
        while (true) {
            r10 = 0;
            r11 = 1;
            if (!it6.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it6.next()).zzh())) {
                z = true;
                break;
            }
        }
        zzov.zzc();
        boolean zzs = this.zzt.zzf().zzs(this.zza, zzeh.zzY);
        zzov.zzc();
        boolean zzs2 = this.zzt.zzf().zzs(this.zza, zzeh.zzX);
        if (z) {
            zzam zzi = this.zzf.zzi();
            String str4 = this.zza;
            zzi.zzW();
            zzi.zzg();
            Preconditions.checkNotEmpty(str4);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                ?? zzh = zzi.zzh();
                zzh.update("events", contentValues, "app_id = ?", new String[]{str4});
                cursor = zzh;
            } catch (SQLiteException e) {
                zzi.zzt.zzaA().zzd().zzc("Error resetting session-scoped event counts. appId", zzeu.zzn(str4), e);
                cursor = "Error resetting session-scoped event counts. appId";
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str5 = "audience_id";
        try {
            if (zzs2 && zzs) {
                zzam zzi2 = this.zzf.zzi();
                ?? r7 = this.zza;
                Preconditions.checkNotEmpty(r7);
                ArrayMap arrayMap = new ArrayMap();
                try {
                    try {
                        r52 = zzi2.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{r7}, null, null, null);
                        try {
                            try {
                            } catch (SQLiteException e2) {
                                e = e2;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            l2 = r10;
                            l = r11;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    l2 = null;
                    l = 1;
                    r52 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (r52.moveToFirst()) {
                    while (true) {
                        l = r11;
                        try {
                            try {
                                com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzli.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), r52.getBlob(r11))).zzaD();
                                if (zzekVar.zzo()) {
                                    Integer valueOf = Integer.valueOf(r52.getInt(r10));
                                    List list7 = (List) arrayMap.get(valueOf);
                                    if (list7 == null) {
                                        z5 = r10;
                                        list6 = new ArrayList();
                                        arrayMap.put(valueOf, list6);
                                    } else {
                                        z5 = r10;
                                        list6 = list7;
                                    }
                                    list6.add(zzekVar);
                                    z4 = z5;
                                } else {
                                    z4 = r10;
                                }
                            } catch (IOException e5) {
                                z4 = r10;
                                zzi2.zzt.zzaA().zzd().zzc("Failed to merge filter. appId", zzeu.zzn(r7), e5);
                            }
                            if (!r52.moveToNext()) {
                                break;
                            }
                            r11 = l;
                            r10 = z4;
                        } catch (SQLiteException e6) {
                            e = e6;
                            l2 = r10;
                            ?? zzd = zzi2.zzt.zzaA().zzd();
                            ?? zzn = zzeu.zzn(r7);
                            zzd.zzc("Database error querying filters. appId", zzn, e);
                            emptyMap = Collections.emptyMap();
                            cursor2 = zzn;
                            l4 = l;
                            l3 = l2;
                            cursor9 = zzn;
                            l6 = l;
                            l5 = l2;
                        }
                    }
                    if (r52 != null) {
                        r52.close();
                    }
                    map = arrayMap;
                    cursor3 = r7;
                    i = l;
                    r51 = z4;
                    zzam zzi3 = this.zzf.zzi();
                    String str6 = this.zza;
                    zzi3.zzW();
                    zzi3.zzg();
                    Preconditions.checkNotEmpty(str6);
                    SQLiteDatabase zzh2 = zzi3.zzh();
                    String[] strArr = new String[2];
                    strArr[r51] = "audience_id";
                    strArr[i] = "current_results";
                    String[] strArr2 = new String[i];
                    strArr2[r51] = str6;
                    cursor4 = zzh2.query("audience_filter_values", strArr, "app_id=?", strArr2, null, null, null);
                    if (cursor4.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        map2 = emptyMap2;
                        z2 = z;
                        str2 = "audience_id";
                    } else {
                        ArrayMap arrayMap2 = new ArrayMap();
                        int i2 = r51;
                        while (true) {
                            int i3 = cursor4.getInt(i2);
                            try {
                                arrayMap2.put(Integer.valueOf(i3), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzli.zzl(com.google.android.gms.internal.measurement.zzgi.zze(), cursor4.getBlob(1))).zzaD());
                                z2 = z;
                                str2 = str5;
                            } catch (IOException e7) {
                                z2 = z;
                                try {
                                    str2 = str5;
                                    try {
                                        zzi3.zzt.zzaA().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeu.zzn(str6), Integer.valueOf(i3), e7);
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        zzi3.zzt.zzaA().zzd().zzc("Database error querying filter results. appId", zzeu.zzn(str6), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        map2 = emptyMap3;
                                        if (!map2.isEmpty()) {
                                        }
                                        String str7 = str2;
                                        zzv zzvVar = null;
                                        if (!list.isEmpty()) {
                                        }
                                        String str8 = str7;
                                        if (!list2.isEmpty()) {
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        Set keySet = this.zzc.keySet();
                                        keySet.removeAll(this.zzb);
                                        it3 = keySet.iterator();
                                        while (it3.hasNext()) {
                                        }
                                        return arrayList;
                                    }
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    str2 = str5;
                                    zzi3.zzt.zzaA().zzd().zzc("Database error querying filter results. appId", zzeu.zzn(str6), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor4 != null) {
                                    }
                                    map2 = emptyMap32;
                                    if (!map2.isEmpty()) {
                                    }
                                    String str72 = str2;
                                    zzv zzvVar2 = null;
                                    if (!list.isEmpty()) {
                                    }
                                    String str82 = str72;
                                    if (!list2.isEmpty()) {
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Set keySet2 = this.zzc.keySet();
                                    keySet2.removeAll(this.zzb);
                                    it3 = keySet2.iterator();
                                    while (it3.hasNext()) {
                                    }
                                    return arrayList2;
                                }
                            }
                            if (!cursor4.moveToNext()) {
                                break;
                            }
                            z = z2;
                            str5 = str2;
                            i2 = 0;
                        }
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        map2 = arrayMap2;
                    }
                    if (!map2.isEmpty()) {
                        HashSet hashSet2 = new HashSet(map2.keySet());
                        if (z2) {
                            String str9 = this.zza;
                            zzam zzi4 = this.zzf.zzi();
                            String str10 = this.zza;
                            zzi4.zzW();
                            zzi4.zzg();
                            Preconditions.checkNotEmpty(str10);
                            Map arrayMap3 = new ArrayMap();
                            try {
                                hashSet = hashSet2;
                            } catch (Throwable th3) {
                                th = th3;
                                r5 = hashSet2;
                            }
                            try {
                                int i4 = 0;
                                cursor5 = zzi4.zzh().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str10, str10});
                                try {
                                    if (cursor5.moveToFirst()) {
                                        while (true) {
                                            Integer valueOf2 = Integer.valueOf(cursor5.getInt(i4));
                                            List list8 = (List) arrayMap3.get(valueOf2);
                                            if (list8 == null) {
                                                list8 = new ArrayList();
                                                arrayMap3.put(valueOf2, list8);
                                            }
                                            list8.add(Integer.valueOf(cursor5.getInt(1)));
                                            if (!cursor5.moveToNext()) {
                                                break;
                                            }
                                            i4 = 0;
                                        }
                                    } else {
                                        arrayMap3 = Collections.emptyMap();
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    zzi4.zzt.zzaA().zzd().zzc("Database error querying scoped filters. appId", zzeu.zzn(str10), e);
                                    arrayMap3 = Collections.emptyMap();
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                cursor5 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = 0;
                                if (r5 != 0) {
                                    r5.close();
                                }
                                throw th;
                            }
                        } else {
                            hashSet = hashSet2;
                            map3 = map2;
                        }
                        Iterator it7 = hashSet.iterator();
                        while (it7.hasNext()) {
                            int intValue = ((Integer) it7.next()).intValue();
                            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(Integer.valueOf(intValue));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap4 = new ArrayMap();
                            if (zzgiVar != null && zzgiVar.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                                    if (zzfrVar.zzh()) {
                                        arrayMap4.put(Integer.valueOf(zzfrVar.zza()), zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                                    }
                                }
                            }
                            ArrayMap arrayMap5 = new ArrayMap();
                            if (zzgiVar != null && zzgiVar.zzc() != 0) {
                                for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzj()) {
                                    if (zzgkVar.zzi() && zzgkVar.zza() > 0) {
                                        arrayMap5.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                                        map3 = map3;
                                        zzgiVar = zzgiVar;
                                    }
                                }
                            }
                            Map map6 = map3;
                            com.google.android.gms.internal.measurement.zzgi zzgiVar2 = zzgiVar;
                            if (zzgiVar2 != null) {
                                int i5 = 0;
                                while (i5 < zzgiVar2.zzd() * 64) {
                                    if (zzli.zzv(zzgiVar2.zzk(), i5)) {
                                        z3 = zzs;
                                        this.zzt.zzaA().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i5));
                                        bitSet2.set(i5);
                                        if (zzli.zzv(zzgiVar2.zzi(), i5)) {
                                            bitSet.set(i5);
                                            i5++;
                                            zzs = z3;
                                        }
                                    } else {
                                        z3 = zzs;
                                    }
                                    arrayMap4.remove(Integer.valueOf(i5));
                                    i5++;
                                    zzs = z3;
                                }
                            }
                            boolean z6 = zzs;
                            Integer valueOf3 = Integer.valueOf(intValue);
                            com.google.android.gms.internal.measurement.zzgi zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(valueOf3);
                            if (zzs2 && z6 && (list3 = (List) map.get(valueOf3)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzek zzekVar2 : list3) {
                                    int zzb = zzekVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzekVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf4 = Integer.valueOf(zzb);
                                    if (arrayMap4.containsKey(valueOf4)) {
                                        arrayMap4.put(valueOf4, Long.valueOf(longValue));
                                    }
                                    if (arrayMap5.containsKey(valueOf4)) {
                                        arrayMap5.put(valueOf4, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(Integer.valueOf(intValue), new zzu(this, this.zza, zzgiVar3, bitSet, bitSet2, arrayMap4, arrayMap5, null));
                            zzs = z6;
                            map3 = map6;
                        }
                    }
                    String str722 = str2;
                    zzv zzvVar22 = null;
                    if (!list.isEmpty()) {
                        zzw zzwVar2 = new zzw(this, zzvVar22);
                        ArrayMap arrayMap6 = new ArrayMap();
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) it8.next();
                            com.google.android.gms.internal.measurement.zzft zza = zzwVar2.zza(this.zza, zzftVar);
                            if (zza != null) {
                                zzam zzi5 = this.zzf.zzi();
                                String str11 = this.zza;
                                String zzh3 = zza.zzh();
                                zzas zzn2 = zzi5.zzn(str11, zzftVar.zzh());
                                if (zzn2 == null) {
                                    zzi5.zzt.zzaA().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeu.zzn(str11), zzi5.zzt.zzj().zzd(zzh3));
                                    zzasVar = new zzas(str11, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                } else {
                                    zzasVar = new zzas(zzn2.zza, zzn2.zzb, zzn2.zzc + 1, zzn2.zzd + 1, zzn2.zze + 1, zzn2.zzf, zzn2.zzg, zzn2.zzh, zzn2.zzi, zzn2.zzj, zzn2.zzk);
                                }
                                this.zzf.zzi().zzE(zzasVar);
                                long j2 = zzasVar.zzc;
                                String zzh4 = zza.zzh();
                                Map map7 = (Map) arrayMap6.get(zzh4);
                                if (map7 == null) {
                                    zzam zzi6 = this.zzf.zzi();
                                    String str12 = this.zza;
                                    zzi6.zzW();
                                    zzi6.zzg();
                                    Preconditions.checkNotEmpty(str12);
                                    Preconditions.checkNotEmpty(zzh4);
                                    ArrayMap arrayMap7 = new ArrayMap();
                                    SQLiteDatabase zzh5 = zzi6.zzh();
                                    zzwVar = zzwVar2;
                                    try {
                                        try {
                                            String[] strArr3 = new String[2];
                                            str3 = str722;
                                            try {
                                                strArr3[0] = str3;
                                                it = it8;
                                                try {
                                                    strArr3[1] = "data";
                                                    Cursor query = zzh5.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str12, zzh4}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                zzasVar2 = zzasVar;
                                                                int i6 = 1;
                                                                while (true) {
                                                                    try {
                                                                        try {
                                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzli.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), query.getBlob(i6))).zzaD();
                                                                            Integer valueOf5 = Integer.valueOf(query.getInt(0));
                                                                            List list9 = (List) arrayMap7.get(valueOf5);
                                                                            if (list9 == null) {
                                                                                cursor7 = query;
                                                                                try {
                                                                                    list4 = new ArrayList();
                                                                                    arrayMap7.put(valueOf5, list4);
                                                                                } catch (SQLiteException e12) {
                                                                                    e = e12;
                                                                                    cursor6 = cursor7;
                                                                                    try {
                                                                                        zzi6.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzeu.zzn(str12), e);
                                                                                        map7 = Collections.emptyMap();
                                                                                        if (cursor6 != null) {
                                                                                        }
                                                                                        arrayMap6.put(zzh4, map7);
                                                                                        it2 = map7.keySet().iterator();
                                                                                        while (it2.hasNext()) {
                                                                                        }
                                                                                        it8 = it;
                                                                                        str722 = str3;
                                                                                        zzwVar2 = zzwVar;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        if (cursor6 != null) {
                                                                                            cursor6.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    cursor6 = cursor7;
                                                                                    if (cursor6 != null) {
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            } else {
                                                                                cursor7 = query;
                                                                                list4 = list9;
                                                                            }
                                                                            list4.add(zzekVar3);
                                                                        } catch (IOException e13) {
                                                                            cursor7 = query;
                                                                            zzi6.zzt.zzaA().zzd().zzc("Failed to merge filter. appId", zzeu.zzn(str12), e13);
                                                                        }
                                                                        if (!cursor7.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        query = cursor7;
                                                                        i6 = 1;
                                                                    } catch (SQLiteException e14) {
                                                                        e = e14;
                                                                        cursor7 = query;
                                                                    }
                                                                }
                                                                if (cursor7 != null) {
                                                                    cursor7.close();
                                                                }
                                                                map7 = arrayMap7;
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                                map7 = Collections.emptyMap();
                                                                if (query != null) {
                                                                    query.close();
                                                                }
                                                            }
                                                        } catch (Throwable th7) {
                                                            th = th7;
                                                            cursor7 = query;
                                                        }
                                                    } catch (SQLiteException e15) {
                                                        e = e15;
                                                        cursor7 = query;
                                                        zzasVar2 = zzasVar;
                                                    }
                                                } catch (SQLiteException e16) {
                                                    e = e16;
                                                    zzasVar2 = zzasVar;
                                                    cursor6 = null;
                                                    zzi6.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzeu.zzn(str12), e);
                                                    map7 = Collections.emptyMap();
                                                    if (cursor6 != null) {
                                                        cursor6.close();
                                                    }
                                                    arrayMap6.put(zzh4, map7);
                                                    it2 = map7.keySet().iterator();
                                                    while (it2.hasNext()) {
                                                    }
                                                    it8 = it;
                                                    str722 = str3;
                                                    zzwVar2 = zzwVar;
                                                }
                                            } catch (SQLiteException e17) {
                                                e = e17;
                                                it = it8;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor6 = null;
                                        }
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        it = it8;
                                        zzasVar2 = zzasVar;
                                        str3 = str722;
                                    }
                                    arrayMap6.put(zzh4, map7);
                                } else {
                                    zzwVar = zzwVar2;
                                    it = it8;
                                    zzasVar2 = zzasVar;
                                    str3 = str722;
                                }
                                it2 = map7.keySet().iterator();
                                while (it2.hasNext()) {
                                    int intValue2 = ((Integer) it2.next()).intValue();
                                    Set set = this.zzb;
                                    Integer valueOf6 = Integer.valueOf(intValue2);
                                    if (set.contains(valueOf6)) {
                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", valueOf6);
                                    } else {
                                        Iterator it9 = ((List) map7.get(valueOf6)).iterator();
                                        boolean z7 = true;
                                        while (true) {
                                            if (!it9.hasNext()) {
                                                map4 = map7;
                                                j = j2;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it9.next();
                                            zzx zzxVar = new zzx(this, this.zza, intValue2, zzekVar4);
                                            map4 = map7;
                                            j = j2;
                                            z7 = zzxVar.zzd(this.zzd, this.zze, zza, j, zzasVar2, zzf(intValue2, zzekVar4.zzb()));
                                            if (!z7) {
                                                this.zzb.add(Integer.valueOf(intValue2));
                                                break;
                                            }
                                            zzd(Integer.valueOf(intValue2)).zzc(zzxVar);
                                            j2 = j;
                                            map7 = map4;
                                        }
                                        if (!z7) {
                                            this.zzb.add(Integer.valueOf(intValue2));
                                        }
                                        j2 = j;
                                        map7 = map4;
                                    }
                                }
                                it8 = it;
                                str722 = str3;
                                zzwVar2 = zzwVar;
                            }
                        }
                    }
                    String str822 = str722;
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap8 = new ArrayMap();
                        Iterator it10 = list2.iterator();
                        while (it10.hasNext()) {
                            com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it10.next();
                            String zzf = zzgmVar.zzf();
                            Map map8 = (Map) arrayMap8.get(zzf);
                            if (map8 == null) {
                                zzam zzi7 = this.zzf.zzi();
                                String str13 = this.zza;
                                zzi7.zzW();
                                zzi7.zzg();
                                Preconditions.checkNotEmpty(str13);
                                Preconditions.checkNotEmpty(zzf);
                                ArrayMap arrayMap9 = new ArrayMap();
                                try {
                                    int i7 = 1;
                                    Cursor query2 = zzi7.zzh().query("property_filters", new String[]{str822, "data"}, "app_id=? AND property_name=?", new String[]{str13, zzf}, null, null, null);
                                    try {
                                        try {
                                            if (query2.moveToFirst()) {
                                                while (true) {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzet zzetVar = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzli.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), query2.getBlob(i7))).zzaD();
                                                        Integer valueOf7 = Integer.valueOf(query2.getInt(0));
                                                        List list10 = (List) arrayMap9.get(valueOf7);
                                                        if (list10 == null) {
                                                            list5 = new ArrayList();
                                                            arrayMap9.put(valueOf7, list5);
                                                        } else {
                                                            list5 = list10;
                                                        }
                                                        list5.add(zzetVar);
                                                        it4 = it10;
                                                    } catch (IOException e19) {
                                                        it4 = it10;
                                                        try {
                                                            zzi7.zzt.zzaA().zzd().zzc("Failed to merge filter", zzeu.zzn(str13), e19);
                                                        } catch (SQLiteException e20) {
                                                            e = e20;
                                                            cursor8 = query2;
                                                            try {
                                                                zzi7.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzeu.zzn(str13), e);
                                                                map8 = Collections.emptyMap();
                                                                if (cursor8 != null) {
                                                                    cursor8.close();
                                                                }
                                                                arrayMap8.put(zzf, map8);
                                                                it5 = map8.keySet().iterator();
                                                                while (true) {
                                                                    if (!it5.hasNext()) {
                                                                        break;
                                                                    }
                                                                    map8 = map5;
                                                                }
                                                                it10 = it4;
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                if (cursor8 != null) {
                                                                    cursor8.close();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    }
                                                    if (!query2.moveToNext()) {
                                                        break;
                                                    }
                                                    it10 = it4;
                                                    i7 = 1;
                                                }
                                                if (query2 != null) {
                                                    query2.close();
                                                }
                                                map8 = arrayMap9;
                                            } else {
                                                it4 = it10;
                                                map8 = Collections.emptyMap();
                                                if (query2 != null) {
                                                    query2.close();
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            th = th10;
                                            cursor8 = query2;
                                            if (cursor8 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        it4 = it10;
                                    }
                                } catch (SQLiteException e22) {
                                    e = e22;
                                    it4 = it10;
                                    cursor8 = null;
                                } catch (Throwable th11) {
                                    th = th11;
                                    cursor8 = null;
                                }
                                arrayMap8.put(zzf, map8);
                            } else {
                                it4 = it10;
                            }
                            it5 = map8.keySet().iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    int intValue3 = ((Integer) it5.next()).intValue();
                                    Set set2 = this.zzb;
                                    Integer valueOf8 = Integer.valueOf(intValue3);
                                    if (set2.contains(valueOf8)) {
                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", valueOf8);
                                        break;
                                    }
                                    Iterator it11 = ((List) map8.get(valueOf8)).iterator();
                                    boolean z8 = true;
                                    while (true) {
                                        if (!it11.hasNext()) {
                                            map5 = map8;
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) it11.next();
                                        if (Log.isLoggable(this.zzt.zzaA().zzr(), 2)) {
                                            map5 = map8;
                                            this.zzt.zzaA().zzj().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), zzetVar2.zzj() ? Integer.valueOf(zzetVar2.zza()) : null, this.zzt.zzj().zzf(zzetVar2.zze()));
                                            this.zzt.zzaA().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar2));
                                        } else {
                                            map5 = map8;
                                        }
                                        if (!zzetVar2.zzj() || zzetVar2.zza() > 256) {
                                            break;
                                        }
                                        zzz zzzVar = new zzz(this, this.zza, intValue3, zzetVar2);
                                        z8 = zzzVar.zzd(this.zzd, this.zze, zzgmVar, zzf(intValue3, zzetVar2.zza()));
                                        if (!z8) {
                                            this.zzb.add(Integer.valueOf(intValue3));
                                            break;
                                        }
                                        zzd(Integer.valueOf(intValue3)).zzc(zzzVar);
                                        map8 = map5;
                                    }
                                    if (z8) {
                                        map8 = map5;
                                    }
                                    this.zzb.add(Integer.valueOf(intValue3));
                                    map8 = map5;
                                }
                            }
                            it10 = it4;
                        }
                    }
                    ArrayList arrayList22 = new ArrayList();
                    Set keySet22 = this.zzc.keySet();
                    keySet22.removeAll(this.zzb);
                    it3 = keySet22.iterator();
                    while (it3.hasNext()) {
                        int intValue4 = ((Integer) it3.next()).intValue();
                        Map map9 = this.zzc;
                        Integer valueOf9 = Integer.valueOf(intValue4);
                        zzu zzuVar = (zzu) map9.get(valueOf9);
                        Preconditions.checkNotNull(zzuVar);
                        com.google.android.gms.internal.measurement.zzfp zza2 = zzuVar.zza(intValue4);
                        arrayList22.add(zza2);
                        zzam zzi8 = this.zzf.zzi();
                        String str14 = this.zza;
                        com.google.android.gms.internal.measurement.zzgi zzd2 = zza2.zzd();
                        zzi8.zzW();
                        zzi8.zzg();
                        Preconditions.checkNotEmpty(str14);
                        Preconditions.checkNotNull(zzd2);
                        byte[] zzbx = zzd2.zzbx();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str14);
                        contentValues2.put(str822, valueOf9);
                        contentValues2.put("current_results", zzbx);
                        try {
                            try {
                                if (zzi8.zzh().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    zzi8.zzt.zzaA().zzd().zzb("Failed to insert filter results (got -1). appId", zzeu.zzn(str14));
                                }
                            } catch (SQLiteException e23) {
                                e = e23;
                                zzi8.zzt.zzaA().zzd().zzc("Error storing filter results. appId", zzeu.zzn(str14), e);
                            }
                        } catch (SQLiteException e24) {
                            e = e24;
                        }
                    }
                    return arrayList22;
                }
                emptyMap = Collections.emptyMap();
                cursor2 = r7;
                l4 = 1;
                l3 = null;
                cursor9 = r7;
                l6 = 1;
                l5 = null;
            } else {
                l3 = null;
                l4 = 1;
                cursor2 = "app_id = ?";
            }
            String[] strArr4 = new String[2];
            strArr4[r51] = "audience_id";
            strArr4[i] = "current_results";
            String[] strArr22 = new String[i];
            strArr22[r51] = str6;
            cursor4 = zzh2.query("audience_filter_values", strArr4, "app_id=?", strArr22, null, null, null);
            if (cursor4.moveToFirst()) {
            }
            if (!map2.isEmpty()) {
            }
            String str7222 = str2;
            zzv zzvVar222 = null;
            if (!list.isEmpty()) {
            }
            String str8222 = str7222;
            if (!list2.isEmpty()) {
            }
            ArrayList arrayList222 = new ArrayList();
            Set keySet222 = this.zzc.keySet();
            keySet222.removeAll(this.zzb);
            it3 = keySet222.iterator();
            while (it3.hasNext()) {
            }
            return arrayList222;
        } catch (Throwable th12) {
            th = th12;
            Cursor cursor10 = cursor3;
            if (cursor10 != null) {
                cursor10.close();
            }
            throw th;
        }
        map = emptyMap;
        cursor3 = cursor2;
        i = l4;
        r51 = l3;
        zzam zzi32 = this.zzf.zzi();
        String str62 = this.zza;
        zzi32.zzW();
        zzi32.zzg();
        Preconditions.checkNotEmpty(str62);
        SQLiteDatabase zzh22 = zzi32.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    protected final boolean zzb() {
        return false;
    }
}
