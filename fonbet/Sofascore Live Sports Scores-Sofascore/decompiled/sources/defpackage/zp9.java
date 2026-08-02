package defpackage;

import com.sofascore.model.TeamSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class zp9 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ w31 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ fy7 d;
    public final /* synthetic */ ux7 e;
    public final /* synthetic */ gv9 f;
    public final /* synthetic */ TeamSelection g;
    public final /* synthetic */ xtc h;
    public final /* synthetic */ int i;

    public /* synthetic */ zp9(w31 w31Var, Function1 function1, fy7 fy7Var, ux7 ux7Var, gv9 gv9Var, TeamSelection teamSelection, xtc xtcVar, int i) {
        this.b = w31Var;
        this.c = function1;
        this.d = fy7Var;
        this.e = ux7Var;
        this.f = gv9Var;
        this.g = teamSelection;
        this.h = xtcVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.i;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                iz8.m(aba.K(i2 | 1), this.b, (of3) obj, this.e, this.d, this.f, this.h, this.g, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                rz8.q(aba.K(i2 | 1), this.b, (of3) obj, this.e, this.d, this.f, this.h, this.g, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zp9(xtc xtcVar, w31 w31Var, Function1 function1, fy7 fy7Var, ux7 ux7Var, gv9 gv9Var, TeamSelection teamSelection, int i) {
        this.h = xtcVar;
        this.b = w31Var;
        this.c = function1;
        this.d = fy7Var;
        this.e = ux7Var;
        this.f = gv9Var;
        this.g = teamSelection;
        this.i = i;
    }
}
