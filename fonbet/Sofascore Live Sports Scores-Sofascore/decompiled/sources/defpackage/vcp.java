package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vcp extends fdp {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public vcp(Method method, int i) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.fdp
    public final Object a(Class cls) {
        String d = gvo.d(cls);
        if (d == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        a70.j("UnsafeAllocator is used for non-instantiable type: ".concat(d));
        return null;
    }
}
