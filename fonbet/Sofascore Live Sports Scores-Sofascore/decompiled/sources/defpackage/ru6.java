package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ru6 {
    public final cg4 a;

    public ru6(cg4 cg4Var) {
        cg4Var.getClass();
        this.a = cg4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, sq3 sq3Var) {
        qu6 qu6Var;
        int i;
        ?? r3;
        List list2;
        if (sq3Var instanceof qu6) {
            qu6Var = (qu6) sq3Var;
            int i2 = qu6Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qu6Var.u = i2 - Integer.MIN_VALUE;
                Object obj = qu6Var.s;
                lu3 lu3Var = lu3.a;
                i = qu6Var.u;
                r3 = 0;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    qu6Var.r = list;
                    qu6Var.u = 1;
                    obj = this.a.c("FANTASY_USER_COMPETITIONS_ORDER", qu6Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) qu6Var.r;
                    y6a.M(obj);
                }
                list2 = (List) obj;
                if (list2 != null) {
                    r3 = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                        if (intOrNull != null) {
                            r3.add(intOrNull);
                        }
                    }
                }
                if (r3 == 0) {
                    r3 = km5.a;
                }
                if (!r3.isEmpty()) {
                    return list;
                }
                nh0 X0 = CollectionsKt.X0(r3);
                int c = sub.c(k13.r(X0, 10));
                if (c < 16) {
                    c = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(c);
                Iterator it2 = X0.iterator();
                while (true) {
                    sc5 sc5Var = (sc5) it2;
                    if (!sc5Var.b.hasNext()) {
                        return CollectionsKt.H0(list, new i31(i3, linkedHashMap, r3));
                    }
                    IndexedValue indexedValue = (IndexedValue) sc5Var.next();
                    linkedHashMap.put(new Integer(((Number) indexedValue.b).intValue()), new Integer(indexedValue.a));
                }
            }
        }
        qu6Var = new qu6(this, sq3Var);
        Object obj2 = qu6Var.s;
        lu3 lu3Var2 = lu3.a;
        i = qu6Var.u;
        r3 = 0;
        int i32 = 1;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
        if (r3 == 0) {
        }
        if (!r3.isEmpty()) {
        }
    }
}
