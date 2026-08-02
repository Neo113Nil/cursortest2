package kotlin.jvm.internal;

import java.util.List;

/* loaded from: classes.dex */
public class O {
    public kotlin.reflect.h a(C7734p c7734p) {
        return c7734p;
    }

    public kotlin.reflect.d b(Class cls) {
        return new C7727i(cls);
    }

    public kotlin.reflect.g c(Class cls, String str) {
        return new A(cls, str);
    }

    public kotlin.reflect.j d(AbstractC7739v abstractC7739v) {
        return abstractC7739v;
    }

    public kotlin.reflect.k e(x xVar) {
        return xVar;
    }

    public kotlin.reflect.n f(B b11) {
        return b11;
    }

    public kotlin.reflect.o g(D d11) {
        return d11;
    }

    public kotlin.reflect.p h(F f7) {
        return f7;
    }

    public String i(InterfaceC7733o interfaceC7733o) {
        String obj = interfaceC7733o.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String j(AbstractC7737t abstractC7737t) {
        return i(abstractC7737t);
    }

    public kotlin.reflect.q k(kotlin.reflect.d dVar, List list) {
        return new W(dVar, list);
    }
}
