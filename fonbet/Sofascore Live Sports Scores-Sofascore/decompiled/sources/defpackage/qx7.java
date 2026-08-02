package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaType;
import com.sofascore.model.newNetwork.mediaposts.PersonalizedMediaPost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class qx7 extends a7e {
    public final u8c b;
    public final k6c c;
    public final a38 d;
    public int e;
    public int f;

    public qx7(u8c u8cVar, k6c k6cVar, a38 a38Var) {
        u8cVar.getClass();
        k6cVar.getClass();
        this.b = u8cVar;
        this.c = k6cVar;
        this.d = a38Var;
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        return null;
    }

    @Override // defpackage.a7e
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        return s9a.r(new ox7(y6eVar, this, null), sq3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0168 -> B:10:0x016b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, sq3 sq3Var) {
        nx7 nx7Var;
        int i;
        List list2;
        Set set;
        nx7 nx7Var2;
        ArrayList arrayList;
        int i2;
        PersonalizedMediaPost personalizedMediaPost;
        ArrayList arrayList2;
        qx7 qx7Var = this;
        a38 a38Var = qx7Var.d;
        tx7 tx7Var = a38Var.b;
        nf2 nf2Var = a38Var.a;
        if (sq3Var instanceof nx7) {
            nx7Var = (nx7) sq3Var;
            int i3 = nx7Var.x;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nx7Var.x = i3 - Integer.MIN_VALUE;
                Object obj = nx7Var.v;
                lu3 lu3Var = lu3.a;
                i = nx7Var.x;
                if (i != 0) {
                    y6a.M(obj);
                    Set W0 = CollectionsKt.W0(nf2Var.f);
                    ArrayList arrayList3 = new ArrayList();
                    if (qx7Var.f == 0 && (personalizedMediaPost = (PersonalizedMediaPost) CollectionsKt.Z(nf2Var.a)) != null && personalizedMediaPost.getId() == -99999) {
                        arrayList3.add(new fdd());
                        qx7Var.f = 1;
                    }
                    list2 = list;
                    set = W0;
                    nx7Var2 = nx7Var;
                    arrayList = arrayList3;
                    i2 = 0;
                    while (i2 < list2.size()) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i4 = nx7Var.u;
                ?? r4 = nx7Var.t;
                Set set2 = nx7Var.s;
                List list3 = nx7Var.r;
                y6a.M(obj);
                nx7Var2 = nx7Var;
                i2 = i4;
                list2 = list3;
                ArrayList arrayList4 = r4;
                f41 f41Var = (f41) obj;
                if (f41Var == null) {
                    arrayList4.add(f41Var);
                    qx7Var.f++;
                    arrayList = arrayList4;
                    set = set2;
                } else {
                    arrayList = arrayList4;
                    set = set2;
                    arrayList.add(list2.get(i2));
                    i2++;
                    qx7Var.f++;
                }
                while (i2 < list2.size()) {
                    int i5 = qx7Var.f;
                    ia0 ia0Var = ia0.q;
                    boolean z = mz1.C() && (i5 == 7 || (i5 > 7 && i5 % 10 == 6));
                    int i6 = qx7Var.f;
                    if (z) {
                        qx7Var.f = i6 + 1;
                    } else {
                        kxh kxhVar = (i6 == 4 || (i6 > 4 && i6 % 10 == 4)) ? kxh.a : (i6 == 5 || (i6 > 5 && i6 % 10 == 5)) ? kxh.b : (i6 == 12 || (i6 > 12 && i6 % 10 == 2)) ? kxh.c : (i6 <= 0 || i6 % 10 != 9) ? null : kxh.d;
                        if (kxhVar != null) {
                            nx7Var2.r = list2;
                            nx7Var2.s = set;
                            nx7Var2.t = arrayList;
                            nx7Var2.u = i2;
                            nx7Var2.x = 1;
                            int ordinal = kxhVar.ordinal();
                            if (ordinal == 0) {
                                arrayList2 = arrayList;
                                qx7Var = this;
                                obj = s9a.r(new mx7(tx7Var.a, CollectionsKt.S0(nf2Var.b), qx7Var, set, null, 1), nx7Var2);
                            } else if (ordinal == 1) {
                                arrayList2 = arrayList;
                                qx7Var = this;
                                obj = s9a.r(new mx7(tx7Var.b, CollectionsKt.S0(nf2Var.c), qx7Var, set, null, 2), nx7Var2);
                            } else if (ordinal == 2) {
                                arrayList2 = arrayList;
                                qx7Var = this;
                                obj = s9a.r(new mx7(tx7Var.d, CollectionsKt.S0(nf2Var.d), qx7Var, set, null, 0), nx7Var2);
                            } else {
                                if (ordinal != 3) {
                                    zzl.b();
                                    return null;
                                }
                                arrayList2 = arrayList;
                                obj = s9a.r(new mx7(tx7Var.c, CollectionsKt.S0(nf2Var.e), qx7Var, set, null, 3), nx7Var2);
                                qx7Var = this;
                            }
                            if (obj == lu3Var) {
                                return lu3Var;
                            }
                            set2 = set;
                            arrayList4 = arrayList2;
                            f41 f41Var2 = (f41) obj;
                            if (f41Var2 == null) {
                            }
                            while (i2 < list2.size()) {
                            }
                        } else {
                            arrayList.add(list2.get(i2));
                            i2++;
                            qx7Var.f++;
                        }
                    }
                }
                return arrayList;
            }
        }
        nx7Var = new nx7(qx7Var, sq3Var);
        Object obj2 = nx7Var.v;
        lu3 lu3Var2 = lu3.a;
        i = nx7Var.x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0369 A[LOOP:16: B:179:0x0363->B:181:0x0369, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f A[LOOP:1: B:22:0x0099->B:24:0x009f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[LOOP:3: B:38:0x00e1->B:40:0x00e7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f A[LOOP:5: B:54:0x0129->B:56:0x012f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177 A[LOOP:7: B:70:0x0171->B:72:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Set set, sq3 sq3Var) {
        px7 px7Var;
        int i;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        Iterator it6;
        Iterator it7;
        List H0;
        List list;
        Iterator it8;
        PersonalizedMediaPost personalizedMediaPost;
        PersonalizedMediaPost personalizedMediaPost2;
        a38 a38Var = this.d;
        nf2 nf2Var = a38Var.a;
        if (sq3Var instanceof px7) {
            px7Var = (px7) sq3Var;
            int i2 = px7Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                px7Var.t = i2 - Integer.MIN_VALUE;
                Object obj = px7Var.r;
                lu3 lu3Var = lu3.a;
                i = px7Var.t;
                PersonalizedMediaPost personalizedMediaPost3 = null;
                if (i != 0) {
                    y6a.M(obj);
                    nf2Var.b.clear();
                    nf2Var.c.clear();
                    nf2Var.d.clear();
                    nf2Var.e.clear();
                    px7Var.t = 1;
                    u8c u8cVar = this.b;
                    u8cVar.getClass();
                    obj = s9a.r(new o46(this.c, u8cVar, set, (rq3) null), px7Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list2 = (List) obj;
                Set set2 = nf2Var.e;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (((PersonalizedMediaPost) obj2).getType() == MediaType.YTShortVideo) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    w1l.A(arrayList2, ((PersonalizedMediaPost) it.next()).getId());
                }
                set2.addAll(arrayList2);
                Set set3 = nf2Var.c;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (((PersonalizedMediaPost) obj3).getType() == MediaType.ExternalVideo) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k13.r(arrayList3, 10));
                it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    w1l.A(arrayList4, ((PersonalizedMediaPost) it2.next()).getId());
                }
                set3.addAll(arrayList4);
                Set set4 = nf2Var.d;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list2) {
                    if (((PersonalizedMediaPost) obj4).getType() == MediaType.InfluencerVideo) {
                        arrayList5.add(obj4);
                    }
                }
                ArrayList arrayList6 = new ArrayList(k13.r(arrayList5, 10));
                it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    w1l.A(arrayList6, ((PersonalizedMediaPost) it3.next()).getId());
                }
                set4.addAll(arrayList6);
                Set set5 = nf2Var.b;
                ArrayList arrayList7 = new ArrayList();
                for (Object obj5 : list2) {
                    if (((PersonalizedMediaPost) obj5).getType() == MediaType.NewsArticle) {
                        arrayList7.add(obj5);
                    }
                }
                ArrayList arrayList8 = new ArrayList(k13.r(arrayList7, 10));
                it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    w1l.A(arrayList8, ((PersonalizedMediaPost) it4.next()).getId());
                }
                set5.addAll(arrayList8);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj6 : list2) {
                    if (!CollectionsKt.R(b.j(MediaType.YTShortVideo, MediaType.ExternalVideo, MediaType.NewsArticle, MediaType.InfluencerVideo), ((PersonalizedMediaPost) obj6).getType())) {
                        arrayList9.add(obj6);
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                it5 = arrayList9.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    PersonalizedMediaPost personalizedMediaPost4 = (PersonalizedMediaPost) next;
                    if (personalizedMediaPost4.getEventId() != null) {
                        jp5 entries = MediaType.getEntries();
                        ArrayList arrayList12 = new ArrayList();
                        for (Object obj7 : entries) {
                            if (((MediaType) obj7).getIsStackable()) {
                                arrayList12.add(obj7);
                            }
                        }
                        if (CollectionsKt.R(arrayList12, personalizedMediaPost4.getType())) {
                            arrayList10.add(next);
                        }
                    }
                    arrayList11.add(next);
                }
                ArrayList arrayList13 = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                it6 = arrayList10.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    Integer eventId = ((PersonalizedMediaPost) next2).getEventId();
                    Object obj8 = linkedHashMap.get(eventId);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap.put(eventId, obj8);
                    }
                    ((List) obj8).add(next2);
                }
                ArrayList arrayList14 = new ArrayList();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Integer num = (Integer) entry.getKey();
                    List list3 = (List) entry.getValue();
                    if (list3.size() < 3) {
                        arrayList13.addAll(list3);
                        personalizedMediaPost = personalizedMediaPost3;
                        personalizedMediaPost2 = personalizedMediaPost;
                    } else {
                        num.getClass();
                        int intValue = num.intValue();
                        MediaType mediaType = MediaType.GroupPost;
                        Iterator it9 = list3.iterator();
                        if (!it9.hasNext()) {
                            PersonalizedMediaPost personalizedMediaPost5 = personalizedMediaPost3;
                            yhk.d();
                            return personalizedMediaPost5;
                        }
                        long createdAtTimestamp = ((PersonalizedMediaPost) it9.next()).getCreatedAtTimestamp();
                        while (it9.hasNext()) {
                            long createdAtTimestamp2 = ((PersonalizedMediaPost) it9.next()).getCreatedAtTimestamp();
                            if (createdAtTimestamp < createdAtTimestamp2) {
                                createdAtTimestamp = createdAtTimestamp2;
                            }
                        }
                        ArrayList arrayList15 = new ArrayList();
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            PersonalizedMediaPost personalizedMediaPost6 = personalizedMediaPost3;
                            Double finalScore = ((PersonalizedMediaPost) it10.next()).getFinalScore();
                            if (finalScore != null) {
                                arrayList15.add(finalScore);
                            }
                            personalizedMediaPost3 = personalizedMediaPost6;
                        }
                        personalizedMediaPost = personalizedMediaPost3;
                        personalizedMediaPost2 = new PersonalizedMediaPost(num, intValue, mediaType, createdAtTimestamp, list3, CollectionsKt.l0(arrayList15), false, 64, null);
                    }
                    if (personalizedMediaPost2 != null) {
                        arrayList14.add(personalizedMediaPost2);
                    }
                    personalizedMediaPost3 = personalizedMediaPost;
                }
                ArrayList w0 = CollectionsKt.w0(arrayList13, CollectionsKt.w0(arrayList11, arrayList14));
                ArrayList arrayList16 = new ArrayList();
                ArrayList arrayList17 = new ArrayList();
                it7 = w0.iterator();
                while (it7.hasNext()) {
                    Object next3 = it7.next();
                    if (((PersonalizedMediaPost) next3).getPinnedPost()) {
                        arrayList16.add(next3);
                    } else {
                        arrayList17.add(next3);
                    }
                }
                yea yeaVar = j58.a;
                if (fn0.B("sort_by_final_score")) {
                    H0 = CollectionsKt.H0(arrayList17, new wpb(8));
                } else {
                    w5d w5dVar = w5d.a;
                    w5dVar.getClass();
                    H0 = CollectionsKt.H0(arrayList17, new cp(new n93(w5dVar, 1), 22));
                }
                ArrayList w02 = CollectionsKt.w0(H0, arrayList16);
                list = a38Var.c;
                ArrayList arrayList18 = new ArrayList(k13.r(w02, 10));
                it8 = w02.iterator();
                while (it8.hasNext()) {
                    w1l.A(arrayList18, ((PersonalizedMediaPost) it8.next()).getId());
                }
                if (!list.isEmpty()) {
                    list.addAll(arrayList18);
                } else if (list.containsAll(arrayList18) && nf2Var.a.isEmpty()) {
                    list.clear();
                    list.addAll(arrayList18);
                    if (!w02.isEmpty()) {
                        w02 = CollectionsKt.w0(w02, a.c(new PersonalizedMediaPost(null, -99999, null, System.currentTimeMillis(), km5.a, null, false, 64, null)));
                    }
                } else {
                    list.clear();
                    list.addAll(arrayList18);
                }
                nf2Var.a.addAll(w02);
                return Unit.a;
            }
        }
        px7Var = new px7(this, sq3Var);
        Object obj9 = px7Var.r;
        lu3 lu3Var2 = lu3.a;
        i = px7Var.t;
        PersonalizedMediaPost personalizedMediaPost32 = null;
        if (i != 0) {
        }
        List list22 = (List) obj9;
        Set set22 = nf2Var.e;
        ArrayList arrayList19 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(k13.r(arrayList19, 10));
        it = arrayList19.iterator();
        while (it.hasNext()) {
        }
        set22.addAll(arrayList22);
        Set set32 = nf2Var.c;
        ArrayList arrayList32 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList(k13.r(arrayList32, 10));
        it2 = arrayList32.iterator();
        while (it2.hasNext()) {
        }
        set32.addAll(arrayList42);
        Set set42 = nf2Var.d;
        ArrayList arrayList52 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList62 = new ArrayList(k13.r(arrayList52, 10));
        it3 = arrayList52.iterator();
        while (it3.hasNext()) {
        }
        set42.addAll(arrayList62);
        Set set52 = nf2Var.b;
        ArrayList arrayList72 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList82 = new ArrayList(k13.r(arrayList72, 10));
        it4 = arrayList72.iterator();
        while (it4.hasNext()) {
        }
        set52.addAll(arrayList82);
        ArrayList arrayList92 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList102 = new ArrayList();
        ArrayList arrayList112 = new ArrayList();
        it5 = arrayList92.iterator();
        while (it5.hasNext()) {
        }
        ArrayList arrayList132 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        it6 = arrayList102.iterator();
        while (it6.hasNext()) {
        }
        ArrayList arrayList142 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList w03 = CollectionsKt.w0(arrayList132, CollectionsKt.w0(arrayList112, arrayList142));
        ArrayList arrayList162 = new ArrayList();
        ArrayList arrayList172 = new ArrayList();
        it7 = w03.iterator();
        while (it7.hasNext()) {
        }
        yea yeaVar2 = j58.a;
        if (fn0.B("sort_by_final_score")) {
        }
        ArrayList w022 = CollectionsKt.w0(H0, arrayList162);
        list = a38Var.c;
        ArrayList arrayList182 = new ArrayList(k13.r(w022, 10));
        it8 = w022.iterator();
        while (it8.hasNext()) {
        }
        if (!list.isEmpty()) {
        }
        nf2Var.a.addAll(w022);
        return Unit.a;
    }
}
