package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12871a = new ArrayList();

    public final synchronized List a() {
        ArrayList arrayList;
        try {
            ArrayList arrayList2 = this.f12871a;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.v.k(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((Rc) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
            Intrinsics.checkNotNullParameter(arrayList, "<this>");
        } catch (Throwable th2) {
            throw th2;
        }
        return CollectionsKt.W(CollectionsKt.Y(arrayList));
    }

    public final synchronized void a(Rc... rcArr) {
        kotlin.collections.z.o(this.f12871a, rcArr);
    }
}
