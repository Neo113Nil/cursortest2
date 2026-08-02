package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h5l extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ WeeklyPredictionsFragment s;
    public final /* synthetic */ x2g t;
    public final /* synthetic */ WeakReference u;
    public final /* synthetic */ WeakReference v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5l(WeeklyPredictionsFragment weeklyPredictionsFragment, x2g x2gVar, WeakReference weakReference, WeakReference weakReference2, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = weeklyPredictionsFragment;
        this.t = x2gVar;
        this.u = weakReference;
        this.v = weakReference2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new h5l(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h5l) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        if (i == 0) {
            y6a.M(obj);
            WeeklyPredictionsFragment weeklyPredictionsFragment = this.s;
            g6b lifecycle = weeklyPredictionsFragment.getLifecycle();
            e6b e6bVar = e6b.e;
            hs4 hs4Var = z45.a;
            r69 r69Var = rob.a.f;
            boolean e0 = r69Var.e0(getContext());
            x2g x2gVar = this.t;
            WeakReference weakReference = this.u;
            WeakReference weakReference2 = this.v;
            if (!e0) {
                if (lifecycle.b() == e6b.a) {
                    throw new l6b(null, 0);
                }
                if (lifecycle.b().compareTo(e6bVar) >= 0) {
                    u4g D = weeklyPredictionsFragment.D();
                    Object obj2 = ((v2g) x2gVar).a;
                    D.n((ksh) obj2, AdType.RewardedInterstitial.ProfileWhoWillWin, new raf(1, weakReference2));
                    FragmentActivity fragmentActivity = (FragmentActivity) weakReference.get();
                    if (fragmentActivity != null) {
                        ((g19) ((ksh) obj2)).a(fragmentActivity);
                    }
                    Unit unit = Unit.a;
                }
            }
            e32 e32Var = new e32(weeklyPredictionsFragment, x2gVar, weakReference, weakReference2, 9);
            this.r = 1;
            if (yfa.M(lifecycle, e6bVar, e0, r69Var, e32Var, this) == lu3Var) {
                return lu3Var;
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        return Unit.a;
    }
}
