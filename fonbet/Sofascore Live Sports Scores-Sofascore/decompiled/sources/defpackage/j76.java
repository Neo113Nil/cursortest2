package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class j76 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v76 b;
    public final /* synthetic */ glg c;

    public /* synthetic */ j76(v76 v76Var, glg glgVar, int i) {
        this.a = i;
        this.b = v76Var;
        this.c = glgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        glg glgVar = this.c;
        v76 v76Var = this.b;
        nkb nkbVar = (nkb) obj;
        switch (i) {
            case 0:
                nkbVar.getClass();
                v76Var.d(glgVar, nkbVar);
                break;
            case 1:
                nkbVar.getClass();
                v76Var.e(glgVar, nkbVar);
                break;
            default:
                nkbVar.getClass();
                v76Var.c(glgVar, nkbVar);
                break;
        }
        return Unit.a;
    }
}
