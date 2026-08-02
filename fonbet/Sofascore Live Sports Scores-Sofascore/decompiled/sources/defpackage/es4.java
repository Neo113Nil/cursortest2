package defpackage;

import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class es4 {
    public static final pm0 a;
    public static final bjb b;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(Unit.class);
        try {
            kType = duf.b(Unit.class);
        } catch (Throwable unused) {
            kType = null;
        }
        a = new pm0("ValidateMark", new h5k(orCreateKotlinClass, kType));
        b = ejb.b("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
