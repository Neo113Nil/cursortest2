package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jcp extends ocp {
    public final /* synthetic */ Method b;

    public jcp(Method method) {
        this.b = method;
    }

    @Override // defpackage.ocp
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            vp2.e("Failed invoking canAccess", e);
            return false;
        }
    }
}
