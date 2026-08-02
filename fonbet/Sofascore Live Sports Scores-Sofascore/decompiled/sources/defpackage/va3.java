package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class va3 implements ch2, pjd {
    public final Type a;

    public /* synthetic */ va3(Type type) {
        this.a = type;
    }

    @Override // defpackage.ch2
    public Type c() {
        return this.a;
    }

    @Override // defpackage.ch2
    public Object k(dod dodVar) {
        ua3 ua3Var = new ua3(dodVar);
        dodVar.M(new sz8(ua3Var, 13));
        return ua3Var;
    }

    @Override // defpackage.pjd
    public Object n() {
        Type type = this.a;
        if (!(type instanceof ParameterizedType)) {
            vp2.c(type, "Invalid EnumMap type: ");
            return null;
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        vp2.c(type, "Invalid EnumMap type: ");
        return null;
    }
}
