package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bs4 {
    public static final inb b = new inb(21);
    public static final pm0 c;
    public final Function1 a;

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(bs4.class);
        try {
            kType = duf.b(bs4.class);
        } catch (Throwable unused) {
            kType = null;
        }
        c = new pm0("DefaultRequest", new h5k(orCreateKotlinClass, kType));
    }

    public bs4(Function1 function1) {
        this.a = function1;
    }
}
