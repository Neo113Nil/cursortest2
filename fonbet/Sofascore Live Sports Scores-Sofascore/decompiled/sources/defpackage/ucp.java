package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ucp extends fdp {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public ucp(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.fdp
    public final Object a(Class cls) {
        String d = gvo.d(cls);
        if (d != null) {
            a70.j("UnsafeAllocator is used for non-instantiable type: ".concat(d));
            return null;
        }
        return this.b.invoke(this.c, cls);
    }
}
