package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ycp extends fdp {
    public final /* synthetic */ Method b;

    public ycp(Method method) {
        this.b = method;
    }

    @Override // defpackage.fdp
    public final Object a(Class cls) {
        String d = gvo.d(cls);
        if (d == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        a70.j("UnsafeAllocator is used for non-instantiable type: ".concat(d));
        return null;
    }
}
