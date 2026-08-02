package defpackage;

import android.content.Context;
import androidx.activity.ComponentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class tb7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tb7(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                wb7 wb7Var = (wb7) obj4;
                k7d k7dVar = (k7d) obj3;
                ComponentActivity componentActivity = (ComponentActivity) obj2;
                if (((pb7) ((e1d) obj).getValue()).k > 0 && z) {
                    wb7Var.u(true);
                } else if (!k7dVar.d()) {
                    componentActivity.finish();
                }
                return Unit.a;
            case 1:
                Context context = (Context) obj4;
                h0a h0aVar = (h0a) obj3;
                Function0 function0 = (Function0) obj2;
                Function0 function02 = (Function0) obj;
                if (!z) {
                    nv.z0(context, kv.CLICK, h0aVar.m == oz9.PenaltyHistory ? "penalty_animation" : "goal_animation", "event_details");
                    function0.invoke();
                }
                function02.invoke();
                return Unit.a;
            default:
                return new dfh(this.b, (Function0) obj4, (Function0) obj3, (efh) obj2, (Function1) obj);
        }
    }
}
