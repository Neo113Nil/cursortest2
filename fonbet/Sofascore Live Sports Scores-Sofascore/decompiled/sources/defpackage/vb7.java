package defpackage;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import com.sofascore.results.fantasy.onboarding.steps.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vb7 extends hoi implements Function2 {
    public final /* synthetic */ wb7 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb7(wb7 wb7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = wb7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new vb7(this.r, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vb7) create((pb7) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        Object value;
        pb7 pb7Var;
        Boolean bool;
        boolean z;
        boolean z2;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        wb7 wb7Var = this.r;
        fdi fdiVar = wb7Var.j;
        do {
            value = fdiVar.getValue();
            pb7Var = (pb7) value;
            ev6 ev6Var = pb7Var.f;
            if (ev6Var != null) {
                bool = Boolean.valueOf(ev6Var.d == FantasyCompetitionType.WEEKLY);
            } else {
                bool = null;
            }
            z = Intrinsics.c(bool, Boolean.TRUE) || wb7Var.i;
            z2 = !Intrinsics.c(pb7Var.b, FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE);
            FantasyOnboardingStepsNavigation.Companion.getClass();
        } while (!fdiVar.k(value, pb7.a(pb7Var, null, null, a.a(z2, z).size(), 0, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, wb7Var.m(), 4194299)));
        return Unit.a;
    }
}
