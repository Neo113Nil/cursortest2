package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzfe;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfm;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzhg;
import com.google.android.gms.internal.measurement.zzhq;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzih;
import com.google.android.gms.internal.measurement.zzii;
import com.google.android.gms.internal.measurement.zzik;
import com.google.android.gms.internal.measurement.zziu;
import com.google.android.gms.internal.measurement.zzpu;
import com.twilio.voice.EventKeys;
import com.twilio.voice.PublisherMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z.C6900a;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3238e extends D6 {

    /* renamed from: d, reason: collision with root package name */
    public String f33988d;

    /* renamed from: e, reason: collision with root package name */
    public Set f33989e;

    /* renamed from: f, reason: collision with root package name */
    public Map f33990f;

    /* renamed from: g, reason: collision with root package name */
    public Long f33991g;

    /* renamed from: h, reason: collision with root package name */
    public Long f33992h;

    public C3238e(S6 s62) {
        super(s62);
    }

    @Override // com.google.android.gms.measurement.internal.D6
    public final boolean l() {
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|1|(2:2|(2:4|(2:6|7)(1:538))(2:539|540))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(14:(7:25|26|27|28|(1:30)(3:512|(1:514)(1:516)|515)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:468|(6:469|470|471|472|473|(1:476)(1:475))|477)|44|(5:297|(11:299|300|301|302|303|(1:(4:305|(1:307)|308|309))(1:451)|312|313|(3:407|(6:410|(2:446|447)(2:414|(8:420|421|(4:424|(2:426|427)(1:429)|428|422)|430|431|(4:434|(3:436|437|438)(1:440)|439|432)|441|442)(4:416|417|418|419))|443|444|419|408)|449)|315|316)(1:467)|317|(11:320|(3:324|(4:327|(5:329|330|(1:332)(1:336)|333|334)(1:337)|335|325)|338)|339|340|(3:344|(4:347|(3:352|353|354)|355|345)|358)|359|(3:361|(6:364|(2:366|(3:368|369|370))(1:373)|371|372|370|362)|374)|375|(3:384|(8:387|(1:389)|390|(1:392)|393|(2:395|396)(1:398)|397|385)|399)|400|318)|406)|46|47|(3:49|(4:52|(3:54|55|(8:57|58|(10:60|61|62|63|64|65|66|67|(3:69|(11:70|71|72|73|74|75|76|(3:78|79|80)(1:133)|81|82|(1:85)(1:84))|86)(3:140|141|142)|87)(1:157)|88|(4:91|(3:109|110|111)(6:93|94|(2:95|(2:97|(1:99)(2:100|101))(2:107|108))|(1:103)|104|105)|106|89)|112|113|114)(1:158))(1:159)|115|50)|160)|(6:162|(3:164|(6:167|(6:169|170|171|172|173|(3:(9:175|176|177|178|179|(3:181|182|183)(1:244)|184|185|(1:188)(1:187))|189|190)(4:251|252|240|190))(1:268)|191|(2:192|(2:194|(3:231|232|233)(8:196|(2:197|(4:199|(4:201|(1:203)(1:227)|204|205)(1:228)|206|(1:1)(2:210|(1:212)(2:213|214)))(2:229|230))|221|(1:223)(1:225)|224|216|217|218))(0))|234|165)|269)|270|(10:273|274|275|276|277|278|280|(3:282|283|284)(1:286)|285|271)|293|294)(2:295|296))|521)|537|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|(0)(0)|(5:(0)|(1:526)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0997, code lost:
    
        if (r12 != false) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0878, code lost:
    
        if (r13 != null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x02e5, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x01b3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x01b4, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x01b6, code lost:
    
        r18 = com.twilio.voice.EventKeys.DATA;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0225, code lost:
    
        r17 = r2;
        r18 = com.twilio.voice.EventKeys.DATA;
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x022f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x022c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0168, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #13 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #13 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:468:0x01bc, B:469:0x01c1, B:471:0x01cb, B:472:0x01db, B:473:0x0207, B:486:0x01ea, B:491:0x01fa, B:494:0x0200, B:480:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06ed  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m(String str, List list, List list2, Long l10, Long l11, boolean z10) {
        int i10;
        int i11;
        boolean z11;
        Map map;
        boolean z12;
        String str2;
        String str3;
        Cursor cursor;
        ?? r11;
        HashSet<Integer> hashSet;
        C6900a c6900a;
        List list3;
        boolean z13;
        ?? r52;
        Cursor cursor2;
        Map map2;
        HashSet hashSet2;
        Iterator it;
        Iterator it2;
        Map map3;
        String str4;
        C6900a c6900a2;
        zzfn zzfnVar;
        C3298l3 c3298l3;
        Cursor cursor3;
        String str5;
        Cursor cursor4;
        List list4;
        k7 k7Var;
        Iterator it3;
        B b10;
        Iterator it4;
        Map map4;
        Iterator it5;
        long j10;
        String str6;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        Cursor cursor7;
        List list6;
        AbstractC3191o.g(str);
        AbstractC3191o.m(list);
        AbstractC3191o.m(list2);
        this.f33988d = str;
        this.f33989e = new HashSet();
        this.f33990f = new C6900a();
        this.f33991g = l10;
        this.f33992h = l11;
        Iterator it6 = list.iterator();
        while (true) {
            i10 = 0;
            i11 = 1;
            if (!it6.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((zzhs) it6.next()).zzd())) {
                z11 = true;
                break;
            }
        }
        zzpu.zza();
        C3298l3 c3298l32 = this.f33578a;
        boolean H10 = c3298l32.w().H(this.f33988d, AbstractC3209a2.f33813G0);
        zzpu.zza();
        boolean H11 = c3298l32.w().H(this.f33988d, AbstractC3209a2.f33811F0);
        if (z11) {
            C3357t F02 = this.f34418b.F0();
            String str7 = this.f33988d;
            F02.j();
            F02.h();
            AbstractC3191o.g(str7);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                F02.u0().update("events", contentValues, "app_id = ?", new String[]{str7});
            } catch (SQLiteException e10) {
                F02.f33578a.a().o().c("Error resetting session-scoped event counts. appId", C3392x2.x(str7), e10);
            }
        }
        Map map5 = Collections.EMPTY_MAP;
        String str8 = EventKeys.DATA;
        String str9 = "audience_id";
        try {
            if (H11 && H10) {
                C3357t F03 = this.f34418b.F0();
                String str10 = this.f33988d;
                AbstractC3191o.g(str10);
                C6900a c6900a3 = new C6900a();
                try {
                    cursor7 = F03.u0().query("event_filters", new String[]{"audience_id", EventKeys.DATA}, "app_id=?", new String[]{str10}, null, null, null);
                    try {
                        try {
                        } catch (SQLiteException e11) {
                            e = e11;
                            F03.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str10), e);
                            map5 = Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor7 = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            zzff zzffVar = (zzff) ((zzfe) X6.W(zzff.zzn(), cursor7.getBlob(i11))).zzbc();
                            if (zzffVar.zzg()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i10));
                                List list7 = (List) c6900a3.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    c6900a3.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(zzffVar);
                            }
                        } catch (IOException e13) {
                            F03.f33578a.a().o().c("Failed to merge filter. appId", C3392x2.x(str10), e13);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i10 = 0;
                        i11 = 1;
                    }
                    cursor7.close();
                    map = c6900a3;
                    C3357t F04 = this.f34418b.F0();
                    String str11 = this.f33988d;
                    F04.j();
                    F04.h();
                    AbstractC3191o.g(str11);
                    cursor = F04.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str11}, null, null, null);
                    if (cursor.moveToFirst()) {
                        Map map6 = Collections.EMPTY_MAP;
                        cursor.close();
                        r11 = map6;
                        z12 = z11;
                        str2 = EventKeys.DATA;
                        str3 = "audience_id";
                    } else {
                        C6900a c6900a4 = new C6900a();
                        while (true) {
                            int i12 = cursor.getInt(0);
                            try {
                                c6900a4.put(Integer.valueOf(i12), (zzii) ((zzih) X6.W(zzii.zzi(), cursor.getBlob(1))).zzbc());
                                z12 = z11;
                                str2 = str8;
                                str3 = str9;
                            } catch (IOException e14) {
                                z12 = z11;
                                str2 = str8;
                                try {
                                    str3 = str9;
                                    try {
                                        F04.f33578a.a().o().d("Failed to merge filter results. appId, audienceId, error", C3392x2.x(str11), Integer.valueOf(i12), e14);
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        F04.f33578a.a().o().c("Database error querying filter results. appId", C3392x2.x(str11), e);
                                        Map map7 = Collections.EMPTY_MAP;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        r11 = map7;
                                        if (!r11.isEmpty()) {
                                        }
                                        String str12 = str2;
                                        String str13 = str3;
                                        String str14 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                        }
                                        if (!z10) {
                                        }
                                    }
                                } catch (SQLiteException e16) {
                                    e = e16;
                                    str3 = str9;
                                    F04.f33578a.a().o().c("Database error querying filter results. appId", C3392x2.x(str11), e);
                                    Map map72 = Collections.EMPTY_MAP;
                                    if (cursor != null) {
                                    }
                                    r11 = map72;
                                    if (!r11.isEmpty()) {
                                    }
                                    String str122 = str2;
                                    String str132 = str3;
                                    String str142 = "Skipping failed audience ID";
                                    if (!list.isEmpty()) {
                                    }
                                    if (!z10) {
                                    }
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            z11 = z12;
                            str8 = str2;
                            str9 = str3;
                        }
                        cursor.close();
                        r11 = c6900a4;
                    }
                    if (!r11.isEmpty()) {
                        HashSet hashSet3 = new HashSet(r11.keySet());
                        if (z12) {
                            String str15 = this.f33988d;
                            C3357t F05 = this.f34418b.F0();
                            String str16 = this.f33988d;
                            F05.j();
                            F05.h();
                            AbstractC3191o.g(str16);
                            Map c6900a5 = new C6900a();
                            SQLiteDatabase u02 = F05.u0();
                            try {
                                try {
                                    cursor2 = u02.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str16, str16});
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor2.getInt(0));
                                                List list8 = (List) c6900a5.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    c6900a5.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor2.getInt(1)));
                                            } while (cursor2.moveToNext());
                                        } else {
                                            c6900a5 = Collections.EMPTY_MAP;
                                        }
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        F05.f33578a.a().o().c("Database error querying scoped filters. appId", C3392x2.x(str16), e);
                                        c6900a5 = Collections.EMPTY_MAP;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    r52 = u02;
                                    if (r52 != 0) {
                                        r52.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e18) {
                                e = e18;
                                cursor2 = null;
                            } catch (Throwable th5) {
                                th = th5;
                                r52 = 0;
                                if (r52 != 0) {
                                }
                                throw th;
                            }
                            cursor2.close();
                            AbstractC3191o.g(str15);
                            AbstractC3191o.m(r11);
                            C6900a c6900a6 = new C6900a();
                            if (!r11.isEmpty()) {
                                Iterator it7 = r11.keySet().iterator();
                                while (it7.hasNext()) {
                                    Integer num = (Integer) it7.next();
                                    num.intValue();
                                    zzii zziiVar = (zzii) r11.get(num);
                                    List list9 = (List) c6900a5.get(num);
                                    if (list9 == null || list9.isEmpty()) {
                                        map2 = c6900a5;
                                        hashSet2 = hashSet3;
                                        it = it7;
                                        c6900a6.put(num, zziiVar);
                                    } else {
                                        S6 s62 = this.f34418b;
                                        map2 = c6900a5;
                                        hashSet2 = hashSet3;
                                        List R10 = s62.K0().R(zziiVar.zzc(), list9);
                                        if (R10.isEmpty()) {
                                            c6900a5 = map2;
                                            hashSet3 = hashSet2;
                                        } else {
                                            zzih zzihVar = (zzih) zziiVar.zzcl();
                                            zzihVar.zzd();
                                            zzihVar.zzc(R10);
                                            List R11 = s62.K0().R(zziiVar.zza(), list9);
                                            zzihVar.zzb();
                                            zzihVar.zza(R11);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it8 = zziiVar.zze().iterator();
                                            while (it8.hasNext()) {
                                                Iterator it9 = it7;
                                                zzhq zzhqVar = (zzhq) it8.next();
                                                Iterator it10 = it8;
                                                if (!list9.contains(Integer.valueOf(zzhqVar.zzb()))) {
                                                    arrayList.add(zzhqVar);
                                                }
                                                it7 = it9;
                                                it8 = it10;
                                            }
                                            it = it7;
                                            zzihVar.zzf();
                                            zzihVar.zze(arrayList);
                                            ArrayList arrayList2 = new ArrayList();
                                            for (zzik zzikVar : zziiVar.zzg()) {
                                                if (!list9.contains(Integer.valueOf(zzikVar.zzb()))) {
                                                    arrayList2.add(zzikVar);
                                                }
                                            }
                                            zzihVar.zzh();
                                            zzihVar.zzg(arrayList2);
                                            c6900a6.put(num, (zzii) zzihVar.zzbc());
                                        }
                                    }
                                    c6900a5 = map2;
                                    hashSet3 = hashSet2;
                                    it7 = it;
                                }
                            }
                            hashSet = hashSet3;
                            c6900a = c6900a6;
                        } else {
                            hashSet = hashSet3;
                            c6900a = r11;
                        }
                        Map map8 = r11;
                        for (Integer num2 : hashSet) {
                            num2.intValue();
                            zzii zziiVar2 = (zzii) c6900a.get(num2);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C6900a c6900a7 = new C6900a();
                            if (zziiVar2 != null && zziiVar2.zzf() != 0) {
                                for (zzhq zzhqVar2 : zziiVar2.zze()) {
                                    if (zzhqVar2.zza()) {
                                        C6900a c6900a8 = c6900a;
                                        c6900a7.put(Integer.valueOf(zzhqVar2.zzb()), zzhqVar2.zzc() ? Long.valueOf(zzhqVar2.zzd()) : null);
                                        c6900a = c6900a8;
                                    }
                                }
                            }
                            C6900a c6900a9 = c6900a;
                            C6900a c6900a10 = new C6900a();
                            if (zziiVar2 != null && zziiVar2.zzh() != 0) {
                                Iterator it11 = zziiVar2.zzg().iterator();
                                while (it11.hasNext()) {
                                    zzik zzikVar2 = (zzik) it11.next();
                                    if (zzikVar2.zza() && zzikVar2.zzd() > 0) {
                                        c6900a10.put(Integer.valueOf(zzikVar2.zzb()), Long.valueOf(zzikVar2.zze(zzikVar2.zzd() - 1)));
                                        it11 = it11;
                                        zziiVar2 = zziiVar2;
                                    }
                                }
                            }
                            zzii zziiVar3 = zziiVar2;
                            if (zziiVar3 != null) {
                                int i13 = 0;
                                while (i13 < zziiVar3.zzb() * 64) {
                                    if (X6.P(zziiVar3.zza(), i13)) {
                                        z13 = H10;
                                        this.f33578a.a().w().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i13));
                                        bitSet2.set(i13);
                                        if (X6.P(zziiVar3.zzc(), i13)) {
                                            bitSet.set(i13);
                                            i13++;
                                            H10 = z13;
                                        }
                                    } else {
                                        z13 = H10;
                                    }
                                    c6900a7.remove(Integer.valueOf(i13));
                                    i13++;
                                    H10 = z13;
                                }
                            }
                            boolean z14 = H10;
                            zzii zziiVar4 = (zzii) map8.get(num2);
                            if (H11 && z14 && (list3 = (List) map.get(num2)) != null && this.f33992h != null && this.f33991g != null) {
                                Iterator it12 = list3.iterator();
                                while (it12.hasNext()) {
                                    zzff zzffVar2 = (zzff) it12.next();
                                    int zzb = zzffVar2.zzb();
                                    Iterator it13 = it12;
                                    long longValue = this.f33992h.longValue() / 1000;
                                    if (zzffVar2.zzj()) {
                                        longValue = this.f33991g.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (c6900a7.containsKey(valueOf3)) {
                                        c6900a7.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (c6900a10.containsKey(valueOf3)) {
                                        c6900a10.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    it12 = it13;
                                }
                            }
                            this.f33990f.put(num2, new j7(this, this.f33988d, zziiVar4, bitSet, bitSet2, c6900a7, c6900a10, null));
                            str2 = str2;
                            map = map;
                            str3 = str3;
                            map8 = map8;
                            H10 = z14;
                            c6900a = c6900a9;
                        }
                    }
                    String str1222 = str2;
                    String str1322 = str3;
                    String str1422 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        k7 k7Var2 = new k7(this, null);
                        C6900a c6900a11 = new C6900a();
                        Iterator it14 = list.iterator();
                        while (it14.hasNext()) {
                            zzhs zzhsVar = (zzhs) it14.next();
                            zzhs a10 = k7Var2.a(this.f33988d, zzhsVar);
                            if (a10 != null) {
                                S6 s63 = this.f34418b;
                                B Z10 = s63.F0().Z(this.f33988d, zzhsVar, a10.zzd());
                                s63.F0().w0(Z10);
                                if (z10) {
                                    continue;
                                } else {
                                    long j11 = Z10.f33285c;
                                    String zzd = a10.zzd();
                                    Map map9 = (Map) c6900a11.get(zzd);
                                    if (map9 == null) {
                                        C3357t F06 = s63.F0();
                                        k7Var = k7Var2;
                                        String str17 = this.f33988d;
                                        F06.j();
                                        F06.h();
                                        AbstractC3191o.g(str17);
                                        AbstractC3191o.g(zzd);
                                        it3 = it14;
                                        C6900a c6900a12 = new C6900a();
                                        try {
                                            try {
                                                str6 = str17;
                                            } catch (Throwable th6) {
                                                th = th6;
                                                cursor5 = null;
                                            }
                                        } catch (SQLiteException e19) {
                                            e = e19;
                                            str6 = str17;
                                        }
                                        try {
                                            Cursor query = F06.u0().query("event_filters", new String[]{str1322, str1222}, "app_id=? AND event_name=?", new String[]{str17, zzd}, null, null, null);
                                            try {
                                                try {
                                                    if (query.moveToFirst()) {
                                                        b10 = Z10;
                                                        while (true) {
                                                            try {
                                                                try {
                                                                    zzff zzffVar3 = (zzff) ((zzfe) X6.W(zzff.zzn(), query.getBlob(1))).zzbc();
                                                                    Integer valueOf4 = Integer.valueOf(query.getInt(0));
                                                                    List list10 = (List) c6900a12.get(valueOf4);
                                                                    if (list10 == null) {
                                                                        cursor6 = query;
                                                                        try {
                                                                            list5 = new ArrayList();
                                                                            c6900a12.put(valueOf4, list5);
                                                                        } catch (SQLiteException e20) {
                                                                            e = e20;
                                                                            cursor5 = cursor6;
                                                                            try {
                                                                                F06.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str6), e);
                                                                                map9 = Collections.EMPTY_MAP;
                                                                                if (cursor5 != null) {
                                                                                }
                                                                                c6900a11.put(zzd, map9);
                                                                                it4 = map9.keySet().iterator();
                                                                                while (it4.hasNext()) {
                                                                                }
                                                                                it14 = it3;
                                                                                k7Var2 = k7Var;
                                                                            } catch (Throwable th7) {
                                                                                th = th7;
                                                                                if (cursor5 != null) {
                                                                                    cursor5.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                            cursor5 = cursor6;
                                                                            if (cursor5 != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } else {
                                                                        cursor6 = query;
                                                                        list5 = list10;
                                                                    }
                                                                    list5.add(zzffVar3);
                                                                } catch (IOException e21) {
                                                                    cursor6 = query;
                                                                    F06.f33578a.a().o().c("Failed to merge filter. appId", C3392x2.x(str6), e21);
                                                                }
                                                                if (!cursor6.moveToNext()) {
                                                                    break;
                                                                }
                                                                query = cursor6;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                cursor6 = query;
                                                            }
                                                        }
                                                        cursor6.close();
                                                        map9 = c6900a12;
                                                    } else {
                                                        b10 = Z10;
                                                        map9 = Collections.EMPTY_MAP;
                                                        query.close();
                                                    }
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    cursor6 = query;
                                                }
                                            } catch (SQLiteException e23) {
                                                e = e23;
                                                cursor6 = query;
                                                b10 = Z10;
                                            }
                                        } catch (SQLiteException e24) {
                                            e = e24;
                                            b10 = Z10;
                                            cursor5 = null;
                                            F06.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str6), e);
                                            map9 = Collections.EMPTY_MAP;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            c6900a11.put(zzd, map9);
                                            it4 = map9.keySet().iterator();
                                            while (it4.hasNext()) {
                                            }
                                            it14 = it3;
                                            k7Var2 = k7Var;
                                        }
                                        c6900a11.put(zzd, map9);
                                    } else {
                                        k7Var = k7Var2;
                                        it3 = it14;
                                        b10 = Z10;
                                    }
                                    it4 = map9.keySet().iterator();
                                    while (it4.hasNext()) {
                                        Integer num3 = (Integer) it4.next();
                                        int intValue = num3.intValue();
                                        if (this.f33989e.contains(num3)) {
                                            this.f33578a.a().w().b("Skipping failed audience ID", num3);
                                        } else {
                                            Iterator it15 = ((List) map9.get(num3)).iterator();
                                            boolean z15 = true;
                                            while (true) {
                                                if (!it15.hasNext()) {
                                                    map4 = map9;
                                                    it5 = it4;
                                                    j10 = j11;
                                                    break;
                                                }
                                                zzff zzffVar4 = (zzff) it15.next();
                                                map4 = map9;
                                                it5 = it4;
                                                C3214b c3214b = new C3214b(this, this.f33988d, intValue, zzffVar4);
                                                j10 = j11;
                                                z15 = c3214b.k(this.f33991g, this.f33992h, a10, j10, b10, o(intValue, zzffVar4.zzb()));
                                                if (!z15) {
                                                    this.f33989e.add(num3);
                                                    break;
                                                }
                                                n(num3).a(c3214b);
                                                j11 = j10;
                                                map9 = map4;
                                                it4 = it5;
                                            }
                                            if (!z15) {
                                                this.f33989e.add(num3);
                                            }
                                            j11 = j10;
                                            map9 = map4;
                                            it4 = it5;
                                        }
                                    }
                                    it14 = it3;
                                    k7Var2 = k7Var;
                                }
                            }
                        }
                    }
                    if (!z10) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        C6900a c6900a13 = new C6900a();
                        Iterator it16 = list2.iterator();
                        while (it16.hasNext()) {
                            zziu zziuVar = (zziu) it16.next();
                            String zzc = zziuVar.zzc();
                            Map map10 = (Map) c6900a13.get(zzc);
                            if (map10 == null) {
                                C3357t F07 = this.f34418b.F0();
                                String str18 = this.f33988d;
                                F07.j();
                                F07.h();
                                AbstractC3191o.g(str18);
                                AbstractC3191o.g(zzc);
                                C6900a c6900a14 = new C6900a();
                                try {
                                    cursor4 = F07.u0().query("property_filters", new String[]{str1322, str1222}, "app_id=? AND property_name=?", new String[]{str18, zzc}, null, null, null);
                                    try {
                                        try {
                                        } catch (SQLiteException e25) {
                                            e = e25;
                                            it2 = it16;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        cursor3 = cursor4;
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e26) {
                                    e = e26;
                                    it2 = it16;
                                    str5 = str18;
                                    cursor4 = null;
                                } catch (Throwable th11) {
                                    th = th11;
                                    cursor3 = null;
                                }
                                if (cursor4.moveToFirst()) {
                                    while (true) {
                                        try {
                                            zzfn zzfnVar2 = (zzfn) ((zzfm) X6.W(zzfn.zzi(), cursor4.getBlob(1))).zzbc();
                                            Integer valueOf5 = Integer.valueOf(cursor4.getInt(0));
                                            List list11 = (List) c6900a14.get(valueOf5);
                                            if (list11 == null) {
                                                it2 = it16;
                                                try {
                                                    list4 = new ArrayList();
                                                    c6900a14.put(valueOf5, list4);
                                                } catch (SQLiteException e27) {
                                                    e = e27;
                                                    str5 = str18;
                                                    F07.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str5), e);
                                                    map10 = Collections.EMPTY_MAP;
                                                }
                                            } else {
                                                it2 = it16;
                                                list4 = list11;
                                            }
                                            list4.add(zzfnVar2);
                                            str5 = str18;
                                        } catch (IOException e28) {
                                            it2 = it16;
                                            str5 = str18;
                                            try {
                                                F07.f33578a.a().o().c("Failed to merge filter", C3392x2.x(str5), e28);
                                            } catch (SQLiteException e29) {
                                                e = e29;
                                                F07.f33578a.a().o().c("Database error querying filters. appId", C3392x2.x(str5), e);
                                                map10 = Collections.EMPTY_MAP;
                                            }
                                        }
                                        if (!cursor4.moveToNext()) {
                                            break;
                                        }
                                        it16 = it2;
                                        str18 = str5;
                                    }
                                    cursor4.close();
                                    map10 = c6900a14;
                                    c6900a13.put(zzc, map10);
                                } else {
                                    it2 = it16;
                                    map10 = Collections.EMPTY_MAP;
                                    cursor4.close();
                                    c6900a13.put(zzc, map10);
                                }
                            } else {
                                it2 = it16;
                            }
                            Iterator it17 = map10.keySet().iterator();
                            while (true) {
                                if (it17.hasNext()) {
                                    Integer num4 = (Integer) it17.next();
                                    int intValue2 = num4.intValue();
                                    if (this.f33989e.contains(num4)) {
                                        this.f33578a.a().w().b(str1422, num4);
                                        break;
                                    }
                                    Iterator it18 = ((List) map10.get(num4)).iterator();
                                    boolean z16 = true;
                                    while (true) {
                                        if (!it18.hasNext()) {
                                            map3 = map10;
                                            str4 = str1422;
                                            c6900a2 = c6900a13;
                                            break;
                                        }
                                        zzfnVar = (zzfn) it18.next();
                                        c3298l3 = this.f33578a;
                                        map3 = map10;
                                        if (Log.isLoggable(c3298l3.a().z(), 2)) {
                                            str4 = str1422;
                                            c6900a2 = c6900a13;
                                            c3298l3.a().w().d("Evaluating filter. audience, filter, property", num4, zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null, c3298l3.D().c(zzfnVar.zzc()));
                                            c3298l3.a().w().b("Filter definition", this.f34418b.K0().M(zzfnVar));
                                        } else {
                                            str4 = str1422;
                                            c6900a2 = c6900a13;
                                        }
                                        if (!zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                            break;
                                        }
                                        C3230d c3230d = new C3230d(this, this.f33988d, intValue2, zzfnVar);
                                        z16 = c3230d.k(this.f33991g, this.f33992h, zziuVar, o(intValue2, zzfnVar.zzb()));
                                        if (!z16) {
                                            this.f33989e.add(num4);
                                            break;
                                        }
                                        n(num4).a(c3230d);
                                        map10 = map3;
                                        c6900a13 = c6900a2;
                                        str1422 = str4;
                                    }
                                    c3298l3.a().r().c("Invalid property filter ID. appId, id", C3392x2.x(this.f33988d), String.valueOf(zzfnVar.zza() ? Integer.valueOf(zzfnVar.zzb()) : null));
                                    this.f33989e.add(num4);
                                    map10 = map3;
                                    c6900a13 = c6900a2;
                                    str1422 = str4;
                                }
                            }
                            it16 = it2;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Set<Integer> keySet = this.f33990f.keySet();
                    keySet.removeAll(this.f33989e);
                    for (Integer num5 : keySet) {
                        int intValue3 = num5.intValue();
                        j7 j7Var = (j7) this.f33990f.get(num5);
                        AbstractC3191o.m(j7Var);
                        zzhg b11 = j7Var.b(intValue3);
                        arrayList3.add(b11);
                        C3357t F08 = this.f34418b.F0();
                        String str19 = this.f33988d;
                        zzii zzc2 = b11.zzc();
                        F08.j();
                        F08.h();
                        AbstractC3191o.g(str19);
                        AbstractC3191o.m(zzc2);
                        byte[] zzcc = zzc2.zzcc();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(PublisherMetadata.APP_ID, str19);
                        contentValues2.put(str1322, num5);
                        contentValues2.put("current_results", zzcc);
                        try {
                        } catch (SQLiteException e30) {
                            e = e30;
                        }
                        try {
                            if (F08.u0().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                F08.f33578a.a().o().b("Failed to insert filter results (got -1). appId", C3392x2.x(str19));
                            }
                        } catch (SQLiteException e31) {
                            e = e31;
                            F08.f33578a.a().o().c("Error storing filter results. appId", C3392x2.x(str19), e);
                        }
                    }
                    return arrayList3;
                }
                cursor7.close();
            }
            if (cursor.moveToFirst()) {
            }
            if (!r11.isEmpty()) {
            }
            String str12222 = str2;
            String str13222 = str3;
            String str14222 = "Skipping failed audience ID";
            if (!list.isEmpty()) {
            }
            if (!z10) {
            }
        } catch (Throwable th12) {
            th = th12;
            Cursor cursor8 = cursor;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = map5;
        C3357t F042 = this.f34418b.F0();
        String str112 = this.f33988d;
        F042.j();
        F042.h();
        AbstractC3191o.g(str112);
        cursor = F042.u0().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str112}, null, null, null);
    }

    public final j7 n(Integer num) {
        if (this.f33990f.containsKey(num)) {
            return (j7) this.f33990f.get(num);
        }
        j7 j7Var = new j7(this, this.f33988d, null);
        this.f33990f.put(num, j7Var);
        return j7Var;
    }

    public final boolean o(int i10, int i11) {
        j7 j7Var = (j7) this.f33990f.get(Integer.valueOf(i10));
        if (j7Var == null) {
            return false;
        }
        return j7Var.c().get(i11);
    }
}
