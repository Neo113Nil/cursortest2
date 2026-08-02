package defpackage;

import android.content.Context;
import com.sofascore.results.referee.events.RefereeEventsFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vsf extends hoi implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ RefereeEventsFragment s;
    public final /* synthetic */ List t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsf(RefereeEventsFragment refereeEventsFragment, List list, rq3 rq3Var, int i) {
        super(1, rq3Var);
        this.r = i;
        this.s = refereeEventsFragment;
        this.t = list;
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        int i = this.r;
        List list = this.t;
        RefereeEventsFragment refereeEventsFragment = this.s;
        switch (i) {
            case 0:
                return new vsf(refereeEventsFragment, list, rq3Var, 0);
            default:
                return new vsf(refereeEventsFragment, list, rq3Var, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rq3 rq3Var = (rq3) obj;
        switch (this.r) {
        }
        return ((vsf) create(rq3Var)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        RefereeEventsFragment refereeEventsFragment = this.s;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                Context requireContext = refereeEventsFragment.requireContext();
                requireContext.getClass();
                List list = this.t;
                list.getClass();
                return mx9.u(requireContext, list, null, null, true, false, false, false, null, 7660);
            default:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                Context requireContext2 = refereeEventsFragment.requireContext();
                requireContext2.getClass();
                return mx9.u(requireContext2, this.t, null, null, true, false, false, false, null, 7660);
        }
    }
}
