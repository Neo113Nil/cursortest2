package defpackage;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class v5k extends l4a implements Serializable {
    public final Type f;

    public v5k() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        z1a.q(genericSuperclass, "%s isn't parameterized", genericSuperclass instanceof ParameterizedType);
        Type type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        this.f = type;
        z1a.C(type, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(type instanceof TypeVariable));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v5k) {
            return this.f.equals(((v5k) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        uea ueaVar = z6k.a;
        Type type = this.f;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new t5k(new cqa(25).G(this.f));
    }

    public v5k(Type type) {
        type.getClass();
        this.f = type;
    }
}
