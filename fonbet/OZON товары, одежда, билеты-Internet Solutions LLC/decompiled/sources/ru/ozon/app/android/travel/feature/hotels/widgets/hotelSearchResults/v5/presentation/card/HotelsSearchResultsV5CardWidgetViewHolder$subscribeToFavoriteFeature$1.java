package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.view.HotelsSearchResultsV5CardView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isActivated", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1", f = "HotelsSearchResultsV5CardWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ HotelsSearchResultsV5CardWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1(HotelsSearchResultsV5CardWidgetViewHolder hotelsSearchResultsV5CardWidgetViewHolder, d<? super HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsSearchResultsV5CardWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1 hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1 = new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1(this.this$0, dVar);
        hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1.Z$0 = ((Boolean) obj).booleanValue();
        return hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsSearchResultsV5CardView hotelsSearchResultsV5CardView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        boolean z11 = this.Z$0;
        hotelsSearchResultsV5CardView = this.this$0.containerView;
        hotelsSearchResultsV5CardView.setIsFavoriteFeatureActivated(z11);
        return Unit.f71690a;
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        return ((HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
    }
}
