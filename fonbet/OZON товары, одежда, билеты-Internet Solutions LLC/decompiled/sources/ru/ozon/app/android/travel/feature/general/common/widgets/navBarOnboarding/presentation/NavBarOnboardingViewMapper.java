package ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation;

import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.data.NavBarOnboardingDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.di.NavBarOnboardingComponent;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingViewMapper;", "Lc20/r;", "Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/data/NavBarOnboardingDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/presentation/NavBarOnboardingVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/di/NavBarOnboardingComponent;", "component", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/di/NavBarOnboardingComponent;)V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/data/NavBarOnboardingDTO;Ll20/d;)Ljava/util/List;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/navBarOnboarding/di/NavBarOnboardingComponent;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavBarOnboardingViewMapper extends r<NavBarOnboardingDTO, NavBarOnboardingVO> {

    @NotNull
    private final NavBarOnboardingComponent component;

    @NotNull
    private final r.a viewType;

    public NavBarOnboardingViewMapper(@NotNull NavBarOnboardingComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.viewType = r.a.SINGLE;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<NavBarOnboardingVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new NavBarOnboardingWidgetViewHolder(container, (BaseOnBoardingViewModel) new z0(container.b0().a(), new z0.c() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.navBarOnboarding.presentation.NavBarOnboardingViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                NavBarOnboardingComponent navBarOnboardingComponent;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                navBarOnboardingComponent = NavBarOnboardingViewMapper.this.component;
                BaseOnBoardingViewModel onBoardingViewModel = navBarOnboardingComponent.getOnBoardingViewModel();
                Intrinsics.g(onBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return onBoardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.class));
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<NavBarOnboardingVO> map(@NotNull NavBarOnboardingDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
