package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class o30 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t30 b;

    public /* synthetic */ o30(t30 t30Var, int i) {
        this.a = i;
        this.b = t30Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        t30 t30Var = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = t30Var.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new iy(2, function0));
                    }
                }
                return Unit.a;
            case 1:
                ActionMode actionMode = t30Var.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.a;
            case 2:
                ActionMode actionMode2 = t30Var.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.a;
            default:
                t30Var.e.j();
                return new le(t30Var, 3);
        }
    }
}
