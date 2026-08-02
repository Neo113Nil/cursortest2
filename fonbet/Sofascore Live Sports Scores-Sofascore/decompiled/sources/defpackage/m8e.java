package defpackage;

import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class m8e extends yaa {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;
    public final boolean k;

    public /* synthetic */ m8e(Method method, int i, boolean z, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
        this.k = z;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        int i = this.h;
        boolean z = this.k;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw kik.M(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw kik.M(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw kik.M(method, i2, lnb.o("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String obj2 = value.toString();
                    if (obj2 == null) {
                        throw kik.M(method, i2, "Field map value '" + value + "' converted to null by " + t62.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    b0gVar.a(str, obj2, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw kik.M(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw kik.M(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw kik.M(method, i2, lnb.o("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    b0gVar.b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw kik.M(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw kik.M(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw kik.M(method, i2, lnb.o("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String obj3 = value3.toString();
                    if (obj3 == null) {
                        throw kik.M(method, i2, "Query map value '" + value3 + "' converted to null by " + t62.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    b0gVar.d(str3, obj3, z);
                }
                return;
        }
    }
}
