package defpackage;

import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class raf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;

    public /* synthetic */ raf(int i, WeakReference weakReference) {
        this.a = i;
        this.b = weakReference;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        WeakReference weakReference = this.b;
        switch (i) {
            case 0:
                ((c19) obj).getClass();
                ProfilePredictionsFragment profilePredictionsFragment = (ProfilePredictionsFragment) weakReference.get();
                if (profilePredictionsFragment != null) {
                    profilePredictionsFragment.t = true;
                }
                break;
            default:
                ((c19) obj).getClass();
                WeeklyPredictionsFragment weeklyPredictionsFragment = (WeeklyPredictionsFragment) weakReference.get();
                if (weeklyPredictionsFragment != null) {
                    weeklyPredictionsFragment.u = true;
                }
                break;
        }
        return Unit.a;
    }
}
