package defpackage;

import java.lang.reflect.AccessibleObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class ocp {
    public static final ocp a;

    static {
        ocp ocpVar = null;
        if (ubp.a >= 9) {
            try {
                ocpVar = new jcp(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (ocpVar == null) {
            ocpVar = new lcp();
        }
        a = ocpVar;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
