package defpackage;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class u6k {
    public static final p6k a;
    public static final q6k b;
    public static final u6k c;
    public static final /* synthetic */ u6k[] d;

    static {
        u6k u6kVar = new u6k() { // from class: o6k
            @Override // defpackage.u6k
            public final Type a(Type type) {
                return new a(1, type);
            }

            @Override // defpackage.u6k
            public final Type d(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new a(1, cls.getComponentType()) : type;
            }
        };
        p6k p6kVar = new p6k();
        a = p6kVar;
        q6k q6kVar = new q6k();
        b = q6kVar;
        r6k r6kVar = new r6k();
        d = new u6k[]{u6kVar, p6kVar, q6kVar, r6kVar};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            Type genericSuperclass = s6k.class.getGenericSuperclass();
            z1a.q(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
            if (((ParameterizedType) genericSuperclass).getActualTypeArguments()[0].toString().contains("java.util.Map.java.util.Map")) {
                c = q6kVar;
                return;
            } else {
                c = r6kVar;
                return;
            }
        }
        Type genericSuperclass2 = t6k.class.getGenericSuperclass();
        z1a.q(genericSuperclass2, "%s isn't parameterized", genericSuperclass2 instanceof ParameterizedType);
        if (((ParameterizedType) genericSuperclass2).getActualTypeArguments()[0] instanceof Class) {
            c = p6kVar;
        } else {
            c = u6kVar;
        }
    }

    public static u6k valueOf(String str) {
        return (u6k) Enum.valueOf(u6k.class, str);
    }

    public static u6k[] values() {
        return (u6k[]) d.clone();
    }

    public abstract Type a(Type type);

    public String b(Type type) {
        uea ueaVar = z6k.a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final vvf c(Type[] typeArr) {
        zu9 s = hv9.s();
        for (Type type : typeArr) {
            s.c(d(type));
        }
        return s.g();
    }

    public abstract Type d(Type type);
}
