package defpackage;

import android.content.Context;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.onboarding.OnboardingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yrd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OnboardingViewModel b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ BaseActivity e;

    public /* synthetic */ yrd(OnboardingViewModel onboardingViewModel, boolean z, Context context, BaseActivity baseActivity, int i) {
        this.a = i;
        this.b = onboardingViewModel;
        this.c = z;
        this.d = context;
        this.e = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        BaseActivity baseActivity = this.e;
        Context context = this.d;
        boolean z = this.c;
        OnboardingViewModel onboardingViewModel = this.b;
        switch (i) {
            case 0:
                fsd.b(onboardingViewModel, z, context, baseActivity, grd.a);
                break;
            default:
                fsd.b(onboardingViewModel, z, context, baseActivity, ard.a);
                break;
        }
        return Unit.a;
    }
}
