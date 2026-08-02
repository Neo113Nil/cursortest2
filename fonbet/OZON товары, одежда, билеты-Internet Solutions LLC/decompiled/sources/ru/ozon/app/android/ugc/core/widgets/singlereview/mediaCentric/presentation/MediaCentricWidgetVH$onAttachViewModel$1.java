package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation;

import Sc.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricVO;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricItemsAdapter;
import ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.views.MediaCentricView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "mediaItems", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentric/presentation/MediaCentricVO$MediaItemVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.MediaCentricWidgetVH$onAttachViewModel$1", f = "MediaCentricWidgetVH.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MediaCentricWidgetVH$onAttachViewModel$1 extends j implements Function2<List<? extends MediaCentricVO.MediaItemVO>, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MediaCentricWidgetVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaCentricWidgetVH$onAttachViewModel$1(MediaCentricWidgetVH mediaCentricWidgetVH, d<? super MediaCentricWidgetVH$onAttachViewModel$1> dVar) {
        super(2, dVar);
        this.this$0 = mediaCentricWidgetVH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(MediaCentricWidgetVH mediaCentricWidgetVH) {
        MediaCentricView mediaCentricView;
        mediaCentricView = mediaCentricWidgetVH.view;
        MediaCentricVO boundData = mediaCentricWidgetVH.getBoundData();
        mediaCentricView.setCurrentItem(boundData != null ? Integer.valueOf(boundData.getSelectedPosition()) : null);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MediaCentricWidgetVH$onAttachViewModel$1 mediaCentricWidgetVH$onAttachViewModel$1 = new MediaCentricWidgetVH$onAttachViewModel$1(this.this$0, dVar);
        mediaCentricWidgetVH$onAttachViewModel$1.L$0 = obj;
        return mediaCentricWidgetVH$onAttachViewModel$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MediaCentricItemsAdapter mediaCentricItemsAdapter;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        List list = (List) this.L$0;
        mediaCentricItemsAdapter = this.this$0.itemsAdapter;
        final MediaCentricWidgetVH mediaCentricWidgetVH = this.this$0;
        mediaCentricItemsAdapter.submitList(list, new Runnable() { // from class: ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentric.presentation.c
            @Override // java.lang.Runnable
            public final void run() {
                MediaCentricWidgetVH$onAttachViewModel$1.invokeSuspend$lambda$0(MediaCentricWidgetVH.this);
            }
        });
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends MediaCentricVO.MediaItemVO> list, d<? super Unit> dVar) {
        return ((MediaCentricWidgetVH$onAttachViewModel$1) create(list, dVar)).invokeSuspend(Unit.f71690a);
    }
}
