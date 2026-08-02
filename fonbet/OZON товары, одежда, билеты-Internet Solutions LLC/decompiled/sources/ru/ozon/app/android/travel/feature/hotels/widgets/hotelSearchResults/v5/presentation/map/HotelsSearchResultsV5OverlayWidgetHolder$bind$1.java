package ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.map;

import Sc.s;
import Wc.a;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.map.storage.TravelGeoProvidersStorage;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelSearchResults.v5.presentation.map.HotelsSearchResultsV5OverlayWidgetHolder$bind$1", f = "HotelsSearchResultsV5OverlayWidgetHolder.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsSearchResultsV5OverlayWidgetHolder$bind$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ HotelsSearchResultsV5MapOverlayVO $item;
    int label;
    final /* synthetic */ HotelsSearchResultsV5OverlayWidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsSearchResultsV5OverlayWidgetHolder$bind$1(HotelsSearchResultsV5OverlayWidgetHolder hotelsSearchResultsV5OverlayWidgetHolder, HotelsSearchResultsV5MapOverlayVO hotelsSearchResultsV5MapOverlayVO, d<? super HotelsSearchResultsV5OverlayWidgetHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsSearchResultsV5OverlayWidgetHolder;
        this.$item = hotelsSearchResultsV5MapOverlayVO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HotelsSearchResultsV5OverlayWidgetHolder$bind$1(this.this$0, this.$item, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TravelGeoProvidersStorage travelGeoProvidersStorage;
        Context context;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            travelGeoProvidersStorage = this.this$0.geoStorage;
            List<Double> locationPoint = this.$item.getLocationPoint();
            context = this.this$0.context;
            this.label = 1;
            if (travelGeoProvidersStorage.addProvider(locationPoint, context, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((HotelsSearchResultsV5OverlayWidgetHolder$bind$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
