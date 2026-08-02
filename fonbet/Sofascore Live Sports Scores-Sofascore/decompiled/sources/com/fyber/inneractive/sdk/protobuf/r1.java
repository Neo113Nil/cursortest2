package com.fyber.inneractive.sdk.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r1 extends t1 {
    public static final Class c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List a(Object obj, long j, int i) {
        List list = (List) x3.e(obj, j);
        if (list.isEmpty()) {
            List p1Var = list instanceof q1 ? new p1(i) : ((list instanceof n2) && (list instanceof k1)) ? ((k1) list).b(i) : new ArrayList(i);
            x3.a(j, obj, p1Var);
            return p1Var;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            x3.a(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof r3) {
            p1 p1Var2 = new p1(list.size() + i);
            p1Var2.addAll((r3) list);
            x3.a(j, obj, p1Var2);
            return p1Var2;
        }
        if ((list instanceof n2) && (list instanceof k1)) {
            k1 k1Var = (k1) list;
            if (!((c) k1Var).a) {
                k1 b = k1Var.b(list.size() + i);
                x3.a(j, obj, b);
                return b;
            }
        }
        return list;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j) {
        return a(obj, j, 10);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j, Object obj, Object obj2) {
        List list = (List) x3.e(obj2, j);
        List a = a(obj, j, list.size());
        int size = a.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            a.addAll(list);
        }
        if (size > 0) {
            list = a;
        }
        x3.a(j, obj, list);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) x3.e(obj, j);
        if (list instanceof q1) {
            unmodifiableList = ((q1) list).a();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof n2) && (list instanceof k1)) {
                c cVar = (c) ((k1) list);
                if (cVar.a) {
                    cVar.a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        x3.a(j, obj, unmodifiableList);
    }
}
