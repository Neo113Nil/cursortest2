package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class n8e extends yaa {
    public final /* synthetic */ int h;
    public final Method i;
    public final int j;

    public /* synthetic */ n8e(Method method, int i, int i2) {
        this.h = i2;
        this.i = method;
        this.j = i;
    }

    @Override // defpackage.yaa
    public final void m(b0g b0gVar, Object obj) {
        int i = this.h;
        int i2 = this.j;
        Method method = this.i;
        switch (i) {
            case 0:
                q89 q89Var = (q89) obj;
                if (q89Var == null) {
                    throw kik.M(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                ef0 ef0Var = b0gVar.f;
                ef0Var.getClass();
                int size = q89Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    vha.h(ef0Var, vha.j(q89Var, i3), vha.l(q89Var, i3));
                }
                return;
            default:
                if (obj == null) {
                    throw kik.M(method, i2, "@Url parameter is null.", new Object[0]);
                }
                b0gVar.c = obj.toString();
                return;
        }
    }
}
