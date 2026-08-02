package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class bpl implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ftl b;

    public /* synthetic */ bpl(ftl ftlVar, int i) {
        this.a = i;
        this.b = ftlVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ftl ftlVar = this.b;
        switch (i) {
            case 0:
                xx8 xx8Var = ftlVar.d;
                if (xx8Var != null) {
                    boolean z = xx8Var.b;
                    if (z) {
                        xx8Var.start();
                    } else {
                        w1a.k("You cannot restart a currently running animation.", !z);
                        dy8 dy8Var = (dy8) xx8Var.a.b;
                        w1a.k("Can't restart a running animation", !dy8Var.f);
                        dy8Var.h = true;
                        by8 by8Var = dy8Var.n;
                        if (by8Var != null) {
                            dy8Var.d.a(by8Var);
                            dy8Var.n = null;
                        }
                        xx8Var.start();
                    }
                }
                break;
            default:
                xx8 xx8Var2 = ftlVar.d;
                if (xx8Var2 != null) {
                    xx8Var2.start();
                }
                break;
        }
        return Unit.a;
    }
}
