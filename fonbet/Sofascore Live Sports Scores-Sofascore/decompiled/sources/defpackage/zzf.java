package defpackage;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class zzf {
    public static final pm0 a;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(h5k.class);
        try {
            kType = duf.b(h5k.class);
        } catch (Throwable unused) {
            kType = null;
        }
        a = new pm0("BodyTypeAttributeKey", new h5k(orCreateKotlinClass, kType));
    }
}
