package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2VI;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.view.HotelsGalleryFullV2View;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v2/presentation/HotelsGalleryFullV2SelectedPositionUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2", f = "HotelsGalleryFullV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2 extends j implements Function2<HotelsGalleryFullV2SelectedPositionUpdate, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ HotelsGalleryFullV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2(HotelsGalleryFullV2WidgetViewHolder hotelsGalleryFullV2WidgetViewHolder, d<? super HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFullV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2 hotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2 = new HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2(this.this$0, dVar);
        hotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2.I$0 = ((HotelsGalleryFullV2SelectedPositionUpdate) obj).getNewSelectedPosition();
        return hotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(HotelsGalleryFullV2SelectedPositionUpdate hotelsGalleryFullV2SelectedPositionUpdate, d<? super Unit> dVar) {
        return m1401invoke6PdCPvo(hotelsGalleryFullV2SelectedPositionUpdate.getNewSelectedPosition(), dVar);
    }

    /* renamed from: invoke-6PdCPvo, reason: not valid java name */
    public final Object m1401invoke6PdCPvo(int i11, d<? super Unit> dVar) {
        return ((HotelsGalleryFullV2WidgetViewHolder$observeSelectedPositionUpdates$2) create(HotelsGalleryFullV2SelectedPositionUpdate.m1395boximpl(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryFullV2View hotelsGalleryFullV2View;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        HotelsGalleryFullV2VI boundData = this.this$0.getBoundData();
        HotelsGalleryFullV2VI.GalleryItem galleryItem = boundData != null ? boundData.getItems().get(i11) : null;
        hotelsGalleryFullV2View = this.this$0.view;
        hotelsGalleryFullV2View.setSelectedPreviewItem(i11, galleryItem != null ? galleryItem.getTitleText() : null, galleryItem != null ? galleryItem.getCounterText() : null);
        return Unit.f71690a;
    }
}
