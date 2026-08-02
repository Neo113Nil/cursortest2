package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.regulardraw.onboarding.MorkovskOnboardingDelegate;
import ru.ozon.app.android.regulardraw.onboarding.di.MorkovskOnboardingComponentApi;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.core.MorkovskTabbarMapper;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"ru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/di/MorkovskTabbarComponent$Companion$create$1$1", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/di/MorkovskTabbarComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "morkovskOnboardingComponentApi", "Lru/ozon/app/android/regulardraw/onboarding/di/MorkovskOnboardingComponentApi;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v1/core/MorkovskTabbarMapper;", "mapper", "Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "getOnboardingDelegate", "()Lru/ozon/app/android/regulardraw/onboarding/MorkovskOnboardingDelegate;", "onboardingDelegate", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarComponent$Companion$create$1$1 implements MorkovskTabbarComponent {
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new MorkovskTabbarComponent$Companion$create$1$1$mapper$2(this));
    private final MorkovskOnboardingComponentApi morkovskOnboardingComponentApi;

    MorkovskTabbarComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.morkovskOnboardingComponentApi = (MorkovskOnboardingComponentApi) c7475g.getComponent(MorkovskOnboardingComponentApi.class);
    }

    @Override // ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.di.MorkovskTabbarComponent
    public MorkovskTabbarMapper getMapper() {
        return (MorkovskTabbarMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.di.MorkovskTabbarComponent
    public MorkovskOnboardingDelegate getOnboardingDelegate() {
        return this.morkovskOnboardingComponentApi.getMorkovskOnboardingDelegate();
    }
}
