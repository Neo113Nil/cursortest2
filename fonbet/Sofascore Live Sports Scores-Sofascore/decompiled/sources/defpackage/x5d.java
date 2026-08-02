package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x5d extends dwd implements Serializable {
    public static final x5d a = new x5d();

    private Object readResolve() {
        return a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // defpackage.dwd
    public final dwd d() {
        return h4g.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
