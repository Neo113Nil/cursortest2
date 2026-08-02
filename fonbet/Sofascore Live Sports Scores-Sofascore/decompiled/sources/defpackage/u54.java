package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class u54 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ u54(int i, e1d e1dVar, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.c;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                e1dVar.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 1:
                e1dVar.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 2:
                e1dVar.setValue(Boolean.FALSE);
                function0.invoke();
                break;
            case 3:
                if (((Boolean) e1dVar.getValue()).booleanValue()) {
                    function0.invoke();
                }
                e1dVar.setValue(Boolean.FALSE);
                break;
            default:
                if (((qqk) e1dVar.getValue()) == qqk.a) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                    e1dVar.setValue(qqk.b);
                }
                break;
        }
        return Unit.a;
    }
}
