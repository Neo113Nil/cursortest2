package ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.feature.tours.widgets.toursSearchResult.utils.ToursSearchResultRefreshObserver;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/tours/widgets/toursSearchResult/utils/ToursSearchResultRefreshObserver;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ToursSearchResultComponent$Companion$create$1$1$toursSearchResultRefreshObserver$2 extends AbstractC7737t implements Function0<ToursSearchResultRefreshObserver> {
    final /* synthetic */ ToursSearchResultComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToursSearchResultComponent$Companion$create$1$1$toursSearchResultRefreshObserver$2(ToursSearchResultComponent$Companion$create$1$1 toursSearchResultComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = toursSearchResultComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ToursSearchResultRefreshObserver invoke() {
        RetainComposerComponentApi retainComposerComponentApi;
        retainComposerComponentApi = this.this$0.retainComponentApi;
        return new ToursSearchResultRefreshObserver(retainComposerComponentApi.getComposerController());
    }
}
