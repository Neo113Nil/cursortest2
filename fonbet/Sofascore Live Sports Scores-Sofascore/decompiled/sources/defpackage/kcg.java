package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Timer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kcg {
    public final int a;
    public final int b;
    public final hcg c;
    public final bo4 d;
    public final bo4 e;
    public final View f;
    public tdg g;

    public kcg(Context context, int i, int i2) {
        hcg hcgVar = new hcg(context);
        this.a = i;
        this.b = i2;
        this.c = hcgVar;
        final int i3 = 0;
        this.d = new bo4(i, new j9g(26), new Function0(this) { // from class: icg
            public final /* synthetic */ kcg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                kcg kcgVar = this.b;
                switch (i4) {
                    case 0:
                        bo4 bo4Var = kcgVar.d;
                        bo4Var.getClass();
                        rcg rcgVar = rcg.e;
                        bo4Var.e = rcgVar;
                        ((Timer) bo4Var.f).cancel();
                        bo4 bo4Var2 = kcgVar.e;
                        bo4Var2.getClass();
                        bo4Var2.e = rcgVar;
                        ((Timer) bo4Var2.f).cancel();
                        tdg tdgVar = kcgVar.g;
                        if (tdgVar != null) {
                            xag xagVar = tdgVar.q;
                            if (xagVar != null) {
                                bea.r(xagVar);
                            }
                            veg vegVar = tdgVar.r;
                            if (vegVar != null) {
                                vegVar.a("window.mraidbridge.notifyCloseEvent();");
                            }
                        }
                        break;
                    default:
                        kcgVar.c.a(true);
                        break;
                }
                return Unit.a;
            }
        });
        long j = i2;
        final int i4 = 1;
        this.e = new bo4(j, new mme(this, 27), new Function0(this) { // from class: icg
            public final /* synthetic */ kcg b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i42 = i4;
                kcg kcgVar = this.b;
                switch (i42) {
                    case 0:
                        bo4 bo4Var = kcgVar.d;
                        bo4Var.getClass();
                        rcg rcgVar = rcg.e;
                        bo4Var.e = rcgVar;
                        ((Timer) bo4Var.f).cancel();
                        bo4 bo4Var2 = kcgVar.e;
                        bo4Var2.getClass();
                        bo4Var2.e = rcgVar;
                        ((Timer) bo4Var2.f).cancel();
                        tdg tdgVar = kcgVar.g;
                        if (tdgVar != null) {
                            xag xagVar = tdgVar.q;
                            if (xagVar != null) {
                                bea.r(xagVar);
                            }
                            veg vegVar = tdgVar.r;
                            if (vegVar != null) {
                                vegVar.a("window.mraidbridge.notifyCloseEvent();");
                            }
                        }
                        break;
                    default:
                        kcgVar.c.a(true);
                        break;
                }
                return Unit.a;
            }
        });
        this.f = hcgVar.getView();
        hcgVar.setClickListener(new cne(this, 15));
        if (i2 <= 0) {
            hcgVar.a(true);
            return;
        }
        String valueOf = String.valueOf((int) Math.ceil(j / 1000.0d));
        valueOf.getClass();
        xw3.L(hcgVar.a, null, null, new m1f(hcgVar, valueOf, null, 9), 3);
    }
}
