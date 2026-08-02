package kotlin.collections;

import defpackage.xbb;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class a {
    public static xbb a(List list) {
        list.getClass();
        xbb xbbVar = (xbb) list;
        xbbVar.m();
        xbbVar.c = true;
        return xbbVar.b > 0 ? xbbVar : xbb.e;
    }

    public static xbb b() {
        return new xbb(0, 1, null);
    }

    public static List c(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List d(List list) {
        list.getClass();
        List M = CollectionsKt___CollectionsKt.M(list);
        Collections.shuffle(M);
        return M;
    }
}
