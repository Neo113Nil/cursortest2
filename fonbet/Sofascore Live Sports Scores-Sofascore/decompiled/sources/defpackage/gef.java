package defpackage;

import kotlin.reflect.KMutableProperty1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gef implements bj0 {
    public final KMutableProperty1 a;
    public final String b;

    public gef(KMutableProperty1 kMutableProperty1, String str) {
        kMutableProperty1.getClass();
        str.getClass();
        this.a = kMutableProperty1;
        this.b = str;
    }

    public final Object a(Object obj) {
        V v = this.a.get(obj);
        if (v != 0) {
            return v;
        }
        a70.r(mz1.o(new StringBuilder("Field "), this.b, " is not set"));
        return null;
    }

    @Override // defpackage.bj0
    public final Object i(Object obj, Object obj2) {
        KMutableProperty1 kMutableProperty1 = this.a;
        V v = kMutableProperty1.get(obj);
        if (v == 0) {
            kMutableProperty1.set(obj, obj2);
            return null;
        }
        if (v.equals(obj2)) {
            return null;
        }
        return v;
    }
}
