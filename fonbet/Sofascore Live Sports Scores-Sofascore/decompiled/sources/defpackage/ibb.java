package defpackage;

import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ibb extends y6a {
    public final KClass f;
    public final Object g;
    public final y6a h;

    public ibb(KClass kClass, Object obj, y6a y6aVar) {
        kClass.getClass();
        obj.getClass();
        y6aVar.getClass();
        this.f = kClass;
        this.g = obj;
        this.h = y6aVar;
    }

    @Override // defpackage.y6a
    public final Object A(KClass kClass) {
        kClass.getClass();
        return kClass.equals(this.f) ? sha.x(kClass).cast(this.g) : this.h.A(kClass);
    }

    @Override // defpackage.y6a
    public final y6a H(KClass kClass, Object obj) {
        kClass.getClass();
        KClass kClass2 = this.f;
        boolean equals = kClass.equals(kClass2);
        y6a y6aVar = this.h;
        if (!equals) {
            y6a H = y6aVar.H(kClass, null);
            if (H != y6aVar) {
                this = new ibb(kClass2, this.g, H);
            }
            y6aVar = this;
        }
        return obj != null ? new ibb(kClass, obj, y6aVar) : y6aVar;
    }

    public final String toString() {
        return CollectionsKt.f0(CollectionsKt.B0(i5h.q(e5h.e(this, new abb(3)))), null, "{", "}", new abb(4), 25);
    }
}
