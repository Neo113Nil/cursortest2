package defpackage;

import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k8d {
    public final l8d a;
    public final List b;
    public final List c;
    public final int d;
    public xbb e;

    public k8d(l8d l8dVar, List list, List list2, int i) {
        this.a = l8dVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        xbb xbbVar = this.e;
        if (xbbVar == null) {
            xbb b = a.b();
            b.addAll(this.b);
            l8d l8dVar = this.a;
            if (l8dVar != null) {
                b.add(l8dVar);
            }
            b.addAll(this.c);
            xbbVar = a.a(b);
            this.e = xbbVar;
        }
        xbbVar.getClass();
        return xbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k8d.class != obj.getClass()) {
            return false;
        }
        k8d k8dVar = (k8d) obj;
        return this.d == k8dVar.d && a().equals(k8dVar.a());
    }

    public final int hashCode() {
        return a().hashCode() + (this.d * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k8d() {
        this(null, r1, r1, -1);
        km5 km5Var = km5.a;
    }
}
