package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ocl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qcl b;
    public final /* synthetic */ glg c;

    public /* synthetic */ ocl(qcl qclVar, glg glgVar, int i) {
        this.a = i;
        this.b = qclVar;
        this.c = glgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        glg glgVar = this.c;
        qcl qclVar = this.b;
        dh0 dh0Var = (dh0) obj;
        switch (i) {
            case 0:
                dh0Var.getClass();
                qclVar.a(glgVar, dh0Var);
                break;
            default:
                dh0Var.getClass();
                qclVar.b(glgVar, dh0Var);
                break;
        }
        return Unit.a;
    }
}
