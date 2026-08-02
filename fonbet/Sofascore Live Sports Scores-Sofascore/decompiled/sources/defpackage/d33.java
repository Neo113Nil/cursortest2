package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d33 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ d33(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    @Override // defpackage.b98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, rq3 rq3Var) {
        c33 c33Var;
        int i;
        g9i L;
        oi oiVar;
        int i2 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.f;
        Object obj6 = this.g;
        Object obj7 = this.e;
        rq3 rq3Var2 = null;
        switch (i2) {
            case 0:
                if (rq3Var instanceof c33) {
                    c33Var = (c33) rq3Var;
                    int i3 = c33Var.t;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c33Var.t = i3 - Integer.MIN_VALUE;
                        Object obj8 = c33Var.r;
                        lu3 lu3Var = lu3.a;
                        i = c33Var.t;
                        if (i != 0) {
                            y6a.M(obj8);
                            Unit unit = Unit.a;
                            jk jkVar = new jk((j8f) obj3, (b98) obj7, (igm) obj5, obj, (aea) obj6, (rq3) null, 2);
                            c33Var.t = 1;
                            if (td4.B0((CoroutineContext) obj2, unit, obj4, jkVar, c33Var) == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj8);
                        }
                        return Unit.a;
                    }
                }
                c33Var = new c33(this, rq3Var);
                Object obj82 = c33Var.r;
                lu3 lu3Var2 = lu3.a;
                i = c33Var.t;
                if (i != 0) {
                }
                return Unit.a;
            default:
                ku3 ku3Var = (ku3) obj7;
                j52 j52Var = (j52) obj;
                Function0 function0 = (Function0) obj6;
                dfh dfhVar = (dfh) obj5;
                rgh rghVar = (rgh) obj4;
                ComponentActivity componentActivity = (ComponentActivity) obj3;
                int i4 = 12;
                if (j52Var instanceof i42) {
                    u6b u6bVar = (u6b) obj2;
                    if (u6bVar instanceof Fragment) {
                        if (Intrinsics.c(((Fragment) u6bVar).toString(), ((i42) j52Var).a)) {
                            rghVar.a();
                            ia0 ia0Var = ia0.q;
                            String type = ok3.p().e().getType();
                            Intent intent = componentActivity.getIntent();
                            intent.getClass();
                            nv.W(componentActivity, type, intent);
                            L = xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var2, i4), 3);
                            oiVar = new oi(function0, i4);
                            L.n(oiVar);
                        }
                        return Unit.a;
                    }
                }
                if (j52Var == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.common.broadcastUtil.BroadcastEvent.SyncSuccess");
                    return null;
                }
                rghVar.a();
                ia0 ia0Var2 = ia0.q;
                String type2 = ok3.p().e().getType();
                Intent intent2 = componentActivity.getIntent();
                intent2.getClass();
                nv.W(componentActivity, type2, intent2);
                L = xw3.L(ku3Var, null, null, new u87(dfhVar, rq3Var2, i4), 3);
                oiVar = new oi(function0, i4);
                L.n(oiVar);
                return Unit.a;
        }
    }
}
