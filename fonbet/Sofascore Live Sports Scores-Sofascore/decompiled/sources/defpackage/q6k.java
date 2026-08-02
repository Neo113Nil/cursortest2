package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum q6k extends u6k {
    public q6k() {
        super("JAVA8", 2);
    }

    @Override // defpackage.u6k
    public final Type a(Type type) {
        return u6k.a.a(type);
    }

    @Override // defpackage.u6k
    public final String b(Type type) {
        try {
            return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
        } catch (IllegalAccessException e) {
            e = e;
            is8.h(e);
            return null;
        } catch (NoSuchMethodException unused) {
            a70.j("Type.getTypeName should be available in Java 8");
            return null;
        } catch (InvocationTargetException e2) {
            e = e2;
            is8.h(e);
            return null;
        }
    }

    @Override // defpackage.u6k
    public final Type d(Type type) {
        type.getClass();
        return type;
    }
}
