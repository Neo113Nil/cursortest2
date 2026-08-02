package defpackage;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class rtk implements qtk {
    public static rtk a;

    @Override // defpackage.qtk
    public ltk a(Class cls, qzc qzcVar) {
        return b(cls);
    }

    @Override // defpackage.qtk
    public ltk b(Class cls) {
        return vha.o(cls);
    }

    @Override // defpackage.qtk
    public final ltk c(KClass kClass, qzc qzcVar) {
        kClass.getClass();
        return a(sha.x(kClass), qzcVar);
    }
}
