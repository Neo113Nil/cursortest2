package defpackage;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class n6k {
    public static final n6k a;
    public static final /* synthetic */ n6k[] b = {new n6k() { // from class: k6k
        @Override // defpackage.n6k
        public final Class a(Class cls) {
            return cls.getEnclosingClass();
        }
    }, new n6k() { // from class: l6k
        @Override // defpackage.n6k
        public final Class a(Class cls) {
            if (cls.isLocalClass()) {
                return null;
            }
            return cls.getEnclosingClass();
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    n6k EF2;

    static {
        ParameterizedType parameterizedType = (ParameterizedType) m6k.class.getGenericSuperclass();
        Objects.requireNonNull(parameterizedType);
        for (n6k n6kVar : values()) {
            if (n6kVar.a(m6k.class) == parameterizedType.getOwnerType()) {
                a = n6kVar;
                return;
            }
        }
        ogj.b();
    }

    public static n6k valueOf(String str) {
        return (n6k) Enum.valueOf(n6k.class, str);
    }

    public static n6k[] values() {
        return (n6k[]) b.clone();
    }

    public abstract Class a(Class cls);
}
