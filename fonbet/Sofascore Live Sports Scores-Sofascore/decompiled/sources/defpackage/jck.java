package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jck extends nck {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public jck(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.nck
    public final Object a(Class cls) {
        String a = ln3.a(cls);
        if (a == null) {
            return this.b.invoke(this.c, cls);
        }
        a70.j("UnsafeAllocator is used for non-instantiable type: ".concat(a));
        return null;
    }
}
