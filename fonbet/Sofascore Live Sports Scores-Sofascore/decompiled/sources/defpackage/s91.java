package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s91 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ s91(e1d e1dVar, Function1 function1, int i) {
        this.a = i;
        this.b = e1dVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        e1d e1dVar = this.b;
        Function1 function1 = this.c;
        switch (i) {
            case 0:
                function1.invoke(new q91((wj1) e1dVar.getValue()));
                break;
            case 1:
                uv3 uv3Var = (uv3) e1dVar.getValue();
                if (uv3Var != null) {
                    function1.invoke(uv3Var);
                }
                break;
            case 2:
                e1dVar.setValue("");
                function1.invoke("");
                break;
            case 3:
                function1.invoke((String) e1dVar.getValue());
                break;
            case 4:
                Bitmap bitmap = (Bitmap) e1dVar.getValue();
                if (bitmap == null) {
                    a70.r("Required value was null.");
                    break;
                } else {
                    function1.invoke(new y17(bitmap));
                    break;
                }
            case 5:
                function1.invoke((String) e1dVar.getValue());
                break;
            case 6:
                do7 do7Var = ((pb7) e1dVar.getValue()).v;
                if (do7Var != null) {
                    function1.invoke(Integer.valueOf(do7Var.c.c));
                }
                break;
            case 7:
                function1.invoke((cm7) e1dVar.getValue());
                break;
            case 8:
                e1dVar.setValue(rrc.a);
                function1.invoke((rrc) e1dVar.getValue());
                break;
            case 9:
                e1dVar.setValue(rrc.b);
                function1.invoke((rrc) e1dVar.getValue());
                break;
            case 10:
                y1d y1dVar = (y1d) e1dVar.getValue();
                if (y1dVar != null) {
                    function1.invoke(y1dVar);
                }
                break;
            case 11:
                Bitmap bitmap2 = (Bitmap) e1dVar.getValue();
                if (bitmap2 != null) {
                    function1.invoke(bitmap2);
                }
                break;
            default:
                function1.invoke(new ahl((String) e1dVar.getValue()));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ s91(Function1 function1, e1d e1dVar, int i) {
        this.a = i;
        this.c = function1;
        this.b = e1dVar;
    }
}
