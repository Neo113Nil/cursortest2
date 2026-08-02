package ru.ozon.app.android.ugc.widgets.selectionItemForm.submitButton;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.MediaPickerEvent;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.presentation.SelectionFormViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class SelectionFormSubmitButtonVH$onWidgetCreated$1 extends C7719a implements Function2<MediaPickerEvent, d<? super Unit>, Object> {
    SelectionFormSubmitButtonVH$onWidgetCreated$1(Object obj) {
        super(2, obj, SelectionFormViewModel.class, "onMediaPickerEvent", "onMediaPickerEvent(Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/MediaPickerEvent;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MediaPickerEvent mediaPickerEvent, d<? super Unit> dVar) {
        Object onWidgetCreated$onMediaPickerEvent;
        onWidgetCreated$onMediaPickerEvent = SelectionFormSubmitButtonVH.onWidgetCreated$onMediaPickerEvent((SelectionFormViewModel) this.receiver, mediaPickerEvent, dVar);
        return onWidgetCreated$onMediaPickerEvent;
    }
}
