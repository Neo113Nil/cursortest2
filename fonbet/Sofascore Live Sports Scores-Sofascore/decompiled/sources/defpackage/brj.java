package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.FieldTranslations;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class brj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ irj b;

    public /* synthetic */ brj(irj irjVar, int i) {
        this.a = i;
        this.b = irjVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x03c2 A[Catch: all -> 0x02ef, TryCatch #2 {all -> 0x02ef, blocks: (B:89:0x023e, B:90:0x029b, B:92:0x02a1, B:95:0x02b9, B:98:0x02cb, B:102:0x02df, B:105:0x02e8, B:106:0x02f4, B:109:0x0300, B:112:0x030f, B:115:0x0323, B:118:0x0336, B:120:0x035f, B:123:0x0377, B:127:0x038f, B:130:0x03a6, B:131:0x03b3, B:133:0x03c2, B:136:0x03d2, B:139:0x03df, B:142:0x03f0, B:143:0x03fb, B:145:0x03ec, B:146:0x03db, B:149:0x039e, B:150:0x0386, B:153:0x032c, B:154:0x0318, B:155:0x0309, B:159:0x02d4, B:161:0x02b3), top: B:88:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ec A[Catch: all -> 0x02ef, TryCatch #2 {all -> 0x02ef, blocks: (B:89:0x023e, B:90:0x029b, B:92:0x02a1, B:95:0x02b9, B:98:0x02cb, B:102:0x02df, B:105:0x02e8, B:106:0x02f4, B:109:0x0300, B:112:0x030f, B:115:0x0323, B:118:0x0336, B:120:0x035f, B:123:0x0377, B:127:0x038f, B:130:0x03a6, B:131:0x03b3, B:133:0x03c2, B:136:0x03d2, B:139:0x03df, B:142:0x03f0, B:143:0x03fb, B:145:0x03ec, B:146:0x03db, B:149:0x039e, B:150:0x0386, B:153:0x032c, B:154:0x0318, B:155:0x0309, B:159:0x02d4, B:161:0x02b3), top: B:88:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03db A[Catch: all -> 0x02ef, TryCatch #2 {all -> 0x02ef, blocks: (B:89:0x023e, B:90:0x029b, B:92:0x02a1, B:95:0x02b9, B:98:0x02cb, B:102:0x02df, B:105:0x02e8, B:106:0x02f4, B:109:0x0300, B:112:0x030f, B:115:0x0323, B:118:0x0336, B:120:0x035f, B:123:0x0377, B:127:0x038f, B:130:0x03a6, B:131:0x03b3, B:133:0x03c2, B:136:0x03d2, B:139:0x03df, B:142:0x03f0, B:143:0x03fb, B:145:0x03ec, B:146:0x03db, B:149:0x039e, B:150:0x0386, B:153:0x032c, B:154:0x0318, B:155:0x0309, B:159:0x02d4, B:161:0x02b3), top: B:88:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x052d A[Catch: all -> 0x04cc, TryCatch #1 {all -> 0x04cc, blocks: (B:172:0x043d, B:173:0x0474, B:175:0x047a, B:179:0x0494, B:181:0x04c0, B:185:0x04fa, B:187:0x0509, B:191:0x053c, B:193:0x0513, B:196:0x0520, B:199:0x0531, B:200:0x052d, B:201:0x051c, B:202:0x04cf, B:205:0x04dc, B:208:0x04ed, B:209:0x04e9, B:210:0x04d8, B:211:0x048d), top: B:171:0x043d }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x051c A[Catch: all -> 0x04cc, TryCatch #1 {all -> 0x04cc, blocks: (B:172:0x043d, B:173:0x0474, B:175:0x047a, B:179:0x0494, B:181:0x04c0, B:185:0x04fa, B:187:0x0509, B:191:0x053c, B:193:0x0513, B:196:0x0520, B:199:0x0531, B:200:0x052d, B:201:0x051c, B:202:0x04cf, B:205:0x04dc, B:208:0x04ed, B:209:0x04e9, B:210:0x04d8, B:211:0x048d), top: B:171:0x043d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ca A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:5:0x0046, B:6:0x00a3, B:8:0x00a9, B:11:0x00c1, B:14:0x00d3, B:18:0x00e7, B:21:0x00f0, B:22:0x00fc, B:25:0x0108, B:28:0x0117, B:31:0x012b, B:34:0x013e, B:36:0x0167, B:39:0x017f, B:43:0x0197, B:46:0x01ae, B:47:0x01bb, B:49:0x01ca, B:52:0x01da, B:55:0x01e7, B:58:0x01f8, B:59:0x0203, B:61:0x01f4, B:62:0x01e3, B:65:0x01a6, B:66:0x018e, B:69:0x0134, B:70:0x0120, B:71:0x0111, B:75:0x00dc, B:77:0x00bb), top: B:4:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f4 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:5:0x0046, B:6:0x00a3, B:8:0x00a9, B:11:0x00c1, B:14:0x00d3, B:18:0x00e7, B:21:0x00f0, B:22:0x00fc, B:25:0x0108, B:28:0x0117, B:31:0x012b, B:34:0x013e, B:36:0x0167, B:39:0x017f, B:43:0x0197, B:46:0x01ae, B:47:0x01bb, B:49:0x01ca, B:52:0x01da, B:55:0x01e7, B:58:0x01f8, B:59:0x0203, B:61:0x01f4, B:62:0x01e3, B:65:0x01a6, B:66:0x018e, B:69:0x0134, B:70:0x0120, B:71:0x0111, B:75:0x00dc, B:77:0x00bb), top: B:4:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01e3 A[Catch: all -> 0x00f7, TryCatch #0 {all -> 0x00f7, blocks: (B:5:0x0046, B:6:0x00a3, B:8:0x00a9, B:11:0x00c1, B:14:0x00d3, B:18:0x00e7, B:21:0x00f0, B:22:0x00fc, B:25:0x0108, B:28:0x0117, B:31:0x012b, B:34:0x013e, B:36:0x0167, B:39:0x017f, B:43:0x0197, B:46:0x01ae, B:47:0x01bb, B:49:0x01ca, B:52:0x01da, B:55:0x01e7, B:58:0x01f8, B:59:0x0203, B:61:0x01f4, B:62:0x01e3, B:65:0x01a6, B:66:0x018e, B:69:0x0134, B:70:0x0120, B:71:0x0111, B:75:0x00dc, B:77:0x00bb), top: B:4:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d8  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Sport sport;
        FieldTranslations fieldTranslations;
        FieldTranslations fieldTranslations2;
        nlg V0;
        Boolean bool;
        int i;
        int i2;
        FieldTranslations fieldTranslations3;
        Sport sport2;
        int i3;
        sz8 sz8Var;
        int i4;
        int i5;
        FieldTranslations fieldTranslations4;
        String F0;
        String F02;
        Boolean bool2;
        int i6;
        int i7;
        FieldTranslations fieldTranslations5;
        Sport sport3;
        int i8;
        sz8 sz8Var2;
        int i9;
        int i10;
        FieldTranslations fieldTranslations6;
        String F03;
        String F04;
        int i11 = this.a;
        irj irjVar = this.b;
        switch (i11) {
            case 0:
                sz8 sz8Var3 = irjVar.d;
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V02 = glgVar.V0("SELECT * FROM pinned_tournaments_table");
                try {
                    int r = w1a.r(V02, "id");
                    int r2 = w1a.r(V02, "name");
                    int r3 = w1a.r(V02, "orderIndex");
                    int r4 = w1a.r(V02, "category_id");
                    int r5 = w1a.r(V02, "category_name");
                    int r6 = w1a.r(V02, "category_flag");
                    int r7 = w1a.r(V02, "category_sport_id");
                    int r8 = w1a.r(V02, "category_sport_slug");
                    int r9 = w1a.r(V02, "category_nameTranslation");
                    int r10 = w1a.r(V02, "category_shortNameTranslation");
                    int r11 = w1a.r(V02, "nameTranslation");
                    int r12 = w1a.r(V02, "shortNameTranslation");
                    ArrayList arrayList = new ArrayList();
                    while (V02.U0()) {
                        ArrayList arrayList2 = arrayList;
                        int i12 = (int) V02.getLong(r);
                        String F05 = V02.isNull(r2) ? null : V02.F0(r2);
                        int i13 = r;
                        int i14 = r2;
                        int i15 = (int) V02.getLong(r3);
                        int i16 = (int) V02.getLong(r4);
                        String F06 = V02.F0(r5);
                        String F07 = V02.F0(r6);
                        int i17 = r5;
                        Sport sport4 = new Sport((int) V02.getLong(r7), V02.F0(r8));
                        if (V02.isNull(r9) && V02.isNull(r10)) {
                            sport = sport4;
                            fieldTranslations = null;
                            Category category = new Category(i16, F06, F07, sport, fieldTranslations);
                            if (V02.isNull(r11) && V02.isNull(r12)) {
                                fieldTranslations2 = null;
                                arrayList2.add(new PinnedTournament(i12, F05, category, fieldTranslations2, i15));
                                arrayList = arrayList2;
                                r2 = i14;
                                r5 = i17;
                                r = i13;
                            }
                            fieldTranslations2 = new FieldTranslations(sz8Var3.z(!V02.isNull(r11) ? null : V02.F0(r11)), sz8Var3.z(!V02.isNull(r12) ? null : V02.F0(r12)));
                            arrayList2.add(new PinnedTournament(i12, F05, category, fieldTranslations2, i15));
                            arrayList = arrayList2;
                            r2 = i14;
                            r5 = i17;
                            r = i13;
                        }
                        sport = sport4;
                        fieldTranslations = new FieldTranslations(sz8Var3.z(V02.isNull(r9) ? null : V02.F0(r9)), sz8Var3.z(V02.isNull(r10) ? null : V02.F0(r10)));
                        Category category2 = new Category(i16, F06, F07, sport, fieldTranslations);
                        if (V02.isNull(r11)) {
                            fieldTranslations2 = null;
                            arrayList2.add(new PinnedTournament(i12, F05, category2, fieldTranslations2, i15));
                            arrayList = arrayList2;
                            r2 = i14;
                            r5 = i17;
                            r = i13;
                        }
                        fieldTranslations2 = new FieldTranslations(sz8Var3.z(!V02.isNull(r11) ? null : V02.F0(r11)), sz8Var3.z(!V02.isNull(r12) ? null : V02.F0(r12)));
                        arrayList2.add(new PinnedTournament(i12, F05, category2, fieldTranslations2, i15));
                        arrayList = arrayList2;
                        r2 = i14;
                        r5 = i17;
                        r = i13;
                    }
                    ArrayList arrayList3 = arrayList;
                    V02.close();
                    return arrayList3;
                } finally {
                    V02.close();
                }
            case 1:
                sz8 sz8Var4 = irjVar.d;
                glg glgVar2 = (glg) obj;
                glgVar2.getClass();
                V0 = glgVar2.V0("SELECT * FROM leagues ORDER BY name");
                try {
                    int r13 = w1a.r(V0, "id");
                    int r14 = w1a.r(V0, "name");
                    int r15 = w1a.r(V0, "userCount");
                    int r16 = w1a.r(V0, "hasEventPlayerStatistics");
                    int r17 = w1a.r(V0, "hasBoxScore");
                    int r18 = w1a.r(V0, "displayInverseHomeAwayTeams");
                    int r19 = w1a.r(V0, "groundType");
                    int r20 = w1a.r(V0, "tennisPoints");
                    int r21 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
                    int r22 = w1a.r(V0, "category_id");
                    int r23 = w1a.r(V0, "category_name");
                    int r24 = w1a.r(V0, "category_flag");
                    int r25 = w1a.r(V0, "category_sport_id");
                    int r26 = w1a.r(V0, "category_sport_slug");
                    int r27 = w1a.r(V0, "category_nameTranslation");
                    int r28 = w1a.r(V0, "category_shortNameTranslation");
                    int r29 = w1a.r(V0, "nameTranslation");
                    int r30 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList4 = new ArrayList();
                    while (V0.U0()) {
                        ArrayList arrayList5 = arrayList4;
                        int i18 = r26;
                        int i19 = (int) V0.getLong(r13);
                        String F08 = V0.isNull(r14) ? null : V0.F0(r14);
                        long j = V0.getLong(r15);
                        boolean z = ((int) V0.getLong(r16)) != 0;
                        Integer valueOf = V0.isNull(r17) ? null : Integer.valueOf((int) V0.getLong(r17));
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        boolean z2 = ((int) V0.getLong(r18)) != 0;
                        String F09 = V0.isNull(r19) ? null : V0.F0(r19);
                        Integer valueOf2 = V0.isNull(r20) ? null : Integer.valueOf((int) V0.getLong(r20));
                        Gender b = V0.isNull(r21) ? null : irj.b(V0.F0(r21));
                        int i20 = (int) V0.getLong(r22);
                        String F010 = V0.F0(r23);
                        String F011 = V0.F0(r24);
                        int i21 = r13;
                        int i22 = r23;
                        Sport sport5 = new Sport((int) V0.getLong(r25), V0.F0(i18));
                        int i23 = r27;
                        if (V0.isNull(i23)) {
                            i = r28;
                            if (V0.isNull(i)) {
                                r27 = i23;
                                sport2 = sport5;
                                i2 = r20;
                                sz8Var = sz8Var4;
                                fieldTranslations3 = null;
                                i3 = r19;
                                Category category3 = new Category(i20, F010, F011, sport2, fieldTranslations3);
                                i4 = r29;
                                if (V0.isNull(i4)) {
                                    i5 = r30;
                                } else {
                                    i5 = r30;
                                    if (V0.isNull(i5)) {
                                        r29 = i4;
                                        fieldTranslations4 = null;
                                        arrayList5.add(new UniqueTournament(i19, F08, category3, j, z, bool, z2, F09, valueOf2, b, fieldTranslations4));
                                        r30 = i5;
                                        arrayList4 = arrayList5;
                                        r19 = i3;
                                        r13 = i21;
                                        r20 = i2;
                                        sz8Var4 = sz8Var;
                                        r28 = i;
                                        r26 = i18;
                                        r23 = i22;
                                    }
                                }
                                r29 = i4;
                                fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(!V0.isNull(i5) ? null : V0.F0(i5)));
                                arrayList5.add(new UniqueTournament(i19, F08, category3, j, z, bool, z2, F09, valueOf2, b, fieldTranslations4));
                                r30 = i5;
                                arrayList4 = arrayList5;
                                r19 = i3;
                                r13 = i21;
                                r20 = i2;
                                sz8Var4 = sz8Var;
                                r28 = i;
                                r26 = i18;
                                r23 = i22;
                            }
                        } else {
                            i = r28;
                        }
                        if (V0.isNull(i23)) {
                            r27 = i23;
                            F0 = null;
                        } else {
                            r27 = i23;
                            F0 = V0.F0(i23);
                        }
                        sport2 = sport5;
                        sz8Var = sz8Var4;
                        Map z3 = sz8Var.z(F0);
                        if (V0.isNull(i)) {
                            i2 = r20;
                            F02 = null;
                        } else {
                            i2 = r20;
                            F02 = V0.F0(i);
                        }
                        i3 = r19;
                        fieldTranslations3 = new FieldTranslations(z3, sz8Var.z(F02));
                        Category category32 = new Category(i20, F010, F011, sport2, fieldTranslations3);
                        i4 = r29;
                        if (V0.isNull(i4)) {
                        }
                        r29 = i4;
                        fieldTranslations4 = new FieldTranslations(sz8Var.z(!V0.isNull(i4) ? null : V0.F0(i4)), sz8Var.z(!V0.isNull(i5) ? null : V0.F0(i5)));
                        arrayList5.add(new UniqueTournament(i19, F08, category32, j, z, bool, z2, F09, valueOf2, b, fieldTranslations4));
                        r30 = i5;
                        arrayList4 = arrayList5;
                        r19 = i3;
                        r13 = i21;
                        r20 = i2;
                        sz8Var4 = sz8Var;
                        r28 = i;
                        r26 = i18;
                        r23 = i22;
                    }
                    ArrayList arrayList6 = arrayList4;
                    V0.close();
                    return arrayList6;
                } finally {
                }
            default:
                sz8 sz8Var5 = irjVar.d;
                glg glgVar3 = (glg) obj;
                glgVar3.getClass();
                V0 = glgVar3.V0("SELECT * FROM leagues ORDER BY name");
                try {
                    int r31 = w1a.r(V0, "id");
                    int r32 = w1a.r(V0, "name");
                    int r33 = w1a.r(V0, "userCount");
                    int r34 = w1a.r(V0, "hasEventPlayerStatistics");
                    int r35 = w1a.r(V0, "hasBoxScore");
                    int r36 = w1a.r(V0, "displayInverseHomeAwayTeams");
                    int r37 = w1a.r(V0, "groundType");
                    int r38 = w1a.r(V0, "tennisPoints");
                    int r39 = w1a.r(V0, InneractiveMediationDefs.KEY_GENDER);
                    int r40 = w1a.r(V0, "category_id");
                    int r41 = w1a.r(V0, "category_name");
                    int r42 = w1a.r(V0, "category_flag");
                    int r43 = w1a.r(V0, "category_sport_id");
                    int r44 = w1a.r(V0, "category_sport_slug");
                    int r45 = w1a.r(V0, "category_nameTranslation");
                    int r46 = w1a.r(V0, "category_shortNameTranslation");
                    int r47 = w1a.r(V0, "nameTranslation");
                    int r48 = w1a.r(V0, "shortNameTranslation");
                    ArrayList arrayList7 = new ArrayList();
                    while (V0.U0()) {
                        ArrayList arrayList8 = arrayList7;
                        int i24 = r44;
                        int i25 = (int) V0.getLong(r31);
                        String F012 = V0.isNull(r32) ? null : V0.F0(r32);
                        long j2 = V0.getLong(r33);
                        boolean z4 = ((int) V0.getLong(r34)) != 0;
                        Integer valueOf3 = V0.isNull(r35) ? null : Integer.valueOf((int) V0.getLong(r35));
                        if (valueOf3 != null) {
                            bool2 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        boolean z5 = ((int) V0.getLong(r36)) != 0;
                        String F013 = V0.isNull(r37) ? null : V0.F0(r37);
                        Integer valueOf4 = V0.isNull(r38) ? null : Integer.valueOf((int) V0.getLong(r38));
                        Gender b2 = V0.isNull(r39) ? null : irj.b(V0.F0(r39));
                        int i26 = (int) V0.getLong(r40);
                        String F014 = V0.F0(r41);
                        String F015 = V0.F0(r42);
                        int i27 = r31;
                        int i28 = r41;
                        Sport sport6 = new Sport((int) V0.getLong(r43), V0.F0(i24));
                        int i29 = r45;
                        if (V0.isNull(i29)) {
                            i6 = r46;
                            if (V0.isNull(i6)) {
                                r45 = i29;
                                sport3 = sport6;
                                i7 = r38;
                                sz8Var2 = sz8Var5;
                                fieldTranslations5 = null;
                                i8 = r37;
                                Category category4 = new Category(i26, F014, F015, sport3, fieldTranslations5);
                                i9 = r47;
                                if (V0.isNull(i9)) {
                                    i10 = r48;
                                } else {
                                    i10 = r48;
                                    if (V0.isNull(i10)) {
                                        r47 = i9;
                                        fieldTranslations6 = null;
                                        arrayList8.add(new UniqueTournament(i25, F012, category4, j2, z4, bool2, z5, F013, valueOf4, b2, fieldTranslations6));
                                        r48 = i10;
                                        arrayList7 = arrayList8;
                                        r37 = i8;
                                        r31 = i27;
                                        r38 = i7;
                                        sz8Var5 = sz8Var2;
                                        r46 = i6;
                                        r44 = i24;
                                        r41 = i28;
                                    }
                                }
                                r47 = i9;
                                fieldTranslations6 = new FieldTranslations(sz8Var2.z(!V0.isNull(i9) ? null : V0.F0(i9)), sz8Var2.z(!V0.isNull(i10) ? null : V0.F0(i10)));
                                arrayList8.add(new UniqueTournament(i25, F012, category4, j2, z4, bool2, z5, F013, valueOf4, b2, fieldTranslations6));
                                r48 = i10;
                                arrayList7 = arrayList8;
                                r37 = i8;
                                r31 = i27;
                                r38 = i7;
                                sz8Var5 = sz8Var2;
                                r46 = i6;
                                r44 = i24;
                                r41 = i28;
                            }
                        } else {
                            i6 = r46;
                        }
                        if (V0.isNull(i29)) {
                            r45 = i29;
                            F03 = null;
                        } else {
                            r45 = i29;
                            F03 = V0.F0(i29);
                        }
                        sport3 = sport6;
                        sz8Var2 = sz8Var5;
                        Map z6 = sz8Var2.z(F03);
                        if (V0.isNull(i6)) {
                            i7 = r38;
                            F04 = null;
                        } else {
                            i7 = r38;
                            F04 = V0.F0(i6);
                        }
                        i8 = r37;
                        fieldTranslations5 = new FieldTranslations(z6, sz8Var2.z(F04));
                        Category category42 = new Category(i26, F014, F015, sport3, fieldTranslations5);
                        i9 = r47;
                        if (V0.isNull(i9)) {
                        }
                        r47 = i9;
                        fieldTranslations6 = new FieldTranslations(sz8Var2.z(!V0.isNull(i9) ? null : V0.F0(i9)), sz8Var2.z(!V0.isNull(i10) ? null : V0.F0(i10)));
                        arrayList8.add(new UniqueTournament(i25, F012, category42, j2, z4, bool2, z5, F013, valueOf4, b2, fieldTranslations6));
                        r48 = i10;
                        arrayList7 = arrayList8;
                        r37 = i8;
                        r31 = i27;
                        r38 = i7;
                        sz8Var5 = sz8Var2;
                        r46 = i6;
                        r44 = i24;
                        r41 = i28;
                    }
                    ArrayList arrayList9 = arrayList7;
                    V0.close();
                    return arrayList9;
                } finally {
                }
        }
    }
}
