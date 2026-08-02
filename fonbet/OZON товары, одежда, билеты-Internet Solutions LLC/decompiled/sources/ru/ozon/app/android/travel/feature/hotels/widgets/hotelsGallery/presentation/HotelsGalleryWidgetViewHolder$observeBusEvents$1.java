package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import A00.a;
import Sc.s;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.utils.placeholder.NestedWidgetsManager;
import ru.ozon.app.android.travel.utils.placeholder.Placeholder;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a;", "event", "", "<anonymous>", "(LA00/a;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryWidgetViewHolder$observeBusEvents$1", f = "HotelsGalleryWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class HotelsGalleryWidgetViewHolder$observeBusEvents$1 extends j implements Function2<a, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HotelsGalleryWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsGalleryWidgetViewHolder$observeBusEvents$1(HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder, d<? super HotelsGalleryWidgetViewHolder$observeBusEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = hotelsGalleryWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        HotelsGalleryWidgetViewHolder$observeBusEvents$1 hotelsGalleryWidgetViewHolder$observeBusEvents$1 = new HotelsGalleryWidgetViewHolder$observeBusEvents$1(this.this$0, dVar);
        hotelsGalleryWidgetViewHolder$observeBusEvents$1.L$0 = obj;
        return hotelsGalleryWidgetViewHolder$observeBusEvents$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, d<? super Unit> dVar) {
        return ((HotelsGalleryWidgetViewHolder$observeBusEvents$1) create(aVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ComposerReferences composerReferences;
        Placeholder placeholder;
        NestedWidgetsManager nestedWidgetsManager;
        HashMap hashMap;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        a aVar2 = (a) this.L$0;
        if (aVar2 instanceof a.J) {
            composerReferences = this.this$0.refs;
            I00.a<l> mapper = composerReferences.getMapper();
            a.J.InterfaceC0007a d11 = ((a.J) aVar2).d();
            placeholder = this.this$0.currentPlaceholder;
            ArrayList c11 = mapper.c(d11, placeholder.getViewObjects());
            if (c11 != null) {
                HotelsGalleryWidgetViewHolder hotelsGalleryWidgetViewHolder = this.this$0;
                HotelsGalleryVO boundData = hotelsGalleryWidgetViewHolder.getBoundData();
                if (boundData != null) {
                    boundData.setLastAsyncUpdatedState(c11);
                }
                nestedWidgetsManager = hotelsGalleryWidgetViewHolder.nestedWidgetsManager;
                hashMap = hotelsGalleryWidgetViewHolder.currentViewHolders;
                nestedWidgetsManager.updateNestedWidgets(c11, hashMap);
            }
        }
        return Unit.f71690a;
    }
}
