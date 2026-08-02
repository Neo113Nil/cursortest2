package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.C5132a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoi;
import com.google.android.gms.internal.measurement.zzol;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
final class zzaa extends zzkz {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzll zzllVar) {
        super(zzllVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i11, int i12) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i11));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i12);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(2:2|(2:4|(2:6|7)(1:543))(2:544|545))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(20:(7:25|26|27|28|(1:30)(3:518|(1:520)(1:522)|521)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:474|(6:475|476|477|478|479|(1:482)(1:481))|483)|44|(5:280|(11:282|283|284|285|286|(1:(4:288|(1:290)|291|292))(1:457)|295|296|(3:390|(6:393|(2:452|453)(2:397|(4:403|404|(7:406|(4:409|(2:411|412)(1:414)|413|407)|415|416|(4:419|(3:421|422|423)(1:425)|424|417)|426|427)(6:431|(4:434|(2:436|437)(1:439)|438|432)|440|441|(4:444|(2:446|447)(1:449)|448|442)|450)|428)(4:399|400|401|402))|429|430|402|391)|455)|298|299)(1:473)|300|(11:303|(3:307|(4:310|(5:312|313|(1:315)(1:319)|316|317)(1:320)|318|308)|321)|322|323|(3:327|(4:330|(3:335|336|337)|338|328)|341)|342|(3:344|(6:347|(2:349|(3:351|352|353))(1:356)|354|355|353|345)|357)|358|(3:367|(8:370|(1:372)|373|(1:375)|376|(2:378|379)(1:381)|380|368)|382)|383|301)|389)|46|47|(3:183|(4:186|(10:188|189|(1:191)(1:277)|192|(9:194|195|196|197|198|199|201|202|(4:204|(10:205|206|207|208|209|210|211|(1:213)|214|215)|218|219)(4:257|258|256|219))(1:276)|220|(4:223|(3:241|242|243)(6:225|226|(2:227|(2:229|(1:231)(2:232|233))(2:239|240))|(1:235)|236|237)|238|221)|244|245|246)(1:278)|247|184)|279)|49|50|(3:52|(6:55|(6:57|58|59|60|61|(3:(9:63|64|65|66|67|(3:69|70|71)(1:131)|72|73|(1:76)(1:75))|77|78)(4:138|139|127|78))(1:156)|79|(2:80|(2:82|(3:118|119|120)(8:84|(2:85|(4:87|(3:89|(1:91)(1:114)|92)(1:115)|93|(1:1)(2:97|(1:99)(2:100|101)))(2:116|117))|108|(1:110)(1:112)|111|103|104|105))(0))|121|53)|157)|158|(10:161|162|163|164|165|166|168|(3:170|171|172)(1:174)|173|159)|181|182)|527)|542|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|50|(0)|158|(1:159)|181|182|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0a30, code lost:
    
        if (r11 != false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0914, code lost:
    
        if (r13 != null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0771, code lost:
    
        if (r6 != null) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x02e7, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x01b5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x01b6, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x01b8, code lost:
    
        r18 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0226, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0227, code lost:
    
        r17 = r2;
        r18 = "data";
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0231, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x022e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x016a, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4 A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_LEAVE, TryCatch #13 {all -> 0x01b2, blocks: (B:40:0x019e, B:42:0x01a4, B:474:0x01be, B:475:0x01c3, B:477:0x01cd, B:478:0x01dd, B:479:0x0209, B:492:0x01ec, B:497:0x01fc, B:500:0x0202, B:486:0x0232), top: B:39:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x01be A[Catch: all -> 0x01b2, SQLiteException -> 0x01b5, TRY_ENTER, TryCatch #13 {all -> 0x01b2, blocks: (B:40:0x019e, B:42:0x01a4, B:474:0x01be, B:475:0x01c3, B:477:0x01cd, B:478:0x01dd, B:479:0x0209, B:492:0x01ec, B:497:0x01fc, B:500:0x0202, B:486:0x0232), top: B:39:0x019e }] */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x016f  */
    /* JADX WARN: Type inference failed for: r0v51, types: [androidx.collection.Z, androidx.collection.a] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v36, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l11, Long l12) {
        int i11;
        int i12;
        boolean z11;
        Cursor cursor;
        Map map;
        boolean z12;
        String str2;
        String str3;
        Cursor cursor2;
        ?? r11;
        HashSet hashSet;
        C5132a c5132a;
        List list3;
        boolean z13;
        ?? r52;
        Cursor cursor3;
        Map map2;
        Map map3;
        HashSet hashSet2;
        Iterator it;
        zzas zzasVar;
        zzw zzwVar;
        Iterator it2;
        zzas zzasVar2;
        long j11;
        String str4;
        String str5;
        Map map4;
        Cursor cursor4;
        Cursor cursor5;
        String str6;
        Iterator it3;
        Map map5;
        com.google.android.gms.internal.measurement.zzes zzesVar;
        Cursor cursor6;
        Cursor cursor7;
        List list4;
        Cursor cursor8;
        Cursor cursor9;
        List list5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new C5132a();
        this.zzd = l11;
        this.zze = l12;
        Iterator it4 = list.iterator();
        while (true) {
            i11 = 0;
            i12 = 1;
            if (!it4.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzfs) it4.next()).zzh())) {
                z11 = true;
                break;
            }
        }
        zzoi.zzc();
        boolean zzs = this.zzs.zzf().zzs(this.zza, zzen.zzX);
        zzoi.zzc();
        boolean zzs2 = this.zzs.zzf().zzs(this.zza, zzen.zzW);
        if (z11) {
            zzam zzi = this.zzf.zzi();
            String str7 = this.zza;
            zzi.zzW();
            zzi.zzg();
            Preconditions.checkNotEmpty(str7);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                ?? zzh = zzi.zzh();
                zzh.update("events", contentValues, "app_id = ?", new String[]{str7});
                cursor = zzh;
            } catch (SQLiteException e11) {
                zzi.zzs.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzfa.zzn(str7), e11);
                cursor = "Error resetting session-scoped event counts. appId";
            }
        }
        Map map6 = Collections.EMPTY_MAP;
        String str8 = "data";
        String str9 = "audience_id";
        try {
            if (zzs2 && zzs) {
                zzam zzi2 = this.zzf.zzi();
                String str10 = this.zza;
                Preconditions.checkNotEmpty(str10);
                C5132a c5132a2 = new C5132a();
                try {
                    try {
                        cursor9 = zzi2.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str10}, null, null, null);
                        try {
                        } catch (SQLiteException e12) {
                            e = e12;
                            zzi2.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str10), e);
                            map6 = Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor8 = cursor;
                        if (cursor8 != null) {
                            cursor8.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    cursor9 = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor8 = null;
                    if (cursor8 != null) {
                    }
                    throw th;
                }
                if (cursor9.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzln.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursor9.getBlob(i12))).zzaE();
                            if (zzejVar.zzo()) {
                                Integer valueOf = Integer.valueOf(cursor9.getInt(i11));
                                List list6 = (List) c5132a2.get(valueOf);
                                if (list6 == null) {
                                    list5 = new ArrayList();
                                    c5132a2.put(valueOf, list5);
                                } else {
                                    list5 = list6;
                                }
                                list5.add(zzejVar);
                            }
                        } catch (IOException e14) {
                            zzi2.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzfa.zzn(str10), e14);
                        }
                        if (!cursor9.moveToNext()) {
                            break;
                        }
                        i11 = 0;
                        i12 = 1;
                    }
                    cursor9.close();
                    map = c5132a2;
                    zzam zzi3 = this.zzf.zzi();
                    String str11 = this.zza;
                    zzi3.zzW();
                    zzi3.zzg();
                    Preconditions.checkNotEmpty(str11);
                    cursor2 = zzi3.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str11}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map map7 = Collections.EMPTY_MAP;
                        cursor2.close();
                        r11 = map7;
                        z12 = z11;
                        str2 = "data";
                        str3 = "audience_id";
                    } else {
                        C5132a c5132a3 = new C5132a();
                        while (true) {
                            int i13 = cursor2.getInt(0);
                            try {
                                c5132a3.put(Integer.valueOf(i13), (com.google.android.gms.internal.measurement.zzgh) ((com.google.android.gms.internal.measurement.zzgg) zzln.zzl(com.google.android.gms.internal.measurement.zzgh.zzf(), cursor2.getBlob(1))).zzaE());
                                z12 = z11;
                                str2 = str8;
                                str3 = str9;
                            } catch (IOException e15) {
                                z12 = z11;
                                str2 = str8;
                                try {
                                    str3 = str9;
                                    try {
                                        zzi3.zzs.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzfa.zzn(str11), Integer.valueOf(i13), e15);
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        zzi3.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzfa.zzn(str11), e);
                                        Map map8 = Collections.EMPTY_MAP;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        r11 = map8;
                                        if (!r11.isEmpty()) {
                                        }
                                        String str12 = str2;
                                        String str13 = str3;
                                        if (!list.isEmpty()) {
                                        }
                                        String str14 = str12;
                                        String str15 = str13;
                                        if (!list2.isEmpty()) {
                                        }
                                        ArrayList arrayList = new ArrayList();
                                        Set<Integer> keySet = this.zzc.keySet();
                                        keySet.removeAll(this.zzb);
                                        while (r3.hasNext()) {
                                        }
                                        return arrayList;
                                    }
                                } catch (SQLiteException e17) {
                                    e = e17;
                                    str3 = str9;
                                    zzi3.zzs.zzay().zzd().zzc("Database error querying filter results. appId", zzfa.zzn(str11), e);
                                    Map map82 = Collections.EMPTY_MAP;
                                    if (cursor2 != null) {
                                    }
                                    r11 = map82;
                                    if (!r11.isEmpty()) {
                                    }
                                    String str122 = str2;
                                    String str132 = str3;
                                    if (!list.isEmpty()) {
                                    }
                                    String str142 = str122;
                                    String str152 = str132;
                                    if (!list2.isEmpty()) {
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Set<Integer> keySet2 = this.zzc.keySet();
                                    keySet2.removeAll(this.zzb);
                                    while (r3.hasNext()) {
                                    }
                                    return arrayList2;
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            z11 = z12;
                            str8 = str2;
                            str9 = str3;
                        }
                        cursor2.close();
                        r11 = c5132a3;
                    }
                    if (!r11.isEmpty()) {
                        HashSet hashSet3 = new HashSet(r11.keySet());
                        if (z12) {
                            String str16 = this.zza;
                            zzam zzi4 = this.zzf.zzi();
                            String str17 = this.zza;
                            zzi4.zzW();
                            zzi4.zzg();
                            Preconditions.checkNotEmpty(str17);
                            ?? c5132a4 = new C5132a();
                            SQLiteDatabase zzh2 = zzi4.zzh();
                            try {
                                try {
                                    cursor3 = zzh2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str17, str17});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list7 = (List) c5132a4.get(valueOf2);
                                                if (list7 == null) {
                                                    list7 = new ArrayList();
                                                    c5132a4.put(valueOf2, list7);
                                                }
                                                list7.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            c5132a4 = Collections.EMPTY_MAP;
                                        }
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        zzi4.zzs.zzay().zzd().zzc("Database error querying scoped filters. appId", zzfa.zzn(str17), e);
                                        c5132a4 = Collections.EMPTY_MAP;
                                        map2 = c5132a4;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r52 = zzh2;
                                    if (r52 != 0) {
                                        r52.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e19) {
                                e = e19;
                                cursor3 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                r52 = 0;
                                if (r52 != 0) {
                                }
                                throw th;
                            }
                            cursor3.close();
                            map2 = c5132a4;
                            Preconditions.checkNotEmpty(str16);
                            Preconditions.checkNotNull(r11);
                            C5132a c5132a5 = new C5132a();
                            if (!r11.isEmpty()) {
                                Iterator it5 = r11.keySet().iterator();
                                while (it5.hasNext()) {
                                    Integer num = (Integer) it5.next();
                                    num.intValue();
                                    com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) r11.get(num);
                                    List list8 = (List) map2.get(num);
                                    if (list8 == null || list8.isEmpty()) {
                                        map3 = map2;
                                        hashSet2 = hashSet3;
                                        it = it5;
                                        c5132a5.put(num, zzghVar);
                                    } else {
                                        map3 = map2;
                                        List zzq = this.zzf.zzu().zzq(zzghVar.zzk(), list8);
                                        if (zzq.isEmpty()) {
                                            map2 = map3;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzgg zzggVar = (com.google.android.gms.internal.measurement.zzgg) zzghVar.zzbB();
                                            zzggVar.zzf();
                                            zzggVar.zzb(zzq);
                                            hashSet2 = hashSet3;
                                            List zzq2 = this.zzf.zzu().zzq(zzghVar.zzn(), list8);
                                            zzggVar.zzh();
                                            zzggVar.zzd(zzq2);
                                            zzol.zzc();
                                            it = it5;
                                            if (this.zzs.zzf().zzs(null, zzen.zzaO)) {
                                                ArrayList arrayList3 = new ArrayList();
                                                Iterator it6 = zzghVar.zzj().iterator();
                                                while (it6.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zzfq zzfqVar = (com.google.android.gms.internal.measurement.zzfq) it6.next();
                                                    Iterator it7 = it6;
                                                    if (!list8.contains(Integer.valueOf(zzfqVar.zza()))) {
                                                        arrayList3.add(zzfqVar);
                                                    }
                                                    it6 = it7;
                                                }
                                                zzggVar.zze();
                                                zzggVar.zza(arrayList3);
                                                ArrayList arrayList4 = new ArrayList();
                                                for (com.google.android.gms.internal.measurement.zzgj zzgjVar : zzghVar.zzm()) {
                                                    if (!list8.contains(Integer.valueOf(zzgjVar.zzb()))) {
                                                        arrayList4.add(zzgjVar);
                                                    }
                                                }
                                                zzggVar.zzg();
                                                zzggVar.zzc(arrayList4);
                                            } else {
                                                for (int i14 = 0; i14 < zzghVar.zza(); i14++) {
                                                    if (list8.contains(Integer.valueOf(zzghVar.zze(i14).zza()))) {
                                                        zzggVar.zzi(i14);
                                                    }
                                                }
                                                for (int i15 = 0; i15 < zzghVar.zzc(); i15++) {
                                                    if (list8.contains(Integer.valueOf(zzghVar.zzi(i15).zzb()))) {
                                                        zzggVar.zzj(i15);
                                                    }
                                                }
                                            }
                                            c5132a5.put(num, (com.google.android.gms.internal.measurement.zzgh) zzggVar.zzaE());
                                        }
                                    }
                                    map2 = map3;
                                    hashSet3 = hashSet2;
                                    it5 = it;
                                }
                            }
                            hashSet = hashSet3;
                            c5132a = c5132a5;
                        } else {
                            hashSet = hashSet3;
                            c5132a = r11;
                        }
                        Iterator it8 = hashSet.iterator();
                        while (it8.hasNext()) {
                            Integer num2 = (Integer) it8.next();
                            num2.intValue();
                            com.google.android.gms.internal.measurement.zzgh zzghVar2 = (com.google.android.gms.internal.measurement.zzgh) c5132a.get(num2);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C5132a c5132a6 = new C5132a();
                            if (zzghVar2 != null && zzghVar2.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzfq zzfqVar2 : zzghVar2.zzj()) {
                                    if (zzfqVar2.zzh()) {
                                        C5132a c5132a7 = c5132a;
                                        c5132a6.put(Integer.valueOf(zzfqVar2.zza()), zzfqVar2.zzg() ? Long.valueOf(zzfqVar2.zzb()) : null);
                                        c5132a = c5132a7;
                                    }
                                }
                            }
                            C5132a c5132a8 = c5132a;
                            C5132a c5132a9 = new C5132a();
                            if (zzghVar2 != null && zzghVar2.zzc() != 0) {
                                Iterator it9 = zzghVar2.zzm().iterator();
                                while (it9.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzgj zzgjVar2 = (com.google.android.gms.internal.measurement.zzgj) it9.next();
                                    if (zzgjVar2.zzi() && zzgjVar2.zza() > 0) {
                                        c5132a9.put(Integer.valueOf(zzgjVar2.zzb()), Long.valueOf(zzgjVar2.zzc(zzgjVar2.zza() - 1)));
                                        it9 = it9;
                                        zzghVar2 = zzghVar2;
                                    }
                                }
                            }
                            com.google.android.gms.internal.measurement.zzgh zzghVar3 = zzghVar2;
                            if (zzghVar3 != null) {
                                int i16 = 0;
                                while (i16 < zzghVar3.zzd() * 64) {
                                    if (zzln.zzv(zzghVar3.zzn(), i16)) {
                                        z13 = zzs;
                                        this.zzs.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i16));
                                        bitSet2.set(i16);
                                        if (zzln.zzv(zzghVar3.zzk(), i16)) {
                                            bitSet.set(i16);
                                            i16++;
                                            zzs = z13;
                                        }
                                    } else {
                                        z13 = zzs;
                                    }
                                    c5132a6.remove(Integer.valueOf(i16));
                                    i16++;
                                    zzs = z13;
                                }
                            }
                            boolean z14 = zzs;
                            com.google.android.gms.internal.measurement.zzgh zzghVar4 = (com.google.android.gms.internal.measurement.zzgh) r11.get(num2);
                            if (zzs2 && z14 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                                Iterator it10 = list3.iterator();
                                while (it10.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) it10.next();
                                    int zzb = zzejVar2.zzb();
                                    Iterator it11 = it10;
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzejVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (c5132a6.containsKey(valueOf3)) {
                                        c5132a6.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (c5132a9.containsKey(valueOf3)) {
                                        c5132a9.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    it10 = it11;
                                }
                            }
                            this.zzc.put(num2, new zzu(this, this.zza, zzghVar4, bitSet, bitSet2, c5132a6, c5132a9, null));
                            zzs = z14;
                            c5132a = c5132a8;
                        }
                    }
                    String str1222 = str2;
                    String str1322 = str3;
                    if (!list.isEmpty()) {
                        zzw zzwVar2 = new zzw(this, null);
                        C5132a c5132a10 = new C5132a();
                        Iterator it12 = list.iterator();
                        while (it12.hasNext()) {
                            com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) it12.next();
                            com.google.android.gms.internal.measurement.zzfs zza = zzwVar2.zza(this.zza, zzfsVar);
                            if (zza != null) {
                                zzam zzi5 = this.zzf.zzi();
                                String str18 = this.zza;
                                String zzh3 = zza.zzh();
                                zzas zzn = zzi5.zzn(str18, zzfsVar.zzh());
                                if (zzn == null) {
                                    zzi5.zzs.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzfa.zzn(str18), zzi5.zzs.zzj().zzd(zzh3));
                                    zzasVar = new zzas(str18, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                } else {
                                    zzasVar = new zzas(zzn.zza, zzn.zzb, zzn.zzc + 1, zzn.zzd + 1, zzn.zze + 1, zzn.zzf, zzn.zzg, zzn.zzh, zzn.zzi, zzn.zzj, zzn.zzk);
                                }
                                this.zzf.zzi().zzE(zzasVar);
                                long j12 = zzasVar.zzc;
                                String zzh4 = zza.zzh();
                                Map map9 = (Map) c5132a10.get(zzh4);
                                if (map9 == null) {
                                    zzam zzi6 = this.zzf.zzi();
                                    String str19 = this.zza;
                                    zzi6.zzW();
                                    zzi6.zzg();
                                    Preconditions.checkNotEmpty(str19);
                                    Preconditions.checkNotEmpty(zzh4);
                                    C5132a c5132a11 = new C5132a();
                                    zzwVar = zzwVar2;
                                    it2 = it12;
                                    str4 = str1222;
                                    str5 = str1322;
                                    try {
                                        try {
                                            zzasVar2 = zzasVar;
                                        } catch (SQLiteException e21) {
                                            e = e21;
                                            zzasVar2 = zzasVar;
                                        }
                                        try {
                                            cursor5 = zzi6.zzh().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str19, zzh4}, null, null, null);
                                            try {
                                                try {
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor4 = cursor5;
                                                    if (cursor4 != null) {
                                                        cursor4.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e22) {
                                                e = e22;
                                                j11 = j12;
                                            }
                                        } catch (SQLiteException e23) {
                                            e = e23;
                                            j11 = j12;
                                            cursor5 = null;
                                            zzi6.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str19), e);
                                            map9 = Collections.EMPTY_MAP;
                                        }
                                        if (cursor5.moveToFirst()) {
                                            j11 = j12;
                                            do {
                                                try {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzej zzejVar3 = (com.google.android.gms.internal.measurement.zzej) ((com.google.android.gms.internal.measurement.zzei) zzln.zzl(com.google.android.gms.internal.measurement.zzej.zzc(), cursor5.getBlob(1))).zzaE();
                                                        Integer valueOf4 = Integer.valueOf(cursor5.getInt(0));
                                                        List list9 = (List) c5132a11.get(valueOf4);
                                                        if (list9 == null) {
                                                            list9 = new ArrayList();
                                                            c5132a11.put(valueOf4, list9);
                                                        }
                                                        list9.add(zzejVar3);
                                                    } catch (IOException e24) {
                                                        zzi6.zzs.zzay().zzd().zzc("Failed to merge filter. appId", zzfa.zzn(str19), e24);
                                                    }
                                                } catch (SQLiteException e25) {
                                                    e = e25;
                                                    zzi6.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str19), e);
                                                    map9 = Collections.EMPTY_MAP;
                                                }
                                            } while (cursor5.moveToNext());
                                            cursor5.close();
                                            map9 = c5132a11;
                                            c5132a10.put(zzh4, map9);
                                        } else {
                                            j11 = j12;
                                            map9 = Collections.EMPTY_MAP;
                                            cursor5.close();
                                            c5132a10.put(zzh4, map9);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        cursor4 = null;
                                    }
                                } else {
                                    zzwVar = zzwVar2;
                                    it2 = it12;
                                    zzasVar2 = zzasVar;
                                    j11 = j12;
                                    str4 = str1222;
                                    str5 = str1322;
                                }
                                for (Integer num3 : map9.keySet()) {
                                    int intValue = num3.intValue();
                                    if (this.zzb.contains(num3)) {
                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", num3);
                                    } else {
                                        Iterator it13 = ((List) map9.get(num3)).iterator();
                                        boolean z15 = true;
                                        while (true) {
                                            if (!it13.hasNext()) {
                                                map4 = map9;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzej zzejVar4 = (com.google.android.gms.internal.measurement.zzej) it13.next();
                                            zzx zzxVar = new zzx(this, this.zza, intValue, zzejVar4);
                                            map4 = map9;
                                            z15 = zzxVar.zzd(this.zzd, this.zze, zza, j11, zzasVar2, zzf(intValue, zzejVar4.zzb()));
                                            if (!z15) {
                                                this.zzb.add(num3);
                                                break;
                                            }
                                            zzd(num3).zzc(zzxVar);
                                            map9 = map4;
                                        }
                                        if (!z15) {
                                            this.zzb.add(num3);
                                        }
                                        map9 = map4;
                                    }
                                }
                                str1222 = str4;
                                str1322 = str5;
                                zzwVar2 = zzwVar;
                                it12 = it2;
                            }
                        }
                    }
                    String str1422 = str1222;
                    String str1522 = str1322;
                    if (!list2.isEmpty()) {
                        C5132a c5132a12 = new C5132a();
                        Iterator it14 = list2.iterator();
                        while (it14.hasNext()) {
                            com.google.android.gms.internal.measurement.zzgl zzglVar = (com.google.android.gms.internal.measurement.zzgl) it14.next();
                            String zzf = zzglVar.zzf();
                            Map map10 = (Map) c5132a12.get(zzf);
                            if (map10 == null) {
                                zzam zzi7 = this.zzf.zzi();
                                String str20 = this.zza;
                                zzi7.zzW();
                                zzi7.zzg();
                                Preconditions.checkNotEmpty(str20);
                                Preconditions.checkNotEmpty(zzf);
                                C5132a c5132a13 = new C5132a();
                                try {
                                    cursor7 = zzi7.zzh().query("property_filters", new String[]{str1522, str1422}, "app_id=? AND property_name=?", new String[]{str20, zzf}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor6 = cursor7;
                                            if (cursor6 != null) {
                                                cursor6.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e26) {
                                        e = e26;
                                        str6 = str1422;
                                    }
                                } catch (SQLiteException e27) {
                                    e = e27;
                                    str6 = str1422;
                                    it3 = it14;
                                    cursor7 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor6 = null;
                                }
                                if (cursor7.moveToFirst()) {
                                    while (true) {
                                        try {
                                            com.google.android.gms.internal.measurement.zzes zzesVar2 = (com.google.android.gms.internal.measurement.zzes) ((com.google.android.gms.internal.measurement.zzer) zzln.zzl(com.google.android.gms.internal.measurement.zzes.zzc(), cursor7.getBlob(1))).zzaE();
                                            Integer valueOf5 = Integer.valueOf(cursor7.getInt(0));
                                            List list10 = (List) c5132a13.get(valueOf5);
                                            if (list10 == null) {
                                                str6 = str1422;
                                                try {
                                                    list4 = new ArrayList();
                                                    c5132a13.put(valueOf5, list4);
                                                } catch (SQLiteException e28) {
                                                    e = e28;
                                                    it3 = it14;
                                                    zzi7.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str20), e);
                                                    map10 = Collections.EMPTY_MAP;
                                                }
                                            } else {
                                                str6 = str1422;
                                                list4 = list10;
                                            }
                                            list4.add(zzesVar2);
                                            it3 = it14;
                                        } catch (IOException e29) {
                                            str6 = str1422;
                                            it3 = it14;
                                            try {
                                                zzi7.zzs.zzay().zzd().zzc("Failed to merge filter", zzfa.zzn(str20), e29);
                                            } catch (SQLiteException e31) {
                                                e = e31;
                                                zzi7.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzfa.zzn(str20), e);
                                                map10 = Collections.EMPTY_MAP;
                                            }
                                        }
                                        if (!cursor7.moveToNext()) {
                                            break;
                                        }
                                        it14 = it3;
                                        str1422 = str6;
                                    }
                                    cursor7.close();
                                    map10 = c5132a13;
                                    c5132a12.put(zzf, map10);
                                } else {
                                    str6 = str1422;
                                    it3 = it14;
                                    map10 = Collections.EMPTY_MAP;
                                    cursor7.close();
                                    c5132a12.put(zzf, map10);
                                }
                            } else {
                                str6 = str1422;
                                it3 = it14;
                            }
                            Iterator it15 = map10.keySet().iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    Integer num4 = (Integer) it15.next();
                                    int intValue2 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzs.zzay().zzj().zzb("Skipping failed audience ID", num4);
                                        break;
                                    }
                                    Iterator it16 = ((List) map10.get(num4)).iterator();
                                    boolean z16 = true;
                                    while (true) {
                                        if (!it16.hasNext()) {
                                            map5 = map10;
                                            break;
                                        }
                                        zzesVar = (com.google.android.gms.internal.measurement.zzes) it16.next();
                                        if (Log.isLoggable(this.zzs.zzay().zzq(), 2)) {
                                            map5 = map10;
                                            this.zzs.zzay().zzj().zzd("Evaluating filter. audience, filter, property", num4, zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null, this.zzs.zzj().zzf(zzesVar.zze()));
                                            this.zzs.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzesVar));
                                        } else {
                                            map5 = map10;
                                        }
                                        if (!zzesVar.zzj() || zzesVar.zza() > 256) {
                                            break;
                                        }
                                        zzz zzzVar = new zzz(this, this.zza, intValue2, zzesVar);
                                        z16 = zzzVar.zzd(this.zzd, this.zze, zzglVar, zzf(intValue2, zzesVar.zza()));
                                        if (!z16) {
                                            this.zzb.add(num4);
                                            break;
                                        }
                                        zzd(num4).zzc(zzzVar);
                                        map10 = map5;
                                    }
                                    this.zzs.zzay().zzk().zzc("Invalid property filter ID. appId, id", zzfa.zzn(this.zza), String.valueOf(zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null));
                                    this.zzb.add(num4);
                                    map10 = map5;
                                }
                            }
                            it14 = it3;
                            str1422 = str6;
                        }
                    }
                    ArrayList arrayList22 = new ArrayList();
                    Set<Integer> keySet22 = this.zzc.keySet();
                    keySet22.removeAll(this.zzb);
                    for (Integer num5 : keySet22) {
                        int intValue3 = num5.intValue();
                        zzu zzuVar = (zzu) this.zzc.get(num5);
                        Preconditions.checkNotNull(zzuVar);
                        com.google.android.gms.internal.measurement.zzfo zza2 = zzuVar.zza(intValue3);
                        arrayList22.add(zza2);
                        zzam zzi8 = this.zzf.zzi();
                        String str21 = this.zza;
                        com.google.android.gms.internal.measurement.zzgh zzd = zza2.zzd();
                        zzi8.zzW();
                        zzi8.zzg();
                        Preconditions.checkNotEmpty(str21);
                        Preconditions.checkNotNull(zzd);
                        byte[] zzby = zzd.zzby();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str21);
                        contentValues2.put(str1522, num5);
                        contentValues2.put("current_results", zzby);
                        try {
                            try {
                                if (zzi8.zzh().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    zzi8.zzs.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzfa.zzn(str21));
                                }
                            } catch (SQLiteException e32) {
                                e = e32;
                                zzi8.zzs.zzay().zzd().zzc("Error storing filter results. appId", zzfa.zzn(str21), e);
                            }
                        } catch (SQLiteException e33) {
                            e = e33;
                        }
                    }
                    return arrayList22;
                }
                cursor9.close();
            }
            if (cursor2.moveToFirst()) {
            }
            if (!r11.isEmpty()) {
            }
            String str12222 = str2;
            String str13222 = str3;
            if (!list.isEmpty()) {
            }
            String str14222 = str12222;
            String str15222 = str13222;
            if (!list2.isEmpty()) {
            }
            ArrayList arrayList222 = new ArrayList();
            Set<Integer> keySet222 = this.zzc.keySet();
            keySet222.removeAll(this.zzb);
            while (r3.hasNext()) {
            }
            return arrayList222;
        } catch (Throwable th10) {
            th = th10;
            Cursor cursor10 = cursor2;
            if (cursor10 != null) {
                cursor10.close();
            }
            throw th;
        }
        map = map6;
        zzam zzi32 = this.zzf.zzi();
        String str112 = this.zza;
        zzi32.zzW();
        zzi32.zzg();
        Preconditions.checkNotEmpty(str112);
        cursor2 = zzi32.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str112}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzkz
    protected final boolean zzb() {
        return false;
    }
}
