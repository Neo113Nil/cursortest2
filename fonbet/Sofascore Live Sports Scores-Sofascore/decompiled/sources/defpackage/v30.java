package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class v30 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ v30(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                dma dmaVar = (dma) e1dVar.getValue();
                if (dmaVar != null) {
                    return dmaVar;
                }
                u3a.d("Required value was null.");
                pvd.x();
                return null;
            case 1:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 2:
                e1dVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 3:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 4:
                e1dVar.setValue(null);
                return Unit.a;
            case 5:
                dma dmaVar2 = (dma) e1dVar.getValue();
                if (dmaVar2 != null) {
                    return dmaVar2;
                }
                u3a.d("Required value was null.");
                pvd.x();
                return null;
            case 6:
                if (e1dVar != null) {
                    return (List) e1dVar.getValue();
                }
                return null;
            case 7:
                e1dVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 8:
                Boolean bool = (Boolean) e1dVar.getValue();
                bool.booleanValue();
                return bool;
            case 9:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 10:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 11:
                aij aijVar = (aij) e1dVar.getValue();
                aij aijVar2 = aij.b;
                if (aijVar == aijVar2) {
                    aijVar2 = aij.a;
                }
                e1dVar.setValue(aijVar2);
                return Unit.a;
            case 12:
                aij aijVar3 = (aij) e1dVar.getValue();
                aij aijVar4 = aij.c;
                if (aijVar3 == aijVar4) {
                    aijVar4 = aij.a;
                }
                e1dVar.setValue(aijVar4);
                return Unit.a;
            case 13:
                e1dVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 14:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                return Unit.a;
            case 15:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 16:
                e1dVar.setValue(Boolean.TRUE);
                return Unit.a;
            case 17:
                e1dVar.setValue(null);
                return Unit.a;
            case 18:
                e1dVar.setValue(null);
                return Unit.a;
            case 19:
                Unit unit = Unit.a;
                e1dVar.setValue(unit);
                return unit;
            case 20:
                return Boolean.valueOf(!StringsKt.R((String) e1dVar.getValue()));
            case 21:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                return Unit.a;
            case 22:
                ia0 ia0Var = ia0.q;
                e1dVar.setValue(Boolean.valueOf(ok3.p().e().getIsLoggedIn()));
                return Unit.a;
            case 23:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 24:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                return Unit.a;
            case 25:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 26:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                return Unit.a;
            case 27:
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 28:
                return new yoa((Function1) e1dVar.getValue());
            default:
                return (uqa) ((Function0) e1dVar.getValue()).invoke();
        }
    }
}
