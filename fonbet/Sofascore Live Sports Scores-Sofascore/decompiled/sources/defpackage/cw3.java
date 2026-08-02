package defpackage;

import com.facebook.k0;
import com.facebook.w;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class cw3 {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());
    public static boolean b;

    public static final void a(Object obj, Throwable th) {
        obj.getClass();
        if (b) {
            a.add(obj);
            w wVar = w.a;
            if (k0.c()) {
                ok3.o(th);
                b6a.k(th, c6a.e).b();
            }
        }
    }
}
