package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.presentation.loading;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.travel.molecules.view.searchPreloader.SearchPreloaderView;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ToursSearchResultLoadingWidgetViewHolder$subscribe$1$1$3 extends C7735q implements Function1<Float, Unit> {
    ToursSearchResultLoadingWidgetViewHolder$subscribe$1$1$3(Object obj) {
        super(1, obj, SearchPreloaderView.class, "setProgress", "setProgress(F)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Float f7) {
        invoke(f7.floatValue());
        return Unit.f71690a;
    }

    public final void invoke(float f7) {
        ((SearchPreloaderView) this.receiver).setProgress(f7);
    }
}
