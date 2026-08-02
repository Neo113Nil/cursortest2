package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormSubmitButton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.presentation.ReviewFormViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class ReviewSubmitButtonViewHolder$onWidgetCreated$1 extends C7719a implements Function2<MediaPickerEvent, d<? super Unit>, Object> {
    ReviewSubmitButtonViewHolder$onWidgetCreated$1(Object obj) {
        super(2, obj, ReviewFormViewModel.class, "onMediaPickerEvent", "onMediaPickerEvent(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MediaPickerEvent mediaPickerEvent, d<? super Unit> dVar) {
        Object onWidgetCreated$onMediaPickerEvent;
        onWidgetCreated$onMediaPickerEvent = ReviewSubmitButtonViewHolder.onWidgetCreated$onMediaPickerEvent((ReviewFormViewModel) this.receiver, mediaPickerEvent, dVar);
        return onWidgetCreated$onMediaPickerEvent;
    }
}
