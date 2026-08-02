package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class rkf implements PointerInputEventHandler {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ z69 b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public rkf(Function1 function1, z69 z69Var, e1d e1dVar, boolean z, int i, int i2) {
        this.a = function1;
        this.b = z69Var;
        this.c = e1dVar;
        this.d = z;
        this.e = i;
        this.f = i2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(final qze qzeVar, rq3 rq3Var) {
        final Function1 function1 = this.a;
        final z69 z69Var = this.b;
        final e1d e1dVar = this.c;
        vsc vscVar = new vsc(12, function1, z69Var, e1dVar);
        final boolean z = this.d;
        final int i = this.e;
        final int i2 = this.f;
        Object d = rti.d(qzeVar, vscVar, new Function1() { // from class: qkf
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                float b = llf.b(Float.intBitsToFloat((int) (((dnd) obj).a >> 32)) / ((int) (((ooi) qze.this).x >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                boolean z2 = z;
                if (z2) {
                    b = 1.0f - b;
                }
                float f = i;
                int c = llf.c(wzb.b(b * f), 0, i2);
                float f2 = c / f;
                e1dVar.setValue(z2 ? Float.valueOf(1.0f - f2) : Float.valueOf(f2));
                function1.invoke(Integer.valueOf(c));
                ((kie) z69Var).a(0);
                return Unit.a;
            }
        }, rq3Var, 5);
        return d == lu3.a ? d : Unit.a;
    }
}
