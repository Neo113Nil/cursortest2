package defpackage;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ym5 extends y6a {
    public static final ym5 f = new ym5();

    @Override // defpackage.y6a
    public final Object A(KClass kClass) {
        kClass.getClass();
        return null;
    }

    @Override // defpackage.y6a
    public final y6a H(KClass kClass, Object obj) {
        kClass.getClass();
        return obj != null ? new ibb(kClass, obj, this) : this;
    }

    public final String toString() {
        return "{}";
    }
}
