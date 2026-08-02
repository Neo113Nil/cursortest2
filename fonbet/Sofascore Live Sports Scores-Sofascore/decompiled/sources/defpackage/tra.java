package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tra implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ tra(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 2:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 3:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 4:
                ia0 ia0Var = ia0.q;
                e1dVar.setValue(Boolean.valueOf(ok3.p().e().getIsLoggedIn()));
                break;
            case 5:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 6:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 7:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 8:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 9:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 10:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 11:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 12:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 13:
                dma dmaVar = (dma) e1dVar.getValue();
                if (dmaVar == null) {
                    u3a.d("Required value was null.");
                    pvd.x();
                    break;
                } else {
                    break;
                }
            case 14:
                e1dVar.setValue(null);
                break;
            case 15:
                e1dVar.setValue(null);
                break;
            case 16:
                e1dVar.setValue(null);
                break;
            case 17:
                break;
            case 18:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 19:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 20:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 21:
                e1dVar.setValue(Boolean.valueOf(!((Boolean) e1dVar.getValue()).booleanValue()));
                break;
            case 22:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 23:
                e1dVar.setValue(Boolean.TRUE);
                break;
            case 24:
                e1dVar.setValue(Boolean.FALSE);
                break;
            case 25:
                break;
            case 26:
                ale aleVar = (ale) e1dVar.getValue();
                if (aleVar != null) {
                    aleVar.pause();
                }
                break;
            case 27:
                e1dVar.setValue(qqk.a);
                break;
            case 28:
                e1dVar.setValue(qqk.a);
                break;
            default:
                e1dVar.setValue(qqk.d);
                break;
        }
        return Unit.a;
    }
}
