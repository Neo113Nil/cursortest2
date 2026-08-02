package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sy extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ xy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy(xy xyVar, int i) {
        super(1);
        this.i = i;
        this.j = xyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        xy xyVar = this.j;
        switch (i) {
            case 0:
                ((yd8) xyVar.getFocusOwner()).h(((md8) obj).a, false);
                return Unit.a;
            case 1:
                Function0 function0 = (Function0) obj;
                xyVar.getUncaughtExceptionHandler$ui();
                Handler handler = xyVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = xyVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new iy(1, function0));
                    }
                }
                return Unit.a;
            default:
                return new j20(xyVar, xyVar.getTextInputService(), (ku3) obj);
        }
    }
}
