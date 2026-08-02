package defpackage;

import com.sofascore.results.bettingtips.fragment.BetBoostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class nu1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BetBoostFragment b;

    public /* synthetic */ nu1(BetBoostFragment betBoostFragment, int i) {
        this.a = i;
        this.b = betBoostFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        BetBoostFragment betBoostFragment = this.b;
        switch (i) {
            case 0:
                iu1 iu1Var = (iu1) obj;
                iu1Var.getClass();
                return Boolean.valueOf((iu1Var instanceof fu1) && ((fu1) iu1Var).a.getEvent().getId() == betBoostFragment.A().k);
            default:
                betBoostFragment.M().m = (zu1) obj;
                betBoostFragment.I();
                return Unit.a;
        }
    }
}
