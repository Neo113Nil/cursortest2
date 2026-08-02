package k80;

import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment;
import ru.ozon.fintech.features.tabber.presentation.apvz.ApvzNewActivity;

/* renamed from: k80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7607a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f71089b;

    public /* synthetic */ C7607a(Object obj, int i11) {
        this.f71088a = i11;
        this.f71089b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f71089b;
        switch (this.f71088a) {
            case 0:
                int i11 = ApvzNewActivity.f96323t0;
                return ((ApvzNewActivity) obj).J();
            default:
                return ((OnboardingFragment) obj).getFactory();
        }
    }
}
