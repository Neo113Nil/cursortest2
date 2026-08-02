package com.logrocket.protobuf;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j0 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f6739c = DesugarCollections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    @Override // com.logrocket.protobuf.l0
    public final void a(long j, Object obj) {
        Object unmodifiableList;
        List list = (List) x1.f6821c.j(j, obj);
        if (list instanceof i0) {
            unmodifiableList = ((i0) list).c0();
        } else {
            if (f6739c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof z0) && (list instanceof c0)) {
                b bVar = (b) ((c0) list);
                boolean z5 = bVar.f6668a;
                if (z5 && z5) {
                    bVar.f6668a = false;
                    return;
                }
                return;
            }
            unmodifiableList = DesugarCollections.unmodifiableList(list);
        }
        x1.p(j, obj, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.logrocket.protobuf.l0
    public final void b(long j, Object obj, Object obj2) {
        h0 h0Var;
        w1 w1Var = x1.f6821c;
        List list = (List) w1Var.j(j, obj2);
        int size = list.size();
        List list2 = (List) w1Var.j(j, obj);
        if (list2.isEmpty()) {
            list2 = list2 instanceof i0 ? new h0(size) : ((list2 instanceof z0) && (list2 instanceof c0)) ? ((c0) list2).r(size) : new ArrayList(size);
            x1.p(j, obj, list2);
        } else {
            if (f6739c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                x1.p(j, obj, arrayList);
                h0Var = arrayList;
            } else if (list2 instanceof s1) {
                h0 h0Var2 = new h0(list2.size() + size);
                h0Var2.addAll((s1) list2);
                x1.p(j, obj, h0Var2);
                h0Var = h0Var2;
            } else if ((list2 instanceof z0) && (list2 instanceof c0)) {
                c0 c0Var = (c0) list2;
                if (!((b) c0Var).f6668a) {
                    list2 = c0Var.r(list2.size() + size);
                    x1.p(j, obj, list2);
                }
            }
            list2 = h0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        x1.p(j, obj, list);
    }
}
