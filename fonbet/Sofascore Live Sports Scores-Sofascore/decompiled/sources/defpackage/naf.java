package defpackage;

import com.sofascore.results.profile.predictions.ProfilePredictionsFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class naf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfilePredictionsFragment b;

    public /* synthetic */ naf(ProfilePredictionsFragment profilePredictionsFragment, int i) {
        this.a = i;
        this.b = profilePredictionsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ProfilePredictionsFragment profilePredictionsFragment = this.b;
        switch (i) {
            case 0:
                f6e f6eVar = (f6e) obj;
                profilePredictionsFragment.n();
                cbf C = profilePredictionsFragment.C();
                g6b lifecycle = profilePredictionsFragment.getLifecycle();
                lifecycle.getClass();
                f6eVar.getClass();
                C.r(lifecycle, f6eVar);
                break;
            case 1:
                int i2 = qaf.a[((cg) obj).a.ordinal()];
                joa joaVar = profilePredictionsFragment.w;
                if (i2 == 1) {
                    ((yk) joaVar.getValue()).show();
                } else {
                    ((yk) joaVar.getValue()).dismiss();
                }
                break;
            case 2:
                x2g x2gVar = (x2g) obj;
                if (x2gVar != null) {
                    ProfilePredictionsFragment profilePredictionsFragment2 = this.b;
                    int i3 = profilePredictionsFragment2.u;
                    if (x2gVar instanceof v2g) {
                        xw3.L(wca.x(profilePredictionsFragment2.getLifecycle()), null, null, new saf(profilePredictionsFragment2, x2gVar, new WeakReference(profilePredictionsFragment2.requireActivity()), new WeakReference(profilePredictionsFragment2), null), 3);
                    } else {
                        profilePredictionsFragment2.E(i3, profilePredictionsFragment2.v);
                    }
                }
                break;
            case 3:
                ((Unit) obj).getClass();
                if (profilePredictionsFragment.t) {
                    profilePredictionsFragment.t = false;
                    profilePredictionsFragment.E(profilePredictionsFragment.u, profilePredictionsFragment.v);
                }
                break;
            default:
                profilePredictionsFragment.E(((Integer) obj).intValue(), null);
                break;
        }
        return Unit.a;
    }
}
