package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.view.HotelsGalleryFullView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "update", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/presentation/HotelsGalleryFullSelectedPositionUpdate;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2", f = "HotelsGalleryFullWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2 extends j implements Function2<HotelsGalleryFullSelectedPositionUpdate, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ HotelsGalleryFullWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2(HotelsGalleryFullWidgetViewHolder hotelsGalleryFullWidgetViewHolder, d<? super HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryFullWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2 hotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2 = new HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2(this.this$0, dVar);
        hotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2.I$0 = ((HotelsGalleryFullSelectedPositionUpdate) obj).getNewSelectedPosition();
        return hotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(HotelsGalleryFullSelectedPositionUpdate hotelsGalleryFullSelectedPositionUpdate, d<? super Unit> dVar) {
        return m1385invokeTuaA_mQ(hotelsGalleryFullSelectedPositionUpdate.getNewSelectedPosition(), dVar);
    }

    /* renamed from: invoke-TuaA_mQ, reason: not valid java name */
    public final Object m1385invokeTuaA_mQ(int i11, d<? super Unit> dVar) {
        return ((HotelsGalleryFullWidgetViewHolder$observeSelectedPositionUpdates$2) create(HotelsGalleryFullSelectedPositionUpdate.m1379boximpl(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryFullView hotelsGalleryFullView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        hotelsGalleryFullView = this.this$0.view;
        hotelsGalleryFullView.setSelectedPreviewItem(i11);
        return Unit.f71690a;
    }
}
