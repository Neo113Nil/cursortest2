package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.title;

import jk0.q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.buttonSwitcher.ButtonWithInformationSwitcherViewModel;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleView;", "containerView", "Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "buttonSwitcherViewModel", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleView;Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleVO;Ll20/d;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffs/presentation/title/AviaCheckTariffsTitleView;", "Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "", "isTitleScrolledToMiddle", "Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsTitleViewHolder extends k<AviaCheckTariffsTitleVO> {

    @NotNull
    private final ButtonWithInformationSwitcherViewModel buttonSwitcherViewModel;

    @NotNull
    private final AviaCheckTariffsTitleView containerView;
    private boolean isTitleScrolledToMiddle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsTitleViewHolder(@NotNull AviaCheckTariffsTitleView containerView, @NotNull ButtonWithInformationSwitcherViewModel buttonSwitcherViewModel) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(buttonSwitcherViewModel, "buttonSwitcherViewModel");
        this.containerView = containerView;
        this.buttonSwitcherViewModel = buttonSwitcherViewModel;
    }

    @Override // jk0.j, jk0.n
    public void onVisibleAreaChanged(@NotNull q info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onVisibleAreaChanged(info);
        if (this.isTitleScrolledToMiddle || info.b().isEmpty() || info.a().e().isEmpty() || info.b().top > info.a().e().centerY()) {
            return;
        }
        this.isTitleScrolledToMiddle = true;
        this.buttonSwitcherViewModel.onSwitcherChanged(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AviaCheckTariffsTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.bind(item);
    }
}
