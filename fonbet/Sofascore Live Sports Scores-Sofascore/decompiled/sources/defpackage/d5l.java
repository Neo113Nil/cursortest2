package defpackage;

import com.sofascore.results.weeklyChallenge.predictions.WeeklyPredictionsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class d5l implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeeklyPredictionsFragment b;

    public /* synthetic */ d5l(WeeklyPredictionsFragment weeklyPredictionsFragment, int i) {
        this.a = i;
        this.b = weeklyPredictionsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        WeeklyPredictionsFragment weeklyPredictionsFragment = this.b;
        switch (i) {
            case 0:
                f6e f6eVar = (f6e) obj;
                weeklyPredictionsFragment.n();
                cbf C = weeklyPredictionsFragment.C();
                g6b lifecycle = weeklyPredictionsFragment.getLifecycle();
                lifecycle.getClass();
                f6eVar.getClass();
                C.r(lifecycle, f6eVar);
                break;
            case 1:
                int i2 = g5l.a[((cg) obj).a.ordinal()];
                joa joaVar = weeklyPredictionsFragment.z;
                if (i2 == 1) {
                    ((yk) joaVar.getValue()).show();
                } else {
                    ((yk) joaVar.getValue()).dismiss();
                }
                break;
            case 2:
                x2g x2gVar = (x2g) obj;
                if (x2gVar != null) {
                    WeeklyPredictionsFragment weeklyPredictionsFragment2 = this.b;
                    int i3 = weeklyPredictionsFragment2.v;
                    if (x2gVar instanceof v2g) {
                        xw3.L(wca.x(weeklyPredictionsFragment2.getLifecycle()), null, null, new h5l(weeklyPredictionsFragment2, x2gVar, new WeakReference(weeklyPredictionsFragment2.requireActivity()), new WeakReference(weeklyPredictionsFragment2), null), 3);
                    } else {
                        weeklyPredictionsFragment2.E(i3, weeklyPredictionsFragment2.w);
                    }
                }
                break;
            case 3:
                ((Unit) obj).getClass();
                if (weeklyPredictionsFragment.u) {
                    weeklyPredictionsFragment.u = false;
                    weeklyPredictionsFragment.E(weeklyPredictionsFragment.v, weeklyPredictionsFragment.w);
                }
                break;
            default:
                weeklyPredictionsFragment.E(((Integer) obj).intValue(), null);
                break;
        }
        return Unit.a;
    }
}
