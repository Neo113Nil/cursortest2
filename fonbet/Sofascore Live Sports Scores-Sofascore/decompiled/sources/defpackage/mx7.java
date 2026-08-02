package defpackage;

import com.sofascore.model.newNetwork.mediaposts.MediaPost;
import com.sofascore.results.feed.compose.model.ShortVideoFeedCardModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mx7 extends hoi implements Function2 {
    public final /* synthetic */ qx7 A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ int r;
    public List s;
    public List t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ sl6 y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx7(sl6 sl6Var, List list, qx7 qx7Var, Set set, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.y = sl6Var;
        this.z = list;
        this.A = qx7Var;
        this.B = set;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        switch (this.r) {
            case 0:
                mx7 mx7Var = new mx7(this.y, this.z, this.A, this.B, rq3Var, 0);
                mx7Var.x = obj;
                return mx7Var;
            case 1:
                mx7 mx7Var2 = new mx7(this.y, this.z, this.A, this.B, rq3Var, 1);
                mx7Var2.x = obj;
                return mx7Var2;
            case 2:
                mx7 mx7Var3 = new mx7(this.y, this.z, this.A, this.B, rq3Var, 2);
                mx7Var3.x = obj;
                return mx7Var3;
            default:
                mx7 mx7Var4 = new mx7(this.y, this.z, this.A, this.B, rq3Var, 3);
                mx7Var4.x = obj;
                return mx7Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mx7) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03ab A[LOOP:12: B:188:0x03a5->B:190:0x03ab, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0401 A[LOOP:13: B:196:0x03fb->B:198:0x0401, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06c4 A[LOOP:19: B:344:0x06be->B:346:0x06c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x071a A[LOOP:20: B:352:0x0714->B:354:0x071a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[LOOP:2: B:38:0x0098->B:40:0x009e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07cf  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5 A[LOOP:3: B:46:0x00ef->B:48:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x09df A[LOOP:26: B:500:0x09d9->B:502:0x09df, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0a36 A[LOOP:27: B:508:0x0a30->B:510:0x0a36, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b22  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b93  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0241  */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v27, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v43, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v68, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v75, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v76 */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r4v78, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v79 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v72, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v75, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:167:0x0450 -> B:134:0x0452). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:290:0x0769 -> B:257:0x076b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:413:0x0a89 -> B:380:0x0a8a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0133 -> B:8:0x0137). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj2;
        int i;
        int i2;
        Iterator it;
        Class<zbd> cls;
        Class<ShortVideoFeedCardModel> cls2;
        ArrayList arrayList4;
        qx7 qx7Var;
        Object u;
        Iterator it2;
        int i3;
        fuf fufVar;
        KClass orCreateKotlinClass;
        Collection collection;
        ?? r13;
        Collection collection2;
        ?? r132;
        Collection collection3;
        ?? r133;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        Object obj3;
        int i4;
        int i5;
        Iterator it3;
        Class<il6> cls3;
        Class<ShortVideoFeedCardModel> cls4;
        Object u2;
        Iterator it4;
        int i6;
        fuf fufVar2;
        KClass orCreateKotlinClass2;
        Collection collection4;
        ?? num;
        Collection collection5;
        ?? num2;
        Collection collection6;
        ?? num3;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        Object obj4;
        int i7;
        int i8;
        Iterator it5;
        Class<zbd> cls5;
        Class<ShortVideoFeedCardModel> cls6;
        Object u3;
        Iterator it6;
        int i9;
        fuf fufVar3;
        KClass orCreateKotlinClass3;
        Collection collection7;
        ?? num4;
        Collection collection8;
        ?? num5;
        Collection collection9;
        ?? num6;
        List arrayList11;
        List list;
        List list2;
        int i10;
        Object obj5;
        int i11;
        Iterator it7;
        qx7 qx7Var2;
        Object u4;
        Iterator it8;
        Iterator it9;
        int i12;
        fuf fufVar4;
        KClass orCreateKotlinClass4;
        Collection collection10;
        Integer num7;
        Collection collection11;
        Integer num8;
        Collection collection12;
        Integer num9;
        int i13 = this.r;
        Class<il6> cls7 = il6.class;
        Class<zbd> cls8 = zbd.class;
        Class<ShortVideoFeedCardModel> cls9 = ShortVideoFeedCardModel.class;
        sl6 sl6Var = this.y;
        List list3 = this.z;
        int i14 = 10;
        switch (i13) {
            case 0:
                List list4 = list3;
                ku3 ku3Var = (ku3) this.x;
                lu3 lu3Var = lu3.a;
                int i15 = this.w;
                qx7 qx7Var3 = this.A;
                if (i15 == 0) {
                    y6a.M(obj);
                    if (((Number) sl6Var.a).intValue() == -1) {
                        arrayList2 = null;
                        return arrayList2;
                    }
                    arrayList = new ArrayList();
                    i2 = Math.min(((Number) sl6Var.a).intValue() * 5, list4.size());
                    i = Math.min(i2 + 5, list4.size());
                    List list5 = list4;
                    List subList = list5.subList(i2, i);
                    ArrayList arrayList12 = new ArrayList(k13.r(subList, 10));
                    it2 = subList.iterator();
                    while (it2.hasNext()) {
                    }
                    list4 = list5;
                    this.x = ku3Var;
                    this.s = arrayList;
                    this.t = arrayList;
                    this.u = i2;
                    this.v = i;
                    this.w = 1;
                    obj2 = m6k.u(arrayList12, this);
                    if (obj2 != lu3Var) {
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = this.u;
                        List list6 = this.t;
                        ?? r9 = this.s;
                        y6a.M(obj);
                        cls = cls8;
                        cls2 = cls9;
                        arrayList4 = r9;
                        qx7Var = qx7Var3;
                        arrayList2 = null;
                        u = obj;
                        ArrayList arrayList13 = new ArrayList();
                        for (Object obj6 : (Iterable) u) {
                            if (obj6 instanceof il6) {
                                arrayList13.add(obj6);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList14 = new ArrayList();
                        Iterator it10 = arrayList13.iterator();
                        while (it10.hasNext()) {
                            Object next = it10.next();
                            if (hashSet.add(((dl6) next).getK())) {
                                arrayList14.add(next);
                            }
                        }
                        list6.addAll(arrayList14);
                        if (i2 >= list4.size()) {
                            sl6Var.a = new Integer(((Number) sl6Var.a).intValue() + 1);
                            i3 = -1;
                        } else {
                            i3 = -1;
                            sl6Var.a = new Integer(-1);
                        }
                        if (arrayList4.size() < 3 || ((Number) sl6Var.a).intValue() == i3) {
                            fufVar = duf.a;
                            orCreateKotlinClass = fufVar.getOrCreateKotlinClass(cls7);
                            if (!Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(cls))) {
                                ArrayList arrayList15 = arrayList4.size() >= 3 ? arrayList4 : arrayList2;
                                if (arrayList15 == null || (collection3 = CollectionsKt.L0(arrayList15, 5)) == null) {
                                    collection3 = km5.a;
                                }
                                gv9 W = l6g.W(collection3);
                                int i16 = qx7Var.e;
                                Iterator it11 = collection3.iterator();
                                if (it11.hasNext()) {
                                    Integer num10 = new Integer(((zbd) it11.next()).g);
                                    while (true) {
                                        r133 = num10;
                                        while (it11.hasNext()) {
                                            num10 = new Integer(((zbd) it11.next()).g);
                                            if (r133.compareTo(num10) < 0) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    r133 = arrayList2;
                                }
                                Object d49Var = !collection3.isEmpty() ? new d49(r133 != 0 ? r133.intValue() : 0, i16, W) : arrayList2;
                                if (d49Var != null) {
                                    qx7Var.e++;
                                    return d49Var;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(cls7))) {
                                ArrayList arrayList16 = arrayList4.size() > 2 ? arrayList4 : arrayList2;
                                if (arrayList16 == null || (collection2 = CollectionsKt.L0(arrayList16, 5)) == null) {
                                    collection2 = km5.a;
                                }
                                gv9 W2 = l6g.W(collection2);
                                Iterator it12 = collection2.iterator();
                                if (it12.hasNext()) {
                                    Integer num11 = new Integer(((il6) it12.next()).g);
                                    while (true) {
                                        r132 = num11;
                                        while (it12.hasNext()) {
                                            num11 = new Integer(((il6) it12.next()).g);
                                            if (r132.compareTo(num11) < 0) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    r132 = arrayList2;
                                }
                                z39 z39Var = new z39(W2, true, r132 != 0 ? r132.intValue() : 0);
                                if (!collection2.isEmpty()) {
                                    return z39Var;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(cls2))) {
                                ArrayList arrayList17 = arrayList4.size() > 2 ? arrayList4 : arrayList2;
                                if (arrayList17 == null || (collection = CollectionsKt.L0(arrayList17, 5)) == null) {
                                    collection = km5.a;
                                }
                                gv9 W3 = l6g.W(collection);
                                Iterator it13 = collection.iterator();
                                if (it13.hasNext()) {
                                    Integer num12 = new Integer(((ShortVideoFeedCardModel) it13.next()).g);
                                    while (true) {
                                        r13 = num12;
                                        while (it13.hasNext()) {
                                            num12 = new Integer(((ShortVideoFeedCardModel) it13.next()).g);
                                            if (r13.compareTo(num12) < 0) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    r13 = arrayList2;
                                }
                                f49 f49Var = new f49(r13 != 0 ? r13.intValue() : 0, W3);
                                if (!collection.isEmpty()) {
                                    return f49Var;
                                }
                            }
                            return arrayList2;
                        }
                        qx7Var3 = qx7Var;
                        arrayList = arrayList4;
                        cls9 = cls2;
                        cls8 = cls;
                        i2 = Math.min(((Number) sl6Var.a).intValue() * 5, list4.size());
                        i = Math.min(i2 + 5, list4.size());
                        List list52 = list4;
                        List subList2 = list52.subList(i2, i);
                        ArrayList arrayList122 = new ArrayList(k13.r(subList2, 10));
                        it2 = subList2.iterator();
                        while (it2.hasNext()) {
                            arrayList122.add(xw3.t(ku3Var, null, new kx7(qx7Var3, ((Number) it2.next()).intValue(), null, 0), 3));
                            it2 = it2;
                            list52 = list52;
                        }
                        list4 = list52;
                        this.x = ku3Var;
                        this.s = arrayList;
                        this.t = arrayList;
                        this.u = i2;
                        this.v = i;
                        this.w = 1;
                        obj2 = m6k.u(arrayList122, this);
                        if (obj2 != lu3Var) {
                            return lu3Var;
                        }
                        arrayList3 = arrayList;
                        ArrayList W4 = CollectionsKt.W((Iterable) obj2);
                        ArrayList arrayList18 = new ArrayList(k13.r(W4, 10));
                        it = W4.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList19 = arrayList18;
                            arrayList19.add(xw3.t(ku3Var, null, new lx7(qx7Var3, (MediaPost) it.next(), this.B, null, 0), 3));
                            arrayList18 = arrayList19;
                            qx7Var3 = qx7Var3;
                            arrayList3 = arrayList3;
                            cls8 = cls8;
                            arrayList = arrayList;
                            cls9 = cls9;
                        }
                        cls = cls8;
                        cls2 = cls9;
                        ArrayList arrayList20 = arrayList;
                        arrayList4 = arrayList3;
                        arrayList2 = null;
                        qx7Var = qx7Var3;
                        this.x = ku3Var;
                        this.s = arrayList4;
                        this.t = arrayList20;
                        this.u = i2;
                        this.v = i;
                        this.w = 2;
                        u = m6k.u(arrayList18, this);
                        if (u != lu3Var) {
                            return lu3Var;
                        }
                        list6 = arrayList20;
                        ArrayList arrayList132 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList142 = new ArrayList();
                        Iterator it102 = arrayList132.iterator();
                        while (it102.hasNext()) {
                        }
                        list6.addAll(arrayList142);
                        if (i2 >= list4.size()) {
                        }
                        if (arrayList4.size() < 3) {
                        }
                        fufVar = duf.a;
                        orCreateKotlinClass = fufVar.getOrCreateKotlinClass(cls7);
                        if (!Intrinsics.c(orCreateKotlinClass, fufVar.getOrCreateKotlinClass(cls))) {
                        }
                        return arrayList2;
                    }
                    int i17 = this.v;
                    int i18 = this.u;
                    ?? r92 = this.t;
                    ?? r11 = this.s;
                    y6a.M(obj);
                    i = i17;
                    i2 = i18;
                    obj2 = obj;
                    arrayList3 = r11;
                    arrayList = r92;
                    ArrayList W42 = CollectionsKt.W((Iterable) obj2);
                    ArrayList arrayList182 = new ArrayList(k13.r(W42, 10));
                    it = W42.iterator();
                    while (it.hasNext()) {
                    }
                    cls = cls8;
                    cls2 = cls9;
                    ArrayList arrayList202 = arrayList;
                    arrayList4 = arrayList3;
                    arrayList2 = null;
                    qx7Var = qx7Var3;
                    this.x = ku3Var;
                    this.s = arrayList4;
                    this.t = arrayList202;
                    this.u = i2;
                    this.v = i;
                    this.w = 2;
                    u = m6k.u(arrayList182, this);
                    if (u != lu3Var) {
                    }
                }
                break;
            case 1:
                List list7 = list3;
                ku3 ku3Var2 = (ku3) this.x;
                lu3 lu3Var2 = lu3.a;
                int i19 = this.w;
                qx7 qx7Var4 = this.A;
                if (i19 == 0) {
                    y6a.M(obj);
                    if (((Number) sl6Var.a).intValue() == -1) {
                        arrayList6 = null;
                        return arrayList6;
                    }
                    arrayList5 = new ArrayList();
                    i5 = Math.min(((Number) sl6Var.a).intValue() * 5, list7.size());
                    i4 = Math.min(i5 + 5, list7.size());
                    List list8 = list7;
                    List subList3 = list8.subList(i5, i4);
                    ArrayList arrayList21 = new ArrayList(k13.r(subList3, 10));
                    it4 = subList3.iterator();
                    while (it4.hasNext()) {
                    }
                    list7 = list8;
                    this.x = ku3Var2;
                    this.s = arrayList5;
                    this.t = arrayList5;
                    this.u = i5;
                    this.v = i4;
                    this.w = 1;
                    obj3 = m6k.u(arrayList21, this);
                    if (obj3 != lu3Var2) {
                    }
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = this.u;
                        List list9 = this.t;
                        ?? r93 = this.s;
                        y6a.M(obj);
                        cls3 = cls7;
                        cls4 = cls9;
                        arrayList5 = r93;
                        arrayList6 = null;
                        u2 = obj;
                        ArrayList arrayList22 = new ArrayList();
                        for (Object obj7 : (Iterable) u2) {
                            if (obj7 instanceof zbd) {
                                arrayList22.add(obj7);
                            }
                        }
                        HashSet hashSet3 = new HashSet();
                        ArrayList arrayList23 = new ArrayList();
                        Iterator it14 = arrayList22.iterator();
                        while (it14.hasNext()) {
                            Object next2 = it14.next();
                            if (hashSet3.add(((dl6) next2).getK())) {
                                arrayList23.add(next2);
                            }
                        }
                        list9.addAll(arrayList23);
                        if (i5 >= list7.size()) {
                            sl6Var.a = new Integer(((Number) sl6Var.a).intValue() + 1);
                            i6 = -1;
                        } else {
                            i6 = -1;
                            sl6Var.a = new Integer(-1);
                        }
                        if (arrayList5.size() < 3 || ((Number) sl6Var.a).intValue() == i6) {
                            fufVar2 = duf.a;
                            orCreateKotlinClass2 = fufVar2.getOrCreateKotlinClass(cls8);
                            if (!Intrinsics.c(orCreateKotlinClass2, fufVar2.getOrCreateKotlinClass(cls8))) {
                                if (arrayList5.size() < 3) {
                                    arrayList5 = arrayList6;
                                }
                                if (arrayList5 == null || (collection6 = CollectionsKt.L0(arrayList5, 5)) == null) {
                                    collection6 = km5.a;
                                }
                                gv9 W5 = l6g.W(collection6);
                                int i20 = qx7Var4.e;
                                Iterator it15 = collection6.iterator();
                                if (it15.hasNext()) {
                                    num3 = new Integer(((zbd) it15.next()).g);
                                    while (it15.hasNext()) {
                                        Integer num13 = new Integer(((zbd) it15.next()).g);
                                        if (num3.compareTo(num13) < 0) {
                                            num3 = num13;
                                        }
                                    }
                                } else {
                                    num3 = arrayList6;
                                }
                                Object d49Var2 = !collection6.isEmpty() ? new d49(num3 != 0 ? num3.intValue() : 0, i20, W5) : arrayList6;
                                if (d49Var2 != null) {
                                    qx7Var4.e++;
                                    return d49Var2;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass2, fufVar2.getOrCreateKotlinClass(cls3))) {
                                if (arrayList5.size() <= 2) {
                                    arrayList5 = arrayList6;
                                }
                                if (arrayList5 == null || (collection5 = CollectionsKt.L0(arrayList5, 5)) == null) {
                                    collection5 = km5.a;
                                }
                                gv9 W6 = l6g.W(collection5);
                                Iterator it16 = collection5.iterator();
                                if (it16.hasNext()) {
                                    num2 = new Integer(((il6) it16.next()).g);
                                    while (it16.hasNext()) {
                                        Integer num14 = new Integer(((il6) it16.next()).g);
                                        if (num2.compareTo(num14) < 0) {
                                            num2 = num14;
                                        }
                                    }
                                } else {
                                    num2 = arrayList6;
                                }
                                z39 z39Var2 = new z39(W6, false, num2 != 0 ? num2.intValue() : 0);
                                if (!collection5.isEmpty()) {
                                    return z39Var2;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass2, fufVar2.getOrCreateKotlinClass(cls4))) {
                                if (arrayList5.size() <= 2) {
                                    arrayList5 = arrayList6;
                                }
                                if (arrayList5 == null || (collection4 = CollectionsKt.L0(arrayList5, 5)) == null) {
                                    collection4 = km5.a;
                                }
                                gv9 W7 = l6g.W(collection4);
                                Iterator it17 = collection4.iterator();
                                if (it17.hasNext()) {
                                    num = new Integer(((ShortVideoFeedCardModel) it17.next()).g);
                                    while (it17.hasNext()) {
                                        Integer num15 = new Integer(((ShortVideoFeedCardModel) it17.next()).g);
                                        if (num.compareTo(num15) < 0) {
                                            num = num15;
                                        }
                                    }
                                } else {
                                    num = arrayList6;
                                }
                                f49 f49Var2 = new f49(num != 0 ? num.intValue() : 0, W7);
                                if (!collection4.isEmpty()) {
                                    return f49Var2;
                                }
                            }
                            return arrayList6;
                        }
                        cls9 = cls4;
                        cls7 = cls3;
                        i5 = Math.min(((Number) sl6Var.a).intValue() * 5, list7.size());
                        i4 = Math.min(i5 + 5, list7.size());
                        List list82 = list7;
                        List subList32 = list82.subList(i5, i4);
                        ArrayList arrayList212 = new ArrayList(k13.r(subList32, 10));
                        it4 = subList32.iterator();
                        while (it4.hasNext()) {
                            arrayList212.add(xw3.t(ku3Var2, null, new kx7(qx7Var4, ((Number) it4.next()).intValue(), null, 1), 3));
                            it4 = it4;
                            list82 = list82;
                        }
                        list7 = list82;
                        this.x = ku3Var2;
                        this.s = arrayList5;
                        this.t = arrayList5;
                        this.u = i5;
                        this.v = i4;
                        this.w = 1;
                        obj3 = m6k.u(arrayList212, this);
                        if (obj3 != lu3Var2) {
                            return lu3Var2;
                        }
                        arrayList7 = arrayList5;
                        ArrayList W8 = CollectionsKt.W((Iterable) obj3);
                        ArrayList arrayList24 = new ArrayList(k13.r(W8, 10));
                        for (it3 = W8.iterator(); it3.hasNext(); it3 = it3) {
                            Class<il6> cls10 = cls7;
                            ArrayList arrayList25 = arrayList24;
                            arrayList25.add(xw3.t(ku3Var2, null, new lx7(qx7Var4, (MediaPost) it3.next(), this.B, null, 1), 3));
                            arrayList24 = arrayList25;
                            arrayList5 = arrayList5;
                            arrayList7 = arrayList7;
                            cls9 = cls9;
                            cls7 = cls10;
                        }
                        cls3 = cls7;
                        cls4 = cls9;
                        ArrayList arrayList26 = arrayList5;
                        ArrayList arrayList27 = arrayList7;
                        ArrayList arrayList28 = arrayList24;
                        arrayList6 = null;
                        this.x = ku3Var2;
                        this.s = arrayList27;
                        this.t = arrayList26;
                        this.u = i5;
                        this.v = i4;
                        this.w = 2;
                        u2 = m6k.u(arrayList28, this);
                        if (u2 != lu3Var2) {
                            return lu3Var2;
                        }
                        list9 = arrayList26;
                        arrayList5 = arrayList27;
                        ArrayList arrayList222 = new ArrayList();
                        while (r2.hasNext()) {
                        }
                        HashSet hashSet32 = new HashSet();
                        ArrayList arrayList232 = new ArrayList();
                        Iterator it142 = arrayList222.iterator();
                        while (it142.hasNext()) {
                        }
                        list9.addAll(arrayList232);
                        if (i5 >= list7.size()) {
                        }
                        if (arrayList5.size() < 3) {
                        }
                        fufVar2 = duf.a;
                        orCreateKotlinClass2 = fufVar2.getOrCreateKotlinClass(cls8);
                        if (!Intrinsics.c(orCreateKotlinClass2, fufVar2.getOrCreateKotlinClass(cls8))) {
                        }
                        return arrayList6;
                    }
                    int i21 = this.v;
                    int i22 = this.u;
                    ?? r94 = this.t;
                    ?? r112 = this.s;
                    y6a.M(obj);
                    i4 = i21;
                    i5 = i22;
                    arrayList7 = r112;
                    arrayList5 = r94;
                    obj3 = obj;
                    ArrayList W82 = CollectionsKt.W((Iterable) obj3);
                    ArrayList arrayList242 = new ArrayList(k13.r(W82, 10));
                    while (it3.hasNext()) {
                    }
                    cls3 = cls7;
                    cls4 = cls9;
                    ArrayList arrayList262 = arrayList5;
                    ArrayList arrayList272 = arrayList7;
                    ArrayList arrayList282 = arrayList242;
                    arrayList6 = null;
                    this.x = ku3Var2;
                    this.s = arrayList272;
                    this.t = arrayList262;
                    this.u = i5;
                    this.v = i4;
                    this.w = 2;
                    u2 = m6k.u(arrayList282, this);
                    if (u2 != lu3Var2) {
                    }
                }
                break;
            case 2:
                List list10 = list3;
                ku3 ku3Var3 = (ku3) this.x;
                lu3 lu3Var3 = lu3.a;
                int i23 = this.w;
                qx7 qx7Var5 = this.A;
                if (i23 == 0) {
                    y6a.M(obj);
                    if (((Number) sl6Var.a).intValue() == -1) {
                        arrayList9 = null;
                        return arrayList9;
                    }
                    arrayList8 = new ArrayList();
                    i8 = Math.min(((Number) sl6Var.a).intValue() * 5, list10.size());
                    i7 = Math.min(i8 + 5, list10.size());
                    List list11 = list10;
                    List subList4 = list11.subList(i8, i7);
                    ArrayList arrayList29 = new ArrayList(k13.r(subList4, 10));
                    it6 = subList4.iterator();
                    while (it6.hasNext()) {
                    }
                    list10 = list11;
                    this.x = ku3Var3;
                    this.s = arrayList8;
                    this.t = arrayList8;
                    this.u = i8;
                    this.v = i7;
                    this.w = 1;
                    obj4 = m6k.u(arrayList29, this);
                    if (obj4 != lu3Var3) {
                    }
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i8 = this.u;
                        List list12 = this.t;
                        ?? r95 = this.s;
                        y6a.M(obj);
                        cls5 = cls8;
                        cls6 = cls9;
                        arrayList8 = r95;
                        arrayList9 = null;
                        u3 = obj;
                        ArrayList arrayList30 = new ArrayList();
                        for (Object obj8 : (Iterable) u3) {
                            if (obj8 instanceof il6) {
                                arrayList30.add(obj8);
                            }
                        }
                        HashSet hashSet4 = new HashSet();
                        ArrayList arrayList31 = new ArrayList();
                        Iterator it18 = arrayList30.iterator();
                        while (it18.hasNext()) {
                            Object next3 = it18.next();
                            if (hashSet4.add(((dl6) next3).getK())) {
                                arrayList31.add(next3);
                            }
                        }
                        list12.addAll(arrayList31);
                        if (i8 >= list10.size()) {
                            sl6Var.a = new Integer(((Number) sl6Var.a).intValue() + 1);
                            i9 = -1;
                        } else {
                            i9 = -1;
                            sl6Var.a = new Integer(-1);
                        }
                        if (arrayList8.size() < 3 || ((Number) sl6Var.a).intValue() == i9) {
                            fufVar3 = duf.a;
                            orCreateKotlinClass3 = fufVar3.getOrCreateKotlinClass(cls7);
                            if (!Intrinsics.c(orCreateKotlinClass3, fufVar3.getOrCreateKotlinClass(cls5))) {
                                if (arrayList8.size() < 3) {
                                    arrayList8 = arrayList9;
                                }
                                if (arrayList8 == null || (collection9 = CollectionsKt.L0(arrayList8, 5)) == null) {
                                    collection9 = km5.a;
                                }
                                gv9 W9 = l6g.W(collection9);
                                int i24 = qx7Var5.e;
                                Iterator it19 = collection9.iterator();
                                if (it19.hasNext()) {
                                    num6 = new Integer(((zbd) it19.next()).g);
                                    while (it19.hasNext()) {
                                        Integer num16 = new Integer(((zbd) it19.next()).g);
                                        if (num6.compareTo(num16) < 0) {
                                            num6 = num16;
                                        }
                                    }
                                } else {
                                    num6 = arrayList9;
                                }
                                Object d49Var3 = !collection9.isEmpty() ? new d49(num6 != 0 ? num6.intValue() : 0, i24, W9) : arrayList9;
                                if (d49Var3 != null) {
                                    qx7Var5.e++;
                                    return d49Var3;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass3, fufVar3.getOrCreateKotlinClass(cls7))) {
                                if (arrayList8.size() <= 2) {
                                    arrayList8 = arrayList9;
                                }
                                if (arrayList8 == null || (collection8 = CollectionsKt.L0(arrayList8, 5)) == null) {
                                    collection8 = km5.a;
                                }
                                gv9 W10 = l6g.W(collection8);
                                Iterator it20 = collection8.iterator();
                                if (it20.hasNext()) {
                                    num5 = new Integer(((il6) it20.next()).g);
                                    while (it20.hasNext()) {
                                        Integer num17 = new Integer(((il6) it20.next()).g);
                                        if (num5.compareTo(num17) < 0) {
                                            num5 = num17;
                                        }
                                    }
                                } else {
                                    num5 = arrayList9;
                                }
                                z39 z39Var3 = new z39(W10, false, num5 != 0 ? num5.intValue() : 0);
                                if (!collection8.isEmpty()) {
                                    return z39Var3;
                                }
                            } else if (Intrinsics.c(orCreateKotlinClass3, fufVar3.getOrCreateKotlinClass(cls6))) {
                                if (arrayList8.size() <= 2) {
                                    arrayList8 = arrayList9;
                                }
                                if (arrayList8 == null || (collection7 = CollectionsKt.L0(arrayList8, 5)) == null) {
                                    collection7 = km5.a;
                                }
                                gv9 W11 = l6g.W(collection7);
                                Iterator it21 = collection7.iterator();
                                if (it21.hasNext()) {
                                    num4 = new Integer(((ShortVideoFeedCardModel) it21.next()).g);
                                    while (it21.hasNext()) {
                                        Integer num18 = new Integer(((ShortVideoFeedCardModel) it21.next()).g);
                                        if (num4.compareTo(num18) < 0) {
                                            num4 = num18;
                                        }
                                    }
                                } else {
                                    num4 = arrayList9;
                                }
                                f49 f49Var3 = new f49(num4 != 0 ? num4.intValue() : 0, W11);
                                if (!collection7.isEmpty()) {
                                    return f49Var3;
                                }
                            }
                            return arrayList9;
                        }
                        cls9 = cls6;
                        cls8 = cls5;
                        i8 = Math.min(((Number) sl6Var.a).intValue() * 5, list10.size());
                        i7 = Math.min(i8 + 5, list10.size());
                        List list112 = list10;
                        List subList42 = list112.subList(i8, i7);
                        ArrayList arrayList292 = new ArrayList(k13.r(subList42, 10));
                        it6 = subList42.iterator();
                        while (it6.hasNext()) {
                            arrayList292.add(xw3.t(ku3Var3, null, new kx7(qx7Var5, ((Number) it6.next()).intValue(), null, 2), 3));
                            it6 = it6;
                            list112 = list112;
                        }
                        list10 = list112;
                        this.x = ku3Var3;
                        this.s = arrayList8;
                        this.t = arrayList8;
                        this.u = i8;
                        this.v = i7;
                        this.w = 1;
                        obj4 = m6k.u(arrayList292, this);
                        if (obj4 != lu3Var3) {
                            return lu3Var3;
                        }
                        arrayList10 = arrayList8;
                        ArrayList W12 = CollectionsKt.W((Iterable) obj4);
                        ArrayList arrayList32 = new ArrayList(k13.r(W12, 10));
                        for (it5 = W12.iterator(); it5.hasNext(); it5 = it5) {
                            Class<zbd> cls11 = cls8;
                            ArrayList arrayList33 = arrayList32;
                            arrayList33.add(xw3.t(ku3Var3, null, new lx7(qx7Var5, (MediaPost) it5.next(), this.B, null, 2), 3));
                            arrayList32 = arrayList33;
                            arrayList8 = arrayList8;
                            arrayList10 = arrayList10;
                            cls9 = cls9;
                            cls8 = cls11;
                        }
                        cls5 = cls8;
                        cls6 = cls9;
                        ArrayList arrayList34 = arrayList8;
                        ArrayList arrayList35 = arrayList10;
                        ArrayList arrayList36 = arrayList32;
                        arrayList9 = null;
                        this.x = ku3Var3;
                        this.s = arrayList35;
                        this.t = arrayList34;
                        this.u = i8;
                        this.v = i7;
                        this.w = 2;
                        u3 = m6k.u(arrayList36, this);
                        if (u3 != lu3Var3) {
                            return lu3Var3;
                        }
                        list12 = arrayList34;
                        arrayList8 = arrayList35;
                        ArrayList arrayList302 = new ArrayList();
                        while (r3.hasNext()) {
                        }
                        HashSet hashSet42 = new HashSet();
                        ArrayList arrayList312 = new ArrayList();
                        Iterator it182 = arrayList302.iterator();
                        while (it182.hasNext()) {
                        }
                        list12.addAll(arrayList312);
                        if (i8 >= list10.size()) {
                        }
                        if (arrayList8.size() < 3) {
                        }
                        fufVar3 = duf.a;
                        orCreateKotlinClass3 = fufVar3.getOrCreateKotlinClass(cls7);
                        if (!Intrinsics.c(orCreateKotlinClass3, fufVar3.getOrCreateKotlinClass(cls5))) {
                        }
                        return arrayList9;
                    }
                    int i25 = this.v;
                    int i26 = this.u;
                    ?? r96 = this.t;
                    ?? r113 = this.s;
                    y6a.M(obj);
                    i7 = i25;
                    i8 = i26;
                    arrayList10 = r113;
                    arrayList8 = r96;
                    obj4 = obj;
                    ArrayList W122 = CollectionsKt.W((Iterable) obj4);
                    ArrayList arrayList322 = new ArrayList(k13.r(W122, 10));
                    while (it5.hasNext()) {
                    }
                    cls5 = cls8;
                    cls6 = cls9;
                    ArrayList arrayList342 = arrayList8;
                    ArrayList arrayList352 = arrayList10;
                    ArrayList arrayList362 = arrayList322;
                    arrayList9 = null;
                    this.x = ku3Var3;
                    this.s = arrayList352;
                    this.t = arrayList342;
                    this.u = i8;
                    this.v = i7;
                    this.w = 2;
                    u3 = m6k.u(arrayList362, this);
                    if (u3 != lu3Var3) {
                    }
                }
                break;
            default:
                ku3 ku3Var4 = (ku3) this.x;
                lu3 lu3Var4 = lu3.a;
                int i27 = this.w;
                qx7 qx7Var6 = this.A;
                if (i27 == 0) {
                    y6a.M(obj);
                    if (((Number) sl6Var.a).intValue() != -1) {
                        arrayList11 = new ArrayList();
                        i11 = Math.min(((Number) sl6Var.a).intValue() * 5, list3.size());
                        i10 = Math.min(i11 + 5, list3.size());
                        List subList5 = list3.subList(i11, i10);
                        ArrayList arrayList37 = new ArrayList(k13.r(subList5, i14));
                        it8 = subList5.iterator();
                        while (it8.hasNext()) {
                        }
                        list = list3;
                        this.x = ku3Var4;
                        this.s = arrayList11;
                        this.t = arrayList11;
                        this.u = i11;
                        this.v = i10;
                        this.w = 1;
                        obj5 = m6k.u(arrayList37, this);
                        if (obj5 != lu3Var4) {
                        }
                    }
                } else if (i27 == 1) {
                    int i28 = this.v;
                    int i29 = this.u;
                    list2 = this.t;
                    arrayList11 = this.s;
                    y6a.M(obj);
                    i10 = i28;
                    i11 = i29;
                    obj5 = obj;
                    list = list3;
                    ArrayList W13 = CollectionsKt.W((Iterable) obj5);
                    ArrayList arrayList38 = new ArrayList(k13.r(W13, 10));
                    while (it7.hasNext()) {
                    }
                    qx7Var2 = qx7Var6;
                    this.x = ku3Var4;
                    this.s = arrayList11;
                    this.t = list2;
                    this.u = i11;
                    this.v = i10;
                    this.w = 2;
                    u4 = m6k.u(arrayList38, this);
                    if (u4 == lu3Var4) {
                    }
                    ArrayList arrayList39 = new ArrayList();
                    while (r10.hasNext()) {
                    }
                    HashSet hashSet5 = new HashSet();
                    ArrayList arrayList40 = new ArrayList();
                    it9 = arrayList39.iterator();
                    while (it9.hasNext()) {
                    }
                    list2.addAll(arrayList40);
                    if (i11 < list.size()) {
                    }
                    if (arrayList11.size() < 3) {
                    }
                    fufVar4 = duf.a;
                    orCreateKotlinClass4 = fufVar4.getOrCreateKotlinClass(cls9);
                    if (Intrinsics.c(orCreateKotlinClass4, fufVar4.getOrCreateKotlinClass(cls8))) {
                    }
                } else if (i27 == 2) {
                    i11 = this.u;
                    list2 = this.t;
                    List list13 = this.s;
                    y6a.M(obj);
                    u4 = obj;
                    list = list3;
                    arrayList11 = list13;
                    qx7Var2 = qx7Var6;
                    ArrayList arrayList392 = new ArrayList();
                    for (Object obj9 : (Iterable) u4) {
                        if (obj9 instanceof ShortVideoFeedCardModel) {
                            arrayList392.add(obj9);
                        }
                    }
                    HashSet hashSet52 = new HashSet();
                    ArrayList arrayList402 = new ArrayList();
                    it9 = arrayList392.iterator();
                    while (it9.hasNext()) {
                        Object next4 = it9.next();
                        if (hashSet52.add(((dl6) next4).getK())) {
                            arrayList402.add(next4);
                        }
                    }
                    list2.addAll(arrayList402);
                    if (i11 < list.size()) {
                        sl6Var.a = new Integer(((Number) sl6Var.a).intValue() + 1);
                        i12 = -1;
                    } else {
                        i12 = -1;
                        sl6Var.a = new Integer(-1);
                    }
                    if (arrayList11.size() < 3 || ((Number) sl6Var.a).intValue() == i12) {
                        fufVar4 = duf.a;
                        orCreateKotlinClass4 = fufVar4.getOrCreateKotlinClass(cls9);
                        if (Intrinsics.c(orCreateKotlinClass4, fufVar4.getOrCreateKotlinClass(cls8))) {
                            List list14 = arrayList11.size() >= 3 ? arrayList11 : null;
                            if (list14 == null || (collection12 = CollectionsKt.L0(list14, 5)) == null) {
                                collection12 = km5.a;
                            }
                            gv9 W14 = l6g.W(collection12);
                            int i30 = qx7Var2.e;
                            Iterator it22 = collection12.iterator();
                            if (it22.hasNext()) {
                                Integer num19 = new Integer(((zbd) it22.next()).g);
                                while (true) {
                                    num9 = num19;
                                    while (it22.hasNext()) {
                                        num19 = new Integer(((zbd) it22.next()).g);
                                        if (num9.compareTo(num19) < 0) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                num9 = null;
                            }
                            d49 d49Var4 = !collection12.isEmpty() ? new d49(num9 != null ? num9.intValue() : 0, i30, W14) : null;
                            if (d49Var4 != null) {
                                qx7Var2.e++;
                                return d49Var4;
                            }
                        } else if (Intrinsics.c(orCreateKotlinClass4, fufVar4.getOrCreateKotlinClass(cls7))) {
                            List list15 = arrayList11.size() > 2 ? arrayList11 : null;
                            if (list15 == null || (collection11 = CollectionsKt.L0(list15, 5)) == null) {
                                collection11 = km5.a;
                            }
                            gv9 W15 = l6g.W(collection11);
                            Iterator it23 = collection11.iterator();
                            if (it23.hasNext()) {
                                Integer num20 = new Integer(((il6) it23.next()).g);
                                while (true) {
                                    num8 = num20;
                                    while (it23.hasNext()) {
                                        num20 = new Integer(((il6) it23.next()).g);
                                        if (num8.compareTo(num20) < 0) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                num8 = null;
                            }
                            z39 z39Var4 = new z39(W15, false, num8 != null ? num8.intValue() : 0);
                            if (!collection11.isEmpty()) {
                                return z39Var4;
                            }
                        } else if (Intrinsics.c(orCreateKotlinClass4, fufVar4.getOrCreateKotlinClass(cls9))) {
                            List list16 = arrayList11.size() > 2 ? arrayList11 : null;
                            if (list16 == null || (collection10 = CollectionsKt.L0(list16, 5)) == null) {
                                collection10 = km5.a;
                            }
                            gv9 W16 = l6g.W(collection10);
                            Iterator it24 = collection10.iterator();
                            if (it24.hasNext()) {
                                Integer num21 = new Integer(((ShortVideoFeedCardModel) it24.next()).g);
                                while (true) {
                                    num7 = num21;
                                    while (it24.hasNext()) {
                                        num21 = new Integer(((ShortVideoFeedCardModel) it24.next()).g);
                                        if (num7.compareTo(num21) < 0) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                num7 = null;
                            }
                            f49 f49Var4 = new f49(num7 != null ? num7.intValue() : 0, W16);
                            if (!collection10.isEmpty()) {
                                return f49Var4;
                            }
                        }
                    } else {
                        qx7Var6 = qx7Var2;
                        list3 = list;
                        i14 = 10;
                        i11 = Math.min(((Number) sl6Var.a).intValue() * 5, list3.size());
                        i10 = Math.min(i11 + 5, list3.size());
                        List subList52 = list3.subList(i11, i10);
                        ArrayList arrayList372 = new ArrayList(k13.r(subList52, i14));
                        it8 = subList52.iterator();
                        while (it8.hasNext()) {
                            arrayList372.add(xw3.t(ku3Var4, null, new kx7(qx7Var6, ((Number) it8.next()).intValue(), null, 3), 3));
                            it8 = it8;
                            list3 = list3;
                        }
                        list = list3;
                        this.x = ku3Var4;
                        this.s = arrayList11;
                        this.t = arrayList11;
                        this.u = i11;
                        this.v = i10;
                        this.w = 1;
                        obj5 = m6k.u(arrayList372, this);
                        if (obj5 != lu3Var4) {
                            return lu3Var4;
                        }
                        list2 = arrayList11;
                        ArrayList W132 = CollectionsKt.W((Iterable) obj5);
                        ArrayList arrayList382 = new ArrayList(k13.r(W132, 10));
                        for (it7 = W132.iterator(); it7.hasNext(); it7 = it7) {
                            qx7 qx7Var7 = qx7Var6;
                            arrayList382.add(xw3.t(ku3Var4, null, new lx7(qx7Var7, (MediaPost) it7.next(), this.B, null, 3), 3));
                            qx7Var6 = qx7Var7;
                        }
                        qx7Var2 = qx7Var6;
                        this.x = ku3Var4;
                        this.s = arrayList11;
                        this.t = list2;
                        this.u = i11;
                        this.v = i10;
                        this.w = 2;
                        u4 = m6k.u(arrayList382, this);
                        if (u4 == lu3Var4) {
                            return lu3Var4;
                        }
                        ArrayList arrayList3922 = new ArrayList();
                        while (r10.hasNext()) {
                        }
                        HashSet hashSet522 = new HashSet();
                        ArrayList arrayList4022 = new ArrayList();
                        it9 = arrayList3922.iterator();
                        while (it9.hasNext()) {
                        }
                        list2.addAll(arrayList4022);
                        if (i11 < list.size()) {
                        }
                        if (arrayList11.size() < 3) {
                        }
                        fufVar4 = duf.a;
                        orCreateKotlinClass4 = fufVar4.getOrCreateKotlinClass(cls9);
                        if (Intrinsics.c(orCreateKotlinClass4, fufVar4.getOrCreateKotlinClass(cls8))) {
                        }
                    }
                } else {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
