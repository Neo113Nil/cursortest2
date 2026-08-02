package defpackage;

import android.content.Context;
import com.sofascore.results.onboarding.OnboardingViewModel;
import com.sofascore.results.onboarding.follow.model.OnboardingItemUiModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class asd implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnboardingViewModel b;

    public /* synthetic */ asd(OnboardingViewModel onboardingViewModel, int i) {
        this.a = i;
        this.b = onboardingViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        OnboardingViewModel onboardingViewModel = this.b;
        switch (i) {
            case 0:
                OnboardingItemUiModel onboardingItemUiModel = (OnboardingItemUiModel) obj;
                onboardingItemUiModel.getClass();
                onboardingViewModel.x(new erd(onboardingItemUiModel));
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                onboardingViewModel.x(new drd(str));
                return Unit.a;
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    onboardingViewModel.x(frd.a);
                }
                return Unit.a;
            default:
                ysd ysdVar = (ysd) obj;
                ysdVar.getClass();
                Context i2 = onboardingViewModel.i();
                zic zicVar = xsd.c;
                int i3 = ysdVar.a;
                zicVar.getClass();
                String str2 = zic.H(i3).b;
                zsd zsdVar = zsd.Continue;
                nv.d0(i2, str2, "back", i3);
                return ysd.a(ysdVar, i3 - 1, null, null, null, 30);
        }
    }
}
