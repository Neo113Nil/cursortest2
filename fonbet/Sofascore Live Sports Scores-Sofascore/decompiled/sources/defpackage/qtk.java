package defpackage;

import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface qtk {
    default ltk a(Class cls, qzc qzcVar) {
        return b(cls);
    }

    default ltk b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default ltk c(KClass kClass, qzc qzcVar) {
        kClass.getClass();
        return a(sha.x(kClass), qzcVar);
    }
}
