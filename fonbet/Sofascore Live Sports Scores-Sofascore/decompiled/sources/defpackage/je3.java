package defpackage;

import com.sofascore.model.mvvm.model.Event;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class je3 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ je3(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function1.invoke(bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                function1.invoke(bool2);
                break;
            default:
                function1.invoke((Event) obj);
                break;
        }
        return Unit.a;
    }
}
