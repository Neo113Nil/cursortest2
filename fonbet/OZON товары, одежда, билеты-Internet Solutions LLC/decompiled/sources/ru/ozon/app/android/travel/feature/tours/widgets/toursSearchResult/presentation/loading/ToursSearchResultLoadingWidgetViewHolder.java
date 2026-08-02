package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading;

import Sc.o;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6067d;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultLoadingView;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/loading/ToursSearchResultLoadingWidgetViewHolder;", "Ld20/d;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/loading/ToursSearchResultLoadingVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "viewModel", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;Ll10/i;Ld20/e;)V", "", "subscribe", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$LoaderState;", "state", "processLoadingEvent", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel$LoaderState;)V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/loading/ToursSearchResultLoadingVO;)V", "onWidgetCreated", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/presentation/ToursSearchResultViewModel;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultLoadingView;", "getLoadingView", "()Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/view/ToursSearchResultLoadingView;", "loadingView", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ToursSearchResultLoadingWidgetViewHolder extends AbstractC6067d<ToursSearchResultLoadingVO> {

    @NotNull
    private final ToursSearchResultViewModel viewModel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToursSearchResultViewModel.LoaderState.values().length];
            try {
                iArr[ToursSearchResultViewModel.LoaderState.VISIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToursSearchResultViewModel.LoaderState.GONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToursSearchResultLoadingWidgetViewHolder(@NotNull ToursSearchResultViewModel viewModel, @NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.viewModel = viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ToursSearchResultLoadingView getLoadingView() {
        View view = getView();
        if (view instanceof ToursSearchResultLoadingView) {
            return (ToursSearchResultLoadingView) view;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processLoadingEvent(ToursSearchResultViewModel.LoaderState state) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i11 == 1) {
            C10727i.c(K.a(this), null, null, new ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1(this, null), 3);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            ToursSearchResultLoadingView loadingView = getLoadingView();
            if (loadingView != null) {
                ViewExtKt.gone(loadingView);
            }
        }
    }

    private final void subscribe() {
        SearchPreloaderView progressBarV;
        ToursSearchResultViewModel toursSearchResultViewModel = this.viewModel;
        ToursSearchResultLoadingView loadingView = getLoadingView();
        if (loadingView == null || (progressBarV = loadingView.getProgressBarV()) == null) {
            return;
        }
        toursSearchResultViewModel.showLoadingLiveData().observe(this, new ToursSearchResultLoadingWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultLoadingWidgetViewHolder$subscribe$1$1$1(this)));
        toursSearchResultViewModel.preloaderTitleLiveData().observe(this, new ToursSearchResultLoadingWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultLoadingWidgetViewHolder$subscribe$1$1$2(progressBarV)));
        toursSearchResultViewModel.preloaderProgressLiveData().observe(this, new ToursSearchResultLoadingWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new ToursSearchResultLoadingWidgetViewHolder$subscribe$1$1$3(progressBarV)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ToursSearchResultLoadingVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        subscribe();
    }
}
