package ru.ozon.app.android.pdp.ui.configurators.tooltip;

import Ae.M0;
import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayDisableRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayOnPageRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDisplayRepository;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/tooltip/TooltipViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;", "displayRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;", "displayOnPageRepository", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;", "displayDisableRepository", "<init>", "(Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayOnPageRepository;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDisplayDisableRepository;)V", "", "onTooltipActivated", "()V", "onTooltipClosed", "LAe/x0;", "", "_tooltipClosed", "LAe/x0;", "LAe/M0;", "tooltipClosed", "LAe/M0;", "getTooltipClosed", "()LAe/M0;", "_isTooltipVisible", "isTooltipVisible", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TooltipViewModel extends BaseOnBoardingViewModel {

    @NotNull
    private final x0<Boolean> _isTooltipVisible;

    @NotNull
    private final x0<Boolean> _tooltipClosed;

    @NotNull
    private final M0<Boolean> isTooltipVisible;

    @NotNull
    private final M0<Boolean> tooltipClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipViewModel(@NotNull OnBoardingDisplayRepository displayRepository, @NotNull OnBoardingDisplayOnPageRepository displayOnPageRepository, @NotNull OnBoardingDisplayDisableRepository displayDisableRepository) {
        super(displayRepository, displayOnPageRepository, displayDisableRepository);
        Intrinsics.checkNotNullParameter(displayRepository, "displayRepository");
        Intrinsics.checkNotNullParameter(displayOnPageRepository, "displayOnPageRepository");
        Intrinsics.checkNotNullParameter(displayDisableRepository, "displayDisableRepository");
        Boolean bool = Boolean.FALSE;
        x0<Boolean> a11 = O0.a(bool);
        this._tooltipClosed = a11;
        this.tooltipClosed = a11;
        x0<Boolean> a12 = O0.a(bool);
        this._isTooltipVisible = a12;
        this.isTooltipVisible = a12;
    }

    @NotNull
    public final M0<Boolean> getTooltipClosed() {
        return this.tooltipClosed;
    }

    @NotNull
    public final M0<Boolean> isTooltipVisible() {
        return this.isTooltipVisible;
    }

    public final void onTooltipActivated() {
        this._isTooltipVisible.setValue(Boolean.TRUE);
    }

    public final void onTooltipClosed() {
        this._tooltipClosed.setValue(Boolean.TRUE);
        this._isTooltipVisible.setValue(Boolean.FALSE);
    }
}
