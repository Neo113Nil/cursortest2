package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ma8 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fsf b;

    public /* synthetic */ ma8(fsf fsfVar, int i) {
        this.a = i;
        this.b = fsfVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        fsf fsfVar = this.b;
        switch (i) {
            case 0:
                fsfVar.a = obj;
                throw new f0(this);
            case 1:
                fsfVar.a = obj;
                throw new f0(this);
            default:
                if (fsfVar.a == rid.a) {
                    fsfVar.a = obj;
                    return Unit.a;
                }
                a70.p("Flow has more than one element");
                return null;
        }
    }
}
