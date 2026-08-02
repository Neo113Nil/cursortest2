package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eub implements v4k {
    public final ln3 a;
    public final boolean b;

    public eub(ln3 ln3Var, boolean z) {
        this.a = ln3Var;
        this.b = z;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        Type[] actualTypeArguments;
        Type type = u5kVar.b;
        Class cls = u5kVar.a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            c5n.w(Map.class.isAssignableFrom(cls));
            Type x0 = k53.x0(type, cls, k53.m0(type, cls, Map.class), new HashMap());
            actualTypeArguments = x0 instanceof ParameterizedType ? ((ParameterizedType) x0).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new dub(this, gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? b5k.c : gson.getAdapter(new u5k(type2)), actualTypeArguments[1], gson.getAdapter(new u5k(actualTypeArguments[1])), this.a.b(u5kVar));
    }
}
