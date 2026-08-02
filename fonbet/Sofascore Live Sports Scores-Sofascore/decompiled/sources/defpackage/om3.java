package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class om3 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ pm3 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om3(pm3 pm3Var, int i) {
        super(1);
        this.i = i;
        this.j = pm3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        pm3 pm3Var = this.j;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                    function0.invoke();
                } else {
                    Handler handler = pm3Var.b;
                    if (handler == null) {
                        handler = new Handler(Looper.getMainLooper());
                        pm3Var.b = handler;
                    }
                    handler.post(new iy(6, function0));
                }
                break;
            default:
                pm3Var.d = true;
                break;
        }
        return Unit.a;
    }
}
