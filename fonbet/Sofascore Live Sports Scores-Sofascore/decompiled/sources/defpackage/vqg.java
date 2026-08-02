package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.database.DbSavedSearches;
import com.sofascore.model.network.response.serializers.ScoringTeamSerializer;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vqg implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ vqg(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p80 p80Var;
        int _init_$lambda$0;
        TeamSide _init_$lambda$1;
        int i = 0;
        r10 = null;
        rl5 rl5Var = null;
        r10 = null;
        qah qahVar = null;
        r10 = null;
        lej lejVar = null;
        r10 = null;
        ebb ebbVar = null;
        r10 = null;
        fbb fbbVar = null;
        r10 = null;
        mek mekVar = null;
        r10 = null;
        eok eokVar = null;
        r10 = null;
        pwh pwhVar = null;
        r10 = null;
        g8e g8eVar = null;
        r10 = null;
        iej iejVar = null;
        switch (this.a) {
            case 0:
                if (Intrinsics.c(obj, Boolean.FALSE)) {
                    return new dnd(9205357640488583168L);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float floatValue = f.floatValue();
                Object obj3 = list.get(1);
                (obj3 != null ? (Float) obj3 : null).getClass();
                return new dnd((Float.floatToRawIntBits(floatValue) << 32) | (Float.floatToRawIntBits(r10.floatValue()) & 4294967295L));
            case 1:
                obj.getClass();
                List list2 = (List) obj;
                ArrayList arrayList = new ArrayList(list2.size());
                int size = list2.size();
                while (i < size) {
                    Object obj4 = list2.get(i);
                    dib dibVar = (Intrinsics.c(obj4, Boolean.FALSE) || obj4 == null) ? null : (dib) ((Function1) yqg.B.c).invoke(obj4);
                    dibVar.getClass();
                    arrayList.add(dibVar);
                    i++;
                }
                return new eib(arrayList);
            case 2:
                obj.getClass();
                String str = (String) obj;
                Locale forLanguageTag = Locale.forLanguageTag(str);
                if (Intrinsics.c(forLanguageTag.toLanguageTag(), C.LANGUAGE_UNDETERMINED)) {
                    System.err.println("The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new dib(forLanguageTag);
            case 3:
                obj.getClass();
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                String str2 = obj5 != null ? (String) obj5 : null;
                str2.getClass();
                Object obj6 = list3.get(1);
                y3g y3gVar = yqg.j;
                if (!Intrinsics.c(obj6, Boolean.FALSE) && obj6 != null) {
                    iejVar = (iej) ((Function1) y3gVar.c).invoke(obj6);
                }
                return new ebb(str2, iejVar);
            case 4:
                obj.getClass();
                List list4 = (List) obj;
                Object obj7 = list4.get(0);
                float f2 = o7b.b;
                xqg xqgVar = yqg.D;
                Boolean bool = Boolean.FALSE;
                Intrinsics.c(obj7, bool);
                o7b o7bVar = obj7 != null ? (o7b) xqgVar.b.invoke(obj7) : null;
                o7bVar.getClass();
                float f3 = o7bVar.a;
                Object obj8 = list4.get(1);
                xqg xqgVar2 = yqg.E;
                Intrinsics.c(obj8, bool);
                q7b q7bVar = obj8 != null ? (q7b) xqgVar2.b.invoke(obj8) : null;
                q7bVar.getClass();
                int i2 = q7bVar.a;
                Object obj9 = list4.get(2);
                xqg xqgVar3 = yqg.F;
                Intrinsics.c(obj9, bool);
                p7b p7bVar = obj9 != null ? (p7b) xqgVar3.b.invoke(obj9) : null;
                p7bVar.getClass();
                return new r7b(f3, i2, p7bVar.a);
            case 5:
                obj.getClass();
                float floatValue2 = ((Float) obj).floatValue();
                o7b.a(floatValue2);
                return new o7b(floatValue2);
            case 6:
                obj.getClass();
                return new q7b(((Integer) obj).intValue());
            case 7:
                obj.getClass();
                List list5 = (List) obj;
                Object obj10 = list5.get(0);
                u80 u80Var = obj10 != null ? (u80) obj10 : null;
                u80Var.getClass();
                Object obj11 = list5.get(2);
                Integer num = obj11 != null ? (Integer) obj11 : null;
                num.getClass();
                int intValue = num.intValue();
                Object obj12 = list5.get(3);
                Integer num2 = obj12 != null ? (Integer) obj12 : null;
                num2.getClass();
                int intValue2 = num2.intValue();
                Object obj13 = list5.get(4);
                String str3 = obj13 != null ? (String) obj13 : null;
                str3.getClass();
                switch (u80Var.ordinal()) {
                    case 0:
                        Object obj14 = list5.get(1);
                        y3g y3gVar2 = yqg.h;
                        if (!Intrinsics.c(obj14, Boolean.FALSE) && obj14 != null) {
                            g8eVar = (g8e) ((Function1) y3gVar2.c).invoke(obj14);
                        }
                        g8eVar.getClass();
                        p80Var = new p80(g8eVar, str3, intValue, intValue2);
                        break;
                    case 1:
                        Object obj15 = list5.get(1);
                        y3g y3gVar3 = yqg.i;
                        if (!Intrinsics.c(obj15, Boolean.FALSE) && obj15 != null) {
                            pwhVar = (pwh) ((Function1) y3gVar3.c).invoke(obj15);
                        }
                        pwhVar.getClass();
                        p80Var = new p80(pwhVar, str3, intValue, intValue2);
                        break;
                    case 2:
                        Object obj16 = list5.get(1);
                        y3g y3gVar4 = yqg.d;
                        if (!Intrinsics.c(obj16, Boolean.FALSE) && obj16 != null) {
                            eokVar = (eok) ((Function1) y3gVar4.c).invoke(obj16);
                        }
                        eokVar.getClass();
                        p80Var = new p80(eokVar, str3, intValue, intValue2);
                        break;
                    case 3:
                        Object obj17 = list5.get(1);
                        y3g y3gVar5 = yqg.e;
                        if (!Intrinsics.c(obj17, Boolean.FALSE) && obj17 != null) {
                            mekVar = (mek) ((Function1) y3gVar5.c).invoke(obj17);
                        }
                        mekVar.getClass();
                        p80Var = new p80(mekVar, str3, intValue, intValue2);
                        break;
                    case 4:
                        Object obj18 = list5.get(1);
                        y3g y3gVar6 = yqg.f;
                        if (!Intrinsics.c(obj18, Boolean.FALSE) && obj18 != null) {
                            fbbVar = (fbb) ((Function1) y3gVar6.c).invoke(obj18);
                        }
                        fbbVar.getClass();
                        p80Var = new p80(fbbVar, str3, intValue, intValue2);
                        break;
                    case 5:
                        Object obj19 = list5.get(1);
                        y3g y3gVar7 = yqg.g;
                        if (!Intrinsics.c(obj19, Boolean.FALSE) && obj19 != null) {
                            ebbVar = (ebb) ((Function1) y3gVar7.c).invoke(obj19);
                        }
                        ebbVar.getClass();
                        p80Var = new p80(ebbVar, str3, intValue, intValue2);
                        break;
                    case 6:
                        Object obj20 = list5.get(1);
                        String str4 = obj20 != null ? (String) obj20 : null;
                        str4.getClass();
                        p80Var = new p80(new ohi(str4), str3, intValue, intValue2);
                        break;
                    default:
                        zzl.b();
                        return null;
                }
                return p80Var;
            case 8:
                obj.getClass();
                return new p7b(((Integer) obj).intValue());
            case 9:
                String str5 = obj != null ? (String) obj : null;
                str5.getClass();
                return new eok(str5);
            case 10:
                String str6 = obj != null ? (String) obj : null;
                str6.getClass();
                return new mek(str6);
            case 11:
                obj.getClass();
                List list6 = (List) obj;
                Object obj21 = list6.get(0);
                xqg xqgVar4 = yqg.s;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.c(obj21, bool2);
                p7j p7jVar = obj21 != null ? (p7j) xqgVar4.b.invoke(obj21) : null;
                p7jVar.getClass();
                int i3 = p7jVar.a;
                Object obj22 = list6.get(1);
                xqg xqgVar5 = yqg.t;
                Intrinsics.c(obj22, bool2);
                z8j z8jVar = obj22 != null ? (z8j) xqgVar5.b.invoke(obj22) : null;
                z8jVar.getClass();
                int i4 = z8jVar.a;
                Object obj23 = list6.get(2);
                mfj[] mfjVarArr = lfj.b;
                xqg xqgVar6 = yqg.x;
                Intrinsics.c(obj23, bool2);
                lfj lfjVar = obj23 != null ? (lfj) xqgVar6.b.invoke(obj23) : null;
                lfjVar.getClass();
                long j = lfjVar.a;
                Object obj24 = list6.get(3);
                bdj bdjVar = bdj.c;
                bdj bdjVar2 = (Intrinsics.c(obj24, bool2) || obj24 == null) ? null : (bdj) ((Function1) yqg.m.c).invoke(obj24);
                Object obj25 = list6.get(4);
                aje ajeVar = (Intrinsics.c(obj25, bool2) || obj25 == null) ? null : (aje) ((Function1) fcp.e.c).invoke(obj25);
                Object obj26 = list6.get(5);
                r7b r7bVar = r7b.d;
                r7b r7bVar2 = (Intrinsics.c(obj26, bool2) || obj26 == null) ? null : (r7b) ((Function1) yqg.C.c).invoke(obj26);
                Object obj27 = list6.get(6);
                l7b l7bVar = (Intrinsics.c(obj27, bool2) || obj27 == null) ? null : (l7b) ((Function1) fcp.g.c).invoke(obj27);
                l7bVar.getClass();
                int i5 = l7bVar.a;
                Object obj28 = list6.get(7);
                xqg xqgVar7 = yqg.u;
                Intrinsics.c(obj28, bool2);
                ql9 ql9Var = obj28 != null ? (ql9) xqgVar7.b.invoke(obj28) : null;
                ql9Var.getClass();
                int i6 = ql9Var.a;
                Object obj29 = list6.get(8);
                y3g y3gVar8 = fcp.h;
                if (!Intrinsics.c(obj29, bool2) && obj29 != null) {
                    lejVar = (lej) ((Function1) y3gVar8.c).invoke(obj29);
                }
                return new g8e(i3, i4, j, bdjVar2, ajeVar, r7bVar2, i5, i6, lejVar);
            case 12:
                obj.getClass();
                List list7 = (List) obj;
                Object obj30 = list7.get(0);
                int i7 = r13.j;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.c(obj30, bool3);
                r13 r13Var = obj30 != null ? obj30.equals(bool3) ? new r13(r13.i) : new r13(hkg.b(((Integer) obj30).intValue())) : null;
                r13Var.getClass();
                long j2 = r13Var.a;
                Object obj31 = list7.get(1);
                mfj[] mfjVarArr2 = lfj.b;
                Function1 function1 = yqg.x.b;
                Intrinsics.c(obj31, bool3);
                lfj lfjVar2 = obj31 != null ? (lfj) function1.invoke(obj31) : null;
                lfjVar2.getClass();
                long j3 = lfjVar2.a;
                Object obj32 = list7.get(2);
                wg8 wg8Var = wg8.b;
                wg8 wg8Var2 = (Intrinsics.c(obj32, bool3) || obj32 == null) ? null : (wg8) ((Function1) yqg.n.c).invoke(obj32);
                Object obj33 = list7.get(3);
                rg8 rg8Var = (Intrinsics.c(obj33, bool3) || obj33 == null) ? null : (rg8) ((Function1) yqg.v.c).invoke(obj33);
                Object obj34 = list7.get(4);
                sg8 sg8Var = (Intrinsics.c(obj34, bool3) || obj34 == null) ? null : (sg8) ((Function1) yqg.w.c).invoke(obj34);
                Object obj35 = list7.get(6);
                String str7 = obj35 != null ? (String) obj35 : null;
                Object obj36 = list7.get(7);
                Intrinsics.c(obj36, bool3);
                lfj lfjVar3 = obj36 != null ? (lfj) function1.invoke(obj36) : null;
                lfjVar3.getClass();
                long j4 = lfjVar3.a;
                Object obj37 = list7.get(8);
                sn1 sn1Var = (Intrinsics.c(obj37, bool3) || obj37 == null) ? null : (sn1) ((Function1) yqg.o.c).invoke(obj37);
                Object obj38 = list7.get(9);
                zcj zcjVar = (Intrinsics.c(obj38, bool3) || obj38 == null) ? null : (zcj) ((Function1) yqg.l.c).invoke(obj38);
                Object obj39 = list7.get(10);
                eib eibVar = eib.c;
                eib eibVar2 = (Intrinsics.c(obj39, bool3) || obj39 == null) ? null : (eib) ((Function1) yqg.A.c).invoke(obj39);
                Object obj40 = list7.get(11);
                Intrinsics.c(obj40, bool3);
                r13 r13Var2 = obj40 != null ? obj40.equals(bool3) ? new r13(r13.i) : new r13(hkg.b(((Integer) obj40).intValue())) : null;
                r13Var2.getClass();
                long j5 = r13Var2.a;
                Object obj41 = list7.get(12);
                v8j v8jVar = (Intrinsics.c(obj41, bool3) || obj41 == null) ? null : (v8j) ((Function1) yqg.k.c).invoke(obj41);
                Object obj42 = list7.get(13);
                qah qahVar2 = qah.d;
                y3g y3gVar9 = yqg.q;
                if (!Intrinsics.c(obj42, bool3) && obj42 != null) {
                    qahVar = (qah) ((Function1) y3gVar9.c).invoke(obj42);
                }
                return new pwh(j2, j3, wg8Var2, rg8Var, sg8Var, (tf8) null, str7, j4, sn1Var, zcjVar, eibVar2, j5, v8jVar, qahVar, 49184);
            case 13:
                obj.getClass();
                List list8 = (List) obj;
                Object obj43 = list8.get(0);
                Boolean bool4 = obj43 != null ? (Boolean) obj43 : null;
                bool4.getClass();
                boolean booleanValue = bool4.booleanValue();
                Object obj44 = list8.get(1);
                y3g y3gVar10 = fcp.f;
                if (!Intrinsics.c(obj44, Boolean.FALSE) && obj44 != null) {
                    rl5Var = (rl5) ((Function1) y3gVar10.c).invoke(obj44);
                }
                rl5Var.getClass();
                return new aje(rl5Var.a, booleanValue);
            case 14:
                obj.getClass();
                return new rl5(((Integer) obj).intValue());
            case 15:
                obj.getClass();
                return new l7b(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                List list9 = (List) obj;
                Object obj45 = list9.get(0);
                kej kejVar = (Intrinsics.c(obj45, Boolean.FALSE) || obj45 == null) ? null : (kej) ((Function1) fcp.i.c).invoke(obj45);
                kejVar.getClass();
                int i8 = kejVar.a;
                Object obj46 = list9.get(1);
                Boolean bool5 = obj46 != null ? (Boolean) obj46 : null;
                bool5.getClass();
                return new lej(i8, bool5.booleanValue());
            case 17:
                obj.getClass();
                return new kej(((Integer) obj).intValue());
            case 18:
                _init_$lambda$0 = ScoringTeamSerializer._init_$lambda$0((TeamSide) obj);
                return Integer.valueOf(_init_$lambda$0);
            case 19:
                _init_$lambda$1 = ScoringTeamSerializer._init_$lambda$1(((Integer) obj).intValue());
                return _init_$lambda$1;
            case 20:
                return new qug(((Integer) obj).intValue());
            case 21:
                vze vzeVar = (vze) obj;
                if (vzeVar != null && vzeVar.a == 2) {
                    i = 1;
                }
                return Boolean.valueOf(i ^ 1);
            case 22:
                glg glgVar = (glg) obj;
                glgVar.getClass();
                nlg V0 = glgVar.V0("SELECT * FROM saved_searches_table");
                try {
                    int r = w1a.r(V0, "id");
                    int r2 = w1a.r(V0, "entity");
                    int r3 = w1a.r(V0, "json");
                    int r4 = w1a.r(V0, "timestamp");
                    ArrayList arrayList2 = new ArrayList();
                    while (V0.U0()) {
                        arrayList2.add(new DbSavedSearches((int) V0.getLong(r), V0.F0(r2), V0.F0(r3), V0.getLong(r4)));
                    }
                    return arrayList2;
                } finally {
                    V0.close();
                }
            case 23:
                String str8 = (String) obj;
                str8.getClass();
                return Long.valueOf(StringsKt.l0(str8).toString().length() == 0 ? 0L : 300L);
            case 24:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 25:
                ((r60) obj).getClass();
                return l98.l0(uo5.e(null, 3), uo5.f(null, 3));
            case 26:
                gyg gygVar = (gyg) obj;
                gygVar.getClass();
                return gyg.a(gygVar, null, null, null, rlh.b, null, 63);
            case 27:
                ((Integer) obj).getClass();
                return utc.a;
            case 28:
                int i9 = SegmentedButtonsView.m;
                ((List) obj).getClass();
                return Boolean.FALSE;
            default:
                ((List) obj).getClass();
                return Boolean.valueOf(!r0.isEmpty());
        }
    }
}
