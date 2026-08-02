package defpackage;

import com.google.gson.Gson;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class hh0 implements v4k {
    public final /* synthetic */ int a;

    public /* synthetic */ hh0(int i) {
        this.a = i;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        int i = 0;
        switch (this.a) {
            case 0:
                Type type = u5kVar.b;
                boolean z = type instanceof GenericArrayType;
                if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                    return null;
                }
                Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
                return new ih0(gson, gson.getAdapter(new u5k(genericComponentType)), k53.p0(genericComponentType));
            case 1:
                if (u5kVar.a == Date.class) {
                    return new tk4();
                }
                return null;
            case 2:
                if (u5kVar.a == java.sql.Date.class) {
                    return new j0i(0);
                }
                return null;
            case 3:
                if (u5kVar.a == Time.class) {
                    return new j0i(1);
                }
                return null;
            case 4:
                if (u5kVar.a == Timestamp.class) {
                    return new k0i(gson.getAdapter(Date.class), i);
                }
                return null;
            default:
                Class cls = u5kVar.a;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new w4k(cls);
        }
    }
}
