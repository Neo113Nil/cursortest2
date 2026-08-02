package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewForm.UploadingAttachmentsViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
/* synthetic */ class MediaPickerWidgetVH$pickerAdapter$1$2 extends C7735q implements Function1<Long, Unit> {
    MediaPickerWidgetVH$pickerAdapter$1$2(Object obj) {
        super(1, obj, UploadingAttachmentsViewModel.class, "removeAttachedClick", "removeAttachedClick(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Long l11) {
        invoke(l11.longValue());
        return Unit.f71690a;
    }

    public final void invoke(long j11) {
        ((UploadingAttachmentsViewModel) this.receiver).removeAttachedClick(j11);
    }
}
