package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.reflect.KTypeProjection;
import nd.Y0;

/* loaded from: classes.dex */
public class N {

    /* renamed from: a, reason: collision with root package name */
    private static final O f71788a;

    /* renamed from: b, reason: collision with root package name */
    private static final kotlin.reflect.d[] f71789b;

    static {
        O o11 = null;
        try {
            o11 = (O) Y0.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o11 == null) {
            o11 = new O();
        }
        f71788a = o11;
        f71789b = new kotlin.reflect.d[0];
    }

    public static kotlin.reflect.h a(C7734p c7734p) {
        return f71788a.a(c7734p);
    }

    public static kotlin.reflect.d b(Class cls) {
        return f71788a.b(cls);
    }

    public static kotlin.reflect.g c(Class cls) {
        return f71788a.c(cls, "");
    }

    public static kotlin.reflect.g d(Class cls, String str) {
        return f71788a.c(cls, str);
    }

    public static kotlin.reflect.j e(AbstractC7739v abstractC7739v) {
        return f71788a.d(abstractC7739v);
    }

    public static kotlin.reflect.k f(x xVar) {
        return f71788a.e(xVar);
    }

    public static kotlin.reflect.n g(B b11) {
        return f71788a.f(b11);
    }

    public static kotlin.reflect.o h(D d11) {
        return f71788a.g(d11);
    }

    public static kotlin.reflect.p i(F f7) {
        return f71788a.h(f7);
    }

    public static String j(InterfaceC7733o interfaceC7733o) {
        return f71788a.i(interfaceC7733o);
    }

    public static String k(AbstractC7737t abstractC7737t) {
        return f71788a.j(abstractC7737t);
    }

    public static kotlin.reflect.q l(Class cls) {
        O o11 = f71788a;
        return o11.k(o11.b(cls), Collections.EMPTY_LIST);
    }

    public static kotlin.reflect.q m(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        O o11 = f71788a;
        return o11.k(o11.b(Map.class), Arrays.asList(kTypeProjection, kTypeProjection2));
    }
}
