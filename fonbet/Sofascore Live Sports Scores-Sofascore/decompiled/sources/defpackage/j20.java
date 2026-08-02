package defpackage;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j20 implements ku3 {
    public final View a;
    public final gdj b;
    public final ku3 c;
    public final AtomicReference d = new AtomicReference(null);

    public j20(View view, gdj gdjVar, ku3 ku3Var) {
        this.a = view;
        this.b = gdjVar;
        this.c = ku3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(nje njeVar, sq3 sq3Var) {
        h20 h20Var;
        int i;
        if (sq3Var instanceof h20) {
            h20Var = (h20) sq3Var;
            int i2 = h20Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h20Var.t = i2 - Integer.MIN_VALUE;
                Object obj = h20Var.r;
                lu3 lu3Var = lu3.a;
                i = h20Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    i20 i20Var = new i20(0, njeVar, this);
                    rq3 rq3Var = null;
                    l0 l0Var = new l0(this, rq3Var, 12);
                    h20Var.t = 1;
                    if (s9a.r(new cce(i20Var, this.d, l0Var, rq3Var, 14), h20Var) == lu3Var) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    y6a.M(obj);
                }
                pvd.x();
            }
        }
        h20Var = new h20(this, sq3Var);
        Object obj2 = h20Var.r;
        lu3 lu3Var2 = lu3.a;
        i = h20Var.t;
        if (i != 0) {
        }
        pvd.x();
    }

    @Override // defpackage.ku3
    public final CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}
