package defpackage;

import java.util.ArrayList;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tk9 {
    public static final a99 b = new a99(25);
    public static final pm0 c;
    public final ArrayList a = new ArrayList();

    static {
        KType kType;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(tk9.class);
        try {
            kType = duf.b(tk9.class);
        } catch (Throwable unused) {
            kType = null;
        }
        c = new pm0("HttpSend", new h5k(orCreateKotlinClass, kType));
    }
}
