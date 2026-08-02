package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ko1 implements o8j {
    public final tc3 a;
    public final q1d b = new q1d();
    public final e1d c = e.f(null);

    public ko1(tc3 tc3Var) {
        this.a = tc3Var;
    }

    @Override // defpackage.o8j
    public final Object a(g8j g8jVar, hoi hoiVar) {
        Object a = q1d.a(this.b, new cl(this, new jo1(g8jVar), null, 4), hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public final void b(final Function0 function0, of3 of3Var, final int i) {
        final Function0 function02;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(723898654);
        int i2 = (av8Var.g(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            jo1 jo1Var = (jo1) ((eoh) this.c).getValue();
            if (jo1Var == null) {
                eqf u = av8Var.u();
                if (u != null) {
                    u.d = new Function2(this, function0, i, i3) { // from class: io1
                        public final /* synthetic */ int a;
                        public final /* synthetic */ ko1 b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.a = i3;
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            of3 of3Var2 = (of3) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    this.b.b(this.c, of3Var2, aba.K(7));
                                    break;
                                default:
                                    this.b.b(this.c, of3Var2, aba.K(7));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            this.a.invoke(jo1Var, jo1Var.a, function02, av8Var, 384);
        } else {
            function02 = function0;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new Function2(this, function02, i, i4) { // from class: io1
                public final /* synthetic */ int a;
                public final /* synthetic */ ko1 b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = i4;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    of3 of3Var2 = (of3) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.b.b(this.c, of3Var2, aba.K(7));
                            break;
                        default:
                            this.b.b(this.c, of3Var2, aba.K(7));
                            break;
                    }
                    return Unit.a;
                }
            };
        }
    }
}
