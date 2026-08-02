package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class eqh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;

    public /* synthetic */ eqh(int i, e1d e1dVar) {
        this.a = i;
        this.b = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        e1d e1dVar = this.b;
        switch (i) {
            case 0:
                c7a c7aVar = (c7a) obj;
                long j = c7aVar.a;
                e1dVar.setValue(c7aVar);
                break;
            case 1:
                ie8 ie8Var = (ie8) obj;
                ie8Var.getClass();
                e1dVar.setValue(Boolean.valueOf(ie8Var.g()));
                break;
            case 2:
                ie8 ie8Var2 = (ie8) obj;
                ie8Var2.getClass();
                e1dVar.setValue(Boolean.valueOf(ie8Var2.g()));
                break;
            case 3:
                jki jkiVar = (jki) obj;
                jkiVar.getClass();
                e1dVar.setValue(jkiVar);
                break;
            case 4:
                r1k r1kVar = (r1k) obj;
                r1kVar.getClass();
                e1dVar.setValue(r1kVar);
                break;
            case 5:
                ((o55) obj).getClass();
                break;
            case 6:
                e6j e6jVar = (e6j) obj;
                e6jVar.getClass();
                e1dVar.setValue(e6jVar);
                break;
            case 7:
                ((Function1) e1dVar.getValue()).invoke((dnd) obj);
                break;
            case 8:
                e1dVar.setValue((dma) obj);
                break;
            case 9:
                ie8 ie8Var3 = (ie8) obj;
                ie8Var3.getClass();
                e1dVar.setValue(Boolean.valueOf(ie8Var3.g()));
                break;
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                e1dVar.setValue(bool);
                break;
            case 11:
                ((o55) obj).getClass();
                break;
            case 12:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                e1dVar.setValue(bool2);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                e1dVar.setValue(str);
                break;
        }
        return Unit.a;
    }
}
