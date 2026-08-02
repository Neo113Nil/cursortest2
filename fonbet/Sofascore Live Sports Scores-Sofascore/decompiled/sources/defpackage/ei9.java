package defpackage;

import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class ei9 {
    public static final pm0 a;

    static {
        KType kType;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kType = fufVar.mutableCollectionType(duf.e(companion.invariant(duf.c(di9.class, companion.getSTAR())), companion.invariant(duf.b(Object.class))));
        } catch (Throwable unused) {
            kType = null;
        }
        a = new pm0("EngineCapabilities", new h5k(orCreateKotlinClass, kType));
        w9h.b(al9.a);
    }
}
