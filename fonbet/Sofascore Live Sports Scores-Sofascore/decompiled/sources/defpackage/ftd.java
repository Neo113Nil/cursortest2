package defpackage;

import com.ironsource.Ua;
import com.sofascore.results.onboarding.OnboardingViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ftd extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public final /* synthetic */ OnboardingViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ftd(OnboardingViewModel onboardingViewModel, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = onboardingViewModel;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        OnboardingViewModel onboardingViewModel = this.t;
        switch (i) {
            case 0:
                return new ftd(onboardingViewModel, rq3Var, 0);
            case 1:
                return new ftd(onboardingViewModel, rq3Var, 1);
            case 2:
                return new ftd(onboardingViewModel, rq3Var, 2);
            default:
                return new ftd(onboardingViewModel, rq3Var, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((ftd) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r1.u(r13, r12) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r13 == r0) goto L19;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        OnboardingViewModel onboardingViewModel = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                int i2 = this.s;
                if (i2 != 0) {
                    if (i2 == 1) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y6a.M(obj);
                w3b w3bVar = onboardingViewModel.o;
                String str = onboardingViewModel.q;
                this.s = 1;
                Object G0 = w3bVar.G0(str, null, this);
                return G0 == lu3Var ? lu3Var : G0;
            case 1:
                lu3 lu3Var2 = lu3.a;
                int i3 = this.s;
                if (i3 == 0) {
                    y6a.M(obj);
                    wve wveVar = onboardingViewModel.p;
                    String str2 = onboardingViewModel.q;
                    this.s = 1;
                    wveVar.getClass();
                    obj = yaa.P(new cl(wveVar, str2, null, 25), this);
                    if (obj == lu3Var2) {
                        return lu3Var2;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list = (List) yaa.x((x2g) obj);
                return list == null ? km5.a : list;
            case 2:
                lu3 lu3Var3 = lu3.a;
                int i4 = this.s;
                if (i4 == 0) {
                    y6a.M(obj);
                    j0j j0jVar = onboardingViewModel.n;
                    String str3 = onboardingViewModel.q;
                    this.s = 1;
                    j0jVar.getClass();
                    obj = yaa.P(new yw(null, j0jVar, str3, null, 16), this);
                    if (obj == lu3Var3) {
                        return lu3Var3;
                    }
                } else {
                    if (i4 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                List list2 = (List) yaa.x((x2g) obj);
                return list2 == null ? km5.a : list2;
            default:
                lu3 lu3Var4 = lu3.a;
                int i5 = this.s;
                if (i5 == 0) {
                    y6a.M(obj);
                    u41 u41Var = new u41(2, null, 9);
                    this.s = 1;
                    obj = wba.V(Ua.s, u41Var, this);
                    break;
                } else {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                xf0 xf0Var = (xf0) obj;
                if (xf0Var != null) {
                    this.s = 2;
                    break;
                } else {
                    return Unit.a;
                }
        }
    }
}
