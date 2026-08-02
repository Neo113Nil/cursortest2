package defpackage;

import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class lv3 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lv3(long j, gv9 gv9Var, e1d e1dVar, e1d e1dVar2) {
        this.c = e1dVar;
        this.d = e1dVar2;
        this.e = gv9Var;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                e1d e1dVar = (e1d) obj5;
                e1d e1dVar2 = (e1d) obj4;
                gv9 gv9Var = (gv9) obj3;
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    fz8.b(x23.a, ((String) e1dVar.getValue()).length() > 0, null, null, null, null, yqo.H(-97822096, av8Var, new jv3(this.b, gv9Var, e1dVar2, e1dVar)), av8Var, 1572864, 30);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                oyn.l((ImageVector) obj5, (String) obj4, (xtc) obj3, this.b, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                r4a.i((xtc) obj5, this.b, (Function0) obj4, (Function0) obj3, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lv3(xtc xtcVar, long j, Function0 function0, Function0 function02, int i) {
        this.c = xtcVar;
        this.b = j;
        this.d = function0;
        this.e = function02;
    }

    public /* synthetic */ lv3(ImageVector imageVector, String str, xtc xtcVar, long j, int i) {
        this.c = imageVector;
        this.d = str;
        this.e = xtcVar;
        this.b = j;
    }
}
