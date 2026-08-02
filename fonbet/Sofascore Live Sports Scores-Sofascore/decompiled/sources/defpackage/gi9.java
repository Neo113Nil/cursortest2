package defpackage;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class gi9 {
    public static final gu3 a = new gu3("call-context");
    public static final pm0 b;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(zh9.class);
        try {
            kType = duf.c(zh9.class, KTypeProjection.INSTANCE.getSTAR());
        } catch (Throwable unused) {
            kType = null;
        }
        b = new pm0("client-config", new h5k(orCreateKotlinClass, kType));
    }
}
