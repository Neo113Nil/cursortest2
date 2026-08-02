package defpackage;

import com.google.gson.Gson;
import com.ironsource.U3;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class j13 implements v4k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j13(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        Class cls;
        int i = this.a;
        cls = Object.class;
        Object obj = this.b;
        switch (i) {
            case 0:
                Type type = u5kVar.b;
                Class cls2 = u5kVar.a;
                if (!Collection.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                }
                c5n.w(Collection.class.isAssignableFrom(cls2));
                Type x0 = k53.x0(type, cls2, k53.m0(type, cls2, Collection.class), new HashMap());
                cls = x0 instanceof ParameterizedType ? ((ParameterizedType) x0).getActualTypeArguments()[0] : Object.class;
                return new ih0(gson, cls, gson.getAdapter(new u5k(cls)), ((ln3) obj).b(u5kVar));
            case 1:
                if (u5kVar.a == Number.class) {
                    return (tk4) obj;
                }
                return null;
            case 2:
                if (u5kVar.a == cls) {
                    return new ckd(gson, (ujj) obj);
                }
                return null;
            default:
                Class cls3 = u5kVar.a;
                if (cls3 == Calendar.class || cls3 == GregorianCalendar.class) {
                    return (o49) obj;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((o49) this.b) + U3.j.e;
            default:
                return super.toString();
        }
    }
}
