package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class o8e extends yaa {
    public final /* synthetic */ int h = 0;
    public final Method i;
    public final int j;
    public final qs3 k;
    public final Object l;

    public o8e(Method method, int i, qs3 qs3Var, String str) {
        this.i = method;
        this.j = i;
        this.k = qs3Var;
        this.l = str;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        int i = this.h;
        qs3 qs3Var = this.k;
        Object obj2 = this.l;
        Method method = this.i;
        int i2 = this.j;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    b0gVar.c((q89) obj2, (yzf) qs3Var.convert(obj));
                    return;
                } catch (IOException e) {
                    throw kik.M(method, i2, lnb.m(obj, "Unable to convert ", " to RequestBody"), e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw kik.M(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw kik.M(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw kik.M(method, i2, lnb.o("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", lnb.o("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    q89 q89Var = q89.b;
                    b0gVar.c(ktm.F(strArr), (yzf) qs3Var.convert(value));
                }
                return;
        }
    }

    public o8e(Method method, int i, q89 q89Var, qs3 qs3Var) {
        this.i = method;
        this.j = i;
        this.l = q89Var;
        this.k = qs3Var;
    }
}
