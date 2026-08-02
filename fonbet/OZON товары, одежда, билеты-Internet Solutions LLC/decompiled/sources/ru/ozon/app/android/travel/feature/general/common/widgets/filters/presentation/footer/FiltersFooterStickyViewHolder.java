package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer;

import Sc.o;
import WZ.l;
import android.view.View;
import android.widget.LinearLayout;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.FiltersRefreshActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.footer.FiltersFooterVO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterStickyViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;", "Ll10/i;", "container", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;LWZ/l;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/e;)V", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "filtersRefreshActionHandler", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/FiltersRefreshActionHandler;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterView;", "getFiltersFooterView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/footer/FiltersFooterView;", "filtersFooterView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersFooterStickyViewHolder extends AbstractC6064a<FiltersFooterVO> {

    @NotNull
    private final i container;

    @NotNull
    private final FiltersRefreshActionHandler filtersRefreshActionHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersFooterStickyViewHolder(@NotNull i container, @NotNull l tokenizedAnalytics, @NotNull HandlersInhibitor handlersInhibitor, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.filtersRefreshActionHandler = new FiltersRefreshActionHandler(container, tokenizedAnalytics, handlersInhibitor, this);
    }

    private final FiltersFooterView getFiltersFooterView() {
        View view = getView();
        if (view instanceof FiltersFooterView) {
            return (FiltersFooterView) view;
        }
        return null;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull FiltersFooterVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item instanceof FiltersFooterVO.EmptyState) {
            this.container.M().m(((FiltersFooterVO.EmptyState) item).getId());
            return;
        }
        if (!(item instanceof FiltersFooterVO.State)) {
            throw new o();
        }
        FiltersFooterVO.State state = (FiltersFooterVO.State) item;
        this.filtersRefreshActionHandler.bind(state.getId());
        FiltersFooterView filtersFooterView = getFiltersFooterView();
        if (filtersFooterView != null) {
            filtersFooterView.bind(state, this.filtersRefreshActionHandler);
        }
    }
}
