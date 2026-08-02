package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class k8e extends yaa {
    public final Method h;
    public final int i;
    public final qs3 j;

    public k8e(Method method, int i, qs3 qs3Var) {
        this.h = method;
        this.i = i;
        this.j = qs3Var;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        int i = this.i;
        Method method = this.h;
        if (obj == null) {
            throw kik.M(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            b0gVar.k = (yzf) this.j.convert(obj);
        } catch (IOException e) {
            throw kik.N(method, e, i, lnb.m(obj, "Unable to convert ", " to RequestBody"), new Object[0]);
        }
    }
}
