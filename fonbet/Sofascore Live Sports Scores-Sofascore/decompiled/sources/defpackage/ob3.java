package defpackage;

import androidx.activity.ComponentActivity;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class ob3 implements p6b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ob3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.p6b
    public final void onStateChanged(u6b u6bVar, d6b d6bVar) {
        switch (this.a) {
            case 0:
                ComponentActivity.h((upd) this.b, (ComponentActivity) this.c, u6bVar, d6bVar);
                break;
            case 1:
                ip8 ip8Var = (ip8) this.b;
                d6d d6dVar = (d6d) this.c;
                if (d6bVar == d6b.ON_RESUME && ((List) ip8Var.b().e.a.getValue()).contains(d6dVar)) {
                    if (ip8.n()) {
                        Objects.toString(d6dVar);
                        Objects.toString(u6bVar);
                    }
                    ip8Var.b().c(d6dVar);
                }
                if (d6bVar == d6b.ON_DESTROY) {
                    if (ip8.n()) {
                        Objects.toString(d6dVar);
                        Objects.toString(u6bVar);
                    }
                    ip8Var.b().c(d6dVar);
                    break;
                }
                break;
            case 2:
                i6b i6bVar = (i6b) this.b;
                yda ydaVar = (yda) this.c;
                if (u6bVar.getLifecycle().b() != e6b.a) {
                    int compareTo = u6bVar.getLifecycle().b().compareTo(i6bVar.b);
                    r45 r45Var = i6bVar.c;
                    if (compareTo >= 0) {
                        if (r45Var.a) {
                            if (!r45Var.b) {
                                r45Var.a = false;
                                r45Var.a();
                                break;
                            } else {
                                a70.r("Cannot resume a finished dispatcher");
                                break;
                            }
                        }
                    } else {
                        r45Var.a = true;
                        break;
                    }
                } else {
                    ydaVar.e(null);
                    i6bVar.a();
                    break;
                }
                break;
            case 3:
                d6b d6bVar2 = (d6b) this.b;
                e1d e1dVar = (e1d) this.c;
                if (d6bVar == d6bVar2) {
                    ((Function0) e1dVar.getValue()).invoke();
                    break;
                }
                break;
            case 4:
                afc afcVar = (afc) this.b;
                zfc zfcVar = (zfc) this.c;
                afcVar.getClass();
                if (d6bVar == d6b.ON_DESTROY) {
                    afcVar.a(zfcVar);
                    break;
                }
                break;
            default:
                OnboardingViewModel onboardingViewModel = (OnboardingViewModel) this.b;
                BaseActivity baseActivity = (BaseActivity) this.c;
                if (d6bVar == d6b.ON_DESTROY && !onboardingViewModel.u && !baseActivity.isChangingConfigurations()) {
                    onboardingViewModel.x(grd.a);
                    v8a.d = false;
                    break;
                }
                break;
        }
    }
}
