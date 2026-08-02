package g5;

import g5.C6627B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import p.InterfaceC8822a;

/* renamed from: g5.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6626A implements InterfaceC8822a {
    @Override // p.InterfaceC8822a
    public final Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6627B.b) it.next()).a());
        }
        return arrayList;
    }
}
