package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kug implements PointerInputEventHandler {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Object f;

    public kug(View view, Function1 function1, boolean z, Function0 function0, Function0 function02) {
        this.f = view;
        this.b = function1;
        this.c = z;
        this.d = function0;
        this.e = function02;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                ooi ooiVar = (ooi) qzeVar;
                ooiVar.getClass();
                ooi ooiVar2 = (ooi) qzeVar;
                Object k1 = ooiVar2.k1(new jug(new csf(), new csf(), new asf(), new asf(), (View) obj, this.b, c6o.c0(ooiVar).A.g(), this.c, this.d, this.e, null), rq3Var);
                if (k1 != lu3.a) {
                    break;
                }
                break;
            default:
                Function0 function0 = this.e;
                ooi ooiVar3 = (ooi) qzeVar;
                Object k12 = ooiVar3.k1(new gth(this.b, (hsk) obj, this.c, this.d, function0, null), rq3Var);
                if (k12 != lu3.a) {
                    break;
                }
                break;
        }
        return Unit.a;
    }

    public kug(Function1 function1, hsk hskVar, boolean z, Function0 function0, Function0 function02) {
        this.b = function1;
        this.f = hskVar;
        this.c = z;
        this.d = function0;
        this.e = function02;
    }
}
