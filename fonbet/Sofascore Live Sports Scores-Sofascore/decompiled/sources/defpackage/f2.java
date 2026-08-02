package defpackage;

import android.os.Parcelable;
import com.sofascore.results.sharemodal.compose.BaseShareComposeBottomSheetModal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class f2 extends ot8 implements Function1 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(int i) {
        super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
        this.b = i;
        switch (i) {
            case 6:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 7:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 8:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 9:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 10:
                super(1, 0, xj1.class, xj1.a, "formatPercentage", "formatPercentage(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 11:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 12:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 13:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 14:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 15:
                super(1, 0, xj1.class, xj1.a, "formatOneDecimal", "formatOneDecimal(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 16:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 17:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 18:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 19:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 20:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 21:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 22:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 23:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 24:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 25:
                super(1, 0, xj1.class, xj1.a, "formatOneDecimal", "formatOneDecimal(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 26:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 27:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 28:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            case 29:
                super(1, 0, xj1.class, xj1.a, "formatInt", "formatInt(Ljava/lang/Number;)Ljava/lang/String;");
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        final int i2 = 1;
        rq3 rq3Var = null;
        final int i3 = 0;
        switch (this.b) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                m2 m2Var = (m2) this.receiver;
                b0d b0dVar = m2Var.E;
                if (booleanValue) {
                    m2Var.v1();
                } else {
                    if (m2Var.q != null) {
                        Object[] objArr = b0dVar.c;
                        long[] jArr = b0dVar.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr[i4];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8;
                                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j) < 128) {
                                            i = i5;
                                            xw3.L(m2Var.Y0(), null, null, new k2(m2Var, (l6f) objArr[(i4 << 3) + i7], rq3Var, i3), 3);
                                        } else {
                                            i = i5;
                                        }
                                        j >>= i;
                                        i7++;
                                        i5 = i;
                                    }
                                    if (i6 != i5) {
                                    }
                                }
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                        l6f l6fVar = m2Var.G;
                        if (l6fVar != null) {
                            xw3.L(m2Var.Y0(), null, null, new k2(m2Var, l6fVar, rq3Var, 1), 3);
                        }
                    }
                    b0dVar.a();
                    m2Var.G = null;
                    m2Var.w1();
                }
                return Unit.a;
            case 1:
                final li liVar = (li) obj;
                liVar.getClass();
                final ij ijVar = (ij) this.receiver;
                ijVar.getClass();
                if (liVar instanceof ii) {
                    ynb.m(ijVar, new ej(ijVar, null, 0));
                } else if (liVar instanceof ji) {
                    ijVar.n(null, new Function1() { // from class: dj
                        /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
                        
                            if (r1 == null) goto L39;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            qld qldVar;
                            Set keySet;
                            String str;
                            int i8 = i3;
                            List list = null;
                            li liVar2 = liVar;
                            ij ijVar2 = ijVar;
                            switch (i8) {
                                case 0:
                                    cj cjVar = (cj) obj2;
                                    cjVar.getClass();
                                    String str2 = cjVar.g;
                                    Map map = ijVar2.o;
                                    String str3 = ((ji) liVar2).a;
                                    List list2 = (List) map.get(str3);
                                    if (list2 != null && (qldVar = (qld) CollectionsKt.firstOrNull(list2)) != null) {
                                        Map map2 = qldVar.c;
                                        if (map2 == null || (keySet = map2.keySet()) == null) {
                                            Map map3 = qldVar.b;
                                            keySet = map3 != null ? map3.keySet() : null;
                                        }
                                        if (keySet != null) {
                                            list = CollectionsKt.S0(keySet);
                                            break;
                                        }
                                    }
                                    list = km5.a;
                                    if (!CollectionsKt.R(list, str2)) {
                                        str2 = (String) CollectionsKt.firstOrNull(list);
                                    }
                                    String str4 = str2;
                                    List<String> list3 = list;
                                    gv9 t = ijVar2.t(str3, str4);
                                    ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                                    for (String str5 : list3) {
                                        String n = rld.n(ijVar2.i(), str5, cjVar.e.c);
                                        if (n == null) {
                                            n = "";
                                        }
                                        arrayList.add(new s1h(str5, n, true));
                                    }
                                    return cj.a(cjVar, t, null, l6g.W(arrayList), str3, str4, 150);
                                default:
                                    cj cjVar2 = (cj) obj2;
                                    cjVar2.getClass();
                                    String str6 = cjVar2.f;
                                    String str7 = ((ki) liVar2).a;
                                    gv9 t2 = ijVar2.t(str6, str7);
                                    gv9 gv9Var = cjVar2.d;
                                    if (gv9Var == null || !gv9Var.isEmpty()) {
                                        Iterator<E> it = gv9Var.iterator();
                                        while (it.hasNext()) {
                                            if (Intrinsics.c(((s1h) it.next()).a, str7)) {
                                                if (str7 != null) {
                                                    s1h s1hVar = (s1h) CollectionsKt.firstOrNull(gv9Var);
                                                    str = s1hVar != null ? (String) s1hVar.a : null;
                                                } else {
                                                    str = str7;
                                                }
                                                return cj.a(cjVar2, t2, null, null, null, str, 190);
                                            }
                                        }
                                    }
                                    str7 = null;
                                    if (str7 != null) {
                                    }
                                    return cj.a(cjVar2, t2, null, null, null, str, 190);
                            }
                        }
                    });
                } else {
                    if (!(liVar instanceof ki)) {
                        zzl.b();
                        return null;
                    }
                    ijVar.n(null, new Function1() { // from class: dj
                        /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
                        
                            if (r1 == null) goto L39;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj2) {
                            qld qldVar;
                            Set keySet;
                            String str;
                            int i8 = i2;
                            List list = null;
                            li liVar2 = liVar;
                            ij ijVar2 = ijVar;
                            switch (i8) {
                                case 0:
                                    cj cjVar = (cj) obj2;
                                    cjVar.getClass();
                                    String str2 = cjVar.g;
                                    Map map = ijVar2.o;
                                    String str3 = ((ji) liVar2).a;
                                    List list2 = (List) map.get(str3);
                                    if (list2 != null && (qldVar = (qld) CollectionsKt.firstOrNull(list2)) != null) {
                                        Map map2 = qldVar.c;
                                        if (map2 == null || (keySet = map2.keySet()) == null) {
                                            Map map3 = qldVar.b;
                                            keySet = map3 != null ? map3.keySet() : null;
                                        }
                                        if (keySet != null) {
                                            list = CollectionsKt.S0(keySet);
                                            break;
                                        }
                                    }
                                    list = km5.a;
                                    if (!CollectionsKt.R(list, str2)) {
                                        str2 = (String) CollectionsKt.firstOrNull(list);
                                    }
                                    String str4 = str2;
                                    List<String> list3 = list;
                                    gv9 t = ijVar2.t(str3, str4);
                                    ArrayList arrayList = new ArrayList(k13.r(list3, 10));
                                    for (String str5 : list3) {
                                        String n = rld.n(ijVar2.i(), str5, cjVar.e.c);
                                        if (n == null) {
                                            n = "";
                                        }
                                        arrayList.add(new s1h(str5, n, true));
                                    }
                                    return cj.a(cjVar, t, null, l6g.W(arrayList), str3, str4, 150);
                                default:
                                    cj cjVar2 = (cj) obj2;
                                    cjVar2.getClass();
                                    String str6 = cjVar2.f;
                                    String str7 = ((ki) liVar2).a;
                                    gv9 t2 = ijVar2.t(str6, str7);
                                    gv9 gv9Var = cjVar2.d;
                                    if (gv9Var == null || !gv9Var.isEmpty()) {
                                        Iterator<E> it = gv9Var.iterator();
                                        while (it.hasNext()) {
                                            if (Intrinsics.c(((s1h) it.next()).a, str7)) {
                                                if (str7 != null) {
                                                    s1h s1hVar = (s1h) CollectionsKt.firstOrNull(gv9Var);
                                                    str = s1hVar != null ? (String) s1hVar.a : null;
                                                } else {
                                                    str = str7;
                                                }
                                                return cj.a(cjVar2, t2, null, null, null, str, 190);
                                            }
                                        }
                                    }
                                    str7 = null;
                                    if (str7 != null) {
                                    }
                                    return cj.a(cjVar2, t2, null, null, null, str, 190);
                            }
                        }
                    });
                }
                return Unit.a;
            case 2:
                Parcelable parcelable = (Parcelable) obj;
                parcelable.getClass();
                return ((BaseShareComposeBottomSheetModal) this.receiver).Q(parcelable);
            case 3:
                Parcelable parcelable2 = (Parcelable) obj;
                parcelable2.getClass();
                return Integer.valueOf(((BaseShareComposeBottomSheetModal) this.receiver).L(parcelable2));
            case 4:
                Parcelable parcelable3 = (Parcelable) obj;
                parcelable3.getClass();
                return ((BaseShareComposeBottomSheetModal) this.receiver).R(parcelable3);
            case 5:
                Number number = (Number) obj;
                number.getClass();
                return fn0.m((xj1) this.receiver, number);
            case 6:
                Number number2 = (Number) obj;
                number2.getClass();
                return fn0.m((xj1) this.receiver, number2);
            case 7:
                Number number3 = (Number) obj;
                number3.getClass();
                return fn0.m((xj1) this.receiver, number3);
            case 8:
                Number number4 = (Number) obj;
                number4.getClass();
                return fn0.m((xj1) this.receiver, number4);
            case 9:
                Number number5 = (Number) obj;
                number5.getClass();
                return fn0.m((xj1) this.receiver, number5);
            case 10:
                Number number6 = (Number) obj;
                number6.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.b(number6);
            case 11:
                Number number7 = (Number) obj;
                number7.getClass();
                return fn0.m((xj1) this.receiver, number7);
            case 12:
                Number number8 = (Number) obj;
                number8.getClass();
                return fn0.m((xj1) this.receiver, number8);
            case 13:
                Number number9 = (Number) obj;
                number9.getClass();
                return fn0.m((xj1) this.receiver, number9);
            case 14:
                Number number10 = (Number) obj;
                number10.getClass();
                return fn0.m((xj1) this.receiver, number10);
            case 15:
                Number number11 = (Number) obj;
                number11.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.a(number11);
            case 16:
                Number number12 = (Number) obj;
                number12.getClass();
                return fn0.m((xj1) this.receiver, number12);
            case 17:
                Number number13 = (Number) obj;
                number13.getClass();
                return fn0.m((xj1) this.receiver, number13);
            case 18:
                Number number14 = (Number) obj;
                number14.getClass();
                return fn0.m((xj1) this.receiver, number14);
            case 19:
                Number number15 = (Number) obj;
                number15.getClass();
                return fn0.m((xj1) this.receiver, number15);
            case 20:
                Number number16 = (Number) obj;
                number16.getClass();
                return fn0.m((xj1) this.receiver, number16);
            case 21:
                Number number17 = (Number) obj;
                number17.getClass();
                return fn0.m((xj1) this.receiver, number17);
            case 22:
                Number number18 = (Number) obj;
                number18.getClass();
                return fn0.m((xj1) this.receiver, number18);
            case 23:
                Number number19 = (Number) obj;
                number19.getClass();
                return fn0.m((xj1) this.receiver, number19);
            case 24:
                Number number20 = (Number) obj;
                number20.getClass();
                return fn0.m((xj1) this.receiver, number20);
            case 25:
                Number number21 = (Number) obj;
                number21.getClass();
                ((xj1) this.receiver).getClass();
                return xj1.a(number21);
            case 26:
                Number number22 = (Number) obj;
                number22.getClass();
                return fn0.m((xj1) this.receiver, number22);
            case 27:
                Number number23 = (Number) obj;
                number23.getClass();
                return fn0.m((xj1) this.receiver, number23);
            case 28:
                Number number24 = (Number) obj;
                number24.getClass();
                return fn0.m((xj1) this.receiver, number24);
            default:
                Number number25 = (Number) obj;
                number25.getClass();
                return fn0.m((xj1) this.receiver, number25);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.b = i3;
    }
}
