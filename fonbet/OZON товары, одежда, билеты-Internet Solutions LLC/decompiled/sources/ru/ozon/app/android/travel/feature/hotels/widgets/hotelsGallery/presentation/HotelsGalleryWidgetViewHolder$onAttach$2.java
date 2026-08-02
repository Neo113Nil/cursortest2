package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.GalleryAction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/GalleryAction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$onAttach$2", f = "HotelsGalleryWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryWidgetViewHolder$onAttach$2 extends j implements Function2<GalleryAction, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsGalleryWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryWidgetViewHolder$onAttach$2(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder, d<? super HotelsGalleryWidgetViewHolder$onAttach$2> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryWidgetViewHolder$onAttach$2 hotelsGalleryWidgetViewHolder$onAttach$2 = new HotelsGalleryWidgetViewHolder$onAttach$2(this.this$0, dVar);
        hotelsGalleryWidgetViewHolder$onAttach$2.L$0 = obj;
        return hotelsGalleryWidgetViewHolder$onAttach$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        GalleryAction galleryAction = (GalleryAction) this.L$0;
        if (galleryAction instanceof GalleryAction.OpenGalleryVideoItem) {
            GalleryAction.OpenGalleryVideoItem openGalleryVideoItem = (GalleryAction.OpenGalleryVideoItem) galleryAction;
            if (openGalleryVideoItem.getAtomAction() instanceof AtomAction.Click) {
                this.this$0.onVideoItemClicked(openGalleryVideoItem.getItem(), openGalleryVideoItem.getPosition(), openGalleryVideoItem.getFullScreen());
            } else {
                AtomAction atomAction = openGalleryVideoItem.getAtomAction();
                if (atomAction != null) {
                    function1 = this.this$0.actionHandler;
                    function1.invoke(atomAction);
                }
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GalleryAction galleryAction, d<? super Unit> dVar) {
        return ((HotelsGalleryWidgetViewHolder$onAttach$2) create(galleryAction, dVar)).invokeSuspend(Unit.f71690a);
    }
}
