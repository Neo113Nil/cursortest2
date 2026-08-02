package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ndp implements nap {
    public final /* synthetic */ int a;
    public final gvo b;

    public /* synthetic */ ndp(gvo gvoVar, int i) {
        this.a = i;
        this.b = gvoVar;
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        Class cls;
        Type[] actualTypeArguments;
        int i = this.a;
        gvo gvoVar = this.b;
        cls = Object.class;
        switch (i) {
            case 0:
                Type type = z6nVar.b;
                Class cls2 = z6nVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                Type S = ktm.S(type, cls2, Collection.class);
                cls = S instanceof ParameterizedType ? ((ParameterizedType) S).getActualTypeArguments()[0] : Object.class;
                return new d5n(new jep(h9pVar, h9pVar.b(new z6n(cls)), cls), gvoVar.e(z6nVar, false));
            default:
                Type type2 = z6nVar.b;
                Class cls3 = z6nVar.a;
                if (!Map.class.isAssignableFrom(cls3)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls3)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type S2 = ktm.S(type2, cls3, Map.class);
                    actualTypeArguments = S2 instanceof ParameterizedType ? ((ParameterizedType) S2).getActualTypeArguments() : new Type[]{cls, cls};
                }
                Type type3 = actualTypeArguments[0];
                Type type4 = actualTypeArguments[1];
                return new jep(this, new jep(h9pVar, (type3 == Boolean.TYPE || type3 == Boolean.class) ? a6n.c : h9pVar.b(new z6n(type3)), type3), new jep(h9pVar, h9pVar.b(new z6n(type4)), type4), gvoVar.e(z6nVar, false));
        }
    }
}
