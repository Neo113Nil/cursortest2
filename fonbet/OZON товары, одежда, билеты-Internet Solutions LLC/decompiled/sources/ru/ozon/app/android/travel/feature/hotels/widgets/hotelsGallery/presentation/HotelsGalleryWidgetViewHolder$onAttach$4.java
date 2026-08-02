package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Sc.s;
import Wc.a;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.view.HotelsGalleryView;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "position", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$onAttach$4", f = "HotelsGalleryWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryWidgetViewHolder$onAttach$4 extends j implements Function2<Integer, d<? super Unit>, Object> {
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ HotelsGalleryWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryWidgetViewHolder$onAttach$4(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder, d<? super HotelsGalleryWidgetViewHolder$onAttach$4> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryWidgetViewHolder$onAttach$4 hotelsGalleryWidgetViewHolder$onAttach$4 = new HotelsGalleryWidgetViewHolder$onAttach$4(this.this$0, dVar);
        hotelsGalleryWidgetViewHolder$onAttach$4.I$0 = ((Number) obj).intValue();
        return hotelsGalleryWidgetViewHolder$onAttach$4;
    }

    public final Object invoke(int i11, d<? super Unit> dVar) {
        return ((HotelsGalleryWidgetViewHolder$onAttach$4) create(Integer.valueOf(i11), dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HotelsGalleryView hotelsGalleryView;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int i11 = this.I$0;
        hotelsGalleryView = this.this$0.view;
        ViewPager2 hotelsGalleryVp = hotelsGalleryView.getHotelsGalleryVp();
        HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder = this.this$0;
        if (hotelsGalleryVp.f() != i11) {
            hotelsGalleryVp.t(i11, false);
            hotelsGalleryWidgetViewHolder.onViewPagerPageSelected(i11);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Integer num, d<? super Unit> dVar) {
        return invoke(num.intValue(), dVar);
    }
}
