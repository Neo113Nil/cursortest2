package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class idp implements nap {
    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Type genericComponentType;
        Type type = z6nVar.b;
        if (type instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) type).getGenericComponentType();
        } else {
            if (!(type instanceof Class)) {
                return null;
            }
            Class cls = (Class) type;
            if (!cls.isArray()) {
                return null;
            }
            genericComponentType = cls.getComponentType();
        }
        return new kdp(h9pVar, h9pVar.b(new z6n(genericComponentType)), ktm.N(genericComponentType));
    }
}
