package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card;

import Ae.InterfaceC2397i;
import Sc.s;
import Wc.a;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "e", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.card.HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2", f = "HotelsSearchResultsV5CardWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Boolean>, Throwable, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2(d<? super HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2> dVar) {
        super(3, dVar);
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super Boolean> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
        HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2 hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2 = new HotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2(dVar);
        hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2.L$0 = th2;
        return hotelsSearchResultsV5CardWidgetViewHolder$subscribeToFavoriteFeature$2.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        Lm0.a.f17149a.e((Throwable) this.L$0);
        return Unit.f71690a;
    }
}
