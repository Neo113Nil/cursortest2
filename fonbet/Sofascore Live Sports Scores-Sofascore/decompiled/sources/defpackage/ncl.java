package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ncl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qcl b;
    public final /* synthetic */ lcl c;

    public /* synthetic */ ncl(qcl qclVar, lcl lclVar, int i) {
        this.a = i;
        this.b = qclVar;
        this.c = lclVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        lcl lclVar = this.c;
        qcl qclVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                qclVar.b.a0(glgVar, lclVar);
                break;
            default:
                glgVar.getClass();
                qclVar.c.e0(glgVar, lclVar);
                break;
        }
        return Unit.a;
    }
}
