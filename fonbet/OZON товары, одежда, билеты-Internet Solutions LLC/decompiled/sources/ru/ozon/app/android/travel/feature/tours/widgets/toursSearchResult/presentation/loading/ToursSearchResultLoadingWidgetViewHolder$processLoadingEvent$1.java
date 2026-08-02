package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.ToursSearchResultViewModel;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.view.ToursSearchResultLoadingView;
import ru.ozon.app.android.travel.molecules.extensions.ViewExtensionsKt;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading.ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1", f = "ToursSearchResultLoadingWidgetViewHolder.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ToursSearchResultLoadingWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1(ToursSearchResultLoadingWidgetViewHolder toursSearchResultLoadingWidgetViewHolder, d<? super ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1> dVar) {
        super(2, dVar);
        this.this$0 = toursSearchResultLoadingWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ToursSearchResultLoadingView loadingView;
        ToursSearchResultLoadingView loadingView2;
        SearchPreloaderView progressBarV;
        ToursSearchResultLoadingView loadingView3;
        SearchPreloaderView progressBarV2;
        ToursSearchResultViewModel toursSearchResultViewModel;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            loadingView = this.this$0.getLoadingView();
            if (loadingView != null) {
                ViewExtKt.show(loadingView);
            }
            loadingView2 = this.this$0.getLoadingView();
            if (loadingView2 != null && (progressBarV = loadingView2.getProgressBarV()) != null) {
                this.label = 1;
                if (ViewExtensionsKt.awaitNextLayout(progressBarV, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        loadingView3 = this.this$0.getLoadingView();
        if (loadingView3 != null && (progressBarV2 = loadingView3.getProgressBarV()) != null) {
            int loaderWidth = progressBarV2.loaderWidth();
            toursSearchResultViewModel = this.this$0.viewModel;
            toursSearchResultViewModel.startPreloaderAnimation(loaderWidth);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ToursSearchResultLoadingWidgetViewHolder$processLoadingEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
